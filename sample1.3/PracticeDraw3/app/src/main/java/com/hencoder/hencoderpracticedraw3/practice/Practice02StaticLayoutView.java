package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Practice02StaticLayoutView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello\nHenCoder";
    StaticLayout staticLayout1, staticLayout2;

    public Practice02StaticLayoutView(Context context) {
        this(context, null);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice02StaticLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initValue();
    }

    private void initValue() {
        staticLayout1 = new StaticLayout("Hello",textPaint,600,
                Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
        staticLayout2 = new StaticLayout("HenCoder",textPaint,600,
                Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
    }

    {
        textPaint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 使用 StaticLayout 代替 Canvas.drawText() 来绘制文字，
        // 以绘制出带有换行的文字
        canvas.save();
        canvas.translate(50, 100);
        staticLayout1.draw(canvas);
        canvas.translate(0, 50);
        staticLayout2.draw(canvas);
//        canvas.drawText(text, 50, 100, textPaint);
    }
}
