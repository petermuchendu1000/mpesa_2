package com.huawei.digitalpayment.consumer.manageandviewdata.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class DataUsageInitializer_Factory implements Factory<DataUsageInitializer> {
    private static int component2 = 0;
    private static int component3 = 1;
    private final Provider<Context> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 23;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        DataUsageInitializer dataUsageInitializer = get();
        int i4 = component3 + 103;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return dataUsageInitializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public DataUsageInitializer_Factory(Provider<Context> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public DataUsageInitializer get() {
        int i = 2 % 2;
        int i2 = component2 + 39;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Context context = this.ShareDataUIState.get();
        if (i3 != 0) {
            return newInstance(context);
        }
        newInstance(context);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static DataUsageInitializer_Factory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        DataUsageInitializer_Factory dataUsageInitializer_Factory = new DataUsageInitializer_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 49;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return dataUsageInitializer_Factory;
        }
        throw null;
    }

    public static DataUsageInitializer_Factory create(Provider<Context> provider) {
        int i = 2 % 2;
        DataUsageInitializer_Factory dataUsageInitializer_Factory = new DataUsageInitializer_Factory(provider);
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return dataUsageInitializer_Factory;
    }

    public static DataUsageInitializer newInstance(Context context) {
        int i = 2 % 2;
        DataUsageInitializer dataUsageInitializer = new DataUsageInitializer(context);
        int i2 = component3 + 89;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return dataUsageInitializer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
