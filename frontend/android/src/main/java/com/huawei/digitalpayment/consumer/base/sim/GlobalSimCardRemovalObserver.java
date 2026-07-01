package com.huawei.digitalpayment.consumer.base.sim;

import android.content.Context;
import android.content.IntentFilter;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.exthub.config.ExtHubMetaInfoParser;
import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.constants.BaseRoutePathConstants;
import com.huawei.digitalpayment.consumer.base.database.AppDatabase;
import com.huawei.digitalpayment.consumer.base.util.GsmHelper;
import com.huawei.digitalpayment.consumer.sfcui.requestmoney.ui.fragment.RequestMoneyRecordFragment;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@Singleton
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u000bH\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/huawei/digitalpayment/consumer/base/sim/GlobalSimCardRemovalObserver;", "", "context", "Landroid/content/Context;", "appDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "simCardRemovalManager", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "<init>", "(Landroid/content/Context;Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;)V", "TAG", "", ExtHubMetaInfoParser.KEY_EXTENSION_SCOPE_CLASS_NAME, "Lkotlinx/coroutines/CoroutineScope;", RequestMoneyRecordFragment.REQUEST_TYPE_RECEIVER, "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalReceiver;", "filter", "Landroid/content/IntentFilter;", "simSubscriptionIdChecker", "Lcom/huawei/digitalpayment/consumer/base/sim/SimSubscriptionIdChecker;", "observeSimState", "", "logout", "getExtraKey", "launchSimRemovedActivity", "ConsumerBaseUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GlobalSimCardRemovalObserver {
    private static int copy = 0;
    private static int equals = 1;
    private final AppDatabase ShareDataUIState;
    private final Context component1;
    private final String component2;
    private final SimCardRemovalReceiver component3;
    private final SimCardRemovalManager component4;
    private final IntentFilter copydefault;
    private final CoroutineScope getAsAtTimestamp;
    private final SimSubscriptionIdChecker getRequestBeneficiariesState;

    public static final AppDatabase access$getAppDatabase$p(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 125;
        equals = i3 % 128;
        int i4 = i3 % 2;
        AppDatabase appDatabase = globalSimCardRemovalObserver.ShareDataUIState;
        if (i4 == 0) {
            int i5 = 43 / 0;
        }
        int i6 = i2 + 117;
        equals = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 85 / 0;
        }
        return appDatabase;
    }

    public static final SimCardRemovalManager access$getSimCardRemovalManager$p(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 89;
        copy = i3 % 128;
        int i4 = i3 % 2;
        SimCardRemovalManager simCardRemovalManager = globalSimCardRemovalObserver.component4;
        int i5 = i2 + 25;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return simCardRemovalManager;
    }

    public static final SimSubscriptionIdChecker access$getSimSubscriptionIdChecker$p(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = copy + 115;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        SimSubscriptionIdChecker simSubscriptionIdChecker = globalSimCardRemovalObserver.getRequestBeneficiariesState;
        int i5 = i3 + 107;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return simSubscriptionIdChecker;
    }

    public static final String access$getTAG$p(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = equals + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = globalSimCardRemovalObserver.component2;
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        return str;
    }

    public static final void access$launchSimRemovedActivity(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = equals + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        globalSimCardRemovalObserver.component1();
        int i4 = equals + 25;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$logout(GlobalSimCardRemovalObserver globalSimCardRemovalObserver) {
        int i = 2 % 2;
        int i2 = equals + 53;
        copy = i2 % 128;
        int i3 = i2 % 2;
        globalSimCardRemovalObserver.component3();
        int i4 = copy + 33;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Inject
    public GlobalSimCardRemovalObserver(@ApplicationContext Context context, AppDatabase appDatabase, SimCardRemovalManager simCardRemovalManager) {
        String str = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appDatabase, "");
        Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
        this.component1 = context;
        this.ShareDataUIState = appDatabase;
        this.component4 = simCardRemovalManager;
        String simpleName = Reflection.getOrCreateKotlinClass(GlobalSimCardRemovalObserver.class).getSimpleName();
        if (simpleName == null) {
            int i = equals + 117;
            copy = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
        } else {
            str = simpleName;
        }
        this.component2 = str;
        this.getAsAtTimestamp = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
        SimCardRemovalReceiver simCardRemovalReceiver = new SimCardRemovalReceiver();
        this.component3 = simCardRemovalReceiver;
        IntentFilter intentFilter = new IntentFilter(SimCardRemovalReceiver.ACTION_SIM_STATE_CHANGED);
        this.copydefault = intentFilter;
        this.getRequestBeneficiariesState = new SimSubscriptionIdChecker(context);
        context.registerReceiver(simCardRemovalReceiver, intentFilter);
        copydefault();
        int i4 = equals + 31;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver$observeSimState$1", f = "GlobalSimCardRemovalObserver.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component3 + 119;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                StateFlow<SimCardRemovalState> simCardRemovalState = GlobalSimCardRemovalObserver.access$getSimCardRemovalManager$p(GlobalSimCardRemovalObserver.this).getSimCardRemovalState();
                final GlobalSimCardRemovalObserver globalSimCardRemovalObserver = GlobalSimCardRemovalObserver.this;
                this.component2 = 1;
                if (simCardRemovalState.collect(new FlowCollector() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = component1 + 61;
                        copydefault = i6 % 128;
                        int i7 = i6 % 2;
                        Object objComponent1 = component1((SimCardRemovalState) obj2, continuation);
                        int i8 = copydefault + 123;
                        component1 = i8 % 128;
                        if (i8 % 2 == 0) {
                            return objComponent1;
                        }
                        throw null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object component1(com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                        /*
                            r4 = this;
                            r6 = 2
                            int r0 = r6 % r6
                            int r0 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.copydefault
                            int r0 = r0 + 47
                            int r1 = r0 % 128
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.component1 = r1
                            int r0 = r0 % r6
                            boolean r5 = r5.isSimRemoved()
                            if (r5 == 0) goto L85
                            int r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.copydefault
                            int r5 = r5 + 113
                            int r0 = r5 % 128
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.component1 = r0
                            int r5 = r5 % r6
                            r0 = 0
                            if (r5 == 0) goto L2e
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r5 = r1
                            com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$getSimSubscriptionIdChecker$p(r5)
                            boolean r5 = r5.checkIfUserHasEnabledThisFeature()
                            r1 = 60
                            int r1 = r1 / r0
                            if (r5 != 0) goto L5c
                            goto L3b
                        L2e:
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r5 = r1
                            com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$getSimSubscriptionIdChecker$p(r5)
                            boolean r5 = r5.checkIfUserHasEnabledThisFeature()
                            if (r5 == 0) goto L3b
                            goto L5c
                        L3b:
                            com.safaricom.mpesa.logging.L r5 = com.safaricom.mpesa.logging.L.INSTANCE
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r1 = r1
                            java.lang.String r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$getTAG$p(r1)
                            java.lang.String r2 = "SIM Subscription not enabled, LOGOUT Anyway"
                            java.lang.Object[] r3 = new java.lang.Object[r0]
                            r5.d(r1, r2, r3)
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r5 = r1
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$logout(r5)
                            int r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.component1
                            int r5 = r5 + 75
                            int r1 = r5 % 128
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.copydefault = r1
                            int r5 = r5 % r6
                            if (r5 != 0) goto L5c
                            r5 = 3
                            int r5 = r5 % r6
                        L5c:
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r5 = r1
                            com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$getSimSubscriptionIdChecker$p(r5)
                            boolean r5 = r5.checkIfSavedSimCardWasRemoved()
                            if (r5 == 0) goto L77
                            com.safaricom.mpesa.logging.L r5 = com.safaricom.mpesa.logging.L.INSTANCE
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r1 = r1
                            java.lang.String r1 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$getTAG$p(r1)
                            java.lang.String r2 = "SIM Subscription Checker, SIM WAS REMOVED"
                            java.lang.Object[] r0 = new java.lang.Object[r0]
                            r5.d(r1, r2, r0)
                        L77:
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver r5 = r1
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.access$launchSimRemovedActivity(r5)
                            int r5 = com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.component1
                            int r5 = r5 + 123
                            int r0 = r5 % 128
                            com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.copydefault = r0
                            int r5 = r5 % r6
                        L85:
                            kotlin.Unit r5 = kotlin.Unit.INSTANCE
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver.component1.AnonymousClass3.component1(com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    int i5 = component3 + 3;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = GlobalSimCardRemovalObserver.this.new component1(continuation);
            int i2 = ShareDataUIState + 13;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 71;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = ShareDataUIState + 11;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 71;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private final void copydefault() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(this.getAsAtTimestamp, null, null, new component1(null), 3, null);
        int i2 = copy + 101;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.base.sim.GlobalSimCardRemovalObserver$logout$1", f = "GlobalSimCardRemovalObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int component3;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 5;
            component2 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = component2 + 73;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.throwOnFailure(obj);
            if (i4 == 0) {
                GlobalSimCardRemovalObserver.access$getAppDatabase$p(GlobalSimCardRemovalObserver.this).clearAllTables();
                return Unit.INSTANCE;
            }
            GlobalSimCardRemovalObserver.access$getAppDatabase$p(GlobalSimCardRemovalObserver.this).clearAllTables();
            Unit unit = Unit.INSTANCE;
            obj2.hashCode();
            throw null;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = GlobalSimCardRemovalObserver.this.new component2(continuation);
            int i2 = component3 + 111;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component3 + 55;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 5;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 53 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = equals + 69;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            BiometricHelper2.getInstance().closeFingerprintLogin();
            if (GsmHelper.INSTANCE.isGsmLogin()) {
                int i3 = copy + 109;
                equals = i3 % 128;
                int i4 = i3 % 2;
                GsmHelper.INSTANCE.setGsmLogin(false);
                int i5 = copy + 77;
                equals = i5 % 128;
                int i6 = i5 % 2;
            }
            SPUtils.getInstance().put("recent_login_phone_number", "");
            SPUtils.getInstance().put(SIM_DEFAULTS.PREF_SUBSCRIPTION_ID, -1);
            SPUtils.getInstance(BiometricConstants.BIOMETRIC_SP_NAME).put(component2() + "_showBiometricDialog", false);
            UserLifecycleManager.get().logout(Utils.getApp());
            onSubMenuSelected.ShareDataUIState(this.getAsAtTimestamp, Dispatchers.getIO(), null, new component2(null), 2, null);
            return;
        }
        BiometricHelper2.getInstance().closeFingerprintLogin();
        GsmHelper.INSTANCE.isGsmLogin();
        throw null;
    }

    private final String component2() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = copy + 87;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 19 / 0;
        }
        return str;
    }

    private final void component1() {
        int i = 2 % 2;
        int i2 = equals + 33;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute(ActivityUtils.getTopActivity(), BaseRoutePathConstants.SIM_CARD_REMOVED, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            ActivityUtils.finishAllActivities();
            int i3 = equals + 115;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        RouteUtils.routeWithExecute(ActivityUtils.getTopActivity(), BaseRoutePathConstants.SIM_CARD_REMOVED, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        ActivityUtils.finishAllActivities();
        throw null;
    }
}
