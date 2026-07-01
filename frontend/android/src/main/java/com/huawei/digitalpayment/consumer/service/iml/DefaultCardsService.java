package com.huawei.digitalpayment.consumer.service.iml;

import androidx.fragment.app.Fragment;
import com.huawei.digitalpayment.consumer.service.ICardsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/service/iml/DefaultCardsService;", "Lcom/huawei/digitalpayment/consumer/service/ICardsService;", "<init>", "()V", "getUserInfoFragment", "Landroidx/fragment/app/Fragment;", "component", "", "getFunctionsFragment", "getBankCardsFragment", "getVirtualCardsFragment", "getTransactionFragment", "ServiceModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultCardsService implements ICardsService {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Fragment getUserInfoFragment(String component) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component, "");
        Fragment fragment = new Fragment();
        int i2 = ShareDataUIState + 93;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 71 / 0;
        }
        return fragment;
    }

    @Override
    public Fragment getFunctionsFragment(String component) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component, "");
        Fragment fragment = new Fragment();
        int i2 = ShareDataUIState + 109;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
        }
        return fragment;
    }

    @Override
    public Fragment getBankCardsFragment(String component) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component, "");
        Fragment fragment = new Fragment();
        int i2 = component2 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return fragment;
    }

    @Override
    public Fragment getVirtualCardsFragment(String component) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component, "");
        Fragment fragment = new Fragment();
        int i2 = ShareDataUIState + 57;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return fragment;
    }

    @Override
    public Fragment getTransactionFragment(String component) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(component, "");
        Fragment fragment = new Fragment();
        int i2 = component2 + 73;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return fragment;
        }
        throw null;
    }
}
