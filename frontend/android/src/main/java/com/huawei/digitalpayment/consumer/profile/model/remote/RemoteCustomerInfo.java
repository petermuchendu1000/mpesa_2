package com.huawei.digitalpayment.consumer.profile.model.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomerInfo;", "", "customer", "Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomer;", "<init>", "(Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomer;)V", "getCustomer", "()Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomer;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteCustomerInfo {
    private static int component2 = 1;
    private static int component3;
    private final RemoteCustomer customer;

    public RemoteCustomerInfo(RemoteCustomer remoteCustomer) {
        Intrinsics.checkNotNullParameter(remoteCustomer, "");
        this.customer = remoteCustomer;
    }

    public final RemoteCustomer getCustomer() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RemoteCustomer remoteCustomer = this.customer;
        int i5 = i3 + 7;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return remoteCustomer;
    }

    public static RemoteCustomerInfo copy$default(RemoteCustomerInfo remoteCustomerInfo, RemoteCustomer remoteCustomer, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 111;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            remoteCustomer = remoteCustomerInfo.customer;
            int i6 = i3 + 101;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        }
        return remoteCustomerInfo.copy(remoteCustomer);
    }

    public final RemoteCustomer component1() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RemoteCustomerInfo copy(RemoteCustomer customer) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customer, "");
        RemoteCustomerInfo remoteCustomerInfo = new RemoteCustomerInfo(customer);
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteCustomerInfo;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof RemoteCustomerInfo) {
            return !(Intrinsics.areEqual(this.customer, ((RemoteCustomerInfo) other).customer) ^ true);
        }
        int i5 = i3 + 107;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.customer.hashCode();
        int i4 = component2 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteCustomerInfo(customer=" + this.customer + ")";
        int i2 = component2 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
