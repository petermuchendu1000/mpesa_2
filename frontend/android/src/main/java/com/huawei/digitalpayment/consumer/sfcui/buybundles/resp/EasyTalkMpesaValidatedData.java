package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;", "Landroid/os/Parcelable;", "channelSessionId", "", "okoaAmount", "useODAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannelSessionId", "()Ljava/lang/String;", "getOkoaAmount", "getUseODAmount", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EasyTalkMpesaValidatedData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EasyTalkMpesaValidatedData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private final String channelSessionId;
    private final String okoaAmount;
    private final String useODAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EasyTalkMpesaValidatedData> {
        private static int ShareDataUIState = 1;
        private static int component1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidatedData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            EasyTalkMpesaValidatedData easyTalkMpesaValidatedData = new EasyTalkMpesaValidatedData(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 17;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
            return easyTalkMpesaValidatedData;
        }

        @Override
        public EasyTalkMpesaValidatedData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            EasyTalkMpesaValidatedData easyTalkMpesaValidatedDataCreateFromParcel = createFromParcel(parcel);
            int i4 = ShareDataUIState + 51;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return easyTalkMpesaValidatedDataCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EasyTalkMpesaValidatedData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1;
            int i4 = i3 + 19;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            EasyTalkMpesaValidatedData[] easyTalkMpesaValidatedDataArr = new EasyTalkMpesaValidatedData[i];
            int i6 = i3 + 9;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                return easyTalkMpesaValidatedDataArr;
            }
            throw null;
        }

        @Override
        public EasyTalkMpesaValidatedData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 87;
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

    public EasyTalkMpesaValidatedData(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.channelSessionId = str;
        this.okoaAmount = str2;
        this.useODAmount = str3;
    }

    public final String getChannelSessionId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.channelSessionId;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final String getOkoaAmount() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.okoaAmount;
        int i5 = i3 + 93;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 49 / 0;
        }
        return str;
    }

    public final String getUseODAmount() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.useODAmount;
        }
        throw null;
    }

    static {
        int i = component1 + 11;
        component2 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static EasyTalkMpesaValidatedData copy$default(EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = easyTalkMpesaValidatedData.channelSessionId;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 115;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str2 = easyTalkMpesaValidatedData.okoaAmount;
        }
        if ((i & 4) != 0) {
            int i5 = component3 + 67;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                str3 = easyTalkMpesaValidatedData.useODAmount;
                int i6 = 43 / 0;
            } else {
                str3 = easyTalkMpesaValidatedData.useODAmount;
            }
        }
        EasyTalkMpesaValidatedData easyTalkMpesaValidatedDataCopy = easyTalkMpesaValidatedData.copy(str, str2, str3);
        int i7 = component3 + 65;
        ShareDataUIState = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
        return easyTalkMpesaValidatedDataCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 17;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.channelSessionId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.okoaAmount;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.useODAmount;
        int i4 = i2 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final EasyTalkMpesaValidatedData copy(String channelSessionId, String okoaAmount, String useODAmount) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(channelSessionId, "");
        Intrinsics.checkNotNullParameter(okoaAmount, "");
        Intrinsics.checkNotNullParameter(useODAmount, "");
        EasyTalkMpesaValidatedData easyTalkMpesaValidatedData = new EasyTalkMpesaValidatedData(channelSessionId, okoaAmount, useODAmount);
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return easyTalkMpesaValidatedData;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EasyTalkMpesaValidatedData)) {
            return false;
        }
        EasyTalkMpesaValidatedData easyTalkMpesaValidatedData = (EasyTalkMpesaValidatedData) other;
        if (!Intrinsics.areEqual(this.channelSessionId, easyTalkMpesaValidatedData.channelSessionId)) {
            int i2 = component3 + 7;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.okoaAmount, easyTalkMpesaValidatedData.okoaAmount)) {
            return false;
        }
        if (Intrinsics.areEqual(this.useODAmount, easyTalkMpesaValidatedData.useODAmount)) {
            return true;
        }
        int i4 = component3;
        int i5 = i4 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        int i7 = i4 + 21;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component3 = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (((this.channelSessionId.hashCode() >>> 33) / this.okoaAmount.hashCode()) / 19) * this.useODAmount.hashCode() : (((this.channelSessionId.hashCode() * 31) + this.okoaAmount.hashCode()) * 31) + this.useODAmount.hashCode();
        int i3 = component3 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EasyTalkMpesaValidatedData(channelSessionId=" + this.channelSessionId + ", okoaAmount=" + this.okoaAmount + ", useODAmount=" + this.useODAmount + ")";
        int i2 = ShareDataUIState + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 27 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.channelSessionId);
        dest.writeString(this.okoaAmount);
        dest.writeString(this.useODAmount);
        int i4 = component3 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
