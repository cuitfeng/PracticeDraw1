package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        canvas.drawArc(500, 30, 800, 250,
                -110, 110, true,paint);

        canvas.drawArc(500, 30, 800, 250,
                20, 140, false,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(500, 30, 800, 250,
                220, 20, false,paint);

        canvas.drawArc(500, 30, 800, 250,
                180, 30, true,paint);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
        canvas.drawRect(500, 30, 800, 250, paint);
    }
}
