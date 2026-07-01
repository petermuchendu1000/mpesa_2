package com.huawei.digitalpayment.consumer.miniapps.ui;

import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class ComposableSingletons$MiniAppSplashScreenKt$lambda1$1$$ExternalSyntheticLambda0 implements Function0 {
    public static int ShareDataUIState = 0;
    public static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    public static int component3() {
        int i = ShareDataUIState;
        int i2 = i % 7723602;
        ShareDataUIState = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iNextInt = new Random().nextInt(656346693);
        component1 = iNextInt;
        return iNextInt;
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit$r8$lambda$SkfkcPOizHtiQNrgohFqwiWP_q4 = ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.$r8$lambda$SkfkcPOizHtiQNrgohFqwiWP_q4();
        int i4 = component2 + 107;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return unit$r8$lambda$SkfkcPOizHtiQNrgohFqwiWP_q4;
    }
}
