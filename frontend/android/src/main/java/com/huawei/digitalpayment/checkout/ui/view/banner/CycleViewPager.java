package com.huawei.digitalpayment.checkout.ui.view.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.util.L;
import com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu;
import com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager;
import com.huawei.digitalpayment.consumer.baselib.R;
import com.huawei.digitalpayment.consumer.baselib.util.DensityUtils;
import com.huawei.image.glide.ImageRequest;
import java.util.ArrayList;
import java.util.List;

public class CycleViewPager extends FrameLayout implements ViewPager.OnPageChangeListener, RatioMeasureDelegate {
    private static final int MOVE_TIME = 500;
    private static final String TAG = "CycleViewPager";
    private static final int WHEEL_ON = 100;
    private static final int WHEEL_WAIT = 101;
    private static int component2 = 1;
    private static int copydefault;
    private List<HomeDynamicMenu.DynamicItemBean> bannerInfoList;
    private int currentPosition;
    private ImageCycleViewListener imageCycleViewListener;
    private boolean isScrolling;
    private boolean isWheel;
    private ShareDataUIState mAdapter;
    private int mBannerLayout;
    private Context mContext;
    private Handler mHandler;
    private LinearLayout mIndicatorLayout;
    private int mIndicatorNormalColor;
    private int mIndicatorSelectColor;
    private ImageView[] mIndicators;
    private int mLastX;
    private int mLastY;
    private TextView mTitle;
    private ViewPager mViewPager;
    private List<View> mViews;
    private RatioLayoutDelegate ratioLayoutDelegate;
    private long releaseTime;
    final Runnable runnable;

    public interface ImageCycleViewListener {
        void onImageClick(HomeDynamicMenu.DynamicItemBean dynamicItemBean, int i, View view);
    }

