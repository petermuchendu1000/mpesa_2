package com.huawei.digitalpayment.consumer.sfcui.statement.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/statement/resp/MpesaStatementResp;", "Landroid/os/Parcelable;", "detailedMsg", "", "responseCode", "responseMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailedMsg", "()Ljava/lang/String;", "getResponseCode", "getResponseMsg", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaStatementResp implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MpesaStatementResp> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    @SerializedName("detailedMsg")
    private final String detailedMsg;

    @SerializedName("responseCode")
    private final String responseCode;

    @SerializedName("responseMsg")
    private final String responseMsg;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MpesaStatementResp> {
        private static int component1 = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaStatementResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            MpesaStatementResp mpesaStatementResp = new MpesaStatementResp(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 81;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return mpesaStatementResp;
            }
            throw null;
        }

        @Override
        public MpesaStatementResp createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final MpesaStatementResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 123;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            MpesaStatementResp[] mpesaStatementRespArr = new MpesaStatementResp[i];
            int i6 = i3 + 65;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return mpesaStatementRespArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public MpesaStatementResp[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 111;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            MpesaStatementResp[] mpesaStatementRespArrNewArray = newArray(i);
            int i5 = component1 + 9;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return mpesaStatementRespArrNewArray;
        }
    }

    public MpesaStatementResp(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.detailedMsg = str;
        this.responseCode = str2;
        this.responseMsg = str3;
    }

    public final String getDetailedMsg() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 61;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.detailedMsg;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResponseCode() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseCode;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResponseMsg() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseMsg;
        int i5 = i2 + 63;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 97;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static MpesaStatementResp copy$default(MpesaStatementResp mpesaStatementResp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 67;
        int i4 = i3 % 128;
        component1 = i4;
        if (i3 % 2 != 0 && (i & 1) != 0) {
            str = mpesaStatementResp.detailedMsg;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 109;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str2 = mpesaStatementResp.responseCode;
        }
        if ((i & 4) != 0) {
            str3 = mpesaStatementResp.responseMsg;
        }
        return mpesaStatementResp.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.detailedMsg;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.responseCode;
        int i5 = i3 + 81;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.responseMsg;
            int i4 = 9 / 0;
        } else {
            str = this.responseMsg;
        }
        int i5 = i3 + 53;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final MpesaStatementResp copy(String detailedMsg, String responseCode, String responseMsg) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(detailedMsg, "");
        Intrinsics.checkNotNullParameter(responseCode, "");
        Intrinsics.checkNotNullParameter(responseMsg, "");
        MpesaStatementResp mpesaStatementResp = new MpesaStatementResp(detailedMsg, responseCode, responseMsg);
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return mpesaStatementResp;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof MpesaStatementResp)) {
            int i4 = i3 + 29;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        MpesaStatementResp mpesaStatementResp = (MpesaStatementResp) other;
        if (!Intrinsics.areEqual(this.detailedMsg, mpesaStatementResp.detailedMsg)) {
            int i6 = component1 + 23;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 12 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.responseCode, mpesaStatementResp.responseCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.responseMsg, mpesaStatementResp.responseMsg)) {
            return true;
        }
        int i8 = ShareDataUIState + 57;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((this.detailedMsg.hashCode() * 31) + this.responseCode.hashCode()) * 31) + this.responseMsg.hashCode();
        int i4 = ShareDataUIState + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MpesaStatementResp(detailedMsg=" + this.detailedMsg + ", responseCode=" + this.responseCode + ", responseMsg=" + this.responseMsg + ")";
        int i2 = component1 + 109;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.detailedMsg;
        if (i3 != 0) {
            dest.writeString(str);
            dest.writeString(this.responseCode);
            dest.writeString(this.responseMsg);
        } else {
            dest.writeString(str);
            dest.writeString(this.responseCode);
            dest.writeString(this.responseMsg);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
