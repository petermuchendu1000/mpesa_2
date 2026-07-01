package com.huawei.common.widget.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import com.alibaba.griver.ui.ant.api.AUAttrsConstant;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.Utils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.image.IImageInterface;
import com.huawei.common.image.ImageInterfaceManager;
import com.huawei.common.util.L;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.checkout.constants.CouponType;
import com.huawei.digitalpayment.common.theme.constants.ThemeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b*\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u007f2\u00020\u0001:\u0004|}~\u007fB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ\u0010\u00103\u001a\u0004\u0018\u00010\u00142\u0006\u00104\u001a\u00020\nJ\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+J\u000e\u00108\u001a\u0002062\u0006\u00109\u001a\u00020\nJ\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020\nJ\u0015\u0010<\u001a\u0002062\b\u0010 \u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010@\u001a\u0002062\u0006\u0010A\u001a\u00020\nJ\u0010\u0010B\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010C\u001a\u0002062\u0006\u0010D\u001a\u00020\u001eJ\u0010\u0010E\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J&\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nJ\u0010\u0010K\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010L\u001a\u0002062\u0006\u0010M\u001a\u00020\nJ\u0010\u0010N\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020\nJ\u0016\u0010Q\u001a\u0002062\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\nJ\u000e\u0010T\u001a\u0002062\u0006\u0010U\u001a\u00020\u0017J\u000e\u0010V\u001a\u0002062\u0006\u0010W\u001a\u00020\nJ\u0010\u0010X\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010Y\u001a\u0002062\u0006\u00109\u001a\u00020\nJ\u0010\u0010Z\u001a\u0002062\u0006\u0010?\u001a\u00020\u0014H\u0002J\u000e\u0010[\u001a\u0002062\u0006\u0010\\\u001a\u00020\nJ\u000e\u0010]\u001a\u0002062\u0006\u00104\u001a\u00020\nJ\u0016\u0010]\u001a\u0002062\u0006\u00104\u001a\u00020\n2\u0006\u0010^\u001a\u000201J\u0016\u0010_\u001a\u0002062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020b0aH\u0007J\u0014\u0010c\u001a\u0002062\f\u0010`\u001a\b\u0012\u0004\u0012\u00020/0aJ\u0010\u0010d\u001a\u0002062\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010e\u001a\u000206J\u0010\u0010f\u001a\u0002062\u0006\u00104\u001a\u00020\nH\u0002J\u0010\u0010g\u001a\u0002062\u0006\u00104\u001a\u00020\nH\u0002J\u0010\u0010h\u001a\u0002062\u0006\u00104\u001a\u00020\nH\u0002J0\u0010i\u001a\u0002062\u0006\u0010j\u001a\u0002012\u0006\u0010k\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010J\u001a\u00020\nH\u0014J\b\u0010m\u001a\u000206H\u0002J\u0010\u0010n\u001a\u0002062\u0006\u0010o\u001a\u00020\nH\u0002J\b\u0010p\u001a\u000201H\u0002J\u001c\u0010q\u001a\u00020\n2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0sH\u0002J\u001c\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0s2\u0006\u0010?\u001a\u00020\u0014H\u0002J\u0018\u0010u\u001a\u0002062\u0006\u0010v\u001a\u00020\u00142\u0006\u0010w\u001a\u00020/H\u0002J\u0018\u0010x\u001a\u0002062\u0006\u0010v\u001a\u00020\u00142\u0006\u0010w\u001a\u00020/H\u0002J\u0010\u0010y\u001a\u0002062\u0006\u0010v\u001a\u00020\u0014H\u0002J\b\u0010z\u001a\u000206H\u0002J\u0010\u0010{\u001a\u0002062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010 \u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u000e\u0010!\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0080\u0001"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "scrollView", "Landroid/widget/HorizontalScrollView;", "contentLayout", "Landroid/widget/LinearLayout;", "tabViews", "", "Lcom/huawei/common/widget/tab/CommonTabItemView;", "selectedTab", "tabTextSize", "", "selectedTextColor", "unselectedTextColor", "tabIconSize", "Ljava/lang/Integer;", "tabIconMargin", "indicatorWidthStyle", "Lcom/huawei/common/widget/tab/CommonTabView$IndicatorWidthStyle;", "indicatorColor", "indicatorWidth", "indicatorHeight", "indicatorMarginBottom", "indicatorMarginStart", "indicatorMarginTop", "indicatorMarginEnd", "indicatorCorner", "tabHorizontalPadding", "itemSpacing", "horizontalMargin", "itemGravity", "Lcom/huawei/common/widget/tab/CommonTabView$ItemGravity;", "callback", "Lcom/huawei/common/widget/tab/CommonTabView$OnTabSelectedCallback;", "dataSource", "Lcom/huawei/common/widget/tab/CommonTabItem;", "layoutItemIfNeed", "", "isOversize", "getTabViewAt", "position", "setItemGravity", "", "gravity", "setHorizontalMargin", "margin", "setItemSpacing", "spacing", "setIndicatorWidth", "(Ljava/lang/Integer;)V", "updateIndicatorWidth", "tab", "setIndicatorHeight", "height", "updateIndicatorHeight", "setIndicatorWidthStyle", "style", "updateIndicatorWidthStyle", "setIndicatorMargin", "start", "top", "end", ThemeConstants.INDICA_POSITION_BOTTOM, "updateIndicatorMargin", "setIndicatorCorner", "corner", "updateIndicatorCorner", "setIndicatorColor", "color", "setTabTextColor", "selectedColor", "unselectedColor", "setTabTextSize", AUAttrsConstant.TV_TEXTSIZE, "setTabIconSize", "iconSize", "updateTabIconSize", "setTabIconMargin", "updateTabIconMargin", "setTabHorizontalPadding", "padding", "setSelectedTab", "notifyCallback", "setDataSource", "data", "", "", "setNewDataSource", "setCallback", "requestLayoutIfNeed", "setTabSelected", "setTabUnselected", "onItemClick", "onLayout", "changed", "left", "right", "layoutItem", "reLayoutIfNeed", "contentWidth", "supportOversize", "getTabItemParamWidth", "itemWidth", "Lkotlin/Pair;", "getTabItemWidth", "setTabText", "itemView", "tabItem", "setTabIcon", "setIndicator", "notifyDataChanged", "initView", "ItemGravity", "IndicatorWidthStyle", "OnTabSelectedCallback", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonTabView extends FrameLayout {
    private static final String TAG = "CommonTabView";
    private OnTabSelectedCallback callback;
    private LinearLayout contentLayout;
    private List<CommonTabItem> dataSource;
    private int horizontalMargin;
    private int indicatorColor;
    private int indicatorCorner;
    private int indicatorHeight;
    private int indicatorMarginBottom;
    private int indicatorMarginEnd;
    private int indicatorMarginStart;
    private int indicatorMarginTop;
    private Integer indicatorWidth;
    private IndicatorWidthStyle indicatorWidthStyle;
    private boolean isOversize;
    private ItemGravity itemGravity;
    private int itemSpacing;
    private boolean layoutItemIfNeed;
    private HorizontalScrollView scrollView;
    private int selectedTab;
    private int selectedTextColor;
    private int tabHorizontalPadding;
    private int tabIconMargin;
    private Integer tabIconSize;
    private float tabTextSize;
    private List<CommonTabItemView> tabViews;
    private int unselectedTextColor;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabView$OnTabSelectedCallback;", "", "onTabSelected", "", "tabView", "Lcom/huawei/common/widget/tab/CommonTabView;", "position", "", "onTabUnselected", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTabSelectedCallback {
        void onTabSelected(CommonTabView tabView, int position);

        void onTabUnselected(CommonTabView tabView, int position);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ItemGravity.values().length];
            try {
                iArr[ItemGravity.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemGravity.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabView$ItemGravity;", "", "<init>", "(Ljava/lang/String;I)V", "START", "END", "CENTER", CouponType.COUPON_CUT, "SPREAD_INSIDE", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ItemGravity {
        private static final EnumEntries $ENTRIES;
        private static final ItemGravity[] $VALUES;
        public static final ItemGravity START = new ItemGravity("START", 0);
        public static final ItemGravity END = new ItemGravity("END", 1);
        public static final ItemGravity CENTER = new ItemGravity("CENTER", 2);
        public static final ItemGravity FLAT = new ItemGravity(CouponType.COUPON_CUT, 3);
        public static final ItemGravity SPREAD_INSIDE = new ItemGravity("SPREAD_INSIDE", 4);

        private ItemGravity(String str, int i) {
        }

        static {
            ItemGravity[] itemGravityArr$values = $values();
            $VALUES = itemGravityArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(itemGravityArr$values);
        }

        public static ItemGravity valueOf(String str) {
            return (ItemGravity) Enum.valueOf(ItemGravity.class, str);
        }

        public static ItemGravity[] values() {
            return (ItemGravity[]) $VALUES.clone();
        }

        private static final ItemGravity[] $values() {
            return new ItemGravity[]{START, END, CENTER, FLAT, SPREAD_INSIDE};
        }

        public static EnumEntries<ItemGravity> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huawei/common/widget/tab/CommonTabView$IndicatorWidthStyle;", "", "<init>", "(Ljava/lang/String;I)V", "MATCH_TAB", "MATCH_CONTENT", "CUSTOM", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndicatorWidthStyle {
        private static final EnumEntries $ENTRIES;
        private static final IndicatorWidthStyle[] $VALUES;
        public static final IndicatorWidthStyle MATCH_TAB = new IndicatorWidthStyle("MATCH_TAB", 0);
        public static final IndicatorWidthStyle MATCH_CONTENT = new IndicatorWidthStyle("MATCH_CONTENT", 1);
        public static final IndicatorWidthStyle CUSTOM = new IndicatorWidthStyle("CUSTOM", 2);

        private IndicatorWidthStyle(String str, int i) {
        }

        static {
            IndicatorWidthStyle[] indicatorWidthStyleArr$values = $values();
            $VALUES = indicatorWidthStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(indicatorWidthStyleArr$values);
        }

        public static IndicatorWidthStyle valueOf(String str) {
            return (IndicatorWidthStyle) Enum.valueOf(IndicatorWidthStyle.class, str);
        }

        public static IndicatorWidthStyle[] values() {
            return (IndicatorWidthStyle[]) $VALUES.clone();
        }

        private static final IndicatorWidthStyle[] $values() {
            return new IndicatorWidthStyle[]{MATCH_TAB, MATCH_CONTENT, CUSTOM};
        }

        public static EnumEntries<IndicatorWidthStyle> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonTabView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommonTabView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTabView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.tabViews = new ArrayList();
        this.selectedTab = -1;
        this.tabTextSize = 16.0f;
        this.selectedTextColor = Utils.getApp().getColor(R.color.colorMainText);
        this.unselectedTextColor = Utils.getApp().getColor(R.color.colorSecondaryText);
        this.tabIconMargin = ConvertUtils.dp2px(4.0f);
        this.indicatorWidthStyle = IndicatorWidthStyle.MATCH_TAB;
        this.indicatorColor = Utils.getApp().getColor(R.color.colorPrimary);
        this.indicatorHeight = ConvertUtils.dp2px(2.0f);
        this.indicatorMarginBottom = ConvertUtils.dp2px(6.0f);
        this.itemSpacing = ConvertUtils.dp2px(16.0f);
        this.horizontalMargin = ConvertUtils.dp2px(24.0f);
        this.itemGravity = ItemGravity.START;
        this.dataSource = new ArrayList();
        initView(context);
    }

    public final CommonTabItemView getTabViewAt(int position) {
        return (CommonTabItemView) CollectionsKt.getOrNull(this.tabViews, position);
    }

    public final void setItemGravity(ItemGravity gravity) {
        Intrinsics.checkNotNullParameter(gravity, "");
        this.itemGravity = gravity;
        LinearLayout linearLayout = this.contentLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[gravity.ordinal()];
        linearLayout.setGravity(i != 1 ? i != 2 ? GravityCompat.START : GravityCompat.END : 17);
        notifyDataChanged();
    }

    public final void setHorizontalMargin(int margin) {
        this.horizontalMargin = margin;
        LinearLayout linearLayout = this.contentLayout;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        linearLayout.setPadding(margin, 0, margin, 0);
    }

    public final void setItemSpacing(int spacing) {
        this.itemSpacing = spacing;
        notifyDataChanged();
    }

    public final void setIndicatorWidth(Integer indicatorWidth) {
        setIndicatorWidthStyle(IndicatorWidthStyle.CUSTOM);
        this.indicatorWidth = indicatorWidth;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            updateIndicatorWidth(it.next());
        }
    }

    private final void updateIndicatorWidth(CommonTabItemView tab) {
        int iIntValue;
        Integer num = this.indicatorWidth;
        if (num == null || (iIntValue = num.intValue()) <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tab.getIndicator().getLayoutParams();
        layoutParams.width = iIntValue;
        tab.getIndicator().setLayoutParams(layoutParams);
    }

    public final void setIndicatorHeight(int height) {
        this.indicatorHeight = height;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            updateIndicatorHeight(it.next());
        }
    }

    private final void updateIndicatorHeight(CommonTabItemView tab) {
        RoundImageView indicator = tab.getIndicator();
        ViewGroup.LayoutParams layoutParams = indicator.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.indicatorHeight;
            indicator.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void setIndicatorWidthStyle(IndicatorWidthStyle style) {
        Intrinsics.checkNotNullParameter(style, "");
        this.indicatorWidthStyle = style;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            updateIndicatorWidthStyle(it.next());
        }
    }

    private final void updateIndicatorWidthStyle(CommonTabItemView tab) {
        int id;
        if (this.indicatorWidthStyle == IndicatorWidthStyle.MATCH_CONTENT) {
            RoundImageView indicator = tab.getIndicator();
            ViewGroup.LayoutParams layoutParams = indicator.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ConstraintLayout.LayoutParams layoutParams3 = layoutParams2;
            if (tab.getIconView().getVisibility() == 0) {
                id = tab.getIconView().getId();
            } else {
                id = tab.getTitleView().getId();
            }
            layoutParams3.startToStart = id;
            layoutParams3.endToEnd = tab.getTitleView().getId();
            layoutParams3.width = 0;
            indicator.setLayoutParams(layoutParams2);
            return;
        }
        RoundImageView indicator2 = tab.getIndicator();
        ViewGroup.LayoutParams layoutParams4 = indicator2.getLayoutParams();
        if (layoutParams4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams4;
        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5;
        layoutParams6.startToStart = 0;
        layoutParams6.endToEnd = 0;
        layoutParams6.width = 0;
        indicator2.setLayoutParams(layoutParams5);
    }

    public final void setIndicatorMargin(int start, int top, int end, int bottom) {
        this.indicatorMarginStart = start;
        this.indicatorMarginTop = top;
        this.indicatorMarginEnd = end;
        this.indicatorMarginBottom = bottom;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            updateIndicatorMargin(it.next());
        }
    }

    private final void updateIndicatorMargin(CommonTabItemView tab) {
        RoundImageView indicator = tab.getIndicator();
        ViewGroup.LayoutParams layoutParams = indicator.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.topMargin = this.indicatorMarginTop;
        marginLayoutParams2.bottomMargin = this.indicatorMarginBottom;
        marginLayoutParams2.setMarginStart(this.indicatorMarginStart);
        marginLayoutParams2.setMarginEnd(this.indicatorMarginEnd);
        indicator.setLayoutParams(marginLayoutParams);
    }

    public final void setIndicatorCorner(int corner) {
        this.indicatorCorner = corner;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            updateIndicatorCorner(it.next());
        }
    }

    private final void updateIndicatorCorner(CommonTabItemView tab) {
        tab.getIndicator().getBaseFilletView().setRoundCorner(this.indicatorCorner);
    }

    public final void setIndicatorColor(int color) {
        this.indicatorColor = color;
        Iterator<CommonTabItemView> it = this.tabViews.iterator();
        while (it.hasNext()) {
            it.next().getIndicator().setBackgroundColor(color);
        }
    }

    public final void setTabTextColor(int selectedColor, int unselectedColor) {
        this.selectedTextColor = selectedColor;
        this.unselectedTextColor = unselectedColor;
        int size = this.tabViews.size();
        int i = 0;
        while (i < size) {
            this.tabViews.get(i).getTitleView().setTextColor(i == this.selectedTab ? selectedColor : unselectedColor);
            i++;
        }
    }

    public final void setTabTextSize(float textSize) {
        this.tabTextSize = textSize;
        notifyDataChanged();
    }

    public final void setTabIconSize(int iconSize) {
        this.tabIconSize = Integer.valueOf(iconSize);
        notifyDataChanged();
    }

    private final void updateTabIconSize(CommonTabItemView tab) {
        Integer num = this.tabIconSize;
        if (num != null) {
            int iIntValue = num.intValue();
            ImageView iconView = tab.getIconView();
            ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iIntValue;
                layoutParams.height = iIntValue;
                iconView.setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void setTabIconMargin(int margin) {
        this.tabIconMargin = margin;
        notifyDataChanged();
    }

    private final void updateTabIconMargin(CommonTabItemView tab) {
        ImageView iconView = tab.getIconView();
        ViewGroup.LayoutParams layoutParams = iconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.setMarginEnd(this.tabIconMargin);
        marginLayoutParams2.setMarginStart(this.tabHorizontalPadding);
        iconView.setLayoutParams(marginLayoutParams);
    }

    public final void setTabHorizontalPadding(int padding) {
        this.tabHorizontalPadding = padding;
        notifyDataChanged();
    }

    public final void setSelectedTab(int position) {
        setSelectedTab(position, false);
    }

    public final void setSelectedTab(int position, boolean notifyCallback) {
        int i;
        OnTabSelectedCallback onTabSelectedCallback;
        OnTabSelectedCallback onTabSelectedCallback2;
        if (position < 0 || position >= this.tabViews.size() || (i = this.selectedTab) == position) {
            return;
        }
        if (i >= 0 && i < this.tabViews.size()) {
            setTabUnselected(this.selectedTab);
            if (notifyCallback && (onTabSelectedCallback2 = this.callback) != null) {
                onTabSelectedCallback2.onTabUnselected(this, this.selectedTab);
            }
        }
        this.selectedTab = position;
        setTabSelected(position);
        if (!notifyCallback || (onTabSelectedCallback = this.callback) == null) {
            return;
        }
        onTabSelectedCallback.onTabSelected(this, this.selectedTab);
    }

    @Deprecated(message = "Data structure upgrade", replaceWith = @ReplaceWith(expression = "setNewDataSource(data)", imports = {}))
    public final void setDataSource(List<String> data) {
        Intrinsics.checkNotNullParameter(data, "");
        List<String> list = data;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new CommonTabItem((String) it.next(), null, 2, null));
        }
        setNewDataSource(arrayList);
    }

    public final void setNewDataSource(List<CommonTabItem> data) {
        Intrinsics.checkNotNullParameter(data, "");
        this.dataSource.clear();
        this.dataSource.addAll(data);
        notifyDataChanged();
    }

    public final void setCallback(OnTabSelectedCallback callback) {
        this.callback = callback;
    }

    public final void requestLayoutIfNeed() {
        int iIntValue = 0;
        for (CommonTabItemView commonTabItemView : this.tabViews) {
            Pair<Integer, Integer> tabItemWidth = getTabItemWidth(commonTabItemView);
            iIntValue += tabItemWidth.getFirst().intValue();
            CommonTabItemView commonTabItemView2 = commonTabItemView;
            ViewGroup.LayoutParams layoutParams = commonTabItemView2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = getTabItemParamWidth(tabItemWidth);
                commonTabItemView2.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        int size = iIntValue + (this.horizontalMargin * 2);
        if (supportOversize()) {
            size += this.itemSpacing * (this.dataSource.size() - 1);
        }
        reLayoutIfNeed(size);
        if (supportOversize()) {
            LinearLayout linearLayout = null;
            if (size < getWidth() && this.isOversize) {
                this.isOversize = false;
                HorizontalScrollView horizontalScrollView = this.scrollView;
                if (horizontalScrollView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    horizontalScrollView = null;
                }
                LinearLayout linearLayout2 = this.contentLayout;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    linearLayout2 = null;
                }
                horizontalScrollView.removeView(linearLayout2);
                LinearLayout linearLayout3 = this.contentLayout;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    linearLayout = linearLayout3;
                }
                addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            if (size <= getWidth() || this.isOversize) {
                return;
            }
            this.isOversize = true;
            LinearLayout linearLayout4 = this.contentLayout;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout4 = null;
            }
            removeView(linearLayout4);
            HorizontalScrollView horizontalScrollView2 = this.scrollView;
            if (horizontalScrollView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                horizontalScrollView2 = null;
            }
            LinearLayout linearLayout5 = this.contentLayout;
            if (linearLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout = linearLayout5;
            }
            horizontalScrollView2.addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        }
    }

    private final void setTabSelected(int position) {
        CommonTabItemView commonTabItemView = (CommonTabItemView) CollectionsKt.getOrNull(this.tabViews, position);
        if (commonTabItemView != null) {
            commonTabItemView.getTitleView().setTextColor(this.selectedTextColor);
            commonTabItemView.getIndicator().setVisibility(0);
        }
    }

    private final void setTabUnselected(int position) {
        CommonTabItemView commonTabItemView = (CommonTabItemView) CollectionsKt.getOrNull(this.tabViews, position);
        if (commonTabItemView != null) {
            commonTabItemView.getTitleView().setTextColor(this.unselectedTextColor);
            commonTabItemView.getIndicator().setVisibility(8);
        }
    }

    private final void onItemClick(int position) {
        setSelectedTab(position, true);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.layoutItemIfNeed) {
            this.layoutItemIfNeed = false;
            layoutItem();
        }
    }

    private final void layoutItem() {
        LinearLayout linearLayout;
        L.d(TAG, "layoutItem view width: " + getWidth() + "  dataSource: " + this.dataSource);
        int size = this.dataSource.size();
        int i = 0;
        int iIntValue = 0;
        while (true) {
            linearLayout = null;
            if (i >= size) {
                break;
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            CommonTabItemView commonTabItemView = new CommonTabItemView(context);
            CommonTabItem commonTabItem = this.dataSource.get(i);
            setTabIcon(commonTabItemView, commonTabItem);
            setTabText(commonTabItemView, commonTabItem);
            setIndicator(commonTabItemView);
            Pair<Integer, Integer> tabItemWidth = getTabItemWidth(commonTabItemView);
            iIntValue += tabItemWidth.getFirst().intValue();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getTabItemParamWidth(tabItemWidth), -1);
            if (i > 0 && i < this.dataSource.size()) {
                layoutParams.setMarginStart(this.itemSpacing);
            }
            if (this.itemGravity == ItemGravity.FLAT) {
                layoutParams.weight = 1.0f;
            }
            commonTabItemView.setTag(Integer.valueOf(i));
            commonTabItemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    CommonTabView.m10060instrumented$0$layoutItem$V(this.f$0, view);
                }
            });
            LinearLayout linearLayout2 = this.contentLayout;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout = linearLayout2;
            }
            linearLayout.addView(commonTabItemView, layoutParams);
            this.tabViews.add(commonTabItemView);
            i++;
        }
        int size2 = iIntValue + (this.horizontalMargin * 2);
        if (supportOversize()) {
            size2 += this.itemSpacing * (this.dataSource.size() - 1);
        }
        reLayoutIfNeed(size2);
        if (supportOversize() && size2 > getWidth()) {
            this.isOversize = true;
            HorizontalScrollView horizontalScrollView = this.scrollView;
            if (horizontalScrollView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                horizontalScrollView = null;
            }
            LinearLayout linearLayout3 = this.contentLayout;
            if (linearLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout = linearLayout3;
            }
            horizontalScrollView.addView(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        } else {
            this.isOversize = false;
            LinearLayout linearLayout4 = this.contentLayout;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout = linearLayout4;
            }
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        }
        setSelectedTab(0, true);
    }

    private static final void layoutItem$lambda$13(CommonTabView commonTabView, View view) {
        Object tag = view.getTag();
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        if (num != null) {
            commonTabView.onItemClick(num.intValue());
        }
    }

    private final void reLayoutIfNeed(int contentWidth) {
        if (this.itemGravity != ItemGravity.SPREAD_INSIDE || contentWidth > getWidth()) {
            return;
        }
        int width = (getWidth() - contentWidth) / (this.dataSource.size() - 1);
        int size = this.tabViews.size();
        for (int i = 0; i < size; i++) {
            CommonTabItemView commonTabItemView = this.tabViews.get(i);
            if (i != 0) {
                CommonTabItemView commonTabItemView2 = commonTabItemView;
                ViewGroup.LayoutParams layoutParams = commonTabItemView2.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(width);
                    commonTabItemView2.setLayoutParams(marginLayoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
        }
    }

    private final boolean supportOversize() {
        return (this.itemGravity == ItemGravity.FLAT || this.itemGravity == ItemGravity.SPREAD_INSIDE) ? false : true;
    }

    private final int getTabItemParamWidth(Pair<Integer, Integer> itemWidth) {
        if (this.itemGravity == ItemGravity.FLAT) {
            return 0;
        }
        if (itemWidth.getSecond().intValue() > getWidth() / 2) {
            return itemWidth.getFirst().intValue();
        }
        return -2;
    }

    private final Pair<Integer, Integer> getTabItemWidth(CommonTabItemView tab) {
        tab.measure(0, 0);
        int measuredWidth = tab.getMeasuredWidth();
        return new Pair<>(Integer.valueOf(measuredWidth > getWidth() / 2 ? getWidth() / 2 : measuredWidth), Integer.valueOf(measuredWidth));
    }

    private final void setTabText(CommonTabItemView itemView, CommonTabItem tabItem) {
        itemView.getTitleView().setTextSize(this.tabTextSize);
        itemView.getTitleView().setText(tabItem.getTitle());
        itemView.getTitleView().setTextColor(this.unselectedTextColor);
        TextView titleView = itemView.getTitleView();
        ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.setMarginEnd(this.tabHorizontalPadding);
        if (itemView.getIconView().getVisibility() != 0) {
            marginLayoutParams2.setMarginStart(this.tabHorizontalPadding);
        }
        titleView.setLayoutParams(marginLayoutParams);
    }

    private final void setTabIcon(CommonTabItemView itemView, CommonTabItem tabItem) {
        updateTabIconMargin(itemView);
        updateTabIconSize(itemView);
        String icon = tabItem.getIcon();
        if (icon == null || icon.length() == 0) {
            return;
        }
        itemView.getIconView().setVisibility(0);
        IImageInterface.DefaultImpls.load$default(ImageInterfaceManager.INSTANCE.getImageInterface(), itemView.getIconView(), tabItem.getIcon(), null, 4, null);
    }

    private final void setIndicator(CommonTabItemView itemView) {
        itemView.getIndicator().setBackgroundColor(this.indicatorColor);
        updateIndicatorCorner(itemView);
        updateIndicatorWidthStyle(itemView);
        updateIndicatorWidth(itemView);
        updateIndicatorHeight(itemView);
        updateIndicatorMargin(itemView);
    }

    private final void notifyDataChanged() {
        this.selectedTab = -1;
        this.tabViews.clear();
        LinearLayout linearLayout = this.contentLayout;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout3 = this.contentLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout3 = null;
        }
        removeView(linearLayout3);
        HorizontalScrollView horizontalScrollView = this.scrollView;
        if (horizontalScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            horizontalScrollView = null;
        }
        LinearLayout linearLayout4 = this.contentLayout;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout2 = linearLayout4;
        }
        horizontalScrollView.removeView(linearLayout2);
        this.layoutItemIfNeed = true;
        requestLayout();
    }

    private final void initView(Context context) {
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.scrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        HorizontalScrollView horizontalScrollView2 = this.scrollView;
        LinearLayout linearLayout = null;
        if (horizontalScrollView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            horizontalScrollView2 = null;
        }
        addView(horizontalScrollView2, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.contentLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.contentLayout;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout = linearLayout3;
        }
        int i = this.horizontalMargin;
        linearLayout.setPadding(i, 0, i, 0);
    }

    public static void m10060instrumented$0$layoutItem$V(CommonTabView commonTabView, View view) {
        Callback.onClick_enter(view);
        try {
            layoutItem$lambda$13(commonTabView, view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
