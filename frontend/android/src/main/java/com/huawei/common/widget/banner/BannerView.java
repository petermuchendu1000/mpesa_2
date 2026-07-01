package com.huawei.common.widget.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pools;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.griver.beehive.lottie.player.LottieParams;
import com.alibaba.griver.core.GriverParams;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.image.IImageInterface;
import com.huawei.common.image.ImageInterfaceManager;
import com.huawei.common.widget.banner.BannerView;
import com.huawei.common.widget.round.RoundConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0006XYZ[\\]B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\u000eJ\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u001f\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u00100J\u000e\u00101\u001a\u00020-2\u0006\u00102\u001a\u00020\u000bJ\u0016\u00101\u001a\u00020-2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000bJ\u000e\u00105\u001a\u00020-2\u0006\u0010&\u001a\u00020\u000bJ\u0016\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015J3\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00152\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010;J\u0016\u0010<\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020\u000bJ\u001a\u0010>\u001a\u00020-2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J*\u0010?\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010@\u001a\u00020-2\u0006\u0010\u000f\u001a\u00020\u000bJ\u0010\u0010A\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J*\u0010B\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0018\u0010C\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010D\u001a\u00020\u000bH\u0002J\u0016\u0010E\u001a\u00020-2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GJ\u000e\u0010I\u001a\u00020-2\u0006\u0010J\u001a\u00020KJ\u0010\u0010L\u001a\u00020-2\b\u0010M\u001a\u0004\u0018\u00010NJ\b\u0010O\u001a\u00020-H\u0002J\u0018\u0010P\u001a\u00020-2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010GH\u0002J\b\u0010Q\u001a\u00020RH\u0002J\b\u0010S\u001a\u00020-H\u0002J\b\u0010T\u001a\u00020-H\u0014J\b\u0010U\u001a\u00020-H\u0002J\b\u0010V\u001a\u00020-H\u0014J\b\u0010W\u001a\u00020-H\u0016R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "Ljava/lang/Runnable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "layoutId", "bannerIndicatorMarginStart", "bannerIndicatorMarginEnd", "bannerIndicatorMarginTop", "bannerIndicatorMarginBottom", "indicatorNormalDrawable", "Landroid/graphics/drawable/Drawable;", "indicatorSelectDrawable", "indicatorNormalUrl", "", "indicatorSelectUrl", "indicatorHeight", "indicatorSelectDrawableColor", "Ljava/lang/Integer;", "indicatorNormalDrawableColor", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "cycleIndicator", "Landroid/widget/LinearLayout;", "bannerAdapter", "Lcom/huawei/common/widget/banner/BannerView$BannerAdapter;", "bannerItemMarginStart", "bannerItemMarginEnd", "bannerItemRoundCorner", "ratio", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "setConstraintDimensionRatio", "", "width", "height", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setBannerItemMargin", "margin", "marginStart", "marginEnd", "setBannerRoundCorner", "setIndicatorDrawable", "normal", "select", "normalColor", "selectColor", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setIndicatorConfig", "indicatorSpacing", "setIndicatorUrl", "init", "setLayoutId", "initViews", "initAttr", "getDrawable", "drawableId", "setData", "banners", "", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "setImageLoader", "imageLoader", "Lcom/huawei/common/widget/banner/BannerView$IImageLoader;", "setBannerClickListener", "bannerClickListener", "Lcom/huawei/common/widget/banner/BannerView$IBannerClickListener;", "updateBannerIndicators", "initBannerIndicators", "createBannerIndicators", "Landroid/widget/ImageView;", "stopLooper", "onAttachedToWindow", "startLopper", "onDetachedFromWindow", "run", "BannerAdapter", "BannerBean", "DefaultImageLoader", "IImageLoader", "IBannerClickListener", "Companion", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerView extends RoundConstraintLayout implements Runnable {
    private static final String DEFAULT_RATIO = "h,336:80";
    private static final String TAG = "BannerView";
    private BannerAdapter bannerAdapter;
    private int bannerIndicatorMarginBottom;
    private int bannerIndicatorMarginEnd;
    private int bannerIndicatorMarginStart;
    private int bannerIndicatorMarginTop;
    private int bannerItemMarginEnd;
    private int bannerItemMarginStart;
    private int bannerItemRoundCorner;
    private LinearLayout cycleIndicator;
    private int indicatorHeight;
    private Drawable indicatorNormalDrawable;
    private Integer indicatorNormalDrawableColor;
    private String indicatorNormalUrl;
    private Drawable indicatorSelectDrawable;
    private Integer indicatorSelectDrawableColor;
    private String indicatorSelectUrl;
    private int layoutId;
    private String ratio;
    private ViewPager viewPager;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "", GriverParams.ShareParams.IMAGE_URL, "", "delayTime", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface BannerBean {
        String delayTime();

        String imageUrl();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView$IBannerClickListener;", "", "onBannerClick", "", "position", "", "banner", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IBannerClickListener {
        void onBannerClick(int position, BannerBean banner);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView$IImageLoader;", "", "loadImage", "", "imageView", "Landroid/widget/ImageView;", "banner", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IImageLoader {
        void loadImage(ImageView imageView, BannerBean banner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.layoutId = R.layout.banner_view_layout;
        this.indicatorHeight = -2;
        this.ratio = DEFAULT_RATIO;
        init(context, attributeSet, i, i2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev != null && ev.getAction() == 0) {
            stopLooper();
        } else if ((ev != null && ev.getAction() == 1) || (ev != null && ev.getAction() == 3)) {
            startLopper();
        }
        return super.dispatchTouchEvent(ev);
    }

    public final void setConstraintDimensionRatio(Integer width, Integer height) {
        if (width == null || height == null || width.intValue() == 0 || height.intValue() == 0) {
            return;
        }
        this.ratio = "h," + Math.abs(width.intValue()) + ":" + Math.abs(height.intValue());
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setRatio(this.ratio);
    }

    public final void setBannerItemMargin(int margin) {
        this.bannerItemMarginStart = margin;
        this.bannerItemMarginEnd = margin;
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setBannerItemMargin(margin);
    }

    public final void setBannerItemMargin(int marginStart, int marginEnd) {
        this.bannerItemMarginStart = marginStart;
        this.bannerItemMarginEnd = marginEnd;
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setBannerItemMargin(marginStart, marginEnd);
    }

    public final void setBannerRoundCorner(int bannerItemRoundCorner) {
        this.bannerItemRoundCorner = bannerItemRoundCorner;
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setBannerRoundCorner(bannerItemRoundCorner);
    }

    public final void setIndicatorDrawable(Drawable normal, Drawable select) {
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(select, "");
        this.indicatorNormalDrawable = normal;
        this.indicatorSelectDrawable = select;
        this.indicatorNormalUrl = null;
        this.indicatorSelectUrl = null;
        updateBannerIndicators();
    }

    public static void setIndicatorDrawable$default(BannerView bannerView, Drawable drawable, Drawable drawable2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num2 = null;
        }
        bannerView.setIndicatorDrawable(drawable, drawable2, num, num2);
    }

    public final void setIndicatorDrawable(Drawable normal, Drawable select, Integer normalColor, Integer selectColor) {
        Intrinsics.checkNotNullParameter(normal, "");
        Intrinsics.checkNotNullParameter(select, "");
        this.indicatorNormalDrawable = normal;
        this.indicatorSelectDrawable = select;
        this.indicatorNormalDrawableColor = normalColor;
        this.indicatorSelectDrawableColor = selectColor;
        this.indicatorNormalUrl = null;
        this.indicatorSelectUrl = null;
        updateBannerIndicators();
    }

    public final void setIndicatorConfig(int indicatorHeight, int indicatorSpacing) {
        if (indicatorHeight > 0) {
            this.indicatorHeight = indicatorHeight;
        }
        if (indicatorSpacing > 0) {
            int i = indicatorSpacing / 2;
            this.bannerIndicatorMarginStart = i;
            this.bannerIndicatorMarginEnd = i;
        }
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        initBannerIndicators(bannerAdapter.getBanners());
        updateBannerIndicators();
    }

    public final void setIndicatorUrl(String indicatorNormalUrl, String indicatorSelectUrl) {
        this.indicatorNormalDrawable = null;
        this.indicatorSelectDrawable = null;
        this.indicatorNormalUrl = indicatorNormalUrl;
        this.indicatorSelectUrl = indicatorSelectUrl;
        updateBannerIndicators();
    }

    private final void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        initAttr(context, attrs, defStyleAttr, defStyleRes);
        initViews(context);
    }

    public final void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        initViews(context);
    }

    private final void initViews(Context context) {
        ViewPager viewPager;
        removeAllViews();
        LayoutInflater.from(context).inflate(this.layoutId, (ViewGroup) this, true);
        this.viewPager = (ViewPager) findViewById(R.id.cycleViewPager);
        this.cycleIndicator = (LinearLayout) findViewById(R.id.cycleIndicator);
        ViewPager viewPager2 = this.viewPager;
        ViewPager viewPager3 = null;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager = null;
        } else {
            viewPager = viewPager2;
        }
        this.bannerAdapter = new BannerAdapter(context, viewPager, this.bannerItemMarginStart, this.bannerItemMarginEnd, this.bannerItemRoundCorner, null, null, 96, null);
        ViewPager viewPager4 = this.viewPager;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager4 = null;
        }
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        viewPager4.setAdapter(bannerAdapter);
        ViewPager viewPager5 = this.viewPager;
        if (viewPager5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            viewPager3 = viewPager5;
        }
        viewPager3.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                Callback.onPageSelected_enter(position);
                try {
                    BannerView.this.updateBannerIndicators();
                } finally {
                    Callback.onPageSelected_exit();
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                if (state == 0) {
                    BannerAdapter bannerAdapter2 = BannerView.this.bannerAdapter;
                    ViewPager viewPager6 = null;
                    BannerAdapter bannerAdapter3 = null;
                    if (bannerAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        bannerAdapter2 = null;
                    }
                    if (bannerAdapter2.getCount() > 1) {
                        ViewPager viewPager7 = BannerView.this.viewPager;
                        if (viewPager7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            viewPager7 = null;
                        }
                        int currentItem = viewPager7.getCurrentItem();
                        if (currentItem == 0) {
                            ViewPager viewPager8 = BannerView.this.viewPager;
                            if (viewPager8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                viewPager8 = null;
                            }
                            BannerAdapter bannerAdapter4 = BannerView.this.bannerAdapter;
                            if (bannerAdapter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            } else {
                                bannerAdapter3 = bannerAdapter4;
                            }
                            viewPager8.setCurrentItem(bannerAdapter3.getCount() - 2, false);
                        } else {
                            BannerAdapter bannerAdapter5 = BannerView.this.bannerAdapter;
                            if (bannerAdapter5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                                bannerAdapter5 = null;
                            }
                            if (currentItem == bannerAdapter5.getCount() - 1) {
                                ViewPager viewPager9 = BannerView.this.viewPager;
                                if (viewPager9 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                } else {
                                    viewPager6 = viewPager9;
                                }
                                viewPager6.setCurrentItem(1, false);
                            }
                        }
                        BannerView.this.startLopper();
                    }
                }
            }
        });
    }

    private final void initAttr(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.BannerView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.layoutId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BannerView_banner_layout, this.layoutId);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_banner_item_margin, 0);
        this.bannerItemMarginStart = dimensionPixelOffset;
        this.bannerItemMarginEnd = dimensionPixelOffset;
        this.bannerItemRoundCorner = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_banner_item_roundCorner, context.getResources().getDimensionPixelOffset(R.dimen.level2));
        this.bannerIndicatorMarginStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_bannerIndicatorMarginStart, this.bannerIndicatorMarginStart);
        this.bannerIndicatorMarginEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_bannerIndicatorMarginEnd, this.bannerIndicatorMarginEnd);
        this.bannerIndicatorMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_bannerIndicatorMarginTop, this.bannerIndicatorMarginTop);
        this.bannerIndicatorMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.BannerView_bannerIndicatorMarginBottom, this.bannerIndicatorMarginBottom);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BannerView_banner_indicator_normal_drawable);
        if (drawable == null) {
            drawable = getDrawable(context, R.drawable.default_banner_indicator_normal);
        }
        this.indicatorNormalDrawable = drawable;
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.BannerView_banner_indicator_select_drawable);
        if (drawable2 == null) {
            drawable2 = getDrawable(context, R.drawable.default_banner_indicator_select);
        }
        this.indicatorSelectDrawable = drawable2;
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BannerView_banner_indicator_normal_color)) {
            this.indicatorNormalDrawableColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.BannerView_banner_indicator_normal_color, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R.styleable.BannerView_banner_indicator_select_color)) {
            this.indicatorSelectDrawableColor = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(R.styleable.BannerView_banner_indicator_normal_color, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private final Drawable getDrawable(Context context, int drawableId) {
        Drawable drawable = ContextCompat.getDrawable(context, drawableId);
        Intrinsics.checkNotNull(drawable);
        return drawable;
    }

    public final void setData(List<? extends BannerBean> banners) {
        stopLooper();
        BannerAdapter bannerAdapter = this.bannerAdapter;
        ViewPager viewPager = null;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.update(banners);
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager2 = null;
        }
        BannerAdapter bannerAdapter2 = this.bannerAdapter;
        if (bannerAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter2 = null;
        }
        viewPager2.setOffscreenPageLimit(bannerAdapter2.getCount());
        BannerAdapter bannerAdapter3 = this.bannerAdapter;
        if (bannerAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter3 = null;
        }
        if (bannerAdapter3.getCount() > 1) {
            ViewPager viewPager3 = this.viewPager;
            if (viewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                viewPager = viewPager3;
            }
            viewPager.setCurrentItem(1, false);
        }
        initBannerIndicators(banners);
        updateBannerIndicators();
        startLopper();
    }

    public final void setImageLoader(IImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "");
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setImageLoader(imageLoader);
    }

    public final void setBannerClickListener(IBannerClickListener bannerClickListener) {
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        bannerAdapter.setBannerClickListener(bannerClickListener);
    }

    public final void updateBannerIndicators() {
        BannerAdapter bannerAdapter = this.bannerAdapter;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        ViewPager viewPager = this.viewPager;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager = null;
        }
        int realCurrent = bannerAdapter.getRealCurrent(viewPager.getCurrentItem());
        LinearLayout linearLayout = this.cycleIndicator;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout2 = this.cycleIndicator;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                linearLayout2 = null;
            }
            View childAt = linearLayout2.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "");
            ImageView imageView = (ImageView) childAt;
            if (i != realCurrent) {
                if (this.indicatorNormalDrawable != null) {
                    Integer num = this.indicatorNormalDrawableColor;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Drawable drawable = this.indicatorNormalDrawable;
                        if (drawable != null) {
                            drawable.setColorFilter(iIntValue, PorterDuff.Mode.SRC_ATOP);
                        }
                    }
                    imageView.setImageDrawable(this.indicatorNormalDrawable);
                } else {
                    IImageInterface.DefaultImpls.load$default(ImageInterfaceManager.INSTANCE.getImageInterface(), imageView, this.indicatorNormalUrl, null, 4, null);
                }
            } else if (this.indicatorSelectDrawable != null) {
                Integer num2 = this.indicatorSelectDrawableColor;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    Drawable drawable2 = this.indicatorSelectDrawable;
                    if (drawable2 != null) {
                        drawable2.setColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP);
                    }
                }
                imageView.setImageDrawable(this.indicatorSelectDrawable);
            } else {
                IImageInterface.DefaultImpls.load$default(ImageInterfaceManager.INSTANCE.getImageInterface(), imageView, this.indicatorSelectUrl, null, 4, null);
            }
        }
    }

    private final void initBannerIndicators(List<? extends BannerBean> banners) {
        LinearLayout linearLayout = this.cycleIndicator;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        if (CollectionUtils.isNotEmpty(banners)) {
            Intrinsics.checkNotNull(banners);
            for (BannerBean bannerBean : banners) {
                LinearLayout linearLayout3 = this.cycleIndicator;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    linearLayout3 = null;
                }
                linearLayout3.addView(createBannerIndicators());
            }
        }
        if (banners == null || banners.size() <= 1) {
            LinearLayout linearLayout4 = this.cycleIndicator;
            if (linearLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                linearLayout2 = linearLayout4;
            }
            linearLayout2.setVisibility(8);
            return;
        }
        LinearLayout linearLayout5 = this.cycleIndicator;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            linearLayout2 = linearLayout5;
        }
        linearLayout2.setVisibility(0);
    }

    private final ImageView createBannerIndicators() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.indicatorHeight);
        layoutParams.setMargins(this.bannerIndicatorMarginStart, this.bannerIndicatorMarginTop, this.bannerIndicatorMarginEnd, this.bannerIndicatorMarginBottom);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private final void stopLooper() {
        ThreadUtils.getMainHandler().removeCallbacks(this);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        startLopper();
    }

    public final void startLopper() {
        String strDelayTime;
        stopLooper();
        BannerAdapter bannerAdapter = this.bannerAdapter;
        BannerAdapter bannerAdapter2 = null;
        if (bannerAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            bannerAdapter = null;
        }
        if (bannerAdapter.getCount() > 1) {
            ViewPager viewPager = this.viewPager;
            if (viewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                viewPager = null;
            }
            int currentItem = viewPager.getCurrentItem();
            BannerAdapter bannerAdapter3 = this.bannerAdapter;
            if (bannerAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                bannerAdapter3 = null;
            }
            BannerAdapter bannerAdapter4 = this.bannerAdapter;
            if (bannerAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                bannerAdapter2 = bannerAdapter4;
            }
            try {
                strDelayTime = bannerAdapter3.getItem(currentItem % bannerAdapter2.getCount()).delayTime();
            } catch (Exception unused) {
            }
            long j = strDelayTime != null ? Long.parseLong(strDelayTime) : 5L;
            ThreadUtils.getMainHandler().postDelayed(this, j * ((long) 1000));
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopLooper();
    }

    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0007J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\u0007J\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0016\u0010\"\u001a\u00020\u001c2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010'\u001a\u00020\u0018J\u0010\u0010(\u001a\u00020\u001c2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0018\u0010)\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\fH\u0002J\u000e\u0010+\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0007J\b\u0010,\u001a\u00020\u0007H\u0016J\u0018\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u0002042\u0006\u0010%\u001a\u00020\u00072\u0006\u00100\u001a\u000201H\u0016J\u0018\u00105\u001a\u0002012\u0006\u00103\u001a\u0002042\u0006\u0010%\u001a\u00020\u0007H\u0016J\u0010\u00106\u001a\u00020\u00072\u0006\u00100\u001a\u000201H\u0016J\u000e\u00107\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView$BannerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "viewPager", "Landroidx/viewpager/widget/ViewPager;", "bannerItemMarginStart", "", "bannerItemMarginEnd", "bannerItemRoundCorner", "banners", "", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "views", "Landroid/view/View;", "<init>", "(Landroid/content/Context;Landroidx/viewpager/widget/ViewPager;IIILjava/util/List;Ljava/util/List;)V", "ratio", "", "bannerClickListener", "Lcom/huawei/common/widget/banner/BannerView$IBannerClickListener;", "defaultImageLoader", "Lcom/huawei/common/widget/banner/BannerView$DefaultImageLoader;", "imageLoader", "Lcom/huawei/common/widget/banner/BannerView$IImageLoader;", "pool", "Landroidx/core/util/Pools$Pool;", "setBannerItemMargin", "", "margin", "marginStart", "marginEnd", "setBannerRoundCorner", "getBanners", "update", "", "getRealCurrent", "position", "setImageLoader", "getImageLoader", "setBannerClickListener", "newImageView", "bannerBean", "getItem", "getCount", "isViewFromObject", "", "view", "object", "", "destroyItem", "container", "Landroid/view/ViewGroup;", "instantiateItem", "getItemPosition", "setRatio", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class BannerAdapter extends PagerAdapter {
        private List<BannerBean> ShareDataUIState;
        private int component1;
        private int component2;
        private int component3;
        private Context component4;
        private final DefaultImageLoader copy;
        private IBannerClickListener copydefault;
        private final Pools.Pool<View> equals;
        private IImageLoader getAsAtTimestamp;
        private String getRequestBeneficiariesState;
        private ViewPager getSponsorBeneficiariesState;
        private List<View> toString;

        public BannerAdapter(Context context, ViewPager viewPager, int i, int i2, int i3, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, viewPager, i, i2, i3, (i4 & 32) != 0 ? new ArrayList() : list, (i4 & 64) != 0 ? new ArrayList() : list2);
        }

        public BannerAdapter(Context context, ViewPager viewPager, int i, int i2, int i3, List<BannerBean> list, List<View> list2) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(viewPager, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.component4 = context;
            this.getSponsorBeneficiariesState = viewPager;
            this.component2 = i;
            this.component1 = i2;
            this.component3 = i3;
            this.ShareDataUIState = list;
            this.toString = list2;
            this.getRequestBeneficiariesState = BannerView.DEFAULT_RATIO;
            DefaultImageLoader defaultImageLoader = new DefaultImageLoader(context, i3);
            this.copy = defaultImageLoader;
            this.getAsAtTimestamp = defaultImageLoader;
            this.equals = new Pools.SimplePool(5);
        }

        public final void setBannerItemMargin(int margin) {
            this.component2 = margin;
            this.component1 = margin;
        }

        public final void setBannerItemMargin(int marginStart, int marginEnd) {
            this.component2 = marginStart;
            this.component1 = marginEnd;
        }

        public final void setBannerRoundCorner(int bannerItemRoundCorner) {
            this.component3 = bannerItemRoundCorner;
            this.copy.setBannerRoundCorner(bannerItemRoundCorner);
        }

        public final List<BannerBean> getBanners() {
            return this.ShareDataUIState;
        }

        public final void update(List<? extends BannerBean> banners) {
            this.ShareDataUIState = new ArrayList(banners != null ? banners : CollectionsKt.emptyList());
            ArrayList arrayList = new ArrayList();
            if (banners != null && banners.size() > 1) {
                this.ShareDataUIState.add(0, banners.get(banners.size() - 1));
                this.ShareDataUIState.add(banners.get(0));
            }
            int size = this.ShareDataUIState.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(copydefault(this.component4, this.ShareDataUIState.get(i)));
            }
            this.toString = arrayList;
            notifyDataSetChanged();
        }

        public final int getRealCurrent(int position) {
            int count = getCount();
            if (count <= 1) {
                return position;
            }
            if (position == 0) {
                return count - 3;
            }
            if (position == count - 1) {
                return 0;
            }
            return position - 1;
        }

        public final void setImageLoader(IImageLoader imageLoader) {
            Intrinsics.checkNotNullParameter(imageLoader, "");
            this.getAsAtTimestamp = imageLoader;
        }

        public final IImageLoader getGetAsAtTimestamp() {
            return this.getAsAtTimestamp;
        }

        public final void setBannerClickListener(IBannerClickListener bannerClickListener) {
            this.copydefault = bannerClickListener;
        }

        private final View copydefault(Context context, BannerBean bannerBean) {
            final View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_banner_view_layout, (ViewGroup) null, false);
            final ImageView imageView = (ImageView) viewInflate.findViewById(R.id.imageView);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(this.component2);
            marginLayoutParams.setMarginEnd(this.component1);
            IImageLoader iImageLoader = this.getAsAtTimestamp;
            Intrinsics.checkNotNull(imageView);
            iImageLoader.loadImage(imageView, bannerBean);
            imageView.setTag(bannerBean);
            Intrinsics.checkNotNull(viewInflate, "");
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            ConstraintSet constraintSet = new ConstraintSet();
            constraintSet.clone(constraintLayout);
            constraintSet.setDimensionRatio(R.id.imageView, this.getRequestBeneficiariesState);
            constraintSet.applyTo(constraintLayout);
            imageView.post(new Runnable() {
                @Override
                public final void run() {
                    BannerView.BannerAdapter.ShareDataUIState(viewInflate, imageView);
                }
            });
            return viewInflate;
        }

        public static final void ShareDataUIState(View view, ImageView imageView) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.height = imageView.getHeight();
            constraintLayout.setLayoutParams(layoutParams);
        }

        public final BannerBean getItem(int position) {
            return this.ShareDataUIState.get(position);
        }

        @Override
        public int getCount() {
            return this.toString.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            Intrinsics.checkNotNullParameter(view, "");
            Intrinsics.checkNotNullParameter(object, "");
            return Intrinsics.areEqual(view, object);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            Intrinsics.checkNotNullParameter(container, "");
            Intrinsics.checkNotNullParameter(object, "");
            container.removeView((View) object);
            this.equals.release(object);
        }

        @Override
        public Object instantiateItem(ViewGroup container, final int position) {
            Intrinsics.checkNotNullParameter(container, "");
            View viewAcquire = this.equals.acquire();
            if (viewAcquire == null) {
                viewAcquire = copydefault(this.component4, this.ShareDataUIState.get(position));
            }
            final ImageView imageView = (ImageView) viewAcquire.findViewById(R.id.imageView);
            if (this.getSponsorBeneficiariesState.getHeight() <= 0) {
                imageView.post(new Runnable() {
                    @Override
                    public final void run() {
                        BannerView.BannerAdapter.component2(this.f$0, imageView);
                    }
                });
            }
            imageView.setImageBitmap(null);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BannerView.BannerAdapter.copydefault(this.f$0, position, view);
                }
            });
            IImageLoader iImageLoader = this.getAsAtTimestamp;
            Intrinsics.checkNotNull(imageView);
            iImageLoader.loadImage(imageView, this.ShareDataUIState.get(position));
            container.addView(viewAcquire);
            return viewAcquire;
        }

        public static final void component2(BannerAdapter bannerAdapter, ImageView imageView) {
            bannerAdapter.getSponsorBeneficiariesState.getLayoutParams().height = imageView.getHeight();
        }

        private static final void component3(BannerAdapter bannerAdapter, int i, View view) {
            IBannerClickListener iBannerClickListener = bannerAdapter.copydefault;
            if (iBannerClickListener != null) {
                iBannerClickListener.onBannerClick(bannerAdapter.getRealCurrent(i), bannerAdapter.ShareDataUIState.get(i));
            }
        }

        public final void setRatio(String ratio) {
            Intrinsics.checkNotNullParameter(ratio, "");
            this.getRequestBeneficiariesState = ratio;
        }

        public static void copydefault(BannerAdapter bannerAdapter, int i, View view) {
            Callback.onClick_enter(view);
            try {
                component3(bannerAdapter, i, view);
            } finally {
                Callback.onClick_exit();
            }
        }

        @Override
        public int getItemPosition(Object object) {
            Intrinsics.checkNotNullParameter(object, "");
            return -2;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/common/widget/banner/BannerView$DefaultImageLoader;", "Lcom/huawei/common/widget/banner/BannerView$IImageLoader;", "context", "Landroid/content/Context;", "bannerItemRoundCorner", "", "<init>", "(Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", LottieParams.KEY_PLACEHOLDER, "setBannerRoundCorner", "", "loadImage", "imageView", "Landroid/widget/ImageView;", "banner", "Lcom/huawei/common/widget/banner/BannerView$BannerBean;", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImageLoader implements IImageLoader {
        private final int component1;
        private final Context component2;
        private int component3;

        public DefaultImageLoader(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            this.component2 = context;
            this.component3 = i;
            this.component1 = R.drawable.icon_banner_placeholder;
        }

        public final Context getComponent2() {
            return this.component2;
        }

        public final void setBannerRoundCorner(int bannerItemRoundCorner) {
            this.component3 = bannerItemRoundCorner;
        }

        @Override
        public void loadImage(ImageView imageView, BannerBean banner) {
            RequestOptions requestOptions;
            Intrinsics.checkNotNullParameter(imageView, "");
            Intrinsics.checkNotNullParameter(banner, "");
            if (this.component3 > 0) {
                RequestOptions requestOptionsTransform = new RequestOptions().placeholder(this.component1).error(this.component1).transform(new CenterCrop(), new RoundedCorners(this.component3));
                Intrinsics.checkNotNull(requestOptionsTransform);
                requestOptions = requestOptionsTransform;
            } else {
                RequestOptions requestOptionsTransform2 = new RequestOptions().placeholder(this.component1).error(this.component1).transform(new CenterCrop());
                Intrinsics.checkNotNull(requestOptionsTransform2);
                requestOptions = requestOptionsTransform2;
            }
            ImageInterfaceManager.INSTANCE.getImageInterface().load(imageView, banner.imageUrl(), requestOptions);
        }
    }

    @Override
    public void run() {
        ViewPager viewPager = this.viewPager;
        ViewPager viewPager2 = null;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            viewPager = null;
        }
        ViewPager viewPager3 = this.viewPager;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            viewPager2 = viewPager3;
        }
        viewPager.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
    }
}
