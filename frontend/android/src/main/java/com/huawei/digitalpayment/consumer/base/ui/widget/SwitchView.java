package com.huawei.digitalpayment.consumer.base.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.databinding.BasicSwitchesviewBinding;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;

public class SwitchView extends RoundLinearLayout {
    public static final int OFF = 0;
    public static final int OFF_DISABLE = 2;
    public static final int ON = 1;
    public static final int ON_DISABLE = 3;
    private static int component1 = 1;
    private static int component3;
    private BasicSwitchesviewBinding binding;
    private float disableAlpha;
    private int height;
    private int offIcon;
    private int offTintcolor;
    private boolean on;
    private int onIcon;
    private OnSwitchesClickListener onSwitchesClickListener;
    private int onTintcolor;
    private int status;
    private int width;

    public interface OnSwitchesClickListener {
        void onSwitches(boolean z);
    }

    public SwitchView(Context context) {
        this(context, null);
    }

    public SwitchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableAlpha = 0.3f;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component3 + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            initAttrs(context, attributeSet);
            initViews(context);
            int i3 = component3 + 43;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 90 / 0;
                return;
            }
            return;
        }
        initAttrs(context, attributeSet);
        initViews(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SwitchView);
        this.status = typedArrayObtainStyledAttributes.getInt(R.styleable.SwitchView_switch_status, 0);
        this.onTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.SwitchView_switch_on_icon_TintColor, ColorUtils.getColor(R.color.colorPrimary));
        this.offTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.SwitchView_switch_off_icon_TintColor, ColorUtils.getColor(R.color.colorSecondaryText));
        this.onIcon = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SwitchView_switch_on_icon, R.mipmap.icon_cb_switch_on);
        this.offIcon = typedArrayObtainStyledAttributes.getResourceId(R.styleable.SwitchView_switch_off_icon, R.mipmap.icon_cb_switch_off);
        this.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchView_switch_height, SizeUtils.dp2px(20.0f));
        this.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SwitchView_switch_width, SizeUtils.dp2px(38.0f));
        this.disableAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.SwitchView_switch_disable_alpha, 0.3f);
        typedArrayObtainStyledAttributes.recycle();
        int i4 = component3 + 121;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private void initViews(Context context) {
        int i = 2 % 2;
        BasicSwitchesviewBinding basicSwitchesviewBindingInflate = BasicSwitchesviewBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = basicSwitchesviewBindingInflate;
        basicSwitchesviewBindingInflate.imageView.setOnClickListener(new FilterFastClickListener() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onFilterClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component2 = i3 % 128;
                if (i3 % 2 != 0 ? SwitchView.m10199$$Nest$fgetstatus(SwitchView.this) != 3 : SwitchView.m10199$$Nest$fgetstatus(SwitchView.this) != 2) {
                    if (SwitchView.m10199$$Nest$fgetstatus(SwitchView.this) != 2) {
                        boolean zM10197$$Nest$fgeton = SwitchView.m10197$$Nest$fgeton(SwitchView.this);
                        if (zM10197$$Nest$fgeton) {
                            SwitchView.this.setStatus(0);
                        } else {
                            SwitchView.this.setStatus(1);
                            int i4 = component2 + 7;
                            component1 = i4 % 128;
                            int i5 = i4 % 2;
                        }
                        if (SwitchView.m10198$$Nest$fgetonSwitchesClickListener(SwitchView.this) != null) {
                            SwitchView.m10198$$Nest$fgetonSwitchesClickListener(SwitchView.this).onSwitches(!zM10197$$Nest$fgeton);
                        }
                    }
                }
                int i6 = component2 + 17;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
        layoutParams.height = this.height;
        layoutParams.width = this.width;
        setStatus(this.status);
        int i2 = component1 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 3 / 0;
        }
    }

    public void setOnSwitchesClickListener(OnSwitchesClickListener onSwitchesClickListener) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 9;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.onSwitchesClickListener = onSwitchesClickListener;
        int i5 = i2 + 71;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setOnTintcolor(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 1;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        this.onTintcolor = i;
        setStatus(this.status);
        int i5 = component3 + 69;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public void setHeight(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 9;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            this.height = i;
            ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
            layoutParams.height = i;
            this.binding.imageView.setLayoutParams(layoutParams);
            return;
        }
        this.height = i;
        ViewGroup.LayoutParams layoutParams2 = this.binding.imageView.getLayoutParams();
        layoutParams2.height = i;
        this.binding.imageView.setLayoutParams(layoutParams2);
        throw null;
    }

    public void setWidth(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 69;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            this.width = i;
            ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
            layoutParams.width = i;
            this.binding.imageView.setLayoutParams(layoutParams);
            int i4 = 13 / 0;
            return;
        }
        this.width = i;
        ViewGroup.LayoutParams layoutParams2 = this.binding.imageView.getLayoutParams();
        layoutParams2.width = i;
        this.binding.imageView.setLayoutParams(layoutParams2);
    }

    public RoundImageView getImageView() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        RoundImageView roundImageView = this.binding.imageView;
        int i4 = component3 + 29;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return roundImageView;
    }

    public int getStatus() {
        int i;
        int i2 = 2 % 2;
        int i3 = component1 + 37;
        int i4 = i3 % 128;
        component3 = i4;
        if (i3 % 2 != 0) {
            i = this.status;
            int i5 = 5 / 0;
        } else {
            i = this.status;
        }
        int i6 = i4 + 21;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return i;
    }

    public void setStatus(int i) {
        int i2 = 2 % 2;
        int i3 = component1 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.status = i;
        if (i == 1) {
            this.binding.imageView.setImageResource(this.onIcon);
            this.binding.imageView.setAlpha(1.0f);
            setSwitchStatus(true);
        } else if (i == 2) {
            this.binding.imageView.setImageResource(this.offIcon);
            this.binding.imageView.setAlpha(this.disableAlpha);
            setSwitchStatus(false);
        } else if (i == 3) {
            this.binding.imageView.setImageResource(this.onIcon);
            this.binding.imageView.setAlpha(this.disableAlpha);
            setSwitchStatus(true);
        } else {
            this.binding.imageView.setImageResource(this.offIcon);
            this.binding.imageView.setAlpha(1.0f);
            setSwitchStatus(false);
        }
        int i5 = component3 + 107;
        component1 = i5 % 128;
        int i6 = i5 % 2;
    }

    public boolean isSwitceshOn() {
        boolean z;
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 17;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            z = this.on;
            int i4 = 6 / 0;
        } else {
            z = this.on;
        }
        int i5 = i2 + 79;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public void setSwitchesOn(boolean z) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        if (z) {
            setStatus(1);
        } else {
            setStatus(0);
        }
        int i4 = component1 + 57;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setSwitchStatus(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 69;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        setImageViewStatus(z);
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = component3 + 123;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 13 / 0;
        }
    }

    private void setImageViewStatus(boolean z) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 1;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        this.on = z;
        int i5 = i2 + 85;
        component3 = i5 % 128;
        int i6 = i5 % 2;
    }

    static boolean m10197$$Nest$fgeton(SwitchView switchView) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = switchView.on;
        if (i3 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static OnSwitchesClickListener m10198$$Nest$fgetonSwitchesClickListener(SwitchView switchView) {
        int i = 2 % 2;
        int i2 = component1 + 109;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        OnSwitchesClickListener onSwitchesClickListener = switchView.onSwitchesClickListener;
        if (i4 != 0) {
            int i5 = 71 / 0;
        }
        int i6 = i3 + 103;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        return onSwitchesClickListener;
    }

    static int m10199$$Nest$fgetstatus(SwitchView switchView) {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = switchView.status;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }
}
