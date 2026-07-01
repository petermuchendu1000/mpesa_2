package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0011H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtCustomerStatusState;", "Landroid/os/Parcelable;", GriverMonitorConstants.KEY_IS_LOADING, "", "isError", "status", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtCustomerStatus;", "<init>", "(ZZLcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtCustomerStatus;)V", "()Z", "getStatus", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtCustomerStatus;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtCustomerStatusState implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ImtCustomerStatusState> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int copydefault = 1;
    private final boolean isError;
    private final boolean isLoading;
    private final ImtCustomerStatus status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtCustomerStatusState> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtCustomerStatusState createFromParcel(Parcel parcel) {
            boolean z;
            int i = 2 % 2;
            int i2 = component2 + 49;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            boolean z2 = true;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                if (parcel.readInt() != 0) {
                    z = false;
                } else {
                    z2 = false;
                    int i4 = component2 + 31;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    z = z2;
                    z2 = false;
                }
            } else if (parcel.readInt() != 0) {
                z = true;
            } else {
                int i42 = component2 + 31;
                ShareDataUIState = i42 % 128;
                int i52 = i42 % 2;
                z = z2;
                z2 = false;
            }
            return new ImtCustomerStatusState(z2, parcel.readInt() != 0 ? z : false, ImtCustomerStatus.CREATOR.createFromParcel(parcel));
        }

        @Override
        public ImtCustomerStatusState createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtCustomerStatusState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 105;
            ShareDataUIState = i3 % 128;
            ImtCustomerStatusState[] imtCustomerStatusStateArr = new ImtCustomerStatusState[i];
            if (i3 % 2 != 0) {
                return imtCustomerStatusStateArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public ImtCustomerStatusState[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 57;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            ImtCustomerStatusState[] imtCustomerStatusStateArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 60 / 0;
            }
            int i6 = component2 + 79;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 57 / 0;
            }
            return imtCustomerStatusStateArrNewArray;
        }
    }

    public ImtCustomerStatusState(boolean z, boolean z2, ImtCustomerStatus imtCustomerStatus) {
        Intrinsics.checkNotNullParameter(imtCustomerStatus, "");
        this.isLoading = z;
        this.isError = z2;
        this.status = imtCustomerStatus;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImtCustomerStatusState(boolean z, boolean z2, ImtCustomerStatus imtCustomerStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 97;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            z = i2 % 2 == 0;
            int i4 = i3 + 73;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        if ((i & 2) != 0) {
            int i6 = component1 + 77;
            int i7 = i6 % 128;
            ShareDataUIState = i7;
            z2 = i6 % 2 == 0;
            int i8 = i7 + 65;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
        }
        this(z, z2, (i & 4) != 0 ? ImtCustomerStatus.Unknown : imtCustomerStatus);
    }

    public final boolean isLoading() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.isLoading;
        int i4 = i2 + 99;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        obj.hashCode();
        throw null;
    }

    public final boolean isError() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = this.isError;
        if (i3 != 0) {
            int i4 = 95 / 0;
        }
        return z;
    }

    public final ImtCustomerStatus getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImtCustomerStatus imtCustomerStatus = this.status;
        int i4 = i2 + 17;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
        return imtCustomerStatus;
    }

    static {
        int i = component2 + 51;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ImtCustomerStatusState() {
        this(false, false, null, 7, null);
    }

    public static ImtCustomerStatusState copy$default(ImtCustomerStatusState imtCustomerStatusState, boolean z, boolean z2, ImtCustomerStatus imtCustomerStatus, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 47;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            z = imtCustomerStatusState.isLoading;
            int i6 = i4 + 1;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 2) != 0) {
            int i8 = i4 + 69;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            z2 = imtCustomerStatusState.isError;
            if (i9 == 0) {
                int i10 = 58 / 0;
            }
        }
        if ((i & 4) != 0) {
            imtCustomerStatus = imtCustomerStatusState.status;
            int i11 = ShareDataUIState + 35;
            component1 = i11 % 128;
            int i12 = i11 % 2;
        }
        return imtCustomerStatusState.copy(z, z2, imtCustomerStatus);
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = this.isLoading;
        int i4 = i3 + 29;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return z;
        }
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        boolean z = this.isError;
        int i5 = i3 + 7;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final ImtCustomerStatus component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        ImtCustomerStatus imtCustomerStatus = this.status;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return imtCustomerStatus;
    }

    public final ImtCustomerStatusState copy(boolean isLoading, boolean isError, ImtCustomerStatus status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(status, "");
        ImtCustomerStatusState imtCustomerStatusState = new ImtCustomerStatusState(isLoading, isError, status);
        int i2 = ShareDataUIState + 35;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return imtCustomerStatusState;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof ImtCustomerStatusState)) {
            int i4 = ShareDataUIState + 79;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        ImtCustomerStatusState imtCustomerStatusState = (ImtCustomerStatusState) other;
        if (this.isLoading != imtCustomerStatusState.isLoading || this.isError != imtCustomerStatusState.isError) {
            return false;
        }
        if (this.status == imtCustomerStatusState.status) {
            return true;
        }
        int i6 = ShareDataUIState + 103;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isError)) * 31) + this.status.hashCode();
        int i4 = component1 + 89;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtCustomerStatusState(isLoading=" + this.isLoading + ", isError=" + this.isError + ", status=" + this.status + ')';
        int i2 = component1 + 63;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.isLoading ? 1 : 0);
        dest.writeInt(this.isError ? 1 : 0);
        this.status.writeToParcel(dest, flags);
        if (i3 != 0) {
            throw null;
        }
    }
}
