package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public interface MtandaoCallWorker_HiltModule {
    @Binds
    @IntoMap
    @StringKey("com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCallWorker")
    WorkerAssistedFactory<? extends ListenableWorker> bind(MtandaoCallWorker_AssistedFactory mtandaoCallWorker_AssistedFactory);
}
