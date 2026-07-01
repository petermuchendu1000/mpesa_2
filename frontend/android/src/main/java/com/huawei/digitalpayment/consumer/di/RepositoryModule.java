package com.huawei.digitalpayment.consumer.di;

import android.content.Context;
import com.huawei.digitalpayment.consumer.base.database.daos.DeviceRestartCacheDao;
import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.repository.ConfigurationRepository;
import com.huawei.digitalpayment.consumer.base.repository.DeviceInfoRepository;
import com.huawei.digitalpayment.consumer.base.repository.DeviceRestartRepository;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidator;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\"\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/di/RepositoryModule;", "", "<init>", "()V", "provideConfigurationRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/ConfigurationRepository;", "provideDeviceInfoRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/DeviceInfoRepository;", "context", "Landroid/content/Context;", "phoneNetworkInformationProvider", "Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "simStateValidator", "Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidator;", "provideDeviceRestartRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/DeviceRestartRepository;", "deviceRestartCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class RepositoryModule {
    public static final RepositoryModule INSTANCE = new RepositoryModule();
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component3 = 1;
    private static int copydefault;

    private RepositoryModule() {
    }

    @Provides
    @Singleton
    public final ConfigurationRepository provideConfigurationRepository() {
        int i = 2 % 2;
        ConfigurationRepository configurationRepository = new ConfigurationRepository();
        int i2 = ShareDataUIState + 99;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return configurationRepository;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final DeviceInfoRepository provideDeviceInfoRepository(@ApplicationContext Context context, PhoneNetworkInformationProvider phoneNetworkInformationProvider, SimStateValidator simStateValidator) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(phoneNetworkInformationProvider, "");
        Intrinsics.checkNotNullParameter(simStateValidator, "");
        DeviceInfoRepository deviceInfoRepository = new DeviceInfoRepository(context, phoneNetworkInformationProvider, simStateValidator);
        int i2 = copydefault + 109;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return deviceInfoRepository;
    }

    @Provides
    @Singleton
    public final DeviceRestartRepository provideDeviceRestartRepository(DeviceRestartCacheDao deviceRestartCacheDao) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(deviceRestartCacheDao, "");
        DeviceRestartRepository deviceRestartRepository = new DeviceRestartRepository(deviceRestartCacheDao);
        int i2 = copydefault + 59;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return deviceRestartRepository;
    }

    static {
        int i = component2 + 87;
        component3 = i % 128;
        int i2 = i % 2;
    }
}
