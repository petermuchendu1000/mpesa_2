package com.huawei.digitalpayment.consumer.profile.model.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteChangeProfile;", "", "customerInfo", "Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomerInfo;", "<init>", "(Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomerInfo;)V", "getCustomerInfo", "()Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomerInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteChangeProfile {
    private static int component1 = 0;
    private static int component2 = 1;
    private final RemoteCustomerInfo customerInfo;

    public RemoteChangeProfile(RemoteCustomerInfo remoteCustomerInfo) {
        Intrinsics.checkNotNullParameter(remoteCustomerInfo, "");
        this.customerInfo = remoteCustomerInfo;
    }

    public final RemoteCustomerInfo getCustomerInfo() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        RemoteCustomerInfo remoteCustomerInfo = this.customerInfo;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return remoteCustomerInfo;
    }

    public static RemoteChangeProfile copy$default(RemoteChangeProfile remoteChangeProfile, RemoteCustomerInfo remoteCustomerInfo, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 75;
        component1 = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            int i5 = i3 + 47;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            remoteCustomerInfo = remoteChangeProfile.customerInfo;
            if (i6 != 0) {
                int i7 = 38 / 0;
            }
        }
        return remoteChangeProfile.copy(remoteCustomerInfo);
    }

    public final RemoteCustomerInfo component1() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RemoteCustomerInfo remoteCustomerInfo = this.customerInfo;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteCustomerInfo;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteChangeProfile copy(RemoteCustomerInfo customerInfo) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerInfo, "");
        RemoteChangeProfile remoteChangeProfile = new RemoteChangeProfile(customerInfo);
        int i2 = component1 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteChangeProfile;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (other instanceof RemoteChangeProfile) {
            return Intrinsics.areEqual(this.customerInfo, ((RemoteChangeProfile) other).customerInfo);
        }
        int i4 = component2 + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 109;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            iHashCode = this.customerInfo.hashCode();
            int i3 = 33 / 0;
        } else {
            iHashCode = this.customerInfo.hashCode();
        }
        int i4 = component1 + 11;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteChangeProfile(customerInfo=" + this.customerInfo + ")";
        int i2 = component2 + 95;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
