package com.huawei.digitalpayment.consumer.base.resp;

import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FavoriteContent;", "Ljava/io/Serializable;", CheckIdentityActivity.ID_NUMBER, "", "favouriteName", "accountNum", Keys.KEY_HEADER_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "getFavouriteName", "getAccountNum", "getAvatarUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FavoriteContent implements Serializable {
    private static int component2 = 1;
    private static int component3;
    private final String accountNum;
    private final String avatarUrl;
    private final String favouriteName;
    private final String idNumber;

    public FavoriteContent(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.idNumber = str;
        this.favouriteName = str2;
        this.accountNum = str3;
        this.avatarUrl = str4;
    }

    public final String getIdNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idNumber;
        int i5 = i2 + 113;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final String getFavouriteName() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.favouriteName;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return str;
    }

    public final String getAccountNum() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountNum;
        int i5 = i2 + 89;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.avatarUrl;
        int i4 = i2 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static FavoriteContent copy$default(FavoriteContent favoriteContent, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 123;
        component3 = i4 % 128;
        if (i4 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i3 + 61;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            String str5 = favoriteContent.idNumber;
            int i8 = i6 + 101;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str = str5;
        }
        if ((i & 2) != 0) {
            int i10 = component3 + 33;
            component2 = i10 % 128;
            int i11 = i10 % 2;
            str2 = favoriteContent.favouriteName;
        }
        if ((i & 4) != 0) {
            str3 = favoriteContent.accountNum;
        }
        if ((i & 8) != 0) {
            str4 = favoriteContent.avatarUrl;
        }
        FavoriteContent favoriteContentCopy = favoriteContent.copy(str, str2, str3, str4);
        int i12 = component3 + 25;
        component2 = i12 % 128;
        int i13 = i12 % 2;
        return favoriteContentCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.idNumber;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.favouriteName;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.accountNum;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.avatarUrl;
        }
        throw null;
    }

    public final FavoriteContent copy(String idNumber, String favouriteName, String accountNum, String avatarUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(idNumber, "");
        Intrinsics.checkNotNullParameter(favouriteName, "");
        Intrinsics.checkNotNullParameter(accountNum, "");
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        FavoriteContent favoriteContent = new FavoriteContent(idNumber, favouriteName, accountNum, avatarUrl);
        int i2 = component2 + 75;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return favoriteContent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteContent)) {
            int i2 = component3 + 11;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return false;
            }
            throw null;
        }
        FavoriteContent favoriteContent = (FavoriteContent) other;
        if (!Intrinsics.areEqual(this.idNumber, favoriteContent.idNumber)) {
            int i3 = component2 + 9;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.favouriteName, favoriteContent.favouriteName)) {
            return false;
        }
        if (Intrinsics.areEqual(this.accountNum, favoriteContent.accountNum)) {
            return Intrinsics.areEqual(this.avatarUrl, favoriteContent.avatarUrl);
        }
        int i5 = component3 + 81;
        component2 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 15;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.idNumber.hashCode() * 31) + this.favouriteName.hashCode()) * 31) + this.accountNum.hashCode()) * 31) + this.avatarUrl.hashCode();
        int i4 = component2 + 87;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FavoriteContent(idNumber=" + this.idNumber + ", favouriteName=" + this.favouriteName + ", accountNum=" + this.accountNum + ", avatarUrl=" + this.avatarUrl + ")";
        int i2 = component3 + 31;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
