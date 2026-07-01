package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceOperationsWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceOperationsWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImtServiceOperationsWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("ServiceResponse")
    private final ImtServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceOperationsWrapper> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceOperationsWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceOperationsWrapper imtServiceOperationsWrapper = new ImtServiceOperationsWrapper(ImtServiceResponse.CREATOR.createFromParcel(parcel));
            int i2 = copydefault + 95;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return imtServiceOperationsWrapper;
        }

        @Override
        public ImtServiceOperationsWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ImtServiceOperationsWrapper imtServiceOperationsWrapperCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 33 / 0;
            }
            return imtServiceOperationsWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceOperationsWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 51;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            ImtServiceOperationsWrapper[] imtServiceOperationsWrapperArr = new ImtServiceOperationsWrapper[i];
            int i6 = i3 + 55;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return imtServiceOperationsWrapperArr;
        }

        @Override
        public ImtServiceOperationsWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 67;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceOperationsWrapper[] imtServiceOperationsWrapperArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 25 / 0;
            }
            int i6 = ShareDataUIState + 99;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return imtServiceOperationsWrapperArrNewArray;
        }
    }

    public ImtServiceOperationsWrapper(ImtServiceResponse imtServiceResponse) {
        Intrinsics.checkNotNullParameter(imtServiceResponse, "");
        this.serviceResponse = imtServiceResponse;
    }

    public final ImtServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.serviceResponse;
        }
        throw null;
    }

    static {
        int i = component3 + 49;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static ImtServiceOperationsWrapper copy$default(ImtServiceOperationsWrapper imtServiceOperationsWrapper, ImtServiceResponse imtServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 23;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 123;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                ImtServiceResponse imtServiceResponse2 = imtServiceOperationsWrapper.serviceResponse;
                throw null;
            }
            imtServiceResponse = imtServiceOperationsWrapper.serviceResponse;
        }
        return imtServiceOperationsWrapper.copy(imtServiceResponse);
    }

    public final ImtServiceResponse component1() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        ImtServiceResponse imtServiceResponse = this.serviceResponse;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return imtServiceResponse;
    }

    public final ImtServiceOperationsWrapper copy(ImtServiceResponse serviceResponse) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(serviceResponse, "");
        ImtServiceOperationsWrapper imtServiceOperationsWrapper = new ImtServiceOperationsWrapper(serviceResponse);
        int i2 = component2 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return imtServiceOperationsWrapper;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (other instanceof ImtServiceOperationsWrapper) {
            return Intrinsics.areEqual(this.serviceResponse, ((ImtServiceOperationsWrapper) other).serviceResponse);
        }
        int i5 = i3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.serviceResponse.hashCode();
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceOperationsWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = component2 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        this.serviceResponse.writeToParcel(dest, flags);
        int i4 = ShareDataUIState + 81;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
