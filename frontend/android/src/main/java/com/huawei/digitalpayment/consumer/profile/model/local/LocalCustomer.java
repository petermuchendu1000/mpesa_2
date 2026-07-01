package com.huawei.digitalpayment.consumer.profile.model.local;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalCustomer;", "Lcom/huawei/http/BaseResp;", "name", "", "avatar", "showMsisdn", "identityId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAvatar", "getShowMsisdn", "getIdentityId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalCustomer extends BaseResp {
    private static int component2 = 0;
    private static int component3 = 1;
    private final String avatar;
    private final String identityId;
    private final String name;
    private final String showMsisdn;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalCustomer(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component2 + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = component3;
            int i5 = i4 + 13;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
            int i6 = i4 + 123;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = "";
        }
        if ((i & 4) != 0) {
            int i9 = component2 + 85;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str3 = "";
        }
        if ((i & 8) != 0) {
            int i11 = component3 + 95;
            component2 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 80 / 0;
            }
            str4 = "";
        }
        this(str, str2, str3, str4);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public final String getAvatar() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            str = this.avatar;
            int i4 = 44 / 0;
        } else {
            str = this.avatar;
        }
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getShowMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.showMsisdn;
        int i5 = i2 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIdentityId() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.identityId;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public LocalCustomer(String str, String str2, String str3, String str4) {
        this.name = str;
        this.avatar = str2;
        this.showMsisdn = str3;
        this.identityId = str4;
    }

    public LocalCustomer(String str) {
        this("", str, null, null, 12, null);
    }

    public LocalCustomer() {
        this(null, null, null, null, 15, null);
    }

    public static LocalCustomer copy$default(LocalCustomer localCustomer, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 97;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            str = localCustomer.name;
            int i8 = i3 + 17;
            component3 = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i & 2) != 0) {
            int i10 = component3 + 9;
            component2 = i10 % 128;
            if (i10 % 2 != 0) {
                str2 = localCustomer.avatar;
                int i11 = 66 / 0;
            } else {
                str2 = localCustomer.avatar;
            }
        }
        if ((i & 4) != 0) {
            str3 = localCustomer.showMsisdn;
        }
        if ((i & 8) != 0) {
            int i12 = component3 + 35;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            str4 = localCustomer.identityId;
        }
        return localCustomer.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.avatar;
        int i5 = i3 + 5;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.showMsisdn;
            int i4 = 57 / 0;
        } else {
            str = this.showMsisdn;
        }
        int i5 = i2 + 81;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 35;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.identityId;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final LocalCustomer copy(String name, String avatar, String showMsisdn, String identityId) {
        int i = 2 % 2;
        LocalCustomer localCustomer = new LocalCustomer(name, avatar, showMsisdn, identityId);
        int i2 = component3 + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return localCustomer;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 115;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalCustomer)) {
            int i4 = component2 + 119;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        LocalCustomer localCustomer = (LocalCustomer) other;
        if (Intrinsics.areEqual(this.name, localCustomer.name)) {
            return Intrinsics.areEqual(this.avatar, localCustomer.avatar) && !(Intrinsics.areEqual(this.showMsisdn, localCustomer.showMsisdn) ^ true) && Intrinsics.areEqual(this.identityId, localCustomer.identityId);
        }
        int i6 = component2 + 27;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.name;
        if (str == null) {
            int i2 = component2 + 87;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 79;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component3 + 85;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str2 = this.avatar;
        if (str2 == null) {
            int i9 = component2 + 109;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.showMsisdn;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.identityId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalCustomer(name=" + this.name + ", avatar=" + this.avatar + ", showMsisdn=" + this.showMsisdn + ", identityId=" + this.identityId + ")";
        int i2 = component2 + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
