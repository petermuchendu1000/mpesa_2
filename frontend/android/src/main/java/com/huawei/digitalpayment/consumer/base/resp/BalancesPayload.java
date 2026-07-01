package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/BalancesPayload;", "Landroid/os/Parcelable;", "serviceIdentifier", "", "serviceIdentifierType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getServiceIdentifier", "()Ljava/lang/String;", "getServiceIdentifierType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesPayload implements Parcelable {
    public static final Parcelable.Creator<BalancesPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("serviceIdentifier")
    private final String serviceIdentifier;

    @SerializedName("serviceIdentifierType")
    private final String serviceIdentifierType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalancesPayload> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BalancesPayload balancesPayload = new BalancesPayload(parcel.readString(), parcel.readString());
            int i2 = component2 + 47;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 40 / 0;
            }
            return balancesPayload;
        }

        @Override
        public BalancesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            BalancesPayload balancesPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 65;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 45 / 0;
            }
            return balancesPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 81;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            BalancesPayload[] balancesPayloadArr = new BalancesPayload[i];
            int i6 = i3 + 83;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return balancesPayloadArr;
        }

        @Override
        public BalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 19;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BalancesPayload[] balancesPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 19;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return balancesPayloadArrNewArray;
        }
    }

    public BalancesPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.serviceIdentifier = str;
        this.serviceIdentifierType = str2;
    }

    public final String getServiceIdentifier() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.serviceIdentifier;
            int i4 = 58 / 0;
        } else {
            str = this.serviceIdentifier;
        }
        int i5 = i2 + 75;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getServiceIdentifierType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serviceIdentifierType;
        }
        throw null;
    }

    static {
        int i = copydefault + 1;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 22 / 0;
        }
    }

    public static BalancesPayload copy$default(BalancesPayload balancesPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 65;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = balancesPayload.serviceIdentifier;
            int i5 = i4 + 51;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 2) != 0) {
            str2 = balancesPayload.serviceIdentifierType;
            int i7 = ShareDataUIState + 1;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        return balancesPayload.copy(str, str2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.serviceIdentifier;
            int i4 = 27 / 0;
        } else {
            str = this.serviceIdentifier;
        }
        int i5 = i3 + 99;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.serviceIdentifierType;
        int i4 = i3 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final BalancesPayload copy(String serviceIdentifier, String serviceIdentifierType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceIdentifier, "");
        Intrinsics.checkNotNullParameter(serviceIdentifierType, "");
        BalancesPayload balancesPayload = new BalancesPayload(serviceIdentifier, serviceIdentifierType);
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return balancesPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 25;
            int i6 = i5 % 128;
            ShareDataUIState = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 53;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(other instanceof BalancesPayload)) {
            return false;
        }
        BalancesPayload balancesPayload = (BalancesPayload) other;
        if (!Intrinsics.areEqual(this.serviceIdentifier, balancesPayload.serviceIdentifier)) {
            int i10 = ShareDataUIState + 109;
            component1 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.serviceIdentifierType, balancesPayload.serviceIdentifierType)) {
            return false;
        }
        int i11 = ShareDataUIState + 113;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.serviceIdentifier.hashCode() * 31) + this.serviceIdentifierType.hashCode();
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalancesPayload(serviceIdentifier=" + this.serviceIdentifier + ", serviceIdentifierType=" + this.serviceIdentifierType + ")";
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.serviceIdentifier);
            dest.writeString(this.serviceIdentifierType);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.serviceIdentifier);
        dest.writeString(this.serviceIdentifierType);
        int i4 = component1 + 117;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
