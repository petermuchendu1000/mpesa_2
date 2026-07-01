package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.model.ISchedulePaymentModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class AutomaticPaymentListViewModel_Factory implements Factory<AutomaticPaymentListViewModel> {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Provider<ISchedulePaymentModel> component3;

    @Override
    public Object get() {
        AutomaticPaymentListViewModel automaticPaymentListViewModel;
        int i = 2 % 2;
        int i2 = copydefault + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            automaticPaymentListViewModel = get();
            int i3 = 69 / 0;
        } else {
            automaticPaymentListViewModel = get();
        }
        int i4 = component1 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return automaticPaymentListViewModel;
    }

    public AutomaticPaymentListViewModel_Factory(Provider<ISchedulePaymentModel> provider) {
        this.component3 = provider;
    }

    @Override
    public AutomaticPaymentListViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        ISchedulePaymentModel iSchedulePaymentModel = this.component3.get();
        if (i3 == 0) {
            return newInstance(iSchedulePaymentModel);
        }
        newInstance(iSchedulePaymentModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static AutomaticPaymentListViewModel_Factory create(javax.inject.Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        AutomaticPaymentListViewModel_Factory automaticPaymentListViewModel_Factory = new AutomaticPaymentListViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 115;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return automaticPaymentListViewModel_Factory;
    }

    public static AutomaticPaymentListViewModel_Factory create(Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        AutomaticPaymentListViewModel_Factory automaticPaymentListViewModel_Factory = new AutomaticPaymentListViewModel_Factory(provider);
        int i2 = copydefault + 3;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return automaticPaymentListViewModel_Factory;
        }
        throw null;
    }

    public static AutomaticPaymentListViewModel newInstance(ISchedulePaymentModel iSchedulePaymentModel) {
        int i = 2 % 2;
        AutomaticPaymentListViewModel automaticPaymentListViewModel = new AutomaticPaymentListViewModel(iSchedulePaymentModel);
        int i2 = copydefault + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return automaticPaymentListViewModel;
        }
        throw null;
    }
}
