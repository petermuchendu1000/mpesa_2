package com.huawei.digitalpayment.consumer.base.ui.widget;

import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"applyInfiniteLoop", "", "Lcom/airbnb/lottie/LottieAnimationView;", "ConsumerBaseUi_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PinPadDotViewKt {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;

    public static final void access$applyInfiniteLoop(LottieAnimationView lottieAnimationView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        component3(lottieAnimationView);
        if (i3 == 0) {
            throw null;
        }
    }

    private static final void component3(LottieAnimationView lottieAnimationView) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        lottieAnimationView.setRepeatCount(-1);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
    }
}
