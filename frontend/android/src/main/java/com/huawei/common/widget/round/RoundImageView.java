package com.huawei.common.widget.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

public class RoundImageView extends AppCompatImageView {
    private BaseRoundView baseFilletView;

    public RoundImageView(Context context) {
        super(context);
        init(null);
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    public BaseRoundView getBaseFilletView() {
        return this.baseFilletView;
    }

    private void init(AttributeSet attributeSet) {
        this.baseFilletView = new BaseRoundView(this, attributeSet);
    }

    @Override
    public void draw(Canvas canvas) {
        this.baseFilletView.draw(canvas);
        super.draw(canvas);
        this.baseFilletView.drawOff(canvas);
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.baseFilletView.onSizeChanged(i, i2);
    }
}
