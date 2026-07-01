package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.core.GriverParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0015H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0015H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutResponse;", "Landroid/os/Parcelable;", GriverParams.ShareParams.DESC, "", "parts", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPartsResponse;", "lineItem", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutLineItem;", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPartsResponse;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutLineItem;)V", "getDesc", "()Ljava/lang/String;", "getParts", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPartsResponse;", "getLineItem", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutLineItem;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private final String desc;
    private final RoamingCashoutLineItem lineItem;
    private final RoamingCashoutPartsResponse parts;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutResponse> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutResponse roamingCashoutResponse = new RoamingCashoutResponse(parcel.readString(), RoamingCashoutPartsResponse.CREATOR.createFromParcel(parcel), RoamingCashoutLineItem.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 73;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return roamingCashoutResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RoamingCashoutResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 119;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutResponse roamingCashoutResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 59 / 0;
            }
            return roamingCashoutResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 37;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            RoamingCashoutResponse[] roamingCashoutResponseArr = new RoamingCashoutResponse[i];
            int i6 = i4 + 25;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 44 / 0;
            }
            return roamingCashoutResponseArr;
        }

        @Override
        public RoamingCashoutResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 63;
            component1 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            RoamingCashoutResponse[] roamingCashoutResponseArrNewArray = newArray(i);
            int i4 = component1 + 35;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return roamingCashoutResponseArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutResponse(String str, RoamingCashoutPartsResponse roamingCashoutPartsResponse, RoamingCashoutLineItem roamingCashoutLineItem) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roamingCashoutPartsResponse, "");
        Intrinsics.checkNotNullParameter(roamingCashoutLineItem, "");
        this.desc = str;
        this.parts = roamingCashoutPartsResponse;
        this.lineItem = roamingCashoutLineItem;
    }

    public final String getDesc() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.desc;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final RoamingCashoutPartsResponse getParts() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.parts;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutLineItem getLineItem() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutLineItem roamingCashoutLineItem = this.lineItem;
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return roamingCashoutLineItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 59;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashoutResponse copy$default(RoamingCashoutResponse roamingCashoutResponse, String str, RoamingCashoutPartsResponse roamingCashoutPartsResponse, RoamingCashoutLineItem roamingCashoutLineItem, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 11;
            int i4 = i3 % 128;
            copydefault = i4;
            int i5 = i3 % 2;
            str = roamingCashoutResponse.desc;
            int i6 = i4 + 117;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = copydefault + 61;
            component2 = i8 % 128;
            if (i8 % 2 == 0) {
                roamingCashoutPartsResponse = roamingCashoutResponse.parts;
                int i9 = 70 / 0;
            } else {
                roamingCashoutPartsResponse = roamingCashoutResponse.parts;
            }
        }
        if ((i & 4) != 0) {
            roamingCashoutLineItem = roamingCashoutResponse.lineItem;
        }
        return roamingCashoutResponse.copy(str, roamingCashoutPartsResponse, roamingCashoutLineItem);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.desc;
        int i5 = i3 + 57;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final RoamingCashoutPartsResponse component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        RoamingCashoutPartsResponse roamingCashoutPartsResponse = this.parts;
        int i4 = i2 + 25;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return roamingCashoutPartsResponse;
        }
        throw null;
    }

    public final RoamingCashoutLineItem component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 25;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutLineItem roamingCashoutLineItem = this.lineItem;
        int i5 = i2 + 35;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return roamingCashoutLineItem;
    }

    public final RoamingCashoutResponse copy(String desc, RoamingCashoutPartsResponse parts, RoamingCashoutLineItem lineItem) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(desc, "");
        Intrinsics.checkNotNullParameter(parts, "");
        Intrinsics.checkNotNullParameter(lineItem, "");
        RoamingCashoutResponse roamingCashoutResponse = new RoamingCashoutResponse(desc, parts, lineItem);
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return roamingCashoutResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2 != 0 ? 1 : 0;
        int i5 = i3 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutResponse)) {
            int i2 = component2 + 51;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RoamingCashoutResponse roamingCashoutResponse = (RoamingCashoutResponse) other;
        if (!Intrinsics.areEqual(this.desc, roamingCashoutResponse.desc) || !Intrinsics.areEqual(this.parts, roamingCashoutResponse.parts)) {
            return false;
        }
        if (Intrinsics.areEqual(this.lineItem, roamingCashoutResponse.lineItem)) {
            return true;
        }
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.desc.hashCode();
        return i3 != 0 ? (((iHashCode + 40) >> this.parts.hashCode()) + 48) << this.lineItem.hashCode() : (((iHashCode * 31) + this.parts.hashCode()) * 31) + this.lineItem.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutResponse(desc=" + this.desc + ", parts=" + this.parts + ", lineItem=" + this.lineItem + ')';
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.desc);
            this.parts.writeToParcel(dest, flags);
            this.lineItem.writeToParcel(dest, flags);
            throw null;
        }
        dest.writeString(this.desc);
        this.parts.writeToParcel(dest, flags);
        this.lineItem.writeToParcel(dest, flags);
        int i4 = component2 + 53;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
