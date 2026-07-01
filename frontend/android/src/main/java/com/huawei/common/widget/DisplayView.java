package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.ConvertUtils;
import com.huawei.common.R;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundLinearLayout;

public class DisplayView extends RoundLinearLayout {
    private ImageView ivIcon;
    private final TextView tvContent;
    private final TextView tvTitle;

    public DisplayView(Context context) {
        this(context, null);
    }

    public DisplayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DisplayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DisplayView);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DisplayView_display_layout, R.layout.common_view_display);
        String string = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.DisplayView_display_title_text);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.DisplayView_display_title_text_color, ContextCompat.getColor(context, R.color.colorTextLevel4));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DisplayView_display_title_text_size, ConvertUtils.sp2px(14.0f));
        String string2 = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.DisplayView_display_content_text);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.DisplayView_display_content_text_color, -16777216);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.DisplayView_display_content_text_size, ConvertUtils.sp2px(14.0f));
        typedArrayObtainStyledAttributes.recycle();
        setOrientation(0);
        setGravity(16);
        View.inflate(context, resourceId, this);
        TextView textView = (TextView) findViewById(R.id.tvTitle);
        this.tvTitle = textView;
        TextView textView2 = (TextView) findViewById(R.id.tvContent);
        this.tvContent = textView2;
        this.ivIcon = (ImageView) findViewById(R.id.ivIcon);
        textView.setText(string);
        textView.setTextColor(color);
        textView.setTextSize(0, dimensionPixelSize);
        textView2.setText(string2);
        textView2.setTextColor(color2);
        textView2.setTextSize(0, dimensionPixelSize2);
    }

    public void setTitle(String str) {
        this.tvTitle.setText(str);
    }

    public void setContent(String str) {
        this.tvContent.setText(str);
    }

    public TextView getTvTitle() {
        return this.tvTitle;
    }

    public TextView getTvContent() {
        return this.tvContent;
    }

    public ImageView getIvIcon() {
        return this.ivIcon;
    }
}
