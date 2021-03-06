package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.cxmax.hencodersample.util.PaintUtils;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-7-11.
 */

public class DrawPointView extends BaseView {

    private Paint squarePaint, roundPaint;
    private float[] posArrays;


    public DrawPointView(Context context) {
        this(context, null);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initParams();
    }

    private void initParams() {
        posArrays = new float[]{50, 50, 100, 50, 150, 50, 200, 50, 250, 50, 300, 50, 350, 50};
        squarePaint = PaintUtils.getCapPointPaint(Paint.Cap.SQUARE);
        roundPaint = PaintUtils.getCapPointPaint(Paint.Cap.ROUND);
    }

    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        drawRoundPointsArray(canvas);
    }

    private void drawSquarePoint(@NonNull Canvas canvas) {
        canvas.drawPoint(50, 50, squarePaint);
    }

    private void drawRoundPoint(@NonNull Canvas canvas) {
        canvas.drawPoint(50, 50, roundPaint);
    }

    private void drawRoundPointsArray(@NonNull Canvas canvas) {
        canvas.drawPoints(posArrays, roundPaint);
    }
}
