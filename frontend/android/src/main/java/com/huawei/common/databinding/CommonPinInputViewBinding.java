package com.huawei.common.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huawei.common.R;
import com.huawei.common.widget.round.RoundConstraintLayout;

public final class CommonPinInputViewBinding implements ViewBinding {
    public final RoundConstraintLayout clInput;
    private final View component2;
    public final EditText etInput;
    public final ImageView ivIcon;
    public final TextView tvAreaCode;
    public final TextView tvError;
    public final TextView tvTitle;

    private CommonPinInputViewBinding(View view, RoundConstraintLayout roundConstraintLayout, EditText editText, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.component2 = view;
        this.clInput = roundConstraintLayout;
        this.etInput = editText;
        this.ivIcon = imageView;
        this.tvAreaCode = textView;
        this.tvError = textView2;
        this.tvTitle = textView3;
    }

    @Override
    public View getRoot() {
        return this.component2;
    }

    public static CommonPinInputViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.common_pin_input_view, viewGroup);
        return bind(viewGroup);
    }

    public static CommonPinInputViewBinding bind(View view) {
        int i = R.id.cl_input;
        RoundConstraintLayout roundConstraintLayout = (RoundConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (roundConstraintLayout != null) {
            i = R.id.et_input;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
            if (editText != null) {
                i = R.id.iv_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tv_area_code;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.tv_error;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView2 != null) {
                            i = R.id.tv_title;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView3 != null) {
                                return new CommonPinInputViewBinding(view, roundConstraintLayout, editText, imageView, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
