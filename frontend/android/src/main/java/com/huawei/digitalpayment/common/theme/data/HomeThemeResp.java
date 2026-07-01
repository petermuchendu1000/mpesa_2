package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.common.theme.request.params.ThemeDetailParams;
import com.huawei.http.BaseResp;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u008f\u0001\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052$\b\u0002\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R-\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/HomeThemeResp;", "Lcom/huawei/http/BaseResp;", "component", "Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "functionDefines", "", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionResp;", "functionDefineGroups", "", "Lcom/huawei/digitalpayment/common/theme/data/FunctionGroupResp;", "themeColorConfig", "appIdFunIdMap", "fonts", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "<init>", "(Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;)V", "getComponent", "()Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "getFunctionDefines", "()Ljava/util/Map;", "getFunctionDefineGroups", "()Ljava/util/List;", "getThemeColorConfig", "()Ljava/lang/String;", "getAppIdFunIdMap", "getFonts", "getParams", "()Lcom/huawei/digitalpayment/common/theme/request/params/ThemeDetailParams;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HomeThemeResp extends BaseResp {
    private static int component1 = 1;
    private static int copydefault;
    private final Map<String, String> appIdFunIdMap;
    private final NavigationComponent component;
    private final Map<String, Map<String, String>> fonts;
    private final List<FunctionGroupResp> functionDefineGroups;
    private final Map<String, FunctionResp> functionDefines;
    private final ThemeDetailParams params;
    private final String themeColorConfig;

    /* JADX WARN: Illegal instructions before constructor call */
    public HomeThemeResp(NavigationComponent navigationComponent, Map map, List list, String str, Map map2, Map map3, ThemeDetailParams themeDetailParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        ThemeDetailParams themeDetailParams2 = null;
        if ((i & 1) != 0) {
            int i2 = component1 + 101;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            int i4 = 2 % 2;
            navigationComponent = null;
        }
        Map mapEmptyMap = (i & 2) != 0 ? Collections.emptyMap() : map;
        List listEmptyList = (i & 4) != 0 ? Collections.emptyList() : list;
        String str2 = (i & 8) != 0 ? null : str;
        Map mapEmptyMap2 = (i & 16) != 0 ? Collections.emptyMap() : map2;
        Map mapEmptyMap3 = (i & 32) != 0 ? Collections.emptyMap() : map3;
        if ((i & 64) != 0) {
            int i5 = copydefault + 67;
            component1 = i5 % 128;
            if (i5 % 2 == 0) {
                themeDetailParams2.hashCode();
                throw null;
            }
            int i6 = 2 % 2;
        } else {
            themeDetailParams2 = themeDetailParams;
        }
        this(navigationComponent, mapEmptyMap, listEmptyList, str2, mapEmptyMap2, mapEmptyMap3, themeDetailParams2);
    }

    public final NavigationComponent getComponent() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 11;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        NavigationComponent navigationComponent = this.component;
        int i5 = i2 + 107;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return navigationComponent;
    }

    public final Map<String, FunctionResp> getFunctionDefines() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, FunctionResp> map = this.functionDefines;
        int i4 = i2 + 89;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        obj.hashCode();
        throw null;
    }

    public final List<FunctionGroupResp> getFunctionDefineGroups() {
        List<FunctionGroupResp> list;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            list = this.functionDefineGroups;
            int i4 = 42 / 0;
        } else {
            list = this.functionDefineGroups;
        }
        int i5 = i2 + 119;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    public final String getThemeColorConfig() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.themeColorConfig;
        }
        throw null;
    }

    public final Map<String, String> getAppIdFunIdMap() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.appIdFunIdMap;
        int i5 = i3 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final Map<String, Map<String, String>> getFonts() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 53;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.fonts;
        int i5 = i2 + 93;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public final ThemeDetailParams getParams() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        int i3 = i2 % 128;
        copydefault = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ThemeDetailParams themeDetailParams = this.params;
        int i4 = i3 + 25;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return themeDetailParams;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HomeThemeResp(NavigationComponent navigationComponent, Map<String, ? extends FunctionResp> map, List<? extends FunctionGroupResp> list, String str, Map<String, String> map2, Map<String, ? extends Map<String, String>> map3, ThemeDetailParams themeDetailParams) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map2, "");
        Intrinsics.checkNotNullParameter(map3, "");
        this.component = navigationComponent;
        this.functionDefines = map;
        this.functionDefineGroups = list;
        this.themeColorConfig = str;
        this.appIdFunIdMap = map2;
        this.fonts = map3;
        this.params = themeDetailParams;
    }

    public HomeThemeResp() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HomeThemeResp copy$default(HomeThemeResp homeThemeResp, NavigationComponent navigationComponent, Map map, List list, String str, Map map2, Map map3, ThemeDetailParams themeDetailParams, int i, Object obj) {
        Map map4;
        Map map5;
        int i2 = 2 % 2;
        int i3 = copydefault;
        int i4 = i3 + 41;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        NavigationComponent navigationComponent2 = (i & 1) != 0 ? homeThemeResp.component : navigationComponent;
        if ((i & 2) != 0) {
            int i6 = i3 + 125;
            component1 = i6 % 128;
            if (i6 % 2 == 0) {
                map4 = homeThemeResp.functionDefines;
                int i7 = 70 / 0;
            } else {
                map4 = homeThemeResp.functionDefines;
            }
        } else {
            map4 = map;
        }
        List list2 = (i & 4) != 0 ? homeThemeResp.functionDefineGroups : list;
        String str2 = (i & 8) != 0 ? homeThemeResp.themeColorConfig : str;
        Map map6 = (i & 16) != 0 ? homeThemeResp.appIdFunIdMap : map2;
        if ((i & 32) != 0) {
            int i8 = component1 + 11;
            int i9 = i8 % 128;
            copydefault = i9;
            if (i8 % 2 != 0) {
                map5 = homeThemeResp.fonts;
                int i10 = 81 / 0;
            } else {
                map5 = homeThemeResp.fonts;
            }
            int i11 = i9 + 61;
            component1 = i11 % 128;
            int i12 = i11 % 2;
        } else {
            map5 = map3;
        }
        return homeThemeResp.copy(navigationComponent2, map4, list2, str2, map6, map5, (i & 64) != 0 ? homeThemeResp.params : themeDetailParams);
    }

    public final NavigationComponent component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        NavigationComponent navigationComponent = this.component;
        int i5 = i2 + 33;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return navigationComponent;
    }

    public final Map<String, FunctionResp> component2() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 13;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        Map<String, FunctionResp> map = this.functionDefines;
        int i4 = i2 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public final List<FunctionGroupResp> component3() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        List<FunctionGroupResp> list = this.functionDefineGroups;
        int i5 = i3 + 81;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.themeColorConfig;
        int i4 = i3 + 23;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Map<String, String> component5() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.appIdFunIdMap;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Map<String, String>> component6() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.fonts;
        int i5 = i3 + 105;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 87 / 0;
        }
        return map;
    }

    public final ThemeDetailParams component7() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        ThemeDetailParams themeDetailParams = this.params;
        int i5 = i3 + 113;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return themeDetailParams;
    }

    public final HomeThemeResp copy(NavigationComponent component, Map<String, ? extends FunctionResp> functionDefines, List<? extends FunctionGroupResp> functionDefineGroups, String themeColorConfig, Map<String, String> appIdFunIdMap, Map<String, ? extends Map<String, String>> fonts, ThemeDetailParams params) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(functionDefines, "");
        Intrinsics.checkNotNullParameter(functionDefineGroups, "");
        Intrinsics.checkNotNullParameter(appIdFunIdMap, "");
        Intrinsics.checkNotNullParameter(fonts, "");
        HomeThemeResp homeThemeResp = new HomeThemeResp(component, functionDefines, functionDefineGroups, themeColorConfig, appIdFunIdMap, fonts, params);
        int i2 = component1 + 39;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return homeThemeResp;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 89;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof HomeThemeResp)) {
            return false;
        }
        HomeThemeResp homeThemeResp = (HomeThemeResp) other;
        if (!Intrinsics.areEqual(this.component, homeThemeResp.component)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.functionDefines, homeThemeResp.functionDefines)) {
            int i4 = component1 + 57;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.functionDefineGroups, homeThemeResp.functionDefineGroups)) {
            int i6 = copydefault + 11;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.themeColorConfig, homeThemeResp.themeColorConfig) || !Intrinsics.areEqual(this.appIdFunIdMap, homeThemeResp.appIdFunIdMap)) {
            return false;
        }
        if (Intrinsics.areEqual(this.fonts, homeThemeResp.fonts)) {
            if (Intrinsics.areEqual(this.params, homeThemeResp.params)) {
                return true;
            }
            int i8 = component1 + 7;
            copydefault = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        int i10 = copydefault + 83;
        int i11 = i10 % 128;
        component1 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 73;
        copydefault = i13 % 128;
        if (i13 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component1 + 59;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        NavigationComponent navigationComponent = this.component;
        int iHashCode2 = navigationComponent == null ? 0 : navigationComponent.hashCode();
        int iHashCode3 = this.functionDefines.hashCode();
        int iHashCode4 = this.functionDefineGroups.hashCode();
        String str = this.themeColorConfig;
        if (str == null) {
            int i4 = component1 + 117;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode5 = this.appIdFunIdMap.hashCode();
        int iHashCode6 = this.fonts.hashCode();
        ThemeDetailParams themeDetailParams = this.params;
        return (((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (themeDetailParams != null ? themeDetailParams.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "HomeThemeResp(component=" + this.component + ", functionDefines=" + this.functionDefines + ", functionDefineGroups=" + this.functionDefineGroups + ", themeColorConfig=" + this.themeColorConfig + ", appIdFunIdMap=" + this.appIdFunIdMap + ", fonts=" + this.fonts + ", params=" + this.params + ")";
        int i2 = component1 + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
