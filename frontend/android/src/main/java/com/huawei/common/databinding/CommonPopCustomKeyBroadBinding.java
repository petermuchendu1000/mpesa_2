package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;

public final class CommonPopCustomKeyBroadBinding implements ViewBinding {
    private final LinearLayout ShareDataUIState;
    public final ImageView ivClose;
    public final RecyclerView rvRecyclerView;

    private CommonPopCustomKeyBroadBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView) {
        this.ShareDataUIState = linearLayout;
        this.ivClose = imageView;
        this.rvRecyclerView = recyclerView;
    }

    @Override
    public LinearLayout getRoot() {
        return this.ShareDataUIState;
    }

    public static CommonPopCustomKeyBroadBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonPopCustomKeyBroadBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_pop_custom_key_broad, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonPopCustomKeyBroadBinding bind(View view) {
        int i = R.id.iv_close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.rv_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new CommonPopCustomKeyBroadBinding((LinearLayout) view, imageView, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
