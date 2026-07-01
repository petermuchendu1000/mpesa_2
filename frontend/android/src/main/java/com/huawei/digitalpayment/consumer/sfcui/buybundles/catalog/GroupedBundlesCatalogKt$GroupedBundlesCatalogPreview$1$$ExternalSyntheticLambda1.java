package com.huawei.digitalpayment.consumer.sfcui.buybundles.catalog;

import android.os.Process;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.catalog.GroupedBundlesCatalogKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public final class GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1 implements Function0 {
    private static int component1 = 0;
    private static int component2 = 1;
    public static int component3;
    public static int copydefault;

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = GroupedBundlesCatalogKt.getRequestBeneficiariesState.copydefault();
        int i4 = component2 + 119;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitCopydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static int copydefault() {
        int i = component3;
        int i2 = i % 6948730;
        component3 = i + 1;
        if (i2 != 0) {
            return copydefault;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        copydefault = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
