package com.huawei.digitalpayment.pwa.ui.di;

import com.huawei.digitalpayment.pwa.model.DefaultPwaModel;
import com.huawei.digitalpayment.pwa.model.IPwaModel;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PwaModule {
    @Binds
    abstract IPwaModel ShareDataUIState(DefaultPwaModel defaultPwaModel);
}
