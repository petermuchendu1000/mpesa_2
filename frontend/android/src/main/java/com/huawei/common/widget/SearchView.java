package com.huawei.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.huawei.common.R;
import com.huawei.common.databinding.BasicSearchViewBinding;
import com.huawei.common.listener.FilterFastClickListener;
import com.huawei.common.widget.input.AttrUtils;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundLinearLayout;
import kotlin.ActivityResultRegistryKtrememberLauncherForActivityResultkey1;
import kotlin.unregister;

public class SearchView extends RoundLinearLayout {
    private BasicSearchViewBinding binding;
    private int clearIcon;
    private boolean enableEdittext;
    private int focusColor;
    private int frameWidth;
    private float height;
    private OnSearchResultListener onSearchResultListener;
    private int searchButtonColor;
    private String searchHint;
    private int searchHintColor;
    private int searchIcon;
    private String searchText;
    private int searchTextColor;
    private boolean showClearIcon;
    private boolean showSearchButton;
    private boolean showSearchIcon;
    private int unFocusColor;

    public interface OnSearchResultListener {
        void onAutoSearch(String str);

        void onClickSearch(String str);
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.showClearIcon = true;
        this.showSearchButton = true;
        this.enableEdittext = true;
        this.showSearchIcon = true;
        this.searchHintColor = 0;
        this.searchTextColor = 0;
        this.searchButtonColor = 0;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        initAttrs(context, attributeSet);
        initView(context);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.round_corner);
        if (typedArrayObtainStyledAttributes.getIndexCount() == 0) {
            getBaseFilletView().setRoundCorner(SizeUtils.dp2px(16.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.SearchView);
        this.showSearchButton = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SearchView_searchview_show_search_button, true);
        this.enableEdittext = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SearchView_searchview_enable_edittext, true);
        this.showClearIcon = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SearchView_searchview_show_clear_icon, true);
        this.showSearchIcon = typedArrayObtainStyledAttributes2.getBoolean(R.styleable.SearchView_searchview_show_search_icon, true);
        this.searchIcon = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.SearchView_searchview_search_icon, 0);
        this.clearIcon = typedArrayObtainStyledAttributes2.getResourceId(R.styleable.SearchView_searchview_clear_icon, 0);
        this.searchText = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_search_text);
        this.searchHint = AttrUtils.INSTANCE.getString(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_search_hint);
        this.height = typedArrayObtainStyledAttributes2.getDimension(R.styleable.SearchView_searchview_height, ConvertUtils.dp2px(32.0f));
        this.frameWidth = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(R.styleable.SearchView_searchview_frame_width, ConvertUtils.dp2px(1.0f));
        this.focusColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_focus_color, context.getColor(R.color.colorPrimary));
        this.unFocusColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_un_focus_color, context.getColor(R.color.colorBackgroundFloating));
        this.searchHintColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_search_hint_color, context.getColor(R.color.colorPlaceholderText));
        this.searchTextColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_search_edittext_color, context.getColor(R.color.colorMainText));
        this.searchButtonColor = AttrUtils.INSTANCE.getColor(context, typedArrayObtainStyledAttributes2, R.styleable.SearchView_searchview_search_button_color, context.getColor(R.color.colorPrimary));
        initDefaultParams(context);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void initDefaultParams(Context context) {
        if (TextUtils.isEmpty(this.searchText)) {
            this.searchText = getResources().getString(R.string.basic_search_btn_text);
        }
        if (TextUtils.isEmpty(this.searchHint)) {
            this.searchHint = getResources().getString(R.string.basic_search_hint);
        }
        if (this.searchIcon == 0) {
            this.searchIcon = R.mipmap.basic_icon_search;
        }
        if (this.clearIcon == 0) {
            this.clearIcon = R.mipmap.basic_search_delete;
        }
    }

    private void initView(Context context) {
        this.binding = BasicSearchViewBinding.inflate(LayoutInflater.from(context), this, true);
        if (getBackground() == null) {
            setBackgroundColor(ColorUtils.getColor(R.color.colorBackgroundFloating));
        }
        getBaseFilletView().setStrokeWidth(this.frameWidth);
        getBaseFilletView().setStrokeColor(this.unFocusColor);
        this.binding.edittext.getEditText().setHintTextColor(this.searchHintColor);
        this.binding.edittext.getEditText().setTextColor(this.searchTextColor);
        this.binding.tvSearch.setTextColor(this.searchButtonColor);
        this.binding.tvSearch.setText(this.searchText);
        this.binding.edittext.getEditText().setHint(this.searchHint);
        this.binding.imSearch.setImageResource(this.searchIcon);
        this.binding.imClear.setImageResource(this.clearIcon);
        this.binding.vUnEnableRoot.setVisibility(this.enableEdittext ? 8 : 0);
        this.binding.clSearchRoot.getLayoutParams().height = (int) this.height;
        if (!this.showSearchButton) {
            this.binding.llRightSearch.setVisibility(8);
        }
        if (!this.showSearchIcon) {
            this.binding.imSearch.setVisibility(8);
        }
        initListener();
    }

    private void initListener() {
        this.binding.edittext.getEditText().setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean z) {
                if (z) {
                    SearchView.this.getBaseFilletView().setStrokeColor(SearchView.this.focusColor);
                } else {
                    SearchView.this.getBaseFilletView().setStrokeColor(SearchView.this.unFocusColor);
                }
            }
        });
        this.binding.edittext.getEditText().addTextChangedListener(new AnonymousClass2());
        this.binding.imClear.setOnClickListener(new FilterFastClickListener() {
            @Override
            public void onFilterClick(View view) {
                SearchView.this.binding.edittext.getEditText().setText("");
            }
        });
        this.binding.tvSearch.setOnClickListener(new FilterFastClickListener() {
            @Override
            public void onFilterClick(View view) {
                SearchView.this.onClickSearchResult();
            }
        });
        this.binding.imSearch.setOnClickListener(new AnonymousClass3());
    }

    public class AnonymousClass2 extends MPTextWatcher {
        AnonymousClass2() {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            SearchView.this.setImClearVisible(charSequence);
            SearchView.this.onAutoSearchResult();
        }

        public static void component2() {
            unregister.component1[0] = ActivityResultRegistryKtrememberLauncherForActivityResultkey1.component3[0];
        }
    }

    public class AnonymousClass3 extends FilterFastClickListener {
        public static int component3;
        public static int copydefault;

        AnonymousClass3() {
        }

        @Override
        public void onFilterClick(View view) {
            SearchView.this.onClickSearchResult();
        }

        public static int component3() {
            int i = component3;
            int i2 = i % 7936529;
            component3 = i + 1;
            if (i2 != 0) {
                return copydefault;
            }
            int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
            copydefault = iMaxMemory;
            return iMaxMemory;
        }
    }

    public void setImClearVisible(CharSequence charSequence) {
        if (!this.showClearIcon || charSequence == null) {
            this.binding.imClear.setVisibility(8);
        } else if (charSequence.length() == 0) {
            this.binding.imClear.setVisibility(8);
        } else {
            this.binding.imClear.setVisibility(0);
        }
    }

    public void onClickSearchResult() {
        OnSearchResultListener onSearchResultListener = this.onSearchResultListener;
        if (onSearchResultListener != null) {
            onSearchResultListener.onClickSearch(this.binding.edittext.getText());
        }
    }

    public void onAutoSearchResult() {
        OnSearchResultListener onSearchResultListener = this.onSearchResultListener;
        if (onSearchResultListener != null) {
            onSearchResultListener.onAutoSearch(this.binding.edittext.getText());
        }
    }

    public ConstraintLayout getSearchRoot() {
        return this.binding.clSearchRoot;
    }

    public View getUnEnableRootView() {
        return this.binding.vUnEnableRoot;
    }

    public ImageView getSearchImageView() {
        return this.binding.imSearch;
    }

    public ImageView getSearchImageViewEnd() {
        return this.binding.imSearchEnd;
    }

    public CommonInputView getEditText() {
        return this.binding.edittext;
    }

    public ImageView getClearImageView() {
        return this.binding.imClear;
    }

    public LinearLayout getRightRoot() {
        return this.binding.llRightSearch;
    }

    public View getDividerView() {
        return this.binding.viewDivider;
    }

    public TextView getSearchTextView() {
        return this.binding.tvSearch;
    }

    public void setOnSearchResultListener(OnSearchResultListener onSearchResultListener) {
        this.onSearchResultListener = onSearchResultListener;
    }

    public void setSearchButtonMaxWidth(int i) {
        this.binding.tvSearch.setMaxWidth(i);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.binding.edittext.getInputParentWrapper().getInputTextWrapper().setInputHeight(i4 - i2);
            setSearchButtonMaxWidth((getMeasuredWidth() / 2) - ConvertUtils.dp2px(90.0f));
        }
    }

    public String getSearchText() {
        return this.binding.edittext.getText();
    }
}
