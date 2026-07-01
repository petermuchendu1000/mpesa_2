package com.huawei.digitalpayment.common.theme.data;

import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0017\u0010\u0015R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001bR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/TextConfig;", "Lcom/huawei/http/BaseResp;", "color", "", "size", "", "marginStart", "marginEnd", "text", KeysConstants.KEY_EXECUTE, "isShow", "", "marginTop", "icon", "iconSize", "iconMargin", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/String;", "getSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginStart", "getMarginEnd", "getText", "getExecute", "()Z", "getMarginTop", "getIcon", "getIconSize", "getIconMargin", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class TextConfig extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String color;
    private final String execute;
    private final String icon;
    private final Integer iconMargin;
    private final Integer iconSize;
    private final boolean isShow;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer marginTop;
    private final Integer size;
    private final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextConfig(String str, Integer num, Integer num2, Integer num3, String str2, String str3, boolean z, Integer num4, String str4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num7;
        String str5;
        String str6;
        boolean z2;
        String str7;
        Integer num8;
        Integer num9 = null;
        String str8 = (i & 1) != 0 ? null : str;
        Integer num10 = (i & 2) != 0 ? null : num;
        Integer num11 = (i & 4) != 0 ? null : num2;
        if ((i & 8) != 0) {
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            num7 = null;
        } else {
            num7 = num3;
        }
        if ((i & 16) != 0) {
            int i4 = component1 + 33;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 2;
            }
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i & 32) != 0) {
            int i6 = 2 % 2;
            str6 = null;
        } else {
            str6 = str3;
        }
        if ((i & 64) != 0) {
            int i7 = component1 + 1;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            z2 = false;
        } else {
            z2 = z;
        }
        Integer num12 = (i & 128) != 0 ? null : num4;
        if ((i & 256) != 0) {
            int i9 = component3 + 105;
            component1 = i9 % 128;
            if (i9 % 2 != 0) {
                num9.hashCode();
                throw null;
            }
            str7 = null;
        } else {
            str7 = str4;
        }
        if ((i & 512) != 0) {
            int i10 = component1 + 51;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            num8 = null;
        } else {
            num8 = num5;
        }
        if ((i & 1024) != 0) {
            int i12 = component3 + 79;
            component1 = i12 % 128;
            int i13 = i12 % 2;
            int i14 = 2 % 2;
        } else {
            num9 = num6;
        }
        this(str8, num10, num11, num7, str5, str6, z2, num12, str7, num8, num9);
    }

    public final String getColor() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.color;
        if (i3 != 0) {
            int i4 = 56 / 0;
        }
        return str;
    }

    public final Integer getSize() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.size;
        int i4 = i3 + 69;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginEnd() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.marginEnd;
            int i4 = 19 / 0;
        } else {
            num = this.marginEnd;
        }
        int i5 = i2 + 59;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 121;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.text;
        int i5 = i2 + 37;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.execute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean isShow() {
        int i = 2 % 2;
        int i2 = component1 + 25;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.isShow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 103;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getIcon() {
        int i = 2 % 2;
        int i2 = component1 + 67;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.icon;
        int i4 = i3 + 13;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getIconSize() {
        int i = 2 % 2;
        int i2 = component3 + 109;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.iconSize;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getIconMargin() {
        int i = 2 % 2;
        int i2 = component1 + 81;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.iconMargin;
        int i5 = i3 + 45;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public TextConfig(String str, Integer num, Integer num2, Integer num3, String str2, String str3, boolean z, Integer num4, String str4, Integer num5, Integer num6) {
        this.color = str;
        this.size = num;
        this.marginStart = num2;
        this.marginEnd = num3;
        this.text = str2;
        this.execute = str3;
        this.isShow = z;
        this.marginTop = num4;
        this.icon = str4;
        this.iconSize = num5;
        this.iconMargin = num6;
    }

    public TextConfig() {
        this(null, null, null, null, null, null, false, null, null, null, null, 2047, null);
    }
}
