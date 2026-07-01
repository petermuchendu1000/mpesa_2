package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.speedtest.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
public final class UploadStorageType {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;
    public static final UploadStorageType RAM_STORAGE = new UploadStorageType("RAM_STORAGE", 0);
    public static final UploadStorageType FILE_STORAGE = new UploadStorageType("FILE_STORAGE", 1);
    private static final UploadStorageType[] $VALUES = $values();

    private static UploadStorageType[] $values() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        UploadStorageType[] uploadStorageTypeArr = {RAM_STORAGE, FILE_STORAGE};
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return uploadStorageTypeArr;
    }

    private UploadStorageType(String str, int i) {
    }

    public static UploadStorageType valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        UploadStorageType uploadStorageType = (UploadStorageType) Enum.valueOf(UploadStorageType.class, str);
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return uploadStorageType;
    }

    public static UploadStorageType[] values() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        UploadStorageType[] uploadStorageTypeArr = (UploadStorageType[]) $VALUES.clone();
        int i4 = component2 + 53;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return uploadStorageTypeArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 81;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 1 / 0;
        }
    }
}
