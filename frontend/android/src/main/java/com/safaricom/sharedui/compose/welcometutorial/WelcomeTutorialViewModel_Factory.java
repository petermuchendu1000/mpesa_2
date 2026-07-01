package com.safaricom.sharedui.compose.welcometutorial;

import dagger.internal.Factory;

public final class WelcomeTutorialViewModel_Factory implements Factory<WelcomeTutorialViewModel> {
    @Override
    public WelcomeTutorialViewModel get() {
        return newInstance();
    }

    public static WelcomeTutorialViewModel_Factory create() {
        return component2.copydefault;
    }

    public static WelcomeTutorialViewModel newInstance() {
        return new WelcomeTutorialViewModel();
    }

    static final class component2 {
        static final WelcomeTutorialViewModel_Factory copydefault = new WelcomeTutorialViewModel_Factory();

        private component2() {
        }
    }
}
