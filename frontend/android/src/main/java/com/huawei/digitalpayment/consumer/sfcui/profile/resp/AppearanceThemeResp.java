package com.huawei.digitalpayment.consumer.sfcui.profile.resp;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u0006H×\u0001J\t\u0010\u001c\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/resp/AppearanceThemeResp;", "", "name", "", GriverCacheDao.COLUMN_CACHE_ID, "imageIcon", "", "selected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "getName", "()Ljava/lang/String;", "getId", "getImageIcon", "()I", "getSelected", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppearanceThemeResp {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component4 = 0;
    private static int equals = 1;
    private static int getAsAtTimestamp = 1;
    private final String component1;
    private boolean component2;
    private final int component3;
    private final String copydefault;

    public AppearanceThemeResp(String str, String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.component1 = str;
        this.copydefault = str2;
        this.component3 = i;
        this.component2 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppearanceThemeResp(String str, String str2, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 8) != 0) {
            int i3 = getAsAtTimestamp + 49;
            component4 = i3 % 128;
            z = i3 % 2 != 0;
            int i4 = 2 % 2;
        }
        this(str, str2, i, z);
    }

    public final String getName() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 35;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final String getId() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        int i3 = i2 % 128;
        component4 = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 54 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 39;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final int getImageIcon() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean getSelected() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setSelected(boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 41;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        this.component2 = z;
        if (i4 == 0) {
            int i5 = 67 / 0;
        }
        int i6 = i3 + 79;
        component4 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    static {
        int i = 1 + 13;
        ShareDataUIState = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AppearanceThemeResp copy$default(AppearanceThemeResp appearanceThemeResp, String str, String str2, int i, boolean z, int i2, Object obj) {
        int i3 = 2 % 2;
        if ((i2 & 1) != 0) {
            str = appearanceThemeResp.component1;
        }
        if ((i2 & 2) != 0) {
            str2 = appearanceThemeResp.copydefault;
        }
        if ((i2 & 4) != 0) {
            int i4 = getAsAtTimestamp + 63;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            i = appearanceThemeResp.component3;
        }
        if ((i2 & 8) != 0) {
            int i6 = getAsAtTimestamp + 11;
            component4 = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z2 = appearanceThemeResp.component2;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            z = appearanceThemeResp.component2;
        }
        return appearanceThemeResp.copy(str, str2, i, z);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 27;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.component1;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 77;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        String str = this.copydefault;
        int i5 = i3 + 113;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return str;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component4 + 65;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        int i5 = this.component3;
        int i6 = i3 + 85;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final boolean component4() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 119;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.component2;
        int i5 = i2 + 69;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final AppearanceThemeResp copy(String name, String id, int imageIcon, boolean selected) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(name, "");
        Intrinsics.checkNotNullParameter(id, "");
        AppearanceThemeResp appearanceThemeResp = new AppearanceThemeResp(name, id, imageIcon, selected);
        int i2 = component4 + 101;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return appearanceThemeResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component4 + 79;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 1;
            component4 = i5 % 128;
            return i5 % 2 == 0;
        }
        if (!(other instanceof AppearanceThemeResp)) {
            return false;
        }
        AppearanceThemeResp appearanceThemeResp = (AppearanceThemeResp) other;
        if (!Intrinsics.areEqual(this.component1, appearanceThemeResp.component1)) {
            int i6 = component4 + 5;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, appearanceThemeResp.copydefault) || this.component3 != appearanceThemeResp.component3) {
            return false;
        }
        if (this.component2 == appearanceThemeResp.component2) {
            return true;
        }
        int i8 = getAsAtTimestamp + 63;
        component4 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component4 + 87;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((this.component1.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.component3)) * 31) + Boolean.hashCode(this.component2);
        int i4 = component4 + 25;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AppearanceThemeResp(name=" + this.component1 + ", id=" + this.copydefault + ", imageIcon=" + this.component3 + ", selected=" + this.component2 + ")";
        int i2 = component4 + 27;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 10 / 0;
        }
        return str;
    }
}
