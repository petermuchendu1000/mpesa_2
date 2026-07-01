package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0013H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/SortFilterUiModel;", "", "sortFilterType", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "isActive", "", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;Z)V", "getSortFilterType", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/searchbundles/ISortFilterType;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SortFilterUiModel {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int copydefault = 0;
    private static int equals = 1;
    private final boolean component1;
    private final ISortFilterType component3;

    public SortFilterUiModel(ISortFilterType iSortFilterType, boolean z) {
        Intrinsics.checkNotNullParameter(iSortFilterType, "");
        this.component3 = iSortFilterType;
        this.component1 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SortFilterUiModel(ISortFilterType iSortFilterType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            int i2 = equals + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            z = false;
        }
        this(iSortFilterType, z);
    }

    public final ISortFilterType getSortFilterType() {
        int i = 2 % 2;
        int i2 = copydefault + 7;
        int i3 = i2 % 128;
        equals = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        ISortFilterType iSortFilterType = this.component3;
        int i4 = i3 + 25;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return iSortFilterType;
        }
        throw null;
    }

    public final boolean isActive() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        equals = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component1;
        int i5 = i2 + 3;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 1 + 121;
        component2 = i % 128;
        int i2 = i % 2;
    }

    public static SortFilterUiModel copy$default(SortFilterUiModel sortFilterUiModel, ISortFilterType iSortFilterType, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = copydefault + 67;
        int i4 = i3 % 128;
        equals = i4;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            iSortFilterType = sortFilterUiModel.component3;
        }
        if ((i & 2) != 0) {
            z = sortFilterUiModel.component1;
            int i5 = i4 + 115;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }
        SortFilterUiModel sortFilterUiModelCopy = sortFilterUiModel.copy(iSortFilterType, z);
        int i7 = equals + 3;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return sortFilterUiModelCopy;
    }

    public final ISortFilterType component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        equals = i3 % 128;
        int i4 = i3 % 2;
        ISortFilterType iSortFilterType = this.component3;
        int i5 = i2 + 37;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return iSortFilterType;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = equals + 107;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean z = this.component1;
        int i4 = i3 + 25;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final SortFilterUiModel copy(ISortFilterType sortFilterType, boolean isActive) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sortFilterType, "");
        SortFilterUiModel sortFilterUiModel = new SortFilterUiModel(sortFilterType, isActive);
        int i2 = equals + 19;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return sortFilterUiModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 73;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SortFilterUiModel)) {
            return false;
        }
        SortFilterUiModel sortFilterUiModel = (SortFilterUiModel) other;
        if (!Intrinsics.areEqual(this.component3, sortFilterUiModel.component3)) {
            int i7 = copydefault + 79;
            equals = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (this.component1 == sortFilterUiModel.component1) {
            return true;
        }
        int i9 = equals + 53;
        copydefault = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 40 / 0;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = equals + 45;
        copydefault = i2 % 128;
        int iHashCode = i2 % 2 != 0 ? (this.component3.hashCode() + 120) % Boolean.hashCode(this.component1) : (this.component3.hashCode() * 31) + Boolean.hashCode(this.component1);
        int i3 = equals + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SortFilterUiModel(sortFilterType=" + this.component3 + ", isActive=" + this.component1 + ")";
        int i2 = copydefault + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
