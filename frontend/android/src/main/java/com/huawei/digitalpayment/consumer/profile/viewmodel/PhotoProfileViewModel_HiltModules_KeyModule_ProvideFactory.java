package com.huawei.digitalpayment.consumer.profile.viewmodel;

import com.huawei.digitalpayment.consumer.profile.viewmodel.PhotoProfileViewModel_HiltModules;
import dagger.internal.Factory;

public final class PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int ShareDataUIState = 1;
    private static int copydefault;

    @Override
    public Object get() {
        Boolean bool;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            bool = get();
            int i3 = 84 / 0;
        } else {
            bool = get();
        }
        int i4 = copydefault + 79;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 45;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 9;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = copydefault + 53;
        ShareDataUIState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory photoProfileViewModel_HiltModules_KeyModule_ProvideFactory = component1.copydefault;
            obj.hashCode();
            throw null;
        }
        PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory photoProfileViewModel_HiltModules_KeyModule_ProvideFactory2 = component1.copydefault;
        int i3 = copydefault + 79;
        ShareDataUIState = i3 % 128;
        if (i3 % 2 != 0) {
            return photoProfileViewModel_HiltModules_KeyModule_ProvideFactory2;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PhotoProfileViewModel_HiltModules.KeyModule.provide();
        int i4 = copydefault + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return zProvide;
    }

    static final class component1 {
        private static int component1 = 1;
        private static int component2;
        static final PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new PhotoProfileViewModel_HiltModules_KeyModule_ProvideFactory();

        private component1() {
        }

        static {
            int i = component2 + 41;
            component1 = i % 128;
            int i2 = i % 2;
        }
    }
}
