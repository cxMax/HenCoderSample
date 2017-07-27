package com.cxmax.hencodersample.util;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

/**
 * @describe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 17-7-12.
 */

public class PaintUtils {

    @NonNull public static Paint getTextSolidPaint(int textSize) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setTextSize(textSize);
        paint.setAntiAlias(true);
        return paint;
    }

    @NonNull public static Paint getVariousSolidPaint(@ColorInt int color) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setAntiAlias(true);
        return paint;
    }

    @NonNull public static Paint getDefaultSolidPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        return paint;
    }

    @NonNull public static Paint getDefaultHollowPaint() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setAntiAlias(true);
        return paint;
    }

    @NonNull public static Paint getCapPointPaint(Paint.Cap cap) {
        Paint paint = new Paint();
        paint.setStrokeWidth(20);
        paint.setAntiAlias(true);
        paint.setStrokeCap(cap);
        return paint;
    }
}
