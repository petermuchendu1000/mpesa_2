package com.huawei.digitalpayment.consumer.sfcui.bonga.bongahistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/bongahistory/BongaHistoryAccumulatedResponse;", "Landroid/os/Parcelable;", "bongaPointsAccumulated", "", "bongaPointsBalance", "accumulationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBongaPointsAccumulated", "()Ljava/lang/String;", "getBongaPointsBalance", "getAccumulationDate", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaHistoryAccumulatedResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaHistoryAccumulatedResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("accumulationDate")
    private final String accumulationDate;

    @SerializedName("bongaPointsAccumulated")
    private final String bongaPointsAccumulated;

    @SerializedName("bongaPointsBalance")
    private final String bongaPointsBalance;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaHistoryAccumulatedResponse> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryAccumulatedResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaHistoryAccumulatedResponse bongaHistoryAccumulatedResponse = new BongaHistoryAccumulatedResponse(parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = copydefault + 9;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return bongaHistoryAccumulatedResponse;
        }

        @Override
        public BongaHistoryAccumulatedResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 81;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BongaHistoryAccumulatedResponse bongaHistoryAccumulatedResponseCreateFromParcel = createFromParcel(parcel);
            int i3 = component1 + 33;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return bongaHistoryAccumulatedResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryAccumulatedResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 25;
            int i4 = i3 % 128;
            copydefault = i4;
            BongaHistoryAccumulatedResponse[] bongaHistoryAccumulatedResponseArr = new BongaHistoryAccumulatedResponse[i];
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 35;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return bongaHistoryAccumulatedResponseArr;
        }

        @Override
        public BongaHistoryAccumulatedResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 33;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            BongaHistoryAccumulatedResponse[] bongaHistoryAccumulatedResponseArrNewArray = newArray(i);
            int i4 = component1 + 39;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 63 / 0;
            }
            return bongaHistoryAccumulatedResponseArrNewArray;
        }
    }

    public BongaHistoryAccumulatedResponse(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.bongaPointsAccumulated = str;
        this.bongaPointsBalance = str2;
        this.accumulationDate = str3;
    }

    public final String getBongaPointsAccumulated() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.bongaPointsAccumulated;
        int i5 = i3 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBongaPointsBalance() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.bongaPointsBalance;
        }
        throw null;
    }

    public final String getAccumulationDate() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.accumulationDate;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = copydefault + 23;
        component3 = i % 128;
        if (i % 2 == 0) {
            int i2 = 37 / 0;
        }
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 35;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.bongaPointsAccumulated);
        dest.writeString(this.bongaPointsBalance);
        dest.writeString(this.accumulationDate);
        int i4 = component1 + 27;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }
}
