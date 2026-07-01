package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.checkout.constants.PayTradeTypeEnum;
import com.huawei.digitalpayment.checkout.model.response.TransferResp;
import com.huawei.digitalpayment.checkout.resp.BillInfosResp;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.AmountUtils;
import com.huawei.digitalpayment.consumer.identity.ui.activity.CheckIdentityActivity;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryHeader;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashOutValidationDetails;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashoutBody;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow;
import com.safaricom.android.design.templates.amountinput.AmountInputExtensionsKt;
import com.safaricom.android.design.templates.amountinput.model.AmountInputConfig;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import io.ktor.websocket.UtilsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.onSubMenuSelected;
import kotlin.properties.PropertyDelegateProvider;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u008c\u00012\u00020\u0001:\u0002\u008c\u0001BA\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010Q\u001a\u0004\u0018\u00010C2\b\u0010R\u001a\u0004\u0018\u00010CH\u0002J\u0006\u0010S\u001a\u00020TJ\u0006\u0010U\u001a\u00020TJ\u0006\u0010V\u001a\u00020TJ\u0006\u0010W\u001a\u00020TJ\u0006\u0010X\u001a\u00020TJ\u0006\u0010Y\u001a\u00020TJ\u000e\u0010Z\u001a\u00020T2\u0006\u0010[\u001a\u00020\u001bJ\u000e\u0010\\\u001a\u00020T2\u0006\u0010[\u001a\u00020\u001bJ\u0006\u0010]\u001a\u00020TJ\u0006\u0010^\u001a\u00020TJ\u0006\u0010_\u001a\u00020TJ\u0006\u0010`\u001a\u00020TJ\u0006\u0010a\u001a\u00020TJ\u000e\u0010b\u001a\u00020T2\u0006\u0010#\u001a\u00020\u001bJ\u000e\u0010c\u001a\b\u0012\u0004\u0012\u00020e0dH\u0002J\b\u0010f\u001a\u00020TH\u0002J\b\u0010g\u001a\u00020TH\u0002J\u0006\u0010h\u001a\u00020TJ\u0006\u0010i\u001a\u00020TJ\b\u0010j\u001a\u00020kH\u0002J%\u0010l\u001a\u00020m2\n\b\u0002\u0010n\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010o\u001a\u0004\u0018\u00010pH\u0002¢\u0006\u0002\u0010qJ\u0018\u0010r\u001a\u00020m2\u000e\b\u0002\u0010s\u001a\b\u0012\u0004\u0012\u00020t0:H\u0002J\"\u0010u\u001a\u00020m2\b\b\u0002\u0010'\u001a\u00020\u001b2\u000e\b\u0002\u0010s\u001a\b\u0012\u0004\u0012\u00020t0:H\u0002J\b\u0010v\u001a\u00020TH\u0002J\u0012\u0010w\u001a\u00020T2\b\u0010x\u001a\u0004\u0018\u00010yH\u0002J\u0010\u0010z\u001a\u00020T2\u0006\u0010{\u001a\u00020|H\u0002J\u0010\u0010}\u001a\u00020T2\u0006\u0010{\u001a\u00020|H\u0002J\u0006\u0010~\u001a\u00020mJ\u0006\u0010\u007f\u001a\u00020\u001bJ\u0007\u0010\u0080\u0001\u001a\u00020\u001bJ\u0015\u0010\u0081\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u0001J\n\u0010\u0084\u0001\u001a\u00030\u0085\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00020T2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0088\u0001J\u0010\u0010\u0089\u0001\u001a\u00020T2\u0007\u0010R\u001a\u00030\u008a\u0001J\u000f\u0010\u0089\u0001\u001a\u00020T2\u0006\u0010R\u001a\u00020CJ\t\u0010\u008b\u0001\u001a\u00020TH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u001b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R(\u0010)\u001a\u0004\u0018\u00010(2\b\u0010'\u001a\u0004\u0018\u00010(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u0001000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020(\u0018\u00010002¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020602¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0:02¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020?02¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0019\u0010B\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010C02¢\u0006\b\n\u0000\u001a\u0004\bD\u00104R(\u0010F\u001a\u0004\u0018\u00010E2\b\u0010'\u001a\u0004\u0018\u00010E8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010'\u001a\u0004\u0018\u00010K8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006\u008d\u0001"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutViewModel;", "Landroidx/lifecycle/ViewModel;", "limitsRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionLimitsRepository;", "featuresRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeaturesRepository;", "nameCheckRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionNameCheckRepository;", "validationRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionValidationRepository;", "currencyRepository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepository;", "errorHandler", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutErrorHandler;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionLimitsRepository;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionFeaturesRepository;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionNameCheckRepository;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/TransactionValidationRepository;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/CurrencyRepository;Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutErrorHandler;Landroidx/lifecycle/SavedStateHandle;)V", "amountConfig", "Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "getAmountConfig", "()Lcom/safaricom/android/design/templates/amountinput/model/AmountInputConfig;", "transactionFlow", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "getTransactionFlow", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/TransactionFlow;", "<set-?>", "", "amount", "getAmount", "()Ljava/lang/String;", "setAmount", "(Ljava/lang/String;)V", "amount$delegate", "Lkotlin/properties/ReadWriteProperty;", "agentNumber", "getAgentNumber", "setAgentNumber", "agentNumber$delegate", "value", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "currentTransactionScreen", "getCurrentTransactionScreen", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "setCurrentTransactionScreen", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;)V", "_transactionScreenState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "transactionScreenState", "Lkotlinx/coroutines/flow/StateFlow;", "getTransactionScreenState", "()Lkotlinx/coroutines/flow/StateFlow;", "_loadingState", "", "loadingState", "getLoadingState", "_confirmInfoState", "", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem;", "confirmState", "getConfirmState", "_countryHeaderData", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/CountryHeader;", "countryHeaderData", "getCountryHeaderData", "errorState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorState;", "getErrorState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/CustomerItem;", "agentDetails", "getAgentDetails", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/CustomerItem;", "setAgentDetails", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/CustomerItem;)V", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashOutValidationDetails;", "roamingCashOutValidationDetails", "getRoamingCashOutValidationDetails", "()Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashOutValidationDetails;", "setRoamingCashOutValidationDetails", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/RoamingCashOutValidationDetails;)V", "interceptErrors", "error", "initializeCurrentScreen", "", "nextScreen", "previousScreen", "showValidationScreen", "onCloseValidationScreen", "onRetry", "onNumberChanged", "input", "onAmountChanged", "onBackClick", "onContinueClick", "onConfirmClick", "onErrorHandled", "clearError", "createCustomerDetails", "getValidateTransactionData", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/ValidateTransactionData;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/GlobalTransactionData$RoamingCashOut;", "setConfirmationDataForInvalidAgent", "setConfirmationDataForMaxAmountReached", "setConfirmationDataForValidAgent", "setConfirmationDataWithCurrentDetails", "getConfirmationHeader", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Header;", "getConfirmationAgentName", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Content;", "agentName", "agentNameRes", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$Content;", "getConfirmationAgentNumber", "additionalInfo", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/model/ConfirmItem$AdditionalInfoType;", "getConfirmationAmountInTsh", "agentNameCheck", "validateRoamingCashOut", "lineItem", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/api/model/RoamingCashoutResponseDto$Response$LineItem;", "handleConfirmationError", "errorType", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/errorhandling/ErrorType;", "handleValidationError", "getAmountInKsh", "getTransactionAmount", "getOwnMsisdn", "getProcessTransactionData", "", "", "getBillInfo", "Lcom/huawei/digitalpayment/checkout/resp/BillInfosResp;", "onProcessTransactionSuccess", "transferResponse", "Lcom/huawei/digitalpayment/checkout/model/response/TransferResp;", "onProcessTransactionError", "Lcom/huawei/common/exception/BaseException;", "navigateToTransactionError", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoamingCashOutViewModel extends ViewModel {
    public static final String RECEIVER_SHORT_CODE = "499776";
    public static final String RECEIVER_TRANSACTION_TYPE = "PayBill";
    private static final String ShareDataUIState = "KEY_AGENT_DETAILS";

    private static int f2713a = 0;

    private static int f2714c = 1;
    private static final String component2 = "KEY_ROAMING_CASH_OUT_DETAILS";
    private static final String component3 = "KEY_CURRENT_TRANSACTION_SCREEN";
    private static final String copydefault = "TZS";

    private static int f2715d = 0;
    private static int invokeSuspend = 1;
    private final CurrencyRepository ArtificialStackFrames;
    private final SavedStateHandle CoroutineDebuggingKt;
    private final StateFlow<ErrorState> accessartificialFrame;

    private final StateFlow<ScreenInformation<MPesaGlobalScreen>> f2716b;
    private final ReadWriteProperty component4;
    private final MutableStateFlow<List<ConfirmItem>> copy;
    private final StateFlow<Boolean> coroutineBoundary;
    private final TransactionNameCheckRepository coroutineCreation;
    private final MutableStateFlow<ScreenInformation<MPesaGlobalScreen>> equals;
    private final RoamingCashOutErrorHandler getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final MutableStateFlow<CountryHeader> getAsAtTimestamp;
    private final MutableStateFlow<Boolean> getRequestBeneficiariesState;
    private final StateFlow<List<ConfirmItem>> getShareableDataState;
    private final ReadWriteProperty getSponsorBeneficiariesState;
    private final StateFlow<CountryHeader> hashCode;
    private final TransactionValidationRepository invoke;
    private final AmountInputConfig toString;
    static final KProperty<Object>[] component1 = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RoamingCashOutViewModel.class, "amount", "getAmount()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RoamingCashOutViewModel.class, "agentNumber", "getAgentNumber()Ljava/lang/String;", 0))};

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static Object component3(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i2;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~((~i5) | i8 | i3);
        int i11 = i9 | i10;
        int i12 = ~(i8 | i3);
        int i13 = (~(i5 | i7)) | (~(i7 | i2)) | i10;
        int i14 = i3 + i2 + i6 + (1787548100 * i) + (1101416392 * i4);
        int i15 = i14 * i14;
        int i16 = (((-61410478) * i3) - 623378432) + (561581232 * i2) + (i11 * (-311495855)) + ((-311495855) * i12) + (311495855 * i13) + (250085376 * i6) + ((-778043392) * i) + ((-46137344) * i4) + (324403200 * i15);
        int i17 = (i3 * (-930662234)) + 656878810 + (i2 * (-930660720)) + (i11 * (-757)) + (i12 * (-757)) + (i13 * 757) + (i6 * (-930661477)) + (i * 2052861356) + (i4 * 749768216) + (i15 * (-2028863488));
        int i18 = i16 + (i17 * i17 * (-1850081280));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? ShareDataUIState(objArr) : component2(objArr) : component3(objArr) : copydefault(objArr) : component1(objArr);
    }

    public static final TransactionNameCheckRepository access$getNameCheckRepository$p(RoamingCashOutViewModel roamingCashOutViewModel) {
        int i = 2 % 2;
        int i2 = f2713a;
        int i3 = i2 + 23;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        TransactionNameCheckRepository transactionNameCheckRepository = roamingCashOutViewModel.coroutineCreation;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 123;
        f2714c = i5 % 128;
        if (i5 % 2 != 0) {
            return transactionNameCheckRepository;
        }
        obj.hashCode();
        throw null;
    }

    public static final TransactionValidationRepository access$getValidationRepository$p(RoamingCashOutViewModel roamingCashOutViewModel) {
        int i = 2 % 2;
        int i2 = f2714c + 99;
        int i3 = i2 % 128;
        f2713a = i3;
        int i4 = i2 % 2;
        TransactionValidationRepository transactionValidationRepository = roamingCashOutViewModel.invoke;
        int i5 = i3 + 59;
        f2714c = i5 % 128;
        if (i5 % 2 != 0) {
            return transactionValidationRepository;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_loadingState$p(RoamingCashOutViewModel roamingCashOutViewModel) {
        int i = 2 % 2;
        int i2 = f2713a;
        int i3 = i2 + 73;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<Boolean> mutableStateFlow = roamingCashOutViewModel.getRequestBeneficiariesState;
        int i5 = i2 + 11;
        f2714c = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final void access$handleConfirmationError(RoamingCashOutViewModel roamingCashOutViewModel, ErrorType errorType) {
        int i = 2 % 2;
        int i2 = f2713a + 15;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutViewModel.component2(errorType);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$handleValidationError(RoamingCashOutViewModel roamingCashOutViewModel, ErrorType errorType) {
        int i = 2 % 2;
        int i2 = f2714c + 49;
        f2713a = i2 % 128;
        if (i2 % 2 == 0) {
            int iCopydefault = UtilsKt.copydefault();
            int iCopydefault2 = UtilsKt.copydefault();
            component3(UtilsKt.copydefault(), new Object[]{roamingCashOutViewModel, errorType}, -749533255, 749533256, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
            return;
        }
        int iCopydefault3 = UtilsKt.copydefault();
        int iCopydefault4 = UtilsKt.copydefault();
        component3(UtilsKt.copydefault(), new Object[]{roamingCashOutViewModel, errorType}, -749533255, 749533256, UtilsKt.copydefault(), iCopydefault3, iCopydefault4);
        int i3 = 11 / 0;
    }

    public static final ErrorState access$interceptErrors(RoamingCashOutViewModel roamingCashOutViewModel, ErrorState errorState) {
        int i = 2 % 2;
        int i2 = f2713a + 85;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        ErrorState errorStateCopydefault = roamingCashOutViewModel.copydefault(errorState);
        int i4 = f2713a + 83;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
        return errorStateCopydefault;
    }

    public static final void access$setAgentDetails(RoamingCashOutViewModel roamingCashOutViewModel, CustomerItem customerItem) {
        int i = 2 % 2;
        int i2 = f2713a + 29;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutViewModel.component2(customerItem);
        int i4 = f2713a + 87;
        f2714c = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
    }

    public static final void access$setRoamingCashOutValidationDetails(RoamingCashOutViewModel roamingCashOutViewModel, RoamingCashOutValidationDetails roamingCashOutValidationDetails) {
        int i = 2 % 2;
        int i2 = f2713a + 71;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        roamingCashOutViewModel.component2(roamingCashOutValidationDetails);
        int i4 = f2713a + 111;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$validateRoamingCashOut(RoamingCashOutViewModel roamingCashOutViewModel, RoamingCashoutResponseDto.Response.LineItem lineItem) {
        int i = 2 % 2;
        int i2 = f2714c + 63;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        component3(UtilsKt.copydefault(), new Object[]{roamingCashOutViewModel, lineItem}, -1291738277, 1291738277, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
        int i4 = f2714c + 41;
        f2713a = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public RoamingCashOutViewModel(TransactionLimitsRepository transactionLimitsRepository, TransactionFeaturesRepository transactionFeaturesRepository, TransactionNameCheckRepository transactionNameCheckRepository, TransactionValidationRepository transactionValidationRepository, CurrencyRepository currencyRepository, RoamingCashOutErrorHandler roamingCashOutErrorHandler, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(transactionLimitsRepository, "");
        Intrinsics.checkNotNullParameter(transactionFeaturesRepository, "");
        Intrinsics.checkNotNullParameter(transactionNameCheckRepository, "");
        Intrinsics.checkNotNullParameter(transactionValidationRepository, "");
        Intrinsics.checkNotNullParameter(currencyRepository, "");
        Intrinsics.checkNotNullParameter(roamingCashOutErrorHandler, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.coroutineCreation = transactionNameCheckRepository;
        this.invoke = transactionValidationRepository;
        this.ArtificialStackFrames = currencyRepository;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = roamingCashOutErrorHandler;
        this.CoroutineDebuggingKt = savedStateHandle;
        double dDoubleValue = transactionLimitsRepository.getMinAmount(TransactionType.ROAMING_CASH_OUT).doubleValue();
        double dDoubleValue2 = transactionLimitsRepository.getMaxAmount(TransactionType.ROAMING_CASH_OUT).doubleValue();
        this.toString = new AmountInputConfig("TSH", Double.valueOf(dDoubleValue), Double.valueOf(dDoubleValue2), false, false, false, true, transactionFeaturesRepository.isOverdraftEnabled(TransactionType.ROAMING_CASH_OUT), false, false, true, null, 2048, null);
        PropertyDelegateProvider propertyDelegateProviderSaveableMutableState$default = SavedStateHandleSaverKt.saveableMutableState$default(savedStateHandle, null, new Function0() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component1 + 43;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                MutableState mutableState$r8$lambda$BhVFseewIsKyl9Dvbn8cvxlAozw = RoamingCashOutViewModel.$r8$lambda$BhVFseewIsKyl9Dvbn8cvxlAozw();
                if (i3 == 0) {
                    int i4 = 49 / 0;
                }
                return mutableState$r8$lambda$BhVFseewIsKyl9Dvbn8cvxlAozw;
            }
        }, 1, null);
        KProperty<?>[] kPropertyArr = component1;
        this.getSponsorBeneficiariesState = (ReadWriteProperty) propertyDelegateProviderSaveableMutableState$default.provideDelegate(this, kPropertyArr[0]);
        this.component4 = (ReadWriteProperty) SavedStateHandleSaverKt.saveableMutableState$default(savedStateHandle, null, new Function0() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = component2 + 1;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                MutableState mutableState$r8$lambda$_u2yGcmVLOR58ug1cUOiakzJqRQ = RoamingCashOutViewModel.$r8$lambda$_u2yGcmVLOR58ug1cUOiakzJqRQ();
                int i4 = component3 + 57;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return mutableState$r8$lambda$_u2yGcmVLOR58ug1cUOiakzJqRQ;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, 1, null).provideDelegate(this, kPropertyArr[1]);
        MutableStateFlow<ScreenInformation<MPesaGlobalScreen>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.equals = MutableStateFlow;
        this.f2716b = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this.getRequestBeneficiariesState = MutableStateFlow2;
        this.coroutineBoundary = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<ConfirmItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.copy = MutableStateFlow3;
        this.getShareableDataState = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<CountryHeader> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new CountryHeader(R.string.roamingCashOut_countryHeader_title, Integer.valueOf(R.drawable.ic_flag_tanzania), "Tanzania"));
        this.getAsAtTimestamp = MutableStateFlow4;
        this.hashCode = FlowKt.asStateFlow(MutableStateFlow4);
        final StateFlow<ErrorState> errorState = roamingCashOutErrorHandler.getErrorState();
        this.accessartificialFrame = FlowKt.stateIn(new Flow<ErrorState>() {
            private static int component1 = 1;
            private static int component2;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int ShareDataUIState = 1;
                private static int component3;
                final RoamingCashOutViewModel component1;
                final FlowCollector component2;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1$2", f = "RoamingCashOutViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component3 = 0;
                    private static int copydefault = 1;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = copydefault + 5;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                        if (i3 != 0) {
                            anonymousClass2.emit(null, this);
                            throw null;
                        }
                        Object objEmit = anonymousClass2.emit(null, this);
                        int i4 = copydefault + 25;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r1 == 0) goto L17
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 & r3
                        if (r2 == 0) goto L17
                        int r7 = r1.label
                        int r7 = r7 + r3
                        r1.label = r7
                        goto L1c
                    L17:
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L1c:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r3 = r1.label
                        r4 = 1
                        if (r3 == 0) goto L3e
                        if (r3 != r4) goto L36
                        kotlin.ResultKt.throwOnFailure(r7)
                        int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.ShareDataUIState
                        int r6 = r6 + 67
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.component3 = r7
                        int r6 = r6 % r0
                        goto L66
                    L36:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L3e:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                        r3 = r1
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState) r6
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel r3 = r5.component1
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorState r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.access$interceptErrors(r3, r6)
                        r1.label = r4
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r2) goto L66
                        int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.ShareDataUIState
                        int r6 = r6 + 81
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.component3 = r7
                        int r6 = r6 % r0
                        if (r6 == 0) goto L65
                        r6 = 60
                        int r6 = r6 / 0
                    L65:
                        return r2
                    L66:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector, RoamingCashOutViewModel roamingCashOutViewModel) {
                    this.component2 = flowCollector;
                    this.component1 = roamingCashOutViewModel;
                }
            }

            @Override
            public Object collect(FlowCollector<? super ErrorState> flowCollector, Continuation continuation) {
                int i = 2 % 2;
                Object objCollect = errorState.collect(new AnonymousClass2(flowCollector, this), continuation);
                Object obj = null;
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i2 = component1 + 41;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return objCollect;
                    }
                    obj.hashCode();
                    throw null;
                }
                Unit unit = Unit.INSTANCE;
                int i3 = component2 + 39;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return unit;
                }
                obj.hashCode();
                throw null;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getEagerly(), null);
        clearError();
        initializeCurrentScreen();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/transactions/roamingcashout/RoamingCashOutViewModel$Companion;", "", "<init>", "()V", "DESTINATION_CURRENCY_CODE", "", "RECEIVER_SHORT_CODE", "RECEIVER_TRANSACTION_TYPE", RoamingCashOutViewModel.component3, RoamingCashOutViewModel.ShareDataUIState, RoamingCashOutViewModel.component2, "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AmountInputConfig getAmountConfig() {
        int i = 2 % 2;
        int i2 = f2714c + 123;
        int i3 = i2 % 128;
        f2713a = i3;
        int i4 = i2 % 2;
        AmountInputConfig amountInputConfig = this.toString;
        int i5 = i3 + 25;
        f2714c = i5 % 128;
        if (i5 % 2 != 0) {
            return amountInputConfig;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TransactionFlow getTransactionFlow() {
        int i = 2 % 2;
        int i2 = f2713a + 79;
        f2714c = i2 % 128;
        if (i2 % 2 == 0) {
            TransactionFlow transactionFlow = (TransactionFlow) this.CoroutineDebuggingKt.get(RoamingCashOutActivity.FLOW_KEY);
            int i3 = 69 / 0;
            if (transactionFlow != null) {
                return transactionFlow;
            }
        } else {
            TransactionFlow transactionFlow2 = (TransactionFlow) this.CoroutineDebuggingKt.get(RoamingCashOutActivity.FLOW_KEY);
            if (transactionFlow2 != null) {
                return transactionFlow2;
            }
        }
        TransactionFlow.Regular regular = TransactionFlow.Regular.INSTANCE;
        int i4 = f2713a + 49;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
        return regular;
    }

    static {
        int i = invokeSuspend + 17;
        f2715d = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static final MutableState component1() {
        int i = 2 % 2;
        int i2 = f2713a + 121;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        int i4 = f2713a + 99;
        f2714c = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableStateMutableStateOf$default;
        }
        throw null;
    }

    public final String getAmount() {
        ReadWriteProperty readWriteProperty;
        KProperty<?> kProperty;
        int i = 2 % 2;
        int i2 = f2713a + 55;
        f2714c = i2 % 128;
        if (i2 % 2 == 0) {
            readWriteProperty = this.getSponsorBeneficiariesState;
            kProperty = component1[1];
        } else {
            readWriteProperty = this.getSponsorBeneficiariesState;
            kProperty = component1[0];
        }
        String str = (String) readWriteProperty.getValue(this, kProperty);
        int i3 = f2713a + 49;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final void setAmount(String str) {
        ReadWriteProperty readWriteProperty;
        KProperty<?> kProperty;
        int i = 2 % 2;
        int i2 = f2713a + 47;
        f2714c = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            readWriteProperty = this.getSponsorBeneficiariesState;
            kProperty = component1[0];
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            readWriteProperty = this.getSponsorBeneficiariesState;
            kProperty = component1[0];
        }
        readWriteProperty.setValue(this, kProperty, str);
        int i3 = f2713a + 47;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final MutableState ShareDataUIState() {
        int i = 2 % 2;
        int i2 = f2714c + 19;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        int i4 = f2713a + 51;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
        return mutableStateMutableStateOf$default;
    }

    public final String getAgentNumber() {
        int i = 2 % 2;
        int i2 = f2713a + 109;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.component4.getValue(this, component1[1]);
        int i4 = f2713a + 45;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final void setAgentNumber(String str) {
        int i = 2 % 2;
        int i2 = f2713a + 101;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component4.setValue(this, component1[1], str);
        int i4 = f2713a + 109;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
    }

    private final MPesaGlobalScreen copy() {
        int i = 2 % 2;
        int i2 = f2714c + 79;
        f2713a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MPesaGlobalScreen mPesaGlobalScreen = (MPesaGlobalScreen) this.CoroutineDebuggingKt.get(component3);
        int i3 = f2713a + 111;
        f2714c = i3 % 128;
        if (i3 % 2 != 0) {
            return mPesaGlobalScreen;
        }
        throw null;
    }

    private final void component2(MPesaGlobalScreen mPesaGlobalScreen) {
        int i = 2 % 2;
        int i2 = f2714c + 95;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        this.CoroutineDebuggingKt.set(component3, mPesaGlobalScreen);
        int i4 = f2713a + 53;
        f2714c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final StateFlow<ScreenInformation<MPesaGlobalScreen>> getTransactionScreenState() {
        int i = 2 % 2;
        int i2 = f2713a;
        int i3 = i2 + 1;
        f2714c = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        StateFlow<ScreenInformation<MPesaGlobalScreen>> stateFlow = this.f2716b;
        int i4 = i2 + 121;
        f2714c = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 61 / 0;
        }
        return stateFlow;
    }

    public final StateFlow<Boolean> getLoadingState() {
        int i = 2 % 2;
        int i2 = f2714c;
        int i3 = i2 + 33;
        f2713a = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        StateFlow<Boolean> stateFlow = this.coroutineBoundary;
        int i4 = i2 + 95;
        f2713a = i4 % 128;
        if (i4 % 2 == 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow<List<ConfirmItem>> getConfirmState() {
        int i = 2 % 2;
        int i2 = f2714c;
        int i3 = i2 + 105;
        f2713a = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<List<ConfirmItem>> stateFlow = this.getShareableDataState;
        int i5 = i2 + 73;
        f2713a = i5 % 128;
        if (i5 % 2 == 0) {
            return stateFlow;
        }
        throw null;
    }

    public final StateFlow<CountryHeader> getCountryHeaderData() {
        int i = 2 % 2;
        int i2 = f2713a + 77;
        f2714c = i2 % 128;
        if (i2 % 2 != 0) {
            return this.hashCode;
        }
        throw null;
    }

    public final StateFlow<ErrorState> getErrorState() {
        int i = 2 % 2;
        int i2 = f2713a + 9;
        f2714c = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accessartificialFrame;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final CustomerItem component2() {
        int i = 2 % 2;
        int i2 = f2714c + 71;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        CustomerItem customerItem = (CustomerItem) this.CoroutineDebuggingKt.get(ShareDataUIState);
        int i4 = f2713a + 11;
        f2714c = i4 % 128;
        if (i4 % 2 != 0) {
            return customerItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void component2(CustomerItem customerItem) {
        int i = 2 % 2;
        int i2 = f2714c + 7;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        this.CoroutineDebuggingKt.set(ShareDataUIState, customerItem);
        int i4 = f2713a + 27;
        f2714c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final RoamingCashOutValidationDetails component4() {
        int i = 2 % 2;
        int i2 = f2714c + 31;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutValidationDetails roamingCashOutValidationDetails = (RoamingCashOutValidationDetails) this.CoroutineDebuggingKt.get(component2);
        int i4 = f2714c + 39;
        f2713a = i4 % 128;
        int i5 = i4 % 2;
        return roamingCashOutValidationDetails;
    }

    private final void component2(RoamingCashOutValidationDetails roamingCashOutValidationDetails) {
        int i = 2 % 2;
        int i2 = f2714c + 107;
        f2713a = i2 % 128;
        if (i2 % 2 == 0) {
            this.CoroutineDebuggingKt.set(component2, roamingCashOutValidationDetails);
            return;
        }
        this.CoroutineDebuggingKt.set(component2, roamingCashOutValidationDetails);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final ErrorState copydefault(ErrorState errorState) {
        int i = 2 % 2;
        int i2 = f2713a;
        int i3 = i2 + 1;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        if (errorState instanceof ErrorState.ErrorData.InvalidTillNumber) {
            int i5 = i2 + 89;
            f2714c = i5 % 128;
            if (i5 % 2 != 0) {
                ArtificialStackFrames();
                return ErrorState.ErrorHandled.INSTANCE;
            }
            ArtificialStackFrames();
            ErrorState.ErrorHandled errorHandled = ErrorState.ErrorHandled.INSTANCE;
            throw null;
        }
        if (!Intrinsics.areEqual(errorState, ErrorState.ErrorData.Transaction.GlobalTransactions.MaxAmountReached.INSTANCE)) {
            return errorState;
        }
        int i6 = f2713a + 77;
        f2714c = i6 % 128;
        if (i6 % 2 != 0) {
            getShareableDataState();
            return ErrorState.ErrorHandled.INSTANCE;
        }
        getShareableDataState();
        ErrorState.ErrorHandled errorHandled2 = ErrorState.ErrorHandled.INSTANCE;
        obj.hashCode();
        throw null;
    }

    public final void initializeCurrentScreen() {
        int i = 2 % 2;
        int i2 = f2713a + 27;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        if (copy() == null) {
            if (getTransactionFlow().isInteractive()) {
                MPesaGlobalScreen.RecipientDetails recipientDetails = MPesaGlobalScreen.RecipientDetails.INSTANCE;
                component2(recipientDetails);
                this.equals.setValue(new ScreenInformation<>(recipientDetails, ScreenDirection.NONE));
            } else {
                MPesaGlobalScreen.AmountDetails amountDetails = MPesaGlobalScreen.AmountDetails.INSTANCE;
                component2(amountDetails);
                this.equals.setValue(new ScreenInformation<>(amountDetails, ScreenDirection.NONE));
                int i4 = f2714c + 93;
                f2713a = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        int i6 = f2713a + 123;
        f2714c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 27 / 0;
        }
    }

    public final void nextScreen() {
        int i = 2 % 2;
        int i2 = f2714c + 23;
        f2713a = i2 % 128;
        if (i2 % 2 == 0) {
            if (copy() instanceof MPesaGlobalScreen.RecipientDetails) {
                MPesaGlobalScreen.Confirmation confirmation = MPesaGlobalScreen.Confirmation.INSTANCE;
                component2(confirmation);
                this.equals.setValue(new ScreenInformation<>(confirmation, ScreenDirection.FORWARD));
            }
            int i3 = f2714c + 57;
            f2713a = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        boolean z = copy() instanceof MPesaGlobalScreen.RecipientDetails;
        throw null;
    }

    public final void previousScreen() {
        MPesaGlobalScreen.Confirmation confirmation;
        MPesaGlobalScreen.Close close;
        int i;
        int i2 = 2 % 2;
        int i3 = f2714c + 105;
        f2713a = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            MPesaGlobalScreen mPesaGlobalScreenCopy = copy();
            if (!(!(mPesaGlobalScreenCopy instanceof MPesaGlobalScreen.RecipientDetails))) {
                confirmation = MPesaGlobalScreen.Close.INSTANCE;
            } else if (mPesaGlobalScreenCopy instanceof MPesaGlobalScreen.Confirmation) {
                int i4 = f2713a + 97;
                f2714c = i4 % 128;
                if (i4 % 2 == 0) {
                    getTransactionFlow().isInteractive();
                    obj.hashCode();
                    throw null;
                }
                if (!(!getTransactionFlow().isInteractive())) {
                    close = MPesaGlobalScreen.RecipientDetails.INSTANCE;
                    i = f2713a + 111;
                    f2714c = i % 128;
                } else {
                    close = MPesaGlobalScreen.Close.INSTANCE;
                    i = f2714c + 69;
                    f2713a = i % 128;
                }
                int i5 = i % 2;
                confirmation = close;
            } else if (!(mPesaGlobalScreenCopy instanceof MPesaGlobalScreen.Validation)) {
                return;
            } else {
                confirmation = MPesaGlobalScreen.Confirmation.INSTANCE;
            }
            component2(confirmation);
            this.equals.setValue(new ScreenInformation<>(confirmation, ScreenDirection.BACK));
            return;
        }
        boolean z = copy() instanceof MPesaGlobalScreen.RecipientDetails;
        throw null;
    }

    public final void showValidationScreen() {
        int i = 2 % 2;
        this.equals.setValue(new ScreenInformation<>(MPesaGlobalScreen.Validation.INSTANCE, ScreenDirection.FORWARD));
        int i2 = f2714c + 113;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onCloseValidationScreen() {
        int i = 2 % 2;
        this.equals.setValue(new ScreenInformation<>(MPesaGlobalScreen.Confirmation.INSTANCE, ScreenDirection.NONE));
        int i2 = f2714c + 27;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onRetry() {
        int i = 2 % 2;
        MPesaGlobalScreen.RecipientDetails recipientDetails = MPesaGlobalScreen.RecipientDetails.INSTANCE;
        component2(recipientDetails);
        this.equals.setValue(new ScreenInformation<>(recipientDetails, ScreenDirection.NONE));
        int i2 = f2713a + 31;
        f2714c = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 67 / 0;
        }
    }

    public final void onNumberChanged(String input) {
        int i = 2 % 2;
        int i2 = f2714c + 45;
        f2713a = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(input, "");
            setAgentNumber(input);
        } else {
            Intrinsics.checkNotNullParameter(input, "");
            setAgentNumber(input);
            throw null;
        }
    }

    public final void onAmountChanged(String input) {
        int i = 2 % 2;
        int i2 = f2714c + 47;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(input, "");
        setAmount(input);
        int i4 = f2713a + 91;
        f2714c = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onBackClick() {
        int i = 2 % 2;
        int i2 = f2713a + 1;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        previousScreen();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onContinueClick() {
        int i = 2 % 2;
        int i2 = f2713a + 57;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        createCustomerDetails(getAgentNumber());
        copydefault();
        nextScreen();
        int i4 = f2713a + 79;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onConfirmClick() {
        int i = 2 % 2;
        int i2 = f2714c + 17;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        if (getTransactionFlow().isInteractive()) {
            int i4 = f2714c + 37;
            f2713a = i4 % 128;
            int i5 = i4 % 2;
            showValidationScreen();
        } else {
            this.equals.setValue(new ScreenInformation<>(MPesaGlobalScreen.FinishSuccess.INSTANCE, ScreenDirection.FORWARD));
        }
        int i6 = f2713a + 91;
        f2714c = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 97 / 0;
        }
    }

    public final void onErrorHandled() {
        int i = 2 % 2;
        int i2 = f2714c + 47;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.markErrorAsHandled();
        int i4 = f2713a + 39;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void clearError() {
        int i = 2 % 2;
        int i2 = f2713a + 77;
        f2714c = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.clearError();
            obj.hashCode();
            throw null;
        }
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.clearError();
        int i3 = f2714c + 17;
        f2713a = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void createCustomerDetails(String agentNumber) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(agentNumber, "");
        Object obj = null;
        component2(new CustomerItem(agentNumber, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0));
        int i2 = f2713a + 77;
        f2714c = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046 A[PHI: r1 r2 r3 r4 r5 r6
  0x0046: PHI (r1v19 int) = (r1v4 int), (r1v5 int), (r1v20 int) binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r2v5 int) = (r2v1 int), (r2v2 int), (r2v6 int) binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r3v7 int) = (r3v0 int), (r3v1 int), (r3v8 int) binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r4v8 int) = (r4v0 int), (r4v1 int), (r4v9 int) binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r5v5 int) = (r5v0 int), (r5v1 int), (r5v6 int) binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r6v4 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType) = 
  (r6v0 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType)
  (r6v1 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType)
  (r6v5 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType)
 binds: [B:8:0x0035, B:10:0x0044, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037 A[PHI: r1 r2 r3 r4 r5 r6 r7
  0x0037: PHI (r1v5 int) = (r1v4 int), (r1v20 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r2v2 int) = (r2v1 int), (r2v6 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r3v1 int) = (r3v0 int), (r3v8 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r4v1 int) = (r4v0 int), (r4v9 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r5v1 int) = (r5v0 int), (r5v6 int) binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r6v1 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType) = 
  (r6v0 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType)
  (r6v5 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType)
 binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x0037: PHI (r7v1 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem) = 
  (r7v0 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem)
  (r7v6 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem)
 binds: [B:8:0x0035, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.ValidateTransactionData<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData.RoamingCashOut> getRequestBeneficiariesState() {
        /*
            r16 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L25
            int r1 = com.huawei.digitalpayment.consumer.sfc.global.R.drawable.ic_vodafone_logo
            int r2 = com.huawei.digitalpayment.consumer.sfc.global.R.drawable.ic_flag_tanzania
            int r3 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_title
            int r4 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_agentName
            int r5 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_feeTitle
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType.ROAMING_CASH_OUT
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem r7 = r16.component2()
            r8 = 93
            int r8 = r8 / 0
            if (r7 == 0) goto L46
            goto L37
        L25:
            int r1 = com.huawei.digitalpayment.consumer.sfc.global.R.drawable.ic_vodafone_logo
            int r2 = com.huawei.digitalpayment.consumer.sfc.global.R.drawable.ic_flag_tanzania
            int r3 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_title
            int r4 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_agentName
            int r5 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_feeTitle
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.TransactionType.ROAMING_CASH_OUT
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem r7 = r16.component2()
            if (r7 == 0) goto L46
        L37:
            int r8 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r8 = r8 + 61
            int r9 = r8 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r9
            int r8 = r8 % r0
            java.lang.String r7 = r7.getCustomerNumber()
            if (r7 != 0) goto L4a
        L46:
            java.lang.String r7 = r16.getAgentNumber()
        L4a:
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r14 = r6
            r2 = r7
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashOutValidationDetails r1 = r16.component4()
            if (r1 == 0) goto L6e
            int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r3 = r3 + 115
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L69
            java.math.BigDecimal r1 = r1.getOriginAmount()
            if (r1 != 0) goto L70
            goto L6e
        L69:
            r1.getOriginAmount()
            r0 = 0
            throw r0
        L6e:
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
        L70:
            r3 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashOutValidationDetails r1 = r16.component4()
            if (r1 == 0) goto L89
            int r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r4 = r4 + 37
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r5
            int r4 = r4 % r0
            java.math.BigDecimal r0 = r1.getTargetAmount()
            if (r0 != 0) goto L8b
        L89:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L8b:
            r4 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashOutValidationDetails r0 = r16.component4()
            if (r0 == 0) goto L9b
            java.math.BigDecimal r0 = r0.getFee()
            if (r0 != 0) goto L9d
        L9b:
            java.math.BigDecimal r0 = java.math.BigDecimal.ZERO
        L9d:
            r5 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r0 = r16
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.CurrencyRepository r1 = r0.ArtificialStackFrames
            java.lang.String r6 = r1.getCurrency()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.RoamingCashOutValidationDetails r1 = r16.component4()
            if (r1 == 0) goto Lb5
            java.lang.String r1 = r1.getValidationId()
            if (r1 != 0) goto Lb7
        Lb5:
            java.lang.String r1 = ""
        Lb7:
            r7 = r1
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData$RoamingCashOut r8 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData$RoamingCashOut
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r15 = r8
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData r15 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.GlobalTransactionData) r15
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.ValidateTransactionData r1 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.ValidateTransactionData
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.getRequestBeneficiariesState():com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.ValidateTransactionData");
    }

    private final void ArtificialStackFrames() {
        int i = 2 % 2;
        MutableStateFlow<List<ConfirmItem>> mutableStateFlow = this.copy;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(equals());
        listCreateListBuilder.add(copydefault(this, null, Integer.valueOf(R.string.roamingCashOut_error_confirmation_agentNotFound), 1, null));
        listCreateListBuilder.add((ConfirmItem.Content) component3(UtilsKt.copydefault(), new Object[]{this, CollectionsKt.listOf(new ConfirmItem.AdditionalInfoType.Hint(R.string.roamingCashOut_error_confirmation_invalidAgentNumber))}, -244693995, 244693999, UtilsKt.copydefault(), UtilsKt.copydefault(), UtilsKt.copydefault()));
        listCreateListBuilder.add(ShareDataUIState(this, null, null, 3, null));
        mutableStateFlow.setValue(CollectionsKt.build(listCreateListBuilder));
        int i2 = f2714c + 73;
        f2713a = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private final void getShareableDataState() {
        int i = 2 % 2;
        MutableStateFlow<List<ConfirmItem>> mutableStateFlow = this.copy;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(equals());
        listCreateListBuilder.add(component2(this, null, 1, null));
        listCreateListBuilder.add(ShareDataUIState(this, null, CollectionsKt.listOf(new ConfirmItem.AdditionalInfoType.Hint(R.string.roamingCashOut_error_confirmation_maxAmountReached)), 1, null));
        mutableStateFlow.setValue(CollectionsKt.build(listCreateListBuilder));
        int i2 = f2713a + 17;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setConfirmationDataForValidAgent() {
        int i = 2 % 2;
        MutableStateFlow<List<ConfirmItem>> mutableStateFlow = this.copy;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add(equals());
        if (getTransactionFlow().isInteractive()) {
            RoamingCashOutValidationDetails roamingCashOutValidationDetailsComponent4 = component4();
            if (roamingCashOutValidationDetailsComponent4 != null) {
                int i2 = f2714c + 47;
                f2713a = i2 % 128;
                int i3 = i2 % 2;
                String agentName = roamingCashOutValidationDetailsComponent4.getAgentName();
                if (agentName != null) {
                    int i4 = f2713a + 69;
                    f2714c = i4 % 128;
                    int i5 = i4 % 2;
                    listCreateListBuilder.add(copydefault(this, agentName, null, 2, null));
                    int i6 = f2713a + 117;
                    f2714c = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            listCreateListBuilder.add(component2(this, null, 1, null));
        }
        listCreateListBuilder.add(ShareDataUIState(this, "TSH " + getTransactionAmount(), null, 2, null));
        listCreateListBuilder.add(getAmountInKsh());
        mutableStateFlow.setValue(CollectionsKt.build(listCreateListBuilder));
    }

    public final void setConfirmationDataWithCurrentDetails() {
        int i = 2 % 2;
        MutableStateFlow<List<ConfirmItem>> mutableStateFlow = this.copy;
        ArrayList arrayList = new ArrayList();
        arrayList.add(equals());
        if (getTransactionFlow().isInteractive()) {
            int i2 = f2713a + 33;
            f2714c = i2 % 128;
            int i3 = i2 % 2;
            arrayList.add(component2(this, null, 1, null));
        }
        arrayList.add(ShareDataUIState(this, null, null, 3, null));
        mutableStateFlow.setValue(arrayList);
        int i4 = f2713a + 5;
        f2714c = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final ConfirmItem.Header equals() {
        int i;
        int i2 = 2 % 2;
        int i3 = f2713a + 21;
        f2714c = i3 % 128;
        int i4 = i3 % 2;
        if (getTransactionFlow().isInteractive()) {
            int i5 = f2713a + 39;
            f2714c = i5 % 128;
            int i6 = i5 % 2;
            i = R.string.roamingCashOut_title;
        } else {
            i = R.string.costEstimator_roamingCashOut_title;
        }
        return new ConfirmItem.Header(i, R.drawable.ic_vodafone_logo, Integer.valueOf(R.drawable.ic_flag_tanzania));
    }

    static ConfirmItem.Content copydefault(RoamingCashOutViewModel roamingCashOutViewModel, String str, Integer num, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f2714c;
        int i4 = i3 + 123;
        f2713a = i4 % 128;
        if (i4 % 2 == 0 && (i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            int i5 = i3 + 43;
            f2713a = i5 % 128;
            int i6 = i5 % 2;
            num = null;
        }
        return (ConfirmItem.Content) component3(UtilsKt.copydefault(), new Object[]{roamingCashOutViewModel, str, num}, 1523187269, -1523187267, UtilsKt.copydefault(), UtilsKt.copydefault(), UtilsKt.copydefault());
    }

    private static Object copydefault(Object[] objArr) {
        String str = (String) objArr[1];
        Integer num = (Integer) objArr[2];
        int i = 2 % 2;
        ConfirmItem.Content content = new ConfirmItem.Content(R.string.roamingCashOut_agentName, num, str, null, 8, null);
        int i2 = f2714c + 81;
        f2713a = i2 % 128;
        if (i2 % 2 == 0) {
            return content;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static ConfirmItem.Content component2(RoamingCashOutViewModel roamingCashOutViewModel, List list, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = f2713a + 125;
        f2714c = i3 % 128;
        if (i3 % 2 != 0 ? (i & 1) != 0 : (i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        ConfirmItem.Content content = (ConfirmItem.Content) component3(UtilsKt.copydefault(), new Object[]{roamingCashOutViewModel, list}, -244693995, 244693999, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
        int i4 = f2713a + 61;
        f2714c = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 93 / 0;
        }
        return content;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[PHI: r2
  0x0031: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v9 java.lang.String) binds: [B:10:0x002f, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object component2(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel) r1
            r2 = 1
            r9 = r9[r2]
            r6 = r9
            java.util.List r6 = (java.util.List) r6
            r9 = 2
            int r2 = r9 % r9
            int r3 = com.huawei.digitalpayment.consumer.sfc.global.R.string.roamingCashOut_agentNumber
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.CustomerItem r2 = r1.component2()
            if (r2 == 0) goto L41
            int r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r4 = r4 + 65
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r5
            int r4 = r4 % r9
            if (r4 != 0) goto L2b
            java.lang.String r2 = r2.getCustomerNumber()
            r4 = 37
            int r4 = r4 / r0
            if (r2 == 0) goto L41
            goto L31
        L2b:
            java.lang.String r2 = r2.getCustomerNumber()
            if (r2 == 0) goto L41
        L31:
            r0 = r2
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r2 = 0
        L3c:
            if (r2 != 0) goto L3f
            goto L41
        L3f:
            r5 = r2
            goto L4f
        L41:
            java.lang.String r0 = r1.getAgentNumber()
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r1 = r1 + 61
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r2
            int r1 = r1 % r9
            r5 = r0
        L4f:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem$Content r9 = new com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem$Content
            r4 = 0
            r7 = 2
            r8 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.component2(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static ConfirmItem.Content ShareDataUIState(RoamingCashOutViewModel roamingCashOutViewModel, String str, List list, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            str = "TSH " + roamingCashOutViewModel.getTransactionAmount();
            int i3 = f2714c + 63;
            f2713a = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 / 2;
            }
        }
        if ((i & 2) != 0) {
            int i5 = f2713a + 13;
            f2714c = i5 % 128;
            if (i5 % 2 == 0) {
                CollectionsKt.emptyList();
                throw null;
            }
            list = CollectionsKt.emptyList();
            int i6 = f2713a + 3;
            f2714c = i6 % 128;
            int i7 = i6 % 2;
        }
        return roamingCashOutViewModel.component1(str, list);
    }

    private final ConfirmItem.Content component1(String str, List<? extends ConfirmItem.AdditionalInfoType> list) {
        int i = 2 % 2;
        ConfirmItem.Content content = new ConfirmItem.Content(R.string.roamingCashOut_confirmation_amountIn_tsh, null, str, list, 2, null);
        int i2 = f2713a + 1;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        return content;
    }

    private final void copydefault() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
        int i2 = f2714c + 87;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$agentNameCheck$1", f = "RoamingCashOutViewModel.kt", i = {}, l = {404}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 113;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component2;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowOn = FlowKt.flowOn(RoamingCashOutViewModel.access$getNameCheckRepository$p(RoamingCashOutViewModel.this).checkRoamingCashoutAgentName(new RoamingCashoutBody(RoamingCashOutViewModel.this.getAgentNumber(), RoamingCashOutViewModel.this.getAmount(), "KES", RoamingCashOutViewModel.copydefault)), Dispatchers.getIO());
                final RoamingCashOutViewModel roamingCashOutViewModel = RoamingCashOutViewModel.this;
                this.component2 = 1;
                if (flowFlowOn.collect(new FlowCollector() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component1 + 69;
                        ShareDataUIState = i5 % 128;
                        int i6 = i5 % 2;
                        Object objComponent3 = component3((Resource) obj3, continuation);
                        int i7 = component1 + 51;
                        ShareDataUIState = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 0 / 0;
                        }
                        return objComponent3;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object component3(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.Resource<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                        /*
                            Method dump skipped, instruction units count: 332
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.copydefault.AnonymousClass1.component3(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.Resource, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = ShareDataUIState + 23;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.throwOnFailure(obj);
                if (i5 != 0) {
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = RoamingCashOutViewModel.this.new copydefault(continuation);
            int i2 = component3 + 13;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = ShareDataUIState + 63;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 63;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object ShareDataUIState(Object[] objArr) {
        RoamingCashOutViewModel roamingCashOutViewModel = (RoamingCashOutViewModel) objArr[0];
        RoamingCashoutResponseDto.Response.LineItem lineItem = (RoamingCashoutResponseDto.Response.LineItem) objArr[1];
        int i = 2 % 2;
        int i2 = f2714c + 41;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        String str = null;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (roamingCashOutViewModel.getTransactionFlow() instanceof TransactionFlow.CostEstimation) {
            roamingCashOutViewModel.component2(new CustomerItem(str, objArr3 == true ? 1 : 0, 3, objArr2 == true ? 1 : 0));
        }
        CustomerItem customerItemComponent2 = roamingCashOutViewModel.component2();
        if (customerItemComponent2 != null) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(roamingCashOutViewModel), null, null, roamingCashOutViewModel.new component3(customerItemComponent2, lineItem, null), 3, null);
            int i4 = f2713a + 123;
            f2714c = i4 % 128;
            int i5 = i4 % 2;
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel$validateRoamingCashOut$1$1", f = "RoamingCashOutViewModel.kt", i = {}, l = {444}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int component4 = 1;
        final CustomerItem ShareDataUIState;
        final RoamingCashoutResponseDto.Response.LineItem component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 != 0) {
                int i3 = component4 + 41;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowOn = FlowKt.flowOn(RoamingCashOutViewModel.access$getValidationRepository$p(RoamingCashOutViewModel.this).validateRoamingCashOut(new RoamingCashoutBody(this.ShareDataUIState.getCustomerNumber(), RoamingCashOutViewModel.this.getAmount(), "KES", RoamingCashOutViewModel.copydefault)), Dispatchers.getIO());
                final RoamingCashOutViewModel roamingCashOutViewModel = RoamingCashOutViewModel.this;
                final RoamingCashoutResponseDto.Response.LineItem lineItem = this.component1;
                this.component3 = 1;
                if (flowFlowOn.collect(new FlowCollector() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = ShareDataUIState + 95;
                        component2 = i6 % 128;
                        Resource<RoamingCashoutResponseDto> resource = (Resource) obj2;
                        if (i6 % 2 == 0) {
                            return copydefault(resource, continuation);
                        }
                        copydefault(resource, continuation);
                        throw null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:111:0x01cc  */
                    /* JADX WARN: Removed duplicated region for block: B:114:0x01d5  */
                    /* JADX WARN: Removed duplicated region for block: B:130:0x0211  */
                    /* JADX WARN: Removed duplicated region for block: B:133:0x0218  */
                    /* JADX WARN: Removed duplicated region for block: B:145:0x0248  */
                    /* JADX WARN: Removed duplicated region for block: B:148:0x024d  */
                    /* JADX WARN: Removed duplicated region for block: B:165:0x02b0  */
                    /* JADX WARN: Removed duplicated region for block: B:168:0x02b5  */
                    /* JADX WARN: Removed duplicated region for block: B:173:0x02c7  */
                    /* JADX WARN: Removed duplicated region for block: B:179:0x02e0  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x02fb  */
                    /* JADX WARN: Removed duplicated region for block: B:218:0x02db A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[PHI: r7
  0x00ad: PHI (r7v8 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto$Response) = 
  (r7v7 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto$Response)
  (r7v13 com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto$Response)
 binds: [B:41:0x00ab, B:38:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
                    /* JADX WARN: Removed duplicated region for block: B:84:0x014b  */
                    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object copydefault(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.Resource<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.RoamingCashoutResponseDto> r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) {
                        /*
                            Method dump skipped, instruction units count: 853
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.component3.AnonymousClass1.copydefault(com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.Resource, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    int i5 = component4 + 83;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 17 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(CustomerItem customerItem, RoamingCashoutResponseDto.Response.LineItem lineItem, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.ShareDataUIState = customerItem;
            this.component1 = lineItem;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = RoamingCashOutViewModel.this.new component3(this.ShareDataUIState, this.component1, continuation);
            int i2 = component4 + 47;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 113;
            component4 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = component2 + 75;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 97;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 != 0) {
                component3Var.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 65;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 22 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final void component2(ErrorType errorType) {
        MutableStateFlow<Boolean> mutableStateFlow;
        boolean z;
        int i = 2 % 2;
        int i2 = f2714c + 119;
        f2713a = i2 % 128;
        if (i2 % 2 != 0) {
            mutableStateFlow = this.getRequestBeneficiariesState;
            z = true;
        } else {
            mutableStateFlow = this.getRequestBeneficiariesState;
            z = false;
        }
        mutableStateFlow.setValue(Boolean.valueOf(z));
        this.getARTIFICIAL_FRAME_PACKAGE_NAME.handleConfirmationError(errorType, getAmount());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object component1(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel) r1
            r2 = 1
            r6 = r6[r2]
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType r6 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.errorhandling.ErrorType) r6
            r3 = 2
            int r4 = r3 % r3
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r4 = r1.getRequestBeneficiariesState
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.setValue(r0)
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow r0 = r1.getTransactionFlow()
            boolean r4 = r0 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow.Regular
            if (r4 != 0) goto L45
            int r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a
            int r4 = r4 + 67
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c = r5
            int r4 = r4 % r3
            boolean r4 = r0 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow.AppLink
            if (r4 != 0) goto L45
            boolean r4 = r0 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow.Announcement
            if (r4 == 0) goto L30
            goto L45
        L30:
            boolean r0 = r0 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.TransactionFlow.CostEstimation
            r0 = r0 ^ r2
            if (r0 == r2) goto L3f
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutErrorHandler r0 = r1.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.String r1 = r1.getAmount()
            r0.handleCostEstimationError(r6, r1)
            goto L4e
        L3f:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L45:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutErrorHandler r0 = r1.getARTIFICIAL_FRAME_PACKAGE_NAME
            java.lang.String r1 = r1.getAmount()
            r0.handleValidationError(r6, r1)
        L4e:
            int r6 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2714c
            int r6 = r6 + 125
            int r0 = r6 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.f2713a = r0
            int r6 = r6 % r3
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.component1(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem.Content getAmountInKsh() {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.RoamingCashOutViewModel.getAmountInKsh():com.huawei.digitalpayment.consumer.sfc.mpesaglobal.transactions.roamingcashout.model.ConfirmItem$Content");
    }

    public final String getTransactionAmount() {
        double d2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2 = 2 % 2;
        int i3 = f2713a + 91;
        f2714c = i3 % 128;
        if (i3 % 2 == 0) {
            d2 = Double.parseDouble(getAmount());
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 2;
        } else {
            d2 = Double.parseDouble(getAmount());
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            i = 15;
        }
        String amount$default = AmountInputExtensionsKt.toAmount$default(d2, z, z2, z3, z4, i, null);
        int i4 = f2713a + 17;
        f2714c = i4 % 128;
        int i5 = i4 % 2;
        return amount$default;
    }

    public final String getOwnMsisdn() {
        String string;
        String countryCode;
        String str;
        boolean z;
        int i;
        int i2 = 2 % 2;
        int i3 = f2714c + 69;
        f2713a = i3 % 128;
        if (i3 % 2 != 0) {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "254";
            z = false;
            i = 2;
        } else {
            string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            countryCode = SfcPhoneNumberUtil.INSTANCE.getCountryCode();
            str = "254";
            z = false;
            i = 4;
        }
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, countryCode, str, z, i, (Object) null);
        int i4 = f2713a + 119;
        f2714c = i4 % 128;
        if (i4 % 2 != 0) {
            return strReplaceFirst$default;
        }
        throw null;
    }

    public final Map<String, Object> getProcessTransactionData() {
        int i = 2 % 2;
        int i2 = f2713a + 89;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        Map<String, Object> mapMapOf = MapsKt.mapOf(TuplesKt.to("amount", AmountUtils.INSTANCE.formatAmount(String.valueOf(((GlobalTransactionData.RoamingCashOut) getRequestBeneficiariesState().getTransactionData()).getAmount().intValue()))), TuplesKt.to("tradeType", PayTradeTypeEnum.NATIVE_APP.getTradeType()), TuplesKt.to("receiverShortCode", RECEIVER_SHORT_CODE), TuplesKt.to("businessType", "PayBill"), TuplesKt.to("walletReferenceData", MapsKt.mapOf(TuplesKt.to("Param@BillReferenceNumber", getOwnMsisdn()), TuplesKt.to("BillNumber", RECEIVER_SHORT_CODE))), TuplesKt.to("buttonText", "Cashout"));
        int i4 = f2714c + 19;
        f2713a = i4 % 128;
        int i5 = i4 % 2;
        return mapMapOf;
    }

    private final BillInfosResp component3() {
        int i = 2 % 2;
        int i2 = f2714c + 123;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        RoamingCashOutValidationDetails roamingCashOutValidationDetailsComponent4 = component4();
        String agentId = null;
        String agentName = roamingCashOutValidationDetailsComponent4 != null ? roamingCashOutValidationDetailsComponent4.getAgentName() : null;
        RoamingCashOutValidationDetails roamingCashOutValidationDetailsComponent42 = component4();
        if (roamingCashOutValidationDetailsComponent42 != null) {
            int i4 = f2714c + 1;
            f2713a = i4 % 128;
            if (i4 % 2 != 0) {
                roamingCashOutValidationDetailsComponent42.getAgentId();
                agentId.hashCode();
                throw null;
            }
            agentId = roamingCashOutValidationDetailsComponent42.getAgentId();
        } else {
            int i5 = f2713a + 41;
            f2714c = i5 % 128;
            int i6 = i5 % 2;
        }
        return new BillInfosResp(agentName, RECEIVER_SHORT_CODE, null, agentId, null, null, null, null, null, 500, null);
    }

    public final void onProcessTransactionSuccess(TransferResp transferResponse) {
        int i = 2 % 2;
        int i2 = f2714c + 5;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute("/checkoutModule/sfcPayBillResult", BundleKt.bundleOf(TuplesKt.to(KeysConstants.KEY_TRANSFER_RESP, transferResponse), TuplesKt.to("billInfo", component3()), TuplesKt.to("accountNumber", getOwnMsisdn()), TuplesKt.to("businessType", "PayBill"), TuplesKt.to(CheckIdentityActivity.ID_NUMBER, RECEIVER_SHORT_CODE), TuplesKt.to("name", component3().getBillName()), TuplesKt.to("isAddFavorite", false)));
        int i4 = f2714c + 79;
        f2713a = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onProcessTransactionError(BaseException error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(error, "");
        Log.d("RoamingCashOutViewModel", "onProcessTransactionError: " + error);
        component3(UtilsKt.copydefault(), new Object[]{this}, 1980815915, -1980815912, UtilsKt.copydefault(), UtilsKt.copydefault(), UtilsKt.copydefault());
        int i2 = f2713a + 13;
        f2714c = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public final void onProcessTransactionError(ErrorState error) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(error, "");
        Log.d("RoamingCashOutViewModel", "onProcessTransactionError: " + error);
        component3(UtilsKt.copydefault(), new Object[]{this}, 1980815915, -1980815912, UtilsKt.copydefault(), UtilsKt.copydefault(), UtilsKt.copydefault());
        int i2 = f2714c + 47;
        f2713a = i2 % 128;
        int i3 = i2 % 2;
    }

    private static Object component3(Object[] objArr) {
        int i = 2 % 2;
        ((RoamingCashOutViewModel) objArr[0]).equals.setValue(new ScreenInformation<>(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
        int i2 = f2713a + 15;
        f2714c = i2 % 128;
        int i3 = i2 % 2;
        return null;
    }

    public static MutableState $r8$lambda$BhVFseewIsKyl9Dvbn8cvxlAozw() {
        MutableState mutableStateComponent1;
        int i = 2 % 2;
        int i2 = f2714c + 69;
        f2713a = i2 % 128;
        if (i2 % 2 != 0) {
            mutableStateComponent1 = component1();
            int i3 = 3 / 0;
        } else {
            mutableStateComponent1 = component1();
        }
        int i4 = f2714c + 15;
        f2713a = i4 % 128;
        int i5 = i4 % 2;
        return mutableStateComponent1;
    }

    public static MutableState $r8$lambda$_u2yGcmVLOR58ug1cUOiakzJqRQ() {
        int i = 2 % 2;
        int i2 = f2713a + 85;
        f2714c = i2 % 128;
        if (i2 % 2 != 0) {
            return ShareDataUIState();
        }
        ShareDataUIState();
        throw null;
    }

    private final ConfirmItem.Content ShareDataUIState(String str, Integer num) {
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        return (ConfirmItem.Content) component3(UtilsKt.copydefault(), new Object[]{this, str, num}, 1523187269, -1523187267, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
    }

    private final ConfirmItem.Content copydefault(List<? extends ConfirmItem.AdditionalInfoType> list) {
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        return (ConfirmItem.Content) component3(UtilsKt.copydefault(), new Object[]{this, list}, -244693995, 244693999, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
    }

    private final void ShareDataUIState(ErrorType errorType) {
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        component3(UtilsKt.copydefault(), new Object[]{this, errorType}, -749533255, 749533256, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
    }

    private final void getAsAtTimestamp() {
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        component3(UtilsKt.copydefault(), new Object[]{this}, 1980815915, -1980815912, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
    }

    private final void ShareDataUIState(RoamingCashoutResponseDto.Response.LineItem lineItem) {
        int iCopydefault = UtilsKt.copydefault();
        int iCopydefault2 = UtilsKt.copydefault();
        component3(UtilsKt.copydefault(), new Object[]{this, lineItem}, -1291738277, 1291738277, UtilsKt.copydefault(), iCopydefault, iCopydefault2);
    }
}
