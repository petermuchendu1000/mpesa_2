package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.OnBackPressedDispatcher3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.setOnBackInvokedDispatcher;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/adapter/PESAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "tabFragmentsList", "", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "_tabFragmentList", "createFragment", "position", "", "getItemCount", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PESAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component2 = 1;
    private static int component3;
    private List<? extends Fragment> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PESAdapter(FragmentActivity fragmentActivity, List<? extends Fragment> list) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    @Override
    public Fragment createFragment(int position) {
        int i = 2 % 2;
        int i2 = component2 + 109;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Fragment fragment = this.copydefault.get(position);
        int i4 = component3 + 51;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        int size;
        int i = 2 % 2;
        int i2 = component3 + 41;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            size = this.copydefault.size();
            int i3 = 37 / 0;
        } else {
            size = this.copydefault.size();
        }
        int i4 = component2 + 79;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 78 / 0;
        }
        return size;
    }

    static {
        int i = 1 + 1;
        component1 = i % 128;
        int i2 = i % 2;
    }

    public static void component3() {
        OnBackPressedDispatcher3.component2[0] = setOnBackInvokedDispatcher.copydefault[0];
    }
}
