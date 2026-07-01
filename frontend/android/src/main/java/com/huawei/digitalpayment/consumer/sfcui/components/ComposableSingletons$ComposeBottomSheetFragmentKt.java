package com.huawei.digitalpayment.consumer.sfcui.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$ComposeBottomSheetFragmentKt {
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    public static final ComposableSingletons$ComposeBottomSheetFragmentKt INSTANCE = new ComposableSingletons$ComposeBottomSheetFragmentKt();

    public static Function2<Composer, Integer, Unit> f338lambda1 = ComposableLambdaKt.composableLambdaInstance(32363854, false, component2.component2);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        public static final component2 component2 = new component2();
        private static int component3 = 1;
        private static int copydefault;

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 23;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                if ((i & 125) != 4) {
                    return;
                }
            } else if ((i & 11) != 2) {
                return;
            }
            if (composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            int i4 = copydefault + 5;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 / 3;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 107;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 107;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        static {
            int i = component1 + 35;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        component2() {
        }
    }

    static {
        int i = component2 + 119;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Function2<Composer, Integer, Unit> m11411getLambda1$ConsumerSfcUI_release() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 79;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Function2<Composer, Integer, Unit> function2 = f338lambda1;
        int i4 = i2 + 1;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }
}
