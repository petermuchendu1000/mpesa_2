package com.huawei.digitalpayment.consumer.base.networkcheck;

import com.huawei.digitalpayment.consumer.base.http.NetworkCheckInterceptor;
import dagger.BindsInstance;
import dagger.Component;
import kotlin.Metadata;

@Component(dependencies = {NetworkCheckModuleDependencies.class})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckComponent;", "", "inject", "", "interceptor", "Lcom/huawei/digitalpayment/consumer/base/http/NetworkCheckInterceptor;", "Factory", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NetworkCheckComponent {

    @Component.Factory
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckComponent$Factory;", "", "addDependencies", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckComponent;", "networkCheckDependencies", "Lcom/huawei/digitalpayment/consumer/base/networkcheck/NetworkCheckModuleDependencies;", "interceptor", "Lcom/huawei/digitalpayment/consumer/base/http/NetworkCheckInterceptor;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Factory {
        NetworkCheckComponent addDependencies(NetworkCheckModuleDependencies networkCheckDependencies, @BindsInstance NetworkCheckInterceptor interceptor);
    }

    void inject(NetworkCheckInterceptor interceptor);
}
