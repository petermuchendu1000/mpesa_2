package com.huawei.digitalpayment.common.theme.data;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/MiniAppResp;", "Lcom/huawei/http/BaseResp;", "appId", "", "appName", "appIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getAppName", "getAppIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MiniAppResp extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String appIcon;
    private final String appId;
    private final String appName;

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppResp(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component3 + 59;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 2 % 2;
            }
            str = "";
        }
        if ((i & 2) != 0) {
            int i4 = component1 + 19;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            str2 = null;
        }
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.appId;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getAppName() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.appName;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return str;
    }

    public final String getAppIcon() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.appIcon;
            int i4 = 98 / 0;
        } else {
            str = this.appIcon;
        }
        int i5 = i2 + 39;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public MiniAppResp(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.appId = str;
        this.appName = str2;
        this.appIcon = str3;
    }

    public MiniAppResp() {
        this(null, null, null, 7, null);
    }

    public static MiniAppResp copy$default(MiniAppResp miniAppResp, String str, String str2, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 85;
        int i4 = i3 % 128;
        component3 = i4;
        int i5 = i3 % 2;
        if ((i & 1) != 0) {
            int i6 = i4 + 109;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str = miniAppResp.appId;
        }
        if ((i & 2) != 0) {
            str2 = miniAppResp.appName;
        }
        if ((i & 4) != 0) {
            int i8 = i4 + 85;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            str3 = miniAppResp.appIcon;
        }
        return miniAppResp.copy(str, str2, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.appId;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 5 / 0;
        }
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appName;
        int i5 = i2 + 121;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 31;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.appIcon;
        int i5 = i2 + 81;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 68 / 0;
        }
        return str;
    }

    public final MiniAppResp copy(String appId, String appName, String appIcon) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(appId, "");
        MiniAppResp miniAppResp = new MiniAppResp(appId, appName, appIcon);
        int i2 = component1 + 41;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return miniAppResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 89;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof MiniAppResp)) {
            return false;
        }
        MiniAppResp miniAppResp = (MiniAppResp) other;
        if (Intrinsics.areEqual(this.appId, miniAppResp.appId)) {
            if (Intrinsics.areEqual(this.appName, miniAppResp.appName)) {
                return Intrinsics.areEqual(this.appIcon, miniAppResp.appIcon);
            }
            int i7 = component1 + 115;
            component3 = i7 % 128;
            return i7 % 2 == 0;
        }
        int i8 = component3 + 73;
        component1 = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.appId.hashCode();
        String str = this.appName;
        if (str == null) {
            int i4 = component1 + 49;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        String str2 = this.appIcon;
        return (((iHashCode2 * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppResp(appId=" + this.appId + ", appName=" + this.appName + ", appIcon=" + this.appIcon + ")";
        int i2 = component1 + 37;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
