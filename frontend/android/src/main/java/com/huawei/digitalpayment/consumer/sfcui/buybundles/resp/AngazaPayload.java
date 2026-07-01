package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/AngazaPayload;", "Landroid/os/Parcelable;", "msisdn", "", "paymentMethod", "productId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsisdn", "()Ljava/lang/String;", "getPaymentMethod", "getProductId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AngazaPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AngazaPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @SerializedName("productId")
    private final String productId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AngazaPayload> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final AngazaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            AngazaPayload angazaPayload = new AngazaPayload(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 83;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 49 / 0;
            }
            return angazaPayload;
        }

        @Override
        public AngazaPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 111;
            ShareDataUIState = i2 % 128;
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
        public final AngazaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 83;
            ShareDataUIState = i4 % 128;
            AngazaPayload[] angazaPayloadArr = new AngazaPayload[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 81;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return angazaPayloadArr;
        }

        @Override
        public AngazaPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 59;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            AngazaPayload[] angazaPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 97;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return angazaPayloadArrNewArray;
        }
    }

    public AngazaPayload(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.msisdn = str;
        this.paymentMethod = str2;
        this.productId = str3;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.paymentMethod;
        int i5 = i3 + 17;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        throw null;
    }

    static {
        int i = component2 + 69;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static AngazaPayload copy$default(AngazaPayload angazaPayload, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = angazaPayload.msisdn;
        }
        if ((i & 2) != 0) {
            str2 = angazaPayload.paymentMethod;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 43;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str3 = angazaPayload.productId;
        }
        return angazaPayload.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.msisdn;
        int i4 = i2 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.paymentMethod;
        int i4 = i3 + 17;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final AngazaPayload copy(String msisdn, String paymentMethod, String productId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(productId, "");
        AngazaPayload angazaPayload = new AngazaPayload(msisdn, paymentMethod, productId);
        int i2 = component1 + 7;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
        return angazaPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 87;
        component1 = i5 % 128;
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
            int i2 = component1 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 16 / 0;
            }
            return true;
        }
        if (!(other instanceof AngazaPayload)) {
            return false;
        }
        AngazaPayload angazaPayload = (AngazaPayload) other;
        if (!Intrinsics.areEqual(this.msisdn, angazaPayload.msisdn)) {
            return false;
        }
        if (Intrinsics.areEqual(this.paymentMethod, angazaPayload.paymentMethod)) {
            if (Intrinsics.areEqual(this.productId, angazaPayload.productId)) {
                return true;
            }
            int i4 = ShareDataUIState + 117;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        int i5 = ShareDataUIState;
        int i6 = i5 + 37;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        int i8 = i5 + 3;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 86 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.msisdn.hashCode() >>> 27) * this.paymentMethod.hashCode()) >> 123) % this.productId.hashCode() : (((this.msisdn.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + this.productId.hashCode();
        int i3 = component1 + 97;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AngazaPayload(msisdn=" + this.msisdn + ", paymentMethod=" + this.paymentMethod + ", productId=" + this.productId + ")";
        int i2 = component1 + 125;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.msisdn);
        dest.writeString(this.paymentMethod);
        dest.writeString(this.productId);
        int i4 = ShareDataUIState + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
