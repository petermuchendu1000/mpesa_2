package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.huawei.digitalpayment.consumer.base.util.PhoneDataSender;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData;
import com.safaricom.mpesa.logging.L;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B5\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u0015H\u0097@¢\u0006\u0002\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "phoneDataSender", "Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;", "connectionLiveData", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;", "mtandaoCore", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/huawei/digitalpayment/consumer/base/util/PhoneDataSender;Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/utils/ConnectionLiveData;Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;)V", "logType", "", "workerThread", "Landroid/os/HandlerThread;", "workerHandler", "Landroid/os/Handler;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MtandaoWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private static int component4 = 0;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final MtandaoCore ShareDataUIState;
    private final PhoneDataSender component1;
    private final ConnectionLiveData component2;
    private final Handler component3;
    private final String copydefault;
    private final HandlerThread equals;

    public static final ConnectionLiveData access$getConnectionLiveData$p(MtandaoWorker mtandaoWorker) {
        int i = 2 % 2;
        int i2 = component4 + 57;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        ConnectionLiveData connectionLiveData = mtandaoWorker.component2;
        int i5 = i3 + 3;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return connectionLiveData;
    }

    public static final String access$getLogType$p(MtandaoWorker mtandaoWorker) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 11;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String str = mtandaoWorker.copydefault;
        if (i3 == 0) {
            return str;
        }
        throw null;
    }

    public static final MtandaoCore access$getMtandaoCore$p(MtandaoWorker mtandaoWorker) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 3;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MtandaoCore mtandaoCore = mtandaoWorker.ShareDataUIState;
        int i5 = i2 + 123;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return mtandaoCore;
    }

    public static final PhoneDataSender access$getPhoneDataSender$p(MtandaoWorker mtandaoWorker) {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 9;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        PhoneDataSender phoneDataSender = mtandaoWorker.component1;
        int i5 = i2 + 47;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return phoneDataSender;
    }

    public static final Handler access$getWorkerHandler$p(MtandaoWorker mtandaoWorker) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 99;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        Handler handler = mtandaoWorker.component3;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 73;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public MtandaoWorker(@Assisted Context context, @Assisted WorkerParameters workerParameters, PhoneDataSender phoneDataSender, ConnectionLiveData connectionLiveData, MtandaoCore mtandaoCore) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(phoneDataSender, "");
        Intrinsics.checkNotNullParameter(connectionLiveData, "");
        Intrinsics.checkNotNullParameter(mtandaoCore, "");
        this.component1 = phoneDataSender;
        this.component2 = connectionLiveData;
        this.ShareDataUIState = mtandaoCore;
        this.copydefault = "Background";
        HandlerThread handlerThread = new HandlerThread("BackgroundWorker");
        handlerThread.start();
        this.equals = handlerThread;
        this.component3 = new Handler(handlerThread.getLooper());
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker$doWork$2", f = "MtandaoWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        int component3;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.copydefault
                int r1 = r1 + 97
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 != 0) goto Lae
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.component3
                if (r1 != 0) goto La6
                kotlin.ResultKt.throwOnFailure(r4)
                com.huawei.common.util.SPUtils r4 = com.huawei.common.util.SPUtils.getInstance()
                java.lang.String r1 = "MTANDAO_STATUS"
                boolean r4 = r4.getBoolean(r1)
                r1 = 1
                if (r4 == r1) goto L27
                goto La3
            L27:
                int r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.ShareDataUIState
                int r4 = r4 + 15
                int r2 = r4 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.copydefault = r2
                int r4 = r4 % r0
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getConnectionLiveData$p(r4)
                java.lang.Boolean r4 = r4.isDataOn()
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r2)
                if (r4 != 0) goto L61
                int r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.ShareDataUIState
                int r4 = r4 + 51
                int r2 = r4 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.copydefault = r2
                int r4 = r4 % r0
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.utils.ConnectionLiveData r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getConnectionLiveData$p(r4)
                java.lang.Boolean r4 = r4.isWifiOn()
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r1)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                if (r4 == 0) goto L6a
            L61:
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                com.huawei.digitalpayment.consumer.base.util.PhoneDataSender r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getPhoneDataSender$p(r4)
                r4.sendMetrics()
            L6a:
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCore r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getMtandaoCore$p(r4)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                android.content.Context r0 = r0.getApplicationContext()
                java.lang.String r1 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                boolean r4 = r4.canGetLocation(r0)
                if (r4 == 0) goto La3
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCore r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getMtandaoCore$p(r4)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r0 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                android.content.Context r0 = r0.getApplicationContext()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
                r4.acquireGps(r0)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                android.os.Handler r4 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.access$getWorkerHandler$p(r4)
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker$doWork$2$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker$doWork$2$$ExternalSyntheticLambda0
                com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker r1 = com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.this
                r0.<init>()
                r4.post(r0)
            La3:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            La6:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            Lae:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                r4 = 0
                r4.hashCode()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker.component2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoWorker$doWork$2$1$timedTask$1] */
        private static final void copydefault(final MtandaoWorker mtandaoWorker) {
            int i = 2 % 2;
            MtandaoCore mtandaoCoreAccess$getMtandaoCore$p = MtandaoWorker.access$getMtandaoCore$p(mtandaoWorker);
            Context applicationContext = mtandaoWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            mtandaoCoreAccess$getMtandaoCore$p.getStaticReadings(applicationContext, false);
            final ?? r1 = new Runnable() {
                private static int component2 = 1;
                private static int component3;

                @Override
                public void run() throws NoSuchMethodException {
                    int i2 = 2 % 2;
                    int i3 = component2 + 103;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    L.INSTANCE.d("CHECK 1", new Object[0]);
                    MtandaoCore mtandaoCoreAccess$getMtandaoCore$p2 = MtandaoWorker.access$getMtandaoCore$p(mtandaoWorker);
                    Context applicationContext2 = mtandaoWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                    mtandaoCoreAccess$getMtandaoCore$p2.getTimedReadings(applicationContext2, MtandaoWorker.access$getLogType$p(mtandaoWorker));
                    MtandaoWorker.access$getWorkerHandler$p(mtandaoWorker).postDelayed(this, 2000L);
                    int i5 = component2 + 1;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                }
            };
            MtandaoWorker.access$getWorkerHandler$p(mtandaoWorker).post((Runnable) r1);
            MtandaoWorker.access$getWorkerHandler$p(mtandaoWorker).postDelayed(new Runnable() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = component2 + 55;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    MtandaoWorker.component2.ShareDataUIState(mtandaoWorker, r1);
                    int i5 = component1 + 89;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                }
            }, 20000L);
            int i2 = ShareDataUIState + 109;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final void copydefault(MtandaoWorker mtandaoWorker, MtandaoWorker$doWork$2$1$timedTask$1 mtandaoWorker$doWork$2$1$timedTask$1) {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            L.INSTANCE.d("CHECK 2", new Object[0]);
            MtandaoCore mtandaoCoreAccess$getMtandaoCore$p = MtandaoWorker.access$getMtandaoCore$p(mtandaoWorker);
            Context applicationContext = mtandaoWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            mtandaoCoreAccess$getMtandaoCore$p.stopGps(applicationContext);
            MtandaoWorker.access$getMtandaoCore$p(mtandaoWorker).insertLogsData(MtandaoWorker.access$getLogType$p(mtandaoWorker), "");
            MtandaoWorker.access$getWorkerHandler$p(mtandaoWorker).removeCallbacks(mtandaoWorker$doWork$2$1$timedTask$1);
            int i4 = ShareDataUIState + 43;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static void ShareDataUIState(MtandaoWorker mtandaoWorker, MtandaoWorker$doWork$2$1$timedTask$1 mtandaoWorker$doWork$2$1$timedTask$1) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(mtandaoWorker, mtandaoWorker$doWork$2$1$timedTask$1);
            int i4 = ShareDataUIState + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void ShareDataUIState(MtandaoWorker mtandaoWorker) {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            copydefault(mtandaoWorker);
            int i4 = copydefault + 117;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = MtandaoWorker.this.new component2(continuation);
            int i2 = ShareDataUIState + 3;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 85;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = copydefault + 29;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return component2Var.invokeSuspend(unit);
            }
            component2Var.invokeSuspend(unit);
            throw null;
        }
    }

    @Override
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new component2(null), 2, null);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        int i2 = getRequestBeneficiariesState + 33;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        return resultSuccess;
    }

    static {
        int i = 1 + 77;
        copy = i % 128;
        int i2 = i % 2;
    }
}
