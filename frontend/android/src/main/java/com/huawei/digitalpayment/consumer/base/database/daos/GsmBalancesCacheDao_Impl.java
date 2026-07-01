package com.huawei.digitalpayment.consumer.base.database.daos;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.PipHintTrackerKttrackPipAnimationHintView2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

public final class GsmBalancesCacheDao_Impl implements GsmBalancesCacheDao {
    private static int ShareDataUIState = 0;
    private static int component1 = 1;
    private final RoomDatabase component2;
    private final SharedSQLiteStatement component3;
    private final EntityInsertionAdapter<GsmBalancesCacheEntity> copydefault;

    public GsmBalancesCacheDao_Impl(RoomDatabase roomDatabase) {
        this.component2 = roomDatabase;
        this.copydefault = new EntityInsertionAdapter<GsmBalancesCacheEntity>(this, roomDatabase) {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public void bind(SupportSQLiteStatement supportSQLiteStatement, GsmBalancesCacheEntity gsmBalancesCacheEntity) {
                int i = 2 % 2;
                int i2 = component1 + 61;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                component2(supportSQLiteStatement, gsmBalancesCacheEntity);
                if (i3 != 0) {
                    throw null;
                }
                int i4 = ShareDataUIState + 55;
                component1 = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = ShareDataUIState;
                int i3 = i2 + 43;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 49;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 93 / 0;
                }
                return "INSERT OR REPLACE INTO `gsm_balances_cache` (`id`,`msisdn`,`display_name`,`display_order`,`remaining`,`cumulative`,`type`,`units`,`updated_at_milli_s`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            protected void component2(SupportSQLiteStatement supportSQLiteStatement, GsmBalancesCacheEntity gsmBalancesCacheEntity) {
                int i = 2 % 2;
                int i2 = component1 + 81;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    gsmBalancesCacheEntity.getId();
                    throw null;
                }
                if (gsmBalancesCacheEntity.getId() == null) {
                    int i3 = ShareDataUIState + 117;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, gsmBalancesCacheEntity.getId());
                }
                if (gsmBalancesCacheEntity.getMsisdn() == null) {
                    supportSQLiteStatement.bindNull(2);
                    int i5 = ShareDataUIState + 61;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                } else {
                    supportSQLiteStatement.bindString(2, gsmBalancesCacheEntity.getMsisdn());
                }
                if (gsmBalancesCacheEntity.getDisplayName() == null) {
                    int i7 = component1 + 9;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, gsmBalancesCacheEntity.getDisplayName());
                    int i9 = component1 + 5;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                }
                if (gsmBalancesCacheEntity.getDisplayOrder() == null) {
                    int i11 = component1 + 115;
                    ShareDataUIState = i11 % 128;
                    int i12 = i11 % 2;
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, gsmBalancesCacheEntity.getDisplayOrder().intValue());
                }
                if (gsmBalancesCacheEntity.getRemaining() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindDouble(5, gsmBalancesCacheEntity.getRemaining().floatValue());
                }
                if (gsmBalancesCacheEntity.getCumulative() == null) {
                    int i13 = component1 + 33;
                    ShareDataUIState = i13 % 128;
                    if (i13 % 2 != 0) {
                        supportSQLiteStatement.bindNull(114);
                    } else {
                        supportSQLiteStatement.bindNull(6);
                    }
                } else {
                    supportSQLiteStatement.bindString(6, gsmBalancesCacheEntity.getCumulative());
                }
                if (gsmBalancesCacheEntity.getType() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, gsmBalancesCacheEntity.getType());
                }
                if (gsmBalancesCacheEntity.getUnits() == null) {
                    int i14 = component1 + 1;
                    ShareDataUIState = i14 % 128;
                    if (i14 % 2 != 0) {
                        supportSQLiteStatement.bindNull(65);
                    } else {
                        supportSQLiteStatement.bindNull(8);
                    }
                } else {
                    supportSQLiteStatement.bindString(8, gsmBalancesCacheEntity.getUnits());
                }
                supportSQLiteStatement.bindLong(9, gsmBalancesCacheEntity.getUpdatedAtMillis());
            }
        };
        this.component3 = new SharedSQLiteStatement(this, roomDatabase) {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = component2;
                int i3 = i2 + 1;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = i2 + 33;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return "DELETE FROM gsm_balances_cache WHERE msisdn = ?";
            }
        };
    }

    @Override
    public Object upsert(final GsmBalancesCacheEntity gsmBalancesCacheEntity, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new Callable<Unit>() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public Unit call() throws Exception {
                int i2 = 2 % 2;
                int i3 = copydefault + 5;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitCopydefault = copydefault();
                int i5 = copydefault + 43;
                component2 = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitCopydefault;
                }
                throw null;
            }

            public Unit copydefault() throws Exception {
                int i2 = 2 % 2;
                int i3 = copydefault + 33;
                component2 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).beginTransaction();
                        GsmBalancesCacheDao_Impl.copydefault(GsmBalancesCacheDao_Impl.this).insert(gsmBalancesCacheEntity);
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).setTransactionSuccessful();
                        Unit unit = Unit.INSTANCE;
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                        int i4 = copydefault + 1;
                        component2 = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 11 / 0;
                        }
                        return unit;
                    }
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).beginTransaction();
                    GsmBalancesCacheDao_Impl.copydefault(GsmBalancesCacheDao_Impl.this).insert(gsmBalancesCacheEntity);
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).setTransactionSuccessful();
                    Unit unit2 = Unit.INSTANCE;
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                    throw null;
                } catch (Throwable th) {
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                    throw th;
                }
            }
        }, continuation);
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return objExecute;
    }

    @Override
    public Object upsertAll(final List<GsmBalancesCacheEntity> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new Callable<Unit>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public Unit call() throws Exception {
                int i2 = 2 % 2;
                int i3 = component1 + 63;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Unit unitComponent3 = component3();
                int i5 = component3 + 89;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unitComponent3;
            }

            public Unit component3() throws Exception {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component1 = i3 % 128;
                Object obj = null;
                try {
                    if (i3 % 2 != 0) {
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).beginTransaction();
                        GsmBalancesCacheDao_Impl.copydefault(GsmBalancesCacheDao_Impl.this).insert((Iterable) list);
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).setTransactionSuccessful();
                        Unit unit = Unit.INSTANCE;
                        GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                        int i4 = component3 + 109;
                        component1 = i4 % 128;
                        if (i4 % 2 != 0) {
                            return unit;
                        }
                        throw null;
                    }
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).beginTransaction();
                    GsmBalancesCacheDao_Impl.copydefault(GsmBalancesCacheDao_Impl.this).insert((Iterable) list);
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).setTransactionSuccessful();
                    Unit unit2 = Unit.INSTANCE;
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                    obj.hashCode();
                    throw null;
                } catch (Throwable th) {
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                    throw th;
                }
            }
        }, continuation);
        int i2 = ShareDataUIState + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        return objExecute;
    }

    private Object copydefault(String str, List list, Continuation continuation) {
        int i = 2 % 2;
        int i2 = component1 + 33;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            GsmBalancesCacheDao.DefaultImpls.replaceForMsisdn(this, str, list, continuation);
            throw null;
        }
        Object objReplaceForMsisdn = GsmBalancesCacheDao.DefaultImpls.replaceForMsisdn(this, str, list, continuation);
        int i3 = component1 + 107;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        return objReplaceForMsisdn;
    }

    @Override
    public Object replaceForMsisdn(final String str, final List<GsmBalancesCacheEntity> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objWithTransaction = RoomDatabaseKt.withTransaction(this.component2, new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 69;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Object objM10156$r8$lambda$rSuTLN0SmXKZbb6TIjixjUlzBw = GsmBalancesCacheDao_Impl.m10156$r8$lambda$rSuTLN0SmXKZbb6TIjixjUlzBw(this.f$0, str, list, (Continuation) obj);
                int i5 = component3 + 101;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return objM10156$r8$lambda$rSuTLN0SmXKZbb6TIjixjUlzBw;
            }
        }, continuation);
        int i2 = component1 + 51;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
        }
        return objWithTransaction;
    }

    public class AnonymousClass1 implements Callable<Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        final String component1;

        AnonymousClass1(String str) {
            this.component1 = str;
        }

        @Override
        public Unit call() throws Exception {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 115;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Unit unitComponent1 = component1();
            int i4 = ShareDataUIState + 65;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return unitComponent1;
        }

        public Unit component1() throws Exception {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 117;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            SupportSQLiteStatement supportSQLiteStatementAcquire = GsmBalancesCacheDao_Impl.component2(GsmBalancesCacheDao_Impl.this).acquire();
            String str = this.component1;
            if (str != null) {
                supportSQLiteStatementAcquire.bindString(1, str);
            } else {
                int i4 = ShareDataUIState + 55;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    supportSQLiteStatementAcquire.bindNull(0);
                } else {
                    supportSQLiteStatementAcquire.bindNull(1);
                }
            }
            try {
                GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this).endTransaction();
                }
            } finally {
                GsmBalancesCacheDao_Impl.component2(GsmBalancesCacheDao_Impl.this).release(supportSQLiteStatementAcquire);
            }
        }

        public static void component3() {
            PipHintTrackerKttrackPipAnimationHintView2.copydefault[0] = Class.forName("com.google.mlkit.vision.text.zza").getDeclaredField("component1");
        }
    }

    @Override
    public Object deleteByMsisdn(String str, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.component2, true, new AnonymousClass1(str), continuation);
        int i2 = ShareDataUIState + 83;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            return objExecute;
        }
        throw null;
    }

    @Override
    public Flow<List<GsmBalancesCacheEntity>> observeByMsisdn(String str) {
        int i = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM gsm_balances_cache WHERE msisdn = ? ORDER BY display_order ASC", 1);
        if (str == null) {
            int i2 = ShareDataUIState + 61;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            roomSQLiteQueryAcquire.bindNull(1);
            int i4 = component1 + 65;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        } else {
            roomSQLiteQueryAcquire.bindString(1, str);
        }
        return CoroutinesRoom.createFlow(this.component2, false, new String[]{"gsm_balances_cache"}, new Callable<List<GsmBalancesCacheEntity>>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public List<GsmBalancesCacheEntity> call() throws Exception {
                int i6 = 2 % 2;
                int i7 = component2 + 53;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                List<GsmBalancesCacheEntity> listCopydefault = copydefault();
                int i9 = component2 + 71;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                return listCopydefault;
            }

            public List<GsmBalancesCacheEntity> copydefault() throws Exception {
                String string;
                String string2;
                String str2;
                int i6 = 2 % 2;
                int i7 = 0;
                Cursor cursorQuery = DBUtil.query(GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this), roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, GriverCacheDao.COLUMN_CACHE_ID);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "msisdn");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display_name");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display_order");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remaining");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cumulative");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "units");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated_at_milli_s");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i8 = component3 + 15;
                        component2 = i8 % 128;
                        int i9 = i8 % 2;
                        String string3 = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i10 = component2 + 57;
                            component3 = i10 % 128;
                            if (i10 % 2 != 0) {
                                int i11 = 22 / i7;
                            }
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        String string4 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                        Integer numValueOf = cursorQuery.isNull(columnIndexOrThrow4) ? null : Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4));
                        Float fValueOf = cursorQuery.isNull(columnIndexOrThrow5) ? null : Float.valueOf(cursorQuery.getFloat(columnIndexOrThrow5));
                        if (!cursorQuery.isNull(columnIndexOrThrow6)) {
                            string2 = cursorQuery.getString(columnIndexOrThrow6);
                        } else {
                            int i12 = component2 + 41;
                            component3 = i12 % 128;
                            if (i12 % 2 != 0) {
                                throw null;
                            }
                            string2 = null;
                        }
                        String string5 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                        if (cursorQuery.isNull(columnIndexOrThrow8)) {
                            str2 = null;
                        } else {
                            String string6 = cursorQuery.getString(columnIndexOrThrow8);
                            int i13 = component2 + 5;
                            component3 = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i14 = 3 % 2;
                            }
                            str2 = string6;
                        }
                        arrayList.add(new GsmBalancesCacheEntity(string3, string, string4, numValueOf, fValueOf, string2, string5, str2, cursorQuery.getLong(columnIndexOrThrow9)));
                        i7 = 0;
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                int i6 = 2 % 2;
                int i7 = component2 + 97;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                roomSQLiteQueryAcquire.release();
                if (i8 != 0) {
                    throw null;
                }
            }
        });
    }

    @Override
    public Object getByMsisdn(String str, Continuation<? super List<GsmBalancesCacheEntity>> continuation) {
        int i = 2 % 2;
        int i2 = component1 + 99;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM gsm_balances_cache WHERE msisdn = ? ORDER BY display_order ASC", 1);
        if (str != null) {
            roomSQLiteQueryAcquire.bindString(1, str);
        } else {
            int i4 = ShareDataUIState + 15;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            roomSQLiteQueryAcquire.bindNull(1);
        }
        Object objExecute = CoroutinesRoom.execute(this.component2, false, DBUtil.createCancellationSignal(), new Callable<List<GsmBalancesCacheEntity>>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public List<GsmBalancesCacheEntity> call() throws Exception {
                int i6 = 2 % 2;
                int i7 = component2 + 55;
                component1 = i7 % 128;
                if (i7 % 2 == 0) {
                    return component2();
                }
                component2();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public List<GsmBalancesCacheEntity> component2() throws Exception {
                String string;
                String string2;
                int i6 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(GsmBalancesCacheDao_Impl.component1(GsmBalancesCacheDao_Impl.this), roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, GriverCacheDao.COLUMN_CACHE_ID);
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "msisdn");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display_name");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "display_order");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remaining");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cumulative");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "units");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "updated_at_milli_s");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        if (cursorQuery.isNull(columnIndexOrThrow)) {
                            int i7 = component2 + 69;
                            int i8 = i7 % 128;
                            component1 = i8;
                            int i9 = i7 % 2;
                            int i10 = i8 + 89;
                            component2 = i10 % 128;
                            int i11 = i10 % 2;
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i12 = component2 + 79;
                            component1 = i12 % 128;
                            int i13 = i12 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        arrayList.add(new GsmBalancesCacheEntity(string, string2, cursorQuery.isNull(columnIndexOrThrow3) ^ true ? cursorQuery.getString(columnIndexOrThrow3) : null, !cursorQuery.isNull(columnIndexOrThrow4) ? Integer.valueOf(cursorQuery.getInt(columnIndexOrThrow4)) : null, cursorQuery.isNull(columnIndexOrThrow5) ? null : Float.valueOf(cursorQuery.getFloat(columnIndexOrThrow5)), !(cursorQuery.isNull(columnIndexOrThrow6) ^ true) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.getLong(columnIndexOrThrow9)));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, continuation);
        int i6 = component1 + 89;
        ShareDataUIState = i6 % 128;
        if (i6 % 2 == 0) {
            return objExecute;
        }
        throw null;
    }

    public static List<Class<?>> getRequiredConverters() {
        int i = 2 % 2;
        int i2 = component1 + 29;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        List<Class<?>> listEmptyList = Collections.emptyList();
        int i4 = component1 + 45;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return listEmptyList;
    }

    public static Object m10156$r8$lambda$rSuTLN0SmXKZbb6TIjixjUlzBw(GsmBalancesCacheDao_Impl gsmBalancesCacheDao_Impl, String str, List list, Continuation continuation) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 25;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Object objCopydefault = gsmBalancesCacheDao_Impl.copydefault(str, list, continuation);
        int i4 = ShareDataUIState + 125;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return objCopydefault;
        }
        throw null;
    }

    static RoomDatabase component1(GsmBalancesCacheDao_Impl gsmBalancesCacheDao_Impl) {
        int i = 2 % 2;
        int i2 = component1 + 61;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        RoomDatabase roomDatabase = gsmBalancesCacheDao_Impl.component2;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 5;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 95 / 0;
        }
        return roomDatabase;
    }

    static EntityInsertionAdapter copydefault(GsmBalancesCacheDao_Impl gsmBalancesCacheDao_Impl) {
        int i = 2 % 2;
        int i2 = component1 + 3;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        EntityInsertionAdapter<GsmBalancesCacheEntity> entityInsertionAdapter = gsmBalancesCacheDao_Impl.copydefault;
        if (i3 == 0) {
            return entityInsertionAdapter;
        }
        throw null;
    }

    static SharedSQLiteStatement component2(GsmBalancesCacheDao_Impl gsmBalancesCacheDao_Impl) {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 71;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        SharedSQLiteStatement sharedSQLiteStatement = gsmBalancesCacheDao_Impl.component3;
        int i5 = i2 + 113;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return sharedSQLiteStatement;
    }
}
