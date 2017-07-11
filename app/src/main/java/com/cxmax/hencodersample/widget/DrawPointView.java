package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
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
        squarePaint = getSquarePointPaint();
        roundPaint = getRoundPointPaint();
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

    private Paint getRoundPointPaint() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    private Paint getSquarePointPaint() {
        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.SQUARE);
        return paint;
    }
}
