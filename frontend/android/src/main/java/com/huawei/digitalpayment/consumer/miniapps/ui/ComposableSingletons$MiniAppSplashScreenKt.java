package com.huawei.digitalpayment.consumer.miniapps.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$MiniAppSplashScreenKt {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    public static final ComposableSingletons$MiniAppSplashScreenKt INSTANCE = new ComposableSingletons$MiniAppSplashScreenKt();

    public static Function2<Composer, Integer, Unit> f175lambda1 = ComposableLambdaKt.composableLambdaInstance(675020999, false, ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.INSTANCE);

    public static Function2<Composer, Integer, Unit> f176lambda2 = ComposableLambdaKt.composableLambdaInstance(681629524, false, ComposableSingletons$MiniAppSplashScreenKt$lambda2$1.INSTANCE);

    static {
        int i = ShareDataUIState + 17;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public final Function2<Composer, Integer, Unit> m10739getLambda1$ConsumerSfcAliPayMiniApps_release() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f175lambda1;
        int i5 = i2 + 67;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return function2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<Composer, Integer, Unit> m10740getLambda2$ConsumerSfcAliPayMiniApps_release() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Function2<Composer, Integer, Unit> function2 = f176lambda2;
        int i4 = i2 + 115;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
        return function2;
    }
}
