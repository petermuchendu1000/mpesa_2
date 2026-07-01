package com.huawei.digitalpayment.consumer.base.database.daos.productcatalog;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.digitalpayment.consumer.base.database.entities.productcatalog.WithExpiryBundleEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.EdgeToEdgeBase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.r8lambdaA0RwxxTQIMFOsDA3Nv48auR1K4;
import kotlinx.coroutines.flow.Flow;

public final class WithExpiryBundleDao_Impl implements WithExpiryBundleDao {
    private static int component2 = 0;
    private static int component3 = 1;
    private final EntityInsertionAdapter<WithExpiryBundleEntity> ShareDataUIState;
    private final RoomDatabase copydefault;

    public WithExpiryBundleDao_Impl(RoomDatabase roomDatabase) {
        this.copydefault = roomDatabase;
        this.ShareDataUIState = new EntityInsertionAdapter<WithExpiryBundleEntity>(this, roomDatabase) {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WithExpiryBundleEntity withExpiryBundleEntity) {
                int i = 2 % 2;
                int i2 = component3 + 103;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component2(supportSQLiteStatement, withExpiryBundleEntity);
                int i4 = ShareDataUIState + 15;
                component3 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public String createQuery() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 29;
                int i3 = i2 % 128;
                component3 = i3;
                if (i2 % 2 != 0) {
                    int i4 = 90 / 0;
                }
                int i5 = i3 + 109;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 != 0) {
                    return "INSERT OR REPLACE INTO `with_expiry_bundles` (`package_name`,`subpackage_name`,`product_name`,`product_id`,`product_amount`,`product_units`,`auto_renew`,`location_id`,`limit`) VALUES (?,?,?,?,?,?,?,?,?)";
                }
                throw null;
            }

