package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/UserSubDetailsPayload;", "Landroid/os/Parcelable;", "msisdn", "", "<init>", "(Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserSubDetailsPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UserSubDetailsPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserSubDetailsPayload> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserSubDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UserSubDetailsPayload userSubDetailsPayload = new UserSubDetailsPayload(parcel.readString());
            int i2 = ShareDataUIState + 123;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return userSubDetailsPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public UserSubDetailsPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 17;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            UserSubDetailsPayload userSubDetailsPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 27;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return userSubDetailsPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UserSubDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 11;
            component1 = i4 % 128;
            UserSubDetailsPayload[] userSubDetailsPayloadArr = new UserSubDetailsPayload[i];
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            int i6 = i3 + 97;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return userSubDetailsPayloadArr;
            }
            throw null;
        }

        @Override
        public UserSubDetailsPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 53;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            UserSubDetailsPayload[] userSubDetailsPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 51;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return userSubDetailsPayloadArrNewArray;
        }
    }

    public UserSubDetailsPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msisdn = str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 95;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 9;
        component1 = i % 128;
        if (i % 2 != 0) {
            int i2 = 37 / 0;
        }
    }

    public static UserSubDetailsPayload copy$default(UserSubDetailsPayload userSubDetailsPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 123;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = userSubDetailsPayload.msisdn;
                throw null;
            }
            str = userSubDetailsPayload.msisdn;
            int i7 = i3 + 85;
            component2 = i7 % 128;
            int i8 = i7 % 2;
        }
        return userSubDetailsPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final UserSubDetailsPayload copy(String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        UserSubDetailsPayload userSubDetailsPayload = new UserSubDetailsPayload(msisdn);
        int i2 = copydefault + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return userSubDetailsPayload;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 85 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 51;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(!(other instanceof UserSubDetailsPayload))) {
            return Intrinsics.areEqual(this.msisdn, ((UserSubDetailsPayload) other).msisdn);
        }
        int i8 = i2 + 111;
        int i9 = i8 % 128;
        copydefault = i9;
        int i10 = i8 % 2;
        int i11 = i9 + 1;
        component2 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 21 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 85;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.msisdn.hashCode();
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UserSubDetailsPayload(msisdn=" + this.msisdn + ")";
        int i2 = component2 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.msisdn;
        if (i3 != 0) {
            dest.writeString(str);
        } else {
            dest.writeString(str);
            int i4 = 9 / 0;
        }
    }
}
