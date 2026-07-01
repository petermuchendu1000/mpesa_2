package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.alibaba.ariver.permission.PermissionConstant;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.ESimApiUrl;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryResponseDto;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ReserveOtpResponseDto;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen;
import com.huawei.http.BaseRequest;
import com.safaricom.sharedui.compose.fragment.TransactionErrorFragment;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001NB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010$\u001a\u00020%H\u0002J\u0006\u0010&\u001a\u00020%J\u0016\u0010'\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J\u001a\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\u00132\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0013J\u0006\u0010,\u001a\u00020%J\u0006\u0010-\u001a\u00020%J\u0006\u0010.\u001a\u00020%J\u0006\u0010/\u001a\u00020%J\u0006\u00100\u001a\u00020%J\u000e\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\tJ\u0006\u00103\u001a\u00020%J\u0006\u00104\u001a\u00020%J\u0006\u00105\u001a\u00020%J\u000e\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u0013J\u0010\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\u0013H\u0002J\u0012\u0010:\u001a\u00020\u00132\b\u0010;\u001a\u0004\u0018\u00010\u0013H\u0002J\u001e\u0010<\u001a\u00020%2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030>2\b\u0010?\u001a\u0004\u0018\u00010\u0013H\u0002J\u0006\u0010@\u001a\u00020AJ\u000e\u0010B\u001a\u00020%2\u0006\u0010C\u001a\u00020\u0013J\u0006\u0010D\u001a\u00020EJ\u0012\u0010F\u001a\u00020%2\b\u0010G\u001a\u0004\u0018\u00010HH\u0002J\u0006\u0010I\u001a\u00020EJ\u000e\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020\u0013J\u0006\u0010L\u001a\u00020%J\u0006\u0010M\u001a\u00020%R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001f¨\u0006O"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "_isEsimSupported", "Landroidx/lifecycle/MutableLiveData;", "", "isEsimSupported", "Landroidx/lifecycle/LiveData;", "()Landroidx/lifecycle/LiveData;", "_screenTransition", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "screenTransition", "getScreenTransition", "_errorMessage", "", "errorMessage", "getErrorMessage", "_errorTitle", TransactionErrorFragment.ERROR_TITLE_KEY, "getErrorTitle", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_otpState", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/OtpState;", "otpState", "getOtpState", "nextScreen", "", "previousScreen", "setScreen", "screenInformation", "showError", "message", "title", "onErrorDismissed", "onESimSupported", "onNewRequst", "onOnBoardingContinue", "onAboutActivationContinue", "setEsimSupported", "isSupported", "onGetPhoneNumberContinue", "onEmailAddressContinue", "onConfirmationContinue", "onEmailAddressChanged", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "isValidEmail", "email", "normalizeMsisdn", "raw", "addMsisdnParamIfPresent", PermissionConstant.ACTION_REQUEST, "Lcom/huawei/digitalpayment/consumer/base/util/HaProxyRequest;", "msisdn", "getOtpLimit", "", "updateOtpCode", "code", "queryEsimReservation", "Lkotlinx/coroutines/Job;", "handleEsimReservationSuccess", ConnectionLog.CONN_LOG_STATE_RESPONSE, "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/api/model/ESimQueryResponseDto;", "generateEsimOtp", "validateEsimOtp", "otpCode", "reserveEsim", "onCompletionClose", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ESimViewModel extends ViewModel implements BaseModel {
    public static final int $stable = 8;
    private static int ArtificialStackFrames = 0;

    public static final Companion INSTANCE;
    public static final String SCREEN_KEY = "screen_key";
    private static int coroutineBoundary = 1;
    private static int getSponsorBeneficiariesState = 1;
    private static int toString;
    private final MutableStateFlow<OtpState> ShareDataUIState;
    private final MutableLiveData<String> component1;
    private final MutableLiveData<ScreenInformation<ESimScreen>> component2;
    private final MutableLiveData<String> component3;
    private final LiveData<Boolean> component4;
    private final LiveData<String> copy;
    private final MutableLiveData<Boolean> copydefault;
    private final StateFlow<OtpState> equals;
    private final LiveData<String> getAsAtTimestamp;
    private final MutableStateFlow<ESimUiState> getRequestBeneficiariesState;
    private final StateFlow<ESimUiState> getShareableDataState;
    private final LiveData<ScreenInformation<ESimScreen>> hashCode;

    public static final void access$addMsisdnParamIfPresent(ESimViewModel eSimViewModel, HaProxyRequest haProxyRequest, String str) {
        int i = 2 % 2;
        int i2 = toString + 19;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        eSimViewModel.component2(haProxyRequest, str);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_otpState$p(ESimViewModel eSimViewModel) {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 17;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<OtpState> mutableStateFlow = eSimViewModel.ShareDataUIState;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 121;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$get_uiState$p(ESimViewModel eSimViewModel) {
        int i = 2 % 2;
        int i2 = toString + 63;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        MutableStateFlow<ESimUiState> mutableStateFlow = eSimViewModel.getRequestBeneficiariesState;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 27;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final void access$handleEsimReservationSuccess(ESimViewModel eSimViewModel, ESimQueryResponseDto eSimQueryResponseDto) {
        int i = 2 % 2;
        int i2 = toString + 37;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        eSimViewModel.component3(eSimQueryResponseDto);
        int i4 = toString + 73;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$nextScreen(ESimViewModel eSimViewModel) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 35;
        toString = i2 % 128;
        int i3 = i2 % 2;
        eSimViewModel.ShareDataUIState();
        int i4 = coroutineBoundary + 123;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static final String access$normalizeMsisdn(ESimViewModel eSimViewModel, String str) {
        int i = 2 % 2;
        int i2 = toString + 47;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return eSimViewModel.component1(str);
        }
        eSimViewModel.component1(str);
        throw null;
    }

    public static final void access$setScreen(ESimViewModel eSimViewModel, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 83;
        toString = i2 % 128;
        int i3 = i2 % 2;
        eSimViewModel.component1((ScreenInformation<ESimScreen>) screenInformation);
        int i4 = toString + 35;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 17 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public ESimViewModel(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(true);
        this.copydefault = mutableLiveData;
        this.component4 = mutableLiveData;
        MutableLiveData<ScreenInformation<ESimScreen>> mutableLiveData2 = new MutableLiveData<>();
        this.component2 = mutableLiveData2;
        this.hashCode = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.component1 = mutableLiveData3;
        this.getAsAtTimestamp = mutableLiveData3;
        MutableLiveData<String> mutableLiveData4 = new MutableLiveData<>();
        this.component3 = mutableLiveData4;
        this.copy = mutableLiveData4;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        boolean z = false;
        MutableStateFlow<ESimUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ESimUiState(string, null, z, false, false, null, 62, null));
        this.getRequestBeneficiariesState = MutableStateFlow;
        this.getShareableDataState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<OtpState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new OtpState(null, false, false, false, z, null, 63, null == true ? 1 : 0));
        this.ShareDataUIState = MutableStateFlow2;
        this.equals = FlowKt.asStateFlow(MutableStateFlow2);
        ESimScreen.Dashboard dashboard = (ESimScreen) savedStateHandle.get("screen_key");
        if (dashboard == null) {
            dashboard = ESimScreen.Dashboard.INSTANCE;
            int i = coroutineBoundary + 49;
            toString = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        component1(new ScreenInformation<>(dashboard, ScreenDirection.NONE));
        int i3 = toString + 67;
        coroutineBoundary = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimViewModel$Companion;", "", "<init>", "()V", "SCREEN_KEY", "", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final LiveData<Boolean> isEsimSupported() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 63;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        LiveData<Boolean> liveData = this.component4;
        int i5 = i3 + 25;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final LiveData<ScreenInformation<ESimScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = toString + 65;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        LiveData<ScreenInformation<ESimScreen>> liveData = this.hashCode;
        int i4 = i3 + 109;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return liveData;
        }
        throw null;
    }

    public final LiveData<String> getErrorMessage() {
        int i = 2 % 2;
        int i2 = toString + 43;
        int i3 = i2 % 128;
        coroutineBoundary = i3;
        int i4 = i2 % 2;
        LiveData<String> liveData = this.getAsAtTimestamp;
        int i5 = i3 + 79;
        toString = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final LiveData<String> getErrorTitle() {
        int i = 2 % 2;
        int i2 = toString + 51;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        LiveData<String> liveData = this.copy;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return liveData;
    }

    public final StateFlow<ESimUiState> getUiState() {
        StateFlow<ESimUiState> stateFlow;
        int i = 2 % 2;
        int i2 = coroutineBoundary + 35;
        int i3 = i2 % 128;
        toString = i3;
        if (i2 % 2 != 0) {
            stateFlow = this.getShareableDataState;
            int i4 = 96 / 0;
        } else {
            stateFlow = this.getShareableDataState;
        }
        int i5 = i3 + 53;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 50 / 0;
        }
        return stateFlow;
    }

    public final StateFlow<OtpState> getOtpState() {
        int i = 2 % 2;
        int i2 = toString;
        int i3 = i2 + 91;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<OtpState> stateFlow = this.equals;
        int i5 = i2 + 15;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 != 0) {
            return stateFlow;
        }
        throw null;
    }

    private final void ShareDataUIState() {
        ESimScreen screen;
        ESimScreen.AboutActivation aboutActivation;
        int i = 2 % 2;
        ScreenInformation<ESimScreen> value = this.component2.getValue();
        Object obj = null;
        if (value != null) {
            int i2 = toString + 33;
            coroutineBoundary = i2 % 128;
            if (i2 % 2 == 0) {
                value.getScreen();
                obj.hashCode();
                throw null;
            }
            screen = value.getScreen();
        } else {
            screen = null;
        }
        if (screen instanceof ESimScreen.Dashboard) {
            aboutActivation = ESimScreen.AboutActivation.INSTANCE;
        } else if (screen instanceof ESimScreen.Onboarding) {
            int i3 = toString + 47;
            coroutineBoundary = i3 % 128;
            int i4 = i3 % 2;
            aboutActivation = ESimScreen.AboutActivation.INSTANCE;
        } else if (screen instanceof ESimScreen.AboutActivation) {
            int i5 = toString + 17;
            coroutineBoundary = i5 % 128;
            if (i5 % 2 == 0) {
                ESimScreen.GetPhoneNumber getPhoneNumber = ESimScreen.GetPhoneNumber.INSTANCE;
                throw null;
            }
            aboutActivation = ESimScreen.GetPhoneNumber.INSTANCE;
        } else if (screen instanceof ESimScreen.GetPhoneNumber) {
            int i6 = toString + 77;
            coroutineBoundary = i6 % 128;
            int i7 = i6 % 2;
            aboutActivation = ESimScreen.OtpValidation.INSTANCE;
        } else if (screen instanceof ESimScreen.OtpValidation) {
            aboutActivation = ESimScreen.EmailAddress.INSTANCE;
        } else if (screen instanceof ESimScreen.EmailAddress) {
            aboutActivation = ESimScreen.Confirmation.INSTANCE;
        } else if (screen instanceof ESimScreen.Confirmation) {
            int i8 = coroutineBoundary + 37;
            toString = i8 % 128;
            if (i8 % 2 != 0) {
                ESimScreen.PinValidation pinValidation = ESimScreen.PinValidation.INSTANCE;
                obj.hashCode();
                throw null;
            }
            aboutActivation = ESimScreen.PinValidation.INSTANCE;
        } else {
            if (!(screen instanceof ESimScreen.PinValidation)) {
                throw new IllegalArgumentException("Invalid screen " + screen);
            }
            aboutActivation = ESimScreen.Completion.INSTANCE;
        }
        component1(new ScreenInformation<>(aboutActivation, ScreenDirection.FORWARD));
    }

    public final void previousScreen() {
        ESimScreen.Confirmation confirmation;
        ESimScreen.AboutActivation aboutActivation;
        int i = 2 % 2;
        ScreenInformation<ESimScreen> value = this.component2.getValue();
        ESimScreen screen = null;
        if (value != null) {
            int i2 = coroutineBoundary + 51;
            toString = i2 % 128;
            if (i2 % 2 != 0) {
                value.getScreen();
                throw null;
            }
            screen = value.getScreen();
        }
        if (screen instanceof ESimScreen.PinValidation) {
            confirmation = ESimScreen.Confirmation.INSTANCE;
        } else if (!(!(screen instanceof ESimScreen.Confirmation))) {
            int i3 = toString + 11;
            coroutineBoundary = i3 % 128;
            if (i3 % 2 == 0) {
                confirmation = ESimScreen.EmailAddress.INSTANCE;
                int i4 = 91 / 0;
            } else {
                confirmation = ESimScreen.EmailAddress.INSTANCE;
            }
        } else if (screen instanceof ESimScreen.EmailAddress) {
            int i5 = toString + 17;
            coroutineBoundary = i5 % 128;
            int i6 = i5 % 2;
            confirmation = ESimScreen.GetPhoneNumber.INSTANCE;
            int i7 = toString + 65;
            coroutineBoundary = i7 % 128;
            int i8 = i7 % 2;
        } else if (screen instanceof ESimScreen.GetPhoneNumber) {
            int i9 = coroutineBoundary + 33;
            toString = i9 % 128;
            if (i9 % 2 != 0) {
                aboutActivation = ESimScreen.AboutActivation.INSTANCE;
                int i10 = 43 / 0;
            } else {
                aboutActivation = ESimScreen.AboutActivation.INSTANCE;
            }
            confirmation = aboutActivation;
        } else {
            confirmation = ESimScreen.Close.INSTANCE;
        }
        component1(new ScreenInformation<>(confirmation, ScreenDirection.BACK));
    }

    private final void component1(ScreenInformation<ESimScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = toString + 63;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 == 0) {
            this.component2.setValue(screenInformation);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component2.setValue(screenInformation);
        int i3 = coroutineBoundary + 23;
        toString = i3 % 128;
        int i4 = i3 % 2;
    }

    public static void showError$default(ESimViewModel eSimViewModel, String str, String str2, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = coroutineBoundary;
        int i4 = i3 + 101;
        toString = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i3 + 21;
            toString = i5 % 128;
            int i6 = i5 % 2;
            str2 = null;
        }
        eSimViewModel.showError(str, str2);
    }

    public final void showError(String message, String title) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(message, "");
        this.component1.setValue(message);
        this.component3.setValue(title);
        component1(new ScreenInformation<>(ESimScreen.Error.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 47;
        toString = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onErrorDismissed() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 99;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        this.component1.setValue(null);
        this.component3.setValue(null);
        previousScreen();
        int i4 = toString + 3;
        coroutineBoundary = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void onESimSupported() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 117;
        toString = i2 % 128;
        int i3 = i2 % 2;
        queryEsimReservation();
        if (i3 != 0) {
            throw null;
        }
    }

    public final void onNewRequst() {
        int i = 2 % 2;
        int i2 = toString + 41;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        int i4 = coroutineBoundary + 103;
        toString = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onOnBoardingContinue() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 59;
        toString = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onAboutActivationContinue() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 111;
        toString = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        int i4 = coroutineBoundary + 77;
        toString = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void setEsimSupported(boolean isSupported) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 39;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.setValue(Boolean.valueOf(isSupported));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.copydefault.setValue(Boolean.valueOf(isSupported));
        int i3 = coroutineBoundary + 55;
        toString = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void onGetPhoneNumberContinue() {
        int i = 2 % 2;
        int i2 = toString + 67;
        coroutineBoundary = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            generateEsimOtp();
            ShareDataUIState();
            int i3 = coroutineBoundary + 119;
            toString = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        generateEsimOtp();
        ShareDataUIState();
        throw null;
    }

    public final void onEmailAddressContinue() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 71;
        toString = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        int i4 = toString + 91;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onConfirmationContinue() {
        int i = 2 % 2;
        int i2 = toString + 101;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        ShareDataUIState();
        int i4 = toString + 31;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onEmailAddressChanged(String emailAddress) {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 29;
        toString = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(emailAddress, "");
        this.getRequestBeneficiariesState.setValue(ESimUiState.copy$default(this.getRequestBeneficiariesState.getValue(), null, emailAddress, component2(emailAddress), false, false, null, 57, null));
        int i4 = toString + 73;
        coroutineBoundary = i4 % 128;
        int i5 = i4 % 2;
    }

    private final boolean component2(String str) {
        int i = 2 % 2;
        if (StringsKt.isBlank(str) || (!Patterns.EMAIL_ADDRESS.matcher(r5).matches())) {
            return false;
        }
        int i2 = toString;
        int i3 = i2 + 119;
        coroutineBoundary = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 41;
        coroutineBoundary = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    private final String component1(String str) {
        int i = 2 % 2;
        if (str == null) {
            str = "";
        }
        String string = StringsKt.trim(str).toString();
        if (string.length() == 0) {
            int i2 = coroutineBoundary + 83;
            toString = i2 % 128;
            int i3 = i2 % 2;
            return "";
        }
        String strRemovePrefix = StringsKt.removePrefix(string, (CharSequence) "+");
        int i4 = 0;
        if (strRemovePrefix.length() == 10) {
            int i5 = coroutineBoundary + 49;
            toString = i5 % 128;
            if (i5 % 2 == 0 ? StringsKt.startsWith$default((CharSequence) strRemovePrefix, '0', false, 2, (Object) null) : StringsKt.startsWith$default((CharSequence) strRemovePrefix, '2', true, 3, (Object) null)) {
                String strSubstring = strRemovePrefix.substring(1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                return "254" + strSubstring;
            }
        }
        if (strRemovePrefix.length() != 9) {
            return strRemovePrefix;
        }
        String str2 = strRemovePrefix;
        while (i4 < str2.length()) {
            if (!Character.isDigit(str2.charAt(i4))) {
                int i6 = toString + 119;
                coroutineBoundary = i6 % 128;
                if (i6 % 2 != 0) {
                    return strRemovePrefix;
                }
                throw null;
            }
            i4++;
            int i7 = coroutineBoundary + 29;
            toString = i7 % 128;
            int i8 = i7 % 2;
        }
        String str3 = "254" + strRemovePrefix;
        int i9 = toString + 27;
        coroutineBoundary = i9 % 128;
        int i10 = i9 % 2;
        return str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r7 = "";
        r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString + 65;
        com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.coroutineBoundary = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003c, code lost:
    
        r6.addParams("msisdn", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        r6.addParams("msisdn", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (kotlin.text.StringsKt.isBlank(r1) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if ((!kotlin.text.StringsKt.isBlank(r1)) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (r7 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component2(com.huawei.digitalpayment.consumer.base.util.HaProxyRequest<?> r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.coroutineBoundary = r2
            int r1 = r1 % r0
            java.lang.String r2 = "msisdn"
            r3 = 1
            if (r1 != 0) goto L21
            java.lang.String r1 = r5.component1(r7)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            int r3 = r3 / 0
            if (r4 != 0) goto L2f
            goto L40
        L21:
            java.lang.String r1 = r5.component1(r7)
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = kotlin.text.StringsKt.isBlank(r4)
            r4 = r4 ^ r3
            if (r4 == r3) goto L40
        L2f:
            if (r7 != 0) goto L3c
            java.lang.String r7 = ""
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString
            int r1 = r1 + 65
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.coroutineBoundary = r3
            int r1 = r1 % r0
        L3c:
            r6.addParams(r2, r7)
            goto L43
        L40:
            r6.addParams(r2, r1)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component2(com.huawei.digitalpayment.consumer.base.util.HaProxyRequest, java.lang.String):void");
    }

    public final void updateOtpCode(String code) {
        int i = 2 % 2;
        int i2 = toString + 83;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(code, "");
        MutableStateFlow<OtpState> mutableStateFlow = this.ShareDataUIState;
        mutableStateFlow.setValue(OtpState.copy$default(mutableStateFlow.getValue(), code, false, false, false, false, null, 30, null));
        if (code.length() == getOtpLimit()) {
            validateEsimOtp(code);
        }
        int i4 = coroutineBoundary + 75;
        toString = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$queryEsimReservation$1", f = "ESimViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 121;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ESimViewModel.access$get_uiState$p(ESimViewModel.this).setValue(ESimUiState.copy$default((ESimUiState) ESimViewModel.access$get_uiState$p(ESimViewModel.this).getValue(), null, null, false, true, false, null, 55, null));
            ESimViewModel$queryEsimReservation$1$request$1 eSimViewModel$queryEsimReservation$1$request$1 = new ESimViewModel$queryEsimReservation$1$request$1();
            eSimViewModel$queryEsimReservation$1$request$1.method(BaseRequest.Method.GET);
            ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) eSimViewModel$queryEsimReservation$1$request$1, (String) null, (String) null, false, 7, (Object) null);
            final ESimViewModel eSimViewModel = ESimViewModel.this;
            ESimViewModel.this.sendRequest(eSimViewModel$queryEsimReservation$1$request$1, new ApiCallback<ESimQueryResponseDto>() {
                private static int ShareDataUIState = 0;
                private static int component1 = 1;

                @Override
                public void onSuccess(ESimQueryResponseDto eSimQueryResponseDto) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 39;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    onSuccess2(eSimQueryResponseDto);
                    if (i6 == 0) {
                        return;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public void onSuccess2(ESimQueryResponseDto value) {
                    int i4 = 2 % 2;
                    int i5 = ShareDataUIState + 123;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    super.onSuccess(value);
                    ESimViewModel.access$get_uiState$p(eSimViewModel).setValue(ESimUiState.copy$default((ESimUiState) ESimViewModel.access$get_uiState$p(eSimViewModel).getValue(), null, null, false, false, false, null, 55, null));
                    try {
                        ESimViewModel.access$handleEsimReservationSuccess(eSimViewModel, value);
                        int i7 = ShareDataUIState + 11;
                        component1 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Exception unused) {
                    }
                }

                @Override
                public void onError(BaseException e) {
                    int i4 = 2 % 2;
                    int i5 = component1 + 53;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    Intrinsics.checkNotNullParameter(e, "");
                    ESimViewModel.access$get_uiState$p(eSimViewModel).setValue(ESimUiState.copy$default((ESimUiState) ESimViewModel.access$get_uiState$p(eSimViewModel).getValue(), null, null, false, false, false, null, 55, null));
                    super.onError(e);
                    int i7 = component1 + 101;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                }
            });
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 23;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 57 / 0;
            }
            return unit;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = ESimViewModel.this.new ShareDataUIState(continuation);
            int i2 = ShareDataUIState + 53;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Object objComponent1;
            int i = 2 % 2;
            int i2 = component1 + 37;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                objComponent1 = component1(coroutineScope2, continuation2);
                int i3 = 42 / 0;
            } else {
                objComponent1 = component1(coroutineScope2, continuation2);
            }
            int i4 = ShareDataUIState + 33;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 15;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            if (i3 == 0) {
                shareDataUIState.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 31;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final Job queryEsimReservation() {
        int i = 2 % 2;
        Object obj = null;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = toString + 91;
        coroutineBoundary = i2 % 128;
        if (i2 % 2 != 0) {
            return jobShareDataUIState;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r1
  0x0027: PHI (r1v7 java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryBody>) = 
  (r1v6 java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryBody>)
  (r1v10 java.util.List<com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryBody>)
 binds: [B:10:0x0025, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void component3(com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryResponseDto r12) {
        /*
            r11 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString
            int r1 = r1 + 9
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.coroutineBoundary = r2
            int r1 = r1 % r0
            if (r12 == 0) goto L43
            int r2 = r2 + 19
            int r1 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L21
            java.util.List r1 = r12.getESimQueryBody()
            r2 = 4
            int r2 = r2 / 0
            if (r1 == 0) goto L43
            goto L27
        L21:
            java.util.List r1 = r12.getESimQueryBody()
            if (r1 == 0) goto L43
        L27:
            int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.toString
            int r2 = r2 + 33
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.coroutineBoundary = r3
            int r2 = r2 % r0
            boolean r0 = r1.isEmpty()
            r1 = 1
            if (r0 != r1) goto L43
            com.safaricom.sharedui.compose.navigation.ScreenInformation r0 = new com.safaricom.sharedui.compose.navigation.ScreenInformation
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen$Onboarding r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen.Onboarding.INSTANCE
            com.safaricom.sharedui.compose.navigation.ScreenDirection r2 = com.safaricom.sharedui.compose.navigation.ScreenDirection.FORWARD
            r0.<init>(r1, r2)
            r11.component1(r0)
        L43:
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState> r0 = r11.getRequestBeneficiariesState
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState r2 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState) r2
            if (r12 == 0) goto L54
            java.util.List r12 = r12.getESimQueryBody()
        L52:
            r8 = r12
            goto L56
        L54:
            r12 = 0
            goto L52
        L56:
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 31
            r10 = 0
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.setValue(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3(com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ESimQueryResponseDto):void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1", f = "ESimViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00a0, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r11.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r11.component2 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r12);
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r11.component1).setValue(com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState.copy$default((com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState) com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r11.component1).getValue(), null, true, false, false, false, null, 29, null));
            r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$normalizeMsisdn(r11.component1, ((com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState) com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_uiState$p(r11.component1).getValue()).getPhoneNumber());
            r1 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$request$1();
            r1.method(com.huawei.http.BaseRequest.Method.POST);
            r2 = r1;
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default((com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r2, (java.lang.String) null, (java.lang.String) null, false, 7, (java.lang.Object) null);
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$addMsisdnParamIfPresent(r11.component1, r2, r12);
            r1.addParams("app", com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants.SOURCE_SYSTEM);
            r3 = r11.component1;
            r11.component1.sendRequest(r1, new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$1(r3));
            r12 = kotlin.Unit.INSTANCE;
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.component3 + 21;
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.ShareDataUIState = r1 % 128;
            r1 = r1 % 2;
         */
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.component3
                int r1 = r1 + 31
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.component2
                r2 = 15
                int r2 = r2 / 0
                if (r1 != 0) goto L99
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.component2
                if (r1 != 0) goto L99
            L21:
                kotlin.ResultKt.throwOnFailure(r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r1)
                java.lang.Object r1 = r1.getValue()
                r2 = r1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState r2 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState) r2
                r3 = 0
                r4 = 1
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 29
                r10 = 0
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r12.setValue(r1)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_uiState$p(r12)
                java.lang.Object r12 = r12.getValue()
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState r12 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState) r12
                java.lang.String r12 = r12.getPhoneNumber()
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                java.lang.String r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$normalizeMsisdn(r1, r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$request$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$request$1
                r1.<init>()
                com.huawei.http.BaseRequest$Method r2 = com.huawei.http.BaseRequest.Method.POST
                r1.method(r2)
                r2 = r1
                com.huawei.digitalpayment.consumer.base.util.HaProxyRequest r2 = (com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r2
                r4 = 0
                r5 = 0
                r7 = 7
                r3 = r2
                com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default(r3, r4, r5, r6, r7, r8)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r3 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$addMsisdnParamIfPresent(r3, r2, r12)
                java.lang.String r12 = "app"
                java.lang.String r2 = "oneapp-android"
                r1.addParams(r12, r2)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                com.huawei.http.BaseRequest r1 = (com.huawei.http.BaseRequest) r1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$1 r2 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$generateEsimOtp$1$1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r3 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                r2.<init>()
                com.huawei.common.listener.ApiCallback r2 = (com.huawei.common.listener.ApiCallback) r2
                r12.sendRequest(r1, r2)
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.component3
                int r1 = r1 + 21
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.ShareDataUIState = r2
                int r1 = r1 % r0
                return r12
            L99:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = ESimViewModel.this.new component3(continuation);
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 11;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 5;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final Job generateEsimOtp() {
        int i = 2 % 2;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(null), 3, null);
        int i2 = toString + 17;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
        return jobShareDataUIState;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1", f = "ESimViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        int component1;
        final String component2;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x00a1, code lost:
        
            if ((r1 % 2) == 0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00a3, code lost:
        
            return r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00a5, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x00ad, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r11.component1 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r11.component1 == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r12);
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r11.component3).setValue(com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState.copy$default((com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState) com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r11.component3).getValue(), null, false, true, false, false, null, 27, null));
            r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$normalizeMsisdn(r11.component3, ((com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState) com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_uiState$p(r11.component3).getValue()).getPhoneNumber());
            r1 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$request$1();
            r1.method(com.huawei.http.BaseRequest.Method.POST);
            r2 = r1;
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default((com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r2, (java.lang.String) null, (java.lang.String) null, false, 7, (java.lang.Object) null);
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$addMsisdnParamIfPresent(r11.component3, r2, r12);
            r1.addParams("otp", r11.component2);
            r1.addParams("app", com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants.SOURCE_SYSTEM);
            r3 = r11.component3;
            r11.component3.sendRequest(r1, new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$1(r3));
            r12 = kotlin.Unit.INSTANCE;
            r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.ShareDataUIState + 73;
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.copydefault = r1 % 128;
         */
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
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.copydefault
                int r1 = r1 + 41
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.component1
                r2 = 11
                int r2 = r2 / 0
                if (r1 != 0) goto La6
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.component1
                if (r1 != 0) goto La6
            L21:
                kotlin.ResultKt.throwOnFailure(r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_otpState$p(r1)
                java.lang.Object r1 = r1.getValue()
                r2 = r1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState r2 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState) r2
                r3 = 0
                r4 = 0
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 27
                r10 = 0
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.OtpState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r12.setValue(r1)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$get_uiState$p(r12)
                java.lang.Object r12 = r12.getValue()
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState r12 = (com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimUiState) r12
                java.lang.String r12 = r12.getPhoneNumber()
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                java.lang.String r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$normalizeMsisdn(r1, r12)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$request$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$request$1
                r1.<init>()
                com.huawei.http.BaseRequest$Method r2 = com.huawei.http.BaseRequest.Method.POST
                r1.method(r2)
                r2 = r1
                com.huawei.digitalpayment.consumer.base.util.HaProxyRequest r2 = (com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r2
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 7
                r8 = 0
                r3 = r2
                com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default(r3, r4, r5, r6, r7, r8)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r3 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.access$addMsisdnParamIfPresent(r3, r2, r12)
                java.lang.String r12 = "otp"
                java.lang.String r2 = r11.component2
                r1.addParams(r12, r2)
                java.lang.String r12 = "app"
                java.lang.String r2 = "oneapp-android"
                r1.addParams(r12, r2)
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r12 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                com.huawei.http.BaseRequest r1 = (com.huawei.http.BaseRequest) r1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$1 r2 = new com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel$validateEsimOtp$1$1
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r3 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.this
                r2.<init>()
                com.huawei.common.listener.ApiCallback r2 = (com.huawei.common.listener.ApiCallback) r2
                r12.sendRequest(r1, r2)
                kotlin.Unit r12 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.ShareDataUIState
                int r1 = r1 + 73
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.copydefault = r2
                int r1 = r1 % r0
                if (r1 == 0) goto La4
                return r12
            La4:
                r12 = 0
                throw r12
            La6:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.component1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component1(String str, Continuation<? super component1> continuation) {
            super(2, continuation);
            this.component2 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = ESimViewModel.this.new component1(this.component2, continuation);
            int i2 = ShareDataUIState + 63;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 82 / 0;
            }
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 37;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = ShareDataUIState + 87;
            copydefault = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 51;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component1 component1Var = (component1) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component1Var.invokeSuspend(unit);
            }
            component1Var.invokeSuspend(unit);
            throw null;
        }
    }

    public final Job validateEsimOtp(String otpCode) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(otpCode, "");
        Object obj = null;
        Job jobShareDataUIState = onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component1(otpCode, null), 3, null);
        int i2 = coroutineBoundary + 23;
        toString = i2 % 128;
        if (i2 % 2 == 0) {
            return jobShareDataUIState;
        }
        obj.hashCode();
        throw null;
    }

    public final void reserveEsim() {
        int i = 2 % 2;
        MutableStateFlow<ESimUiState> mutableStateFlow = this.getRequestBeneficiariesState;
        mutableStateFlow.setValue(ESimUiState.copy$default(mutableStateFlow.getValue(), null, null, false, false, true, null, 47, null));
        String strComponent1 = component1(this.getRequestBeneficiariesState.getValue().getPhoneNumber());
        HaProxyRequest<ReserveOtpResponseDto> haProxyRequest = new HaProxyRequest<ReserveOtpResponseDto>() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3 + 113;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                int i6 = i4 + 69;
                component3 = i6 % 128;
                if (i6 % 2 == 0) {
                    return ESimApiUrl.E_SIM_RESERVATION;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        HaProxyRequest<ReserveOtpResponseDto> haProxyRequest2 = haProxyRequest;
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest2, (String) null, (String) null, false, 7, (Object) null);
        component2(haProxyRequest2, strComponent1);
        haProxyRequest.addParams("email", this.getRequestBeneficiariesState.getValue().getEmailAddress());
        haProxyRequest.addParams("attachmentURL", "");
        sendRequest(haProxyRequest, new ApiCallback<ReserveOtpResponseDto>() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public void onSuccess(ReserveOtpResponseDto reserveOtpResponseDto) {
                int i2 = 2 % 2;
                int i3 = component3 + 43;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Object obj = null;
                onSuccess2(reserveOtpResponseDto);
                if (i4 != 0) {
                    obj.hashCode();
                    throw null;
                }
                int i5 = ShareDataUIState + 91;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ReserveOtpResponseDto r15) {
                /*
                    Method dump skipped, instruction units count: 221
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.AnonymousClass1.onSuccess2(com.huawei.digitalpayment.consumer.sfcui.profile.esim.api.model.ReserveOtpResponseDto):void");
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 37;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                ESimViewModel.access$get_uiState$p(ESimViewModel.this).setValue(ESimUiState.copy$default((ESimUiState) ESimViewModel.access$get_uiState$p(ESimViewModel.this).getValue(), null, null, false, false, false, null, 47, null));
                Object obj = null;
                ESimViewModel.showError$default(ESimViewModel.this, "You are not eligible to request for eSIM at this moment, kindly visit Safaricom Shop for assistance, or try again after 72HRs", null, 2, null);
                int i5 = component3 + 25;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        });
        int i2 = toString + 95;
        coroutineBoundary = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void onCompletionClose() {
        int i = 2 % 2;
        queryEsimReservation();
        component1(new ScreenInformation<>(ESimScreen.Dashboard.INSTANCE, ScreenDirection.FORWARD));
        int i2 = coroutineBoundary + 95;
        toString = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        int i = ArtificialStackFrames + 111;
        getSponsorBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        defaultConstructorMarker.hashCode();
        throw null;
    }

    public final int getOtpLimit() {
        int i = 2 % 2;
        int i2 = coroutineBoundary + 107;
        int i3 = i2 % 128;
        toString = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 5;
        coroutineBoundary = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return 4;
    }
}
