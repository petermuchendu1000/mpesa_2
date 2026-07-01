package com.huawei.digitalpayment.consumer.sfcui.buybundles.spotify.spotifyBundlesConfirm;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelStore;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import kotlin.Metadata;
import kotlin.getLock;
import kotlin.getServedView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/activity/ActivityViewModelLazyKt$viewModels$3"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class SpotifyBundlesConfirmActivity$special$$inlined$viewModels$default$2 extends Lambda implements Function0<ViewModelStore> {
    private static int ShareDataUIState = 1;
    private static int component2;
    final ComponentActivity $this_viewModels;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelStore invoke() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 113;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelStore viewModelStore = this.$this_viewModels.getViewModelStore();
        int i4 = component2 + 11;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 91 / 0;
        }
        return viewModelStore;
    }

    @Override
    public ViewModelStore invoke() {
        int i = 2 % 2;
        int i2 = component2 + 125;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ViewModelStore viewModelStoreInvoke = invoke();
        int i4 = ShareDataUIState + 113;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return viewModelStoreInvoke;
        }
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotifyBundlesConfirmActivity$special$$inlined$viewModels$default$2(ComponentActivity componentActivity) {
        super(0);
        this.$this_viewModels = componentActivity;
    }

    public static void component2() {
        getServedView.ShareDataUIState[0] = getLock.component2[0];
    }
}
