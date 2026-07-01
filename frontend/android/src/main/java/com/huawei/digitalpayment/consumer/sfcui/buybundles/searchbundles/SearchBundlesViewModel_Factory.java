package com.huawei.digitalpayment.consumer.sfcui.buybundles.searchbundles;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class SearchBundlesViewModel_Factory implements Factory<SearchBundlesViewModel> {
    private static int ShareDataUIState = 1;
    private static int copydefault;
    private final Provider<Context> component1;

    @Override
    public Object get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return get();
        }
        get();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SearchBundlesViewModel_Factory(Provider<Context> provider) {
        this.component1 = provider;
    }

    @Override
    public SearchBundlesViewModel get() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 91;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        SearchBundlesViewModel searchBundlesViewModelNewInstance = newInstance(this.component1.get());
        int i4 = ShareDataUIState + 73;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return searchBundlesViewModelNewInstance;
    }

    public static SearchBundlesViewModel_Factory create(javax.inject.Provider<Context> provider) {
        int i = 2 % 2;
        SearchBundlesViewModel_Factory searchBundlesViewModel_Factory = new SearchBundlesViewModel_Factory(Providers.asDaggerProvider(provider));
        int i2 = copydefault + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return searchBundlesViewModel_Factory;
    }

    public static SearchBundlesViewModel_Factory create(Provider<Context> provider) {
        int i = 2 % 2;
        SearchBundlesViewModel_Factory searchBundlesViewModel_Factory = new SearchBundlesViewModel_Factory(provider);
        int i2 = copydefault + 113;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            return searchBundlesViewModel_Factory;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SearchBundlesViewModel newInstance(Context context) {
        int i = 2 % 2;
        SearchBundlesViewModel searchBundlesViewModel = new SearchBundlesViewModel(context);
        int i2 = copydefault + 103;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        return searchBundlesViewModel;
    }
}
