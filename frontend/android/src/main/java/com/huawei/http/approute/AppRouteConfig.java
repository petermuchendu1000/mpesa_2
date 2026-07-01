package com.huawei.http.approute;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0003Jh\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u00061"}, d2 = {"Lcom/huawei/http/approute/AppRouteConfig;", "", "appRouteEnable", "", "appRouteMode", "", "appRouteVersion", "appRouteUriPrefix", "appRouteTable", "", "Lcom/huawei/http/approute/AppRouteTable;", "appRouteTableMap", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getAppRouteEnable", "()Ljava/lang/Boolean;", "setAppRouteEnable", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getAppRouteMode", "()Ljava/lang/String;", "setAppRouteMode", "(Ljava/lang/String;)V", "getAppRouteVersion", "setAppRouteVersion", "getAppRouteUriPrefix", "setAppRouteUriPrefix", "getAppRouteTable", "()Ljava/util/List;", "setAppRouteTable", "(Ljava/util/List;)V", "getAppRouteTableMap", "()Ljava/util/Map;", "setAppRouteTableMap", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lcom/huawei/http/approute/AppRouteConfig;", "equals", "other", "hashCode", "", "toString", "HttpLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppRouteConfig {
    private String ShareDataUIState;
    private List<AppRouteTable> component1;
    private Boolean component2;
    private Map<String, String> component3;
    private String copydefault;
    private String equals;

    public AppRouteConfig(Boolean bool, String str, String str2, String str3, List<AppRouteTable> list, Map<String, String> map) {
        this.component2 = bool;
        this.copydefault = str;
        this.equals = str2;
        this.ShareDataUIState = str3;
        this.component1 = list;
        this.component3 = map;
    }

    public AppRouteConfig(Boolean bool, String str, String str2, String str3, ArrayList arrayList, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? new ArrayList() : arrayList, (i & 32) != 0 ? null : map);
    }

    public final Boolean getAppRouteEnable() {
        return this.component2;
    }

    public final void setAppRouteEnable(Boolean bool) {
        this.component2 = bool;
    }

    public final String getAppRouteMode() {
        return this.copydefault;
    }

    public final void setAppRouteMode(String str) {
        this.copydefault = str;
    }

    public final String getAppRouteVersion() {
        return this.equals;
    }

    public final void setAppRouteVersion(String str) {
        this.equals = str;
    }

    public final String getAppRouteUriPrefix() {
        return this.ShareDataUIState;
    }

    public final void setAppRouteUriPrefix(String str) {
        this.ShareDataUIState = str;
    }

    public final List<AppRouteTable> getAppRouteTable() {
        return this.component1;
    }

    public final void setAppRouteTable(List<AppRouteTable> list) {
        this.component1 = list;
    }

    public final Map<String, String> getAppRouteTableMap() {
        return this.component3;
    }

    public final void setAppRouteTableMap(Map<String, String> map) {
        this.component3 = map;
    }

    public AppRouteConfig() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AppRouteConfig copy$default(AppRouteConfig appRouteConfig, Boolean bool, String str, String str2, String str3, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = appRouteConfig.component2;
        }
        if ((i & 2) != 0) {
            str = appRouteConfig.copydefault;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = appRouteConfig.equals;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = appRouteConfig.ShareDataUIState;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = appRouteConfig.component1;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            map = appRouteConfig.component3;
        }
        return appRouteConfig.copy(bool, str4, str5, str6, list2, map);
    }

    public final Boolean getComponent2() {
        return this.component2;
    }

    public final String getCopydefault() {
        return this.copydefault;
    }

    public final String getEquals() {
        return this.equals;
    }

    public final String getShareDataUIState() {
        return this.ShareDataUIState;
    }

    public final List<AppRouteTable> component5() {
        return this.component1;
    }

    public final Map<String, String> component6() {
        return this.component3;
    }

    public final AppRouteConfig copy(Boolean appRouteEnable, String appRouteMode, String appRouteVersion, String appRouteUriPrefix, List<AppRouteTable> appRouteTable, Map<String, String> appRouteTableMap) {
        return new AppRouteConfig(appRouteEnable, appRouteMode, appRouteVersion, appRouteUriPrefix, appRouteTable, appRouteTableMap);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppRouteConfig)) {
            return false;
        }
        AppRouteConfig appRouteConfig = (AppRouteConfig) other;
        return Intrinsics.areEqual(this.component2, appRouteConfig.component2) && Intrinsics.areEqual(this.copydefault, appRouteConfig.copydefault) && Intrinsics.areEqual(this.equals, appRouteConfig.equals) && Intrinsics.areEqual(this.ShareDataUIState, appRouteConfig.ShareDataUIState) && Intrinsics.areEqual(this.component1, appRouteConfig.component1) && Intrinsics.areEqual(this.component3, appRouteConfig.component3);
    }

    public int hashCode() {
        Boolean bool = this.component2;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.equals;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.ShareDataUIState;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        List<AppRouteTable> list = this.component1;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        Map<String, String> map = this.component3;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "AppRouteConfig(appRouteEnable=" + this.component2 + ", appRouteMode=" + this.copydefault + ", appRouteVersion=" + this.equals + ", appRouteUriPrefix=" + this.ShareDataUIState + ", appRouteTable=" + this.component1 + ", appRouteTableMap=" + this.component3 + ")";
    }
}
