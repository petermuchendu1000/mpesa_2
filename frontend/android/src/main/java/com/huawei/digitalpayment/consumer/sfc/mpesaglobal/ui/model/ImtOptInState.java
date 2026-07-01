package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\fH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtOptInState;", "Landroid/os/Parcelable;", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "<init>", "(ZZ)V", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtOptInState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ImtOptInState> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final boolean isError;
    private final boolean isLoading;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtOptInState> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState createFromParcel(android.os.Parcel r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.ShareDataUIState
                int r1 = r1 + 119
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.component1 = r2
                int r1 = r1 % r0
                java.lang.String r2 = ""
                r3 = 1
                r4 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
                if (r1 == 0) goto L1f
                int r1 = r8.readInt()
                if (r1 == 0) goto L1d
                r1 = r4
                goto L26
            L1d:
                r3 = r4
                goto L3a
            L1f:
                int r1 = r8.readInt()
                if (r1 == 0) goto L3a
                r1 = r3
            L26:
                int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.component1
                int r5 = r2 + 119
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.ShareDataUIState = r6
                int r5 = r5 % r0
                int r2 = r2 + r3
                int r5 = r2 % 128
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.ShareDataUIState = r5
                int r2 = r2 % r0
                if (r2 != 0) goto L3c
                int r0 = r0 / 5
                goto L3c
            L3a:
                r1 = r3
                r3 = r4
            L3c:
                int r8 = r8.readInt()
                if (r8 == 0) goto L43
                r4 = r1
            L43:
                com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState r8 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState
                r8.<init>(r3, r4)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState");
        }

        @Override
        public ImtOptInState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 119;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtOptInState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 93;
            ShareDataUIState = i3 % 128;
            ImtOptInState[] imtOptInStateArr = new ImtOptInState[i];
            if (i3 % 2 != 0) {
                return imtOptInStateArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ImtOptInState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 17;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            ImtOptInState[] imtOptInStateArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 21 / 0;
            }
            return imtOptInStateArrNewArray;
        }
    }

    public ImtOptInState(boolean z, boolean z2) {
        this.isLoading = z;
        this.isError = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImtOptInState(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 79;
            component1 = i2 % 128;
            z = i2 % 2 == 0;
        }
        if ((i & 2) != 0) {
            int i3 = component1 + 97;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            z2 = false;
        }
        this(z, z2);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isLoading;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 83 / 0;
        }
        return z;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isError;
        int i4 = i2 + 1;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    static {
        int i = component3 + 79;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImtOptInState() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static ImtOptInState copy$default(ImtOptInState imtOptInState, boolean z, boolean z2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 29;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 15;
            int i7 = i6 % 128;
            ShareDataUIState = i7;
            int i8 = i6 % 2;
            boolean z3 = imtOptInState.isLoading;
            int i9 = i7 + 35;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            z = z3;
        }
        if ((i & 2) != 0) {
            z2 = imtOptInState.isError;
        }
        return imtOptInState.copy(z, z2);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.isLoading;
        int i5 = i3 + 31;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return z;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isError;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ImtOptInState copy(boolean isLoading, boolean isError) {
        int i = 2 % 2;
        ImtOptInState imtOptInState = new ImtOptInState(isLoading, isError);
        int i2 = ShareDataUIState + 99;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return imtOptInState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 89;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof ImtOptInState)) {
            return false;
        }
        ImtOptInState imtOptInState = (ImtOptInState) other;
        return this.isLoading == imtOptInState.isLoading && this.isError == imtOptInState.isError;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isError);
        int i4 = component1 + 49;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtOptInState(isLoading=" + this.isLoading + ", isError=" + this.isError + ')';
        int i2 = component1 + 121;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isError ? 1 : 0);
        int i4 = ShareDataUIState + 111;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }
}
