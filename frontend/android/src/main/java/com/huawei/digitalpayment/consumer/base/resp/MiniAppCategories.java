package com.huawei.digitalpayment.consumer.base.resp;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/resp/MiniAppCategories;", "", "categoryName", "", "miniAppsNumber", "", "<init>", "(Ljava/lang/String;I)V", "getCategoryName", "()Ljava/lang/String;", "getMiniAppsNumber", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppCategories {
    private static int component1 = 1;
    private static int component2;
    private final String categoryName;
    private final int miniAppsNumber;

    public MiniAppCategories(String str, int i) {
        this.categoryName = str;
        this.miniAppsNumber = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppCategories(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 1) != 0) {
            int i3 = component2;
            int i4 = i3 + 25;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = i3 + 63;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 2 % 2;
            }
            str = null;
        }
        if ((i2 & 2) != 0) {
            int i8 = 2 % 2;
            i = 0;
        }
        this(str, i);
    }

    public final String getCategoryName() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 37;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.categoryName;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
        return str;
    }

    public final int getMiniAppsNumber() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.miniAppsNumber;
        int i6 = i2 + 47;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 63 / 0;
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiniAppCategories() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static MiniAppCategories copy$default(MiniAppCategories miniAppCategories, String str, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = miniAppCategories.categoryName;
        }
        if ((i2 & 2) != 0) {
            int i4 = component1 + 15;
            int i5 = i4 % 128;
            component2 = i5;
            if (i4 % 2 != 0) {
                i = miniAppCategories.miniAppsNumber;
                int i6 = 44 / 0;
            } else {
                i = miniAppCategories.miniAppsNumber;
            }
            int i7 = i5 + 65;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        return miniAppCategories.copy(str, i);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.categoryName;
        int i5 = i3 + 61;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
        return str;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = component2 + 19;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        int i4 = this.miniAppsNumber;
        int i5 = i3 + 49;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return i4;
        }
        throw null;
    }

    public final MiniAppCategories copy(String categoryName, int miniAppsNumber) {
        int i = 2 % 2;
        MiniAppCategories miniAppCategories = new MiniAppCategories(categoryName, miniAppsNumber);
        int i2 = component2 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
        return miniAppCategories;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniAppCategories)) {
            return false;
        }
        MiniAppCategories miniAppCategories = (MiniAppCategories) other;
        if (!Intrinsics.areEqual(this.categoryName, miniAppCategories.categoryName) || this.miniAppsNumber != miniAppCategories.miniAppsNumber) {
            return false;
        }
        int i4 = component2 + 11;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2 + 107;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.categoryName;
        if (str == null) {
            int i5 = i3 + 107;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + Integer.hashCode(this.miniAppsNumber);
        int i7 = component1 + 27;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppCategories(categoryName=" + this.categoryName + ", miniAppsNumber=" + this.miniAppsNumber + ")";
        int i2 = component2 + 121;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
