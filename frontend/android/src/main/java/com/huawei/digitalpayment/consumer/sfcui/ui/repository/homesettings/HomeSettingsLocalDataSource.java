package com.huawei.digitalpayment.consumer.sfcui.ui.repository.homesettings;

import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import com.huawei.digitalpayment.consumer.base.database.entities.HomeSettingsEntity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onLaunchlambda1;
import kotlin.r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/ui/repository/homesettings/HomeSettingsLocalDataSource;", "", "homeSettingsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/HomeSettingsDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/HomeSettingsDao;)V", "setHomeSettings", "", "homeSettingsEntity", "Lcom/huawei/digitalpayment/consumer/base/database/entities/HomeSettingsEntity;", "(Lcom/huawei/digitalpayment/consumer/base/database/entities/HomeSettingsEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHomeSettings", "Lkotlinx/coroutines/flow/Flow;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HomeSettingsLocalDataSource {
    public static final int $stable = 8;
    private static int ShareDataUIState = 0;
    private static int component1 = 7 % 128;
    private static int component3 = 0;
    private static int copydefault = 1;
    private final HomeSettingsDao component2;

    @Inject
    public HomeSettingsLocalDataSource(HomeSettingsDao homeSettingsDao) {
        Intrinsics.checkNotNullParameter(homeSettingsDao, "");
        this.component2 = homeSettingsDao;
    }

    public final Object setHomeSettings(HomeSettingsEntity homeSettingsEntity, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        int i2 = copydefault + 67;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objInsertHomeSettings = this.component2.insertHomeSettings(homeSettingsEntity, continuation);
        if (objInsertHomeSettings == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            int i4 = copydefault + 55;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInsertHomeSettings;
            }
            throw null;
        }
        Unit unit = Unit.INSTANCE;
        int i5 = copydefault + 57;
        ShareDataUIState = i5 % 128;
        if (i5 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final Flow<HomeSettingsEntity> getHomeSettings() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Flow<HomeSettingsEntity> homeSettings = this.component2.getHomeSettings();
        if (i3 == 0) {
            int i4 = 58 / 0;
        }
        return homeSettings;
    }

    static {
        int i = 7 % 2;
    }

    public static void component2() {
        r8lambdaGga0ztmPNYcZ2Poj0VEtDPu4ouA.copydefault[0] = onLaunchlambda1.copydefault[0];
    }
}
