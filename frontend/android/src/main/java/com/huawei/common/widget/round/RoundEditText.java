package com.huawei.common.widget.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

public class RoundEditText extends AppCompatEditText {
    private BaseRoundView baseFilletView;

    public RoundEditText(Context context) {
        super(context);
        init(null);
    }

    public RoundEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public RoundEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
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

    public BaseRoundView getBaseFilletView() {
        return this.baseFilletView;
    }
}
