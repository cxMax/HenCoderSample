package com.cxmax.hencodersample.widget;

import android.content.Context;
import android.graphics.Canvas;
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

public class DrawPathView extends BaseView {

    private Path path;

    public DrawPathView(Context context) {
        this(context, null);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initParams();
    }

    private void initParams() {
        path = getHeartShapePath();
    }

    @Override
    protected void drawCustomShape(@NonNull Canvas canvas) {
        canvas.drawPath(path , getDefaultPaint());
    }

    private Path getHeartShapePath() {
        Path path = new Path();
        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        return path;
    }
}
