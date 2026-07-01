package com.huawei.digitalpayment.home.theme.data.local;

import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003J!\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003JY\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalI18nResource;", "Lcom/huawei/http/BaseResp;", "cacheTimestamp", "", "themeI18nResources", "", "commonI18nResources", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getCacheTimestamp", "()Ljava/lang/String;", "getThemeI18nResources", "()Ljava/util/Map;", "getCommonI18nResources", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalI18nResource extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component3;
    private final String cacheTimestamp;
    private final Map<String, Map<String, String>> commonI18nResources;
    private final Map<String, Map<String, String>> themeI18nResources;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalI18nResource(String str, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = ShareDataUIState + 9;
            int i3 = i2 % 128;
            component3 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 61;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        map = (i & 2) != 0 ? MapsKt.emptyMap() : map;
        if ((i & 4) != 0) {
            map2 = MapsKt.emptyMap();
            int i7 = component3 + 111;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 3 % 3;
            } else {
                int i9 = 2 % 2;
            }
        }
        this(str, map, map2);
    }

    public final String getCacheTimestamp() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 51;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int i5 = i2 + 125;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, Map<String, String>> getThemeI18nResources() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.themeI18nResources;
        int i5 = i2 + 97;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, Map<String, String>> getCommonI18nResources() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.commonI18nResources;
        int i5 = i3 + 119;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalI18nResource(String str, Map<String, ? extends Map<String, String>> map, Map<String, ? extends Map<String, String>> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.cacheTimestamp = str;
        this.themeI18nResources = map;
        this.commonI18nResources = map2;
    }

    public LocalI18nResource() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LocalI18nResource copy$default(LocalI18nResource localI18nResource, String str, Map map, Map map2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = ShareDataUIState + 119;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            str = localI18nResource.cacheTimestamp;
        }
        if ((i & 2) != 0) {
            map = localI18nResource.themeI18nResources;
            int i5 = i4 + 31;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 4) != 0) {
            int i7 = i4 + 85;
            ShareDataUIState = i7 % 128;
            if (i7 % 2 == 0) {
                Map<String, Map<String, String>> map3 = localI18nResource.commonI18nResources;
                throw null;
            }
            map2 = localI18nResource.commonI18nResources;
        }
        return localI18nResource.copy(str, map, map2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.cacheTimestamp;
        int i5 = i3 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Map<String, Map<String, String>> component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.themeI18nResources;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, Map<String, String>> component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 57;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.commonI18nResources;
        int i5 = i2 + 25;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final LocalI18nResource copy(String cacheTimestamp, Map<String, ? extends Map<String, String>> themeI18nResources, Map<String, ? extends Map<String, String>> commonI18nResources) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(themeI18nResources, "");
        Intrinsics.checkNotNullParameter(commonI18nResources, "");
        LocalI18nResource localI18nResource = new LocalI18nResource(cacheTimestamp, themeI18nResources, commonI18nResources);
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
        }
        return localI18nResource;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof LocalI18nResource)) {
            return false;
        }
        LocalI18nResource localI18nResource = (LocalI18nResource) other;
        if (!Intrinsics.areEqual(this.cacheTimestamp, localI18nResource.cacheTimestamp) || (!Intrinsics.areEqual(this.themeI18nResources, localI18nResource.themeI18nResources))) {
            return false;
        }
        if (Intrinsics.areEqual(this.commonI18nResources, localI18nResource.commonI18nResources)) {
            return true;
        }
        int i4 = component3 + 85;
        ShareDataUIState = i4 % 128;
        return i4 % 2 == 0;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 53;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        if (str == null) {
            int i5 = i2 + 29;
            ShareDataUIState = i5 % 128;
            iHashCode = i5 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
        }
        int iHashCode2 = (((iHashCode * 31) + this.themeI18nResources.hashCode()) * 31) + this.commonI18nResources.hashCode();
        int i6 = component3 + 87;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode2;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalI18nResource(cacheTimestamp=" + this.cacheTimestamp + ", themeI18nResources=" + this.themeI18nResources + ", commonI18nResources=" + this.commonI18nResources + ")";
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
