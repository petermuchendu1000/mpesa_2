package com.huawei.digitalpayment.consumer.loginModule.login.viewmodel;

import com.huawei.digitalpayment.consumer.loginModule.login.data.OtpLoginModel;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class OtpLoginViewModel_Factory implements Factory<OtpLoginViewModel> {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final Provider<OtpLoginModel> component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            get();
            throw null;
        }
        OtpLoginViewModel otpLoginViewModel = get();
        int i3 = component2 + 15;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return otpLoginViewModel;
    }

    public OtpLoginViewModel_Factory(Provider<OtpLoginModel> provider) {
        this.component3 = provider;
    }

    @Override
    public OtpLoginViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        OtpLoginModel otpLoginModel = this.component3.get();
        if (i3 != 0) {
            return newInstance(otpLoginModel);
        }
        newInstance(otpLoginModel);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OtpLoginViewModel_Factory create(javax.inject.Provider<OtpLoginModel> provider) {
        int i = 2 % 2;
        OtpLoginViewModel_Factory otpLoginViewModel_Factory = new OtpLoginViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 3;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            return otpLoginViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static OtpLoginViewModel_Factory create(Provider<OtpLoginModel> provider) {
        int i = 2 % 2;
        OtpLoginViewModel_Factory otpLoginViewModel_Factory = new OtpLoginViewModel_Factory(provider);
        int i2 = ShareDataUIState + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return otpLoginViewModel_Factory;
    }

    public static OtpLoginViewModel newInstance(OtpLoginModel otpLoginModel) {
        int i = 2 % 2;
        OtpLoginViewModel otpLoginViewModel = new OtpLoginViewModel(otpLoginModel);
        int i2 = component2 + 1;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 34 / 0;
        }
        return otpLoginViewModel;
    }
}
