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

public class DrawArcView extends BaseView {

    public DrawArcView(Context context) {
        super(context);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, getDefaultPaint()); // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, getDefaultPaint()); // 绘制弧形
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, getDefaultPaint()); // 绘制不封口的弧形
    }
}