            protected void component2(SupportSQLiteStatement supportSQLiteStatement, WithExpiryBundleEntity withExpiryBundleEntity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 71;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                if (withExpiryBundleEntity.getPackageName() != null) {
                    supportSQLiteStatement.bindString(1, withExpiryBundleEntity.getPackageName());
                } else {
                    int i4 = ShareDataUIState + 103;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    supportSQLiteStatement.bindNull(1);
                }
                if (withExpiryBundleEntity.getSubPackageName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, withExpiryBundleEntity.getSubPackageName());
                }
                if (withExpiryBundleEntity.getProductName() != null) {
                    supportSQLiteStatement.bindString(3, withExpiryBundleEntity.getProductName());
                } else {
                    int i6 = ShareDataUIState + 51;
                    component3 = i6 % 128;
                    if (i6 % 2 != 0) {
                        supportSQLiteStatement.bindNull(4);
                    } else {
                        supportSQLiteStatement.bindNull(3);
                    }
                }
                if (withExpiryBundleEntity.getProductId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, withExpiryBundleEntity.getProductId());
                }
                supportSQLiteStatement.bindLong(5, withExpiryBundleEntity.getProductAmount());
                if (withExpiryBundleEntity.getProductUnits() == null) {
                    int i7 = component3 + 41;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 == 0) {
                        supportSQLiteStatement.bindNull(13);
                    } else {
                        supportSQLiteStatement.bindNull(6);
                    }
                } else {
                    supportSQLiteStatement.bindString(6, withExpiryBundleEntity.getProductUnits());
                }
                supportSQLiteStatement.bindLong(7, withExpiryBundleEntity.getAutoRenew() ? 1L : 0L);
                if (withExpiryBundleEntity.getLocationId() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, withExpiryBundleEntity.getLocationId());
                }
                if (withExpiryBundleEntity.getLimit() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, withExpiryBundleEntity.getLimit());
                }
            }
        };
    }

    public class AnonymousClass5 implements Callable<Unit> {
        private static int component2 = 1;
        private static int component3;
        final List component1;

        AnonymousClass5(List list) {
            this.component1 = list;
        }

        @Override
        public Unit call() throws Exception {
            int i = 2 % 2;
            int i2 = component3 + 121;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Unit unitComponent2 = component2();
            int i4 = component2 + 33;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return unitComponent2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Unit component2() throws Exception {
            int i = 2 % 2;
            int i2 = component2 + 63;
            component3 = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).beginTransaction();
                    WithExpiryBundleDao_Impl.component1(WithExpiryBundleDao_Impl.this).insert((Iterable) this.component1);
                    WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).setTransactionSuccessful();
                    Unit unit = Unit.INSTANCE;
                    WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).endTransaction();
                    int i3 = component2 + 23;
                    component3 = i3 % 128;
                    if (i3 % 2 != 0) {
                        int i4 = 18 / 0;
                    }
                    return unit;
                }
                WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).beginTransaction();
                WithExpiryBundleDao_Impl.component1(WithExpiryBundleDao_Impl.this).insert((Iterable) this.component1);
                WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).setTransactionSuccessful();
                Unit unit2 = Unit.INSTANCE;
                WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).endTransaction();
                throw null;
            } catch (Throwable th) {
                WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this).endTransaction();
                throw th;
            }
        }

        public static void component1() {
            EdgeToEdgeBase.ShareDataUIState[0] = r8lambdaA0RwxxTQIMFOsDA3Nv48auR1K4.copydefault[0];
        }
    }

    @Override
    public Object insertBundles(List<WithExpiryBundleEntity> list, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Object objExecute = CoroutinesRoom.execute(this.copydefault, true, new AnonymousClass5(list), continuation);
        int i2 = component2 + 79;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        return objExecute;
    }

    @Override
    public Flow<List<WithExpiryBundleEntity>> getAllBundles() {
        int i = 2 % 2;
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("select * from with_expiry_bundles", 0);
        Flow<List<WithExpiryBundleEntity>> flowCreateFlow = CoroutinesRoom.createFlow(this.copydefault, false, new String[]{"with_expiry_bundles"}, new Callable<List<WithExpiryBundleEntity>>() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public List<WithExpiryBundleEntity> call() throws Exception {
                int i2 = 2 % 2;
                int i3 = component1 + 49;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    return component1();
                }
                component1();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public List<WithExpiryBundleEntity> component1() throws Exception {
                String string;
                String string2;
                String string3;
                boolean z;
                String string4;
                int i2 = 2 % 2;
                Cursor cursorQuery = DBUtil.query(WithExpiryBundleDao_Impl.copydefault(WithExpiryBundleDao_Impl.this), roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "package_name");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subpackage_name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_name");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_id");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_amount");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "product_units");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "auto_renew");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, FirebaseAnalytics.Param.LOCATION_ID);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "limit");
                    ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                    while (cursorQuery.moveToNext()) {
                        int i3 = component1 + 25;
                        ShareDataUIState = i3 % 128;
                        int i4 = i3 % 2;
                        if (cursorQuery.isNull(columnIndexOrThrow)) {
                            int i5 = component1 + 81;
                            ShareDataUIState = i5 % 128;
                            if (i5 % 2 != 0) {
                                throw null;
                            }
                            string = null;
                        } else {
                            string = cursorQuery.getString(columnIndexOrThrow);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow2)) {
                            int i6 = component1 + 33;
                            int i7 = i6 % 128;
                            ShareDataUIState = i7;
                            int i8 = i6 % 2;
                            int i9 = i7 + 13;
                            component1 = i9 % 128;
                            int i10 = i9 % 2;
                            string2 = null;
                        } else {
                            string2 = cursorQuery.getString(columnIndexOrThrow2);
                        }
                        if (cursorQuery.isNull(columnIndexOrThrow3)) {
                            int i11 = ShareDataUIState + 101;
                            component1 = i11 % 128;
                            int i12 = i11 % 2;
                            string3 = null;
                        } else {
                            string3 = cursorQuery.getString(columnIndexOrThrow3);
                        }
                        String string5 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                        int i13 = cursorQuery.getInt(columnIndexOrThrow5);
                        String string6 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                        if (cursorQuery.getInt(columnIndexOrThrow7) != 0) {
                            int i14 = component1 + 47;
                            ShareDataUIState = i14 % 128;
                            int i15 = i14 % 2;
                            z = true;
                        } else {
                            z = false;
                        }
                        String string7 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                        if (cursorQuery.isNull(columnIndexOrThrow9)) {
                            int i16 = component1 + 75;
                            ShareDataUIState = i16 % 128;
                            int i17 = i16 % 2;
                            string4 = null;
                        } else {
                            string4 = cursorQuery.getString(columnIndexOrThrow9);
                        }
                        arrayList.add(new WithExpiryBundleEntity(string, string2, string3, string5, i13, string6, z, string7, string4));
                    }
                    return arrayList;
                } finally {
                    cursorQuery.close();
                }
            }

            protected void finalize() {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 7;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                roomSQLiteQueryAcquire.release();
                if (i4 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        int i2 = component3 + 71;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        return flowCreateFlow;
    }

    public static List<Class<?>> getRequiredConverters() {
        int i = 2 % 2;
        int i2 = component2 + 59;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            return Collections.emptyList();
        }
        Collections.emptyList();
        throw null;
    }

    static RoomDatabase copydefault(WithExpiryBundleDao_Impl withExpiryBundleDao_Impl) {
        int i = 2 % 2;
        int i2 = component3 + 115;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        RoomDatabase roomDatabase = withExpiryBundleDao_Impl.copydefault;
        if (i3 == 0) {
            return roomDatabase;
        }
        throw null;
    }

    static EntityInsertionAdapter component1(WithExpiryBundleDao_Impl withExpiryBundleDao_Impl) {
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 125;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        EntityInsertionAdapter<WithExpiryBundleEntity> entityInsertionAdapter = withExpiryBundleDao_Impl.ShareDataUIState;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 87;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return entityInsertionAdapter;
        }
        throw null;
    }
}
