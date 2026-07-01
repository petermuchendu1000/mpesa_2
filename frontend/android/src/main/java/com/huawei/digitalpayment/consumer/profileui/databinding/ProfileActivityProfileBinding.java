package com.huawei.digitalpayment.consumer.profileui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.huawei.common.widget.round.RoundRecyclerView;
import com.huawei.digitalpayment.consumer.profileui.R;

public abstract class ProfileActivityProfileBinding extends ViewDataBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    public final ProfileItemProfileBinding profilemgt;
    public final RoundRecyclerView profilesList;
    public final RoundRecyclerView profilesRecycler;

    protected ProfileActivityProfileBinding(Object obj, View view, int i, ProfileItemProfileBinding profileItemProfileBinding, RoundRecyclerView roundRecyclerView, RoundRecyclerView roundRecyclerView2) {
        super(obj, view, i);
        this.profilemgt = profileItemProfileBinding;
        this.profilesList = roundRecyclerView;
        this.profilesRecycler = roundRecyclerView2;
    }

    public static ProfileActivityProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 15;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileBinding profileActivityProfileBindingInflate = inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
        if (i3 != 0) {
            int i4 = 34 / 0;
        }
        return profileActivityProfileBindingInflate;
    }

    @Deprecated
    public static ProfileActivityProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        ProfileActivityProfileBinding profileActivityProfileBinding = (ProfileActivityProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_profile, viewGroup, z, obj);
        int i3 = ShareDataUIState + 63;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 16 / 0;
        }
        return profileActivityProfileBinding;
    }

    public static ProfileActivityProfileBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 95;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileBinding profileActivityProfileBindingInflate = inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
        int i4 = copydefault + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return profileActivityProfileBindingInflate;
        }
        throw null;
    }

    @Deprecated
    public static ProfileActivityProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        int i = 2 % 2;
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileBinding profileActivityProfileBinding = (ProfileActivityProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.profile_activity_profile, null, false, obj);
        int i4 = ShareDataUIState + 61;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileBinding;
    }

    public static ProfileActivityProfileBinding bind(View view) {
        int i = 2 % 2;
        int i2 = copydefault + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        DataBindingComponent defaultComponent = DataBindingUtil.getDefaultComponent();
        if (i3 != 0) {
            return bind(view, defaultComponent);
        }
        bind(view, defaultComponent);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Deprecated
    public static ProfileActivityProfileBinding bind(View view, Object obj) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        ProfileActivityProfileBinding profileActivityProfileBinding = (ProfileActivityProfileBinding) bind(obj, view, R.layout.profile_activity_profile);
        int i4 = ShareDataUIState + 41;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return profileActivityProfileBinding;
    }
}
