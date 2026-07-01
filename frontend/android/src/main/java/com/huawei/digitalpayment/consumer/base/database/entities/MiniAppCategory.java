package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/MiniAppCategory;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "order", "", "categoryName", "icon", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getOrder", "()I", "getCategoryName", "getIcon", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppCategory {
    private static int copy = 1;
    private static int copydefault;
    private final String ShareDataUIState;
    private final String component1;
    private final int component2;
    private final String component3;

    public MiniAppCategory(String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ShareDataUIState = str;
        this.component2 = i;
        this.component3 = str2;
        this.component1 = str3;
    }

    public final String getId() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.ShareDataUIState;
            int i4 = 35 / 0;
        } else {
            str = this.ShareDataUIState;
        }
        int i5 = i3 + 1;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getOrder() {
        int i = 2 % 2;
        int i2 = copydefault + 33;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.component2;
        if (i3 == 0) {
            int i5 = 86 / 0;
        }
        return i4;
    }

    public final String getCategoryName() {
        String str;
        int i = 2 % 2;
        int i2 = copydefault + 73;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.component3;
            int i4 = 34 / 0;
        } else {
            str = this.component3;
        }
        int i5 = i3 + 67;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 119;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component1;
        int i5 = i2 + 11;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static MiniAppCategory copy$default(MiniAppCategory miniAppCategory, String str, int i, String str2, String str3, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copydefault + 35;
        int i5 = i4 % 128;
        copy = i5;
        if (i4 % 2 != 0 && (i2 & 1) != 0) {
            str = miniAppCategory.ShareDataUIState;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 91;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            i = miniAppCategory.component2;
        }
        if ((i2 & 4) != 0) {
            str2 = miniAppCategory.component3;
            int i8 = i5 + 51;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
        }
        if ((i2 & 8) != 0) {
            str3 = miniAppCategory.component1;
        }
        return miniAppCategory.copy(str, i, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copy + 95;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component2() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 65;
        copy = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.component2;
        int i5 = i2 + 37;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copy + 53;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copy + 43;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final MiniAppCategory copy(String id, int order, String categoryName, String icon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(id, "");
        Intrinsics.checkNotNullParameter(categoryName, "");
        Intrinsics.checkNotNullParameter(icon, "");
        MiniAppCategory miniAppCategory = new MiniAppCategory(id, order, categoryName, icon);
        int i2 = copydefault + 11;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return miniAppCategory;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = copydefault + 21;
            copy = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof MiniAppCategory)) {
            int i4 = copydefault + 123;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        MiniAppCategory miniAppCategory = (MiniAppCategory) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, miniAppCategory.ShareDataUIState)) {
            return false;
        }
        if (this.component2 != miniAppCategory.component2) {
            int i6 = copydefault + 63;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component3, miniAppCategory.component3)) {
            return Intrinsics.areEqual(this.component1, miniAppCategory.component1);
        }
        int i8 = copydefault + 43;
        copy = i8 % 128;
        return i8 % 2 == 0;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        copy = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.ShareDataUIState.hashCode() * 31) + Integer.hashCode(this.component2)) * 31) + this.component3.hashCode()) * 31) + this.component1.hashCode();
        int i4 = copydefault + 65;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppCategory(id=" + this.ShareDataUIState + ", order=" + this.component2 + ", categoryName=" + this.component3 + ", icon=" + this.component1 + ")";
        int i2 = copydefault + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
