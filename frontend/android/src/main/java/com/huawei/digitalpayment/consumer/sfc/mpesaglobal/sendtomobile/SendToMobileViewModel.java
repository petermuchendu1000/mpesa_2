package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtRequestHelperKt;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceBody;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceData;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceRequest;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceRequestHeader;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.CountryCarrier;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Currency;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.getfee.SendToMobileGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.getfee.SendToMobileGetFeeDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.recipientdetails.RecipientDetailsState;
import com.huawei.http.BaseRequest;
import com.safaricom.consumer.commons.amountvalidation.AmountDetailsState;
import com.safaricom.consumer.commons.amountvalidation.AmountHandlerDelegate;
import com.safaricom.consumer.commons.amountvalidation.AmountHandlerDelegateImpl;
import com.safaricom.consumer.commons.amountvalidation.AmountViewModel;
import com.safaricom.consumer.commons.configuration.ConfigurationRepository;
import com.safaricom.consumer.commons.transaction.ITransactionType;
import com.safaricom.consumer.commons.util.TextResource;
import com.safaricom.sharedui.compose.confirmation.ConfirmInfoItem;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001uB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020%2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\b\u0010(\u001a\u00020%H\u0002J\u0006\u0010)\u001a\u00020%J\u0006\u0010*\u001a\u00020%J\u000e\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u000200J\u001c\u00101\u001a\u00020%2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001603H\u0002J\u0006\u00104\u001a\u00020%J\u0006\u00105\u001a\u00020%J\u0006\u00106\u001a\u00020%J\b\u00107\u001a\u000208H\u0002J\u000e\u00109\u001a\u00020%2\u0006\u0010:\u001a\u00020;J\u0012\u0010<\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0006\u0010?\u001a\u00020%J\u0006\u0010@\u001a\u00020%J\t\u0010A\u001a\u00020BH\u0097\u0001J\u001b\u0010C\u001a\u00020%2\u0006\u0010D\u001a\u00020\u001c2\b\u0010E\u001a\u0004\u0018\u00010FH\u0097\u0001Ju\u0010G\u001a\u00020%2\b\b\u0001\u0010H\u001a\u0002002\b\b\u0001\u0010I\u001a\u0002002\b\b\u0001\u0010J\u001a\u0002002\b\b\u0001\u0010K\u001a\u0002002\b\b\u0001\u0010L\u001a\u0002002\b\b\u0001\u0010M\u001a\u0002002\b\b\u0001\u0010N\u001a\u00020\u001c2\u000e\b\u0001\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0014\b\u0001\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0015H\u0097\u0001J\u001b\u0010Q\u001a\u00020%2\b\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020UH\u0097\u0001J%\u0010V\u001a\u00020%2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010Y\u001a\u00020\u001cH\u0097\u0001J3\u0010Z\u001a\u00020%2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020X2\u0006\u0010I\u001a\u0002002\b\u0010E\u001a\u0004\u0018\u00010F2\u0006\u0010Y\u001a\u00020\u001cH\u0097\u0001J\u0011\u0010^\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0097\u0001J\u0011\u0010_\u001a\u00020%2\u0006\u0010`\u001a\u00020\u001cH\u0097\u0001J\u0011\u0010a\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0097\u0001J\u0011\u0010b\u001a\u00020%2\u0006\u0010/\u001a\u000200H\u0097\u0001J\u0011\u0010c\u001a\u00020%2\u0006\u0010d\u001a\u00020BH\u0097\u0001J\u0013\u0010e\u001a\u00020%2\b\b\u0001\u0010/\u001a\u000200H\u0097\u0001J\u0013\u0010f\u001a\u00020%2\b\b\u0001\u0010/\u001a\u000200H\u0097\u0001J\u0013\u0010g\u001a\u00020%2\b\b\u0001\u0010h\u001a\u00020\\H\u0097\u0001J\u0013\u0010i\u001a\u00020%2\b\b\u0001\u0010h\u001a\u00020\\H\u0097\u0001J\u0013\u0010j\u001a\u00020%2\b\b\u0001\u0010h\u001a\u00020\\H\u0097\u0001J\u0013\u0010k\u001a\u00020%2\b\b\u0001\u0010h\u001a\u00020\\H\u0097\u0001J\u001f\u0010l\u001a\u00020%2\u0014\b\u0001\u00102\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020m03H\u0097\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0018¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010n\u001a\b\u0012\u0004\u0012\u00020o0\u00188\u0016X\u0097\u0005R\r\u0010p\u001a\u0002008\u0016@\u0016X\u0097\u000fR\r\u0010q\u001a\u0002008\u0016@\u0016X\u0097\u000fR\r\u0010r\u001a\u0002008\u0016@\u0016X\u0097\u000fR\u0011\u0010s\u001a\b\u0012\u0004\u0012\u00020m0\u00188\u0016X\u0097\u0005R\r\u0010t\u001a\u0002008\u0016@\u0016X\u0097\u000f¨\u0006v"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDataDelegate;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountHandlerDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/getfee/SendToMobileGetFeeDelegate;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "_screenTransition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "screenTransition", "Landroidx/lifecycle/LiveData;", "getScreenTransition", "()Landroidx/lifecycle/LiveData;", "_recipientDetailState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/recipientdetails/RecipientDetailsState;", "recipientDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "getRecipientDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "_confirmationLoading", "", "confirmationLoading", "getConfirmationLoading", "_confirmationData", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "confirmationData", "getConfirmationData", "setSourceAndPurposeSelection", "", "setScreen", "screenInformation", "nextScreen", "previousScreen", "showError", "setCountry", "country", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "updatePhoneNumber", "value", "", "updateRecipientDetailState", "transform", "Lkotlin/Function1;", "onSelectContact", "onChangeCountry", "onDetailsContinue", "getFees", "Lkotlinx/coroutines/Job;", "onConfirmContinue", "context", "Landroid/content/Context;", "handleSendToMobileError", "e", "Lcom/huawei/common/exception/BaseException;", "onPause", "onResume", "calculateAmount", "", "clearAmountError", "useOverdraft", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "getSendToMobileFee", "phoneNumber", "amount", "selectedCountryIso", "selectedCountryName", "selectedCurrencyIso", "selectedCarrier", "isCostEstimatorFlow", "confirmationLoadingObservable", "confirmationDataObservable", "handleAmountError", "amountError", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "transactionType", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "setAmountError", "error", "Lcom/safaricom/consumer/commons/util/TextResource;", "isWarning", "setFormattedAmountError", "stringResId", "", "currency", "updateAmount", "updateAmountValidityStatus", "valid", "updateCurrency", "updateExchangeCurrency", "updateMpesaBalance", "balance", "updateOtherPurposeOfFunds", "updateOtherSourceOfFunds", "updateSelectedCarrier", FirebaseAnalytics.Param.INDEX, "updateSelectedCurrency", "updateSelectedPurposeOfFunds", "updateSelectedSourceOfFunds", "updateSelectionDetailState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "firstName", "lastName", "middleName", "selectionDetailsState", "sendToMobileFeeInquiryRequestId", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SendToMobileViewModel extends ViewModel implements BaseModel, SelectionDataDelegate, AmountHandlerDelegate, SendToMobileGetFeeDelegate {
    private static int ArtificialStackFrames = 0;
    private static int CoroutineDebuggingKt = 1;
    public static final String SCREEN_KEY = "screen_key";
    private static int coroutineBoundary = 0;
    private static int getShareableDataState = 1;
    private final MutableStateFlow<Boolean> ShareDataUIState;
    private final AmountHandlerDelegateImpl component1;
    private final SendToMobileGetFeeDelegateImpl component2;
    private final MutableStateFlow<List<ConfirmInfoItem>> component3;
    private final MutableLiveData<ScreenInformation<MPesaGlobalScreen>> component4;
    private final MutableStateFlow<RecipientDetailsState> copy;
    private final SelectionDataDelegateImpl copydefault;
    private final StateFlow<Boolean> equals;
    private final StateFlow<List<ConfirmInfoItem>> getAsAtTimestamp;
    private final ConfigurationRepository getRequestBeneficiariesState;
    private final SavedStateHandle getSponsorBeneficiariesState;
    private final StateFlow<RecipientDetailsState> hashCode;
    private final LiveData<ScreenInformation<MPesaGlobalScreen>> toString;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static final MutableStateFlow access$get_confirmationData$p(SendToMobileViewModel sendToMobileViewModel) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 17;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<List<ConfirmInfoItem>> mutableStateFlow = sendToMobileViewModel.component3;
        if (i3 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_confirmationLoading$p(SendToMobileViewModel sendToMobileViewModel) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 113;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        int i4 = i2 % 2;
        MutableStateFlow<Boolean> mutableStateFlow = sendToMobileViewModel.ShareDataUIState;
        int i5 = i3 + 27;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$get_recipientDetailState$p(SendToMobileViewModel sendToMobileViewModel) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 83;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<RecipientDetailsState> mutableStateFlow = sendToMobileViewModel.copy;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 67;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 41 / 0;
        }
        return mutableStateFlow;
    }

    public static final void access$nextScreen(SendToMobileViewModel sendToMobileViewModel) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 55;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        sendToMobileViewModel.component1();
        int i4 = getShareableDataState + 47;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Inject
    public SendToMobileViewModel(SavedStateHandle savedStateHandle, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.copydefault = new SelectionDataDelegateImpl();
        this.component1 = new AmountHandlerDelegateImpl(configurationRepository);
        this.component2 = new SendToMobileGetFeeDelegateImpl(configurationRepository);
        this.getSponsorBeneficiariesState = savedStateHandle;
        this.getRequestBeneficiariesState = configurationRepository;
        MutableLiveData<ScreenInformation<MPesaGlobalScreen>> mutableLiveData = new MutableLiveData<>();
        this.component4 = mutableLiveData;
        this.toString = mutableLiveData;
        MutableStateFlow<RecipientDetailsState> MutableStateFlow = StateFlowKt.MutableStateFlow(new RecipientDetailsState(null, null, null, null, null, null, null, null, 255, null));
        this.copy = MutableStateFlow;
        this.hashCode = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this.ShareDataUIState = MutableStateFlow2;
        this.equals = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<ConfirmInfoItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.component3 = MutableStateFlow3;
        this.getAsAtTimestamp = FlowKt.asStateFlow(MutableStateFlow3);
        ShareDataUIState(new ScreenInformation<>(MPesaGlobalScreen.CountrySelection.INSTANCE, ScreenDirection.NONE));
        ShareDataUIState();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/sendtomobile/SendToMobileViewModel$Companion;", "", "<init>", "()V", "SCREEN_KEY", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final LiveData<ScreenInformation<MPesaGlobalScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 11;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        LiveData<ScreenInformation<MPesaGlobalScreen>> liveData = this.toString;
        int i5 = i2 + 97;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final StateFlow<RecipientDetailsState> getRecipientDetailState() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames;
        int i3 = i2 + 103;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<RecipientDetailsState> stateFlow = this.hashCode;
        int i5 = i2 + 85;
        getShareableDataState = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> getConfirmationLoading() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 65;
        int i3 = i2 % 128;
        getShareableDataState = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StateFlow<Boolean> stateFlow = this.equals;
        int i4 = i3 + 73;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public final StateFlow<List<ConfirmInfoItem>> getConfirmationData() {
        int i = 2 % 2;
        int i2 = getShareableDataState;
        int i3 = i2 + 97;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<List<ConfirmInfoItem>> stateFlow = this.getAsAtTimestamp;
        int i5 = i2 + 43;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.globalServices_purposeOfFunds_giftOrDonation), Integer.valueOf(R.string.globalServices_purposeOfFunds_investmentOrBusiness), Integer.valueOf(R.string.globalServices_purposeOfFunds_pension), Integer.valueOf(R.string.globalServices_purposeOfFunds_personalConsumption), Integer.valueOf(R.string.one_app_western_union_other_purpose)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        int i2 = ArtificialStackFrames + 47;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectionItem(String.valueOf(iIntValue), TextResource.Companion.invoke$default(TextResource.INSTANCE, iIntValue, false, 2, (Object) null)));
        }
        final ArrayList arrayList2 = arrayList;
        List listListOf2 = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.globalServices_sourceOfFunds_business), Integer.valueOf(R.string.globalServices_sourceOfFunds_salary), Integer.valueOf(R.string.globalServices_sourceOfFunds_savings), Integer.valueOf(R.string.one_app_western_union_other_source)});
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf2, 10));
        Iterator it2 = listListOf2.iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((Number) it2.next()).intValue();
            arrayList3.add(new SelectionItem(String.valueOf(iIntValue2), TextResource.Companion.invoke$default(TextResource.INSTANCE, iIntValue2, false, 2, (Object) null)));
        }
        final ArrayList arrayList4 = arrayList3;
        updateSelectionDetailState(new Function1() {
            private static int component2 = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = component2 + 71;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                SelectionDetailsState selectionDetailsStateM11061$r8$lambda$AsLruFuRItycRPrcfzjeMaxLsw = SendToMobileViewModel.m11061$r8$lambda$AsLruFuRItycRPrcfzjeMaxLsw(arrayList4, arrayList2, (SelectionDetailsState) obj);
                int i7 = component2 + 47;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return selectionDetailsStateM11061$r8$lambda$AsLruFuRItycRPrcfzjeMaxLsw;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    private static final SelectionDetailsState component2(List list, List list2, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 67;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(selectionDetailsState, "");
        SelectionDetailsState selectionDetailsStateCopy$default = SelectionDetailsState.copy$default(selectionDetailsState, ExtensionsKt.toPersistentList(list), 0, null, ExtensionsKt.toPersistentList(list2), 0, null, null, null, null, null, null, null, 0, null, 0, 32758, null);
        int i4 = ArtificialStackFrames + 57;
        getShareableDataState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 2 / 0;
        }
        return selectionDetailsStateCopy$default;
    }

    private final void ShareDataUIState(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 93;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.component4.setValue(screenInformation);
        int i4 = getShareableDataState + 9;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    private final void component1() {
        MPesaGlobalScreen.Confirmation confirmation;
        int i = 2 % 2;
        int i2 = getShareableDataState + 47;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        ScreenInformation<MPesaGlobalScreen> value = this.component4.getValue();
        MPesaGlobalScreen screen = value != null ? value.getScreen() : null;
        if (screen instanceof MPesaGlobalScreen.CountrySelection) {
            confirmation = MPesaGlobalScreen.RecipientDetails.INSTANCE;
        } else if (screen instanceof MPesaGlobalScreen.RecipientDetails) {
            int i4 = getShareableDataState + 29;
            ArtificialStackFrames = i4 % 128;
            int i5 = i4 % 2;
            confirmation = MPesaGlobalScreen.Confirmation.INSTANCE;
        } else if (!(!(screen instanceof MPesaGlobalScreen.ContactSelection))) {
            confirmation = MPesaGlobalScreen.Confirmation.INSTANCE;
        } else {
            if (!(screen instanceof MPesaGlobalScreen.Confirmation)) {
                throw new IllegalArgumentException("Invalid screen " + screen);
            }
            int i6 = ArtificialStackFrames + 47;
            getShareableDataState = i6 % 128;
            int i7 = i6 % 2;
            confirmation = MPesaGlobalScreen.TransactionSuccess.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("Current screen: ");
        ScreenInformation<MPesaGlobalScreen> value2 = this.component4.getValue();
        sb.append(value2 != null ? value2.getScreen() : null);
        Log.d("SendToMobileViewModel", sb.toString());
        Log.d("SendToMobileViewModel", "Next screen: " + confirmation);
        ShareDataUIState(new ScreenInformation<>(confirmation, ScreenDirection.FORWARD));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void previousScreen() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.lifecycle.MutableLiveData<com.safaricom.sharedui.compose.navigation.ScreenInformation<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen>> r1 = r4.component4
            java.lang.Object r1 = r1.getValue()
            com.safaricom.sharedui.compose.navigation.ScreenInformation r1 = (com.safaricom.sharedui.compose.navigation.ScreenInformation) r1
            if (r1 == 0) goto L26
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.getShareableDataState
            int r2 = r2 + 27
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.ArtificialStackFrames = r3
            int r2 = r2 % r0
            java.lang.Object r1 = r1.getScreen()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.ArtificialStackFrames
            int r2 = r2 + 41
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.getShareableDataState = r3
            int r2 = r2 % r0
            goto L27
        L26:
            r1 = 0
        L27:
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.ConfirmationError
            r3 = 1
            if (r2 == r3) goto L5e
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionError
            if (r2 != 0) goto L5e
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection
            if (r2 == 0) goto L35
            goto L5e
        L35:
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Confirmation
            if (r2 == 0) goto L3e
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$AmountDetails r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            goto L6b
        L3e:
            boolean r2 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails
            if (r2 == 0) goto L47
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$RecipientDetails r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.RecipientDetails.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            goto L6b
        L47:
            boolean r1 = r1 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.RecipientDetails
            if (r1 == 0) goto L59
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$CountrySelection r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.getShareableDataState
            int r2 = r2 + 101
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.ArtificialStackFrames = r3
        L57:
            int r2 = r2 % r0
            goto L6b
        L59:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Close r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Close.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            goto L6b
        L5e:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Dashboard r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Dashboard.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r1 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r1
            int r2 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.ArtificialStackFrames
            int r2 = r2 + 25
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.getShareableDataState = r3
            goto L57
        L6b:
            com.safaricom.sharedui.compose.navigation.ScreenInformation r2 = new com.safaricom.sharedui.compose.navigation.ScreenInformation
            com.safaricom.sharedui.compose.navigation.ScreenDirection r3 = com.safaricom.sharedui.compose.navigation.ScreenDirection.BACK
            r2.<init>(r1, r3)
            r4.ShareDataUIState(r2)
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.getShareableDataState
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.ArtificialStackFrames = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L84
            r0 = 33
            int r0 = r0 / 0
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.previousScreen():void");
    }

    public final void showError() {
        int i = 2 % 2;
        ShareDataUIState(new ScreenInformation<>(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
        int i2 = getShareableDataState + 89;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final SelectionDetailsState component3(Country country, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(selectionDetailsState, "");
        String name = country.getName();
        String alpha2Code = country.getAlpha2Code();
        String emoji = country.getEmoji();
        String dialCode = country.getDialCode();
        List<Currency> currencies = country.getCurrencies();
        ArrayList arrayList = new ArrayList();
        for (Object obj : currencies) {
            Currency currency = (Currency) obj;
            if (currency.getName().length() > 0 && currency.getIso().length() > 0) {
                int i2 = ArtificialStackFrames + 29;
                getShareableDataState = i2 % 128;
                int i3 = i2 % 2;
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        int i4 = ArtificialStackFrames + 107;
        while (true) {
            getShareableDataState = i4 % 128;
            int i5 = i4 % 2;
            if (!it.hasNext()) {
                break;
            }
            Currency currency2 = (Currency) it.next();
            arrayList3.add(new SelectionItem(currency2.getIso(), TextResource.Companion.invoke$default(TextResource.INSTANCE, currency2.getName(), false, 2, (Object) null)));
            i4 = ArtificialStackFrames + 53;
        }
        PersistentList persistentList = ExtensionsKt.toPersistentList(arrayList3);
        List<CountryCarrier> carriers = country.getCarriers();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(carriers, 10));
        int i6 = ArtificialStackFrames + 83;
        getShareableDataState = i6 % 128;
        int i7 = i6 % 2;
        for (CountryCarrier countryCarrier : carriers) {
            arrayList4.add(new SelectionItem(countryCarrier.getId(), TextResource.Companion.invoke$default(TextResource.INSTANCE, countryCarrier.getName(), false, 2, (Object) null)));
        }
        SelectionDetailsState selectionDetailsStateCopy$default = SelectionDetailsState.copy$default(selectionDetailsState, null, 0, null, null, 0, null, name, alpha2Code, null, emoji, dialCode, persistentList, 0, ExtensionsKt.toPersistentList(arrayList4), 0, 20799, null);
        int i8 = ArtificialStackFrames + 59;
        getShareableDataState = i8 % 128;
        int i9 = i8 % 2;
        return selectionDetailsStateCopy$default;
    }

    public final void setCountry(final Country country) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Log.d("LIPSUM", "Send to mobile carriers: " + country.getCarriers());
        updateSelectionDetailState(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 95;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    SendToMobileViewModel.m11063$r8$lambda$j34vsSQHHfFgky4hhOMDq0gleA(country, (SelectionDetailsState) obj);
                    throw null;
                }
                SelectionDetailsState selectionDetailsStateM11063$r8$lambda$j34vsSQHHfFgky4hhOMDq0gleA = SendToMobileViewModel.m11063$r8$lambda$j34vsSQHHfFgky4hhOMDq0gleA(country, (SelectionDetailsState) obj);
                int i4 = component3 + 7;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return selectionDetailsStateM11063$r8$lambda$j34vsSQHHfFgky4hhOMDq0gleA;
            }
        });
        updateExchangeCurrency(country.getCurrencies().get(0).getIso());
        component1();
        int i2 = ArtificialStackFrames + 125;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void updatePhoneNumber(final String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        component2(new Function1() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 121;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                RecipientDetailsState recipientDetailsStateM11062$r8$lambda$i5xmG5aikTX43cHFu_qJRQ6pj4 = SendToMobileViewModel.m11062$r8$lambda$i5xmG5aikTX43cHFu_qJRQ6pj4(value, (RecipientDetailsState) obj);
                int i5 = component2 + 9;
                copydefault = i5 % 128;
                if (i5 % 2 == 0) {
                    return recipientDetailsStateM11062$r8$lambda$i5xmG5aikTX43cHFu_qJRQ6pj4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = ArtificialStackFrames + 71;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 21 / 0;
        }
    }

    private static final RecipientDetailsState copydefault(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 25;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(recipientDetailsState, "");
        RecipientDetailsState recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, null, null, null, null, null, null, str, null, 191, null);
        int i4 = getShareableDataState + 5;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return recipientDetailsStateCopy$default;
    }

    public final void onSelectContact() {
        int i = 2 % 2;
        ShareDataUIState(new ScreenInformation<>(MPesaGlobalScreen.ContactSelection.INSTANCE, ScreenDirection.FORWARD));
        int i2 = getShareableDataState + 33;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void onChangeCountry() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 79;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        previousScreen();
        if (i3 == 0) {
            int i4 = 97 / 0;
        }
    }

    public final void onDetailsContinue() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 45;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            component1();
            copydefault();
            int i3 = ArtificialStackFrames + 11;
            getShareableDataState = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        component1();
        copydefault();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel$getFees$1", f = "SendToMobileViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int ShareDataUIState;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
        
            if ((!r2.getCarrierSelection().isEmpty()) == true) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            r3 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            r3 = r2.getCarrierSelection().get(r2.getSelectedCarrierIndex());
            r4 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.copydefault + 125;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.component3 = r4 % 128;
            r4 = r4 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
        
            r8 = r2.getCurrencySelection().get(r2.getSelectedCurrencyIndex()).getId();
            r4 = r14.getPhoneNumber();
            r14 = r1.getAmount();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0092, code lost:
        
            if (r3 == null) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.component3 + 55;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.copydefault = r1 % 128;
            r1 = r1 % 2;
            r5 = r3.getId();
            r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.copydefault + 3;
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.component3 = r1 % 128;
            r1 = r1 % 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00aa, code lost:
        
            if (r5 != null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00ac, code lost:
        
            r9 = "";
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:
        
            r9 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00b1, code lost:
        
            r13.component2.getSendToMobileFee(r4, r14, r6, r7, r8, r9, false, com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.access$get_confirmationLoading$p(r13.component2), com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.access$get_confirmationData$p(r13.component2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c6, code lost:
        
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00ce, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r13.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r13.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r14);
            r14 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.recipientdetails.RecipientDetailsState) com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.access$get_recipientDetailState$p(r13.component2).getValue();
            r1 = r13.component2.getAmountDetailsState().getValue();
            r2 = r13.component2.getSelectionDetailsState().getValue();
            r6 = r2.getSelectedCountryIso();
            r7 = r2.getSelectedCountry();
            r5 = null;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.sendtomobile.SendToMobileViewModel.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SendToMobileViewModel.this.new component3(continuation);
            int i2 = component3 + 103;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                return component3Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 57;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = copydefault + 117;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 109;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 61 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private final Job copydefault() {
        int i = 2 % 2;
        Object obj = null;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(null), 3, null);
        int i2 = ArtificialStackFrames + 35;
        getShareableDataState = i2 % 128;
        if (i2 % 2 != 0) {
            return jobShareDataUIState;
        }
        obj.hashCode();
        throw null;
    }

    public final void onConfirmContinue(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        this.ShareDataUIState.setValue(true);
        RecipientDetailsState value = this.hashCode.getValue();
        AmountDetailsState value2 = getAmountDetailsState().getValue();
        SelectionDetailsState value3 = getSelectionDetailsState().getValue();
        HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 31;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    return "/mpesa-global/send-to-mobile/v1/imtsendtomobile";
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String str = "254" + StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        ImtServiceRequestHeader imtServiceRequestHeaderGenerateImtRequestHeader = ImtRequestHelperKt.generateImtRequestHeader(ImtConstants.IMT_PAY_MOBILE_WALLET);
        ImtServiceData[] imtServiceDataArr = new ImtServiceData[11];
        imtServiceDataArr[0] = new ImtServiceData(ImtConstants.KEY_COUNTRY_ISO, value3.getSelectedCountryIso());
        imtServiceDataArr[1] = new ImtServiceData(ImtConstants.KEY_CURRENCY_ISO, value3.getCurrencySelection().get(value3.getSelectedCurrencyIndex()).getId());
        imtServiceDataArr[2] = new ImtServiceData("msisdn", str);
        imtServiceDataArr[3] = new ImtServiceData("amount", value2.getAmount());
        imtServiceDataArr[4] = new ImtServiceData(ImtConstants.KEY_RECEIVER_MOBILE_NUMBER, value.getPhoneNumber());
        imtServiceDataArr[5] = new ImtServiceData("feeinquiryrequestid", getSendToMobileFeeInquiryRequestId());
        imtServiceDataArr[6] = new ImtServiceData(ImtConstants.KEY_FIRST_NAME, getFirstName());
        imtServiceDataArr[7] = new ImtServiceData(ImtConstants.KEY_LAST_NAME, getLastName());
        imtServiceDataArr[8] = new ImtServiceData(ImtConstants.KEY_MIDDLE_NAME, getMiddleName());
        String otherPurposeOfFunds = value3.getOtherPurposeOfFunds();
        if (otherPurposeOfFunds.length() == 0) {
            otherPurposeOfFunds = value3.getPurposeOfFundsSelection().get(value3.getSelectedPurposeOfFundsIndex()).getTitle().getValue(context);
        }
        imtServiceDataArr[9] = new ImtServiceData(ImtConstants.KEY_PURPOSE, otherPurposeOfFunds);
        String otherSourceOfFunds = value3.getOtherSourceOfFunds();
        if (otherSourceOfFunds.length() == 0) {
            int i2 = getShareableDataState + 23;
            ArtificialStackFrames = i2 % 128;
            if (i2 % 2 != 0) {
                value3.getSourceOfFundsSelection().get(value3.getSelectedSourceOfFundsIndex()).getTitle().getValue(context);
                throw null;
            }
            otherSourceOfFunds = value3.getSourceOfFundsSelection().get(value3.getSelectedSourceOfFundsIndex()).getTitle().getValue(context);
            int i3 = getShareableDataState + 65;
            ArtificialStackFrames = i3 % 128;
            int i4 = i3 % 2;
        }
        imtServiceDataArr[10] = new ImtServiceData(ImtConstants.KEY_SOURCE_OF_FUNDS, otherSourceOfFunds);
        haProxyRequest.addParams(ImtConstants.SERVICE_REQUEST_KEY, new ImtServiceRequest(imtServiceRequestHeaderGenerateImtRequestHeader, new ImtServiceBody(CollectionsKt.listOf((Object[]) imtServiceDataArr))));
        sendRequest(haProxyRequest, new ApiCallback<Object>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Object value4) {
                int i5 = 2 % 2;
                super.onSuccess(value4);
                Log.d("SendToMobileViewModel", "Send to Mobile request success, data: " + value4);
                SendToMobileViewModel.access$get_confirmationLoading$p(SendToMobileViewModel.this).setValue(false);
                SendToMobileViewModel.access$nextScreen(SendToMobileViewModel.this);
                int i6 = copydefault + 19;
                component1 = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override
            public void onError(BaseException e) {
                MutableStateFlow mutableStateFlowAccess$get_confirmationLoading$p;
                int i5 = 2 % 2;
                int i6 = component1 + 69;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    mutableStateFlowAccess$get_confirmationLoading$p = SendToMobileViewModel.access$get_confirmationLoading$p(SendToMobileViewModel.this);
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    mutableStateFlowAccess$get_confirmationLoading$p = SendToMobileViewModel.access$get_confirmationLoading$p(SendToMobileViewModel.this);
                }
                mutableStateFlowAccess$get_confirmationLoading$p.setValue(false);
                SendToMobileViewModel.this.handleSendToMobileError(e);
            }
        });
    }

    @Override
    public void handleSendToMobileError(BaseException e) {
        int i = 2 % 2;
        Log.d("SendToMobileViewModel", "Send to Mobile request error: " + e);
        ShareDataUIState(new ScreenInformation<>(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
        int i2 = getShareableDataState + 3;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onPause() {
        ScreenInformation<MPesaGlobalScreen> value;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 125;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            value = this.component4.getValue();
            int i3 = 25 / 0;
            if (value == null) {
                return;
            }
        } else {
            value = this.component4.getValue();
            if (value == null) {
                return;
            }
        }
        int i4 = ArtificialStackFrames + 5;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        MPesaGlobalScreen screen = value.getScreen();
        if (screen != null) {
            this.getSponsorBeneficiariesState.set("screen_key", screen);
        }
    }

    public final void onResume() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 63;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        MPesaGlobalScreen mPesaGlobalScreen = (MPesaGlobalScreen) this.getSponsorBeneficiariesState.get("screen_key");
        if (mPesaGlobalScreen != null) {
            int i4 = ArtificialStackFrames + 43;
            getShareableDataState = i4 % 128;
            if (i4 % 2 == 0) {
                this.component4.getValue();
                throw null;
            }
            ScreenInformation<MPesaGlobalScreen> value = this.component4.getValue();
            if (Intrinsics.areEqual(value != null ? value.getScreen() : null, mPesaGlobalScreen)) {
                return;
            }
            ShareDataUIState(new ScreenInformation<>(mPesaGlobalScreen, ScreenDirection.NONE));
            int i5 = ArtificialStackFrames + 71;
            getShareableDataState = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private final void component2(Function1<? super RecipientDetailsState, RecipientDetailsState> function1) {
        MutableStateFlow<RecipientDetailsState> mutableStateFlow;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 21;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            mutableStateFlow = this.copy;
            int i3 = 58 / 0;
        } else {
            mutableStateFlow = this.copy;
        }
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), function1.invoke(this.copy.getValue()))) {
        }
    }

    public static SelectionDetailsState m11061$r8$lambda$AsLruFuRItycRPrcfzjeMaxLsw(List list, List list2, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 55;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        SelectionDetailsState selectionDetailsStateComponent2 = component2(list, list2, selectionDetailsState);
        int i4 = ArtificialStackFrames + 79;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return selectionDetailsStateComponent2;
    }

    public static RecipientDetailsState m11062$r8$lambda$i5xmG5aikTX43cHFu_qJRQ6pj4(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 81;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        RecipientDetailsState recipientDetailsStateCopydefault = copydefault(str, recipientDetailsState);
        int i4 = ArtificialStackFrames + 47;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return recipientDetailsStateCopydefault;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SelectionDetailsState m11063$r8$lambda$j34vsSQHHfFgky4hhOMDq0gleA(Country country, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 121;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        SelectionDetailsState selectionDetailsStateComponent3 = component3(country, selectionDetailsState);
        if (i3 != 0) {
            int i4 = 73 / 0;
        }
        return selectionDetailsStateComponent3;
    }

    static {
        int i = CoroutineDebuggingKt + 107;
        coroutineBoundary = i % 128;
        int i2 = i % 2;
    }

    @Override
    public double calculateAmount() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 47;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        double dCalculateAmount = this.component1.calculateAmount();
        int i4 = ArtificialStackFrames + 75;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
        return dCalculateAmount;
    }

    @Override
    public void clearAmountError(boolean useOverdraft, AmountViewModel.AmountErrorType errorType) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 65;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1.clearAmountError(useOverdraft, errorType);
            throw null;
        }
        this.component1.clearAmountError(useOverdraft, errorType);
        int i3 = ArtificialStackFrames + 99;
        getShareableDataState = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 46 / 0;
        }
    }

    @Override
    public StateFlow<AmountDetailsState> getAmountDetailsState() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 83;
        ArtificialStackFrames = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.component1.getAmountDetailsState();
            throw null;
        }
        StateFlow<AmountDetailsState> amountDetailsState = this.component1.getAmountDetailsState();
        int i3 = ArtificialStackFrames + 1;
        getShareableDataState = i3 % 128;
        if (i3 % 2 != 0) {
            return amountDetailsState;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public String getFirstName() {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 101;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        String firstName = this.component2.getFirstName();
        int i4 = ArtificialStackFrames + 39;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return firstName;
        }
        throw null;
    }

    @Override
    public String getLastName() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 1;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        String lastName = this.component2.getLastName();
        int i4 = getShareableDataState + 123;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return lastName;
    }

    @Override
    public String getMiddleName() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 85;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            this.component2.getMiddleName();
            throw null;
        }
        String middleName = this.component2.getMiddleName();
        int i3 = getShareableDataState + 55;
        ArtificialStackFrames = i3 % 128;
        int i4 = i3 % 2;
        return middleName;
    }

    @Override
    public StateFlow<SelectionDetailsState> getSelectionDetailsState() {
        int i = 2 % 2;
        int i2 = getShareableDataState + 95;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.getSelectionDetailsState();
            throw null;
        }
        StateFlow<SelectionDetailsState> selectionDetailsState = this.copydefault.getSelectionDetailsState();
        int i3 = ArtificialStackFrames + 47;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
        return selectionDetailsState;
    }

    @Override
    public void getSendToMobileFee(String phoneNumber, String amount, String selectedCountryIso, String selectedCountryName, String selectedCurrencyIso, String selectedCarrier, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 15;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(phoneNumber, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryName, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(selectedCarrier, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.component2.getSendToMobileFee(phoneNumber, amount, selectedCountryIso, selectedCountryName, selectedCurrencyIso, selectedCarrier, isCostEstimatorFlow, confirmationLoadingObservable, confirmationDataObservable);
        int i4 = getShareableDataState + 51;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    @Override
    public String getSendToMobileFeeInquiryRequestId() {
        String sendToMobileFeeInquiryRequestId;
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 49;
        getShareableDataState = i2 % 128;
        if (i2 % 2 == 0) {
            sendToMobileFeeInquiryRequestId = this.component2.getSendToMobileFeeInquiryRequestId();
            int i3 = 16 / 0;
        } else {
            sendToMobileFeeInquiryRequestId = this.component2.getSendToMobileFeeInquiryRequestId();
        }
        int i4 = getShareableDataState + 125;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
        return sendToMobileFeeInquiryRequestId;
    }

    @Override
    public void handleAmountError(AmountViewModel.AmountError amountError, ITransactionType transactionType) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 3;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        AmountHandlerDelegateImpl amountHandlerDelegateImpl = this.component1;
        if (i3 != 0) {
            amountHandlerDelegateImpl.handleAmountError(amountError, transactionType);
        } else {
            amountHandlerDelegateImpl.handleAmountError(amountError, transactionType);
            throw null;
        }
    }

    @Override
    public void setAmountError(TextResource error, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 87;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.component1.setAmountError(error, errorType, isWarning);
        int i4 = ArtificialStackFrames + 59;
        getShareableDataState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setFirstName(String str) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 95;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 != 0) {
            this.component2.setFirstName(str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component2.setFirstName(str);
        int i4 = getShareableDataState + 59;
        ArtificialStackFrames = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 97 / 0;
        }
    }

    @Override
    public void setFormattedAmountError(int stringResId, TextResource currency, String amount, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 103;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(amount, "");
        this.component1.setFormattedAmountError(stringResId, currency, amount, errorType, isWarning);
        int i4 = ArtificialStackFrames + 111;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setLastName(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 9;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        SendToMobileGetFeeDelegateImpl sendToMobileGetFeeDelegateImpl = this.component2;
        if (i3 != 0) {
            sendToMobileGetFeeDelegateImpl.setLastName(str);
        } else {
            sendToMobileGetFeeDelegateImpl.setLastName(str);
            int i4 = 18 / 0;
        }
    }

    @Override
    public void setMiddleName(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 91;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        this.component2.setMiddleName(str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void setSendToMobileFeeInquiryRequestId(String str) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 39;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        if (i3 == 0) {
            this.component2.setSendToMobileFeeInquiryRequestId(str);
            int i4 = 43 / 0;
        } else {
            this.component2.setSendToMobileFeeInquiryRequestId(str);
        }
        int i5 = ArtificialStackFrames + 43;
        getShareableDataState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void updateAmount(String value) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 83;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        if (i3 == 0) {
            this.component1.updateAmount(value);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component1.updateAmount(value);
        int i4 = getShareableDataState + 107;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateAmountValidityStatus(boolean valid) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 35;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateAmountValidityStatus(valid);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override
    public void updateCurrency(String value) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 103;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        AmountHandlerDelegateImpl amountHandlerDelegateImpl = this.component1;
        if (i3 == 0) {
            amountHandlerDelegateImpl.updateCurrency(value);
            return;
        }
        amountHandlerDelegateImpl.updateCurrency(value);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateExchangeCurrency(String value) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 19;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        if (i3 != 0) {
            this.component1.updateExchangeCurrency(value);
            int i4 = 41 / 0;
        } else {
            this.component1.updateExchangeCurrency(value);
        }
        int i5 = getShareableDataState + 7;
        ArtificialStackFrames = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override
    public void updateMpesaBalance(double balance) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 45;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateMpesaBalance(balance);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateOtherPurposeOfFunds(String value) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 107;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.copydefault.updateOtherPurposeOfFunds(value);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateOtherSourceOfFunds(String value) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 93;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.copydefault.updateOtherSourceOfFunds(value);
        int i4 = ArtificialStackFrames + 101;
        getShareableDataState = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedCarrier(int index) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 15;
        ArtificialStackFrames = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.updateSelectedCarrier(index);
        int i4 = getShareableDataState + 61;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedCurrency(int index) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 31;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.updateSelectedCurrency(index);
        int i4 = getShareableDataState + 123;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedPurposeOfFunds(int index) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 125;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.updateSelectedPurposeOfFunds(index);
        int i4 = getShareableDataState + 117;
        ArtificialStackFrames = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedSourceOfFunds(int index) {
        int i = 2 % 2;
        int i2 = getShareableDataState + 37;
        ArtificialStackFrames = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.updateSelectedSourceOfFunds(index);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.copydefault.updateSelectedSourceOfFunds(index);
        int i3 = ArtificialStackFrames + 29;
        getShareableDataState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void updateSelectionDetailState(Function1<? super SelectionDetailsState, SelectionDetailsState> transform) {
        int i = 2 % 2;
        int i2 = ArtificialStackFrames + 51;
        getShareableDataState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transform, "");
        SelectionDataDelegateImpl selectionDataDelegateImpl = this.copydefault;
        if (i3 != 0) {
            selectionDataDelegateImpl.updateSelectionDetailState(transform);
            return;
        }
        selectionDataDelegateImpl.updateSelectionDetailState(transform);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
