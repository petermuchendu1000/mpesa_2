package com.huawei.digitalpayment.consumer.miniapps.ui;

import androidx.compose.runtime.Composer;
import com.alibaba.griver.api.constants.GriverErrors;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ComposableSingletons$MiniAppSplashScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MiniAppSplashScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$MiniAppSplashScreenKt$lambda2$1();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @Override
    public Unit invoke(Composer composer, Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        invoke(composer, num.intValue());
        Unit unit = Unit.INSTANCE;
        int i4 = copydefault + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public final void invoke(Composer composer, int i) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 11) == 2) {
            int i6 = i3 + 49;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            if (composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
        }
        MiniAppSplashScreenKt.MiniAppSplashScreen(null, new MiniAppSplashState(UUID.randomUUID().toString(), "Test Mini App", null, 0, 12, null), new MiniAppSplashError(true, GriverErrors.ERROR_APPID_EXCEPTION, "No error"), null, new Function0() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke() {
                int i8 = 2 % 2;
                int i9 = copydefault + 117;
                component1 = i9 % 128;
                int i10 = i9 % 2;
                Unit unit$r8$lambda$KqzyGfqWD4eU55HUIebjTx29slI = ComposableSingletons$MiniAppSplashScreenKt$lambda2$1.$r8$lambda$KqzyGfqWD4eU55HUIebjTx29slI();
                int i11 = component1 + 45;
                copydefault = i11 % 128;
                int i12 = i11 % 2;
                return unit$r8$lambda$KqzyGfqWD4eU55HUIebjTx29slI;
            }
        }, composer, 25152, 9);
    }

    private static final Unit invoke$lambda$0() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Unit $r8$lambda$KqzyGfqWD4eU55HUIebjTx29slI() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            invoke$lambda$0();
            throw null;
        }
        Unit unitInvoke$lambda$0 = invoke$lambda$0();
        int i3 = component3 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 69 / 0;
        }
        return unitInvoke$lambda$0;
    }

    static {
        int i = ShareDataUIState + 81;
        component1 = i % 128;
        int i2 = i % 2;
    }

    ComposableSingletons$MiniAppSplashScreenKt$lambda2$1() {
    }
}
