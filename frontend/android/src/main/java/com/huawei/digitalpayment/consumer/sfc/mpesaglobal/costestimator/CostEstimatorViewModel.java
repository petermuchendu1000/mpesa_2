package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.griver.base.resource.cache.GriverCacheDao;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.exception.BaseException;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryCarrier;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Currency;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.State;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.MpesaGlobalDashboardRepository;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.dashboard.model.MpesaGlobalDashboardItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.RoamingCashoutGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.roamingcashout.RoamingCashoutGetFeeDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtobank.SendToBankGetFeeDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.getfee.SendToMobileGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.getfee.SendToMobileGetFeeDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.getfee.WesternUnionGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.getfee.WesternUnionGetFeeDelegateImpl;
import com.safaricom.consumer.commons.amountvalidation.AmountDetailsState;
import com.safaricom.consumer.commons.amountvalidation.AmountHandlerDelegate;
import com.safaricom.consumer.commons.amountvalidation.AmountHandlerDelegateImpl;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.transaction.ITransactionType;
import com.safaricom.consumer.commons.transaction.TransactionType;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010.\u001a\u00020/2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\u0018\u00101\u001a\u00020/2\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105J\b\u00106\u001a\u00020/H\u0002J\u0006\u00107\u001a\u00020/J\u000e\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020:J\u0006\u0010;\u001a\u00020/J\b\u0010<\u001a\u00020=H\u0002J\b\u0010>\u001a\u00020/H\u0002J\b\u0010?\u001a\u00020/H\u0002J\b\u0010@\u001a\u00020/H\u0002J\b\u0010A\u001a\u00020/H\u0002J\u0006\u0010B\u001a\u00020/J\u0006\u0010C\u001a\u00020/J\t\u0010D\u001a\u00020EH\u0097\u0001J\u001b\u0010F\u001a\u00020/2\u0006\u0010G\u001a\u00020\u001d2\b\u0010H\u001a\u0004\u0018\u00010IH\u0097\u0001JC\u0010J\u001a\u00020/2\b\b\u0001\u0010K\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020L2\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0001\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001cH\u0097\u0001Jm\u0010P\u001a\u00020/2\b\b\u0001\u0010Q\u001a\u00020L2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010L2\b\b\u0001\u0010S\u001a\u00020T2\b\b\u0001\u0010K\u001a\u00020L2\b\b\u0001\u0010U\u001a\u00020T2\b\b\u0001\u0010M\u001a\u00020L2\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0001\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001cH\u0097\u0001Ju\u0010V\u001a\u00020/2\b\b\u0001\u0010W\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020L2\b\b\u0001\u0010Q\u001a\u00020L2\b\b\u0001\u0010S\u001a\u00020L2\b\b\u0001\u0010K\u001a\u00020L2\b\b\u0001\u0010X\u001a\u00020L2\b\b\u0001\u0010Y\u001a\u00020\u001d2\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0001\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001cH\u0097\u0001J\u0081\u0001\u0010Z\u001a\u00020/2\b\b\u0001\u0010Q\u001a\u00020L2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010L2\b\b\u0001\u0010S\u001a\u00020T2\b\b\u0001\u0010K\u001a\u00020L2\b\b\u0001\u0010U\u001a\u00020T2\b\b\u0001\u0010[\u001a\u00020L2\b\b\u0001\u0010M\u001a\u00020L2\b\b\u0001\u0010Y\u001a\u00020\u001d2\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0014\b\u0001\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001cH\u0097\u0001J\u001b\u0010\\\u001a\u00020/2\b\u0010]\u001a\u0004\u0018\u00010^2\u0006\u0010\u0010\u001a\u00020\u000fH\u0097\u0001J\u0015\u0010_\u001a\u00020/2\n\b\u0001\u0010`\u001a\u0004\u0018\u00010aH\u0097\u0001J%\u0010b\u001a\u00020/2\b\u0010c\u001a\u0004\u0018\u00010T2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010d\u001a\u00020\u001dH\u0097\u0001J3\u0010e\u001a\u00020/2\u0006\u0010f\u001a\u00020:2\u0006\u0010g\u001a\u00020T2\u0006\u0010M\u001a\u00020L2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010d\u001a\u00020\u001dH\u0097\u0001J\u0011\u0010h\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020LH\u0097\u0001J\u0011\u0010i\u001a\u00020/2\u0006\u0010j\u001a\u00020\u001dH\u0097\u0001J\u0011\u0010k\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020LH\u0097\u0001J\u0011\u0010l\u001a\u00020/2\u0006\u0010\u000e\u001a\u00020LH\u0097\u0001J\u0011\u0010m\u001a\u00020/2\u0006\u0010n\u001a\u00020EH\u0097\u0001J\u0013\u0010o\u001a\u00020/2\b\b\u0001\u0010\u000e\u001a\u00020LH\u0097\u0001J\u0013\u0010p\u001a\u00020/2\b\b\u0001\u0010\u000e\u001a\u00020LH\u0097\u0001J\u0013\u0010q\u001a\u00020/2\b\b\u0001\u0010r\u001a\u00020:H\u0097\u0001J\u0013\u0010s\u001a\u00020/2\b\b\u0001\u0010r\u001a\u00020:H\u0097\u0001J\u0013\u0010t\u001a\u00020/2\b\b\u0001\u0010r\u001a\u00020:H\u0097\u0001J\u0013\u0010u\u001a\u00020/2\b\b\u0001\u0010r\u001a\u00020:H\u0097\u0001J\u001f\u0010v\u001a\u00020/2\u0014\b\u0001\u0010w\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020y0xH\u0097\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\u001f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R!\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b*\u0010+R\u0011\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u001f8\u0016X\u0097\u0005R\r\u0010|\u001a\u00020L8\u0016@\u0016X\u0097\u000fR\r\u0010}\u001a\u00020L8\u0016@\u0016X\u0097\u000fR\r\u0010~\u001a\u00020L8\u0016@\u0016X\u0097\u000fR\r\u0010\u007f\u001a\u00020L8\u0016@\u0016X\u0097\u000fR\u0012\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020y0\u001f8\u0016X\u0097\u0005R\u000e\u0010\u0081\u0001\u001a\u00020L8\u0016@\u0016X\u0097\u000f¨\u0006\u0082\u0001"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/costestimator/CostEstimatorViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountHandlerDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/getfee/WesternUnionGetFeeDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtobank/SendToBankGetFeeDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/roamingcashout/RoamingCashoutGetFeeDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/getfee/SendToMobileGetFeeDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDataDelegate;", "repository", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository;", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/MpesaGlobalDashboardRepository;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "value", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "transactionType", "getTransactionType", "()Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "_screenTransition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "screenTransition", "Landroidx/lifecycle/LiveData;", "getScreenTransition", "()Landroidx/lifecycle/LiveData;", "_confirmationLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "confirmationLoading", "Lkotlinx/coroutines/flow/StateFlow;", "getConfirmationLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "_confirmationData", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "confirmationData", "getConfirmationData", "costEstimatorActions", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/dashboard/model/MpesaGlobalDashboardItem;", "getCostEstimatorActions", "()Lkotlinx/collections/immutable/ImmutableList;", "costEstimatorActions$delegate", "Lkotlin/Lazy;", "setScreen", "", "screenInformation", "setCountry", "country", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/State;", "nextScreen", "previousScreen", "onTransactionSelected", GriverCacheDao.COLUMN_CACHE_ID, "", "onAmountDetailsContinue", "getFees", "Lkotlinx/coroutines/Job;", "getFeeSendToMobile", "getFeeRoamingCashout", "getFeeSendToBank", "getFeeWesternUnion", "onConfirmContinue", "showError", "calculateAmount", "", "clearAmountError", "useOverdraft", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "getRoamingCashoutFee", "selectedCurrencyIso", "", "amount", "confirmationLoadingObservable", "confirmationDataObservable", "getSendToBankFee", "selectedCountryIso", "selectedStateIso", "selectedCountryName", "Lcom/safaricom/consumer/commons/util/TextResource;", "selectedCurrencyName", "getSendToMobileFee", "phoneNumber", "selectedCarrier", "isCostEstimatorFlow", "getWesternUnionFee", "fullName", "handleAmountError", "amountError", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "handleSendToMobileError", "e", "Lcom/huawei/common/exception/BaseException;", "setAmountError", "error", "isWarning", "setFormattedAmountError", "stringResId", "currency", "updateAmount", "updateAmountValidityStatus", "valid", "updateCurrency", "updateExchangeCurrency", "updateMpesaBalance", "balance", "updateOtherPurposeOfFunds", "updateOtherSourceOfFunds", "updateSelectedCarrier", FirebaseAnalytics.Param.INDEX, "updateSelectedCurrency", "updateSelectedPurposeOfFunds", "updateSelectedSourceOfFunds", "updateSelectionDetailState", "transform", "Lkotlin/Function1;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "feeInquiryRequestId", "firstName", "lastName", "middleName", "selectionDetailsState", "sendToMobileFeeInquiryRequestId", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostEstimatorViewModel extends ViewModel implements AmountHandlerDelegate, WesternUnionGetFeeDelegate, SendToBankGetFeeDelegate, RoamingCashoutGetFeeDelegate, SendToMobileGetFeeDelegate, SelectionDataDelegate {
    public static final int $stable = 8;

    private static int f2707c = 1;
    public static int component1 = -2043466195;
    private static int coroutineBoundary = 0;
    private static int coroutineCreation = 1;
    private static int getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final MpesaGlobalDashboardRepository ArtificialStackFrames;
    private final LiveData<ScreenInformation<MPesaGlobalScreen>> CoroutineDebuggingKt;
    private final WesternUnionGetFeeDelegateImpl ShareDataUIState;
    private ITransactionType accessartificialFrame;
    private final SendToBankGetFeeDelegateImpl component2;
    private final AmountHandlerDelegateImpl component3;
    private final SelectionDataDelegateImpl component4;
    private final MutableStateFlow<List<ConfirmInfoItem>> copy;
    private final RoamingCashoutGetFeeDelegateImpl copydefault;
    private final SendToMobileGetFeeDelegateImpl equals;
    private final MutableLiveData<ScreenInformation<MPesaGlobalScreen>> getAsAtTimestamp;
    private final MutableStateFlow<Boolean> getRequestBeneficiariesState;
    private final ConfigurationRepository getShareableDataState;
    private final Lazy getSponsorBeneficiariesState;
    private final StateFlow<List<ConfirmInfoItem>> hashCode;
    private final StateFlow<Boolean> toString;

    public static final void access$getFeeRoamingCashout(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 101;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorViewModel.component3();
        int i4 = coroutineCreation + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$getFeeSendToBank(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 101;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorViewModel.copydefault();
        if (i3 == 0) {
            int i4 = 75 / 0;
        }
        int i5 = coroutineCreation + 29;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final void access$getFeeSendToMobile(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 95;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorViewModel.ShareDataUIState();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$getFeeWesternUnion(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        costEstimatorViewModel.component1();
        int i4 = coroutineCreation + 27;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    @Inject
    public CostEstimatorViewModel(MpesaGlobalDashboardRepository mpesaGlobalDashboardRepository, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(mpesaGlobalDashboardRepository, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.component3 = new AmountHandlerDelegateImpl(configurationRepository);
        this.ShareDataUIState = new WesternUnionGetFeeDelegateImpl(configurationRepository);
        this.component2 = new SendToBankGetFeeDelegateImpl(configurationRepository);
        this.copydefault = new RoamingCashoutGetFeeDelegateImpl(configurationRepository);
        this.equals = new SendToMobileGetFeeDelegateImpl(configurationRepository);
        this.component4 = new SelectionDataDelegateImpl();
        this.ArtificialStackFrames = mpesaGlobalDashboardRepository;
        this.getShareableDataState = configurationRepository;
        this.accessartificialFrame = TransactionType.GLOBAL_SEND_TO_MOBILE;
        MutableLiveData<ScreenInformation<MPesaGlobalScreen>> mutableLiveData = new MutableLiveData<>();
        this.getAsAtTimestamp = mutableLiveData;
        this.CoroutineDebuggingKt = mutableLiveData;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this.getRequestBeneficiariesState = MutableStateFlow;
        this.toString = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<List<ConfirmInfoItem>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.copy = MutableStateFlow2;
        this.hashCode = FlowKt.asStateFlow(MutableStateFlow2);
        this.getSponsorBeneficiariesState = LazyKt.lazy(new Function0() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 99;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                CostEstimatorViewModel costEstimatorViewModel = this.f$0;
                if (i3 != 0) {
                    return CostEstimatorViewModel.m10983$r8$lambda$3K4WDnAiBJ8u8f1z1FagGjHpQ(costEstimatorViewModel);
                }
                CostEstimatorViewModel.m10983$r8$lambda$3K4WDnAiBJ8u8f1z1FagGjHpQ(costEstimatorViewModel);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        copydefault(new ScreenInformation<>(MPesaGlobalScreen.TransactionTypeSelection.INSTANCE, ScreenDirection.NONE));
    }

    public final ITransactionType getTransactionType() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 35;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        ITransactionType iTransactionType = this.accessartificialFrame;
        int i5 = i2 + 63;
        coroutineCreation = i5 % 128;
        if (i5 % 2 != 0) {
            return iTransactionType;
        }
        throw null;
    }

    public final LiveData<ScreenInformation<MPesaGlobalScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return this.CoroutineDebuggingKt;
        }
        throw null;
    }

    public final StateFlow<Boolean> getConfirmationLoading() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i3 = i2 + 95;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Boolean> stateFlow = this.toString;
        int i5 = i2 + 93;
        coroutineCreation = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<List<ConfirmInfoItem>> getConfirmationData() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 85;
        int i3 = i2 % 128;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        StateFlow<List<ConfirmInfoItem>> stateFlow = this.hashCode;
        int i4 = i3 + 77;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public final ImmutableList<MpesaGlobalDashboardItem> getCostEstimatorActions() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 103;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList<MpesaGlobalDashboardItem> immutableList = (ImmutableList) this.getSponsorBeneficiariesState.getValue();
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 3;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
        return immutableList;
    }

    private static final ImmutableList ShareDataUIState(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 61;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(costEstimatorViewModel, "");
            return costEstimatorViewModel.ArtificialStackFrames.getCostEstimatorActions();
        }
        Intrinsics.checkNotNullParameter(costEstimatorViewModel, "");
        costEstimatorViewModel.ArtificialStackFrames.getCostEstimatorActions();
        throw null;
    }

    private final void copydefault(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 67;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            this.getAsAtTimestamp.setValue(screenInformation);
            int i3 = 50 / 0;
        } else {
            this.getAsAtTimestamp.setValue(screenInformation);
        }
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 69;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final SelectionDetailsState component2(Country country, State state, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(selectionDetailsState, "");
        String name = country.getName();
        String stateIso = state != null ? state.getStateIso() : null;
        String alpha2Code = country.getAlpha2Code();
        String emoji = country.getEmoji();
        List<Currency> currencies = country.getCurrencies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : currencies) {
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 119;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            Currency currency = (Currency) obj;
            if (currency.getName().length() > 0) {
                int i6 = coroutineCreation + 15;
                getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
                int i7 = i6 % 2;
                if (currency.getIso().length() > 0) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList<Currency> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Currency currency2 : arrayList2) {
            arrayList3.add(new SelectionItem(currency2.getIso(), TextResource.Companion.invoke$default(TextResource.INSTANCE, currency2.getName(), false, 2, (Object) null)));
        }
        PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList3);
        List<CountryCarrier> carriers = country.getCarriers();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(carriers, 10));
        for (CountryCarrier countryCarrier : carriers) {
            arrayList4.add(new SelectionItem(countryCarrier.getId(), TextResource.Companion.invoke$default(TextResource.INSTANCE, countryCarrier.getName(), false, 2, (Object) null)));
        }
        return SelectionDetailsState.copy$default(selectionDetailsState, null, 0, null, null, 0, null, name, alpha2Code, stateIso, emoji, null, persistentList, 0, ExtensionsKt.toPersistentList(arrayList4), 0, 21567, null);
    }

    public final void setCountry(final Country country, final State state) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Log.d("LIPSUM", "Cost estimator carriers: " + country.getCarriers());
        updateSelectionDetailState(new Function1() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 71;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Country country2 = country;
                if (i4 != 0) {
                    return CostEstimatorViewModel.m10984$r8$lambda$8DSeYhd4ZGpD9ChFfhhKWfjN4(country2, state, (SelectionDetailsState) obj);
                }
                CostEstimatorViewModel.m10984$r8$lambda$8DSeYhd4ZGpD9ChFfhhKWfjN4(country2, state, (SelectionDetailsState) obj);
                throw null;
            }
        });
        updateCurrency(country.getCurrencies().get(0).getIso());
        getRequestBeneficiariesState();
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 41;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void getRequestBeneficiariesState() {
        MPesaGlobalScreen screen;
        MPesaGlobalScreen.Confirmation confirmation;
        int i = 2 % 2;
        ScreenInformation<MPesaGlobalScreen> value = this.getAsAtTimestamp.getValue();
        if (value != null) {
            int i2 = coroutineCreation + 73;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
            int i3 = i2 % 2;
            screen = value.getScreen();
        } else {
            screen = null;
        }
        if (screen instanceof MPesaGlobalScreen.TransactionTypeSelection) {
            confirmation = this.accessartificialFrame == TransactionType.ROAMING_CASH_OUT ? MPesaGlobalScreen.AmountDetails.INSTANCE : MPesaGlobalScreen.CountrySelection.INSTANCE;
        } else if (screen instanceof MPesaGlobalScreen.CountrySelection) {
            int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 47;
            coroutineCreation = i4 % 128;
            int i5 = i4 % 2;
            confirmation = MPesaGlobalScreen.AmountDetails.INSTANCE;
        } else if (screen instanceof MPesaGlobalScreen.AmountDetails) {
            int i6 = coroutineCreation + 9;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i6 % 128;
            int i7 = i6 % 2;
            confirmation = MPesaGlobalScreen.Confirmation.INSTANCE;
        } else {
            if (!(screen instanceof MPesaGlobalScreen.Confirmation)) {
                throw new IllegalArgumentException("Invalid screen " + screen);
            }
            int i8 = coroutineCreation + 57;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i8 % 128;
            int i9 = i8 % 2;
            confirmation = MPesaGlobalScreen.Close.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("Current screen: ");
        ScreenInformation<MPesaGlobalScreen> value2 = this.getAsAtTimestamp.getValue();
        sb.append(value2 != null ? value2.getScreen() : null);
        Log.d("CostEstimatorViewModel", sb.toString());
        Log.d("CostEstimatorViewModel", "Next screen: " + confirmation);
        copydefault(new ScreenInformation<>(confirmation, ScreenDirection.FORWARD));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void previousScreen() {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.lifecycle.MutableLiveData<com.safaricom.sharedui.compose.navigation.ScreenInformation<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen>> r1 = r6.getAsAtTimestamp
            java.lang.Object r1 = r1.getValue()
            com.safaricom.sharedui.compose.navigation.ScreenInformation r1 = (com.safaricom.sharedui.compose.navigation.ScreenInformation) r1
            r2 = 0
            if (r1 == 0) goto L27
            int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.coroutineCreation
            int r3 = r3 + 97
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r4
            int r3 = r3 % r0
            java.lang.Object r1 = r1.getScreen()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.coroutineCreation
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME = r4
            int r3 = r3 % r0
            goto L28
        L27:
            r1 = r2
        L28:
            boolean r3 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.ConfirmationError
            if (r3 != 0) goto L72
            int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.getARTIFICIAL_FRAME_PACKAGE_NAME
            int r4 = r3 + 11
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.coroutineCreation = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L6f
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionError
            if (r2 == 0) goto L3c
            goto L72
        L3c:
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Confirmation
            if (r2 == 0) goto L4c
            int r3 = r3 + 125
            int r1 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.coroutineCreation = r1
            int r3 = r3 % r0
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$AmountDetails r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L76
        L4c:
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails
            if (r2 == 0) goto L61
            int r3 = r3 + 19
            int r1 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.coroutineCreation = r1
            int r3 = r3 % r0
            java.lang.String r0 = ""
            r6.updateAmount(r0)
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$CountrySelection r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L76
        L61:
            boolean r0 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection
            if (r0 == 0) goto L6a
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$TransactionTypeSelection r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionTypeSelection.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L76
        L6a:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Close r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Close.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L76
        L6f:
            boolean r0 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionError
            throw r2
        L72:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Dashboard r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Dashboard.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
        L76:
            com.safaricom.sharedui.compose.navigation.ScreenInformation r1 = new com.safaricom.sharedui.compose.navigation.ScreenInformation
            com.safaricom.sharedui.compose.navigation.ScreenDirection r2 = com.safaricom.sharedui.compose.navigation.ScreenDirection.BACK
            r1.<init>(r0, r2)
            r6.copydefault(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel.previousScreen():void");
    }

    public final void onTransactionSelected(int id) {
        TransactionType transactionType;
        int i = 2 % 2;
        if (id == R.id.action_send_to_mobile_id) {
            transactionType = TransactionType.GLOBAL_SEND_TO_MOBILE;
            int i2 = coroutineCreation + 101;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
            int i3 = i2 % 2;
        } else {
            Object obj = null;
            if (id == R.id.action_send_to_bank_id) {
                int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 107;
                coroutineCreation = i4 % 128;
                if (i4 % 2 == 0) {
                    TransactionType transactionType2 = TransactionType.GLOBAL_SEND_TO_BANK;
                    obj.hashCode();
                    throw null;
                }
                transactionType = TransactionType.GLOBAL_SEND_TO_BANK;
            } else if (id == R.id.action_western_union_id) {
                int i5 = getARTIFICIAL_FRAME_PACKAGE_NAME + 97;
                coroutineCreation = i5 % 128;
                if (i5 % 2 == 0) {
                    TransactionType transactionType3 = TransactionType.SEND_MONEY_TO_WESTERN_UNION;
                    obj.hashCode();
                    throw null;
                }
                transactionType = TransactionType.SEND_MONEY_TO_WESTERN_UNION;
            } else {
                if (id != R.id.action_roaming_cash_out_id) {
                    return;
                }
                int i6 = getARTIFICIAL_FRAME_PACKAGE_NAME + 95;
                coroutineCreation = i6 % 128;
                if (i6 % 2 == 0) {
                    transactionType = TransactionType.ROAMING_CASH_OUT;
                    int i7 = 68 / 0;
                } else {
                    transactionType = TransactionType.ROAMING_CASH_OUT;
                }
            }
        }
        this.accessartificialFrame = transactionType;
        getRequestBeneficiariesState();
    }

    public final void onAmountDetailsContinue() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 47;
        coroutineCreation = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getRequestBeneficiariesState();
            component2();
            int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 89;
            coroutineCreation = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        getRequestBeneficiariesState();
        component2();
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.costestimator.CostEstimatorViewModel$getFees$1", f = "CostEstimatorViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.copydefault != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = component3 + 43;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            ResultKt.throwOnFailure(obj);
            ITransactionType transactionType = CostEstimatorViewModel.this.getTransactionType();
            if (transactionType == TransactionType.SEND_MONEY_TO_WESTERN_UNION) {
                int i5 = component3 + 35;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                CostEstimatorViewModel.access$getFeeWesternUnion(CostEstimatorViewModel.this);
            } else if (transactionType == TransactionType.GLOBAL_SEND_TO_BANK) {
                CostEstimatorViewModel.access$getFeeSendToBank(CostEstimatorViewModel.this);
            } else if (transactionType == TransactionType.ROAMING_CASH_OUT) {
                CostEstimatorViewModel.access$getFeeRoamingCashout(CostEstimatorViewModel.this);
            } else if (transactionType == TransactionType.GLOBAL_SEND_TO_MOBILE) {
                CostEstimatorViewModel.access$getFeeSendToMobile(CostEstimatorViewModel.this);
                int i7 = component3 + 15;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = CostEstimatorViewModel.this.new copydefault(continuation);
            int i2 = component3 + 113;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 51;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component2(coroutineScope2, continuation2);
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = 34 / 0;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 21;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 93;
            component1 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    private final Job component2() {
        int i = 2 % 2;
        Object obj = null;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
        int i2 = coroutineCreation + 103;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 == 0) {
            return jobShareDataUIState;
        }
        obj.hashCode();
        throw null;
    }

    private final void ShareDataUIState() {
        SelectionItem selectionItem;
        String str;
        int i = 2 % 2;
        AmountDetailsState value = getAmountDetailsState().getValue();
        SelectionDetailsState value2 = getSelectionDetailsState().getValue();
        String selectedCountryIso = value2.getSelectedCountryIso();
        String selectedCountry = value2.getSelectedCountry();
        String id = null;
        if (value2.getCarrierSelection().isEmpty()) {
            int i2 = coroutineCreation + 123;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
            int i3 = i2 % 2;
            selectionItem = null;
        } else {
            selectionItem = value2.getCarrierSelection().get(value2.getSelectedCarrierIndex());
        }
        String id2 = value2.getCurrencySelection().get(value2.getSelectedCurrencyIndex()).getId();
        String amount = value.getAmount();
        if (selectionItem != null) {
            int i4 = coroutineCreation + 125;
            getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
            int i5 = i4 % 2;
            id = selectionItem.getId();
            int i6 = getARTIFICIAL_FRAME_PACKAGE_NAME + 53;
            coroutineCreation = i6 % 128;
            int i7 = i6 % 2;
        }
        if (id == null) {
            int i8 = getARTIFICIAL_FRAME_PACKAGE_NAME + 73;
            coroutineCreation = i8 % 128;
            int i9 = i8 % 2;
            str = "";
        } else {
            str = id;
        }
        getSendToMobileFee("", amount, selectedCountryIso, selectedCountry, id2, str, true, this.getRequestBeneficiariesState, this.copy);
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 117;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        AmountDetailsState value = getAmountDetailsState().getValue();
        getSelectionDetailsState().getValue();
        getRoamingCashoutFee("TZS", value.getAmount(), this.getRequestBeneficiariesState, this.copy);
        int i4 = coroutineCreation + 15;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 1;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        AmountDetailsState value = getAmountDetailsState().getValue();
        SelectionDetailsState value2 = getSelectionDetailsState().getValue();
        SelectionItem selectionItem = value2.getCurrencySelection().get(value2.getSelectedCurrencyIndex());
        getSendToBankFee(value2.getSelectedCountryIso(), value2.getSelectedStateIso(), TextResource.Companion.invoke$default(TextResource.INSTANCE, value2.getSelectedCountry(), false, 2, (Object) null), selectionItem.getId(), selectionItem.getTitle(), value.getAmount(), this.getRequestBeneficiariesState, this.copy);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        AmountDetailsState value = getAmountDetailsState().getValue();
        SelectionDetailsState value2 = getSelectionDetailsState().getValue();
        SelectionItem selectionItem = value2.getCurrencySelection().get(value2.getSelectedCurrencyIndex());
        Object obj = null;
        getWesternUnionFee(value2.getSelectedCountryIso(), value2.getSelectedStateIso(), TextResource.Companion.invoke$default(TextResource.INSTANCE, value2.getSelectedCountry(), false, 2, (Object) null), selectionItem.getId(), selectionItem.getTitle(), "", value.getAmount(), true, this.getRequestBeneficiariesState, this.copy);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 65;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onConfirmContinue() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 21;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        getRequestBeneficiariesState();
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 79;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void showError() {
        int i = 2 % 2;
        copydefault(new ScreenInformation<>(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 109;
        coroutineCreation = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static ImmutableList m10983$r8$lambda$3K4WDnAiBJ8u8f1z1FagGjHpQ(CostEstimatorViewModel costEstimatorViewModel) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 57;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        ImmutableList immutableListShareDataUIState = ShareDataUIState(costEstimatorViewModel);
        int i4 = coroutineCreation + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
        return immutableListShareDataUIState;
    }

    public static SelectionDetailsState m10984$r8$lambda$8DSeYhd4ZGpD9ChFfhhKWfjN4(Country country, State state, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 65;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            component2(country, state, selectionDetailsState);
            throw null;
        }
        SelectionDetailsState selectionDetailsStateComponent2 = component2(country, state, selectionDetailsState);
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 83;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        return selectionDetailsStateComponent2;
    }

    static {
        int i = 1 + 43;
        coroutineBoundary = i % 128;
        int i2 = i % 2;
    }

    @Override
    public double calculateAmount() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 69;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        double dCalculateAmount = this.component3.calculateAmount();
        int i4 = coroutineCreation + 107;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 == 0) {
            return dCalculateAmount;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void clearAmountError(boolean useOverdraft, AmountViewModel.AmountErrorType errorType) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 47;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        this.component3.clearAmountError(useOverdraft, errorType);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 77;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public StateFlow<AmountDetailsState> getAmountDetailsState() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 75;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            this.component3.getAmountDetailsState();
            throw null;
        }
        StateFlow<AmountDetailsState> amountDetailsState = this.component3.getAmountDetailsState();
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 25;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        return amountDetailsState;
    }

    @Override
    public String getFeeInquiryRequestId() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 87;
        coroutineCreation = i2 % 128;
        if (i2 % 2 == 0) {
            this.ShareDataUIState.getFeeInquiryRequestId();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String feeInquiryRequestId = this.ShareDataUIState.getFeeInquiryRequestId();
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 55;
        coroutineCreation = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 94 / 0;
        }
        return feeInquiryRequestId;
    }

    @Override
    public String getFirstName() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 119;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            this.equals.getFirstName();
            throw null;
        }
        String firstName = this.equals.getFirstName();
        int i3 = getARTIFICIAL_FRAME_PACKAGE_NAME + 9;
        coroutineCreation = i3 % 128;
        int i4 = i3 % 2;
        return firstName;
    }

    @Override
    public String getLastName() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        String lastName = this.equals.getLastName();
        int i4 = coroutineCreation + 3;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return lastName;
    }

    @Override
    public String getMiddleName() {
        String middleName;
        int i = 2 % 2;
        int i2 = coroutineCreation + 37;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        if (i2 % 2 != 0) {
            middleName = this.equals.getMiddleName();
            int i3 = 66 / 0;
        } else {
            middleName = this.equals.getMiddleName();
        }
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 29;
        coroutineCreation = i4 % 128;
        if (i4 % 2 != 0) {
            return middleName;
        }
        throw null;
    }

    @Override
    public void getRoamingCashoutFee(String selectedCurrencyIso, String amount, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 19;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.copydefault.getRoamingCashoutFee(selectedCurrencyIso, amount, confirmationLoadingObservable, confirmationDataObservable);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public StateFlow<SelectionDetailsState> getSelectionDetailsState() {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 87;
        coroutineCreation = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.component4.getSelectionDetailsState();
            throw null;
        }
        StateFlow<SelectionDetailsState> selectionDetailsState = this.component4.getSelectionDetailsState();
        int i3 = coroutineCreation + 105;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            return selectionDetailsState;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void getSendToBankFee(String selectedCountryIso, String selectedStateIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String amount, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 25;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryName, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.component2.getSendToBankFee(selectedCountryIso, selectedStateIso, selectedCountryName, selectedCurrencyIso, selectedCurrencyName, amount, confirmationLoadingObservable, confirmationDataObservable);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 27;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void getSendToMobileFee(String phoneNumber, String amount, String selectedCountryIso, String selectedCountryName, String selectedCurrencyIso, String selectedCarrier, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 11;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryName, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(selectedCarrier, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.equals.getSendToMobileFee(phoneNumber, amount, selectedCountryIso, selectedCountryName, selectedCurrencyIso, selectedCarrier, isCostEstimatorFlow, confirmationLoadingObservable, confirmationDataObservable);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 21;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public String getSendToMobileFeeInquiryRequestId() {
        int i = 2 % 2;
        int i2 = coroutineCreation + 21;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.equals.getSendToMobileFeeInquiryRequestId();
            obj.hashCode();
            throw null;
        }
        String sendToMobileFeeInquiryRequestId = this.equals.getSendToMobileFeeInquiryRequestId();
        int i3 = coroutineCreation + 51;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            return sendToMobileFeeInquiryRequestId;
        }
        throw null;
    }

    @Override
    public void getWesternUnionFee(String selectedCountryIso, String selectedStateIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String fullName, String amount, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 15;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryName, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyName, "");
        Intrinsics.checkNotNullParameter(fullName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.ShareDataUIState.getWesternUnionFee(selectedCountryIso, selectedStateIso, selectedCountryName, selectedCurrencyIso, selectedCurrencyName, fullName, amount, isCostEstimatorFlow, confirmationLoadingObservable, confirmationDataObservable);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 9;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }

    @Override
    public void handleAmountError(AmountViewModel.AmountError amountError, ITransactionType transactionType) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 83;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.component3.handleAmountError(amountError, transactionType);
        int i4 = coroutineCreation + 125;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void handleSendToMobileError(BaseException e) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 111;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.equals.handleSendToMobileError(e);
            throw null;
        }
        this.equals.handleSendToMobileError(e);
        int i3 = coroutineCreation + 125;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void setAmountError(TextResource error, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 39;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component3.setAmountError(error, errorType, isWarning);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 41;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setFeeInquiryRequestId(String str) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 25;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            this.ShareDataUIState.setFeeInquiryRequestId(str);
            throw null;
        }
        this.ShareDataUIState.setFeeInquiryRequestId(str);
        int i4 = coroutineCreation + 53;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setFirstName(String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 69;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.equals.setFirstName(str);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void setFormattedAmountError(int stringResId, TextResource currency, String amount, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 109;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(amount, "");
        if (i3 == 0) {
            this.component3.setFormattedAmountError(stringResId, currency, amount, errorType, isWarning);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component3.setFormattedAmountError(stringResId, currency, amount, errorType, isWarning);
        int i4 = coroutineCreation + 19;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setLastName(String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 71;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SendToMobileGetFeeDelegateImpl sendToMobileGetFeeDelegateImpl = this.equals;
        if (i3 != 0) {
            sendToMobileGetFeeDelegateImpl.setLastName(str);
            return;
        }
        sendToMobileGetFeeDelegateImpl.setLastName(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setMiddleName(String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 43;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.equals.setMiddleName(str);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 45;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override
    public void setSendToMobileFeeInquiryRequestId(String str) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 31;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.equals.setSendToMobileFeeInquiryRequestId(str);
        int i4 = coroutineCreation + 97;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateAmount(String value) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 47;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.component3.updateAmount(value);
        int i4 = coroutineCreation + 113;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 45 / 0;
        }
    }

    @Override
    public void updateAmountValidityStatus(boolean valid) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 81;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component3.updateAmountValidityStatus(valid);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 75;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateCurrency(String value) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 125;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.component3.updateCurrency(value);
        int i4 = coroutineCreation + 123;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateExchangeCurrency(String value) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 45;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.component3.updateExchangeCurrency(value);
        int i4 = coroutineCreation + 29;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateMpesaBalance(double balance) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 21;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component3.updateMpesaBalance(balance);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void updateOtherPurposeOfFunds(String value) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 85;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        if (i3 == 0) {
            this.component4.updateOtherPurposeOfFunds(value);
            int i4 = 5 / 0;
        } else {
            this.component4.updateOtherPurposeOfFunds(value);
        }
        int i5 = coroutineCreation + 77;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void updateOtherSourceOfFunds(String value) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 103;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.component4.updateOtherSourceOfFunds(value);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 41;
        coroutineCreation = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedCarrier(int index) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 11;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component4.updateSelectedCarrier(index);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateSelectedCurrency(int index) {
        int i = 2 % 2;
        int i2 = getARTIFICIAL_FRAME_PACKAGE_NAME + 101;
        coroutineCreation = i2 % 128;
        int i3 = i2 % 2;
        this.component4.updateSelectedCurrency(index);
        if (i3 == 0) {
            throw null;
        }
    }

    @Override
    public void updateSelectedPurposeOfFunds(int index) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 79;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component4.updateSelectedPurposeOfFunds(index);
        int i4 = coroutineCreation + 75;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedSourceOfFunds(int index) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 15;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        this.component4.updateSelectedSourceOfFunds(index);
        int i4 = getARTIFICIAL_FRAME_PACKAGE_NAME + 51;
        coroutineCreation = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
    }

    @Override
    public void updateSelectionDetailState(Function1<? super SelectionDetailsState, SelectionDetailsState> transform) {
        int i = 2 % 2;
        int i2 = coroutineCreation + 7;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transform, "");
        this.component4.updateSelectionDetailState(transform);
        int i4 = coroutineCreation + 97;
        getARTIFICIAL_FRAME_PACKAGE_NAME = i4 % 128;
        int i5 = i4 % 2;
    }
}
