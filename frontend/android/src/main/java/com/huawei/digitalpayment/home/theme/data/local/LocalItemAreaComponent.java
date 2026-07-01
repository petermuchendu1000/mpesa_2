package com.huawei.digitalpayment.home.theme.data.local;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b<\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0019Jæ\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0003HÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001e\u0010\u0019R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b!\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0019R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b#\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b$\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b'\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b(\u0010\u0019R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b)\u0010\u0019R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b*\u0010\u0019R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b+\u0010\u0019R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b,\u0010\u0019¨\u0006G"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;", "Lcom/huawei/http/BaseResp;", "backgroundColor", "", "backgroundUrl", "", "roundCorner", "marginTop", "marginBottom", "marginStart", "marginEnd", "itemSpace", AUAttrsConstant.TV_TEXTSIZE, CdpConstants.CONTENT_TEXT_COLOR, "style", "iconWidth", "iconHeight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "verticalLineColor", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundUrl", "()Ljava/lang/String;", "getRoundCorner", "getMarginTop", "getMarginBottom", "getMarginStart", "getMarginEnd", "getItemSpace", "getTextSize", "getTextColor", "getStyle", "getIconWidth", "getIconHeight", "getPaddingTop", "getPaddingBottom", "getPaddingStart", "getPaddingEnd", "getVerticalLineColor", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/home/theme/data/local/LocalItemAreaComponent;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LocalItemAreaComponent extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final Integer backgroundColor;
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
    private final Integer textColor;
    private final Integer textSize;
    private final Integer verticalLineColor;

    /* JADX WARN: Illegal instructions before constructor call */
    public LocalItemAreaComponent(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        Integer num22;
        Integer num23;
        Integer num24;
        Integer num25;
        Integer num26;
        Integer num27 = (i & 1) != 0 ? null : num;
        String str3 = (i & 2) != 0 ? null : str;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            num17 = null;
        } else {
            num17 = num2;
        }
        Integer num28 = (i & 8) != 0 ? null : num3;
        Integer num29 = (i & 16) != 0 ? null : num4;
        if ((i & 32) != 0) {
            int i3 = component3 + 71;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            int i4 = 2 % 2;
            num18 = null;
        } else {
            num18 = num5;
        }
        if ((i & 64) != 0) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 111;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 81;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 2 % 2;
            }
            num19 = null;
        } else {
            num19 = num6;
        }
        if ((i & 128) != 0) {
            int i10 = ShareDataUIState + 103;
            component3 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            num20 = null;
        } else {
            num20 = num7;
        }
        Integer num30 = (i & 256) != 0 ? null : num8;
        Integer num31 = (i & 512) != 0 ? null : num9;
        String str4 = (i & 1024) != 0 ? null : str2;
        if ((i & 2048) != 0) {
            int i11 = ShareDataUIState + 89;
            component3 = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 2 % 2;
            }
            num21 = null;
        } else {
            num21 = num10;
        }
        Integer num32 = (i & 4096) != 0 ? null : num11;
        Integer num33 = (i & 8192) != 0 ? null : num12;
        Integer num34 = (i & 16384) != 0 ? null : num13;
        if ((i & 32768) != 0) {
            num23 = num34;
            int i13 = component3 + 97;
            num22 = num33;
            ShareDataUIState = i13 % 128;
            int i14 = i13 % 2;
            int i15 = 2 % 2;
            num24 = null;
        } else {
            num22 = num33;
            num23 = num34;
            num24 = num14;
        }
        Integer num35 = (65536 & i) != 0 ? null : num15;
        if ((i & 131072) != 0) {
            int i16 = ShareDataUIState + 65;
            num25 = num35;
            component3 = i16 % 128;
            int i17 = i16 % 2;
            num26 = null;
        } else {
            num25 = num35;
            num26 = num16;
        }
        this(num27, str3, num17, num28, num29, num18, num19, num20, num30, num31, str4, num21, num32, num22, num23, num24, num25, num26);
    }

    public final Integer getBackgroundColor() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.backgroundColor;
        }
        throw null;
    }

    public final String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 39;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundUrl;
        int i5 = i2 + 35;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 11;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.roundCorner;
        int i4 = i3 + 117;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 93;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginTop;
        int i5 = i2 + 93;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginBottom() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.marginBottom;
        if (i3 == 0) {
            int i4 = 66 / 0;
        }
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 9;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getMarginEnd() {
        int i = 2 % 2;
        int i2 = component3 + 79;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.marginEnd;
        int i4 = i3 + 91;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getItemSpace() {
        int i = 2 % 2;
        int i2 = component3 + 21;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.itemSpace;
        int i5 = i3 + 61;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.textSize;
        int i4 = i2 + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getTextColor() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3 + 105;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            num = this.textColor;
            int i4 = 46 / 0;
        } else {
            num = this.textColor;
        }
        int i5 = i3 + 35;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getStyle() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.style;
        int i5 = i2 + 45;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getIconWidth() {
        int i = 2 % 2;
        int i2 = component3 + 83;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getIconHeight() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.iconHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getPaddingTop() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paddingTop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getPaddingBottom() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingBottom;
        int i5 = i3 + 57;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getPaddingStart() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.paddingStart;
        }
        throw null;
    }

    public final Integer getPaddingEnd() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 23;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingEnd;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getVerticalLineColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.verticalLineColor;
        int i4 = i2 + 105;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public LocalItemAreaComponent(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.backgroundColor = num;
        this.backgroundUrl = str;
        this.roundCorner = num2;
        this.marginTop = num3;
        this.marginBottom = num4;
        this.marginStart = num5;
        this.marginEnd = num6;
        this.itemSpace = num7;
        this.textSize = num8;
        this.textColor = num9;
        this.style = str2;
        this.iconWidth = num10;
        this.iconHeight = num11;
        this.paddingTop = num12;
        this.paddingBottom = num13;
        this.paddingStart = num14;
        this.paddingEnd = num15;
        this.verticalLineColor = num16;
    }

    public LocalItemAreaComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static LocalItemAreaComponent copy$default(LocalItemAreaComponent localItemAreaComponent, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, String str2, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, int i, Object obj) {
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        Integer num22;
        Integer num23;
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = component3 + 55;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            num17 = localItemAreaComponent.backgroundColor;
        } else {
            num17 = num;
        }
        String str3 = (i & 2) != 0 ? localItemAreaComponent.backgroundUrl : str;
        Integer num24 = (i & 4) != 0 ? localItemAreaComponent.roundCorner : num2;
        if ((i & 8) != 0) {
            int i5 = ShareDataUIState + 77;
            component3 = i5 % 128;
            if (i5 % 2 == 0) {
                num18 = localItemAreaComponent.marginTop;
                int i6 = 65 / 0;
            } else {
                num18 = localItemAreaComponent.marginTop;
            }
        } else {
            num18 = num3;
        }
        Integer num25 = (i & 16) != 0 ? localItemAreaComponent.marginBottom : num4;
        Integer num26 = (i & 32) != 0 ? localItemAreaComponent.marginStart : num5;
        if ((i & 64) != 0) {
            int i7 = component3 + 33;
            int i8 = i7 % 128;
            ShareDataUIState = i8;
            if (i7 % 2 != 0) {
                Integer num27 = localItemAreaComponent.marginEnd;
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            num19 = localItemAreaComponent.marginEnd;
            int i9 = i8 + 9;
            component3 = i9 % 128;
            int i10 = i9 % 2;
        } else {
            num19 = num6;
        }
        Integer num28 = (i & 128) != 0 ? localItemAreaComponent.itemSpace : num7;
        if ((i & 256) != 0) {
            int i11 = component3 + 37;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            num20 = localItemAreaComponent.textSize;
        } else {
            num20 = num8;
        }
        if ((i & 512) != 0) {
            int i13 = ShareDataUIState + 91;
            component3 = i13 % 128;
            if (i13 % 2 == 0) {
                num21 = localItemAreaComponent.textColor;
                int i14 = 8 / 0;
            } else {
                num21 = localItemAreaComponent.textColor;
            }
        } else {
            num21 = num9;
        }
        String str4 = (i & 1024) != 0 ? localItemAreaComponent.style : str2;
        Integer num29 = (i & 2048) != 0 ? localItemAreaComponent.iconWidth : num10;
        Integer num30 = (i & 4096) != 0 ? localItemAreaComponent.iconHeight : num11;
        if ((i & 8192) != 0) {
            Integer num31 = localItemAreaComponent.paddingTop;
            int i15 = component3 + 49;
            num22 = num30;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            num23 = num31;
        } else {
            num22 = num30;
            num23 = num12;
        }
        return localItemAreaComponent.copy(num17, str3, num24, num18, num25, num26, num19, num28, num20, num21, str4, num29, num22, num23, (i & 16384) != 0 ? localItemAreaComponent.paddingBottom : num13, (i & 32768) != 0 ? localItemAreaComponent.paddingStart : num14, (i & 65536) != 0 ? localItemAreaComponent.paddingEnd : num15, (i & 131072) != 0 ? localItemAreaComponent.verticalLineColor : num16);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.backgroundColor;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = component3 + 107;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.textColor;
        int i5 = i3 + 101;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 12 / 0;
        }
        return num;
    }

    public final String component11() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            str = this.style;
            int i4 = 10 / 0;
        } else {
            str = this.style;
        }
        int i5 = i2 + 17;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 41 / 0;
        }
        return str;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.iconWidth;
        int i4 = i2 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component13() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.iconHeight;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component14() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 123;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.paddingTop;
        int i5 = i2 + 29;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component15() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.paddingBottom;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return num;
    }

    public final Integer component16() {
        int i = 2 % 2;
        int i2 = component3 + 55;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.paddingStart;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component17() {
        Integer num;
        int i = 2 % 2;
        int i2 = component3 + 71;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            num = this.paddingEnd;
            int i4 = 76 / 0;
        } else {
            num = this.paddingEnd;
        }
        int i5 = i3 + 25;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 94 / 0;
        }
        return num;
    }

    public final Integer component18() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 107;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.verticalLineColor;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3 + 5;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            str = this.backgroundUrl;
            int i4 = 48 / 0;
        } else {
            str = this.backgroundUrl;
        }
        int i5 = i3 + 73;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 77;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.roundCorner;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.marginTop;
        int i4 = i2 + 17;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginBottom;
        }
        throw null;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 67;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Integer num = this.marginStart;
        int i4 = i2 + 89;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component7() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 55;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            num = this.marginEnd;
            int i4 = 78 / 0;
        } else {
            num = this.marginEnd;
        }
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.itemSpace;
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
        return num;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 37;
        component3 = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        Integer num = this.textSize;
        int i4 = i2 + 107;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final LocalItemAreaComponent copy(Integer backgroundColor, String backgroundUrl, Integer roundCorner, Integer marginTop, Integer marginBottom, Integer marginStart, Integer marginEnd, Integer itemSpace, Integer textSize, Integer textColor, String style, Integer iconWidth, Integer iconHeight, Integer paddingTop, Integer paddingBottom, Integer paddingStart, Integer paddingEnd, Integer verticalLineColor) {
        int i = 2 % 2;
        LocalItemAreaComponent localItemAreaComponent = new LocalItemAreaComponent(backgroundColor, backgroundUrl, roundCorner, marginTop, marginBottom, marginStart, marginEnd, itemSpace, textSize, textColor, style, iconWidth, iconHeight, paddingTop, paddingBottom, paddingStart, paddingEnd, verticalLineColor);
        int i2 = component3 + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return localItemAreaComponent;
        }
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 19;
            component3 = i2 % 128;
            return i2 % 2 != 0;
        }
        if (!(other instanceof LocalItemAreaComponent)) {
            return false;
        }
        LocalItemAreaComponent localItemAreaComponent = (LocalItemAreaComponent) other;
        if (!Intrinsics.areEqual(this.backgroundColor, localItemAreaComponent.backgroundColor)) {
            int i3 = ShareDataUIState + 113;
            component3 = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.backgroundUrl, localItemAreaComponent.backgroundUrl)) {
            int i4 = component3 + 101;
            ShareDataUIState = i4 % 128;
            return i4 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.roundCorner, localItemAreaComponent.roundCorner)) {
            int i5 = component3 + 111;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marginTop, localItemAreaComponent.marginTop) || !Intrinsics.areEqual(this.marginBottom, localItemAreaComponent.marginBottom) || !Intrinsics.areEqual(this.marginStart, localItemAreaComponent.marginStart) || !Intrinsics.areEqual(this.marginEnd, localItemAreaComponent.marginEnd)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.itemSpace, localItemAreaComponent.itemSpace)) {
            int i7 = ShareDataUIState + 13;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textSize, localItemAreaComponent.textSize)) {
            int i9 = ShareDataUIState + 99;
            component3 = i9 % 128;
            return i9 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.textColor, localItemAreaComponent.textColor)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.style, localItemAreaComponent.style)) {
            int i10 = component3 + 121;
            ShareDataUIState = i10 % 128;
            return i10 % 2 != 0;
        }
        if (!Intrinsics.areEqual(this.iconWidth, localItemAreaComponent.iconWidth) || !Intrinsics.areEqual(this.iconHeight, localItemAreaComponent.iconHeight) || !Intrinsics.areEqual(this.paddingTop, localItemAreaComponent.paddingTop)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingBottom, localItemAreaComponent.paddingBottom)) {
            int i11 = component3 + 1;
            ShareDataUIState = i11 % 128;
            int i12 = i11 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.paddingStart, localItemAreaComponent.paddingStart)) {
            return false;
        }
        if (Intrinsics.areEqual(this.paddingEnd, localItemAreaComponent.paddingEnd)) {
            return Intrinsics.areEqual(this.verticalLineColor, localItemAreaComponent.verticalLineColor);
        }
        int i13 = component3 + 99;
        ShareDataUIState = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i;
        int iHashCode5;
        int i2;
        int iHashCode6;
        int i3 = 2 % 2;
        Integer num = this.backgroundColor;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        String str = this.backgroundUrl;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        Integer num2 = this.roundCorner;
        if (num2 == null) {
            int i4 = component3 + 65;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = 0;
        } else {
            iHashCode = num2.hashCode();
        }
        Integer num3 = this.marginTop;
        if (num3 == null) {
            iHashCode2 = 0;
        } else {
            iHashCode2 = num3.hashCode();
            int i6 = component3 + 83;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
        }
        Integer num4 = this.marginBottom;
        int iHashCode9 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.marginStart;
        if (num5 == null) {
            int i8 = ShareDataUIState;
            int i9 = i8 + 77;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 49;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num5.hashCode();
        }
        Integer num6 = this.marginEnd;
        int iHashCode10 = num6 == null ? 0 : num6.hashCode();
        Integer num7 = this.itemSpace;
        int iHashCode11 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.textSize;
        int iHashCode12 = num8 == null ? 0 : num8.hashCode();
        Integer num9 = this.textColor;
        int iHashCode13 = num9 == null ? 0 : num9.hashCode();
        String str2 = this.style;
        int iHashCode14 = str2 == null ? 0 : str2.hashCode();
        Integer num10 = this.iconWidth;
        int iHashCode15 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.iconHeight;
        if (num11 == null) {
            int i13 = ShareDataUIState + 71;
            component3 = i13 % 128;
            int i14 = i13 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num11.hashCode();
        }
        Integer num12 = this.paddingTop;
        int iHashCode16 = num12 == null ? 0 : num12.hashCode();
        Integer num13 = this.paddingBottom;
        if (num13 == null) {
            int i15 = component3 + 111;
            i = iHashCode16;
            ShareDataUIState = i15 % 128;
            int i16 = i15 % 2;
            iHashCode5 = 0;
        } else {
            i = iHashCode16;
            iHashCode5 = num13.hashCode();
        }
        Integer num14 = this.paddingStart;
        if (num14 == null) {
            int i17 = ShareDataUIState + 23;
            i2 = iHashCode5;
            component3 = i17 % 128;
            int i18 = i17 % 2;
            iHashCode6 = 0;
        } else {
            i2 = iHashCode5;
            iHashCode6 = num14.hashCode();
        }
        Integer num15 = this.paddingEnd;
        int iHashCode17 = num15 == null ? 0 : num15.hashCode();
        Integer num16 = this.verticalLineColor;
        return (((((((((((((((((((((((((((((((((iHashCode7 * 31) + iHashCode8) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode3) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode4) * 31) + i) * 31) + i2) * 31) + iHashCode6) * 31) + iHashCode17) * 31) + (num16 == null ? 0 : num16.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "LocalItemAreaComponent(backgroundColor=" + this.backgroundColor + ", backgroundUrl=" + this.backgroundUrl + ", roundCorner=" + this.roundCorner + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", itemSpace=" + this.itemSpace + ", textSize=" + this.textSize + ", textColor=" + this.textColor + ", style=" + this.style + ", iconWidth=" + this.iconWidth + ", iconHeight=" + this.iconHeight + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", verticalLineColor=" + this.verticalLineColor + ")";
        int i2 = component3 + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }
}
