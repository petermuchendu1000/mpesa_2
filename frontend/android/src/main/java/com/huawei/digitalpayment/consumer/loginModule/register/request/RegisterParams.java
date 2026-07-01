package com.huawei.digitalpayment.consumer.loginModule.register.request;

import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.http.BaseRequestParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/register/request/RegisterParams;", "Lcom/huawei/http/BaseRequestParams;", "name", "", CheckIdentityActivity.ID_TYPE, CheckIdentityActivity.ID_NUMBER, "extProperties", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getIdType", "getIdNumber", "getExtProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RegisterParams extends BaseRequestParams {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Map<String, Object> extProperties;
    private final String idNumber;
    private final String idType;
    private final String name;

    public final String getName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        throw null;
    }

    public final String getIdType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.idType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.idNumber;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Object> getExtProperties() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Object> map = this.extProperties;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public RegisterParams(String str, String str2, String str3, Map<String, ? extends Object> map) {
        this.name = str;
        this.idType = str2;
        this.idNumber = str3;
        this.extProperties = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RegisterParams copy$default(RegisterParams registerParams, String str, String str2, String str3, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 39;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = registerParams.name;
        }
        if ((i & 2) != 0) {
            str2 = registerParams.idType;
        }
        if ((i & 4) != 0) {
            str3 = registerParams.idNumber;
        }
        Object obj2 = null;
        if ((i & 8) != 0) {
            int i5 = i4 + 125;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                Map<String, Object> map2 = registerParams.extProperties;
                obj2.hashCode();
                throw null;
            }
            map = registerParams.extProperties;
        }
        RegisterParams registerParamsCopy = registerParams.copy(str, str2, str3, map);
        int i6 = ShareDataUIState + 31;
        copydefault = i6 % 128;
        if (i6 % 2 != 0) {
            return registerParamsCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 107;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.idType;
        int i5 = i3 + 27;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 22 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idNumber;
        int i5 = i2 + 73;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Map<String, Object> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, Object> map = this.extProperties;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final RegisterParams copy(String name, String idType, String idNumber, Map<String, ? extends Object> extProperties) {
        int i = 2 % 2;
        RegisterParams registerParams = new RegisterParams(name, idType, idNumber, extProperties);
        int i2 = ShareDataUIState + 61;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return registerParams;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof RegisterParams)) {
            int i4 = ShareDataUIState + 27;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RegisterParams registerParams = (RegisterParams) other;
        if (!(!Intrinsics.areEqual(this.name, registerParams.name))) {
            if (Intrinsics.areEqual(this.idType, registerParams.idType)) {
                return Intrinsics.areEqual(this.idNumber, registerParams.idNumber) && Intrinsics.areEqual(this.extProperties, registerParams.extProperties);
            }
            int i6 = ShareDataUIState + 53;
            copydefault = i6 % 128;
            return i6 % 2 == 0;
        }
        int i7 = copydefault;
        int i8 = i7 + 107;
        ShareDataUIState = i8 % 128;
        boolean z = i8 % 2 != 0;
        int i9 = i7 + 109;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 77 / 0;
        }
        return z;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = copydefault + 95;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int iHashCode4 = 0;
        if (str == null) {
            int i5 = i3 + 101;
            copydefault = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.idType;
        if (str2 == null) {
            int i6 = ShareDataUIState + 1;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i8 = ShareDataUIState + 19;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        String str3 = this.idNumber;
        if (str3 == null) {
            iHashCode3 = 0;
        } else {
            iHashCode3 = str3.hashCode();
            int i10 = copydefault + 5;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        }
        Map<String, Object> map = this.extProperties;
        if (map == null) {
            int i12 = ShareDataUIState + 79;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
        } else {
            iHashCode4 = map.hashCode();
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RegisterParams(name=" + this.name + ", idType=" + this.idType + ", idNumber=" + this.idNumber + ", extProperties=" + this.extProperties + ")";
        int i2 = ShareDataUIState + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
