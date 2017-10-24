package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setStyle(Paint.Style.STROKE);

        Path path = new Path(); // 初始化 Path 对象

//        练习内容：使用 canvas.drawPath() 方法画心形

        {
            // 使用 path 对图形进行描述（这段描述代码不必看懂）
            path.addArc(500, 30, 600, 130, -225, 225);
            path.arcTo(600, 30, 700, 130, -180, 225, false);
            path.lineTo(600, 200);
            path.close();
        }
        canvas.drawPath(path, paint); // 绘制出 path 描述的图形（心形），大功告成
    }
}
