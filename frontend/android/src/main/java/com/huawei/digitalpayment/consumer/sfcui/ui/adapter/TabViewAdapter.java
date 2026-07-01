package com.huawei.digitalpayment.consumer.sfcui.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;

public class TabViewAdapter extends FragmentStateAdapter {
    private static int component1 = 1;
    private static int component3;
    private List<Fragment> component2;

    public TabViewAdapter(FragmentActivity fragmentActivity, List<Fragment> list) {
        super(fragmentActivity);
        this.component2 = list;
    }

    @Override
    public Fragment createFragment(int i) {
        int i2 = 2 % 2;
        int i3 = component3 + 91;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            this.component2.get(i);
            throw null;
        }
        Fragment fragment = this.component2.get(i);
        int i4 = component3 + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return fragment;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        int size = this.component2.size();
        int i4 = component1 + 103;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return size;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
