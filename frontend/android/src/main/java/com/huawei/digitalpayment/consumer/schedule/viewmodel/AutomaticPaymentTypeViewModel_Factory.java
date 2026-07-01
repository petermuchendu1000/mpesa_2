package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.model.ISchedulePaymentModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AutomaticPaymentTypeViewModel_Factory implements Factory<AutomaticPaymentTypeViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<ISchedulePaymentModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 115;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            get();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        AutomaticPaymentTypeViewModel automaticPaymentTypeViewModel = get();
        int i3 = ShareDataUIState + 59;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return automaticPaymentTypeViewModel;
    }

    public AutomaticPaymentTypeViewModel_Factory(Provider<ISchedulePaymentModel> provider) {
        this.component3 = provider;
    }

    @Override
    public AutomaticPaymentTypeViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 95;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ISchedulePaymentModel iSchedulePaymentModel = this.component3.get();
        if (i3 == 0) {
            return newInstance(iSchedulePaymentModel);
        }
        int i4 = 12 / 0;
        return newInstance(iSchedulePaymentModel);
    }

    public static AutomaticPaymentTypeViewModel_Factory create(javax.inject.Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        AutomaticPaymentTypeViewModel_Factory automaticPaymentTypeViewModel_Factory = new AutomaticPaymentTypeViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 35;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return automaticPaymentTypeViewModel_Factory;
    }

    public static AutomaticPaymentTypeViewModel_Factory create(Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        AutomaticPaymentTypeViewModel_Factory automaticPaymentTypeViewModel_Factory = new AutomaticPaymentTypeViewModel_Factory(provider);
        int i2 = ShareDataUIState + 11;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return automaticPaymentTypeViewModel_Factory;
    }

    public static AutomaticPaymentTypeViewModel newInstance(ISchedulePaymentModel iSchedulePaymentModel) {
        int i = 2 % 2;
        AutomaticPaymentTypeViewModel automaticPaymentTypeViewModel = new AutomaticPaymentTypeViewModel(iSchedulePaymentModel);
        int i2 = copydefault + 101;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return automaticPaymentTypeViewModel;
    }
}
