package com.huawei.digitalpayment.consumer.base.miniapps;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/miniapps/MiniAppSdkState;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "INITIALIZED", "NOT_INITIALIZED", "NOT_ALLOWED", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppSdkState {
    private static final EnumEntries $ENTRIES;
    private static final MiniAppSdkState[] $VALUES;
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;
    private final String type;
    public static final MiniAppSdkState INITIALIZED = new MiniAppSdkState("INITIALIZED", 0, "initialized");
    public static final MiniAppSdkState NOT_INITIALIZED = new MiniAppSdkState("NOT_INITIALIZED", 1, "not_initialized");
    public static final MiniAppSdkState NOT_ALLOWED = new MiniAppSdkState("NOT_ALLOWED", 2, "not_allowed");

    private MiniAppSdkState(String str, int i, String str2) {
        this.type = str2;
    }

    public final String getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.type;
        int i5 = i2 + 31;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        MiniAppSdkState[] miniAppSdkStateArr$values = $values();
        $VALUES = miniAppSdkStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(miniAppSdkStateArr$values);
        int i = copydefault + 59;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static MiniAppSdkState valueOf(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        MiniAppSdkState miniAppSdkState = (MiniAppSdkState) Enum.valueOf(MiniAppSdkState.class, str);
        int i4 = ShareDataUIState + 23;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return miniAppSdkState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MiniAppSdkState[] values() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MiniAppSdkState[] miniAppSdkStateArr = (MiniAppSdkState[]) $VALUES.clone();
        int i4 = component3 + 81;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return miniAppSdkStateArr;
    }

    private static final MiniAppSdkState[] $values() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return new MiniAppSdkState[]{INITIALIZED, NOT_INITIALIZED, NOT_ALLOWED};
        }
        MiniAppSdkState miniAppSdkState = INITIALIZED;
        MiniAppSdkState miniAppSdkState2 = NOT_INITIALIZED;
        MiniAppSdkState miniAppSdkState3 = NOT_ALLOWED;
        MiniAppSdkState[] miniAppSdkStateArr = new MiniAppSdkState[5];
        miniAppSdkStateArr[0] = miniAppSdkState;
        miniAppSdkStateArr[0] = miniAppSdkState2;
        miniAppSdkStateArr[2] = miniAppSdkState3;
        return miniAppSdkStateArr;
    }

    public static EnumEntries<MiniAppSdkState> getEntries() {
        EnumEntries<MiniAppSdkState> enumEntries;
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            enumEntries = $ENTRIES;
            int i4 = 54 / 0;
        } else {
            enumEntries = $ENTRIES;
        }
        int i5 = i3 + 125;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
