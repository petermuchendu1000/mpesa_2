package com.huawei.digitalpayment.consumer.base.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
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
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020!H&J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020)H&¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "allowedMiniAppsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/AllowedMiniAppsDao;", "phonedataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/PhoneDataDAO;", "userdataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/UserDataDAO;", "complaintsdataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/ComplaintsDataDAO;", "logsdataDAO", "Lcom/huawei/digitalpayment/consumer/base/database/daos/mtandao/LogsDataDAO;", "speedTestsHistoryDAO", "Lcom/safaricom/mtandaoapp/database/dao/SpeedTestsHistoryDataDAO;", "frequentItemsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/FrequentsDao;", "homeSettingsDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/HomeSettingsDao;", "countriesDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountriesDao;", "messageDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/MessageDao;", "gsmBalancesCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/GsmBalancesCacheDao;", "consentDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/BetaConsentDao;", "countryCacheMetaDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/CountryCacheMetaDao;", "mpesaFavoriteDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/favorite/MpesaFavoriteDao;", "deviceRestartCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/DeviceRestartCacheDao;", "withExpiryBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/WithExpiryBundleDao;", "tunukiwaBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/TunukiwaBundleDao;", "offerBundleDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/productcatalog/OfferBundleDao;", "neoBundlesDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/neobundles/NeoBundlesDao;", "Companion", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AppDatabase extends RoomDatabase {

    public static final Companion INSTANCE;
    public static final int DATABASE_VERSION = 10;
    private static int ShareDataUIState = 0;
    private static final String component1 = "one_app_database.db";
    private static int copydefault = 1;

    public abstract AllowedMiniAppsDao allowedMiniAppsDao();

    public abstract ComplaintsDataDAO complaintsdataDAO();

    public abstract BetaConsentDao consentDao();

    public abstract CountriesDao countriesDao();

    public abstract CountryCacheMetaDao countryCacheMetaDao();

    public abstract DeviceRestartCacheDao deviceRestartCacheDao();

    public abstract FrequentsDao frequentItemsDao();

    public abstract GsmBalancesCacheDao gsmBalancesCacheDao();

    public abstract HomeSettingsDao homeSettingsDao();

    public abstract LogsDataDAO logsdataDAO();

    public abstract MessageDao messageDao();

    public abstract MpesaFavoriteDao mpesaFavoriteDao();

    public abstract NeoBundlesDao neoBundlesDao();

    public abstract OfferBundleDao offerBundleDao();

    public abstract PhoneDataDAO phonedataDAO();

    public abstract SpeedTestsHistoryDataDAO speedTestsHistoryDAO();

    public abstract TunukiwaBundleDao tunukiwaBundleDao();

    public abstract UserDataDAO userdataDAO();

    public abstract WithExpiryBundleDao withExpiryBundleDao();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase$Companion;", "", "<init>", "()V", "DATABASE_NAME", "", "DATABASE_VERSION", "", "buildDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "context", "Landroid/content/Context;", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int copydefault = 1;

        private Companion() {
        }

        public final AppDatabase buildDatabase(Context context) {
            int i = 2 % 2;
            int i2 = component2 + 11;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            AppDatabase appDatabase = (AppDatabase) Room.databaseBuilder(context, AppDatabase.class, AppDatabase.component1).fallbackToDestructiveMigration().fallbackToDestructiveMigrationOnDowngrade().build();
            int i4 = copydefault + 85;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return appDatabase;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = ShareDataUIState + 21;
        copydefault = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }
}
