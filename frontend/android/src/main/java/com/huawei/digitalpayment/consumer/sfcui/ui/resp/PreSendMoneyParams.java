package com.huawei.digitalpayment.consumer.sfcui.ui.resp;

import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u0003H×\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/resp/PreSendMoneyParams;", "Lcom/huawei/http/BaseRequestParams;", "amount", "", "receiverMsisdn", "note", "tradeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getReceiverMsisdn", "getNote", "getTradeType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PreSendMoneyParams extends BaseRequestParams {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 89 % 128;
    private static int component2 = 1;
    private static int copydefault;
    private final String amount;
    private final String note;
    private final String receiverMsisdn;
    private final String tradeType;

    /* JADX WARN: Illegal instructions before constructor call */
    public PreSendMoneyParams(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = component2;
            int i3 = i2 + 65;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 0;
            }
            int i5 = i2 + 41;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = "";
        }
        if ((i & 8) != 0) {
            int i8 = component2 + 11;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 8 / 0;
            }
            str4 = "NativeApp";
        }
        this(str, str2, str3, str4);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 61;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getReceiverMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.receiverMsisdn;
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final String getNote() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.note;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getTradeType() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public PreSendMoneyParams(String str, String str2, String str3, String str4) {
        this.amount = str;
        this.receiverMsisdn = str2;
        this.note = str3;
        this.tradeType = str4;
    }

    static {
        int i = 89 % 2;
    }

    public static PreSendMoneyParams copy$default(PreSendMoneyParams preSendMoneyParams, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = preSendMoneyParams.amount;
        }
        if ((i & 2) != 0) {
            int i3 = component2 + 55;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                String str5 = preSendMoneyParams.receiverMsisdn;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = preSendMoneyParams.receiverMsisdn;
        }
        if ((i & 4) != 0) {
            str3 = preSendMoneyParams.note;
        }
        if ((i & 8) != 0) {
            int i4 = component2 + 11;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            str4 = preSendMoneyParams.tradeType;
        }
        PreSendMoneyParams preSendMoneyParamsCopy = preSendMoneyParams.copy(str, str2, str3, str4);
        int i6 = ShareDataUIState + 63;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return preSendMoneyParamsCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amount;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.receiverMsisdn;
            int i4 = 45 / 0;
        } else {
            str = this.receiverMsisdn;
        }
        int i5 = i2 + 21;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.note;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.tradeType;
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final PreSendMoneyParams copy(String amount, String receiverMsisdn, String note, String tradeType) {
        int i = 2 % 2;
        PreSendMoneyParams preSendMoneyParams = new PreSendMoneyParams(amount, receiverMsisdn, note, tradeType);
        int i2 = ShareDataUIState + 123;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 53 / 0;
        }
        return preSendMoneyParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreSendMoneyParams)) {
            int i2 = component2 + 93;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        PreSendMoneyParams preSendMoneyParams = (PreSendMoneyParams) other;
        if (!Intrinsics.areEqual(this.amount, preSendMoneyParams.amount)) {
            int i4 = component2 + 93;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.receiverMsisdn, preSendMoneyParams.receiverMsisdn)) {
            int i6 = ShareDataUIState + 91;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.note, preSendMoneyParams.note)) {
            return false;
        }
        if (Intrinsics.areEqual(this.tradeType, preSendMoneyParams.tradeType)) {
            return true;
        }
        int i8 = component2 + 31;
        ShareDataUIState = i8 % 128;
        return i8 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.amount;
        if (str == null) {
            int i2 = component2 + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.receiverMsisdn;
        if (str2 == null) {
            int i4 = component2 + 49;
            ShareDataUIState = i4 % 128;
            iHashCode2 = (i4 % 2 != 0 ? 0 : 1) ^ 1;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = component2 + 29;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        String str3 = this.note;
        if (str3 == null) {
            int i7 = ShareDataUIState + 121;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.tradeType;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PreSendMoneyParams(amount=" + this.amount + ", receiverMsisdn=" + this.receiverMsisdn + ", note=" + this.note + ", tradeType=" + this.tradeType + ")";
        int i2 = ShareDataUIState + 11;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
