package com.huawei.digitalpayment.consumer.sfcui.profile.esim.emailaddress;

import android.os.Process;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", BridgeDSL.INVOKE, "androidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$6"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class EmailAddressFragment$special$$inlined$activityViewModels$default$3 extends Lambda implements Function0<ViewModelProvider.Factory> {
    public static int component1 = 0;
    private static int component2 = 1;
    public static int component3;
    private static int copydefault;
    final Fragment $this_activityViewModels;

    @Override
    public ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = copydefault + 73;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory factoryInvoke = invoke();
        int i4 = copydefault + 111;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return factoryInvoke;
        }
        throw null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override
    public final ViewModelProvider.Factory invoke() {
        int i = 2 % 2;
        int i2 = copydefault + 45;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
        int i4 = copydefault + 19;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return defaultViewModelProviderFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAddressFragment$special$$inlined$activityViewModels$default$3(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public static int component2() {
        int i = component1;
        int i2 = i % 7863183;
        component1 = i + 1;
        if (i2 != 0) {
            return component3;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        component3 = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
