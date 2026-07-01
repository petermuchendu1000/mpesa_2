package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.permission.PermissionConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011H\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutParts;", "Landroid/os/Parcelable;", "paymentMethod", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPaymentMethod;", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;", "<init>", "(Ljava/util/List;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;)V", "getPaymentMethod", "()Ljava/util/List;", "getRequest", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutRequest;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutParts implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutParts> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final List<RoamingCashoutPaymentMethod> paymentMethod;
    private final RoamingCashoutRequest request;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutParts> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutParts createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component3 + 23;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component3 + 9;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(RoamingCashoutPaymentMethod.CREATOR.createFromParcel(parcel));
                    i5 += 34;
                } else {
                    arrayList.add(RoamingCashoutPaymentMethod.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new RoamingCashoutParts(arrayList, RoamingCashoutRequest.CREATOR.createFromParcel(parcel));
        }

        @Override
        public RoamingCashoutParts createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 63;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutParts roamingCashoutPartsCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 29;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return roamingCashoutPartsCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutParts[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 79;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            RoamingCashoutParts[] roamingCashoutPartsArr = new RoamingCashoutParts[i];
            int i6 = i4 + 11;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 95 / 0;
            }
            return roamingCashoutPartsArr;
        }

        @Override
        public RoamingCashoutParts[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 73;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            RoamingCashoutParts[] roamingCashoutPartsArrNewArray = newArray(i);
            int i4 = component3 + 45;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return roamingCashoutPartsArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutParts(List<RoamingCashoutPaymentMethod> list, RoamingCashoutRequest roamingCashoutRequest) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(roamingCashoutRequest, "");
        this.paymentMethod = list;
        this.request = roamingCashoutRequest;
    }

    public final List<RoamingCashoutPaymentMethod> getPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<RoamingCashoutPaymentMethod> list = this.paymentMethod;
        int i4 = i2 + 89;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final RoamingCashoutRequest getRequest() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.request;
        }
        throw null;
    }

    static {
        int i = copydefault + 77;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RoamingCashoutParts copy$default(RoamingCashoutParts roamingCashoutParts, List list, RoamingCashoutRequest roamingCashoutRequest, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 11;
            int i4 = i3 % 128;
            component1 = i4;
            int i5 = i3 % 2;
            list = roamingCashoutParts.paymentMethod;
            int i6 = i4 + 7;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = component1 + 113;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            roamingCashoutRequest = roamingCashoutParts.request;
        }
        return roamingCashoutParts.copy(list, roamingCashoutRequest);
    }

    public final List<RoamingCashoutPaymentMethod> component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        List<RoamingCashoutPaymentMethod> list = this.paymentMethod;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final RoamingCashoutRequest component2() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.request;
        }
        throw null;
    }

    public final RoamingCashoutParts copy(List<RoamingCashoutPaymentMethod> paymentMethod, RoamingCashoutRequest request) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        Intrinsics.checkNotNullParameter(request, "");
        RoamingCashoutParts roamingCashoutParts = new RoamingCashoutParts(paymentMethod, request);
        int i2 = component1 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutParts;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 1;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutParts)) {
            int i5 = i3 + 123;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        RoamingCashoutParts roamingCashoutParts = (RoamingCashoutParts) other;
        if (!Intrinsics.areEqual(this.paymentMethod, roamingCashoutParts.paymentMethod)) {
            int i7 = component1 + 109;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.request, roamingCashoutParts.request)) {
            return true;
        }
        int i9 = component2 + 79;
        component1 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.paymentMethod.hashCode();
        return i3 != 0 ? (iHashCode - 117) % this.request.hashCode() : (iHashCode * 31) + this.request.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutParts(paymentMethod=" + this.paymentMethod + ", request=" + this.request + ')';
        int i2 = component2 + 15;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<RoamingCashoutPaymentMethod> list = this.paymentMethod;
        dest.writeInt(list.size());
        Iterator<RoamingCashoutPaymentMethod> it = list.iterator();
        int i4 = component1 + 93;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = component1 + 63;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
        this.request.writeToParcel(dest, flags);
    }
}
