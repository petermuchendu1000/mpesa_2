package com.huawei.digitalpayment.consumer.base.database.di;

import android.content.Context;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.database.daos.AllowedMiniAppsDao;
import com.huawei.digitalpayment.consumer.base.database.daos.BetaConsentDao;
import com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao;
import com.huawei.digitalpayment.consumer.base.database.daos.CountryCacheMetaDao;
import com.huawei.digitalpayment.consumer.base.database.daos.DeviceRestartCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.FrequentsDao;
import com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.HomeSettingsDao;
import com.huawei.digitalpayment.consumer.base.database.daos.MessageDao;
import com.huawei.digitalpayment.consumer.base.database.daos.favorite.MpesaFavoriteDao;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.ComplaintsDataDAO;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.LogsDataDAO;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.PhoneDataDAO;
import com.huawei.digitalpayment.consumer.base.database.daos.mtandao.UserDataDAO;
import com.huawei.digitalpayment.consumer.base.database.daos.neobundles.NeoBundlesDao;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.OfferBundleDao;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.TunukiwaBundleDao;
import com.huawei.digitalpayment.consumer.base.database.daos.productcatalog.WithExpiryBundleDao;
import com.safaricom.mtandaoapp.database.dao.SpeedTestsHistoryDataDAO;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000bJ\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0011J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u001dJ\u0015\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020%2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020(2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020+2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020.2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b/J\u0015\u00100\u001a\u0002012\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b2J\u0015\u00103\u001a\u0002042\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b5J\u0015\u00106\u001a\u0002072\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b8J\u0015\u00109\u001a\u00020:2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020@2\u0006\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0002\bA¨\u0006B"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/di/AppDatabaseModule;", "", "<init>", "()V", "provideAppDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "context", "Landroid/content/Context;", "provideAllowedMiniAppsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/AllowedMiniAppsDao;", "db", "provideAllowedMiniAppsDao$ConsumerBaseUi_release", "provideFrequentItemsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;", "provideFrequentItemsDao$ConsumerBaseUi_release", "provideHomeSettingsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/HomeSettingsDao;", "provideHomeSettingsDao$ConsumerBaseUi_release", "providePhoneDataDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/PhoneDataDAO;", "providePhoneDataDao$ConsumerBaseUi_release", "provideUserDataDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/UserDataDAO;", "provideUserDataDao$ConsumerBaseUi_release", "provideComplaintsDataDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/ComplaintsDataDAO;", "provideComplaintsDataDao$ConsumerBaseUi_release", "provideLogsDataDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/LogsDataDAO;", "provideLogsDataDao$ConsumerBaseUi_release", "provideSpeedTestsHistoryDataDao", "Lcom/safaricom/mtandaoapp/database/dao/SpeedTestsHistoryDataDAO;", "provideSpeedTestsHistoryDataDao$ConsumerBaseUi_release", "provideCountriesDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountriesDao;", "provideCountriesDao$ConsumerBaseUi_release", "provideMessageDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/MessageDao;", "provideMessageDao$ConsumerBaseUi_release", "provideGsmBalancesCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/GsmBalancesCacheDao;", "provideGsmBalancesCacheDao$ConsumerBaseUi_release", "provideConsentDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/BetaConsentDao;", "provideConsentDao$ConsumerBaseUi_release", "provideCountryCacheMetaDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountryCacheMetaDao;", "provideCountryCacheMetaDao$ConsumerBaseUi_release", "provideMpesaFavoriteDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/favorite/MpesaFavoriteDao;", "provideMpesaFavoriteDao$ConsumerBaseUi_release", "provideDeviceRestartCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;", "provideDeviceRestartCacheDao$ConsumerBaseUi_release", "provideWithExpiryBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/WithExpiryBundleDao;", "provideWithExpiryBundleDao$ConsumerBaseUi_release", "provideTunukiwaBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/TunukiwaBundleDao;", "provideTunukiwaBundleDao$ConsumerBaseUi_release", "provideOfferBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/OfferBundleDao;", "provideOfferBundleDao$ConsumerBaseUi_release", "provideNeoBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/neobundles/NeoBundlesDao;", "provideNeoBundleDao$ConsumerBaseUi_release", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Module
public final class AppDatabaseModule {
    public static final AppDatabaseModule INSTANCE = new AppDatabaseModule();
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private static int component3 = 0;
    private static int copydefault = 1;

    private AppDatabaseModule() {
    }

    @Provides
    @Singleton
    public final AppDatabase provideAppDatabase(@ApplicationContext Context context) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 79;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        AppDatabase appDatabaseBuildDatabase = AppDatabase.INSTANCE.buildDatabase(context);
        int i4 = ShareDataUIState + 113;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return appDatabaseBuildDatabase;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final AllowedMiniAppsDao provideAllowedMiniAppsDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 125;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.allowedMiniAppsDao();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.allowedMiniAppsDao();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final FrequentsDao provideFrequentItemsDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 87;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        FrequentsDao frequentsDaoFrequentItemsDao = db.frequentItemsDao();
        int i4 = ShareDataUIState + 13;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return frequentsDaoFrequentItemsDao;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final HomeSettingsDao provideHomeSettingsDao$ConsumerBaseUi_release(AppDatabase db) {
        HomeSettingsDao homeSettingsDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 13;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            homeSettingsDao = db.homeSettingsDao();
            int i3 = 50 / 0;
        } else {
            Intrinsics.checkNotNullParameter(db, "");
            homeSettingsDao = db.homeSettingsDao();
        }
        int i4 = ShareDataUIState + 29;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return homeSettingsDao;
    }

    @Provides
    @Singleton
    public final PhoneDataDAO providePhoneDataDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.phonedataDAO();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.phonedataDAO();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final UserDataDAO provideUserDataDao$ConsumerBaseUi_release(AppDatabase db) {
        UserDataDAO userdataDAO;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 43;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            userdataDAO = db.userdataDAO();
            int i3 = 14 / 0;
        } else {
            Intrinsics.checkNotNullParameter(db, "");
            userdataDAO = db.userdataDAO();
        }
        int i4 = ShareDataUIState + 81;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return userdataDAO;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final ComplaintsDataDAO provideComplaintsDataDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 17;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            db.complaintsdataDAO();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(db, "");
        ComplaintsDataDAO complaintsdataDAO = db.complaintsdataDAO();
        int i3 = component1 + 103;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return complaintsdataDAO;
    }

    @Provides
    @Singleton
    public final LogsDataDAO provideLogsDataDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        LogsDataDAO logsdataDAO = db.logsdataDAO();
        int i4 = component1 + 87;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return logsdataDAO;
    }

    @Provides
    @Singleton
    public final SpeedTestsHistoryDataDAO provideSpeedTestsHistoryDataDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 87;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.speedTestsHistoryDAO();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.speedTestsHistoryDAO();
        throw null;
    }

    @Provides
    @Singleton
    public final CountriesDao provideCountriesDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 91;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.countriesDao();
        }
        Intrinsics.checkNotNullParameter(db, "");
        int i3 = 72 / 0;
        return db.countriesDao();
    }

    @Provides
    @Singleton
    public final MessageDao provideMessageDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 37;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            db.messageDao();
            throw null;
        }
        Intrinsics.checkNotNullParameter(db, "");
        MessageDao messageDao = db.messageDao();
        int i3 = ShareDataUIState + 41;
        component1 = i3 % 128;
        if (i3 % 2 != 0) {
            return messageDao;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final GsmBalancesCacheDao provideGsmBalancesCacheDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 89;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.gsmBalancesCacheDao();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.gsmBalancesCacheDao();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final BetaConsentDao provideConsentDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        BetaConsentDao betaConsentDaoConsentDao = db.consentDao();
        int i4 = component1 + 107;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return betaConsentDaoConsentDao;
    }

    @Provides
    @Singleton
    public final CountryCacheMetaDao provideCountryCacheMetaDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 119;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.countryCacheMetaDao();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.countryCacheMetaDao();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final MpesaFavoriteDao provideMpesaFavoriteDao$ConsumerBaseUi_release(AppDatabase db) {
        MpesaFavoriteDao mpesaFavoriteDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 93;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            mpesaFavoriteDao = db.mpesaFavoriteDao();
            int i3 = 87 / 0;
        } else {
            Intrinsics.checkNotNullParameter(db, "");
            mpesaFavoriteDao = db.mpesaFavoriteDao();
        }
        int i4 = component1 + 103;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return mpesaFavoriteDao;
    }

    @Provides
    @Singleton
    public final DeviceRestartCacheDao provideDeviceRestartCacheDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 51;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        DeviceRestartCacheDao deviceRestartCacheDao = db.deviceRestartCacheDao();
        int i4 = component1 + 99;
        ShareDataUIState = i4 % 128;
        if (i4 % 2 == 0) {
            return deviceRestartCacheDao;
        }
        throw null;
    }

    @Provides
    @Singleton
    public final WithExpiryBundleDao provideWithExpiryBundleDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = component1 + 21;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        WithExpiryBundleDao withExpiryBundleDao = db.withExpiryBundleDao();
        int i4 = ShareDataUIState + 103;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return withExpiryBundleDao;
    }

    @Provides
    @Singleton
    public final TunukiwaBundleDao provideTunukiwaBundleDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 123;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(db, "");
            return db.tunukiwaBundleDao();
        }
        Intrinsics.checkNotNullParameter(db, "");
        db.tunukiwaBundleDao();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Provides
    @Singleton
    public final OfferBundleDao provideOfferBundleDao$ConsumerBaseUi_release(AppDatabase db) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 21;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(db, "");
        OfferBundleDao offerBundleDao = db.offerBundleDao();
        int i4 = ShareDataUIState + 45;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return offerBundleDao;
    }

    @Provides
    @Singleton
    public final NeoBundlesDao provideNeoBundleDao$ConsumerBaseUi_release(AppDatabase db) {
        NeoBundlesDao neoBundlesDao;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 5;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(db, "");
            neoBundlesDao = db.neoBundlesDao();
            int i3 = 98 / 0;
        } else {
            Intrinsics.checkNotNullParameter(db, "");
            neoBundlesDao = db.neoBundlesDao();
        }
        int i4 = ShareDataUIState + 19;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return neoBundlesDao;
    }

    static {
        int i = component3 + 81;
        copydefault = i % 128;
        int i2 = i % 2;
    }
}
