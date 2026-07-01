package com.huawei.digitalpayment.consumer.sfcui.reportfraud.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÇ\u0001J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H×\u0003J\t\u0010\u0011\u001a\u00020\fH×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fH\u0007R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/ReportedFraudList;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.ITEMS, "", "Lcom/huawei/digitalpayment/consumer/sfcui/reportfraud/models/ReportedFraudListItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportedFraudList implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReportedFraudList> CREATOR = new Creator();
    private static int ShareDataUIState = 0;
    private static int component1 = 0;
    private static int component3 = 1;
    private static int copydefault = 1;

    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private final List<ReportedFraudListItem> items;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReportedFraudList> {
        private static int ShareDataUIState = 1;
        private static int component3;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReportedFraudList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = ShareDataUIState + 21;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            for (int i5 = 0; i5 != i2; i5++) {
                int i6 = component3 + 43;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                arrayList.add(ReportedFraudListItem.CREATOR.createFromParcel(parcel));
            }
            return new ReportedFraudList(arrayList);
        }

        @Override
        public ReportedFraudList createFromParcel(Parcel parcel) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return createFromParcel(parcel);
            }
            createFromParcel(parcel);
            throw null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override
        public final ReportedFraudList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3;
            int i4 = i3 + 121;
            ShareDataUIState = i4 % 128;
            ReportedFraudList[] reportedFraudListArr = new ReportedFraudList[i];
            if (i4 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i3 + 93;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return reportedFraudListArr;
        }

        @Override
        public ReportedFraudList[] newArray(int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 119;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            ReportedFraudList[] reportedFraudListArrNewArray = newArray(i);
            if (i4 == 0) {
                int i5 = 59 / 0;
            }
            return reportedFraudListArrNewArray;
        }
    }

    public ReportedFraudList(List<ReportedFraudListItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.items = list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReportedFraudList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 91;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            list = CollectionsKt.emptyList();
            int i4 = copydefault + 71;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
        }
        this(list);
    }

    public final List<ReportedFraudListItem> getItems() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        List<ReportedFraudListItem> list = this.items;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    static {
        int i = ShareDataUIState + 53;
        component3 = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReportedFraudList() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ReportedFraudList copy$default(ReportedFraudList reportedFraudList, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 87;
        int i4 = i3 % 128;
        copydefault = i4;
        int i5 = i & 1;
        if (i3 % 2 != 0 ? i5 != 0 : i5 != 0) {
            int i6 = i4 + 95;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                List<ReportedFraudListItem> list2 = reportedFraudList.items;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            list = reportedFraudList.items;
        }
        ReportedFraudList reportedFraudListCopy = reportedFraudList.copy(list);
        int i7 = copydefault + 79;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return reportedFraudListCopy;
    }

    public final List<ReportedFraudListItem> component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 27;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        List<ReportedFraudListItem> list = this.items;
        int i5 = i2 + 113;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final ReportedFraudList copy(List<ReportedFraudListItem> items) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(items, "");
        ReportedFraudList reportedFraudList = new ReportedFraudList(items);
        int i2 = component1 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return reportedFraudList;
    }

    @Override
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return 0;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportedFraudList)) {
            int i2 = copydefault + 47;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.items, ((ReportedFraudList) other).items)) {
            int i4 = component1 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = copydefault + 21;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 80 / 0;
        }
        return true;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = this.items.hashCode();
        int i4 = copydefault + 55;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "ReportedFraudList(items=" + this.items + ")";
        int i2 = copydefault + 15;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    @Override
    public final void writeToParcel(Parcel dest, int flags) {
        int i = 2 % 2;
        int i2 = component1 + 9;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dest, "");
        List<ReportedFraudListItem> list = this.items;
        dest.writeInt(list.size());
        Iterator<ReportedFraudListItem> it = list.iterator();
        int i4 = component1 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            int i6 = copydefault + 105;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                it.next().writeToParcel(dest, flags);
                throw null;
            }
            it.next().writeToParcel(dest, flags);
        }
    }
}
