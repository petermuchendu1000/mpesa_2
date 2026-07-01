package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.digitalpayment.common.theme.ThemeManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ju\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0019¨\u0006*"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/bean/LocalProfileInfo;", "", ThemeManager.ROLE, "", "qrCode", "name", "identityId", "avatar", "showMsisdn", KeysConstants.SHORT_CODE, "operatorCode", "preferredCurrency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRole", "()Ljava/lang/String;", "getQrCode", "getName", "getIdentityId", "getAvatar", "getShowMsisdn", "getShortCode", "getOperatorCode", "getPreferredCurrency", "setPreferredCurrency", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalProfileInfo {
    private static int equals = 0;
    private static int toString = 1;
    private String ShareDataUIState;
    private final String component1;
    private final String component2;
    private final String component3;
    private final String component4;
    private final String copy;
    private final String copydefault;
    private final String getAsAtTimestamp;
    private final String getRequestBeneficiariesState;

    public LocalProfileInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.copy = str;
        this.getAsAtTimestamp = str2;
        this.component1 = str3;
        this.copydefault = str4;
        this.component3 = str5;
        this.getRequestBeneficiariesState = str6;
        this.component4 = str7;
        this.component2 = str8;
        this.ShareDataUIState = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalProfileInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str10 = "";
        } else {
            str10 = str;
        }
        String str15 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = toString + 55;
            equals = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str11 = "";
        } else {
            str11 = str3;
        }
        String str16 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i4 = toString + 53;
            equals = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 94 / 0;
            }
            int i6 = 2 % 2;
            str12 = "";
        } else {
            str12 = str5;
        }
        String str17 = (i & 32) != 0 ? "" : str6;
        if ((i & 64) != 0) {
            int i7 = toString + 29;
            equals = i7 % 128;
            int i8 = i7 % 2;
            str13 = "";
        } else {
            str13 = str7;
        }
        if ((i & 128) != 0) {
            int i9 = equals + 49;
            toString = i9 % 128;
            int i10 = i9 % 2;
            str14 = "";
        } else {
            str14 = str8;
        }
        this(str10, str15, str11, str16, str12, str17, str13, str14, (i & 256) == 0 ? str9 : "");
    }

    public final String getRole() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 109;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.copy;
        int i4 = i2 + 13;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getQrCode() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 33;
        equals = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 95;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 31;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 93;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIdentityId() {
        int i = 2 % 2;
        int i2 = equals + 43;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.copydefault;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getAvatar() {
        String str;
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 89;
        toString = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.component3;
            int i4 = 94 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i2 + 55;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShowMsisdn() {
        int i = 2 % 2;
        int i2 = toString + 35;
        equals = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        return str;
    }

    public final String getShortCode() {
        int i = 2 % 2;
        int i2 = toString + 17;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.component4;
        int i5 = i3 + 5;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOperatorCode() {
        int i = 2 % 2;
        int i2 = equals + 15;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component2;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final String getPreferredCurrency() {
        int i = 2 % 2;
        int i2 = equals + 81;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 87;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final void setPreferredCurrency(String str) {
        int i = 2 % 2;
        int i2 = toString + 69;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.ShareDataUIState = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalProfileInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static LocalProfileInfo copy$default(LocalProfileInfo localProfileInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        String str10;
        String str11;
        int i2 = 2 % 2;
        int i3 = toString;
        int i4 = i3 + 15;
        equals = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 91;
            equals = i5 % 128;
            int i6 = i5 % 2;
            str10 = localProfileInfo.copy;
        } else {
            str10 = str;
        }
        String str12 = (i & 2) != 0 ? localProfileInfo.getAsAtTimestamp : str2;
        String str13 = (i & 4) != 0 ? localProfileInfo.component1 : str3;
        String str14 = (i & 8) != 0 ? localProfileInfo.copydefault : str4;
        String str15 = (i & 16) != 0 ? localProfileInfo.component3 : str5;
        if ((i & 32) != 0) {
            str11 = localProfileInfo.getRequestBeneficiariesState;
            int i7 = i3 + 43;
            equals = i7 % 128;
            int i8 = i7 % 2;
        } else {
            str11 = str6;
        }
        return localProfileInfo.copy(str10, str12, str13, str14, str15, str11, (i & 64) != 0 ? localProfileInfo.component4 : str7, (i & 128) != 0 ? localProfileInfo.component2 : str8, (i & 256) != 0 ? localProfileInfo.ShareDataUIState : str9);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = equals + 61;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.copy;
        int i5 = i3 + 93;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = equals + 95;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String str = this.getAsAtTimestamp;
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = toString + 87;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = toString + 55;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 95;
        toString = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = equals + 75;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 105;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = equals + 87;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        String str = this.getRequestBeneficiariesState;
        int i5 = i3 + 67;
        equals = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 87;
        toString = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component4;
        int i5 = i2 + 15;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 79;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i2 + 101;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = toString + 1;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final LocalProfileInfo copy(String role, String qrCode, String name, String identityId, String avatar, String showMsisdn, String shortCode, String operatorCode, String preferredCurrency) {
        int i = 2 % 2;
        LocalProfileInfo localProfileInfo = new LocalProfileInfo(role, qrCode, name, identityId, avatar, showMsisdn, shortCode, operatorCode, preferredCurrency);
        int i2 = equals + 57;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 4 / 0;
        }
        return localProfileInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 113;
        equals = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 59;
            equals = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!(other instanceof LocalProfileInfo)) {
            return false;
        }
        LocalProfileInfo localProfileInfo = (LocalProfileInfo) other;
        if (!Intrinsics.areEqual(this.copy, localProfileInfo.copy)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.getAsAtTimestamp, localProfileInfo.getAsAtTimestamp)) {
            int i5 = equals + 107;
            toString = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.component1, localProfileInfo.component1)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, localProfileInfo.copydefault)) {
            int i6 = toString + 49;
            equals = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, localProfileInfo.component3)) {
            int i8 = toString + 59;
            equals = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getRequestBeneficiariesState, localProfileInfo.getRequestBeneficiariesState)) {
            int i10 = equals + 113;
            toString = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component4, localProfileInfo.component4)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component2, localProfileInfo.component2)) {
            int i12 = equals + 15;
            toString = i12 % 128;
            return i12 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.ShareDataUIState, localProfileInfo.ShareDataUIState)) {
            return true;
        }
        int i13 = toString + 115;
        equals = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        String str = this.copy;
        if (str == null) {
            int i2 = toString + 65;
            equals = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.getAsAtTimestamp;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i4 = toString + 49;
            equals = i4 % 128;
            int i5 = i4 % 2;
        }
        String str3 = this.component1;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.copydefault;
        if (str4 == null) {
            int i6 = equals + 97;
            toString = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = str4.hashCode();
        }
        String str5 = this.component3;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.getRequestBeneficiariesState;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.component4;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.component2;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.ShareDataUIState;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode4) * 31) + iHashCode3) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalProfileInfo(role=" + this.copy + ", qrCode=" + this.getAsAtTimestamp + ", name=" + this.component1 + ", identityId=" + this.copydefault + ", avatar=" + this.component3 + ", showMsisdn=" + this.getRequestBeneficiariesState + ", shortCode=" + this.component4 + ", operatorCode=" + this.component2 + ", preferredCurrency=" + this.ShareDataUIState + ")";
        int i2 = toString + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
