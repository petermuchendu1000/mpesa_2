package com.huawei.digitalpayment.common.theme.data;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006#"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TitleBarComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "text", "", CdpConstants.CONTENT_TEXT_COLOR, AUAttrsConstant.TV_TEXTSIZE, "", "textGravity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getTextColor", "setTextColor", "getTextSize", "()Ljava/lang/Integer;", "setTextSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTextGravity", "setTextGravity", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/common/theme/data/TitleBarComponent;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TitleBarComponent extends BaseComponent {
    private static int component1 = 0;
    private static int component2 = 1;
    private String text;
    private String textColor;
    private String textGravity;
    private Integer textSize;

    /* JADX WARN: Illegal instructions before constructor call */
    public TitleBarComponent(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            int i2 = component1 + 83;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            str = null;
        }
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i3 = component2 + 97;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
            num = null;
        }
        if ((i & 8) != 0) {
            int i6 = component1 + 107;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 50 / 0;
            }
            int i8 = 2 % 2;
            str3 = null;
        }
        this(str, str2, num, str3);
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setText(String str) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        this.text = str;
        int i5 = i3 + 103;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getTextColor() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.textColor;
        int i5 = i2 + 93;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setTextColor(String str) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 19;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.textColor = str;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getTextSize() {
        Integer num;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 9;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.textSize;
            int i4 = 84 / 0;
        } else {
            num = this.textSize;
        }
        int i5 = i2 + 111;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setTextSize(Integer num) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.textSize = num;
        int i5 = i2 + 83;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getTextGravity() {
        int i = 2 % 2;
        int i2 = component2 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.textGravity;
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return str;
    }

    public final void setTextGravity(String str) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        this.textGravity = str;
        int i5 = i2 + 41;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public TitleBarComponent(String str, String str2, Integer num, String str3) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.text = str;
        this.textColor = str2;
        this.textSize = num;
        this.textGravity = str3;
    }

    public TitleBarComponent() {
        this(null, null, null, null, 15, null);
    }

    public static TitleBarComponent copy$default(TitleBarComponent titleBarComponent, String str, String str2, Integer num, String str3, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = titleBarComponent.text;
            int i3 = component2 + 81;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 4;
            }
        }
        if ((i & 2) != 0) {
            str2 = titleBarComponent.textColor;
        }
        if ((i & 4) != 0) {
            num = titleBarComponent.textSize;
            int i5 = component1 + 95;
            component2 = i5 % 128;
            int i6 = i5 % 2;
        }
        if ((i & 8) != 0) {
            str3 = titleBarComponent.textGravity;
            int i7 = component2 + 115;
            component1 = i7 % 128;
            int i8 = i7 % 2;
        }
        return titleBarComponent.copy(str, str2, num, str3);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 71;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 121;
        component1 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.textColor;
        int i4 = i2 + 75;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component3() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.textSize;
            int i4 = 38 / 0;
        } else {
            num = this.textSize;
        }
        int i5 = i2 + 55;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component2 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.textGravity;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TitleBarComponent copy(String text, String textColor, Integer textSize, String textGravity) {
        int i = 2 % 2;
        TitleBarComponent titleBarComponent = new TitleBarComponent(text, textColor, textSize, textGravity);
        int i2 = component2 + 117;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return titleBarComponent;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleBarComponent)) {
            int i2 = component1 + 71;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        TitleBarComponent titleBarComponent = (TitleBarComponent) other;
        if (!Intrinsics.areEqual(this.text, titleBarComponent.text)) {
            int i4 = component2 + 73;
            component1 = i4 % 128;
            return !(i4 % 2 == 0);
        }
        if (Intrinsics.areEqual(this.textColor, titleBarComponent.textColor)) {
            return Intrinsics.areEqual(this.textSize, titleBarComponent.textSize) && !(Intrinsics.areEqual(this.textGravity, titleBarComponent.textGravity) ^ true);
        }
        int i5 = component2 + 61;
        component1 = i5 % 128;
        return i5 % 2 != 0;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        String str = this.text;
        if (str == null) {
            int i2 = component2 + 99;
            component1 = i2 % 128;
            iHashCode = i2 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str.hashCode();
            int i3 = component1 + 113;
            component2 = i3 % 128;
            int i4 = i3 % 2;
        }
        String str2 = this.textColor;
        if (str2 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = str2.hashCode();
            int i5 = component2 + 103;
            component1 = i5 % 128;
            int i6 = i5 % 2;
        }
        Integer num = this.textSize;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.textGravity;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "TitleBarComponent(text=" + this.text + ", textColor=" + this.textColor + ", textSize=" + this.textSize + ", textGravity=" + this.textGravity + ")";
        int i2 = component2 + 33;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
