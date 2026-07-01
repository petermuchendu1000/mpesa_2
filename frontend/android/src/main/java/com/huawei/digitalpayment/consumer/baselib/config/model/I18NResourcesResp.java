package com.huawei.digitalpayment.consumer.baselib.config.model;

import com.huawei.digitalpayment.consumer.webview.constants.WebViewConstants;
import com.huawei.http.BaseResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0018\u00010\u0005HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR-\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/config/model/I18NResourcesResp;", "Lcom/huawei/http/BaseResp;", "cacheTimestamp", "", WebViewConstants.COMMON, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getCacheTimestamp", "()Ljava/lang/String;", "getCommon", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I18NResourcesResp extends BaseResp {
    private static int component1 = 0;
    private static int component2 = 1;
    private final String cacheTimestamp;
    private final Map<String, Map<String, String>> common;

    /* JADX WARN: Illegal instructions before constructor call */
    public I18NResourcesResp(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1;
            int i3 = i2 + 45;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 68 / 0;
            }
            int i5 = i2 + 121;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 2 % 2;
            }
            str = null;
        }
        if ((i & 2) != 0) {
            int i7 = component1 + 9;
            component2 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 86 / 0;
            }
            int i9 = 2 % 2;
            map = null;
        }
        this(str, map);
    }

    public final String getCacheTimestamp() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int i5 = i2 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final Map<String, Map<String, String>> getCommon() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Map<String, Map<String, String>> map = this.common;
        int i5 = i3 + 117;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I18NResourcesResp(String str, Map<String, ? extends Map<String, String>> map) {
        this.cacheTimestamp = str;
        this.common = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public I18NResourcesResp() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static I18NResourcesResp copy$default(I18NResourcesResp i18NResourcesResp, String str, Map map, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component2 + 67;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            str = i18NResourcesResp.cacheTimestamp;
        }
        if ((i & 2) != 0) {
            int i5 = component1 + 59;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            map = i18NResourcesResp.common;
        }
        return i18NResourcesResp.copy(str, map);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.cacheTimestamp;
        int i5 = i2 + 103;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 15 / 0;
        }
        return str;
    }

    public final Map<String, Map<String, String>> component2() {
        Map<String, Map<String, String>> map;
        int i = 2 % 2;
        int i2 = component2 + 31;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            map = this.common;
            int i4 = 57 / 0;
        } else {
            map = this.common;
        }
        int i5 = i3 + 89;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 69 / 0;
        }
        return map;
    }

    public final I18NResourcesResp copy(String cacheTimestamp, Map<String, ? extends Map<String, String>> common) {
        int i = 2 % 2;
        I18NResourcesResp i18NResourcesResp = new I18NResourcesResp(cacheTimestamp, common);
        int i2 = component1 + 65;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return i18NResourcesResp;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = component1 + 45;
            component2 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof I18NResourcesResp)) {
            int i3 = component1 + 9;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        I18NResourcesResp i18NResourcesResp = (I18NResourcesResp) other;
        if (Intrinsics.areEqual(this.cacheTimestamp, i18NResourcesResp.cacheTimestamp)) {
            if (Intrinsics.areEqual(this.common, i18NResourcesResp.common)) {
                return true;
            }
            int i4 = component2 + 119;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        int i6 = component2 + 47;
        int i7 = i6 % 128;
        component1 = i7;
        int i8 = i6 % 2;
        int i9 = i7 + 69;
        component2 = i9 % 128;
        int i10 = i9 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        String str = this.cacheTimestamp;
        if (str == null) {
            int i2 = component2 + 119;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            int i5 = i3 + 111;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str.hashCode();
        }
        Map<String, Map<String, String>> map = this.common;
        return (iHashCode * 31) + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "I18NResourcesResp(cacheTimestamp=" + this.cacheTimestamp + ", common=" + this.common + ")";
        int i2 = component2 + 1;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 17 / 0;
        }
        return str;
    }
}
