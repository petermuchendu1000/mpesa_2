package com.huawei.digitalpayment.consumer.fixeddata.ui.screen;

import android.os.Process;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class TopUpScreenKt$$ExternalSyntheticLambda1 implements Function2 {
    public static int ShareDataUIState = 0;
    private static int component1 = 1;
    public static int component2;
    private static int component3;
    public final Function0 f$0;
    public final Function0 f$1;
    public final String f$2;
    public final Function1 f$3;
    public final int f$4;

    public TopUpScreenKt$$ExternalSyntheticLambda1(Function0 function0, Function0 function02, String str, Function1 function1, int i) {
        this.f$0 = function0;
        this.f$1 = function02;
        this.f$2 = str;
        this.f$3 = function1;
        this.f$4 = i;
    }

    public static int component1() {
        int i = component2;
        int i2 = i % 9072597;
        component2 = i + 1;
        if (i2 != 0) {
            return ShareDataUIState;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        ShareDataUIState = startUptimeMillis;
        return startUptimeMillis;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return TopUpScreenKt.$r8$lambda$hnwUgHCZ2AlvI6HnfeCK1yI6StU(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, ((Integer) obj2).intValue());
        }
        TopUpScreenKt.$r8$lambda$hnwUgHCZ2AlvI6HnfeCK1yI6StU(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, (Composer) obj, ((Integer) obj2).intValue());
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }
}
