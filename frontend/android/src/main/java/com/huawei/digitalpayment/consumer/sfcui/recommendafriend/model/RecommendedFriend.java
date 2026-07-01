package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.iap.ac.android.acs.plugin.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/RecommendedFriend;", "Landroid/os/Parcelable;", "name", "", "phoneNumber", "status", Keys.KEY_HEADER_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", Constants.JS_API_GET_PHONE_NUMBER, "getStatus", "getAvatarUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RecommendedFriend implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RecommendedFriend> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String avatarUrl;
    private final String name;
    private final String phoneNumber;
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendedFriend> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecommendedFriend createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RecommendedFriend recommendedFriend = new RecommendedFriend(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return recommendedFriend;
            }
            throw null;
        }

        @Override
        public RecommendedFriend createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RecommendedFriend recommendedFriendCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 75;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return recommendedFriendCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RecommendedFriend[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 121;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            RecommendedFriend[] recommendedFriendArr = new RecommendedFriend[i];
            int i6 = i3 + 29;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return recommendedFriendArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RecommendedFriend[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 91;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RecommendedFriend(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.phoneNumber = str2;
        this.status = str3;
        this.avatarUrl = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RecommendedFriend(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            int i2 = component3 + 117;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 5 / 0;
            }
            int i4 = 2 % 2;
            str4 = null;
        }
        this(str, str2, str3, str4);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.name;
        int i4 = i3 + 101;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.phoneNumber;
        int i4 = i3 + 65;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.status;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = component2 + 97;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatarUrl;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 17;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static RecommendedFriend copy$default(RecommendedFriend recommendedFriend, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = component2 + 25;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                String str5 = recommendedFriend.name;
                obj2.hashCode();
                throw null;
            }
            str = recommendedFriend.name;
        }
        if ((i & 2) != 0) {
            str2 = recommendedFriend.phoneNumber;
        }
        if ((i & 4) != 0) {
            int i4 = component2 + 51;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                String str6 = recommendedFriend.status;
                obj2.hashCode();
                throw null;
            }
            str3 = recommendedFriend.status;
        }
        if ((i & 8) != 0) {
            str4 = recommendedFriend.avatarUrl;
            int i5 = component2 + 3;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
        RecommendedFriend recommendedFriendCopy = recommendedFriend.copy(str, str2, str3, str4);
        int i7 = component2 + 95;
        component3 = i7 % 128;
        int i8 = i7 % 2;
        return recommendedFriendCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.name;
        int i4 = i2 + 71;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.phoneNumber;
            int i4 = 74 / 0;
        } else {
            str = this.phoneNumber;
        }
        int i5 = i2 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.avatarUrl;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RecommendedFriend copy(String name, String phoneNumber, String status, String avatarUrl) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(status, "");
        RecommendedFriend recommendedFriend = new RecommendedFriend(name, phoneNumber, status, avatarUrl);
        int i2 = component2 + 55;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return recommendedFriend;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 69;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 79;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof RecommendedFriend)) {
            int i3 = component2 + 121;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        RecommendedFriend recommendedFriend = (RecommendedFriend) other;
        if (!Intrinsics.areEqual(this.name, recommendedFriend.name)) {
            int i5 = component2 + 125;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.phoneNumber, recommendedFriend.phoneNumber)) {
            return Intrinsics.areEqual(this.status, recommendedFriend.status) && Intrinsics.areEqual(this.avatarUrl, recommendedFriend.avatarUrl);
        }
        int i7 = component3;
        int i8 = i7 + 47;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        int i10 = i7 + 77;
        component2 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 13;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            this.name.hashCode();
            this.phoneNumber.hashCode();
            this.status.hashCode();
            throw null;
        }
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.phoneNumber.hashCode();
        int iHashCode3 = this.status.hashCode();
        String str = this.avatarUrl;
        if (str == null) {
            i = 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i4 = component3 + 69;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 % 5;
            }
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RecommendedFriend(name=" + this.name + ", phoneNumber=" + this.phoneNumber + ", status=" + this.status + ", avatarUrl=" + this.avatarUrl + ")";
        int i2 = component3 + 93;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.status);
        dest.writeString(this.avatarUrl);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
