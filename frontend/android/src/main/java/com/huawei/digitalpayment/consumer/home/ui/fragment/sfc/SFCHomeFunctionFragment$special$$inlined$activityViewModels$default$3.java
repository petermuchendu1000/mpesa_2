package com.huawei.digitalpayment.consumer.home.ui.fragment.sfc;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.removeMenuProvider;
import kotlin.removeOnConfigurationChangedListener;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class SFCHomeFunctionFragment$special$$inlined$activityViewModels$default$3 extends Lambda implements Function0<ViewModelProvider.Factory> {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    final Fragment $this_activityViewModels;

    @Override
    public ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factoryInvoke = invoke();
        int i4 = ShareDataUIState + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return factoryInvoke;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = component3 + 123;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        int i4 = component3 + 11;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return defaultViewModelProviderFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SFCHomeFunctionFragment$special$$inlined$activityViewModels$default$3(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public static void component1() {
        removeOnConfigurationChangedListener.component2[0] = removeMenuProvider.ShareDataUIState[0];
    }
}
