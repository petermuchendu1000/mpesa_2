package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.google.common.base.Ascii;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiNamePayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.ChangeWifiPasswordPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.FetchProfilesPayload;
import com.huawei.digitalpayment.consumer.fixeddata.data.model.manageAccount.RestartRouterPayload;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.WifiUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.domain.repository.ManageAccountRepository;
import com.huawei.digitalpayment.consumer.fixeddata.ui.screen.manageaccount.ManageAccountNavigation;
import com.huawei.payment.mvvm.Resource;
import java.lang.reflect.Member;
import java.util.ArrayList;
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
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.setViewModelStore;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0007J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u001cJ\u0006\u0010$\u001a\u00020\u001cJ\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u001cJ\u0016\u0010)\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010+\u001a\u00020\u001cJ\u0018\u0010,\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0002J\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0006\u0010.\u001a\u00020\u001cJ\u001e\u0010/\u001a\u00020\u0007\"\u0004\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H0012\u0006\u00102\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00063"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/ManageAccountViewModel;", "Landroidx/lifecycle/ViewModel;", "manageAccountRepository", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/ManageAccountRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/fixeddata/domain/repository/ManageAccountRepository;)V", "cachedSerialNumber", "", "currentAccountId", "availableWifis", "", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/WifiUiModel;", "_toastState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;", "toastState", "Lkotlinx/coroutines/flow/StateFlow;", "getToastState", "()Lkotlinx/coroutines/flow/StateFlow;", "_navigationEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/huawei/digitalpayment/consumer/fixeddata/ui/screen/manageaccount/ManageAccountNavigation;", "navigationEvent", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationEvent", "()Lkotlinx/coroutines/flow/SharedFlow;", "retryAction", "Lkotlin/Function0;", "", "msisdn", "getMsisdn", "()Ljava/lang/String;", "fetchProfileDetails", "accountId", "onCheckAndNavigateToRestartRouter", "performRestartRouter", "onCheckAndNavigateToChangePassword", "onChangePasswordConfirmed", "profilePath", "newPass", "onCheckAndNavigateToChangeName", "onChangeNameConfirmed", "newName", "onRetryClicked", "updateLocalWifiName", "getWifiList", "dismissToast", "safeMessage", "T", "Lcom/huawei/payment/mvvm/Resource;", "default", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ManageAccountViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int getShareableDataState = 1;
    private static int getSponsorBeneficiariesState = 1;
    private static int hashCode;
    private static int toString;
    private List<WifiUiModel> ShareDataUIState;
    private String component1;
    private final MutableSharedFlow<ManageAccountNavigation> component2;
    private String component3;
    private final StateFlow<ToastState> component4;
    private final ManageAccountRepository copy;
    private final MutableStateFlow<ToastState> copydefault;
    private final SharedFlow<ManageAccountNavigation> equals;
    private final String getAsAtTimestamp;
    private Function0<Unit> getRequestBeneficiariesState;

    public static final String access$getCurrentAccountId$p(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 107;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = manageAccountViewModel.component3;
        int i5 = i2 + 91;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final ManageAccountRepository access$getManageAccountRepository$p(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 61;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        ManageAccountRepository manageAccountRepository = manageAccountViewModel.copy;
        int i5 = i2 + 97;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return manageAccountRepository;
    }

    public static final MutableSharedFlow access$get_navigationEvent$p(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 105;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        MutableSharedFlow<ManageAccountNavigation> mutableSharedFlow = manageAccountViewModel.component2;
        int i5 = i2 + 99;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableSharedFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_toastState$p(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 85;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<ToastState> mutableStateFlow = manageAccountViewModel.copydefault;
        int i5 = i2 + 5;
        hashCode = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final void access$setAvailableWifis$p(ManageAccountViewModel manageAccountViewModel, List list) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 105;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        manageAccountViewModel.ShareDataUIState = list;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 77;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 69 / 0;
        }
    }

    public static final void access$setCachedSerialNumber$p(ManageAccountViewModel manageAccountViewModel, String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 85;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        manageAccountViewModel.component1 = str;
        int i5 = i2 + 97;
        hashCode = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 99 / 0;
        }
    }

    public static final void access$setRetryAction$p(ManageAccountViewModel manageAccountViewModel, Function0 function0) {
        int i = 2 % 2;
        int i2 = hashCode + 65;
        int i3 = i2 % 128;
        getSponsorBeneficiariesState = i3;
        int i4 = i2 % 2;
        manageAccountViewModel.getRequestBeneficiariesState = function0;
        int i5 = i3 + 121;
        hashCode = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final void access$updateLocalWifiName(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 87;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        manageAccountViewModel.copydefault(str, str2);
        int i4 = hashCode + 119;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Inject
    public ManageAccountViewModel(ManageAccountRepository manageAccountRepository) {
        Intrinsics.checkNotNullParameter(manageAccountRepository, "");
        this.copy = manageAccountRepository;
        this.component3 = "";
        this.ShareDataUIState = CollectionsKt.emptyList();
        MutableStateFlow<ToastState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow;
        this.component4 = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<ManageAccountNavigation> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.component2 = mutableSharedFlowMutableSharedFlow$default;
        this.equals = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.getAsAtTimestamp = "0" + StringsKt.takeLast(StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null), 9);
    }

    public final StateFlow<ToastState> getToastState() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 111;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return this.component4;
        }
        throw null;
    }

    public final SharedFlow<ManageAccountNavigation> getNavigationEvent() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 11;
        int i3 = i2 % 128;
        hashCode = i3;
        int i4 = i2 % 2;
        SharedFlow<ManageAccountNavigation> sharedFlow = this.equals;
        int i5 = i3 + 13;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return sharedFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getMsisdn() {
        int i = 2 % 2;
        int i2 = hashCode;
        int i3 = i2 + 87;
        getSponsorBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = this.getAsAtTimestamp;
        int i5 = i2 + 85;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final void fetchProfileDetails(String accountId) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(accountId, "");
        this.component3 = accountId;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(accountId, null), 3, null);
        int i2 = getSponsorBeneficiariesState + 43;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$fetchProfileDetails$1", f = "ManageAccountViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int copydefault = 1;
        int ShareDataUIState;
        final String component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.ShareDataUIState;
            if (i2 != 0) {
                int i3 = copydefault + 95;
                int i4 = i3 % 128;
                component1 = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 81;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    int i7 = 61 / 0;
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (ManageAccountViewModel.access$getManageAccountRepository$p(ManageAccountViewModel.this).fetchWifiProfile(new FetchProfilesPayload(this.component3)).collect(new ManageAccountViewModel$fetchProfileDetails$1$1(ManageAccountViewModel.this, this.component3), this) == coroutine_suspended) {
                    int i8 = component1 + 21;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(String str, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.component3 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = ManageAccountViewModel.this.new component2(this.component3, continuation);
            int i2 = component1 + 9;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 31;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = copydefault + 1;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 26 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 67;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 107;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static final Unit copydefault(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 33;
        hashCode = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
            Unit unit = Unit.INSTANCE;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
        Unit unit2 = Unit.INSTANCE;
        int i3 = hashCode + 21;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return unit2;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCheckAndNavigateToRestartRouter() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 65;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = null;
        Object[] objArr = 0;
        if (this.component1 != null) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component4(null), 3, null);
        } else {
            this.copydefault.setValue(new ToastState.Error("Unable to fetch Wi-Fi details. Please try again later.", str, i, objArr == true ? 1 : 0));
            this.getRequestBeneficiariesState = new Function0() {
                private static int component1 = 0;
                private static int component3 = 1;

                @Override
                public final Object invoke() {
                    int i5 = 2 % 2;
                    int i6 = component3 + 7;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                    ManageAccountViewModel manageAccountViewModel = this.f$0;
                    if (i7 == 0) {
                        return ManageAccountViewModel.m10455$r8$lambda$BCPi_Jj9OWcrQvUS1a0XpMNQnw(manageAccountViewModel);
                    }
                    ManageAccountViewModel.m10455$r8$lambda$BCPi_Jj9OWcrQvUS1a0XpMNQnw(manageAccountViewModel);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            };
        }
        int i5 = hashCode + 33;
        getSponsorBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$onCheckAndNavigateToRestartRouter$2", f = "ManageAccountViewModel.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    static final class component4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (ManageAccountViewModel.access$get_navigationEvent$p(ManageAccountViewModel.this).emit(ManageAccountNavigation.GoToRestartRouter.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = ShareDataUIState + 13;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        component4(Continuation<? super component4> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component4 component4Var = ManageAccountViewModel.this.new component4(continuation);
            int i2 = component1 + 71;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 == 0) {
                return component4Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = ShareDataUIState + 9;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                return objComponent1;
            }
            throw null;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 13;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static final Unit ShareDataUIState(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 65;
        hashCode = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
        Unit unit = Unit.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performRestartRouter() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 31;
        hashCode = i3 % 128;
        String str = null;
        Object[] objArr = 0;
        if (i3 % 2 == 0) {
            String str2 = this.component1;
            if (str2 != null) {
                onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new equals(str2, null), 3, null);
                int i4 = getSponsorBeneficiariesState + 15;
                hashCode = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            this.copydefault.setValue(new ToastState.Error("Unable to fetch Wi-Fi details. Please try again later.", str, i, objArr == true ? 1 : 0));
            this.getRequestBeneficiariesState = new Function0() {
                private static int component1 = 1;
                private static int copydefault;

                @Override
                public final Object invoke() {
                    int i6 = 2 % 2;
                    int i7 = component1 + 107;
                    copydefault = i7 % 128;
                    int i8 = i7 % 2;
                    Unit unit$r8$lambda$DMk4jmKcLkS_llfGyzVQTofx9Mo = ManageAccountViewModel.$r8$lambda$DMk4jmKcLkS_llfGyzVQTofx9Mo(this.f$0);
                    if (i8 != 0) {
                        int i9 = 85 / 0;
                    }
                    return unit$r8$lambda$DMk4jmKcLkS_llfGyzVQTofx9Mo;
                }
            };
            int i6 = hashCode + 103;
            getSponsorBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$performRestartRouter$2", f = "ManageAccountViewModel.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    static final class equals extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final String component1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 31;
                copydefault = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (ManageAccountViewModel.access$getManageAccountRepository$p(ManageAccountViewModel.this).restartRouter(new RestartRouterPayload(ManageAccountViewModel.this.getMsisdn(), ManageAccountViewModel.access$getCurrentAccountId$p(ManageAccountViewModel.this), this.component1)).collect(new ManageAccountViewModel$performRestartRouter$2$1(ManageAccountViewModel.this), this) == coroutine_suspended) {
                    int i4 = copydefault + 71;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return coroutine_suspended;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        equals(String str, Continuation<? super equals> continuation) {
            super(2, continuation);
            this.component1 = str;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            equals equalsVar = ManageAccountViewModel.this.new equals(this.component1, continuation);
            int i2 = ShareDataUIState + 77;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            return equalsVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            int i4 = copydefault + 19;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 8 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 55;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((equals) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 23;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static final Unit component2(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 39;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCheckAndNavigateToChangePassword() {
        /*
            r10 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.getSponsorBeneficiariesState
            int r2 = r1 + 41
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.hashCode = r3
            int r2 = r2 % r0
            r3 = 0
            if (r2 != 0) goto L7a
            java.lang.String r2 = r10.component1
            if (r2 == 0) goto L52
            int r1 = r1 + 91
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.hashCode = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L29
            java.util.List<com.huawei.digitalpayment.consumer.fixeddata.domain.model.WifiUiModel> r1 = r10.ShareDataUIState
            boolean r1 = r1.isEmpty()
            r2 = 82
            int r2 = r2 / 0
            if (r1 == 0) goto L32
            goto L52
        L29:
            java.util.List<com.huawei.digitalpayment.consumer.fixeddata.domain.model.WifiUiModel> r1 = r10.ShareDataUIState
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L32
            goto L52
        L32:
            r1 = r10
            androidx.lifecycle.ViewModel r1 = (androidx.lifecycle.ViewModel) r1
            kotlinx.coroutines.CoroutineScope r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r1)
            r5 = 0
            r6 = 0
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$component1 r1 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$component1
            r1.<init>(r3)
            r7 = r1
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            r8 = 3
            r9 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.hashCode
            int r1 = r1 + 71
        L4c:
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            goto L6a
        L52:
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState> r1 = r10.copydefault
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState$Error r2 = new com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState$Error
            java.lang.String r4 = "Unable to fetch Wi-Fi details. Please try again later."
            r2.<init>(r4, r3, r0, r3)
            r1.setValue(r2)
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$$ExternalSyntheticLambda2 r1 = new com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$$ExternalSyntheticLambda2
            r1.<init>()
            r10.getRequestBeneficiariesState = r1
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.hashCode
            int r1 = r1 + 29
            goto L4c
        L6a:
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.hashCode
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.getSponsorBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L76
            return
        L76:
            r3.hashCode()
            throw r3
        L7a:
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.onCheckAndNavigateToChangePassword():void");
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$onCheckAndNavigateToChangePassword$2", f = "ManageAccountViewModel.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (ManageAccountViewModel.access$get_navigationEvent$p(ManageAccountViewModel.this).emit(ManageAccountNavigation.GoToChangeWifiPassword.INSTANCE, this) == coroutine_suspended) {
                    int i5 = component1 + 89;
                    ShareDataUIState = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = ShareDataUIState + 31;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i8 = component1 + 107;
            ShareDataUIState = i8 % 128;
            int i9 = i8 % 2;
            return unit;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = ManageAccountViewModel.this.new component1(continuation);
            int i2 = component1 + 23;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                return component1Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 1;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = 30 / 0;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 121;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 84 / 0;
            }
            return objInvokeSuspend;
        }
    }

    public final void onChangePasswordConfirmed(String profilePath, String newPass) {
        int i = 2 % 2;
        int i2 = hashCode + 25;
        getSponsorBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(profilePath, "");
            Intrinsics.checkNotNullParameter(newPass, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(profilePath, "");
        Intrinsics.checkNotNullParameter(newPass, "");
        String str = this.component1;
        if (str == null) {
            return;
        }
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(str, profilePath, newPass, null), 3, null);
        int i3 = hashCode + 61;
        getSponsorBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$onChangePasswordConfirmed$1", f = "ManageAccountViewModel.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component4 = 1;
        private static int equals;
        int component1;
        final String component2;
        final String component3;
        final String copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 83;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            if (i4 != 0) {
                int i5 = component4 + 101;
                equals = i5 % 128;
                int i6 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = component4 + 35;
                equals = i7 % 128;
                int i8 = i7 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (ManageAccountViewModel.access$getManageAccountRepository$p(ManageAccountViewModel.this).changeWifiPassword(new ChangeWifiPasswordPayload(ManageAccountViewModel.this.getMsisdn(), ManageAccountViewModel.access$getCurrentAccountId$p(ManageAccountViewModel.this), this.component2, this.component3, this.copydefault)).collect(new ManageAccountViewModel$onChangePasswordConfirmed$1$1(ManageAccountViewModel.this, this.component3, this.copydefault), this) == coroutine_suspended) {
                    int i9 = component4 + 21;
                    equals = i9 % 128;
                    int i10 = i9 % 2;
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(String str, String str2, String str3, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.component2 = str;
            this.component3 = str2;
            this.copydefault = str3;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = ManageAccountViewModel.this.new component3(this.component2, this.component3, this.copydefault, continuation);
            int i2 = component4 + 83;
            equals = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component4 + 43;
            equals = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = equals + 33;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = equals + 71;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 == 0) {
                component3Var.invokeSuspend(Unit.INSTANCE);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objInvokeSuspend = component3Var.invokeSuspend(Unit.INSTANCE);
            int i4 = component4 + 23;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    private static final Unit component1(ManageAccountViewModel manageAccountViewModel) {
        Unit unit;
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 15;
        hashCode = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
            unit = Unit.INSTANCE;
            int i3 = 58 / 0;
        } else {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.fetchProfileDetails(manageAccountViewModel.component3);
            unit = Unit.INSTANCE;
        }
        int i4 = getSponsorBeneficiariesState + 79;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCheckAndNavigateToChangeName() {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = getSponsorBeneficiariesState + 25;
        hashCode = i3 % 128;
        int i4 = i3 % 2;
        String str = null;
        Object[] objArr = 0;
        if (this.component1 != null && !this.ShareDataUIState.isEmpty()) {
            onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new copydefault(null), 3, null);
            int i5 = getSponsorBeneficiariesState + 89;
            hashCode = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        this.copydefault.setValue(new ToastState.Error("Unable to fetch Wi-Fi details. Please try again later.", str, i, objArr == true ? 1 : 0));
        this.getRequestBeneficiariesState = new Function0() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke() {
                int i7 = 2 % 2;
                int i8 = ShareDataUIState + 115;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                Unit unitM10456$r8$lambda$VUv9roGK5Zd_9NjE_f6thab0Dc = ManageAccountViewModel.m10456$r8$lambda$VUv9roGK5Zd_9NjE_f6thab0Dc(this.f$0);
                int i10 = component2 + 73;
                ShareDataUIState = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 91 / 0;
                }
                return unitM10456$r8$lambda$VUv9roGK5Zd_9NjE_f6thab0Dc;
            }
        };
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$onCheckAndNavigateToChangeName$2", f = "ManageAccountViewModel.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    public static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static final byte[] $$a = {35, -27, -128, TarHeader.LF_SYMLINK, -9, 62, -71, 10, 1, -5, -20, 8, -16, Ascii.SO, -22, 71, -71, -9, Ascii.VT, 6, -24, Ascii.DC2, 43, 2, -62, -8, -9, Ascii.FF, -16, 1, 10, -14, 59, PSSSigner.TRAILER_IMPLICIT, -4, 8, -16, Ascii.SO, -22, 2, -6, -4, 66, PSSSigner.TRAILER_IMPLICIT, 10, -20, Ascii.VT, -16, -7, Ascii.DC2, -4, -13, 4, TarHeader.LF_BLK, -36, -22, -20, Ascii.VT, -16, -7, Ascii.DC2, -4, -13, 4, Ascii.SO, -24, -7, 5, -13, -9, -2, Ascii.GS, -24, -7, 5, -2, Base64.padSymbol, -66, -15, -1, -6, -2, -2, 6, -12, -9, 62};
        private static final int $$b = 149;
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component1;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(int r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.copydefault.$$a
                int r9 = r9 * 4
                int r9 = 84 - r9
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r7 = r7 * 4
                int r7 = 105 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r8
                r4 = r2
                goto L2f
            L16:
                r3 = r2
            L17:
                r6 = r8
                r8 = r7
                r7 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r6
            L2f:
                int r7 = -r7
                int r8 = r8 + 1
                int r3 = r3 + r7
                int r7 = r3 + (-3)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel.copydefault.a(int, int, int, java.lang.Object[]):void");
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component1;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (ManageAccountViewModel.access$get_navigationEvent$p(ManageAccountViewModel.this).emit(ManageAccountNavigation.GoToChangeWifiName.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = ShareDataUIState + 57;
            component3 = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = ManageAccountViewModel.this.new copydefault(continuation);
            int i2 = ShareDataUIState + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 93;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return ShareDataUIState(coroutineScope2, continuation2);
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = 63 / 0;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 69;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 29;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }

        public static void copydefault() {
            Member[] memberArr = setViewModelStore.copydefault;
            byte b2 = (byte) ($$a[8] - 1);
            byte b3 = b2;
            Object[] objArr = new Object[1];
            a(b2, b3, b3, objArr);
            memberArr[0] = Class.forName((String) objArr[0]).getDeclaredField("component4");
        }
    }

    public final void onChangeNameConfirmed(String profilePath, String newName) {
        int i = 2 % 2;
        int i2 = hashCode + 117;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(profilePath, "");
        Intrinsics.checkNotNullParameter(newName, "");
        String str = this.component1;
        if (str == null) {
            return;
        }
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new ShareDataUIState(str, profilePath, newName, null), 3, null);
        int i4 = hashCode + 73;
        getSponsorBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel$onChangeNameConfirmed$1", f = "ManageAccountViewModel.kt", i = {}, l = {WSContextConstant.HANDSHAKE_SEND_SIZE}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int copy = 0;
        private static int equals = 1;
        final String ShareDataUIState;
        int component1;
        final String component3;
        final String copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = copy + 65;
                equals = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i4 = equals + 79;
                copy = i4 % 128;
                int i5 = i4 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (ManageAccountViewModel.access$getManageAccountRepository$p(ManageAccountViewModel.this).changeWifiName(new ChangeWifiNamePayload(ManageAccountViewModel.this.getMsisdn(), ManageAccountViewModel.access$getCurrentAccountId$p(ManageAccountViewModel.this), this.copydefault, this.ShareDataUIState, this.component3)).collect(new ManageAccountViewModel$onChangeNameConfirmed$1$1(ManageAccountViewModel.this, this.ShareDataUIState, this.component3), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ShareDataUIState(String str, String str2, String str3, Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
            this.copydefault = str;
            this.ShareDataUIState = str2;
            this.component3 = str3;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = ManageAccountViewModel.this.new ShareDataUIState(this.copydefault, this.ShareDataUIState, this.component3, continuation);
            int i2 = equals + 97;
            copy = i2 % 128;
            if (i2 % 2 == 0) {
                return shareDataUIState;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copy + 33;
            equals = i2 % 128;
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
            int i2 = equals + 15;
            copy = i2 % 128;
            int i3 = i2 % 2;
            ShareDataUIState shareDataUIState = (ShareDataUIState) create(coroutineScope, continuation);
            if (i3 != 0) {
                shareDataUIState.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = shareDataUIState.invokeSuspend(Unit.INSTANCE);
            int i4 = copy + 67;
            equals = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    public final void onRetryClicked() {
        int i = 2 % 2;
        int i2 = hashCode + 109;
        getSponsorBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        this.copydefault.setValue(null);
        Function0<Unit> function0 = this.getRequestBeneficiariesState;
        if (function0 != null) {
            function0.invoke();
        }
        int i4 = getSponsorBeneficiariesState + 93;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void copydefault(String str, String str2) {
        int i = 2 % 2;
        List<WifiUiModel> list = this.ShareDataUIState;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (WifiUiModel wifiUiModelCopy$default : list) {
            int i2 = getSponsorBeneficiariesState + 43;
            hashCode = i2 % 128;
            int i3 = i2 % 2;
            if (Intrinsics.areEqual(wifiUiModelCopy$default.getProfilePath(), str)) {
                int i4 = hashCode + 41;
                getSponsorBeneficiariesState = i4 % 128;
                wifiUiModelCopy$default = i4 % 2 == 0 ? WifiUiModel.copy$default(wifiUiModelCopy$default, str2, null, false, 47, null) : WifiUiModel.copy$default(wifiUiModelCopy$default, str2, null, false, 6, null);
            }
            arrayList.add(wifiUiModelCopy$default);
        }
        this.ShareDataUIState = arrayList;
        int i5 = hashCode + 89;
        getSponsorBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
    }

    public final List<WifiUiModel> getWifiList() {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState;
        int i3 = i2 + 109;
        hashCode = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<WifiUiModel> list = this.ShareDataUIState;
        int i4 = i2 + 67;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    public final void dismissToast() {
        int i = 2 % 2;
        int i2 = hashCode + 41;
        getSponsorBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            this.copydefault.setValue(null);
        } else {
            this.copydefault.setValue(null);
            int i3 = 28 / 0;
        }
    }

    public final <T> String safeMessage(Resource<T> resource, String str) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 53;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(resource, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            String message = resource.getMessage();
            if (message != null) {
                return message;
            }
            int i4 = hashCode + 73;
            getSponsorBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static Unit m10455$r8$lambda$BCPi_Jj9OWcrQvUS1a0XpMNQnw(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = hashCode + 15;
        getSponsorBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            copydefault(manageAccountViewModel);
            obj.hashCode();
            throw null;
        }
        Unit unitCopydefault = copydefault(manageAccountViewModel);
        int i3 = getSponsorBeneficiariesState + 23;
        hashCode = i3 % 128;
        if (i3 % 2 == 0) {
            return unitCopydefault;
        }
        throw null;
    }

    public static Unit $r8$lambda$DMk4jmKcLkS_llfGyzVQTofx9Mo(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 105;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Unit unitShareDataUIState = ShareDataUIState(manageAccountViewModel);
        int i4 = getSponsorBeneficiariesState + 97;
        hashCode = i4 % 128;
        int i5 = i4 % 2;
        return unitShareDataUIState;
    }

    public static Unit m10456$r8$lambda$VUv9roGK5Zd_9NjE_f6thab0Dc(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 119;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent1 = component1(manageAccountViewModel);
        int i4 = hashCode + 69;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent1;
    }

    public static Unit m10457$r8$lambda$fQKMGjseIbJu3TJ1TKQvltKJLg(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getSponsorBeneficiariesState + 47;
        hashCode = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(manageAccountViewModel);
        int i4 = hashCode + 41;
        getSponsorBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent2;
    }

    static {
        int i = 1 + 35;
        toString = i % 128;
        if (i % 2 != 0) {
            int i2 = 53 / 0;
        }
    }
}
