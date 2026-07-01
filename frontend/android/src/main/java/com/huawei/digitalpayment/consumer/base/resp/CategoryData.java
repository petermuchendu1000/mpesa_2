package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/CategoryData;", "Landroid/os/Parcelable;", "categories", "", "Lcom/huawei/digitalpayment/consumer/base/resp/Category;", "serviceList", "Lcom/huawei/digitalpayment/consumer/base/resp/ServiceX;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "getServiceList", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategoryData implements Parcelable {
    public static final Parcelable.Creator<CategoryData> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component3;
    private static int copydefault;

    @SerializedName("categories")
    private final List<Category> categories;

    @SerializedName("serviceList")
    private final List<ServiceX> serviceList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryData> {
        private static int component2 = 0;
        private static int copydefault = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[LOOP:1: B:12:0x0030->B:13:0x0032, LOOP_END] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.base.resp.CategoryData createFromParcel(android.os.Parcel r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.component2
                int r1 = r1 + 81
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                r4 = 0
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
                if (r1 != 0) goto L1e
                int r1 = r8.readInt()
                r3 = 1
                if (r1 != 0) goto L27
                r2 = r3
                goto L24
            L1e:
                int r1 = r8.readInt()
                if (r1 != 0) goto L26
            L24:
                r5 = r4
                goto L3f
            L26:
                r3 = r2
            L27:
                int r1 = r8.readInt()
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r1)
            L30:
                if (r2 == r1) goto L3e
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.Category> r6 = com.huawei.digitalpayment.consumer.base.resp.Category.CREATOR
                java.lang.Object r6 = r6.createFromParcel(r8)
                r5.add(r6)
                int r2 = r2 + 1
                goto L30
            L3e:
                r2 = r3
            L3f:
                java.util.List r5 = (java.util.List) r5
                int r1 = r8.readInt()
                if (r1 != 0) goto L51
                int r8 = com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.copydefault
                int r8 = r8 + 105
                int r1 = r8 % 128
                com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.component2 = r1
                int r8 = r8 % r0
                goto L68
            L51:
                int r1 = r8.readInt()
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r1)
            L5a:
                if (r2 == r1) goto L68
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.ServiceX> r3 = com.huawei.digitalpayment.consumer.base.resp.ServiceX.CREATOR
                java.lang.Object r3 = r3.createFromParcel(r8)
                r4.add(r3)
                int r2 = r2 + 1
                goto L5a
            L68:
                com.huawei.digitalpayment.consumer.base.resp.CategoryData r8 = new com.huawei.digitalpayment.consumer.base.resp.CategoryData
                java.util.List r4 = (java.util.List) r4
                r8.<init>(r5, r4)
                int r1 = com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.copydefault
                int r1 = r1 + 23
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.component2 = r2
                int r1 = r1 % r0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.CategoryData.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.base.resp.CategoryData");
        }

        @Override
        public CategoryData createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            CategoryData categoryDataCreateFromParcel = createFromParcel(parcel);
            int i4 = copydefault + 37;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return categoryDataCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final CategoryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 45;
            component2 = i3 % 128;
            CategoryData[] categoryDataArr = new CategoryData[i];
            if (i3 % 2 == 0) {
                return categoryDataArr;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Override
        public CategoryData[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 125;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            CategoryData[] categoryDataArrNewArray = newArray(i);
            int i5 = component2 + 71;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 48 / 0;
            }
            return categoryDataArrNewArray;
        }
    }

    public CategoryData(List<Category> list, List<ServiceX> list2) {
        this.categories = list;
        this.serviceList = list2;
    }

    public final List<Category> getCategories() {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.categories;
        }
        throw null;
    }

    public final List<ServiceX> getServiceList() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        List<ServiceX> list = this.serviceList;
        int i4 = i3 + 83;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return list;
    }

    static {
        int i = component3 + 117;
        component1 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CategoryData copy$default(CategoryData categoryData, List list, List list2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 9;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            list = categoryData.categories;
        }
        if ((i & 2) != 0) {
            int i6 = i4 + 85;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                List<ServiceX> list3 = categoryData.serviceList;
                throw null;
            }
            list2 = categoryData.serviceList;
        }
        return categoryData.copy(list, list2);
    }

    public final List<Category> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<Category> list = this.categories;
        int i5 = i3 + 5;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 32 / 0;
        }
        return list;
    }

    public final List<ServiceX> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 7;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<ServiceX> list = this.serviceList;
        int i5 = i2 + 71;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final CategoryData copy(List<Category> categories, List<ServiceX> serviceList) {
        int i = 2 % 2;
        CategoryData categoryData = new CategoryData(categories, serviceList);
        int i2 = ShareDataUIState + 17;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return categoryData;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 79;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 98 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryData)) {
            return false;
        }
        CategoryData categoryData = (CategoryData) other;
        if (Intrinsics.areEqual(this.categories, categoryData.categories)) {
            return Intrinsics.areEqual(this.serviceList, categoryData.serviceList);
        }
        int i2 = copydefault;
        int i3 = i2 + 91;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 43;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        List<Category> list = this.categories;
        if (list == null) {
            int i2 = ShareDataUIState + 99;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        List<ServiceX> list2 = this.serviceList;
        int iHashCode2 = (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
        int i4 = copydefault + 67;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "CategoryData(categories=" + this.categories + ", serviceList=" + this.serviceList + ")";
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<Category> list = this.categories;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<Category> it = list.iterator();
            int i2 = copydefault + 99;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            while (it.hasNext()) {
                int i4 = ShareDataUIState + 105;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                it.next().writeToParcel(dest, flags);
            }
        }
        List<ServiceX> list2 = this.serviceList;
        if (list2 == null) {
            int i6 = copydefault + 105;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list2.size());
        Iterator<ServiceX> it2 = list2.iterator();
        int i8 = copydefault + 63;
        ShareDataUIState = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 3 % 5;
        }
        while (it2.hasNext()) {
            it2.next().writeToParcel(dest, flags);
        }
    }
}
