package com.huawei.digitalpayment.home.data.source.locaL;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalCustomer;", "", "name", "", "avatar", "showMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAvatar", "getShowMsisdn", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalCustomer {
    private static int component1 = 1;
    private static int copydefault;
    private final String avatar;
    private final String name;
    private final String showMsisdn;

    public LocalCustomer(String str, String str2, String str3) {
        this.name = str;
        this.avatar = str2;
        this.showMsisdn = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalCustomer(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            str = "";
        }
        str2 = (i & 2) != 0 ? "" : str2;
        if ((i & 4) != 0) {
            int i3 = component1 + 39;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 83;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str3 = "";
        }
        this(str, str2, str3);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 61;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String getAvatar() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            str = this.avatar;
            int i4 = 11 / 0;
        } else {
            str = this.avatar;
        }
        int i5 = i3 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getShowMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.showMsisdn;
        int i5 = i3 + 51;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LocalCustomer() {
        this(null, null, null, 7, null);
    }

    public static LocalCustomer copy$default(LocalCustomer localCustomer, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 49;
        int i4 = i3 % 128;
        copydefault = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = localCustomer.name;
            int i5 = i4 + 15;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 4;
            }
        }
        if ((i & 2) != 0) {
            str2 = localCustomer.avatar;
        }
        if ((i & 4) != 0) {
            int i7 = component1 + 117;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            str3 = localCustomer.showMsisdn;
        }
        return localCustomer.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 11;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.name;
        int i5 = i2 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatar;
        int i5 = i2 + 15;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 43;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.showMsisdn;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final LocalCustomer copy(String name, String avatar, String showMsisdn) {
        int i = 2 % 2;
        LocalCustomer localCustomer = new LocalCustomer(name, avatar, showMsisdn);
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return localCustomer;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 95;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof LocalCustomer)) {
            return false;
        }
        LocalCustomer localCustomer = (LocalCustomer) other;
        if (!Intrinsics.areEqual(this.name, localCustomer.name) || !Intrinsics.areEqual(this.avatar, localCustomer.avatar)) {
            return false;
        }
        if (Intrinsics.areEqual(this.showMsisdn, localCustomer.showMsisdn)) {
            return true;
        }
        int i6 = component1 + 9;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int i = 2 % 2;
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int iHashCode2 = 0;
        int iHashCode3 = (i2 % 2 != 0 ? (str = this.name) != null : (str = this.name) != null) ? str.hashCode() : 0;
        String str2 = this.avatar;
        if (str2 == null) {
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
            int i3 = component1 + 11;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String str3 = this.showMsisdn;
        if (str3 != null) {
            iHashCode2 = str3.hashCode();
            int i5 = copydefault + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        return (((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalCustomer(name=" + this.name + ", avatar=" + this.avatar + ", showMsisdn=" + this.showMsisdn + ")";
        int i2 = copydefault + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
