package com.huawei.digitalpayment.home.theme.data.remote;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b;\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00101\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jæ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0006HÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001f\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001cR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001cR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b*\u0010\u001cR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001cR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019¨\u0006G"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;", "Lcom/huawei/http/BaseResp;", "backgroundColor", "", "backgroundUrl", "roundCorner", "", "marginTop", "marginBottom", "marginStart", "marginEnd", "itemSpace", AUAttrsConstant.TV_TEXTSIZE, CdpConstants.CONTENT_TEXT_COLOR, "style", "iconWidth", "iconHeight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "verticalLineColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getBackgroundColor", "()Ljava/lang/String;", "getBackgroundUrl", "getRoundCorner", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMarginTop", "getMarginBottom", "getMarginStart", "getMarginEnd", "getItemSpace", "getTextSize", "getTextColor", "getStyle", "getIconWidth", "getIconHeight", "getPaddingTop", "getPaddingBottom", "getPaddingStart", "getPaddingEnd", "getVerticalLineColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/huawei/digitalpayment/home/theme/data/remote/RemoteItemAreaComponent;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteItemAreaComponent extends BaseResp {
    private static int component1 = 0;
    private static int component3 = 1;
    private final String backgroundColor;
    private final String backgroundUrl;
    private final Integer iconHeight;
    private final Integer iconWidth;
    private final Integer itemSpace;
    private final Integer marginBottom;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer marginTop;
    private final Integer paddingBottom;
    private final Integer paddingEnd;
    private final Integer paddingStart;
    private final Integer paddingTop;
    private final Integer roundCorner;
    private final String style;
    private final String textColor;
    private final Integer textSize;
    private final String verticalLineColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteItemAreaComponent(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str3, String str4, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str6;
        String str7;
        Integer num14;
        String str8;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        String str9;
        if ((i & 1) != 0) {
            int i2 = component3 + 99;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i & 2) != 0) {
            int i4 = 2 % 2;
            str7 = null;
        } else {
            str7 = str2;
        }
        Integer num19 = (i & 4) != 0 ? null : num;
        Integer num20 = (i & 8) != 0 ? null : num2;
        Integer num21 = (i & 16) != 0 ? null : num3;
        if ((i & 32) != 0) {
            int i5 = 2 % 2;
            num14 = null;
        } else {
            num14 = num4;
        }
        Integer num22 = (i & 64) != 0 ? null : num5;
        Integer num23 = (i & 128) != 0 ? null : num6;
        Integer num24 = (i & 256) != 0 ? null : num7;
        if ((i & 512) != 0) {
            int i6 = component3 + 123;
            component1 = i6 % 128;
            int i7 = i6 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        String str10 = (i & 1024) != 0 ? null : str4;
        Integer num25 = (i & 2048) != 0 ? null : num8;
        if ((i & 4096) != 0) {
            int i8 = component1 + 35;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            num15 = null;
        } else {
            num15 = num9;
        }
        if ((i & 8192) != 0) {
            int i10 = component1 + 79;
            num16 = num15;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 2 % 2;
            num17 = null;
        } else {
            num16 = num15;
            num17 = num10;
        }
        Integer num26 = (i & 16384) != 0 ? null : num11;
        Integer num27 = (i & 32768) != 0 ? null : num12;
        Integer num28 = (i & 65536) != 0 ? null : num13;
        if ((i & 131072) != 0) {
            int i13 = component1 + 97;
            num18 = num26;
            component3 = i13 % 128;
            if (i13 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            str9 = null;
        } else {
            num18 = num26;
            str9 = str5;
        }
        this(str6, str7, num19, num20, num21, num14, num22, num23, num24, str8, str10, num25, num16, num17, num18, num27, num28, str9);
    }

    public final String getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component1 + 23;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.backgroundColor;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.backgroundUrl;
        if (i3 == 0) {
            int i4 = 83 / 0;
        }
        return str;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 125;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCorner;
        int i5 = i2 + 123;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginTop() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 19;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            num = this.marginTop;
            int i4 = 92 / 0;
        } else {
            num = this.marginTop;
        }
        int i5 = i2 + 25;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getMarginBottom() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.marginBottom;
        int i5 = i3 + 89;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.marginStart;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
        return num;
    }

    public final Integer getMarginEnd() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1 + 85;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.marginEnd;
            int i4 = 19 / 0;
        } else {
            num = this.marginEnd;
        }
        int i5 = i3 + 77;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getItemSpace() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.itemSpace;
        int i5 = i3 + 53;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = component1 + 125;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 115;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String getTextColor() {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.textColor;
        if (i3 != 0) {
            int i4 = 61 / 0;
        }
        return str;
    }

    public final String getStyle() {
        int i = 2 % 2;
        int i2 = component1 + 21;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.style;
        int i5 = i3 + 107;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 73 / 0;
        }
        return str;
    }

    public final Integer getIconWidth() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 79;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.iconWidth;
        int i5 = i2 + 77;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getIconHeight() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.iconHeight;
        int i4 = i3 + 37;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getPaddingTop() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 85;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.paddingTop;
        int i4 = i2 + 63;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getPaddingBottom() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.paddingBottom;
        int i4 = i3 + 53;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getPaddingStart() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingStart;
        int i5 = i3 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getPaddingEnd() {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.paddingEnd;
        int i4 = i3 + 91;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
        return num;
    }

    public final String getVerticalLineColor() {
        int i = 2 % 2;
        int i2 = component1 + 115;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        String str = this.verticalLineColor;
        int i5 = i3 + 21;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public RemoteItemAreaComponent(String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str3, String str4, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, String str5) {
        this.backgroundColor = str;
        this.backgroundUrl = str2;
        this.roundCorner = num;
        this.marginTop = num2;
        this.marginBottom = num3;
        this.marginStart = num4;
        this.marginEnd = num5;
        this.itemSpace = num6;
        this.textSize = num7;
        this.textColor = str3;
        this.style = str4;
        this.iconWidth = num8;
        this.iconHeight = num9;
        this.paddingTop = num10;
        this.paddingBottom = num11;
        this.paddingStart = num12;
        this.paddingEnd = num13;
        this.verticalLineColor = str5;
    }

    public RemoteItemAreaComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static RemoteItemAreaComponent copy$default(RemoteItemAreaComponent remoteItemAreaComponent, String str, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, String str3, String str4, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, String str5, int i, Object obj) {
        Integer num14;
        String str6;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        int i2 = 2 % 2;
        int i3 = component1 + 63;
        int i4 = i3 % 128;
        component3 = i4;
        String str7 = (i3 % 2 == 0 || (i & 1) == 0) ? str : remoteItemAreaComponent.backgroundColor;
        String str8 = (i & 2) != 0 ? remoteItemAreaComponent.backgroundUrl : str2;
        Integer num22 = (i & 4) != 0 ? remoteItemAreaComponent.roundCorner : num;
        Integer num23 = (i & 8) != 0 ? remoteItemAreaComponent.marginTop : num2;
        Integer num24 = (i & 16) != 0 ? remoteItemAreaComponent.marginBottom : num3;
        Integer num25 = (i & 32) != 0 ? remoteItemAreaComponent.marginStart : num4;
        Integer num26 = (i & 64) != 0 ? remoteItemAreaComponent.marginEnd : num5;
        Integer num27 = (i & 128) != 0 ? remoteItemAreaComponent.itemSpace : num6;
        if ((i & 256) != 0) {
            int i5 = i4 + 11;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            num14 = remoteItemAreaComponent.textSize;
        } else {
            num14 = num7;
        }
        if ((i & 512) != 0) {
            int i7 = i4 + 83;
            component1 = i7 % 128;
            if (i7 % 2 != 0) {
                String str9 = remoteItemAreaComponent.textColor;
                throw null;
            }
            str6 = remoteItemAreaComponent.textColor;
        } else {
            str6 = str3;
        }
        String str10 = (i & 1024) != 0 ? remoteItemAreaComponent.style : str4;
        Integer num28 = (i & 2048) != 0 ? remoteItemAreaComponent.iconWidth : num8;
        if ((i & 4096) != 0) {
            int i8 = component1 + 125;
            num15 = num28;
            component3 = i8 % 128;
            int i9 = i8 % 2;
            num16 = remoteItemAreaComponent.iconHeight;
        } else {
            num15 = num28;
            num16 = num9;
        }
        Integer num29 = (i & 8192) != 0 ? remoteItemAreaComponent.paddingTop : num10;
        Integer num30 = (i & 16384) != 0 ? remoteItemAreaComponent.paddingBottom : num11;
        if ((i & 32768) != 0) {
            num17 = num30;
            int i10 = component3 + 25;
            num18 = num29;
            component1 = i10 % 128;
            int i11 = i10 % 2;
            num19 = remoteItemAreaComponent.paddingStart;
        } else {
            num17 = num30;
            num18 = num29;
            num19 = num12;
        }
        if ((65536 & i) != 0) {
            int i12 = component1 + 45;
            num20 = num19;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            num21 = remoteItemAreaComponent.paddingEnd;
        } else {
            num20 = num19;
            num21 = num13;
        }
        return remoteItemAreaComponent.copy(str7, str8, num22, num23, num24, num25, num26, num27, num14, str6, str10, num15, num16, num18, num17, num20, num21, (i & 131072) != 0 ? remoteItemAreaComponent.verticalLineColor : str5);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.backgroundColor;
        int i4 = i3 + 9;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        String str = this.textColor;
        int i5 = i3 + 93;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.style;
        }
        throw null;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 109;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.iconWidth;
        int i5 = i2 + 17;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
        return num;
    }

    public final Integer component13() {
        Integer num;
        int i = 2 % 2;
        int i2 = component1 + 101;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.iconHeight;
            int i4 = 36 / 0;
        } else {
            num = this.iconHeight;
        }
        int i5 = i3 + 25;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingTop;
        int i5 = i2 + 97;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 64 / 0;
        }
        return num;
    }

    public final Integer component15() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 13;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingBottom;
        int i5 = i2 + 95;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return num;
    }

    public final Integer component16() {
        int i = 2 % 2;
        int i2 = component1 + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paddingStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component17() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingEnd;
        int i5 = i3 + 87;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component18() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.verticalLineColor;
            int i4 = 51 / 0;
        } else {
            str = this.verticalLineColor;
        }
        int i5 = i2 + 101;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 27;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.backgroundUrl;
            int i4 = 83 / 0;
        } else {
            str = this.backgroundUrl;
        }
        int i5 = i2 + 37;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = component3 + 99;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Integer num = this.roundCorner;
        int i5 = i3 + 9;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 57;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 59;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return num;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginBottom;
        }
        throw null;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginStart;
        int i5 = i2 + 73;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        component1 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.marginEnd;
        int i4 = i3 + 35;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 31 / 0;
        }
        return num;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component3 + 41;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.itemSpace;
        if (i3 != 0) {
            int i4 = 1 / 0;
        }
        return num;
    }

    public final Integer component9() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 3;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.textSize;
            int i4 = 55 / 0;
        } else {
            num = this.textSize;
        }
        int i5 = i2 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final RemoteItemAreaComponent copy(String backgroundColor, String backgroundUrl, Integer roundCorner, Integer marginTop, Integer marginBottom, Integer marginStart, Integer marginEnd, Integer itemSpace, Integer textSize, String textColor, String style, Integer iconWidth, Integer iconHeight, Integer paddingTop, Integer paddingBottom, Integer paddingStart, Integer paddingEnd, String verticalLineColor) {
        int i = 2 % 2;
        RemoteItemAreaComponent remoteItemAreaComponent = new RemoteItemAreaComponent(backgroundColor, backgroundUrl, roundCorner, marginTop, marginBottom, marginStart, marginEnd, itemSpace, textSize, textColor, style, iconWidth, iconHeight, paddingTop, paddingBottom, paddingStart, paddingEnd, verticalLineColor);
        int i2 = component1 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return remoteItemAreaComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        if (this == other) {
            int i5 = i3 + 91;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof RemoteItemAreaComponent)) {
            return false;
        }
        RemoteItemAreaComponent remoteItemAreaComponent = (RemoteItemAreaComponent) other;
        if (!Intrinsics.areEqual(this.backgroundColor, remoteItemAreaComponent.backgroundColor) || !Intrinsics.areEqual(this.backgroundUrl, remoteItemAreaComponent.backgroundUrl) || !Intrinsics.areEqual(this.roundCorner, remoteItemAreaComponent.roundCorner)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.marginTop, remoteItemAreaComponent.marginTop)) {
            int i7 = component3 + 35;
            component1 = i7 % 128;
            if (i7 % 2 == 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (!Intrinsics.areEqual(this.marginBottom, remoteItemAreaComponent.marginBottom) || !Intrinsics.areEqual(this.marginStart, remoteItemAreaComponent.marginStart) || !Intrinsics.areEqual(this.marginEnd, remoteItemAreaComponent.marginEnd) || !Intrinsics.areEqual(this.itemSpace, remoteItemAreaComponent.itemSpace)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.textSize, remoteItemAreaComponent.textSize)) {
            int i8 = component3;
            int i9 = i8 + 55;
            component1 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 61;
            component1 = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textColor, remoteItemAreaComponent.textColor) || !Intrinsics.areEqual(this.style, remoteItemAreaComponent.style) || !Intrinsics.areEqual(this.iconWidth, remoteItemAreaComponent.iconWidth)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.iconHeight, remoteItemAreaComponent.iconHeight)) {
            int i13 = component3 + 83;
            component1 = i13 % 128;
            int i14 = i13 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingTop, remoteItemAreaComponent.paddingTop)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingBottom, remoteItemAreaComponent.paddingBottom)) {
            int i15 = component3 + 21;
            component1 = i15 % 128;
            int i16 = i15 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingStart, remoteItemAreaComponent.paddingStart)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingEnd, remoteItemAreaComponent.paddingEnd)) {
            int i17 = component1 + 21;
            component3 = i17 % 128;
            return i17 % 2 == 0;
        }
        if (Intrinsics.areEqual(this.verticalLineColor, remoteItemAreaComponent.verticalLineColor)) {
            return true;
        }
        int i18 = component1 + 115;
        component3 = i18 % 128;
        int i19 = i18 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        int iHashCode6;
        int iHashCode7;
        int i;
        int iHashCode8;
        int i2;
        int iHashCode9;
        int i3 = 2 % 2;
        String str = this.backgroundColor;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.backgroundUrl;
        if (str2 == null) {
            int i4 = component3 + 81;
            component1 = i4 % 128;
            iHashCode = i4 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode = str2.hashCode();
        }
        Integer num = this.roundCorner;
        int iHashCode11 = num == null ? 0 : num.hashCode();
        Integer num2 = this.marginTop;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.marginBottom;
        if (num3 == null) {
            int i5 = component3 + 73;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num3.hashCode();
        }
        Integer num4 = this.marginStart;
        if (num4 == null) {
            int i7 = component1 + 43;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num4.hashCode();
        }
        Integer num5 = this.marginEnd;
        int iHashCode13 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.itemSpace;
        if (num6 == null) {
            int i9 = component1 + 43;
            component3 = i9 % 128;
            iHashCode4 = i9 % 2 == 0 ? 1 : 0;
        } else {
            iHashCode4 = num6.hashCode();
        }
        Integer num7 = this.textSize;
        int iHashCode14 = num7 == null ? 0 : num7.hashCode();
        String str3 = this.textColor;
        if (str3 == null) {
            int i10 = component1 + 103;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            iHashCode5 = 0;
        } else {
            iHashCode5 = str3.hashCode();
        }
        String str4 = this.style;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        Integer num8 = this.iconWidth;
        if (num8 == null) {
            int i12 = component1 + 111;
            component3 = i12 % 128;
            int i13 = i12 % 2;
            iHashCode6 = 0;
        } else {
            iHashCode6 = num8.hashCode();
        }
        Integer num9 = this.iconHeight;
        if (num9 == null) {
            int i14 = component1 + 59;
            component3 = i14 % 128;
            int i15 = i14 % 2;
            iHashCode7 = 0;
        } else {
            iHashCode7 = num9.hashCode();
        }
        Integer num10 = this.paddingTop;
        int iHashCode16 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.paddingBottom;
        if (num11 == null) {
            int i16 = component1 + 79;
            i = iHashCode16;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            iHashCode8 = 0;
        } else {
            i = iHashCode16;
            iHashCode8 = num11.hashCode();
        }
        Integer num12 = this.paddingStart;
        int iHashCode17 = num12 == null ? 0 : num12.hashCode();
        Integer num13 = this.paddingEnd;
        if (num13 == null) {
            int i18 = component3 + 113;
            i2 = iHashCode8;
            component1 = i18 % 128;
            iHashCode9 = i18 % 2 != 0 ? 1 : 0;
        } else {
            i2 = iHashCode8;
            iHashCode9 = num13.hashCode();
        }
        String str5 = this.verticalLineColor;
        return (((((((((((((((((((((((((((((((((iHashCode10 * 31) + iHashCode) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode13) * 31) + iHashCode4) * 31) + iHashCode14) * 31) + iHashCode5) * 31) + iHashCode15) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + i) * 31) + i2) * 31) + iHashCode17) * 31) + iHashCode9) * 31) + (str5 == null ? 0 : str5.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "RemoteItemAreaComponent(backgroundColor=" + this.backgroundColor + ", backgroundUrl=" + this.backgroundUrl + ", roundCorner=" + this.roundCorner + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", itemSpace=" + this.itemSpace + ", textSize=" + this.textSize + ", textColor=" + this.textColor + ", style=" + this.style + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", verticalLineColor=" + this.verticalLineColor + ")";
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
