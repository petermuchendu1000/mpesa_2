package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings.model;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001a\u00020\u0005HÆ\u0003J$\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0003H×\u0001J\t\u0010\u0013\u001a\u00020\u0014H×\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "isFrequentsSectionExpanded", "", "<init>", "(Ljava/lang/Integer;Z)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "component1", "component2", "copy", "(Ljava/lang/Integer;Z)Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/model/HomeSettings;", "equals", "other", "hashCode", "toString", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeSettings {
    public static final int $stable = 0;
    private static int ShareDataUIState = 0;
    private static int component1 = 17 % 128;
    private static int component2 = 0;
    private static int component4 = 1;
    private final Integer component3;
    private final boolean copydefault;

    public HomeSettings(Integer num, boolean z) {
        this.component3 = num;
        this.copydefault = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeSettings(Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 33;
            component4 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 2 % 2;
            }
            num = null;
        }
        if ((i & 2) != 0) {
            int i4 = component4 + 85;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            z = false;
        }
        this(num, z);
    }

    public final Integer getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Integer num = this.component3;
        int i5 = i3 + 37;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        throw null;
    }

    public final boolean isFrequentsSectionExpanded() {
        int i = 2 % 2;
        int i2 = component4 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.copydefault;
        int i5 = i3 + 55;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static {
        int i = 17 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeSettings() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static HomeSettings copy$default(HomeSettings homeSettings, Integer num, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState;
        int i4 = i3 + 19;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            num = homeSettings.component3;
        }
        if ((i & 2) != 0) {
            int i6 = i3 + 45;
            component4 = i6 % 128;
            int i7 = i6 % 2;
            z = homeSettings.copydefault;
        }
        return homeSettings.copy(num, z);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        Integer num = this.component3;
        int i5 = i3 + 43;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final boolean component2() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 19;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.copydefault;
        int i5 = i2 + 59;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public final HomeSettings copy(Integer id, boolean isFrequentsSectionExpanded) {
        int i = 2 % 2;
        HomeSettings homeSettings = new HomeSettings(id, isFrequentsSectionExpanded);
        int i2 = ShareDataUIState + 107;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return homeSettings;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 73;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof HomeSettings)) {
            int i7 = i3 + 47;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        HomeSettings homeSettings = (HomeSettings) other;
        if (!Intrinsics.areEqual(this.component3, homeSettings.component3)) {
            int i9 = ShareDataUIState + 7;
            component4 = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (this.copydefault != homeSettings.copydefault) {
            int i11 = ShareDataUIState + 85;
            component4 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        int i13 = ShareDataUIState + 63;
        component4 = i13 % 128;
        if (i13 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        Integer num = this.component3;
        if (num == null) {
            int i2 = component4 + 27;
            int i3 = i2 % 128;
            ShareDataUIState = i3;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
            int i4 = i3 + 97;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            iHashCode = num.hashCode();
        }
        int iHashCode2 = (iHashCode * 31) + Boolean.hashCode(this.copydefault);
        int i6 = ShareDataUIState + 25;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeSettings(id=" + this.component3 + ", isFrequentsSectionExpanded=" + this.copydefault + ")";
        int i2 = component4 + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
