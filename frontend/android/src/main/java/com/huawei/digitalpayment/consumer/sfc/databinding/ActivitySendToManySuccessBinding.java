package com.huawei.digitalpayment.consumer.sfc.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.common.widget.LoadingButton;
import com.huawei.common.widget.RotateImageView;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.sfc.R;

public abstract class ActivitySendToManySuccessBinding extends ViewDataBinding {
    private static int component3 = 1;
    private static int copydefault;
    public final TextView amout;
    public final LoadingButton btnConfirm;
    public final TextView failedAmount;
    public final TextView failedRecipients;
    public final TextView fee;
    public final RoundImageView imStatusFinal;
    public final RotateImageView imStatusLoading;
    public final RoundImageView ivDelete;
    public final View line1;
    public final View line2;
    public final View line3;
    public final LinearLayout llAllContainer;
    public final LinearLayout llFailedContainer;
    public final RelativeLayout rlContent;
    public final RelativeLayout rlTop;
    public final ConstraintLayout rootView;
    public final RecyclerView rvFailed;
    public final RecyclerView rvSuccess;
    public final TextView successAmount;
    public final TextView successId;
    public final TextView successRecipients;
    public final TextView tvDate;
    public final TextView tvTitle;

    protected ActivitySendToManySuccessBinding(Object obj, View view, int i, TextView textView, LoadingButton loadingButton, TextView textView2, TextView textView3, TextView textView4, RoundImageView roundImageView, RotateImageView rotateImageView, RoundImageView roundImageView2, View view2, View view3, View view4, LinearLayout linearLayout, LinearLayout linearLayout2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ConstraintLayout constraintLayout, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        super(obj, view, i);
        this.amout = textView;
        this.btnConfirm = loadingButton;
        this.failedAmount = textView2;
        this.failedRecipients = textView3;
        this.fee = textView4;
        this.imStatusFinal = roundImageView;
        this.imStatusLoading = rotateImageView;
        this.ivDelete = roundImageView2;
        this.line1 = view2;
        this.line2 = view3;
        this.line3 = view4;
        this.llAllContainer = linearLayout;
        this.llFailedContainer = linearLayout2;
        this.rlContent = relativeLayout;
        this.rlTop = relativeLayout2;
        this.rootView = constraintLayout;
        this.rvFailed = recyclerView;
        this.rvSuccess = recyclerView2;
        this.successAmount = textView5;
        this.successId = textView6;
        this.successRecipients = textView7;
        this.tvDate = textView8;
        this.tvTitle = textView9;
    }

    public static ActivitySendToManySuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManySuccessBinding activitySendToManySuccessBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 3;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySendToManySuccessBindingInflate;
    }

    @Deprecated
    public static ActivitySendToManySuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        ActivitySendToManySuccessBinding activitySendToManySuccessBinding = (ActivitySendToManySuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_to_many_success, viewGroup, z, obj);
        int i3 = component3 + 83;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return activitySendToManySuccessBinding;
    }

    public static ActivitySendToManySuccessBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 81;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManySuccessBinding activitySendToManySuccessBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        return activitySendToManySuccessBindingInflate;
    }

    @Deprecated
    public static ActivitySendToManySuccessBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManySuccessBinding activitySendToManySuccessBinding = (ActivitySendToManySuccessBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.activity_send_to_many_success, null, false, obj);
        int i4 = copydefault + 69;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return activitySendToManySuccessBinding;
        }
        throw null;
    }

    public static ActivitySendToManySuccessBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            bind(view, DataBindingUtil.getDefaultComponent());
            obj.hashCode();
            throw null;
        }
        ActivitySendToManySuccessBinding activitySendToManySuccessBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i3 = copydefault + 101;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return activitySendToManySuccessBindingBind;
        }
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ActivitySendToManySuccessBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 3;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ActivitySendToManySuccessBinding activitySendToManySuccessBinding = (ActivitySendToManySuccessBinding) bind(obj, view, R.layout.activity_send_to_many_success);
        int i4 = copydefault + 21;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return activitySendToManySuccessBinding;
    }
}
