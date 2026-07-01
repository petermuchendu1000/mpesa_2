package com.huawei.digitalpayment.consumer.sfcui.recommendafriend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÇ\u0001J\b\u0010'\u001a\u00020\u0003H\u0007J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H×\u0003J\t\u0010,\u001a\u00020\u0003H×\u0001J\t\u0010-\u001a\u00020\u0005H×\u0001J\u0018\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/recommendafriend/model/SendRecommendationResponse;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "recommenderMsisdn", "", "recommendeeMsisdn", "status", "awardStatus", "dateCreated", "dateUpdated", "channel", "productName", "productId", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getRecommenderMsisdn", "()Ljava/lang/String;", "getRecommendeeMsisdn", "getStatus", "getAwardStatus", "getDateCreated", "getDateUpdated", "getChannel", "getProductName", "getProductId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendRecommendationResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SendRecommendationResponse> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("award_status")
    private final int awardStatus;

    @SerializedName("channel")
    private final String channel;

    @SerializedName("dateCreated")
    private final String dateCreated;

    @SerializedName("dateUpdated")
    private final String dateUpdated;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final int id;

    @SerializedName("product_id")
    private final String productId;

    @SerializedName("product_name")
    private final String productName;

    @SerializedName("recommendeeMsisdn")
    private final String recommendeeMsisdn;

    @SerializedName("recommenderMsisdn")
    private final String recommenderMsisdn;

    @SerializedName("status")
    private final int status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SendRecommendationResponse> {
        private static int component1 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendRecommendationResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            SendRecommendationResponse sendRecommendationResponse = new SendRecommendationResponse(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            int i2 = component1 + 5;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return sendRecommendationResponse;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public SendRecommendationResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 57;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            SendRecommendationResponse sendRecommendationResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return sendRecommendationResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SendRecommendationResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 81;
            component1 = i4 % 128;
            SendRecommendationResponse[] sendRecommendationResponseArr = new SendRecommendationResponse[i];
            if (i4 % 2 == 0) {
                throw null;
            }
            int i5 = i3 + 85;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return sendRecommendationResponseArr;
        }

        @Override
        public SendRecommendationResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 1;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            SendRecommendationResponse[] sendRecommendationResponseArrNewArray = newArray(i);
            int i5 = component1 + 125;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return sendRecommendationResponseArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public SendRecommendationResponse(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = i;
        this.recommenderMsisdn = str;
        this.recommendeeMsisdn = str2;
        this.status = i2;
        this.awardStatus = i3;
        this.dateCreated = str3;
        this.dateUpdated = str4;
        this.channel = str5;
        this.productName = str6;
        this.productId = str7;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 103;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final String getRecommenderMsisdn() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.recommenderMsisdn;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String getRecommendeeMsisdn() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.recommendeeMsisdn;
        int i4 = i2 + 93;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final int getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.status;
        int i6 = i3 + 115;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getAwardStatus() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.awardStatus;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDateCreated() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.dateCreated;
        int i5 = i3 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDateUpdated() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.dateUpdated;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return str;
    }

    public final String getChannel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 47;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.channel;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productId;
        if (i3 == 0) {
            int i4 = 31 / 0;
        }
        return str;
    }

    static {
        int i = component1 + 63;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    public static SendRecommendationResponse copy$default(SendRecommendationResponse sendRecommendationResponse, int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, int i4, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        int i5 = 2 % 2;
        int i6 = (i4 & 1) != 0 ? sendRecommendationResponse.id : i;
        if ((i4 & 2) != 0) {
            int i7 = ShareDataUIState + 93;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            str8 = sendRecommendationResponse.recommenderMsisdn;
        } else {
            str8 = str;
        }
        if ((i4 & 4) != 0) {
            int i9 = ShareDataUIState + 109;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                str9 = sendRecommendationResponse.recommendeeMsisdn;
                int i10 = 91 / 0;
            } else {
                str9 = sendRecommendationResponse.recommendeeMsisdn;
            }
        } else {
            str9 = str2;
        }
        int i11 = (i4 & 8) != 0 ? sendRecommendationResponse.status : i2;
        int i12 = (i4 & 16) != 0 ? sendRecommendationResponse.awardStatus : i3;
        if ((i4 & 32) != 0) {
            int i13 = ShareDataUIState + 77;
            component3 = i13 % 128;
            if (i13 % 2 != 0) {
                String str13 = sendRecommendationResponse.dateCreated;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str10 = sendRecommendationResponse.dateCreated;
        } else {
            str10 = str3;
        }
        if ((i4 & 64) != 0) {
            int i14 = ShareDataUIState + 107;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            str11 = sendRecommendationResponse.dateUpdated;
        } else {
            str11 = str4;
        }
        if ((i4 & 128) != 0) {
            int i16 = ShareDataUIState + 27;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            str12 = sendRecommendationResponse.channel;
        } else {
            str12 = str5;
        }
        SendRecommendationResponse sendRecommendationResponseCopy = sendRecommendationResponse.copy(i6, str8, str9, i11, i12, str10, str11, str12, (i4 & 256) != 0 ? sendRecommendationResponse.productName : str6, (i4 & 512) != 0 ? sendRecommendationResponse.productId : str7);
        int i18 = component3 + 7;
        ShareDataUIState = i18 % 128;
        if (i18 % 2 == 0) {
            int i19 = 61 / 0;
        }
        return sendRecommendationResponseCopy;
    }

    public final int component1() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.id;
        if (i3 == 0) {
            int i5 = 97 / 0;
        }
        return i4;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 37;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.recommenderMsisdn;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 21;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.recommendeeMsisdn;
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.status;
        int i6 = i2 + 9;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 93 / 0;
        }
        return i5;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = this.awardStatus;
        int i5 = i3 + 91;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return i4;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.dateCreated;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.dateUpdated;
        int i4 = i3 + 41;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.channel;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productName;
        }
        throw null;
    }

    public final SendRecommendationResponse copy(int id, String recommenderMsisdn, String recommendeeMsisdn, int status, int awardStatus, String dateCreated, String dateUpdated, String channel, String productName, String productId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(recommenderMsisdn, "");
        Intrinsics.checkNotNullParameter(recommendeeMsisdn, "");
        Intrinsics.checkNotNullParameter(dateCreated, "");
        Intrinsics.checkNotNullParameter(dateUpdated, "");
        SendRecommendationResponse sendRecommendationResponse = new SendRecommendationResponse(id, recommenderMsisdn, recommendeeMsisdn, status, awardStatus, dateCreated, dateUpdated, channel, productName, productId);
        int i2 = ShareDataUIState + 87;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return sendRecommendationResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SendRecommendationResponse)) {
            return false;
        }
        SendRecommendationResponse sendRecommendationResponse = (SendRecommendationResponse) other;
        if (this.id != sendRecommendationResponse.id) {
            int i4 = ShareDataUIState + 61;
            component3 = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.recommenderMsisdn, sendRecommendationResponse.recommenderMsisdn)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.recommendeeMsisdn, sendRecommendationResponse.recommendeeMsisdn)) {
            int i5 = ShareDataUIState + 83;
            component3 = i5 % 128;
            return i5 % 2 != 0;
        }
        if (this.status != sendRecommendationResponse.status || this.awardStatus != sendRecommendationResponse.awardStatus || !Intrinsics.areEqual(this.dateCreated, sendRecommendationResponse.dateCreated)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.dateUpdated, sendRecommendationResponse.dateUpdated)) {
            int i6 = component3 + 107;
            ShareDataUIState = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.channel, sendRecommendationResponse.channel)) {
            int i7 = ShareDataUIState + 73;
            component3 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!(!Intrinsics.areEqual(this.productName, sendRecommendationResponse.productName))) {
            return Intrinsics.areEqual(this.productId, sendRecommendationResponse.productId);
        }
        int i8 = component3 + 75;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3 + 117;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = Integer.hashCode(this.id);
        int iHashCode3 = this.recommenderMsisdn.hashCode();
        int iHashCode4 = this.recommendeeMsisdn.hashCode();
        int iHashCode5 = Integer.hashCode(this.status);
        int iHashCode6 = Integer.hashCode(this.awardStatus);
        int iHashCode7 = this.dateCreated.hashCode();
        int iHashCode8 = this.dateUpdated.hashCode();
        String str = this.channel;
        int iHashCode9 = 0;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.productName;
        if (str2 == null) {
            int i4 = ShareDataUIState + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.productId;
        if (str3 == null) {
            int i6 = ShareDataUIState + 13;
            component3 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode9 = str3.hashCode();
        }
        return (((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode10) * 31) + iHashCode) * 31) + iHashCode9;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SendRecommendationResponse(id=" + this.id + ", recommenderMsisdn=" + this.recommenderMsisdn + ", recommendeeMsisdn=" + this.recommendeeMsisdn + ", status=" + this.status + ", awardStatus=" + this.awardStatus + ", dateCreated=" + this.dateCreated + ", dateUpdated=" + this.dateUpdated + ", channel=" + this.channel + ", productName=" + this.productName + ", productId=" + this.productId + ")";
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 45 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.id);
        dest.writeString(this.recommenderMsisdn);
        dest.writeString(this.recommendeeMsisdn);
        dest.writeInt(this.status);
        dest.writeInt(this.awardStatus);
        dest.writeString(this.dateCreated);
        dest.writeString(this.dateUpdated);
        dest.writeString(this.channel);
        dest.writeString(this.productName);
        dest.writeString(this.productId);
        int i4 = ShareDataUIState + 73;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
