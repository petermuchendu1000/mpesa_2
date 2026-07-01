package com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCallWorker;
import com.safaricom.mpesa.logging.L;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u0011H\u0097@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCallWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "mtandaoCore", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lcom/huawei/digitalpayment/consumer/sfcui/profile/mtandao/mtandaocore/MtandaoCore;)V", "logType", "", "workerThread", "Landroid/os/HandlerThread;", "workerHandler", "Landroid/os/Handler;", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MtandaoCallWorker extends CoroutineWorker {
    public static final int $stable = 8;
    private static int copy = 0;
    private static int copydefault = 0;
    private static int equals = 81 % 128;
    private static int getRequestBeneficiariesState = 1;
    private final HandlerThread ShareDataUIState;
    private final MtandaoCore component1;
    private final Handler component2;
    private final String component3;

    public static final String access$getLogType$p(MtandaoCallWorker mtandaoCallWorker) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 117;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = mtandaoCallWorker.component3;
        int i5 = i2 + 97;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final MtandaoCore access$getMtandaoCore$p(MtandaoCallWorker mtandaoCallWorker) {
        int i = 2 % 2;
        int i2 = copy + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        MtandaoCore mtandaoCore = mtandaoCallWorker.component1;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 123;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return mtandaoCore;
    }

    public static final Handler access$getWorkerHandler$p(MtandaoCallWorker mtandaoCallWorker) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Handler handler = mtandaoCallWorker.component2;
        int i5 = i3 + 67;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public MtandaoCallWorker(@Assisted Context context, @Assisted WorkerParameters workerParameters, MtandaoCore mtandaoCore) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(workerParameters, "");
        Intrinsics.checkNotNullParameter(mtandaoCore, "");
        this.component1 = mtandaoCore;
        this.component3 = "Phonecall";
        HandlerThread handlerThread = new HandlerThread("TimedReadingsWorker");
        handlerThread.start();
        this.ShareDataUIState = handlerThread;
        this.component2 = new Handler(handlerThread.getLooper());
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCallWorker$doWork$2", f = "MtandaoCallWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (SPUtils.getInstance().getBoolean("MTANDAO_STATUS")) {
                int i2 = component3 + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                MtandaoCore mtandaoCoreAccess$getMtandaoCore$p = MtandaoCallWorker.access$getMtandaoCore$p(MtandaoCallWorker.this);
                Context applicationContext = MtandaoCallWorker.this.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                if (mtandaoCoreAccess$getMtandaoCore$p.canGetLocation(applicationContext)) {
                    MtandaoCore mtandaoCoreAccess$getMtandaoCore$p2 = MtandaoCallWorker.access$getMtandaoCore$p(MtandaoCallWorker.this);
                    Context applicationContext2 = MtandaoCallWorker.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                    mtandaoCoreAccess$getMtandaoCore$p2.acquireGps(applicationContext2);
                    Handler handlerAccess$getWorkerHandler$p = MtandaoCallWorker.access$getWorkerHandler$p(MtandaoCallWorker.this);
                    final MtandaoCallWorker mtandaoCallWorker = MtandaoCallWorker.this;
                    handlerAccess$getWorkerHandler$p.post(new Runnable() {
                        private static int component1 = 0;
                        private static int component3 = 1;

                        @Override
                        public final void run() {
                            int i4 = 2 % 2;
                            int i5 = component3 + 45;
                            component1 = i5 % 128;
                            int i6 = i5 % 2;
                            MtandaoCallWorker.ShareDataUIState.ShareDataUIState(mtandaoCallWorker);
                            int i7 = component1 + 35;
                            component3 = i7 % 128;
                            if (i7 % 2 != 0) {
                                return;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    });
                }
            }
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 81;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [com.huawei.digitalpayment.consumer.sfcui.profile.mtandao.mtandaocore.MtandaoCallWorker$doWork$2$1$timedTask$1] */
        private static final void component3(final MtandaoCallWorker mtandaoCallWorker) {
            int i = 2 % 2;
            MtandaoCore mtandaoCoreAccess$getMtandaoCore$p = MtandaoCallWorker.access$getMtandaoCore$p(mtandaoCallWorker);
            Context applicationContext = mtandaoCallWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            mtandaoCoreAccess$getMtandaoCore$p.getStaticReadings(applicationContext, false);
            final ?? r1 = new Runnable() {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;

                @Override
                public void run() throws NoSuchMethodException {
                    int i2 = 2 % 2;
                    int i3 = copydefault + 69;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    L.INSTANCE.d("CHECK 1", new Object[0]);
                    MtandaoCore mtandaoCoreAccess$getMtandaoCore$p2 = MtandaoCallWorker.access$getMtandaoCore$p(mtandaoCallWorker);
                    Context applicationContext2 = mtandaoCallWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
                    mtandaoCoreAccess$getMtandaoCore$p2.getTimedReadings(applicationContext2, MtandaoCallWorker.access$getLogType$p(mtandaoCallWorker));
                    MtandaoCallWorker.access$getWorkerHandler$p(mtandaoCallWorker).postDelayed(this, 2000L);
                    int i5 = ShareDataUIState + 1;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                }
            };
            MtandaoCallWorker.access$getWorkerHandler$p(mtandaoCallWorker).post((Runnable) r1);
            MtandaoCallWorker.access$getWorkerHandler$p(mtandaoCallWorker).postDelayed(new Runnable() {
                private static int component3 = 1;
                private static int copydefault;

                @Override
                public final void run() {
                    int i2 = 2 % 2;
                    int i3 = component3 + 77;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    MtandaoCallWorker.ShareDataUIState.ShareDataUIState(mtandaoCallWorker, r1);
                    int i5 = component3 + 41;
                    copydefault = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                }
            }, 20000L);
            int i2 = copydefault + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
        }

        private static final void copydefault(MtandaoCallWorker mtandaoCallWorker, MtandaoCallWorker$doWork$2$1$timedTask$1 mtandaoCallWorker$doWork$2$1$timedTask$1) {
            int i = 2 % 2;
            int i2 = copydefault + 41;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            L.INSTANCE.d("CHECK 2", new Object[0]);
            MtandaoCore mtandaoCoreAccess$getMtandaoCore$p = MtandaoCallWorker.access$getMtandaoCore$p(mtandaoCallWorker);
            Context applicationContext = mtandaoCallWorker.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            mtandaoCoreAccess$getMtandaoCore$p.stopGps(applicationContext);
            MtandaoCallWorker.access$getMtandaoCore$p(mtandaoCallWorker).insertLogsData(MtandaoCallWorker.access$getLogType$p(mtandaoCallWorker), "");
            MtandaoCallWorker.access$getWorkerHandler$p(mtandaoCallWorker).removeCallbacks(mtandaoCallWorker$doWork$2$1$timedTask$1);
            int i4 = component3 + 45;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        public static void ShareDataUIState(MtandaoCallWorker mtandaoCallWorker, MtandaoCallWorker$doWork$2$1$timedTask$1 mtandaoCallWorker$doWork$2$1$timedTask$1) {
            int i = 2 % 2;
            int i2 = component3 + 113;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(mtandaoCallWorker, mtandaoCallWorker$doWork$2$1$timedTask$1);
            int i4 = component3 + 69;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }

        public static void ShareDataUIState(MtandaoCallWorker mtandaoCallWorker) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3(mtandaoCallWorker);
            if (i3 == 0) {
                throw null;
            }
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = MtandaoCallWorker.this.new ShareDataUIState(continuation);
            int i2 = component3 + 117;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return shareDataUIState;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            if (i3 != 0) {
                int i4 = 57 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 47 / 0;
            }
            int i5 = copydefault + 25;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }
    }

    @Override
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new ShareDataUIState(null), 2, null);
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "");
        int i2 = copy + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return resultSuccess;
    }

    static {
        if (81 % 2 == 0) {
            throw null;
        }
    }
}
