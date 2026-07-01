package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/TunukiwaTypes;", "", "<init>", "()V", "TUNUKIWA_DEALS", "", "TUNUKIWA_SPECIAL", "TUNUKIWA_INTERNET", "TUNUKIWA_MINUTES", "getTununkiwaTypeDisplay", "tunukiwaType", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TunukiwaTypes {
    public static final int $stable = 0;
    public static final TunukiwaTypes INSTANCE = new TunukiwaTypes();
    private static int ShareDataUIState = 0;
    public static final String TUNUKIWA_DEALS = "14";
    public static final String TUNUKIWA_INTERNET = "2";
    public static final String TUNUKIWA_MINUTES = "3";
    public static final String TUNUKIWA_SPECIAL = "12";
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    private TunukiwaTypes() {
    }

    public final String getTununkiwaTypeDisplay(String tunukiwaType) {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (tunukiwaType != null) {
            int i4 = i3 + 117;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0 ? (iHashCode = tunukiwaType.hashCode()) == 50 : (iHashCode = tunukiwaType.hashCode()) == 125) {
                if (tunukiwaType.equals("2")) {
                    return Keys.TUNUKIWA_CATEGORY_INTERNET;
                }
            } else if (iHashCode != 51) {
                if (iHashCode == 1571 && tunukiwaType.equals("14")) {
                    return Keys.TUNUKIWA_CATEGORY_DEALS;
                }
            } else if (tunukiwaType.equals("3")) {
                return Keys.TUNUKIWA_CATEGORY_MINUTES;
            }
        }
        return Keys.TUNUKIWA_CATEGORY_SPECIAL;
    }

    static {
        int i = component3 + 35;
        component1 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
