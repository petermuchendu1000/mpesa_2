package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b4\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\t\u0010;\u001a\u00020\bHÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010+J¬\u0001\u0010>\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000eHÇ\u0001¢\u0006\u0002\u0010?J\b\u0010@\u001a\u00020\u000eH\u0007J\u0013\u0010A\u001a\u00020\u00062\b\u0010B\u001a\u0004\u0018\u00010CH×\u0003J\t\u0010D\u001a\u00020\u000eH×\u0001J\t\u0010E\u001a\u00020\bH×\u0001J\u0018\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020\u000eH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006K"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "Landroid/os/Parcelable;", "diyAccountDetails", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYAccountDetail;", "autoRenew", "", "bundleData", "", "bundleMins", "bundleSms", "offerPeriod", "payBill", "productAmount", "", "productId", "productName", "productOfferId", "productUnits", "validity", "validityType", "icon", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getDiyAccountDetails", "()Ljava/util/List;", "getAutoRenew", "()Z", "getBundleData", "()Ljava/lang/String;", "getBundleMins", "getBundleSms", "getOfferPeriod", "getPayBill", "getProductAmount", "()I", "getProductId", "getProductName", "getProductOfferId", "getProductUnits", "getValidity", "getValidityType", "getIcon", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DIYBundle implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DIYBundle> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("autoRenew")
    private final boolean autoRenew;

    @SerializedName("bundleData")
    private final String bundleData;

    @SerializedName("bundleMins")
    private final String bundleMins;

    @SerializedName("bundleSms")
    private final String bundleSms;

    @SerializedName("accountIdDetails")
    private final List<DIYAccountDetail> diyAccountDetails;
    private Integer icon;

    @SerializedName("offerPeriod")
    private final String offerPeriod;

    @SerializedName("payBill")
    private final String payBill;

    @SerializedName("productAmount")
    private final int productAmount;

    @SerializedName("productId")
    private final String productId;

    @SerializedName("productName")
    private final String productName;

    @SerializedName("productOfferId")
    private final String productOfferId;

    @SerializedName("productUnits")
    private final String productUnits;

    @SerializedName("validity")
    private final String validity;

    @SerializedName("validityType")
    private final String validityType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DIYBundle> {
        private static int component3 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYBundle createFromParcel(Parcel parcel) {
            Integer numValueOf;
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                int i4 = component3 + 31;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(DIYAccountDetail.CREATOR.createFromParcel(parcel));
            }
            ArrayList arrayList2 = arrayList;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i6 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                int i7 = component3 + 63;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
            }
            return new DIYBundle(arrayList2, z, string, string2, string3, string4, string5, i6, string6, string7, string8, string9, string10, string11, numValueOf);
        }

        @Override
        public DIYBundle createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                createFromParcel(parcel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            DIYBundle dIYBundleCreateFromParcel = createFromParcel(parcel);
            int i3 = component3 + 19;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return dIYBundleCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DIYBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 47;
            component3 = i4 % 128;
            DIYBundle[] dIYBundleArr = new DIYBundle[i];
            if (i4 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 51;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return dIYBundleArr;
        }

        @Override
        public DIYBundle[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 7;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            DIYBundle[] dIYBundleArrNewArray = newArray(i);
            int i5 = component3 + 21;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 50 / 0;
            }
            return dIYBundleArrNewArray;
        }
    }

    public DIYBundle(List<DIYAccountDetail> list, boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.diyAccountDetails = list;
        this.autoRenew = z;
        this.bundleData = str;
        this.bundleMins = str2;
        this.bundleSms = str3;
        this.offerPeriod = str4;
        this.payBill = str5;
        this.productAmount = i;
        this.productId = str6;
        this.productName = str7;
        this.productOfferId = str8;
        this.productUnits = str9;
        this.validity = str10;
        this.validityType = str11;
        this.icon = num;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DIYBundle(List list, boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        List listEmptyList = (i2 & 1) != 0 ? CollectionsKt.emptyList() : list;
        boolean z2 = (i2 & 2) != 0 ? false : z;
        String str19 = (i2 & 4) != 0 ? "" : str;
        String str20 = (i2 & 8) != 0 ? "" : str2;
        if ((i2 & 16) != 0) {
            int i3 = 2 % 2;
            str12 = "";
        } else {
            str12 = str3;
        }
        Object obj = null;
        if ((i2 & 32) != 0) {
            int i4 = component3 + 109;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            int i5 = 2 % 2;
            str13 = "";
        } else {
            str13 = str4;
        }
        if ((i2 & 64) != 0) {
            int i6 = copydefault;
            int i7 = i6 + 71;
            component3 = i7 % 128;
            if (i7 % 2 == 0) {
                throw null;
            }
            int i8 = i6 + 73;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str14 = "";
        } else {
            str14 = str5;
        }
        int i11 = (i2 & 128) != 0 ? 0 : i;
        String str21 = (i2 & 256) != 0 ? "" : str6;
        if ((i2 & 512) != 0) {
            int i12 = component3 + 119;
            copydefault = i12 % 128;
            if (i12 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str15 = "";
        } else {
            str15 = str7;
        }
        String str22 = (i2 & 1024) != 0 ? "" : str8;
        if ((i2 & 2048) != 0) {
            int i13 = component3 + 15;
            copydefault = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 % 2;
            }
            str16 = "";
        } else {
            str16 = str9;
        }
        if ((i2 & 4096) != 0) {
            int i15 = 2 % 2;
            str17 = "";
        } else {
            str17 = str10;
        }
        if ((i2 & 8192) != 0) {
            int i16 = copydefault + 7;
            str18 = "";
            component3 = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 83 / 0;
            }
        } else {
            str18 = str11;
        }
        this(listEmptyList, z2, str19, str20, str12, str13, str14, i11, str21, str15, str22, str16, str17, str18, (i2 & 16384) != 0 ? null : num);
    }

    public final List<DIYAccountDetail> getDiyAccountDetails() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 55;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<DIYAccountDetail> list = this.diyAccountDetails;
        int i5 = i2 + 95;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final boolean getAutoRenew() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.autoRenew;
        int i5 = i3 + 77;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final String getBundleData() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.bundleData;
        int i5 = i3 + 83;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBundleMins() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleMins;
        int i5 = i2 + 65;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBundleSms() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 123;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.bundleSms;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getOfferPeriod() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.offerPeriod;
        int i4 = i2 + 31;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getPayBill() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.payBill;
        int i4 = i3 + 91;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final int getProductAmount() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = this.productAmount;
        int i6 = i3 + 103;
        copydefault = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productId;
        int i4 = i2 + 113;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component3 + 115;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductOfferId() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 33;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productOfferId;
        int i5 = i2 + 37;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 111;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productUnits;
        int i4 = i2 + 45;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getValidity() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.validity;
        }
        throw null;
    }

    public final String getValidityType() {
        int i = 2 % 2;
        int i2 = component3 + 29;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.validityType;
        int i4 = i3 + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getIcon() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3 + 19;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            num = this.icon;
            int i4 = 1 / 0;
        } else {
            num = this.icon;
        }
        int i5 = i3 + 57;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setIcon(Integer num) {
        int i = 2 % 2;
        int i2 = copydefault + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.icon = num;
        int i5 = i3 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        int i = component1 + 109;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 81 / 0;
        }
    }

    public DIYBundle() {
        this(null, false, null, null, null, null, null, 0, null, null, null, null, null, null, null, 32767, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DIYBundle copy$default(DIYBundle dIYBundle, List list, boolean z, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, int i2, Object obj) {
        String str12;
        int i3;
        String str13;
        String str14;
        String str15;
        int i4 = 2 % 2;
        int i5 = copydefault + 13;
        int i6 = i5 % 128;
        component3 = i6;
        int i7 = i5 % 2;
        List list2 = (i2 & 1) != 0 ? dIYBundle.diyAccountDetails : list;
        boolean z2 = (i2 & 2) != 0 ? dIYBundle.autoRenew : z;
        String str16 = (i2 & 4) != 0 ? dIYBundle.bundleData : str;
        String str17 = (i2 & 8) != 0 ? dIYBundle.bundleMins : str2;
        if ((i2 & 16) != 0) {
            str12 = dIYBundle.bundleSms;
            int i8 = i6 + 45;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        } else {
            str12 = str3;
        }
        String str18 = (i2 & 32) != 0 ? dIYBundle.offerPeriod : str4;
        String str19 = (i2 & 64) != 0 ? dIYBundle.payBill : str5;
        if ((i2 & 128) != 0) {
            int i10 = copydefault + 53;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                i3 = dIYBundle.productAmount;
                int i11 = 90 / 0;
            } else {
                i3 = dIYBundle.productAmount;
            }
        } else {
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            int i12 = copydefault + 65;
            component3 = i12 % 128;
            if (i12 % 2 == 0) {
                String str20 = dIYBundle.productId;
                throw null;
            }
            str13 = dIYBundle.productId;
        } else {
            str13 = str6;
        }
        String str21 = (i2 & 512) != 0 ? dIYBundle.productName : str7;
        String str22 = (i2 & 1024) != 0 ? dIYBundle.productOfferId : str8;
        String str23 = (i2 & 2048) != 0 ? dIYBundle.productUnits : str9;
        String str24 = (i2 & 4096) != 0 ? dIYBundle.validity : str10;
        if ((i2 & 8192) != 0) {
            int i13 = copydefault + 115;
            str14 = str24;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            str15 = dIYBundle.validityType;
        } else {
            str14 = str24;
            str15 = str11;
        }
        return dIYBundle.copy(list2, z2, str16, str17, str12, str18, str19, i3, str13, str21, str22, str23, str14, str15, (i2 & 16384) != 0 ? dIYBundle.icon : num);
    }

    public final List<DIYAccountDetail> component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 33;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        List<DIYAccountDetail> list = this.diyAccountDetails;
        int i4 = i2 + 67;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productName;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 97;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productOfferId;
        int i5 = i2 + 17;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productUnits;
        int i5 = i2 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.validity;
        if (i3 != 0) {
            int i4 = 44 / 0;
        }
        return str;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.validityType;
        int i4 = i2 + 35;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component15() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.icon;
        int i5 = i3 + 95;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = copydefault + 1;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.autoRenew;
        int i5 = i3 + 25;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 65 / 0;
        }
        return z;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.bundleData;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.bundleMins;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.bundleSms;
        int i4 = i3 + 55;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.offerPeriod;
        int i4 = i2 + 51;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.payBill;
        if (i3 != 0) {
            int i4 = 49 / 0;
        }
        return str;
    }

    public final int component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.productAmount;
        int i5 = i2 + 79;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DIYBundle copy(List<DIYAccountDetail> diyAccountDetails, boolean autoRenew, String bundleData, String bundleMins, String bundleSms, String offerPeriod, String payBill, int productAmount, String productId, String productName, String productOfferId, String productUnits, String validity, String validityType, Integer icon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(diyAccountDetails, "");
        Intrinsics.checkNotNullParameter(bundleData, "");
        Intrinsics.checkNotNullParameter(bundleMins, "");
        Intrinsics.checkNotNullParameter(bundleSms, "");
        Intrinsics.checkNotNullParameter(offerPeriod, "");
        Intrinsics.checkNotNullParameter(payBill, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productOfferId, "");
        Intrinsics.checkNotNullParameter(productUnits, "");
        Intrinsics.checkNotNullParameter(validity, "");
        Intrinsics.checkNotNullParameter(validityType, "");
        DIYBundle dIYBundle = new DIYBundle(diyAccountDetails, autoRenew, bundleData, bundleMins, bundleSms, offerPeriod, payBill, productAmount, productId, productName, productOfferId, productUnits, validity, validityType, icon);
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return dIYBundle;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 53;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 20 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof DIYBundle)) {
            return false;
        }
        DIYBundle dIYBundle = (DIYBundle) other;
        if (!Intrinsics.areEqual(this.diyAccountDetails, dIYBundle.diyAccountDetails)) {
            int i2 = component3 + 67;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (this.autoRenew != dIYBundle.autoRenew) {
            int i4 = component3 + 3;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 19 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleData, dIYBundle.bundleData)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleMins, dIYBundle.bundleMins)) {
            int i6 = component3 + 97;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.bundleSms, dIYBundle.bundleSms)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.offerPeriod, dIYBundle.offerPeriod)) {
            int i8 = component3 + 83;
            copydefault = i8 % 128;
            return i8 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.payBill, dIYBundle.payBill)) {
            return false;
        }
        if (this.productAmount != dIYBundle.productAmount) {
            int i9 = component3 + 85;
            copydefault = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productId, dIYBundle.productId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, dIYBundle.productName)) {
            int i11 = component3 + 35;
            copydefault = i11 % 128;
            return i11 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.productOfferId, dIYBundle.productOfferId) || !Intrinsics.areEqual(this.productUnits, dIYBundle.productUnits) || !Intrinsics.areEqual(this.validity, dIYBundle.validity)) {
            return false;
        }
        if (Intrinsics.areEqual(this.validityType, dIYBundle.validityType)) {
            return Intrinsics.areEqual(this.icon, dIYBundle.icon);
        }
        int i12 = copydefault + 71;
        component3 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int iHashCode2 = this.diyAccountDetails.hashCode();
        int iHashCode3 = Boolean.hashCode(this.autoRenew);
        int iHashCode4 = this.bundleData.hashCode();
        int iHashCode5 = this.bundleMins.hashCode();
        int iHashCode6 = this.bundleSms.hashCode();
        int iHashCode7 = this.offerPeriod.hashCode();
        int iHashCode8 = this.payBill.hashCode();
        int iHashCode9 = Integer.hashCode(this.productAmount);
        int iHashCode10 = this.productId.hashCode();
        int iHashCode11 = this.productName.hashCode();
        int iHashCode12 = this.productOfferId.hashCode();
        int iHashCode13 = this.productUnits.hashCode();
        int iHashCode14 = this.validity.hashCode();
        int iHashCode15 = this.validityType.hashCode();
        Integer num = this.icon;
        if (num == null) {
            int i2 = component3 + 41;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num.hashCode();
        }
        int i4 = (((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode;
        int i5 = component3 + 19;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 32 / 0;
        }
        return i4;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DIYBundle(diyAccountDetails=" + this.diyAccountDetails + ", autoRenew=" + this.autoRenew + ", bundleData=" + this.bundleData + ", bundleMins=" + this.bundleMins + ", bundleSms=" + this.bundleSms + ", offerPeriod=" + this.offerPeriod + ", payBill=" + this.payBill + ", productAmount=" + this.productAmount + ", productId=" + this.productId + ", productName=" + this.productName + ", productOfferId=" + this.productOfferId + ", productUnits=" + this.productUnits + ", validity=" + this.validity + ", validityType=" + this.validityType + ", icon=" + this.icon + ")";
        int i2 = component3 + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<DIYAccountDetail> list = this.diyAccountDetails;
        dest.writeInt(list.size());
        Iterator<DIYAccountDetail> it = list.iterator();
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.autoRenew ? 1 : 0);
        dest.writeString(this.bundleData);
        dest.writeString(this.bundleMins);
        dest.writeString(this.bundleSms);
        dest.writeString(this.offerPeriod);
        dest.writeString(this.payBill);
        dest.writeInt(this.productAmount);
        dest.writeString(this.productId);
        dest.writeString(this.productName);
        dest.writeString(this.productOfferId);
        dest.writeString(this.productUnits);
        dest.writeString(this.validity);
        dest.writeString(this.validityType);
        Integer num = this.icon;
        if (num == null) {
            int i4 = component3;
            int i5 = i4 + 71;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 21;
            copydefault = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 4;
            }
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        int i9 = copydefault + 21;
        component3 = i9 % 128;
        int i10 = i9 % 2;
    }
}
