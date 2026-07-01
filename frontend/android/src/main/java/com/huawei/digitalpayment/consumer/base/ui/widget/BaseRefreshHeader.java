package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.motion.widget.Key;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.digitalpayment.consumer.baseui.R;
import com.safaricom.mpesa.logging.L;
import com.scwang.smart.refresh.layout.api.RefreshHeader;
import com.scwang.smart.refresh.layout.api.RefreshKernel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;

public class BaseRefreshHeader extends LinearLayout implements RefreshHeader {
    private static final int ANIMATOR_DURATION = 2000;
    public static final float BLUE_GREEN = 0.114f;
    public static final float COLOR_VALUE = 255.0f;
    public static final float DARK_THRESHOLD = 0.5f;
    public static final float GREEN_PERCENT = 0.587f;
    public static final float RED_PERCENT = 0.299f;
    private static int ShareDataUIState = 0;
    private static final String TAG = "BaseRefreshHeader";
    public static final float TOTAL_PERCENT = 1.0f;
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private ObjectAnimator animator;
    private ImageView ivImg;
    private int refreshSrc;
    private int srlPrimaryColor;

    public BaseRefreshHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.refreshSrc = R.mipmap.base_ic_refresh;
        initView(context, attributeSet);
    }

    public BaseRefreshHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.refreshSrc = R.mipmap.base_ic_refresh;
        initView(context, attributeSet);
    }

    private void initView(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component3 + 19;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MaterialHeader);
        this.srlPrimaryColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, R.styleable.MaterialHeader_srlPrimaryColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.AppCompatImageView);
        this.refreshSrc = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.AppCompatImageView_android_src, this.refreshSrc);
        setGravity(81);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.base_refresh_header, (ViewGroup) this, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        this.ivImg = imageView;
        imageView.setImageResource(this.refreshSrc);
        addView(viewInflate);
        typedArrayObtainStyledAttributes2.recycle();
        int i4 = component3 + 57;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setPrimaryColor(int i) {
        int i2 = 2 % 2;
        this.srlPrimaryColor = i;
        if (!(!isColorDark(i))) {
            this.refreshSrc = R.mipmap.base_ic_loading;
            int i3 = component2 + 125;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            this.refreshSrc = R.mipmap.base_ic_refresh;
        }
        this.ivImg.setImageResource(this.refreshSrc);
        int i5 = component3 + 13;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static boolean isColorDark(int i) {
        int i2 = 2 % 2;
        int i3 = component2 + 33;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        if (1.0f - ((((Color.red(i) * 0.299f) + (Color.green(i) * 0.587f)) + (Color.blue(i) * 0.114f)) / 255.0f) > 0.5d) {
            int i5 = component3 + 21;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = component3 + 13;
        component2 = i7 % 128;
        int i8 = i7 % 2;
        return false;
    }

    @Override
    public SpinnerStyle getSpinnerStyle() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        SpinnerStyle spinnerStyle = SpinnerStyle.Translate;
        if (i3 != 0) {
            return spinnerStyle;
        }
        throw null;
    }

    @Override
    public void onInitialized(RefreshKernel refreshKernel, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component2 + 9;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            refreshKernel.requestDrawBackgroundFor(this, this.srlPrimaryColor);
            throw null;
        }
        refreshKernel.requestDrawBackgroundFor(this, this.srlPrimaryColor);
        int i5 = component2 + 53;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    static class AnonymousClass5 {
        private static int ShareDataUIState = 1;
        static final int[] component1;
        private static int component2;

        static {
            int[] iArr = new int[RefreshState.values().length];
            component1 = iArr;
            try {
                iArr[RefreshState.Refreshing.ordinal()] = 1;
                int i = component2 + 1;
                ShareDataUIState = i % 128;
                if (i % 2 != 0) {
                    int i2 = 2 % 2;
                }
            } catch (NoSuchFieldError unused) {
            }
            try {
                component1[RefreshState.None.ordinal()] = 2;
                int i3 = component2 + 71;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                int i5 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                component1[RefreshState.PullDownToRefresh.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override
    public void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
        int i = 2 % 2;
        L l = L.INSTANCE;
        String str = TAG;
        l.d(str, "onStateChanged:oldState= " + refreshState, new Object[0]);
        L.INSTANCE.d(str, "onStateChanged:newState= " + refreshState2, new Object[0]);
        int i2 = AnonymousClass5.component1[refreshState2.ordinal()];
        if (i2 == 1) {
            startAnimator();
        } else if (i2 != 2 && i2 != 3) {
            int i3 = component2 + 29;
            component3 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            endAnimator();
        }
        int i5 = component3 + 103;
        component2 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void startAnimator() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        if (this.animator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.ivImg, Key.ROTATION, 0.0f, 360.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(2000L);
            this.animator.setInterpolator(new LinearInterpolator());
            this.animator.setRepeatCount(-1);
            this.animator.setRepeatMode(1);
        }
        this.animator.start();
        int i4 = component3 + 15;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void endAnimator() {
        int i = 2 % 2;
        int i2 = component2 + 91;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            ObjectAnimator objectAnimator = this.animator;
            if (objectAnimator == null || !objectAnimator.isRunning()) {
                return;
            }
            int i3 = component3 + 103;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            this.animator.cancel();
            this.ivImg.setRotation(0.0f);
            return;
        }
        throw null;
    }

    static {
        int i = 1 + 31;
        ShareDataUIState = i % 128;
        if (i % 2 != 0) {
            int i2 = 55 / 0;
        }
    }

    @Override
    public boolean autoOpen(int i, float f, boolean z) {
        int i2 = 2 % 2;
        int i3 = component3;
        int i4 = i3 + 41;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 55;
        component2 = i6 % 128;
        int i7 = i6 % 2;
        return false;
    }

    @Override
    public View getView() {
        int i = 2 % 2;
        int i2 = component3 + 67;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return this;
    }

    @Override
    public boolean isSupportHorizontalDrag() {
        int i = 2 % 2;
        int i2 = component2 + 65;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 21;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public int onFinish(RefreshLayout refreshLayout, boolean z) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 89;
        component2 = i3 % 128;
        int i4 = i3 % 2 != 0 ? 10376 : 500;
        int i5 = i2 + 43;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return i4;
    }

    @Override
    public void onHorizontalDrag(float f, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component2 + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onMoving(boolean z, float f, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = component2 + 41;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 88 / 0;
        }
    }

    @Override
    public void onReleased(RefreshLayout refreshLayout, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component3 + 45;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onStartAnimator(RefreshLayout refreshLayout, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = component3 + 119;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setPrimaryColors(int... iArr) {
        int i = 2 % 2;
        int i2 = component3 + 123;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }
}
