package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundLinearLayout;

public final class CommonToastBinding implements ViewBinding {
    private final RoundLinearLayout ShareDataUIState;
    public final TextView toastMessage;

    private CommonToastBinding(RoundLinearLayout roundLinearLayout, TextView textView) {
        this.ShareDataUIState = roundLinearLayout;
        this.toastMessage = textView;
    }

    @Override
    public RoundLinearLayout getRoot() {
        return this.ShareDataUIState;
    }

    public static CommonToastBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CommonToastBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.common_toast, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static CommonToastBinding bind(View view) {
        int i = R.id.toast_message;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            return new CommonToastBinding((RoundLinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
