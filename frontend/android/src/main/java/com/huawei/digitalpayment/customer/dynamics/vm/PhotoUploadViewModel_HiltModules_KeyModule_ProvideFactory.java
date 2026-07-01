package com.huawei.digitalpayment.customer.dynamics.vm;

import com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadViewModel_HiltModules;
import dagger.internal.Factory;

public final class PhotoUploadViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component1 = 1;
    private static int component3;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = component3 + 17;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        if (i3 == 0) {
            int i4 = 6 / 0;
        }
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = component3 + 105;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return boolValueOf;
        }
        throw null;
    }

    public static PhotoUploadViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component3 + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PhotoUploadViewModel_HiltModules_KeyModule_ProvideFactory photoUploadViewModel_HiltModules_KeyModule_ProvideFactory = ShareDataUIState.ShareDataUIState;
        int i4 = component3 + 73;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return photoUploadViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = component1 + 65;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = PhotoUploadViewModel_HiltModules.KeyModule.provide();
        int i4 = component1 + 39;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 71 / 0;
        }
        return zProvide;
    }

    static final class ShareDataUIState {
        static final PhotoUploadViewModel_HiltModules_KeyModule_ProvideFactory ShareDataUIState = new PhotoUploadViewModel_HiltModules_KeyModule_ProvideFactory();
        private static int component2 = 1;
        private static int copydefault;

        private ShareDataUIState() {
        }

        static {
            int i = copydefault + 17;
            component2 = i % 128;
            int i2 = i % 2;
        }
    }
}
