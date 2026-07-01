package com.huawei.digitalpayment.consumer.sfcui.bonga.donatebonga;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010#\u001a\u00020\u0006H×\u0001J\t\u0010$\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/donatebonga/DonateBongaOrganization;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "name", "logoRes", "", "paybillNumber", "accountNumber", "learnMoreUrl", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getLogoRes", "()I", "getPaybillNumber", "getAccountNumber", "getLearnMoreUrl", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DonateBongaOrganization {
    public static final int $stable = 8;
    private static int equals = 0;
    private static int getAsAtTimestamp = 39 % 128;
    private static int getRequestBeneficiariesState = 0;
    private static int hashCode = 1;
    private boolean ShareDataUIState;
    private final int component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copy;
    private final String copydefault;

    public DonateBongaOrganization(String str, String str2, int i, String str3, String str4, String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.copy = str2;
        this.component1 = i;
        this.component4 = str3;
        this.component2 = str4;
        this.component3 = str5;
        this.ShareDataUIState = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DonateBongaOrganization(String str, String str2, int i, String str3, String str4, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z2;
        if ((i2 & 64) != 0) {
            int i3 = hashCode + 59;
            int i4 = i3 % 128;
            getRequestBeneficiariesState = i4;
            boolean z3 = i3 % 2 != 0;
            int i5 = i4 + 39;
            hashCode = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 2;
            } else {
                int i7 = 2 % 2;
            }
            z2 = z3;
        } else {
            z2 = z;
        }
        this(str, str2, i, str3, str4, str5, z2);
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 21;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.copydefault;
        int i5 = i2 + 109;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 113;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getLogoRes() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        int i5 = this.component1;
        int i6 = i3 + 19;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 21 / 0;
        }
        return i5;
    }

    public final String getPaybillNumber() {
        String str;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 111;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component4;
            int i4 = 93 / 0;
        } else {
            str = this.component4;
        }
        int i5 = i2 + 45;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAccountNumber() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 93;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 93;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getLearnMoreUrl() {
        int i = 2 % 2;
        int i2 = hashCode + 83;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 89;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean isSelected() {
        int i = 2 % 2;
        int i2 = hashCode + 93;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return z;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = hashCode + 37;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        this.ShareDataUIState = z;
        int i5 = i3 + 37;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 39 % 2;
    }

    public static DonateBongaOrganization copy$default(DonateBongaOrganization donateBongaOrganization, String str, String str2, int i, String str3, String str4, String str5, boolean z, int i2, Object obj) {
        String str6;
        int i3;
        String str7;
        int i4 = 2 % 2;
        int i5 = getRequestBeneficiariesState;
        int i6 = i5 + 111;
        hashCode = i6 % 128;
        String str8 = (i6 % 2 == 0 || (i2 & 1) == 0) ? str : donateBongaOrganization.copydefault;
        if ((i2 & 2) != 0) {
            str6 = donateBongaOrganization.copy;
            int i7 = i5 + 103;
            hashCode = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str6 = str2;
        }
        if ((i2 & 4) != 0) {
            int i9 = i5 + 115;
            hashCode = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = donateBongaOrganization.component1;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            i3 = donateBongaOrganization.component1;
        } else {
            i3 = i;
        }
        String str9 = (i2 & 8) != 0 ? donateBongaOrganization.component4 : str3;
        if ((i2 & 16) != 0) {
            int i11 = i5 + 107;
            hashCode = i11 % 128;
            int i12 = i11 % 2;
            str7 = donateBongaOrganization.component2;
        } else {
            str7 = str4;
        }
        return donateBongaOrganization.copy(str8, str6, i3, str9, str7, (i2 & 32) != 0 ? donateBongaOrganization.component3 : str5, (i2 & 64) != 0 ? donateBongaOrganization.ShareDataUIState : z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = hashCode + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 != 0) {
            int i4 = 79 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 75;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 95;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        int i5 = this.component1;
        int i6 = i3 + 19;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 97;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 57;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 103;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component2;
        int i5 = i2 + 33;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 93;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 13;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final boolean component7() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.ShareDataUIState;
        int i5 = i2 + 79;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final DonateBongaOrganization copy(String id, String name, int logoRes, String paybillNumber, String accountNumber, String learnMoreUrl, boolean isSelected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(paybillNumber, "");
        Intrinsics.checkNotNullParameter(accountNumber, "");
        Intrinsics.checkNotNullParameter(learnMoreUrl, "");
        DonateBongaOrganization donateBongaOrganization = new DonateBongaOrganization(id, name, logoRes, paybillNumber, accountNumber, learnMoreUrl, isSelected);
        int i2 = getRequestBeneficiariesState + 53;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        return donateBongaOrganization;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = hashCode + 103;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DonateBongaOrganization)) {
            int i4 = getRequestBeneficiariesState + 33;
            hashCode = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        DonateBongaOrganization donateBongaOrganization = (DonateBongaOrganization) other;
        if (!Intrinsics.areEqual(this.copydefault, donateBongaOrganization.copydefault) || !Intrinsics.areEqual(this.copy, donateBongaOrganization.copy)) {
            return false;
        }
        if (this.component1 != donateBongaOrganization.component1) {
            int i6 = hashCode + 39;
            int i7 = i6 % 128;
            getRequestBeneficiariesState = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 123;
            hashCode = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, donateBongaOrganization.component4)) {
            return false;
        }
        if (Intrinsics.areEqual(this.component2, donateBongaOrganization.component2)) {
            return Intrinsics.areEqual(this.component3, donateBongaOrganization.component3) && this.ShareDataUIState == donateBongaOrganization.ShareDataUIState;
        }
        int i11 = getRequestBeneficiariesState + 43;
        hashCode = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.copydefault.hashCode() * 31) + this.copy.hashCode()) * 31) + Integer.hashCode(this.component1)) * 31) + this.component4.hashCode()) * 31) + this.component2.hashCode()) * 31) + this.component3.hashCode()) * 31) + Boolean.hashCode(this.ShareDataUIState);
        int i4 = getRequestBeneficiariesState + 79;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DonateBongaOrganization(id=" + this.copydefault + ", name=" + this.copy + ", logoRes=" + this.component1 + ", paybillNumber=" + this.component4 + ", accountNumber=" + this.component2 + ", learnMoreUrl=" + this.component3 + ", isSelected=" + this.ShareDataUIState + ")";
        int i2 = hashCode + 103;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
