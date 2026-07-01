package com.huawei.digitalpayment.consumer.sfc.mpesaglobal;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.model.BaseModel;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.MpesaGlobalApiUrl;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtRequestHelperKt;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceBody;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceData;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.api.model.ImtServiceRequest;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.country.model.Country;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.ui.model.ImtOptInState;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.ImtConstants;
import com.huawei.digitalpayment.consumer.sfc.mpesaglobal.util.MPesaGlobalScreen;
import com.huawei.http.BaseRequest;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u001c\u0010\u001e\u001a\u00020\u00172\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110 H\u0002J\u0006\u0010!\u001a\u00020\u0017J\u0010\u0010\"\u001a\u00020\u00172\b\u0010#\u001a\u0004\u0018\u00010$J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020$H\u0002R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/MpesaGlobalViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huawei/digitalpayment/consumer/baselib/model/BaseModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "_screenTransition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/util/MPesaGlobalScreen;", "screenTransition", "Landroidx/lifecycle/LiveData;", "getScreenTransition", "()Landroidx/lifecycle/LiveData;", "_optOutState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/ui/model/ImtOptInState;", "optOutState", "Lkotlinx/coroutines/flow/StateFlow;", "getOptOutState", "()Lkotlinx/coroutines/flow/StateFlow;", "setScreen", "", "screenInformation", "nextScreen", "previousScreen", "doOptIn", "country", "Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/country/model/Country;", "updateImtOptOutState", "reducer", "Lkotlin/Function1;", "onActionOptOut", "requestOptOut", "nullableReason", "", "performOptOut", ImtConstants.KEY_REASON, "Companion", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MpesaGlobalViewModel extends ViewModel implements BaseModel {
    public static final String SCREEN_KEY = "screen_key";
    private static int copydefault = 0;
    private static int equals = 0;
    private static int getAsAtTimestamp = 1;
    private static int getRequestBeneficiariesState = 1;
    private final MutableStateFlow<ImtOptInState> ShareDataUIState;
    private final MutableLiveData<ScreenInformation<MPesaGlobalScreen>> component1;
    private final StateFlow<ImtOptInState> component2;
    private final LiveData<ScreenInformation<MPesaGlobalScreen>> component3;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static final void access$setScreen(MpesaGlobalViewModel mpesaGlobalViewModel, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = copydefault + 55;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        mpesaGlobalViewModel.component2((ScreenInformation<MPesaGlobalScreen>) screenInformation);
        if (i3 == 0) {
            throw null;
        }
    }

    public static final void access$updateImtOptOutState(MpesaGlobalViewModel mpesaGlobalViewModel, Function1 function1) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 101;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        mpesaGlobalViewModel.copydefault(function1);
        int i4 = getAsAtTimestamp + 61;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfc/mpesaglobal/MpesaGlobalViewModel$Companion;", "", "<init>", "()V", "SCREEN_KEY", "", "ConsumerSfcUiMpesaGlobal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MpesaGlobalViewModel(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        MutableLiveData<ScreenInformation<MPesaGlobalScreen>> mutableLiveData = new MutableLiveData<>();
        this.component1 = mutableLiveData;
        this.component3 = mutableLiveData;
        MutableStateFlow<ImtOptInState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ImtOptInState(false, false, 3, null));
        this.ShareDataUIState = MutableStateFlow;
        this.component2 = FlowKt.asStateFlow(MutableStateFlow);
        MPesaGlobalScreen.Onboarding onboarding = (MPesaGlobalScreen) savedStateHandle.get("screen_key");
        if (onboarding == null) {
            onboarding = MPesaGlobalScreen.Onboarding.INSTANCE;
            int i = getAsAtTimestamp + 83;
            copydefault = i % 128;
            if (i % 2 == 0) {
                int i2 = 2 % 2;
            }
        }
        component2(new ScreenInformation<>(onboarding, ScreenDirection.NONE));
        int i3 = copydefault + 123;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    public final LiveData<ScreenInformation<MPesaGlobalScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component3;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<ImtOptInState> getOptOutState() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        StateFlow<ImtOptInState> stateFlow = this.component2;
        int i5 = i3 + 117;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    private final void component2(ScreenInformation<MPesaGlobalScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 33;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            this.component1.setValue(screenInformation);
            throw null;
        }
        this.component1.setValue(screenInformation);
        int i3 = copydefault + 113;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void nextScreen() {
        MPesaGlobalScreen.OptOutSuccess optOutSuccess;
        int i = 2 % 2;
        ScreenInformation<MPesaGlobalScreen> value = this.component1.getValue();
        MPesaGlobalScreen screen = null;
        MPesaGlobalScreen screen2 = value != null ? value.getScreen() : null;
        if (screen2 instanceof MPesaGlobalScreen.Onboarding) {
            int i2 = copydefault + 91;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            optOutSuccess = MPesaGlobalScreen.OptInCountry.INSTANCE;
        } else if (screen2 instanceof MPesaGlobalScreen.OptInCountry) {
            optOutSuccess = MPesaGlobalScreen.OptIn.INSTANCE;
        } else if (screen2 instanceof MPesaGlobalScreen.OptIn) {
            int i4 = copydefault + 81;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                optOutSuccess = MPesaGlobalScreen.OptInSuccess.INSTANCE;
                int i5 = 49 / 0;
            } else {
                optOutSuccess = MPesaGlobalScreen.OptInSuccess.INSTANCE;
            }
        } else {
            if (!(screen2 instanceof MPesaGlobalScreen.OptOut)) {
                throw new IllegalArgumentException("Invalid screen " + screen2);
            }
            optOutSuccess = MPesaGlobalScreen.OptOutSuccess.INSTANCE;
        }
        StringBuilder sb = new StringBuilder("Current screen: ");
        ScreenInformation<MPesaGlobalScreen> value2 = this.component1.getValue();
        if (value2 != null) {
            int i6 = copydefault + 11;
            getAsAtTimestamp = i6 % 128;
            int i7 = i6 % 2;
            screen = value2.getScreen();
            int i8 = copydefault + 115;
            getAsAtTimestamp = i8 % 128;
            int i9 = i8 % 2;
        }
        sb.append(screen);
        Log.d("MpesaGlobalViewModel", sb.toString());
        Log.d("MpesaGlobalViewModel", "Next screen: " + optOutSuccess);
        component2(new ScreenInformation<>(optOutSuccess, ScreenDirection.FORWARD));
    }

    public final void previousScreen() {
        MPesaGlobalScreen screen;
        MPesaGlobalScreen.Dashboard dashboard;
        int i = 2 % 2;
        ScreenInformation<MPesaGlobalScreen> value = this.component1.getValue();
        if (value != null) {
            int i2 = copydefault + 65;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            screen = value.getScreen();
        } else {
            screen = null;
        }
        if (screen instanceof MPesaGlobalScreen.OptIn) {
            dashboard = MPesaGlobalScreen.Onboarding.INSTANCE;
        } else if ((screen instanceof MPesaGlobalScreen.OptOutFailure) || (screen instanceof MPesaGlobalScreen.OptOut)) {
            dashboard = MPesaGlobalScreen.Dashboard.INSTANCE;
        } else {
            dashboard = MPesaGlobalScreen.Close.INSTANCE;
        }
        component2(new ScreenInformation<>(dashboard, ScreenDirection.BACK));
        int i4 = copydefault + 15;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void doOptIn(Country country) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(country, "");
        nextScreen();
        HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = copydefault + 75;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return MpesaGlobalApiUrl.CUSTOMER_OPERATIONS;
                }
                int i4 = 90 / 0;
                return MpesaGlobalApiUrl.CUSTOMER_OPERATIONS;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        haProxyRequest.addParams(ImtConstants.SERVICE_REQUEST_KEY, new ImtServiceRequest(ImtRequestHelperKt.generateImtRequestHeader(ImtConstants.IMT_OPT_IN), new ImtServiceBody(CollectionsKt.listOf((Object[]) new ImtServiceData[]{new ImtServiceData("msisdn", StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null)), new ImtServiceData("location", country.getName())}))));
        sendRequest(haProxyRequest, new ApiCallback<Object>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public void onSuccess(Object value) {
                int i2 = 2 % 2;
                super.onSuccess(value);
                Log.d("MpesaGlobalViewModel", "Opt-in request success, data: " + value);
                MpesaGlobalViewModel.this.nextScreen();
                int i3 = component3 + 97;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }

            @Override
            public void onError(BaseException e) {
                int i2 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                Log.d("MpesaGlobalViewModel", "Request error: " + e);
                MpesaGlobalViewModel.access$setScreen(MpesaGlobalViewModel.this, new ScreenInformation(MPesaGlobalScreen.OptInFailure.INSTANCE, ScreenDirection.FORWARD));
                int i3 = ShareDataUIState + 21;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        int i2 = getAsAtTimestamp + 23;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void copydefault(Function1<? super ImtOptInState, ImtOptInState> function1) {
        int i = 2 % 2;
        int i2 = copydefault + 97;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<ImtOptInState> mutableStateFlow = this.ShareDataUIState;
        mutableStateFlow.setValue(function1.invoke(mutableStateFlow.getValue()));
        int i4 = getAsAtTimestamp + 105;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onActionOptOut() {
        int i = 2 % 2;
        component2(new ScreenInformation<>(MPesaGlobalScreen.OptOut.INSTANCE, ScreenDirection.FORWARD));
        int i2 = getAsAtTimestamp + 57;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void requestOptOut(String nullableReason) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (nullableReason != null) {
            ShareDataUIState(nullableReason);
        }
        int i3 = copydefault + 9;
        getAsAtTimestamp = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static final ImtOptInState component2(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = copydefault + 5;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(imtOptInState, "");
        } else {
            Intrinsics.checkNotNullParameter(imtOptInState, "");
        }
        return imtOptInState.copy(true, false);
    }

    private final void ShareDataUIState(String str) {
        int i = 2 % 2;
        copydefault(new Function1() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 105;
                copydefault = i3 % 128;
                ImtOptInState imtOptInState = (ImtOptInState) obj;
                if (i3 % 2 != 0) {
                    MpesaGlobalViewModel.$r8$lambda$OcCsUGR7DJEd2BDo9FMgHZ35pwU(imtOptInState);
                    throw null;
                }
                ImtOptInState imtOptInState$r8$lambda$OcCsUGR7DJEd2BDo9FMgHZ35pwU = MpesaGlobalViewModel.$r8$lambda$OcCsUGR7DJEd2BDo9FMgHZ35pwU(imtOptInState);
                int i4 = component1 + 121;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return imtOptInState$r8$lambda$OcCsUGR7DJEd2BDo9FMgHZ35pwU;
            }
        });
        HaProxyRequest<Object> haProxyRequest = new HaProxyRequest<Object>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i2 = 2 % 2;
                int i3 = component3;
                int i4 = i3 + 41;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = i3 + 23;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 81 / 0;
                }
                return MpesaGlobalApiUrl.CUSTOMER_OPERATIONS;
            }
        };
        haProxyRequest.method(BaseRequest.Method.POST);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        haProxyRequest.addParams(ImtConstants.SERVICE_REQUEST_KEY, new ImtServiceRequest(ImtRequestHelperKt.generateImtRequestHeader(ImtConstants.IMT_OPT_OUT), new ImtServiceBody(CollectionsKt.listOf((Object[]) new ImtServiceData[]{new ImtServiceData("msisdn", StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null)), new ImtServiceData(ImtConstants.KEY_REASON, str)}))));
        sendRequest(haProxyRequest, new MpesaGlobalViewModel$performOptOut$2(this));
        int i2 = copydefault + 51;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    public static ImtOptInState $r8$lambda$OcCsUGR7DJEd2BDo9FMgHZ35pwU(ImtOptInState imtOptInState) {
        int i = 2 % 2;
        int i2 = copydefault + 49;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        ImtOptInState imtOptInStateComponent2 = component2(imtOptInState);
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return imtOptInStateComponent2;
    }

    static {
        int i = equals + 37;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }
}
