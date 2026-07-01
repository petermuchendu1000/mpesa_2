package com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/manageAccount/FetchProfilesPayload;", "Landroid/os/Parcelable;", "ci", "", "<init>", "(Ljava/lang/String;)V", "getCi", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FetchProfilesPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FetchProfilesPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("ci")
    private final String ci;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FetchProfilesPayload> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FetchProfilesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FetchProfilesPayload fetchProfilesPayload = new FetchProfilesPayload(parcel.readString());
            int i2 = ShareDataUIState + 39;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return fetchProfilesPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FetchProfilesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 95;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FetchProfilesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            ShareDataUIState = i3 % 128;
            FetchProfilesPayload[] fetchProfilesPayloadArr = new FetchProfilesPayload[i];
            if (i3 % 2 == 0) {
                return fetchProfilesPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FetchProfilesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 7;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FetchProfilesPayload[] fetchProfilesPayloadArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 33 / 0;
            }
            return fetchProfilesPayloadArrNewArray;
        }
    }

    public FetchProfilesPayload(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ci = str;
    }

    public final String getCi() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ci;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 35;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static FetchProfilesPayload copy$default(FetchProfilesPayload fetchProfilesPayload, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 93;
        copydefault = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = fetchProfilesPayload.ci;
        }
        FetchProfilesPayload fetchProfilesPayloadCopy = fetchProfilesPayload.copy(str);
        int i4 = copydefault + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 76 / 0;
        }
        return fetchProfilesPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.ci;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return str;
    }

    public final FetchProfilesPayload copy(String ci) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(ci, "");
        FetchProfilesPayload fetchProfilesPayload = new FetchProfilesPayload(ci);
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return fetchProfilesPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 125;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 47 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchProfilesPayload)) {
            int i5 = i3 + 121;
            copydefault = i5 % 128;
            return i5 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.ci, ((FetchProfilesPayload) other).ci)) {
            return true;
        }
        int i6 = copydefault + 57;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.ci.hashCode();
        if (i3 != 0) {
            int i4 = 52 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FetchProfilesPayload(ci=" + this.ci + ")";
        int i2 = component1 + 111;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 17 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.ci);
        int i4 = component1 + 77;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 49 / 0;
        }
    }
}
