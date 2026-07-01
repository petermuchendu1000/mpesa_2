package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.model.ReceiveCodeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class ReceiveCodeViewModel_Factory implements Factory<ReceiveCodeViewModel> {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final Provider<ReceiveCodeModel> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 39;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public ReceiveCodeViewModel_Factory(Provider<ReceiveCodeModel> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public ReceiveCodeViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ReceiveCodeModel receiveCodeModel = this.ShareDataUIState.get();
        if (i3 == 0) {
            return newInstance(receiveCodeModel);
        }
        int i4 = 87 / 0;
        return newInstance(receiveCodeModel);
    }

    public static ReceiveCodeViewModel_Factory create(javax.inject.Provider<ReceiveCodeModel> provider) {
        int i = 2 % 2;
        ReceiveCodeViewModel_Factory receiveCodeViewModel_Factory = new ReceiveCodeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component3 + 117;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 11 / 0;
        }
        return receiveCodeViewModel_Factory;
    }

    public static ReceiveCodeViewModel_Factory create(Provider<ReceiveCodeModel> provider) {
        int i = 2 % 2;
        ReceiveCodeViewModel_Factory receiveCodeViewModel_Factory = new ReceiveCodeViewModel_Factory(provider);
        int i2 = component3 + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return receiveCodeViewModel_Factory;
    }

    public static ReceiveCodeViewModel newInstance(ReceiveCodeModel receiveCodeModel) {
        int i = 2 % 2;
        ReceiveCodeViewModel receiveCodeViewModel = new ReceiveCodeViewModel(receiveCodeModel);
        int i2 = component3 + 29;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return receiveCodeViewModel;
        }
        throw null;
    }
}
