package com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.common.graph.ForwardingGraph;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfc.global.R;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.MpesaGlobalApiUrl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtRequestHelperKt;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceBody;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceData;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceRequest;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceRequestHeader;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Currency;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.State;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDataDelegateImpl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionDetailsState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.selectiondata.SelectionItem;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.getfee.WesternUnionGetFeeDelegate;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.getfee.WesternUnionGetFeeDelegateImpl;
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
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001pB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020%H\u0002J\u0006\u0010'\u001a\u00020%J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\u000e\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020%2\u0006\u0010.\u001a\u00020/J\u000e\u00101\u001a\u00020%2\u0006\u0010.\u001a\u00020/J\u001c\u00102\u001a\u00020%2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001604H\u0002J\u0016\u00105\u001a\u00020%2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u0006\u00107\u001a\u00020%J\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u00020%J\t\u0010>\u001a\u00020?H\u0097\u0001J\u001b\u0010@\u001a\u00020%2\u0006\u0010A\u001a\u00020\u001c2\b\u0010B\u001a\u0004\u0018\u00010CH\u0097\u0001J\u0081\u0001\u0010D\u001a\u00020%2\b\b\u0001\u0010E\u001a\u00020/2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010/2\b\b\u0001\u0010G\u001a\u00020H2\b\b\u0001\u0010I\u001a\u00020/2\b\b\u0001\u0010J\u001a\u00020H2\b\b\u0001\u0010K\u001a\u00020/2\b\b\u0001\u0010L\u001a\u00020/2\b\b\u0001\u0010M\u001a\u00020\u001c2\u000e\b\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00152\u0014\b\u0001\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0015H\u0097\u0001J\u001b\u0010P\u001a\u00020%2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010S\u001a\u00020TH\u0097\u0001J%\u0010U\u001a\u00020%2\b\u0010V\u001a\u0004\u0018\u00010H2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010W\u001a\u00020\u001cH\u0097\u0001J3\u0010X\u001a\u00020%2\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020H2\u0006\u0010L\u001a\u00020/2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010W\u001a\u00020\u001cH\u0097\u0001J\u0011\u0010\\\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0011\u0010]\u001a\u00020%2\u0006\u0010^\u001a\u00020\u001cH\u0097\u0001J\u0011\u0010_\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0011\u0010`\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0097\u0001J\u0011\u0010a\u001a\u00020%2\u0006\u0010b\u001a\u00020?H\u0097\u0001J\u0013\u0010c\u001a\u00020%2\b\b\u0001\u0010.\u001a\u00020/H\u0097\u0001J\u0013\u0010d\u001a\u00020%2\b\b\u0001\u0010.\u001a\u00020/H\u0097\u0001J\u0013\u0010e\u001a\u00020%2\b\b\u0001\u0010f\u001a\u00020ZH\u0097\u0001J\u0013\u0010g\u001a\u00020%2\b\b\u0001\u0010f\u001a\u00020ZH\u0097\u0001J\u0013\u0010h\u001a\u00020%2\b\b\u0001\u0010f\u001a\u00020ZH\u0097\u0001J\u0013\u0010i\u001a\u00020%2\b\b\u0001\u0010f\u001a\u00020ZH\u0097\u0001J\u001f\u0010j\u001a\u00020%2\u0014\b\u0001\u00103\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020k04H\u0097\u0001R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u0018¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010l\u001a\b\u0012\u0004\u0012\u00020m0\u00188\u0016X\u0097\u0005R\r\u0010n\u001a\u00020/8\u0016@\u0016X\u0097\u000fR\u0011\u0010o\u001a\b\u0012\u0004\u0012\u00020k0\u00188\u0016X\u0097\u0005¨\u0006q"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "Lcom/safaricom/consumer/commons/amountvalidation/AmountHandlerDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/getfee/WesternUnionGetFeeDelegate;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDataDelegate;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "configurations", "Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/safaricom/consumer/commons/configuration/ConfigurationRepository;)V", "_screenTransition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "screenTransition", "Landroidx/lifecycle/LiveData;", "getScreenTransition", "()Landroidx/lifecycle/LiveData;", "_recipientDetailState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/recipientdetails/RecipientDetailsState;", "recipientDetailState", "Lkotlinx/coroutines/flow/StateFlow;", "getRecipientDetailState", "()Lkotlinx/coroutines/flow/StateFlow;", "_confirmationLoading", "", "confirmationLoading", "getConfirmationLoading", "_confirmationData", "", "Lcom/safaricom/sharedui/compose/confirmation/ConfirmInfoItem;", "confirmationData", "getConfirmationData", "setSourceAndPurposeSelection", "", "nextScreen", "previousScreen", "setCountry", "country", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/State;", "updateFirstName", "value", "", "updateMiddleName", "updateLastName", "updateRecipientDetailState", "transform", "Lkotlin/Function1;", "setScreen", "screenInformation", "onRecipientDetailsContinue", "onAmountDetailsContinue", "Lkotlinx/coroutines/Job;", "onConfirmContinue", "context", "Landroid/content/Context;", "showError", "calculateAmount", "", "clearAmountError", "useOverdraft", "errorType", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountErrorType;", "getWesternUnionFee", "selectedCountryIso", "selectedStateIso", "selectedCountryName", "Lcom/safaricom/consumer/commons/util/TextResource;", "selectedCurrencyIso", "selectedCurrencyName", "fullName", "amount", "isCostEstimatorFlow", "confirmationLoadingObservable", "confirmationDataObservable", "handleAmountError", "amountError", "Lcom/safaricom/consumer/commons/amountvalidation/AmountViewModel$AmountError;", "transactionType", "Lcom/safaricom/consumer/commons/transaction/ITransactionType;", "setAmountError", "error", "isWarning", "setFormattedAmountError", "stringResId", "", "currency", "updateAmount", "updateAmountValidityStatus", "valid", "updateCurrency", "updateExchangeCurrency", "updateMpesaBalance", "balance", "updateOtherPurposeOfFunds", "updateOtherSourceOfFunds", "updateSelectedCarrier", FirebaseAnalytics.Param.INDEX, "updateSelectedCurrency", "updateSelectedPurposeOfFunds", "updateSelectedSourceOfFunds", "updateSelectionDetailState", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/selectiondata/SelectionDetailsState;", "amountDetailsState", "Lcom/safaricom/consumer/commons/amountvalidation/AmountDetailsState;", "feeInquiryRequestId", "selectionDetailsState", "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WesternUnionViewModel extends ViewModel implements BaseModel, AmountHandlerDelegate, WesternUnionGetFeeDelegate, SelectionDataDelegate {
    public static final String SCREEN_KEY = "screen_key";
    private static int coroutineBoundary = 1;
    private static int getSponsorBeneficiariesState = 0;
    private static int hashCode = 0;
    private static int toString = 1;
    private final StateFlow<RecipientDetailsState> ArtificialStackFrames;
    private final MutableStateFlow<Boolean> ShareDataUIState;
    private final SelectionDataDelegateImpl component1;
    private final WesternUnionGetFeeDelegateImpl component2;
    private final MutableStateFlow<List<ConfirmInfoItem>> component3;
    private final MutableLiveData<ScreenInformation<MPesaGlobalScreen>> component4;
    private final StateFlow<Boolean> copy;
    private final AmountHandlerDelegateImpl copydefault;
    private final StateFlow<List<ConfirmInfoItem>> equals;
    private final MutableStateFlow<RecipientDetailsState> getAsAtTimestamp;
    private final ConfigurationRepository getRequestBeneficiariesState;
    private final LiveData<ScreenInformation<MPesaGlobalScreen>> getShareableDataState;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static Object component3(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~((~i4) | i7);
        int i9 = (~i5) | (~(i7 | i4));
        int i10 = i4 | i5 | i7;
        int i11 = i5 + i6 + i2 + (1635157569 * i3) + ((-1141649966) * i);
        int i12 = i11 * i11;
        int i13 = (i5 * 1521345644) + 2088555610 + (i6 * 1521346098) + (i8 * (-227)) + (i9 * (-227)) + (i10 * 227) + (1521345871 * i2) + ((-1382509809) * i3) + (37969358 * i) + (i12 * (-671350784));
        if ((((-1186836012) * i5) - 711983104) + (488484398 * i6) + (i8 * 1309823443) + (1309823443 * i9) + ((-1309823443) * i10) + (1798307840 * i2) + (1462763520 * i3) + (1566572544 * i) + (1631846400 * i12) + (i13 * i13 * (-1069809664)) != 1) {
            return ShareDataUIState(objArr);
        }
        String str = (String) objArr[0];
        RecipientDetailsState recipientDetailsState = (RecipientDetailsState) objArr[1];
        int i14 = 2 % 2;
        int i15 = hashCode + 37;
        toString = i15 % 128;
        int i16 = i15 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(recipientDetailsState, "");
        RecipientDetailsState recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, null, null, null, str, null, null, null, null, 247, null);
        int i17 = toString + 65;
        hashCode = i17 % 128;
        int i18 = i17 % 2;
        return recipientDetailsStateCopy$default;
    }

    public static final MutableStateFlow access$get_confirmationData$p(WesternUnionViewModel westernUnionViewModel) {
        int i = 2 % 2;
        int i2 = toString + 3;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        MutableStateFlow<List<ConfirmInfoItem>> mutableStateFlow = westernUnionViewModel.component3;
        int i5 = i3 + 45;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 89 / 0;
        }
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$get_confirmationLoading$p(WesternUnionViewModel westernUnionViewModel) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 7;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<Boolean> mutableStateFlow = westernUnionViewModel.ShareDataUIState;
        int i5 = i2 + 11;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$nextScreen(WesternUnionViewModel westernUnionViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 93;
        toString = i2 % 128;
        int i3 = i2 % 2;
        westernUnionViewModel.component3();
        int i4 = hashCode + 109;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setScreen(WesternUnionViewModel westernUnionViewModel, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = hashCode + 125;
        toString = i2 % 128;
        int i3 = i2 % 2;
        westernUnionViewModel.ShareDataUIState((ScreenInformation<MPesaGlobalScreen>) screenInformation);
        if (i3 == 0) {
            int i4 = 91 / 0;
        }
        int i5 = toString + 81;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public WesternUnionViewModel(SavedStateHandle savedStateHandle, ConfigurationRepository configurationRepository) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(configurationRepository, "");
        this.copydefault = new AmountHandlerDelegateImpl(configurationRepository);
        this.component2 = new WesternUnionGetFeeDelegateImpl(configurationRepository);
        this.component1 = new SelectionDataDelegateImpl();
        this.getRequestBeneficiariesState = configurationRepository;
        MutableLiveData<ScreenInformation<MPesaGlobalScreen>> mutableLiveData = new MutableLiveData<>();
        this.component4 = mutableLiveData;
        this.getShareableDataState = mutableLiveData;
        MutableStateFlow<RecipientDetailsState> MutableStateFlow = StateFlowKt.MutableStateFlow(new RecipientDetailsState(null, null, null, null, null, null, null, null, 255, null));
        this.getAsAtTimestamp = MutableStateFlow;
        this.ArtificialStackFrames = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(false);
        this.ShareDataUIState = MutableStateFlow2;
        this.copy = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<List<ConfirmInfoItem>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.component3 = MutableStateFlow3;
        this.equals = FlowKt.asStateFlow(MutableStateFlow3);
        MPesaGlobalScreen.CountrySelection countrySelection = (MPesaGlobalScreen) savedStateHandle.get("screen_key");
        if (countrySelection == null) {
            countrySelection = MPesaGlobalScreen.CountrySelection.INSTANCE;
            int i = hashCode + 3;
            toString = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 / 4;
            } else {
                int i3 = 2 % 2;
            }
        }
        ShareDataUIState(new ScreenInformation<>(countrySelection, ScreenDirection.NONE));
        copydefault();
        int i4 = toString + 35;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/westernunion/WesternUnionViewModel$Companion;", "", "<init>", "()V", "SCREEN_KEY", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final LiveData<ScreenInformation<MPesaGlobalScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = hashCode + 1;
        toString = i2 % 128;
        int i3 = i2 % 2;
        LiveData<ScreenInformation<MPesaGlobalScreen>> liveData = this.getShareableDataState;
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        return liveData;
    }

    public final StateFlow<RecipientDetailsState> getRecipientDetailState() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 17;
        toString = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<RecipientDetailsState> stateFlow = this.ArtificialStackFrames;
        int i5 = i2 + 59;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> getConfirmationLoading() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 85;
        toString = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Boolean> stateFlow = this.copy;
        int i5 = i2 + 61;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<List<ConfirmInfoItem>> getConfirmationData() {
        int i = 2 % 2;
        int i2 = toString + 25;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.equals;
        }
        throw null;
    }

    private final void copydefault() {
        int i = 2 % 2;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.globalServices_purposeOfFunds_giftOrDonation), Integer.valueOf(R.string.globalServices_purposeOfFunds_investmentOrBusiness), Integer.valueOf(R.string.globalServices_purposeOfFunds_pension), Integer.valueOf(R.string.globalServices_purposeOfFunds_personalConsumption), Integer.valueOf(R.string.one_app_western_union_other_purpose)});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new SelectionItem(String.valueOf(iIntValue), TextResource.Companion.invoke$default(TextResource.INSTANCE, iIntValue, false, 2, (Object) null)));
            int i2 = toString + 91;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
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
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final Object invoke(Object obj) {
                int i4 = 2 % 2;
                int i5 = copydefault + 17;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                SelectionDetailsState selectionDetailsState$r8$lambda$EyLBNU6VfcZ34lrJSBUbCHPL4T0 = WesternUnionViewModel.$r8$lambda$EyLBNU6VfcZ34lrJSBUbCHPL4T0(arrayList4, arrayList2, (SelectionDetailsState) obj);
                int i7 = ShareDataUIState + 75;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    return selectionDetailsState$r8$lambda$EyLBNU6VfcZ34lrJSBUbCHPL4T0;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }

    private static final SelectionDetailsState ShareDataUIState(List list, List list2, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = hashCode + 111;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(selectionDetailsState, "");
        SelectionDetailsState selectionDetailsStateCopy$default = SelectionDetailsState.copy$default(selectionDetailsState, ExtensionsKt.toPersistentList(list), 0, null, ExtensionsKt.toPersistentList(list2), 0, null, null, null, null, null, null, null, 0, null, 0, 32758, null);
        int i4 = hashCode + 17;
        toString = i4 % 128;
        int i5 = i4 % 2;
        return selectionDetailsStateCopy$default;
    }

    private final void component3() {
        MPesaGlobalScreen screen;
        MPesaGlobalScreen.TransactionSuccess transactionSuccess;
        int i = 2 % 2;
        ScreenInformation<MPesaGlobalScreen> value = this.component4.getValue();
        if (value != null) {
            int i2 = hashCode + 55;
            toString = i2 % 128;
            int i3 = i2 % 2;
            screen = value.getScreen();
        } else {
            screen = null;
        }
        if (screen instanceof MPesaGlobalScreen.CountrySelection) {
            transactionSuccess = MPesaGlobalScreen.RecipientDetails.INSTANCE;
        } else if (screen instanceof MPesaGlobalScreen.RecipientDetails) {
            MPesaGlobalScreen.AmountDetails amountDetails = MPesaGlobalScreen.AmountDetails.INSTANCE;
            int i4 = toString + 55;
            hashCode = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 2 % 4;
            }
            transactionSuccess = amountDetails;
        } else if (screen instanceof MPesaGlobalScreen.AmountDetails) {
            int i6 = hashCode + 105;
            toString = i6 % 128;
            if (i6 % 2 == 0) {
                transactionSuccess = MPesaGlobalScreen.Confirmation.INSTANCE;
                int i7 = 93 / 0;
            } else {
                transactionSuccess = MPesaGlobalScreen.Confirmation.INSTANCE;
            }
        } else {
            if (!(screen instanceof MPesaGlobalScreen.Confirmation)) {
                throw new IllegalArgumentException("Invalid screen " + screen);
            }
            transactionSuccess = MPesaGlobalScreen.TransactionSuccess.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("Current screen: ");
        ScreenInformation<MPesaGlobalScreen> value2 = this.component4.getValue();
        sb.append(value2 != null ? value2.getScreen() : null);
        Log.d("WesternUnionViewModel", sb.toString());
        Log.d("WesternUnionViewModel", "Next screen: " + transactionSuccess);
        ShareDataUIState(new ScreenInformation<>(transactionSuccess, ScreenDirection.FORWARD));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void previousScreen() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            androidx.lifecycle.MutableLiveData<com.safaricom.sharedui.compose.navigation.ScreenInformation<com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen>> r1 = r5.component4
            java.lang.Object r1 = r1.getValue()
            com.safaricom.sharedui.compose.navigation.ScreenInformation r1 = (com.safaricom.sharedui.compose.navigation.ScreenInformation) r1
            r2 = 0
            if (r1 == 0) goto L28
            int r3 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.hashCode
            int r3 = r3 + 81
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.toString = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L21
            java.lang.Object r1 = r1.getScreen()
            r2 = r1
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r2 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r2
            goto L28
        L21:
            java.lang.Object r0 = r1.getScreen()
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            throw r2
        L28:
            boolean r1 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.ConfirmationError
            if (r1 != 0) goto L66
            boolean r1 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.TransactionError
            if (r1 == 0) goto L31
            goto L66
        L31:
            int r1 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.hashCode
            int r3 = r1 + 5
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.toString = r4
            int r3 = r3 % r0
            boolean r3 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection
            if (r3 == 0) goto L3f
            goto L66
        L3f:
            boolean r3 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Confirmation
            if (r3 == 0) goto L48
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$AmountDetails r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L6a
        L48:
            boolean r3 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.AmountDetails
            if (r3 == 0) goto L58
            int r1 = r1 + 57
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.toString = r2
            int r1 = r1 % r0
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$RecipientDetails r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.RecipientDetails.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L6a
        L58:
            boolean r0 = r2 instanceof com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.RecipientDetails
            if (r0 == 0) goto L61
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$CountrySelection r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.CountrySelection.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L6a
        L61:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Close r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Close.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
            goto L6a
        L66:
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen$Dashboard r0 = com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen.Dashboard.INSTANCE
            com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen r0 = (com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen) r0
        L6a:
            com.safaricom.sharedui.compose.navigation.ScreenInformation r1 = new com.safaricom.sharedui.compose.navigation.ScreenInformation
            com.safaricom.sharedui.compose.navigation.ScreenDirection r2 = com.safaricom.sharedui.compose.navigation.ScreenDirection.BACK
            r1.<init>(r0, r2)
            r5.ShareDataUIState(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel.previousScreen():void");
    }

    private static Object ShareDataUIState(Object[] objArr) {
        String stateIso;
        Country country = (Country) objArr[0];
        State state = (State) objArr[1];
        RecipientDetailsState recipientDetailsState = (RecipientDetailsState) objArr[2];
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(recipientDetailsState, "");
        String name = country.getName();
        String alpha2Code = country.getAlpha2Code();
        String emoji = country.getEmoji();
        Object obj = null;
        if (state != null) {
            stateIso = state.getStateIso();
        } else {
            int i2 = hashCode + 7;
            toString = i2 % 128;
            int i3 = i2 % 2;
            stateIso = null;
        }
        RecipientDetailsState recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, name, alpha2Code, emoji, null, null, null, null, stateIso, 120, null);
        int i4 = toString + 83;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return recipientDetailsStateCopy$default;
        }
        obj.hashCode();
        throw null;
    }

    private static final SelectionDetailsState component2(Country country, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        Intrinsics.checkNotNullParameter(selectionDetailsState, "");
        String name = country.getName();
        String emoji = country.getEmoji();
        List<Currency> currencies = country.getCurrencies();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currencies, 10));
        int i2 = hashCode + 109;
        toString = i2 % 128;
        int i3 = i2 % 2;
        for (Currency currency : currencies) {
            arrayList.add(new SelectionItem(currency.getIso(), TextResource.Companion.invoke$default(TextResource.INSTANCE, currency.getName(), false, 2, (Object) null)));
        }
        return SelectionDetailsState.copy$default(selectionDetailsState, null, 0, null, null, 0, null, name, null, null, emoji, null, ExtensionsKt.toPersistentList(arrayList), 0, null, 0, 30143, null);
    }

    public final void setCountry(final Country country, final State state) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        component3(new Function1() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 19;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                RecipientDetailsState recipientDetailsState$r8$lambda$goIHBSCV1Nm_FwqmDPb0dEtR6hs = WesternUnionViewModel.$r8$lambda$goIHBSCV1Nm_FwqmDPb0dEtR6hs(country, state, (RecipientDetailsState) obj);
                int i5 = component2 + 3;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return recipientDetailsState$r8$lambda$goIHBSCV1Nm_FwqmDPb0dEtR6hs;
                }
                throw null;
            }
        });
        updateSelectionDetailState(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 29;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                SelectionDetailsState selectionDetailsState$r8$lambda$al9WCe2V73BK8SwR4iDaxMbLz94 = WesternUnionViewModel.$r8$lambda$al9WCe2V73BK8SwR4iDaxMbLz94(country, (SelectionDetailsState) obj);
                int i5 = component3 + 99;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return selectionDetailsState$r8$lambda$al9WCe2V73BK8SwR4iDaxMbLz94;
            }
        });
        component3();
        int i2 = hashCode + 13;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void updateFirstName(final String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        component3(new Function1() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component2 + 69;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                String str = value;
                RecipientDetailsState recipientDetailsState = (RecipientDetailsState) obj;
                if (i4 == 0) {
                    return WesternUnionViewModel.$r8$lambda$TEdQdIkWuNWdAvQCyeTVPY5CTAc(str, recipientDetailsState);
                }
                WesternUnionViewModel.$r8$lambda$TEdQdIkWuNWdAvQCyeTVPY5CTAc(str, recipientDetailsState);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = hashCode + 93;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void updateMiddleName(final String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        component3(new Function1() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                RecipientDetailsState recipientDetailsState$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE;
                int i2 = 2 % 2;
                int i3 = copydefault + 41;
                component3 = i3 % 128;
                if (i3 % 2 == 0) {
                    recipientDetailsState$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE = WesternUnionViewModel.$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE(value, (RecipientDetailsState) obj);
                    int i4 = 30 / 0;
                } else {
                    recipientDetailsState$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE = WesternUnionViewModel.$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE(value, (RecipientDetailsState) obj);
                }
                int i5 = copydefault + 19;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return recipientDetailsState$r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = toString + 105;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 85 / 0;
        }
    }

    private static final RecipientDetailsState component3(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 67;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(recipientDetailsState, "");
        RecipientDetailsState recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, null, null, null, null, str, null, null, null, 239, null);
        int i4 = toString + 59;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return recipientDetailsStateCopy$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void updateLastName(final String value) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        component3(new Function1() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                String str = value;
                RecipientDetailsState recipientDetailsState = (RecipientDetailsState) obj;
                if (i4 != 0) {
                    return WesternUnionViewModel.$r8$lambda$w_XpEQvZTd5xRt7FFLec85QwoAk(str, recipientDetailsState);
                }
                WesternUnionViewModel.$r8$lambda$w_XpEQvZTd5xRt7FFLec85QwoAk(str, recipientDetailsState);
                throw null;
            }
        });
        int i2 = toString + 89;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final RecipientDetailsState component2(String str, RecipientDetailsState recipientDetailsState) {
        RecipientDetailsState recipientDetailsStateCopy$default;
        int i = 2 % 2;
        int i2 = toString + 67;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(recipientDetailsState, "");
            recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, null, null, null, null, null, str, null, null, 16771, null);
        } else {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(recipientDetailsState, "");
            recipientDetailsStateCopy$default = RecipientDetailsState.copy$default(recipientDetailsState, null, null, null, null, null, str, null, null, 223, null);
        }
        int i3 = toString + 125;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        return recipientDetailsStateCopy$default;
    }

    private final void ShareDataUIState(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = toString + 73;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.component4.setValue(screenInformation);
        int i4 = hashCode + 97;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onRecipientDetailsContinue() {
        int i = 2 % 2;
        int i2 = toString + 13;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        component3();
        if (i3 != 0) {
            throw null;
        }
        int i4 = hashCode + 69;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel$onAmountDetailsContinue$1", f = "WesternUnionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component2 = 0;
        private static int copydefault = 1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = copydefault + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            ResultKt.throwOnFailure(obj);
            WesternUnionViewModel.access$nextScreen(WesternUnionViewModel.this);
            RecipientDetailsState value = WesternUnionViewModel.this.getRecipientDetailState().getValue();
            AmountDetailsState value2 = WesternUnionViewModel.this.getAmountDetailsState().getValue();
            SelectionDetailsState value3 = WesternUnionViewModel.this.getSelectionDetailsState().getValue();
            SelectionItem selectionItem = value3.getCurrencySelection().get(value3.getSelectedCurrencyIndex());
            String selectedCountryIso = value.getSelectedCountryIso();
            String selectedStateIso = value.getSelectedStateIso();
            String id = selectionItem.getId();
            String amount = value2.getAmount();
            WesternUnionViewModel.this.getWesternUnionFee(selectedCountryIso, selectedStateIso, TextResource.Companion.invoke$default(TextResource.INSTANCE, value.getSelectedCountry(), false, 2, (Object) null), id, selectionItem.getTitle(), value.getFullName(), amount, false, WesternUnionViewModel.access$get_confirmationLoading$p(WesternUnionViewModel.this), WesternUnionViewModel.access$get_confirmationData$p(WesternUnionViewModel.this));
            Unit unit = Unit.INSTANCE;
            int i4 = component2 + 89;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = WesternUnionViewModel.this.new component1(continuation);
            int i2 = copydefault + 81;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 49;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component2(coroutineScope2, continuation2);
            }
            component2(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 91;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            if (i3 == 0) {
                return component1Var.invokeSuspend(Unit.INSTANCE);
            }
            component1Var.invokeSuspend(Unit.INSTANCE);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    public final Job onAmountDetailsContinue() {
        int i = 2 % 2;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(null), 3, null);
        int i2 = hashCode + 63;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 95 / 0;
        }
        return jobShareDataUIState;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfc.mpesaglobal.westernunion.WesternUnionViewModel$onConfirmContinue$1", f = "WesternUnionViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        final Context component1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component3 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WesternUnionViewModel.access$get_confirmationLoading$p(WesternUnionViewModel.this).setValue(Boxing.boxBoolean(true));
            RecipientDetailsState value = WesternUnionViewModel.this.getRecipientDetailState().getValue();
            AmountDetailsState value2 = WesternUnionViewModel.this.getAmountDetailsState().getValue();
            SelectionDetailsState value3 = WesternUnionViewModel.this.getSelectionDetailsState().getValue();
            HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public String getApiPath() {
                    int i2 = 2 % 2;
                    int i3 = component2;
                    int i4 = i3 + 89;
                    ShareDataUIState = i4 % 128;
                    Object obj2 = null;
                    if (i4 % 2 == 0) {
                        throw null;
                    }
                    int i5 = i3 + 79;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        return MpesaGlobalApiUrl.WESTERN_UNION_SEND;
                    }
                    obj2.hashCode();
                    throw null;
                }
            };
            haProxyRequest.method(BaseRequest.Method.POST);
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
            String string = SPUtils.getInstance().getString("recent_login_phone_number");
            Intrinsics.checkNotNullExpressionValue(string, "");
            String str = "254" + StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
            ImtServiceRequestHeader imtServiceRequestHeaderGenerateImtRequestHeader = ImtRequestHelperKt.generateImtRequestHeader(ImtConstants.IMT_PAY);
            ImtServiceData[] imtServiceDataArr = new ImtServiceData[14];
            imtServiceDataArr[0] = new ImtServiceData(ImtConstants.KEY_COUNTRY_ISO, value.getSelectedCountryIso());
            imtServiceDataArr[1] = new ImtServiceData("amount", value2.getAmount());
            imtServiceDataArr[2] = new ImtServiceData(ImtConstants.KEY_CURRENCY_ISO, value3.getCurrencySelection().get(value3.getSelectedCurrencyIndex()).getId());
            imtServiceDataArr[3] = new ImtServiceData("msisdn", str);
            imtServiceDataArr[4] = new ImtServiceData("feeinquiryrequestid", WesternUnionViewModel.this.getFeeInquiryRequestId());
            imtServiceDataArr[5] = new ImtServiceData(ImtConstants.KEY_FIRST_NAME, StringsKt.trim(value.getFirstName()).toString());
            imtServiceDataArr[6] = new ImtServiceData(ImtConstants.KEY_LAST_NAME, StringsKt.trim(value.getLastName()).toString());
            imtServiceDataArr[7] = new ImtServiceData(ImtConstants.KEY_MIDDLE_NAME, StringsKt.trim(value.getMiddleName()).toString());
            String otherPurposeOfFunds = value3.getOtherPurposeOfFunds();
            Context context = this.component1;
            if (otherPurposeOfFunds.length() == 0) {
                int i2 = component2 + 51;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                otherPurposeOfFunds = value3.getPurposeOfFundsSelection().get(value3.getSelectedPurposeOfFundsIndex()).getTitle().getValue(context);
                int i4 = ShareDataUIState + 43;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
            imtServiceDataArr[8] = new ImtServiceData(ImtConstants.KEY_PURPOSE_OF_FUNDS, otherPurposeOfFunds);
            String otherSourceOfFunds = value3.getOtherSourceOfFunds();
            Context context2 = this.component1;
            if (otherSourceOfFunds.length() == 0) {
                otherSourceOfFunds = value3.getSourceOfFundsSelection().get(value3.getSelectedSourceOfFundsIndex()).getTitle().getValue(context2);
            }
            imtServiceDataArr[9] = new ImtServiceData(ImtConstants.KEY_SOURCE_OF_FUNDS, otherSourceOfFunds);
            imtServiceDataArr[10] = new ImtServiceData(ImtConstants.KEY_QUESTION, "");
            imtServiceDataArr[11] = new ImtServiceData(ImtConstants.KEY_ANSWER, "");
            String selectedStateIso = value.getSelectedStateIso();
            if (selectedStateIso == null) {
                int i6 = ShareDataUIState + 53;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                selectedStateIso = "";
            }
            imtServiceDataArr[12] = new ImtServiceData(ImtConstants.KEY_STATE_ISO, selectedStateIso);
            imtServiceDataArr[13] = new ImtServiceData(ImtConstants.KEY_CITY, "");
            haProxyRequest.addParams(ImtConstants.SERVICE_REQUEST_KEY, new ImtServiceRequest(imtServiceRequestHeaderGenerateImtRequestHeader, new ImtServiceBody(CollectionsKt.listOf((Object[]) imtServiceDataArr))));
            final WesternUnionViewModel westernUnionViewModel = WesternUnionViewModel.this;
            WesternUnionViewModel.this.sendRequest(haProxyRequest, new ApiCallback<Object>() {
                private static int component1 = 1;
                private static int copydefault;

                @Override
                public void onSuccess(Object value4) {
                    int i8 = 2 % 2;
                    super.onSuccess(value4);
                    Log.d("WesternUnionViewModel", "Send to Western Union request success, data: " + value4);
                    WesternUnionViewModel.access$get_confirmationLoading$p(westernUnionViewModel).setValue(false);
                    WesternUnionViewModel.access$nextScreen(westernUnionViewModel);
                    int i9 = copydefault + 13;
                    component1 = i9 % 128;
                    int i10 = i9 % 2;
                }

                @Override
                public void onError(BaseException e) {
                    int i8 = 2 % 2;
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    Log.d("WesternUnionViewModel", "Send to Western Union request error: " + e);
                    WesternUnionViewModel.access$get_confirmationLoading$p(westernUnionViewModel).setValue(false);
                    WesternUnionViewModel.access$setScreen(westernUnionViewModel, new ScreenInformation(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
                    int i9 = component1 + 73;
                    copydefault = i9 % 128;
                    int i10 = i9 % 2;
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        copydefault(Context context, Continuation<? super copydefault> continuation) {
            super(2, continuation);
            this.component1 = context;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = WesternUnionViewModel.this.new copydefault(this.component1, continuation);
            int i2 = ShareDataUIState + 15;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 10 / 0;
            }
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = ShareDataUIState + 9;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 83;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 23;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final Job onConfirmContinue(Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(context, null), 3, null);
        int i2 = toString + 73;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return jobShareDataUIState;
        }
        throw null;
    }

    public final void showError() {
        int i = 2 % 2;
        ShareDataUIState(new ScreenInformation<>(MPesaGlobalScreen.TransactionError.INSTANCE, ScreenDirection.FORWARD));
        int i2 = hashCode + 115;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 8 / 0;
        }
    }

    private final void component3(Function1<? super RecipientDetailsState, RecipientDetailsState> function1) {
        int i = 2 % 2;
        int i2 = toString + 93;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MutableStateFlow<RecipientDetailsState> mutableStateFlow = this.getAsAtTimestamp;
        while (!mutableStateFlow.compareAndSet(mutableStateFlow.getValue(), function1.invoke(this.getAsAtTimestamp.getValue()))) {
        }
        int i3 = toString + 77;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    public static SelectionDetailsState $r8$lambda$EyLBNU6VfcZ34lrJSBUbCHPL4T0(List list, List list2, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 91;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            ShareDataUIState(list, list2, selectionDetailsState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SelectionDetailsState selectionDetailsStateShareDataUIState = ShareDataUIState(list, list2, selectionDetailsState);
        int i3 = toString + 13;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 64 / 0;
        }
        return selectionDetailsStateShareDataUIState;
    }

    public static RecipientDetailsState $r8$lambda$TEdQdIkWuNWdAvQCyeTVPY5CTAc(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 93;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        int iCopydefault = ForwardingGraph.copydefault();
        RecipientDetailsState recipientDetailsState2 = (RecipientDetailsState) component3(new Object[]{str, recipientDetailsState}, ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), iCopydefault, -1459270016, 1459270017);
        int i4 = hashCode + 79;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            return recipientDetailsState2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static SelectionDetailsState $r8$lambda$al9WCe2V73BK8SwR4iDaxMbLz94(Country country, SelectionDetailsState selectionDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 115;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        SelectionDetailsState selectionDetailsStateComponent2 = component2(country, selectionDetailsState);
        int i4 = hashCode + 9;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return selectionDetailsStateComponent2;
    }

    public static RecipientDetailsState $r8$lambda$goIHBSCV1Nm_FwqmDPb0dEtR6hs(Country country, State state, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = hashCode + 123;
        toString = i2 % 128;
        int i3 = i2 % 2;
        int iCopydefault = ForwardingGraph.copydefault();
        RecipientDetailsState recipientDetailsState2 = (RecipientDetailsState) component3(new Object[]{country, state, recipientDetailsState}, ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), iCopydefault, 938523097, -938523097);
        int i4 = toString + 11;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return recipientDetailsState2;
    }

    public static RecipientDetailsState $r8$lambda$mBalUFreWzJFT5ba_senIMlSyhE(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 123;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        RecipientDetailsState recipientDetailsStateComponent3 = component3(str, recipientDetailsState);
        int i4 = toString + 93;
        hashCode = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
        return recipientDetailsStateComponent3;
    }

    public static RecipientDetailsState $r8$lambda$w_XpEQvZTd5xRt7FFLec85QwoAk(String str, RecipientDetailsState recipientDetailsState) {
        int i = 2 % 2;
        int i2 = toString + 5;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return component2(str, recipientDetailsState);
        }
        component2(str, recipientDetailsState);
        throw null;
    }

    static {
        int i = getSponsorBeneficiariesState + 99;
        coroutineBoundary = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private static final RecipientDetailsState copydefault(Country country, State state, RecipientDetailsState recipientDetailsState) {
        int iCopydefault = ForwardingGraph.copydefault();
        return (RecipientDetailsState) component3(new Object[]{country, state, recipientDetailsState}, ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), iCopydefault, 938523097, -938523097);
    }

    private static final RecipientDetailsState component1(String str, RecipientDetailsState recipientDetailsState) {
        int iCopydefault = ForwardingGraph.copydefault();
        return (RecipientDetailsState) component3(new Object[]{str, recipientDetailsState}, ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), ForwardingGraph.copydefault(), iCopydefault, -1459270016, 1459270017);
    }

    @Override
    public double calculateAmount() {
        int i = 2 % 2;
        int i2 = hashCode + 97;
        toString = i2 % 128;
        int i3 = i2 % 2;
        double dCalculateAmount = this.copydefault.calculateAmount();
        int i4 = hashCode + 101;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return dCalculateAmount;
    }

    @Override
    public void clearAmountError(boolean useOverdraft, AmountViewModel.AmountErrorType errorType) {
        int i = 2 % 2;
        int i2 = toString + 11;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.clearAmountError(useOverdraft, errorType);
        int i4 = toString + 111;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public StateFlow<AmountDetailsState> getAmountDetailsState() {
        int i = 2 % 2;
        int i2 = toString + 71;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        StateFlow<AmountDetailsState> amountDetailsState = this.copydefault.getAmountDetailsState();
        int i4 = toString + 113;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return amountDetailsState;
    }

    @Override
    public String getFeeInquiryRequestId() {
        int i = 2 % 2;
        int i2 = hashCode + 51;
        toString = i2 % 128;
        int i3 = i2 % 2;
        String feeInquiryRequestId = this.component2.getFeeInquiryRequestId();
        int i4 = toString + 23;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return feeInquiryRequestId;
    }

    @Override
    public StateFlow<SelectionDetailsState> getSelectionDetailsState() {
        int i = 2 % 2;
        int i2 = hashCode + 101;
        toString = i2 % 128;
        int i3 = i2 % 2;
        StateFlow<SelectionDetailsState> selectionDetailsState = this.component1.getSelectionDetailsState();
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        return selectionDetailsState;
    }

    @Override
    public void getWesternUnionFee(String selectedCountryIso, String selectedStateIso, TextResource selectedCountryName, String selectedCurrencyIso, TextResource selectedCurrencyName, String fullName, String amount, boolean isCostEstimatorFlow, MutableStateFlow<Boolean> confirmationLoadingObservable, MutableStateFlow<List<ConfirmInfoItem>> confirmationDataObservable) {
        int i = 2 % 2;
        int i2 = hashCode + 81;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(selectedCountryIso, "");
        Intrinsics.checkNotNullParameter(selectedCountryName, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyIso, "");
        Intrinsics.checkNotNullParameter(selectedCurrencyName, "");
        Intrinsics.checkNotNullParameter(fullName, "");
        Intrinsics.checkNotNullParameter(amount, "");
        Intrinsics.checkNotNullParameter(confirmationLoadingObservable, "");
        Intrinsics.checkNotNullParameter(confirmationDataObservable, "");
        this.component2.getWesternUnionFee(selectedCountryIso, selectedStateIso, selectedCountryName, selectedCurrencyIso, selectedCurrencyName, fullName, amount, isCostEstimatorFlow, confirmationLoadingObservable, confirmationDataObservable);
        int i4 = toString + 65;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void handleAmountError(AmountViewModel.AmountError amountError, ITransactionType transactionType) {
        int i = 2 % 2;
        int i2 = toString + 95;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transactionType, "");
        this.copydefault.handleAmountError(amountError, transactionType);
        int i4 = hashCode + 27;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setAmountError(TextResource error, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = toString + 13;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setAmountError(error, errorType, isWarning);
        int i4 = toString + 57;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void setFeeInquiryRequestId(String str) {
        int i = 2 % 2;
        int i2 = hashCode + 29;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        WesternUnionGetFeeDelegateImpl westernUnionGetFeeDelegateImpl = this.component2;
        if (i3 != 0) {
            westernUnionGetFeeDelegateImpl.setFeeInquiryRequestId(str);
        } else {
            westernUnionGetFeeDelegateImpl.setFeeInquiryRequestId(str);
            int i4 = 35 / 0;
        }
    }

    @Override
    public void setFormattedAmountError(int stringResId, TextResource currency, String amount, AmountViewModel.AmountErrorType errorType, boolean isWarning) {
        int i = 2 % 2;
        int i2 = hashCode + 71;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(currency, "");
        Intrinsics.checkNotNullParameter(amount, "");
        this.copydefault.setFormattedAmountError(stringResId, currency, amount, errorType, isWarning);
        int i4 = hashCode + 21;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void updateAmount(String value) {
        int i = 2 % 2;
        int i2 = hashCode + 73;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.copydefault.updateAmount(value);
        int i4 = toString + 81;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateAmountValidityStatus(boolean valid) {
        int i = 2 % 2;
        int i2 = toString + 121;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.updateAmountValidityStatus(valid);
            throw null;
        }
        this.copydefault.updateAmountValidityStatus(valid);
        int i3 = toString + 79;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override
    public void updateCurrency(String value) {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.copydefault.updateCurrency(value);
        int i4 = hashCode + 31;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void updateExchangeCurrency(String value) {
        int i = 2 % 2;
        int i2 = toString + 19;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.copydefault.updateExchangeCurrency(value);
        int i4 = toString + 61;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateMpesaBalance(double balance) {
        int i = 2 % 2;
        int i2 = toString + 29;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.updateMpesaBalance(balance);
            int i3 = 64 / 0;
        } else {
            this.copydefault.updateMpesaBalance(balance);
        }
        int i4 = toString + 83;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateOtherPurposeOfFunds(String value) {
        int i = 2 % 2;
        int i2 = hashCode + 115;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        this.component1.updateOtherPurposeOfFunds(value);
        int i4 = toString + 19;
        hashCode = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateOtherSourceOfFunds(String value) {
        int i = 2 % 2;
        int i2 = toString + 57;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        if (i3 != 0) {
            this.component1.updateOtherSourceOfFunds(value);
            int i4 = 2 / 0;
        } else {
            this.component1.updateOtherSourceOfFunds(value);
        }
        int i5 = hashCode + 73;
        toString = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void updateSelectedCarrier(int index) {
        int i = 2 % 2;
        int i2 = hashCode + 23;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateSelectedCarrier(index);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void updateSelectedCurrency(int index) {
        int i = 2 % 2;
        int i2 = hashCode + 19;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateSelectedCurrency(index);
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
    }

    @Override
    public void updateSelectedPurposeOfFunds(int index) {
        int i = 2 % 2;
        int i2 = hashCode + 35;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateSelectedPurposeOfFunds(index);
        int i4 = toString + 33;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectedSourceOfFunds(int index) {
        int i = 2 % 2;
        int i2 = hashCode + 79;
        toString = i2 % 128;
        int i3 = i2 % 2;
        this.component1.updateSelectedSourceOfFunds(index);
        int i4 = hashCode + 43;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void updateSelectionDetailState(Function1<? super SelectionDetailsState, SelectionDetailsState> transform) {
        int i = 2 % 2;
        int i2 = toString + 93;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(transform, "");
        this.component1.updateSelectionDetailState(transform);
        int i4 = hashCode + 67;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }
}
