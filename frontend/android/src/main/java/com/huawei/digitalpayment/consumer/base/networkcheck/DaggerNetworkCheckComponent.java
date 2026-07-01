package com.huawei.digitalpayment.consumer.base.networkcheck;

import com.huawei.digitalpayment.consumer.base.http.NetworkCheckInterceptor;
import com.huawei.digitalpayment.consumer.base.http.NetworkCheckInterceptor_MembersInjector;
import com.huawei.digitalpayment.consumer.base.networkcheck.NetworkCheckComponent;
import dagger.internal.Preconditions;

public final class DaggerNetworkCheckComponent {
    private static int component2 = 0;
    private static int copydefault = 1;

    private DaggerNetworkCheckComponent() {
    }

    public static NetworkCheckComponent.Factory factory() {
        int i = 2 % 2;
        component3 component3Var = new component3();
        int i2 = component2 + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return component3Var;
        }
        throw null;
    }

    static final class component3 implements NetworkCheckComponent.Factory {
        private static int component1 = 1;
        private static int component2;

        private component3() {
        }

        @Override
        public NetworkCheckComponent addDependencies(NetworkCheckModuleDependencies networkCheckModuleDependencies, NetworkCheckInterceptor networkCheckInterceptor) {
            int i = 2 % 2;
            Preconditions.checkNotNull(networkCheckModuleDependencies);
            Preconditions.checkNotNull(networkCheckInterceptor);
            ShareDataUIState shareDataUIState = new ShareDataUIState(networkCheckModuleDependencies, networkCheckInterceptor);
            int i2 = component2 + 49;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }
    }

    static final class ShareDataUIState implements NetworkCheckComponent {
        private static int component3 = 1;
        private static int copydefault;
        private final ShareDataUIState component1;
        private final NetworkCheckModuleDependencies component2;

        private ShareDataUIState(NetworkCheckModuleDependencies networkCheckModuleDependencies, NetworkCheckInterceptor networkCheckInterceptor) {
            this.component1 = this;
            this.component2 = networkCheckModuleDependencies;
        }

        @Override
        public void inject(NetworkCheckInterceptor networkCheckInterceptor) {
            int i = 2 % 2;
            int i2 = component3 + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(networkCheckInterceptor);
            int i4 = component3 + 107;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        private NetworkCheckInterceptor copydefault(NetworkCheckInterceptor networkCheckInterceptor) {
            int i = 2 % 2;
            int i2 = copydefault + 17;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            NetworkCheckInterceptor_MembersInjector.injectNetworkCheckManager(networkCheckInterceptor, (NetworkCheckManager) Preconditions.checkNotNullFromComponent(this.component2.provideNetworkCheckManager()));
            if (i3 != 0) {
                return networkCheckInterceptor;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }
}
