package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\tH×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/VerifyStatementResp;", "Landroid/os/Parcelable;", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/VerifyData;", "error", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Error;", "httpStatus", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/HttpStatus;", "status", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/VerifyData;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Error;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/HttpStatus;Ljava/lang/String;)V", "getData", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/VerifyData;", "getError", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Error;", "getHttpStatus", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/HttpStatus;", "getStatus", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyStatementResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyStatementResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("data")
    private final VerifyData data;

    @SerializedName("error")
    private final Error error;

    @SerializedName("httpStatus")
    private final HttpStatus httpStatus;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyStatementResp> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyStatementResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            VerifyStatementResp verifyStatementResp = new VerifyStatementResp(VerifyData.CREATOR.createFromParcel(parcel), Error.CREATOR.createFromParcel(parcel), HttpStatus.CREATOR.createFromParcel(parcel), parcel.readString());
            int i2 = component3 + 49;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return verifyStatementResp;
            }
            throw null;
        }

        @Override
        public VerifyStatementResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 119;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            VerifyStatementResp verifyStatementRespCreateFromParcel = createFromParcel(parcel);
            int i3 = copydefault + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return verifyStatementRespCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyStatementResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 27;
            copydefault = i3 % 128;
            VerifyStatementResp[] verifyStatementRespArr = new VerifyStatementResp[i];
            if (i3 % 2 == 0) {
                return verifyStatementRespArr;
            }
            throw null;
        }

        @Override
        public VerifyStatementResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 43;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            VerifyStatementResp[] verifyStatementRespArrNewArray = newArray(i);
            int i5 = component3 + 9;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return verifyStatementRespArrNewArray;
        }
    }

    public VerifyStatementResp(VerifyData verifyData, Error error, HttpStatus httpStatus, String str) {
        Intrinsics.checkNotNullParameter(verifyData, "");
        Intrinsics.checkNotNullParameter(error, "");
        Intrinsics.checkNotNullParameter(httpStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.data = verifyData;
        this.error = error;
        this.httpStatus = httpStatus;
        this.status = str;
    }

    public final VerifyData getData() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        VerifyData verifyData = this.data;
        int i5 = i2 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 86 / 0;
        }
        return verifyData;
    }

    public final Error getError() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Error error = this.error;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return error;
    }

    public final HttpStatus getHttpStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        HttpStatus httpStatus = this.httpStatus;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return httpStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 87;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = ShareDataUIState + 115;
        component1 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VerifyStatementResp copy$default(VerifyStatementResp verifyStatementResp, VerifyData verifyData, Error error, HttpStatus httpStatus, String str, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 15;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            verifyData = verifyStatementResp.data;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 35;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                Error error2 = verifyStatementResp.error;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            error = verifyStatementResp.error;
        }
        if ((i & 4) != 0) {
            httpStatus = verifyStatementResp.httpStatus;
            int i6 = component2 + 53;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 8) != 0) {
            str = verifyStatementResp.status;
        }
        return verifyStatementResp.copy(verifyData, error, httpStatus, str);
    }

    public final VerifyData component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 91;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VerifyData verifyData = this.data;
        int i4 = i2 + 73;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return verifyData;
    }

    public final Error component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Error error = this.error;
        int i5 = i2 + 55;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
        return error;
    }

    public final HttpStatus component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 51;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        HttpStatus httpStatus = this.httpStatus;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return httpStatus;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 19;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final VerifyStatementResp copy(VerifyData data, Error error, HttpStatus httpStatus, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(data, "");
        Intrinsics.checkNotNullParameter(error, "");
        Intrinsics.checkNotNullParameter(httpStatus, "");
        Intrinsics.checkNotNullParameter(status, "");
        VerifyStatementResp verifyStatementResp = new VerifyStatementResp(data, error, httpStatus, status);
        int i2 = copydefault + 49;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return verifyStatementResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 27;
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
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (other instanceof VerifyStatementResp) {
            VerifyStatementResp verifyStatementResp = (VerifyStatementResp) other;
            return Intrinsics.areEqual(this.data, verifyStatementResp.data) && Intrinsics.areEqual(this.error, verifyStatementResp.error) && Intrinsics.areEqual(this.httpStatus, verifyStatementResp.httpStatus) && !(Intrinsics.areEqual(this.status, verifyStatementResp.status) ^ true);
        }
        int i6 = i3 + 83;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.data.hashCode() * 31) + this.error.hashCode()) * 31) + this.httpStatus.hashCode()) * 31) + this.status.hashCode();
        int i4 = copydefault + 117;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyStatementResp(data=" + this.data + ", error=" + this.error + ", httpStatus=" + this.httpStatus + ", status=" + this.status + ")";
        int i2 = copydefault + 17;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 19;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            this.data.writeToParcel(dest, flags);
            this.error.writeToParcel(dest, flags);
            this.httpStatus.writeToParcel(dest, flags);
            dest.writeString(this.status);
            throw null;
        }
        this.data.writeToParcel(dest, flags);
        this.error.writeToParcel(dest, flags);
        this.httpStatus.writeToParcel(dest, flags);
        dest.writeString(this.status);
        int i4 = copydefault + 11;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }
}
