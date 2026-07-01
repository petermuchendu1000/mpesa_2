package com.huawei.digitalpayment.consumer.remoteconfig.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/models/InAppUpdate;", "Landroid/os/Parcelable;", "updateType", "", "<init>", "(Ljava/lang/String;)V", "getUpdateType", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InAppUpdate implements Parcelable {
    public static final Parcelable.Creator<InAppUpdate> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("update_type")
    private final String updateType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InAppUpdate> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final InAppUpdate createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            InAppUpdate inAppUpdate = new InAppUpdate(parcel.readString());
            int i2 = component1 + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return inAppUpdate;
        }

        @Override
        public InAppUpdate createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            InAppUpdate inAppUpdateCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 75;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return inAppUpdateCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final InAppUpdate[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 55;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            InAppUpdate[] inAppUpdateArr = new InAppUpdate[i];
            int i6 = i4 + 75;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return inAppUpdateArr;
        }

        @Override
        public InAppUpdate[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 107;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            InAppUpdate[] inAppUpdateArrNewArray = newArray(i);
            int i4 = component1 + 49;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return inAppUpdateArrNewArray;
        }
    }

    public InAppUpdate(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.updateType = str;
    }

    public final String getUpdateType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.updateType;
        int i5 = i2 + 55;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 53;
        component2 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 101;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 85;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.updateType);
            throw null;
        }
        dest.writeString(this.updateType);
        int i4 = ShareDataUIState + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
