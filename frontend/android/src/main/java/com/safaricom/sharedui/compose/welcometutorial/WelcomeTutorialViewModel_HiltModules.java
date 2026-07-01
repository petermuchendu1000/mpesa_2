package com.safaricom.sharedui.compose.welcometutorial;

import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.LazyClassKey;

public final class WelcomeTutorialViewModel_HiltModules {
    private WelcomeTutorialViewModel_HiltModules() {
    }

    @Module
    public static abstract class BindsModule {
        @LazyClassKey(WelcomeTutorialViewModel.class)
        @Binds
        @IntoMap
        public abstract ViewModel binds(WelcomeTutorialViewModel welcomeTutorialViewModel);

        private BindsModule() {
        }
    }

    @Module
    public static final class KeyModule {
        @Provides
        @LazyClassKey(WelcomeTutorialViewModel.class)
        @IntoMap
        public static boolean provide() {
            return true;
        }

        private KeyModule() {
        }
    }
}
