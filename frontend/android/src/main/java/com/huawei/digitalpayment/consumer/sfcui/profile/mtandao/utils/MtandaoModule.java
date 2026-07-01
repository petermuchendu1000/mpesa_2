package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.ComplaintsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.LogsDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.PhoneDataRepository;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.DeviceMetrics;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCore;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/MtandaoModule;", "", "<init>", "()V", "provideConnectivityManager", "Landroid/net/ConnectivityManager;", "context", "Landroid/content/Context;", "providesMtandaoCore", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "complaintsDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/ComplaintsDataRepository;", "logsDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/LogsDataRepository;", "userMetrics", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/UserMetrics;", "deviceMetrics", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/DeviceMetrics;", "providesPhoneDataSender", "Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "phoneDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/PhoneDataRepository;", "userDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class MtandaoModule {
    public static final int $stable = 0;
    public static final MtandaoModule INSTANCE = new MtandaoModule();
    private static int ShareDataUIState = 1;
    private static int component1 = 1;
    private static int component2;
    private static int copydefault;

    private MtandaoModule() {
    }

    @Provides
    @Singleton
    public final ConnectivityManager provideConnectivityManager(@ApplicationContext Context context) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(context, "");
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService2 = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService2, "");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService2;
        int i3 = component1 + 75;
        copydefault = i3 % 128;
        if (i3 % 2 == 0) {
            return connectivityManager;
        }
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final MtandaoCore providesMtandaoCore(ComplaintsDataRepository complaintsDataRepository, LogsDataRepository logsDataRepository, UserMetrics userMetrics, DeviceMetrics deviceMetrics) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(complaintsDataRepository, "");
        Intrinsics.checkNotNullParameter(logsDataRepository, "");
        Intrinsics.checkNotNullParameter(userMetrics, "");
        Intrinsics.checkNotNullParameter(deviceMetrics, "");
        MtandaoCore mtandaoCore = new MtandaoCore(complaintsDataRepository, logsDataRepository, userMetrics, deviceMetrics);
        int i2 = copydefault + 71;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 47 / 0;
        }
        return mtandaoCore;
    }

    @Provides
    @Singleton
    public final PhoneDataSender providesPhoneDataSender(PhoneDataRepository phoneDataRepository, UserDataRepository userDataRepository, ComplaintsDataRepository complaintsDataRepository, LogsDataRepository logsDataRepository) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneDataRepository, "");
        Intrinsics.checkNotNullParameter(userDataRepository, "");
        Intrinsics.checkNotNullParameter(complaintsDataRepository, "");
        Intrinsics.checkNotNullParameter(logsDataRepository, "");
        PhoneDataSender phoneDataSender = new PhoneDataSender(phoneDataRepository, userDataRepository, complaintsDataRepository, logsDataRepository);
        int i2 = component1 + 3;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        return phoneDataSender;
    }

    static {
        int i = ShareDataUIState + 63;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
