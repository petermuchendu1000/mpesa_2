package com.huawei.digitalpayment.consumer.sfcui.buybundles.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÇ\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0007J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH×\u0003J\t\u0010\u001f\u001a\u00020\u001aH×\u0001J\t\u0010 \u001a\u00020\u0003H×\u0001J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallRateResponse;", "Landroid/os/Parcelable;", "productCategory", "", "rentalFee", "amountInputted", "productUnits", "productIds", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DataCallProduct;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getProductCategory", "()Ljava/lang/String;", "getRentalFee", "getAmountInputted", "getProductUnits", "getProductIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataCallRateResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DataCallRateResponse> CREATOR = new Creator();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 0;
    private static int copydefault = 1;

    @SerializedName("amountInputted")
    private final String amountInputted;

    @SerializedName("productCategory")
    private final String productCategory;

    @SerializedName("productIds")
    private final List<DataCallProduct> productIds;

    @SerializedName("productUnits")
    private final String productUnits;

    @SerializedName("rentalFee")
    private final String rentalFee;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataCallRateResponse> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallRateResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 15;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            ArrayList arrayList = null;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (i3 == 0) {
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                arrayList.hashCode();
                throw null;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                int i4 = copydefault + 121;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                int i6 = parcel.readInt();
                arrayList = new ArrayList(i6);
                for (int i7 = 0; i7 != i6; i7++) {
                    arrayList.add(DataCallProduct.CREATOR.createFromParcel(parcel));
                }
            }
            return new DataCallRateResponse(string, string2, string3, string4, arrayList);
        }

        @Override
        public DataCallRateResponse createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component2 + 7;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final DataCallRateResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 3;
            int i4 = i3 % 128;
            component2 = i4;
            DataCallRateResponse[] dataCallRateResponseArr = new DataCallRateResponse[i];
            if (i3 % 2 != 0) {
                int i5 = 77 / 0;
            }
            int i6 = i4 + 33;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 57 / 0;
            }
            return dataCallRateResponseArr;
        }

        @Override
        public DataCallRateResponse[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 77;
            copydefault = i3 % 128;
            Object obj = null;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            DataCallRateResponse[] dataCallRateResponseArrNewArray = newArray(i);
            int i4 = copydefault + 119;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return dataCallRateResponseArrNewArray;
            }
            obj.hashCode();
            throw null;
        }
    }

    public DataCallRateResponse(String str, String str2, String str3, String str4, List<DataCallProduct> list) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.productCategory = str;
        this.rentalFee = str2;
        this.amountInputted = str3;
        this.productUnits = str4;
        this.productIds = list;
    }

    public final String getProductCategory() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productCategory;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getRentalFee() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.rentalFee;
        int i5 = i2 + 91;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return str;
    }

    public final String getAmountInputted() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 73;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.amountInputted;
        int i5 = i2 + 109;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getProductUnits() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productUnits;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return str;
    }

    public final List<DataCallProduct> getProductIds() {
        List<DataCallProduct> list;
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.productIds;
            int i4 = 0 / 0;
        } else {
            list = this.productIds;
        }
        int i5 = i2 + 17;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static {
        int i = component3 + 107;
        component1 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DataCallRateResponse copy$default(DataCallRateResponse dataCallRateResponse, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = dataCallRateResponse.productCategory;
            int i3 = component2 + 109;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = dataCallRateResponse.rentalFee;
        }
        String str6 = str2;
        Object obj2 = null;
        if ((i & 4) != 0) {
            int i5 = copydefault + 71;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                String str7 = dataCallRateResponse.amountInputted;
                throw null;
            }
            str3 = dataCallRateResponse.amountInputted;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            int i6 = copydefault + 71;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                String str9 = dataCallRateResponse.productUnits;
                obj2.hashCode();
                throw null;
            }
            str4 = dataCallRateResponse.productUnits;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            int i7 = copydefault + 107;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            list = dataCallRateResponse.productIds;
        }
        return dataCallRateResponse.copy(str5, str6, str8, str10, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productCategory;
        int i5 = i3 + 77;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.rentalFee;
        int i5 = i3 + 29;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.amountInputted;
        int i4 = i3 + 65;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.productUnits;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final List<DataCallProduct> component5() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.productIds;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final DataCallRateResponse copy(String productCategory, String rentalFee, String amountInputted, String productUnits, List<DataCallProduct> productIds) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(rentalFee, "");
        DataCallRateResponse dataCallRateResponse = new DataCallRateResponse(productCategory, rentalFee, amountInputted, productUnits, productIds);
        int i2 = copydefault + 3;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return dataCallRateResponse;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component2 + 85;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof DataCallRateResponse)) {
            return false;
        }
        DataCallRateResponse dataCallRateResponse = (DataCallRateResponse) other;
        if ((!Intrinsics.areEqual(this.productCategory, dataCallRateResponse.productCategory)) || !Intrinsics.areEqual(this.rentalFee, dataCallRateResponse.rentalFee)) {
            return false;
        }
        if (Intrinsics.areEqual(this.amountInputted, dataCallRateResponse.amountInputted)) {
            return Intrinsics.areEqual(this.productUnits, dataCallRateResponse.productUnits) && Intrinsics.areEqual(this.productIds, dataCallRateResponse.productIds);
        }
        int i4 = copydefault + 27;
        int i5 = i4 % 128;
        component2 = i5;
        int i6 = i4 % 2;
        int i7 = i5 + 9;
        copydefault = i7 % 128;
        if (i7 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.productCategory;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.rentalFee.hashCode();
        String str2 = this.amountInputted;
        if (str2 == null) {
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            iHashCode = i2 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.productUnits;
        if (str3 == null) {
            int i3 = component2 + 79;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str3.hashCode();
        }
        List<DataCallProduct> list = this.productIds;
        int iHashCode5 = (((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
        int i5 = copydefault + 1;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return iHashCode5;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "DataCallRateResponse(productCategory=" + this.productCategory + ", rentalFee=" + this.rentalFee + ", amountInputted=" + this.amountInputted + ", productUnits=" + this.productUnits + ", productIds=" + this.productIds + ")";
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0055, code lost:
    
        r5.writeInt(1);
        r5.writeInt(r1.size());
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (r1.hasNext() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.component2 + 87;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.copydefault = r2 % 128;
        r2 = r2 % 2;
        r1.next().writeToParcel(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0046, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0048, code lost:
    
        r5.writeInt(0);
        r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.copydefault + 9;
        com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.component2 = r5 % 128;
        r5 = r5 % 2;
     */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToParcel(android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.component2
            int r1 = r1 + 13
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.copydefault = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            if (r1 != 0) goto L30
            java.lang.String r1 = r4.productCategory
            r5.writeString(r1)
            java.lang.String r1 = r4.rentalFee
            r5.writeString(r1)
            java.lang.String r1 = r4.amountInputted
            r5.writeString(r1)
            java.lang.String r1 = r4.productUnits
            r5.writeString(r1)
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProduct> r1 = r4.productIds
            r3 = 31
            int r3 = r3 / r2
            if (r1 != 0) goto L55
            goto L48
        L30:
            java.lang.String r1 = r4.productCategory
            r5.writeString(r1)
            java.lang.String r1 = r4.rentalFee
            r5.writeString(r1)
            java.lang.String r1 = r4.amountInputted
            r5.writeString(r1)
            java.lang.String r1 = r4.productUnits
            r5.writeString(r1)
            java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProduct> r1 = r4.productIds
            if (r1 != 0) goto L55
        L48:
            r5.writeInt(r2)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.copydefault
            int r5 = r5 + 9
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.component2 = r6
            int r5 = r5 % r0
            goto L7d
        L55:
            r2 = 1
            r5.writeInt(r2)
            int r2 = r1.size()
            r5.writeInt(r2)
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7d
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.component2
            int r2 = r2 + 87
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.copydefault = r3
            int r2 = r2 % r0
            java.lang.Object r2 = r1.next()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProduct r2 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallProduct) r2
            r2.writeToParcel(r5, r6)
            goto L64
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DataCallRateResponse.writeToParcel(android.os.Parcel, int):void");
    }
}
