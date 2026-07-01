package com.huawei.digitalpayment.common.theme.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/FilterConfig;", "", "filterKey", "", "filterValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getFilterKey", "()Ljava/lang/String;", "getFilterValue", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilterConfig {
    private static int component1 = 1;
    private static int component3;
    private final String ShareDataUIState;
    private final String copydefault;

    public FilterConfig(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.ShareDataUIState = str;
        this.copydefault = str2;
    }

    public final String getFilterKey() {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        throw null;
    }

    public final String getFilterValue() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 3;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.copydefault;
        int i4 = i2 + 85;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static FilterConfig copy$default(FilterConfig filterConfig, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = component1 + 89;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 == 0 && (i & 1) != 0) {
            str = filterConfig.ShareDataUIState;
        }
        if ((i & 2) != 0) {
            int i5 = i4 + 23;
            int i6 = i5 % 128;
            component1 = i6;
            int i7 = i5 % 2;
            String str3 = filterConfig.copydefault;
            if (i7 == 0) {
                int i8 = 96 / 0;
            }
            int i9 = i6 + 87;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            str2 = str3;
        }
        FilterConfig filterConfigCopy = filterConfig.copy(str, str2);
        int i11 = component3 + 57;
        component1 = i11 % 128;
        if (i11 % 2 != 0) {
            return filterConfigCopy;
        }
        throw null;
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.ShareDataUIState;
        int i5 = i2 + 69;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 83;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            str = this.copydefault;
            int i4 = 22 / 0;
        } else {
            str = this.copydefault;
        }
        int i5 = i3 + 79;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final FilterConfig copy(String filterKey, String filterValue) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(filterKey, "");
        Intrinsics.checkNotNullParameter(filterValue, "");
        FilterConfig filterConfig = new FilterConfig(filterKey, filterValue);
        int i2 = component3 + 77;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return filterConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterConfig)) {
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) other;
        if (!Intrinsics.areEqual(this.ShareDataUIState, filterConfig.ShareDataUIState)) {
            return false;
        }
        if (Intrinsics.areEqual(this.copydefault, filterConfig.copydefault)) {
            return true;
        }
        int i4 = component3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    public int hashCode() {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        int iHashCode = i2 % 2 == 0 ? (this.ShareDataUIState.hashCode() << 106) - this.copydefault.hashCode() : (this.ShareDataUIState.hashCode() * 31) + this.copydefault.hashCode();
        int i3 = component1 + 33;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return iHashCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        String str = "FilterConfig(filterKey=" + this.ShareDataUIState + ", filterValue=" + this.copydefault + ")";
        int i2 = component3 + 85;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
