package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class ComputationMethod {
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;
    public static final ComputationMethod MEDIAN_ALL_TIME = new ComputationMethod("MEDIAN_ALL_TIME", 0);
    public static final ComputationMethod MEDIAN_INTERVAL = new ComputationMethod("MEDIAN_INTERVAL", 1);
    private static final ComputationMethod[] $VALUES = $values();

    private static ComputationMethod[] $values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ComputationMethod computationMethod = MEDIAN_ALL_TIME;
        if (i3 == 0) {
            return new ComputationMethod[]{computationMethod, MEDIAN_INTERVAL};
        }
        ComputationMethod computationMethod2 = MEDIAN_INTERVAL;
        ComputationMethod[] computationMethodArr = new ComputationMethod[5];
        computationMethodArr[1] = computationMethod;
        computationMethodArr[0] = computationMethod2;
        return computationMethodArr;
    }

    private ComputationMethod(String str, int i) {
    }

    public static ComputationMethod valueOf(String str) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ComputationMethod computationMethod = (ComputationMethod) Enum.valueOf(ComputationMethod.class, str);
        if (i3 != 0) {
            return computationMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ComputationMethod[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ComputationMethod[] computationMethodArr = (ComputationMethod[]) $VALUES.clone();
        int i4 = ShareDataUIState + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return computationMethodArr;
    }

    static {
        int i = copydefault + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
