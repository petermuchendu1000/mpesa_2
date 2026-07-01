package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH×\u0003J\t\u0010\u0010\u001a\u00020\u000bH×\u0001J\t\u0010\u0011\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Error;", "Landroid/os/Parcelable;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Error implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Error> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("message")
    private final String message;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Error> {
        private static int component1 = 0;
        private static int component2 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Error createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Error error = new Error(parcel.readString());
            int i2 = component1 + 53;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return error;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public Error createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 103;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            Error errorCreateFromParcel = createFromParcel(parcel);
            int i3 = component2 + 45;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return errorCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Error[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            Error[] errorArr = new Error[i];
            int i6 = i3 + 125;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                return errorArr;
            }
            throw null;
        }

        @Override
        public Error[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 35;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            Error[] errorArrNewArray = newArray(i);
            int i5 = component1 + 103;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return errorArrNewArray;
        }
    }

    public Error(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    public final String getMessage() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 121;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 35;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static Error copy$default(Error error, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component3 + 1;
        ShareDataUIState = i3 % 128;
        int i4 = i & 1;
        if (i3 % 2 == 0 ? i4 != 0 : i4 != 0) {
            str = error.message;
        }
        Error errorCopy = error.copy(str);
        int i5 = ShareDataUIState + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return errorCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.message;
        int i5 = i2 + 117;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Error copy(String message) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Error error = new Error(message);
        int i2 = ShareDataUIState + 41;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return error;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 75;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof Error)) {
            return false;
        }
        if (Intrinsics.areEqual(this.message, ((Error) other).message)) {
            return true;
        }
        int i4 = component3 + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.message.hashCode();
        int i4 = ShareDataUIState + 1;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 74 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Error(message=" + this.message + ")";
        int i2 = ShareDataUIState + 107;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.message);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
    }
}
