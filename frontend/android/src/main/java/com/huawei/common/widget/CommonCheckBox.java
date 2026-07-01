package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.drawable.DrawableCompat;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.dynatrace.android.callback.Callback;
import com.huawei.common.R;
import com.huawei.common.databinding.BasicCommonCheckboxBinding;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.common.widget.round.RoundLinearLayout;

public class CommonCheckBox extends RoundLinearLayout {
    public static final int DEFAULT = 0;
    public static final int DISABLE = 2;
    public static final int SELECTED = 1;
    public static final int SELECT_DISABLE = 3;
    private BasicCommonCheckboxBinding binding;
    private float disableAlpha;
    private int height;
    private int imageHeight;
    private int imageWidth;
    private int lins;
    private OnClickListener onClickListener;
    private int selectIcon;
    private int selectTintcolor;
    private int status;
    private String text;
    private int textColor;
    private int textSize;
    private boolean unableClick;
    private int unselectIcon;
    private int unselectTintcolor;
    private int width;

    public interface OnClickListener {
        void onClick(View view, int i, boolean z);
    }

    public CommonCheckBox(Context context) {
        this(context, null);
    }

    public CommonCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.disableAlpha = 0.3f;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        initAttrs(context, attributeSet);
        initViews(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommonCheckBox);
        this.status = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonCheckBox_commoncheckbox_status, 0);
        this.selectTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCheckBox_commoncheckbox_select_icon_TintColor, ColorUtils.getColor(R.color.colorPrimary));
        this.unselectTintcolor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCheckBox_commoncheckbox_unselect_icon_TintColor, ColorUtils.getColor(R.color.colorPlaceholderText));
        this.textColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCheckBox_commoncheckbox_text_color, ColorUtils.getColor(R.color.colorMainText));
        this.text = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.CommonCheckBox_commoncheckbox_text);
        this.selectIcon = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CommonCheckBox_commoncheckbox_select_icon, R.mipmap.basic_checkbox_select);
        this.unselectIcon = typedArrayObtainStyledAttributes.getResourceId(R.styleable.CommonCheckBox_commoncheckbox_select_icon, R.mipmap.basic_checkbox_unselect);
        this.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCheckBox_commoncheckbox_height, SizeUtils.dp2px(48.0f));
        this.disableAlpha = typedArrayObtainStyledAttributes.getFloat(R.styleable.CommonCheckBox_commoncheckbox_disable_alpha, 0.3f);
        this.unableClick = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CommonCheckBox_commoncheckbox_unable_click, false);
        this.imageHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCheckBox_commoncheckbox_image_height, SizeUtils.dp2px(18.0f));
        this.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCheckBox_commoncheckbox_width, 0);
        this.imageWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCheckBox_commoncheckbox_image_width, SizeUtils.dp2px(18.0f));
        this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCheckBox_commoncheckbox_text_size, SizeUtils.sp2px(16.0f));
        this.lins = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonCheckBox_commoncheckbox_text_lins, 1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initViews(Context context) {
        BasicCommonCheckboxBinding basicCommonCheckboxBindingInflate = BasicCommonCheckboxBinding.inflate(LayoutInflater.from(context), this, true);
        this.binding = basicCommonCheckboxBindingInflate;
        ViewGroup.LayoutParams layoutParams = basicCommonCheckboxBindingInflate.clRoot.getLayoutParams();
        layoutParams.height = this.height;
        int i = this.width;
        if (i != 0) {
            layoutParams.width = i;
        }
        this.binding.tvCheckBox.setText(this.text);
        if (TextUtils.isEmpty(this.text)) {
            this.binding.tvCheckBox.setVisibility(8);
        } else {
            this.binding.tvCheckBox.setVisibility(0);
        }
        this.binding.tvCheckBox.setMaxLines(this.lins);
        this.binding.tvCheckBox.setTextSize(0, this.textSize);
        this.binding.tvCheckBox.setTextColor(this.textColor);
        if (!this.unableClick) {
            setListener();
        }
        ViewGroup.LayoutParams layoutParams2 = this.binding.ivCheckBox.getLayoutParams();
        layoutParams2.height = this.imageHeight;
        layoutParams2.width = this.imageWidth;
        setStatus(this.status, this.selectIcon, this.unselectIcon);
    }

    private void setListener() {
        FastClickUtils.setOnClickListener(this.binding.clRoot, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CommonCheckBox.m10012instrumented$0$setListener$V(this.f$0, view);
            }
        });
    }

    private void lambda$setListener$0(View view) {
        int i = this.status;
        if (i == 2 || i == 3) {
            return;
        }
        OnClickListener onClickListener = this.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view, i, i == 0);
        } else if (i == 0) {
            setStatus(1);
        } else {
            setStatus(0);
        }
    }

    public void setLins(int i) {
        this.lins = i;
        this.binding.tvCheckBox.setMaxLines(i);
    }

    public void setText(CharSequence charSequence) {
        this.binding.tvCheckBox.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            this.binding.tvCheckBox.setVisibility(8);
        } else {
            this.binding.tvCheckBox.setVisibility(0);
        }
    }

    public void setTextColor(int i) {
        this.textColor = i;
        this.binding.tvCheckBox.setTextColor(i);
    }

    public void setHeight(int i) {
        this.height = i;
        ViewGroup.LayoutParams layoutParams = this.binding.clRoot.getLayoutParams();
        layoutParams.height = i;
        this.binding.clRoot.setLayoutParams(layoutParams);
    }

    public void setWidth(int i) {
        this.width = i;
        ViewGroup.LayoutParams layoutParams = this.binding.clRoot.getLayoutParams();
        layoutParams.width = i;
        this.binding.clRoot.setLayoutParams(layoutParams);
    }

    public void setSelectTintcolor(int i) {
        this.selectTintcolor = i;
        setStatus(this.status, this.selectIcon, this.unselectIcon);
    }

    public void setImageHeight(int i) {
        this.imageHeight = i;
        ViewGroup.LayoutParams layoutParams = this.binding.ivCheckBox.getLayoutParams();
        layoutParams.height = i;
        layoutParams.width = this.imageWidth;
        this.binding.ivCheckBox.setLayoutParams(layoutParams);
    }

    public void setImageWidth(int i) {
        this.imageWidth = i;
        ViewGroup.LayoutParams layoutParams = this.binding.ivCheckBox.getLayoutParams();
        layoutParams.height = this.imageHeight;
        layoutParams.width = i;
        this.binding.ivCheckBox.setLayoutParams(layoutParams);
    }

    public TextView getTextView() {
        return this.binding.tvCheckBox;
    }

    public RoundImageView getImageView() {
        return this.binding.ivCheckBox;
    }

    public void setStatus(int i) {
        setStatus(i, this.selectIcon, this.unselectIcon);
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isChecked() {
        int i = this.status;
        return i == 1 || i == 3;
    }

    public void setChecked(boolean z) {
        int i;
        if (z) {
            i = 1;
            this.status = 1;
        } else {
            i = 0;
        }
        setStatus(i, this.selectIcon, this.unselectIcon);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void setStatus(int i, int i2, int i3) {
        this.status = i;
        if (i == 1) {
            this.binding.ivCheckBox.setAlpha(1.0f);
            this.binding.tvCheckBox.setTextColor(this.textColor);
            this.binding.ivCheckBox.setImageResource(i2);
            setSelectStatus(true);
            return;
        }
        if (i == 2) {
            this.binding.ivCheckBox.setImageResource(i3);
            this.binding.ivCheckBox.setAlpha(this.disableAlpha);
            this.binding.tvCheckBox.setTextColor(com.huawei.common.util.color.ColorUtils.INSTANCE.withAlpha(this.disableAlpha, this.textColor));
            setSelectStatus(false);
            return;
        }
        if (i == 3) {
            this.binding.ivCheckBox.setImageResource(i2);
            this.binding.ivCheckBox.setAlpha(this.disableAlpha);
            this.binding.tvCheckBox.setTextColor(this.textColor);
            setSelectStatus(true);
            return;
        }
        this.binding.ivCheckBox.setImageResource(i3);
        this.binding.ivCheckBox.setAlpha(1.0f);
        this.binding.tvCheckBox.setTextColor(this.textColor);
        setSelectStatus(false);
    }

    private void setSelectStatus(boolean z) {
        Drawable drawable = this.binding.ivCheckBox.getDrawable();
        if (drawable != null) {
            if (z) {
                DrawableCompat.setTint(drawable, this.selectTintcolor);
            } else {
                DrawableCompat.setTint(drawable, this.unselectTintcolor);
            }
            this.binding.ivCheckBox.setImageDrawable(drawable);
        }
    }

    public static void m10012instrumented$0$setListener$V(CommonCheckBox commonCheckBox, View view) {
        Callback.onClick_enter(view);
        try {
            commonCheckBox.lambda$setListener$0(view);
        } finally {
            Callback.onClick_exit();
        }
    }
}
