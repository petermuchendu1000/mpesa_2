package com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import kotlin.Metadata;
import kotlin.OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.unregisterOnBackInvokedCallback;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class BundlePurchaseConfirmActivity$special$$inlined$viewModels$default$14 extends Lambda implements Function0<ViewModelStore> {
    private static int component2 = 1;
    private static int copydefault;
    final ComponentActivity $this_viewModels;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelStore invoke() {
        int i = 2 % 2;
        int i2 = copydefault + 85;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            this.$this_viewModels.getViewModelStore();
            throw null;
        }
        ViewModelStore viewModelStore = this.$this_viewModels.getViewModelStore();
        int i3 = component2 + 31;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return viewModelStore;
    }

    @Override
    public ViewModelStore invoke() {
        int i = 2 % 2;
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelStore viewModelStoreInvoke = invoke();
        int i4 = component2 + 81;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return viewModelStoreInvoke;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundlePurchaseConfirmActivity$special$$inlined$viewModels$default$14(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public static void component1() {
        unregisterOnBackInvokedCallback.ShareDataUIState[0] = OnBackPressedDispatcherApi33ImplExternalSyntheticLambda0.ShareDataUIState[0];
    }
}
