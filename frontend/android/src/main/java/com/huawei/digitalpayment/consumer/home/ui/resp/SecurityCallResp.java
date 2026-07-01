package com.huawei.digitalpayment.consumer.home.ui.resp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010$\u001a\u00020%H×\u0001J\t\u0010&\u001a\u00020\tH×\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/SecurityCallResp;", "", "checkIdentityBefore", "", "needsAuth", "needsIdentity", "requestInfo", "Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfo;", "serviceID", "", "<init>", "(ZZZLcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfo;Ljava/lang/String;)V", "getCheckIdentityBefore", "()Z", "setCheckIdentityBefore", "(Z)V", "getNeedsAuth", "setNeedsAuth", "getNeedsIdentity", "setNeedsIdentity", "getRequestInfo", "()Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfo;", "setRequestInfo", "(Lcom/huawei/digitalpayment/consumer/home/ui/resp/RequestInfo;)V", "getServiceID", "()Ljava/lang/String;", "setServiceID", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SecurityCallResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("checkIdentityBefore")
    private boolean checkIdentityBefore;

    @SerializedName("needsAuth")
    private boolean needsAuth;

    @SerializedName("needsIdentity")
    private boolean needsIdentity;

    @SerializedName("requestInfo")
    private RequestInfo requestInfo;

    @SerializedName("serviceID")
    private String serviceID;

    public SecurityCallResp(boolean z, boolean z2, boolean z3, RequestInfo requestInfo, String str) {
        Intrinsics.checkNotNullParameter(requestInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.checkIdentityBefore = z;
        this.needsAuth = z2;
        this.needsIdentity = z3;
        this.requestInfo = requestInfo;
        this.serviceID = str;
    }

    public final boolean getCheckIdentityBefore() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.checkIdentityBefore;
        int i4 = i2 + 69;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final void setCheckIdentityBefore(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.checkIdentityBefore = z;
        int i5 = i3 + 55;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getNeedsAuth() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 115;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.needsAuth;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final void setNeedsAuth(boolean z) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        this.needsAuth = z;
        int i5 = i2 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final boolean getNeedsIdentity() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.needsIdentity;
        if (i3 != 0) {
            int i4 = 37 / 0;
        }
        return z;
    }

    public final void setNeedsIdentity(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.needsIdentity = z;
        int i5 = i3 + 103;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 57 / 0;
        }
    }

    public final RequestInfo getRequestInfo() {
        RequestInfo requestInfo;
        int i = 2 % 2;
        int i2 = component3 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            requestInfo = this.requestInfo;
            int i4 = 54 / 0;
        } else {
            requestInfo = this.requestInfo;
        }
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return requestInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setRequestInfo(RequestInfo requestInfo) {
        int i = 2 % 2;
        int i2 = component3 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(requestInfo, "");
        this.requestInfo = requestInfo;
        int i4 = component3 + 79;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getServiceID() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.serviceID;
        int i5 = i3 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setServiceID(String str) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceID = str;
        int i4 = copydefault + 31;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        int i = 1 + 125;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    public static SecurityCallResp copy$default(SecurityCallResp securityCallResp, boolean z, boolean z2, boolean z3, RequestInfo requestInfo, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 43;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            z = securityCallResp.checkIdentityBefore;
            int i6 = i4 + 87;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = securityCallResp.needsAuth;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            int i8 = copydefault + 67;
            component3 = i8 % 128;
            if (i8 % 2 == 0) {
                boolean z6 = securityCallResp.needsIdentity;
                throw null;
            }
            z3 = securityCallResp.needsIdentity;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            requestInfo = securityCallResp.requestInfo;
        }
        RequestInfo requestInfo2 = requestInfo;
        if ((i & 16) != 0) {
            str = securityCallResp.serviceID;
        }
        return securityCallResp.copy(z4, z5, z7, requestInfo2, str);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.checkIdentityBefore;
        int i5 = i3 + 5;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.needsAuth;
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        return z;
    }

    public final boolean component3() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.needsIdentity;
        int i4 = i3 + 23;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final RequestInfo component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        RequestInfo requestInfo = this.requestInfo;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return requestInfo;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.serviceID;
        int i4 = i3 + 57;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final SecurityCallResp copy(boolean checkIdentityBefore, boolean needsAuth, boolean needsIdentity, RequestInfo requestInfo, String serviceID) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(requestInfo, "");
        Intrinsics.checkNotNullParameter(serviceID, "");
        SecurityCallResp securityCallResp = new SecurityCallResp(checkIdentityBefore, needsAuth, needsIdentity, requestInfo, serviceID);
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return securityCallResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 69;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SecurityCallResp)) {
            return false;
        }
        SecurityCallResp securityCallResp = (SecurityCallResp) other;
        if (this.checkIdentityBefore != securityCallResp.checkIdentityBefore || this.needsAuth != securityCallResp.needsAuth || this.needsIdentity != securityCallResp.needsIdentity) {
            return false;
        }
        if (!Intrinsics.areEqual(this.requestInfo, securityCallResp.requestInfo)) {
            int i7 = component3 + 1;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.serviceID, securityCallResp.serviceID)) {
            return true;
        }
        int i9 = component3;
        int i10 = i9 + 89;
        copydefault = i10 % 128;
        int i11 = i10 % 2;
        int i12 = i9 + 27;
        copydefault = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((Boolean.hashCode(this.checkIdentityBefore) * 31) + Boolean.hashCode(this.needsAuth)) * 31) + Boolean.hashCode(this.needsIdentity)) * 31) + this.requestInfo.hashCode()) * 31) + this.serviceID.hashCode();
        int i4 = component3 + 119;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 72 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SecurityCallResp(checkIdentityBefore=" + this.checkIdentityBefore + ", needsAuth=" + this.needsAuth + ", needsIdentity=" + this.needsIdentity + ", requestInfo=" + this.requestInfo + ", serviceID=" + this.serviceID + ")";
        int i2 = copydefault + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
