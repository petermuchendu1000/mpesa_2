package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.input.CommonInputView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivityAddFavouriteFriendBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final Barrier barrier;
    public final LoadingButton btnConfirm;
    public final CommonInputView inputAccountNumber;
    public final CommonInputView inputName;
    public final CommonInputView inputPhoneNumber;
    public final RoundImageView ivBack;
    public final TextView tvInputNameTips;
    public final TextView tvTips;
    public final TextView tvTitle;
    public final View viewBg;

    protected ActivityAddFavouriteFriendBinding(Object obj, View view, int i, Barrier barrier, LoadingButton loadingButton, CommonInputView commonInputView, CommonInputView commonInputView2, CommonInputView commonInputView3, RoundImageView roundImageView, TextView textView, TextView textView2, TextView textView3, View view2) {
        super(obj, view, i);
        this.barrier = barrier;
        this.btnConfirm = loadingButton;
        this.inputAccountNumber = commonInputView;
        this.inputName = commonInputView2;
        this.inputPhoneNumber = commonInputView3;
        this.ivBack = roundImageView;
        this.tvInputNameTips = textView;
        this.tvTips = textView2;
        this.tvTitle = textView3;
        this.viewBg = view2;
    }

    public static ActivityAddFavouriteFriendBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 59;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityAddFavouriteFriendBindingInflate;
    }

    @Deprecated
    public static ActivityAddFavouriteFriendBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBinding = (ActivityAddFavouriteFriendBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_add_favourite_friend, viewGroup, z, obj);
        int i4 = copydefault + 51;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityAddFavouriteFriendBinding;
        }
        throw null;
    }

    public static ActivityAddFavouriteFriendBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 31;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 71;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return activityAddFavouriteFriendBindingInflate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivityAddFavouriteFriendBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i;
        boolean z;
        int i2 = 2 % 2;
        int i3 = copydefault + 79;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            i = R.layout.activity_add_favourite_friend;
            z = true;
        } else {
            i = R.layout.activity_add_favourite_friend;
            z = false;
        }
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBinding = (ActivityAddFavouriteFriendBinding) ViewDataBinding.inflateInternal(layoutInflater, i, null, z, obj);
        int i4 = copydefault + 77;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return activityAddFavouriteFriendBinding;
    }

    public static ActivityAddFavouriteFriendBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 11;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 15 / 0;
        }
        return activityAddFavouriteFriendBindingBind;
    }

    @Deprecated
    public static ActivityAddFavouriteFriendBinding bind(View view, Object obj) {
        ActivityAddFavouriteFriendBinding activityAddFavouriteFriendBinding;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            activityAddFavouriteFriendBinding = (ActivityAddFavouriteFriendBinding) bind(obj, view, R.layout.activity_add_favourite_friend);
            int i3 = 22 / 0;
        } else {
            activityAddFavouriteFriendBinding = (ActivityAddFavouriteFriendBinding) bind(obj, view, R.layout.activity_add_favourite_friend);
        }
        int i4 = ShareDataUIState + 31;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return activityAddFavouriteFriendBinding;
    }
}
