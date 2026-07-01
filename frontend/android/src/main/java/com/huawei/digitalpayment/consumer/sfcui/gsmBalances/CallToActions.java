package com.huawei.digitalpayment.consumer.sfcui.gsmBalances;

import com.alipay.iap.android.wallet.foundation.deeplink.DeeplinkService;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.iap.ac.android.acs.operation.log.LogConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/gsmBalances/CallToActions;", "", LogConstants.Mpm.Interceptor.ACTION, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", DeeplinkService.Scene.TOP_UP, "SAMBAZA", "PAY_BILL", "REQUEST_BILL", "BUY_FLEX", "DATA_CALL_AND_SMS", "BONGA_TRANSFER", "BONGA_REDEEM", "BUY_SMS", "TUNUKIWA", "ROAMING_DATA", "BUY_DATA", "SHARE_REQUEST_DATA", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CallToActions {
    private static final EnumEntries $ENTRIES;
    private static final CallToActions[] $VALUES;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String action;
    public static final CallToActions TOP_UP = new CallToActions(DeeplinkService.Scene.TOP_UP, 0, "topUpAirtime");
    public static final CallToActions SAMBAZA = new CallToActions("SAMBAZA", 1, "sambaza");
    public static final CallToActions PAY_BILL = new CallToActions("PAY_BILL", 2, "payBill");
    public static final CallToActions REQUEST_BILL = new CallToActions("REQUEST_BILL", 3, "requestBill");
    public static final CallToActions BUY_FLEX = new CallToActions("BUY_FLEX", 4, "buyFlex");
    public static final CallToActions DATA_CALL_AND_SMS = new CallToActions("DATA_CALL_AND_SMS", 5, "dataCallsAndSms");
    public static final CallToActions BONGA_TRANSFER = new CallToActions("BONGA_TRANSFER", 6, Keys.TRANSFER_BONGA);
    public static final CallToActions BONGA_REDEEM = new CallToActions("BONGA_REDEEM", 7, Keys.REDEEM_BONGA);
    public static final CallToActions BUY_SMS = new CallToActions("BUY_SMS", 8, "buySms");
    public static final CallToActions TUNUKIWA = new CallToActions("TUNUKIWA", 9, "tunukiwaBundles");
    public static final CallToActions ROAMING_DATA = new CallToActions("ROAMING_DATA", 10, "roamingData");
    public static final CallToActions BUY_DATA = new CallToActions("BUY_DATA", 11, "buy_data");
    public static final CallToActions SHARE_REQUEST_DATA = new CallToActions("SHARE_REQUEST_DATA", 12, "share_request_data");

    private CallToActions(String str, int i, String str2) {
        this.action = str2;
    }

    public final String getAction() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.action;
        int i5 = i2 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    static {
        CallToActions[] callToActionsArr$values = $values();
        $VALUES = callToActionsArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(callToActionsArr$values);
        int i = component1 + 49;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static CallToActions valueOf(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        CallToActions callToActions = (CallToActions) Enum.valueOf(CallToActions.class, str);
        int i3 = copydefault + 85;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 92 / 0;
        }
        return callToActions;
    }

    public static CallToActions[] values() {
        int i = 2 % 2;
        int i2 = component2 + 93;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CallToActions[] callToActionsArr = (CallToActions[]) $VALUES.clone();
        int i4 = copydefault + 33;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return callToActionsArr;
    }

    private static final CallToActions[] $values() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CallToActions[] callToActionsArr = {TOP_UP, SAMBAZA, PAY_BILL, REQUEST_BILL, BUY_FLEX, DATA_CALL_AND_SMS, BONGA_TRANSFER, BONGA_REDEEM, BUY_SMS, TUNUKIWA, ROAMING_DATA, BUY_DATA, SHARE_REQUEST_DATA};
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return callToActionsArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static EnumEntries<CallToActions> getEntries() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<CallToActions> enumEntries = $ENTRIES;
        int i5 = i2 + 61;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return enumEntries;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
