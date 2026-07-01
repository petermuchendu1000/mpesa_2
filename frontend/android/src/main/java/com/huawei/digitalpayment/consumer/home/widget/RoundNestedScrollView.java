package com.huawei.digitalpayment.consumer.home.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;
import com.huawei.common.widget.round.BaseRoundView;

public class RoundNestedScrollView extends NestedScrollView {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private BaseRoundView baseFilletView;

    public RoundNestedScrollView(Context context) {
        super(context);
        init(null);
    }

    public RoundNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet);
    }

    public RoundNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet);
    }

    private void init(AttributeSet attributeSet) {
        int i = 2 % 2;
        this.baseFilletView = new BaseRoundView(this, attributeSet);
        int i2 = copydefault + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void draw(Canvas canvas) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.baseFilletView.draw(canvas);
        super.draw(canvas);
        this.baseFilletView.drawOff(canvas);
        int i4 = copydefault + 85;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = ShareDataUIState + 27;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        super.onSizeChanged(i, i2, i3, i4);
        this.baseFilletView.onSizeChanged(i, i2);
        int i8 = ShareDataUIState + 97;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseRoundView getBaseFilletView() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        BaseRoundView baseRoundView = this.baseFilletView;
        int i5 = i3 + 121;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return baseRoundView;
    }
}
