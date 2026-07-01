package com.huawei.digitalpayment.consumer.fixeddata.domain.model;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class SummaryField$$ExternalSyntheticLambda0 implements Function0 {
    public static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2;
    public static int component3;

    public static int ShareDataUIState() {
        int i = component3;
        int i2 = i % 7394327;
        component3 = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        ShareDataUIState = i3;
        return i3;
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$SrY2d3WnfVGI_VeCQ0o1VEzG8Zw = SummaryField.$r8$lambda$SrY2d3WnfVGI_VeCQ0o1VEzG8Zw();
        int i4 = component2 + 101;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
        return unit$r8$lambda$SrY2d3WnfVGI_VeCQ0o1VEzG8Zw;
    }
}
