package com.huawei.digitalpayment.common.theme.data;

import com.alibaba.griver.ui.ant.badge.AUBadgeView;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ¤\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00103J\u0013\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u00020\u0006HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b#\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b$\u0010\u001b¨\u00069"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "Lcom/huawei/http/BaseResp;", "url", "", KeysConstants.KEY_EXECUTE, "width", "", "height", "roundCorner", "backgroundColor", "marginStart", "marginEnd", "badgeStyle", AUBadgeView.KEY_BADGE_CONTENT, "isShow", "", "marginTop", "size", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)V", "getUrl", "()Ljava/lang/String;", "getExecute", "getWidth", "()I", "getHeight", "getRoundCorner", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "getMarginStart", "getMarginEnd", "getBadgeStyle", "getBadgeText", "()Z", "getMarginTop", "getSize", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/IconConfig;", "equals", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class IconConfig extends BaseResp {
    private static int ShareDataUIState = 1;
    private static int component1;
    private final String backgroundColor;
    private final String badgeStyle;
    private final String badgeText;
    private final String execute;
    private final int height;
    private final boolean isShow;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer marginTop;
    private final Integer roundCorner;
    private final Integer size;
    private final String url;
    private final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    public IconConfig(String str, String str2, int i, int i2, Integer num, String str3, Integer num2, Integer num3, String str4, String str5, boolean z, Integer num4, Integer num5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        int i4;
        Integer num6;
        String str8;
        if ((i3 & 1) != 0) {
            int i5 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i3 & 2) != 0) {
            int i6 = component1 + 117;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i3 & 4) != 0) {
            int i9 = 2 % 2;
            i4 = -2;
        } else {
            i4 = i;
        }
        int i10 = (i3 & 8) == 0 ? i2 : -2;
        Integer num7 = (i3 & 16) != 0 ? null : num;
        String str9 = (i3 & 32) != 0 ? null : str3;
        if ((i3 & 64) != 0) {
            int i11 = component1 + 33;
            ShareDataUIState = i11 % 128;
            if (i11 % 2 == 0) {
                num.hashCode();
                throw null;
            }
            num6 = null;
        } else {
            num6 = num2;
        }
        Integer num8 = (i3 & 128) != 0 ? null : num3;
        String str10 = (i3 & 256) != 0 ? null : str4;
        if ((i3 & 512) != 0) {
            int i12 = ShareDataUIState + 95;
            component1 = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 92 / 0;
            }
            str8 = null;
        } else {
            str8 = str5;
        }
        this(str6, str7, i4, i10, num7, str9, num6, num8, str10, str8, (i3 & 1024) == 0 ? z : false, (i3 & 2048) != 0 ? null : num4, (i3 & 4096) == 0 ? num5 : null);
    }

    public final String getUrl() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.url;
        int i5 = i2 + 67;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 23;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 1 / 0;
        }
        return str;
    }

    public final int getWidth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.width;
        int i6 = i2 + 25;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final int getHeight() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.height;
        int i6 = i2 + 69;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 39;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.roundCorner;
        }
        throw null;
    }

    public final String getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.backgroundColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.marginStart;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginEnd() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginEnd;
        int i5 = i2 + 31;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getBadgeStyle() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 83;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.badgeStyle;
        int i5 = i2 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 53 / 0;
        }
        return str;
    }

    public final String getBadgeText() {
        String str;
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            str = this.badgeText;
            int i4 = 3 / 0;
        } else {
            str = this.badgeText;
        }
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final boolean isShow() {
        int i = 2 % 2;
        int i2 = component1 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        boolean z = this.isShow;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.marginTop;
        }
        throw null;
    }

    public final Integer getSize() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public IconConfig(String str, String str2, int i, int i2, Integer num, String str3, Integer num2, Integer num3, String str4, String str5, boolean z, Integer num4, Integer num5) {
        this.url = str;
        this.execute = str2;
        this.width = i;
        this.height = i2;
        this.roundCorner = num;
        this.backgroundColor = str3;
        this.marginStart = num2;
        this.marginEnd = num3;
        this.badgeStyle = str4;
        this.badgeText = str5;
        this.isShow = z;
        this.marginTop = num4;
        this.size = num5;
    }

    public IconConfig() {
        this(null, null, 0, 0, null, null, null, null, null, null, false, null, null, HmsScanBase.ALL_SCAN_TYPE, null);
    }

    public static IconConfig copy$default(IconConfig iconConfig, String str, String str2, int i, int i2, Integer num, String str3, Integer num2, Integer num3, String str4, String str5, boolean z, Integer num4, Integer num5, int i3, Object obj) {
        String str6;
        String str7;
        int i4;
        Integer num6;
        String str8;
        Integer num7;
        int i5 = 2 % 2;
        Object obj2 = null;
        if ((i3 & 1) != 0) {
            int i6 = component1 + 77;
            ShareDataUIState = i6 % 128;
            if (i6 % 2 == 0) {
                String str9 = iconConfig.url;
                obj2.hashCode();
                throw null;
            }
            str6 = iconConfig.url;
        } else {
            str6 = str;
        }
        if ((i3 & 2) != 0) {
            int i7 = component1 + 113;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
            str7 = iconConfig.execute;
        } else {
            str7 = str2;
        }
        int i9 = (i3 & 4) != 0 ? iconConfig.width : i;
        if ((i3 & 8) != 0) {
            int i10 = ShareDataUIState + 45;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            i4 = iconConfig.height;
        } else {
            i4 = i2;
        }
        if ((i3 & 16) != 0) {
            int i12 = component1 + 3;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            num6 = iconConfig.roundCorner;
        } else {
            num6 = num;
        }
        String str10 = (i3 & 32) != 0 ? iconConfig.backgroundColor : str3;
        Integer num8 = (i3 & 64) != 0 ? iconConfig.marginStart : num2;
        Integer num9 = (i3 & 128) != 0 ? iconConfig.marginEnd : num3;
        String str11 = (i3 & 256) != 0 ? iconConfig.badgeStyle : str4;
        if ((i3 & 512) != 0) {
            int i14 = component1 + 109;
            ShareDataUIState = i14 % 128;
            if (i14 % 2 == 0) {
                String str12 = iconConfig.badgeText;
                throw null;
            }
            str8 = iconConfig.badgeText;
        } else {
            str8 = str5;
        }
        boolean z2 = (i3 & 1024) != 0 ? iconConfig.isShow : z;
        if ((i3 & 2048) != 0) {
            int i15 = component1 + 9;
            int i16 = i15 % 128;
            ShareDataUIState = i16;
            if (i15 % 2 == 0) {
                Integer num10 = iconConfig.marginTop;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            Integer num11 = iconConfig.marginTop;
            int i17 = i16 + 61;
            component1 = i17 % 128;
            int i18 = i17 % 2;
            num7 = num11;
        } else {
            num7 = num4;
        }
        return iconConfig.copy(str6, str7, i9, i4, num6, str10, num8, num9, str11, str8, z2, num7, (i3 & 4096) != 0 ? iconConfig.size : num5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.url;
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.badgeText;
        int i5 = i2 + 71;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final boolean component11() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        boolean z = this.isShow;
        int i4 = i3 + 15;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 33;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component13() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.size;
        int i5 = i2 + 105;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.execute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final int component3() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 113;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.width;
        int i6 = i2 + 1;
        ShareDataUIState = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final int component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 33;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.height;
        int i6 = i2 + 21;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return i5;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component1 + 47;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.roundCorner;
        if (i3 == 0) {
            int i4 = 40 / 0;
        }
        return num;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.backgroundColor;
        int i5 = i3 + 1;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 25;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginStart;
        int i5 = i2 + 55;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component1 + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginEnd;
        }
        throw null;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 29;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.badgeStyle;
        int i4 = i2 + 17;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final IconConfig copy(String url, String execute, int width, int height, Integer roundCorner, String backgroundColor, Integer marginStart, Integer marginEnd, String badgeStyle, String badgeText, boolean isShow, Integer marginTop, Integer size) {
        int i = 2 % 2;
        IconConfig iconConfig = new IconConfig(url, execute, width, height, roundCorner, backgroundColor, marginStart, marginEnd, badgeStyle, badgeText, isShow, marginTop, size);
        int i2 = component1 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return iconConfig;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconConfig)) {
            return false;
        }
        IconConfig iconConfig = (IconConfig) other;
        if (!Intrinsics.areEqual(this.url, iconConfig.url) || !Intrinsics.areEqual(this.execute, iconConfig.execute) || this.width != iconConfig.width) {
            return false;
        }
        if (this.height != iconConfig.height) {
            int i2 = component1;
            int i3 = i2 + 49;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 97;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.roundCorner, iconConfig.roundCorner) || (!Intrinsics.areEqual(this.backgroundColor, iconConfig.backgroundColor)) || !Intrinsics.areEqual(this.marginStart, iconConfig.marginStart)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marginEnd, iconConfig.marginEnd)) {
            int i7 = ShareDataUIState + 123;
            component1 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.badgeStyle, iconConfig.badgeStyle)) {
            int i9 = component1 + 123;
            ShareDataUIState = i9 % 128;
            int i10 = i9 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.badgeText, iconConfig.badgeText)) {
            return false;
        }
        if (this.isShow != iconConfig.isShow) {
            int i11 = component1 + 13;
            ShareDataUIState = i11 % 128;
            return i11 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.marginTop, iconConfig.marginTop)) {
            return false;
        }
        if (Intrinsics.areEqual(this.size, iconConfig.size)) {
            return true;
        }
        int i12 = ShareDataUIState + 81;
        component1 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int i = 2 % 2;
        String str = this.url;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.execute;
        if (str2 == null) {
            int i2 = ShareDataUIState + 89;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        int iHashCode7 = Integer.hashCode(this.width);
        int iHashCode8 = Integer.hashCode(this.height);
        Integer num = this.roundCorner;
        if (num == null) {
            int i4 = ShareDataUIState + 61;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num.hashCode();
        }
        String str3 = this.backgroundColor;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num2 = this.marginStart;
        if (num2 == null) {
            int i6 = ShareDataUIState + 113;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num2.hashCode();
        }
        Integer num3 = this.marginEnd;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        String str4 = this.badgeStyle;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.badgeText;
        if (str5 == null) {
            int i8 = ShareDataUIState + 41;
            component1 = i8 % 128;
            int i9 = i8 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = str5.hashCode();
        }
        int iHashCode12 = Boolean.hashCode(this.isShow);
        Integer num4 = this.marginTop;
        if (num4 == null) {
            int i10 = ShareDataUIState + 11;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = num4.hashCode();
        }
        Integer num5 = this.size;
        return (((((((((((((((((((((((iHashCode6 * 31) + iHashCode) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + iHashCode5) * 31) + (num5 != null ? num5.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "IconConfig(url=" + this.url + ", execute=" + this.execute + ", width=" + this.width + ", height=" + this.height + ", roundCorner=" + this.roundCorner + ", backgroundColor=" + this.backgroundColor + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", badgeStyle=" + this.badgeStyle + ", badgeText=" + this.badgeText + ", isShow=" + this.isShow + ", marginTop=" + this.marginTop + ", size=" + this.size + ")";
        int i2 = component1 + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
