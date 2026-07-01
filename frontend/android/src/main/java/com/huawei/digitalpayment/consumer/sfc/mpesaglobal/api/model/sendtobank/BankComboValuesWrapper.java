package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesWrapper;", "Landroid/os/Parcelable;", "serviceResponse", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesServiceResponse;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesServiceResponse;)V", "getServiceResponse", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesServiceResponse;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValuesWrapper implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankComboValuesWrapper> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("ServiceResponse")
    private final BankComboValuesServiceResponse serviceResponse;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValuesWrapper> {
        private static int component1 = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesWrapper createFromParcel(Parcel parcel) {
            BankComboValuesServiceResponse bankComboValuesServiceResponseCreateFromParcel;
            int i = 2 % 2;
            int i2 = component1 + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                int i4 = component1 + 87;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                bankComboValuesServiceResponseCreateFromParcel = null;
            } else {
                bankComboValuesServiceResponseCreateFromParcel = BankComboValuesServiceResponse.CREATOR.createFromParcel(parcel);
            }
            return new BankComboValuesWrapper(bankComboValuesServiceResponseCreateFromParcel);
        }

        @Override
        public BankComboValuesWrapper createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 27;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            BankComboValuesWrapper bankComboValuesWrapperCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 19;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return bankComboValuesWrapperCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 103;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            BankComboValuesWrapper[] bankComboValuesWrapperArr = new BankComboValuesWrapper[i];
            int i6 = i4 + 69;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return bankComboValuesWrapperArr;
            }
            throw null;
        }

        @Override
        public BankComboValuesWrapper[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 39;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            BankComboValuesWrapper[] bankComboValuesWrapperArrNewArray = newArray(i);
            int i5 = component3 + 103;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 33 / 0;
            }
            return bankComboValuesWrapperArrNewArray;
        }
    }

    public BankComboValuesWrapper(BankComboValuesServiceResponse bankComboValuesServiceResponse) {
        this.serviceResponse = bankComboValuesServiceResponse;
    }

    public final BankComboValuesServiceResponse getServiceResponse() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        BankComboValuesServiceResponse bankComboValuesServiceResponse = this.serviceResponse;
        int i4 = i3 + 83;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return bankComboValuesServiceResponse;
        }
        throw null;
    }

    static {
        int i = copydefault + 61;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static BankComboValuesWrapper copy$default(BankComboValuesWrapper bankComboValuesWrapper, BankComboValuesServiceResponse bankComboValuesServiceResponse, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 69;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            bankComboValuesServiceResponse = bankComboValuesWrapper.serviceResponse;
        }
        BankComboValuesWrapper bankComboValuesWrapperCopy = bankComboValuesWrapper.copy(bankComboValuesServiceResponse);
        int i5 = ShareDataUIState + 79;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return bankComboValuesWrapperCopy;
    }

    public final BankComboValuesServiceResponse component1() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        BankComboValuesServiceResponse bankComboValuesServiceResponse = this.serviceResponse;
        int i5 = i3 + 15;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return bankComboValuesServiceResponse;
    }

    public final BankComboValuesWrapper copy(BankComboValuesServiceResponse serviceResponse) {
        int i = 2 % 2;
        BankComboValuesWrapper bankComboValuesWrapper = new BankComboValuesWrapper(serviceResponse);
        int i2 = ShareDataUIState + 29;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return bankComboValuesWrapper;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component3 = i2 % 128;
        return i2 % 2 != 0 ? 1 : 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            return i2 % 2 == 0;
        }
        if (other instanceof BankComboValuesWrapper) {
            return Intrinsics.areEqual(this.serviceResponse, ((BankComboValuesWrapper) other).serviceResponse);
        }
        int i3 = ShareDataUIState + 69;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 79;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 80 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        BankComboValuesServiceResponse bankComboValuesServiceResponse = this.serviceResponse;
        if (bankComboValuesServiceResponse != null) {
            return bankComboValuesServiceResponse.hashCode();
        }
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValuesWrapper(serviceResponse=" + this.serviceResponse + ')';
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        r5.writeInt(1);
        r1.writeToParcel(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0019, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        r5.writeInt(0);
        r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.ShareDataUIState + 19;
        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.component3 = r5 % 128;
        r5 = r5 % 2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.ShareDataUIState
            int r1 = r1 + 27
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.component3 = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 == 0) goto L1c
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesServiceResponse r1 = r4.serviceResponse
            r3 = 41
            int r3 = r3 / r2
            if (r1 != 0) goto L2d
            goto L20
        L1c:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesServiceResponse r1 = r4.serviceResponse
            if (r1 != 0) goto L2d
        L20:
            r5.writeInt(r2)
            int r5 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.ShareDataUIState
            int r5 = r5 + 19
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.component3 = r6
            int r5 = r5 % r0
            goto L34
        L2d:
            r0 = 1
            r5.writeInt(r0)
            r1.writeToParcel(r5, r6)
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank.BankComboValuesWrapper.writeToParcel(android.os.Parcel, int):void");
    }
}
