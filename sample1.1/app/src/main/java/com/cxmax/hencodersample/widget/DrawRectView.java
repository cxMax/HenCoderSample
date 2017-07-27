package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
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

public class DrawRectView extends BaseView {

    public DrawRectView(Context context) {
        super(context);
    }

    public DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        drawRectangle(canvas);
    }

    /**
     * draw a square which width = 400 px ; height = 400 px;
     * @param canvas
     */
    private void drawSquare(@NonNull Canvas canvas) {
        canvas.drawRect(100, 100, 500, 500, getDefaultPaint());
    }

    /**
     * draw a rectangle which width = 400 px ; height = 200 px;
     * @param canvas
     */
    private void drawRectangle(@NonNull Canvas canvas) {
        canvas.drawRect(100, 100, 500, 300, getDefaultPaint());
    }
}
