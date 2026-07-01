package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÇ\u0001J\b\u0010 \u001a\u00020\u0007H\u0007J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H×\u0003J\t\u0010%\u001a\u00020\u0007H×\u0001J\t\u0010&\u001a\u00020\u0003H×\u0001J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0007H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006,"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/AvailablePlan;", "Landroid/os/Parcelable;", "postpayProductName", "", "description", "productId", FirebaseAnalytics.Param.PRICE, "", "depositTopUp", "proratedPrice", "", "customerDisplayMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIDLjava/lang/String;)V", "getPostpayProductName", "()Ljava/lang/String;", "getDescription", "getProductId", "getPrice", "()I", "getDepositTopUp", "getProratedPrice", "()D", "getCustomerDisplayMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AvailablePlan implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AvailablePlan> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("customerDisplayMessage")
    private final String customerDisplayMessage;

    @SerializedName("depositTopUp")
    private final int depositTopUp;

    @SerializedName("description")
    private final String description;

    @SerializedName("postpayProductName")
    private final String postpayProductName;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("proratedPrice")
    private final double proratedPrice;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AvailablePlan> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailablePlan createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AvailablePlan availablePlan = new AvailablePlan(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readString());
            int i2 = component2 + 103;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return availablePlan;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public AvailablePlan createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            AvailablePlan availablePlanCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return availablePlanCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AvailablePlan[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 99;
            component2 = i4 % 128;
            AvailablePlan[] availablePlanArr = new AvailablePlan[i];
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = i3 + 87;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return availablePlanArr;
        }

        @Override
        public AvailablePlan[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 49;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            AvailablePlan[] availablePlanArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 117;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return availablePlanArrNewArray;
        }
    }

    public AvailablePlan(String str, String str2, String str3, int i, int i2, double d2, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.postpayProductName = str;
        this.description = str2;
        this.productId = str3;
        this.price = i;
        this.depositTopUp = i2;
        this.proratedPrice = d2;
        this.customerDisplayMessage = str4;
    }

    public final String getPostpayProductName() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.postpayProductName;
        }
        throw null;
    }

    public final String getDescription() {
        String str;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 81;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.description;
            int i4 = 93 / 0;
        } else {
            str = this.description;
        }
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getPrice() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.price;
        if (i3 != 0) {
            int i5 = 78 / 0;
        }
        return i4;
    }

    public final int getDepositTopUp() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.depositTopUp;
        int i6 = i2 + 69;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double getProratedPrice() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.proratedPrice;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return d2;
        }
        throw null;
    }

    public final String getCustomerDisplayMessage() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.customerDisplayMessage;
        int i5 = i3 + 77;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 7;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static AvailablePlan copy$default(AvailablePlan availablePlan, String str, String str2, String str3, int i, int i2, double d2, String str4, int i3, Object obj) {
        String str5;
        String str6;
        double d3;
        int i4 = 2 % 2;
        int i5 = component1;
        int i6 = i5 + 67;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        String str7 = (i3 & 1) != 0 ? availablePlan.postpayProductName : str;
        if ((i3 & 2) != 0) {
            int i8 = i5 + 33;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                str5 = availablePlan.description;
                int i9 = 69 / 0;
            } else {
                str5 = availablePlan.description;
            }
        } else {
            str5 = str2;
        }
        if ((i3 & 4) != 0) {
            str6 = availablePlan.productId;
            int i10 = i5 + 25;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str6 = str3;
        }
        int i12 = (i3 & 8) != 0 ? availablePlan.price : i;
        int i13 = (i3 & 16) != 0 ? availablePlan.depositTopUp : i2;
        if ((i3 & 32) != 0) {
            int i14 = ShareDataUIState;
            int i15 = i14 + 43;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            d3 = availablePlan.proratedPrice;
            int i17 = i14 + 97;
            component1 = i17 % 128;
            int i18 = i17 % 2;
        } else {
            d3 = d2;
        }
        AvailablePlan availablePlanCopy = availablePlan.copy(str7, str5, str6, i12, i13, d3, (i3 & 64) != 0 ? availablePlan.customerDisplayMessage : str4);
        int i19 = ShareDataUIState + 15;
        component1 = i19 % 128;
        if (i19 % 2 == 0) {
            int i20 = 35 / 0;
        }
        return availablePlanCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.postpayProductName;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.description;
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 39;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return str;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = this.price;
        int i6 = i3 + 13;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.depositTopUp;
        int i6 = i3 + 5;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final double component6() {
        int i = 2 % 2;
        int i2 = component1 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.proratedPrice;
        }
        throw null;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.customerDisplayMessage;
            int i4 = 70 / 0;
        } else {
            str = this.customerDisplayMessage;
        }
        int i5 = i3 + 91;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AvailablePlan copy(String postpayProductName, String description, String productId, int price, int depositTopUp, double proratedPrice, String customerDisplayMessage) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(postpayProductName, "");
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(customerDisplayMessage, "");
        AvailablePlan availablePlan = new AvailablePlan(postpayProductName, description, productId, price, depositTopUp, proratedPrice, customerDisplayMessage);
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return availablePlan;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof AvailablePlan)) {
            return false;
        }
        AvailablePlan availablePlan = (AvailablePlan) other;
        if (!Intrinsics.areEqual(this.postpayProductName, availablePlan.postpayProductName) || !Intrinsics.areEqual(this.description, availablePlan.description)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, availablePlan.productId)) {
            int i4 = component1 + 107;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.price != availablePlan.price || this.depositTopUp != availablePlan.depositTopUp || Double.compare(this.proratedPrice, availablePlan.proratedPrice) != 0) {
            return false;
        }
        if (Intrinsics.areEqual(this.customerDisplayMessage, availablePlan.customerDisplayMessage)) {
            return true;
        }
        int i6 = component1 + 69;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((this.postpayProductName.hashCode() * 31) + this.description.hashCode()) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.depositTopUp)) * 31) + Double.hashCode(this.proratedPrice)) * 31) + this.customerDisplayMessage.hashCode();
        int i4 = ShareDataUIState + 51;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AvailablePlan(postpayProductName=" + this.postpayProductName + ", description=" + this.description + ", productId=" + this.productId + ", price=" + this.price + ", depositTopUp=" + this.depositTopUp + ", proratedPrice=" + this.proratedPrice + ", customerDisplayMessage=" + this.customerDisplayMessage + ")";
        int i2 = ShareDataUIState + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.postpayProductName);
        dest.writeString(this.description);
        dest.writeString(this.productId);
        dest.writeInt(this.price);
        dest.writeInt(this.depositTopUp);
        dest.writeDouble(this.proratedPrice);
        dest.writeString(this.customerDisplayMessage);
        int i4 = ShareDataUIState + 87;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
