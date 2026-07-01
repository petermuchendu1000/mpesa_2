package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles.SearchBundlesViewModel_HiltModules;
import dagger.internal.Factory;

public final class SearchBundlesViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<Boolean> {
    private static int component2 = 1;
    private static int copydefault;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = copydefault + 27;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = get();
        int i4 = component2 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return bool;
    }

    @Override
    public Boolean get() {
        int i = 2 % 2;
        int i2 = copydefault + 75;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolValueOf = Boolean.valueOf(provide());
        int i4 = copydefault + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return boolValueOf;
    }

    public static SearchBundlesViewModel_HiltModules_KeyModule_ProvideFactory create() {
        int i = 2 % 2;
        int i2 = component2 + 41;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SearchBundlesViewModel_HiltModules_KeyModule_ProvideFactory searchBundlesViewModel_HiltModules_KeyModule_ProvideFactory = component3.copydefault;
        int i4 = copydefault + 101;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            return searchBundlesViewModel_HiltModules_KeyModule_ProvideFactory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static boolean provide() {
        int i = 2 % 2;
        int i2 = copydefault + 81;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zProvide = SearchBundlesViewModel_HiltModules.KeyModule.provide();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        return zProvide;
    }

    static final class component3 {
        private static int component2 = 0;
        private static int component3 = 1;
        static final SearchBundlesViewModel_HiltModules_KeyModule_ProvideFactory copydefault = new SearchBundlesViewModel_HiltModules_KeyModule_ProvideFactory();

        private component3() {
        }

        static {
            int i = component2 + 75;
            component3 = i % 128;
            int i2 = i % 2;
        }
    }
}
