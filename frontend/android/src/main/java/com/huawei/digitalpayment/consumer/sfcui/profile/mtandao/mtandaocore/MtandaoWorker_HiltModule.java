package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public interface MtandaoWorker_HiltModule {
    @Binds
    @IntoMap
    @StringKey("com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker")
    WorkerAssistedFactory<? extends ListenableWorker> bind(MtandaoWorker_AssistedFactory mtandaoWorker_AssistedFactory);
}
