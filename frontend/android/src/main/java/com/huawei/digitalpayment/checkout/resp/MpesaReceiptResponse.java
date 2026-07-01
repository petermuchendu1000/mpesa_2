package com.huawei.digitalpayment.checkout.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/checkout/resp/MpesaReceiptResponse;", "Landroid/os/Parcelable;", "base64Data", "", "<init>", "(Ljava/lang/String;)V", "getBase64Data", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerCheckOutUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaReceiptResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MpesaReceiptResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName("data")
    private final String base64Data;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MpesaReceiptResponse> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaReceiptResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MpesaReceiptResponse mpesaReceiptResponse = new MpesaReceiptResponse(parcel.readString());
            int i2 = component2 + 119;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return mpesaReceiptResponse;
        }

        @Override
        public MpesaReceiptResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 119;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            MpesaReceiptResponse mpesaReceiptResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 53;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return mpesaReceiptResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaReceiptResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 83;
            component2 = i4 % 128;
            MpesaReceiptResponse[] mpesaReceiptResponseArr = new MpesaReceiptResponse[i];
            if (i4 % 2 == 0) {
                int i5 = 1 / 0;
            }
            int i6 = i3 + 115;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 88 / 0;
            }
            return mpesaReceiptResponseArr;
        }

        @Override
        public MpesaReceiptResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 93;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            MpesaReceiptResponse[] mpesaReceiptResponseArrNewArray = newArray(i);
            int i5 = component2 + 111;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return mpesaReceiptResponseArrNewArray;
        }
    }

    public MpesaReceiptResponse(String str) {
        this.base64Data = str;
    }

    public final String getBase64Data() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.base64Data;
        int i5 = i2 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component3 + 91;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static MpesaReceiptResponse copy$default(MpesaReceiptResponse mpesaReceiptResponse, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 17;
        copydefault = i3 % 128;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = mpesaReceiptResponse.base64Data;
        }
        MpesaReceiptResponse mpesaReceiptResponseCopy = mpesaReceiptResponse.copy(str);
        int i4 = ShareDataUIState + 29;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return mpesaReceiptResponseCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.base64Data;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MpesaReceiptResponse copy(String base64Data) {
        int i = 2 % 2;
        MpesaReceiptResponse mpesaReceiptResponse = new MpesaReceiptResponse(base64Data);
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mpesaReceiptResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i2 + 123;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i2 + 39;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return true;
        }
        if (!(other instanceof MpesaReceiptResponse)) {
            int i10 = i4 + 17;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.base64Data, ((MpesaReceiptResponse) other).base64Data)) {
            return true;
        }
        int i12 = copydefault + 79;
        ShareDataUIState = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.base64Data;
        if (str == null) {
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int i7 = copydefault + 111;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaReceiptResponse(base64Data=" + this.base64Data + ")";
        int i2 = copydefault + 9;
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
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.base64Data);
        int i4 = copydefault + 27;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
