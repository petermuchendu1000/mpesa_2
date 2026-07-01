package com.huawei.digitalpayment.common.theme.viewmodel;

import com.huawei.digitalpayment.common.theme.model.LogoutModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class LogoutViewModel_Factory implements Factory<LogoutViewModel> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<LogoutModel> copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 33;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogoutViewModel logoutViewModel = get();
        int i4 = component2 + 39;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
        return logoutViewModel;
    }

    public LogoutViewModel_Factory(Provider<LogoutModel> provider) {
        this.copydefault = provider;
    }

    @Override
    public LogoutViewModel get() {
        int i = 2 % 2;
        int i2 = component3 + 77;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        LogoutViewModel logoutViewModelNewInstance = newInstance(this.copydefault.get());
        int i4 = component2 + 15;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return logoutViewModelNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static LogoutViewModel_Factory create(javax.inject.Provider<LogoutModel> provider) {
        int i = 2 % 2;
        LogoutViewModel_Factory logoutViewModel_Factory = new LogoutViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 7;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return logoutViewModel_Factory;
    }

    public static LogoutViewModel_Factory create(Provider<LogoutModel> provider) {
        int i = 2 % 2;
        LogoutViewModel_Factory logoutViewModel_Factory = new LogoutViewModel_Factory(provider);
        int i2 = component3 + 63;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return logoutViewModel_Factory;
        }
        throw null;
    }

    public static LogoutViewModel newInstance(LogoutModel logoutModel) {
        int i = 2 % 2;
        LogoutViewModel logoutViewModel = new LogoutViewModel(logoutModel);
        int i2 = component2 + 23;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return logoutViewModel;
    }
}
