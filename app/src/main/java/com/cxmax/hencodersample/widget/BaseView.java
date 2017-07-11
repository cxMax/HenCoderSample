package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-7-11.
 */

public abstract class BaseView extends View {

    private Paint defaultPaint;

    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initDefaultPaint();
    }

    private void initDefaultPaint() {
        defaultPaint = getDefaultSolidPaint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawCustomShape(canvas);
    }

    /**
     * you'd better not create a new local variable in this method;
     *
     * @param canvas
     */
    protected abstract void drawCustomShape(@NonNull Canvas canvas);

    @NonNull
    protected Paint getDefaultSolidPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        return paint;
    }

    @NonNull
    protected Paint getDefaultHollowPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        return paint;
    }

    public Paint getDefaultPaint() {
        return defaultPaint;
    }
}
