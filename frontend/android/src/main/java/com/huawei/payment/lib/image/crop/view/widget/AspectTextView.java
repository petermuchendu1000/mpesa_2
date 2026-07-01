package com.huawei.payment.lib.image.crop.view.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.huawei.payment.lib.image.R;
import com.huawei.payment.lib.image.crop.model.AspectRatio;
import java.util.Locale;

public class AspectTextView extends AppCompatTextView {
    private float aspectRatio;
    private String aspectRatioTitle;
    private float aspectRatioX;
    private float aspectRatioY;
    private final Rect canvasClipBounds;
    private Paint dotPaint;
    private int dotSize;

    public AspectTextView(Context context) {
        this(context, null);
    }

    public AspectTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.canvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_AspectTextView));
    }

    public AspectTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.canvasClipBounds = new Rect();
        init(context.obtainStyledAttributes(attributeSet, R.styleable.ucrop_AspectTextView));
    }

    public void setActiveColor(int i) {
        applyActiveColor(i);
        invalidate();
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        this.aspectRatioTitle = aspectRatio.getAspectRatioTitle();
        this.aspectRatioX = aspectRatio.getAspectRatioX();
        float aspectRatioY = aspectRatio.getAspectRatioY();
        this.aspectRatioY = aspectRatioY;
        float f = this.aspectRatioX;
        if (f == 0.0f || aspectRatioY == 0.0f) {
            this.aspectRatio = 0.0f;
        } else {
            this.aspectRatio = f / aspectRatioY;
        }
        setTitle();
    }

    public float getAspectRatio(boolean z) {
        if (z) {
            toggleAspectRatio();
            setTitle();
        }
        return this.aspectRatio;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.canvasClipBounds);
            float f = this.dotSize;
            canvas.drawCircle((this.canvasClipBounds.right - this.canvasClipBounds.left) / 2.0f, (this.canvasClipBounds.bottom - (this.canvasClipBounds.top / 2.0f)) - (f * 1.5f), f / 2.0f, this.dotPaint);
        }
    }

    private void init(TypedArray typedArray) {
        setGravity(1);
        this.aspectRatioTitle = typedArray.getString(R.styleable.ucrop_AspectTextView_ucrop_artv_ratio_title);
        this.aspectRatioX = typedArray.getFloat(R.styleable.ucrop_AspectTextView_ucrop_artv_ratio_x, 0.0f);
        float f = typedArray.getFloat(R.styleable.ucrop_AspectTextView_ucrop_artv_ratio_y, 0.0f);
        this.aspectRatioY = f;
        float f2 = this.aspectRatioX;
        if (f2 == 0.0f || f == 0.0f) {
            this.aspectRatio = 0.0f;
        } else {
            this.aspectRatio = f2 / f;
        }
        this.dotSize = getContext().getResources().getDimensionPixelSize(R.dimen.ucrop_size_dot_scale_text_view);
        Paint paint = new Paint(1);
        this.dotPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        setTitle();
        applyActiveColor(getResources().getColor(R.color.ucrop_color_widget_active));
        typedArray.recycle();
    }

    private void applyActiveColor(int i) {
        Paint paint = this.dotPaint;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{0}}, new int[]{i, ContextCompat.getColor(getContext(), R.color.ucrop_color_widget)}));
    }

    private void toggleAspectRatio() {
        if (this.aspectRatio != 0.0f) {
            float f = this.aspectRatioX;
            float f2 = this.aspectRatioY;
            this.aspectRatioX = f2;
            this.aspectRatioY = f;
            this.aspectRatio = f2 / f;
        }
    }

    private void setTitle() {
        if (!TextUtils.isEmpty(this.aspectRatioTitle)) {
            setText(this.aspectRatioTitle);
            return;
        }
        setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.aspectRatioX), Integer.valueOf((int) this.aspectRatioY)));
    }
}
