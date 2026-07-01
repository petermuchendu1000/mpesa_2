package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H×\u0003J\t\u0010\u0019\u001a\u00020\u0014H×\u0001J\t\u0010\u001a\u001a\u00020\u0003H×\u0001J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidateResponse;", "Landroid/os/Parcelable;", "channelSessionId", "", "okoaAmount", "useODAmount", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelSessionId", "()Ljava/lang/String;", "getOkoaAmount", "getUseODAmount", "getCurrency", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkMpesaValidateResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EasyTalkMpesaValidateResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int copydefault;

    @SerializedName("ChannelSessionID")
    private final String channelSessionId;

    @SerializedName("Currency")
    private final String currency;

    @SerializedName("OkoaAmount")
    private final String okoaAmount;

    @SerializedName("UseODAmount")
    private final String useODAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkMpesaValidateResponse> {
        private static int ShareDataUIState = 1;
        private static int component2;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidateResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EasyTalkMpesaValidateResponse easyTalkMpesaValidateResponse = new EasyTalkMpesaValidateResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component2 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 79 / 0;
            }
            return easyTalkMpesaValidateResponse;
        }

        @Override
        public EasyTalkMpesaValidateResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkMpesaValidateResponse easyTalkMpesaValidateResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component2 + 117;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return easyTalkMpesaValidateResponseCreateFromParcel;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidateResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 89;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            EasyTalkMpesaValidateResponse[] easyTalkMpesaValidateResponseArr = new EasyTalkMpesaValidateResponse[i];
            int i6 = i4 + 105;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return easyTalkMpesaValidateResponseArr;
        }

        @Override
        public EasyTalkMpesaValidateResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 11;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                return newArray(i);
            }
            newArray(i);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public EasyTalkMpesaValidateResponse(String str, String str2, String str3, String str4) {
        this.channelSessionId = str;
        this.okoaAmount = str2;
        this.useODAmount = str3;
        this.currency = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EasyTalkMpesaValidateResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 33;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = component1;
            int i6 = i5 + 25;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 51;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 2;
            }
            str2 = null;
        }
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.channelSessionId;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return str;
    }

    public final String getOkoaAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.okoaAmount;
        int i5 = i3 + 89;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getUseODAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 113;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.useODAmount;
        int i5 = i2 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCurrency() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.currency;
        if (i3 == 0) {
            int i4 = 36 / 0;
        }
        return str;
    }

    static {
        int i = copydefault + 99;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public EasyTalkMpesaValidateResponse() {
        this(null, null, null, null, 15, null);
    }

    public static EasyTalkMpesaValidateResponse copy$default(EasyTalkMpesaValidateResponse easyTalkMpesaValidateResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 91;
        component1 = i4 % 128;
        if (i4 % 2 != 0 && (i & 1) != 0) {
            str = easyTalkMpesaValidateResponse.channelSessionId;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 67;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            str2 = easyTalkMpesaValidateResponse.okoaAmount;
        }
        if ((i & 4) != 0) {
            int i7 = i3 + 29;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            str3 = easyTalkMpesaValidateResponse.useODAmount;
            if (i8 == 0) {
                int i9 = 89 / 0;
            }
        }
        if ((i & 8) != 0) {
            int i10 = component1 + 15;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 != 0) {
                str4 = easyTalkMpesaValidateResponse.currency;
                int i11 = 84 / 0;
            } else {
                str4 = easyTalkMpesaValidateResponse.currency;
            }
        }
        return easyTalkMpesaValidateResponse.copy(str, str2, str3, str4);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.channelSessionId;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.okoaAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.useODAmount;
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 103;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.currency;
        int i5 = i2 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final EasyTalkMpesaValidateResponse copy(String channelSessionId, String okoaAmount, String useODAmount, String currency) {
        int i = 2 % 2;
        EasyTalkMpesaValidateResponse easyTalkMpesaValidateResponse = new EasyTalkMpesaValidateResponse(channelSessionId, okoaAmount, useODAmount, currency);
        int i2 = component1 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 90 / 0;
        }
        return easyTalkMpesaValidateResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 77;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof EasyTalkMpesaValidateResponse)) {
            return false;
        }
        EasyTalkMpesaValidateResponse easyTalkMpesaValidateResponse = (EasyTalkMpesaValidateResponse) other;
        if (!Intrinsics.areEqual(this.channelSessionId, easyTalkMpesaValidateResponse.channelSessionId) || !Intrinsics.areEqual(this.okoaAmount, easyTalkMpesaValidateResponse.okoaAmount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.useODAmount, easyTalkMpesaValidateResponse.useODAmount)) {
            return Intrinsics.areEqual(this.currency, easyTalkMpesaValidateResponse.currency);
        }
        int i4 = component1 + 63;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 27;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.channelSessionId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.okoaAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.useODAmount;
        if (str3 == null) {
            int i4 = ShareDataUIState + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.currency;
        return (((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkMpesaValidateResponse(channelSessionId=" + this.channelSessionId + ", okoaAmount=" + this.okoaAmount + ", useODAmount=" + this.useODAmount + ", currency=" + this.currency + ")";
        int i2 = component1 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        String str = this.channelSessionId;
        if (i3 != 0) {
            dest.writeString(str);
            dest.writeString(this.okoaAmount);
            dest.writeString(this.useODAmount);
            dest.writeString(this.currency);
            return;
        }
        dest.writeString(str);
        dest.writeString(this.okoaAmount);
        dest.writeString(this.useODAmount);
        dest.writeString(this.currency);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
