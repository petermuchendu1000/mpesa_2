package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0016H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/RelatedSubscription;", "Landroid/os/Parcelable;", "msisdn", "", "paymentMethod", "operation", "offerDetails", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMsisdn", "()Ljava/lang/String;", "getPaymentMethod", "getOperation", "getOfferDetails", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RelatedSubscription implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RelatedSubscription> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("msisdn")
    private final String msisdn;

    @SerializedName("offerDetails")
    private final List<String> offerDetails;

    @SerializedName("operation")
    private final String operation;

    @SerializedName("paymentMethod")
    private final String paymentMethod;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RelatedSubscription> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RelatedSubscription createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RelatedSubscription relatedSubscription = new RelatedSubscription(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            int i2 = component3 + 1;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return relatedSubscription;
        }

        @Override
        public RelatedSubscription createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            RelatedSubscription relatedSubscriptionCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 119;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return relatedSubscriptionCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RelatedSubscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            int i4 = i3 % 128;
            component3 = i4;
            Object obj = null;
            RelatedSubscription[] relatedSubscriptionArr = new RelatedSubscription[i];
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 101;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return relatedSubscriptionArr;
            }
            throw null;
        }

        @Override
        public RelatedSubscription[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 27;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            RelatedSubscription[] relatedSubscriptionArrNewArray = newArray(i);
            int i5 = component2 + 69;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return relatedSubscriptionArrNewArray;
        }
    }

    public RelatedSubscription(String str, String str2, String str3, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.msisdn = str;
        this.paymentMethod = str2;
        this.operation = str3;
        this.offerDetails = list;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.msisdn;
        int i5 = i2 + 53;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPaymentMethod() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethod;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final String getOperation() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.operation;
        int i5 = i3 + 121;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final List<String> getOfferDetails() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.offerDetails;
        int i4 = i2 + 3;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
        return list;
    }

    static {
        int i = component3 + 9;
        copydefault = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RelatedSubscription copy$default(RelatedSubscription relatedSubscription, String str, String str2, String str3, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 53;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 103;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str = relatedSubscription.msisdn;
        }
        if ((i & 2) != 0) {
            int i7 = i4 + 77;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                String str4 = relatedSubscription.paymentMethod;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = relatedSubscription.paymentMethod;
        }
        if ((i & 4) != 0) {
            str3 = relatedSubscription.operation;
        }
        if ((i & 8) != 0) {
            int i8 = i4 + 29;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            list = relatedSubscription.offerDetails;
            if (i9 == 0) {
                int i10 = 36 / 0;
            }
        }
        return relatedSubscription.copy(str, str2, str3, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.msisdn;
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.paymentMethod;
        int i5 = i2 + 39;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.operation;
        int i4 = i2 + 49;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final List<String> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<String> list = this.offerDetails;
        int i4 = i2 + 73;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final RelatedSubscription copy(String msisdn, String paymentMethod, String operation, List<String> offerDetails) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(msisdn, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(operation, "");
        Intrinsics.checkNotNullParameter(offerDetails, "");
        RelatedSubscription relatedSubscription = new RelatedSubscription(msisdn, paymentMethod, operation, offerDetails);
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return relatedSubscription;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 109;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 95;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RelatedSubscription)) {
            int i4 = i2 + 83;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        RelatedSubscription relatedSubscription = (RelatedSubscription) other;
        if (Intrinsics.areEqual(this.msisdn, relatedSubscription.msisdn)) {
            return !(Intrinsics.areEqual(this.paymentMethod, relatedSubscription.paymentMethod) ^ true) && Intrinsics.areEqual(this.operation, relatedSubscription.operation) && Intrinsics.areEqual(this.offerDetails, relatedSubscription.offerDetails);
        }
        int i6 = component1 + 123;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.msisdn.hashCode() * 31) + this.paymentMethod.hashCode()) * 31) + this.operation.hashCode()) * 31) + this.offerDetails.hashCode();
        int i4 = ShareDataUIState + 23;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RelatedSubscription(msisdn=" + this.msisdn + ", paymentMethod=" + this.paymentMethod + ", operation=" + this.operation + ", offerDetails=" + this.offerDetails + ")";
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 != 0) {
            dest.writeString(this.msisdn);
            dest.writeString(this.paymentMethod);
            dest.writeString(this.operation);
            dest.writeStringList(this.offerDetails);
            int i4 = 94 / 0;
        } else {
            dest.writeString(this.msisdn);
            dest.writeString(this.paymentMethod);
            dest.writeString(this.operation);
            dest.writeStringList(this.offerDetails);
        }
        int i5 = ShareDataUIState + 47;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }
}
