package com.huawei.digitalpayment.consumer.baselib.pin.ui.activity.fragment;

import android.os.Bundle;
import android.view.View;
import com.huawei.common.fragment.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH&R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/baselib/pin/ui/activity/fragment/BaseLazyFragment;", "Lcom/huawei/common/fragment/BaseFragment;", "<init>", "()V", "isViewCreated", "", "isDataLoaded", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "lazyLoad", "loadData", "ConsumerBaseLib_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseLazyFragment extends BaseFragment {
    private static int component1 = 0;
    private static int copydefault = 1;
    private boolean ShareDataUIState;
    private boolean component3;

    public abstract void loadData();

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        int i = 2 % 2;
        int i2 = component1 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        this.ShareDataUIState = true;
        int i4 = component1 + 21;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = component1 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroyView();
            this.ShareDataUIState = true;
        } else {
            super.onDestroyView();
            this.ShareDataUIState = false;
        }
        this.component3 = false;
        int i3 = copydefault + 65;
        component1 = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void onResume() {
        int i = 2 % 2;
        int i2 = copydefault + 25;
        component1 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onResume();
            component2();
            int i3 = copydefault + 27;
            component1 = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        super.onResume();
        component2();
        throw null;
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = component1 + 71;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.ShareDataUIState) && (!this.component3)) {
            loadData();
            this.component3 = true;
            int i4 = copydefault + 61;
            component1 = i4 % 128;
            int i5 = i4 % 2;
        }
    }
}
