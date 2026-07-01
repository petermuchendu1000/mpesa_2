package com.huawei.digitalpayment.consumer.remoteconfig.di;

import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfigImpl;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/remoteconfig/di/RemoteConfigModule;", "", "<init>", "()V", "bindRemoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "remoteConfigImpl", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfigImpl;", "ConsumerSfcRemoteConfig_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public abstract class RemoteConfigModule {
    @Singleton
    @Binds
    public abstract RemoteConfig bindRemoteConfig(RemoteConfigImpl remoteConfigImpl);
}
