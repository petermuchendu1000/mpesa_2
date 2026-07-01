package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

public final class MtandaoWorker_AssistedFactory_Impl implements MtandaoWorker_AssistedFactory {
    private static int component2 = 0;
    private static int component3 = 1;
    private final MtandaoWorker_Factory ShareDataUIState;

    @Override
    public ListenableWorker create(Context context, WorkerParameters workerParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = component2 + 25;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            create(context, workerParameters);
            throw null;
        }
        MtandaoWorker mtandaoWorkerCreate = create(context, workerParameters);
        int i3 = component2 + 125;
        component3 = i3 % 128;
        if (i3 % 2 != 0) {
            return mtandaoWorkerCreate;
        }
        throw null;
    }

    MtandaoWorker_AssistedFactory_Impl(MtandaoWorker_Factory mtandaoWorker_Factory) {
        this.ShareDataUIState = mtandaoWorker_Factory;
    }

    @Override
    public MtandaoWorker create(Context context, WorkerParameters workerParameters) throws Throwable {
        int i = 2 % 2;
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MtandaoWorker mtandaoWorker = this.ShareDataUIState.get(context, workerParameters);
        int i4 = component3 + 55;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return mtandaoWorker;
        }
        throw null;
    }

    public static Provider<MtandaoWorker_AssistedFactory> create(MtandaoWorker_Factory mtandaoWorker_Factory) {
        int i = 2 % 2;
        Factory factoryCreate = InstanceFactory.create(new MtandaoWorker_AssistedFactory_Impl(mtandaoWorker_Factory));
        int i2 = component2 + 67;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return factoryCreate;
    }

    public static dagger.internal.Provider<MtandaoWorker_AssistedFactory> createFactoryProvider(MtandaoWorker_Factory mtandaoWorker_Factory) {
        int i = 2 % 2;
        Factory factoryCreate = InstanceFactory.create(new MtandaoWorker_AssistedFactory_Impl(mtandaoWorker_Factory));
        int i2 = component2 + 39;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return factoryCreate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
