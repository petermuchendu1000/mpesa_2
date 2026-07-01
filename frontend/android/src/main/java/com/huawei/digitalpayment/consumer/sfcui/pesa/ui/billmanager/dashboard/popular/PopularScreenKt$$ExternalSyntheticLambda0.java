package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.popular;

import android.os.SystemClock;
import java.util.List;
import kotlin.jvm.functions.Function0;

public final class PopularScreenKt$$ExternalSyntheticLambda0 implements Function0 {
    private static int ShareDataUIState = 1;
    public static int component1;
    private static int component2;
    public static int component3;
    public final String f$0;
    public final List f$1;

    public PopularScreenKt$$ExternalSyntheticLambda0(String str, List list) {
        this.f$0 = str;
        this.f$1 = list;
    }

    public static int component1() {
        int i = component3;
        int i2 = i % 9209369;
        component3 = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
        component1 = iElapsedRealtime;
        return iElapsedRealtime;
    }

    @Override
    public final Object invoke() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List listM11585$r8$lambda$6hFsjmpVwUyBnZduhs8rHPQhd0 = PopularScreenKt.m11585$r8$lambda$6hFsjmpVwUyBnZduhs8rHPQhd0(this.f$0, this.f$1);
        int i4 = component2 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return listM11585$r8$lambda$6hFsjmpVwUyBnZduhs8rHPQhd0;
    }
}
