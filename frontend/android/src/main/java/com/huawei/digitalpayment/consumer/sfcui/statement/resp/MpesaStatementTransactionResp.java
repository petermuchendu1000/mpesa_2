package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import com.safaricom.consumer.commons.statements.DisPlayItems;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H×\u0003J\t\u0010!\u001a\u00020\u0005H×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/MpesaStatementTransactionResp;", "Ljava/io/Serializable;", "name", "", "avatar", "", "number", "amountDisplay", "transactionTime", DisPlayItems.TRANSACTION_ID, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAvatar", "()I", "getNumber", "getAmountDisplay", "getTransactionTime", "getTransactionId", "setTransactionId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaStatementTransactionResp implements Serializable {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1 % 128;
    private static int component3;
    private final String amountDisplay;
    private final int avatar;
    private final String name;
    private final String number;
    private String transactionId;
    private final String transactionTime;

    public MpesaStatementTransactionResp(String str, int i, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.avatar = i;
        this.number = str2;
        this.amountDisplay = str3;
        this.transactionTime = str4;
        this.transactionId = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MpesaStatementTransactionResp(String str, int i, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 32) != 0) {
            int i3 = component1;
            int i4 = i3 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 59;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str5 = "";
        }
        this(str, i, str2, str3, str4, str5);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 39 / 0;
        }
        return str;
    }

    public final int getAvatar() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.avatar;
        int i5 = i2 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getNumber() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.number;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAmountDisplay() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountDisplay;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTransactionTime() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionTime;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public final String getTransactionId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.transactionId;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTransactionId(String str) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            this.transactionId = str;
            int i3 = 35 / 0;
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            this.transactionId = str;
        }
        int i4 = component1 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        if (1 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MpesaStatementTransactionResp copy$default(MpesaStatementTransactionResp mpesaStatementTransactionResp, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
        String str6;
        String str7;
        String str8;
        String str9;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str6 = mpesaStatementTransactionResp.name;
            int i4 = component1 + 77;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 5;
            }
        } else {
            str6 = str;
        }
        int i6 = (i2 & 2) != 0 ? mpesaStatementTransactionResp.avatar : i;
        String str10 = (i2 & 4) != 0 ? mpesaStatementTransactionResp.number : str2;
        if ((i2 & 8) != 0) {
            int i7 = component1 + 55;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str7 = mpesaStatementTransactionResp.amountDisplay;
        } else {
            str7 = str3;
        }
        if ((i2 & 16) != 0) {
            int i9 = ShareDataUIState + 105;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                String str11 = mpesaStatementTransactionResp.transactionTime;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str8 = mpesaStatementTransactionResp.transactionTime;
        } else {
            str8 = str4;
        }
        if ((i2 & 32) != 0) {
            int i10 = ShareDataUIState + 9;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            str9 = mpesaStatementTransactionResp.transactionId;
        } else {
            str9 = str5;
        }
        return mpesaStatementTransactionResp.copy(str6, i6, str10, str7, str8, str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.avatar;
        int i6 = i2 + 3;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.number;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.amountDisplay;
        int i4 = i3 + 11;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.transactionTime;
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.transactionId;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    public final MpesaStatementTransactionResp copy(String name, int avatar, String number, String amountDisplay, String transactionTime, String transactionId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(number, "");
        Intrinsics.checkNotNullParameter(amountDisplay, "");
        Intrinsics.checkNotNullParameter(transactionTime, "");
        Intrinsics.checkNotNullParameter(transactionId, "");
        MpesaStatementTransactionResp mpesaStatementTransactionResp = new MpesaStatementTransactionResp(name, avatar, number, amountDisplay, transactionTime, transactionId);
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return mpesaStatementTransactionResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof MpesaStatementTransactionResp)) {
            return false;
        }
        MpesaStatementTransactionResp mpesaStatementTransactionResp = (MpesaStatementTransactionResp) other;
        if (!Intrinsics.areEqual(this.name, mpesaStatementTransactionResp.name) || this.avatar != mpesaStatementTransactionResp.avatar || (!Intrinsics.areEqual(this.number, mpesaStatementTransactionResp.number))) {
            return false;
        }
        if (!Intrinsics.areEqual(this.amountDisplay, mpesaStatementTransactionResp.amountDisplay)) {
            int i7 = ShareDataUIState + 57;
            component1 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.transactionTime, mpesaStatementTransactionResp.transactionTime)) {
            return !(Intrinsics.areEqual(this.transactionId, mpesaStatementTransactionResp.transactionId) ^ true);
        }
        int i8 = component1 + 47;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.name.hashCode() * 31) + Integer.hashCode(this.avatar)) * 31) + this.number.hashCode()) * 31) + this.amountDisplay.hashCode()) * 31) + this.transactionTime.hashCode()) * 31) + this.transactionId.hashCode();
        int i4 = component1 + 37;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaStatementTransactionResp(name=" + this.name + ", avatar=" + this.avatar + ", number=" + this.number + ", amountDisplay=" + this.amountDisplay + ", transactionTime=" + this.transactionTime + ", transactionId=" + this.transactionId + ")";
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
