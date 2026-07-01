package com.huawei.digitalpayment.consumer.schedule.viewmodel;

import com.huawei.digitalpayment.consumer.schedule.model.ISchedulePaymentModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class CreateAutomaticPaymentViewModel_Factory implements Factory<CreateAutomaticPaymentViewModel> {
    private static int ShareDataUIState = 0;
    private static int copydefault = 1;
    private final Provider<ISchedulePaymentModel> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        CreateAutomaticPaymentViewModel createAutomaticPaymentViewModel = get();
        int i4 = copydefault + 109;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return createAutomaticPaymentViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public CreateAutomaticPaymentViewModel_Factory(Provider<ISchedulePaymentModel> provider) {
        this.component1 = provider;
    }

    @Override
    public CreateAutomaticPaymentViewModel get() {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        ISchedulePaymentModel iSchedulePaymentModel = this.component1.get();
        if (i3 == 0) {
            return newInstance(iSchedulePaymentModel);
        }
        newInstance(iSchedulePaymentModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CreateAutomaticPaymentViewModel_Factory create(javax.inject.Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        CreateAutomaticPaymentViewModel_Factory createAutomaticPaymentViewModel_Factory = new CreateAutomaticPaymentViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = ShareDataUIState + 71;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return createAutomaticPaymentViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static CreateAutomaticPaymentViewModel_Factory create(Provider<ISchedulePaymentModel> provider) {
        int i = 2 % 2;
        CreateAutomaticPaymentViewModel_Factory createAutomaticPaymentViewModel_Factory = new CreateAutomaticPaymentViewModel_Factory(provider);
        int i2 = ShareDataUIState + 119;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return createAutomaticPaymentViewModel_Factory;
        }
        throw null;
    }

    public static CreateAutomaticPaymentViewModel newInstance(ISchedulePaymentModel iSchedulePaymentModel) {
        int i = 2 % 2;
        CreateAutomaticPaymentViewModel createAutomaticPaymentViewModel = new CreateAutomaticPaymentViewModel(iSchedulePaymentModel);
        int i2 = ShareDataUIState + 65;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return createAutomaticPaymentViewModel;
    }
}
