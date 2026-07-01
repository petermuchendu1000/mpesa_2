package com.huawei.digitalpayment.consumer.sfcui.buybundles.caching;

import android.os.Process;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class BundleCacheUtil_Factory implements Factory<BundleCacheUtil> {
    public static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 1;
    public static int copydefault;
    private final Provider<RemoteConfig> ShareDataUIState;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component2 + 61;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        BundleCacheUtil bundleCacheUtil = get();
        int i4 = component3 + 85;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return bundleCacheUtil;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BundleCacheUtil_Factory(Provider<RemoteConfig> provider) {
        this.ShareDataUIState = provider;
    }

    @Override
    public BundleCacheUtil get() {
        int i = 2 % 2;
        int i2 = component3 + 91;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        BundleCacheUtil bundleCacheUtilNewInstance = newInstance(this.ShareDataUIState.get());
        int i4 = component3 + 107;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
        return bundleCacheUtilNewInstance;
    }

    public static BundleCacheUtil_Factory create(javax.inject.Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        BundleCacheUtil_Factory bundleCacheUtil_Factory = new BundleCacheUtil_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 119;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return bundleCacheUtil_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static BundleCacheUtil_Factory create(Provider<RemoteConfig> provider) {
        int i = 2 % 2;
        BundleCacheUtil_Factory bundleCacheUtil_Factory = new BundleCacheUtil_Factory(provider);
        int i2 = component2 + 89;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 96 / 0;
        }
        return bundleCacheUtil_Factory;
    }

    public static BundleCacheUtil newInstance(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        BundleCacheUtil bundleCacheUtil = new BundleCacheUtil(remoteConfig);
        int i2 = component3 + 55;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return bundleCacheUtil;
        }
        throw null;
    }

    public static int component1() {
        int i = copydefault;
        int i2 = i % 9013485;
        copydefault = i + 1;
        if (i2 != 0) {
            return component1;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        component1 = startUptimeMillis;
        return startUptimeMillis;
    }
}
