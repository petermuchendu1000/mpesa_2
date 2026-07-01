package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/FreshFridaySubscribePayloadAirtime;", "Landroid/os/Parcelable;", "accountId", "", "amount", "", "productId", "msisdn", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAccountId", "()Ljava/lang/String;", "getAmount", "()I", "getProductId", "getMsisdn", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FreshFridaySubscribePayloadAirtime implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FreshFridaySubscribePayloadAirtime> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("amount")
    private final int amount;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("productId")
    private final String productId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FreshFridaySubscribePayloadAirtime> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridaySubscribePayloadAirtime createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FreshFridaySubscribePayloadAirtime freshFridaySubscribePayloadAirtime = new FreshFridaySubscribePayloadAirtime(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = component2 + 47;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return freshFridaySubscribePayloadAirtime;
        }

        @Override
        public FreshFridaySubscribePayloadAirtime createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FreshFridaySubscribePayloadAirtime freshFridaySubscribePayloadAirtimeCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return freshFridaySubscribePayloadAirtimeCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FreshFridaySubscribePayloadAirtime[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            FreshFridaySubscribePayloadAirtime[] freshFridaySubscribePayloadAirtimeArr = new FreshFridaySubscribePayloadAirtime[i];
            int i6 = i3 + 11;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return freshFridaySubscribePayloadAirtimeArr;
        }

        @Override
        public FreshFridaySubscribePayloadAirtime[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 85;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public FreshFridaySubscribePayloadAirtime(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.amount = i;
        this.productId = str2;
        this.msisdn = str3;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.accountId;
        int i4 = i2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getAmount() {
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 37;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        if (i3 % 2 != 0) {
            i = this.amount;
            int i5 = 73 / 0;
        } else {
            i = this.amount;
        }
        int i6 = i4 + 63;
        component2 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 72 / 0;
        }
        return i;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.msisdn;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 7;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 25 / 0;
        }
    }

    public static FreshFridaySubscribePayloadAirtime copy$default(FreshFridaySubscribePayloadAirtime freshFridaySubscribePayloadAirtime, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = ShareDataUIState + 95;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str = freshFridaySubscribePayloadAirtime.accountId;
        }
        if ((i2 & 2) != 0) {
            i = freshFridaySubscribePayloadAirtime.amount;
        }
        if ((i2 & 4) != 0) {
            str2 = freshFridaySubscribePayloadAirtime.productId;
        }
        if ((i2 & 8) != 0) {
            str3 = freshFridaySubscribePayloadAirtime.msisdn;
            int i6 = ShareDataUIState + 9;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return freshFridaySubscribePayloadAirtime.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.accountId;
        int i5 = i3 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.amount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productId;
        if (i3 != 0) {
            int i4 = 42 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FreshFridaySubscribePayloadAirtime copy(String accountId, int amount, String productId, String msisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(msisdn, "");
        FreshFridaySubscribePayloadAirtime freshFridaySubscribePayloadAirtime = new FreshFridaySubscribePayloadAirtime(accountId, amount, productId, msisdn);
        int i2 = component2 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return freshFridaySubscribePayloadAirtime;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreshFridaySubscribePayloadAirtime)) {
            int i2 = ShareDataUIState + 53;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FreshFridaySubscribePayloadAirtime freshFridaySubscribePayloadAirtime = (FreshFridaySubscribePayloadAirtime) other;
        if (!Intrinsics.areEqual(this.accountId, freshFridaySubscribePayloadAirtime.accountId)) {
            return false;
        }
        if (this.amount != freshFridaySubscribePayloadAirtime.amount) {
            int i4 = ShareDataUIState + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, freshFridaySubscribePayloadAirtime.productId)) {
            return false;
        }
        if (Intrinsics.areEqual(this.msisdn, freshFridaySubscribePayloadAirtime.msisdn)) {
            return true;
        }
        int i6 = component2 + 17;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.accountId.hashCode();
        return i3 == 0 ? (((((iHashCode << 52) % Integer.hashCode(this.amount)) % 4) >> this.productId.hashCode()) >>> 32) - this.msisdn.hashCode() : (((((iHashCode * 31) + Integer.hashCode(this.amount)) * 31) + this.productId.hashCode()) * 31) + this.msisdn.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FreshFridaySubscribePayloadAirtime(accountId=" + this.accountId + ", amount=" + this.amount + ", productId=" + this.productId + ", msisdn=" + this.msisdn + ")";
        int i2 = ShareDataUIState + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        dest.writeInt(this.amount);
        dest.writeString(this.productId);
        dest.writeString(this.msisdn);
        int i4 = ShareDataUIState + 21;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
