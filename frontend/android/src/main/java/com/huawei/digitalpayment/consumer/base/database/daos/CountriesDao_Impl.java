package com.huawei.digitalpayment.consumer.base.database.daos;

import android.database.Cursor;
import android.os.Process;
import androidx.collection.LongSparseArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.alibaba.griver.ui.ant.utils.IconfontConstants;
import com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CountryWithDetails;
import com.huawei.digitalpayment.consumer.base.database.entities.country.CurrencyEntity;
import com.huawei.digitalpayment.consumer.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.emailaddress.EmailAddressFragment$special$$inlined$activityViewModels$default$3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

public final class CountriesDao_Impl implements CountriesDao {
    private static int getAsAtTimestamp = 0;
    private static int getRequestBeneficiariesState = 1;
    private final EntityInsertionAdapter<CountryEntity> ShareDataUIState;
    private final EntityInsertionAdapter<CurrencyEntity> component1;
    private final RoomDatabase component2;
    private final EntityInsertionAdapter<CarrierEntity> component3;
    private final SharedSQLiteStatement copydefault;

    public static Object copydefault(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i;
        int i8 = ~((~i3) | i7);
        int i9 = ~i4;
        int i10 = i8 | (~(i9 | i3)) | (~(i | i3));
        int i11 = i7 | i3;
        int i12 = i9 | i11;
        int i13 = i + i3 + i5 + ((-1542968645) * i2) + (1789173782 * i6);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i) + 752877568 + ((-368479342) * i3) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i5) + (1802502144 * i2) + (148897792 * i6) + (289275904 * i14);
        int i16 = (i * (-930071408)) + 1959937684 + (i3 * (-930070194)) + (i10 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i11 * (-1214)) + (i12 * TypedValues.MotionType.TYPE_PATHMOTION_ARC) + (i5 * (-930070801)) + (i2 * 1059663509) + (i6 * (-1428764534)) + (i14 * 484573184);
        return i15 + ((i16 * i16) * 411172864) != 1 ? component3(objArr) : component2(objArr);
    }

    public CountriesDao_Impl(RoomDatabase roomDatabase) {
        this.component2 = roomDatabase;
        this.ShareDataUIState = new EntityInsertionAdapter<CountryEntity>(this, roomDatabase) {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CountryEntity countryEntity) {
                int i = 2 % 2;
                int i2 = component1 + 73;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(supportSQLiteStatement, countryEntity);
                int i4 = component1 + 101;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 52 / 0;
                }
            }

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 69;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 101;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return "INSERT OR REPLACE INTO `countries` (`id`,`name`,`emoji`,`unicode`,`alpha2Code`,`alpha3Code`,`dialCode`,`transaction`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected void copydefault(androidx.sqlite.db.SupportSQLiteStatement r6, com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity r7) {
                /*
                    Method dump skipped, instruction units count: 217
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass2.copydefault(androidx.sqlite.db.SupportSQLiteStatement, com.huawei.digitalpayment.consumer.base.database.entities.country.CountryEntity):void");
            }
        };
        this.component1 = new EntityInsertionAdapter<CurrencyEntity>(this, roomDatabase) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CurrencyEntity currencyEntity) {
                int i = 2 % 2;
                int i2 = component1 + 27;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component1(supportSQLiteStatement, currencyEntity);
                if (i3 != 0) {
                    int i4 = 83 / 0;
                }
                int i5 = component2 + 7;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = component2 + 15;
                int i3 = i2 % 128;
                component1 = i3;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 25;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return "INSERT OR REPLACE INTO `currencies` (`id`,`country`,`iso`,`name`) VALUES (nullif(?, 0),?,?,?)";
            }

            protected void component1(SupportSQLiteStatement supportSQLiteStatement, CurrencyEntity currencyEntity) {
                int i = 2 % 2;
                int i2 = component2 + 69;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                supportSQLiteStatement.bindLong(1, currencyEntity.getId());
                supportSQLiteStatement.bindLong(2, currencyEntity.getCountryId());
                if (currencyEntity.getIso() == null) {
                    int i4 = component2 + 41;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, currencyEntity.getIso());
                }
                if (currencyEntity.getName() == null) {
                    int i6 = component2 + 69;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    supportSQLiteStatement.bindNull(4);
                    return;
                }
                supportSQLiteStatement.bindString(4, currencyEntity.getName());
                int i8 = component2 + 7;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            }
        };
        this.component3 = new EntityInsertionAdapter<CarrierEntity>(this, roomDatabase) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void bind(SupportSQLiteStatement supportSQLiteStatement, CarrierEntity carrierEntity) {
                int i = 2 % 2;
                int i2 = component3 + 7;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                copydefault(supportSQLiteStatement, carrierEntity);
                if (i3 != 0) {
                    throw null;
                }
            }

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 99;
                int i3 = i2 % 128;
                component3 = i3;
                Object obj = null;
                if (i2 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                int i4 = i3 + 99;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    return "INSERT OR REPLACE INTO `carriers` (`id`,`country`,`code`,`name`) VALUES (nullif(?, 0),?,?,?)";
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected void copydefault(androidx.sqlite.db.SupportSQLiteStatement r6, com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity r7) {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass1.ShareDataUIState
                    int r1 = r1 + 117
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass1.component3 = r2
                    int r1 = r1 % r0
                    r2 = 3
                    if (r1 != 0) goto L27
                    int r1 = r7.getId()
                    long r3 = (long) r1
                    r1 = 0
                    r6.bindLong(r1, r3)
                    int r1 = r7.getCountryId()
                    long r3 = (long) r1
                    r6.bindLong(r0, r3)
                    java.lang.String r1 = r7.getCode()
                    if (r1 != 0) goto L42
                    goto L3e
                L27:
                    int r1 = r7.getId()
                    long r3 = (long) r1
                    r1 = 1
                    r6.bindLong(r1, r3)
                    int r1 = r7.getCountryId()
                    long r3 = (long) r1
                    r6.bindLong(r0, r3)
                    java.lang.String r1 = r7.getCode()
                    if (r1 != 0) goto L42
                L3e:
                    r6.bindNull(r2)
                    goto L49
                L42:
                    java.lang.String r1 = r7.getCode()
                    r6.bindString(r2, r1)
                L49:
                    java.lang.String r1 = r7.getName()
                    r2 = 4
                    if (r1 != 0) goto L5d
                    int r7 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass1.ShareDataUIState
                    int r7 = r7 + 95
                    int r1 = r7 % 128
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass1.component3 = r1
                    int r7 = r7 % r0
                    r6.bindNull(r2)
                    goto L64
                L5d:
                    java.lang.String r7 = r7.getName()
                    r6.bindString(r2, r7)
                L64:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass1.copydefault(androidx.sqlite.db.SupportSQLiteStatement, com.huawei.digitalpayment.consumer.base.database.entities.country.CarrierEntity):void");
            }
        };
        this.copydefault = new SharedSQLiteStatement(this, roomDatabase) {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = copydefault + 45;
                int i3 = i2 % 128;
                component2 = i3;
                if (i2 % 2 == 0) {
                    throw null;
                }
                int i4 = i3 + 53;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 85 / 0;
                }
                return "DELETE FROM countries WHERE `transaction` = ?";
            }
        };
    }

    public class AnonymousClass4 implements Callable<Long> {
        public static int ShareDataUIState = 0;
        private static int component1 = 0;
        private static int copy = 1;
        public static int copydefault;
        final CountryEntity component2;

        AnonymousClass4(CountryEntity countryEntity) {
            this.component2 = countryEntity;
        }

        @Override
        public Long call() throws Exception {
            int i = 2 % 2;
            int i2 = copy + 93;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Long lShareDataUIState = ShareDataUIState();
            int i4 = copy + 65;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 98 / 0;
            }
            return lShareDataUIState;
        }

        public Long ShareDataUIState() throws Exception {
            int i = 2 % 2;
            int i2 = copy + 85;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            CountriesDao_Impl.component3(CountriesDao_Impl.this).beginTransaction();
            try {
                long jInsertAndReturnId = ((EntityInsertionAdapter) CountriesDao_Impl.copydefault(850076329, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), new Object[]{CountriesDao_Impl.this}, -850076328, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2())).insertAndReturnId(this.component2);
                CountriesDao_Impl.component3(CountriesDao_Impl.this).setTransactionSuccessful();
                CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                Long lValueOf = Long.valueOf(jInsertAndReturnId);
                int i4 = component1 + 65;
                copy = i4 % 128;
                int i5 = i4 % 2;
                return lValueOf;
            } catch (Throwable th) {
                CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                throw th;
            }
        }

        public static int component2() {
            int i = copydefault;
            int i2 = i % 9584695;
            copydefault = i + 1;
            if (i2 != 0) {
                return ShareDataUIState;
            }
            int iMyTid = Process.myTid();
            ShareDataUIState = iMyTid;
            return iMyTid;
        }
    }

    @Override
    public Object insertCountry(CountryEntity countryEntity, Continuation<? super Long> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new AnonymousClass4(countryEntity), continuation);
        int i2 = getRequestBeneficiariesState + 11;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return objExecute;
    }

    @Override
    public Object insertCurrencies(final List<CurrencyEntity> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new Callable<Unit>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public Unit call() throws Exception {
                Unit unitComponent1;
                int i2 = 2 % 2;
                int i3 = component1 + 29;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    unitComponent1 = component1();
                    int i4 = 83 / 0;
                } else {
                    unitComponent1 = component1();
                }
                int i5 = component2 + 125;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unitComponent1;
            }

            public Unit component1() throws Exception {
                int i2 = 2 % 2;
                int i3 = component2 + 121;
                component1 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        CountriesDao_Impl.component3(CountriesDao_Impl.this).beginTransaction();
                        CountriesDao_Impl.copydefault(CountriesDao_Impl.this).insert((Iterable) list);
                        CountriesDao_Impl.component3(CountriesDao_Impl.this).setTransactionSuccessful();
                        return Unit.INSTANCE;
                    }
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).beginTransaction();
                    CountriesDao_Impl.copydefault(CountriesDao_Impl.this).insert((Iterable) list);
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } finally {
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                }
            }
        }, continuation);
        int i2 = getAsAtTimestamp + 7;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return objExecute;
        }
        throw null;
    }

    @Override
    public Object insertCarriers(final List<CarrierEntity> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new Callable<Unit>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public Unit call() throws Exception {
                int i2 = 2 % 2;
                int i3 = component1 + 59;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unitComponent3 = component3();
                int i5 = ShareDataUIState + 71;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unitComponent3;
            }

            public Unit component3() throws Exception {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 25;
                component1 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        CountriesDao_Impl.component3(CountriesDao_Impl.this).beginTransaction();
                        CountriesDao_Impl.component1(CountriesDao_Impl.this).insert((Iterable) list);
                        CountriesDao_Impl.component3(CountriesDao_Impl.this).setTransactionSuccessful();
                        return Unit.INSTANCE;
                    }
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).beginTransaction();
                    CountriesDao_Impl.component1(CountriesDao_Impl.this).insert((Iterable) list);
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                    throw null;
                } finally {
                    CountriesDao_Impl.component3(CountriesDao_Impl.this).endTransaction();
                }
            }
        }, continuation);
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
        }
        return objExecute;
    }

    private Object component2(String str, List list, Continuation continuation) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return CountriesDao.DefaultImpls.clearAndInsertCountries(this, str, list, continuation);
        }
        CountriesDao.DefaultImpls.clearAndInsertCountries(this, str, list, continuation);
        throw null;
    }

    @Override
    public Object clearAndInsertCountries(final String str, final List<? extends Triple<CountryEntity, ? extends List<CurrencyEntity>, ? extends List<CarrierEntity>>> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.component2, new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 75;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                CountriesDao_Impl countriesDao_Impl = this.f$0;
                if (i4 != 0) {
                    return CountriesDao_Impl.$r8$lambda$H0qdOpEm32QU08OE1coKFpZSxEg(countriesDao_Impl, str, list, (Continuation) obj);
                }
                CountriesDao_Impl.$r8$lambda$H0qdOpEm32QU08OE1coKFpZSxEg(countriesDao_Impl, str, list, (Continuation) obj);
                throw null;
            }
        }, continuation);
        int i2 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        return objWithTransaction;
    }

    private Object component2(CountryEntity countryEntity, List list, List list2, Continuation continuation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object objInsertFullCountryData = CountriesDao.DefaultImpls.insertFullCountryData(this, countryEntity, list, list2, continuation);
        if (i3 == 0) {
            int i4 = 7 / 0;
        }
        int i5 = getRequestBeneficiariesState + 95;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 28 / 0;
        }
        return objInsertFullCountryData;
    }

    @Override
    public Object insertFullCountryData(final CountryEntity countryEntity, final List<CurrencyEntity> list, final List<CarrierEntity> list2, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.component2, new Function1() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 63;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Object obj$r8$lambda$xSIlN4SwbkZZL0c13q3a7XfZ2QE = CountriesDao_Impl.$r8$lambda$xSIlN4SwbkZZL0c13q3a7XfZ2QE(this.f$0, countryEntity, list, list2, (Continuation) obj);
                int i5 = component3 + 7;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return obj$r8$lambda$xSIlN4SwbkZZL0c13q3a7XfZ2QE;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }, continuation);
        int i2 = getRequestBeneficiariesState + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return objWithTransaction;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public Object deleteCountriesByTransaction(final String str, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new Callable<Unit>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public Unit call() throws Exception {
                int i2 = 2 % 2;
                int i3 = component1 + 13;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitComponent1 = component1();
                if (i4 == 0) {
                    int i5 = 69 / 0;
                }
                return unitComponent1;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[PHI: r1 r3
  0x003d: PHI (r1v9 androidx.sqlite.db.SupportSQLiteStatement) = (r1v6 androidx.sqlite.db.SupportSQLiteStatement), (r1v12 androidx.sqlite.db.SupportSQLiteStatement) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]
  0x003d: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[PHI: r1
  0x0030: PHI (r1v7 androidx.sqlite.db.SupportSQLiteStatement) = (r1v6 androidx.sqlite.db.SupportSQLiteStatement), (r1v12 androidx.sqlite.db.SupportSQLiteStatement) binds: [B:8:0x002e, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.Unit component1() throws java.lang.Exception {
                /*
                    r5 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass10.component3
                    int r1 = r1 + 45
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass10.component1 = r2
                    int r1 = r1 % r0
                    r2 = 1
                    if (r1 == 0) goto L22
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this
                    androidx.room.SharedSQLiteStatement r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component2(r1)
                    androidx.sqlite.db.SupportSQLiteStatement r1 = r1.acquire()
                    java.lang.String r3 = r2
                    r4 = 90
                    int r4 = r4 / 0
                    if (r3 != 0) goto L3d
                    goto L30
                L22:
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this
                    androidx.room.SharedSQLiteStatement r1 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component2(r1)
                    androidx.sqlite.db.SupportSQLiteStatement r1 = r1.acquire()
                    java.lang.String r3 = r2
                    if (r3 != 0) goto L3d
                L30:
                    int r3 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass10.component1
                    int r3 = r3 + 83
                    int r4 = r3 % 128
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass10.component3 = r4
                    int r3 = r3 % r0
                    r1.bindNull(r2)
                    goto L40
                L3d:
                    r1.bindString(r2, r3)
                L40:
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r0 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this     // Catch: java.lang.Throwable -> L75
                    androidx.room.RoomDatabase r0 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component3(r0)     // Catch: java.lang.Throwable -> L75
                    r0.beginTransaction()     // Catch: java.lang.Throwable -> L75
                    r1.executeUpdateDelete()     // Catch: java.lang.Throwable -> L6a
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r0 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this     // Catch: java.lang.Throwable -> L6a
                    androidx.room.RoomDatabase r0 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component3(r0)     // Catch: java.lang.Throwable -> L6a
                    r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6a
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6a
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this     // Catch: java.lang.Throwable -> L75
                    androidx.room.RoomDatabase r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component3(r2)     // Catch: java.lang.Throwable -> L75
                    r2.endTransaction()     // Catch: java.lang.Throwable -> L75
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this
                    androidx.room.SharedSQLiteStatement r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component2(r2)
                    r2.release(r1)
                    return r0
                L6a:
                    r0 = move-exception
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this     // Catch: java.lang.Throwable -> L75
                    androidx.room.RoomDatabase r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component3(r2)     // Catch: java.lang.Throwable -> L75
                    r2.endTransaction()     // Catch: java.lang.Throwable -> L75
                    throw r0     // Catch: java.lang.Throwable -> L75
                L75:
                    r0 = move-exception
                    com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.this
                    androidx.room.SharedSQLiteStatement r2 = com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.component2(r2)
                    r2.release(r1)
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.database.daos.CountriesDao_Impl.AnonymousClass10.component1():kotlin.Unit");
            }
        }, continuation);
        int i2 = getAsAtTimestamp + 125;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return objExecute;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public List<CountryWithDetails> getCountriesByTransactionType(String str) {
        int i;
        int i2;
        String string;
        String string2;
        String string3;
        String str2;
        String string4;
        int i3 = 2 % 2;
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM countries where `transaction` = ?", 1);
        if (str == null) {
            int i4 = getRequestBeneficiariesState + 25;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        this.component2.assertNotSuspendingTransaction();
        this.component2.beginTransaction();
        try {
            Cursor cursorQuery = DBUtil.query(this.component2, roomSQLiteQueryAcquire, true, null);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, GriverCacheDao.COLUMN_CACHE_ID);
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "emoji");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, IconfontConstants.KEY_ICON_UNICODE);
                int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alpha2Code");
                int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "alpha3Code");
                int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dialCode");
                int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, Keys.TRANSACTION);
                LongSparseArray longSparseArray = new LongSparseArray();
                LongSparseArray<ArrayList<CarrierEntity>> longSparseArray2 = new LongSparseArray<>();
                while (cursorQuery.moveToNext()) {
                    int i6 = getRequestBeneficiariesState + 35;
                    getAsAtTimestamp = i6 % 128;
                    if (i6 % 2 != 0) {
                        longSparseArray.containsKey(cursorQuery.getLong(columnIndexOrThrow));
                        throw null;
                    }
                    int i7 = columnIndexOrThrow2;
                    long j = cursorQuery.getLong(columnIndexOrThrow);
                    if (!longSparseArray.containsKey(j)) {
                        longSparseArray.put(j, new ArrayList());
                    }
                    long j2 = cursorQuery.getLong(columnIndexOrThrow);
                    if (!longSparseArray2.containsKey(j2)) {
                        longSparseArray2.put(j2, new ArrayList<>());
                    }
                    columnIndexOrThrow2 = i7;
                }
                int i8 = columnIndexOrThrow2;
                cursorQuery.moveToPosition(-1);
                copydefault(-1547933010, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), new Object[]{this, longSparseArray}, 1547933010, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2());
                component1(longSparseArray2);
                ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    int i9 = getAsAtTimestamp + 67;
                    getRequestBeneficiariesState = i9 % 128;
                    if (i9 % 2 == 0) {
                        i = cursorQuery.getInt(columnIndexOrThrow);
                        int i10 = 76 / 0;
                        if (cursorQuery.isNull(i8)) {
                            i2 = i;
                            string = null;
                        }
                        i2 = i;
                        string = cursorQuery.getString(i8);
                    } else {
                        i = cursorQuery.getInt(columnIndexOrThrow);
                        if (cursorQuery.isNull(i8)) {
                            i2 = i;
                            string = null;
                        } else {
                            i2 = i;
                            string = cursorQuery.getString(i8);
                        }
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow3)) {
                        int i11 = getRequestBeneficiariesState + 25;
                        getAsAtTimestamp = i11 % 128;
                        int i12 = i11 % 2;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(columnIndexOrThrow3);
                    }
                    String string5 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                    if (cursorQuery.isNull(columnIndexOrThrow5)) {
                        int i13 = getAsAtTimestamp + 123;
                        getRequestBeneficiariesState = i13 % 128;
                        if (i13 % 2 == 0) {
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                        string3 = null;
                    } else {
                        string3 = cursorQuery.getString(columnIndexOrThrow5);
                    }
                    if (cursorQuery.isNull(columnIndexOrThrow6)) {
                        int i14 = getAsAtTimestamp + 73;
                        getRequestBeneficiariesState = i14 % 128;
                        if (i14 % 2 == 0) {
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        str2 = null;
                        string4 = null;
                    } else {
                        str2 = null;
                        string4 = cursorQuery.getString(columnIndexOrThrow6);
                    }
                    arrayList.add(new CountryWithDetails(new CountryEntity(i2, string, string2, string5, string3, string4, cursorQuery.isNull(columnIndexOrThrow7) ? str2 : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? str2 : cursorQuery.getString(columnIndexOrThrow8)), (ArrayList) longSparseArray.get(cursorQuery.getLong(columnIndexOrThrow)), longSparseArray2.get(cursorQuery.getLong(columnIndexOrThrow))));
                    columnIndexOrThrow3 = columnIndexOrThrow3;
                    columnIndexOrThrow4 = columnIndexOrThrow4;
                }
                this.component2.setTransactionSuccessful();
                return arrayList;
            } finally {
                cursorQuery.close();
                roomSQLiteQueryAcquire.release();
            }
        } finally {
            this.component2.endTransaction();
        }
    }

    public static List<Class<?>> getRequiredConverters() {
        List<Class<?>> listEmptyList;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            listEmptyList = Collections.emptyList();
            int i3 = 73 / 0;
        } else {
            listEmptyList = Collections.emptyList();
        }
        int i4 = getAsAtTimestamp + 67;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    private Unit ShareDataUIState(LongSparseArray longSparseArray) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int iComponent2 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        int iComponent22 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        copydefault(-1547933010, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), new Object[]{this, longSparseArray}, 1547933010, iComponent2, iComponent22, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2());
        Unit unit = Unit.INSTANCE;
        int i4 = getAsAtTimestamp + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private static Object component3(Object[] objArr) {
        String string;
        String string2;
        final CountriesDao_Impl countriesDao_Impl = (CountriesDao_Impl) objArr[0];
        LongSparseArray longSparseArray = (LongSparseArray) objArr[1];
        int i = 2 % 2;
        if (longSparseArray.isEmpty()) {
            return null;
        }
        if (longSparseArray.size() > 999) {
            RelationUtil.recursiveFetchLongSparseArray(longSparseArray, true, new Function1() {
                private static int component1 = 1;
                private static int component3;

                @Override
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = component1 + 67;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unit$r8$lambda$p0_wrQixQVsBXKsg38mVkp12iHo = CountriesDao_Impl.$r8$lambda$p0_wrQixQVsBXKsg38mVkp12iHo(this.f$0, (LongSparseArray) obj);
                    int i5 = component3 + 55;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return unit$r8$lambda$p0_wrQixQVsBXKsg38mVkp12iHo;
                    }
                    throw null;
                }
            });
            return null;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `id`,`country`,`iso`,`name` FROM `currencies` WHERE `country` IN (");
        int size = longSparseArray.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i2 = 1;
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            roomSQLiteQueryAcquire.bindLong(i2, longSparseArray.keyAt(i3));
            i2++;
        }
        Cursor cursorQuery = DBUtil.query(countriesDao_Impl.component2, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "country");
            if (columnIndex == -1) {
                cursorQuery.close();
                int i4 = getRequestBeneficiariesState + 65;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                return null;
            }
            while (cursorQuery.moveToNext()) {
                int i6 = getRequestBeneficiariesState + 17;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                ArrayList arrayList = (ArrayList) longSparseArray.get(cursorQuery.getLong(columnIndex));
                if (arrayList != null) {
                    int i8 = cursorQuery.getInt(0);
                    int i9 = cursorQuery.getInt(1);
                    if (cursorQuery.isNull(2)) {
                        string = null;
                    } else {
                        string = cursorQuery.getString(2);
                        int i10 = getRequestBeneficiariesState + 33;
                        getAsAtTimestamp = i10 % 128;
                        int i11 = i10 % 2;
                    }
                    if (cursorQuery.isNull(3)) {
                        int i12 = getRequestBeneficiariesState + 1;
                        getAsAtTimestamp = i12 % 128;
                        int i13 = i12 % 2;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(3);
                    }
                    arrayList.add(new CurrencyEntity(i8, i9, string, string2));
                }
            }
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    private Unit component2(LongSparseArray longSparseArray) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        component1((LongSparseArray<ArrayList<CarrierEntity>>) longSparseArray);
        Unit unit = Unit.INSTANCE;
        int i4 = getRequestBeneficiariesState + 121;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private void component1(LongSparseArray<ArrayList<CarrierEntity>> longSparseArray) {
        String string;
        String string2;
        int i = 2 % 2;
        if (longSparseArray.isEmpty()) {
            return;
        }
        if (longSparseArray.size() > 999) {
            RelationUtil.recursiveFetchLongSparseArray(longSparseArray, true, new Function1() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public final Object invoke(Object obj) {
                    int i2 = 2 % 2;
                    int i3 = ShareDataUIState + 113;
                    component2 = i3 % 128;
                    int i4 = i3 % 2;
                    Unit unit$r8$lambda$v_g_ecuNZg7O78xxRW97GoZA_Sw = CountriesDao_Impl.$r8$lambda$v_g_ecuNZg7O78xxRW97GoZA_Sw(this.f$0, (LongSparseArray) obj);
                    int i5 = ShareDataUIState + 87;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    return unit$r8$lambda$v_g_ecuNZg7O78xxRW97GoZA_Sw;
                }
            });
            return;
        }
        StringBuilder sbNewStringBuilder = StringUtil.newStringBuilder();
        sbNewStringBuilder.append("SELECT `id`,`country`,`code`,`name` FROM `carriers` WHERE `country` IN (");
        int size = longSparseArray.size();
        StringUtil.appendPlaceholders(sbNewStringBuilder, size);
        sbNewStringBuilder.append(")");
        RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire(sbNewStringBuilder.toString(), size);
        int i2 = 1;
        for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
            roomSQLiteQueryAcquire.bindLong(i2, longSparseArray.keyAt(i3));
            i2++;
        }
        Object obj = null;
        Cursor cursorQuery = DBUtil.query(this.component2, roomSQLiteQueryAcquire, false, null);
        try {
            int columnIndex = CursorUtil.getColumnIndex(cursorQuery, "country");
            if (columnIndex == -1) {
                return;
            }
            while (cursorQuery.moveToNext()) {
                int i4 = getAsAtTimestamp + 87;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 == 0) {
                    longSparseArray.get(cursorQuery.getLong(columnIndex));
                    obj.hashCode();
                    throw null;
                }
                ArrayList<CarrierEntity> arrayList = longSparseArray.get(cursorQuery.getLong(columnIndex));
                if (arrayList != null) {
                    int i5 = cursorQuery.getInt(0);
                    int i6 = cursorQuery.getInt(1);
                    if (cursorQuery.isNull(2)) {
                        int i7 = getRequestBeneficiariesState + 15;
                        getAsAtTimestamp = i7 % 128;
                        if (i7 % 2 != 0) {
                            throw null;
                        }
                        string = null;
                    } else {
                        string = cursorQuery.getString(2);
                    }
                    if (cursorQuery.isNull(3)) {
                        int i8 = getRequestBeneficiariesState + 123;
                        getAsAtTimestamp = i8 % 128;
                        int i9 = i8 % 2;
                        string2 = null;
                    } else {
                        string2 = cursorQuery.getString(3);
                        int i10 = getRequestBeneficiariesState + 43;
                        getAsAtTimestamp = i10 % 128;
                        if (i10 % 2 != 0) {
                            int i11 = 2 / 2;
                        }
                    }
                    arrayList.add(new CarrierEntity(i5, i6, string, string2));
                }
            }
            cursorQuery.close();
            int i12 = getAsAtTimestamp + 121;
            getRequestBeneficiariesState = i12 % 128;
            int i13 = i12 % 2;
        } finally {
            cursorQuery.close();
        }
    }

    public static Object $r8$lambda$H0qdOpEm32QU08OE1coKFpZSxEg(CountriesDao_Impl countriesDao_Impl, String str, List list, Continuation continuation) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent2 = countriesDao_Impl.component2(str, list, continuation);
        int i4 = getAsAtTimestamp + 3;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return objComponent2;
    }

    public static Unit $r8$lambda$p0_wrQixQVsBXKsg38mVkp12iHo(CountriesDao_Impl countriesDao_Impl, LongSparseArray longSparseArray) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = countriesDao_Impl.ShareDataUIState(longSparseArray);
        if (i3 == 0) {
            int i4 = 54 / 0;
        }
        return unitShareDataUIState;
    }

    public static Unit $r8$lambda$v_g_ecuNZg7O78xxRW97GoZA_Sw(CountriesDao_Impl countriesDao_Impl, LongSparseArray longSparseArray) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = countriesDao_Impl.component2(longSparseArray);
        if (i3 != 0) {
            int i4 = 65 / 0;
        }
        int i5 = getAsAtTimestamp + 55;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return unitComponent2;
    }

    public static Object $r8$lambda$xSIlN4SwbkZZL0c13q3a7XfZ2QE(CountriesDao_Impl countriesDao_Impl, CountryEntity countryEntity, List list, List list2, Continuation continuation) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent2 = countriesDao_Impl.component2(countryEntity, list, list2, continuation);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = getRequestBeneficiariesState + 67;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return objComponent2;
    }

    static RoomDatabase component3(CountriesDao_Impl countriesDao_Impl) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        RoomDatabase roomDatabase = countriesDao_Impl.component2;
        if (i3 == 0) {
            return roomDatabase;
        }
        throw null;
    }

    static EntityInsertionAdapter component1(CountriesDao_Impl countriesDao_Impl) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 15;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        EntityInsertionAdapter<CarrierEntity> entityInsertionAdapter = countriesDao_Impl.component3;
        int i5 = i2 + 17;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return entityInsertionAdapter;
    }

    static EntityInsertionAdapter ShareDataUIState(CountriesDao_Impl countriesDao_Impl) {
        int iComponent2 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        int iComponent22 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        return (EntityInsertionAdapter) copydefault(850076329, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), new Object[]{countriesDao_Impl}, -850076328, iComponent2, iComponent22, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2());
    }

    static EntityInsertionAdapter copydefault(CountriesDao_Impl countriesDao_Impl) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        EntityInsertionAdapter<CurrencyEntity> entityInsertionAdapter = countriesDao_Impl.component1;
        if (i3 == 0) {
            return entityInsertionAdapter;
        }
        throw null;
    }

    static SharedSQLiteStatement component2(CountriesDao_Impl countriesDao_Impl) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 119;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        SharedSQLiteStatement sharedSQLiteStatement = countriesDao_Impl.copydefault;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 123;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 7 / 0;
        }
        return sharedSQLiteStatement;
    }

    private void component3(LongSparseArray<ArrayList<CurrencyEntity>> longSparseArray) {
        int iComponent2 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        int iComponent22 = EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2();
        copydefault(-1547933010, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2(), new Object[]{this, longSparseArray}, 1547933010, iComponent2, iComponent22, EmailAddressFragment$special$$inlined$activityViewModels$default$3.component2());
    }

    private static Object component2(Object[] objArr) {
        CountriesDao_Impl countriesDao_Impl = (CountriesDao_Impl) objArr[0];
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 73;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        EntityInsertionAdapter<CountryEntity> entityInsertionAdapter = countriesDao_Impl.ShareDataUIState;
        int i5 = i2 + 115;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 44 / 0;
        }
        return entityInsertionAdapter;
    }
}
