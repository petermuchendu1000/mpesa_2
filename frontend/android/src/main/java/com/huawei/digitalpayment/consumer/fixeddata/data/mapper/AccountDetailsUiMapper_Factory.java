package com.huawei.digitalpayment.consumer.fixeddata.data.mapper;

import dagger.internal.Factory;

public final class AccountDetailsUiMapper_Factory implements Factory<AccountDetailsUiMapper> {
    private static int ShareDataUIState = 1;
    private static int component2;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 45;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public AccountDetailsUiMapper get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 35;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapperNewInstance = newInstance();
        int i4 = ShareDataUIState + 53;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return accountDetailsUiMapperNewInstance;
    }

    public static AccountDetailsUiMapper_Factory create() {
        AccountDetailsUiMapper_Factory accountDetailsUiMapper_Factory;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 33;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            accountDetailsUiMapper_Factory = component3.component3;
            int i3 = 85 / 0;
        } else {
            accountDetailsUiMapper_Factory = component3.component3;
        }
        int i4 = ShareDataUIState + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return accountDetailsUiMapper_Factory;
    }

    public static AccountDetailsUiMapper newInstance() {
        int i = 2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapper = new AccountDetailsUiMapper();
        int i2 = ShareDataUIState + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return accountDetailsUiMapper;
    }

    static final class component3 {
        private static int ShareDataUIState = 1;
        private static int component1;
        static final AccountDetailsUiMapper_Factory component3 = new AccountDetailsUiMapper_Factory();

        private component3() {
        }

        static {
            int i = ShareDataUIState + 45;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
