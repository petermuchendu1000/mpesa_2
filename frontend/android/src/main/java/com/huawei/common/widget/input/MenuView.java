package com.huawei.common.widget.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\rJ*\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J*\u0010!\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u001bJ\u0006\u0010$\u001a\u00020\u0019J\u0006\u0010%\u001a\u00020\u001bR\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082.¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/huawei/common/widget/input/MenuView;", "Lcom/huawei/common/widget/round/RoundConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "layoutId", "menuIconWidth", "menuIconHeight", "menuIconMarginTop", "menuIconMarginBottom", "menuTitleTextColor", "menuTitleTextSize", "", "menuTitlePaddingStart", "menuTitlePaddingEnd", "ivFunctionIcon", "Landroid/widget/ImageView;", "tvFunctionName", "Landroid/widget/TextView;", "ivMarker", "tvRedDot", "init", "", "initViews", "initAttrs", "getFunctionIcon", "getFunctionName", "getFunctionMarker", "getFunctionRedDot", "CommonBaseLib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenuView extends RoundConstraintLayout {
    private ImageView ivFunctionIcon;
    private ImageView ivMarker;
    private int layoutId;
    private int menuIconHeight;
    private int menuIconMarginBottom;
    private int menuIconMarginTop;
    private int menuIconWidth;
    private int menuTitlePaddingEnd;
    private int menuTitlePaddingStart;
    private int menuTitleTextColor;
    private float menuTitleTextSize;
    private TextView tvFunctionName;
    private TextView tvRedDot;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenuView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenuView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.DefaultMenuViewStyle);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.layoutId = R.layout.menu_view;
        init(context, attributeSet, i, i2);
    }

    private final void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        initAttrs(context, attrs, defStyleAttr, defStyleRes);
        initViews(context);
    }

    private final void initViews(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(this.layoutId, (ViewGroup) this, true);
        this.ivFunctionIcon = (ImageView) viewInflate.findViewById(R.id.ivFunctionIcon);
        this.tvFunctionName = (TextView) viewInflate.findViewById(R.id.tvFunctionName);
        this.ivMarker = (ImageView) viewInflate.findViewById(R.id.ivMarker);
        this.tvRedDot = (TextView) viewInflate.findViewById(R.id.tvRedDot);
        ImageView imageView = this.ivFunctionIcon;
        TextView textView = null;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = this.menuIconWidth;
        marginLayoutParams.height = this.menuIconHeight;
        marginLayoutParams.topMargin = this.menuIconMarginTop;
        marginLayoutParams.bottomMargin = this.menuIconMarginBottom;
        ImageView imageView2 = this.ivFunctionIcon;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            imageView2 = null;
        }
        imageView2.setLayoutParams(marginLayoutParams);
        TextView textView2 = this.tvFunctionName;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView2 = null;
        }
        textView2.setTextColor(this.menuTitleTextColor);
        TextView textView3 = this.tvFunctionName;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView3 = null;
        }
        textView3.setTextSize(0, this.menuTitleTextSize);
        TextView textView4 = this.tvFunctionName;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView4 = null;
        }
        int i = this.menuTitlePaddingStart;
        TextView textView5 = this.tvFunctionName;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            textView5 = null;
        }
        int paddingTop = textView5.getPaddingTop();
        int i2 = this.menuTitlePaddingEnd;
        TextView textView6 = this.tvFunctionName;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            textView = textView6;
        }
        textView4.setPadding(i, paddingTop, i2, textView.getPaddingBottom());
    }

    private final void initAttrs(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.MenuView, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == R.styleable.MenuView_menu_layout) {
                this.layoutId = typedArrayObtainStyledAttributes.getResourceId(index, this.layoutId);
            } else if (index == R.styleable.MenuView_menuIconWidth) {
                this.menuIconWidth = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuIconWidth);
            } else if (index == R.styleable.MenuView_menuIconHeight) {
                this.menuIconHeight = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuIconHeight);
            } else if (index == R.styleable.MenuView_menuIconMarginTop) {
                this.menuIconMarginTop = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuIconMarginTop);
            } else if (index == R.styleable.MenuView_menuIconMarginBottom) {
                this.menuIconMarginBottom = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuIconMarginBottom);
            } else if (index == R.styleable.MenuView_menuTitleTextColor) {
                this.menuTitleTextColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes, index, this.menuTitleTextColor);
            } else if (index == R.styleable.MenuView_menuTitleTextSize) {
                this.menuTitleTextSize = typedArrayObtainStyledAttributes.getDimension(index, this.menuTitleTextSize);
            } else if (index == R.styleable.MenuView_menuTitlePaddingStart) {
                this.menuTitlePaddingStart = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuTitlePaddingStart);
            } else if (index == R.styleable.MenuView_menuTitlePaddingEnd) {
                this.menuTitlePaddingEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.menuTitlePaddingEnd);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final ImageView getFunctionIcon() {
        ImageView imageView = this.ivFunctionIcon;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TextView getFunctionName() {
        TextView textView = this.tvFunctionName;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final ImageView getFunctionMarker() {
        ImageView imageView = this.ivMarker;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final TextView getFunctionRedDot() {
        TextView textView = this.tvRedDot;
        if (textView != null) {
            return textView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }
}
