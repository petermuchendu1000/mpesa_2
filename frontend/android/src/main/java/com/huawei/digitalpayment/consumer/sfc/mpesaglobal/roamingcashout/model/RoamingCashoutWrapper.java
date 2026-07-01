package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutWrapper;", "Landroid/os/Parcelable;", "Response", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutResponse;)V", "getResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutWrapper> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;
    private final RoamingCashoutResponse Response;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutWrapper> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutWrapper roamingCashoutWrapper = new RoamingCashoutWrapper(RoamingCashoutResponse.CREATOR.createFromParcel(parcel));
            int i2 = component3 + 25;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 25 / 0;
            }
            return roamingCashoutWrapper;
        }

        @Override
        public RoamingCashoutWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutWrapper roamingCashoutWrapperCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 115;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return roamingCashoutWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 61;
            component2 = i3 % 128;
            RoamingCashoutWrapper[] roamingCashoutWrapperArr = new RoamingCashoutWrapper[i];
            if (i3 % 2 != 0) {
                return roamingCashoutWrapperArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RoamingCashoutWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutWrapper[] roamingCashoutWrapperArrNewArray = newArray(i);
            int i5 = component2 + 77;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return roamingCashoutWrapperArrNewArray;
            }
            throw null;
        }
    }

    public RoamingCashoutWrapper(RoamingCashoutResponse roamingCashoutResponse) {
        Intrinsics.checkNotNullParameter(roamingCashoutResponse, "");
        this.Response = roamingCashoutResponse;
    }

    public final RoamingCashoutResponse getResponse() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RoamingCashoutResponse roamingCashoutResponse = this.Response;
        int i5 = i3 + 1;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return roamingCashoutResponse;
    }

    static {
        int i = component1 + 3;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static RoamingCashoutWrapper copy$default(RoamingCashoutWrapper roamingCashoutWrapper, RoamingCashoutResponse roamingCashoutResponse, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 83;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            roamingCashoutResponse = roamingCashoutWrapper.Response;
        }
        RoamingCashoutWrapper roamingCashoutWrapperCopy = roamingCashoutWrapper.copy(roamingCashoutResponse);
        int i5 = component2 + 117;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 92 / 0;
        }
        return roamingCashoutWrapperCopy;
    }

    public final RoamingCashoutResponse component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutResponse roamingCashoutResponse = this.Response;
        int i5 = i2 + 33;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return roamingCashoutResponse;
        }
        throw null;
    }

    public final RoamingCashoutWrapper copy(RoamingCashoutResponse Response) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(Response, "");
        RoamingCashoutWrapper roamingCashoutWrapper = new RoamingCashoutWrapper(Response);
        int i2 = component2 + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutWrapper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof RoamingCashoutWrapper)) {
            int i4 = component2 + 27;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.Response, ((RoamingCashoutWrapper) other).Response)) {
            return true;
        }
        int i6 = component3 + 115;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.Response.hashCode();
        int i4 = component2 + 33;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutWrapper(Response=" + this.Response + ')';
        int i2 = component3 + 103;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        RoamingCashoutResponse roamingCashoutResponse = this.Response;
        if (i3 == 0) {
            roamingCashoutResponse.writeToParcel(dest, flags);
            return;
        }
        roamingCashoutResponse.writeToParcel(dest, flags);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
