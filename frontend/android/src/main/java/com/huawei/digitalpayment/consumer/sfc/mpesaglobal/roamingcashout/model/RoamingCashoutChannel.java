package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutChannel;", "Landroid/os/Parcelable;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutChannel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RoamingCashoutChannel> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutChannel> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutChannel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            RoamingCashoutChannel roamingCashoutChannel = new RoamingCashoutChannel(parcel.readString());
            int i2 = component3 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return roamingCashoutChannel;
        }

        @Override
        public RoamingCashoutChannel createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            RoamingCashoutChannel roamingCashoutChannelCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 103;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return roamingCashoutChannelCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutChannel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 1;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            RoamingCashoutChannel[] roamingCashoutChannelArr = new RoamingCashoutChannel[i];
            int i6 = i3 + 55;
            component3 = i6 % 128;
            if (i6 % 2 == 0) {
                return roamingCashoutChannelArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public RoamingCashoutChannel[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 89;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                throw null;
            }
            RoamingCashoutChannel[] roamingCashoutChannelArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return roamingCashoutChannelArrNewArray;
        }
    }

    public RoamingCashoutChannel(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = component2 + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.name;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component1 + 75;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static RoamingCashoutChannel copy$default(RoamingCashoutChannel roamingCashoutChannel, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 89;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 117;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            str = roamingCashoutChannel.name;
        }
        RoamingCashoutChannel roamingCashoutChannelCopy = roamingCashoutChannel.copy(str);
        int i8 = copydefault + 93;
        component2 = i8 % 128;
        int i9 = i8 % 2;
        return roamingCashoutChannelCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.name;
        int i5 = i3 + 43;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return str;
    }

    public final RoamingCashoutChannel copy(String name) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        RoamingCashoutChannel roamingCashoutChannel = new RoamingCashoutChannel(name);
        int i2 = component2 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return roamingCashoutChannel;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 3;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r2 = r2 + 23;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel.copydefault = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if ((r2 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6 = null;
        r6.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.name, ((com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel) r6).name) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel.copydefault
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel.component2 = r2
            int r1 = r1 % r0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L16
            r1 = 31
            int r1 = r1 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel
            if (r1 != 0) goto L2c
            int r2 = r2 + 23
            int r6 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel.copydefault = r6
            int r2 = r2 % r0
            if (r2 == 0) goto L27
            return r4
        L27:
            r6 = 0
            r6.hashCode()
            throw r6
        L2c:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel) r6
            java.lang.String r0 = r5.name
            java.lang.String r6 = r6.name
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r6)
            if (r6 != 0) goto L39
            return r4
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model.RoamingCashoutChannel.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            this.name.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode = this.name.hashCode();
        int i3 = component2 + 103;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutChannel(name=" + this.name + ')';
        int i2 = component2 + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.name);
        int i4 = copydefault + 55;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
