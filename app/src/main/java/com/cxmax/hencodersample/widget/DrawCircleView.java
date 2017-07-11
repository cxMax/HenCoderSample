package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-7-11.
 */

public class DrawCircleView extends BaseView {

    Paint hollowPaint;

    public DrawCircleView(Context context) {
        this(context, null);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        hollowPaint = getHollowCirclePaint();
    }

    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawCircle(300, 300, 200, hollowPaint);
    }

    private Paint getStrokeCirclePaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(20);
        return paint;
    }

    private Paint getHollowCirclePaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        return paint;
    }
}
