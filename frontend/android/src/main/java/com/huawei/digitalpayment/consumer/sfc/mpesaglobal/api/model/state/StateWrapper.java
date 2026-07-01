package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/state/StateServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StateWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<StateWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int component3;

    @SerializedName("ServiceResponse")
    private final StateServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StateWrapper> {
        private static int component2 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateWrapper createFromParcel(Parcel parcel) {
            StateServiceResponse stateServiceResponseCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Object obj = null;
            if (parcel.readInt() == 0) {
                int i2 = component3 + 93;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 76 / 0;
                }
                stateServiceResponseCreateFromParcel = null;
            } else {
                stateServiceResponseCreateFromParcel = StateServiceResponse.CREATOR.createFromParcel(parcel);
            }
            StateWrapper stateWrapper = new StateWrapper(stateServiceResponseCreateFromParcel);
            int i4 = component3 + 89;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return stateWrapper;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public StateWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 97;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            StateWrapper stateWrapperCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 83 / 0;
            }
            return stateWrapperCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final StateWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 35;
            component2 = i3 % 128;
            StateWrapper[] stateWrapperArr = new StateWrapper[i];
            if (i3 % 2 == 0) {
                int i4 = 81 / 0;
            }
            return stateWrapperArr;
        }

        @Override
        public StateWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 85;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            StateWrapper[] stateWrapperArrNewArray = newArray(i);
            int i5 = component2 + 89;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 88 / 0;
            }
            return stateWrapperArrNewArray;
        }
    }

    public StateWrapper(StateServiceResponse stateServiceResponse) {
        this.serviceResponse = stateServiceResponse;
    }

    public final StateServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        StateServiceResponse stateServiceResponse = this.serviceResponse;
        int i5 = i3 + 53;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return stateServiceResponse;
        }
        throw null;
    }

    static {
        int i = component1 + 73;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static StateWrapper copy$default(StateWrapper stateWrapper, StateServiceResponse stateServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 33;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            stateServiceResponse = stateWrapper.serviceResponse;
            int i8 = i3 + 103;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
        }
        return stateWrapper.copy(stateServiceResponse);
    }

    public final StateServiceResponse component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        StateServiceResponse stateServiceResponse = this.serviceResponse;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return stateServiceResponse;
    }

    public final StateWrapper copy(StateServiceResponse serviceResponse) {
        int i = 2 % 2;
        StateWrapper stateWrapper = new StateWrapper(serviceResponse);
        int i2 = component2 + 101;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return stateWrapper;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2 == 0 ? 1 : 0;
        int i5 = i2 + 53;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 15;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (other instanceof StateWrapper) {
            return Intrinsics.areEqual(this.serviceResponse, ((StateWrapper) other).serviceResponse);
        }
        int i7 = i3 + 25;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        StateServiceResponse stateServiceResponse = this.serviceResponse;
        if (stateServiceResponse == null) {
            int i2 = ShareDataUIState + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = stateServiceResponse.hashCode();
        }
        int i4 = component2 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "StateWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = component2 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        StateServiceResponse stateServiceResponse = this.serviceResponse;
        if (stateServiceResponse == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        stateServiceResponse.writeToParcel(dest, flags);
        int i4 = component2 + 35;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
