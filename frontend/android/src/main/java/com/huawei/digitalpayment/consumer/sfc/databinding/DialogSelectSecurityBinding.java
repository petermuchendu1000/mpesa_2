package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.round.RoundConstraintLayout;
import com.huawei.digitalpayment.consumer.sfc.R;

public final class DialogSelectSecurityBinding implements ViewBinding {
    private static int component1 = 0;
    private static int component2 = 1;
    private final RoundConstraintLayout ShareDataUIState;
    public final LoadingButton btnSelect;
    public final ImageView ivClose;
    public final RecyclerView rvList;
    public final TextView tvTitle;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 59;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoundConstraintLayout root = getRoot();
        int i4 = component1 + 109;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return root;
    }

    private DialogSelectSecurityBinding(RoundConstraintLayout roundConstraintLayout, LoadingButton loadingButton, ImageView imageView, RecyclerView recyclerView, TextView textView) {
        this.ShareDataUIState = roundConstraintLayout;
        this.btnSelect = loadingButton;
        this.ivClose = imageView;
        this.rvList = recyclerView;
        this.tvTitle = textView;
    }

    @Override
    public RoundConstraintLayout getRoot() {
        int i = 2 % 2;
        int i2 = component1 + 11;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        RoundConstraintLayout roundConstraintLayout = this.ShareDataUIState;
        int i5 = i3 + 57;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roundConstraintLayout;
    }

    public static DialogSelectSecurityBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component1 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DialogSelectSecurityBinding dialogSelectSecurityBindingInflate = inflate(layoutInflater, null, false);
        int i4 = component1 + 107;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 57 / 0;
        }
        return dialogSelectSecurityBindingInflate;
    }

    public static DialogSelectSecurityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component2 + 103;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.dialog_select_security, viewGroup, false);
        if (z) {
            int i4 = component1 + 59;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        return bind(viewInflate);
    }

    public static DialogSelectSecurityBinding bind(View view) {
        int i = 2 % 2;
        int i2 = R.id.btnSelect;
        LoadingButton loadingButton = (LoadingButton) ViewBindings.findChildViewById(view, i2);
        if (loadingButton != null) {
            i2 = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i2);
            if (imageView != null) {
                i2 = R.id.rv_list;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i2);
                if (recyclerView != null) {
                    int i3 = component2 + 89;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    i2 = R.id.tv_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i2);
                    if (textView != null) {
                        DialogSelectSecurityBinding dialogSelectSecurityBinding = new DialogSelectSecurityBinding((RoundConstraintLayout) view, loadingButton, imageView, recyclerView, textView);
                        int i5 = component2 + 29;
                        component1 = i5 % 128;
                        if (i5 % 2 == 0) {
                            return dialogSelectSecurityBinding;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }
}
