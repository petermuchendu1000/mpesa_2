package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundTextView;

@Deprecated
public class MediumTextView extends RoundTextView {
    private TEXT_STYLE textStyle;

    public MediumTextView(Context context) {
        this(context, null);
    }

    public MediumTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediumTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.textStyle = TEXT_STYLE.NORMAL;
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MediumTextView);
        setTextStyle(TEXT_STYLE.fromInt(typedArrayObtainStyledAttributes.getInt(R.styleable.MediumTextView_text_style, (int) TEXT_STYLE.NORMAL.size)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setTextStyle(TEXT_STYLE text_style) {
        this.textStyle = text_style;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setStrokeWidth(this.textStyle.size);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        super.onDraw(canvas);
    }

    public enum TEXT_STYLE {
        NORMAL(0.0f),
        MEDIUM(1.5f),
        BOLD(3.0f);

        private final float size;

        TEXT_STYLE(float f) {
            this.size = f;
        }

        public static TEXT_STYLE fromInt(int i) {
            if (i == 1) {
                return MEDIUM;
            }
            if (i == 2) {
                return BOLD;
            }
            return NORMAL;
        }
    }
}
