package com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles;

import androidx.compose.foundation.lazy.LazyListScope;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.blivebundles.BLiveBundlesScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.helper.UIState;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class BLiveBundlesScreenKt$BliveBundlesScreen$2$$ExternalSyntheticLambda1 implements Function1 {
    private static int component1 = 0;
    public static int component2 = 0;
    private static int component3 = 1;
    public static int copydefault;
    public final UIState f$0;
    public final Function1 f$1;
    public final String f$2;

    public BLiveBundlesScreenKt$BliveBundlesScreen$2$$ExternalSyntheticLambda1(UIState uIState, Function1 function1, String str) {
        this.f$0 = uIState;
        this.f$1 = function1;
        this.f$2 = str;
    }

    @Override
    public final Object invoke(Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = BLiveBundlesScreenKt.component3.component2(this.f$0, this.f$1, this.f$2, (LazyListScope) obj);
        int i4 = component1 + 119;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return unitComponent2;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static int component2() {
        int i = copydefault;
        int i2 = i % 8533988;
        copydefault = i + 1;
        if (i2 != 0) {
            return component2;
        }
        int iNextInt = new Random().nextInt(362326166);
        component2 = iNextInt;
        return iNextInt;
    }
}
