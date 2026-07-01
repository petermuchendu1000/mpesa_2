package com.huawei.digitalpayment.home.data.source.locaL;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalMiniApp;", "Ljava/io/Serializable;", "appId", "", "appName", "appIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getAppName", "getAppIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalMiniApp implements Serializable {
    private static int component1 = 1;
    private static int component2;
    private final String appIcon;
    private final String appId;
    private final String appName;

    public LocalMiniApp(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.appId = str;
        this.appName = str2;
        this.appIcon = str3;
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = component2 + 3;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appId;
        }
        throw null;
    }

    public final String getAppName() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.appName;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getAppIcon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appIcon;
        int i5 = i2 + 53;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LocalMiniApp copy$default(LocalMiniApp localMiniApp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 33;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 1) != 0) {
            str = localMiniApp.appId;
        }
        if ((i & 2) != 0) {
            str2 = localMiniApp.appName;
            int i6 = i3 + 45;
            component1 = i6 % 128;
            int i7 = i6 % 2;
        }
        if ((i & 4) != 0) {
            int i8 = component1 + 9;
            int i9 = i8 % 128;
            component2 = i9;
            if (i8 % 2 != 0) {
                String str4 = localMiniApp.appIcon;
                throw null;
            }
            str3 = localMiniApp.appIcon;
            int i10 = i9 + 17;
            component1 = i10 % 128;
            int i11 = i10 % 2;
        }
        return localMiniApp.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appId;
        int i5 = i2 + 119;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 59;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appName;
        int i5 = i2 + 59;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        String str;
        int i = 2 % 2;
        int i2 = component2 + 125;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            str = this.appIcon;
            int i4 = 5 / 0;
        } else {
            str = this.appIcon;
        }
        int i5 = i3 + 111;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final LocalMiniApp copy(String appId, String appName, String appIcon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appId, "");
        Intrinsics.checkNotNullParameter(appName, "");
        LocalMiniApp localMiniApp = new LocalMiniApp(appId, appName, appIcon);
        int i2 = component2 + 53;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return localMiniApp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalMiniApp)) {
            int i2 = component2 + 51;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        LocalMiniApp localMiniApp = (LocalMiniApp) other;
        if (Intrinsics.areEqual(this.appId, localMiniApp.appId)) {
            return Intrinsics.areEqual(this.appName, localMiniApp.appName) && !(Intrinsics.areEqual(this.appIcon, localMiniApp.appIcon) ^ true);
        }
        int i4 = component2 + 109;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.appId.hashCode();
            this.appName.hashCode();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int iHashCode2 = this.appId.hashCode();
        int iHashCode3 = this.appName.hashCode();
        String str = this.appIcon;
        if (str == null) {
            int i3 = component2 + 63;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalMiniApp(appId=" + this.appId + ", appName=" + this.appName + ", appIcon=" + this.appIcon + ")";
        int i2 = component2 + 13;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
