package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0018\u001a\u00020\u0005H\u0007J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH×\u0003J\t\u0010\u001d\u001a\u00020\u0005H×\u0001J\t\u0010\u001e\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridaySubscribePayloadMpesa;", "Landroid/os/Parcelable;", "accountId", "", "amount", "", "customerType", "productId", "msisdn", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAmount", "()I", "getCustomerType", "getProductId", "getMsisdn", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshFridaySubscribePayloadMpesa implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FreshFridaySubscribePayloadMpesa> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("customerType")
    private final String customerType;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("productId")
    private final String productId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshFridaySubscribePayloadMpesa> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridaySubscribePayloadMpesa createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FreshFridaySubscribePayloadMpesa freshFridaySubscribePayloadMpesa = new FreshFridaySubscribePayloadMpesa(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 21;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return freshFridaySubscribePayloadMpesa;
        }

        @Override
        public FreshFridaySubscribePayloadMpesa createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            FreshFridaySubscribePayloadMpesa freshFridaySubscribePayloadMpesaCreateFromParcel = createFromParcel(parcel);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            int i5 = ShareDataUIState + 7;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 15 / 0;
            }
            return freshFridaySubscribePayloadMpesaCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridaySubscribePayloadMpesa[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 63;
            ShareDataUIState = i3 % 128;
            FreshFridaySubscribePayloadMpesa[] freshFridaySubscribePayloadMpesaArr = new FreshFridaySubscribePayloadMpesa[i];
            if (i3 % 2 != 0) {
                return freshFridaySubscribePayloadMpesaArr;
            }
            throw null;
        }

        @Override
        public FreshFridaySubscribePayloadMpesa[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 41;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FreshFridaySubscribePayloadMpesa[] freshFridaySubscribePayloadMpesaArrNewArray = newArray(i);
            int i5 = component1 + 117;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return freshFridaySubscribePayloadMpesaArrNewArray;
        }
    }

    public FreshFridaySubscribePayloadMpesa(String str, int i, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.accountId = str;
        this.amount = i;
        this.customerType = str2;
        this.productId = str3;
        this.msisdn = str4;
    }

    public final String getAccountId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 41;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.accountId;
            int i4 = 89 / 0;
        } else {
            str = this.accountId;
        }
        int i5 = i3 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.amount;
        if (i3 != 0) {
            int i5 = 41 / 0;
        }
        return i4;
    }

    public final String getCustomerType() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.customerType;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 51;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.msisdn;
        int i5 = i3 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 121;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static FreshFridaySubscribePayloadMpesa copy$default(FreshFridaySubscribePayloadMpesa freshFridaySubscribePayloadMpesa, String str, int i, String str2, String str3, String str4, int i2, Object obj) {
        String str5;
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = freshFridaySubscribePayloadMpesa.accountId;
        }
        String str6 = str;
        if ((i2 & 2) != 0) {
            i = freshFridaySubscribePayloadMpesa.amount;
        }
        int i4 = i;
        if ((i2 & 4) != 0) {
            int i5 = component3 + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str2 = freshFridaySubscribePayloadMpesa.customerType;
        }
        String str7 = str2;
        if ((i2 & 8) != 0) {
            str3 = freshFridaySubscribePayloadMpesa.productId;
        }
        String str8 = str3;
        if ((i2 & 16) != 0) {
            int i7 = copydefault + 65;
            int i8 = i7 % 128;
            component3 = i8;
            if (i7 % 2 != 0) {
                str5 = freshFridaySubscribePayloadMpesa.msisdn;
                int i9 = 51 / 0;
            } else {
                str5 = freshFridaySubscribePayloadMpesa.msisdn;
            }
            str4 = str5;
            int i10 = i8 + 103;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return freshFridaySubscribePayloadMpesa.copy(str6, i4, str7, str8, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.amount;
        int i6 = i3 + 111;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 11 / 0;
        }
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 23;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.customerType;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 9;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 9;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i3 + 105;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final FreshFridaySubscribePayloadMpesa copy(String accountId, int amount, String customerType, String productId, String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(customerType, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        FreshFridaySubscribePayloadMpesa freshFridaySubscribePayloadMpesa = new FreshFridaySubscribePayloadMpesa(accountId, amount, customerType, productId, msisdn);
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 63 / 0;
        }
        return freshFridaySubscribePayloadMpesa;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 71;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 105;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FreshFridaySubscribePayloadMpesa)) {
            return false;
        }
        FreshFridaySubscribePayloadMpesa freshFridaySubscribePayloadMpesa = (FreshFridaySubscribePayloadMpesa) other;
        if (!Intrinsics.areEqual(this.accountId, freshFridaySubscribePayloadMpesa.accountId)) {
            int i7 = copydefault + 123;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.amount == freshFridaySubscribePayloadMpesa.amount && !(!Intrinsics.areEqual(this.customerType, freshFridaySubscribePayloadMpesa.customerType))) {
            if (Intrinsics.areEqual(this.productId, freshFridaySubscribePayloadMpesa.productId)) {
                if (Intrinsics.areEqual(this.msisdn, freshFridaySubscribePayloadMpesa.msisdn)) {
                    return true;
                }
                int i9 = component3 + 93;
                copydefault = i9 % 128;
                return i9 % 2 == 0;
            }
            int i10 = component3 + 75;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.accountId.hashCode() * 31) + Integer.hashCode(this.amount)) * 31) + this.customerType.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.msisdn.hashCode();
        int i4 = component3 + 33;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FreshFridaySubscribePayloadMpesa(accountId=" + this.accountId + ", amount=" + this.amount + ", customerType=" + this.customerType + ", productId=" + this.productId + ", msisdn=" + this.msisdn + ")";
        int i2 = copydefault + 91;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.accountId);
            dest.writeInt(this.amount);
            dest.writeString(this.customerType);
            dest.writeString(this.productId);
            dest.writeString(this.msisdn);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.accountId);
        dest.writeInt(this.amount);
        dest.writeString(this.customerType);
        dest.writeString(this.productId);
        dest.writeString(this.msisdn);
        int i4 = component3 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
