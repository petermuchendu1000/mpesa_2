package com.huawei.digitalpayment.consumer.loginModule.login.data.source.local.request;

import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.http.BaseRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/login/data/source/local/request/IdentityVerifyParams;", "Lcom/huawei/http/BaseRequestParams;", CheckIdentityActivity.ID_TYPE, "", "idNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getIdType", "()Ljava/lang/String;", "getIdNo", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IdentityVerifyParams extends BaseRequestParams {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final String idNo;
    private final String idType;

    public IdentityVerifyParams(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.idType = str;
        this.idNo = str2;
    }

    public final String getIdNo() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.idNo;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIdType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.idType;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static IdentityVerifyParams copy$default(IdentityVerifyParams identityVerifyParams, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = identityVerifyParams.idType;
        }
        if ((i & 2) != 0) {
            str2 = identityVerifyParams.idNo;
            int i5 = i3 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        return identityVerifyParams.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 85;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.idType;
            int i4 = 32 / 0;
        } else {
            str = this.idType;
        }
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.idNo;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final IdentityVerifyParams copy(String idType, String idNo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(idType, "");
        Intrinsics.checkNotNullParameter(idNo, "");
        IdentityVerifyParams identityVerifyParams = new IdentityVerifyParams(idType, idNo);
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return identityVerifyParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityVerifyParams)) {
            int i2 = ShareDataUIState + 85;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        IdentityVerifyParams identityVerifyParams = (IdentityVerifyParams) other;
        if (!Intrinsics.areEqual(this.idType, identityVerifyParams.idType)) {
            return false;
        }
        if (Intrinsics.areEqual(this.idNo, identityVerifyParams.idNo)) {
            return true;
        }
        int i4 = component2 + 75;
        ShareDataUIState = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.idType.hashCode();
        return i3 != 0 ? (iHashCode >> 107) >>> this.idNo.hashCode() : (iHashCode * 31) + this.idNo.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IdentityVerifyParams(idType=" + this.idType + ", idNo=" + this.idNo + ")";
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
