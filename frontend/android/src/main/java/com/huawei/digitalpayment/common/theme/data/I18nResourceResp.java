package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.http.BaseResp;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005\u0012 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003J!\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0003JY\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032 \b\u0002\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u00052 \b\u0002\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR)\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00050\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/I18nResourceResp;", "Lcom/huawei/http/BaseResp;", "cacheTimestamp", "", "theme", "", WebViewConstants.COMMON, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getCacheTimestamp", "()Ljava/lang/String;", "getTheme", "()Ljava/util/Map;", "getCommon", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I18nResourceResp extends BaseResp {
    private static int component2 = 1;
    private static int copydefault;
    private final String cacheTimestamp;
    private final Map<String, Map<String, String>> common;
    private final Map<String, Map<String, String>> theme;

    public final String getCacheTimestamp() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 69;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int i5 = i2 + 101;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I18nResourceResp(String str, Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            map = Collections.emptyMap();
            int i2 = component2 + 1;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 4 % 4;
            } else {
                int i4 = 2 % 2;
            }
        }
        if ((i & 4) != 0) {
            map2 = Collections.emptyMap();
            int i5 = component2 + 71;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
        }
        this(str, map, map2);
    }

    public final Map<String, Map<String, String>> getTheme() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.theme;
        int i5 = i2 + 77;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final Map<String, Map<String, String>> getCommon() {
        int i = 2 % 2;
        int i2 = component2 + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Map<String, Map<String, String>> map = this.common;
        int i4 = i3 + 115;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 30 / 0;
        }
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I18nResourceResp(String str, Map<String, ? extends Map<String, String>> map, Map<String, ? extends Map<String, String>> map2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.cacheTimestamp = str;
        this.theme = map;
        this.common = map2;
    }

    public I18nResourceResp() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static I18nResourceResp copy$default(I18nResourceResp i18nResourceResp, String str, Map map, Map map2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component2;
        int i4 = i3 + 59;
        copydefault = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = i18nResourceResp.cacheTimestamp;
        }
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i5 = i3 + 21;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                Map<String, Map<String, String>> map3 = i18nResourceResp.theme;
                obj2.hashCode();
                throw null;
            }
            map = i18nResourceResp.theme;
        }
        if ((i & 4) != 0) {
            int i6 = i3 + 23;
            copydefault = i6 % 128;
            int i7 = i6 % 2;
            map2 = i18nResourceResp.common;
        }
        I18nResourceResp i18nResourceRespCopy = i18nResourceResp.copy(str, map, map2);
        int i8 = component2 + 45;
        copydefault = i8 % 128;
        if (i8 % 2 == 0) {
            return i18nResourceRespCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cacheTimestamp;
        if (i3 != 0) {
            int i4 = 14 / 0;
        }
        return str;
    }

    public final Map<String, Map<String, String>> component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 117;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Map<String, Map<String, String>> map = this.theme;
        int i5 = i2 + 43;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Map<String, Map<String, String>> component3() {
        int i = 2 % 2;
        int i2 = copydefault + 105;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.common;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public final I18nResourceResp copy(String cacheTimestamp, Map<String, ? extends Map<String, String>> theme, Map<String, ? extends Map<String, String>> common) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(theme, "");
        Intrinsics.checkNotNullParameter(common, "");
        I18nResourceResp i18nResourceResp = new I18nResourceResp(cacheTimestamp, theme, common);
        int i2 = copydefault + 7;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return i18nResourceResp;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof I18nResourceResp)) {
            int i2 = component2 + 95;
            int i3 = i2 % 128;
            copydefault = i3;
            boolean z = i2 % 2 != 0;
            int i4 = i3 + 69;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return z;
        }
        I18nResourceResp i18nResourceResp = (I18nResourceResp) other;
        if (!Intrinsics.areEqual(this.cacheTimestamp, i18nResourceResp.cacheTimestamp)) {
            int i6 = component2 + 125;
            copydefault = i6 % 128;
            return i6 % 2 != 0;
        }
        if (Intrinsics.areEqual(this.theme, i18nResourceResp.theme)) {
            return !(Intrinsics.areEqual(this.common, i18nResourceResp.common) ^ true);
        }
        int i7 = component2 + 5;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.cacheTimestamp;
        if (str == null) {
            int i4 = i2 + 25;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        return (((iHashCode * 31) + this.theme.hashCode()) * 31) + this.common.hashCode();
    }

    public String toString() {
        int i = 2 % 2;
        String str = "I18nResourceResp(cacheTimestamp=" + this.cacheTimestamp + ", theme=" + this.theme + ", common=" + this.common + ")";
        int i2 = component2 + 119;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
