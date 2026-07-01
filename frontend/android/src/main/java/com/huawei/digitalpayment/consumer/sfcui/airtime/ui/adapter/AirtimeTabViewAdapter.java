package com.huawei.digitalpayment.consumer.sfcui.airtime.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

public class AirtimeTabViewAdapter extends FragmentStateAdapter {
    private static int component1 = 0;
    private static int copydefault = 1;
    private List<Fragment> ShareDataUIState;

    public AirtimeTabViewAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public AirtimeTabViewAdapter(FragmentActivity fragmentActivity, List<Fragment> list) {
        super(fragmentActivity);
        this.ShareDataUIState = list;
    }

    @Override
    public Fragment createFragment(int i) {
        int i2 = 2 % 2;
        int i3 = copydefault + 63;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Fragment fragment = this.ShareDataUIState.get(i);
        if (i4 != 0) {
            int i5 = 35 / 0;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = copydefault + 11;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.ShareDataUIState.size();
            throw null;
        }
        int size = this.ShareDataUIState.size();
        int i3 = component1 + 73;
        copydefault = i3 % 128;
        if (i3 % 2 != 0) {
            return size;
        }
        obj.hashCode();
        throw null;
    }
}
