package com.huawei.digitalpayment.consumer.base.resp;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/Service;", "Landroid/os/Parcelable;", "categories", "", "Lcom/huawei/digitalpayment/consumer/base/resp/CategoryX;", GriverCacheDao.COLUMN_CACHE_ID, "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getCategories", "()Ljava/util/List;", "getId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Service implements Parcelable {
    public static final Parcelable.Creator<Service> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;

    @SerializedName("categories")
    private final List<CategoryX> categories;

    @SerializedName(GriverCacheDao.COLUMN_CACHE_ID)
    private final String id;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Service> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.huawei.digitalpayment.consumer.base.resp.Service createFromParcel(android.os.Parcel r7) {
            /*
                r6 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.base.resp.Service.Creator.ShareDataUIState
                int r1 = r1 + 65
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.Service.Creator.copydefault = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r3)
                if (r1 == 0) goto L1e
                int r1 = r7.readInt()
                r3 = 99
                int r3 = r3 / r2
                if (r1 != 0) goto L2f
                goto L24
            L1e:
                int r1 = r7.readInt()
                if (r1 != 0) goto L2f
            L24:
                int r1 = com.huawei.digitalpayment.consumer.base.resp.Service.Creator.copydefault
                int r1 = r1 + 107
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.base.resp.Service.Creator.ShareDataUIState = r2
                int r1 = r1 % r0
                r0 = 0
                goto L5e
            L2f:
                int r1 = r7.readInt()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r1)
            L38:
                if (r2 == r1) goto L5d
                int r4 = com.huawei.digitalpayment.consumer.base.resp.Service.Creator.ShareDataUIState
                int r4 = r4 + 125
                int r5 = r4 % 128
                com.huawei.digitalpayment.consumer.base.resp.Service.Creator.copydefault = r5
                int r4 = r4 % r0
                if (r4 == 0) goto L51
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.CategoryX> r4 = com.huawei.digitalpayment.consumer.base.resp.CategoryX.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r7)
                r3.add(r4)
                int r2 = r2 + 34
                goto L38
            L51:
                android.os.Parcelable$Creator<com.huawei.digitalpayment.consumer.base.resp.CategoryX> r4 = com.huawei.digitalpayment.consumer.base.resp.CategoryX.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r7)
                r3.add(r4)
                int r2 = r2 + 1
                goto L38
            L5d:
                r0 = r3
            L5e:
                com.huawei.digitalpayment.consumer.base.resp.Service r1 = new com.huawei.digitalpayment.consumer.base.resp.Service
                java.util.List r0 = (java.util.List) r0
                java.lang.String r7 = r7.readString()
                r1.<init>(r0, r7)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.resp.Service.Creator.createFromParcel(android.os.Parcel):com.huawei.digitalpayment.consumer.base.resp.Service");
        }

        @Override
        public Service createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Service serviceCreateFromParcel = createFromParcel(parcel);
            if (i3 == 0) {
                int i4 = 74 / 0;
            }
            int i5 = copydefault + 113;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return serviceCreateFromParcel;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final Service[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 15;
            copydefault = i4 % 128;
            Service[] serviceArr = new Service[i];
            if (i4 % 2 != 0) {
                int i5 = 17 / 0;
            }
            int i6 = i3 + 1;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return serviceArr;
            }
            throw null;
        }

        @Override
        public Service[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = copydefault + 35;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            Service[] serviceArrNewArray = newArray(i);
            int i5 = ShareDataUIState + 53;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return serviceArrNewArray;
            }
            throw null;
        }
    }

    public Service(List<CategoryX> list, String str) {
        this.categories = list;
        this.id = str;
    }

    public final List<CategoryX> getCategories() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<CategoryX> list = this.categories;
        if (i3 == 0) {
            int i4 = 84 / 0;
        }
        return list;
    }

    public final String getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    static {
        int i = component2 + 65;
        copydefault = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Service copy$default(Service service, List list, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            int i6 = i3 + 41;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            list = service.categories;
        }
        if ((i & 2) != 0) {
            str = service.id;
        }
        return service.copy(list, str);
    }

    public final List<CategoryX> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        List<CategoryX> list = this.categories;
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
        return list;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.id;
        int i4 = i3 + 115;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 5 / 0;
        }
        return str;
    }

    public final Service copy(List<CategoryX> categories, String id) {
        int i = 2 % 2;
        Service service = new Service(categories, id);
        int i2 = ShareDataUIState + 85;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return service;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 39;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 71;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == other) {
            int i4 = i2 + 119;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (!(other instanceof Service)) {
            return false;
        }
        Service service = (Service) other;
        if (Intrinsics.areEqual(this.categories, service.categories)) {
            return Intrinsics.areEqual(this.id, service.id);
        }
        int i6 = component3;
        int i7 = i6 + 97;
        ShareDataUIState = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i6 + 19;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        List<CategoryX> list = this.categories;
        if (list == null) {
            int i5 = i3 + 57;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = list.hashCode();
        }
        String str = this.id;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "Service(categories=" + this.categories + ", id=" + this.id + ")";
        int i2 = ShareDataUIState + 81;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 55 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<CategoryX> list = this.categories;
        if (list == null) {
            int i4 = ShareDataUIState + 41;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<CategoryX> it = list.iterator();
            while (!(!it.hasNext())) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.id);
        int i6 = component3 + 81;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }
}