    public CycleViewPager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mViews = new ArrayList();
        this.isScrolling = false;
        this.isWheel = true;
        this.currentPosition = 0;
        this.releaseTime = 0L;
        this.runnable = new Runnable() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void run() {
                int i3 = 2 % 2;
                if (CycleViewPager.m10147$$Nest$fgetmContext(CycleViewPager.this) != null) {
                    int i4 = component3 + 5;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        CycleViewPager.m10146$$Nest$fgetisWheel(CycleViewPager.this);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (CycleViewPager.m10146$$Nest$fgetisWheel(CycleViewPager.this)) {
                        if (System.currentTimeMillis() - CycleViewPager.m10150$$Nest$fgetreleaseTime(CycleViewPager.this) > (Integer.parseInt(((HomeDynamicMenu.DynamicItemBean) CycleViewPager.m10143$$Nest$fgetbannerInfoList(CycleViewPager.this).get(CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this) - 1)).getDelayTime()) * 1000) - 500) {
                            CycleViewPager.m10148$$Nest$fgetmHandler(CycleViewPager.this).sendEmptyMessage(100);
                            return;
                        }
                        CycleViewPager.m10148$$Nest$fgetmHandler(CycleViewPager.this).sendEmptyMessage(101);
                        int i5 = component1 + 101;
                        component3 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 4 % 4;
                        }
                    }
                }
            }
        };
        this.ratioLayoutDelegate = RatioLayoutDelegate.obtain(this, attributeSet, i, i2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = copydefault + 21;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            if (getParent() != null) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int action = motionEvent.getAction();
                if (action == 0) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else if (action == 2) {
                    if (Math.abs(x - this.mLastX) < Math.abs(y - this.mLastY)) {
                        int i3 = copydefault + 43;
                        component2 = i3 % 128;
                        if (i3 % 2 == 0) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                        } else {
                            getParent().requestDisallowInterceptTouchEvent(false);
                        }
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
                this.mLastX = x;
                this.mLastY = y;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        getParent();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CycleViewPager(Context context) {
        this(context, null);
    }

    public CycleViewPager(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.ratioLayoutDelegate = RatioLayoutDelegate.obtain(this, attributeSet);
    }

    public CycleViewPager(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mViews = new ArrayList();
        this.isScrolling = false;
        this.isWheel = true;
        this.currentPosition = 0;
        this.releaseTime = 0L;
        this.runnable = new Runnable() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public void run() {
                int i3 = 2 % 2;
                if (CycleViewPager.m10147$$Nest$fgetmContext(CycleViewPager.this) != null) {
                    int i4 = component3 + 5;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        CycleViewPager.m10146$$Nest$fgetisWheel(CycleViewPager.this);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (CycleViewPager.m10146$$Nest$fgetisWheel(CycleViewPager.this)) {
                        if (System.currentTimeMillis() - CycleViewPager.m10150$$Nest$fgetreleaseTime(CycleViewPager.this) > (Integer.parseInt(((HomeDynamicMenu.DynamicItemBean) CycleViewPager.m10143$$Nest$fgetbannerInfoList(CycleViewPager.this).get(CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this) - 1)).getDelayTime()) * 1000) - 500) {
                            CycleViewPager.m10148$$Nest$fgetmHandler(CycleViewPager.this).sendEmptyMessage(100);
                            return;
                        }
                        CycleViewPager.m10148$$Nest$fgetmHandler(CycleViewPager.this).sendEmptyMessage(101);
                        int i5 = component1 + 101;
                        component3 = i5 % 128;
                        if (i5 % 2 != 0) {
                            int i6 = 4 % 4;
                        }
                    }
                }
            }
        };
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CycleViewPager);
        this.mBannerLayout = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CycleViewPager_banner_layout, R.layout.home_banner_cycle_view);
        this.mIndicatorSelectColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CycleViewPager_banner_indicator_select_color, ContextCompat.getColor(context, R.color.common_colorBlack));
        this.mIndicatorNormalColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CycleViewPager_banner_indicator_normal_color, Color.parseColor("#e9e9e9"));
        typedArrayObtainStyledAttributes.recycle();
        this.mContext = context;
        initView();
        this.ratioLayoutDelegate = RatioLayoutDelegate.obtain(this, attributeSet, i);
    }

    private void initView() {
        int i = 2 % 2;
        LayoutInflater.from(this.mContext).inflate(this.mBannerLayout, (ViewGroup) this, true);
        this.mViewPager = (ViewPager) findViewById(R.id.cycle_view_pager);
        this.mTitle = (TextView) findViewById(R.id.cycle_title);
        this.mIndicatorLayout = (LinearLayout) findViewById(R.id.cycle_indicator);
        this.mHandler = new Handler() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void handleMessage(Message message) {
                int i2 = 2 % 2;
                int i3 = component1 + 115;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    super.handleMessage(message);
                    CycleViewPager.m10151$$Nest$mhandleMsg(CycleViewPager.this, message);
                } else {
                    super.handleMessage(message);
                    CycleViewPager.m10151$$Nest$mhandleMsg(CycleViewPager.this, message);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }
        };
        int i2 = copydefault + 91;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 59 / 0;
        }
    }

    private void handleMsg(Message message) {
        int i = 2 % 2;
        if (message.what == 100) {
            int i2 = component2 + 1;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            if (this.mViews.size() > 0) {
                if (!this.isScrolling) {
                    this.mViewPager.setCurrentItem((this.currentPosition + 1) % this.mViews.size(), true);
                }
                this.releaseTime = System.currentTimeMillis();
                this.mHandler.removeCallbacks(this.runnable);
                this.mHandler.postDelayed(this.runnable, Integer.parseInt(this.bannerInfoList.get(this.currentPosition - 1).getDelayTime()) * 1000);
                return;
            }
        }
        if (message.what == 101) {
            int i4 = component2 + 83;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                this.mViews.size();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (this.mViews.size() > 0) {
                this.mHandler.removeCallbacks(this.runnable);
                this.mHandler.postDelayed(this.runnable, Integer.parseInt(this.bannerInfoList.get(this.currentPosition - 1).getDelayTime()) * 1000);
            }
        }
    }

    public void setData(List<HomeDynamicMenu.DynamicItemBean> list, ImageCycleViewListener imageCycleViewListener) {
        int i = 2 % 2;
        int i2 = copydefault + 61;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        setData(list, imageCycleViewListener, 0);
        int i4 = copydefault + 67;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void setData(List<HomeDynamicMenu.DynamicItemBean> list, ImageCycleViewListener imageCycleViewListener, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 61;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (list == null || list.size() == 0) {
            setVisibility(8);
            return;
        }
        this.mViews.clear();
        this.bannerInfoList = list;
        this.imageCycleViewListener = imageCycleViewListener;
        boolean z = false;
        this.currentPosition = 0;
        if (list.size() != 1) {
            int i4 = component2 + 51;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                z = true;
            }
        }
        this.isWheel = z;
        if (!z) {
            int i5 = component2 + 115;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                this.mIndicatorLayout.setVisibility(28);
            } else {
                this.mIndicatorLayout.setVisibility(8);
            }
        }
        addBannerView();
        initIndicators();
        initViewPager(i);
    }

    private void addBannerView() {
        int i = 2 % 2;
        if (!this.isWheel) {
            for (int i2 = 0; i2 < this.bannerInfoList.size(); i2++) {
                this.mViews.add(getImageViews(this.mContext, this.bannerInfoList.get(i2).getImageUrl()));
            }
            return;
        }
        int i3 = copydefault + 93;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<View> list = this.mViews;
        Context context = this.mContext;
        List<HomeDynamicMenu.DynamicItemBean> list2 = this.bannerInfoList;
        list.add(getImageViews(context, list2.get(list2.size() - 1).getImageUrl()));
        int i5 = 0;
        while (i5 < this.bannerInfoList.size()) {
            int i6 = copydefault + 53;
            component2 = i6 % 128;
            if (i6 % 2 == 0) {
                this.mViews.add(getImageViews(this.mContext, this.bannerInfoList.get(i5).getImageUrl()));
                i5 += 79;
            } else {
                this.mViews.add(getImageViews(this.mContext, this.bannerInfoList.get(i5).getImageUrl()));
                i5++;
            }
            int i7 = component2 + 53;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
        }
        this.mViews.add(getImageViews(this.mContext, this.bannerInfoList.get(0).getImageUrl()));
    }

    private void initIndicators() {
        int i = 2 % 2;
        int i2 = copydefault + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int size = this.mViews.size();
            if (this.isWheel) {
                size -= 2;
            }
            this.mIndicators = new ImageView[size];
            this.mIndicatorLayout.removeAllViews();
            int i3 = copydefault + 81;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 0;
            while (true) {
                ImageView[] imageViewArr = this.mIndicators;
                if (i5 >= imageViewArr.length) {
                    return;
                }
                imageViewArr[i5] = new ImageView(this.mContext);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DensityUtils.dp2px(getContext(), 4.0f), DensityUtils.dp2px(getContext(), 4.0f));
                layoutParams.setMargins(4, 0, 4, 0);
                this.mIndicators[i5].setLayoutParams(layoutParams);
                this.mIndicatorLayout.addView(this.mIndicators[i5]);
                i5++;
            }
        } else {
            this.mViews.size();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initViewPager(int r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager$ShareDataUIState r1 = new com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager$ShareDataUIState
            r2 = 0
            r1.<init>()
            r5.mAdapter = r1
            androidx.viewpager.widget.ViewPager r1 = r5.mViewPager
            r3 = 3
            r1.setOffscreenPageLimit(r3)
            androidx.viewpager.widget.ViewPager r1 = r5.mViewPager
            r1.addOnPageChangeListener(r5)
            androidx.viewpager.widget.ViewPager r1 = r5.mViewPager
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager$ShareDataUIState r3 = r5.mAdapter
            r1.setAdapter(r3)
            if (r6 < 0) goto L3c
            int r1 = com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.copydefault
            int r1 = r1 + 13
            int r3 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.component2 = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L33
            java.util.List<android.view.View> r1 = r5.mViews
            int r1 = r1.size()
            if (r6 < r1) goto L46
            goto L3c
        L33:
            java.util.List<android.view.View> r6 = r5.mViews
            r6.size()
            r2.hashCode()
            throw r2
        L3c:
            int r6 = com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.component2
            int r6 = r6 + 29
            int r1 = r6 % 128
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.copydefault = r1
            int r6 = r6 % r0
            r6 = 0
        L46:
            boolean r1 = r5.isWheel
            if (r1 == 0) goto L71
            int r6 = r6 + 1
            android.os.Handler r1 = r5.mHandler
            java.lang.Runnable r2 = r5.runnable
            java.util.List<com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu$DynamicItemBean> r3 = r5.bannerInfoList
            int r4 = r5.currentPosition
            java.lang.Object r3 = r3.get(r4)
            com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu$DynamicItemBean r3 = (com.huawei.digitalpayment.checkout.model.entity.HomeDynamicMenu.DynamicItemBean) r3
            java.lang.String r3 = r3.getDelayTime()
            int r3 = java.lang.Integer.parseInt(r3)
            int r3 = r3 * 1000
            long r3 = (long) r3
            r1.postDelayed(r2, r3)
            int r1 = com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.copydefault
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.component2 = r2
            int r1 = r1 % r0
        L71:
            androidx.viewpager.widget.ViewPager r0 = r5.mViewPager
            r0.setCurrentItem(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.checkout.ui.view.banner.CycleViewPager.initViewPager(int):void");
    }

    private void setIndicator(int i) {
        int i2 = 2 % 2;
        setText(this.mTitle, this.bannerInfoList.get(i).getContent());
        try {
            ImageView[] imageViewArr = this.mIndicators;
            int i3 = component2 + 89;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            for (ImageView imageView : imageViewArr) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(this.mIndicatorNormalColor);
                gradientDrawable.setSize(DensityUtils.dp2px(getContext(), 3.0f), DensityUtils.dp2px(getContext(), 4.0f));
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = DensityUtils.dp2px(getContext(), 4.0f);
                layoutParams.height = DensityUtils.dp2px(getContext(), 4.0f);
                imageView.setBackground(gradientDrawable);
            }
            if (this.mIndicators.length > i) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setColor(this.mIndicatorSelectColor);
                gradientDrawable2.setCornerRadius(10.0f);
                gradientDrawable2.setSize(DensityUtils.dp2px(getContext(), 13.0f), DensityUtils.dp2px(getContext(), 4.0f));
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mIndicators[i].getLayoutParams();
                layoutParams2.width = DensityUtils.dp2px(getContext(), 13.0f);
                layoutParams2.height = DensityUtils.dp2px(getContext(), 4.0f);
                this.mIndicators[i].setBackground(gradientDrawable2);
                int i5 = copydefault + 33;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
        } catch (Exception e) {
            L.d(TAG, "setIndicator: " + e.getMessage());
        }
    }

    class ShareDataUIState extends PagerAdapter {
        private static int component2 = 1;
        private static int component3;

        private ShareDataUIState() {
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            View viewComponent2 = component2(viewGroup, i);
            int i5 = component3 + 63;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return viewComponent2;
        }

        @Override
        public int getCount() {
            int i = 2 % 2;
            int i2 = component3 + 85;
            component2 = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                CycleViewPager.m10149$$Nest$fgetmViews(CycleViewPager.this).size();
                throw null;
            }
            int size = CycleViewPager.m10149$$Nest$fgetmViews(CycleViewPager.this).size();
            int i3 = component3 + 69;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return size;
            }
            obj.hashCode();
            throw null;
        }

        @Override
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            int i2 = 2 % 2;
            int i3 = component2 + 109;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            viewGroup.removeView((View) obj);
            int i5 = component2 + 85;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        private void component2(View view) {
            int iM10144$$Nest$fgetcurrentPosition;
            int i = 2 % 2;
            ImageCycleViewListener imageCycleViewListenerM10145$$Nest$fgetimageCycleViewListener = CycleViewPager.m10145$$Nest$fgetimageCycleViewListener(CycleViewPager.this);
            List listM10143$$Nest$fgetbannerInfoList = CycleViewPager.m10143$$Nest$fgetbannerInfoList(CycleViewPager.this);
            if (CycleViewPager.m10146$$Nest$fgetisWheel(CycleViewPager.this)) {
                int i2 = component3 + 33;
                component2 = i2 % 128;
                iM10144$$Nest$fgetcurrentPosition = i2 % 2 == 0 ? CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this) >> 1 : CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this) - 1;
                int i3 = component2 + 83;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                iM10144$$Nest$fgetcurrentPosition = CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this);
            }
            imageCycleViewListenerM10145$$Nest$fgetimageCycleViewListener.onImageClick((HomeDynamicMenu.DynamicItemBean) listM10143$$Nest$fgetbannerInfoList.get(iM10144$$Nest$fgetcurrentPosition), CycleViewPager.m10144$$Nest$fgetcurrentPosition(CycleViewPager.this), view);
        }

        public View component2(ViewGroup viewGroup, int i) {
            int i2 = 2 % 2;
            int i3 = component2 + 93;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                View view = (View) CycleViewPager.m10149$$Nest$fgetmViews(CycleViewPager.this).get(i);
                if (CycleViewPager.m10145$$Nest$fgetimageCycleViewListener(CycleViewPager.this) != null) {
                    view.setOnClickListener(new View.OnClickListener() {
                        private static int ShareDataUIState = 1;
                        private static int copydefault;

                        @Override
                        public final void onClick(View view2) {
                            int i4 = 2 % 2;
                            int i5 = ShareDataUIState + 61;
                            copydefault = i5 % 128;
                            int i6 = i5 % 2;
                            CycleViewPager.ShareDataUIState.component1(this.f$0, view2);
                            if (i6 != 0) {
                                int i7 = 40 / 0;
                            }
                        }
                    });
                }
                viewGroup.addView(view);
                int i4 = component2 + 9;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return view;
                }
                throw null;
            }
            CycleViewPager.m10145$$Nest$fgetimageCycleViewListener(CycleViewPager.this);
            throw null;
        }

        public static void component1(ShareDataUIState shareDataUIState, View view) {
            int i = 2 % 2;
            int i2 = component2 + 117;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(shareDataUIState, view);
            int i4 = component3 + 93;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }

        private static void copydefault(ShareDataUIState shareDataUIState, View view) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Callback.onClick_enter(view);
            try {
                shareDataUIState.component2(view);
                Callback.onClick_exit();
                int i4 = component2 + 31;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 26 / 0;
                }
            } catch (Throwable th) {
                Callback.onClick_exit();
                throw th;
            }
        }

        @Override
        public int getItemPosition(Object obj) {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 13;
            component2 = i3 % 128;
            int i4 = i3 % 2 == 0 ? 3 : -2;
            int i5 = i2 + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return i4;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            int i = 2 % 2;
            int i2 = component2;
            int i3 = i2 + 65;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            boolean z = false;
            if (view == obj) {
                int i5 = i2 + 117;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    z = true;
                }
            }
            int i6 = component3 + 21;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return z;
            }
            throw null;
        }
    }

    @Override
    public void onPageSelected(int i) {
        int i2 = 2 % 2;
        Callback.onPageSelected_enter(i);
        try {
            int size = this.mViews.size();
            this.currentPosition = i;
            if (this.isWheel) {
                int i3 = copydefault;
                int i4 = i3 + 31;
                int i5 = i4 % 128;
                component2 = i5;
                int i6 = i4 % 2;
                if (i == 0) {
                    int i7 = i5 + 21;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    this.currentPosition = size - 2;
                } else if (i == size - 1) {
                    int i9 = i3 + 5;
                    component2 = i9 % 128;
                    if (i9 % 2 == 0) {
                        this.currentPosition = 0;
                    } else {
                        this.currentPosition = 1;
                    }
                }
                i = this.currentPosition - 1;
            }
            setIndicator(i);
        } finally {
            Callback.onPageSelected_exit();
        }
    }

    @Override
    public void onPageScrollStateChanged(int i) {
        int i2 = 2 % 2;
        if (i == 1) {
            int i3 = component2;
            int i4 = i3 + 97;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            this.isScrolling = true;
            int i6 = i3 + 93;
            copydefault = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 69 / 0;
                return;
            }
            return;
        }
        if (i == 0) {
            this.releaseTime = System.currentTimeMillis();
            this.mViewPager.setCurrentItem(this.currentPosition, false);
        }
        this.isScrolling = false;
    }

    public static void setText(TextView textView, String str) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        if (str == null || textView == null) {
            return;
        }
        int i5 = i3 + 63;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        textView.setText(str);
        int i7 = component2 + 29;
        copydefault = i7 % 128;
        int i8 = i7 % 2;
    }

    public static void setText(TextView textView, int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 1;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (textView != null) {
            setText(textView, i + "");
            int i4 = component2 + 41;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void setWheel(boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 125;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.isWheel = z;
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
    }

    public boolean isWheel() {
        int i = 2 % 2;
        int i2 = component2 + 1;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = this.isWheel;
        int i5 = i3 + 101;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public View getImageViews(Context context, String str) {
        int i = 2 % 2;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ImageRequest.get().with(context).load(str).options(new RequestOptions().transform(new CenterCrop(), new RoundedCorners(24))).into(imageView).request();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(imageView);
        int i2 = copydefault + 87;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return frameLayout;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3 = 2 % 2;
        RatioLayoutDelegate ratioLayoutDelegate = this.ratioLayoutDelegate;
        if (ratioLayoutDelegate != null) {
            int i4 = component2 + 63;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            ratioLayoutDelegate.update(i, i2);
            i = this.ratioLayoutDelegate.getWidthMeasureSpec();
            i2 = this.ratioLayoutDelegate.getHeightMeasureSpec();
        }
        super.onMeasure(i, i2);
        int i6 = component2 + 87;
        copydefault = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void setRatio(RatioDatumMode ratioDatumMode, float f, float f2) {
        RatioLayoutDelegate ratioLayoutDelegate;
        int i = 2 % 2;
        int i2 = component2 + 113;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            ratioLayoutDelegate = this.ratioLayoutDelegate;
            int i3 = 5 / 0;
            if (ratioLayoutDelegate == null) {
                return;
            }
        } else {
            ratioLayoutDelegate = this.ratioLayoutDelegate;
            if (ratioLayoutDelegate == null) {
                return;
            }
        }
        ratioLayoutDelegate.setRatio(ratioDatumMode, f, f2);
        int i4 = copydefault + 37;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setSquare(boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 67;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            RatioLayoutDelegate ratioLayoutDelegate = this.ratioLayoutDelegate;
            if (ratioLayoutDelegate != null) {
                ratioLayoutDelegate.setSquare(z);
                int i3 = component2 + 43;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 4 / 3;
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override
    public void setAspectRatio(float f) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 105;
        copydefault = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            RatioLayoutDelegate ratioLayoutDelegate = this.ratioLayoutDelegate;
            if (ratioLayoutDelegate != null) {
                int i4 = i2 + 71;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                ratioLayoutDelegate.setAspectRatio(f);
            }
            int i6 = component2 + 49;
            copydefault = i6 % 128;
            if (i6 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        throw null;
    }

    static List m10143$$Nest$fgetbannerInfoList(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 57;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        List<HomeDynamicMenu.DynamicItemBean> list = cycleViewPager.bannerInfoList;
        if (i4 == 0) {
            int i5 = 76 / 0;
        }
        int i6 = i2 + 43;
        component2 = i6 % 128;
        if (i6 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static int m10144$$Nest$fgetcurrentPosition(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = cycleViewPager.currentPosition;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    static ImageCycleViewListener m10145$$Nest$fgetimageCycleViewListener(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        ImageCycleViewListener imageCycleViewListener = cycleViewPager.imageCycleViewListener;
        int i5 = i3 + 49;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return imageCycleViewListener;
    }

    static boolean m10146$$Nest$fgetisWheel(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = component2 + 113;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        boolean z = cycleViewPager.isWheel;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static Context m10147$$Nest$fgetmContext(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Context context = cycleViewPager.mContext;
        int i5 = i3 + 11;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return context;
        }
        throw null;
    }

    static Handler m10148$$Nest$fgetmHandler(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = component2 + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Handler handler = cycleViewPager.mHandler;
        if (i3 == 0) {
            return handler;
        }
        throw null;
    }

    static List m10149$$Nest$fgetmViews(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        List<View> list = cycleViewPager.mViews;
        int i5 = i3 + 63;
        copydefault = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    static long m10150$$Nest$fgetreleaseTime(CycleViewPager cycleViewPager) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        long j = cycleViewPager.releaseTime;
        int i5 = i3 + 63;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
        return j;
    }

    static void m10151$$Nest$mhandleMsg(CycleViewPager cycleViewPager, Message message) {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        cycleViewPager.handleMsg(message);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void onPageScrolled(int i, float f, int i2) {
        int i3 = 2 % 2;
        int i4 = component2 + 111;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
