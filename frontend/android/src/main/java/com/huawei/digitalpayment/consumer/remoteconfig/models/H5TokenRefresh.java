package com.huawei.digitalpayment.consumer.remoteconfig.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/models/H5TokenRefresh;", "Landroid/os/Parcelable;", "authLimit", "", "tokenRefreshPeriod", "", "<init>", "(Ljava/lang/String;I)V", "getAuthLimit", "()Ljava/lang/String;", "getTokenRefreshPeriod", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class H5TokenRefresh implements Parcelable {
    public static final Parcelable.Creator<H5TokenRefresh> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("authLimit")
    private final String authLimit;

    @SerializedName("tokenRefreshPeriod")
    private final int tokenRefreshPeriod;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<H5TokenRefresh> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final H5TokenRefresh createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            H5TokenRefresh h5TokenRefresh = new H5TokenRefresh(parcel.readString(), parcel.readInt());
            int i2 = ShareDataUIState + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return h5TokenRefresh;
        }

        @Override
        public H5TokenRefresh createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final H5TokenRefresh[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 17;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            H5TokenRefresh[] h5TokenRefreshArr = new H5TokenRefresh[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 91;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return h5TokenRefreshArr;
        }

        @Override
        public H5TokenRefresh[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 15;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            H5TokenRefresh[] h5TokenRefreshArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 33;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return h5TokenRefreshArrNewArray;
        }
    }

    public H5TokenRefresh(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.authLimit = str;
        this.tokenRefreshPeriod = i;
    }

    public final String getAuthLimit() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.authLimit;
        if (i3 != 0) {
            int i4 = 84 / 0;
        }
        return str;
    }

    public final int getTokenRefreshPeriod() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = this.tokenRefreshPeriod;
        int i6 = i3 + 71;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i = component3 + 21;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static H5TokenRefresh copy$default(H5TokenRefresh h5TokenRefresh, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 35;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                str = h5TokenRefresh.authLimit;
                int i5 = 6 / 0;
            } else {
                str = h5TokenRefresh.authLimit;
            }
        }
        if ((i2 & 2) != 0) {
            int i6 = component1 + 91;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            i = h5TokenRefresh.tokenRefreshPeriod;
        }
        return h5TokenRefresh.copy(str, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.authLimit;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.tokenRefreshPeriod;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final H5TokenRefresh copy(String authLimit, int tokenRefreshPeriod) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(authLimit, "");
        H5TokenRefresh h5TokenRefresh = new H5TokenRefresh(authLimit, tokenRefreshPeriod);
        int i2 = copydefault + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return h5TokenRefresh;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.authLimit, r6.authLimit) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.component1 + 67;
        com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r5.tokenRefreshPeriod == r6.tokenRefreshPeriod) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.component1;
        r1 = r6 + 27;
        com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r1 % 128;
        r1 = r1 % 2;
        r6 = r6 + 99;
        com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if ((r6 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        r6 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
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
            int r1 = com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.component1
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r2
            int r1 = r1 % r0
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
            r1 = 70
            int r1 = r1 / r3
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r2
        L19:
            boolean r1 = r6 instanceof com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh
            if (r1 != 0) goto L1e
            return r3
        L1e:
            com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh r6 = (com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh) r6
            java.lang.String r1 = r5.authLimit
            java.lang.String r4 = r6.authLimit
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
            if (r1 != 0) goto L34
            int r6 = com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.component1
            int r6 = r6 + 67
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r1
            int r6 = r6 % r0
            return r3
        L34:
            int r1 = r5.tokenRefreshPeriod
            int r6 = r6.tokenRefreshPeriod
            if (r1 == r6) goto L50
            int r6 = com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.component1
            int r1 = r6 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r2
            int r1 = r1 % r0
            int r6 = r6 + 99
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.copydefault = r1
            int r6 = r6 % r0
            if (r6 != 0) goto L4f
            r6 = 38
            int r6 = r6 / r3
        L4f:
            return r3
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.remoteconfig.models.H5TokenRefresh.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (this.authLimit.hashCode() * 31) + Integer.hashCode(this.tokenRefreshPeriod);
        int i4 = copydefault + 87;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "H5TokenRefresh(authLimit=" + this.authLimit + ", tokenRefreshPeriod=" + this.tokenRefreshPeriod + ")";
        int i2 = copydefault + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.authLimit);
        dest.writeInt(this.tokenRefreshPeriod);
        if (i3 == 0) {
            int i4 = 11 / 0;
        }
    }
}
