package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.screens;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$SfcManageAndViewDataScreenKt {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    public static final ComposableSingletons$SfcManageAndViewDataScreenKt INSTANCE = new ComposableSingletons$SfcManageAndViewDataScreenKt();

    public static Function2<Composer, Integer, Unit> f174lambda1 = ComposableLambdaKt.composableLambdaInstance(569817944, false, component2.ShareDataUIState);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        public static final component2 ShareDataUIState = new component2();
        private static int component1 = 1;
        private static int component2 = 1;
        private static int component3;
        private static int copydefault;

        public final void ShareDataUIState(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            if ((i & 11) == 2) {
                int i6 = i4 + 3;
                component2 = i6 % 128;
                if (i6 % 2 == 0) {
                    composer.getSkipping();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i7 = component2 + 97;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                }
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 67;
            component2 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 != 0) {
                ShareDataUIState(composer2, num2.intValue());
                return Unit.INSTANCE;
            }
            ShareDataUIState(composer2, num2.intValue());
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        static {
            int i = component1 + 65;
            copydefault = i % 128;
            if (i % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        component2() {
        }
    }

    static {
        int i = component3 + 115;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<Composer, Integer, Unit> m10721getLambda1$ConsumerSfcManageAndViewData_release() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 83;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Function2<Composer, Integer, Unit> function2 = f174lambda1;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return function2;
    }
}
