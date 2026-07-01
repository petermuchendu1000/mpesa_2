package com.safaricom.sharedui.compose.confirmation;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import kotlin.Metadata;
import kotlin.OnBackPressedDispatcherKtaddCallbackcallback1;
import kotlin.OnBackPressedDispatcherLifecycleOnBackPressedCancellable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class ConfirmTransactionFragment$special$$inlined$activityViewModels$default$3 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final Fragment $this_activityViewModels;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelProvider.Factory invoke() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
        return defaultViewModelProviderFactory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmTransactionFragment$special$$inlined$activityViewModels$default$3(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public static void component2() {
        OnBackPressedDispatcherKtaddCallbackcallback1.ShareDataUIState[0] = OnBackPressedDispatcherLifecycleOnBackPressedCancellable.component2[0];
    }
}
