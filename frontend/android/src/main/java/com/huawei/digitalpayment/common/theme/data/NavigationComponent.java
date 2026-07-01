package com.huawei.digitalpayment.common.theme.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u001bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0018\u0010\u0012\"\u0004\b\u0019\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/NavigationComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "selectedImage", "", "unSelectedImage", "indicatorImageHeight", "", "mainButtonBgdImage", "mainButtonBgdImageHeight", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "getSelectedImage", "()Ljava/lang/String;", "setSelectedImage", "(Ljava/lang/String;)V", "getUnSelectedImage", "setUnSelectedImage", "getIndicatorImageHeight", "()Ljava/lang/Integer;", "setIndicatorImageHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMainButtonBgdImage", "setMainButtonBgdImage", "getMainButtonBgdImageHeight", "setMainButtonBgdImageHeight", "showIndicator", "", "middleIndex", "isShowMainButtonIndex", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class NavigationComponent extends BaseComponent {
    private static int component1 = 0;
    private static int component2 = 1;
    private Integer indicatorImageHeight;
    private String mainButtonBgdImage;
    private Integer mainButtonBgdImageHeight;
    private String selectedImage;
    private String unSelectedImage;

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationComponent(String str, String str2, Integer num, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        Integer num3;
        String str5;
        Integer num4;
        Object obj = null;
        String str6 = (i & 1) != 0 ? null : str;
        if ((i & 2) != 0) {
            int i2 = 2 % 2;
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            int i3 = component1 + 81;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i & 8) != 0) {
            int i4 = component1 + 99;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            str5 = null;
        } else {
            str5 = str3;
        }
        if ((i & 16) != 0) {
            int i6 = component1 + 23;
            int i7 = i6 % 128;
            component2 = i7;
            int i8 = i6 % 2;
            int i9 = i7 + 111;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 2 % 2;
            num4 = null;
        } else {
            num4 = num2;
        }
        this(str6, str4, num3, str5, num4);
    }

    public final String getSelectedImage() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.selectedImage;
        int i4 = i2 + 59;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return str;
    }

    public final void setSelectedImage(String str) {
        int i = 2 % 2;
        int i2 = component1 + 73;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.selectedImage = str;
        if (i4 == 0) {
            int i5 = 62 / 0;
        }
        int i6 = i3 + 55;
        component1 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 44 / 0;
        }
    }

    public final String getUnSelectedImage() {
        int i = 2 % 2;
        int i2 = component2 + 49;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.unSelectedImage;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setUnSelectedImage(String str) {
        int i = 2 % 2;
        int i2 = component2 + 119;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.unSelectedImage = str;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getIndicatorImageHeight() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorImageHeight;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setIndicatorImageHeight(Integer num) {
        int i = 2 % 2;
        int i2 = component2 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.indicatorImageHeight = num;
        if (i3 != 0) {
            throw null;
        }
    }

    public final String getMainButtonBgdImage() {
        int i = 2 % 2;
        int i2 = component2 + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.mainButtonBgdImage;
        }
        throw null;
    }

    public final void setMainButtonBgdImage(String str) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        this.mainButtonBgdImage = str;
        if (i3 != 0) {
            throw null;
        }
    }

    public final Integer getMainButtonBgdImageHeight() {
        int i = 2 % 2;
        int i2 = component1 + 121;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.mainButtonBgdImageHeight;
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return num;
    }

    public final void setMainButtonBgdImageHeight(Integer num) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 89;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.mainButtonBgdImageHeight = num;
        int i5 = i2 + 27;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public NavigationComponent(String str, String str2, Integer num, String str3, Integer num2) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.selectedImage = str;
        this.unSelectedImage = str2;
        this.indicatorImageHeight = num;
        this.mainButtonBgdImage = str3;
        this.mainButtonBgdImageHeight = num2;
    }

    public final boolean showIndicator() {
        String str;
        Integer num;
        int i = 2 % 2;
        String str2 = this.selectedImage;
        if (str2 == null) {
            return false;
        }
        int i2 = component1 + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (str2.length() == 0 || (str = this.unSelectedImage) == null || str.length() == 0 || (num = this.indicatorImageHeight) == null) {
            return false;
        }
        int i4 = component2 + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        if (i5 != 0) {
            int i6 = 41 / 0;
            if (iIntValue <= 0) {
                return false;
            }
        } else if (iIntValue <= 0) {
            return false;
        }
        return true;
    }

    public final int middleIndex() {
        int i = 2 % 2;
        if (getSubComponents() != null) {
            int i2 = component2 + 111;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return (r1.size() - 1) / 2;
        }
        int i4 = component1 + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isShowMainButtonIndex() {
        List<Object> subComponents;
        int i = 2 % 2;
        int i2 = component1 + 53;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            getSubComponents();
            throw null;
        }
        List<Object> subComponents2 = getSubComponents();
        if ((subComponents2 == null || subComponents2.size() != 3) && ((subComponents = getSubComponents()) == null || subComponents.size() != 5)) {
            return false;
        }
        int i3 = component1 + 97;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return true;
    }

    public NavigationComponent() {
        this(null, null, null, null, null, 31, null);
    }
}
