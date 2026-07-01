package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankInputFieldsConfigServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankInputFieldsConfigWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankInputFieldsConfigWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("ServiceResponse")
    private final BankInputFieldsConfigServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankInputFieldsConfigWrapper> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponseCreateFromParcel = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 != 0) {
                parcel.readInt();
                bankInputFieldsConfigServiceResponseCreateFromParcel.hashCode();
                throw null;
            }
            if (parcel.readInt() != 0) {
                bankInputFieldsConfigServiceResponseCreateFromParcel = BankInputFieldsConfigServiceResponse.CREATOR.createFromParcel(parcel);
                int i4 = copydefault + 123;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
            return new BankInputFieldsConfigWrapper(bankInputFieldsConfigServiceResponseCreateFromParcel);
        }

        @Override
        public BankInputFieldsConfigWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            BankInputFieldsConfigWrapper bankInputFieldsConfigWrapperCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 15;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return bankInputFieldsConfigWrapperCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankInputFieldsConfigWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 19;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            BankInputFieldsConfigWrapper[] bankInputFieldsConfigWrapperArr = new BankInputFieldsConfigWrapper[i];
            int i6 = i3 + 101;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return bankInputFieldsConfigWrapperArr;
            }
            throw null;
        }

        @Override
        public BankInputFieldsConfigWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            BankInputFieldsConfigWrapper[] bankInputFieldsConfigWrapperArrNewArray = newArray(i);
            int i4 = component3 + 121;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return bankInputFieldsConfigWrapperArrNewArray;
        }
    }

    public BankInputFieldsConfigWrapper(BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse) {
        this.serviceResponse = bankInputFieldsConfigServiceResponse;
    }

    public final BankInputFieldsConfigServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse = this.serviceResponse;
        int i4 = i2 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bankInputFieldsConfigServiceResponse;
    }

    static {
        int i = ShareDataUIState + 1;
        component3 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BankInputFieldsConfigWrapper copy$default(BankInputFieldsConfigWrapper bankInputFieldsConfigWrapper, BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if ((i & 1) != 0) {
            bankInputFieldsConfigServiceResponse = bankInputFieldsConfigWrapper.serviceResponse;
        }
        BankInputFieldsConfigWrapper bankInputFieldsConfigWrapperCopy = bankInputFieldsConfigWrapper.copy(bankInputFieldsConfigServiceResponse);
        int i5 = component1 + 65;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 50 / 0;
        }
        return bankInputFieldsConfigWrapperCopy;
    }

    public final BankInputFieldsConfigServiceResponse component1() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse = this.serviceResponse;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return bankInputFieldsConfigServiceResponse;
    }

    public final BankInputFieldsConfigWrapper copy(BankInputFieldsConfigServiceResponse serviceResponse) {
        int i = 2 % 2;
        BankInputFieldsConfigWrapper bankInputFieldsConfigWrapper = new BankInputFieldsConfigWrapper(serviceResponse);
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return bankInputFieldsConfigWrapper;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BankInputFieldsConfigWrapper)) {
            int i4 = copydefault + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.serviceResponse, ((BankInputFieldsConfigWrapper) other).serviceResponse)) {
            return true;
        }
        int i6 = copydefault + 7;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse = this.serviceResponse;
        if (bankInputFieldsConfigServiceResponse == null) {
            return 0;
        }
        int iHashCode = bankInputFieldsConfigServiceResponse.hashCode();
        int i3 = component1 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankInputFieldsConfigWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        BankInputFieldsConfigServiceResponse bankInputFieldsConfigServiceResponse = this.serviceResponse;
        if (bankInputFieldsConfigServiceResponse != null) {
            dest.writeInt(1);
            bankInputFieldsConfigServiceResponse.writeToParcel(dest, flags);
            return;
        }
        int i2 = component1 + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        dest.writeInt(0);
        int i4 = component1 + 93;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }
}
