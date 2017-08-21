package com.hencoder.hencoderpracticedraw5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

import com.hencoder.hencoderpracticedraw5.BuildConfig;
import com.hencoder.hencoderpracticedraw5.R;

public class Practice01AfterOnDrawView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice01AfterOnDrawView(Context context) {
        super(context);
    }

    public Practice01AfterOnDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice01AfterOnDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setColor(Color.parseColor("#FFC107"));
        paint.setTextSize(28);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (BuildConfig.DEBUG) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                canvas.save();
                canvas.concat(getImageMatrix());
                Rect bounds = drawable.copyBounds();

                canvas.drawText(getResources().getString(R.string.image_size, bounds.width(), bounds.height()), 20, 40, paint);
                canvas.restore();
            }
        }

    }
}