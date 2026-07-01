package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", ThemeConstants.INDICA_POSITION_CENTER, "Lcom/huawei/digitalpayment/common/theme/data/SearchCenterComponent;", "leftIcon", "Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "rightIcon", "subtitleTextColor", "", "titleTextColor", "<init>", "(Lcom/huawei/digitalpayment/common/theme/data/SearchCenterComponent;Lcom/huawei/digitalpayment/common/theme/data/IconConfig;Lcom/huawei/digitalpayment/common/theme/data/IconConfig;Ljava/lang/String;Ljava/lang/String;)V", "getCenter", "()Lcom/huawei/digitalpayment/common/theme/data/SearchCenterComponent;", "setCenter", "(Lcom/huawei/digitalpayment/common/theme/data/SearchCenterComponent;)V", "getLeftIcon", "()Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "setLeftIcon", "(Lcom/huawei/digitalpayment/common/theme/data/IconConfig;)V", "getRightIcon", "setRightIcon", "getSubtitleTextColor", "()Ljava/lang/String;", "setSubtitleTextColor", "(Ljava/lang/String;)V", "getTitleTextColor", "setTitleTextColor", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TopSearchAreaComponent extends BaseComponent {
    private static int component1 = 0;
    private static int copydefault = 1;
    private SearchCenterComponent center;
    private IconConfig leftIcon;
    private IconConfig rightIcon;
    private String subtitleTextColor;
    private String titleTextColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public TopSearchAreaComponent(SearchCenterComponent searchCenterComponent, IconConfig iconConfig, IconConfig iconConfig2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        IconConfig iconConfig3;
        String str3;
        String str4 = null;
        if ((i & 1) != 0) {
            int i2 = copydefault + 93;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                str4.hashCode();
                throw null;
            }
            searchCenterComponent = null;
        }
        IconConfig iconConfig4 = (i & 2) != 0 ? null : iconConfig;
        if ((i & 4) != 0) {
            int i3 = copydefault + 123;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            iconConfig3 = null;
        } else {
            iconConfig3 = iconConfig2;
        }
        if ((i & 8) != 0) {
            int i5 = component1 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i & 16) != 0) {
            int i8 = component1 + 31;
            copydefault = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 3 % 2;
            } else {
                int i10 = 2 % 2;
            }
        } else {
            str4 = str2;
        }
        this(searchCenterComponent, iconConfig4, iconConfig3, str3, str4);
    }

    public final SearchCenterComponent getCenter() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        SearchCenterComponent searchCenterComponent = this.center;
        int i5 = i2 + 91;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return searchCenterComponent;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setCenter(SearchCenterComponent searchCenterComponent) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.center = searchCenterComponent;
        int i5 = i2 + 35;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IconConfig getLeftIcon() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        IconConfig iconConfig = this.leftIcon;
        int i5 = i3 + 19;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 9 / 0;
        }
        return iconConfig;
    }

    public final void setLeftIcon(IconConfig iconConfig) {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        this.leftIcon = iconConfig;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 5;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
    }

    public final IconConfig getRightIcon() {
        IconConfig iconConfig;
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            iconConfig = this.rightIcon;
            int i4 = 85 / 0;
        } else {
            iconConfig = this.rightIcon;
        }
        int i5 = i3 + 39;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return iconConfig;
    }

    public final void setRightIcon(IconConfig iconConfig) {
        int i = 2 % 2;
        int i2 = component1 + 93;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.rightIcon = iconConfig;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final String getSubtitleTextColor() {
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.subtitleTextColor;
        }
        throw null;
    }

    public final void setSubtitleTextColor(String str) {
        int i = 2 % 2;
        int i2 = component1 + 53;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        this.subtitleTextColor = str;
        if (i3 == 0) {
            int i4 = 16 / 0;
        }
    }

    public final String getTitleTextColor() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 43;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        String str = this.titleTextColor;
        int i5 = i2 + 97;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTitleTextColor(String str) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        this.titleTextColor = str;
        int i5 = i3 + 3;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public TopSearchAreaComponent(SearchCenterComponent searchCenterComponent, IconConfig iconConfig, IconConfig iconConfig2, String str, String str2) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.center = searchCenterComponent;
        this.leftIcon = iconConfig;
        this.rightIcon = iconConfig2;
        this.subtitleTextColor = str;
        this.titleTextColor = str2;
    }

    public TopSearchAreaComponent() {
        this(null, null, null, null, null, 31, null);
    }
}
