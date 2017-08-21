package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;

public class Practice08BeforeDrawView extends AppCompatEditText {

    public Practice08BeforeDrawView(Context context) {
        super(context);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.drawColor(Color.parseColor("#66BB6A")); // 涂上绿色
        canvas.restore();

        super.draw(canvas);
    }
}
