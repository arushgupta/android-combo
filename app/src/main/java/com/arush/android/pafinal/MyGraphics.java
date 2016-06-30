package com.arush.android.pafinal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by arushgupta on 08/06/16.
 */
public class MyGraphics extends View {

    public MyGraphics(Context context) {
        super(context);
    }

    public MyGraphics(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //Setup Paint
        Paint paint = new Paint();
        paint.setStrokeWidth(2.0f);

        //Change color
        paint.setColor(Color.RED);

        //Draw X
        canvas.drawLine(0.0f, 0.0f, getWidth()/1.0f, getHeight()/1.0f, paint);
        canvas.drawLine(0.0f, getHeight()/1.0f, getWidth()/1.0f, 0.0f, paint);
    }
}
