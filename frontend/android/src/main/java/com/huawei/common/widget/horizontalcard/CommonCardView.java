package com.huawei.common.widget.horizontalcard;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.common.R;
import com.huawei.common.util.color.ColorUtils;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.round.RoundLinearLayout;

public class CommonCardView extends RoundLinearLayout {
    public static final int DEFAULT = 0;
    public static final int SELECTED = 1;
    private int bottomPadding;
    private int defaultBackgroundColor;
    private int defaultStrokeColor;
    private int height;
    private HorizontalCardInfo horizontalCardInfo;
    private int leftPadding;
    private int lines;
    private int padding;
    private int rightPadding;
    private int roundCorner;
    private int roundCornerBottomLeft;
    private int roundCornerBottomRight;
    private int roundCornerTopLeft;
    private int roundCornerTopRight;
    private int selectBackgroundColor;
    private int selectStrokeColor;
    private int selectTextColor;
    private int status;
    private int strokeWidth;
    private String text;
    private int textSize;
    private TextView textView;
    private int topPadding;
    private int unselectTextColor;
    private View view;
    private int width;

    public CommonCardView(Context context) {
        this(context, null);
    }

    public CommonCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        initAttrs(context, attributeSet);
        initViews();
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CommonCardView);
        this.status = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonCardView_common_cardview_status, 0);
        this.defaultBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_unselect_background_color, ColorUtils.INSTANCE.withAlpha(0.3f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorPrimary)));
        this.selectBackgroundColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_select_background_color, ColorUtils.INSTANCE.withAlpha(0.5f, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorPrimary)));
        this.defaultStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_unselect_stroke_color, 0);
        this.selectStrokeColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_select_stroke_color, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorPrimary));
        this.unselectTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_select_text_color, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorMainText));
        this.selectTextColor = typedArrayObtainStyledAttributes.getColor(R.styleable.CommonCardView_common_cardview_unselect_text_color, com.blankj.utilcode.util.ColorUtils.getColor(R.color.colorMainText));
        this.height = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_height, 0);
        this.width = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_width, 0);
        this.lines = typedArrayObtainStyledAttributes.getInt(R.styleable.CommonCardView_common_cardview_text_lines, 0);
        this.roundCorner = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_round_corner, 20);
        this.roundCornerTopLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_round_corner_top_left, 0);
        this.roundCornerTopRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_round_corner_top_right, 0);
        this.roundCornerBottomLeft = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_round_corner_bottom_left, 0);
        this.roundCornerBottomRight = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_round_corner_bottom_right, 0);
        this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_padding, 0);
        this.leftPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_padding_left, 12);
        this.rightPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_padding_right, 12);
        this.topPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_padding_top, 8);
        this.bottomPadding = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_padding_bottom, 8);
        this.textSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_text_size, 16);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CommonCardView_common_cardview_stroke_width, 2);
        this.text = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes, R.styleable.CommonCardView_common_cardview_text);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void initViews() {
        setGravity(17);
        setBaseRoundView();
        addContent(this.text);
        setCustomView(this.view);
    }

    public void setRoundCorner(int i) {
        this.roundCorner = i;
        initViews();
    }

    public void setData(int i, String str, View view, HorizontalCardInfo horizontalCardInfo) {
        this.status = i;
        this.text = str;
        this.view = view;
        if (horizontalCardInfo != null) {
            this.horizontalCardInfo = horizontalCardInfo;
            this.defaultBackgroundColor = horizontalCardInfo.getDefaultBackgroundColor();
            this.selectBackgroundColor = horizontalCardInfo.getSelectBackgroundColor();
            this.defaultStrokeColor = horizontalCardInfo.getDefaultStrokeColor();
            this.selectStrokeColor = horizontalCardInfo.getSelectStrokeColor();
            this.unselectTextColor = horizontalCardInfo.getUnselectTextColor();
            this.selectTextColor = horizontalCardInfo.getSelectTextColor();
            this.height = horizontalCardInfo.getHeight();
            this.width = horizontalCardInfo.getWidth();
            this.roundCorner = horizontalCardInfo.getRoundCorner();
            this.roundCornerTopLeft = horizontalCardInfo.getRoundCornerTopLeft();
            this.roundCornerTopRight = horizontalCardInfo.getRoundCornerTopRight();
            this.roundCornerBottomLeft = horizontalCardInfo.getRoundCornerBottomLeft();
            this.roundCornerBottomRight = horizontalCardInfo.getRoundCornerBottomRight();
            this.padding = horizontalCardInfo.getPadding();
            this.leftPadding = horizontalCardInfo.getLeftPadding();
            this.rightPadding = horizontalCardInfo.getRightPadding();
            this.topPadding = horizontalCardInfo.getTopPadding();
            this.bottomPadding = horizontalCardInfo.getBottomPadding();
            this.textSize = horizontalCardInfo.getTextSize();
            this.strokeWidth = horizontalCardInfo.getStrokeWidth();
            this.lines = horizontalCardInfo.getLines();
        }
        initViews();
    }

    public void setCustomView(View view) {
        if (view == null) {
            return;
        }
        removeAllViews();
        addView(view);
    }

    private void addContent(String str) {
        removeAllViews();
        initTextView(str);
        addView(this.textView);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i = this.height;
        if (i != 0) {
            layoutParams.height = i;
        }
        int i2 = this.width;
        if (i2 != 0) {
            layoutParams.width = i2;
        }
        int i3 = this.padding;
        if (i3 == 0) {
            setPadding(this.leftPadding, this.topPadding, this.rightPadding, this.bottomPadding);
        } else {
            setPadding(i3, i3, i3, i3);
        }
    }

    private void initTextView(String str) {
        TextView textView = new TextView(getContext());
        this.textView = textView;
        textView.setTextSize(this.textSize);
        int i = this.lines;
        if (i != 0) {
            this.textView.setLines(i);
        }
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setGravity(17);
        if (this.status == 0) {
            this.textView.setTextColor(this.unselectTextColor);
        } else {
            this.textView.setTextColor(this.selectTextColor);
        }
        this.textView.setText(str);
    }

    private void setBaseRoundView() {
        getBaseFilletView().setStrokeWidth(this.strokeWidth);
        if (this.status == 0) {
            getBaseFilletView().setStrokeColor(this.defaultStrokeColor);
            setBackgroundColor(this.defaultBackgroundColor);
        } else {
            getBaseFilletView().setStrokeColor(this.selectStrokeColor);
            setBackgroundColor(this.selectBackgroundColor);
        }
        if (this.roundCorner != 0) {
            getBaseFilletView().setRoundCorner(this.roundCorner);
            return;
        }
        getBaseFilletView().setRoundCornerBottomLeft(this.roundCornerBottomLeft);
        getBaseFilletView().setRoundCornerBottomRight(this.roundCornerBottomRight);
        getBaseFilletView().setRoundCornerTopLeft(this.roundCornerTopLeft);
        getBaseFilletView().setRoundCornerTopRight(this.roundCornerTopRight);
    }
}
