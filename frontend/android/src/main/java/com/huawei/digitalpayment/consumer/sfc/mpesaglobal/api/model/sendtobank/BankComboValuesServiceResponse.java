package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.sendtobank;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceResponseHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0010H\u0007J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H×\u0003J\t\u0010\u0015\u001a\u00020\u0010H×\u0001J\t\u0010\u0016\u001a\u00020\u0017H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesServiceResponse;", "Landroid/os/Parcelable;", "responseHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "body", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesBody;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesBody;)V", "getResponseHeader", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "getBody", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/sendtobank/BankComboValuesBody;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BankComboValuesServiceResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BankComboValuesServiceResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("Body")
    private final BankComboValuesBody body;

    @SerializedName("ResponseHeader")
    private final ImtServiceResponseHeader responseHeader;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BankComboValuesServiceResponse> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesServiceResponse createFromParcel(Parcel parcel) {
            ImtServiceResponseHeader imtServiceResponseHeaderCreateFromParcel;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BankComboValuesBody bankComboValuesBodyCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                int i2 = component3 + 9;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    bankComboValuesBodyCreateFromParcel.hashCode();
                    throw null;
                }
                imtServiceResponseHeaderCreateFromParcel = null;
            } else {
                imtServiceResponseHeaderCreateFromParcel = ImtServiceResponseHeader.CREATOR.createFromParcel(parcel);
            }
            ImtServiceResponseHeader imtServiceResponseHeader = imtServiceResponseHeaderCreateFromParcel;
            if (parcel.readInt() == 0) {
                int i3 = component2;
                int i4 = i3 + 107;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 1 / 0;
                }
                int i6 = i3 + 67;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            } else {
                bankComboValuesBodyCreateFromParcel = BankComboValuesBody.CREATOR.createFromParcel(parcel);
            }
            return new BankComboValuesServiceResponse(imtServiceResponseHeader, bankComboValuesBodyCreateFromParcel);
        }

        @Override
        public BankComboValuesServiceResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 85;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BankComboValuesServiceResponse bankComboValuesServiceResponseCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 28 / 0;
            }
            int i5 = component2 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return bankComboValuesServiceResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BankComboValuesServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 19;
            int i4 = i3 % 128;
            component3 = i4;
            int i5 = i3 % 2;
            BankComboValuesServiceResponse[] bankComboValuesServiceResponseArr = new BankComboValuesServiceResponse[i];
            int i6 = i4 + 59;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                return bankComboValuesServiceResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public BankComboValuesServiceResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 73;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            BankComboValuesServiceResponse[] bankComboValuesServiceResponseArrNewArray = newArray(i);
            if (i4 != 0) {
                int i5 = 72 / 0;
            }
            int i6 = component2 + 101;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return bankComboValuesServiceResponseArrNewArray;
            }
            throw null;
        }
    }

    public BankComboValuesServiceResponse(ImtServiceResponseHeader imtServiceResponseHeader, BankComboValuesBody bankComboValuesBody) {
        this.responseHeader = imtServiceResponseHeader;
        this.body = bankComboValuesBody;
    }

    public final ImtServiceResponseHeader getResponseHeader() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.responseHeader;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final BankComboValuesBody getBody() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.body;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component3 + 105;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static BankComboValuesServiceResponse copy$default(BankComboValuesServiceResponse bankComboValuesServiceResponse, ImtServiceResponseHeader imtServiceResponseHeader, BankComboValuesBody bankComboValuesBody, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 31;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 101;
            int i7 = i6 % 128;
            component2 = i7;
            int i8 = i6 % 2;
            ImtServiceResponseHeader imtServiceResponseHeader2 = bankComboValuesServiceResponse.responseHeader;
            int i9 = i7 + 113;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            imtServiceResponseHeader = imtServiceResponseHeader2;
        }
        if ((i & 2) != 0) {
            bankComboValuesBody = bankComboValuesServiceResponse.body;
        }
        return bankComboValuesServiceResponse.copy(imtServiceResponseHeader, bankComboValuesBody);
    }

    public final ImtServiceResponseHeader component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 67;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return imtServiceResponseHeader;
    }

    public final BankComboValuesBody component2() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        BankComboValuesBody bankComboValuesBody = this.body;
        int i5 = i3 + 125;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return bankComboValuesBody;
    }

    public final BankComboValuesServiceResponse copy(ImtServiceResponseHeader responseHeader, BankComboValuesBody body) {
        int i = 2 % 2;
        BankComboValuesServiceResponse bankComboValuesServiceResponse = new BankComboValuesServiceResponse(responseHeader, body);
        int i2 = component2 + 29;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return bankComboValuesServiceResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 33;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof BankComboValuesServiceResponse)) {
            return false;
        }
        BankComboValuesServiceResponse bankComboValuesServiceResponse = (BankComboValuesServiceResponse) other;
        if (!Intrinsics.areEqual(this.responseHeader, bankComboValuesServiceResponse.responseHeader)) {
            int i4 = component1 + 43;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.body, bankComboValuesServiceResponse.body)) {
            return true;
        }
        int i6 = component1 + 79;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        if (imtServiceResponseHeader == null) {
            iHashCode = 0;
        } else {
            iHashCode = imtServiceResponseHeader.hashCode();
            int i2 = component1 + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
        }
        BankComboValuesBody bankComboValuesBody = this.body;
        int iHashCode2 = (iHashCode * 31) + (bankComboValuesBody != null ? bankComboValuesBody.hashCode() : 0);
        int i4 = component1 + 111;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "BankComboValuesServiceResponse(responseHeader=" + this.responseHeader + ", body=" + this.body + ')';
        int i2 = component2 + 47;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 67;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        ImtServiceResponseHeader imtServiceResponseHeader = this.responseHeader;
        if (imtServiceResponseHeader == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            imtServiceResponseHeader.writeToParcel(dest, flags);
        }
        BankComboValuesBody bankComboValuesBody = this.body;
        if (bankComboValuesBody != null) {
            dest.writeInt(1);
            bankComboValuesBody.writeToParcel(dest, flags);
        } else {
            int i4 = component2 + 121;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        }
    }
}
