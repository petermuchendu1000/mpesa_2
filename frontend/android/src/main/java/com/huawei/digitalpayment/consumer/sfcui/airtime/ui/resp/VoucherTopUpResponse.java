package com.huawei.digitalpayment.consumer.sfcui.airtime.ui.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/airtime/ui/resp/VoucherTopUpResponse;", "Landroid/os/Parcelable;", "balanceType", "", "balanceID", "balanceTypeName", "oldBalanceAmount", "newBalanceAmount", "topUpAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBalanceType", "()Ljava/lang/String;", "getBalanceID", "getBalanceTypeName", "getOldBalanceAmount", "getNewBalanceAmount", "getTopUpAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VoucherTopUpResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VoucherTopUpResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component2 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("balanceID")
    private final String balanceID;

    @SerializedName("balanceType")
    private final String balanceType;

    @SerializedName("balanceTypeName")
    private final String balanceTypeName;

    @SerializedName("newBalanceAmt")
    private final String newBalanceAmount;

    @SerializedName("oldBalanceAmt")
    private final String oldBalanceAmount;

    @SerializedName("topUpAmt")
    private final String topUpAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VoucherTopUpResponse> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VoucherTopUpResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            VoucherTopUpResponse voucherTopUpResponse = new VoucherTopUpResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 121;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return voucherTopUpResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public VoucherTopUpResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                throw null;
            }
            VoucherTopUpResponse voucherTopUpResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 105;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return voucherTopUpResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final VoucherTopUpResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 95;
            component3 = i3 % 128;
            VoucherTopUpResponse[] voucherTopUpResponseArr = new VoucherTopUpResponse[i];
            if (i3 % 2 != 0) {
                return voucherTopUpResponseArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public VoucherTopUpResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 47;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public VoucherTopUpResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.balanceType = str;
        this.balanceID = str2;
        this.balanceTypeName = str3;
        this.oldBalanceAmount = str4;
        this.newBalanceAmount = str5;
        this.topUpAmount = str6;
    }

    public final String getBalanceType() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceType;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBalanceID() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.balanceID;
        int i5 = i2 + 25;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBalanceTypeName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 1;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.balanceTypeName;
        int i4 = i2 + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getOldBalanceAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.oldBalanceAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getNewBalanceAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.newBalanceAmount;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTopUpAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.topUpAmount;
        int i4 = i3 + 99;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    static {
        int i = component2 + 25;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public static VoucherTopUpResponse copy$default(VoucherTopUpResponse voucherTopUpResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 49;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            str = voucherTopUpResponse.balanceType;
        }
        String str7 = str;
        if ((i & 2) != 0) {
            str2 = voucherTopUpResponse.balanceID;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 31;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            str3 = voucherTopUpResponse.balanceTypeName;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = voucherTopUpResponse.oldBalanceAmount;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = voucherTopUpResponse.newBalanceAmount;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            int i7 = copydefault + 105;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str6 = voucherTopUpResponse.topUpAmount;
        }
        return voucherTopUpResponse.copy(str7, str8, str9, str10, str11, str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 111;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.balanceType;
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 3;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.balanceID;
            int i4 = 89 / 0;
        } else {
            str = this.balanceID;
        }
        int i5 = i2 + 15;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.balanceTypeName;
        int i4 = i2 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.oldBalanceAmount;
        int i5 = i2 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.newBalanceAmount;
        int i4 = i3 + 47;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.topUpAmount;
        }
        throw null;
    }

    public final VoucherTopUpResponse copy(String balanceType, String balanceID, String balanceTypeName, String oldBalanceAmount, String newBalanceAmount, String topUpAmount) {
        int i = 2 % 2;
        VoucherTopUpResponse voucherTopUpResponse = new VoucherTopUpResponse(balanceType, balanceID, balanceTypeName, oldBalanceAmount, newBalanceAmount, topUpAmount);
        int i2 = ShareDataUIState + 29;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return voucherTopUpResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherTopUpResponse)) {
            return false;
        }
        VoucherTopUpResponse voucherTopUpResponse = (VoucherTopUpResponse) other;
        if (!Intrinsics.areEqual(this.balanceType, voucherTopUpResponse.balanceType)) {
            int i2 = ShareDataUIState + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.balanceID, voucherTopUpResponse.balanceID)) {
            return false;
        }
        if (Intrinsics.areEqual(this.balanceTypeName, voucherTopUpResponse.balanceTypeName)) {
            return Intrinsics.areEqual(this.oldBalanceAmount, voucherTopUpResponse.oldBalanceAmount) && !(Intrinsics.areEqual(this.newBalanceAmount, voucherTopUpResponse.newBalanceAmount) ^ true) && Intrinsics.areEqual(this.topUpAmount, voucherTopUpResponse.topUpAmount);
        }
        int i4 = ShareDataUIState + 109;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.balanceType;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.balanceID;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.balanceTypeName;
        if (str3 == null) {
            int i2 = copydefault;
            int i3 = i2 + 61;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 101;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.oldBalanceAmount;
        if (str4 == null) {
            int i7 = copydefault + 15;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.newBalanceAmount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.topUpAmount;
        return (((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "VoucherTopUpResponse(balanceType=" + this.balanceType + ", balanceID=" + this.balanceID + ", balanceTypeName=" + this.balanceTypeName + ", oldBalanceAmount=" + this.oldBalanceAmount + ", newBalanceAmount=" + this.newBalanceAmount + ", topUpAmount=" + this.topUpAmount + ")";
        int i2 = copydefault + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 30 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.balanceType);
        dest.writeString(this.balanceID);
        dest.writeString(this.balanceTypeName);
        dest.writeString(this.oldBalanceAmount);
        dest.writeString(this.newBalanceAmount);
        dest.writeString(this.topUpAmount);
        int i4 = ShareDataUIState + 103;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
