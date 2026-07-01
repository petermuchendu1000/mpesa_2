package com.huawei.digitalpayment.common.theme.data;

import com.alibaba.ariver.kernel.RVParams;
import com.huawei.hms.ml.scan.HmsScanBase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b3\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00104\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001aJª\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\tHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010$R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001a\"\u0004\b*\u0010\u001cR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b+\u0010\u001a\"\u0004\b,\u0010\u001c¨\u0006B"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/data/SlidingGroupComponent;", "Lcom/huawei/digitalpayment/common/theme/data/BaseComponent;", "title", "", "subTitle", RVParams.AROME_SUB_TITLE_COLOR, "subTitleExecute", "indicatorPosition", "indicatorSpacing", "", "indicatorHeight", "indicatorMargin", "indicatorSelectedImg", "indicatorUnSelectedImg", "itemWidth", "itemHeight", "itemRoundCorner", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "getSubTitle", "getSubTitleColor", "getSubTitleExecute", "getIndicatorPosition", "getIndicatorSpacing", "()Ljava/lang/Integer;", "setIndicatorSpacing", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIndicatorHeight", "setIndicatorHeight", "getIndicatorMargin", "setIndicatorMargin", "getIndicatorSelectedImg", "setIndicatorSelectedImg", "(Ljava/lang/String;)V", "getIndicatorUnSelectedImg", "setIndicatorUnSelectedImg", "getItemWidth", "setItemWidth", "getItemHeight", "setItemHeight", "getItemRoundCorner", "setItemRoundCorner", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/common/theme/data/SlidingGroupComponent;", "equals", "", "other", "", "hashCode", "toString", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SlidingGroupComponent extends BaseComponent {
    private static int ShareDataUIState = 1;
    private static int component3;
    private Integer indicatorHeight;
    private Integer indicatorMargin;
    private final String indicatorPosition;
    private String indicatorSelectedImg;
    private Integer indicatorSpacing;
    private String indicatorUnSelectedImg;
    private Integer itemHeight;
    private Integer itemRoundCorner;
    private Integer itemWidth;
    private final String subTitle;
    private final String subTitleColor;
    private final String subTitleExecute;
    private final String title;

    /* JADX WARN: Illegal instructions before constructor call */
    public SlidingGroupComponent(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Integer num5, Integer num6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str8;
        String str9;
        Integer num7;
        Integer num8;
        Integer num9 = null;
        String str10 = (i & 1) != 0 ? null : str;
        String str11 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            int i2 = 2 % 2;
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i & 8) != 0) {
            int i3 = component3;
            int i4 = i3 + 33;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                num9.hashCode();
                throw null;
            }
            int i5 = i3 + 65;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 2 % 2;
            str9 = null;
        } else {
            str9 = str4;
        }
        String str12 = (i & 16) != 0 ? null : str5;
        Integer num10 = (i & 32) != 0 ? null : num;
        if ((i & 64) != 0) {
            int i8 = ShareDataUIState + 25;
            component3 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 94 / 0;
            }
            num7 = null;
        } else {
            num7 = num2;
        }
        Integer num11 = (i & 128) != 0 ? null : num3;
        String str13 = (i & 256) != 0 ? null : str6;
        String str14 = (i & 512) != 0 ? null : str7;
        if ((i & 1024) != 0) {
            int i10 = component3 + 5;
            ShareDataUIState = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            num8 = null;
        } else {
            num8 = num4;
        }
        Integer num12 = (i & 2048) != 0 ? null : num5;
        if ((i & 4096) != 0) {
            int i11 = ShareDataUIState + 85;
            component3 = i11 % 128;
            if (i11 % 2 != 0) {
                num9.hashCode();
                throw null;
            }
        } else {
            num9 = num6;
        }
        this(str10, str11, str8, str9, str12, num10, num7, num11, str13, str14, num8, num12, num9);
    }

    public final String getTitle() {
        int i = 2 % 2;
        int i2 = component3 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.title;
        int i4 = i3 + 81;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getSubTitle() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        String str = this.subTitle;
        if (i3 == 0) {
            int i4 = 1 / 0;
        }
        return str;
    }

    public final String getSubTitleColor() {
        int i = 2 % 2;
        int i2 = component3 + 9;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.subTitleColor;
        int i5 = i3 + 23;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getSubTitleExecute() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.subTitleExecute;
        int i5 = i2 + 27;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getIndicatorPosition() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 117;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorPosition;
        int i5 = i2 + 19;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final Integer getIndicatorSpacing() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 11;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.indicatorSpacing;
        int i5 = i2 + 65;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 90 / 0;
        }
        return num;
    }

    public final void setIndicatorSpacing(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 43;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.indicatorSpacing = num;
        int i5 = i3 + 109;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getIndicatorHeight() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 105;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.indicatorHeight;
        int i5 = i2 + 47;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setIndicatorHeight(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.indicatorHeight = num;
        int i5 = i3 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final Integer getIndicatorMargin() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 109;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            num = this.indicatorMargin;
            int i4 = 33 / 0;
        } else {
            num = this.indicatorMargin;
        }
        int i5 = i3 + 95;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setIndicatorMargin(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.indicatorMargin = num;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 65;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIndicatorSelectedImg() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 35;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.indicatorSelectedImg;
            int i4 = 7 / 0;
        } else {
            str = this.indicatorSelectedImg;
        }
        int i5 = i2 + 115;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIndicatorSelectedImg(String str) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        this.indicatorSelectedImg = str;
        int i5 = i3 + 17;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    public final String getIndicatorUnSelectedImg() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 59;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorUnSelectedImg;
        int i5 = i2 + 29;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void setIndicatorUnSelectedImg(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 107;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        this.indicatorUnSelectedImg = str;
        int i5 = i3 + 117;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public final Integer getItemWidth() {
        Integer num;
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            num = this.itemWidth;
            int i4 = 84 / 0;
        } else {
            num = this.itemWidth;
        }
        int i5 = i2 + 89;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final void setItemWidth(Integer num) {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.itemWidth = num;
        if (i3 == 0) {
            int i4 = 74 / 0;
        }
    }

    public final Integer getItemHeight() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 117;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.itemHeight;
        int i5 = i3 + 71;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final void setItemHeight(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.itemHeight = num;
        int i5 = i2 + 41;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
    }

    public final Integer getItemRoundCorner() {
        int i = 2 % 2;
        int i2 = component3 + 47;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemRoundCorner;
        }
        throw null;
    }

    public final void setItemRoundCorner(Integer num) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 5;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.itemRoundCorner = num;
        if (i4 != 0) {
            int i5 = 80 / 0;
        }
        int i6 = i2 + 55;
        component3 = i6 % 128;
        int i7 = i6 % 2;
    }

    public SlidingGroupComponent(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Integer num5, Integer num6) {
        super(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
        this.title = str;
        this.subTitle = str2;
        this.subTitleColor = str3;
        this.subTitleExecute = str4;
        this.indicatorPosition = str5;
        this.indicatorSpacing = num;
        this.indicatorHeight = num2;
        this.indicatorMargin = num3;
        this.indicatorSelectedImg = str6;
        this.indicatorUnSelectedImg = str7;
        this.itemWidth = num4;
        this.itemHeight = num5;
        this.itemRoundCorner = num6;
    }

    public SlidingGroupComponent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, HmsScanBase.ALL_SCAN_TYPE, null);
    }

    public static SlidingGroupComponent copy$default(SlidingGroupComponent slidingGroupComponent, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, Integer num4, Integer num5, Integer num6, int i, Object obj) {
        String str8;
        String str9;
        Integer num7;
        String str10;
        Integer num8;
        int i2 = 2 % 2;
        String str11 = (i & 1) != 0 ? slidingGroupComponent.title : str;
        String str12 = (i & 2) != 0 ? slidingGroupComponent.subTitle : str2;
        if ((i & 4) != 0) {
            int i3 = component3 + 93;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            str8 = slidingGroupComponent.subTitleColor;
        } else {
            str8 = str3;
        }
        String str13 = (i & 8) != 0 ? slidingGroupComponent.subTitleExecute : str4;
        if ((i & 16) != 0) {
            int i5 = component3 + 97;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            str9 = slidingGroupComponent.indicatorPosition;
        } else {
            str9 = str5;
        }
        if ((i & 32) != 0) {
            int i7 = ShareDataUIState + 5;
            component3 = i7 % 128;
            int i8 = i7 % 2;
            num7 = slidingGroupComponent.indicatorSpacing;
        } else {
            num7 = num;
        }
        Integer num9 = (i & 64) != 0 ? slidingGroupComponent.indicatorHeight : num2;
        Integer num10 = (i & 128) != 0 ? slidingGroupComponent.indicatorMargin : num3;
        String str14 = (i & 256) != 0 ? slidingGroupComponent.indicatorSelectedImg : str6;
        if ((i & 512) != 0) {
            int i9 = ShareDataUIState + 47;
            component3 = i9 % 128;
            if (i9 % 2 != 0) {
                str10 = slidingGroupComponent.indicatorUnSelectedImg;
                int i10 = 15 / 0;
            } else {
                str10 = slidingGroupComponent.indicatorUnSelectedImg;
            }
        } else {
            str10 = str7;
        }
        Integer num11 = (i & 1024) != 0 ? slidingGroupComponent.itemWidth : num4;
        if ((i & 2048) != 0) {
            int i11 = ShareDataUIState + 111;
            component3 = i11 % 128;
            int i12 = i11 % 2;
            num8 = slidingGroupComponent.itemHeight;
        } else {
            num8 = num5;
        }
        return slidingGroupComponent.copy(str11, str12, str8, str13, str9, num7, num9, num10, str14, str10, num11, num8, (i & 4096) != 0 ? slidingGroupComponent.itemRoundCorner : num6);
    }

    public final String component1() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 93;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.title;
        int i5 = i2 + 65;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 49;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.indicatorUnSelectedImg;
        int i4 = i2 + 13;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final Integer component11() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return this.itemWidth;
        }
        throw null;
    }

    public final Integer component12() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Integer num = this.itemHeight;
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        return num;
    }

    public final Integer component13() {
        int i = 2 % 2;
        int i2 = component3 + 7;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Integer num = this.itemRoundCorner;
        int i4 = i3 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    public final String component2() {
        String str;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 11;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.subTitle;
            int i4 = 46 / 0;
        } else {
            str = this.subTitle;
        }
        int i5 = i2 + 5;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 63;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.subTitleColor;
        }
        throw null;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = component3 + 57;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.subTitleExecute;
        int i5 = i3 + 99;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 91;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.indicatorPosition;
        int i5 = i2 + 9;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final Integer component6() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 49;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Integer num = this.indicatorSpacing;
        int i4 = i3 + 99;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return num;
    }

    public final Integer component7() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 7;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        Integer num = this.indicatorHeight;
        int i5 = i3 + 35;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 != 0) {
            return num;
        }
        throw null;
    }

    public final Integer component8() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 69;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        Integer num = this.indicatorMargin;
        int i5 = i2 + 93;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return num;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = component3 + 51;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        String str = this.indicatorSelectedImg;
        int i5 = i3 + 19;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final SlidingGroupComponent copy(String title, String subTitle, String subTitleColor, String subTitleExecute, String indicatorPosition, Integer indicatorSpacing, Integer indicatorHeight, Integer indicatorMargin, String indicatorSelectedImg, String indicatorUnSelectedImg, Integer itemWidth, Integer itemHeight, Integer itemRoundCorner) {
        int i = 2 % 2;
        SlidingGroupComponent slidingGroupComponent = new SlidingGroupComponent(title, subTitle, subTitleColor, subTitleExecute, indicatorPosition, indicatorSpacing, indicatorHeight, indicatorMargin, indicatorSelectedImg, indicatorUnSelectedImg, itemWidth, itemHeight, itemRoundCorner);
        int i2 = ShareDataUIState + 21;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return slidingGroupComponent;
    }

    public boolean equals(Object other) {
        int i = 2 % 2;
        if (this == other) {
            int i2 = ShareDataUIState + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        if (!(other instanceof SlidingGroupComponent)) {
            return false;
        }
        SlidingGroupComponent slidingGroupComponent = (SlidingGroupComponent) other;
        if (!Intrinsics.areEqual(this.title, slidingGroupComponent.title)) {
            int i4 = component3 + 115;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.subTitle, slidingGroupComponent.subTitle) || !Intrinsics.areEqual(this.subTitleColor, slidingGroupComponent.subTitleColor) || !Intrinsics.areEqual(this.subTitleExecute, slidingGroupComponent.subTitleExecute) || (!Intrinsics.areEqual(this.indicatorPosition, slidingGroupComponent.indicatorPosition)) || !Intrinsics.areEqual(this.indicatorSpacing, slidingGroupComponent.indicatorSpacing) || !Intrinsics.areEqual(this.indicatorHeight, slidingGroupComponent.indicatorHeight) || !Intrinsics.areEqual(this.indicatorMargin, slidingGroupComponent.indicatorMargin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorSelectedImg, slidingGroupComponent.indicatorSelectedImg)) {
            int i6 = component3 + 105;
            ShareDataUIState = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.indicatorUnSelectedImg, slidingGroupComponent.indicatorUnSelectedImg)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.itemWidth, slidingGroupComponent.itemWidth)) {
            int i8 = ShareDataUIState;
            int i9 = i8 + 117;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = i8 + 101;
            component3 = i11 % 128;
            if (i11 % 2 == 0) {
                return false;
            }
            throw null;
        }
        if (!Intrinsics.areEqual(this.itemHeight, slidingGroupComponent.itemHeight)) {
            return false;
        }
        if (Intrinsics.areEqual(this.itemRoundCorner, slidingGroupComponent.itemRoundCorner)) {
            return true;
        }
        int i12 = ShareDataUIState + 33;
        int i13 = i12 % 128;
        component3 = i13;
        int i14 = i12 % 2;
        int i15 = i13 + 73;
        ShareDataUIState = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 1 / 0;
        }
        return false;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int i = 2 % 2;
        String str = this.title;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.subTitle;
        if (str2 == null) {
            int i2 = component3 + 5;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = str2.hashCode();
        }
        String str3 = this.subTitleColor;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.subTitleExecute;
        if (str4 == null) {
            int i4 = component3 + 89;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = str4.hashCode();
        }
        String str5 = this.indicatorPosition;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.indicatorSpacing;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        Integer num2 = this.indicatorHeight;
        int iHashCode9 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.indicatorMargin;
        int iHashCode10 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.indicatorSelectedImg;
        int iHashCode11 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.indicatorUnSelectedImg;
        if (str7 == null) {
            int i6 = ShareDataUIState + 81;
            component3 = i6 % 128;
            iHashCode3 = i6 % 2 != 0 ? 1 : 0;
        } else {
            iHashCode3 = str7.hashCode();
            int i7 = component3 + 85;
            ShareDataUIState = i7 % 128;
            int i8 = i7 % 2;
        }
        Integer num4 = this.itemWidth;
        if (num4 == null) {
            int i9 = ShareDataUIState + 79;
            component3 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode4 = 0;
        } else {
            iHashCode4 = num4.hashCode();
        }
        Integer num5 = this.itemHeight;
        int iHashCode12 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.itemRoundCorner;
        return (((((((((((((((((((((((iHashCode5 * 31) + iHashCode) * 31) + iHashCode6) * 31) + iHashCode2) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode12) * 31) + (num6 != null ? num6.hashCode() : 0);
    }

    public String toString() {
        int i = 2 % 2;
        String str = "SlidingGroupComponent(title=" + this.title + ", subTitle=" + this.subTitle + ", subTitleColor=" + this.subTitleColor + ", subTitleExecute=" + this.subTitleExecute + ", indicatorPosition=" + this.indicatorPosition + ", indicatorSpacing=" + this.indicatorSpacing + ", indicatorHeight=" + this.indicatorHeight + ", indicatorMargin=" + this.indicatorMargin + ", indicatorSelectedImg=" + this.indicatorSelectedImg + ", indicatorUnSelectedImg=" + this.indicatorUnSelectedImg + ", itemWidth=" + this.itemWidth + ", itemHeight=" + this.itemHeight + ", itemRoundCorner=" + this.itemRoundCorner + ")";
        int i2 = ShareDataUIState + 35;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            return str;
        }
        throw null;
    }
}
