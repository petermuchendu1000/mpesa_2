package com.huawei.digitalpayment.consumer.qrcode.bean;

import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/qrcode/bean/Customer;", "", "msisdn", "", "avatar", ProfileConstants.NICK_NAME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getAvatar", "getNickName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "CustomerQRCodeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Customer {
    private static int component3 = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final String component1;
    private final String component2;

    public Customer(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = str;
        this.ShareDataUIState = str2;
        this.component1 = str3;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.ShareDataUIState;
        int i5 = i3 + 61;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 35;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getNickName() {
        int i = 2 % 2;
        int i2 = component3 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Customer copy$default(Customer customer, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = customer.component2;
        }
        if ((i & 2) != 0) {
            str2 = customer.ShareDataUIState;
        }
        if ((i & 4) != 0) {
            int i3 = copydefault;
            int i4 = i3 + 113;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            String str4 = customer.component1;
            int i6 = i3 + 119;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str3 = str4;
        }
        return customer.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.component2;
        int i4 = i3 + 51;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.ShareDataUIState;
            int i4 = 62 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i2 + 115;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 123;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Customer copy(String msisdn, String avatar, String nickName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(avatar, "");
        Intrinsics.checkNotNullParameter(nickName, "");
        Customer customer = new Customer(msisdn, avatar, nickName);
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return customer;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 15;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 91 / 0;
            }
            return true;
        }
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        if (!Intrinsics.areEqual(this.component2, customer.component2)) {
            int i4 = component3 + 29;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.ShareDataUIState, customer.ShareDataUIState)) {
            int i6 = component3 + 25;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.component1, customer.component1)) {
            return false;
        }
        int i8 = copydefault + 67;
        component3 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.component2.hashCode() * 31) + this.ShareDataUIState.hashCode()) * 31) + this.component1.hashCode();
        int i4 = copydefault + 7;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Customer(msisdn=" + this.component2 + ", avatar=" + this.ShareDataUIState + ", nickName=" + this.component1 + ")";
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }
}
