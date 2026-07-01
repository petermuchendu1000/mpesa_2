package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J[\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001f\u001a\u00020 H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0012¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/AddBeneficiaryFormState;", "", "beneficiaryMsisdn", "", "beneficiaryNickname", "limitText", "isPhoneValid", "", "isNicknameValid", "isAmountValid", "amountError", "isFormValid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Z)V", "getBeneficiaryMsisdn", "()Ljava/lang/String;", "getBeneficiaryNickname", "getLimitText", "()Z", "getAmountError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddBeneficiaryFormState {
    public static final int $stable = 0;
    private static int component4 = 81 % 128;
    private static int equals = 0;
    private static int getSponsorBeneficiariesState = 0;
    private static int toString = 1;
    private final boolean ShareDataUIState;
    private final boolean component1;
    private final String component2;
    private final String component3;
    private final boolean copy;
    private final String copydefault;
    private final String getAsAtTimestamp;
    private final boolean getRequestBeneficiariesState;

    public AddBeneficiaryFormState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.component3 = str2;
        this.getAsAtTimestamp = str3;
        this.copy = z;
        this.getRequestBeneficiariesState = z2;
        this.ShareDataUIState = z3;
        this.component2 = str4;
        this.component1 = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AddBeneficiaryFormState(String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        boolean z5;
        String str7;
        String str8 = "";
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        if ((i & 2) != 0) {
            int i3 = getSponsorBeneficiariesState + 13;
            toString = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            str6 = "";
        } else {
            str6 = str2;
        }
        if ((i & 4) != 0) {
            int i6 = 2 % 2;
        } else {
            str8 = str3;
        }
        boolean z6 = false;
        if ((i & 8) != 0) {
            int i7 = 2 % 2;
            z5 = false;
        } else {
            z5 = z;
        }
        boolean z7 = (i & 16) != 0 ? false : z2;
        boolean z8 = (i & 32) != 0 ? false : z3;
        if ((i & 64) != 0) {
            int i8 = toString + 93;
            getSponsorBeneficiariesState = i8 % 128;
            str7 = null;
            if (i8 % 2 != 0) {
                str7.hashCode();
                throw null;
            }
        } else {
            str7 = str4;
        }
        if ((i & 128) != 0) {
            int i9 = toString + 95;
            int i10 = i9 % 128;
            getSponsorBeneficiariesState = i10;
            int i11 = i9 % 2;
            int i12 = i10 + 33;
            toString = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            z6 = z4;
        }
        this(str5, str6, str8, z5, z7, z8, str7, z6);
    }

    public final String getBeneficiaryMsisdn() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 73;
        getSponsorBeneficiariesState = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 97;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getBeneficiaryNickname() {
        int i = 2 % 2;
        int i2 = toString + 3;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final String getLimitText() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 55;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 17;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isPhoneValid() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 63;
        toString = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copy;
        int i5 = i2 + 17;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return z;
    }

    public final boolean isNicknameValid() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 19;
        toString = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.getRequestBeneficiariesState;
        int i4 = i2 + 41;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean isAmountValid() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 37;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 55;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 13 / 0;
        }
        return z;
    }

    public final String getAmountError() {
        int i = 2 % 2;
        int i2 = toString + 73;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component2;
        int i5 = i3 + 25;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isFormValid() {
        int i = 2 % 2;
        int i2 = toString + 71;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.component1;
        int i5 = i3 + 11;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        if (81 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public AddBeneficiaryFormState() {
        this(null, null, null, false, false, false, null, false, 255, null);
    }

    public static AddBeneficiaryFormState copy$default(AddBeneficiaryFormState addBeneficiaryFormState, String str, String str2, String str3, boolean z, boolean z2, boolean z3, String str4, boolean z4, int i, Object obj) {
        boolean z5;
        String str5;
        boolean z6;
        int i2 = 2 % 2;
        String str6 = (i & 1) != 0 ? addBeneficiaryFormState.copydefault : str;
        String str7 = (i & 2) != 0 ? addBeneficiaryFormState.component3 : str2;
        String str8 = (i & 4) != 0 ? addBeneficiaryFormState.getAsAtTimestamp : str3;
        boolean z7 = (i & 8) != 0 ? addBeneficiaryFormState.copy : z;
        boolean z8 = (i & 16) != 0 ? addBeneficiaryFormState.getRequestBeneficiariesState : z2;
        if ((i & 32) != 0) {
            int i3 = toString + 123;
            getSponsorBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            z5 = addBeneficiaryFormState.ShareDataUIState;
        } else {
            z5 = z3;
        }
        if ((i & 64) != 0) {
            int i5 = toString + 51;
            getSponsorBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            str5 = addBeneficiaryFormState.component2;
        } else {
            str5 = str4;
        }
        if ((i & 128) != 0) {
            int i7 = getSponsorBeneficiariesState + 65;
            int i8 = i7 % 128;
            toString = i8;
            if (i7 % 2 == 0) {
                boolean z9 = addBeneficiaryFormState.component1;
                throw null;
            }
            z6 = addBeneficiaryFormState.component1;
            int i9 = i8 + 41;
            getSponsorBeneficiariesState = i9 % 128;
            int i10 = i9 % 2;
        } else {
            z6 = z4;
        }
        return addBeneficiaryFormState.copy(str6, str7, str8, z7, z8, z5, str5, z6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 13;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 7;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = toString + 79;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component3;
        if (i3 != 0) {
            int i4 = 96 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 43;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 == 0) {
            str = this.getAsAtTimestamp;
            int i4 = 5 / 0;
        } else {
            str = this.getAsAtTimestamp;
        }
        int i5 = i3 + 63;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = toString + 81;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.copy;
        int i5 = i3 + 5;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final boolean component5() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 53;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = toString + 125;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i3 + 49;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = toString + 113;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            str = this.component2;
            int i4 = 15 / 0;
        } else {
            str = this.component2;
        }
        int i5 = i3 + 57;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component8() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 63;
        int i3 = i2 % 128;
        toString = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.component1;
        int i4 = i3 + 95;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final AddBeneficiaryFormState copy(String beneficiaryMsisdn, String beneficiaryNickname, String limitText, boolean isPhoneValid, boolean isNicknameValid, boolean isAmountValid, String amountError, boolean isFormValid) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryNickname, "");
        Intrinsics.checkNotNullParameter(limitText, "");
        AddBeneficiaryFormState addBeneficiaryFormState = new AddBeneficiaryFormState(beneficiaryMsisdn, beneficiaryNickname, limitText, isPhoneValid, isNicknameValid, isAmountValid, amountError, isFormValid);
        int i2 = toString + 41;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return addBeneficiaryFormState;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddBeneficiaryFormState)) {
            return false;
        }
        AddBeneficiaryFormState addBeneficiaryFormState = (AddBeneficiaryFormState) other;
        if (!Intrinsics.areEqual(this.copydefault, addBeneficiaryFormState.copydefault)) {
            int i2 = toString + 37;
            getSponsorBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, addBeneficiaryFormState.component3)) {
            int i4 = toString + 13;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, addBeneficiaryFormState.getAsAtTimestamp)) {
            return false;
        }
        if (this.copy != addBeneficiaryFormState.copy) {
            int i6 = getSponsorBeneficiariesState + 47;
            toString = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.getRequestBeneficiariesState == addBeneficiaryFormState.getRequestBeneficiariesState) {
            return this.ShareDataUIState == addBeneficiaryFormState.ShareDataUIState && !(Intrinsics.areEqual(this.component2, addBeneficiaryFormState.component2) ^ true) && this.component1 == addBeneficiaryFormState.component1;
        }
        int i8 = getSponsorBeneficiariesState + 27;
        toString = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = toString + 15;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = this.component3.hashCode();
        int iHashCode4 = this.getAsAtTimestamp.hashCode();
        int iHashCode5 = Boolean.hashCode(this.copy);
        int iHashCode6 = Boolean.hashCode(this.getRequestBeneficiariesState);
        int iHashCode7 = Boolean.hashCode(this.ShareDataUIState);
        String str = this.component2;
        if (str == null) {
            int i4 = getSponsorBeneficiariesState + 27;
            toString = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode) * 31) + Boolean.hashCode(this.component1);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AddBeneficiaryFormState(beneficiaryMsisdn=" + this.copydefault + ", beneficiaryNickname=" + this.component3 + ", limitText=" + this.getAsAtTimestamp + ", isPhoneValid=" + this.copy + ", isNicknameValid=" + this.getRequestBeneficiariesState + ", isAmountValid=" + this.ShareDataUIState + ", amountError=" + this.component2 + ", isFormValid=" + this.component1 + ")";
        int i2 = toString + 99;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
