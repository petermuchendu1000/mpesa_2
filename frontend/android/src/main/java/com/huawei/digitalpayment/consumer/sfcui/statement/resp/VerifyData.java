package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0007J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u0016H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/VerifyData;", "Landroid/os/Parcelable;", "message", "", "params", "Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Params;", Keys.BUNDLE_TYPE_SMS, "status", "<init>", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Params;Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getParams", "()Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/Params;", "getSms", "getStatus", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerifyData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VerifyData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("message")
    private final String message;

    @SerializedName("params")
    private final Params params;

    @SerializedName(Keys.BUNDLE_TYPE_SMS)
    private final String sms;

    @SerializedName("status")
    private final String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerifyData> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            VerifyData verifyData = new VerifyData(parcel.readString(), Params.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            int i2 = ShareDataUIState + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return verifyData;
        }

        @Override
        public VerifyData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            VerifyData verifyDataCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 61;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return verifyDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VerifyData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 57;
            ShareDataUIState = i4 % 128;
            VerifyData[] verifyDataArr = new VerifyData[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 35;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return verifyDataArr;
        }

        @Override
        public VerifyData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 105;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public VerifyData(String str, Params params, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.message = str;
        this.params = params;
        this.sms = str2;
        this.status = str3;
    }

    public final String getMessage() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 31;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.message;
            int i4 = 62 / 0;
        } else {
            str = this.message;
        }
        int i5 = i3 + 17;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Params getParams() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.params;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getSms() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 7;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.sms;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 36 / 0;
        }
        return str;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.status;
        int i4 = i2 + 57;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component1 + 107;
        component2 = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static VerifyData copy$default(VerifyData verifyData, String str, Params params, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = verifyData.message;
        }
        if ((i & 2) != 0) {
            int i3 = ShareDataUIState + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            params = verifyData.params;
        }
        if ((i & 4) != 0) {
            str2 = verifyData.sms;
        }
        if ((i & 8) != 0) {
            str3 = verifyData.status;
        }
        VerifyData verifyDataCopy = verifyData.copy(str, params, str2, str3);
        int i5 = copydefault + 89;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return verifyDataCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.message;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Params component2() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Params params = this.params;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return params;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.sms;
            int i4 = 36 / 0;
        } else {
            str = this.sms;
        }
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.status;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final VerifyData copy(String message, Params params, String sms, String status) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        Intrinsics.checkNotNullParameter(params, "");
        Intrinsics.checkNotNullParameter(sms, "");
        Intrinsics.checkNotNullParameter(status, "");
        VerifyData verifyData = new VerifyData(message, params, sms, status);
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return verifyData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 61;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof VerifyData)) {
            return false;
        }
        VerifyData verifyData = (VerifyData) other;
        if (!Intrinsics.areEqual(this.message, verifyData.message)) {
            int i4 = copydefault + 65;
            ShareDataUIState = i4 % 128;
            return i4 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.params, verifyData.params)) {
            return false;
        }
        if (Intrinsics.areEqual(this.sms, verifyData.sms)) {
            return Intrinsics.areEqual(this.status, verifyData.status);
        }
        int i5 = copydefault + 99;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.message.hashCode() * 31) + this.params.hashCode()) * 31) + this.sms.hashCode()) * 31) + this.status.hashCode();
        int i4 = copydefault + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 29 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VerifyData(message=" + this.message + ", params=" + this.params + ", sms=" + this.sms + ", status=" + this.status + ")";
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.message;
        if (i3 == 0) {
            dest.writeString(str);
            this.params.writeToParcel(dest, flags);
            dest.writeString(this.sms);
            dest.writeString(this.status);
            return;
        }
        dest.writeString(str);
        this.params.writeToParcel(dest, flags);
        dest.writeString(this.sms);
        dest.writeString(this.status);
        int i4 = 60 / 0;
    }
}
