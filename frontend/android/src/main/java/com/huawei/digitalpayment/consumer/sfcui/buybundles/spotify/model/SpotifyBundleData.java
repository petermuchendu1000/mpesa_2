package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u001bJb\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÇ\u0001¢\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\fH\u0007J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010)H×\u0003J\t\u0010*\u001a\u00020\fH×\u0001J\t\u0010+\u001a\u00020\u0005H×\u0001J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\fH\u0007R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyBundleData;", "Landroid/os/Parcelable;", "autoRenewal", "", "contentUrl", "", "duration", "productId", "productName", "productPrice", "", "resourceAmount", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)V", "getAutoRenewal", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getContentUrl", "()Ljava/lang/String;", LottieConstants.METHOD_GET_DURATION, "getProductId", "getProductName", "getProductPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getResourceAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/spotify/model/SpotifyBundleData;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpotifyBundleData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SpotifyBundleData> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;

    @SerializedName("autoRenewal")
    private final Boolean autoRenewal;

    @SerializedName("contentUrl")
    private final String contentUrl;

    @SerializedName("duration")
    private final String duration;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productPrice")
    private final Double productPrice;

    @SerializedName("resourceAmount")
    private final Integer resourceAmount;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpotifyBundleData> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpotifyBundleData createFromParcel(Parcel parcel) {
            boolean z;
            Boolean bool;
            Double d2;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                if (parcel.readInt() != 0) {
                    int i2 = ShareDataUIState + 51;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                int i4 = ShareDataUIState + 109;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 2 / 2;
                }
                bool = boolValueOf;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i6 = component3 + 63;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                d2 = null;
            } else {
                Double dValueOf = Double.valueOf(parcel.readDouble());
                int i8 = ShareDataUIState + 25;
                component3 = i8 % 128;
                int i9 = i8 % 2;
                d2 = dValueOf;
            }
            if (parcel.readInt() == 0) {
                int i10 = ShareDataUIState + 17;
                component3 = i10 % 128;
                if (i10 % 2 == 0) {
                    numValueOf.hashCode();
                    throw null;
                }
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            return new SpotifyBundleData(bool, string, string2, string3, string4, d2, numValueOf);
        }

        @Override
        public SpotifyBundleData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 15;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final SpotifyBundleData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 103;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            SpotifyBundleData[] spotifyBundleDataArr = new SpotifyBundleData[i];
            int i6 = i3 + 115;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return spotifyBundleDataArr;
        }

        @Override
        public SpotifyBundleData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState + 5;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            SpotifyBundleData[] spotifyBundleDataArrNewArray = newArray(i);
            int i4 = ShareDataUIState + 39;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return spotifyBundleDataArrNewArray;
        }
    }

    public SpotifyBundleData(Boolean bool, String str, String str2, String str3, String str4, Double d2, Integer num) {
        this.autoRenewal = bool;
        this.contentUrl = str;
        this.duration = str2;
        this.productId = str3;
        this.productName = str4;
        this.productPrice = d2;
        this.resourceAmount = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SpotifyBundleData(Boolean bool, String str, String str2, String str3, String str4, Double d2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        if ((i & 1) != 0) {
            int i2 = component1 + 33;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 27;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 3;
            } else {
                int i7 = 2 % 2;
            }
            bool = null;
        }
        String str6 = "";
        if ((i & 2) != 0) {
            int i8 = component2 + 109;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str5 = "";
        } else {
            str5 = str;
        }
        String str7 = (i & 4) != 0 ? "" : str2;
        String str8 = (i & 8) != 0 ? "" : str3;
        if ((i & 16) != 0) {
            int i11 = component1 + 117;
            component2 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 5 / 4;
            } else {
                int i13 = 2 % 2;
            }
        } else {
            str6 = str4;
        }
        this(bool, str5, str7, str8, str6, (i & 32) != 0 ? null : d2, (i & 64) == 0 ? num : null);
    }

    public final Boolean getAutoRenewal() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Boolean bool = this.autoRenewal;
        int i5 = i2 + 87;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String getContentUrl() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.contentUrl;
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        return str;
    }

    public final String getDuration() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 49;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.duration;
        int i4 = i2 + 19;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 47 / 0;
        }
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component2 + 57;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.productId;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productName;
        int i5 = i3 + 13;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Double getProductPrice() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Double d2 = this.productPrice;
        int i5 = i2 + 51;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return d2;
    }

    public final Integer getResourceAmount() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.resourceAmount;
        }
        throw null;
    }

    static {
        int i = ShareDataUIState + 29;
        component3 = i % 128;
        int i2 = i % 2;
    }

    public SpotifyBundleData() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static SpotifyBundleData copy$default(SpotifyBundleData spotifyBundleData, Boolean bool, String str, String str2, String str3, String str4, Double d2, Integer num, int i, Object obj) {
        Boolean bool2;
        String str5;
        String str6;
        String str7;
        Double d3;
        Integer num2;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 41;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            bool2 = spotifyBundleData.autoRenewal;
        } else {
            bool2 = bool;
        }
        if ((i & 2) != 0) {
            int i5 = component2 + 119;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                String str8 = spotifyBundleData.contentUrl;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str5 = spotifyBundleData.contentUrl;
        } else {
            str5 = str;
        }
        if ((i & 4) != 0) {
            int i6 = component2 + 103;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str6 = spotifyBundleData.duration;
        } else {
            str6 = str2;
        }
        String str9 = (i & 8) != 0 ? spotifyBundleData.productId : str3;
        if ((i & 16) != 0) {
            int i8 = component1 + 35;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str7 = spotifyBundleData.productName;
        } else {
            str7 = str4;
        }
        if ((i & 32) != 0) {
            d3 = spotifyBundleData.productPrice;
            int i10 = component2 + 35;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        } else {
            d3 = d2;
        }
        if ((i & 64) != 0) {
            int i12 = component1 + 89;
            component2 = i12 % 128;
            int i13 = i12 % 2;
            num2 = spotifyBundleData.resourceAmount;
        } else {
            num2 = num;
        }
        SpotifyBundleData spotifyBundleDataCopy = spotifyBundleData.copy(bool2, str5, str6, str9, str7, d3, num2);
        int i14 = component2 + 99;
        component1 = i14 % 128;
        int i15 = i14 % 2;
        return spotifyBundleDataCopy;
    }

    public final Boolean component1() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            bool = this.autoRenewal;
            int i4 = 13 / 0;
        } else {
            bool = this.autoRenewal;
        }
        int i5 = i2 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return bool;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 51;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.contentUrl;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 5;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.duration;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.productName;
        int i4 = i2 + 1;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Double component6() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Double d2 = this.productPrice;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return d2;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.resourceAmount;
        int i4 = i3 + 69;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final SpotifyBundleData copy(Boolean autoRenewal, String contentUrl, String duration, String productId, String productName, Double productPrice, Integer resourceAmount) {
        int i = 2 % 2;
        SpotifyBundleData spotifyBundleData = new SpotifyBundleData(autoRenewal, contentUrl, duration, productId, productName, productPrice, resourceAmount);
        int i2 = component1 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return spotifyBundleData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SpotifyBundleData)) {
            int i4 = component2 + 87;
            component1 = i4 % 128;
            return i4 % 2 == 0;
        }
        SpotifyBundleData spotifyBundleData = (SpotifyBundleData) other;
        if (!Intrinsics.areEqual(this.autoRenewal, spotifyBundleData.autoRenewal)) {
            int i5 = component2 + 93;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.contentUrl, spotifyBundleData.contentUrl) || !Intrinsics.areEqual(this.duration, spotifyBundleData.duration)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, spotifyBundleData.productId)) {
            int i7 = component1 + 45;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, spotifyBundleData.productName) || !Intrinsics.areEqual((Object) this.productPrice, (Object) spotifyBundleData.productPrice)) {
            return false;
        }
        if (Intrinsics.areEqual(this.resourceAmount, spotifyBundleData.resourceAmount)) {
            return true;
        }
        int i9 = component1 + 71;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        Boolean bool;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component1 + 31;
        component2 = i2 % 128;
        int iHashCode3 = (i2 % 2 == 0 ? (bool = this.autoRenewal) != null : (bool = this.autoRenewal) != null) ? bool.hashCode() : 0;
        String str = this.contentUrl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.duration;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.productId;
        if (str3 == null) {
            int i3 = component2 + 89;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str3.hashCode();
        }
        String str4 = this.productName;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        Double d2 = this.productPrice;
        if (d2 == null) {
            int i5 = component2 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = d2.hashCode();
        }
        Integer num = this.resourceAmount;
        return (((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SpotifyBundleData(autoRenewal=" + this.autoRenewal + ", contentUrl=" + this.contentUrl + ", duration=" + this.duration + ", productId=" + this.productId + ", productName=" + this.productName + ", productPrice=" + this.productPrice + ", resourceAmount=" + this.resourceAmount + ")";
        int i2 = component1 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        Boolean bool = this.autoRenewal;
        if (bool == null) {
            int i2 = component1 + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.contentUrl);
        dest.writeString(this.duration);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        Double d2 = this.productPrice;
        if (d2 == null) {
            int i4 = component2 + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d2.doubleValue());
        }
        Integer num = this.resourceAmount;
        if (num == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(num.intValue());
        int i6 = component1 + 109;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }
}
