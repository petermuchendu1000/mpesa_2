package com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.BuyAirtimeTypes;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.components.bundles.PurchaseBundleInfoCardData;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.http.BaseRequest;
import com.safaricom.designsystem.components.payment.PaymentOption;
import java.util.List;
import java.util.Locale;
import kotlin.ActivityResultRegistryKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.setLauncher;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.math.Primes;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0011J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0011J\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\u0011J\u000e\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0011J\u000e\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\u001aJ\u0006\u0010)\u001a\u00020\rJ\f\u0010*\u001a\u00020+*\u00020,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fH\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u00061"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "<init>", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "initialize", "", "withExpiryResp", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "userMsisdn", "", "airtimeBalance", "mpesaBalance", "updateFormState", "formState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/purchase/PurchaseBundleFormState;", "onContactSelected", "phoneNumber", "validateForm", "", "getRecipientPhoneNumber", "getSelectedPaymentMethod", "fetchBongaBalance", "", "msisdn", "appDatabase", "Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;", "(Ljava/lang/String;Lcom/huawei/digitalpayment/consumer/base/database/AppDatabase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBongaBalance", "balance", "setTariff", "tariff", "setAllowSelfOnly", "allowSelfOnly", "fetchDaimaPaymentOptions", "toPaymentOption", "Lcom/safaricom/designsystem/components/payment/PaymentOption;", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/daima/model/DaimaProductPaymentOption;", "createBundleInfoCardData", "Lcom/huawei/digitalpayment/consumer/sfcui/components/bundles/PurchaseBundleInfoCardData;", "bundle", "validateAndNormalize", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PurchaseBundleViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int component1 = 0;
    private static int component2 = 0;
    private static int component3 = 69 % 128;
    private static int getAsAtTimestamp = 1;
    private final StateFlow<PurchaseBundleUiState> ShareDataUIState;
    private final MutableStateFlow<PurchaseBundleUiState> copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel", f = "PurchaseBundleViewModel.kt", i = {0, 0}, l = {Primes.SMALL_FACTOR_LIMIT, 213}, m = "fetchBongaBalance", n = {"msisdn", "appDatabase"}, s = {"L$0", "L$1"})
    static final class component1 extends ContinuationImpl {
        private static int copy = 0;
        private static int getRequestBeneficiariesState = 1;
        Object ShareDataUIState;
        Object component1;
        int component2;
        Object component3;

        component1(Continuation<? super component1> continuation) {
            super(continuation);
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 73;
            copy = i2 % 128;
            int i3 = i2 % 2;
            this.component3 = obj;
            this.component2 |= Integer.MIN_VALUE;
            Object objFetchBongaBalance = PurchaseBundleViewModel.this.fetchBongaBalance(null, null, this);
            int i4 = copy + 31;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return objFetchBongaBalance;
        }
    }

    public PurchaseBundleViewModel() {
        MutableStateFlow<PurchaseBundleUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new PurchaseBundleUiState(null, null, null, null, null, null, false, null, null, 511, null));
        this.copydefault = MutableStateFlow;
        this.ShareDataUIState = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final MutableStateFlow access$get_uiState$p(PurchaseBundleViewModel purchaseBundleViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<PurchaseBundleUiState> mutableStateFlow = purchaseBundleViewModel.copydefault;
        if (i3 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final PaymentOption access$toPaymentOption(PurchaseBundleViewModel purchaseBundleViewModel, DaimaProductPaymentOption daimaProductPaymentOption) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PaymentOption paymentOptionComponent3 = purchaseBundleViewModel.component3(daimaProductPaymentOption);
        int i4 = getAsAtTimestamp + 89;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return paymentOptionComponent3;
        }
        throw null;
    }

    public static final PurchaseBundleFormState access$validateAndNormalize(PurchaseBundleViewModel purchaseBundleViewModel, PurchaseBundleFormState purchaseBundleFormState) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PurchaseBundleFormState purchaseBundleFormStateComponent3 = purchaseBundleViewModel.component3(purchaseBundleFormState);
        int i4 = component1 + 115;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return purchaseBundleFormStateComponent3;
    }

    public static final boolean access$validateForm(PurchaseBundleViewModel purchaseBundleViewModel, PurchaseBundleFormState purchaseBundleFormState) {
        int i = 2 % 2;
        int i2 = component1 + 69;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        boolean zCopydefault = purchaseBundleViewModel.copydefault(purchaseBundleFormState);
        int i4 = getAsAtTimestamp + 79;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return zCopydefault;
        }
        throw null;
    }

    public final StateFlow<PurchaseBundleUiState> getUiState() {
        int i = 2 % 2;
        int i2 = component1 + 119;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$initialize$2", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int component1;
        final PurchaseBundleViewModel component3;
        final WithExpiryResp copydefault;

        /* JADX WARN: Removed duplicated region for block: B:53:0x016d  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 507
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(WithExpiryResp withExpiryResp, PurchaseBundleViewModel purchaseBundleViewModel, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.copydefault = withExpiryResp;
            this.component3 = purchaseBundleViewModel;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = new component3(this.copydefault, this.component3, continuation);
            int i2 = component2 + 107;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 83;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = 62 / 0;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 63;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void initialize(WithExpiryResp withExpiryResp, String userMsisdn, String airtimeBalance, String mpesaBalance) {
        List listListOf;
        int i = 2 % 2;
        int i2 = component1 + 65;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(withExpiryResp, "");
        Intrinsics.checkNotNullParameter(userMsisdn, "");
        Intrinsics.checkNotNullParameter(airtimeBalance, "");
        Intrinsics.checkNotNullParameter(mpesaBalance, "");
        PurchaseBundleInfoCardData purchaseBundleInfoCardDataShareDataUIState = ShareDataUIState(withExpiryResp);
        if (!Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_OFA_MOTO)) {
            listListOf = CollectionsKt.listOf((Object[]) new PaymentOption[]{PaymentOption.MPESA.INSTANCE, PaymentOption.AIRTIME.INSTANCE});
        } else {
            listListOf = CollectionsKt.listOf((Object[]) new PaymentOption[]{PaymentOption.MPESA.INSTANCE, PaymentOption.AIRTIME.INSTANCE, PaymentOption.BONGA.INSTANCE});
            int i4 = component1 + 105;
            getAsAtTimestamp = i4 % 128;
            int i5 = i4 % 2;
        }
        List list = listListOf;
        MutableStateFlow<PurchaseBundleUiState> mutableStateFlow = this.copydefault;
        int i6 = getAsAtTimestamp + 59;
        component1 = i6 % 128;
        int i7 = i6 % 2;
        while (true) {
            PurchaseBundleUiState value = mutableStateFlow.getValue();
            PurchaseBundleUiState purchaseBundleUiState = value;
            MutableStateFlow<PurchaseBundleUiState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, PurchaseBundleUiState.copy$default(purchaseBundleUiState, withExpiryResp, purchaseBundleInfoCardDataShareDataUIState, PurchaseBundleFormState.copy$default(purchaseBundleUiState.getFormState(), null, null, userMsisdn, null, null, PaymentOption.MPESA.INSTANCE, list, true, 27, null), airtimeBalance, mpesaBalance, null, false, null, null, 480, null))) {
                onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(withExpiryResp, this, null), 3, null);
                return;
            }
            mutableStateFlow = mutableStateFlow2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$updateFormState$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int copydefault;
        final PurchaseBundleFormState ShareDataUIState;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            PurchaseBundleUiState purchaseBundleUiState;
            PurchaseBundleFormState purchaseBundleFormStateAccess$validateAndNormalize;
            int i = 2 % 2;
            int i2 = copydefault + 11;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
            PurchaseBundleFormState purchaseBundleFormState = this.ShareDataUIState;
            PurchaseBundleViewModel purchaseBundleViewModel = PurchaseBundleViewModel.this;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
                purchaseBundleUiState = (PurchaseBundleUiState) value;
                purchaseBundleFormStateAccess$validateAndNormalize = PurchaseBundleViewModel.access$validateAndNormalize(purchaseBundleViewModel, PurchaseBundleFormState.copy$default(purchaseBundleFormState, null, null, null, null, null, null, purchaseBundleUiState.getFormState().getPaymentTypes(), false, 191, null));
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, PurchaseBundleUiState.copy$default(purchaseBundleUiState, null, null, PurchaseBundleFormState.copy$default(purchaseBundleFormStateAccess$validateAndNormalize, null, null, null, null, null, null, null, PurchaseBundleViewModel.access$validateForm(purchaseBundleViewModel, purchaseBundleFormStateAccess$validateAndNormalize), 127, null), null, null, null, false, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            int i4 = component1 + 61;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component4(PurchaseBundleFormState purchaseBundleFormState, Continuation<? super component4> continuation) {
            super(2, continuation);
            this.ShareDataUIState = purchaseBundleFormState;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component4 component4Var = PurchaseBundleViewModel.this.new component4(this.ShareDataUIState, continuation);
            int i2 = component1 + 31;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component4Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 109;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 7;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            component4 component4Var = (component4) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component4Var.invokeSuspend(Unit.INSTANCE);
            }
            component4Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    public final void updateFormState(PurchaseBundleFormState formState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(formState, "");
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component4(formState, null), 3, null);
        int i2 = getAsAtTimestamp + 79;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$onContactSelected$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int ShareDataUIState;
        final String copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            PurchaseBundleUiState purchaseBundleUiState;
            PurchaseBundleFormState purchaseBundleFormStateCopy$default;
            Unit unit;
            int i = 2 % 2;
            int i2 = component1 + 45;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
            String str = this.copydefault;
            PurchaseBundleViewModel purchaseBundleViewModel = PurchaseBundleViewModel.this;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
                purchaseBundleUiState = (PurchaseBundleUiState) value;
                purchaseBundleFormStateCopy$default = PurchaseBundleFormState.copy$default(purchaseBundleUiState.getFormState(), null, null, null, str, null, null, null, false, 231, null);
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, PurchaseBundleUiState.copy$default(purchaseBundleUiState, null, null, PurchaseBundleFormState.copy$default(purchaseBundleFormStateCopy$default, null, null, null, null, null, null, null, PurchaseBundleViewModel.access$validateForm(purchaseBundleViewModel, purchaseBundleFormStateCopy$default), 127, null), null, null, null, false, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            int i4 = component1 + 109;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                unit = Unit.INSTANCE;
                int i5 = 89 / 0;
            } else {
                unit = Unit.INSTANCE;
            }
            int i6 = component1 + 3;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(String str, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.copydefault = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = PurchaseBundleViewModel.this.new ShareDataUIState(this.copydefault, continuation);
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 61;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = component1 + 111;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 51;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return shareDataUIState.invokeSuspend(unit);
            }
            shareDataUIState.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void onContactSelected(String phoneNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(phoneNumber, null), 3, null);
        int i2 = getAsAtTimestamp + 91;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean copydefault(com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.IRecipientType r1 = r4.getSelectedRecipientType()
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType.SELF
            if (r1 != r2) goto L21
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.getAsAtTimestamp
            int r1 = r1 + 93
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.component1 = r2
            int r1 = r1 % r0
            com.safaricom.designsystem.components.payment.PaymentOption r4 = r4.getSelectedPaymentType()
            com.safaricom.designsystem.components.payment.PaymentOption$UNDEFINED r0 = com.safaricom.designsystem.components.payment.PaymentOption.UNDEFINED.INSTANCE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
            if (r4 != 0) goto L4c
            goto L4a
        L21:
            com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.model.recipient.RecipientType.OTHER
            if (r1 != r2) goto L4c
            java.lang.String r1 = r4.getRecipientMsisdn()
            if (r1 != 0) goto L36
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.component1
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.getAsAtTimestamp = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
        L36:
            com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil$Companion r0 = com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil.INSTANCE
            boolean r0 = r0.isValidPhoneNumber(r1)
            com.safaricom.designsystem.components.payment.PaymentOption r4 = r4.getSelectedPaymentType()
            com.safaricom.designsystem.components.payment.PaymentOption$UNDEFINED r1 = com.safaricom.designsystem.components.payment.PaymentOption.UNDEFINED.INSTANCE
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r1)
            if (r4 != 0) goto L4c
            if (r0 == 0) goto L4c
        L4a:
            r4 = 1
            goto L4d
        L4c:
            r4 = 0
        L4d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.copydefault(com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleFormState):boolean");
    }

    public final String getRecipientPhoneNumber() {
        String ownMsisdn;
        int i = 2 % 2;
        int i2 = component1 + 45;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.copydefault.getValue().getFormState().getSelectedRecipientType();
            RecipientType recipientType = RecipientType.SELF;
            throw null;
        }
        IRecipientType selectedRecipientType = this.copydefault.getValue().getFormState().getSelectedRecipientType();
        if (selectedRecipientType != RecipientType.SELF && selectedRecipientType == RecipientType.OTHER) {
            int i3 = component1 + 107;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                this.copydefault.getValue().getFormState().getRecipientMsisdn();
                throw null;
            }
            ownMsisdn = this.copydefault.getValue().getFormState().getRecipientMsisdn();
            if (ownMsisdn == null) {
                int i4 = getAsAtTimestamp + 45;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                ownMsisdn = "";
            }
        } else {
            ownMsisdn = this.copydefault.getValue().getFormState().getOwnMsisdn();
        }
        int i6 = getAsAtTimestamp + 77;
        component1 = i6 % 128;
        if (i6 % 2 == 0) {
            return ownMsisdn;
        }
        obj.hashCode();
        throw null;
    }

    public final String getSelectedPaymentMethod() {
        int i = 2 % 2;
        int i2 = component1 + 33;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.areEqual(this.copydefault.getValue().getFormState().getSelectedPaymentType(), PaymentOption.MPESA.INSTANCE);
            throw null;
        }
        PaymentOption selectedPaymentType = this.copydefault.getValue().getFormState().getSelectedPaymentType();
        if (Intrinsics.areEqual(selectedPaymentType, PaymentOption.MPESA.INSTANCE)) {
            int i3 = getAsAtTimestamp + 69;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            return Keys.PAY_METHOD_MPESA;
        }
        if (!Intrinsics.areEqual(selectedPaymentType, PaymentOption.AIRTIME.INSTANCE)) {
            return !(Intrinsics.areEqual(selectedPaymentType, PaymentOption.BONGA.INSTANCE) ^ true) ? Keys.PAY_METHOD_BONGA : "";
        }
        int i5 = getAsAtTimestamp + 75;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            return Keys.PAY_METHOD_AIRTIME;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[Catch: Exception -> 0x00ca, TryCatch #0 {Exception -> 0x00ca, blocks: (B:12:0x0035, B:32:0x0098, B:33:0x009a, B:34:0x00a0, B:36:0x00a6, B:40:0x00bb, B:42:0x00bf, B:44:0x00c5, B:17:0x004a, B:27:0x0071, B:29:0x0079, B:20:0x0051), top: B:52:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchBongaBalance(java.lang.String r7, com.huawei.digitalpayment.consumer.base.database.AppDatabase r8, kotlin.coroutines.Continuation<? super java.lang.Float> r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.fetchBongaBalance(java.lang.String, com.huawei.digitalpayment.consumer.base.database.AppDatabase, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$updateBongaBalance$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class getAsAtTimestamp extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;
        final String copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlowAccess$get_uiState$p;
            String str;
            Object value;
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = component1 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            if (i3 == 0) {
                mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
                str = this.copydefault;
                int i4 = 29 / 0;
            } else {
                mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
                str = this.copydefault;
            }
            String str2 = str;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, PurchaseBundleUiState.copy$default((PurchaseBundleUiState) value, null, null, null, null, null, str2, false, null, null, 479, null)));
            int i5 = ShareDataUIState + 5;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getAsAtTimestamp(String str, Continuation<? super getAsAtTimestamp> continuation) {
            super(2, continuation);
            this.copydefault = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getAsAtTimestamp getasattimestamp = PurchaseBundleViewModel.this.new getAsAtTimestamp(this.copydefault, continuation);
            int i2 = ShareDataUIState + 83;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return getasattimestamp;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            ShareDataUIState = i2 % 128;
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
            int i2 = ShareDataUIState + 45;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            getAsAtTimestamp getasattimestamp = (getAsAtTimestamp) create(coroutineScope, continuation);
            if (i3 == 0) {
                return getasattimestamp.invokeSuspend(Unit.INSTANCE);
            }
            getasattimestamp.invokeSuspend(Unit.INSTANCE);
            throw null;
        }

        public static void ShareDataUIState() {
            setLauncher.component2[0] = ActivityResultRegistryKt.copydefault[0];
        }
    }

    public final void updateBongaBalance(String balance) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(balance, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getAsAtTimestamp(balance, null), 3, null);
        int i2 = getAsAtTimestamp + 93;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$setTariff$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class getRequestBeneficiariesState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        final String component1;
        int copydefault;

        /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                Method dump skipped, instruction units count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel.getRequestBeneficiariesState.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        getRequestBeneficiariesState(String str, Continuation<? super getRequestBeneficiariesState> continuation) {
            super(2, continuation);
            this.component1 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            getRequestBeneficiariesState getrequestbeneficiariesstate = PurchaseBundleViewModel.this.new getRequestBeneficiariesState(this.component1, continuation);
            int i2 = ShareDataUIState + 41;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return getrequestbeneficiariesstate;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 121;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component1(coroutineScope2, continuation2);
            }
            component1(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((getRequestBeneficiariesState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    public final void setTariff(String tariff) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(tariff, "");
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new getRequestBeneficiariesState(tariff, null), 3, null);
        int i2 = component1 + 9;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$setAllowSelfOnly$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;
        final boolean component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            PurchaseBundleUiState purchaseBundleUiState;
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = component1 + 19;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            if (i3 != 0) {
                PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
            boolean z = this.component3;
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
                purchaseBundleUiState = (PurchaseBundleUiState) value;
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, PurchaseBundleUiState.copy$default(purchaseBundleUiState, null, null, PurchaseBundleFormState.copy$default(purchaseBundleUiState.getFormState(), z ? RecipientType.SELF : RecipientType.OTHER, !z ? CollectionsKt.listOf(RecipientType.OTHER) : CollectionsKt.listOf(RecipientType.SELF), null, null, null, null, null, false, 252, null), null, null, null, false, null, null, TypedValues.PositionType.TYPE_PERCENT_Y, null)));
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 103;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(boolean z, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component3 = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = PurchaseBundleViewModel.this.new component2(this.component3, continuation);
            int i2 = component1 + 113;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            ShareDataUIState(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 105;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 47;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 83 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void setAllowSelfOnly(boolean allowSelfOnly) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(allowSelfOnly, null), 3, null);
        int i2 = component1 + 123;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$fetchDaimaPaymentOptions$1", f = "PurchaseBundleViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int ShareDataUIState;

        @Override
        public final Object invokeSuspend(Object obj) {
            Object value;
            int i = 2 % 2;
            int i2 = component3 + 119;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.ShareDataUIState != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlowAccess$get_uiState$p = PurchaseBundleViewModel.access$get_uiState$p(PurchaseBundleViewModel.this);
            int i3 = component3 + 99;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 4;
            }
            do {
                value = mutableStateFlowAccess$get_uiState$p.getValue();
            } while (!mutableStateFlowAccess$get_uiState$p.compareAndSet(value, PurchaseBundleUiState.copy$default((PurchaseBundleUiState) value, null, null, null, null, null, null, true, null, null, 447, null)));
            HaProxyRequest<HaProxyResponse<List<? extends DaimaProductPaymentOption>>> haProxyRequest = new HaProxyRequest<HaProxyResponse<List<? extends DaimaProductPaymentOption>>>() {
                private static int ShareDataUIState = 1;
                private static int component1;

                @Override
                public String getApiPath() {
                    int i5 = 2 % 2;
                    int i6 = ShareDataUIState + 21;
                    int i7 = i6 % 128;
                    component1 = i7;
                    int i8 = i6 % 2;
                    int i9 = i7 + 63;
                    ShareDataUIState = i9 % 128;
                    int i10 = i9 % 2;
                    return GsmEndpoints.GSM_DAIMA_PAYMENT_OPTIONS;
                }
            };
            ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
            haProxyRequest.method(BaseRequest.Method.GET);
            final PurchaseBundleViewModel purchaseBundleViewModel = PurchaseBundleViewModel.this;
            PurchaseBundleViewModel.this.sendRequest(haProxyRequest, new ApiCallback<HaProxyResponse<List<? extends DaimaProductPaymentOption>>>() {
                private static int component3 = 0;
                private static int copydefault = 1;

                @Override
                public void onSuccess(HaProxyResponse<List<? extends DaimaProductPaymentOption>> haProxyResponse) {
                    int i5 = 2 % 2;
                    int i6 = component3 + 107;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    onSuccess2((HaProxyResponse<List<DaimaProductPaymentOption>>) haProxyResponse);
                    int i8 = copydefault + 67;
                    component3 = i8 % 128;
                    int i9 = i8 % 2;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.daima.model.DaimaProductPaymentOption>> r19) {
                    /*
                        Method dump skipped, instruction units count: 377
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.purchase.PurchaseBundleViewModel$fetchDaimaPaymentOptions$1$2.onSuccess2(com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse):void");
                }

                @Override
                public void onError(BaseException e) {
                    MutableStateFlow mutableStateFlowAccess$get_uiState$p2;
                    Object value2;
                    PurchaseBundleUiState purchaseBundleUiState;
                    int i5 = 2 % 2;
                    int i6 = component3 + 7;
                    copydefault = i6 % 128;
                    if (i6 % 2 == 0) {
                        Intrinsics.checkNotNullParameter(e, "");
                        super.onError(e);
                        mutableStateFlowAccess$get_uiState$p2 = PurchaseBundleViewModel.access$get_uiState$p(purchaseBundleViewModel);
                        int i7 = 18 / 0;
                    } else {
                        Intrinsics.checkNotNullParameter(e, "");
                        super.onError(e);
                        mutableStateFlowAccess$get_uiState$p2 = PurchaseBundleViewModel.access$get_uiState$p(purchaseBundleViewModel);
                    }
                    do {
                        value2 = mutableStateFlowAccess$get_uiState$p2.getValue();
                        purchaseBundleUiState = (PurchaseBundleUiState) value2;
                    } while (!mutableStateFlowAccess$get_uiState$p2.compareAndSet(value2, PurchaseBundleUiState.copy$default(purchaseBundleUiState, null, null, PurchaseBundleFormState.copy$default(purchaseBundleUiState.getFormState(), null, null, null, null, null, PaymentOption.AIRTIME.INSTANCE, CollectionsKt.listOf(PaymentOption.AIRTIME.INSTANCE), false, 159, null), null, null, null, false, null, null, WebSocket.DEFAULT_WSS_PORT, null)));
                    int i8 = component3 + 67;
                    copydefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        throw null;
                    }
                }
            });
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = PurchaseBundleViewModel.this.new copydefault(continuation);
            int i2 = component3 + 51;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                return copydefaultVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 80 / 0;
            }
            int i5 = component1 + 75;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 77;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(coroutineScope, continuation);
            if (i3 != 0) {
                return copydefaultVar.invokeSuspend(Unit.INSTANCE);
            }
            copydefaultVar.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final void fetchDaimaPaymentOptions() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
        int i2 = component1 + 91;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 38 / 0;
        }
    }

    private final PaymentOption component3(DaimaProductPaymentOption daimaProductPaymentOption) {
        int i = 2 % 2;
        String lowerCase = new Regex("[_-]").replace(daimaProductPaymentOption.getCode(), "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -991553769) {
            int i2 = getAsAtTimestamp + 65;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            if (iHashCode != 93920859) {
                if (iHashCode == 104101104 && lowerCase.equals(BuyAirtimeTypes.MPESA)) {
                    return PaymentOption.MPESA.INSTANCE;
                }
            } else if (lowerCase.equals(BuyAirtimeTypes.BONGA)) {
                PaymentOption.BONGA bonga = PaymentOption.BONGA.INSTANCE;
                int i4 = getAsAtTimestamp + 45;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return bonga;
            }
        } else if (lowerCase.equals("airtime")) {
            return PaymentOption.AIRTIME.INSTANCE;
        }
        return PaymentOption.UNDEFINED.INSTANCE;
    }

    private final PurchaseBundleInfoCardData ShareDataUIState(WithExpiryResp withExpiryResp) {
        int icon;
        String title;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 111;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        String string = "No Expiry";
        boolean zAreEqual = Intrinsics.areEqual(withExpiryResp.getValidity(), "No Expiry");
        Object obj = null;
        if (withExpiryResp.getIcon() != 0) {
            icon = withExpiryResp.getIcon();
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_ALL_IN_ONE)) {
            int i4 = getAsAtTimestamp + 101;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            icon = R.drawable.ic_gsm_all_in_one;
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_SMS)) {
            icon = R.drawable.ic_sms_bundles;
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_ROAMING)) {
            int i6 = getAsAtTimestamp + 75;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = R.drawable.ic_gsm_roaming_bundle;
                obj.hashCode();
                throw null;
            }
            icon = R.drawable.ic_gsm_roaming_bundle;
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_INTERNATIONAL)) {
            icon = R.drawable.icon_bundle_international;
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_DATA_ONLY)) {
            icon = R.drawable.icon_bundle_with_expiry;
        } else if (Intrinsics.areEqual(withExpiryResp.getBundleType(), Keys.BUNDLE_TYPE_SHOOK)) {
            int i8 = getAsAtTimestamp + 107;
            component1 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = R.drawable.ic_gsm_s_hook_bundles;
                obj.hashCode();
                throw null;
            }
            icon = R.drawable.ic_gsm_s_hook_bundles;
        } else {
            icon = !zAreEqual ? R.drawable.icon_bundle_with_expiry : R.drawable.icon_bundle_no_expiry;
        }
        int i10 = icon;
        if (StringsKt.contains((CharSequence) withExpiryResp.getTitle(), (CharSequence) "Ksh", true)) {
            title = withExpiryResp.getTitle();
            int i11 = component1 + 51;
            getAsAtTimestamp = i11 % 128;
            int i12 = i11 % 2;
        } else {
            title = withExpiryResp.getTitle() + " for Ksh. " + withExpiryResp.getAmount();
        }
        String str = title;
        if (!zAreEqual) {
            string = StringsKt.trim(withExpiryResp.getValidity()).toString();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (!StringsKt.startsWith$default(lowerCase, "valid", false, 2, (Object) null) && !StringsKt.startsWith$default(lowerCase, "for", false, 2, (Object) null)) {
                int i13 = component1 + 51;
                getAsAtTimestamp = i13 % 128;
                int i14 = i13 % 2;
                if (!(!StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "valid for", false, 2, (Object) null))) {
                    int i15 = component1 + 39;
                    getAsAtTimestamp = i15 % 128;
                    int i16 = i15 % 2;
                } else {
                    string = "Valid for " + string;
                }
            }
        }
        return new PurchaseBundleInfoCardData(str, string, null, i10, null, 4, null);
    }

    private final PurchaseBundleFormState component3(PurchaseBundleFormState purchaseBundleFormState) {
        int i = 2 % 2;
        if (purchaseBundleFormState.getSelectedRecipientType() == RecipientType.OTHER) {
            String recipientMsisdn = purchaseBundleFormState.getRecipientMsisdn();
            if (recipientMsisdn == null) {
                recipientMsisdn = "";
            }
            return PurchaseBundleFormState.copy$default(purchaseBundleFormState, null, null, null, null, (recipientMsisdn.length() <= 0 || SfcPhoneNumberUtil.INSTANCE.isValidPhoneNumber(recipientMsisdn)) ? null : Integer.valueOf(R.string.error_invalid_phone_number), null, null, false, 239, null);
        }
        int i2 = getAsAtTimestamp + 45;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        PurchaseBundleFormState purchaseBundleFormStateCopy$default = PurchaseBundleFormState.copy$default(purchaseBundleFormState, null, null, null, null, null, null, null, false, 239, null);
        int i4 = getAsAtTimestamp + 117;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        return purchaseBundleFormStateCopy$default;
    }

    static {
        int i = 69 % 2;
    }
}
