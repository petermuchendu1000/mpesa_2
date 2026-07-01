package com.huawei.digitalpayment.consumer.home.ui.viewmodel;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao;
import com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.BalancesResponse;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.resp.LocalFulizaBance;
import com.huawei.digitalpayment.consumer.base.resp.LocalMpesaFulizaBalance;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.FulizaStatusUtil;
import com.huawei.digitalpayment.consumer.base.util.GsmHelper;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.BalanceMappersKt;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.GsmBalancesUiState;
import com.huawei.digitalpayment.consumer.home.ui.homebalancesection.MpesaBalanceUiState;
import com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel;
import com.huawei.digitalpayment.home.data.local.LocalBalance;
import com.huawei.digitalpayment.home.util.BalanceHelper;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getSmallIconId;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.notify;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\u001f\u001a\u00020\u001bJ\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0017J\u000e\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/huawei/digitalpayment/consumer/home/ui/viewmodel/BalancesViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "gsmBalancesCacheDao", "Lcom/huawei/digitalpayment/consumer/base/database/daos/GsmBalancesCacheDao;", "<init>", "(Lcom/huawei/digitalpayment/consumer/base/database/daos/GsmBalancesCacheDao;)V", "data", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huawei/payment/mvvm/Resource;", "", "_gsmBalancesUiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/GsmBalancesUiState;", "gsmBalancesUiState", "Lkotlinx/coroutines/flow/StateFlow;", "getGsmBalancesUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_mpesaBalanceUiState", "Lcom/huawei/digitalpayment/consumer/home/ui/homebalancesection/MpesaBalanceUiState;", "mpesaBalanceUiState", "getMpesaBalanceUiState", "balanceWrapper", "Lcom/huawei/digitalpayment/consumer/base/resp/LocalMpesaFulizaBalance;", "isGsmLogin", "", "observeBalanceUpdates", "", "observeCachedBalances", "getCachedMsisdn", "", "getBalances", "updateGsmBalances", "balanceResponse", "Lcom/huawei/digitalpayment/consumer/base/resp/BalancesResponse;", "updateMpesaBalance", "balance", "toggleBalanceVisibility", "isVisible", "ConsumerHomeUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BalancesViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 1;
    private static int copy = 1;
    private static int equals;
    private static int getAsAtTimestamp;
    private final MutableStateFlow<GsmBalancesUiState> ShareDataUIState;
    private LocalMpesaFulizaBalance component1;
    private final MutableStateFlow<MpesaBalanceUiState> component2;
    private final GsmBalancesCacheDao component3;
    private final StateFlow<GsmBalancesUiState> component4;
    private final MutableLiveData<Resource<Object>> copydefault;
    private final StateFlow<MpesaBalanceUiState> getRequestBeneficiariesState;

    public static final LocalMpesaFulizaBalance access$getBalanceWrapper$p(BalancesViewModel balancesViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 105;
        copy = i3 % 128;
        int i4 = i3 % 2;
        LocalMpesaFulizaBalance localMpesaFulizaBalance = balancesViewModel.component1;
        int i5 = i2 + 41;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return localMpesaFulizaBalance;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final String access$getCachedMsisdn(BalancesViewModel balancesViewModel) {
        int i = 2 % 2;
        int i2 = copy + 111;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        String strComponent2 = balancesViewModel.component2();
        int i4 = copy + 47;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return strComponent2;
    }

    public static final MutableLiveData access$getData$p(BalancesViewModel balancesViewModel) {
        int i = 2 % 2;
        int i2 = copy + 9;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableLiveData<Resource<Object>> mutableLiveData = balancesViewModel.copydefault;
        if (i3 == 0) {
            return mutableLiveData;
        }
        throw null;
    }

    public static final GsmBalancesCacheDao access$getGsmBalancesCacheDao$p(BalancesViewModel balancesViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp;
        int i3 = i2 + 3;
        copy = i3 % 128;
        int i4 = i3 % 2;
        GsmBalancesCacheDao gsmBalancesCacheDao = balancesViewModel.component3;
        if (i4 == 0) {
            int i5 = 64 / 0;
        }
        int i6 = i2 + 23;
        copy = i6 % 128;
        if (i6 % 2 != 0) {
            return gsmBalancesCacheDao;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_gsmBalancesUiState$p(BalancesViewModel balancesViewModel) {
        int i = 2 % 2;
        int i2 = copy + 113;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        MutableStateFlow<GsmBalancesUiState> mutableStateFlow = balancesViewModel.ShareDataUIState;
        int i5 = i3 + 87;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 72 / 0;
        }
        return mutableStateFlow;
    }

    public static final void access$setBalanceWrapper$p(BalancesViewModel balancesViewModel, LocalMpesaFulizaBalance localMpesaFulizaBalance) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        balancesViewModel.component1 = localMpesaFulizaBalance;
        int i5 = i3 + 29;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$updateGsmBalances(BalancesViewModel balancesViewModel, BalancesResponse balancesResponse) {
        int i = 2 % 2;
        int i2 = copy + 7;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        balancesViewModel.component2(balancesResponse);
        int i4 = copy + 93;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public BalancesViewModel(GsmBalancesCacheDao gsmBalancesCacheDao) {
        Intrinsics.checkNotNullParameter(gsmBalancesCacheDao, "");
        this.component3 = gsmBalancesCacheDao;
        this.copydefault = new MutableLiveData<>();
        int i = 3;
        MutableStateFlow<GsmBalancesUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new GsmBalancesUiState(null, false, i, 0 == true ? 1 : 0));
        this.ShareDataUIState = MutableStateFlow;
        this.component4 = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<MpesaBalanceUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new MpesaBalanceUiState(null, null, false, false, false, false, null, false, 255, null));
        this.component2 = MutableStateFlow2;
        this.getRequestBeneficiariesState = FlowKt.asStateFlow(MutableStateFlow2);
        this.component1 = new LocalMpesaFulizaBalance(new LocalBalance(0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 15, null), new LocalFulizaBance(0 == true ? 1 : 0, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
        ShareDataUIState();
        getBalances();
        observeBalanceUpdates();
    }

    public final StateFlow<GsmBalancesUiState> getGsmBalancesUiState() {
        int i = 2 % 2;
        int i2 = copy + 3;
        int i3 = i2 % 128;
        getAsAtTimestamp = i3;
        int i4 = i2 % 2;
        StateFlow<GsmBalancesUiState> stateFlow = this.component4;
        int i5 = i3 + 103;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<MpesaBalanceUiState> getMpesaBalanceUiState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            return this.getRequestBeneficiariesState;
        }
        throw null;
    }

    public final boolean isGsmLogin() {
        int i = 2 % 2;
        int i2 = copy + 75;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            GsmHelper.INSTANCE.isGsmLogin();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zIsGsmLogin = GsmHelper.INSTANCE.isGsmLogin();
        int i3 = copy + 5;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        return zIsGsmLogin;
    }

    public final void observeBalanceUpdates() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(null), 3, null);
        int i2 = copy + 103;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel$observeBalanceUpdates$1", f = "BalancesViewModel.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int component3;
        int component1;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "Lcom/huawei/digitalpayment/consumer/base/resp/LocalMpesaFulizaBalance;", "balance", "Lcom/huawei/digitalpayment/home/data/local/LocalBalance;", "fuliza", "Lcom/huawei/digitalpayment/consumer/base/resp/LocalFulizaBance;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel$observeBalanceUpdates$1$1", f = "BalancesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function3<LocalBalance, LocalFulizaBance, Continuation<? super LocalMpesaFulizaBalance>, Object> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            Object component1;
            int component3;
            Object copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 3;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component3 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LocalMpesaFulizaBalance localMpesaFulizaBalance = new LocalMpesaFulizaBalance((LocalBalance) this.copydefault, (LocalFulizaBance) this.component1);
                int i4 = component2 + 57;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return localMpesaFulizaBalance;
            }

            AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
                super(3, continuation);
            }

            public final Object ShareDataUIState(LocalBalance localBalance, LocalFulizaBance localFulizaBance, Continuation<? super LocalMpesaFulizaBalance> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(continuation);
                anonymousClass5.copydefault = localBalance;
                anonymousClass5.component1 = localFulizaBance;
                Object objInvokeSuspend = anonymousClass5.invokeSuspend(Unit.INSTANCE);
                int i2 = ShareDataUIState + 3;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return objInvokeSuspend;
            }

            @Override
            public Object invoke(LocalBalance localBalance, LocalFulizaBance localFulizaBance, Continuation<? super LocalMpesaFulizaBalance> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 25;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(localBalance, localFulizaBance, continuation);
                if (i3 == 0) {
                    int i4 = 46 / 0;
                }
                int i5 = component2 + 47;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return objShareDataUIState;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            Object obj2 = null;
            if (i4 != 0) {
                int i5 = component3 + 69;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(BalanceHelper.INSTANCE.getBalance2(), FulizaStatusUtil.INSTANCE.getFulizaBalance(), new AnonymousClass5(null));
                final BalancesViewModel balancesViewModel = BalancesViewModel.this;
                this.component1 = 1;
                if (flowCombine.collect(new FlowCollector() {
                    private static int component1 = 1;
                    private static int component2;

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i7 = 2 % 2;
                        int i8 = component2 + 31;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        Object objComponent1 = component1((LocalMpesaFulizaBalance) obj3, continuation);
                        int i10 = component2 + 71;
                        component1 = i10 % 128;
                        if (i10 % 2 != 0) {
                            return objComponent1;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object component1(LocalMpesaFulizaBalance localMpesaFulizaBalance, Continuation<? super Unit> continuation) {
                        int i7 = 2 % 2;
                        int i8 = component1 + 115;
                        component2 = i8 % 128;
                        Object obj3 = null;
                        if (i8 % 2 != 0) {
                            GsmHelper.INSTANCE.isGsmLogin();
                            throw null;
                        }
                        if (!GsmHelper.INSTANCE.isGsmLogin()) {
                            BalancesViewModel.access$setBalanceWrapper$p(balancesViewModel, localMpesaFulizaBalance);
                            BalancesViewModel balancesViewModel2 = balancesViewModel;
                            balancesViewModel2.updateMpesaBalance(BalancesViewModel.access$getBalanceWrapper$p(balancesViewModel2));
                        }
                        Unit unit = Unit.INSTANCE;
                        int i9 = component2 + 3;
                        component1 = i9 % 128;
                        if (i9 % 2 != 0) {
                            return unit;
                        }
                        obj3.hashCode();
                        throw null;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i7 = component3 + 99;
            component2 = i7 % 128;
            if (i7 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = BalancesViewModel.this.new component3(continuation);
            int i2 = component2 + 53;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 45 / 0;
            }
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            component2 = i2 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = component3 + 125;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                return objComponent1;
            }
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 2 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(component2(), null), 3, null);
        int i2 = getAsAtTimestamp + 125;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel$observeCachedBalances$1", f = "BalancesViewModel.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component2 = 1;
        int ShareDataUIState;
        final String component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            component2 = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.ShareDataUIState;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<List<GsmBalancesCacheEntity>> flowObserveByMsisdn = BalancesViewModel.access$getGsmBalancesCacheDao$p(BalancesViewModel.this).observeByMsisdn(this.component3);
                final BalancesViewModel balancesViewModel = BalancesViewModel.this;
                this.ShareDataUIState = 1;
                if (flowObserveByMsisdn.collect(new FlowCollector() {
                    private static short[] copy;
                    private static final byte[] $$a = {69, 81, 99, -123};
                    private static final int $$b = 72;
                    private static int $10 = 0;
                    private static int $11 = 1;
                    private static int getRequestBeneficiariesState = 0;
                    private static int component4 = 1;
                    private static long ShareDataUIState = -6452022466070794946L;
                    private static int component3 = 281657103;
                    private static int component1 = -238323929;
                    private static int component2 = -832931422;
                    private static byte[] equals = {-112, -22, -124, -123, -106, -122, -108, -71, -69, -101, -32, -50, -79, -19, -101, -32, 46, 81, -59, -105, -20, -73, -88, -42, -122, -112, -108, -18, -119, -19, -23, 70, -43, -76, -16, -74, -108, 34, Ascii.ETB, 63, 96, 34, 13, Ascii.EM, Ascii.ETB, 63, 111, 57, TarHeader.LF_CHR, Ascii.SO, 117, 36, Ascii.ETB, -48, 1, -39, TarHeader.LF_SYMLINK, -48, 43, 63, 1, -39, 9, -33, -59, -44, -27, 4, 0, -123, 77, -39, -36, TarHeader.LF_BLK, -39, Ascii.SO, -45, -56, Ascii.GS, 10, 13, 0, -47, 9, -48, TarHeader.LF_BLK, 101, -40, Ascii.EM, 111, 39, Ascii.ETB, TarHeader.LF_DIR, 59, Ascii.FF, 65, 62, 111, -22, -35, -122, -39, -45, -5, 43, -19, -25, -14, -121, 34, -34, -89, Ascii.US, -5, -22, -46, -5, -48, -31, -106, 47, -36, -33, -34, -29, 43, -18, -6, -65, -115, -31, -97, -65, -29, -118, -78, 66, 70, -2, 84, 71, 94, -28, -12, 86, -5, -1, 70, -8, -16, 71, 72, -89, 80, 63, 71, 72, 71, -80, TarHeader.LF_NORMAL, SignedBytes.MAX_POWER_OF_TWO, 78, -14, -8, 87, -5, -9, 0, -120, -18, 80, -14, 1, -44, Ascii.FS, 60, 0, 4, 100, -12, Ascii.SUB, 45, 56, 111, TarHeader.LF_NORMAL, -63, 124, 1, Ascii.ESC, -57, 99, Ascii.ESC, 62, -36, 9, TarHeader.LF_DIR, -52, 10, TarHeader.LF_SYMLINK, -51, -38, -19, 105, 62, -36, 56, -38, TarHeader.LF_NORMAL, -58, 9, -69, Ascii.EM, -76, -80, 9, -73, -65, 8, 7, 104, 0, 3, -79, 87, 96, -16, 8, 7, 8, 127, -1, Ascii.SI, 1, -67, -73, Ascii.CAN, -76, -72, -49, 71, -95, Ascii.US, -67, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41, 41};

                    private static String $$c(int i4, byte b2, int i5) {
                        int i6 = i4 + 102;
                        byte[] bArr = $$a;
                        int i7 = i5 + 4;
                        int i8 = b2 * 4;
                        byte[] bArr2 = new byte[1 - i8];
                        int i9 = 0 - i8;
                        int i10 = -1;
                        if (bArr == null) {
                            int i11 = i7 + i9;
                            i7 = i7;
                            i6 = i11;
                        }
                        while (true) {
                            i10++;
                            int i12 = i7 + 1;
                            bArr2[i10] = (byte) i6;
                            if (i10 == i9) {
                                return new String(bArr2, 0);
                            }
                            i7 = i12;
                            i6 += bArr[i12];
                        }
                    }

                    private static void a(int i4, char[] cArr, Object[] objArr) throws Throwable {
                        int i5 = 2 % 2;
                        notify notifyVar = new notify();
                        notifyVar.component3 = i4;
                        int length = cArr.length;
                        long[] jArr = new long[length];
                        notifyVar.copydefault = 0;
                        int i6 = $10 + 31;
                        $11 = i6 % 128;
                        int i7 = i6 % 2;
                        while (notifyVar.copydefault < cArr.length) {
                            int i8 = $10 + 113;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            int i10 = notifyVar.copydefault;
                            try {
                                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                                if (objCopydefault == null) {
                                    byte b2 = (byte) 0;
                                    byte b3 = b2;
                                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.makeMeasureSpec(0, 0) + 3266, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 32, (char) (60268 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -834797019, false, $$c(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                                }
                                jArr[i10] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (ShareDataUIState ^ 5431355972723572778L);
                                Object[] objArr3 = {notifyVar, notifyVar};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                if (objCopydefault2 == null) {
                                    byte b4 = (byte) 3;
                                    byte b5 = (byte) (b4 - 3);
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 688, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 34, (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60373), -1969106284, false, $$c(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault2).invoke(null, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        char[] cArr2 = new char[length];
                        notifyVar.copydefault = 0;
                        while (notifyVar.copydefault < cArr.length) {
                            int i11 = $11 + 97;
                            $10 = i11 % 128;
                            if (i11 % 2 != 0) {
                                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                                try {
                                    Object[] objArr4 = {notifyVar, notifyVar};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                    if (objCopydefault3 == null) {
                                        byte b6 = (byte) 3;
                                        byte b7 = (byte) (b6 - 3);
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(687 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 34 - (ViewConfiguration.getScrollBarSize() >> 8), (char) (60373 - Color.red(0)), -1969106284, false, $$c(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objCopydefault3).invoke(null, objArr4);
                                    int i12 = 10 / 0;
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else {
                                cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
                                Object[] objArr5 = {notifyVar, notifyVar};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                                if (objCopydefault4 == null) {
                                    byte b8 = (byte) 3;
                                    byte b9 = (byte) (b8 - 3);
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 687, 33 - ImageFormat.getBitsPerPixel(0), (char) (View.resolveSizeAndState(0, 0, 0) + 60373), -1969106284, false, $$c(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                                }
                                ((Method) objCopydefault4).invoke(null, objArr5);
                            }
                        }
                        objArr[0] = new String(cArr2);
                    }

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component4 + 37;
                        getRequestBeneficiariesState = i5 % 128;
                        Object obj4 = null;
                        List<GsmBalancesCacheEntity> list = (List) obj3;
                        if (i5 % 2 != 0) {
                            component1(list, continuation);
                            obj4.hashCode();
                            throw null;
                        }
                        Object objComponent1 = component1(list, continuation);
                        int i6 = getRequestBeneficiariesState + 47;
                        component4 = i6 % 128;
                        if (i6 % 2 != 0) {
                            return objComponent1;
                        }
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object component1(List<GsmBalancesCacheEntity> list, Continuation<? super Unit> continuation) {
                        int i4 = 2;
                        int i5 = 2 % 2;
                        List<GsmBalancesCacheEntity> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator<T> it = list2.iterator();
                        int i6 = getRequestBeneficiariesState + 63;
                        component4 = i6 % 128;
                        int i7 = i6 % 2;
                        while (it.hasNext()) {
                            arrayList.add(GsmBalancesCacheMappersKt.toUsageConsumptionDetailsUIModel((GsmBalancesCacheEntity) it.next()));
                        }
                        ArrayList arrayList2 = arrayList;
                        if (!arrayList2.isEmpty()) {
                            BalancesViewModel.access$get_gsmBalancesUiState$p(balancesViewModel).setValue(new GsmBalancesUiState(arrayList2, false, i4, null));
                        }
                        Unit unit = Unit.INSTANCE;
                        int i8 = component4 + 109;
                        getRequestBeneficiariesState = i8 % 128;
                        int i9 = i8 % 2;
                        return unit;
                    }

                    private static void b(int i4, byte b2, int i5, short s, int i6, Object[] objArr) throws Throwable {
                        long j;
                        boolean z;
                        int i7 = 2 % 2;
                        getSmallIconId getsmalliconid = new getSmallIconId();
                        StringBuilder sb = new StringBuilder();
                        try {
                            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(component1)};
                            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                            long j2 = 0;
                            if (objCopydefault == null) {
                                byte b3 = (byte) 0;
                                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 998, 31 - KeyEvent.getDeadChar(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 61685), 1874745193, false, $$c((byte) 11, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                            int i8 = iIntValue == -1 ? 1 : 0;
                            if (i8 == 0) {
                                j = 7083766810336261929L;
                            } else {
                                byte[] bArr = equals;
                                if (bArr != null) {
                                    int i9 = $11 + 83;
                                    $10 = i9 % 128;
                                    int i10 = i9 % 2;
                                    int length = bArr.length;
                                    byte[] bArr2 = new byte[length];
                                    int i11 = 0;
                                    while (i11 < length) {
                                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                        if (objCopydefault2 == null) {
                                            byte b4 = (byte) 0;
                                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 47, (char) ((ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + 54461), -1178636483, false, $$c((byte) 14, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                                        }
                                        bArr2[i11] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                        i11++;
                                        j2 = 0;
                                    }
                                    bArr = bArr2;
                                }
                                if (bArr != null) {
                                    int i12 = $11 + 47;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    byte[] bArr3 = equals;
                                    Object[] objArr4 = {Integer.valueOf(i5), Integer.valueOf(component3)};
                                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                                    if (objCopydefault3 == null) {
                                        byte b5 = (byte) 0;
                                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(999 - (ViewConfiguration.getEdgeSlop() >> 16), 31 - KeyEvent.keyCodeFromString(""), (char) (Process.getGidForName("") + 61686), 1874745193, false, $$c((byte) 11, b5, (byte) (b5 - 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                                    }
                                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                                    j = 7083766810336261929L;
                                } else {
                                    j = 7083766810336261929L;
                                    iIntValue = (short) (((short) (((long) copy[i5 + ((int) (((long) component3) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component1) ^ 7083766810336261929L)));
                                }
                            }
                            if (iIntValue > 0) {
                                getsmalliconid.copydefault = ((i5 + iIntValue) - 2) + ((int) (((long) component3) ^ j)) + i8;
                                Object[] objArr5 = {getsmalliconid, Integer.valueOf(i6), Integer.valueOf(component2), sb};
                                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                                if (objCopydefault4 == null) {
                                    byte b6 = (byte) 0;
                                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSizeAndState(0, 0, 0) + 1697, 37 - Drawable.resolveOpacity(0, 0), (char) KeyEvent.getDeadChar(0, 0), -1454191902, false, $$c((byte) 10, b6, (byte) (b6 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                                }
                                ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                                getsmalliconid.component3 = getsmalliconid.component1;
                                byte[] bArr4 = equals;
                                if (bArr4 != null) {
                                    int length2 = bArr4.length;
                                    byte[] bArr5 = new byte[length2];
                                    for (int i14 = 0; i14 < length2; i14++) {
                                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                                    }
                                    bArr4 = bArr5;
                                }
                                if (bArr4 != null) {
                                    int i15 = $11 + 57;
                                    $10 = i15 % 128;
                                    int i16 = i15 % 2;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                getsmalliconid.component2 = 1;
                                while (getsmalliconid.component2 < iIntValue) {
                                    if (z) {
                                        int i17 = $11 + 77;
                                        $10 = i17 % 128;
                                        int i18 = i17 % 2;
                                        byte[] bArr6 = equals;
                                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                                    } else {
                                        short[] sArr = copy;
                                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                                    }
                                    sb.append(getsmalliconid.component1);
                                    getsmalliconid.component3 = getsmalliconid.component1;
                                    getsmalliconid.component2++;
                                }
                            }
                            objArr[0] = sb.toString();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v115, types: [java.lang.reflect.Method] */
                    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.Class] */
                    /* JADX WARN: Type inference failed for: r8v0 */
                    /* JADX WARN: Type inference failed for: r8v1 */
                    /* JADX WARN: Type inference failed for: r8v109 */
                    /* JADX WARN: Type inference failed for: r8v16, types: [int] */
                    /* JADX WARN: Type inference failed for: r8v161, types: [java.lang.Object, java.lang.String] */
                    /* JADX WARN: Type inference failed for: r8v164, types: [java.lang.Object] */
                    /* JADX WARN: Type inference failed for: r8v172, types: [int] */
                    /* JADX WARN: Type inference failed for: r8v203, types: [int] */
                    /* JADX WARN: Type inference failed for: r8v204 */
                    /* JADX WARN: Type inference failed for: r8v205 */
                    /* JADX WARN: Type inference failed for: r8v23, types: [java.lang.Class[]] */
                    /* JADX WARN: Type inference failed for: r8v24 */
                    /* JADX WARN: Type inference failed for: r8v39 */
                    /* JADX WARN: Type inference failed for: r8v9 */
                    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                        java.util.NoSuchElementException
                        	at java.base/java.util.TreeMap.key(Unknown Source)
                        	at java.base/java.util.TreeMap.lastKey(Unknown Source)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                        */
                    public static java.lang.Object[] copydefault(android.content.Context r31, int r32, int r33) {
                        /*
                            Method dump skipped, instruction units count: 4165
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.component2.AnonymousClass4.copydefault(android.content.Context, int, int):java.lang.Object[]");
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = component1 + 57;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i5 = 97 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
            Unit unit = Unit.INSTANCE;
            int i6 = component1 + 103;
            component2 = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component3 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = BalancesViewModel.this.new component2(this.component3, continuation);
            int i2 = component2 + 11;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 49;
            component2 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 11;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object obj = null;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 == 0) {
                component2Var.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 89;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final String component2() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 103;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        int i4 = getAsAtTimestamp + 113;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return strReplaceFirst$default;
    }

    public final void getBalances() {
        int i = 2 % 2;
        Object obj = null;
        this.copydefault.setValue(Resource.loading(null));
        String strComponent2 = component2();
        HaProxyRequest<HaProxyResponse<BalancesResponse>> haProxyRequest = new HaProxyRequest<HaProxyResponse<BalancesResponse>>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault;
                int i4 = i3 + 111;
                ShareDataUIState = i4 % 128;
                Object obj2 = null;
                if (i4 % 2 != 0) {
                    obj2.hashCode();
                    throw null;
                }
                int i5 = i3 + 35;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return GsmEndpoints.GSM_BALANCES;
                }
                obj2.hashCode();
                throw null;
            }
        };
        haProxyRequest.addParams("serviceIdentifier", strComponent2);
        haProxyRequest.addParams("serviceIdentifierType", "MSISDN");
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<BalancesResponse>>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(HaProxyResponse<BalancesResponse> haProxyResponse) {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(haProxyResponse);
                int i5 = copydefault + 11;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    throw null;
                }
            }

            public void onSuccess2(HaProxyResponse<BalancesResponse> value) {
                int i2 = 2 % 2;
                int i3 = copydefault + 123;
                component3 = i3 % 128;
                BalancesResponse body = null;
                if (i3 % 2 != 0) {
                    super.onSuccess(value);
                    BalancesViewModel balancesViewModel = BalancesViewModel.this;
                    if (value != null) {
                        body = value.getBody();
                        int i4 = component3 + 9;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    BalancesViewModel.access$updateGsmBalances(balancesViewModel, body);
                    BalancesViewModel.access$getData$p(BalancesViewModel.this).setValue(Resource.success(value));
                    return;
                }
                super.onSuccess(value);
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = copydefault + 31;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                BalancesViewModel.access$getData$p(BalancesViewModel.this).setValue(Resource.error(e, null));
                int i5 = copydefault + 5;
                component3 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        int i2 = copy + 103;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final Comparable component1(Pair pair) {
        int i = 2 % 2;
        int i2 = copy + 47;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pair, "");
        Comparable comparable = (Comparable) pair.getSecond();
        int i4 = copy + 27;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return comparable;
    }

    private static final Comparable component3(Pair pair) {
        int i = 2 % 2;
        int i2 = copy + 115;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(pair, "");
            ((UsageConsumptionDetailsUIModel) pair.getFirst()).getDisplayOrder();
            throw null;
        }
        Intrinsics.checkNotNullParameter(pair, "");
        int displayOrder = ((UsageConsumptionDetailsUIModel) pair.getFirst()).getDisplayOrder();
        if (displayOrder == null) {
            displayOrder = Integer.MAX_VALUE;
        }
        Integer num = displayOrder;
        int i3 = copy + 39;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            return num;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4 A[PHI: r11
  0x00d4: PHI (r11v14 java.util.List<com.huawei.digitalpayment.consumer.base.resp.BalanceDetails>) = 
  (r11v13 java.util.List<com.huawei.digitalpayment.consumer.base.resp.BalanceDetails>)
  (r11v17 java.util.List<com.huawei.digitalpayment.consumer.base.resp.BalanceDetails>)
 binds: [B:50:0x00d2, B:47:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e4  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Integer, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component2(com.huawei.digitalpayment.consumer.base.resp.BalancesResponse r26) {
        /*
            Method dump skipped, instruction units count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.component2(com.huawei.digitalpayment.consumer.base.resp.BalancesResponse):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel$updateGsmBalances$1", f = "BalancesViewModel.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;
        final List<UsageConsumptionDetailsUIModel> component2;

        /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[PHI: r1
  0x003a: PHI (r1v8 java.lang.Object) = (r1v4 java.lang.Object), (r1v9 java.lang.Object) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023 A[PHI: r3
  0x0023: PHI (r3v1 int) = (r3v0 int), (r3v7 int) binds: [B:8:0x0021, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.component3
                int r1 = r1 + 101
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.copydefault = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 == 0) goto L1b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.component1
                r4 = 3
                int r4 = r4 / 0
                if (r3 == 0) goto L3a
                goto L23
            L1b:
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r7.component1
                if (r3 == 0) goto L3a
            L23:
                int r1 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.copydefault
                int r1 = r1 + 125
                int r4 = r1 % 128
                com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.component3 = r4
                int r1 = r1 % r0
                if (r3 != r2) goto L32
                kotlin.ResultKt.throwOnFailure(r8)
                goto L9d
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L3a:
                kotlin.ResultKt.throwOnFailure(r8)
                com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel r8 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.this
                java.lang.String r8 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.access$getCachedMsisdn(r8)
                java.util.List<com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel> r3 = r7.component2
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r3, r5)
                r4.<init>(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r3 = r3.iterator()
            L58:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L89
                int r5 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.copydefault
                int r5 = r5 + 53
                int r6 = r5 % 128
                com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.component3 = r6
                int r5 = r5 % r0
                if (r5 != 0) goto L7b
                java.lang.Object r5 = r3.next()
                com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel r5 = (com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel) r5
                com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity r5 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.GsmBalancesCacheMappersKt.toGsmBalancesCacheEntity(r5, r8)
                r4.add(r5)
                r5 = 73
                int r5 = r5 / 0
                goto L58
            L7b:
                java.lang.Object r5 = r3.next()
                com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel r5 = (com.huawei.digitalpayment.consumer.sfcui.gsmBalances.model.UsageConsumptionDetailsUIModel) r5
                com.huawei.digitalpayment.consumer.base.database.entities.GsmBalancesCacheEntity r5 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.GsmBalancesCacheMappersKt.toGsmBalancesCacheEntity(r5, r8)
                r4.add(r5)
                goto L58
            L89:
                java.util.List r4 = (java.util.List) r4
                com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel r0 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.this
                com.huawei.digitalpayment.consumer.base.database.daos.GsmBalancesCacheDao r0 = com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.access$getGsmBalancesCacheDao$p(r0)
                r3 = r7
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r7.component1 = r2
                java.lang.Object r8 = r0.replaceForMsisdn(r8, r4, r3)
                if (r8 != r1) goto L9d
                return r1
            L9d:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.home.ui.viewmodel.BalancesViewModel.ShareDataUIState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(List<UsageConsumptionDetailsUIModel> list, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component2 = list;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = BalancesViewModel.this.new ShareDataUIState(this.component2, continuation);
            int i2 = component3 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 29;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 49;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 31;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    public final void updateMpesaBalance(LocalMpesaFulizaBalance balance) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 83;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(balance, "");
            this.component1 = balance;
            this.component2.setValue(BalanceMappersKt.toMpesaBalanceUiState(balance));
        } else {
            Intrinsics.checkNotNullParameter(balance, "");
            this.component1 = balance;
            this.component2.setValue(BalanceMappersKt.toMpesaBalanceUiState(balance));
            throw null;
        }
    }

    public final void toggleBalanceVisibility(boolean isVisible) {
        int i = 2 % 2;
        int i2 = copy + 73;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        FulizaStatusUtil.INSTANCE.toggleBalanceVisibility(isVisible);
        this.component2.setValue(BalanceMappersKt.toMpesaBalanceUiState(this.component1));
        int i4 = getAsAtTimestamp + 49;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Comparable $r8$lambda$1Gsg9lke9halJPKxXTv14sAoNqA(Pair pair) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Comparable comparableComponent3 = component3(pair);
        int i4 = getAsAtTimestamp + 73;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return comparableComponent3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static Comparable m10624$r8$lambda$NebFQPsOWequ9CvVQHV5YVZmYE(Pair pair) {
        int i = 2 % 2;
        int i2 = copy + 61;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Comparable comparableComponent1 = component1(pair);
        int i4 = copy + 61;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
        return comparableComponent1;
    }

    static {
        int i = 1 + 47;
        equals = i % 128;
        if (i % 2 != 0) {
            int i2 = 72 / 0;
        }
    }
}
