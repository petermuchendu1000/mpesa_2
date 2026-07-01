package com.huawei.digitalpayment.common.theme.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TopSearchAreaTemplate4Component;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "leftIcon", "Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "leftText", "Lcom/huawei/digitalpayment/common/theme/data/TextConfig;", "changeLanguage", "Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;", "rightIconList", "", "<init>", "(Lcom/huawei/digitalpayment/common/theme/data/IconConfig;Lcom/huawei/digitalpayment/common/theme/data/TextConfig;Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;Ljava/util/List;)V", "getLeftIcon", "()Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "setLeftIcon", "(Lcom/huawei/digitalpayment/common/theme/data/IconConfig;)V", "getLeftText", "()Lcom/huawei/digitalpayment/common/theme/data/TextConfig;", "setLeftText", "(Lcom/huawei/digitalpayment/common/theme/data/TextConfig;)V", "getChangeLanguage", "()Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;", "setChangeLanguage", "(Lcom/huawei/digitalpayment/common/theme/data/ChangeLanguage;)V", "getRightIconList", "()Ljava/util/List;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TopSearchAreaTemplate4Component extends BaseComponent {
    private static int component2 = 1;
    private static int component3;
    private ChangeLanguage changeLanguage;
    private IconConfig leftIcon;
    private TextConfig leftText;
    private final List<IconConfig> rightIconList;

    /* JADX WARN: Illegal instructions before constructor call */
    public TopSearchAreaTemplate4Component(IconConfig iconConfig, TextConfig textConfig, ChangeLanguage changeLanguage, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = 2 % 2;
            iconConfig = null;
        }
        if ((i & 2) != 0) {
            int i3 = component3 + 27;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            int i4 = 2 % 2;
            textConfig = null;
        }
        if ((i & 4) != 0) {
            int i5 = component2 + 45;
            int i6 = i5 % 128;
            component3 = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 125;
            component2 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            changeLanguage = null;
        }
        if ((i & 8) != 0) {
            int i11 = component3 + 119;
            component2 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            list = null;
        }
        this(iconConfig, textConfig, changeLanguage, list);
    }

    public final IconConfig getLeftIcon() {
        IconConfig iconConfig;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 15;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            iconConfig = this.leftIcon;
            int i4 = 21 / 0;
        } else {
            iconConfig = this.leftIcon;
        }
        int i5 = i2 + 17;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return iconConfig;
    }

    public final void setLeftIcon(IconConfig iconConfig) {
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.leftIcon = iconConfig;
        int i5 = i3 + 47;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public final TextConfig getLeftText() {
        int i = 2 % 2;
        int i2 = component2 + 87;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        TextConfig textConfig = this.leftText;
        int i5 = i3 + 107;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return textConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setLeftText(TextConfig textConfig) {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.leftText = textConfig;
        int i5 = i3 + 87;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
    }

    public final ChangeLanguage getChangeLanguage() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 5;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ChangeLanguage changeLanguage = this.changeLanguage;
        int i5 = i2 + 63;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
        return changeLanguage;
    }

    public final void setChangeLanguage(ChangeLanguage changeLanguage) {
        int i = 2 % 2;
        int i2 = component2 + 99;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.changeLanguage = changeLanguage;
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
    }

    public final List<IconConfig> getRightIconList() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 83;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        List<IconConfig> list = this.rightIconList;
        int i4 = i2 + 35;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public TopSearchAreaTemplate4Component(IconConfig iconConfig, TextConfig textConfig, ChangeLanguage changeLanguage, List<IconConfig> list) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.leftIcon = iconConfig;
        this.leftText = textConfig;
        this.changeLanguage = changeLanguage;
        this.rightIconList = list;
    }

    public TopSearchAreaTemplate4Component() {
        this(null, null, null, null, 15, null);
    }
}
