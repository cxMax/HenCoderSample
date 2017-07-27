package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.cxmax.hencodersample.util.PaintUtils;

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
        defaultPaint = PaintUtils.getDefaultSolidPaint();
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

    public Paint getDefaultPaint() {
        return defaultPaint;
    }
}
