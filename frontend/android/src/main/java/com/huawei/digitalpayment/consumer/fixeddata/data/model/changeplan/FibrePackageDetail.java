package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.beehive.lottie.constants.LottieConstants;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÆ\u0003J\u007f\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000fHÇ\u0001J\b\u0010,\u001a\u00020-H\u0007J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H×\u0003J\t\u00102\u001a\u00020-H×\u0001J\t\u00103\u001a\u00020\u0003H×\u0001J\u0018\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00069"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibrePackageDetail;", "Landroid/os/Parcelable;", "amount", "", "productSpeed", "productType", "productId", "productCode", "productName", "productDescription", "productHierarchy", "duration", "productData", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;", "subPackages", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;Ljava/util/List;)V", "getAmount", "()Ljava/lang/String;", "getProductSpeed", "getProductType", "getProductId", "getProductCode", "getProductName", "getProductDescription", "getProductHierarchy", LottieConstants.METHOD_GET_DURATION, "getProductData", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;", "getSubPackages", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibrePackageDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibrePackageDetail> CREATOR = new Creator();
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private final String amount;
    private final String duration;
    private final String productCode;
    private final FibreProduct.ProductData productData;
    private final String productDescription;
    private final String productHierarchy;
    private final String productId;
    private final String productName;
    private final String productSpeed;
    private final String productType;
    private final List<FibrePackageDetail> subPackages;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibrePackageDetail> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePackageDetail createFromParcel(Parcel parcel) {
            FibreProduct.ProductData productDataCreateFromParcel;
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i4 = 0;
            if (parcel.readInt() == 0) {
                int i5 = component2 + 119;
                copydefault = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 9 / 0;
                }
                productDataCreateFromParcel = null;
            } else {
                productDataCreateFromParcel = FibreProduct.ProductData.CREATOR.createFromParcel(parcel);
            }
            FibreProduct.ProductData productData = productDataCreateFromParcel;
            int i7 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i7);
            while (i4 != i7) {
                int i8 = copydefault + 49;
                int i9 = i7;
                component2 = i8 % 128;
                int i10 = i8 % 2;
                arrayList.add(FibrePackageDetail.CREATOR.createFromParcel(parcel));
                i4 = i10 == 0 ? i4 + 84 : i4 + 1;
                i7 = i9;
            }
            return new FibrePackageDetail(string, string2, string3, string4, string5, string6, string7, string8, string9, productData, arrayList);
        }

        @Override
        public FibrePackageDetail createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FibrePackageDetail fibrePackageDetailCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 73;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return fibrePackageDetailCreateFromParcel;
            }
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibrePackageDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2;
            int i4 = i3 + 5;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            FibrePackageDetail[] fibrePackageDetailArr = new FibrePackageDetail[i];
            int i6 = i3 + 69;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            return fibrePackageDetailArr;
        }

        @Override
        public FibrePackageDetail[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 97;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FibrePackageDetail[] fibrePackageDetailArrNewArray = newArray(i);
            int i5 = copydefault + 53;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return fibrePackageDetailArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public FibrePackageDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FibreProduct.ProductData productData, List<FibrePackageDetail> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.amount = str;
        this.productSpeed = str2;
        this.productType = str3;
        this.productId = str4;
        this.productCode = str5;
        this.productName = str6;
        this.productDescription = str7;
        this.productHierarchy = str8;
        this.duration = str9;
        this.productData = productData;
        this.subPackages = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FibrePackageDetail(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FibreProduct.ProductData productData, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        FibreProduct.ProductData productData2;
        List list2;
        if ((i & 512) != 0) {
            int i2 = component1 + 33;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            productData2 = null;
        } else {
            productData2 = productData;
        }
        if ((i & 1024) != 0) {
            List listEmptyList = CollectionsKt.emptyList();
            int i4 = component2 + 3;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            list2 = listEmptyList;
        } else {
            list2 = list;
        }
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, productData2, list2);
    }

    public final String getAmount() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.amount;
        int i5 = i3 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductSpeed() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productSpeed;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getProductType() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductId() {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductCode() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.productCode;
        int i4 = i3 + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getProductName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productName;
        int i5 = i2 + 35;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getProductDescription() {
        int i = 2 % 2;
        int i2 = component1 + 41;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productDescription;
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductHierarchy() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productHierarchy;
        int i5 = i3 + 29;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getDuration() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.duration;
        int i5 = i2 + 13;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 23 / 0;
        }
        return str;
    }

    public final FibreProduct.ProductData getProductData() {
        FibreProduct.ProductData productData;
        int i = 2 % 2;
        int i2 = component1 + 97;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            productData = this.productData;
            int i4 = 41 / 0;
        } else {
            productData = this.productData;
        }
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return productData;
    }

    public final List<FibrePackageDetail> getSubPackages() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<FibrePackageDetail> list = this.subPackages;
        int i5 = i3 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component3 + 51;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibrePackageDetail copy$default(FibrePackageDetail fibrePackageDetail, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, FibreProduct.ProductData productData, List list, int i, Object obj) {
        String str10;
        FibreProduct.ProductData productData2;
        List list2;
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 53;
        component2 = i4 % 128;
        String str11 = (i4 % 2 != 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : fibrePackageDetail.amount;
        String str12 = (i & 2) != 0 ? fibrePackageDetail.productSpeed : str2;
        String str13 = (i & 4) != 0 ? fibrePackageDetail.productType : str3;
        if ((i & 8) != 0) {
            int i5 = i3 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            str10 = fibrePackageDetail.productId;
        } else {
            str10 = str4;
        }
        String str14 = (i & 16) != 0 ? fibrePackageDetail.productCode : str5;
        String str15 = (i & 32) != 0 ? fibrePackageDetail.productName : str6;
        String str16 = (i & 64) != 0 ? fibrePackageDetail.productDescription : str7;
        String str17 = (i & 128) != 0 ? fibrePackageDetail.productHierarchy : str8;
        String str18 = (i & 256) != 0 ? fibrePackageDetail.duration : str9;
        if ((i & 512) != 0) {
            int i7 = component2 + 29;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            productData2 = fibrePackageDetail.productData;
        } else {
            productData2 = productData;
        }
        if ((i & 1024) != 0) {
            int i9 = component1 + 39;
            component2 = i9 % 128;
            if (i9 % 2 == 0) {
                List<FibrePackageDetail> list3 = fibrePackageDetail.subPackages;
                throw null;
            }
            list2 = fibrePackageDetail.subPackages;
        } else {
            list2 = list;
        }
        return fibrePackageDetail.copy(str11, str12, str13, str10, str14, str15, str16, str17, str18, productData2, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.amount;
        int i4 = i3 + 51;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final FibreProduct.ProductData component10() {
        int i = 2 % 2;
        int i2 = component1 + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productData;
        }
        throw null;
    }

    public final List<FibrePackageDetail> component11() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<FibrePackageDetail> list = this.subPackages;
        int i4 = i3 + 5;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.productSpeed;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 46 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productType;
        int i5 = i3 + 63;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 55;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.productId;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component5() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 119;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            str = this.productCode;
            int i4 = 83 / 0;
        } else {
            str = this.productCode;
        }
        int i5 = i3 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.productName;
        if (i3 != 0) {
            int i4 = 85 / 0;
        }
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.productDescription;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 17;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.productHierarchy;
        int i5 = i2 + 9;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.duration;
        int i4 = i3 + 25;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
        return str;
    }

    public final FibrePackageDetail copy(String amount, String productSpeed, String productType, String productId, String productCode, String productName, String productDescription, String productHierarchy, String duration, FibreProduct.ProductData productData, List<FibrePackageDetail> subPackages) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(productSpeed, "");
        Intrinsics.checkNotNullParameter(productType, "");
        Intrinsics.checkNotNullParameter(productId, "");
        Intrinsics.checkNotNullParameter(productCode, "");
        Intrinsics.checkNotNullParameter(productName, "");
        Intrinsics.checkNotNullParameter(productDescription, "");
        Intrinsics.checkNotNullParameter(productHierarchy, "");
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(subPackages, "");
        FibrePackageDetail fibrePackageDetail = new FibrePackageDetail(amount, productSpeed, productType, productId, productCode, productName, productDescription, productHierarchy, duration, productData, subPackages);
        int i2 = component1 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return fibrePackageDetail;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2 == 0 ? 1 : 0;
        int i5 = i3 + 83;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibrePackageDetail)) {
            int i2 = component1 + 29;
            component2 = i2 % 128;
            return i2 % 2 == 0;
        }
        FibrePackageDetail fibrePackageDetail = (FibrePackageDetail) other;
        if (!Intrinsics.areEqual(this.amount, fibrePackageDetail.amount)) {
            int i3 = component1 + 113;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productSpeed, fibrePackageDetail.productSpeed) || !Intrinsics.areEqual(this.productType, fibrePackageDetail.productType) || !Intrinsics.areEqual(this.productId, fibrePackageDetail.productId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productCode, fibrePackageDetail.productCode)) {
            int i5 = component2 + 75;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.productName, fibrePackageDetail.productName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productDescription, fibrePackageDetail.productDescription)) {
            int i7 = component2 + 15;
            component1 = i7 % 128;
            return i7 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.productHierarchy, fibrePackageDetail.productHierarchy) || !Intrinsics.areEqual(this.duration, fibrePackageDetail.duration)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.productData, fibrePackageDetail.productData)) {
            int i8 = component1 + 43;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.subPackages, fibrePackageDetail.subPackages)) {
            return true;
        }
        int i10 = component2 + 87;
        component1 = i10 % 128;
        int i11 = i10 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.amount.hashCode();
        int iHashCode3 = this.productSpeed.hashCode();
        int iHashCode4 = this.productType.hashCode();
        int iHashCode5 = this.productId.hashCode();
        int iHashCode6 = this.productCode.hashCode();
        int iHashCode7 = this.productName.hashCode();
        int iHashCode8 = this.productDescription.hashCode();
        int iHashCode9 = this.productHierarchy.hashCode();
        int iHashCode10 = this.duration.hashCode();
        FibreProduct.ProductData productData = this.productData;
        if (productData == null) {
            int i4 = component1 + 125;
            component2 = i4 % 128;
            iHashCode = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = productData.hashCode();
        }
        return (((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode) * 31) + this.subPackages.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibrePackageDetail(amount=" + this.amount + ", productSpeed=" + this.productSpeed + ", productType=" + this.productType + ", productId=" + this.productId + ", productCode=" + this.productCode + ", productName=" + this.productName + ", productDescription=" + this.productDescription + ", productHierarchy=" + this.productHierarchy + ", duration=" + this.duration + ", productData=" + this.productData + ", subPackages=" + this.subPackages + ")";
        int i2 = component2 + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.amount);
        dest.writeString(this.productSpeed);
        dest.writeString(this.productType);
        dest.writeString(this.productId);
        dest.writeString(this.productCode);
        dest.writeString(this.productName);
        dest.writeString(this.productDescription);
        dest.writeString(this.productHierarchy);
        dest.writeString(this.duration);
        FibreProduct.ProductData productData = this.productData;
        if (productData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productData.writeToParcel(dest, flags);
        }
        List<FibrePackageDetail> list = this.subPackages;
        dest.writeInt(list.size());
        Iterator<FibrePackageDetail> it = list.iterator();
        while (it.hasNext()) {
            int i2 = component2 + 55;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
            int i3 = component1 + 75;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
    }
}
