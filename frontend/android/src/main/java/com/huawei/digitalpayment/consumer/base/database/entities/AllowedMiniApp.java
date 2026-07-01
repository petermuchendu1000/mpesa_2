package com.huawei.digitalpayment.consumer.base.database.entities;

import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/entities/AllowedMiniApp;", "", GriverCacheDao.COLUMN_CACHE_ID, "", "appId", "", "appName", "icon", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppId", "()Ljava/lang/String;", "getAppName", "getIcon", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/digitalpayment/consumer/base/database/entities/AllowedMiniApp;", "equals", "", "other", "hashCode", "toString", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AllowedMiniApp {
    private static int ShareDataUIState = 0;
    private static int copy = 1;
    private final String component1;
    private final Integer component2;
    private final String component3;
    private final String copydefault;

    public AllowedMiniApp(Integer num, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.component2 = num;
        this.component3 = str;
        this.copydefault = str2;
        this.component1 = str3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AllowedMiniApp(Integer num, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copy + 45;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i3 = 2 % 2;
            num = null;
        }
        this(num, str, str2, str3);
    }

    public final Integer getId() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.component2;
        if (i3 == 0) {
            int i4 = 88 / 0;
        }
        return num;
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = copy + 125;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.component3;
        int i5 = i3 + 117;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAppName() {
        String str;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        int i3 = i2 % 128;
        copy = i3;
        if (i2 % 2 == 0) {
            str = this.copydefault;
            int i4 = 17 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 9;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.component1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AllowedMiniApp copy$default(AllowedMiniApp allowedMiniApp, Integer num, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = ShareDataUIState + 95;
            copy = i3 % 128;
            int i4 = i3 % 2;
            num = allowedMiniApp.component2;
        }
        if ((i & 2) != 0) {
            str = allowedMiniApp.component3;
        }
        if ((i & 4) != 0) {
            int i5 = copy + 97;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                String str4 = allowedMiniApp.copydefault;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            str2 = allowedMiniApp.copydefault;
        }
        if ((i & 8) != 0) {
            str3 = allowedMiniApp.component1;
            int i6 = ShareDataUIState + 83;
            copy = i6 % 128;
            int i7 = i6 % 2;
        }
        return allowedMiniApp.copy(num, str, str2, str3);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 73;
        copy = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.component2;
        int i5 = i2 + 75;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 117;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = this.component3;
        int i5 = i2 + 121;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.copydefault;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 101;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.component1;
        int i4 = i2 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final AllowedMiniApp copy(Integer id, String appId, String appName, String icon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(appName, "");
        Intrinsics.checkNotNullParameter(icon, "");
        AllowedMiniApp allowedMiniApp = new AllowedMiniApp(id, appId, appName, icon);
        int i2 = ShareDataUIState + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
        return allowedMiniApp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllowedMiniApp)) {
            return false;
        }
        AllowedMiniApp allowedMiniApp = (AllowedMiniApp) other;
        if (!Intrinsics.areEqual(this.component2, allowedMiniApp.component2)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.component3, allowedMiniApp.component3)) {
            int i2 = copy + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.copydefault, allowedMiniApp.copydefault)) {
            int i4 = ShareDataUIState + 17;
            copy = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.component1, allowedMiniApp.component1)) {
            return true;
        }
        int i6 = ShareDataUIState + 29;
        copy = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        Integer num = this.component2;
        if (num == null) {
            int i3 = ShareDataUIState + 69;
            copy = i3 % 128;
            int i4 = i3 % 2;
            i = 0;
        } else {
            int iHashCode = num.hashCode();
            int i5 = ShareDataUIState + 105;
            copy = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 / 2;
            }
            i = iHashCode;
        }
        return (((((i * 31) + this.component3.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.component1.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "AllowedMiniApp(id=" + this.component2 + ", appId=" + this.component3 + ", appName=" + this.copydefault + ", icon=" + this.component1 + ")";
        int i2 = copy + 15;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
