package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010 \u001a\u00020!H×\u0001J\t\u0010\"\u001a\u00020\u0003H×\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/SecureCallRequest;", "", "deviceType", "", "identifierType", "msisdn", "pin", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/Pin;", "proxiedRequest", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedRequest;", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/home/ui/resp/Pin;Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedRequest;Ljava/lang/String;)V", "getDeviceType", "()Ljava/lang/String;", "getIdentifierType", "getMsisdn", "getPin", "()Lcom/huawei/digitalpayment/consumer/home/ui/resp/Pin;", "getProxiedRequest", "()Lcom/huawei/digitalpayment/consumer/home/ui/resp/ProxiedRequest;", "getToken", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecureCallRequest {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("deviceType")
    private final String deviceType;

    @SerializedName("identifierType")
    private final String identifierType;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("pin")
    private final Pin pin;

    @SerializedName("proxiedRequest")
    private final ProxiedRequest proxiedRequest;

    @SerializedName("token")
    private final String token;

    public SecureCallRequest(String str, String str2, String str3, Pin pin, ProxiedRequest proxiedRequest, String str4) {
        this.deviceType = str;
        this.identifierType = str2;
        this.msisdn = str3;
        this.pin = pin;
        this.proxiedRequest = proxiedRequest;
        this.token = str4;
    }

    public final String getDeviceType() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.deviceType;
        int i4 = i3 + 21;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return str;
    }

    public final String getIdentifierType() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.identifierType;
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Pin getPin() {
        Pin pin;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            pin = this.pin;
            int i4 = 86 / 0;
        } else {
            pin = this.pin;
        }
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return pin;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final ProxiedRequest getProxiedRequest() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ProxiedRequest proxiedRequest = this.proxiedRequest;
        int i5 = i3 + 109;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return proxiedRequest;
        }
        throw null;
    }

    public final String getToken() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.token;
        int i4 = i2 + 109;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = 1 + 7;
        component3 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public static SecureCallRequest copy$default(SecureCallRequest secureCallRequest, String str, String str2, String str3, Pin pin, ProxiedRequest proxiedRequest, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = secureCallRequest.deviceType;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 69;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                String str6 = secureCallRequest.identifierType;
                throw null;
            }
            str2 = secureCallRequest.identifierType;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = secureCallRequest.msisdn;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i4 = ShareDataUIState + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            pin = secureCallRequest.pin;
        }
        Pin pin2 = pin;
        if ((i & 16) != 0) {
            proxiedRequest = secureCallRequest.proxiedRequest;
        }
        ProxiedRequest proxiedRequest2 = proxiedRequest;
        if ((i & 32) != 0) {
            int i6 = ShareDataUIState + 7;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                String str9 = secureCallRequest.token;
                throw null;
            }
            str4 = secureCallRequest.token;
        }
        return secureCallRequest.copy(str5, str7, str8, pin2, proxiedRequest2, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.deviceType;
        int i4 = i2 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.identifierType;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Pin component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Pin pin = this.pin;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return pin;
    }

    public final ProxiedRequest component5() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        ProxiedRequest proxiedRequest = this.proxiedRequest;
        int i4 = i2 + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return proxiedRequest;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.token;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SecureCallRequest copy(String deviceType, String identifierType, String msisdn, Pin pin, ProxiedRequest proxiedRequest, String token) {
        int i = 2 % 2;
        SecureCallRequest secureCallRequest = new SecureCallRequest(deviceType, identifierType, msisdn, pin, proxiedRequest, token);
        int i2 = ShareDataUIState + 117;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return secureCallRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof SecureCallRequest)) {
            return false;
        }
        SecureCallRequest secureCallRequest = (SecureCallRequest) other;
        if (!Intrinsics.areEqual(this.deviceType, secureCallRequest.deviceType) || !Intrinsics.areEqual(this.identifierType, secureCallRequest.identifierType) || !Intrinsics.areEqual(this.msisdn, secureCallRequest.msisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.pin, secureCallRequest.pin)) {
            int i2 = component1 + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.proxiedRequest, secureCallRequest.proxiedRequest)) {
            return false;
        }
        if (Intrinsics.areEqual(this.token, secureCallRequest.token)) {
            int i4 = ShareDataUIState + 111;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        int i6 = component1 + 81;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.deviceType;
        int iHashCode3 = 1;
        if (str == null) {
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.identifierType;
        if (str2 == null) {
            int i3 = component1 + 37;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                iHashCode3 = 0;
            }
        } else {
            iHashCode3 = str2.hashCode();
        }
        String str3 = this.msisdn;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Pin pin = this.pin;
        if (pin == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = pin.hashCode();
            int i4 = component1 + 77;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }
        ProxiedRequest proxiedRequest = this.proxiedRequest;
        int iHashCode5 = proxiedRequest == null ? 0 : proxiedRequest.hashCode();
        String str4 = this.token;
        return (((((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecureCallRequest(deviceType=" + this.deviceType + ", identifierType=" + this.identifierType + ", msisdn=" + this.msisdn + ", pin=" + this.pin + ", proxiedRequest=" + this.proxiedRequest + ", token=" + this.token + ")";
        int i2 = component1 + 95;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
