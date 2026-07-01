package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.DrawableCompat;
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
        initAttrs(context, attributeSet);
        initViews(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
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
    }

    private void initViews(Context context) {
        BasicSwitchesviewBinding basicSwitchesviewBindingInflate = BasicSwitchesviewBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = basicSwitchesviewBindingInflate;
        basicSwitchesviewBindingInflate.imageView.setOnClickListener(new FilterFastClickListener() {
            @Override
            public void onFilterClick(View view) {
                if (SwitchView.this.status == 3 || SwitchView.this.status == 2) {
                    return;
                }
                boolean z = SwitchView.this.on;
                if (z) {
                    SwitchView.this.setStatus(0);
                } else {
                    SwitchView.this.setStatus(1);
                }
                if (SwitchView.this.onSwitchesClickListener != null) {
                    SwitchView.this.onSwitchesClickListener.onSwitches(!z);
                }
            }
        });
        ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
        layoutParams.height = this.height;
        layoutParams.width = this.width;
        setStatus(this.status);
    }

    public void setOnSwitchesClickListener(OnSwitchesClickListener onSwitchesClickListener) {
        this.onSwitchesClickListener = onSwitchesClickListener;
    }

    public void setOnTintcolor(int i) {
        this.onTintcolor = i;
        setStatus(this.status);
    }

    public void setHeight(int i) {
        this.height = i;
        ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
        layoutParams.height = i;
        this.binding.imageView.setLayoutParams(layoutParams);
    }

    public void setWidth(int i) {
        this.width = i;
        ViewGroup.LayoutParams layoutParams = this.binding.imageView.getLayoutParams();
        layoutParams.width = i;
        this.binding.imageView.setLayoutParams(layoutParams);
    }

    public RoundImageView getImageView() {
        return this.binding.imageView;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
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
    }

    public boolean isSwitceshOn() {
        return this.on;
    }

    public void setSwitchesOn(boolean z) {
        if (z) {
            setStatus(1);
        } else {
            setStatus(0);
        }
    }

    private void setSwitchStatus(boolean z) {
        setImageViewStatus(z);
    }

    private void setImageViewStatus(boolean z) {
        this.on = z;
        Drawable drawable = this.binding.imageView.getDrawable();
        if (drawable != null) {
            if (z) {
                DrawableCompat.setTint(drawable, this.onTintcolor);
            } else {
                DrawableCompat.setTint(drawable, this.offTintcolor);
            }
            this.binding.imageView.setImageDrawable(drawable);
        }
    }
}
