package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.newspaper.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÇ\u0001J\b\u0010\u001b\u001a\u00020\u0005H\u0007J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH×\u0003J\t\u0010 \u001a\u00020\u0005H×\u0001J\t\u0010!\u001a\u00020\u0003H×\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/fragment/sfc/newspaper/model/AutoRenewProduct;", "Landroid/os/Parcelable;", Keys.KEY_HEADER_URL, "", "packageId", "", "productId", "productName", "releaseId", "startDate", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getPackageId", "()I", "getProductId", "getProductName", "getReleaseId", "getStartDate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoRenewProduct implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AutoRenewProduct> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName(Keys.KEY_HEADER_URL)
    private final String avatarUrl;

    @SerializedName("packageId")
    private final int packageId;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("releaseId")
    private final int releaseId;

    @SerializedName("startDate")
    private final String startDate;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutoRenewProduct> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AutoRenewProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AutoRenewProduct autoRenewProduct = new AutoRenewProduct(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            int i2 = ShareDataUIState + 19;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 69 / 0;
            }
            return autoRenewProduct;
        }

        @Override
        public AutoRenewProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            AutoRenewProduct autoRenewProductCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 19;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 95 / 0;
            }
            return autoRenewProductCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AutoRenewProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 65;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            AutoRenewProduct[] autoRenewProductArr = new AutoRenewProduct[i];
            int i6 = i3 + 113;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return autoRenewProductArr;
        }

        @Override
        public AutoRenewProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 15;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            AutoRenewProduct[] autoRenewProductArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 109;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 23 / 0;
            }
            return autoRenewProductArrNewArray;
        }
    }

    public AutoRenewProduct(String str, int i, String str2, String str3, int i2, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.avatarUrl = str;
        this.packageId = i;
        this.productId = str2;
        this.productName = str3;
        this.releaseId = i2;
        this.startDate = str4;
    }

    public final String getAvatarUrl() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.avatarUrl;
        int i5 = i3 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getPackageId() {
        int i = 2 % 2;
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.packageId;
        if (i3 == 0) {
            int i5 = 34 / 0;
        }
        return i4;
    }

    public final String getProductId() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.productId;
            int i4 = 54 / 0;
        } else {
            str = this.productId;
        }
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 97;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getReleaseId() {
        int i;
        int i2 = 2 % 2;
        int i3 = copydefault + 27;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 != 0) {
            i = this.releaseId;
            int i5 = 39 / 0;
        } else {
            i = this.releaseId;
        }
        int i6 = i4 + 59;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final String getStartDate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.startDate;
        int i4 = i2 + 15;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component3 + 63;
        component2 = i % 128;
        if (i % 2 != 0) {
            int i2 = 35 / 0;
        }
    }

    public static AutoRenewProduct copy$default(AutoRenewProduct autoRenewProduct, String str, int i, String str2, String str3, int i2, String str4, int i3, Object obj) {
        int i4 = 2 % 2;
        if ((i3 & 1) != 0) {
            int i5 = copydefault + 71;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str = autoRenewProduct.avatarUrl;
        }
        String str5 = str;
        if ((i3 & 2) != 0) {
            int i7 = copydefault + 115;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            i = autoRenewProduct.packageId;
        }
        int i9 = i;
        if ((i3 & 4) != 0) {
            str2 = autoRenewProduct.productId;
            int i10 = copydefault + 95;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        }
        String str6 = str2;
        if ((i3 & 8) != 0) {
            int i12 = copydefault + 33;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            str3 = autoRenewProduct.productName;
            if (i13 != 0) {
                int i14 = 63 / 0;
            }
        }
        String str7 = str3;
        if ((i3 & 16) != 0) {
            i2 = autoRenewProduct.releaseId;
        }
        int i15 = i2;
        if ((i3 & 32) != 0) {
            int i16 = copydefault + 61;
            component1 = i16 % 128;
            int i17 = i16 % 2;
            str4 = autoRenewProduct.startDate;
        }
        return autoRenewProduct.copy(str5, i9, str6, str7, i15, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.avatarUrl;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.packageId;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 39;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.productName;
            int i4 = 38 / 0;
        } else {
            str = this.productName;
        }
        int i5 = i2 + 119;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.releaseId;
        int i6 = i3 + 95;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 / 0;
        }
        return i5;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.startDate;
        int i5 = i3 + 47;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final AutoRenewProduct copy(String avatarUrl, int packageId, String productId, String productName, int releaseId, String startDate) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(avatarUrl, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(startDate, "");
        AutoRenewProduct autoRenewProduct = new AutoRenewProduct(avatarUrl, packageId, productId, productName, releaseId, startDate);
        int i2 = component1 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return autoRenewProduct;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 63;
        copydefault = i2 % 128;
        return i2 % 2 == 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutoRenewProduct)) {
            return false;
        }
        AutoRenewProduct autoRenewProduct = (AutoRenewProduct) other;
        if (!Intrinsics.areEqual(this.avatarUrl, autoRenewProduct.avatarUrl)) {
            int i2 = copydefault + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.packageId != autoRenewProduct.packageId || (!Intrinsics.areEqual(this.productId, autoRenewProduct.productId))) {
            return false;
        }
        if (Intrinsics.areEqual(this.productName, autoRenewProduct.productName)) {
            return this.releaseId == autoRenewProduct.releaseId && Intrinsics.areEqual(this.startDate, autoRenewProduct.startDate);
        }
        int i4 = copydefault + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((this.avatarUrl.hashCode() * 31) + Integer.hashCode(this.packageId)) * 31) + this.productId.hashCode()) * 31) + this.productName.hashCode()) * 31) + Integer.hashCode(this.releaseId)) * 31) + this.startDate.hashCode();
        int i4 = copydefault + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AutoRenewProduct(avatarUrl=" + this.avatarUrl + ", packageId=" + this.packageId + ", productId=" + this.productId + ", productName=" + this.productName + ", releaseId=" + this.releaseId + ", startDate=" + this.startDate + ")";
        int i2 = copydefault + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.avatarUrl);
        dest.writeInt(this.packageId);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        dest.writeInt(this.releaseId);
        dest.writeString(this.startDate);
        int i4 = component1 + 61;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
