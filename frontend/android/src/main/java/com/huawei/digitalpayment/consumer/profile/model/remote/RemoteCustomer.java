package com.huawei.digitalpayment.consumer.profile.model.remote;

import com.huawei.digitalpayment.consumer.profile.constants.ProfileConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profile/model/remote/RemoteCustomer;", "", ProfileConstants.NICK_NAME, "", "avatar", "identityId", "msisdn", "customerLevel", "maxFreePinAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNickName", "()Ljava/lang/String;", "getAvatar", "getIdentityId", "getMsisdn", "getCustomerLevel", "getMaxFreePinAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "ConsumerProfileModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteCustomer {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final String avatar;
    private final String customerLevel;
    private final String identityId;
    private final String maxFreePinAmount;
    private final String msisdn;
    private final String nickName;

    public RemoteCustomer(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.nickName = str;
        this.avatar = str2;
        this.identityId = str3;
        this.msisdn = str4;
        this.customerLevel = str5;
        this.maxFreePinAmount = str6;
    }

    public final String getNickName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.nickName;
        int i4 = i3 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAvatar() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.avatar;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getIdentityId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.identityId;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = copydefault + 31;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        throw null;
    }

    public final String getCustomerLevel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerLevel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMaxFreePinAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.maxFreePinAmount;
        int i5 = i3 + 31;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static RemoteCustomer copy$default(RemoteCustomer remoteCustomer, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = copydefault + 97;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = remoteCustomer.nickName;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState + 93;
            int i6 = i5 % 128;
            copydefault = i6;
            int i7 = i5 % 2;
            String str9 = remoteCustomer.avatar;
            int i8 = i6 + 71;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 % 4;
            }
            str7 = str9;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            str3 = remoteCustomer.identityId;
            int i10 = ShareDataUIState + 45;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        String str10 = str3;
        if ((i & 8) != 0) {
            str4 = remoteCustomer.msisdn;
        }
        String str11 = str4;
        if ((i & 16) != 0) {
            int i12 = ShareDataUIState + 75;
            copydefault = i12 % 128;
            int i13 = i12 % 2;
            str5 = remoteCustomer.customerLevel;
        }
        String str12 = str5;
        if ((i & 32) != 0) {
            str6 = remoteCustomer.maxFreePinAmount;
        }
        return remoteCustomer.copy(str8, str7, str10, str11, str12, str6);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            str = this.nickName;
            int i4 = 6 / 0;
        } else {
            str = this.nickName;
        }
        int i5 = i3 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatar;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 45;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.identityId;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.customerLevel;
        int i5 = i2 + 101;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.maxFreePinAmount;
        int i5 = i3 + 69;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RemoteCustomer copy(String nickName, String avatar, String identityId, String msisdn, String customerLevel, String maxFreePinAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(nickName, "");
        Intrinsics.checkNotNullParameter(avatar, "");
        Intrinsics.checkNotNullParameter(identityId, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(customerLevel, "");
        Intrinsics.checkNotNullParameter(maxFreePinAmount, "");
        RemoteCustomer remoteCustomer = new RemoteCustomer(nickName, avatar, identityId, msisdn, customerLevel, maxFreePinAmount);
        int i2 = ShareDataUIState + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return remoteCustomer;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 57;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof RemoteCustomer)) {
            return false;
        }
        RemoteCustomer remoteCustomer = (RemoteCustomer) other;
        if (!Intrinsics.areEqual(this.nickName, remoteCustomer.nickName) || !Intrinsics.areEqual(this.avatar, remoteCustomer.avatar) || !Intrinsics.areEqual(this.identityId, remoteCustomer.identityId) || !Intrinsics.areEqual(this.msisdn, remoteCustomer.msisdn) || !Intrinsics.areEqual(this.customerLevel, remoteCustomer.customerLevel)) {
            return false;
        }
        if (Intrinsics.areEqual(this.maxFreePinAmount, remoteCustomer.maxFreePinAmount)) {
            return true;
        }
        int i6 = copydefault + 105;
        ShareDataUIState = i6 % 128;
        return i6 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.nickName.hashCode() * 31) + this.avatar.hashCode()) * 31) + this.identityId.hashCode()) * 31) + this.msisdn.hashCode()) * 31) + this.customerLevel.hashCode()) * 31) + this.maxFreePinAmount.hashCode();
        int i4 = ShareDataUIState + 119;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteCustomer(nickName=" + this.nickName + ", avatar=" + this.avatar + ", identityId=" + this.identityId + ", msisdn=" + this.msisdn + ", customerLevel=" + this.customerLevel + ", maxFreePinAmount=" + this.maxFreePinAmount + ")";
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
        return str;
    }
}
