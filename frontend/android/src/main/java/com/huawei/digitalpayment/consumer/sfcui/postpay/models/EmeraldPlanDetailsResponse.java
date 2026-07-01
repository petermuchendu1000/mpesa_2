package com.huawei.digitalpayment.consumer.sfcui.postpay.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.core.GriverParams;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\bQ\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008c\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\r\u0010\u000f\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\r\u0010\u0014\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\n\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020\n\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010$\u001a\u00020\n\u0012\u0006\u0010%\u001a\u00020\n¢\u0006\u0004\b&\u0010'J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006HÆ\u0003J\t\u0010M\u001a\u00020\bHÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\t\u0010O\u001a\u00020\nHÆ\u0003J\t\u0010P\u001a\u00020\bHÆ\u0003J\t\u0010Q\u001a\u00020\nHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\u0010\u0010S\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006HÆ\u0003J\t\u0010T\u001a\u00020\bHÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003J\t\u0010V\u001a\u00020\u0003HÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\u0010\u0010X\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u0006HÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\t\u0010Z\u001a\u00020\bHÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\bHÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\u001eHÆ\u0003J\t\u0010b\u001a\u00020\u001eHÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\u001eHÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\t\u0010g\u001a\u00020\nHÆ\u0003J\t\u0010h\u001a\u00020\nHÆ\u0003JÊ\u0002\u0010i\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000f\b\u0002\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u000f\b\u0002\u0010\u000f\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\n2\u000f\b\u0002\u0010\u0014\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00062\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u001e2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\nHÇ\u0001J\b\u0010j\u001a\u00020\nH\u0007J\u0013\u0010k\u001a\u00020\u00032\b\u0010l\u001a\u0004\u0018\u00010\u0005H×\u0003J\t\u0010m\u001a\u00020\nH×\u0001J\t\u0010n\u001a\u00020\bH×\u0001J\u0018\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020\nH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010\u0004\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-R\u0016\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010/R\u001d\u0010\u000f\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010-R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010)R\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010/R\u001d\u0010\u0014\u001a\t\u0018\u00010\u0005¢\u0006\u0002\b\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010+R\u0016\u0010\u0015\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010-R\u0016\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010-R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010)R\u0016\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010-R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010)R\u0016\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010-R\u0016\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010-R\u0016\u0010\u001d\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010CR\u0016\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010/R\u0016\u0010!\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010CR\u0016\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0016\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010/R\u0016\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010/R\u0016\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010/¨\u0006t"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/models/EmeraldPlanDetailsResponse;", "Landroid/os/Parcelable;", "active", "", "contractPeriod", "", "Lkotlinx/parcelize/RawValue;", "customerDisplayMessage", "", "dataBundles", "", "dayOfTheMonth", "description", "deviceDownPayment", "deviceLmmPrice", "deviceName", "dmpProductId", "dmpProductName", "hybrid", GriverCacheDao.COLUMN_CACHE_ID, GriverParams.ShareParams.IMAGE_URL, "newProductName", "planApplication", "postpay", "postpayProductName", "prepay", FirebaseAnalytics.Param.PRICE, "productId", "productName", "proratedDataBundles", "", "proratedPrice", "proratedSmsBundles", "proratedVoiceBundles", "smsBundles", "totalDaysInTheMonth", "totalRemainingDaysInTheMonth", "voiceBundles", "<init>", "(ZLjava/lang/Object;Ljava/lang/String;IILjava/lang/String;IILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZILjava/lang/String;Ljava/lang/String;DDIDIIII)V", "getActive", "()Z", "getContractPeriod", "()Ljava/lang/Object;", "getCustomerDisplayMessage", "()Ljava/lang/String;", "getDataBundles", "()I", "getDayOfTheMonth", "getDescription", "getDeviceDownPayment", "getDeviceLmmPrice", "getDeviceName", "getDmpProductId", "getDmpProductName", "getHybrid", "getId", "getImageUrl", "getNewProductName", "getPlanApplication", "getPostpay", "getPostpayProductName", "getPrepay", "getPrice", "getProductId", "getProductName", "getProratedDataBundles", "()D", "getProratedPrice", "getProratedSmsBundles", "getProratedVoiceBundles", "getSmsBundles", "getTotalDaysInTheMonth", "getTotalRemainingDaysInTheMonth", "getVoiceBundles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "describeContents", "equals", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EmeraldPlanDetailsResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EmeraldPlanDetailsResponse> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("active")
    private final boolean active;

    @SerializedName("contractPeriod")
    private final Object contractPeriod;

    @SerializedName("customerDisplayMessage")
    private final String customerDisplayMessage;

    @SerializedName("dataBundles")
    private final int dataBundles;

    @SerializedName("dayOfTheMonth")
    private final int dayOfTheMonth;

    @SerializedName("description")
    private final String description;

    @SerializedName("deviceDownPayment")
    private final int deviceDownPayment;

    @SerializedName("deviceLmmPrice")
    private final int deviceLmmPrice;

    @SerializedName("deviceName")
    private final Object deviceName;

    @SerializedName("dmpProductId")
    private final String dmpProductId;

    @SerializedName("dmpProductName")
    private final String dmpProductName;

    @SerializedName("hybrid")
    private final boolean hybrid;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final int id;

    @SerializedName(GriverParams.ShareParams.IMAGE_URL)
    private final Object imageUrl;

    @SerializedName("newProductName")
    private final String newProductName;

    @SerializedName("planApplication")
    private final String planApplication;

    @SerializedName("postpay")
    private final boolean postpay;

    @SerializedName("postpayProductName")
    private final String postpayProductName;

    @SerializedName("prepay")
    private final boolean prepay;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final int price;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("proratedDataBundles")
    private final double proratedDataBundles;

    @SerializedName("proratedPrice")
    private final double proratedPrice;

    @SerializedName("proratedSmsBundles")
    private final int proratedSmsBundles;

    @SerializedName("proratedVoiceBundles")
    private final double proratedVoiceBundles;

    @SerializedName("smsBundles")
    private final int smsBundles;

    @SerializedName("totalDaysInTheMonth")
    private final int totalDaysInTheMonth;

    @SerializedName("totalRemainingDaysInTheMonth")
    private final int totalRemainingDaysInTheMonth;

    @SerializedName("voiceBundles")
    private final int voiceBundles;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EmeraldPlanDetailsResponse> {
        private static int component2 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldPlanDetailsResponse createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() != 0) {
                int i2 = component2;
                int i3 = i2 + 119;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 13;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                z = true;
            } else {
                z = false;
            }
            Object value = parcel.readValue(EmeraldPlanDetailsResponse.class.getClassLoader());
            String string = parcel.readString();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            String string2 = parcel.readString();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            Object value2 = parcel.readValue(EmeraldPlanDetailsResponse.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            int i11 = parcel.readInt();
            Object value3 = parcel.readValue(EmeraldPlanDetailsResponse.class.getClassLoader());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = component2 + 123;
                component3 = i12 % 128;
                z2 = i12 % 2 != 0;
            } else {
                z2 = false;
            }
            return new EmeraldPlanDetailsResponse(z, value, string, i7, i8, string2, i9, i10, value2, string3, string4, z3, i11, value3, string5, string6, z2, parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override
        public EmeraldPlanDetailsResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            EmeraldPlanDetailsResponse emeraldPlanDetailsResponseCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 109;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return emeraldPlanDetailsResponseCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final EmeraldPlanDetailsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 33;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            EmeraldPlanDetailsResponse[] emeraldPlanDetailsResponseArr = new EmeraldPlanDetailsResponse[i];
            int i6 = i3 + 69;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return emeraldPlanDetailsResponseArr;
        }

        @Override
        public EmeraldPlanDetailsResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 41;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            EmeraldPlanDetailsResponse[] emeraldPlanDetailsResponseArrNewArray = newArray(i);
            int i4 = component2 + 77;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return emeraldPlanDetailsResponseArrNewArray;
        }
    }

    public EmeraldPlanDetailsResponse(boolean z, Object obj, String str, int i, int i2, String str2, int i3, int i4, Object obj2, String str3, String str4, boolean z2, int i5, Object obj3, String str5, String str6, boolean z3, String str7, boolean z4, int i6, String str8, String str9, double d2, double d3, int i7, double d4, int i8, int i9, int i10, int i11) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.active = z;
        this.contractPeriod = obj;
        this.customerDisplayMessage = str;
        this.dataBundles = i;
        this.dayOfTheMonth = i2;
        this.description = str2;
        this.deviceDownPayment = i3;
        this.deviceLmmPrice = i4;
        this.deviceName = obj2;
        this.dmpProductId = str3;
        this.dmpProductName = str4;
        this.hybrid = z2;
        this.id = i5;
        this.imageUrl = obj3;
        this.newProductName = str5;
        this.planApplication = str6;
        this.postpay = z3;
        this.postpayProductName = str7;
        this.prepay = z4;
        this.price = i6;
        this.productId = str8;
        this.productName = str9;
        this.proratedDataBundles = d2;
        this.proratedPrice = d3;
        this.proratedSmsBundles = i7;
        this.proratedVoiceBundles = d4;
        this.smsBundles = i8;
        this.totalDaysInTheMonth = i9;
        this.totalRemainingDaysInTheMonth = i10;
        this.voiceBundles = i11;
    }

    public final boolean getActive() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.active;
        int i5 = i3 + 67;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Object getContractPeriod() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = this.contractPeriod;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return obj;
    }

    public final String getCustomerDisplayMessage() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerDisplayMessage;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getDataBundles() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.dataBundles;
        int i6 = i3 + 13;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getDayOfTheMonth() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.dayOfTheMonth;
        if (i3 != 0) {
            int i5 = 49 / 0;
        }
        return i4;
    }

    public final String getDescription() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.description;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getDeviceDownPayment() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = this.deviceDownPayment;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final int getDeviceLmmPrice() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.deviceLmmPrice;
        if (i3 != 0) {
            int i5 = 17 / 0;
        }
        return i4;
    }

    public final Object getDeviceName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.deviceName;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    public final String getDmpProductId() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.dmpProductId;
            int i4 = 28 / 0;
        } else {
            str = this.dmpProductId;
        }
        int i5 = i2 + 73;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getDmpProductName() {
        int i = 2 % 2;
        int i2 = component3 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.dmpProductName;
        int i4 = i3 + 111;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final boolean getHybrid() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        boolean z = this.hybrid;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int getId() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.id;
        int i6 = i2 + 45;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Object getImageUrl() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 101;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.imageUrl;
        int i5 = i2 + 3;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return obj;
    }

    public final String getNewProductName() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.newProductName;
        int i4 = i2 + 71;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getPlanApplication() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.planApplication;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getPostpay() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.postpay;
        int i4 = i3 + 103;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final String getPostpayProductName() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.postpayProductName;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean getPrepay() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 75;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.prepay;
        int i4 = i2 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return z;
    }

    public final int getPrice() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.price;
        int i6 = i2 + 25;
        component3 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 45 / 0;
        }
        return i5;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 7;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 85;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i3 + 41;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final double getProratedDataBundles() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 119;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.proratedDataBundles;
        int i5 = i2 + 11;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return d2;
    }

    public final double getProratedPrice() {
        int i = 2 % 2;
        int i2 = component3 + 1;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.proratedPrice;
        }
        throw null;
    }

    public final int getProratedSmsBundles() {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        component2 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.proratedSmsBundles;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final double getProratedVoiceBundles() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 73;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        double d2 = this.proratedVoiceBundles;
        int i5 = i2 + 101;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final int getSmsBundles() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.smsBundles;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTotalDaysInTheMonth() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.totalDaysInTheMonth;
        int i6 = i3 + 23;
        component3 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int getTotalRemainingDaysInTheMonth() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalRemainingDaysInTheMonth;
        int i6 = i2 + 37;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int getVoiceBundles() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.voiceBundles;
        int i6 = i2 + 57;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static {
        int i = copydefault + 77;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static EmeraldPlanDetailsResponse copy$default(EmeraldPlanDetailsResponse emeraldPlanDetailsResponse, boolean z, Object obj, String str, int i, int i2, String str2, int i3, int i4, Object obj2, String str3, String str4, boolean z2, int i5, Object obj3, String str5, String str6, boolean z3, String str7, boolean z4, int i6, String str8, String str9, double d2, double d3, int i7, double d4, int i8, int i9, int i10, int i11, int i12, Object obj4) {
        int i13;
        int i14;
        Object obj5;
        boolean z5;
        int i15;
        Object obj6;
        String str10;
        String str11;
        String str12;
        boolean z6;
        boolean z7;
        String str13;
        String str14;
        double d5;
        int i16;
        int i17;
        int i18;
        int i19 = 2 % 2;
        int i20 = component3;
        int i21 = i20 + 23;
        component2 = i21 % 128;
        boolean z8 = (i21 % 2 == 0 || (i12 & 1) == 0) ? z : emeraldPlanDetailsResponse.active;
        Object obj7 = (i12 & 2) != 0 ? emeraldPlanDetailsResponse.contractPeriod : obj;
        String str15 = (i12 & 4) != 0 ? emeraldPlanDetailsResponse.customerDisplayMessage : str;
        if ((i12 & 8) != 0) {
            int i22 = i20 + 37;
            component2 = i22 % 128;
            if (i22 % 2 == 0) {
                int i23 = emeraldPlanDetailsResponse.dataBundles;
                throw null;
            }
            i13 = emeraldPlanDetailsResponse.dataBundles;
        } else {
            i13 = i;
        }
        if ((i12 & 16) != 0) {
            int i24 = i20 + 79;
            component2 = i24 % 128;
            if (i24 % 2 == 0) {
                i14 = emeraldPlanDetailsResponse.dayOfTheMonth;
                int i25 = 39 / 0;
            } else {
                i14 = emeraldPlanDetailsResponse.dayOfTheMonth;
            }
        } else {
            i14 = i2;
        }
        String str16 = (i12 & 32) != 0 ? emeraldPlanDetailsResponse.description : str2;
        int i26 = (i12 & 64) != 0 ? emeraldPlanDetailsResponse.deviceDownPayment : i3;
        int i27 = (i12 & 128) != 0 ? emeraldPlanDetailsResponse.deviceLmmPrice : i4;
        if ((i12 & 256) != 0) {
            int i28 = component2 + 69;
            component3 = i28 % 128;
            int i29 = i28 % 2;
            obj5 = emeraldPlanDetailsResponse.deviceName;
        } else {
            obj5 = obj2;
        }
        String str17 = (i12 & 512) != 0 ? emeraldPlanDetailsResponse.dmpProductId : str3;
        String str18 = (i12 & 1024) != 0 ? emeraldPlanDetailsResponse.dmpProductName : str4;
        boolean z9 = (i12 & 2048) != 0 ? emeraldPlanDetailsResponse.hybrid : z2;
        if ((i12 & 4096) != 0) {
            int i30 = component2 + 5;
            z5 = z9;
            component3 = i30 % 128;
            int i31 = i30 % 2;
            i15 = emeraldPlanDetailsResponse.id;
        } else {
            z5 = z9;
            i15 = i5;
        }
        Object obj8 = (i12 & 8192) != 0 ? emeraldPlanDetailsResponse.imageUrl : obj3;
        if ((i12 & 16384) != 0) {
            int i32 = component2 + 17;
            obj6 = obj8;
            component3 = i32 % 128;
            if (i32 % 2 != 0) {
                String str19 = emeraldPlanDetailsResponse.newProductName;
                throw null;
            }
            str10 = emeraldPlanDetailsResponse.newProductName;
        } else {
            obj6 = obj8;
            str10 = str5;
        }
        String str20 = (32768 & i12) != 0 ? emeraldPlanDetailsResponse.planApplication : str6;
        boolean z10 = (i12 & 65536) != 0 ? emeraldPlanDetailsResponse.postpay : z3;
        String str21 = (i12 & 131072) != 0 ? emeraldPlanDetailsResponse.postpayProductName : str7;
        if ((i12 & 262144) != 0) {
            str12 = str21;
            int i33 = component3 + 5;
            str11 = str10;
            component2 = i33 % 128;
            if (i33 % 2 == 0) {
                boolean z11 = emeraldPlanDetailsResponse.prepay;
                Object obj9 = null;
                obj9.hashCode();
                throw null;
            }
            z6 = emeraldPlanDetailsResponse.prepay;
        } else {
            str11 = str10;
            str12 = str21;
            z6 = z4;
        }
        int i34 = (524288 & i12) != 0 ? emeraldPlanDetailsResponse.price : i6;
        String str22 = (i12 & 1048576) != 0 ? emeraldPlanDetailsResponse.productId : str8;
        String str23 = (i12 & 2097152) != 0 ? emeraldPlanDetailsResponse.productName : str9;
        if ((i12 & 4194304) != 0) {
            str14 = str23;
            int i35 = component2 + 39;
            z7 = z6;
            component3 = i35 % 128;
            str13 = str18;
            if (i35 % 2 != 0) {
                d5 = emeraldPlanDetailsResponse.proratedDataBundles;
                int i36 = 44 / 0;
            } else {
                d5 = emeraldPlanDetailsResponse.proratedDataBundles;
            }
        } else {
            z7 = z6;
            str13 = str18;
            str14 = str23;
            d5 = d2;
        }
        double d6 = d5;
        double d7 = (8388608 & i12) != 0 ? emeraldPlanDetailsResponse.proratedPrice : d3;
        int i37 = (16777216 & i12) != 0 ? emeraldPlanDetailsResponse.proratedSmsBundles : i7;
        double d8 = d7;
        double d9 = (i12 & 33554432) != 0 ? emeraldPlanDetailsResponse.proratedVoiceBundles : d4;
        int i38 = (i12 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? emeraldPlanDetailsResponse.smsBundles : i8;
        int i39 = (134217728 & i12) != 0 ? emeraldPlanDetailsResponse.totalDaysInTheMonth : i9;
        if ((i12 & 268435456) != 0) {
            i17 = i39;
            int i40 = component3 + 51;
            i16 = i38;
            component2 = i40 % 128;
            int i41 = i40 % 2;
            i18 = emeraldPlanDetailsResponse.totalRemainingDaysInTheMonth;
        } else {
            i16 = i38;
            i17 = i39;
            i18 = i10;
        }
        EmeraldPlanDetailsResponse emeraldPlanDetailsResponseCopy = emeraldPlanDetailsResponse.copy(z8, obj7, str15, i13, i14, str16, i26, i27, obj5, str17, str13, z5, i15, obj6, str11, str20, z10, str12, z7, i34, str22, str14, d6, d8, i37, d9, i16, i17, i18, (i12 & 536870912) != 0 ? emeraldPlanDetailsResponse.voiceBundles : i11);
        int i42 = component3 + 75;
        component2 = i42 % 128;
        if (i42 % 2 != 0) {
            return emeraldPlanDetailsResponseCopy;
        }
        Object obj10 = null;
        obj10.hashCode();
        throw null;
    }

    public final boolean component1() {
        int i = 2 % 2;
        int i2 = component3 + 125;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        boolean z = this.active;
        int i5 = i3 + 81;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final String component10() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            str = this.dmpProductId;
            int i4 = 92 / 0;
        } else {
            str = this.dmpProductId;
        }
        int i5 = i3 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.dmpProductName;
        }
        throw null;
    }

    public final boolean component12() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.hybrid;
        int i4 = i3 + 101;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final int component13() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.id;
        }
        throw null;
    }

    public final Object component14() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Object obj = this.imageUrl;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 43;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.newProductName;
        int i5 = i2 + 123;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 79;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.planApplication;
        int i5 = i2 + 105;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component17() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.postpay;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.postpayProductName;
        int i5 = i3 + 19;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean component19() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.prepay;
        int i5 = i2 + 15;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = this.contractPeriod;
        int i4 = i2 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public final int component20() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.price;
        int i6 = i2 + 107;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = component3 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final double component23() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        double d2 = this.proratedDataBundles;
        int i5 = i3 + 115;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final double component24() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 61;
        component2 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        double d2 = this.proratedPrice;
        int i4 = i2 + 19;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return d2;
        }
        throw null;
    }

    public final int component25() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.proratedSmsBundles;
        int i6 = i2 + 75;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final double component26() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.proratedVoiceBundles;
        }
        int i3 = 84 / 0;
        return this.proratedVoiceBundles;
    }

    public final int component27() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.smsBundles;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component28() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.totalDaysInTheMonth;
        if (i3 == 0) {
            int i5 = 95 / 0;
        }
        return i4;
    }

    public final int component29() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.totalRemainingDaysInTheMonth;
        int i6 = i2 + 113;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.customerDisplayMessage;
        }
        throw null;
    }

    public final int component30() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        int i5 = this.voiceBundles;
        int i6 = i3 + 67;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component4() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 5;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            i = this.dataBundles;
            int i5 = 28 / 0;
        } else {
            i = this.dataBundles;
        }
        int i6 = i3 + 109;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int component5() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.dayOfTheMonth;
        if (i3 == 0) {
            int i5 = 50 / 0;
        }
        return i4;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component3 + 81;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.description;
        }
        throw null;
    }

    public final int component7() {
        int i;
        int i2 = 2 % 2;
        int i3 = component3 + 63;
        int i4 = i3 % 128;
        component2 = i4;
        if (i3 % 2 == 0) {
            i = this.deviceDownPayment;
            int i5 = 92 / 0;
        } else {
            i = this.deviceDownPayment;
        }
        int i6 = i4 + 37;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.deviceLmmPrice;
        int i6 = i2 + 15;
        component3 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Object component9() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.deviceName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final EmeraldPlanDetailsResponse copy(boolean active, Object contractPeriod, String customerDisplayMessage, int dataBundles, int dayOfTheMonth, String description, int deviceDownPayment, int deviceLmmPrice, Object deviceName, String dmpProductId, String dmpProductName, boolean hybrid, int id, Object imageUrl, String newProductName, String planApplication, boolean postpay, String postpayProductName, boolean prepay, int price, String productId, String productName, double proratedDataBundles, double proratedPrice, int proratedSmsBundles, double proratedVoiceBundles, int smsBundles, int totalDaysInTheMonth, int totalRemainingDaysInTheMonth, int voiceBundles) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(customerDisplayMessage, "");
        Intrinsics.checkNotNullParameter(description, "");
        Intrinsics.checkNotNullParameter(dmpProductId, "");
        Intrinsics.checkNotNullParameter(dmpProductName, "");
        Intrinsics.checkNotNullParameter(newProductName, "");
        Intrinsics.checkNotNullParameter(planApplication, "");
        Intrinsics.checkNotNullParameter(postpayProductName, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        EmeraldPlanDetailsResponse emeraldPlanDetailsResponse = new EmeraldPlanDetailsResponse(active, contractPeriod, customerDisplayMessage, dataBundles, dayOfTheMonth, description, deviceDownPayment, deviceLmmPrice, deviceName, dmpProductId, dmpProductName, hybrid, id, imageUrl, newProductName, planApplication, postpay, postpayProductName, prepay, price, productId, productName, proratedDataBundles, proratedPrice, proratedSmsBundles, proratedVoiceBundles, smsBundles, totalDaysInTheMonth, totalRemainingDaysInTheMonth, voiceBundles);
        int i2 = component3 + 9;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return emeraldPlanDetailsResponse;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmeraldPlanDetailsResponse)) {
            return false;
        }
        EmeraldPlanDetailsResponse emeraldPlanDetailsResponse = (EmeraldPlanDetailsResponse) other;
        if (this.active != emeraldPlanDetailsResponse.active) {
            int i2 = component2 + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contractPeriod, emeraldPlanDetailsResponse.contractPeriod) || !Intrinsics.areEqual(this.customerDisplayMessage, emeraldPlanDetailsResponse.customerDisplayMessage)) {
            return false;
        }
        if (this.dataBundles != emeraldPlanDetailsResponse.dataBundles) {
            int i4 = component3 + 51;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (this.dayOfTheMonth != emeraldPlanDetailsResponse.dayOfTheMonth || !Intrinsics.areEqual(this.description, emeraldPlanDetailsResponse.description)) {
            return false;
        }
        if (this.deviceDownPayment != emeraldPlanDetailsResponse.deviceDownPayment) {
            int i6 = component3 + 53;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (this.deviceLmmPrice != emeraldPlanDetailsResponse.deviceLmmPrice || !Intrinsics.areEqual(this.deviceName, emeraldPlanDetailsResponse.deviceName) || !Intrinsics.areEqual(this.dmpProductId, emeraldPlanDetailsResponse.dmpProductId) || !Intrinsics.areEqual(this.dmpProductName, emeraldPlanDetailsResponse.dmpProductName) || this.hybrid != emeraldPlanDetailsResponse.hybrid || this.id != emeraldPlanDetailsResponse.id) {
            return false;
        }
        if (!Intrinsics.areEqual(this.imageUrl, emeraldPlanDetailsResponse.imageUrl)) {
            int i8 = component3 + 111;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.newProductName, emeraldPlanDetailsResponse.newProductName)) {
            int i10 = component3 + 107;
            component2 = i10 % 128;
            return i10 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.planApplication, emeraldPlanDetailsResponse.planApplication)) {
            return false;
        }
        if (this.postpay != emeraldPlanDetailsResponse.postpay) {
            int i11 = component3 + 61;
            int i12 = i11 % 128;
            component2 = i12;
            int i13 = i11 % 2;
            int i14 = i12 + 37;
            component3 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 89 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.postpayProductName, emeraldPlanDetailsResponse.postpayProductName) || this.prepay != emeraldPlanDetailsResponse.prepay || this.price != emeraldPlanDetailsResponse.price) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, emeraldPlanDetailsResponse.productId)) {
            int i16 = component2 + 109;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, emeraldPlanDetailsResponse.productName) || Double.compare(this.proratedDataBundles, emeraldPlanDetailsResponse.proratedDataBundles) != 0 || Double.compare(this.proratedPrice, emeraldPlanDetailsResponse.proratedPrice) != 0) {
            return false;
        }
        if (this.proratedSmsBundles != emeraldPlanDetailsResponse.proratedSmsBundles) {
            int i18 = component2 + 13;
            component3 = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (Double.compare(this.proratedVoiceBundles, emeraldPlanDetailsResponse.proratedVoiceBundles) != 0) {
            return false;
        }
        if (this.smsBundles == emeraldPlanDetailsResponse.smsBundles) {
            return this.totalDaysInTheMonth == emeraldPlanDetailsResponse.totalDaysInTheMonth && this.totalRemainingDaysInTheMonth == emeraldPlanDetailsResponse.totalRemainingDaysInTheMonth && this.voiceBundles == emeraldPlanDetailsResponse.voiceBundles;
        }
        int i20 = component2 + 77;
        component3 = i20 % 128;
        int i21 = i20 % 2;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[PHI: r2 r4
  0x0027: PHI (r2v66 int) = (r2v5 int), (r2v68 int) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r4v4 java.lang.Object) = (r4v0 java.lang.Object), (r4v6 java.lang.Object) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[PHI: r2
  0x0025: PHI (r2v6 int) = (r2v5 int), (r2v68 int) binds: [B:8:0x0023, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int hashCode() {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.models.EmeraldPlanDetailsResponse.hashCode():int");
    }

    public String toString() {
        int i = 2 % 2;
        String str = "EmeraldPlanDetailsResponse(active=" + this.active + ", contractPeriod=" + this.contractPeriod + ", customerDisplayMessage=" + this.customerDisplayMessage + ", dataBundles=" + this.dataBundles + ", dayOfTheMonth=" + this.dayOfTheMonth + ", description=" + this.description + ", deviceDownPayment=" + this.deviceDownPayment + ", deviceLmmPrice=" + this.deviceLmmPrice + ", deviceName=" + this.deviceName + ", dmpProductId=" + this.dmpProductId + ", dmpProductName=" + this.dmpProductName + ", hybrid=" + this.hybrid + ", id=" + this.id + ", imageUrl=" + this.imageUrl + ", newProductName=" + this.newProductName + ", planApplication=" + this.planApplication + ", postpay=" + this.postpay + ", postpayProductName=" + this.postpayProductName + ", prepay=" + this.prepay + ", price=" + this.price + ", productId=" + this.productId + ", productName=" + this.productName + ", proratedDataBundles=" + this.proratedDataBundles + ", proratedPrice=" + this.proratedPrice + ", proratedSmsBundles=" + this.proratedSmsBundles + ", proratedVoiceBundles=" + this.proratedVoiceBundles + ", smsBundles=" + this.smsBundles + ", totalDaysInTheMonth=" + this.totalDaysInTheMonth + ", totalRemainingDaysInTheMonth=" + this.totalRemainingDaysInTheMonth + ", voiceBundles=" + this.voiceBundles + ")";
        int i2 = component3 + 55;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeInt(this.active ? 1 : 0);
        dest.writeValue(this.contractPeriod);
        dest.writeString(this.customerDisplayMessage);
        dest.writeInt(this.dataBundles);
        dest.writeInt(this.dayOfTheMonth);
        dest.writeString(this.description);
        dest.writeInt(this.deviceDownPayment);
        dest.writeInt(this.deviceLmmPrice);
        dest.writeValue(this.deviceName);
        dest.writeString(this.dmpProductId);
        dest.writeString(this.dmpProductName);
        dest.writeInt(this.hybrid ? 1 : 0);
        dest.writeInt(this.id);
        dest.writeValue(this.imageUrl);
        dest.writeString(this.newProductName);
        dest.writeString(this.planApplication);
        dest.writeInt(this.postpay ? 1 : 0);
        dest.writeString(this.postpayProductName);
        dest.writeInt(this.prepay ? 1 : 0);
        dest.writeInt(this.price);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        dest.writeDouble(this.proratedDataBundles);
        dest.writeDouble(this.proratedPrice);
        dest.writeInt(this.proratedSmsBundles);
        dest.writeDouble(this.proratedVoiceBundles);
        dest.writeInt(this.smsBundles);
        dest.writeInt(this.totalDaysInTheMonth);
        dest.writeInt(this.totalRemainingDaysInTheMonth);
        dest.writeInt(this.voiceBundles);
        int i4 = component2 + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }
}
