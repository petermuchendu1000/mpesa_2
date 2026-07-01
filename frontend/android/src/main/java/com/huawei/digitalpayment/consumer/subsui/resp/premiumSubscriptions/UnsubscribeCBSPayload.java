package com.huawei.digitalpayment.consumer.subsui.resp.premiumSubscriptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/subsui/resp/premiumSubscriptions/UnsubscribeCBSPayload;", "Landroid/os/Parcelable;", "productId", "", "sponsorMsisdn", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getProductId", "()Ljava/lang/String;", "getSponsorMsisdn", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcMySubscriptionsUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsubscribeCBSPayload implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UnsubscribeCBSPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("sponsorMsisdn")
    private final String sponsorMsisdn;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnsubscribeCBSPayload> {
        private static int component1 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeCBSPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            UnsubscribeCBSPayload unsubscribeCBSPayload = new UnsubscribeCBSPayload(parcel.readString(), parcel.readString());
            int i2 = component1 + 7;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return unsubscribeCBSPayload;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public UnsubscribeCBSPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            UnsubscribeCBSPayload unsubscribeCBSPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 51;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return unsubscribeCBSPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final UnsubscribeCBSPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 49;
            copydefault = i4 % 128;
            UnsubscribeCBSPayload[] unsubscribeCBSPayloadArr = new UnsubscribeCBSPayload[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 9;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 69 / 0;
            }
            return unsubscribeCBSPayloadArr;
        }

        @Override
        public UnsubscribeCBSPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 107;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            UnsubscribeCBSPayload[] unsubscribeCBSPayloadArrNewArray = newArray(i);
            int i5 = copydefault + 117;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 1 / 0;
            }
            return unsubscribeCBSPayloadArrNewArray;
        }
    }

    public UnsubscribeCBSPayload(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.productId = str;
        this.sponsorMsisdn = str2;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getSponsorMsisdn() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 99;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.sponsorMsisdn;
        int i4 = i2 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component2 + 51;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static UnsubscribeCBSPayload copy$default(UnsubscribeCBSPayload unsubscribeCBSPayload, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 115;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            str = unsubscribeCBSPayload.productId;
        }
        if ((i & 2) != 0) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 65;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            String str3 = unsubscribeCBSPayload.sponsorMsisdn;
            int i8 = i5 + 47;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            str2 = str3;
        }
        return unsubscribeCBSPayload.copy(str, str2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sponsorMsisdn;
        int i5 = i2 + 87;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
        return str;
    }

    public final UnsubscribeCBSPayload copy(String productId, String sponsorMsisdn) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        UnsubscribeCBSPayload unsubscribeCBSPayload = new UnsubscribeCBSPayload(productId, sponsorMsisdn);
        int i2 = ShareDataUIState + 73;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 15 / 0;
        }
        return unsubscribeCBSPayload;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnsubscribeCBSPayload)) {
            int i2 = component3;
            int i3 = i2 + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 19;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        UnsubscribeCBSPayload unsubscribeCBSPayload = (UnsubscribeCBSPayload) other;
        if (!Intrinsics.areEqual(this.productId, unsubscribeCBSPayload.productId)) {
            int i7 = ShareDataUIState + 113;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.sponsorMsisdn, unsubscribeCBSPayload.sponsorMsisdn)) {
            int i9 = component3 + 85;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 33 / 0;
            }
            return true;
        }
        int i11 = component3 + 95;
        ShareDataUIState = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 72 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.productId.hashCode() * 31) + this.sponsorMsisdn.hashCode();
        int i4 = ShareDataUIState + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "UnsubscribeCBSPayload(productId=" + this.productId + ", sponsorMsisdn=" + this.sponsorMsisdn + ")";
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.productId);
        dest.writeString(this.sponsorMsisdn);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
