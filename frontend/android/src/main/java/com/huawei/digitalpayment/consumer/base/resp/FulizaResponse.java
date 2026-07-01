package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/FulizaResponse;", "Landroid/os/Parcelable;", "channelSessionId", "", "accessFee", "useOdAmount", "okoaAmount", "currency", "interestRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelSessionId", "()Ljava/lang/String;", "getAccessFee", "getUseOdAmount", "getOkoaAmount", "getCurrency", "getInterestRate", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FulizaResponse implements Parcelable {
    public static final Parcelable.Creator<FulizaResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("AccessFee")
    private final String accessFee;

    @SerializedName("ChannelSessionID")
    private final String channelSessionId;

    @SerializedName("Currency")
    private final String currency;

    @SerializedName("InterestRate")
    private final String interestRate;

    @SerializedName("OkoaAmount")
    private final String okoaAmount;

    @SerializedName("UseODAmount")
    private final String useOdAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FulizaResponse> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FulizaResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            FulizaResponse fulizaResponse = new FulizaResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component3 + 113;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return fulizaResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FulizaResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            FulizaResponse fulizaResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return fulizaResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FulizaResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 69;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            FulizaResponse[] fulizaResponseArr = new FulizaResponse[i];
            int i6 = i3 + 49;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return fulizaResponseArr;
        }

        @Override
        public FulizaResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 47;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FulizaResponse[] fulizaResponseArrNewArray = newArray(i);
            int i5 = copydefault + 115;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return fulizaResponseArrNewArray;
        }
    }

    public FulizaResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        this.channelSessionId = str;
        this.accessFee = str2;
        this.useOdAmount = str3;
        this.okoaAmount = str4;
        this.currency = str5;
        this.interestRate = str6;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.channelSessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getAccessFee() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accessFee;
        int i4 = i3 + 13;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getUseOdAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.useOdAmount;
        int i4 = i2 + 109;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 9 / 0;
        }
        return str;
    }

    public final String getOkoaAmount() {
        int i = 2 % 2;
        int i2 = component1 + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.okoaAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.currency;
        }
        throw null;
    }

    public final String getInterestRate() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.interestRate;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    static {
        int i = component3 + 19;
        copydefault = i % 128;
        if (i % 2 == 0) {
            int i2 = 76 / 0;
        }
    }

    public static FulizaResponse copy$default(FulizaResponse fulizaResponse, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        String str7;
        String str8;
        String str9;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 125;
        ShareDataUIState = i4 % 128;
        String str10 = (i4 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : fulizaResponse.channelSessionId;
        if ((i & 2) != 0) {
            int i5 = i3 + 57;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str7 = fulizaResponse.accessFee;
        } else {
            str7 = str2;
        }
        if ((i & 4) != 0) {
            int i7 = ShareDataUIState + 75;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                str8 = fulizaResponse.useOdAmount;
                int i8 = 80 / 0;
            } else {
                str8 = fulizaResponse.useOdAmount;
            }
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i9 = ShareDataUIState + 7;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            str9 = fulizaResponse.okoaAmount;
        } else {
            str9 = str4;
        }
        return fulizaResponse.copy(str10, str7, str8, str9, (i & 16) != 0 ? fulizaResponse.currency : str5, (i & 32) != 0 ? fulizaResponse.interestRate : str6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        int i5 = i2 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.accessFee;
            int i4 = 90 / 0;
        } else {
            str = this.accessFee;
        }
        int i5 = i2 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 39;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.useOdAmount;
        int i4 = i2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.okoaAmount;
        }
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.currency;
        int i4 = i3 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.interestRate;
        int i5 = i3 + 83;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final FulizaResponse copy(String channelSessionId, String accessFee, String useOdAmount, String okoaAmount, String currency, String interestRate) {
        int i = 2 % 2;
        FulizaResponse fulizaResponse = new FulizaResponse(channelSessionId, accessFee, useOdAmount, okoaAmount, currency, interestRate);
        int i2 = ShareDataUIState + 61;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 20 / 0;
        }
        return fulizaResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 109;
            component1 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof FulizaResponse)) {
            return false;
        }
        FulizaResponse fulizaResponse = (FulizaResponse) other;
        if (!Intrinsics.areEqual(this.channelSessionId, fulizaResponse.channelSessionId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.accessFee, fulizaResponse.accessFee)) {
            int i3 = component1 + 101;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.useOdAmount, fulizaResponse.useOdAmount)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.okoaAmount, fulizaResponse.okoaAmount)) {
            int i5 = component1 + 61;
            ShareDataUIState = i5 % 128;
            return i5 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.currency, fulizaResponse.currency)) {
            return !(Intrinsics.areEqual(this.interestRate, fulizaResponse.interestRate) ^ true);
        }
        int i6 = ShareDataUIState + 95;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        if (str == null) {
            int i5 = i2 + 17;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component1 + 91;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        String str2 = this.accessFee;
        if (str2 == null) {
            int i9 = ShareDataUIState + 103;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i11 = ShareDataUIState + 107;
            component1 = i11 % 128;
            int i12 = i11 % 2;
        }
        String str3 = this.useOdAmount;
        if (str3 == null) {
            int i13 = component1 + 103;
            ShareDataUIState = i13 % 128;
            iHashCode3 = i13 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str3.hashCode();
        }
        String str4 = this.okoaAmount;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.currency;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.interestRate;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FulizaResponse(channelSessionId=" + this.channelSessionId + ", accessFee=" + this.accessFee + ", useOdAmount=" + this.useOdAmount + ", okoaAmount=" + this.okoaAmount + ", currency=" + this.currency + ", interestRate=" + this.interestRate + ")";
        int i2 = ShareDataUIState + 71;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channelSessionId);
        dest.writeString(this.accessFee);
        dest.writeString(this.useOdAmount);
        dest.writeString(this.okoaAmount);
        dest.writeString(this.currency);
        dest.writeString(this.interestRate);
        int i4 = ShareDataUIState + 63;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 63 / 0;
        }
    }
}
