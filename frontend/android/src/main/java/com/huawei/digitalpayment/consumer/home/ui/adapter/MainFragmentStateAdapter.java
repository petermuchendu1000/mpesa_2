package com.huawei.digitalpayment.consumer.home.ui.adapter;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.huawei.digitalpayment.home.theme.data.local.LocalComponent;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\t\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/adapter/MainFragmentStateAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "functions", "", "Lcom/huawei/digitalpayment/home/theme/data/local/LocalComponent;", "setData", "", "createFragment", "Landroidx/fragment/app/Fragment;", "position", "", "getItemCount", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainFragmentStateAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private static int component3 = 1;
    private static int copydefault;
    private List<LocalComponent> component1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public MainFragmentStateAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
    }

    public final void setData(List<LocalComponent> functions) {
        int i = 2 % 2;
        int i2 = component2 + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            this.component1 = functions;
            notifyDataSetChanged();
        } else {
            this.component1 = functions;
            notifyDataSetChanged();
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        return com.huawei.digitalpayment.consumer.home.ui.utils.ComponentFactory.INSTANCE.newInstance(r5, com.huawei.digitalpayment.consumer.home.ui.fragment.DynamicTemplateFragment.class);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r2
  0x001b: PHI (r2v3 java.util.List<com.huawei.digitalpayment.home.theme.data.local.LocalComponent>) = 
  (r2v2 java.util.List<com.huawei.digitalpayment.home.theme.data.local.LocalComponent>)
  (r2v4 java.util.List<com.huawei.digitalpayment.home.theme.data.local.LocalComponent>)
 binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.fragment.app.Fragment createFragment(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter.component2
            int r2 = r1 + 33
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter.ShareDataUIState = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L17
            java.util.List<com.huawei.digitalpayment.home.theme.data.local.LocalComponent> r2 = r4.component1
            r3 = 86
            int r3 = r3 / 0
            if (r2 == 0) goto L3d
            goto L1b
        L17:
            java.util.List<com.huawei.digitalpayment.home.theme.data.local.LocalComponent> r2 = r4.component1
            if (r2 == 0) goto L3d
        L1b:
            int r1 = r1 + 49
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter.ShareDataUIState = r3
            int r1 = r1 % r0
            java.lang.Object r5 = r2.get(r5)
            com.huawei.digitalpayment.home.theme.data.local.LocalComponent r5 = (com.huawei.digitalpayment.home.theme.data.local.LocalComponent) r5
            if (r1 == 0) goto L31
            r0 = 20
            int r0 = r0 / 0
            if (r5 != 0) goto L34
            goto L3d
        L31:
            if (r5 != 0) goto L34
            goto L3d
        L34:
            com.huawei.digitalpayment.consumer.home.ui.utils.ComponentFactory r0 = com.huawei.digitalpayment.consumer.home.ui.utils.ComponentFactory.INSTANCE
            java.lang.Class<com.huawei.digitalpayment.consumer.home.ui.fragment.DynamicTemplateFragment> r1 = com.huawei.digitalpayment.consumer.home.ui.fragment.DynamicTemplateFragment.class
            androidx.fragment.app.Fragment r5 = r0.newInstance(r5, r1)
            return r5
        L3d:
            androidx.fragment.app.Fragment r5 = new androidx.fragment.app.Fragment
            r5.<init>()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.adapter.MainFragmentStateAdapter.createFragment(int):androidx.fragment.app.Fragment");
    }

    @Override
    public int getItemCount() {
        int i = 2 % 2;
        List<LocalComponent> list = this.component1;
        if (list == null) {
            int i2 = component2 + 123;
            ShareDataUIState = i2 % 128;
            return i2 % 2 != 0 ? 1 : 0;
        }
        Intrinsics.checkNotNull(list);
        int size = list.size();
        int i3 = ShareDataUIState + 3;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return size;
    }

    static {
        int i = 1 + 17;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
