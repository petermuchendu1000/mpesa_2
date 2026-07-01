package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

public final class MtandaoCallWorker_AssistedFactory_Impl implements MtandaoCallWorker_AssistedFactory {
    private static int component2 = 1;
    private static int copydefault;
    private final MtandaoCallWorker_Factory ShareDataUIState;

    @Override
    public ListenableWorker create(Context context, WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = component2 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MtandaoCallWorker mtandaoCallWorkerCreate = create(context, workerParameters);
        int i4 = component2 + 75;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mtandaoCallWorkerCreate;
    }

    MtandaoCallWorker_AssistedFactory_Impl(MtandaoCallWorker_Factory mtandaoCallWorker_Factory) {
        this.ShareDataUIState = mtandaoCallWorker_Factory;
    }

    @Override
    public MtandaoCallWorker create(Context context, WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = component2 + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MtandaoCallWorker mtandaoCallWorker = this.ShareDataUIState.get(context, workerParameters);
        int i4 = copydefault + 27;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return mtandaoCallWorker;
    }

    public static Provider<MtandaoCallWorker_AssistedFactory> create(MtandaoCallWorker_Factory mtandaoCallWorker_Factory) {
        int i = 2 % 2;
        Factory factoryCreate = InstanceFactory.create(new MtandaoCallWorker_AssistedFactory_Impl(mtandaoCallWorker_Factory));
        int i2 = copydefault + 19;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            return factoryCreate;
        }
        throw null;
    }

    public static dagger.internal.Provider<MtandaoCallWorker_AssistedFactory> createFactoryProvider(MtandaoCallWorker_Factory mtandaoCallWorker_Factory) {
        int i = 2 % 2;
        Factory factoryCreate = InstanceFactory.create(new MtandaoCallWorker_AssistedFactory_Impl(mtandaoCallWorker_Factory));
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 75 / 0;
        }
        return factoryCreate;
    }
}
