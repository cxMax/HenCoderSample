package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.cxmax.hencodersample.util.PaintUtils;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-7-12.
 */

public class DrawPieChartView extends BaseView {

    private Paint firstPaint, secondPaint, thirdPaint, fourthPaint, textPaint, linePaint;
    private Path firstPath;

    public DrawPieChartView(Context context) {
        this(context, null);
    }

    public DrawPieChartView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawPieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initVariable();
    }

    /**
     * you'd better not create a new local variable in this method;
     *
     * @param canvas
     */
    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawArc(50, 50, 650, 650, -180, 120, true, firstPaint);
        canvas.drawArc(80, 80, 650, 650, -60, 60, true, secondPaint);
        canvas.drawArc(80, 80, 650, 650, 3, 57, true, thirdPaint);
        canvas.drawArc(80, 80, 650, 650, 61, 119, true, fourthPaint);
        canvas.drawText("Lollipop", 5, 50, textPaint);
        canvas.drawPath(firstPath , linePaint);
    }

    private void initVariable() {
        firstPaint = PaintUtils.getVariousSolidPaint(Color.RED);
        secondPaint = PaintUtils.getVariousSolidPaint(Color.YELLOW);
        thirdPaint = PaintUtils.getVariousSolidPaint(Color.GREEN);
        fourthPaint = PaintUtils.getVariousSolidPaint(Color.BLUE);
        textPaint = PaintUtils.getTextSolidPaint(20);
        firstPath = getFirstPath();
        linePaint = PaintUtils.getDefaultHollowPaint();
    }

    private Path getFirstPath() {
        Path path = new Path();
        path.moveTo(80, 50);
        path.rLineTo(100, 0);
        path.rLineTo(50, 20);
        return path;
    }

}
