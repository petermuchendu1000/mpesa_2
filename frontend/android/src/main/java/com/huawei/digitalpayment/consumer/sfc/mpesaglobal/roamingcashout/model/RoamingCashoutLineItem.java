package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutLineItem;", "Landroid/os/Parcelable;", GriverCacheDao.COLUMN_CACHE_ID, "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/model/RoamingCashoutId;", "<init>", "(Ljava/util/List;)V", "getId", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashoutLineItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RoamingCashoutLineItem> CREATOR = new Creator();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;
    private final List<RoamingCashoutId> id;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RoamingCashoutLineItem> {
        private static int component1 = 0;
        private static int component3 = 1;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutLineItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = component1 + 87;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (i5 != i2) {
                int i6 = component1 + 67;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    arrayList.add(RoamingCashoutId.CREATOR.createFromParcel(parcel));
                    i5 += 68;
                } else {
                    arrayList.add(RoamingCashoutId.CREATOR.createFromParcel(parcel));
                    i5++;
                }
            }
            return new RoamingCashoutLineItem(arrayList);
        }

        @Override
        public RoamingCashoutLineItem createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final RoamingCashoutLineItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 67;
            component3 = i3 % 128;
            RoamingCashoutLineItem[] roamingCashoutLineItemArr = new RoamingCashoutLineItem[i];
            if (i3 % 2 == 0) {
                int i4 = 2 / 0;
            }
            return roamingCashoutLineItemArr;
        }

        @Override
        public RoamingCashoutLineItem[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 31;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            RoamingCashoutLineItem[] roamingCashoutLineItemArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 65 / 0;
            }
            int i6 = component1 + 9;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return roamingCashoutLineItemArrNewArray;
        }
    }

    public RoamingCashoutLineItem(List<RoamingCashoutId> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.id = list;
    }

    public final List<RoamingCashoutId> getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 21;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<RoamingCashoutId> list = this.id;
        int i5 = i2 + 99;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = component1 + 47;
        copydefault = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RoamingCashoutLineItem copy$default(RoamingCashoutLineItem roamingCashoutLineItem, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2 + 9;
        int i4 = i3 % 128;
        ShareDataUIState = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            list = roamingCashoutLineItem.id;
            int i6 = i4 + 113;
            component2 = i6 % 128;
            int i7 = i6 % 2;
        }
        return roamingCashoutLineItem.copy(list);
    }

    public final List<RoamingCashoutId> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.id;
        }
        throw null;
    }

    public final RoamingCashoutLineItem copy(List<RoamingCashoutId> id) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        RoamingCashoutLineItem roamingCashoutLineItem = new RoamingCashoutLineItem(id);
        int i2 = ShareDataUIState + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return roamingCashoutLineItem;
        }
        throw null;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = component2 + 77;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 119;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 17;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof RoamingCashoutLineItem) || !Intrinsics.areEqual(this.id, ((RoamingCashoutLineItem) other).id)) {
            return false;
        }
        int i3 = component2 + 79;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return true;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.id.hashCode();
        int i4 = ShareDataUIState + 85;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RoamingCashoutLineItem(id=" + this.id + ')';
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 46 / 0;
        }
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<RoamingCashoutId> list = this.id;
        dest.writeInt(list.size());
        Iterator<RoamingCashoutId> it = list.iterator();
        int i2 = ShareDataUIState + 75;
        while (true) {
            component2 = i2 % 128;
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                return;
            }
            int i4 = component2 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            it.next().writeToParcel(dest, flags);
            i2 = ShareDataUIState + 95;
        }
    }
}
