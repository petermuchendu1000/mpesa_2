package com.huawei.digitalpayment.consumer.zuriui.components;

import android.os.Process;
import com.huawei.digitalpayment.consumer.zuriui.components.ComposableSingletons$ChatScaffoldContainerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class ComposableSingletons$ChatScaffoldContainerKt$lambda5$1$$ExternalSyntheticLambda3 implements Function0 {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    public static int component3;
    public static int copydefault;

    public static int component1() {
        int i = component3;
        int i2 = i % 8235044;
        component3 = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        copydefault = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            ComposableSingletons$ChatScaffoldContainerKt.copydefault.component1();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitComponent1 = ComposableSingletons$ChatScaffoldContainerKt.copydefault.component1();
        int i3 = ShareDataUIState + 101;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 82 / 0;
        }
        return unitComponent1;
    }
}
