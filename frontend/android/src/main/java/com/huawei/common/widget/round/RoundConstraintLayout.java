package com.huawei.common.widget.round;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.r8lambdaA0RwxxTQIMFOsDA3Nv48auR1K4;

public class RoundConstraintLayout extends ConstraintLayout {
    private BaseRoundView baseFilletView;

    public RoundConstraintLayout(Context context) {
        super(context);
        init(null);
    }

    public RoundConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public RoundConstraintLayout(Context context, AttributeSet attributeSet, int i) {
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

    public static void component1() {
        r8lambdaA0RwxxTQIMFOsDA3Nv48auR1K4.copydefault[0] = Class.forName("com.huawei.digitalpayment.consumer.sfcui.bonga.calculator.BongaCalculatorScreenKt$component2$3").getDeclaredField("component3");
    }
}
