package com.huawei.digitalpayment.consumer.miniapps.ui;

import com.alibaba.griver.api.constants.GriverErrors;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/ui/MiniAppError;", "", "type", "Lkotlin/Pair;", "", "<init>", "(Ljava/lang/String;ILkotlin/Pair;)V", "getType", "()Lkotlin/Pair;", "ERROR_1001", "ERROR_1002", "ERROR_10000", "ERROR_10001", "ERROR_10002", "ERROR_10003", "ERROR_10009", "ERROR_10010", "ERROR_10030", "ERROR_10040", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppError {
    private static final EnumEntries $ENTRIES;
    private static final MiniAppError[] $VALUES;
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final Pair<String, String> type;
    public static final MiniAppError ERROR_1001 = new MiniAppError("ERROR_1001", 0, new Pair("1001", "The mini app is deleted"));
    public static final MiniAppError ERROR_1002 = new MiniAppError("ERROR_1002", 1, new Pair("1002", "The mini app is suspended"));
    public static final MiniAppError ERROR_10000 = new MiniAppError("ERROR_10000", 2, new Pair(GriverErrors.ERROR_UNKNOWN, "Unknown error"));
    public static final MiniAppError ERROR_10001 = new MiniAppError("ERROR_10001", 3, new Pair(GriverErrors.ERROR_APPID_EXCEPTION, "Mini program does not exist"));
    public static final MiniAppError ERROR_10002 = new MiniAppError("ERROR_10002", 4, new Pair(GriverErrors.ERROR_UNZIP_FAILED, "Sorry, an error occurred during mini app download, try again"));
    public static final MiniAppError ERROR_10003 = new MiniAppError("ERROR_10003", 5, new Pair(GriverErrors.ERROR_NO_APP_INFO, "Sorry, an error occurred during mini app download, try again"));
    public static final MiniAppError ERROR_10009 = new MiniAppError("ERROR_10009", 6, new Pair(GriverErrors.ERROR_DOWNLOAD_FAILED, "Sorry, an error occurred during mini app download, try again"));
    public static final MiniAppError ERROR_10010 = new MiniAppError("ERROR_10010", 7, new Pair(GriverErrors.ERROR_PREPARE_TIMEOUT, "Sorry, an error occurred during mini app download, try again"));
    public static final MiniAppError ERROR_10030 = new MiniAppError("ERROR_10030", 8, new Pair(GriverErrors.ERROR_DYNAMIC_RESOURCE_LOAD_FAILED, "Sorry, an error occurred during mini app download, try again"));
    public static final MiniAppError ERROR_10040 = new MiniAppError("ERROR_10040", 9, new Pair("10040", "Unknown error"));

    private MiniAppError(String str, int i, Pair pair) {
        this.type = pair;
    }

    public final Pair<String, String> getType() {
        Pair<String, String> pair;
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            pair = this.type;
            int i4 = 34 / 0;
        } else {
            pair = this.type;
        }
        int i5 = i3 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return pair;
    }

    static {
        MiniAppError[] miniAppErrorArr$values = $values();
        $VALUES = miniAppErrorArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(miniAppErrorArr$values);
        int i = ShareDataUIState + 21;
        copydefault = i % 128;
        if (i % 2 != 0) {
            int i2 = 82 / 0;
        }
    }

    public static MiniAppError valueOf(String str) {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MiniAppError miniAppError = (MiniAppError) Enum.valueOf(MiniAppError.class, str);
        int i4 = component3 + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 96 / 0;
        }
        return miniAppError;
    }

    public static MiniAppError[] values() {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return (MiniAppError[]) $VALUES.clone();
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final MiniAppError[] $values() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MiniAppError[] miniAppErrorArr = {ERROR_1001, ERROR_1002, ERROR_10000, ERROR_10001, ERROR_10002, ERROR_10003, ERROR_10009, ERROR_10010, ERROR_10030, ERROR_10040};
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return miniAppErrorArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<MiniAppError> getEntries() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        EnumEntries<MiniAppError> enumEntries = $ENTRIES;
        int i5 = i3 + 111;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return enumEntries;
    }
}
