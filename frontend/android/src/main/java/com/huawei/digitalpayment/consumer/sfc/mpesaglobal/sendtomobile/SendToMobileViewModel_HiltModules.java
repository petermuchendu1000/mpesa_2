package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;
import kotlin.OnBackPressedDispatcher1;
import kotlin.addCancellableCallbackactivity_release;

public final class SendToMobileViewModel_HiltModules {
    private SendToMobileViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(SendToMobileViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(SendToMobileViewModel sendToMobileViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        private static int component1 = 1;
        private static int component3;

        private KeyModule() {
        }

        @Provides
        @LazyClassKey(SendToMobileViewModel.class)
        @IntoMap
        public static boolean provide() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 53;
            component1 = i3 % 128;
            boolean z = i3 % 2 != 0;
            int i4 = i2 + 71;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return z;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static void ShareDataUIState() {
            addCancellableCallbackactivity_release.component2[0] = OnBackPressedDispatcher1.component1[0];
        }
    }
}
