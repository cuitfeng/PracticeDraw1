package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        String[] titles = new String[] {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
        int[] data = new int[] {1, 8, 8, 70, 120, 150, 60};

        Paint paint = new Paint();
        paint.setARGB(30, 255, 255, 255);
        paint.setStrokeWidth(1);
        canvas.drawLine(490, 30, 490, 230, paint);

        paint.setARGB(255,255, 255, 255);
        canvas.drawLine(490, 230, 790, 230, paint);

        int width = 30;
        int space = 8;
        int bottom = 230;
        int left = 490;

        int highMax = 180;
        int dataMax = 0;
        for (int tmp : data) {
            dataMax = dataMax > tmp ? dataMax : tmp;
        }


        for(int i = 0; i < titles.length; i ++) {
            paint.setARGB(150, 0, 255, 0);
            int x1 = left + space + (space + width) * i;
            int y1 = bottom - (data[i] * highMax / dataMax);
            int x2 = x1 + width;
            int y2 = bottom;
            canvas.drawRect(x1, y1, x2, y2, paint);

            paint.setColor(Color.WHITE);
            paint.setTextSize(10);
            paint.setTextAlign(Paint.Align.CENTER);
            x1 = x1 + width / 2;
            y1 = bottom - (int)paint.getFontMetrics().top + 3;
            canvas.drawText(titles[i], x1, y1, paint );
        }

        paint.setTextSize(16);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("直方图", left + 150, bottom + 40, paint);


    }
}
