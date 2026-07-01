package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityUserScopesPermissionBinding extends ViewDataBinding {
    private static int component2 = 1;
    private static int copydefault;
    public final Button btnAccept;
    public final Button btnReject;
    public final ConstraintLayout csHeader;
    public final ImageView imgIcon;
    public final RoundImageView ivBack;
    public final RecyclerView rvScopes;
    public final TextView tvAppName;
    public final TextView tvDesc;
    public final TextView tvTitle;
    public final LinearLayout userScopesButtonsContainer;
    public final View viewBg;

    protected ActivityUserScopesPermissionBinding(Object obj, View view, int i, Button button, Button button2, ConstraintLayout constraintLayout, ImageView imageView, RoundImageView roundImageView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout, View view2) {
        super(obj, view, i);
        this.btnAccept = button;
        this.btnReject = button2;
        this.csHeader = constraintLayout;
        this.imgIcon = imageView;
        this.ivBack = roundImageView;
        this.rvScopes = recyclerView;
        this.tvAppName = textView;
        this.tvDesc = textView2;
        this.tvTitle = textView3;
        this.userScopesButtonsContainer = linearLayout;
        this.viewBg = view2;
    }

    public static ActivityUserScopesPermissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 51;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return inflate(layoutInflater, viewGroup, z, defaultComponent);
        }
        inflate(layoutInflater, viewGroup, z, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityUserScopesPermissionBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = component2 + 35;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityUserScopesPermissionBinding activityUserScopesPermissionBinding = (ActivityUserScopesPermissionBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_user_scopes_permission, viewGroup, z, obj);
        int i4 = component2 + 109;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityUserScopesPermissionBinding;
        }
        throw null;
    }

    public static ActivityUserScopesPermissionBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 == 0) {
            return inflate(layoutInflater, defaultComponent);
        }
        inflate(layoutInflater, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityUserScopesPermissionBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 123;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_user_scopes_permission;
            z = true;
        } else {
            i = R.layout.activity_user_scopes_permission;
            z = false;
        }
        return (ActivityUserScopesPermissionBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
    }

    public static ActivityUserScopesPermissionBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityUserScopesPermissionBinding activityUserScopesPermissionBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 83 / 0;
        }
        return activityUserScopesPermissionBindingBind;
    }

    @Deprecated
    public static ActivityUserScopesPermissionBinding bind(View view, Object obj) {
        ActivityUserScopesPermissionBinding activityUserScopesPermissionBinding;
        int i = 2 % 2;
        int i2 = component2 + 11;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityUserScopesPermissionBinding = (ActivityUserScopesPermissionBinding) bind(obj, view, R.layout.activity_user_scopes_permission);
            int i3 = 95 / 0;
        } else {
            activityUserScopesPermissionBinding = (ActivityUserScopesPermissionBinding) bind(obj, view, R.layout.activity_user_scopes_permission);
        }
        int i4 = component2 + 107;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return activityUserScopesPermissionBinding;
        }
        throw null;
    }
}
