package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.app.usage.NetworkStats;
import android.app.usage.NetworkStatsManager;
import android.app.usage.UsageStatsManager;
import android.os.RemoteException;
import com.google.common.math.LinearTransformation;
import com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData;
import com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository;
import com.iap.ac.android.acs.operation.log.LogConstants;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/UserMetrics;", "Lkotlinx/coroutines/CoroutineScope;", "userDataRepository", "Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/repository/mtandao/UserDataRepository;)V", "mUsageStatsManager", "Landroid/app/usage/UsageStatsManager;", "userData", "Lcom/huawei/digitalpayment/consumer/base/database/entities/mtandao/UserData;", "getUserDeviceMetrics", "", "datasessionId", "", LogConstants.KEY_TIME_STAPM, "context", "Landroid/content/Context;", "getIdentData", "", "getGrantStatus", "getPackageTxBytesMobile", "", "networkStatsManager", "Landroid/app/usage/NetworkStatsManager;", "packageUid", "", "getPackageRxBytesWifi", "getPackageTxBytesWifi", "getTotalRxBytesWifi", "getTotalTxBytesWifi", "getTotalRxBytesMobile", "getTotalTxBytesMobile", "getTotalRxBytesHotspot", "getTotalTxBytesHotspot", "getPackageRxBytesMobile", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserMetrics implements CoroutineScope {
    private static int component4 = 0;
    private static int copy = 1;
    private static int equals = 1;
    private static int getAsAtTimestamp;
    private UserData ShareDataUIState;
    private UsageStatsManager component2;
    private UserDataRepository copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static String component1 = "";
    private static String component3 = "";

    public static Object component1(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~(i | i4);
        int i10 = i7 | (~i);
        int i11 = i9 | (~(i10 | i2));
        int i12 = (~i2) | i10;
        int i13 = i + i4 + i3 + (1134938392 * i5) + ((-1730424158) * i6);
        int i14 = i13 * i13;
        int i15 = (1345404558 * i) + 1061748736 + ((-382549644) * i4) + (1727954202 * i8) + ((-1283506547) * i11) + (1283506547 * i12) + ((-1666056192) * i3) + (1924136960 * i5) + (748945408 * i6) + (912850944 * i14);
        int i16 = (i * 1914917686) + 639827133 + (i4 * 1914918628) + (i8 * (-942)) + (i11 * (-471)) + (i12 * 471) + (i3 * 1914918157) + (i5 * (-1451741640)) + (i6 * (-1338016710)) + (i14 * (-1605042176));
        return i15 + ((i16 * i16) * (-230752256)) != 1 ? ShareDataUIState(objArr) : copydefault(objArr);
    }

    @Inject
    public UserMetrics(UserDataRepository userDataRepository) {
        Intrinsics.checkNotNullParameter(userDataRepository, "");
        this.copydefault = userDataRepository;
        this.ShareDataUIState = new UserData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 4095, (DefaultConstructorMarker) null);
    }

    public static final String access$getSimName1$cp() {
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 103;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            str = component1;
            int i4 = 76 / 0;
        } else {
            str = component1;
        }
        int i5 = i2 + 49;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getSimName2$cp() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 29;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        String str = component3;
        int i5 = i3 + 61;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static final UserData access$getUserData$p(UserMetrics userMetrics) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 61;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        UserData userData = userMetrics.ShareDataUIState;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 17;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return userData;
        }
        throw null;
    }

    public static final UserDataRepository access$getUserDataRepository$p(UserMetrics userMetrics) {
        int i = 2 % 2;
        int i2 = copy + 81;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        UserDataRepository userDataRepository = userMetrics.copydefault;
        int i5 = i3 + 115;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return userDataRepository;
    }

    public static final void access$setSimName1$cp(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        component1 = str;
        int i5 = i3 + 121;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$setSimName2$cp(String str) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        component3 = str;
        int i5 = i2 + 111;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getUserDeviceMetrics(java.lang.String r25, java.lang.String r26, android.content.Context r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 1729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.getUserDeviceMetrics(java.lang.String, java.lang.String, android.content.Context, boolean):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics$getUserDeviceMetrics$1", f = "UserMetrics.kt", i = {}, l = {337}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component1;

        /* JADX WARN: Removed duplicated region for block: B:13:0x003b A[PHI: r1
  0x003b: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r3
  0x0024: PHI (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:8:0x0022, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component3.component3
                int r1 = r1 + 63
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component3.copydefault = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L1c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component1
                r4 = 10
                int r4 = r4 / 0
                if (r3 == 0) goto L3b
                goto L24
            L1c:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r5.component1
                if (r3 == 0) goto L3b
            L24:
                if (r3 != r2) goto L33
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component3.copydefault
                int r1 = r1 + 35
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component3.component3 = r2
                int r1 = r1 % r0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L56
            L33:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L3b:
                kotlin.ResultKt.throwOnFailure(r6)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.this
                com.huawei.digitalpayment.consumer.base.database.repository.mtandao.UserDataRepository r6 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.access$getUserDataRepository$p(r6)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.this
                com.huawei.digitalpayment.consumer.base.database.entities.mtandao.UserData r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.access$getUserData$p(r0)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r5.component1 = r2
                java.lang.Object r6 = r6.insert(r0, r3)
                if (r6 != r1) goto L56
                return r1
            L56:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = UserMetrics.this.new component3(continuation);
            int i2 = copydefault + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = copydefault + 67;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 7 / 0;
            }
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[PHI: r1
  0x0074: PHI (r1v11 int) = (r1v7 int), (r1v15 int) binds: [B:8:0x0054, B:5:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean component2(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.copy
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            java.lang.String r4 = "android:get_usage_stats"
            java.lang.String r5 = ""
            java.lang.String r6 = "appops"
            if (r1 == 0) goto L36
            android.content.Context r1 = r8.getApplicationContext()
            java.lang.Object r1 = r1.getSystemService(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r5)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r5 = android.os.Process.myUid()
            android.content.Context r6 = r8.getApplicationContext()
            java.lang.String r6 = r6.getPackageName()
            int r1 = r1.checkOpNoThrow(r4, r5, r6)
            if (r1 != r0) goto L74
            goto L56
        L36:
            android.content.Context r1 = r8.getApplicationContext()
            java.lang.Object r1 = r1.getSystemService(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r5)
            android.app.AppOpsManager r1 = (android.app.AppOpsManager) r1
            int r5 = android.os.Process.myUid()
            android.content.Context r6 = r8.getApplicationContext()
            java.lang.String r6 = r6.getPackageName()
            int r1 = r1.checkOpNoThrow(r4, r5, r6)
            r4 = 3
            if (r1 != r4) goto L74
        L56:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.getAsAtTimestamp
            int r1 = r1 + 13
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.copy = r4
            int r1 = r1 % r0
            java.lang.String r0 = "android.permission.PACKAGE_USAGE_STATS"
            android.content.Context r8 = r8.getApplicationContext()
            int r8 = r8.checkCallingOrSelfPermission(r0)
            if (r1 != 0) goto L71
            r0 = 19
            int r0 = r0 / r2
            if (r8 != 0) goto L77
            goto L73
        L71:
            if (r8 != 0) goto L77
        L73:
            goto L76
        L74:
            if (r1 != 0) goto L77
        L76:
            r2 = r3
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.UserMetrics.component2(android.content.Context):boolean");
    }

    private final long copydefault(NetworkStatsManager networkStatsManager, int i) {
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -5);
        long txBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(0, null, calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis(), i);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                txBytes += bucket.getTxBytes();
                int i3 = getAsAtTimestamp + 123;
                copy = i3 % 128;
                int i4 = i3 % 2;
            }
            networkStatsQueryDetailsForUid.close();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        int i5 = copy + 119;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 / 0;
        }
        return txBytes;
    }

    private final long component1(NetworkStatsManager networkStatsManager, int i) {
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -5);
        long rxBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(1, null, calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis(), i);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            int i3 = getAsAtTimestamp + 13;
            copy = i3 % 128;
            int i4 = i3 % 2;
            while (!(!networkStatsQueryDetailsForUid.hasNextBucket())) {
                int i5 = copy + 123;
                getAsAtTimestamp = i5 % 128;
                int i6 = i5 % 2;
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                rxBytes += bucket.getRxBytes();
            }
            networkStatsQueryDetailsForUid.close();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return rxBytes;
    }

    private final long ShareDataUIState(NetworkStatsManager networkStatsManager, int i) {
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -5);
        long txBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(1, null, calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis(), i);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                int i3 = copy + 69;
                getAsAtTimestamp = i3 % 128;
                if (i3 % 2 != 0) {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    txBytes /= bucket.getTxBytes();
                } else {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    txBytes += bucket.getTxBytes();
                }
            }
            networkStatsQueryDetailsForUid.close();
            int i4 = copy + 105;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 5 % 3;
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        int i6 = copy + 99;
        getAsAtTimestamp = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 18 / 0;
        }
        return txBytes;
    }

    private final long component1(NetworkStatsManager networkStatsManager) {
        long rxBytes;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
        try {
            rxBytes = networkStatsManager.querySummaryForDevice(1, "", 0L, System.currentTimeMillis()).getRxBytes();
        } catch (RemoteException e) {
            e.printStackTrace();
            rxBytes = 0;
        }
        int i4 = copy + 91;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 25 / 0;
        }
        return rxBytes;
    }

    private static Object copydefault(Object[] objArr) {
        long txBytes;
        NetworkStatsManager networkStatsManager = (NetworkStatsManager) objArr[1];
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        copy = i2 % 128;
        try {
            txBytes = (i2 % 2 == 0 ? networkStatsManager.querySummaryForDevice(0, "", 1L, System.currentTimeMillis()) : networkStatsManager.querySummaryForDevice(1, "", 0L, System.currentTimeMillis())).getTxBytes();
        } catch (RemoteException e) {
            e.printStackTrace();
            txBytes = 0;
        }
        return Long.valueOf(txBytes);
    }

    private final long component3(NetworkStatsManager networkStatsManager) {
        long rxBytes;
        int i = 2 % 2;
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        try {
            rxBytes = (i2 % 2 != 0 ? networkStatsManager.querySummaryForDevice(1, null, 1L, System.currentTimeMillis()) : networkStatsManager.querySummaryForDevice(0, null, 0L, System.currentTimeMillis())).getRxBytes();
        } catch (RemoteException e) {
            e.printStackTrace();
            rxBytes = 0;
        }
        int i3 = copy + 107;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return rxBytes;
        }
        throw null;
    }

    private final long copydefault(NetworkStatsManager networkStatsManager) {
        long txBytes;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 29;
        copy = i2 % 128;
        int i3 = i2 % 2;
        try {
            txBytes = networkStatsManager.querySummaryForDevice(0, null, 0L, System.currentTimeMillis()).getTxBytes();
        } catch (RemoteException e) {
            e.printStackTrace();
            txBytes = 0;
        }
        int i4 = getAsAtTimestamp + 29;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 19 / 0;
        }
        return txBytes;
    }

    private final long ShareDataUIState(NetworkStatsManager networkStatsManager) {
        int i = 2 % 2;
        long rxBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(0, null, 0L, System.currentTimeMillis(), -5);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (!(!networkStatsQueryDetailsForUid.hasNextBucket())) {
                networkStatsQueryDetailsForUid.getNextBucket(bucket);
                rxBytes += bucket.getRxBytes();
                int i2 = copy + 55;
                getAsAtTimestamp = i2 % 128;
                int i3 = i2 % 2;
            }
            networkStatsQueryDetailsForUid.close();
            int i4 = getAsAtTimestamp + 73;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return rxBytes;
    }

    private static Object ShareDataUIState(Object[] objArr) {
        int i = 2 % 2;
        long txBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = ((NetworkStatsManager) objArr[1]).queryDetailsForUid(0, null, 0L, System.currentTimeMillis(), -5);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                int i2 = copy + 59;
                getAsAtTimestamp = i2 % 128;
                if (i2 % 2 != 0) {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    txBytes %= bucket.getTxBytes();
                } else {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    txBytes += bucket.getTxBytes();
                }
            }
            networkStatsQueryDetailsForUid.close();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        int i3 = copy + 21;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return Long.valueOf(txBytes);
        }
        int i4 = 89 / 0;
        return Long.valueOf(txBytes);
    }

    private final long component2(NetworkStatsManager networkStatsManager, int i) {
        int i2 = 2 % 2;
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -5);
        long rxBytes = 0;
        try {
            NetworkStats networkStatsQueryDetailsForUid = networkStatsManager.queryDetailsForUid(0, null, calendar.getTimeInMillis(), Calendar.getInstance().getTimeInMillis(), i);
            NetworkStats.Bucket bucket = new NetworkStats.Bucket();
            while (networkStatsQueryDetailsForUid.hasNextBucket()) {
                int i3 = getAsAtTimestamp + 51;
                copy = i3 % 128;
                if (i3 % 2 == 0) {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    rxBytes = bucket.getRxBytes() | rxBytes;
                } else {
                    networkStatsQueryDetailsForUid.getNextBucket(bucket);
                    rxBytes += bucket.getRxBytes();
                }
            }
            networkStatsQueryDetailsForUid.close();
            int i4 = getAsAtTimestamp + 65;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return rxBytes;
    }

    @Override
    public CoroutineContext getShareDataUIState() {
        CoroutineDispatcher io2;
        int i = 2 % 2;
        int i2 = copy + 43;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            io2 = Dispatchers.getIO();
            int i3 = 12 / 0;
        } else {
            io2 = Dispatchers.getIO();
        }
        int i4 = copy + 25;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return io2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/UserMetrics$Companion;", "", "<init>", "()V", "simName1", "", "getSimName1", "()Ljava/lang/String;", "setSimName1", "(Ljava/lang/String;)V", "simName2", "getSimName2", "setSimName2", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component2;

        private Companion() {
        }

        public final String getSimName1() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 55;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return UserMetrics.access$getSimName1$cp();
            }
            UserMetrics.access$getSimName1$cp();
            throw null;
        }

        public final void setSimName1(String str) {
            int i = 2 % 2;
            int i2 = component2 + 113;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(str, "");
                UserMetrics.access$setSimName1$cp(str);
            } else {
                Intrinsics.checkNotNullParameter(str, "");
                UserMetrics.access$setSimName1$cp(str);
                int i3 = 62 / 0;
            }
        }

        public final String getSimName2() {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 57;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            String strAccess$getSimName2$cp = UserMetrics.access$getSimName2$cp();
            int i4 = component2 + 39;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return strAccess$getSimName2$cp;
        }

        public final void setSimName2(String str) {
            int i = 2 % 2;
            int i2 = component2 + 65;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            UserMetrics.access$setSimName2$cp(str);
            int i4 = ShareDataUIState + 49;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = equals + 119;
        component4 = i % 128;
        int i2 = i % 2;
    }

    private final long component2(NetworkStatsManager networkStatsManager) {
        return ((Long) component1(new Object[]{this, networkStatsManager}, -1862807926, LinearTransformation.component1(), LinearTransformation.component1(), 1862807926, LinearTransformation.component1(), LinearTransformation.component1())).longValue();
    }

    private final long getAsAtTimestamp(NetworkStatsManager networkStatsManager) {
        return ((Long) component1(new Object[]{this, networkStatsManager}, 512763656, LinearTransformation.component1(), LinearTransformation.component1(), -512763655, LinearTransformation.component1(), LinearTransformation.component1())).longValue();
    }
}
