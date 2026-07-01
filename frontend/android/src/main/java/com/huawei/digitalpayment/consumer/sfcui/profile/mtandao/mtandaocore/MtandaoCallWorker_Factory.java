package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import androidx.work.WorkerParameters;
import dagger.internal.Provider;
import dagger.internal.Providers;

public final class MtandaoCallWorker_Factory {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final Provider<MtandaoCore> component1;

    public MtandaoCallWorker_Factory(Provider<MtandaoCore> provider) {
        this.component1 = provider;
    }

    public MtandaoCallWorker get(Context context, WorkerParameters workerParameters) {
        int i = 2 % 2;
        int i2 = component2 + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MtandaoCallWorker mtandaoCallWorkerNewInstance = newInstance(context, workerParameters, this.component1.get());
        int i4 = copydefault + 93;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return mtandaoCallWorkerNewInstance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static MtandaoCallWorker_Factory create(javax.inject.Provider<MtandaoCore> provider) {
        int i = 2 % 2;
        MtandaoCallWorker_Factory mtandaoCallWorker_Factory = new MtandaoCallWorker_Factory(Providers.asDaggerProvider(provider));
        int i2 = component2 + 55;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return mtandaoCallWorker_Factory;
    }

    public static MtandaoCallWorker_Factory create(Provider<MtandaoCore> provider) {
        int i = 2 % 2;
        MtandaoCallWorker_Factory mtandaoCallWorker_Factory = new MtandaoCallWorker_Factory(provider);
        int i2 = component2 + 65;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return mtandaoCallWorker_Factory;
        }
        throw null;
    }

    public static MtandaoCallWorker newInstance(Context context, WorkerParameters workerParameters, MtandaoCore mtandaoCore) {
        int i = 2 % 2;
        MtandaoCallWorker mtandaoCallWorker = new MtandaoCallWorker(context, workerParameters, mtandaoCore);
        int i2 = copydefault + 69;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            return mtandaoCallWorker;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
