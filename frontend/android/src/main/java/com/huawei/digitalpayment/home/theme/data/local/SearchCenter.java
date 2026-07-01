package com.huawei.digitalpayment.home.theme.data.local;

import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.http.BaseResp;
import com.iap.ac.android.region.cdp.util.CdpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010?\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJþ\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020J2\b\u0010K\u001a\u0004\u0018\u00010LHÖ\u0003J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\t\u0010N\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b!\u0010\u001cR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\"\u0010\u001cR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b#\u0010\u001cR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b$\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b%\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b&\u0010\u001cR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001cR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001cR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b-\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b/\u0010\u001cR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b0\u0010\u001cR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b1\u0010\u001cR\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b2\u0010\u001c¨\u0006O"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;", "Lcom/huawei/http/BaseResp;", "backgroundColor", "", "backgroundUrl", "", "roundCorner", "marginTop", "marginBottom", "marginStart", "marginEnd", "width", "height", CdpConstants.CONTENT_TEXT_COLOR, "strokeWidth", "strokeColor", "icon", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "text", AUAttrsConstant.TV_TEXTSIZE, KeysConstants.KEY_EXECUTE, "type", "avatarWidth", "avatarHeight", "avatarRound", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundUrl", "()Ljava/lang/String;", "getRoundCorner", "getMarginTop", "getMarginBottom", "getMarginStart", "getMarginEnd", "getWidth", "getHeight", "getTextColor", "getStrokeWidth", "getStrokeColor", "getIcon", "()Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;", "getText", "getTextSize", "getExecute", "getType", "getAvatarWidth", "getAvatarHeight", "getAvatarRound", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/huawei/digitalpayment/home/theme/data/local/LocalIconConfig;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/home/theme/data/local/SearchCenter;", "equals", "", "other", "", "hashCode", "toString", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SearchCenter extends BaseResp {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Integer avatarHeight;
    private final Integer avatarRound;
    private final Integer avatarWidth;
    private final Integer backgroundColor;
    private final String backgroundUrl;
    private final String execute;
    private final Integer height;
    private final LocalIconConfig icon;
    private final Integer marginBottom;
    private final Integer marginEnd;
    private final Integer marginStart;
    private final Integer marginTop;
    private final Integer roundCorner;
    private final Integer strokeColor;
    private final Integer strokeWidth;
    private final String text;
    private final Integer textColor;
    private final Integer textSize;
    private final Integer type;
    private final Integer width;

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchCenter(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, LocalIconConfig localIconConfig, String str2, Integer num12, String str3, Integer num13, Integer num14, Integer num15, Integer num16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        Integer num17;
        Integer num18;
        Integer num19;
        Integer num20;
        LocalIconConfig localIconConfig2;
        String str5;
        String str6;
        Integer num21;
        String str7;
        Integer num22;
        Integer num23;
        Integer num24;
        Integer num25;
        Integer num26 = (i & 1) != 0 ? null : num;
        if ((i & 2) != 0) {
            int i2 = copydefault + 15;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = 2 % 2;
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            int i4 = 2 % 2;
            num17 = null;
        } else {
            num17 = num2;
        }
        Integer num27 = (i & 8) != 0 ? null : num3;
        Integer num28 = (i & 16) != 0 ? null : num4;
        if ((i & 32) != 0) {
            int i5 = 2 % 2;
            num18 = null;
        } else {
            num18 = num5;
        }
        if ((i & 64) != 0) {
            int i6 = ShareDataUIState + 117;
            int i7 = i6 % 128;
            copydefault = i7;
            if (i6 % 2 == 0) {
                throw null;
            }
            int i8 = i7 + 33;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            num19 = null;
        } else {
            num19 = num6;
        }
        Integer num29 = (i & 128) != 0 ? null : num7;
        if ((i & 256) != 0) {
            int i11 = copydefault + 3;
            ShareDataUIState = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
            num20 = null;
        } else {
            num20 = num8;
        }
        Integer num30 = (i & 512) != 0 ? null : num9;
        Integer num31 = (i & 1024) != 0 ? null : num10;
        Integer num32 = (i & 2048) != 0 ? null : num11;
        LocalIconConfig localIconConfig3 = (i & 4096) != 0 ? null : localIconConfig;
        if ((i & 8192) != 0) {
            int i12 = copydefault + 73;
            localIconConfig2 = localIconConfig3;
            ShareDataUIState = i12 % 128;
            if (i12 % 2 != 0) {
                int i13 = 22 / 0;
            }
            int i14 = 2 % 2;
            str5 = null;
        } else {
            localIconConfig2 = localIconConfig3;
            str5 = str2;
        }
        if ((i & 16384) != 0) {
            int i15 = copydefault + 91;
            str6 = str5;
            ShareDataUIState = i15 % 128;
            num21 = null;
            if (i15 % 2 != 0) {
                num21.hashCode();
                throw null;
            }
        } else {
            str6 = str5;
            num21 = num12;
        }
        String str8 = (32768 & i) != 0 ? "" : str3;
        Integer num33 = (i & 65536) != 0 ? null : num13;
        if ((i & 131072) != 0) {
            int i16 = copydefault + 119;
            str7 = str8;
            ShareDataUIState = i16 % 128;
            int i17 = i16 % 2;
            num22 = null;
        } else {
            str7 = str8;
            num22 = num14;
        }
        if ((262144 & i) != 0) {
            int i18 = copydefault + 63;
            num23 = num22;
            ShareDataUIState = i18 % 128;
            num24 = null;
            if (i18 % 2 != 0) {
                throw null;
            }
            num25 = null;
        } else {
            num23 = num22;
            num24 = null;
            num25 = num15;
        }
        this(num26, str4, num17, num27, num28, num18, num19, num29, num20, num30, num31, num32, localIconConfig2, str6, num21, str7, num33, num23, num25, (i & 524288) == 0 ? num16 : num24);
    }

    public final Integer getBackgroundColor() {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.backgroundColor;
        int i5 = i3 + 97;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final String getBackgroundUrl() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 9;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.backgroundUrl;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer getRoundCorner() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.roundCorner;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return num;
    }

    public final Integer getMarginTop() {
        int i = 2 % 2;
        int i2 = copydefault + 17;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.marginTop;
        int i5 = i3 + 13;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginBottom() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.marginBottom;
        int i4 = i3 + 31;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer getMarginStart() {
        int i = 2 % 2;
        int i2 = copydefault + 47;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.marginStart;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getMarginEnd() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 121;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginEnd;
        int i5 = i2 + 47;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getWidth() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 3;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 35;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getHeight() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.height;
        int i5 = i3 + 45;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getTextColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.textColor;
        }
        throw null;
    }

    public final Integer getStrokeWidth() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.strokeWidth;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer getStrokeColor() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.strokeColor;
        int i5 = i3 + 63;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalIconConfig getIcon() {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        LocalIconConfig localIconConfig = this.icon;
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        return localIconConfig;
    }

    public final String getText() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.text;
        int i4 = i3 + 119;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer getTextSize() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 63;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.textSize;
        int i5 = i2 + 83;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getExecute() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.execute;
        int i5 = i2 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return str;
    }

    public final Integer getType() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.type;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getAvatarWidth() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.avatarWidth;
        int i4 = i3 + 43;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer getAvatarHeight() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.avatarHeight;
        int i5 = i3 + 49;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer getAvatarRound() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.avatarRound;
        if (i3 == 0) {
            int i4 = 42 / 0;
        }
        return num;
    }

    public SearchCenter(Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, LocalIconConfig localIconConfig, String str2, Integer num12, String str3, Integer num13, Integer num14, Integer num15, Integer num16) {
        this.backgroundColor = num;
        this.backgroundUrl = str;
        this.roundCorner = num2;
        this.marginTop = num3;
        this.marginBottom = num4;
        this.marginStart = num5;
        this.marginEnd = num6;
        this.width = num7;
        this.height = num8;
        this.textColor = num9;
        this.strokeWidth = num10;
        this.strokeColor = num11;
        this.icon = localIconConfig;
        this.text = str2;
        this.textSize = num12;
        this.execute = str3;
        this.type = num13;
        this.avatarWidth = num14;
        this.avatarHeight = num15;
        this.avatarRound = num16;
    }

    public SearchCenter() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static SearchCenter copy$default(SearchCenter searchCenter, Integer num, String str, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, LocalIconConfig localIconConfig, String str2, Integer num12, String str3, Integer num13, Integer num14, Integer num15, Integer num16, int i, Object obj) {
        Integer num17;
        String str4;
        Integer num18;
        Integer num19;
        Integer num20;
        Integer num21;
        int i2 = 2 % 2;
        Object obj2 = null;
        if ((i & 1) != 0) {
            int i3 = copydefault + 105;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                Integer num22 = searchCenter.backgroundColor;
                throw null;
            }
            num17 = searchCenter.backgroundColor;
        } else {
            num17 = num;
        }
        if ((i & 2) != 0) {
            int i4 = ShareDataUIState + 103;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                String str5 = searchCenter.backgroundUrl;
                obj2.hashCode();
                throw null;
            }
            str4 = searchCenter.backgroundUrl;
        } else {
            str4 = str;
        }
        if ((i & 4) != 0) {
            int i5 = ShareDataUIState + 41;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            num18 = searchCenter.roundCorner;
        } else {
            num18 = num2;
        }
        Integer num23 = (i & 8) != 0 ? searchCenter.marginTop : num3;
        if ((i & 16) != 0) {
            num19 = searchCenter.marginBottom;
            int i7 = ShareDataUIState + 33;
            copydefault = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 5 / 5;
            }
        } else {
            num19 = num4;
        }
        if ((i & 32) != 0) {
            int i9 = copydefault + 53;
            ShareDataUIState = i9 % 128;
            if (i9 % 2 != 0) {
                Integer num24 = searchCenter.marginStart;
                throw null;
            }
            num20 = searchCenter.marginStart;
        } else {
            num20 = num5;
        }
        Integer num25 = (i & 64) != 0 ? searchCenter.marginEnd : num6;
        if ((i & 128) != 0) {
            int i10 = copydefault + 71;
            ShareDataUIState = i10 % 128;
            int i11 = i10 % 2;
            num21 = searchCenter.width;
        } else {
            num21 = num7;
        }
        return searchCenter.copy(num17, str4, num18, num23, num19, num20, num25, num21, (i & 256) != 0 ? searchCenter.height : num8, (i & 512) != 0 ? searchCenter.textColor : num9, (i & 1024) != 0 ? searchCenter.strokeWidth : num10, (i & 2048) != 0 ? searchCenter.strokeColor : num11, (i & 4096) != 0 ? searchCenter.icon : localIconConfig, (i & 8192) != 0 ? searchCenter.text : str2, (i & 16384) != 0 ? searchCenter.textSize : num12, (i & 32768) != 0 ? searchCenter.execute : str3, (i & 65536) != 0 ? searchCenter.type : num13, (i & 131072) != 0 ? searchCenter.avatarWidth : num14, (i & 262144) != 0 ? searchCenter.avatarHeight : num15, (i & 524288) != 0 ? searchCenter.avatarRound : num16);
    }

    public final Integer component1() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.backgroundColor;
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
        return num;
    }

    public final Integer component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 101;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.textColor;
        int i5 = i3 + 1;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 42 / 0;
        }
        return num;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.strokeWidth;
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return num;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 5;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.strokeColor;
        int i5 = i2 + 39;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final LocalIconConfig component13() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 81;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        LocalIconConfig localIconConfig = this.icon;
        int i5 = i2 + 61;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return localIconConfig;
        }
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.text;
        int i5 = i3 + 39;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return str;
    }

    public final Integer component15() {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.textSize;
        int i5 = i3 + 73;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
        return num;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.execute;
        if (i3 != 0) {
            int i4 = 71 / 0;
        }
        return str;
    }

    public final Integer component17() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.type;
        int i5 = i3 + 113;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component18() {
        int i = 2 % 2;
        int i2 = copydefault + 87;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Integer num = this.avatarWidth;
        int i5 = i3 + 9;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component19() {
        int i = 2 % 2;
        int i2 = copydefault + 117;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.avatarHeight;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        String str = this.backgroundUrl;
        int i5 = i3 + 21;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component20() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.avatarRound;
        int i5 = i2 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 81;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.roundCorner;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component4() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return this.marginTop;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component5() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 29;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.marginBottom;
        int i5 = i2 + 41;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 84 / 0;
        }
        return num;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.marginStart;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Integer num = this.marginEnd;
        int i5 = i3 + 27;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return num;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 31;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.width;
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final Integer component9() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 115;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.height;
        int i5 = i2 + 33;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final SearchCenter copy(Integer backgroundColor, String backgroundUrl, Integer roundCorner, Integer marginTop, Integer marginBottom, Integer marginStart, Integer marginEnd, Integer width, Integer height, Integer textColor, Integer strokeWidth, Integer strokeColor, LocalIconConfig icon, String text, Integer textSize, String execute, Integer type, Integer avatarWidth, Integer avatarHeight, Integer avatarRound) {
        int i = 2 % 2;
        SearchCenter searchCenter = new SearchCenter(backgroundColor, backgroundUrl, roundCorner, marginTop, marginBottom, marginStart, marginEnd, width, height, textColor, strokeWidth, strokeColor, icon, text, textSize, execute, type, avatarWidth, avatarHeight, avatarRound);
        int i2 = copydefault + 9;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return searchCenter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        if (this == other) {
            int i5 = i2 + 111;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        if (!(other instanceof SearchCenter)) {
            int i7 = i2 + 99;
            copydefault = i7 % 128;
            return !(i7 % 2 != 0);
        }
        SearchCenter searchCenter = (SearchCenter) other;
        if (!Intrinsics.areEqual(this.backgroundColor, searchCenter.backgroundColor) || !Intrinsics.areEqual(this.backgroundUrl, searchCenter.backgroundUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.roundCorner, searchCenter.roundCorner)) {
            int i8 = copydefault + 91;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.marginTop, searchCenter.marginTop)) {
            int i10 = copydefault + 93;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 41 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.marginBottom, searchCenter.marginBottom) || !Intrinsics.areEqual(this.marginStart, searchCenter.marginStart) || !Intrinsics.areEqual(this.marginEnd, searchCenter.marginEnd) || !Intrinsics.areEqual(this.width, searchCenter.width) || !Intrinsics.areEqual(this.height, searchCenter.height) || !Intrinsics.areEqual(this.textColor, searchCenter.textColor) || !Intrinsics.areEqual(this.strokeWidth, searchCenter.strokeWidth) || !Intrinsics.areEqual(this.strokeColor, searchCenter.strokeColor) || !Intrinsics.areEqual(this.icon, searchCenter.icon)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.text, searchCenter.text)) {
            int i12 = copydefault + 103;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.textSize, searchCenter.textSize) || !Intrinsics.areEqual(this.execute, searchCenter.execute) || !Intrinsics.areEqual(this.type, searchCenter.type) || !Intrinsics.areEqual(this.avatarWidth, searchCenter.avatarWidth)) {
            return false;
        }
        if (Intrinsics.areEqual(this.avatarHeight, searchCenter.avatarHeight)) {
            return Intrinsics.areEqual(this.avatarRound, searchCenter.avatarRound);
        }
        int i14 = ShareDataUIState + 5;
        copydefault = i14 % 128;
        return i14 % 2 == 0;
    }

    public int hashCode() {
        Integer num;
        int i;
        int i2;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int i3;
        int iHashCode4;
        int i4;
        int iHashCode5;
        int i5;
        int i6;
        int i7;
        int iHashCode6;
        int i8 = 2 % 2;
        int i9 = copydefault + 121;
        ShareDataUIState = i9 % 128;
        if (i9 % 2 != 0) {
            num = this.backgroundColor;
            if (num == null) {
                i2 = 1;
                i = i2;
                iHashCode = 0;
            } else {
                i = 1;
                iHashCode = num.hashCode();
            }
        } else {
            num = this.backgroundColor;
            if (num == null) {
                i2 = 0;
                i = i2;
                iHashCode = 0;
            } else {
                i = 0;
                iHashCode = num.hashCode();
            }
        }
        String str = this.backgroundUrl;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        Integer num2 = this.roundCorner;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.marginTop;
        if (num3 == null) {
            int i10 = ShareDataUIState + 105;
            copydefault = i10 % 128;
            int i11 = i10 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = num3.hashCode();
        }
        Integer num4 = this.marginBottom;
        int iHashCode9 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.marginStart;
        int iHashCode10 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.marginEnd;
        if (num6 == null) {
            int i12 = copydefault + 77;
            ShareDataUIState = i12 % 128;
            int i13 = i12 % 2;
            iHashCode3 = 0;
        } else {
            iHashCode3 = num6.hashCode();
        }
        Integer num7 = this.width;
        int iHashCode11 = num7 == null ? 0 : num7.hashCode();
        Integer num8 = this.height;
        int iHashCode12 = num8 == null ? 0 : num8.hashCode();
        Integer num9 = this.textColor;
        int iHashCode13 = num9 == null ? 0 : num9.hashCode();
        Integer num10 = this.strokeWidth;
        int iHashCode14 = num10 == null ? 0 : num10.hashCode();
        Integer num11 = this.strokeColor;
        int iHashCode15 = num11 == null ? 0 : num11.hashCode();
        LocalIconConfig localIconConfig = this.icon;
        int iHashCode16 = localIconConfig == null ? 0 : localIconConfig.hashCode();
        String str2 = this.text;
        if (str2 == null) {
            int i14 = copydefault + 31;
            i3 = i;
            ShareDataUIState = i14 % 128;
            iHashCode4 = i14 % 2 != 0 ? 1 : 0;
        } else {
            i3 = i;
            iHashCode4 = str2.hashCode();
        }
        Integer num12 = this.textSize;
        if (num12 == null) {
            int i15 = ShareDataUIState + 7;
            i4 = iHashCode4;
            copydefault = i15 % 128;
            iHashCode5 = i15 % 2 == 0 ? 1 : 0;
        } else {
            i4 = iHashCode4;
            iHashCode5 = num12.hashCode();
        }
        String str3 = this.execute;
        int iHashCode17 = str3 == null ? 0 : str3.hashCode();
        Integer num13 = this.type;
        if (num13 == null) {
            int i16 = ShareDataUIState + 81;
            i5 = iHashCode5;
            copydefault = i16 % 128;
            i6 = i16 % 2 == 0 ? 1 : 0;
        } else {
            i5 = iHashCode5;
            int iHashCode18 = num13.hashCode();
            int i17 = copydefault + 89;
            ShareDataUIState = i17 % 128;
            int i18 = i17 % 2;
            i6 = iHashCode18;
        }
        Integer num14 = this.avatarWidth;
        int iHashCode19 = num14 == null ? 0 : num14.hashCode();
        Integer num15 = this.avatarHeight;
        if (num15 == null) {
            int i19 = ShareDataUIState + 75;
            i7 = i6;
            copydefault = i19 % 128;
            iHashCode6 = i19 % 2 == 0 ? 1 : 0;
        } else {
            i7 = i6;
            iHashCode6 = num15.hashCode();
        }
        Integer num16 = this.avatarRound;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode2) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode3) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + i4) * 31) + i5) * 31) + iHashCode17) * 31) + i7) * 31) + iHashCode19) * 31) + iHashCode6) * 31) + (num16 == null ? i3 : num16.hashCode());
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SearchCenter(backgroundColor=" + this.backgroundColor + ", backgroundUrl=" + this.backgroundUrl + ", roundCorner=" + this.roundCorner + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", width=" + this.width + ", height=" + this.height + ", textColor=" + this.textColor + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ", icon=" + this.icon + ", text=" + this.text + ", textSize=" + this.textSize + ", execute=" + this.execute + ", type=" + this.type + ", avatarWidth=" + this.avatarWidth + ", avatarHeight=" + this.avatarHeight + ", avatarRound=" + this.avatarRound + ")";
        int i2 = ShareDataUIState + 115;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 27 / 0;
        }
        return str;
    }
}
