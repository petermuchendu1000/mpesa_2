package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ComposableSingletons$NewspaperTabScreenKt {
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    public static final ComposableSingletons$NewspaperTabScreenKt INSTANCE = new ComposableSingletons$NewspaperTabScreenKt();

    public static Function2<Composer, Integer, Unit> f146lambda1 = ComposableLambdaKt.composableLambdaInstance(1596844066, false, ShareDataUIState.component2);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        public static final ShareDataUIState component2 = new ShareDataUIState();
        private static int component3 = 1;
        private static int copydefault;

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = ShareDataUIState + 91;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 99 / 0;
                    if (!composer.getSkipping()) {
                        return;
                    }
                } else if (!composer.getSkipping()) {
                    return;
                }
                composer.skipToGroupEnd();
                int i5 = component3 + 97;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 79;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 91 / 0;
            }
            return unit;
        }

        static {
            int i = copydefault + 57;
            component1 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        ShareDataUIState() {
        }
    }

    static {
        int i = component3 + 99;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public final Function2<Composer, Integer, Unit> m10554getLambda1$ConsumerHomeUi_release() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Function2<Composer, Integer, Unit> function2 = f146lambda1;
        int i4 = i3 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return function2;
    }
}
