package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ReSetPinParams;", "Lcom/huawei/http/BaseRequestParams;", CheckIdentityActivity.ID_TYPE, "", "idNo", "verifyConfig", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdType", "()Ljava/lang/String;", "getIdNo", "getVerifyConfig", "()Lcom/huawei/digitalpayment/consumer/loginModule/register/request/VerifyConfig;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReSetPinParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final String idNo;
    private final String idType;
    private final VerifyConfig verifyConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    public ReSetPinParams(String str, String str2, VerifyConfig verifyConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 4) != 0) {
            int i2 = ShareDataUIState + 99;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 != 0) {
                int i4 = 13 / 0;
            }
            int i5 = i3 + 67;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            verifyConfig = null;
        }
        this(str, str2, verifyConfig);
    }

    public final String getIdType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.idType;
        int i5 = i3 + 123;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdNo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.idNo;
        }
        throw null;
    }

    public final VerifyConfig getVerifyConfig() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 23;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        VerifyConfig verifyConfig = this.verifyConfig;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return verifyConfig;
    }

    public ReSetPinParams(String str, String str2, VerifyConfig verifyConfig) {
        this.idType = str;
        this.idNo = str2;
        this.verifyConfig = verifyConfig;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReSetPinParams(String str, String str2) {
        this(str, str2, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    public static ReSetPinParams copy$default(ReSetPinParams reSetPinParams, String str, String str2, VerifyConfig verifyConfig, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 25;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                String str3 = reSetPinParams.idType;
                throw null;
            }
            str = reSetPinParams.idType;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 15;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            str2 = reSetPinParams.idNo;
        }
        if ((i & 4) != 0) {
            int i6 = ShareDataUIState + 117;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 != 0) {
                VerifyConfig verifyConfig2 = reSetPinParams.verifyConfig;
                obj2.hashCode();
                throw null;
            }
            verifyConfig = reSetPinParams.verifyConfig;
            int i8 = i7 + 43;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        return reSetPinParams.copy(str, str2, verifyConfig);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.idType;
        }
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.idNo;
            int i4 = 88 / 0;
        } else {
            str = this.idNo;
        }
        int i5 = i2 + 69;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyConfig component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        VerifyConfig verifyConfig = this.verifyConfig;
        int i4 = i2 + 7;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return verifyConfig;
    }

    public final ReSetPinParams copy(String idType, String idNo, VerifyConfig verifyConfig) {
        int i = 2 % 2;
        ReSetPinParams reSetPinParams = new ReSetPinParams(idType, idNo, verifyConfig);
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 25 / 0;
        }
        return reSetPinParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault;
            int i3 = i2 + 45;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 57;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof ReSetPinParams)) {
            return false;
        }
        ReSetPinParams reSetPinParams = (ReSetPinParams) other;
        if (!Intrinsics.areEqual(this.idType, reSetPinParams.idType)) {
            int i7 = ShareDataUIState + 99;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.idNo, reSetPinParams.idNo)) {
            int i9 = ShareDataUIState + 113;
            copydefault = i9 % 128;
            return i9 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.verifyConfig, reSetPinParams.verifyConfig)) {
            return false;
        }
        int i10 = copydefault + 61;
        ShareDataUIState = i10 % 128;
        int i11 = i10 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.idType;
        int iHashCode3 = 0;
        if (str == null) {
            int i2 = ShareDataUIState + 25;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.idNo;
        if (str2 == null) {
            int i4 = copydefault + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        VerifyConfig verifyConfig = this.verifyConfig;
        if (verifyConfig != null) {
            iHashCode3 = verifyConfig.hashCode();
            int i6 = ShareDataUIState + 51;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + iHashCode3;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReSetPinParams(idType=" + this.idType + ", idNo=" + this.idNo + ", verifyConfig=" + this.verifyConfig + ")";
        int i2 = copydefault + 75;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
