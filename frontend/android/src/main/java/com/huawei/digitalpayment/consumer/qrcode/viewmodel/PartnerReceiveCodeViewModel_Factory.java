package com.huawei.digitalpayment.consumer.qrcode.viewmodel;

import com.huawei.digitalpayment.consumer.qrcode.model.ReceiveCodeModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class PartnerReceiveCodeViewModel_Factory implements Factory<PartnerReceiveCodeViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<ReceiveCodeModel> component3;

    @Override
    public Object get() {
        PartnerReceiveCodeViewModel partnerReceiveCodeViewModel;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            partnerReceiveCodeViewModel = get();
            int i3 = 19 / 0;
        } else {
            partnerReceiveCodeViewModel = get();
        }
        int i4 = copydefault + 45;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return partnerReceiveCodeViewModel;
        }
        throw null;
    }

    public PartnerReceiveCodeViewModel_Factory(Provider<ReceiveCodeModel> provider) {
        this.component3 = provider;
    }

    @Override
    public PartnerReceiveCodeViewModel get() {
        PartnerReceiveCodeViewModel partnerReceiveCodeViewModelNewInstance;
        int i = 2 % 2;
        int i2 = copydefault + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            partnerReceiveCodeViewModelNewInstance = newInstance(this.component3.get());
            int i3 = 28 / 0;
        } else {
            partnerReceiveCodeViewModelNewInstance = newInstance(this.component3.get());
        }
        int i4 = copydefault + 73;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return partnerReceiveCodeViewModelNewInstance;
        }
        throw null;
    }

    public static PartnerReceiveCodeViewModel_Factory create(javax.inject.Provider<ReceiveCodeModel> provider) {
        int i = 2 % 2;
        PartnerReceiveCodeViewModel_Factory partnerReceiveCodeViewModel_Factory = new PartnerReceiveCodeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 37;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return partnerReceiveCodeViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PartnerReceiveCodeViewModel_Factory create(Provider<ReceiveCodeModel> provider) {
        int i = 2 % 2;
        PartnerReceiveCodeViewModel_Factory partnerReceiveCodeViewModel_Factory = new PartnerReceiveCodeViewModel_Factory(provider);
        int i2 = copydefault + 57;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return partnerReceiveCodeViewModel_Factory;
    }

    public static PartnerReceiveCodeViewModel newInstance(ReceiveCodeModel receiveCodeModel) {
        int i = 2 % 2;
        PartnerReceiveCodeViewModel partnerReceiveCodeViewModel = new PartnerReceiveCodeViewModel(receiveCodeModel);
        int i2 = ShareDataUIState + 77;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return partnerReceiveCodeViewModel;
    }
}
