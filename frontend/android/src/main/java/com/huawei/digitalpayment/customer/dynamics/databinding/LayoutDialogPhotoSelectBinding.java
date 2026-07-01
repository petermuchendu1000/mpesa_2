package com.huawei.digitalpayment.customer.dynamics.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.widget.round.RoundLinearLayout;
import com.huawei.digitalpayment.customer.dynamics.R;

public final class LayoutDialogPhotoSelectBinding implements ViewBinding {
    private static int component1 = 1;
    private static int component3;
    private final RoundLinearLayout component2;
    public final TextView tvAlbum;
    public final TextView tvCamera;
    public final TextView tvCancel;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            getRoot();
            throw null;
        }
        RoundLinearLayout root = getRoot();
        int i3 = component1 + 9;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            return root;
        }
        throw null;
    }

    private LayoutDialogPhotoSelectBinding(RoundLinearLayout roundLinearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.component2 = roundLinearLayout;
        this.tvAlbum = textView;
        this.tvCamera = textView2;
        this.tvCancel = textView3;
    }

    @Override
    public RoundLinearLayout getRoot() {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        RoundLinearLayout roundLinearLayout = this.component2;
        int i5 = i2 + 75;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return roundLinearLayout;
    }

    public static LayoutDialogPhotoSelectBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 55;
        component1 = i2 % 128;
        LayoutDialogPhotoSelectBinding layoutDialogPhotoSelectBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = component3 + 43;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return layoutDialogPhotoSelectBindingInflate;
        }
        throw null;
    }

    public static LayoutDialogPhotoSelectBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.layout_dialog_photo_select, viewGroup, false);
        if (!(!z)) {
            viewGroup.addView(viewInflate);
            int i2 = component1 + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }
        LayoutDialogPhotoSelectBinding layoutDialogPhotoSelectBindingBind = bind(viewInflate);
        int i4 = component3 + 13;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return layoutDialogPhotoSelectBindingBind;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LayoutDialogPhotoSelectBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 59;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.id.tv_album;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i4);
        if (textView != null) {
            int i5 = component1 + 69;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            i4 = R.id.tv_camera;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i4);
            if (textView2 != null) {
                i4 = R.id.tv_cancel;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i4);
                if (textView3 != null) {
                    return new LayoutDialogPhotoSelectBinding((RoundLinearLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i4)));
    }
}
