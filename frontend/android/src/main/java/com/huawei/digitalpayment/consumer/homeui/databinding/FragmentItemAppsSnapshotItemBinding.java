package com.huawei.digitalpayment.consumer.homeui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.huawei.common.widget.round.RoundImageView;
import com.huawei.digitalpayment.consumer.homeui.R;

public final class FragmentItemAppsSnapshotItemBinding implements ViewBinding {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final RoundImageView component2;

    @Override
    public View getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            getRoot();
            throw null;
        }
        RoundImageView root = getRoot();
        int i3 = copydefault + 3;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return root;
        }
        throw null;
    }

    private FragmentItemAppsSnapshotItemBinding(RoundImageView roundImageView) {
        this.component2 = roundImageView;
    }

    @Override
    public RoundImageView getRoot() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 73;
        int i3 = i2 % 128;
        copydefault = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        RoundImageView roundImageView = this.component2;
        int i4 = i3 + 101;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return roundImageView;
    }

    public static FragmentItemAppsSnapshotItemBinding inflate(LayoutInflater layoutInflater) {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        ShareDataUIState = i2 % 128;
        FragmentItemAppsSnapshotItemBinding fragmentItemAppsSnapshotItemBindingInflate = inflate(layoutInflater, null, i2 % 2 == 0);
        int i3 = copydefault + 53;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return fragmentItemAppsSnapshotItemBindingInflate;
        }
        throw null;
    }

    public static FragmentItemAppsSnapshotItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        int i = 2 % 2;
        View viewInflate = layoutInflater.inflate(R.layout.fragment_item_apps_snapshot_item, viewGroup, false);
        if (z) {
            int i2 = ShareDataUIState + 67;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                viewGroup.addView(viewInflate);
            } else {
                viewGroup.addView(viewInflate);
                throw null;
            }
        }
        FragmentItemAppsSnapshotItemBinding fragmentItemAppsSnapshotItemBindingBind = bind(viewInflate);
        int i3 = copydefault + 5;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 85 / 0;
        }
        return fragmentItemAppsSnapshotItemBindingBind;
    }

    public static FragmentItemAppsSnapshotItemBinding bind(View view) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 67;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentItemAppsSnapshotItemBinding fragmentItemAppsSnapshotItemBinding = new FragmentItemAppsSnapshotItemBinding((RoundImageView) view);
        int i4 = copydefault + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return fragmentItemAppsSnapshotItemBinding;
        }
        throw null;
    }
}
