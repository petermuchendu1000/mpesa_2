package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create;

import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003Jg\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\tHÇ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010'\u001a\u00020(H×\u0001J\t\u0010)\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateState;", "", "billName", "", "paybillNumber", "accountNumber", "amount", "userMessage", "isUserMessageError", "", "errors", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateErrors;", "apiErrorMessage", GriverMonitorConstants.KEY_IS_LOADING, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateErrors;Ljava/lang/String;Z)V", "getBillName", "()Ljava/lang/String;", "getPaybillNumber", "getAccountNumber", "getAmount", "getUserMessage", "()Z", "getErrors", "()Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateErrors;", "getApiErrorMessage", "isContinueEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillManagerCreateState {
    public static final int $stable = 0;
    private static int component4 = 0;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 75 % 128;
    private static int hashCode;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final BillManagerCreateErrors component3;
    private final String copy;
    private final String copydefault;
    private final boolean equals;
    private final String getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;

    public BillManagerCreateState(String str, String str2, String str3, String str4, String str5, boolean z, BillManagerCreateErrors billManagerCreateErrors, String str6, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(billManagerCreateErrors, "");
        this.ShareDataUIState = str;
        this.getAsAtTimestamp = str2;
        this.component2 = str3;
        this.component1 = str4;
        this.copy = str5;
        this.getRequestBeneficiariesState = z;
        this.component3 = billManagerCreateErrors;
        this.copydefault = str6;
        this.equals = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BillManagerCreateState(String str, String str2, String str3, String str4, String str5, boolean z, BillManagerCreateErrors billManagerCreateErrors, String str6, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str7;
        String str8;
        String str9;
        boolean z3;
        String str10;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str7 = "";
        } else {
            str7 = str;
        }
        String str11 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = hashCode + 67;
            getShareableDataState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str8 = "";
        } else {
            str8 = str3;
        }
        String str12 = (i & 8) == 0 ? str4 : "";
        Object obj = null;
        if ((i & 16) != 0) {
            int i6 = hashCode + 107;
            getShareableDataState = i6 % 128;
            if (i6 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str9 = null;
        } else {
            str9 = str5;
        }
        boolean z4 = false;
        if ((i & 32) != 0) {
            int i7 = getShareableDataState + 67;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
            z3 = false;
        } else {
            z3 = z;
        }
        BillManagerCreateErrors billManagerCreateErrors2 = (i & 64) != 0 ? new BillManagerCreateErrors(null, null, null, null, 15, null) : billManagerCreateErrors;
        if ((i & 128) != 0) {
            int i9 = hashCode + 121;
            getShareableDataState = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 36 / 0;
            }
            int i11 = 2 % 2;
            str10 = null;
        } else {
            str10 = str6;
        }
        if ((i & 256) != 0) {
            int i12 = getShareableDataState + 99;
            hashCode = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            int i13 = 2 % 2;
        } else {
            z4 = z2;
        }
        this(str7, str11, str8, str12, str9, z3, billManagerCreateErrors2, str10, z4);
    }

    public final String getBillName() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 85;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 65;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPaybillNumber() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 87;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i3 + 41;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 101;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 57;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = hashCode + 51;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        throw null;
    }

    public final String getUserMessage() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 23;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copy;
        int i5 = i2 + 25;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isUserMessageError() {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i3 + 121;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final BillManagerCreateErrors getErrors() {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component3;
        }
        throw null;
    }

    public final String getApiErrorMessage() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 113;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 103;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isLoading() {
        boolean z;
        int i = 2 % 2;
        int i2 = hashCode + 93;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            z = this.equals;
            int i4 = 36 / 0;
        } else {
            z = this.equals;
        }
        int i5 = i3 + 1;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final boolean isContinueEnabled() {
        int i = 2 % 2;
        if (StringsKt.trim(this.ShareDataUIState).toString().length() <= 0) {
            return false;
        }
        int i2 = hashCode + 105;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        if (StringsKt.trim(this.getAsAtTimestamp).toString().length() <= 0 || StringsKt.trim(this.component1).toString().length() <= 0) {
            return false;
        }
        int i4 = hashCode + 93;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 27 / 0;
            if (StringsKt.trim(this.component2).toString().length() <= 0) {
                return false;
            }
        } else if (StringsKt.trim(this.component2).toString().length() <= 0) {
            return false;
        }
        if (this.getRequestBeneficiariesState) {
            return false;
        }
        int i6 = hashCode + 41;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    static {
        int i = 75 % 2;
    }

    public BillManagerCreateState() {
        this(null, null, null, null, null, false, null, null, false, 511, null);
    }

    public static BillManagerCreateState copy$default(BillManagerCreateState billManagerCreateState, String str, String str2, String str3, String str4, String str5, boolean z, BillManagerCreateErrors billManagerCreateErrors, String str6, boolean z2, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        BillManagerCreateErrors billManagerCreateErrors2;
        boolean z3;
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 83;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0 || (i & 1) == 0) {
            str7 = str;
        } else {
            int i5 = i3 + 117;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            str7 = billManagerCreateState.ShareDataUIState;
        }
        String str10 = (i & 2) != 0 ? billManagerCreateState.getAsAtTimestamp : str2;
        String str11 = (i & 4) != 0 ? billManagerCreateState.component2 : str3;
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i7 = i3 + 7;
            getShareableDataState = i7 % 128;
            if (i7 % 2 == 0) {
                String str12 = billManagerCreateState.component1;
                obj2.hashCode();
                throw null;
            }
            str8 = billManagerCreateState.component1;
        } else {
            str8 = str4;
        }
        if ((i & 16) != 0) {
            str9 = billManagerCreateState.copy;
            int i8 = getShareableDataState + 7;
            hashCode = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str9 = str5;
        }
        boolean z4 = (i & 32) != 0 ? billManagerCreateState.getRequestBeneficiariesState : z;
        if ((i & 64) != 0) {
            int i10 = getShareableDataState + 93;
            hashCode = i10 % 128;
            if (i10 % 2 != 0) {
                BillManagerCreateErrors billManagerCreateErrors3 = billManagerCreateState.component3;
                throw null;
            }
            billManagerCreateErrors2 = billManagerCreateState.component3;
        } else {
            billManagerCreateErrors2 = billManagerCreateErrors;
        }
        String str13 = (i & 128) != 0 ? billManagerCreateState.copydefault : str6;
        if ((i & 256) != 0) {
            int i11 = hashCode + 47;
            getShareableDataState = i11 % 128;
            int i12 = i11 % 2;
            z3 = billManagerCreateState.equals;
        } else {
            z3 = z2;
        }
        BillManagerCreateState billManagerCreateStateCopy = billManagerCreateState.copy(str7, str10, str11, str8, str9, z4, billManagerCreateErrors2, str13, z3);
        int i13 = getShareableDataState + 109;
        hashCode = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 29 / 0;
        }
        return billManagerCreateStateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 119;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 7;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 101;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = hashCode + 9;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 3;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.component1;
        int i4 = i3 + 45;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 11;
        int i3 = i2 % 128;
        hashCode = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i3 + 55;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 5;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.getRequestBeneficiariesState;
        int i5 = i2 + 39;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final BillManagerCreateErrors component7() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 7;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        BillManagerCreateErrors billManagerCreateErrors = this.component3;
        int i5 = i2 + 117;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return billManagerCreateErrors;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 83;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 87;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component9() {
        int i = 2 % 2;
        int i2 = hashCode + 49;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.equals;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BillManagerCreateState copy(String billName, String paybillNumber, String accountNumber, String amount, String userMessage, boolean isUserMessageError, BillManagerCreateErrors errors, String apiErrorMessage, boolean isLoading) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(billName, "");
        Intrinsics.checkNotNullParameter(paybillNumber, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(errors, "");
        BillManagerCreateState billManagerCreateState = new BillManagerCreateState(billName, paybillNumber, accountNumber, amount, userMessage, isUserMessageError, errors, apiErrorMessage, isLoading);
        int i2 = getShareableDataState + 97;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return billManagerCreateState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = hashCode + 83;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 65;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof BillManagerCreateState)) {
            return false;
        }
        BillManagerCreateState billManagerCreateState = (BillManagerCreateState) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, billManagerCreateState.ShareDataUIState)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, billManagerCreateState.getAsAtTimestamp)) {
            int i7 = hashCode + 47;
            getShareableDataState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, billManagerCreateState.component2)) {
            int i9 = getShareableDataState + 29;
            int i10 = i9 % 128;
            hashCode = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 27;
            getShareableDataState = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, billManagerCreateState.component1)) {
            int i14 = getShareableDataState + 101;
            hashCode = i14 % 128;
            return i14 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.copy, billManagerCreateState.copy)) {
            int i15 = getShareableDataState + 43;
            hashCode = i15 % 128;
            return i15 % 2 != 0;
        }
        if (this.getRequestBeneficiariesState != billManagerCreateState.getRequestBeneficiariesState) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, billManagerCreateState.component3)) {
            int i16 = hashCode + 97;
            getShareableDataState = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, billManagerCreateState.copydefault)) {
            return this.equals == billManagerCreateState.equals;
        }
        int i18 = getShareableDataState + 31;
        hashCode = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = getShareableDataState + 63;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.ShareDataUIState.hashCode();
        int iHashCode3 = this.getAsAtTimestamp.hashCode();
        int iHashCode4 = this.component2.hashCode();
        int iHashCode5 = this.component1.hashCode();
        String str = this.copy;
        if (str == null) {
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i4 = getShareableDataState + 51;
            hashCode = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 3 / 3;
            }
        }
        int iHashCode6 = Boolean.hashCode(this.getRequestBeneficiariesState);
        int iHashCode7 = this.component3.hashCode();
        String str2 = this.copydefault;
        return (((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.equals);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BillManagerCreateState(billName=" + this.ShareDataUIState + ", paybillNumber=" + this.getAsAtTimestamp + ", accountNumber=" + this.component2 + ", amount=" + this.component1 + ", userMessage=" + this.copy + ", isUserMessageError=" + this.getRequestBeneficiariesState + ", errors=" + this.component3 + ", apiErrorMessage=" + this.copydefault + ", isLoading=" + this.equals + ")";
        int i2 = hashCode + 75;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
