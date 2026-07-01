package com.huawei.digitalpayment.consumer.miniapps.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ComposableSingletons$MiniAppSplashScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MiniAppSplashScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$MiniAppSplashScreenKt$lambda1$1();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @Override
    public Unit invoke(Composer composer, Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        invoke(composer, num.intValue());
        Unit unit = Unit.INSTANCE;
        int i4 = ShareDataUIState + 95;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(androidx.compose.runtime.Composer r12, int r13) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.component3
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.ShareDataUIState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L14
            r13 = r13 & 41
            r1 = 4
            if (r13 != r1) goto L23
            goto L18
        L14:
            r13 = r13 & 11
            if (r13 != r0) goto L23
        L18:
            boolean r13 = r12.getSkipping()
            if (r13 != 0) goto L1f
            goto L23
        L1f:
            r12.skipToGroupEnd()
            goto L5b
        L23:
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r2 = r13.toString()
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState r13 = new com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState
            java.lang.String r3 = "Test Mini App"
            r4 = 0
            r5 = 0
            r6 = 12
            r7 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashError r5 = new com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashError
            java.lang.String r1 = "10001"
            java.lang.String r2 = "No Error"
            r3 = 0
            r5.<init>(r3, r1, r2)
            com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda-1$1$$ExternalSyntheticLambda0 r7 = new com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda-1$1$$ExternalSyntheticLambda0
            r7.<init>()
            r3 = 0
            r6 = 0
            r9 = 25152(0x6240, float:3.5245E-41)
            r10 = 9
            r4 = r13
            r8 = r12
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashScreenKt.MiniAppSplashScreen(r3, r4, r5, r6, r7, r8, r9, r10)
            int r12 = com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.ShareDataUIState
            int r12 = r12 + 63
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.component3 = r13
            int r12 = r12 % r0
        L5b:
            int r12 = com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.ShareDataUIState
            int r12 = r12 + 55
            int r13 = r12 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.component3 = r13
            int r12 = r12 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.miniapps.ui.ComposableSingletons$MiniAppSplashScreenKt$lambda1$1.invoke(androidx.compose.runtime.Composer, int):void");
    }

    private static final Unit invoke$lambda$0() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i3 = component3 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 77 / 0;
        }
        return unit2;
    }

    public static Unit $r8$lambda$SkfkcPOizHtiQNrgohFqwiWP_q4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            invoke$lambda$0();
            throw null;
        }
        Unit unitInvoke$lambda$0 = invoke$lambda$0();
        int i3 = component3 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return unitInvoke$lambda$0;
    }

    static {
        int i = copydefault + 97;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    ComposableSingletons$MiniAppSplashScreenKt$lambda1$1() {
    }
}
