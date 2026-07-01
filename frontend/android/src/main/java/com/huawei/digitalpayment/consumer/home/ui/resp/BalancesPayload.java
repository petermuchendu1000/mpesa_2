package com.huawei.digitalpayment.consumer.home.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/resp/BalancesPayload;", "Landroid/os/Parcelable;", "serviceIdentifier", "", "serviceIdentifierType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getServiceIdentifier", "()Ljava/lang/String;", "getServiceIdentifierType", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BalancesPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("serviceIdentifier")
    private final String serviceIdentifier;

    @SerializedName("serviceIdentifierType")
    private final String serviceIdentifierType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BalancesPayload> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BalancesPayload balancesPayload = new BalancesPayload(parcel.readString(), parcel.readString());
            int i2 = component1 + 103;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return balancesPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BalancesPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BalancesPayload balancesPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 15;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return balancesPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 57;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            BalancesPayload[] balancesPayloadArr = new BalancesPayload[i];
            int i6 = i4 + 87;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 8 / 0;
            }
            return balancesPayloadArr;
        }

        @Override
        public BalancesPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 7;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            BalancesPayload[] balancesPayloadArrNewArray = newArray(i);
            int i5 = component3 + 89;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
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
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceIdentifier;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getServiceIdentifierType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serviceIdentifierType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 85;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BalancesPayload copy$default(BalancesPayload balancesPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 121;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str = balancesPayload.serviceIdentifier;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 71;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            String str3 = balancesPayload.serviceIdentifierType;
            int i8 = i5 + 27;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str2 = str3;
        }
        BalancesPayload balancesPayloadCopy = balancesPayload.copy(str, str2);
        int i10 = ShareDataUIState + 85;
        component3 = i10 % 128;
        int i11 = i10 % 2;
        return balancesPayloadCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.serviceIdentifier;
        int i5 = i2 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 13;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.serviceIdentifierType;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BalancesPayload copy(String serviceIdentifier, String serviceIdentifierType) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceIdentifier, "");
        Intrinsics.checkNotNullParameter(serviceIdentifierType, "");
        BalancesPayload balancesPayload = new BalancesPayload(serviceIdentifier, serviceIdentifierType);
        int i2 = ShareDataUIState + 45;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return balancesPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        ShareDataUIState = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component3 + 55;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0;
        }
        if (other instanceof BalancesPayload) {
            BalancesPayload balancesPayload = (BalancesPayload) other;
            return Intrinsics.areEqual(this.serviceIdentifier, balancesPayload.serviceIdentifier) && Intrinsics.areEqual(this.serviceIdentifierType, balancesPayload.serviceIdentifierType);
        }
        int i3 = ShareDataUIState + 23;
        component3 = i3 % 128;
        return i3 % 2 != 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.serviceIdentifier.hashCode();
        return i3 == 0 ? (iHashCode % 50) * this.serviceIdentifierType.hashCode() : (iHashCode * 31) + this.serviceIdentifierType.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BalancesPayload(serviceIdentifier=" + this.serviceIdentifier + ", serviceIdentifierType=" + this.serviceIdentifierType + ")";
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.serviceIdentifier);
            dest.writeString(this.serviceIdentifierType);
            throw null;
        }
        dest.writeString(this.serviceIdentifier);
        dest.writeString(this.serviceIdentifierType);
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
