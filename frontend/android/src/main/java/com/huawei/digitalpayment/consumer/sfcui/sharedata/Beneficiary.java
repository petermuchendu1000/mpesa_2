package com.huawei.digitalpayment.consumer.sfcui.sharedata;

import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\t\u0010\u0018\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/sharedata/Beneficiary;", "", "msisdn", "", ProfileConstants.NICK_NAME, "dataAmount", "bundleType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getNickName", "getDataAmount", "getBundleType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Beneficiary {
    public static final int $stable = 0;
    private static int component4 = 1;
    private static int copy = 1;
    private static int copydefault;
    private static int getRequestBeneficiariesState;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;

    public Beneficiary(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.component1 = str;
        this.component2 = str2;
        this.ShareDataUIState = str3;
        this.component3 = str4;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 115;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 51;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 67 / 0;
        }
        return str;
    }

    public final String getNickName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDataAmount() {
        int i = 2 % 2;
        int i2 = copy + 95;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 31;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBundleType() {
        int i = 2 % 2;
        int i2 = copy + 115;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 45;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    static {
        int i = 1 + 65;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static Beneficiary copy$default(Beneficiary beneficiary, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getRequestBeneficiariesState + 83;
        int i4 = i3 % 128;
        copy = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            str = beneficiary.component1;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 89;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            str2 = beneficiary.component2;
        }
        if ((i & 4) != 0) {
            int i8 = i4 + 27;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 != 0) {
                String str5 = beneficiary.ShareDataUIState;
                throw null;
            }
            str3 = beneficiary.ShareDataUIState;
        }
        if ((i & 8) != 0) {
            str4 = beneficiary.component3;
        }
        return beneficiary.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 101;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 113;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 21;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 107;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 23;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 19;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Beneficiary copy(String msisdn, String nickName, String dataAmount, String bundleType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(nickName, "");
        Intrinsics.checkNotNullParameter(dataAmount, "");
        Intrinsics.checkNotNullParameter(bundleType, "");
        Beneficiary beneficiary = new Beneficiary(msisdn, nickName, dataAmount, bundleType);
        int i2 = getRequestBeneficiariesState + 101;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return beneficiary;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 25;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 83;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof Beneficiary)) {
            return false;
        }
        Beneficiary beneficiary = (Beneficiary) other;
        if (!Intrinsics.areEqual(this.component1, beneficiary.component1)) {
            int i7 = copy + 73;
            getRequestBeneficiariesState = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.component2, beneficiary.component2)) {
            return false;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, beneficiary.ShareDataUIState)) {
            if (Intrinsics.areEqual(this.component3, beneficiary.component3)) {
                return true;
            }
            int i8 = getRequestBeneficiariesState + 93;
            copy = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = copy;
        int i11 = i10 + 41;
        getRequestBeneficiariesState = i11 % 128;
        boolean z = i11 % 2 != 0;
        int i12 = i10 + 29;
        getRequestBeneficiariesState = i12 % 128;
        int i13 = i12 % 2;
        return z;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component1.hashCode() * 31) + this.component2.hashCode()) * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component3.hashCode();
        int i4 = copy + 17;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Beneficiary(msisdn=" + this.component1 + ", nickName=" + this.component2 + ", dataAmount=" + this.ShareDataUIState + ", bundleType=" + this.component3 + ")";
        int i2 = copy + 117;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 59 / 0;
        }
        return str;
    }
}
