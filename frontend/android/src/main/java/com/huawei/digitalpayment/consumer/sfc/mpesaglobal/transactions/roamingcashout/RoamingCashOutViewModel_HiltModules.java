package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import android.os.Process;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class RoamingCashOutViewModel_HiltModules {
    private RoamingCashOutViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        public static int ShareDataUIState;
        public static int copydefault;

        @LazyClassKey(RoamingCashOutViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(RoamingCashOutViewModel roamingCashOutViewModel);

        private BindsModule() {
        }

        public static int copydefault() {
            int i = copydefault;
            int i2 = i % 9526197;
            copydefault = i + 1;
            if (i2 != 0) {
                return ShareDataUIState;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            ShareDataUIState = startUptimeMillis;
            return startUptimeMillis;
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 0;
        private static int copydefault = 1;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(RoamingCashOutViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 75;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 9;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
    }
}
