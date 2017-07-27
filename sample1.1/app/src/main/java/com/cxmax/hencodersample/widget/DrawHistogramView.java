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
 * Created by caixi on 17-7-11.
 */

public class DrawHistogramView extends BaseView {

    private static final float BASE_LINE = 610;

    private Path coordinate , firstPath;
    private Paint hollowPaint , secondPaint;
    private Paint textPaint , firstText;

    public DrawHistogramView(Context context) {
        this(context, null);
    }

    public DrawHistogramView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawHistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initVariable();
    }

    private void initVariable() {
        coordinate = getLinePath();
        hollowPaint = PaintUtils.getDefaultHollowPaint();
        textPaint = PaintUtils.getTextSolidPaint(40);
        firstText = PaintUtils.getTextSolidPaint(20);
        firstPath = getFirstLinePath();
        secondPaint = PaintUtils.getDefaultSolidPaint();
        secondPaint.setColor(Color.GREEN);
    }

    /**
     * you'd better not create a new local variable in this method;
     *
     * @param canvas
     */
    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawPath(coordinate, hollowPaint);
        canvas.drawText("直方图", 300, 750, textPaint);
        canvas.drawPath(firstPath , hollowPaint);
        canvas.drawText("Froyo" , 140 , 720 , firstText);
        canvas.drawRect(220, 648, 320, 698, secondPaint);
        canvas.drawText("GB" , 250 , 720 , firstText);
        canvas.drawRect(330, 648, 430, 698, secondPaint);
        canvas.drawText("ICS" , 360 , 720 , firstText);
        canvas.drawRect(440, 508, 540, 698, secondPaint);
        canvas.drawText("JB" , 470 , 720 , firstText);
        canvas.drawRect(550, 408, 650, 698, secondPaint);
        canvas.drawText("KitKat" , 580 , 720 , firstText);
        canvas.drawRect(660, 358, 760, 698, secondPaint);
        canvas.drawText("L" , 690 , 720 , firstText);
        canvas.drawRect(770, 490, 870, 698, secondPaint);
        canvas.drawText("M" , 800 , 720 , firstText);
    }


    private Path getLinePath() {
        Path path = new Path();
        path.moveTo(100, 100);
        path.lineTo(100, 700);
        path.rLineTo(800, 0);
        return path;
    }

    private Path getFirstLinePath() {
        Path path = new Path();
        path.moveTo(110 , 698);
        path.rLineTo(100, 0);
        return path;
    }


}
