package com.huawei.digitalpayment.consumer.fixeddata.di;

import com.huawei.digitalpayment.consumer.fixeddata.data.mapper.AccountDetailsUiMapper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class FixedDataModule_ProvideAccountDetailsUiMapperFactory implements Factory<AccountDetailsUiMapper> {
    private static int component1 = 0;
    private static int copydefault = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapper = get();
        int i4 = copydefault + 23;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return accountDetailsUiMapper;
    }

    @Override
    public AccountDetailsUiMapper get() {
        int i = 2 % 2;
        int i2 = copydefault + 9;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapperProvideAccountDetailsUiMapper = provideAccountDetailsUiMapper();
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        return accountDetailsUiMapperProvideAccountDetailsUiMapper;
    }

    public static FixedDataModule_ProvideAccountDetailsUiMapperFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 85;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            FixedDataModule_ProvideAccountDetailsUiMapperFactory fixedDataModule_ProvideAccountDetailsUiMapperFactory = component1.component2;
            throw null;
        }
        FixedDataModule_ProvideAccountDetailsUiMapperFactory fixedDataModule_ProvideAccountDetailsUiMapperFactory2 = component1.component2;
        int i3 = copydefault + 57;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 52 / 0;
        }
        return fixedDataModule_ProvideAccountDetailsUiMapperFactory2;
    }

    public static AccountDetailsUiMapper provideAccountDetailsUiMapper() {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        AccountDetailsUiMapper accountDetailsUiMapper = (AccountDetailsUiMapper) Preconditions.checkNotNullFromProvides(FixedDataModule.INSTANCE.provideAccountDetailsUiMapper());
        int i4 = component1 + 15;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return accountDetailsUiMapper;
        }
        throw null;
    }

    static final class component1 {
        static final FixedDataModule_ProvideAccountDetailsUiMapperFactory component2 = new FixedDataModule_ProvideAccountDetailsUiMapperFactory();
        private static int component3 = 0;
        private static int copydefault = 1;

        private component1() {
        }

        static {
            int i = component3 + 25;
            copydefault = i % 128;
            if (i % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
