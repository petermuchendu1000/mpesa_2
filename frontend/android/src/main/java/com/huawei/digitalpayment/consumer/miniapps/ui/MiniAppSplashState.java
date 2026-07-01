package com.huawei.digitalpayment.consumer.miniapps.ui;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÇ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001e\u001a\u00020\u0007H×\u0001J\t\u0010\u001f\u001a\u00020\u0003H×\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/consumer/miniapps/ui/MiniAppSplashState;", "", "appId", "", "appName", "appIconUrl", "appIconPlaceholder", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getAppName", "setAppName", "getAppIconUrl", "setAppIconUrl", "getAppIconPlaceholder", "()I", "setAppIconPlaceholder", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "ConsumerSfcAliPayMiniApps_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiniAppSplashState {
    public static final int $stable = 8;
    private static int ShareDataUIState = 31 % 128;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int copydefault;
    private int appIconPlaceholder;
    private String appIconUrl;
    private String appId;
    private String appName;

    public MiniAppSplashState(String str, String str2, String str3, int i) {
        this.appId = str;
        this.appName = str2;
        this.appIconUrl = str3;
        this.appIconPlaceholder = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MiniAppSplashState(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        Object obj = null;
        if ((i2 & 1) != 0) {
            int i3 = component2 + 19;
            copydefault = i3 % 128;
            if (i3 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            int i4 = 2 % 2;
            str = "";
        }
        str2 = (i2 & 2) != 0 ? "" : str2;
        if ((i2 & 4) != 0) {
            int i5 = copydefault + 27;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        }
        this(str, str2, str3, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getAppId() {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        String str = this.appId;
        int i5 = i3 + 35;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setAppId(String str) {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.appId = str;
        if (i3 == 0) {
            throw null;
        }
    }

    public final String getAppName() {
        int i = 2 % 2;
        int i2 = component2 + 15;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.appName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAppName(String str) {
        int i = 2 % 2;
        int i2 = component2 + 51;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.appName = str;
        int i5 = i3 + 13;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getAppIconUrl() {
        int i = 2 % 2;
        int i2 = component2 + 105;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.appIconUrl;
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return str;
    }

    public final void setAppIconUrl(String str) {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.appIconUrl = str;
        if (i4 != 0) {
            int i5 = 72 / 0;
        }
        int i6 = i3 + 37;
        component2 = i6 % 128;
        int i7 = i6 % 2;
    }

    public final int getAppIconPlaceholder() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appIconPlaceholder;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setAppIconPlaceholder(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        this.appIconPlaceholder = i;
        int i6 = i3 + 53;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = 31 % 2;
    }

    public MiniAppSplashState() {
        this(null, null, null, 0, 15, null);
    }

    public static MiniAppSplashState copy$default(MiniAppSplashState miniAppSplashState, String str, String str2, String str3, int i, int i2, Object obj) {
        int i3 = 2 % 2;
        int i4 = copydefault + 3;
        int i5 = i4 % 128;
        component2 = i5;
        if (i4 % 2 != 0 ? (i2 & 1) != 0 : (i2 & 1) != 0) {
            str = miniAppSplashState.appId;
        }
        if ((i2 & 2) != 0) {
            int i6 = i5 + 17;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            str2 = miniAppSplashState.appName;
        }
        if ((i2 & 4) != 0) {
            int i8 = copydefault + 63;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            str3 = miniAppSplashState.appIconUrl;
        }
        if ((i2 & 8) != 0) {
            int i10 = component2 + 45;
            copydefault = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = miniAppSplashState.appIconPlaceholder;
                throw null;
            }
            i = miniAppSplashState.appIconPlaceholder;
        }
        MiniAppSplashState miniAppSplashStateCopy = miniAppSplashState.copy(str, str2, str3, i);
        int i12 = component2 + 71;
        copydefault = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 94 / 0;
        }
        return miniAppSplashStateCopy;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 71;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.appId;
        int i4 = i2 + 29;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 54 / 0;
        }
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.appName;
            int i4 = 69 / 0;
        } else {
            str = this.appName;
        }
        int i5 = i2 + 29;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 46 / 0;
        }
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.appIconUrl;
        }
        throw null;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        int i4 = this.appIconPlaceholder;
        if (i3 != 0) {
            int i5 = 12 / 0;
        }
        return i4;
    }

    public final MiniAppSplashState copy(String appId, String appName, String appIconUrl, int appIconPlaceholder) {
        int i = 2 % 2;
        MiniAppSplashState miniAppSplashState = new MiniAppSplashState(appId, appName, appIconUrl, appIconPlaceholder);
        int i2 = copydefault + 1;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 28 / 0;
        }
        return miniAppSplashState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if ((r6 instanceof com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState) == true) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        r1 = r1 + 109;
        com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.copydefault = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r6 = (com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.appId, r6.appId) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.appName, r6.appName) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if ((!kotlin.jvm.internal.Intrinsics.areEqual(r5.appIconUrl, r6.appIconUrl)) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r5.appIconPlaceholder == r6.appIconPlaceholder) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        r6 = com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.copydefault + 13;
        com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.component2 = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r5 == r6) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.component2
            int r2 = r1 + 11
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.copydefault = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 69
            int r2 = r2 / r4
            if (r5 != r6) goto L19
            goto L18
        L16:
            if (r5 != r6) goto L19
        L18:
            return r3
        L19:
            boolean r2 = r6 instanceof com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState
            if (r2 == r3) goto L25
            int r1 = r1 + 109
            int r6 = r1 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.copydefault = r6
            int r1 = r1 % r0
            return r4
        L25:
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState r6 = (com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState) r6
            java.lang.String r1 = r5.appId
            java.lang.String r2 = r6.appId
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L32
            return r4
        L32:
            java.lang.String r1 = r5.appName
            java.lang.String r2 = r6.appName
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L3d
            return r4
        L3d:
            java.lang.String r1 = r5.appIconUrl
            java.lang.String r2 = r6.appIconUrl
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            r1 = r1 ^ r3
            if (r1 == 0) goto L49
            return r4
        L49:
            int r1 = r5.appIconPlaceholder
            int r6 = r6.appIconPlaceholder
            if (r1 == r6) goto L59
            int r6 = com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.copydefault
            int r6 = r6 + 13
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.component2 = r1
            int r6 = r6 % r0
            return r4
        L59:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.miniapps.ui.MiniAppSplashState.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str;
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int i2 = component2 + 103;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0 ? (str = this.appId) != null : (str = this.appId) != null) {
            iHashCode = str.hashCode();
        } else {
            int i4 = i3 + 63;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        }
        String str2 = this.appName;
        if (str2 == null) {
            int i6 = copydefault + 47;
            component2 = i6 % 128;
            iHashCode2 = i6 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode2 = str2.hashCode();
        }
        String str3 = this.appIconUrl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.appIconPlaceholder);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "MiniAppSplashState(appId=" + this.appId + ", appName=" + this.appName + ", appIconUrl=" + this.appIconUrl + ", appIconPlaceholder=" + this.appIconPlaceholder + ")";
        int i2 = component2 + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
        return str;
    }
}
