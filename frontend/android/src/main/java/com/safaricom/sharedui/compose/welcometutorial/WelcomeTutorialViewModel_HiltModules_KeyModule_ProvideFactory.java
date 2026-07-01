package com.safaricom.sharedui.compose.welcometutorial;

import com.safaricom.sharedui.compose.welcometutorial.WelcomeTutorialViewModel_HiltModules;
import dagger.internal.Factory;

public final class WelcomeTutorialViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    @Override
    public Boolean get() {
        return Boolean.valueOf(provide());
    }

    public static WelcomeTutorialViewModel_HiltModules_KeyModule_ProvideFactory create() {
        return copydefault.component1;
    }

    public static boolean provide() {
        return WelcomeTutorialViewModel_HiltModules.KeyModule.provide();
    }

    static final class copydefault {
        static final WelcomeTutorialViewModel_HiltModules_KeyModule_ProvideFactory component1 = new WelcomeTutorialViewModel_HiltModules_KeyModule_ProvideFactory();

        private copydefault() {
        }
    }
}
