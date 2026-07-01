package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutPaymentMethod;", "Landroid/os/Parcelable;", "channel", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutChannel;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutChannel;)V", "getChannel", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutChannel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutPaymentMethod implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutPaymentMethod> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final RoamingCashoutChannel channel;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutPaymentMethod> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutPaymentMethod createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutPaymentMethod roamingCashoutPaymentMethod = new RoamingCashoutPaymentMethod(RoamingCashoutChannel.CREATOR.createFromParcel(parcel));
            int i2 = ShareDataUIState + 109;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return roamingCashoutPaymentMethod;
        }

        @Override
        public RoamingCashoutPaymentMethod createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 53;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            RoamingCashoutPaymentMethod roamingCashoutPaymentMethodCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 13;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return roamingCashoutPaymentMethodCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutPaymentMethod[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 59;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            RoamingCashoutPaymentMethod[] roamingCashoutPaymentMethodArr = new RoamingCashoutPaymentMethod[i];
            int i6 = i4 + 83;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return roamingCashoutPaymentMethodArr;
            }
            throw null;
        }

        @Override
        public RoamingCashoutPaymentMethod[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 103;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutPaymentMethod[] roamingCashoutPaymentMethodArrNewArray = newArray(i);
            int i5 = component1 + 23;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                return roamingCashoutPaymentMethodArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public RoamingCashoutPaymentMethod(RoamingCashoutChannel roamingCashoutChannel) {
        Intrinsics.checkNotNullParameter(roamingCashoutChannel, "");
        this.channel = roamingCashoutChannel;
    }

    public final RoamingCashoutChannel getChannel() {
        RoamingCashoutChannel roamingCashoutChannel;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 51;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            roamingCashoutChannel = this.channel;
            int i4 = 93 / 0;
        } else {
            roamingCashoutChannel = this.channel;
        }
        int i5 = i2 + 61;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roamingCashoutChannel;
    }

    static {
        int i = component3 + 101;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 29 / 0;
        }
    }

    public static RoamingCashoutPaymentMethod copy$default(RoamingCashoutPaymentMethod roamingCashoutPaymentMethod, RoamingCashoutChannel roamingCashoutChannel, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 39;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                RoamingCashoutChannel roamingCashoutChannel2 = roamingCashoutPaymentMethod.channel;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            roamingCashoutChannel = roamingCashoutPaymentMethod.channel;
        }
        return roamingCashoutPaymentMethod.copy(roamingCashoutChannel);
    }

    public final RoamingCashoutChannel component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 67;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        RoamingCashoutChannel roamingCashoutChannel = this.channel;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roamingCashoutChannel;
    }

    public final RoamingCashoutPaymentMethod copy(RoamingCashoutChannel channel) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channel, "");
        RoamingCashoutPaymentMethod roamingCashoutPaymentMethod = new RoamingCashoutPaymentMethod(channel);
        int i2 = component1 + 23;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return roamingCashoutPaymentMethod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoamingCashoutPaymentMethod)) {
            int i4 = i2 + 29;
            component2 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.channel, ((RoamingCashoutPaymentMethod) other).channel)) {
            return true;
        }
        int i5 = component2 + 69;
        component1 = i5 % 128;
        return i5 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.channel.hashCode();
        int i4 = component2 + 25;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutPaymentMethod(channel=" + this.channel + ')';
        int i2 = component2 + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.channel.writeToParcel(dest, flags);
        int i4 = component2 + 83;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
    }
}
