package com.huawei.digitalpayment.consumer.fixeddata.data.model.home4g5g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/home4g5g/Home4G5GGetAccountDetailPayload;", "Landroid/os/Parcelable;", "account", "", "<init>", "(Ljava/lang/String;)V", "getAccount", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Home4G5GGetAccountDetailPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Home4G5GGetAccountDetailPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("account")
    private final String account;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Home4G5GGetAccountDetailPayload> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountDetailPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Home4G5GGetAccountDetailPayload home4G5GGetAccountDetailPayload = new Home4G5GGetAccountDetailPayload(parcel.readString());
            int i2 = component2 + 101;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 92 / 0;
            }
            return home4G5GGetAccountDetailPayload;
        }

        @Override
        public Home4G5GGetAccountDetailPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 59;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Home4G5GGetAccountDetailPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 93;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            Home4G5GGetAccountDetailPayload[] home4G5GGetAccountDetailPayloadArr = new Home4G5GGetAccountDetailPayload[i];
            int i6 = i4 + 95;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return home4G5GGetAccountDetailPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Home4G5GGetAccountDetailPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 53;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public Home4G5GGetAccountDetailPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.account = str;
    }

    public final String getAccount() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.account;
        int i4 = i2 + 115;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = ShareDataUIState + 55;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static Home4G5GGetAccountDetailPayload copy$default(Home4G5GGetAccountDetailPayload home4G5GGetAccountDetailPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 29;
        copydefault = i4 % 128;
        int i5 = i & 1;
        if (i4 % 2 != 0 ? i5 != 0 : i5 != 0) {
            str = home4G5GGetAccountDetailPayload.account;
            int i6 = i3 + 25;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        return home4G5GGetAccountDetailPayload.copy(str);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.account;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Home4G5GGetAccountDetailPayload copy(String account) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(account, "");
        Home4G5GGetAccountDetailPayload home4G5GGetAccountDetailPayload = new Home4G5GGetAccountDetailPayload(account);
        int i2 = copydefault + 55;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return home4G5GGetAccountDetailPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 51;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 92 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 37;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof Home4G5GGetAccountDetailPayload) || !Intrinsics.areEqual(this.account, ((Home4G5GGetAccountDetailPayload) other).account)) {
            return false;
        }
        int i4 = component3 + 5;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 39;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            iHashCode = this.account.hashCode();
            int i3 = 93 / 0;
        } else {
            iHashCode = this.account.hashCode();
        }
        int i4 = copydefault + 71;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Home4G5GGetAccountDetailPayload(account=" + this.account + ")";
        int i2 = component3 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.account);
        int i4 = component3 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
