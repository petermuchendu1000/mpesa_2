package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteHomeTheme;", "Lcom/huawei/http/BaseResp;", "navigator", "Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteNavigator;", "globalSettings", "", "<init>", "(Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteNavigator;Ljava/lang/Object;)V", "getNavigator", "()Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteNavigator;", "getGlobalSettings", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteHomeTheme extends BaseResp {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Object globalSettings;
    private final RemoteNavigator navigator;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteHomeTheme(RemoteNavigator remoteNavigator, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = copydefault + 11;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 69;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            remoteNavigator = null;
        }
        if ((i & 2) != 0) {
            int i7 = 2 % 2;
            obj = null;
        }
        this(remoteNavigator, obj);
    }

    public final RemoteNavigator getNavigator() {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        RemoteNavigator remoteNavigator = this.navigator;
        int i5 = i3 + 3;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return remoteNavigator;
        }
        throw null;
    }

    public final Object getGlobalSettings() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        Object obj = this.globalSettings;
        int i4 = i2 + 15;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    public RemoteHomeTheme(RemoteNavigator remoteNavigator, Object obj) {
        this.navigator = remoteNavigator;
        this.globalSettings = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteHomeTheme() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static RemoteHomeTheme copy$default(RemoteHomeTheme remoteHomeTheme, RemoteNavigator remoteNavigator, Object obj, int i, Object obj2) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3;
            int i4 = i3 + 89;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            RemoteNavigator remoteNavigator2 = remoteHomeTheme.navigator;
            int i6 = i3 + 97;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            remoteNavigator = remoteNavigator2;
        }
        if ((i & 2) != 0) {
            obj = remoteHomeTheme.globalSettings;
        }
        return remoteHomeTheme.copy(remoteNavigator, obj);
    }

    public final RemoteNavigator component1() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        RemoteNavigator remoteNavigator = this.navigator;
        int i5 = i3 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return remoteNavigator;
        }
        throw null;
    }

    public final Object component2() {
        int i = 2 % 2;
        int i2 = component3 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Object obj = this.globalSettings;
        int i5 = i3 + 83;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    public final RemoteHomeTheme copy(RemoteNavigator navigator, Object globalSettings) {
        int i = 2 % 2;
        RemoteHomeTheme remoteHomeTheme = new RemoteHomeTheme(navigator, globalSettings);
        int i2 = copydefault + 61;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 47 / 0;
        }
        return remoteHomeTheme;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            int i4 = i3 + 9;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return true;
            }
            throw null;
        }
        if (!(other instanceof RemoteHomeTheme)) {
            return false;
        }
        RemoteHomeTheme remoteHomeTheme = (RemoteHomeTheme) other;
        if (!Intrinsics.areEqual(this.navigator, remoteHomeTheme.navigator)) {
            int i5 = copydefault + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.globalSettings, remoteHomeTheme.globalSettings)) {
            return true;
        }
        int i7 = component3 + 11;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        RemoteNavigator remoteNavigator = this.navigator;
        if (remoteNavigator == null) {
            int i2 = component3 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = remoteNavigator.hashCode();
            int i4 = copydefault + 97;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
        Object obj = this.globalSettings;
        return (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteHomeTheme(navigator=" + this.navigator + ", globalSettings=" + this.globalSettings + ")";
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
