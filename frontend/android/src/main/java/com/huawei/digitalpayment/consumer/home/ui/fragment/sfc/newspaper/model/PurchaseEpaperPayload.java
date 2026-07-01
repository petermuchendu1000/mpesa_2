package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/PurchaseEpaperPayload;", "Landroid/os/Parcelable;", "msisdn", "", "packageId", "", "releaseId", "paymentMethod", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getPackageId", "()I", "getReleaseId", "getPaymentMethod", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseEpaperPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PurchaseEpaperPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("packageId")
    private final int packageId;
    private final String paymentMethod;

    @SerializedName("releaseId")
    private final int releaseId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PurchaseEpaperPayload> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchaseEpaperPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            PurchaseEpaperPayload purchaseEpaperPayload = new PurchaseEpaperPayload(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
            int i2 = copydefault + 109;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 57 / 0;
            }
            return purchaseEpaperPayload;
        }

        @Override
        public PurchaseEpaperPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 125;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            PurchaseEpaperPayload purchaseEpaperPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 21;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 / 0;
            }
            return purchaseEpaperPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final PurchaseEpaperPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 87;
            ShareDataUIState = i3 % 128;
            PurchaseEpaperPayload[] purchaseEpaperPayloadArr = new PurchaseEpaperPayload[i];
            if (i3 % 2 != 0) {
                return purchaseEpaperPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public PurchaseEpaperPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 13;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            PurchaseEpaperPayload[] purchaseEpaperPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 57;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return purchaseEpaperPayloadArrNewArray;
            }
            throw null;
        }
    }

    public PurchaseEpaperPayload(String str, int i, int i2, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msisdn = str;
        this.packageId = i;
        this.releaseId = i2;
        this.paymentMethod = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PurchaseEpaperPayload(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 8) != 0) {
            int i4 = ShareDataUIState + 27;
            int i5 = i4 % 128;
            component1 = i5;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i6 = i5 + 7;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str2 = null;
        }
        this(str, i, i2, str2);
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 121;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getPackageId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.packageId;
        }
        throw null;
    }

    public final int getReleaseId() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.releaseId;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.paymentMethod;
        int i4 = i2 + 43;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = copydefault + 99;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static PurchaseEpaperPayload copy$default(PurchaseEpaperPayload purchaseEpaperPayload, String str, int i, int i2, String str2, int i3, Object obj) {
        int i4 = 2 % 2;
        int i5 = ShareDataUIState;
        int i6 = i5 + 9;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        if ((i3 & 1) != 0) {
            str = purchaseEpaperPayload.msisdn;
        }
        if ((i3 & 2) != 0) {
            i = purchaseEpaperPayload.packageId;
        }
        if ((i3 & 4) != 0) {
            i2 = purchaseEpaperPayload.releaseId;
        }
        if ((i3 & 8) != 0) {
            str2 = purchaseEpaperPayload.paymentMethod;
            int i8 = i5 + 1;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 3 / 2;
            }
        }
        return purchaseEpaperPayload.copy(str, i, i2, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.packageId;
        if (i3 != 0) {
            int i5 = 69 / 0;
        }
        return i4;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseId;
        int i6 = i3 + 65;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 29 / 0;
        }
        return i5;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.paymentMethod;
        int i4 = i2 + 25;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final PurchaseEpaperPayload copy(String msisdn, int packageId, int releaseId, String paymentMethod) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        PurchaseEpaperPayload purchaseEpaperPayload = new PurchaseEpaperPayload(msisdn, packageId, releaseId, paymentMethod);
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return purchaseEpaperPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseEpaperPayload)) {
            return false;
        }
        PurchaseEpaperPayload purchaseEpaperPayload = (PurchaseEpaperPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, purchaseEpaperPayload.msisdn)) {
            int i2 = ShareDataUIState + 83;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (this.packageId != purchaseEpaperPayload.packageId) {
            return false;
        }
        if (this.releaseId != purchaseEpaperPayload.releaseId) {
            int i3 = ShareDataUIState + 79;
            component1 = i3 % 128;
            return i3 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.paymentMethod, purchaseEpaperPayload.paymentMethod)) {
            return true;
        }
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 43 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int iHashCode = this.msisdn.hashCode();
        int iHashCode2 = Integer.hashCode(this.packageId);
        int iHashCode3 = Integer.hashCode(this.releaseId);
        String str = this.paymentMethod;
        if (str == null) {
            int i3 = ShareDataUIState + 11;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode4 = str.hashCode();
            int i5 = ShareDataUIState + 17;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            i = iHashCode4;
        }
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + i;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "PurchaseEpaperPayload(msisdn=" + this.msisdn + ", packageId=" + this.packageId + ", releaseId=" + this.releaseId + ", paymentMethod=" + this.paymentMethod + ")";
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeInt(this.packageId);
        dest.writeInt(this.releaseId);
        dest.writeString(this.paymentMethod);
        int i4 = component1 + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
