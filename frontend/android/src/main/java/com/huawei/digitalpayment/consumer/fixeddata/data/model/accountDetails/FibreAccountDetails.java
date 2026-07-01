package com.huawei.digitalpayment.consumer.fixeddata.data.model.accountDetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÇ\u0001J\b\u0010%\u001a\u00020&H\u0007J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H×\u0003J\t\u0010+\u001a\u00020&H×\u0001J\t\u0010,\u001a\u00020\u0003H×\u0001J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&H\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00062"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/FibreAccountDetails;", "Landroid/os/Parcelable;", "primaryOffering", "", "acctKey", "accountId", "accountBalance", "status", "statusDetail", "totalProducts", "totalRentalVal", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/accountDetails/Product;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getPrimaryOffering", "()Ljava/lang/String;", "getAcctKey", "getAccountId", "getAccountBalance", "getStatus", "getStatusDetail", "getTotalProducts", "getTotalRentalVal", "getProductList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreAccountDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreAccountDetails> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3 = 1;

    @SerializedName("accountBalance")
    private final String accountBalance;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("acctKey")
    private final String acctKey;

    @SerializedName("primaryOffering")
    private final String primaryOffering;

    @SerializedName("productList")
    private final List<Product> productList;

    @SerializedName("status")
    private final String status;

    @SerializedName("statusDetail")
    private final String statusDetail;

    @SerializedName("totalProducts")
    private final String totalProducts;

    @SerializedName("totalRentalVal")
    private final String totalRentalVal;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreAccountDetails> {
        private static int component3 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component3 + 37;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component3 + 61;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    arrayList.add(Product.CREATOR.createFromParcel(parcel));
                    i5 += 58;
                } else {
                    arrayList.add(Product.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new FibreAccountDetails(string, string2, string3, string4, string5, string6, string7, string8, arrayList);
        }

        @Override
        public FibreAccountDetails createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component3 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FibreAccountDetails fibreAccountDetailsCreateFromParcel = createFromParcel(parcel);
            int i4 = component3 + 75;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
            return fibreAccountDetailsCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAccountDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 23;
            copydefault = i4 % 128;
            Object obj = null;
            FibreAccountDetails[] fibreAccountDetailsArr = new FibreAccountDetails[i];
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 89;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return fibreAccountDetailsArr;
            }
            throw null;
        }

        @Override
        public FibreAccountDetails[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 105;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            FibreAccountDetails[] fibreAccountDetailsArrNewArray = newArray(i);
            int i5 = copydefault + 15;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return fibreAccountDetailsArrNewArray;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public FibreAccountDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List<Product> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.primaryOffering = str;
        this.acctKey = str2;
        this.accountId = str3;
        this.accountBalance = str4;
        this.status = str5;
        this.statusDetail = str6;
        this.totalProducts = str7;
        this.totalRentalVal = str8;
        this.productList = list;
    }

    public final String getPrimaryOffering() {
        int i = 2 % 2;
        int i2 = component2 + 63;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.primaryOffering;
        int i5 = i3 + 65;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAcctKey() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.acctKey;
        int i5 = i2 + 85;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAccountId() {
        int i = 2 % 2;
        int i2 = component2 + 111;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.accountId;
        int i4 = i3 + 11;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getAccountBalance() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 97;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountBalance;
        int i5 = i2 + 49;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getStatus() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getStatusDetail() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 87;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.statusDetail;
        int i5 = i2 + 79;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTotalProducts() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.totalProducts;
            int i4 = 40 / 0;
        } else {
            str = this.totalProducts;
        }
        int i5 = i2 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getTotalRentalVal() {
        int i = 2 % 2;
        int i2 = component2 + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.totalRentalVal;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final List<Product> getProductList() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Product> list = this.productList;
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        return list;
    }

    static {
        int i = component3 + 81;
        component1 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreAccountDetails copy$default(FibreAccountDetails fibreAccountDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i, Object obj) {
        String str9;
        List list2;
        int i2 = 2 % 2;
        String str10 = (i & 1) != 0 ? fibreAccountDetails.primaryOffering : str;
        String str11 = (i & 2) != 0 ? fibreAccountDetails.acctKey : str2;
        String str12 = (i & 4) != 0 ? fibreAccountDetails.accountId : str3;
        if ((i & 8) != 0) {
            str9 = fibreAccountDetails.accountBalance;
            int i3 = ShareDataUIState + 107;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 / 2;
            }
        } else {
            str9 = str4;
        }
        String str13 = (i & 16) != 0 ? fibreAccountDetails.status : str5;
        String str14 = (i & 32) != 0 ? fibreAccountDetails.statusDetail : str6;
        String str15 = (i & 64) != 0 ? fibreAccountDetails.totalProducts : str7;
        String str16 = (i & 128) != 0 ? fibreAccountDetails.totalRentalVal : str8;
        if ((i & 256) != 0) {
            list2 = fibreAccountDetails.productList;
            int i5 = ShareDataUIState + 61;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 5 % 4;
            }
        } else {
            list2 = list;
        }
        return fibreAccountDetails.copy(str10, str11, str12, str9, str13, str14, str15, str16, list2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.primaryOffering;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.acctKey;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 123;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 21;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.accountBalance;
        int i4 = i3 + 115;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.status;
        int i5 = i3 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.statusDetail;
        int i4 = i2 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.totalProducts;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.totalRentalVal;
        int i5 = i3 + 87;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final List<Product> component9() {
        int i = 2 % 2;
        int i2 = component2 + 53;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productList;
        }
        throw null;
    }

    public final FibreAccountDetails copy(String primaryOffering, String acctKey, String accountId, String accountBalance, String status, String statusDetail, String totalProducts, String totalRentalVal, List<Product> productList) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(primaryOffering, "");
        Intrinsics.checkNotNullParameter(acctKey, "");
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(accountBalance, "");
        Intrinsics.checkNotNullParameter(status, "");
        Intrinsics.checkNotNullParameter(statusDetail, "");
        Intrinsics.checkNotNullParameter(totalProducts, "");
        Intrinsics.checkNotNullParameter(totalRentalVal, "");
        Intrinsics.checkNotNullParameter(productList, "");
        FibreAccountDetails fibreAccountDetails = new FibreAccountDetails(primaryOffering, acctKey, accountId, accountBalance, status, statusDetail, totalProducts, totalRentalVal, productList);
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fibreAccountDetails;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 77;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 45;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof FibreAccountDetails)) {
            return false;
        }
        FibreAccountDetails fibreAccountDetails = (FibreAccountDetails) other;
        if (!Intrinsics.areEqual(this.primaryOffering, fibreAccountDetails.primaryOffering)) {
            int i4 = ShareDataUIState + 95;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.acctKey, fibreAccountDetails.acctKey) || !Intrinsics.areEqual(this.accountId, fibreAccountDetails.accountId) || !Intrinsics.areEqual(this.accountBalance, fibreAccountDetails.accountBalance)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.status, fibreAccountDetails.status)) {
            int i6 = ShareDataUIState + 85;
            component2 = i6 % 128;
            return i6 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.statusDetail, fibreAccountDetails.statusDetail)) {
            int i7 = ShareDataUIState + 49;
            component2 = i7 % 128;
            return i7 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.totalProducts, fibreAccountDetails.totalProducts)) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.totalRentalVal, fibreAccountDetails.totalRentalVal))) {
            return Intrinsics.areEqual(this.productList, fibreAccountDetails.productList);
        }
        int i8 = component2 + 19;
        ShareDataUIState = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((((((((((this.primaryOffering.hashCode() * 31) + this.acctKey.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.accountBalance.hashCode()) * 31) + this.status.hashCode()) * 31) + this.statusDetail.hashCode()) * 31) + this.totalProducts.hashCode()) * 31) + this.totalRentalVal.hashCode()) * 31) + this.productList.hashCode();
        int i4 = ShareDataUIState + 85;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreAccountDetails(primaryOffering=" + this.primaryOffering + ", acctKey=" + this.acctKey + ", accountId=" + this.accountId + ", accountBalance=" + this.accountBalance + ", status=" + this.status + ", statusDetail=" + this.statusDetail + ", totalProducts=" + this.totalProducts + ", totalRentalVal=" + this.totalRentalVal + ", productList=" + this.productList + ")";
        int i2 = component2 + 107;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component2 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.primaryOffering);
        dest.writeString(this.acctKey);
        dest.writeString(this.accountId);
        dest.writeString(this.accountBalance);
        dest.writeString(this.status);
        dest.writeString(this.statusDetail);
        dest.writeString(this.totalProducts);
        dest.writeString(this.totalRentalVal);
        List<Product> list = this.productList;
        dest.writeInt(list.size());
        Iterator<Product> it = list.iterator();
        while (it.hasNext()) {
            int i4 = ShareDataUIState + 11;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(dest, flags);
        }
    }
}
