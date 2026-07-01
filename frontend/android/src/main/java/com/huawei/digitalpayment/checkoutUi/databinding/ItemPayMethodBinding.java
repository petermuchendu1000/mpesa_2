package com.huawei.digitalpayment.checkoutUi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.digitalpayment.checkoutUi.R;

public final class ItemPayMethodBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int component2;
    public final ImageView cbIsChecked;
    private final RelativeLayout copydefault;
    public final ImageView ivLogo;
    public final ImageView ivLogoOther;
    public final LinearLayout llDisplayItem;
    public final RelativeLayout rlOtherCard;
    public final RelativeLayout rlPayMethod;
    public final RelativeLayout rlPayMethodItem;
    public final RelativeLayout rlRadioButtonContainer;
    public final RelativeLayout rlTitle;
    public final RecyclerView rvBnpl;
    public final TextView tvPayMethodActive;
    public final TextView tvPayMethodDes;
    public final TextView tvTitle;
    public final TextView tvTitleOther;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 59;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        RelativeLayout root = getRoot();
        int i3 = ShareDataUIState + 65;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 86 / 0;
        }
        return root;
    }

    private ItemPayMethodBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.copydefault = relativeLayout;
        this.cbIsChecked = imageView;
        this.ivLogo = imageView2;
        this.ivLogoOther = imageView3;
        this.llDisplayItem = linearLayout;
        this.rlOtherCard = relativeLayout2;
        this.rlPayMethod = relativeLayout3;
        this.rlPayMethodItem = relativeLayout4;
        this.rlRadioButtonContainer = relativeLayout5;
        this.rlTitle = relativeLayout6;
        this.rvBnpl = recyclerView;
        this.tvPayMethodActive = textView;
        this.tvPayMethodDes = textView2;
        this.tvTitle = textView3;
        this.tvTitleOther = textView4;
    }

    @Override
    public RelativeLayout getRoot() {
        int i = 2 % 2;
        int i2 = component2 + 109;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        RelativeLayout relativeLayout = this.copydefault;
        int i4 = i3 + 123;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return relativeLayout;
        }
        throw null;
    }

    public static ItemPayMethodBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 83;
        component2 = i2 % 128;
        ItemPayMethodBinding itemPayMethodBindingInflate = inflate(layoutInflater, null, i2 % 2 != 0);
        int i3 = ShareDataUIState + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return itemPayMethodBindingInflate;
    }

    public static ItemPayMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.item_pay_method, viewGroup, false);
        if (z) {
            int i2 = component2 + 95;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
                int i3 = 4 / 0;
            } else {
                viewGroup.addView(viewInflate);
            }
        }
        ItemPayMethodBinding itemPayMethodBindingBind = bind(viewInflate);
        int i4 = ShareDataUIState + 61;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return itemPayMethodBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ItemPayMethodBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.cb_is_checked;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
        if (imageView != null) {
            int i3 = ShareDataUIState + 93;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            i2 = R.id.iv_logo;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView2 != null) {
                i2 = R.id.iv_logo_other;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i2);
                if (imageView3 != null) {
                    i2 = R.id.ll_display_item;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i2);
                    if (linearLayout != null) {
                        i2 = R.id.rl_other_card;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                        if (relativeLayout != null) {
                            i2 = R.id.rl_pay_method;
                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                            if (relativeLayout2 != null) {
                                i2 = R.id.rl_pay_method_item;
                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                                if (relativeLayout3 != null) {
                                    int i5 = component2 + 123;
                                    ShareDataUIState = i5 % 128;
                                    Object obj = null;
                                    if (i5 % 2 == 0) {
                                        throw null;
                                    }
                                    RelativeLayout relativeLayout4 = (RelativeLayout) view;
                                    i2 = R.id.rl_title;
                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i2);
                                    if (relativeLayout5 != null) {
                                        int i6 = ShareDataUIState + 27;
                                        component2 = i6 % 128;
                                        if (i6 % 2 != 0) {
                                            obj.hashCode();
                                            throw null;
                                        }
                                        i2 = R.id.rv_bnpl;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
                                        if (recyclerView != null) {
                                            i2 = R.id.tv_pay_method_active;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                                            if (textView != null) {
                                                i2 = R.id.tv_pay_method_des;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                if (textView2 != null) {
                                                    int i7 = component2 + 43;
                                                    ShareDataUIState = i7 % 128;
                                                    if (i7 % 2 == 0) {
                                                        obj.hashCode();
                                                        throw null;
                                                    }
                                                    i2 = R.id.tv_title;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                    if (textView3 != null) {
                                                        i2 = R.id.tv_title_other;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i2);
                                                        if (textView4 != null) {
                                                            return new ItemPayMethodBinding(relativeLayout4, imageView, imageView2, imageView3, linearLayout, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, recyclerView, textView, textView2, textView3, textView4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
