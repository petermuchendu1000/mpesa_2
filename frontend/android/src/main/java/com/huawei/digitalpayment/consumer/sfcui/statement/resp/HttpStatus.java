package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H×\u0003J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/HttpStatus;", "Landroid/os/Parcelable;", "code", "", "value", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpStatus implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<HttpStatus> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    @SerializedName("code")
    private final int code;

    @SerializedName("value")
    private final String value;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HttpStatus> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final HttpStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            HttpStatus httpStatus = new HttpStatus(parcel.readInt(), parcel.readString());
            int i2 = component2 + 71;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 59 / 0;
            }
            return httpStatus;
        }

        @Override
        public HttpStatus createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 67;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            HttpStatus httpStatusCreateFromParcel = createFromParcel(parcel);
            int i3 = ShareDataUIState + 21;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 30 / 0;
            }
            return httpStatusCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final HttpStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 81;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            HttpStatus[] httpStatusArr = new HttpStatus[i];
            if (i3 % 2 == 0) {
                throw null;
            }
            int i5 = i4 + 35;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return httpStatusArr;
        }

        @Override
        public HttpStatus[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            HttpStatus[] httpStatusArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 29;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return httpStatusArrNewArray;
        }
    }

    public HttpStatus(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.code = i;
        this.value = str;
    }

    public final int getCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = this.code;
        int i6 = i3 + 51;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getValue() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.value;
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        int i = component2 + 119;
        component1 = i % 128;
        if (i % 2 == 0) {
            int i2 = 55 / 0;
        }
    }

    public static HttpStatus copy$default(HttpStatus httpStatus, int i, String str, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            int i4 = copydefault + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            i = httpStatus.code;
        }
        if ((i2 & 2) != 0) {
            int i6 = ShareDataUIState + 101;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = httpStatus.value;
                throw null;
            }
            str = httpStatus.value;
        }
        return httpStatus.copy(i, str);
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.code;
        int i5 = i2 + 23;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 15;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.value;
        int i4 = i2 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final HttpStatus copy(int code, String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        HttpStatus httpStatus = new HttpStatus(code, value);
        int i2 = ShareDataUIState + 39;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return httpStatus;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof HttpStatus)) {
            int i2 = ShareDataUIState + 43;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        HttpStatus httpStatus = (HttpStatus) other;
        if (this.code != httpStatus.code) {
            return false;
        }
        if (Intrinsics.areEqual(this.value, httpStatus.value)) {
            return true;
        }
        int i4 = copydefault + 21;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (Integer.hashCode(this.code) >> 12) >> this.value.hashCode() : (Integer.hashCode(this.code) * 31) + this.value.hashCode();
        int i3 = ShareDataUIState + 119;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HttpStatus(code=" + this.code + ", value=" + this.value + ")";
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.code);
        dest.writeString(this.value);
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }
}
