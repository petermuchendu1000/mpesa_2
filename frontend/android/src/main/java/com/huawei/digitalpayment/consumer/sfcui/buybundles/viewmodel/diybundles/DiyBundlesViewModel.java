package com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiState;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.diybundles.EasyTalkBundlesUiStateKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepository;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYBundle;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYPackage;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYProductCatalogResponse;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.DIYProductCatalogTypes;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.EasyTalkMpesaValidatedData;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.safaricom.consumer.commons.resource.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u0015J2\u0010 \u001a\u00020\u001b2\u0014\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u0014\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u001d2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0015H\u0002J\u0006\u0010%\u001a\u00020\u001bJ&\u0010&\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0015J2\u0010,\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020\u00152\b\b\u0002\u0010.\u001a\u00020\u0015JB\u0010/\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*2\u0006\u00100\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00152\b\b\u0002\u0010.\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u000b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\b0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000e¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/diybundles/DiyBundlesViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/EasyTalkRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/repository/EasyTalkRepository;)V", "_purchaseResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/safaricom/consumer/commons/resource/Resource;", "Lcom/huawei/digitalpayment/consumer/base/resp/HaProxyResponse;", "", "purchaseResult", "Lkotlinx/coroutines/flow/StateFlow;", "getPurchaseResult", "()Lkotlinx/coroutines/flow/StateFlow;", "_validateResult", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/EasyTalkMpesaValidatedData;", "validateResult", "getValidateResult", "easyTalkCategories", "", "", "_easyTalkUiState", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/diybundles/EasyTalkBundlesUiState;", "easyTalkUiState", "getEasyTalkUiState", "initEasyTalk", "", "isMonthlyBundles", "", "onEasyTalkCategorySelected", TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "updateEasyTalkFromResponse", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYProductCatalogResponse;", "loading", "errorMessage", "getDiyBundleCatalog", "purchaseViaAirtime", "sponsorMsisdn", "beneficiaryMsisdn", "diyBundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/DIYBundle;", "cellId", "validateMpesa", "tariff", "offerName", "completeMpesaPurchase", "securityCredential", "validatedData", "resetValidation", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DiyBundlesViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 51 % 128;
    private static int getShareableDataState = 0;
    private static int hashCode = 1;
    private final StateFlow<EasyTalkBundlesUiState> ShareDataUIState;
    private final MutableStateFlow<Resource<HaProxyResponse<Object>>> component1;
    private final List<String> component2;
    private final MutableStateFlow<Resource<EasyTalkMpesaValidatedData>> component3;
    private final EasyTalkRepository component4;
    private final StateFlow<Resource<EasyTalkMpesaValidatedData>> copy;
    private final MutableStateFlow<EasyTalkBundlesUiState> copydefault;
    private final StateFlow<Resource<HaProxyResponse<Object>>> getAsAtTimestamp;

    public static final EasyTalkRepository access$getRepository$p(DiyBundlesViewModel diyBundlesViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 9;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        EasyTalkRepository easyTalkRepository = diyBundlesViewModel.component4;
        int i5 = i3 + 99;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            return easyTalkRepository;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_purchaseResult$p(DiyBundlesViewModel diyBundlesViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        MutableStateFlow<Resource<HaProxyResponse<Object>>> mutableStateFlow = diyBundlesViewModel.component1;
        int i5 = i3 + 19;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$get_validateResult$p(DiyBundlesViewModel diyBundlesViewModel) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 65;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        MutableStateFlow<Resource<EasyTalkMpesaValidatedData>> mutableStateFlow = diyBundlesViewModel.component3;
        int i5 = i3 + 55;
        getShareableDataState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 17 / 0;
        }
        return mutableStateFlow;
    }

    public static final void access$updateEasyTalkFromResponse(DiyBundlesViewModel diyBundlesViewModel, HaProxyResponse haProxyResponse, boolean z, String str) {
        int i = 2 % 2;
        int i2 = hashCode + 57;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        diyBundlesViewModel.component3(haProxyResponse, z, str);
        int i4 = hashCode + 51;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public DiyBundlesViewModel(EasyTalkRepository easyTalkRepository) {
        Intrinsics.checkNotNullParameter(easyTalkRepository, "");
        this.component4 = easyTalkRepository;
        MutableStateFlow<Resource<HaProxyResponse<Object>>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.component1 = MutableStateFlow;
        this.getAsAtTimestamp = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Resource<EasyTalkMpesaValidatedData>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.component3 = MutableStateFlow2;
        this.copy = FlowKt.asStateFlow(MutableStateFlow2);
        this.component2 = CollectionsKt.listOf((Object[]) new String[]{"All", Keys.WITH_EXPIRY_CATEGORY_MONTHLY, Keys.WITH_EXPIRY_CATEGORY_WEEKLY, "Other"});
        MutableStateFlow<EasyTalkBundlesUiState> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new EasyTalkBundlesUiState(false, null, null, null, false, null, 63, null));
        this.copydefault = MutableStateFlow3;
        this.ShareDataUIState = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public final StateFlow<Resource<HaProxyResponse<Object>>> getPurchaseResult() {
        int i = 2 % 2;
        int i2 = hashCode + 61;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        StateFlow<Resource<HaProxyResponse<Object>>> stateFlow = this.getAsAtTimestamp;
        int i5 = i3 + 33;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<Resource<EasyTalkMpesaValidatedData>> getValidateResult() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 23;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Resource<EasyTalkMpesaValidatedData>> stateFlow = this.copy;
        int i5 = i2 + 121;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<EasyTalkBundlesUiState> getEasyTalkUiState() {
        int i = 2 % 2;
        int i2 = hashCode + 67;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            return this.ShareDataUIState;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState(DiyBundlesViewModel diyBundlesViewModel, HaProxyResponse haProxyResponse, boolean z, String str, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState;
        int i4 = i3 + 115;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        if ((i & 4) != 0) {
            int i6 = i3 + 87;
            hashCode = i6 % 128;
            int i7 = i6 % 2;
            str = null;
        }
        diyBundlesViewModel.component3(haProxyResponse, z, str);
    }

    public final void getDiyBundleCatalog() {
        int i = 2 % 2;
        component3(null, true, null);
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(null), 3, null);
        int i2 = getShareableDataState + 117;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel$getDiyBundleCatalog$1", f = "DiyBundlesViewModel.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int copydefault;
        int component2;

        /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                r0 = 2
                int r1 = r0 % r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r11.component2
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L2d
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.ShareDataUIState
                int r1 = r1 + 95
                int r5 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.copydefault = r5
                int r1 = r1 % r0
                if (r2 != r3) goto L25
                kotlin.ResultKt.throwOnFailure(r12)
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.ShareDataUIState
                int r1 = r1 + 117
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.copydefault = r2
                int r1 = r1 % r0
                goto L4e
            L25:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L2d:
                kotlin.ResultKt.throwOnFailure(r12)
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.this
                com.huawei.digitalpayment.consumer.sfcui.buybundles.repository.EasyTalkRepository r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.access$getRepository$p(r12)
                r2 = r11
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r11.component2 = r3
                java.lang.Object r12 = r12.getDiyCatalog(r2)
                if (r12 != r1) goto L4e
                int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.ShareDataUIState
                int r12 = r12 + 87
                int r2 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.copydefault = r2
                int r12 = r12 % r0
                if (r12 != 0) goto L4d
                return r1
            L4d:
                throw r4
            L4e:
                com.safaricom.consumer.commons.resource.Resource r12 = (com.safaricom.consumer.commons.resource.Resource) r12
                boolean r1 = r12.isSuccess()
                if (r1 == 0) goto L67
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.this
                java.lang.Object r12 = r12.getData()
                r6 = r12
                com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse r6 = (com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse) r6
                r7 = 0
                r8 = 0
                r9 = 4
                r10 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.ShareDataUIState(r5, r6, r7, r8, r9, r10)
                goto L96
            L67:
                boolean r1 = r12.isError()
                if (r1 == 0) goto L96
                com.safaricom.consumer.commons.resource.ErrorType r12 = r12.getErrorType()
                if (r12 == 0) goto L8e
                boolean r1 = r12 instanceof com.safaricom.consumer.commons.resource.ErrorType.Network.Generic
                if (r1 == 0) goto L83
                int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.ShareDataUIState
                int r1 = r1 + 93
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.copydefault = r2
                int r1 = r1 % r0
                com.safaricom.consumer.commons.resource.ErrorType$Network$Generic r12 = (com.safaricom.consumer.commons.resource.ErrorType.Network.Generic) r12
                goto L84
            L83:
                r12 = r4
            L84:
                if (r12 == 0) goto L8b
                java.lang.String r12 = r12.getDescription()
                goto L8c
            L8b:
                r12 = r4
            L8c:
                if (r12 != 0) goto L90
            L8e:
                java.lang.String r12 = "An error occurred"
            L90:
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.this
                r1 = 0
                com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.access$updateEasyTalkFromResponse(r0, r4, r1, r12)
            L96:
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel.component1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = DiyBundlesViewModel.this.new component1(continuation);
            int i2 = copydefault + 1;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return component1Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 3;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(coroutineScope, continuation);
            int i4 = copydefault + 29;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objComponent3;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 23;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 58 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void purchaseViaAirtime(String sponsorMsisdn, String beneficiaryMsisdn, DIYBundle diyBundle, String cellId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(diyBundle, "");
        Intrinsics.checkNotNullParameter(cellId, "");
        this.component1.setValue(Resource.INSTANCE.loading(null));
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(sponsorMsisdn, beneficiaryMsisdn, diyBundle, cellId, null), 3, null);
        int i2 = getShareableDataState + 63;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel$purchaseViaAirtime$1", f = "DiyBundlesViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component4 = 1;
        private static int equals;
        int ShareDataUIState;
        final String component1;
        final String component2;
        final String component3;
        final DIYBundle copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 1;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                obj = DiyBundlesViewModel.access$getRepository$p(DiyBundlesViewModel.this).purchaseViaAirtime(this.component2, this.component1, this.copydefault, this.component3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = equals + 103;
                component4 = i5 % 128;
                if (i5 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i6 = 63 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            }
            DiyBundlesViewModel.access$get_purchaseResult$p(DiyBundlesViewModel.this).setValue((Resource) obj);
            Unit unit = Unit.INSTANCE;
            int i7 = equals + 125;
            component4 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 14 / 0;
            }
            return unit;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(String str, String str2, DIYBundle dIYBundle, String str3, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component2 = str;
            this.component1 = str2;
            this.copydefault = dIYBundle;
            this.component3 = str3;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = DiyBundlesViewModel.this.new copydefault(this.component2, this.component1, this.copydefault, this.component3, continuation);
            int i2 = equals + 17;
            component4 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 20 / 0;
            }
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 29;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = component4 + 93;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 113;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component4 + 117;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public static void validateMpesa$default(DiyBundlesViewModel diyBundlesViewModel, String str, String str2, DIYBundle dIYBundle, String str3, String str4, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = getShareableDataState + 89;
        int i4 = i3 % 128;
        hashCode = i4;
        if (i3 % 2 != 0 ? (i & 8) != 0 : (i & 45) != 0) {
            int i5 = i4 + 101;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 61;
            getShareableDataState = i7 % 128;
            int i8 = i7 % 2;
            str3 = "";
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            str4 = dIYBundle.getProductName();
        }
        diyBundlesViewModel.validateMpesa(str, str2, dIYBundle, str5, str4);
    }

    public final void validateMpesa(String sponsorMsisdn, String beneficiaryMsisdn, DIYBundle diyBundle, String tariff, String offerName) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(diyBundle, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        this.component3.setValue(Resource.INSTANCE.loading(null));
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(sponsorMsisdn, beneficiaryMsisdn, diyBundle, tariff, offerName, null), 3, null);
        int i2 = hashCode + 91;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel$validateMpesa$1", f = "DiyBundlesViewModel.kt", i = {}, l = {139}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int equals = 0;
        private static int getAsAtTimestamp = 1;
        final DIYBundle ShareDataUIState;
        final String component1;
        final String component2;
        final String component3;
        final String copydefault;
        int getRequestBeneficiariesState;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.getRequestBeneficiariesState;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.getRequestBeneficiariesState = 1;
                obj = DiyBundlesViewModel.access$getRepository$p(DiyBundlesViewModel.this).validateMpesa(this.component1, this.copydefault, this.ShareDataUIState, this.component3, this.component2, this);
                if (obj == coroutine_suspended) {
                    int i3 = equals + 23;
                    getAsAtTimestamp = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = getAsAtTimestamp + 3;
                equals = i5 % 128;
                int i6 = i5 % 2;
            }
            DiyBundlesViewModel.access$get_validateResult$p(DiyBundlesViewModel.this).setValue((Resource) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(String str, String str2, DIYBundle dIYBundle, String str3, String str4, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.component1 = str;
            this.copydefault = str2;
            this.ShareDataUIState = dIYBundle;
            this.component3 = str3;
            this.component2 = str4;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = DiyBundlesViewModel.this.new ShareDataUIState(this.component1, this.copydefault, this.ShareDataUIState, this.component3, this.component2, continuation);
            int i2 = getAsAtTimestamp + 17;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getAsAtTimestamp + 115;
            equals = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 51;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = getAsAtTimestamp + 103;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public static void completeMpesaPurchase$default(DiyBundlesViewModel diyBundlesViewModel, String str, String str2, DIYBundle dIYBundle, String str3, String str4, String str5, EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, int i, Object obj) {
        String str6;
        int i2 = 2 % 2;
        int i3 = hashCode;
        int i4 = i3 + 33;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0 ? (i & 16) == 0 : (i & 79) == 0) {
            str6 = str4;
        } else {
            int i5 = i3 + 83;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
            str6 = "";
        }
        diyBundlesViewModel.completeMpesaPurchase(str, str2, dIYBundle, str3, str6, (i & 32) != 0 ? dIYBundle.getProductName() : str5, easyTalkMpesaValidatedData);
    }

    public final void completeMpesaPurchase(String sponsorMsisdn, String beneficiaryMsisdn, DIYBundle diyBundle, String securityCredential, String tariff, String offerName, EasyTalkMpesaValidatedData validatedData) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sponsorMsisdn, "");
        Intrinsics.checkNotNullParameter(beneficiaryMsisdn, "");
        Intrinsics.checkNotNullParameter(diyBundle, "");
        Intrinsics.checkNotNullParameter(securityCredential, "");
        Intrinsics.checkNotNullParameter(tariff, "");
        Intrinsics.checkNotNullParameter(offerName, "");
        Intrinsics.checkNotNullParameter(validatedData, "");
        this.component1.setValue(Resource.INSTANCE.loading(null));
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(sponsorMsisdn, beneficiaryMsisdn, diyBundle, securityCredential, tariff, offerName, validatedData, null), 3, null);
        int i2 = getShareableDataState + 17;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.diybundles.DiyBundlesViewModel$completeMpesaPurchase$1", f = "DiyBundlesViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int getRequestBeneficiariesState = 0;
        private static int toString = 1;
        final DIYBundle ShareDataUIState;
        final String component1;
        final String component2;
        final String component3;
        final String component4;
        int copy;
        final String copydefault;
        final EasyTalkMpesaValidatedData equals;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.copy;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copy = 1;
                obj = DiyBundlesViewModel.access$getRepository$p(DiyBundlesViewModel.this).completeMpesaPurchase(this.component2, this.component3, this.ShareDataUIState, this.component1, this.component4, this.copydefault, this.equals, this);
                if (obj == coroutine_suspended) {
                    int i3 = toString + 45;
                    getRequestBeneficiariesState = i3 % 128;
                    int i4 = i3 % 2;
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = getRequestBeneficiariesState + 115;
                toString = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
                int i7 = getRequestBeneficiariesState + 43;
                toString = i7 % 128;
                int i8 = i7 % 2;
            }
            DiyBundlesViewModel.access$get_purchaseResult$p(DiyBundlesViewModel.this).setValue((Resource) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, String str2, DIYBundle dIYBundle, String str3, String str4, String str5, EasyTalkMpesaValidatedData easyTalkMpesaValidatedData, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component2 = str;
            this.component3 = str2;
            this.ShareDataUIState = dIYBundle;
            this.component1 = str3;
            this.component4 = str4;
            this.copydefault = str5;
            this.equals = easyTalkMpesaValidatedData;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = DiyBundlesViewModel.this.new component2(this.component2, this.component3, this.ShareDataUIState, this.component1, this.component4, this.copydefault, this.equals, continuation);
            int i2 = getRequestBeneficiariesState + 109;
            toString = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 18 / 0;
            }
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 81;
            toString = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = getRequestBeneficiariesState + 17;
            toString = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = toString + 107;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component2Var.invokeSuspend(Unit.INSTANCE);
            }
            int i4 = 76 / 0;
            return component2Var.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void resetValidation() {
        int i = 2 % 2;
        int i2 = hashCode + 103;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setValue(null);
        int i4 = getShareableDataState + 119;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void initEasyTalk(boolean isMonthlyBundles) {
        EasyTalkBundlesUiState value;
        EasyTalkBundlesUiState easyTalkBundlesUiState;
        List<String> listEmptyList;
        String str;
        int i = 2 % 2;
        int i2 = getShareableDataState + 41;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<EasyTalkBundlesUiState> mutableStateFlow = this.copydefault;
            do {
                value = mutableStateFlow.getValue();
                easyTalkBundlesUiState = value;
                listEmptyList = isMonthlyBundles ? CollectionsKt.emptyList() : this.component2;
                if (isMonthlyBundles) {
                    str = "";
                } else {
                    int i3 = hashCode + 71;
                    getShareableDataState = i3 % 128;
                    int i4 = i3 % 2;
                    str = "All";
                }
            } while (!mutableStateFlow.compareAndSet(value, EasyTalkBundlesUiState.copy$default(easyTalkBundlesUiState, isMonthlyBundles, str, listEmptyList, null, false, null, 56, null)));
            return;
        }
        throw null;
    }

    public final void onEasyTalkCategorySelected(String category) {
        EasyTalkBundlesUiState value;
        int i = 2 % 2;
        int i2 = getShareableDataState + 81;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(category, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(category, "");
        MutableStateFlow<EasyTalkBundlesUiState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, EasyTalkBundlesUiState.copy$default(value, false, category, null, null, false, null, 61, null)));
        int i3 = getShareableDataState + 39;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 29 / 0;
        }
    }

    private final void component3(HaProxyResponse<List<DIYProductCatalogResponse>> haProxyResponse, boolean z, String str) {
        Object next;
        EasyTalkBundlesUiState value;
        int i = 2 % 2;
        int i2 = getShareableDataState + 47;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.copydefault.getValue().isMonthlyBundles();
            obj.hashCode();
            throw null;
        }
        boolean zIsMonthlyBundles = this.copydefault.getValue().isMonthlyBundles();
        List<String> listEmptyList = zIsMonthlyBundles ? CollectionsKt.emptyList() : this.component2;
        List<DIYProductCatalogResponse> body = haProxyResponse != null ? haProxyResponse.getBody() : null;
        if (body == null) {
            body = CollectionsKt.emptyList();
        }
        Iterator<T> it = body.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (StringsKt.contains((CharSequence) ((DIYProductCatalogResponse) next).getPackageName(), (CharSequence) DIYProductCatalogTypes.EASY_TALK_BUNDLES.getType(), true)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        DIYProductCatalogResponse dIYProductCatalogResponse = (DIYProductCatalogResponse) next;
        ArrayList diyPackages = dIYProductCatalogResponse != null ? dIYProductCatalogResponse.getDiyPackages() : null;
        if (diyPackages == null) {
            int i3 = hashCode + 91;
            getShareableDataState = i3 % 128;
            if (i3 % 2 != 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            diyPackages = CollectionsKt.emptyList();
        }
        if (zIsMonthlyBundles) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : diyPackages) {
                if (StringsKt.contains((CharSequence) ((DIYPackage) obj2).getDiyCategoryName(), (CharSequence) "monthly", true) && (!r8.getDiyBundles().isEmpty())) {
                    int i4 = hashCode + 71;
                    getShareableDataState = i4 % 128;
                    int i5 = i4 % 2;
                    arrayList.add(obj2);
                }
            }
            diyPackages = arrayList;
        }
        List<DIYPackage> list = diyPackages;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (DIYPackage dIYPackage : list) {
            List<DIYBundle> diyBundles = dIYPackage.getDiyBundles();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(diyBundles, 10));
            Iterator<T> it2 = diyBundles.iterator();
            while (it2.hasNext()) {
                arrayList3.add(EasyTalkBundlesUiStateKt.withIcon((DIYBundle) it2.next(), R.drawable.ic_gsm_easy_talk));
            }
            arrayList2.add(DIYPackage.copy$default(dIYPackage, arrayList3, null, 2, null));
        }
        ArrayList arrayList4 = arrayList2;
        MutableStateFlow<EasyTalkBundlesUiState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, EasyTalkBundlesUiState.copy$default(value, false, null, listEmptyList, arrayList4, z, str, 3, null)));
    }

    static {
        int i = 51 % 2;
    }
}
