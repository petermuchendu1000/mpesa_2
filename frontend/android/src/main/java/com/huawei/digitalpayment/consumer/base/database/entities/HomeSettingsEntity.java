package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/HomeSettingsEntity;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "isFrequentsSectionExpanded", "", "<init>", "(Ljava/lang/Integer;Z)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "copy", "(Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/consumer/base/database/entities/HomeSettingsEntity;", "equals", "other", "hashCode", "toString", "", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeSettingsEntity {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final Integer component2;
    private final boolean copydefault;

    public HomeSettingsEntity(Integer num, boolean z) {
        this.component2 = num;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeSettingsEntity(Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 63;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 4 % 5;
            } else {
                int i4 = 2 % 2;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            int i5 = component3 + 59;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            z = false;
        }
        this(num, z);
    }

    public final Integer getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean isFrequentsSectionExpanded() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 23;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeSettingsEntity() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static HomeSettingsEntity copy$default(HomeSettingsEntity homeSettingsEntity, Integer num, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            num = homeSettingsEntity.component2;
        }
        if ((i & 2) != 0) {
            int i3 = component3;
            int i4 = i3 + 9;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            boolean z2 = homeSettingsEntity.copydefault;
            int i6 = i3 + 5;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            z = z2;
        }
        return homeSettingsEntity.copy(num, z);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        throw null;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 65;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return z;
    }

    public final HomeSettingsEntity copy(Integer id, boolean isFrequentsSectionExpanded) {
        int i = 2 % 2;
        HomeSettingsEntity homeSettingsEntity = new HomeSettingsEntity(id, isFrequentsSectionExpanded);
        int i2 = ShareDataUIState + 61;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return homeSettingsEntity;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeSettingsEntity)) {
            return false;
        }
        HomeSettingsEntity homeSettingsEntity = (HomeSettingsEntity) other;
        if (!Intrinsics.areEqual(this.component2, homeSettingsEntity.component2)) {
            int i3 = component3 + 39;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return false;
        }
        if (this.copydefault == homeSettingsEntity.copydefault) {
            return true;
        }
        int i5 = ShareDataUIState + 17;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.component2;
        int iHashCode = ((num == null ? 0 : num.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        int i3 = component3 + 107;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeSettingsEntity(id=" + this.component2 + ", isFrequentsSectionExpanded=" + this.copydefault + ")";
        int i2 = component3 + 57;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return str;
    }
}
