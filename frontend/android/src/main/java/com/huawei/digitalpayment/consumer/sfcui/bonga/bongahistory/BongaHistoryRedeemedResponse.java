package com.huawei.digitalpayment.consumer.sfcui.bonga.bongahistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/bonga/bongahistory/BongaHistoryRedeemedResponse;", "Landroid/os/Parcelable;", "redemptionDate", "", "bongaPointsRedeemed", "bongaPointsBalance", "resourceName", "resourceValue", "resourceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRedemptionDate", "()Ljava/lang/String;", "getBongaPointsRedeemed", "getBongaPointsBalance", "getResourceName", "getResourceValue", "getResourceType", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BongaHistoryRedeemedResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BongaHistoryRedeemedResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("bongaPointsBalance")
    private final String bongaPointsBalance;

    @SerializedName("bongaPointsRedeemed")
    private final String bongaPointsRedeemed;

    @SerializedName("redemptionDate")
    private final String redemptionDate;

    @SerializedName("resourceName")
    private final String resourceName;

    @SerializedName("resourceType")
    private final String resourceType;

    @SerializedName("resourceValue")
    private final String resourceValue;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BongaHistoryRedeemedResponse> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryRedeemedResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            BongaHistoryRedeemedResponse bongaHistoryRedeemedResponse = new BongaHistoryRedeemedResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return bongaHistoryRedeemedResponse;
        }

        @Override
        public BongaHistoryRedeemedResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            BongaHistoryRedeemedResponse bongaHistoryRedeemedResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component1 + 13;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return bongaHistoryRedeemedResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final BongaHistoryRedeemedResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 123;
            component1 = i3 % 128;
            BongaHistoryRedeemedResponse[] bongaHistoryRedeemedResponseArr = new BongaHistoryRedeemedResponse[i];
            if (i3 % 2 == 0) {
                return bongaHistoryRedeemedResponseArr;
            }
            throw null;
        }

        @Override
        public BongaHistoryRedeemedResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 103;
            component3 = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            BongaHistoryRedeemedResponse[] bongaHistoryRedeemedResponseArrNewArray = newArray(i);
            int i4 = component1 + 75;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return bongaHistoryRedeemedResponseArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public BongaHistoryRedeemedResponse(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.redemptionDate = str;
        this.bongaPointsRedeemed = str2;
        this.bongaPointsBalance = str3;
        this.resourceName = str4;
        this.resourceValue = str5;
        this.resourceType = str6;
    }

    public final String getRedemptionDate() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.redemptionDate;
        }
        throw null;
    }

    public final String getBongaPointsRedeemed() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bongaPointsRedeemed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBongaPointsBalance() {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.bongaPointsBalance;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return str;
    }

    public final String getResourceName() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.resourceName;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getResourceValue() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.resourceValue;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getResourceType() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.resourceType;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static {
        int i = component2 + 51;
        component1 = i % 128;
        int i2 = i % 2;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 7;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.redemptionDate);
        dest.writeString(this.bongaPointsRedeemed);
        dest.writeString(this.bongaPointsBalance);
        dest.writeString(this.resourceName);
        dest.writeString(this.resourceValue);
        dest.writeString(this.resourceType);
        int i4 = component3 + 113;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
