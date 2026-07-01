package com.huawei.digitalpayment.home.theme.data.remote;

import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005\u0012 \u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J#\u0010\u000f\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005HÆ\u0003J#\u0010\u0010\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005HÆ\u0003J]\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\"\b\u0002\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u00052\"\b\u0002\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR+\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR+\u0010\u0006\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteI18nResource;", "Lcom/huawei/http/BaseResp;", "cacheTimestamp", "", "theme", "", WebViewConstants.COMMON, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getCacheTimestamp", "()Ljava/lang/String;", "getTheme", "()Ljava/util/Map;", "getCommon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteI18nResource extends BaseResp {
    private static int component1 = 1;
    private static int component2;
    private final String cacheTimestamp;
    private final Map<String, Map<String, String>> common;
    private final Map<String, Map<String, String>> theme;

    public final String getCacheTimestamp() {
        int i = 2 % 2;
        int i2 = component2 + 23;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.cacheTimestamp;
        int i5 = i3 + 123;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return str;
    }

    public final Map<String, Map<String, String>> getTheme() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 15;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.theme;
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, Map<String, String>> getCommon() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 105;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.common;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteI18nResource(String str, Map<String, ? extends Map<String, String>> map, Map<String, ? extends Map<String, String>> map2) {
        this.cacheTimestamp = str;
        this.theme = map;
        this.common = map2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static RemoteI18nResource copy$default(RemoteI18nResource remoteI18nResource, String str, Map map, Map map2, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 5;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = remoteI18nResource.cacheTimestamp;
        }
        if ((i & 2) != 0) {
            map = remoteI18nResource.theme;
        }
        if ((i & 4) != 0) {
            int i5 = component1 + 71;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            map2 = remoteI18nResource.common;
        }
        return remoteI18nResource.copy(str, map, map2);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int i5 = i2 + 47;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Map<String, String>> component2() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.theme;
        int i5 = i3 + 85;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, Map<String, String>> component3() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.common;
        int i5 = i2 + 125;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final RemoteI18nResource copy(String cacheTimestamp, Map<String, ? extends Map<String, String>> theme, Map<String, ? extends Map<String, String>> common) {
        int i = 2 % 2;
        RemoteI18nResource remoteI18nResource = new RemoteI18nResource(cacheTimestamp, theme, common);
        int i2 = component1 + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return remoteI18nResource;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteI18nResource)) {
            int i2 = component2 + 87;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        RemoteI18nResource remoteI18nResource = (RemoteI18nResource) other;
        if (!Intrinsics.areEqual(this.cacheTimestamp, remoteI18nResource.cacheTimestamp)) {
            int i4 = component2 + 11;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.theme, remoteI18nResource.theme)) {
            int i6 = component1 + 79;
            component2 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (Intrinsics.areEqual(this.common, remoteI18nResource.common)) {
            return true;
        }
        int i8 = component2 + 93;
        component1 = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 19;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int iHashCode = str == null ? 0 : str.hashCode();
        Map<String, Map<String, String>> map = this.theme;
        if (map == null) {
            int i5 = component2 + 81;
            component1 = i5 % 128;
            i = i5 % 2 == 0 ? 1 : 0;
        } else {
            int iHashCode2 = map.hashCode();
            int i6 = component2 + 115;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            i = iHashCode2;
        }
        Map<String, Map<String, String>> map2 = this.common;
        return (((iHashCode * 31) + i) * 31) + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteI18nResource(cacheTimestamp=" + this.cacheTimestamp + ", theme=" + this.theme + ", common=" + this.common + ")";
        int i2 = component2 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
