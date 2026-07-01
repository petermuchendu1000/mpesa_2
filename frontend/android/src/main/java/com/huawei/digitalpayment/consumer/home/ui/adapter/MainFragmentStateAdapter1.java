package com.huawei.digitalpayment.consumer.home.ui.adapter;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.huawei.digitalpayment.consumer.home.ui.fragment.LifeFragment;
import com.huawei.digitalpayment.consumer.home.ui.fragment.MyFragment;
import com.huawei.digitalpayment.consumer.home.ui.fragment.sfc.SFCHomeFragment;
import com.huawei.digitalpayment.home.constants.HomeConstants;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeFunction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter1;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "functions", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeFunction;", "setData", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainFragmentStateAdapter1 extends FragmentStateAdapter {
    public static final int $stable = 8;
    private static int ShareDataUIState = 1;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copydefault = 47 % 128;
    private List<LocalHomeFunction> component2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public MainFragmentStateAdapter1(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
    }

    public final void setData(List<LocalHomeFunction> functions) {
        int i = 2 % 2;
        int i2 = component1 + 115;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.component2 = functions;
        notifyDataSetChanged();
        int i4 = ShareDataUIState + 43;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public Fragment createFragment(int position) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            List<LocalHomeFunction> list = this.component2;
            Intrinsics.checkNotNull(list);
            LocalHomeFunction localHomeFunction = list.get(position);
            String strComponent1 = localHomeFunction.component1();
            String strComponent2 = localHomeFunction.component2();
            String str = strComponent1;
            if (TextUtils.equals(HomeConstants.HOME_MY, str)) {
                return new MyFragment();
            }
            if (TextUtils.equals(HomeConstants.HOME_LIFE, str)) {
                LifeFragment lifeFragmentNewInstance = LifeFragment.INSTANCE.newInstance(strComponent2);
                int i3 = component1 + 23;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return lifeFragmentNewInstance;
            }
            if (TextUtils.equals(HomeConstants.HOME_WALLET, str)) {
                return new SFCHomeFragment();
            }
            return new Fragment();
        }
        List<LocalHomeFunction> list2 = this.component2;
        Intrinsics.checkNotNull(list2);
        LocalHomeFunction localHomeFunction2 = list2.get(position);
        String strComponent12 = localHomeFunction2.component1();
        localHomeFunction2.component2();
        TextUtils.equals(HomeConstants.HOME_MY, strComponent12);
        throw null;
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        int i2 = component1 + 99;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        List<LocalHomeFunction> list = this.component2;
        if (list == null) {
            int i5 = i3 + 117;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return 0;
        }
        Intrinsics.checkNotNull(list);
        int size = list.size();
        int i7 = ShareDataUIState + 119;
        component1 = i7 % 128;
        int i8 = i7 % 2;
        return size;
    }

    static {
        int i = 47 % 2;
    }
}
