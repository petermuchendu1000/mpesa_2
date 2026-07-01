package com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0006\u001d\u001e\u001f !\"B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct;", "Landroid/os/Parcelable;", "lastMile", "", "products", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductsByTechnology;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getLastMile", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ProductsByTechnology", "ProductsByPackageType", "Product", "ProductData", "ProductResources", "Description", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FibreProduct implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<FibreProduct> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("lastMile")
    private final String lastMile;

    @SerializedName("products")
    private final List<ProductsByTechnology> products;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FibreProduct> {
        private static int component2 = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002e A[PHI: r1
  0x002e: PHI (r1v10 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x002a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
  0x002c: PHI (r1v5 java.lang.String) = (r1v4 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x002a, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct createFromParcel(android.os.Parcel r9) {
            /*
                r8 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.copydefault
                int r1 = r1 + 9
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.component2 = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
                if (r1 != 0) goto L22
                java.lang.String r1 = r9.readString()
                int r3 = r9.readInt()
                r5 = 7
                int r5 = r5 / r2
                if (r3 != 0) goto L2e
                goto L2c
            L22:
                java.lang.String r1 = r9.readString()
                int r3 = r9.readInt()
                if (r3 != 0) goto L2e
            L2c:
                r5 = r4
                goto L4e
            L2e:
                int r3 = r9.readInt()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
            L37:
                if (r2 == r3) goto L4e
                int r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.copydefault
                int r6 = r6 + 1
                int r7 = r6 % 128
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.component2 = r7
                int r6 = r6 % r0
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct$ProductsByTechnology> r6 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.ProductsByTechnology.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r9)
                r5.add(r6)
                int r2 = r2 + 1
                goto L37
            L4e:
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct r9 = new com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct
                java.util.List r5 = (java.util.List) r5
                r9.<init>(r1, r5)
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.component2
                int r1 = r1 + 47
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.copydefault = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L61
                return r9
            L61:
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct");
        }

        @Override
        public FibreProduct createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 83;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final FibreProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 23;
            component2 = i3 % 128;
            FibreProduct[] fibreProductArr = new FibreProduct[i];
            if (i3 % 2 != 0) {
                return fibreProductArr;
            }
            throw null;
        }

        @Override
        public FibreProduct[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 9;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                newArray(i);
                throw null;
            }
            FibreProduct[] fibreProductArrNewArray = newArray(i);
            int i4 = component2 + 31;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return fibreProductArrNewArray;
        }
    }

    public FibreProduct(String str, List<ProductsByTechnology> list) {
        this.lastMile = str;
        this.products = list;
    }

    public final String getLastMile() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        String str = this.lastMile;
        int i4 = i3 + 107;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 18 / 0;
        }
        return str;
    }

    public final List<ProductsByTechnology> getProducts() {
        int i = 2 % 2;
        int i2 = component1 + 69;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<ProductsByTechnology> list = this.products;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 45;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FibreProduct copy$default(FibreProduct fibreProduct, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1;
        int i4 = i3 + 103;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 47;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                String str2 = fibreProduct.lastMile;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str = fibreProduct.lastMile;
        }
        if ((i & 2) != 0) {
            list = fibreProduct.products;
        }
        return fibreProduct.copy(str, list);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.lastMile;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
        return str;
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductsByTechnology;", "Landroid/os/Parcelable;", "productList", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductsByPackageType;", "technology", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProductList", "()Ljava/util/List;", "getTechnology", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductsByTechnology implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ProductsByTechnology> CREATOR = new Creator();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault;

        @SerializedName("productList")
        private final List<ProductsByPackageType> productList;

        @SerializedName("technology")
        private final String technology;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductsByTechnology> {
            private static int component1 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductsByTechnology createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    int i2 = component1 + 3;
                    int i3 = i2 % 128;
                    copydefault = i3;
                    int i4 = i2 % 2;
                    int i5 = i3 + 41;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    arrayList = null;
                } else {
                    int i7 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i7);
                    for (int i8 = 0; i8 != i7; i8++) {
                        arrayList2.add(ProductsByPackageType.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new ProductsByTechnology(arrayList, parcel.readString());
            }

            @Override
            public ProductsByTechnology createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 115;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    createFromParcel(parcel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ProductsByTechnology productsByTechnologyCreateFromParcel = createFromParcel(parcel);
                int i3 = component1 + 57;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 99 / 0;
                }
                return productsByTechnologyCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductsByTechnology[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 101;
                int i4 = i3 % 128;
                copydefault = i4;
                ProductsByTechnology[] productsByTechnologyArr = new ProductsByTechnology[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 29;
                component1 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 79 / 0;
                }
                return productsByTechnologyArr;
            }

            @Override
            public ProductsByTechnology[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component1 + 99;
                copydefault = i3 % 128;
                Object obj = null;
                if (i3 % 2 == 0) {
                    newArray(i);
                    throw null;
                }
                ProductsByTechnology[] productsByTechnologyArrNewArray = newArray(i);
                int i4 = component1 + 7;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return productsByTechnologyArrNewArray;
                }
                obj.hashCode();
                throw null;
            }
        }

        public ProductsByTechnology(List<ProductsByPackageType> list, String str) {
            this.productList = list;
            this.technology = str;
        }

        public final List<ProductsByPackageType> getProductList() {
            int i = 2 % 2;
            int i2 = component3 + 119;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            List<ProductsByPackageType> list = this.productList;
            int i4 = i3 + 7;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return list;
        }

        public final String getTechnology() {
            int i = 2 % 2;
            int i2 = component3 + 13;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.technology;
            int i4 = i3 + 107;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return str;
            }
            obj.hashCode();
            throw null;
        }

        static {
            int i = component1 + 59;
            copydefault = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ProductsByTechnology copy$default(ProductsByTechnology productsByTechnology, List list, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component3 + 57;
            int i4 = i3 % 128;
            component2 = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                list = productsByTechnology.productList;
            }
            if ((i & 2) != 0) {
                int i6 = i4 + 69;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    String str2 = productsByTechnology.technology;
                    throw null;
                }
                str = productsByTechnology.technology;
            }
            ProductsByTechnology productsByTechnologyCopy = productsByTechnology.copy(list, str);
            int i7 = component2 + 111;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return productsByTechnologyCopy;
        }

        public final List<ProductsByPackageType> component1() {
            int i = 2 % 2;
            int i2 = component2 + 117;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            List<ProductsByPackageType> list = this.productList;
            int i5 = i3 + 51;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return list;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component2() {
            String str;
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 81;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                str = this.technology;
                int i4 = 68 / 0;
            } else {
                str = this.technology;
            }
            int i5 = i2 + 17;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final ProductsByTechnology copy(List<ProductsByPackageType> productList, String technology) {
            int i = 2 % 2;
            ProductsByTechnology productsByTechnology = new ProductsByTechnology(productList, technology);
            int i2 = component2 + 19;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return productsByTechnology;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 99;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductsByTechnology)) {
                int i2 = component3 + 1;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            ProductsByTechnology productsByTechnology = (ProductsByTechnology) other;
            if (!Intrinsics.areEqual(this.productList, productsByTechnology.productList)) {
                int i4 = component3 + 119;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.technology, productsByTechnology.technology)) {
                return false;
            }
            int i6 = component3 + 39;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            List<ProductsByPackageType> list = this.productList;
            int iHashCode = 0;
            int iHashCode2 = list == null ? 0 : list.hashCode();
            String str = this.technology;
            if (str != null) {
                iHashCode = str.hashCode();
                int i4 = component2 + 11;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductsByTechnology(productList=" + this.productList + ", technology=" + this.technology + ")";
            int i2 = component3 + 103;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            List<ProductsByPackageType> list = this.productList;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<ProductsByPackageType> it = list.iterator();
                int i2 = component2 + 39;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                while (it.hasNext()) {
                    int i4 = component2 + 99;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        it.next().writeToParcel(dest, flags);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    it.next().writeToParcel(dest, flags);
                }
            }
            dest.writeString(this.technology);
        }
    }

    public final List<ProductsByTechnology> component2() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<ProductsByTechnology> list = this.products;
        int i4 = i3 + 1;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return list;
    }

    public final FibreProduct copy(String lastMile, List<ProductsByTechnology> products) {
        int i = 2 % 2;
        FibreProduct fibreProduct = new FibreProduct(lastMile, products);
        int i2 = component1 + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return fibreProduct;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 1 : 0;
        int i5 = i2 + 77;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 13;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof FibreProduct)) {
            return false;
        }
        FibreProduct fibreProduct = (FibreProduct) other;
        if (!Intrinsics.areEqual(this.lastMile, fibreProduct.lastMile)) {
            int i3 = component3 + 111;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.products, fibreProduct.products)) {
            return true;
        }
        int i5 = component1 + 87;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 77;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.lastMile;
        if (str == null) {
            int i5 = i3 + 55;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
            int i7 = component1 + 23;
            component3 = i7 % 128;
            int i8 = i7 % 2;
        }
        List<ProductsByTechnology> list = this.products;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FibreProduct(lastMile=" + this.lastMile + ", products=" + this.products + ")";
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 85 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        if (i3 == 0) {
            dest.writeString(this.lastMile);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        dest.writeString(this.lastMile);
        List<ProductsByTechnology> list = this.products;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<ProductsByTechnology> it = list.iterator();
        while (it.hasNext()) {
            int i4 = component3 + 19;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                it.next().writeToParcel(dest, flags);
                int i5 = 73 / 0;
            } else {
                it.next().writeToParcel(dest, flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÇ\u0001J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0011H×\u0001J\t\u0010\u0017\u001a\u00020\u0006H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0007R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductsByPackageType;", "Landroid/os/Parcelable;", "products", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", GriverMonitorConstants.KEY_PACKEGE_TYPE, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getProducts", "()Ljava/util/List;", "getPackageType", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductsByPackageType implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ProductsByPackageType> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;

        @SerializedName(GriverMonitorConstants.KEY_PACKEGE_TYPE)
        private final String packageType;

        @SerializedName("products")
        private final List<Product> products;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductsByPackageType> {
            private static int ShareDataUIState = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductsByPackageType createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i4);
                    int i5 = 0;
                    while (i5 != i4) {
                        int i6 = ShareDataUIState + 125;
                        component2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            arrayList2.add(Product.CREATOR.createFromParcel(parcel));
                            i5 += 89;
                        } else {
                            arrayList2.add(Product.CREATOR.createFromParcel(parcel));
                            i5++;
                        }
                        int i7 = ShareDataUIState + 119;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    arrayList = arrayList2;
                }
                return new ProductsByPackageType(arrayList, parcel.readString());
            }

            @Override
            public ProductsByPackageType createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 101;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ProductsByPackageType productsByPackageTypeCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 35 / 0;
                }
                return productsByPackageTypeCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductsByPackageType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 37;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                ProductsByPackageType[] productsByPackageTypeArr = new ProductsByPackageType[i];
                if (i3 % 2 == 0) {
                    throw null;
                }
                int i5 = i4 + 55;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return productsByPackageTypeArr;
            }

            @Override
            public ProductsByPackageType[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 17;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return newArray(i);
                }
                newArray(i);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public ProductsByPackageType(List<Product> list, String str) {
            this.products = list;
            this.packageType = str;
        }

        public final List<Product> getProducts() {
            int i = 2 % 2;
            int i2 = component2 + 49;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            List<Product> list = this.products;
            int i4 = i3 + 41;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return list;
            }
            obj.hashCode();
            throw null;
        }

        public final String getPackageType() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.packageType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = component1 + 121;
            copydefault = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ProductsByPackageType copy$default(ProductsByPackageType productsByPackageType, List list, String str, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 31;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            if (i3 % 2 == 0 && (i & 1) != 0) {
                int i5 = i4 + 39;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    List<Product> list2 = productsByPackageType.products;
                    throw null;
                }
                list = productsByPackageType.products;
            }
            if ((i & 2) != 0) {
                int i6 = i4 + 1;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                str = productsByPackageType.packageType;
            }
            return productsByPackageType.copy(list, str);
        }

        public final List<Product> component1() {
            int i = 2 % 2;
            int i2 = component2 + 115;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            List<Product> list = this.products;
            int i5 = i3 + 83;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return list;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 1;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            String str = this.packageType;
            int i4 = i2 + 45;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final ProductsByPackageType copy(List<Product> products, String packageType) {
            int i = 2 % 2;
            ProductsByPackageType productsByPackageType = new ProductsByPackageType(products, packageType);
            int i2 = ShareDataUIState + 93;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return productsByPackageType;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 115;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 75;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return true;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (!(other instanceof ProductsByPackageType)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.products, ((ProductsByPackageType) other).products)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.packageType, r6.packageType)) {
                int i3 = component2 + 71;
                ShareDataUIState = i3 % 128;
                return i3 % 2 != 0;
            }
            int i4 = component2 + 105;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }

        public int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 23;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            List<Product> list = this.products;
            int iHashCode = list == null ? 0 : list.hashCode();
            String str = this.packageType;
            int iHashCode2 = (iHashCode * 31) + (str != null ? str.hashCode() : 0);
            int i4 = component2 + 69;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductsByPackageType(products=" + this.products + ", packageType=" + this.packageType + ")";
            int i2 = ShareDataUIState + 35;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = component2 + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<Product> list = this.products;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<Product> it = list.iterator();
                while (!(!it.hasNext())) {
                    int i4 = ShareDataUIState + 25;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().writeToParcel(dest, flags);
                    int i6 = component2 + 83;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            dest.writeString(this.packageType);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\u000b\u0010B\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jæ\u0001\u0010F\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÇ\u0001¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020\bH\u0007J\u0013\u0010I\u001a\u00020\u00102\b\u0010J\u001a\u0004\u0018\u00010KH×\u0003J\t\u0010L\u001a\u00020\bH×\u0001J\t\u0010M\u001a\u00020\u0003H×\u0001J\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020\bH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u000f\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001cR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b2\u0010!R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001c¨\u0006S"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", "Landroid/os/Parcelable;", "offeringId", "", "offeringCode", "serviceCode", "offerInfo", "rentalVal", "", "rentalCycleId", "bundledFlag", "lastMile", "technology", GriverMonitorConstants.KEY_PACKEGE_TYPE, "status", "isDiscounted", "", "discountDesc", "discountedRentalVal", "", "productData", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "hierarchy", "offerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getOfferingCode", "getServiceCode", "getOfferInfo", "getRentalVal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRentalCycleId", "getBundledFlag", "getLastMile", "getTechnology", "getPackageType", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDiscountDesc", "getDiscountedRentalVal", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getProductData", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;", "getCategory", "getHierarchy", "getOfferType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Double;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Product;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Product implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Product> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        private static int component3 = 1;
        private static int copydefault;

        @SerializedName("bundledFlag")
        private final String bundledFlag;

        @SerializedName(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY)
        private final String category;

        @SerializedName("discountDesc")
        private final String discountDesc;

        @SerializedName("discountedRentalVal")
        private final Double discountedRentalVal;

        @SerializedName("hierarchy")
        private final Integer hierarchy;

        @SerializedName("isDiscounted")
        private final Boolean isDiscounted;

        @SerializedName("lastMile")
        private final String lastMile;

        @SerializedName("offerInfo")
        private final String offerInfo;

        @SerializedName("offerType")
        private final String offerType;

        @SerializedName("offeringCode")
        private final String offeringCode;

        @SerializedName("offeringId")
        private final String offeringId;

        @SerializedName(GriverMonitorConstants.KEY_PACKEGE_TYPE)
        private final String packageType;

        @SerializedName("productData")
        private final ProductData productData;

        @SerializedName("rentalCycleId")
        private final String rentalCycleId;

        @SerializedName("rentalVal")
        private final Integer rentalVal;

        @SerializedName("serviceCode")
        private final String serviceCode;

        @SerializedName("status")
        private final String status;

        @SerializedName("technology")
        private final String technology;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Product> {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Product createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String str;
                Double dValueOf;
                Double d2;
                ProductData productDataCreateFromParcel;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Object obj = null;
                Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = component2 + 73;
                    component3 = i2 % 128;
                    if (i2 % 2 == 0) {
                        obj.hashCode();
                        throw null;
                    }
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string11 = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i3 = component2 + 67;
                    str = string11;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    dValueOf = null;
                } else {
                    str = string11;
                    dValueOf = Double.valueOf(parcel.readDouble());
                }
                if (parcel.readInt() == 0) {
                    int i5 = component2 + 123;
                    d2 = dValueOf;
                    component3 = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 89 / 0;
                    }
                    productDataCreateFromParcel = null;
                } else {
                    d2 = dValueOf;
                    productDataCreateFromParcel = ProductData.CREATOR.createFromParcel(parcel);
                    int i7 = component3 + 107;
                    component2 = i7 % 128;
                    int i8 = i7 % 2;
                }
                return new Product(string, string2, string3, string4, numValueOf, string5, string6, string7, string8, string9, string10, boolValueOf, str, d2, productDataCreateFromParcel, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            @Override
            public Product createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 75;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    createFromParcel(parcel);
                    throw null;
                }
                Product productCreateFromParcel = createFromParcel(parcel);
                int i3 = component3 + 57;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return productCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Product[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 31;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                Product[] productArr = new Product[i];
                int i6 = i4 + 27;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return productArr;
            }

            @Override
            public Product[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Product[] productArrNewArray = newArray(i);
                int i5 = component3 + 15;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return productArrNewArray;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        public Product(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Double d2, ProductData productData, String str12, Integer num2, String str13) {
            this.offeringId = str;
            this.offeringCode = str2;
            this.serviceCode = str3;
            this.offerInfo = str4;
            this.rentalVal = num;
            this.rentalCycleId = str5;
            this.bundledFlag = str6;
            this.lastMile = str7;
            this.technology = str8;
            this.packageType = str9;
            this.status = str10;
            this.isDiscounted = bool;
            this.discountDesc = str11;
            this.discountedRentalVal = d2;
            this.productData = productData;
            this.category = str12;
            this.hierarchy = num2;
            this.offerType = str13;
        }

        public final String getOfferingId() {
            int i = 2 % 2;
            int i2 = component2 + 43;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.offeringId;
            int i5 = i3 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getOfferingCode() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 101;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offeringCode;
            int i5 = i2 + 119;
            component2 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 86 / 0;
            }
            return str;
        }

        public final String getServiceCode() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 9;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.serviceCode;
            int i5 = i2 + 119;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 74 / 0;
            }
            return str;
        }

        public final String getOfferInfo() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 17;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offerInfo;
            int i5 = i2 + 9;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer getRentalVal() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 63;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Integer num = this.rentalVal;
            int i5 = i2 + 107;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return num;
        }

        public final String getRentalCycleId() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 109;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.rentalCycleId;
            int i5 = i2 + 101;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getBundledFlag() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.bundledFlag;
            int i5 = i2 + 63;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String getLastMile() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 95;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.lastMile;
            }
            throw null;
        }

        public final String getTechnology() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.technology;
            }
            throw null;
        }

        public final String getPackageType() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 105;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.packageType;
            int i5 = i3 + 85;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getStatus() {
            int i = 2 % 2;
            int i2 = component2 + 77;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return this.status;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Boolean isDiscounted() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 1;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.isDiscounted;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getDiscountDesc() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 51;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.discountDesc;
            int i5 = i3 + 79;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Double getDiscountedRentalVal() {
            int i = 2 % 2;
            int i2 = component2 + 3;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            if (i2 % 2 != 0) {
                throw null;
            }
            Double d2 = this.discountedRentalVal;
            int i4 = i3 + 113;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return d2;
            }
            throw null;
        }

        public final ProductData getProductData() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            ProductData productData = this.productData;
            int i5 = i3 + 51;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return productData;
            }
            throw null;
        }

        public final String getCategory() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 11;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            String str = this.category;
            int i5 = i3 + 21;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer getHierarchy() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Integer num = this.hierarchy;
            if (i3 == 0) {
                int i4 = 37 / 0;
            }
            return num;
        }

        public final String getOfferType() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 107;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String str = this.offerType;
            if (i3 == 0) {
                int i4 = 45 / 0;
            }
            return str;
        }

        static {
            int i = copydefault + 115;
            component3 = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }

        public static Product copy$default(Product product, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, Boolean bool, String str11, Double d2, ProductData productData, String str12, Integer num2, String str13, int i, Object obj) {
            String str14;
            String str15;
            String str16;
            String str17;
            Boolean bool2;
            String str18;
            int i2 = 2 % 2;
            int i3 = component2 + 13;
            int i4 = i3 % 128;
            ShareDataUIState = i4;
            int i5 = i3 % 2;
            if ((i & 1) != 0) {
                int i6 = i4 + 37;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                str14 = product.offeringId;
            } else {
                str14 = str;
            }
            String str19 = (i & 2) != 0 ? product.offeringCode : str2;
            Object obj2 = null;
            if ((i & 4) != 0) {
                int i8 = i4 + 57;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    String str20 = product.serviceCode;
                    obj2.hashCode();
                    throw null;
                }
                str15 = product.serviceCode;
            } else {
                str15 = str3;
            }
            String str21 = (i & 8) != 0 ? product.offerInfo : str4;
            Integer num3 = (i & 16) != 0 ? product.rentalVal : num;
            String str22 = (i & 32) != 0 ? product.rentalCycleId : str5;
            if ((i & 64) != 0) {
                int i9 = component2 + 107;
                ShareDataUIState = i9 % 128;
                if (i9 % 2 != 0) {
                    String str23 = product.bundledFlag;
                    throw null;
                }
                str16 = product.bundledFlag;
            } else {
                str16 = str6;
            }
            if ((i & 128) != 0) {
                int i10 = ShareDataUIState + 59;
                component2 = i10 % 128;
                int i11 = i10 % 2;
                str17 = product.lastMile;
            } else {
                str17 = str7;
            }
            String str24 = (i & 256) != 0 ? product.technology : str8;
            String str25 = (i & 512) != 0 ? product.packageType : str9;
            String str26 = (i & 1024) != 0 ? product.status : str10;
            Boolean bool3 = (i & 2048) != 0 ? product.isDiscounted : bool;
            if ((i & 4096) != 0) {
                int i12 = ShareDataUIState + 63;
                bool2 = bool3;
                component2 = i12 % 128;
                int i13 = i12 % 2;
                str18 = product.discountDesc;
            } else {
                bool2 = bool3;
                str18 = str11;
            }
            return product.copy(str14, str19, str15, str21, num3, str22, str16, str17, str24, str25, str26, bool2, str18, (i & 8192) != 0 ? product.discountedRentalVal : d2, (i & 16384) != 0 ? product.productData : productData, (i & 32768) != 0 ? product.category : str12, (i & 65536) != 0 ? product.hierarchy : num2, (i & 131072) != 0 ? product.offerType : str13);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 59;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offeringId;
            int i5 = i2 + 95;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component10() {
            int i = 2 % 2;
            int i2 = component2 + 35;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.packageType;
            int i5 = i3 + 25;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component11() {
            String str;
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 23;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                str = this.status;
                int i4 = 1 / 0;
            } else {
                str = this.status;
            }
            int i5 = i2 + 83;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Boolean component12() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 83;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean bool = this.isDiscounted;
            int i4 = i2 + 49;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return bool;
        }

        public final String component13() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 113;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.discountDesc;
            int i5 = i2 + 103;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 79 / 0;
            }
            return str;
        }

        public final Double component14() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 103;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Double d2 = this.discountedRentalVal;
            int i5 = i2 + 65;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return d2;
        }

        public final ProductData component15() {
            int i = 2 % 2;
            int i2 = component2 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ProductData productData = this.productData;
            if (i3 != 0) {
                int i4 = 64 / 0;
            }
            return productData;
        }

        public final String component16() {
            int i = 2 % 2;
            int i2 = component2 + 107;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.category;
            int i5 = i3 + 79;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Integer component17() {
            int i = 2 % 2;
            int i2 = component2 + 101;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            Object obj = null;
            if (i2 % 2 != 0) {
                throw null;
            }
            Integer num = this.hierarchy;
            int i4 = i3 + 79;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return num;
            }
            obj.hashCode();
            throw null;
        }

        public final String component18() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 99;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offerType;
            int i5 = i2 + 13;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 65;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offeringCode;
            int i5 = i2 + 51;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.serviceCode;
            }
            throw null;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            String str = this.offerInfo;
            if (i3 != 0) {
                int i4 = 24 / 0;
            }
            return str;
        }

        public final Integer component5() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 81;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Integer num = this.rentalVal;
            int i4 = i2 + 63;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return num;
        }

        public final String component6() {
            int i = 2 % 2;
            int i2 = component2 + 115;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            int i4 = i2 % 2;
            String str = this.rentalCycleId;
            int i5 = i3 + 61;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String component7() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 33;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            String str = this.bundledFlag;
            int i4 = i2 + 9;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return str;
        }

        public final String component8() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            int i3 = i2 % 128;
            component2 = i3;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            String str = this.lastMile;
            int i4 = i3 + 75;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final String component9() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 9;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.technology;
            int i5 = i2 + 1;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public final Product copy(String offeringId, String offeringCode, String serviceCode, String offerInfo, Integer rentalVal, String rentalCycleId, String bundledFlag, String lastMile, String technology, String packageType, String status, Boolean isDiscounted, String discountDesc, Double discountedRentalVal, ProductData productData, String category, Integer hierarchy, String offerType) {
            int i = 2 % 2;
            Product product = new Product(offeringId, offeringCode, serviceCode, offerInfo, rentalVal, rentalCycleId, bundledFlag, lastMile, technology, packageType, status, isDiscounted, discountDesc, discountedRentalVal, productData, category, hierarchy, offerType);
            int i2 = component2 + 99;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 83 / 0;
            }
            return product;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 25;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 125;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = component2 + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            if (!Intrinsics.areEqual(this.offeringId, product.offeringId)) {
                int i4 = ShareDataUIState + 101;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.offeringCode, product.offeringCode)) {
                int i6 = component2 + 49;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.serviceCode, product.serviceCode) || !Intrinsics.areEqual(this.offerInfo, product.offerInfo) || !Intrinsics.areEqual(this.rentalVal, product.rentalVal) || !Intrinsics.areEqual(this.rentalCycleId, product.rentalCycleId)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.bundledFlag, product.bundledFlag)) {
                int i8 = component2 + 13;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.lastMile, product.lastMile) || !Intrinsics.areEqual(this.technology, product.technology) || (!Intrinsics.areEqual(this.packageType, product.packageType))) {
                return false;
            }
            if (!Intrinsics.areEqual(this.status, product.status)) {
                int i10 = component2 + 65;
                ShareDataUIState = i10 % 128;
                int i11 = i10 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.isDiscounted, product.isDiscounted)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.discountDesc, product.discountDesc)) {
                int i12 = component2 + 33;
                ShareDataUIState = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            if (!Intrinsics.areEqual((Object) this.discountedRentalVal, (Object) product.discountedRentalVal)) {
                int i14 = ShareDataUIState + 77;
                component2 = i14 % 128;
                int i15 = i14 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.productData, product.productData)) {
                int i16 = ShareDataUIState + 93;
                component2 = i16 % 128;
                int i17 = i16 % 2;
                return false;
            }
            if (!Intrinsics.areEqual(this.category, product.category)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.hierarchy, product.hierarchy)) {
                int i18 = component2 + 117;
                ShareDataUIState = i18 % 128;
                int i19 = i18 % 2;
                return false;
            }
            if (Intrinsics.areEqual(this.offerType, product.offerType)) {
                return true;
            }
            int i20 = component2 + 33;
            ShareDataUIState = i20 % 128;
            int i21 = i20 % 2;
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001d A[PHI: r2 r4
  0x001d: PHI (r2v41 java.lang.String) = (r2v4 java.lang.String), (r2v43 java.lang.String) binds: [B:8:0x0019, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]
  0x001d: PHI (r4v13 int) = (r4v0 int), (r4v14 int) binds: [B:8:0x0019, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r4
  0x001b: PHI (r4v1 int) = (r4v0 int), (r4v14 int) binds: [B:8:0x0019, B:5:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int hashCode() {
            /*
                Method dump skipped, instruction units count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.data.model.changeplan.FibreProduct.Product.hashCode():int");
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Product(offeringId=" + this.offeringId + ", offeringCode=" + this.offeringCode + ", serviceCode=" + this.serviceCode + ", offerInfo=" + this.offerInfo + ", rentalVal=" + this.rentalVal + ", rentalCycleId=" + this.rentalCycleId + ", bundledFlag=" + this.bundledFlag + ", lastMile=" + this.lastMile + ", technology=" + this.technology + ", packageType=" + this.packageType + ", status=" + this.status + ", isDiscounted=" + this.isDiscounted + ", discountDesc=" + this.discountDesc + ", discountedRentalVal=" + this.discountedRentalVal + ", productData=" + this.productData + ", category=" + this.category + ", hierarchy=" + this.hierarchy + ", offerType=" + this.offerType + ")";
            int i2 = component2 + 45;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return str;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.offeringId);
            dest.writeString(this.offeringCode);
            dest.writeString(this.serviceCode);
            dest.writeString(this.offerInfo);
            Integer num = this.rentalVal;
            if (num == null) {
                int i2 = ShareDataUIState + 107;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    dest.writeInt(1);
                } else {
                    dest.writeInt(0);
                }
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            dest.writeString(this.rentalCycleId);
            dest.writeString(this.bundledFlag);
            dest.writeString(this.lastMile);
            dest.writeString(this.technology);
            dest.writeString(this.packageType);
            dest.writeString(this.status);
            Boolean bool = this.isDiscounted;
            if (bool == null) {
                int i3 = component2 + 51;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(bool.booleanValue() ? 1 : 0);
            }
            dest.writeString(this.discountDesc);
            Double d2 = this.discountedRentalVal;
            if (d2 == null) {
                dest.writeInt(0);
                int i5 = ShareDataUIState + 13;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            } else {
                dest.writeInt(1);
                dest.writeDouble(d2.doubleValue());
            }
            ProductData productData = this.productData;
            if (productData == null) {
                int i7 = component2 + 105;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productData.writeToParcel(dest, flags);
            }
            dest.writeString(this.category);
            Integer num2 = this.hierarchy;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num2.intValue());
            }
            dest.writeString(this.offerType);
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003Jc\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÇ\u0001J\b\u0010!\u001a\u00020\"H\u0007J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H×\u0003J\t\u0010'\u001a\u00020\"H×\u0001J\t\u0010(\u001a\u00020\u0003H×\u0001J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductData;", "Landroid/os/Parcelable;", Keys.BUNDLE_TYPE_SMS, "", "minutes", "data", "bandwidth", "offerDuration", "description", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Description;", "resources", "Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductResources;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductResources;)V", "getSms", "()Ljava/lang/String;", "getMinutes", "getData", "getBandwidth", "getOfferDuration", "getDescription", "()Ljava/util/List;", "getResources", "()Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductResources;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductData implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<ProductData> CREATOR = new Creator();
        private static int component1 = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        @SerializedName("bandwidth")
        private final String bandwidth;

        @SerializedName("data")
        private final String data;

        @SerializedName("description")
        private final List<Description> description;

        @SerializedName("minutes")
        private final String minutes;

        @SerializedName("offerDuration")
        private final String offerDuration;

        @SerializedName("resources")
        private final ProductResources resources;

        @SerializedName(Keys.BUNDLE_TYPE_SMS)
        private final String sms;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductData> {
            private static int component2 = 0;
            private static int component3 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                int i = 2 % 2;
                int i2 = component3 + 19;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                if (i3 != 0) {
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readString();
                    parcel.readInt();
                    productResources.hashCode();
                    throw null;
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i4 = parcel.readInt();
                    arrayList = new ArrayList(i4);
                    int i5 = 0;
                    while (i5 != i4) {
                        int i6 = component3 + 121;
                        component2 = i6 % 128;
                        if (i6 % 2 != 0) {
                            arrayList.add(Description.CREATOR.createFromParcel(parcel));
                            i5 += 5;
                        } else {
                            arrayList.add(Description.CREATOR.createFromParcel(parcel));
                            i5++;
                        }
                    }
                }
                return new ProductData(string, string2, string3, string4, string5, arrayList, parcel.readInt() != 0 ? ProductResources.CREATOR.createFromParcel(parcel) : null);
            }

            @Override
            public ProductData createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = component2 + 87;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ProductData productDataCreateFromParcel = createFromParcel(parcel);
                if (i3 == 0) {
                    int i4 = 33 / 0;
                }
                return productDataCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductData[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component3 + 123;
                int i4 = i3 % 128;
                component2 = i4;
                ProductData[] productDataArr = new ProductData[i];
                if (i3 % 2 != 0) {
                    int i5 = 47 / 0;
                }
                int i6 = i4 + 93;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 41 / 0;
                }
                return productDataArr;
            }

            @Override
            public ProductData[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 11;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ProductData[] productDataArrNewArray = newArray(i);
                if (i4 == 0) {
                    int i5 = 19 / 0;
                }
                return productDataArrNewArray;
            }
        }

        public ProductData(String str, String str2, String str3, String str4, String str5, List<Description> list, ProductResources productResources) {
            this.sms = str;
            this.minutes = str2;
            this.data = str3;
            this.bandwidth = str4;
            this.offerDuration = str5;
            this.description = list;
            this.resources = productResources;
        }

        public final String getSms() {
            int i = 2 % 2;
            int i2 = component3 + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.sms;
            if (i3 == 0) {
                int i4 = 38 / 0;
            }
            return str;
        }

        public final String getMinutes() {
            int i = 2 % 2;
            int i2 = copydefault + 93;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.minutes;
            int i5 = i3 + 21;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String getData() {
            int i = 2 % 2;
            int i2 = component3 + 9;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.data;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getBandwidth() {
            int i = 2 % 2;
            int i2 = component3 + 35;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            String str = this.bandwidth;
            if (i3 == 0) {
                int i4 = 32 / 0;
            }
            return str;
        }

        public final String getOfferDuration() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 29;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.offerDuration;
            int i5 = i2 + 3;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final List<Description> getDescription() {
            int i = 2 % 2;
            int i2 = component3 + 29;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            List<Description> list = this.description;
            int i5 = i3 + 97;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final ProductResources getResources() {
            int i = 2 % 2;
            int i2 = component3 + 113;
            int i3 = i2 % 128;
            copydefault = i3;
            int i4 = i2 % 2;
            ProductResources productResources = this.resources;
            int i5 = i3 + 115;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return productResources;
        }

        static {
            int i = component1 + 31;
            component2 = i % 128;
            int i2 = i % 2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static ProductData copy$default(ProductData productData, String str, String str2, String str3, String str4, String str5, List list, ProductResources productResources, int i, Object obj) {
            String str6;
            String str7;
            String str8;
            int i2 = 2 % 2;
            String str9 = (i & 1) != 0 ? productData.sms : str;
            Object obj2 = null;
            if ((i & 2) != 0) {
                int i3 = component3 + 27;
                copydefault = i3 % 128;
                if (i3 % 2 == 0) {
                    String str10 = productData.minutes;
                    throw null;
                }
                str6 = productData.minutes;
            } else {
                str6 = str2;
            }
            if ((i & 4) != 0) {
                int i4 = copydefault + 29;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    str7 = productData.data;
                    int i5 = 46 / 0;
                } else {
                    str7 = productData.data;
                }
            } else {
                str7 = str3;
            }
            String str11 = (i & 8) != 0 ? productData.bandwidth : str4;
            if ((i & 16) != 0) {
                int i6 = copydefault + 79;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    String str12 = productData.offerDuration;
                    obj2.hashCode();
                    throw null;
                }
                str8 = productData.offerDuration;
            } else {
                str8 = str5;
            }
            return productData.copy(str9, str6, str7, str11, str8, (i & 32) != 0 ? productData.description : list, (i & 64) != 0 ? productData.resources : productResources);
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 61;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            String str = this.sms;
            int i5 = i2 + 37;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return str;
            }
            throw null;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            String str = this.minutes;
            int i5 = i3 + 43;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component3() {
            int i = 2 % 2;
            int i2 = component3 + 61;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.data;
            }
            throw null;
        }

        public final String component4() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 71;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.bandwidth;
            int i5 = i2 + 103;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component5() {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.offerDuration;
            }
            throw null;
        }

        public final List<Description> component6() {
            int i = 2 % 2;
            int i2 = copydefault + 119;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            List<Description> list = this.description;
            int i5 = i3 + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return list;
        }

        public final ProductResources component7() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 5;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ProductResources productResources = this.resources;
            int i5 = i2 + 71;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return productResources;
        }

        public final ProductData copy(String sms, String minutes, String data, String bandwidth, String offerDuration, List<Description> description, ProductResources resources) {
            int i = 2 % 2;
            ProductData productData = new ProductData(sms, minutes, data, bandwidth, offerDuration, description, resources);
            int i2 = copydefault + 37;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return productData;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 55;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 13;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                return 0;
            }
            throw null;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(!(other instanceof ProductData))) {
                ProductData productData = (ProductData) other;
                if (!Intrinsics.areEqual(this.sms, productData.sms)) {
                    int i2 = component3 + 11;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return false;
                }
                if (Intrinsics.areEqual(this.minutes, productData.minutes) && !(!Intrinsics.areEqual(this.data, productData.data))) {
                    if (!(!Intrinsics.areEqual(this.bandwidth, productData.bandwidth))) {
                        if (!Intrinsics.areEqual(this.offerDuration, productData.offerDuration) || !Intrinsics.areEqual(this.description, productData.description)) {
                            return false;
                        }
                        if (Intrinsics.areEqual(this.resources, productData.resources)) {
                            return true;
                        }
                        int i4 = component3 + 41;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        return false;
                    }
                    int i6 = copydefault + 27;
                    component3 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.sms;
            int iHashCode2 = 0;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            String str2 = this.minutes;
            if (str2 == null) {
                int i2 = component3 + 105;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str2.hashCode();
            }
            String str3 = this.data;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.bandwidth;
            int iHashCode5 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.offerDuration;
            int iHashCode6 = str5 == null ? 0 : str5.hashCode();
            List<Description> list = this.description;
            int iHashCode7 = list == null ? 0 : list.hashCode();
            ProductResources productResources = this.resources;
            if (productResources != null) {
                iHashCode2 = productResources.hashCode();
                int i4 = copydefault + 37;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 5;
                }
            }
            return (((((((((((iHashCode3 * 31) + iHashCode) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductData(sms=" + this.sms + ", minutes=" + this.minutes + ", data=" + this.data + ", bandwidth=" + this.bandwidth + ", offerDuration=" + this.offerDuration + ", description=" + this.description + ", resources=" + this.resources + ")";
            int i2 = copydefault + 109;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.sms);
            dest.writeString(this.minutes);
            dest.writeString(this.data);
            dest.writeString(this.bandwidth);
            dest.writeString(this.offerDuration);
            List<Description> list = this.description;
            if (list == null) {
                int i2 = copydefault + 27;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<Description> it = list.iterator();
                while (!(!it.hasNext())) {
                    int i4 = component3 + 107;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    it.next().writeToParcel(dest, flags);
                }
            }
            ProductResources productResources = this.resources;
            if (productResources != null) {
                dest.writeInt(1);
                productResources.writeToParcel(dest, flags);
            } else {
                int i6 = component3 + 103;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                dest.writeInt(0);
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÇ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u000eH×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eH\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$ProductResources;", "Landroid/os/Parcelable;", "resourceType", "", "resourceAmt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getResourceType", "()Ljava/lang/String;", "getResourceAmt", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ProductResources implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ProductResources> CREATOR = new Creator();
        private static int ShareDataUIState = 1;
        private static int component2 = 0;
        private static int component3 = 0;
        private static int copydefault = 1;

        @SerializedName("resourceAmt")
        private final String resourceAmt;

        @SerializedName("resourceType")
        private final String resourceType;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ProductResources> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductResources createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                ProductResources productResources = new ProductResources(parcel.readString(), parcel.readString());
                int i2 = copydefault + 3;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return productResources;
                }
                throw null;
            }

            @Override
            public ProductResources createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 103;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ProductResources productResourcesCreateFromParcel = createFromParcel(parcel);
                int i4 = ShareDataUIState + 55;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return productResourcesCreateFromParcel;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ProductResources[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 87;
                int i4 = i3 % 128;
                ShareDataUIState = i4;
                int i5 = i3 % 2;
                ProductResources[] productResourcesArr = new ProductResources[i];
                int i6 = i4 + 115;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return productResourcesArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ProductResources[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 113;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ProductResources[] productResourcesArrNewArray = newArray(i);
                int i5 = ShareDataUIState + 93;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return productResourcesArrNewArray;
            }
        }

        public ProductResources(String str, String str2) {
            this.resourceType = str;
            this.resourceAmt = str2;
        }

        public final String getResourceType() {
            int i = 2 % 2;
            int i2 = component3 + 35;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return this.resourceType;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final String getResourceAmt() {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return this.resourceAmt;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = ShareDataUIState + 87;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static ProductResources copy$default(ProductResources productResources, String str, String str2, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = copydefault;
            int i4 = i3 + 15;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 1) != 0) {
                int i6 = i3 + 87;
                component3 = i6 % 128;
                if (i6 % 2 != 0) {
                    String str3 = productResources.resourceType;
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                str = productResources.resourceType;
            }
            if ((i & 2) != 0) {
                str2 = productResources.resourceAmt;
                int i7 = i3 + 57;
                component3 = i7 % 128;
                int i8 = i7 % 2;
            }
            return productResources.copy(str, str2);
        }

        public final String component1() {
            String str;
            int i = 2 % 2;
            int i2 = component3 + 71;
            int i3 = i2 % 128;
            copydefault = i3;
            if (i2 % 2 == 0) {
                str = this.resourceType;
                int i4 = 43 / 0;
            } else {
                str = this.resourceType;
            }
            int i5 = i3 + 31;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final String component2() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 7;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            String str = this.resourceAmt;
            int i5 = i2 + 77;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final ProductResources copy(String resourceType, String resourceAmt) {
            int i = 2 % 2;
            ProductResources productResources = new ProductResources(resourceType, resourceAmt);
            int i2 = copydefault + 9;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return productResources;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 59;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductResources)) {
                return false;
            }
            ProductResources productResources = (ProductResources) other;
            if (!Intrinsics.areEqual(this.resourceType, productResources.resourceType)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.resourceAmt, productResources.resourceAmt)) {
                int i2 = copydefault + 111;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return false;
            }
            int i4 = component3 + 45;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.resourceType;
            int iHashCode2 = 0;
            if (str == null) {
                int i2 = copydefault + 25;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            String str2 = this.resourceAmt;
            if (str2 == null) {
                int i4 = component3 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode2 = str2.hashCode();
            }
            return (iHashCode * 31) + iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "ProductResources(resourceType=" + this.resourceType + ", resourceAmt=" + this.resourceAmt + ")";
            int i2 = copydefault + 37;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 60 / 0;
            }
            return str;
        }

        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            int i = 2 % 2;
            int i2 = copydefault + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.resourceType);
            dest.writeString(this.resourceAmt);
            int i4 = copydefault + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÇ\u0001¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H×\u0003J\t\u0010\u0016\u001a\u00020\u0012H×\u0001J\t\u0010\u0017\u001a\u00020\u0003H×\u0001J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012H\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Description;", "Landroid/os/Parcelable;", "description", "", "available", "", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "getDescription", "()Ljava/lang/String;", "getAvailable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lcom/huawei/digitalpayment/consumer/fixeddata/data/model/changeplan/FibreProduct$Description;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Description implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Description> CREATOR = new Creator();
        private static int ShareDataUIState = 0;
        private static int component2 = 0;
        private static int component3 = 1;
        private static int copydefault = 1;

        @SerializedName("available")
        private final Boolean available;

        @SerializedName("description")
        private final String description;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Description> {
            private static int component2 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Description createFromParcel(Parcel parcel) {
                boolean z;
                Boolean boolValueOf;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(parcel, "");
                String string = parcel.readString();
                if (parcel.readInt() == 0) {
                    int i2 = component2 + 103;
                    copydefault = i2 % 128;
                    boolValueOf = null;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                } else {
                    if (parcel.readInt() != 0) {
                        int i3 = copydefault + 65;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        z = true;
                    } else {
                        int i5 = copydefault + 63;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                return new Description(string, boolValueOf);
            }

            @Override
            public Description createFromParcel(Parcel parcel) {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Description descriptionCreateFromParcel = createFromParcel(parcel);
                int i4 = copydefault + 117;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return descriptionCreateFromParcel;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final Description[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = component2 + 23;
                copydefault = i3 % 128;
                Description[] descriptionArr = new Description[i];
                if (i3 % 2 == 0) {
                    return descriptionArr;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public Description[] newArray(int i) {
                int i2 = 2 % 2;
                int i3 = copydefault + 19;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Description[] descriptionArrNewArray = newArray(i);
                int i5 = component2 + 99;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return descriptionArrNewArray;
            }
        }

        public Description(String str, Boolean bool) {
            this.description = str;
            this.available = bool;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Description(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i & 2) != 0) {
                int i2 = ShareDataUIState;
                int i3 = i2 + 29;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 101;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 2 % 2;
                bool = null;
            }
            this(str, bool);
        }

        public final String getDescription() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 17;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            String str = this.description;
            int i5 = i2 + 61;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public final Boolean getAvailable() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 63;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return this.available;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        static {
            int i = copydefault + 123;
            component2 = i % 128;
            int i2 = i % 2;
        }

        public static Description copy$default(Description description, String str, Boolean bool, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 1) != 0) {
                int i3 = component3 + 71;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                str = description.description;
            }
            if ((i & 2) != 0) {
                bool = description.available;
            }
            Description descriptionCopy = description.copy(str, bool);
            int i5 = ShareDataUIState + 61;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return descriptionCopy;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        public final String component1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 7;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            String str = this.description;
            int i4 = i2 + 57;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return str;
        }

        public final Boolean component2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState;
            int i3 = i2 + 7;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Boolean bool = this.available;
            int i4 = i2 + 113;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return bool;
        }

        public final Description copy(String description, Boolean available) {
            int i = 2 % 2;
            Description description2 = new Description(description, available);
            int i2 = component3 + 109;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return description2;
            }
            throw null;
        }

        @Override
        public final int describeContents() {
            int i = 2 % 2;
            int i2 = component3 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return 0;
        }

        public boolean equals(Object other) {
            int i = 2 % 2;
            if (this == other) {
                int i2 = ShareDataUIState + 69;
                component3 = i2 % 128;
                return i2 % 2 != 0;
            }
            if (!(other instanceof Description)) {
                int i3 = ShareDataUIState + 25;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            Description description = (Description) other;
            if (!Intrinsics.areEqual(this.description, description.description)) {
                return false;
            }
            if (Intrinsics.areEqual(this.available, description.available)) {
                return true;
            }
            int i5 = component3 + 25;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        public int hashCode() {
            int iHashCode;
            int i = 2 % 2;
            String str = this.description;
            if (str == null) {
                int i2 = ShareDataUIState + 33;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                iHashCode = 0;
            } else {
                iHashCode = str.hashCode();
            }
            Boolean bool = this.available;
            int iHashCode2 = (iHashCode * 31) + (bool == null ? 0 : bool.hashCode());
            int i4 = ShareDataUIState + 3;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 70 / 0;
            }
            return iHashCode2;
        }

        public String toString() {
            int i = 2 % 2;
            String str = "Description(description=" + this.description + ", available=" + this.available + ")";
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [android.os.Parcel, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3, types: [int] */
        /* JADX WARN: Type inference failed for: r5v4 */
        @Override
        public final void writeToParcel(Parcel dest, int flags) {
            ?? r5;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dest, "");
            dest.writeString(this.description);
            Boolean bool = this.available;
            if (bool == null) {
                r5 = 0;
            } else {
                dest.writeInt(1);
                boolean zBooleanValue = bool.booleanValue();
                int i4 = ShareDataUIState + 1;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                r5 = zBooleanValue;
            }
            dest.writeInt(r5);
        }
    }
}
