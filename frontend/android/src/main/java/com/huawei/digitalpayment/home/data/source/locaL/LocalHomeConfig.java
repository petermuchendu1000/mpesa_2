package com.huawei.digitalpayment.home.data.source.locaL;

import androidx.core.app.NotificationCompat;
import com.huawei.digitalpayment.home.theme.HomeThemeKt;
import com.huawei.http.BaseResp;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0003J_\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u000bHÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006&"}, d2 = {"Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeConfig;", "Lcom/huawei/http/BaseResp;", NotificationCompat.CATEGORY_NAVIGATION, "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "myFunction", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalFunctionGroup;", "lifeFunction", "homeFunction", "functionDefine", "", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "getNavigation", "()Ljava/util/List;", "setNavigation", "(Ljava/util/List;)V", "getMyFunction", "getLifeFunction", "getHomeFunction", "getFunctionDefine", "()Ljava/util/Map;", "refreshByDefine", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalHomeConfig extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Map<String, LocalHomeFunction> functionDefine;
    private final List<LocalFunctionGroup> homeFunction;
    private final List<LocalFunctionGroup> lifeFunction;
    private final List<LocalFunctionGroup> myFunction;
    private List<LocalHomeFunction> navigation;

    public final List<LocalHomeFunction> getNavigation() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<LocalHomeFunction> list = this.navigation;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return list;
    }

    public final void setNavigation(List<LocalHomeFunction> list) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(list, "");
            this.navigation = list;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(list, "");
        this.navigation = list;
        int i3 = ShareDataUIState + 43;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final List<LocalFunctionGroup> getMyFunction() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalFunctionGroup> list = this.myFunction;
        int i5 = i3 + 37;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LocalFunctionGroup> getLifeFunction() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 97;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        List<LocalFunctionGroup> list = this.lifeFunction;
        int i4 = i2 + 123;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalHomeConfig(List list, List list2, List list3, List list4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 71;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
        }
        if ((i & 2) != 0) {
            list2 = CollectionsKt.emptyList();
            int i3 = component2 + 35;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        List list5 = list2;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt.emptyList() : list3;
        if ((i & 8) != 0) {
            int i6 = component2 + 19;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 != 0) {
                list4 = CollectionsKt.emptyList();
                int i7 = 14 / 0;
            } else {
                list4 = CollectionsKt.emptyList();
            }
        }
        List list6 = list4;
        if ((i & 16) != 0) {
            int i8 = component2 + 113;
            ShareDataUIState = i8 % 128;
            if (i8 % 2 != 0) {
                map = MapsKt.emptyMap();
                int i9 = 56 / 0;
            } else {
                map = MapsKt.emptyMap();
            }
        }
        this(list, list5, listEmptyList, list6, map);
    }

    public final List<LocalFunctionGroup> getHomeFunction() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.homeFunction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, LocalHomeFunction> getFunctionDefine() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 9;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, LocalHomeFunction> map = this.functionDefine;
        int i5 = i2 + 117;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public LocalHomeConfig(List<LocalHomeFunction> list, List<LocalFunctionGroup> list2, List<LocalFunctionGroup> list3, List<LocalFunctionGroup> list4, Map<String, LocalHomeFunction> map) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.navigation = list;
        this.myFunction = list2;
        this.lifeFunction = list3;
        this.homeFunction = list4;
        this.functionDefine = map;
    }

    public final void refreshByDefine() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.navigation = HomeThemeKt.refreshLocalHomeFunction(this.navigation, this.functionDefine);
            LocalHomeConfigKt.access$refreshByDefine(this.myFunction, this.functionDefine);
            LocalHomeConfigKt.access$refreshByDefine(this.lifeFunction, this.functionDefine);
            LocalHomeConfigKt.access$refreshByDefine(this.homeFunction, this.functionDefine);
            return;
        }
        this.navigation = HomeThemeKt.refreshLocalHomeFunction(this.navigation, this.functionDefine);
        LocalHomeConfigKt.access$refreshByDefine(this.myFunction, this.functionDefine);
        LocalHomeConfigKt.access$refreshByDefine(this.lifeFunction, this.functionDefine);
        LocalHomeConfigKt.access$refreshByDefine(this.homeFunction, this.functionDefine);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public LocalHomeConfig() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalHomeConfig copy$default(LocalHomeConfig localHomeConfig, List list, List list2, List list3, List list4, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 7;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            list = localHomeConfig.navigation;
        }
        List list5 = list;
        if ((i & 2) != 0) {
            int i5 = i3 + 77;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            list2 = localHomeConfig.myFunction;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = localHomeConfig.lifeFunction;
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            int i7 = ShareDataUIState + 25;
            component2 = i7 % 128;
            int i8 = i7 % 2;
            list4 = localHomeConfig.homeFunction;
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            int i9 = component2 + 89;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            map = localHomeConfig.functionDefine;
        }
        return localHomeConfig.copy(list5, list6, list7, list8, map);
    }

    public final List<LocalHomeFunction> component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeFunction> list = this.navigation;
        int i5 = i2 + 47;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        throw null;
    }

    public final List<LocalFunctionGroup> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<LocalFunctionGroup> list = this.myFunction;
        int i5 = i3 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public final List<LocalFunctionGroup> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.lifeFunction;
        }
        throw null;
    }

    public final List<LocalFunctionGroup> component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 29;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        List<LocalFunctionGroup> list = this.homeFunction;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return list;
    }

    public final Map<String, LocalHomeFunction> component5() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Map<String, LocalHomeFunction> map = this.functionDefine;
        int i5 = i2 + 95;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 27 / 0;
        }
        return map;
    }

    public final LocalHomeConfig copy(List<LocalHomeFunction> navigation, List<LocalFunctionGroup> myFunction, List<LocalFunctionGroup> lifeFunction, List<LocalFunctionGroup> homeFunction, Map<String, LocalHomeFunction> functionDefine) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(navigation, "");
        Intrinsics.checkNotNullParameter(myFunction, "");
        Intrinsics.checkNotNullParameter(lifeFunction, "");
        Intrinsics.checkNotNullParameter(homeFunction, "");
        Intrinsics.checkNotNullParameter(functionDefine, "");
        LocalHomeConfig localHomeConfig = new LocalHomeConfig(navigation, myFunction, lifeFunction, homeFunction, functionDefine);
        int i2 = component2 + 105;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return localHomeConfig;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this == other) {
            return true;
        }
        if (!(!(other instanceof LocalHomeConfig))) {
            LocalHomeConfig localHomeConfig = (LocalHomeConfig) other;
            if (!Intrinsics.areEqual(this.navigation, localHomeConfig.navigation)) {
                int i3 = component2 + 55;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            if ((!Intrinsics.areEqual(this.myFunction, localHomeConfig.myFunction)) || !Intrinsics.areEqual(this.lifeFunction, localHomeConfig.lifeFunction)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.homeFunction, localHomeConfig.homeFunction)) {
                int i5 = ShareDataUIState + 57;
                component2 = i5 % 128;
                return i5 % 2 == 0;
            }
            if (Intrinsics.areEqual(this.functionDefine, localHomeConfig.functionDefine)) {
                return true;
            }
            int i6 = ShareDataUIState + 85;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component2 + 11;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode = (((((((this.navigation.hashCode() * 31) + this.myFunction.hashCode()) * 31) + this.lifeFunction.hashCode()) * 31) + this.homeFunction.hashCode()) * 31) + this.functionDefine.hashCode();
        int i4 = component2 + 125;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return iHashCode;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalHomeConfig(navigation=" + this.navigation + ", myFunction=" + this.myFunction + ", lifeFunction=" + this.lifeFunction + ", homeFunction=" + this.homeFunction + ", functionDefine=" + this.functionDefine + ")";
        int i2 = component2 + 67;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
