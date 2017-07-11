package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
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

public class DrawHistogramView extends BaseView {

    private static final float BASE_LINE = 610;

    private Path coordinate;
    private Paint hollowPaint;
    private Paint textPaint;
    private char[] nameArrays;

    public DrawHistogramView(Context context) {
        this(context, null);
    }

    public DrawHistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawHistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initFields();
    }

    private void initFields() {
        coordinate = getLinePath();
        hollowPaint = getDefaultHollowPaint();
        textPaint = getTextSolidPaint();
        nameArrays = new char[]{'a', 'b', 'c', 'd', 'e', 'L', 'M'};
    }

    /**
     * you'd better not create a new local variable in this method;
     *
     * @param canvas
     */
    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawPath(coordinate, hollowPaint);
        canvas.drawText("直方图", 300, 700, textPaint);
        canvas.drawText(nameArrays, 0, nameArrays.length, 110, BASE_LINE, textPaint);
    }


    private Path getLinePath() {
        Path path = new Path();
        path.moveTo(100, 0);
        path.lineTo(100, 600);
        path.rLineTo(600, 0);
        return path;
    }

    private Paint getTextSolidPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setTextSize(40);
        paint.setAntiAlias(true);
        return paint;
    }
}
