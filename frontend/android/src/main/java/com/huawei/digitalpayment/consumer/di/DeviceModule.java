package com.huawei.digitalpayment.consumer.di;

import android.app.Application;
import com.huawei.digitalpayment.consumer.base.framework.AndroidFrameworkProvider;
import com.huawei.digitalpayment.consumer.base.framework.PhoneNetworkInformationProvider;
import com.huawei.digitalpayment.consumer.base.repository.ConfigurationRepository;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidator;
import com.huawei.digitalpayment.consumer.base.sim.SimStateValidatorImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/di/DeviceModule;", "", "<init>", "()V", "provideSimStateValidator", "Lcom/huawei/digitalpayment/consumer/base/sim/SimStateValidator;", "configurationRepository", "Lcom/huawei/digitalpayment/consumer/base/repository/ConfigurationRepository;", "phoneNetworkInformationProvider", "Lcom/huawei/digitalpayment/consumer/base/framework/PhoneNetworkInformationProvider;", "providePhoneNetworkInformationProvider", "application", "Landroid/app/Application;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class DeviceModule {
    public static final DeviceModule INSTANCE = new DeviceModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    private DeviceModule() {
    }

    @Provides
    @Singleton
    public final SimStateValidator provideSimStateValidator(ConfigurationRepository configurationRepository, PhoneNetworkInformationProvider phoneNetworkInformationProvider) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        Intrinsics.checkNotNullParameter(phoneNetworkInformationProvider, "");
        SimStateValidatorImpl simStateValidatorImpl = new SimStateValidatorImpl(configurationRepository, phoneNetworkInformationProvider);
        int i2 = ShareDataUIState + 75;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return simStateValidatorImpl;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final PhoneNetworkInformationProvider providePhoneNetworkInformationProvider(Application application) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(application, "");
        AndroidFrameworkProvider androidFrameworkProvider = new AndroidFrameworkProvider(application);
        int i2 = component2 + 23;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return androidFrameworkProvider;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        int i = copydefault + 13;
        component1 = i % 128;
        int i2 = i % 2;
    }
}
