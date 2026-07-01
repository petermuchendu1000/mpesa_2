package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÇ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\u0013\u0010\u001f\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010!H×\u0003J\t\u0010\"\u001a\u00020\u001eH×\u0001J\t\u0010#\u001a\u00020\u0003H×\u0001J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eH\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006)"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreAddProductPayload;", "Landroid/os/Parcelable;", "accountId", "", "mpesaTid", "mainOfferingId", "mainOfferingCode", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", "isPostPay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "getAccountId", "()Ljava/lang/String;", "getMpesaTid", "getMainOfferingId", "getMainOfferingCode", "getProductList", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreAddProductPayload implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreAddProductPayload> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component2 = 1;
    private static int component3;

    @SerializedName("accountId")
    private final String accountId;

    @SerializedName("isPostPay")
    private final boolean isPostPay;

    @SerializedName("mainOfferingCode")
    private final String mainOfferingCode;

    @SerializedName("mainOfferingId")
    private final String mainOfferingId;

    @SerializedName("mpesaTid")
    private final String mpesaTid;

    @SerializedName("productList")
    private final List<FibreProduct.Product> productList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreAddProductPayload> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAddProductPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = copydefault + 85;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = copydefault + 61;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(FibreProduct.Product.CREATOR.createFromParcel(parcel));
            }
            return new FibreAddProductPayload(string, string2, string3, string4, arrayList, parcel.readInt() != 0);
        }

        @Override
        public FibreAddProductPayload createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FibreAddProductPayload fibreAddProductPayloadCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 91;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return fibreAddProductPayloadCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreAddProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            ShareDataUIState = i3 % 128;
            FibreAddProductPayload[] fibreAddProductPayloadArr = new FibreAddProductPayload[i];
            if (i3 % 2 == 0) {
                return fibreAddProductPayloadArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public FibreAddProductPayload[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 77;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            FibreAddProductPayload[] fibreAddProductPayloadArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 67;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return fibreAddProductPayloadArrNewArray;
        }
    }

    public FibreAddProductPayload(String str, String str2, String str3, String str4, List<FibreProduct.Product> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.accountId = str;
        this.mpesaTid = str2;
        this.mainOfferingId = str3;
        this.mainOfferingCode = str4;
        this.productList = list;
        this.isPostPay = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FibreAddProductPayload(String str, String str2, String str3, String str4, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        String str6;
        boolean z2;
        Object obj = null;
        String str7 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = ShareDataUIState + 65;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = ShareDataUIState;
            int i4 = i3 + 125;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 43;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 / 3;
            } else {
                int i8 = 2 % 2;
            }
            str6 = null;
        } else {
            str6 = str4;
        }
        if ((i & 32) != 0) {
            int i9 = component1 + 23;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str7, str5, str6, list, z2);
    }

    public final String getAccountId() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.accountId;
            int i4 = 39 / 0;
        } else {
            str = this.accountId;
        }
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getMpesaTid() {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.mpesaTid;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getMainOfferingId() {
        int i = 2 % 2;
        int i2 = component1 + 77;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mainOfferingId;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMainOfferingCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mainOfferingCode;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public final List<FibreProduct.Product> getProductList() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<FibreProduct.Product> list = this.productList;
        int i5 = i3 + 111;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final boolean isPostPay() {
        boolean z;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            z = this.isPostPay;
            int i4 = 18 / 0;
        } else {
            z = this.isPostPay;
        }
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 82 / 0;
        }
        return z;
    }

    static {
        int i = component3 + 103;
        component2 = i % 128;
        if (i % 2 == 0) {
            int i2 = 26 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreAddProductPayload copy$default(FibreAddProductPayload fibreAddProductPayload, String str, String str2, String str3, String str4, List list, boolean z, int i, Object obj) {
        String str5;
        List list2;
        int i2 = 2 % 2;
        int i3 = component1 + 81;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        String str6 = (i3 % 2 == 0 ? (i & 1) == 0 : (i & 1) == 0) ? str : fibreAddProductPayload.accountId;
        String str7 = (i & 2) != 0 ? fibreAddProductPayload.mpesaTid : str2;
        String str8 = (i & 4) != 0 ? fibreAddProductPayload.mainOfferingId : str3;
        if ((i & 8) != 0) {
            int i5 = i4 + 105;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                String str9 = fibreAddProductPayload.mainOfferingCode;
                throw null;
            }
            str5 = fibreAddProductPayload.mainOfferingCode;
        } else {
            str5 = str4;
        }
        if ((i & 16) != 0) {
            int i6 = i4 + 101;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            list2 = fibreAddProductPayload.productList;
        } else {
            list2 = list;
        }
        return fibreAddProductPayload.copy(str6, str7, str8, str5, list2, (i & 32) != 0 ? fibreAddProductPayload.isPostPay : z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.accountId;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 63;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.mpesaTid;
        int i4 = i2 + 19;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component1 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.mainOfferingId;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.mainOfferingCode;
        int i5 = i3 + 55;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 48 / 0;
        }
        return str;
    }

    public final List<FibreProduct.Product> component5() {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<FibreProduct.Product> list = this.productList;
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        return list;
    }

    public final boolean component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 47;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.isPostPay;
        int i5 = i2 + 79;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final FibreAddProductPayload copy(String accountId, String mpesaTid, String mainOfferingId, String mainOfferingCode, List<FibreProduct.Product> productList, boolean isPostPay) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        Intrinsics.checkNotNullParameter(productList, "");
        FibreAddProductPayload fibreAddProductPayload = new FibreAddProductPayload(accountId, mpesaTid, mainOfferingId, mainOfferingCode, productList, isPostPay);
        int i2 = ShareDataUIState + 67;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return fibreAddProductPayload;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 69;
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
        int i2 = ShareDataUIState + 85;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 11;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof FibreAddProductPayload)) {
            return false;
        }
        FibreAddProductPayload fibreAddProductPayload = (FibreAddProductPayload) other;
        if (!Intrinsics.areEqual(this.accountId, fibreAddProductPayload.accountId)) {
            int i7 = ShareDataUIState + 81;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.mpesaTid, fibreAddProductPayload.mpesaTid)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.mainOfferingId, fibreAddProductPayload.mainOfferingId)) {
            int i9 = ShareDataUIState + 119;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.mainOfferingCode, fibreAddProductPayload.mainOfferingCode)) {
            return Intrinsics.areEqual(this.productList, fibreAddProductPayload.productList) && this.isPostPay == fibreAddProductPayload.isPostPay;
        }
        int i11 = ShareDataUIState + 87;
        component1 = i11 % 128;
        int i12 = i11 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.accountId.hashCode();
        String str = this.mpesaTid;
        if (str == null) {
            int i2 = ShareDataUIState + 21;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.mainOfferingId;
        if (str2 == null) {
            int i4 = ShareDataUIState + 95;
            component1 = i4 % 128;
            iHashCode2 = i4 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.mainOfferingCode;
        return (((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.productList.hashCode()) * 31) + Boolean.hashCode(this.isPostPay);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreAddProductPayload(accountId=" + this.accountId + ", mpesaTid=" + this.mpesaTid + ", mainOfferingId=" + this.mainOfferingId + ", mainOfferingCode=" + this.mainOfferingCode + ", productList=" + this.productList + ", isPostPay=" + this.isPostPay + ")";
        int i2 = component1 + 81;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        dest.writeString(this.accountId);
        dest.writeString(this.mpesaTid);
        dest.writeString(this.mainOfferingId);
        dest.writeString(this.mainOfferingCode);
        List<FibreProduct.Product> list = this.productList;
        dest.writeInt(list.size());
        Iterator<FibreProduct.Product> it = list.iterator();
        while (!(!it.hasNext())) {
            int i4 = component1 + 45;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.isPostPay ? 1 : 0);
    }
}
