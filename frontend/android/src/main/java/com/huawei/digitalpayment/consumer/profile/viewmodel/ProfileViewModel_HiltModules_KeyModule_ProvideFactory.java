package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.viewmodel.ProfileViewModel_HiltModules;
import dagger.internal.Factory;

public final class ProfileViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 0;
    private static int component3 = 1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component1 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component3 + 31;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component1 + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static ProfileViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        ProfileViewModel_HiltModules_KeyModule_ProvideFactory profileViewModel_HiltModules_KeyModule_ProvideFactory = component2.copydefault;
        int i4 = component3 + 53;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return profileViewModel_HiltModules_KeyModule_ProvideFactory;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 27;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = ProfileViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 61;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component2 {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        static final ProfileViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new ProfileViewModel_HiltModules_KeyModule_ProvideFactory();

        private component2() {
        }

        static {
            int i = component1 + 61;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }
    }
}
