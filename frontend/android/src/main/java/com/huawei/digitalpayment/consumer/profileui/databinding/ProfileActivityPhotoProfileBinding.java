package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundTextView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityPhotoProfileBinding extends ViewDataBinding {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    public final RoundTextView btnSelectPhoto;
    public final RoundTextView btnTakePhoto;
    public final ImageView ivPhoto;

    protected ProfileActivityPhotoProfileBinding(Object obj, View view, int i, RoundTextView roundTextView, RoundTextView roundTextView2, ImageView imageView) {
        super(obj, view, i);
        this.btnSelectPhoto = roundTextView;
        this.btnTakePhoto = roundTextView2;
        this.ivPhoto = imageView;
    }

    public static ProfileActivityPhotoProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        int i4 = component3 + 115;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return profileActivityPhotoProfileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ProfileActivityPhotoProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBinding = (ProfileActivityPhotoProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_photo_profile, viewGroup, z, obj);
        if (i3 != 0) {
            return profileActivityPhotoProfileBinding;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static ProfileActivityPhotoProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        return profileActivityPhotoProfileBindingInflate;
    }

    @Deprecated
    public static ProfileActivityPhotoProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = component3 + 89;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBinding = (ProfileActivityPhotoProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_photo_profile, null, false, obj);
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return profileActivityPhotoProfileBinding;
    }

    public static ProfileActivityPhotoProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = component3 + 49;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBindingBind = bind(view, DataBindingUtil.getDefaultComponent());
        int i4 = ShareDataUIState + 65;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return profileActivityPhotoProfileBindingBind;
    }

    @Deprecated
    public static ProfileActivityPhotoProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityPhotoProfileBinding profileActivityPhotoProfileBinding = (ProfileActivityPhotoProfileBinding) bind(obj, view, R.layout.profile_activity_photo_profile);
        if (i3 == 0) {
            int i4 = 79 / 0;
        }
        return profileActivityPhotoProfileBinding;
    }
}
