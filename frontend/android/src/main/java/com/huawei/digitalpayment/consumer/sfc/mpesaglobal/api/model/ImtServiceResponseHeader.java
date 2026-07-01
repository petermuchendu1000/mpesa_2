package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0015\u001a\u00020\u0005H\u0007J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H×\u0003J\t\u0010\u001a\u001a\u00020\u0005H×\u0001J\t\u0010\u001b\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006!"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/ImtServiceResponseHeader;", "Landroid/os/Parcelable;", "detailedMsg", "", "responseCode", "", "responseMsg", "responseRefID", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDetailedMsg", "()Ljava/lang/String;", "getResponseCode", "()I", "getResponseMsg", "getResponseRefID", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImtServiceResponseHeader implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ImtServiceResponseHeader> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("DetailedMsg")
    private final String detailedMsg;

    @SerializedName("ResponseCode")
    private final int responseCode;

    @SerializedName("ResponseMsg")
    private final String responseMsg;

    @SerializedName("ResponseRefID")
    private final String responseRefID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ImtServiceResponseHeader> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            ImtServiceResponseHeader imtServiceResponseHeader = new ImtServiceResponseHeader(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 81;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return imtServiceResponseHeader;
        }

        @Override
        public ImtServiceResponseHeader createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            ImtServiceResponseHeader imtServiceResponseHeaderCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 57;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return imtServiceResponseHeaderCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ImtServiceResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            component1 = i3 % 128;
            ImtServiceResponseHeader[] imtServiceResponseHeaderArr = new ImtServiceResponseHeader[i];
            if (i3 % 2 == 0) {
                int i4 = 89 / 0;
            }
            return imtServiceResponseHeaderArr;
        }

        @Override
        public ImtServiceResponseHeader[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            ImtServiceResponseHeader[] imtServiceResponseHeaderArrNewArray = newArray(i);
            int i5 = component1 + 103;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 0 / 0;
            }
            return imtServiceResponseHeaderArrNewArray;
        }
    }

    public ImtServiceResponseHeader(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.detailedMsg = str;
        this.responseCode = i;
        this.responseMsg = str2;
        this.responseRefID = str3;
    }

    public final String getDetailedMsg() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.detailedMsg;
        int i5 = i3 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getResponseCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 115;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.responseCode;
        int i6 = i2 + 35;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getResponseMsg() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.responseMsg;
        if (i3 != 0) {
            int i4 = 4 / 0;
        }
        return str;
    }

    public final String getResponseRefID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.responseRefID;
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 65;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static ImtServiceResponseHeader copy$default(ImtServiceResponseHeader imtServiceResponseHeader, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = ShareDataUIState + 39;
        int i5 = i4 % 128;
        component1 = i5;
        if (i4 % 2 == 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            str = imtServiceResponseHeader.detailedMsg;
        }
        if ((i2 & 2) != 0) {
            i = imtServiceResponseHeader.responseCode;
        }
        if ((i2 & 4) != 0) {
            int i6 = i5 + 29;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            str2 = imtServiceResponseHeader.responseMsg;
        }
        if ((i2 & 8) != 0) {
            str3 = imtServiceResponseHeader.responseRefID;
        }
        return imtServiceResponseHeader.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.detailedMsg;
        int i5 = i3 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.responseCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.responseMsg;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.responseRefID;
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return str;
    }

    public final ImtServiceResponseHeader copy(String detailedMsg, int responseCode, String responseMsg, String responseRefID) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(detailedMsg, "");
        Intrinsics.checkNotNullParameter(responseMsg, "");
        Intrinsics.checkNotNullParameter(responseRefID, "");
        ImtServiceResponseHeader imtServiceResponseHeader = new ImtServiceResponseHeader(detailedMsg, responseCode, responseMsg, responseRefID);
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 26 / 0;
        }
        return imtServiceResponseHeader;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 49;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        int i4 = i3 % 128;
        component1 = i4;
        int i5 = i3 % 2;
        if (this == other) {
            int i6 = i4 + 17;
            ShareDataUIState = i6 % 128;
            return i6 % 2 != 0;
        }
        if (!(other instanceof ImtServiceResponseHeader)) {
            int i7 = i2 + 21;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        ImtServiceResponseHeader imtServiceResponseHeader = (ImtServiceResponseHeader) other;
        if (!Intrinsics.areEqual(this.detailedMsg, imtServiceResponseHeader.detailedMsg) || this.responseCode != imtServiceResponseHeader.responseCode || !Intrinsics.areEqual(this.responseMsg, imtServiceResponseHeader.responseMsg)) {
            return false;
        }
        if (Intrinsics.areEqual(this.responseRefID, imtServiceResponseHeader.responseRefID)) {
            return true;
        }
        int i9 = component1 + 99;
        ShareDataUIState = i9 % 128;
        return i9 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.detailedMsg.hashCode();
        return i3 != 0 ? (((((iHashCode - 9) + Integer.hashCode(this.responseCode)) * 69) / this.responseMsg.hashCode()) << 85) >> this.responseRefID.hashCode() : (((((iHashCode * 31) + Integer.hashCode(this.responseCode)) * 31) + this.responseMsg.hashCode()) * 31) + this.responseRefID.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ImtServiceResponseHeader(detailedMsg=" + this.detailedMsg + ", responseCode=" + this.responseCode + ", responseMsg=" + this.responseMsg + ", responseRefID=" + this.responseRefID + ')';
        int i2 = ShareDataUIState + 101;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.detailedMsg);
        dest.writeInt(this.responseCode);
        dest.writeString(this.responseMsg);
        dest.writeString(this.responseRefID);
        int i4 = component1 + 47;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 37 / 0;
        }
    }
}
