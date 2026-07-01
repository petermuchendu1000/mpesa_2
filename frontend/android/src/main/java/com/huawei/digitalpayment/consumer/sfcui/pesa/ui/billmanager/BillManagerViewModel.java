package com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.android.phone.mobilesdk.socketcraft.WebSocket;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.http.GsmEndpoints;
import com.huawei.digitalpayment.consumer.base.util.ExtensionMethodsKt;
import com.huawei.digitalpayment.consumer.base.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.base.util.HaProxyRequest;
import com.huawei.digitalpayment.consumer.base.util.ImageLoader;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.scan.model.response.VerifyNumberResp;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerScreen;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateErrors;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.create.BillManagerCreateState;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.FrequentBillsUiState;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.PopularBillsUiState;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountsResponseDto;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillManagerDashboardMappersKt;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillSource;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.FrequentBillsResponseDto;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillDto;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.PopularBillResponseDto;
import com.huawei.http.BaseRequest;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u00106\u001a\u0002072\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u000e\u00109\u001a\u0002072\u0006\u0010:\u001a\u000203J\u000e\u0010;\u001a\u0002072\u0006\u0010:\u001a\u000203J\u000e\u0010<\u001a\u0002072\u0006\u0010:\u001a\u000203J\u000e\u0010=\u001a\u0002072\u0006\u0010:\u001a\u000203J\u0010\u0010>\u001a\u0002072\b\u0010?\u001a\u0004\u0018\u000103J\u0010\u0010@\u001a\u0002072\b\u0010A\u001a\u0004\u0018\u00010BJ\u0006\u0010C\u001a\u000207J\u0006\u0010D\u001a\u000207J\u0006\u0010E\u001a\u000207J\u0006\u0010F\u001a\u000207J\u0010\u0010G\u001a\u0002072\b\b\u0002\u0010H\u001a\u00020/J\u0006\u0010I\u001a\u000207J\u0006\u0010J\u001a\u000207J\u0006\u0010K\u001a\u000207J\u0006\u0010L\u001a\u000207J\u0006\u0010M\u001a\u000207J\u0006\u0010N\u001a\u000207J\u0006\u0010O\u001a\u000207J\u0006\u0010P\u001a\u000207J\u0006\u0010Q\u001a\u000207J\u0006\u0010R\u001a\u000207J\u0006\u0010S\u001a\u000207J\u0006\u0010T\u001a\u000207J\u000e\u0010U\u001a\u0002072\u0006\u0010V\u001a\u00020!J\u0016\u0010W\u001a\u0002072\u0006\u0010V\u001a\u00020!2\u0006\u0010X\u001a\u00020(J\u0006\u0010Y\u001a\u000207J\u0006\u0010Z\u001a\u000207R(\u0010\u0004\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \b*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0013R\u0016\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0013R\u0016\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u0011¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0013R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0011¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0013R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0013R\u0016\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001030\u0011¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0013¨\u0006["}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "_screenTransition", "Landroidx/lifecycle/MutableLiveData;", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/BillManagerScreen;", "kotlin.jvm.PlatformType", "screenTransition", "Landroidx/lifecycle/LiveData;", "getScreenTransition", "()Landroidx/lifecycle/LiveData;", "_createBillState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/create/BillManagerCreateState;", "createBillState", "Lkotlinx/coroutines/flow/StateFlow;", "getCreateBillState", "()Lkotlinx/coroutines/flow/StateFlow;", "_billAccountsUiState", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/BillAccountsUiState;", "billAccountsUiState", "getBillAccountsUiState", "_frequentBillsUiState", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/FrequentBillsUiState;", "frequentBillsUiState", "getFrequentBillsUiState", "_popularBillsUiState", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/dashboard/PopularBillsUiState;", "popularBillsUiState", "getPopularBillsUiState", "_selectedBillAccountForPay", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillAccountUiModel;", "selectedBillAccountForPay", "getSelectedBillAccountForPay", "_selectedBillAccountForMore", "selectedBillAccountForMore", "getSelectedBillAccountForMore", "_selectedBillSource", "Lcom/huawei/digitalpayment/consumer/sfcui/pesa/ui/billmanager/model/BillSource;", "selectedBillSource", "getSelectedBillSource", "_billBeingEdited", "billBeingEdited", "getBillBeingEdited", "_deleteBillLoading", "", "deleteBillLoading", "getDeleteBillLoading", "_deleteBillErrorMessage", "", "deleteBillErrorMessage", "getDeleteBillErrorMessage", "setScreen", "", "screenInformation", "onBillNameChanged", "value", "onPaybillNumberChanged", "onAccountNumberChanged", "onAmountChanged", "setPaybillError", "message", "setPaybillSuccess", "verifyResp", "Lcom/huawei/digitalpayment/consumer/scan/model/response/VerifyNumberResp;", "clearCreateBillApiError", "clearDeleteBillApiError", "onCreateBillContinue", "showDashboard", "showCreate", "shouldClearEditFlow", "showConfirm", "showDoMore", "showDelete", "previousScreen", "getBillAccounts", "getFrequentBills", "getPopularBills", "createBill", "startEditBillFlow", "clearEditBillFlow", "editBill", "deleteBill", "onBillAccountPayClicked", "bill", "onBillAccountMoreClicked", "source", "clearSelectedBillAccountForPay", "clearSelectedBillAccountForMore", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BillManagerViewModel extends ViewModel {
    public static final int $stable = 8;

    private static int f2730a = 0;

    private static int f2731c = 61 % 128;

    private static int f2732d = 0;
    private static int h = 1;
    private final StateFlow<BillAccountUiModel> ArtificialStackFrames;
    private final StateFlow<Boolean> CoroutineDebuggingKt;
    private final MutableStateFlow<String> ShareDataUIState;
    private final StateFlow<FrequentBillsUiState> accessartificialFrame;

    private final StateFlow<BillSource> f2733b;
    private final MutableStateFlow<Boolean> component1;
    private final MutableStateFlow<BillAccountsUiState> component2;
    private final MutableStateFlow<BillAccountUiModel> component3;
    private final MutableStateFlow<FrequentBillsUiState> component4;
    private final MutableLiveData<ScreenInformation<BillManagerScreen>> copy;
    private final MutableStateFlow<BillManagerCreateState> copydefault;
    private final StateFlow<BillAccountUiModel> coroutineBoundary;
    private final StateFlow<PopularBillsUiState> coroutineCreation;
    private final MutableStateFlow<PopularBillsUiState> equals;
    private final LiveData<ScreenInformation<BillManagerScreen>> getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final MutableStateFlow<BillAccountUiModel> getAsAtTimestamp;
    private final MutableStateFlow<BillAccountUiModel> getRequestBeneficiariesState;
    private final StateFlow<BillManagerCreateState> getShareableDataState;
    private final StateFlow<String> getSponsorBeneficiariesState;
    private final MutableStateFlow<BillSource> hashCode;
    private final StateFlow<BillAccountUiModel> invoke;
    private final StateFlow<BillAccountsUiState> toString;

    public static final MutableStateFlow access$get_billAccountsUiState$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = h + 73;
        int i3 = i2 % 128;
        f2732d = i3;
        int i4 = i2 % 2;
        MutableStateFlow<BillAccountsUiState> mutableStateFlow = billManagerViewModel.component2;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 97;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_createBillState$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 61;
        h = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = billManagerViewModel.copydefault;
        int i5 = i2 + 119;
        h = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_deleteBillErrorMessage$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = f2732d + 117;
        h = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<String> mutableStateFlow = billManagerViewModel.ShareDataUIState;
        if (i3 != 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final MutableStateFlow access$get_deleteBillLoading$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = f2732d + 67;
        int i3 = i2 % 128;
        h = i3;
        int i4 = i2 % 2;
        MutableStateFlow<Boolean> mutableStateFlow = billManagerViewModel.component1;
        int i5 = i3 + 67;
        f2732d = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public static final MutableStateFlow access$get_frequentBillsUiState$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = h + 5;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<FrequentBillsUiState> mutableStateFlow = billManagerViewModel.component4;
        if (i3 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final MutableStateFlow access$get_popularBillsUiState$p(BillManagerViewModel billManagerViewModel) {
        int i = 2 % 2;
        int i2 = h;
        int i3 = i2 + 53;
        f2732d = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<PopularBillsUiState> mutableStateFlow = billManagerViewModel.equals;
        int i5 = i2 + 85;
        f2732d = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public BillManagerViewModel() {
        MutableLiveData<ScreenInformation<BillManagerScreen>> mutableLiveData = new MutableLiveData<>(new ScreenInformation(BillManagerScreen.Dashboard.INSTANCE, ScreenDirection.NONE));
        this.copy = mutableLiveData;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = mutableLiveData;
        String str = null;
        MutableStateFlow<BillManagerCreateState> MutableStateFlow = StateFlowKt.MutableStateFlow(new BillManagerCreateState(str, null, null, null, null, false, null, null, false, 511, null));
        this.copydefault = MutableStateFlow;
        this.getShareableDataState = FlowKt.asStateFlow(MutableStateFlow);
        boolean z = false;
        int i = 7;
        MutableStateFlow<BillAccountsUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new BillAccountsUiState(z, str, null == true ? 1 : 0, i, null == true ? 1 : 0));
        this.component2 = MutableStateFlow2;
        this.toString = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<FrequentBillsUiState> MutableStateFlow3 = StateFlowKt.MutableStateFlow(new FrequentBillsUiState(z, str, null == true ? 1 : 0, i, null == true ? 1 : 0));
        this.component4 = MutableStateFlow3;
        this.accessartificialFrame = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<PopularBillsUiState> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new PopularBillsUiState(z, str, null == true ? 1 : 0, i, null == true ? 1 : 0));
        this.equals = MutableStateFlow4;
        this.coroutineCreation = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<BillAccountUiModel> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.getRequestBeneficiariesState = MutableStateFlow5;
        this.invoke = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<BillAccountUiModel> MutableStateFlow6 = StateFlowKt.MutableStateFlow(null);
        this.getAsAtTimestamp = MutableStateFlow6;
        this.coroutineBoundary = FlowKt.asStateFlow(MutableStateFlow6);
        MutableStateFlow<BillSource> MutableStateFlow7 = StateFlowKt.MutableStateFlow(null);
        this.hashCode = MutableStateFlow7;
        this.f2733b = FlowKt.asStateFlow(MutableStateFlow7);
        MutableStateFlow<BillAccountUiModel> MutableStateFlow8 = StateFlowKt.MutableStateFlow(null);
        this.component3 = MutableStateFlow8;
        this.ArtificialStackFrames = FlowKt.asStateFlow(MutableStateFlow8);
        MutableStateFlow<Boolean> MutableStateFlow9 = StateFlowKt.MutableStateFlow(false);
        this.component1 = MutableStateFlow9;
        this.CoroutineDebuggingKt = FlowKt.asStateFlow(MutableStateFlow9);
        MutableStateFlow<String> MutableStateFlow10 = StateFlowKt.MutableStateFlow(null);
        this.ShareDataUIState = MutableStateFlow10;
        this.getSponsorBeneficiariesState = FlowKt.asStateFlow(MutableStateFlow10);
        getBillAccounts();
        getFrequentBills();
        getPopularBills();
    }

    public final LiveData<ScreenInformation<BillManagerScreen>> getScreenTransition() {
        int i = 2 % 2;
        int i2 = h;
        int i3 = i2 + 75;
        f2732d = i3 % 128;
        int i4 = i3 % 2;
        LiveData<ScreenInformation<BillManagerScreen>> liveData = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i5 = i2 + 37;
        f2732d = i5 % 128;
        int i6 = i5 % 2;
        return liveData;
    }

    public final StateFlow<BillManagerCreateState> getCreateBillState() {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 113;
        h = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<BillManagerCreateState> stateFlow = this.getShareableDataState;
        int i5 = i2 + 119;
        h = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<BillAccountsUiState> getBillAccountsUiState() {
        int i = 2 % 2;
        int i2 = h + 3;
        f2732d = i2 % 128;
        if (i2 % 2 == 0) {
            return this.toString;
        }
        throw null;
    }

    public final StateFlow<FrequentBillsUiState> getFrequentBillsUiState() {
        int i = 2 % 2;
        int i2 = f2732d + 39;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            return this.accessartificialFrame;
        }
        throw null;
    }

    public final StateFlow<PopularBillsUiState> getPopularBillsUiState() {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 29;
        h = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<PopularBillsUiState> stateFlow = this.coroutineCreation;
        int i5 = i2 + 27;
        h = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<BillAccountUiModel> getSelectedBillAccountForPay() {
        int i = 2 % 2;
        int i2 = h;
        int i3 = i2 + 43;
        f2732d = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<BillAccountUiModel> stateFlow = this.invoke;
        int i5 = i2 + 17;
        f2732d = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<BillAccountUiModel> getSelectedBillAccountForMore() {
        StateFlow<BillAccountUiModel> stateFlow;
        int i = 2 % 2;
        int i2 = f2732d + 85;
        int i3 = i2 % 128;
        h = i3;
        if (i2 % 2 == 0) {
            stateFlow = this.coroutineBoundary;
            int i4 = 96 / 0;
        } else {
            stateFlow = this.coroutineBoundary;
        }
        int i5 = i3 + 1;
        f2732d = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return stateFlow;
    }

    public final StateFlow<BillSource> getSelectedBillSource() {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 75;
        h = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        StateFlow<BillSource> stateFlow = this.f2733b;
        int i4 = i2 + 121;
        h = i4 % 128;
        if (i4 % 2 != 0) {
            return stateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public final StateFlow<BillAccountUiModel> getBillBeingEdited() {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 13;
        h = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<BillAccountUiModel> stateFlow = this.ArtificialStackFrames;
        int i5 = i2 + 59;
        h = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<Boolean> getDeleteBillLoading() {
        int i = 2 % 2;
        int i2 = f2732d;
        int i3 = i2 + 75;
        h = i3 % 128;
        int i4 = i3 % 2;
        StateFlow<Boolean> stateFlow = this.CoroutineDebuggingKt;
        int i5 = i2 + 37;
        h = i5 % 128;
        int i6 = i5 % 2;
        return stateFlow;
    }

    public final StateFlow<String> getDeleteBillErrorMessage() {
        int i = 2 % 2;
        int i2 = f2732d + 11;
        h = i2 % 128;
        int i3 = i2 % 2;
        StateFlow<String> stateFlow = this.getSponsorBeneficiariesState;
        if (i3 == 0) {
            int i4 = 85 / 0;
        }
        return stateFlow;
    }

    private final void component3(ScreenInformation<BillManagerScreen> screenInformation) {
        int i = 2 % 2;
        int i2 = h + 53;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
        this.copy.setValue(screenInformation);
        if (i3 != 0) {
            throw null;
        }
    }

    public final void clearDeleteBillApiError() {
        int i = 2 % 2;
        int i2 = f2732d + 27;
        h = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.ShareDataUIState.setValue(null);
        } else {
            this.ShareDataUIState.setValue(null);
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreateBillContinue() {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.onCreateBillContinue():void");
    }

    public final void showDashboard() {
        int i = 2 % 2;
        component3(new ScreenInformation<>(BillManagerScreen.Dashboard.INSTANCE, ScreenDirection.BACK));
        int i2 = h + 91;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
    }

    public static void showCreate$default(BillManagerViewModel billManagerViewModel, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        int i3 = h + 27;
        int i4 = i3 % 128;
        f2732d = i4;
        if (i3 % 2 == 0 ? (i & 1) != 0 : (i & 1) != 0) {
            int i5 = i4 + 9;
            h = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        }
        billManagerViewModel.showCreate(z);
    }

    public final void showCreate(boolean shouldClearEditFlow) {
        int i = 2 % 2;
        int i2 = h + 99;
        f2732d = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        if (shouldClearEditFlow) {
            clearEditBillFlow();
        }
        component3(new ScreenInformation<>(BillManagerScreen.Create.INSTANCE, ScreenDirection.FORWARD));
        int i3 = f2732d + 81;
        h = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    public final void showConfirm() {
        int i = 2 % 2;
        component3(new ScreenInformation<>(BillManagerScreen.Confirm.INSTANCE, ScreenDirection.FORWARD));
        int i2 = f2732d + 27;
        h = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void showDoMore() {
        int i = 2 % 2;
        component3(new ScreenInformation<>(BillManagerScreen.DoMore.INSTANCE, ScreenDirection.FORWARD));
        int i2 = f2732d + 5;
        h = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void showDelete() {
        int i = 2 % 2;
        component3(new ScreenInformation<>(BillManagerScreen.Delete.INSTANCE, ScreenDirection.FORWARD));
        int i2 = f2732d + 41;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 92 / 0;
        }
    }

    public final void previousScreen() {
        BillManagerScreen screen;
        BillManagerScreen.Create create;
        int i = 2 % 2;
        ScreenInformation<BillManagerScreen> value = this.copy.getValue();
        if (value != null) {
            int i2 = h + 117;
            f2732d = i2 % 128;
            int i3 = i2 % 2;
            screen = value.getScreen();
        } else {
            screen = null;
        }
        if (screen instanceof BillManagerScreen.Create) {
            create = BillManagerScreen.Dashboard.INSTANCE;
        } else if (!(!(screen instanceof BillManagerScreen.Confirm))) {
            create = BillManagerScreen.Create.INSTANCE;
        } else if (screen instanceof BillManagerScreen.DoMore) {
            int i4 = h + 9;
            f2732d = i4 % 128;
            int i5 = i4 % 2;
            BillManagerScreen.Dashboard dashboard = BillManagerScreen.Dashboard.INSTANCE;
            int i6 = h + 7;
            f2732d = i6 % 128;
            int i7 = i6 % 2;
            create = dashboard;
        } else {
            create = screen instanceof BillManagerScreen.Delete ? BillManagerScreen.Dashboard.INSTANCE : BillManagerScreen.Close.INSTANCE;
        }
        component3(new ScreenInformation<>(create, ScreenDirection.BACK));
    }

    public final void getBillAccounts() {
        BillAccountsUiState value;
        int i = 2 % 2;
        int i2 = h + 15;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<BillAccountsUiState> mutableStateFlow = this.component2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BillAccountsUiState.copy$default(value, true, null, null, 4, null)));
        HaProxyRequest<BillAccountsResponseDto> haProxyRequest = new HaProxyRequest<BillAccountsResponseDto>() {
            private static int component2 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i4 = 2 % 2;
                int i5 = component3;
                int i6 = i5 + 111;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                int i8 = i5 + 119;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    return GsmEndpoints.BILL_MANAGER_GET_BILL_ACCOUNTS;
                }
                throw null;
            }
        };
        haProxyRequest.method(BaseRequest.Method.GET);
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        ImageLoader.INSTANCE.sendRequest(haProxyRequest, new ApiCallback<BillAccountsResponseDto>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(BillAccountsResponseDto billAccountsResponseDto) {
                int i4 = 2 % 2;
                int i5 = component1 + 111;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(billAccountsResponseDto);
                int i7 = component1 + 47;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(BillAccountsResponseDto value2) {
                Object value3;
                BillAccountsUiState billAccountsUiState;
                BillAccountsResponseDto billAccountsResponseDto;
                int i4 = 2 % 2;
                int i5 = component1 + 115;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$get_billAccountsUiState$p = BillManagerViewModel.access$get_billAccountsUiState$p(BillManagerViewModel.this);
                do {
                    value3 = mutableStateFlowAccess$get_billAccountsUiState$p.getValue();
                    billAccountsUiState = (BillAccountsUiState) value3;
                    if (value2 == null) {
                        billAccountsResponseDto = new BillAccountsResponseDto(null, null);
                    } else {
                        int i7 = component1 + 83;
                        ShareDataUIState = i7 % 128;
                        int i8 = i7 % 2;
                        billAccountsResponseDto = value2;
                    }
                } while (!mutableStateFlowAccess$get_billAccountsUiState$p.compareAndSet(value3, billAccountsUiState.copy(false, null, BillManagerDashboardMappersKt.toBillAccountUiModels(billAccountsResponseDto))));
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onError(com.huawei.common.exception.BaseException r11) {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08972.component1
                    int r1 = r1 + 87
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08972.ShareDataUIState = r2
                    int r1 = r1 % r0
                    r2 = 0
                    java.lang.String r3 = ""
                    if (r1 != 0) goto L20
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
                    super.onError(r11)
                    int r1 = r11.getCode()
                    r3 = 5987(0x1763, float:8.39E-42)
                    if (r1 != r3) goto L30
                    goto L2e
                L20:
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r3)
                    super.onError(r11)
                    int r1 = r11.getCode()
                    r3 = 404(0x194, float:5.66E-43)
                    if (r1 != r3) goto L30
                L2e:
                    r0 = 1
                    goto L3a
                L30:
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08972.component1
                    int r1 = r1 + 49
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08972.ShareDataUIState = r3
                    int r1 = r1 % r0
                    r0 = r2
                L3a:
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.this
                    kotlinx.coroutines.flow.MutableStateFlow r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.access$get_billAccountsUiState$p(r1)
                L40:
                    java.lang.Object r3 = r1.getValue()
                    r4 = r3
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState r4 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState) r4
                    if (r0 == 0) goto L53
                    java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
                    r6 = 0
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState r4 = r4.copy(r2, r6, r5)
                    goto L64
                L53:
                    java.lang.String r5 = r11.getMessage()
                    if (r5 != 0) goto L5b
                    java.lang.String r5 = "Failed to load frequent bills"
                L5b:
                    r6 = r5
                    r5 = 0
                    r7 = 0
                    r8 = 4
                    r9 = 0
                    com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState r4 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.BillAccountsUiState.copy$default(r4, r5, r6, r7, r8, r9)
                L64:
                    boolean r3 = r1.compareAndSet(r3, r4)
                    if (r3 == 0) goto L40
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08972.onError(com.huawei.common.exception.BaseException):void");
            }
        });
        int i4 = h + 105;
        f2732d = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void getFrequentBills() {
        FrequentBillsUiState value;
        int i = 2 % 2;
        int i2 = f2732d + 107;
        h = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<FrequentBillsUiState> mutableStateFlow = this.component4;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, FrequentBillsUiState.copy$default(value, true, null, null, 4, null)));
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        HaProxyRequest<FrequentBillsResponseDto> haProxyRequest = new HaProxyRequest<FrequentBillsResponseDto>() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public String getApiPath() {
                int i4 = 2 % 2;
                int i5 = ShareDataUIState;
                int i6 = i5 + 27;
                copydefault = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 59 / 0;
                }
                int i8 = i5 + 23;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    return GsmEndpoints.BILL_MANAGER_GET_FREQUENT_BILLS;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("msisdn", strReplaceFirst$default);
        haProxyRequest.addParams("months", 3);
        haProxyRequest.addParams(TinyAppLogUtil.TINY_APP_STANDARD_CATEGORY, "6");
        haProxyRequest.method(BaseRequest.Method.POST);
        ImageLoader.INSTANCE.sendRequest(haProxyRequest, new ApiCallback<FrequentBillsResponseDto>() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(FrequentBillsResponseDto frequentBillsResponseDto) {
                int i4 = 2 % 2;
                int i5 = component3 + 19;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(frequentBillsResponseDto);
                if (i6 != 0) {
                    int i7 = 96 / 0;
                }
                int i8 = copydefault + 75;
                component3 = i8 % 128;
                int i9 = i8 % 2;
            }

            public void onSuccess2(FrequentBillsResponseDto value2) {
                Object value3;
                FrequentBillsUiState frequentBillsUiState;
                List<BillAccountUiModel> listEmptyList;
                int i4 = 2 % 2;
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$get_frequentBillsUiState$p = BillManagerViewModel.access$get_frequentBillsUiState$p(BillManagerViewModel.this);
                do {
                    value3 = mutableStateFlowAccess$get_frequentBillsUiState$p.getValue();
                    frequentBillsUiState = (FrequentBillsUiState) value3;
                    Object obj = null;
                    if (value2 != null) {
                        listEmptyList = BillManagerDashboardMappersKt.toBillAccountuiModels(value2);
                        int i5 = component3 + 41;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                    } else {
                        listEmptyList = null;
                    }
                    if (listEmptyList == null) {
                        int i7 = component3 + 69;
                        copydefault = i7 % 128;
                        if (i7 % 2 != 0) {
                            CollectionsKt.emptyList();
                            obj.hashCode();
                            throw null;
                        }
                        listEmptyList = CollectionsKt.emptyList();
                    }
                } while (!mutableStateFlowAccess$get_frequentBillsUiState$p.compareAndSet(value3, frequentBillsUiState.copy(false, null, listEmptyList)));
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                FrequentBillsUiState frequentBillsUiStateCopy$default;
                int i4 = 2 % 2;
                int i5 = component3 + 13;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                boolean z = e.getCode() == 404;
                MutableStateFlow mutableStateFlowAccess$get_frequentBillsUiState$p = BillManagerViewModel.access$get_frequentBillsUiState$p(BillManagerViewModel.this);
                int i7 = component3 + 117;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value2 = mutableStateFlowAccess$get_frequentBillsUiState$p.getValue();
                    FrequentBillsUiState frequentBillsUiState = (FrequentBillsUiState) value2;
                    if (z) {
                        int i9 = component3 + 115;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        frequentBillsUiStateCopy$default = frequentBillsUiState.copy(false, null, CollectionsKt.emptyList());
                    } else {
                        String message = e.getMessage();
                        if (message == null) {
                            int i11 = component3 + 125;
                            copydefault = i11 % 128;
                            int i12 = i11 % 2;
                            message = "Failed to load frequent bills";
                        }
                        frequentBillsUiStateCopy$default = FrequentBillsUiState.copy$default(frequentBillsUiState, false, message, null, 4, null);
                    }
                } while (!mutableStateFlowAccess$get_frequentBillsUiState$p.compareAndSet(value2, frequentBillsUiStateCopy$default));
            }
        });
        int i4 = h + 21;
        f2732d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void getPopularBills() {
        PopularBillsUiState value;
        int i = 2 % 2;
        int i2 = f2732d + 37;
        int i3 = i2 % 128;
        h = i3;
        if (i2 % 2 != 0) {
            MutableStateFlow<PopularBillsUiState> mutableStateFlow = this.equals;
            int i4 = i3 + 39;
            f2732d = i4 % 128;
            int i5 = i4 % 2;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PopularBillsUiState.copy$default(value, true, null, null, 4, null)));
            HaProxyRequest<PopularBillResponseDto> haProxyRequest = new HaProxyRequest<PopularBillResponseDto>() {
                private static int component1 = 1;
                private static int component2;

                @Override
                public String getApiPath() {
                    int i6 = 2 % 2;
                    int i7 = component1;
                    int i8 = i7 + 19;
                    component2 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = i7 + 59;
                    component2 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return GsmEndpoints.BILL_MANAGER_GET_POPULAR_BILLS;
                    }
                    throw null;
                }
            };
            haProxyRequest.method(BaseRequest.Method.GET);
            ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
            ImageLoader.INSTANCE.sendRequest(haProxyRequest, new ApiCallback<PopularBillResponseDto>() {
                private static int ShareDataUIState = 1;
                private static int component2;

                @Override
                public void onSuccess(PopularBillResponseDto popularBillResponseDto) {
                    int i6 = 2 % 2;
                    int i7 = component2 + 3;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    onSuccess2(popularBillResponseDto);
                    if (i8 == 0) {
                        int i9 = 93 / 0;
                    }
                    int i10 = ShareDataUIState + 91;
                    component2 = i10 % 128;
                    int i11 = i10 % 2;
                }

                public void onSuccess2(PopularBillResponseDto value2) {
                    MutableStateFlow mutableStateFlowAccess$get_popularBillsUiState$p;
                    Object value3;
                    PopularBillsUiState popularBillsUiState;
                    List<PopularBillDto> listEmptyList;
                    int i6 = 2 % 2;
                    int i7 = ShareDataUIState + 71;
                    component2 = i7 % 128;
                    if (i7 % 2 != 0) {
                        super.onSuccess(value2);
                        mutableStateFlowAccess$get_popularBillsUiState$p = BillManagerViewModel.access$get_popularBillsUiState$p(BillManagerViewModel.this);
                        int i8 = 9 / 0;
                    } else {
                        super.onSuccess(value2);
                        mutableStateFlowAccess$get_popularBillsUiState$p = BillManagerViewModel.access$get_popularBillsUiState$p(BillManagerViewModel.this);
                    }
                    int i9 = ShareDataUIState + 21;
                    component2 = i9 % 128;
                    int i10 = i9 % 2;
                    do {
                        value3 = mutableStateFlowAccess$get_popularBillsUiState$p.getValue();
                        popularBillsUiState = (PopularBillsUiState) value3;
                        if (value2 != null) {
                            int i11 = component2 + 83;
                            ShareDataUIState = i11 % 128;
                            if (i11 % 2 == 0) {
                                BillManagerDashboardMappersKt.toPopularBillsList(value2);
                                throw null;
                            }
                            listEmptyList = BillManagerDashboardMappersKt.toPopularBillsList(value2);
                        } else {
                            listEmptyList = null;
                        }
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt.emptyList();
                            int i12 = ShareDataUIState + 49;
                            component2 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    } while (!mutableStateFlowAccess$get_popularBillsUiState$p.compareAndSet(value3, popularBillsUiState.copy(false, null, listEmptyList)));
                }

                @Override
                public void onError(BaseException e) {
                    Object value2;
                    PopularBillsUiState popularBillsUiState;
                    String message;
                    int i6 = 2 % 2;
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    MutableStateFlow mutableStateFlowAccess$get_popularBillsUiState$p = BillManagerViewModel.access$get_popularBillsUiState$p(BillManagerViewModel.this);
                    int i7 = component2 + 121;
                    ShareDataUIState = i7 % 128;
                    int i8 = i7 % 2;
                    do {
                        value2 = mutableStateFlowAccess$get_popularBillsUiState$p.getValue();
                        popularBillsUiState = (PopularBillsUiState) value2;
                        message = e.getMessage();
                        if (message == null) {
                            int i9 = ShareDataUIState + 15;
                            component2 = i9 % 128;
                            int i10 = i9 % 2;
                            message = "Failed to load popular bills";
                        }
                    } while (!mutableStateFlowAccess$get_popularBillsUiState$p.compareAndSet(value2, PopularBillsUiState.copy$default(popularBillsUiState, false, message, null, 4, null)));
                }
            });
            return;
        }
        throw null;
    }

    public final void createBill() {
        BillManagerCreateState value;
        MutableStateFlow<BillManagerCreateState> mutableStateFlow;
        BillManagerCreateState value2;
        int i = 2 % 2;
        int i2 = h + 105;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            value = this.copydefault.getValue();
            mutableStateFlow = this.copydefault;
            int i3 = 25 / 0;
        } else {
            value = this.copydefault.getValue();
            mutableStateFlow = this.copydefault;
        }
        int i4 = f2732d + 53;
        h = i4 % 128;
        int i5 = i4 % 2;
        do {
            value2 = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value2, BillManagerCreateState.copy$default(value2, null, null, null, null, null, false, new BillManagerCreateErrors(null, null, null, null, 15, null), null, true, 63, null)));
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        HaProxyRequest<Header> haProxyRequest = new HaProxyRequest<Header>() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public String getApiPath() {
                int i6 = 2 % 2;
                int i7 = component3 + 53;
                int i8 = i7 % 128;
                component1 = i8;
                if (i7 % 2 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i9 = i8 + 33;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                return GsmEndpoints.BILL_MANAGER_CREATE_BILL;
            }
        };
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("accountName", StringsKt.trim(value.getBillName()).toString());
        haProxyRequest.addParams("msisdn", strReplaceFirst$default);
        haProxyRequest.addParams("paybillNo", StringsKt.trim(value.getPaybillNumber()).toString());
        haProxyRequest.addParams("accountNo", StringsKt.trim(value.getAccountNumber()).toString());
        haProxyRequest.addParams("dueDate", "");
        haProxyRequest.addParams("reminderEnabled", false);
        haProxyRequest.addParams("reminderFrequency", 1);
        haProxyRequest.addParams("amount", StringsKt.trim(value.getAmount()).toString());
        ImageLoader.INSTANCE.sendRequest(haProxyRequest, new ApiCallback<Header>() {
            private static int component1 = 1;
            private static int copydefault;

            @Override
            public void onSuccess(Header header) {
                int i6 = 2 % 2;
                int i7 = copydefault + 49;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                onSuccess2(header);
                int i9 = copydefault + 39;
                component1 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 74 / 0;
                }
            }

            public void onSuccess2(Header value3) {
                Integer responseCode;
                Object value4;
                String customerMessage;
                Object value5;
                int i6 = 2 % 2;
                int i7 = copydefault + 51;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                super.onSuccess(value3);
                if (value3 != null) {
                    responseCode = value3.getResponseCode();
                } else {
                    int i9 = component1 + 13;
                    copydefault = i9 % 128;
                    int i10 = i9 % 2;
                    responseCode = null;
                }
                if (responseCode == null || new IntRange(200, 299).contains(responseCode.intValue())) {
                    MutableStateFlow mutableStateFlowAccess$get_createBillState$p = BillManagerViewModel.access$get_createBillState$p(BillManagerViewModel.this);
                    do {
                        value4 = mutableStateFlowAccess$get_createBillState$p.getValue();
                    } while (!mutableStateFlowAccess$get_createBillState$p.compareAndSet(value4, BillManagerCreateState.copy$default((BillManagerCreateState) value4, null, null, null, null, null, false, null, null, false, 255, null)));
                    BillManagerViewModel.this.getBillAccounts();
                    BillManagerViewModel.this.showDashboard();
                    return;
                }
                if (value3 == null || (customerMessage = value3.getCustomerMessage()) == null) {
                    String responseMessage = value3 != null ? value3.getResponseMessage() : null;
                    customerMessage = responseMessage == null ? "Unable to create bill" : responseMessage;
                }
                MutableStateFlow mutableStateFlowAccess$get_createBillState$p2 = BillManagerViewModel.access$get_createBillState$p(BillManagerViewModel.this);
                int i11 = copydefault + 125;
                component1 = i11 % 128;
                int i12 = i11 % 2;
                do {
                    value5 = mutableStateFlowAccess$get_createBillState$p2.getValue();
                } while (!mutableStateFlowAccess$get_createBillState$p2.compareAndSet(value5, BillManagerCreateState.copy$default((BillManagerCreateState) value5, null, null, null, null, null, false, null, customerMessage, false, 127, null)));
            }

            @Override
            public void onError(BaseException e) {
                Object value3;
                int i6 = 2 % 2;
                int i7 = component1 + 49;
                copydefault = i7 % 128;
                if (i7 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    e.getResponseDesc();
                    MutableStateFlow mutableStateFlowAccess$get_createBillState$p = BillManagerViewModel.access$get_createBillState$p(BillManagerViewModel.this);
                    do {
                        value3 = mutableStateFlowAccess$get_createBillState$p.getValue();
                    } while (!mutableStateFlowAccess$get_createBillState$p.compareAndSet(value3, BillManagerCreateState.copy$default((BillManagerCreateState) value3, null, null, null, null, null, false, null, e.getResponseDesc(), false, 127, null)));
                    return;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                e.getResponseDesc();
                BillManagerViewModel.access$get_createBillState$p(BillManagerViewModel.this);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
    }

    public final void startEditBillFlow() {
        String merchantName;
        String str;
        int i = 2;
        int i2 = 2 % 2;
        BillAccountUiModel value = this.getAsAtTimestamp.getValue();
        this.component3.setValue(value);
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = this.copydefault;
        while (true) {
            BillManagerCreateState value2 = mutableStateFlow.getValue();
            BillManagerCreateState billManagerCreateState = value2;
            String string = null;
            if (value != null) {
                int i3 = f2732d + 61;
                h = i3 % 128;
                if (i3 % 2 == 0) {
                    value.getMerchantName();
                    throw null;
                }
                merchantName = value.getMerchantName();
            } else {
                merchantName = null;
            }
            if (merchantName == null) {
                merchantName = "";
            }
            String tillNumber = value != null ? value.getTillNumber() : null;
            if (tillNumber == null) {
                int i4 = h + 25;
                f2732d = i4 % 128;
                if (i4 % i != 0) {
                    int i5 = 33 / 0;
                }
                tillNumber = "";
            }
            String accountNumber = value != null ? value.getAccountNumber() : null;
            if (accountNumber == null) {
                accountNumber = "";
            }
            if (value != null) {
                int i6 = f2732d + 83;
                h = i6 % 128;
                int i7 = i6 % 2;
                Float amount = value.getAmount();
                if (amount != null) {
                    string = amount.toString();
                }
            }
            if (string == null) {
                int i8 = f2732d + 7;
                h = i8 % 128;
                int i9 = i8 % i;
                str = "";
            } else {
                str = string;
            }
            if (mutableStateFlow.compareAndSet(value2, BillManagerCreateState.copy$default(billManagerCreateState, merchantName, tillNumber, accountNumber, str, null, false, new BillManagerCreateErrors(null, null, null, null, 15, null), null, false, 304, null))) {
                showCreate(false);
                return;
            }
            i = 2;
        }
    }

    public final void clearEditBillFlow() {
        int i = 2 % 2;
        this.component3.setValue(null);
        this.copydefault.setValue(new BillManagerCreateState(null, null, null, null, null, false, null, null, false, 511, null));
        int i2 = h + 23;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void editBill() {
        BillManagerCreateState value;
        int i = 2 % 2;
        int i2 = f2732d + 73;
        h = i2 % 128;
        int i3 = i2 % 2;
        BillAccountUiModel value2 = this.component3.getValue();
        final String string = null;
        if (value2 == null) {
            int i4 = h + 75;
            f2732d = i4 % 128;
            if (i4 % 2 == 0) {
                createBill();
                return;
            } else {
                createBill();
                string.hashCode();
                throw null;
            }
        }
        String id = value2.getId();
        if (id != null) {
            string = StringsKt.trim(id).toString();
            int i5 = h + 33;
            f2732d = i5 % 128;
            int i6 = i5 % 2;
        }
        if (string == null) {
            string = "";
        }
        HaProxyRequest<Header> haProxyRequest = new HaProxyRequest<Header>() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public String getApiPath() {
                int i7 = 2 % 2;
                String str = "/bill-manager/api/v1/" + string;
                int i8 = component1 + 15;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    return str;
                }
                throw null;
            }
        };
        String string2 = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string2, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string2, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        BillManagerCreateState value3 = this.copydefault.getValue();
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BillManagerCreateState.copy$default(value, null, null, null, null, null, false, new BillManagerCreateErrors(null, null, null, null, 15, null), null, true, 191, null)));
        ExtensionsKt.addMandatoryHeaders$default((HaProxyRequest) haProxyRequest, (String) null, (String) null, false, 7, (Object) null);
        haProxyRequest.addParams("accountName", StringsKt.trim(value3.getBillName()).toString());
        haProxyRequest.addParams("msisdn", strReplaceFirst$default);
        haProxyRequest.addParams("paybillNo", StringsKt.trim(value3.getPaybillNumber()).toString());
        haProxyRequest.addParams("accountNo", StringsKt.trim(value3.getAccountNumber()).toString());
        haProxyRequest.addParams("dueDate", "");
        haProxyRequest.addParams("reminderEnabled", false);
        haProxyRequest.addParams("reminderFrequency", 1);
        haProxyRequest.addParams("amount", StringsKt.trim(value3.getAmount()).toString());
        ImageLoader.INSTANCE.sendRequest(haProxyRequest, new ApiCallback<Header>() {
            private static int component1 = 0;
            private static int component2 = 1;

            @Override
            public void onSuccess(Header header) {
                int i7 = 2 % 2;
                int i8 = component1 + 113;
                component2 = i8 % 128;
                int i9 = i8 % 2;
                onSuccess2(header);
                if (i9 == 0) {
                    int i10 = 2 / 0;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onSuccess2(com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header r15) {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.C08962.onSuccess2(com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.Header):void");
            }

            @Override
            public void onError(BaseException e) {
                Object value4;
                int i7 = 2 % 2;
                int i8 = component2 + 81;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$get_createBillState$p = BillManagerViewModel.access$get_createBillState$p(BillManagerViewModel.this);
                do {
                    value4 = mutableStateFlowAccess$get_createBillState$p.getValue();
                } while (!mutableStateFlowAccess$get_createBillState$p.compareAndSet(value4, BillManagerCreateState.copy$default((BillManagerCreateState) value4, null, null, null, null, null, false, null, e.getMessage(), false, 127, null)));
                int i10 = component1 + 23;
                component2 = i10 % 128;
                if (i10 % 2 == 0) {
                    throw null;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void deleteBill() {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.h = r2
            int r1 = r1 % r0
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel> r1 = r8.getAsAtTimestamp
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel r1 = (com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.model.BillAccountUiModel) r1
            r2 = 0
            if (r1 == 0) goto L3a
            int r3 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d
            int r3 = r3 + 43
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.h = r4
            int r3 = r3 % r0
            java.lang.String r1 = r1.getId()
            if (r1 == 0) goto L3a
            int r3 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d
            int r3 = r3 + 63
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.h = r4
            int r3 = r3 % r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim(r1)
            java.lang.String r1 = r1.toString()
            goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 != 0) goto L5a
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.h
            int r3 = r1 + 73
            int r4 = r3 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L56
            int r1 = r1 + 93
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L53
            r1 = 3
            int r1 = r1 % r0
        L53:
            java.lang.String r1 = ""
            goto L5a
        L56:
            r2.hashCode()
            throw r2
        L5a:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 != 0) goto L83
            int r1 = com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.h
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.f2732d = r2
            int r1 = r1 % r0
            r0 = 0
            if (r1 == 0) goto L76
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r1 = r8.component1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L7c
        L76:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r1 = r8.component1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L7c:
            r1.setValue(r0)
            r8.showDashboard()
            return
        L83:
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> r0 = r8.component1
            r3 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.setValue(r3)
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> r0 = r8.ShareDataUIState
            r0.setValue(r2)
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel$deleteBill$request$1 r0 = new com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel$deleteBill$request$1
            r0.<init>()
            com.huawei.http.BaseRequest$Method r1 = com.huawei.http.BaseRequest.Method.GET
            r0.method(r1)
            r2 = r0
            com.huawei.digitalpayment.consumer.base.util.HaProxyRequest r2 = (com.huawei.digitalpayment.consumer.base.util.HaProxyRequest) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 7
            r7 = 0
            com.huawei.digitalpayment.consumer.base.util.ExtensionsKt.addMandatoryHeaders$default(r2, r3, r4, r5, r6, r7)
            com.huawei.digitalpayment.consumer.base.util.ImageLoader r1 = com.huawei.digitalpayment.consumer.base.util.ImageLoader.INSTANCE
            com.huawei.http.BaseRequest r0 = (com.huawei.http.BaseRequest) r0
            com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel$deleteBill$1 r2 = new com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel$deleteBill$1
            r2.<init>()
            com.huawei.common.listener.ApiCallback r2 = (com.huawei.common.listener.ApiCallback) r2
            r1.sendRequest(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.BillManagerViewModel.deleteBill():void");
    }

    public final void onBillAccountPayClicked(BillAccountUiModel bill) {
        int i = 2 % 2;
        int i2 = h + 125;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(bill, "");
        this.getRequestBeneficiariesState.setValue(bill);
        int i4 = f2732d + 31;
        h = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onBillAccountMoreClicked(BillAccountUiModel bill, BillSource source) {
        int i = 2 % 2;
        int i2 = f2732d + 95;
        h = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(bill, "");
            Intrinsics.checkNotNullParameter(source, "");
            this.getAsAtTimestamp.setValue(bill);
            this.hashCode.setValue(source);
            throw null;
        }
        Intrinsics.checkNotNullParameter(bill, "");
        Intrinsics.checkNotNullParameter(source, "");
        this.getAsAtTimestamp.setValue(bill);
        this.hashCode.setValue(source);
        int i3 = f2732d + 123;
        h = i3 % 128;
        int i4 = i3 % 2;
    }

    public final void clearSelectedBillAccountForPay() {
        int i = 2 % 2;
        int i2 = f2732d + 123;
        h = i2 % 128;
        int i3 = i2 % 2;
        this.getRequestBeneficiariesState.setValue(null);
        int i4 = f2732d + 103;
        h = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }

    public final void clearSelectedBillAccountForMore() {
        int i = 2 % 2;
        int i2 = f2732d + 111;
        h = i2 % 128;
        if (i2 % 2 != 0) {
            this.getAsAtTimestamp.setValue(null);
        } else {
            this.getAsAtTimestamp.setValue(null);
            int i3 = 72 / 0;
        }
    }

    public final void onBillNameChanged(String value) {
        MutableStateFlow<BillManagerCreateState> mutableStateFlow;
        BillManagerCreateState value2;
        BillManagerCreateState billManagerCreateState;
        int i = 2 % 2;
        int i2 = h + 79;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
            int i3 = 76 / 0;
        } else {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
        }
        MutableStateFlow<BillManagerCreateState> mutableStateFlow2 = mutableStateFlow;
        do {
            value2 = mutableStateFlow2.getValue();
            billManagerCreateState = value2;
        } while (!mutableStateFlow2.compareAndSet(value2, BillManagerCreateState.copy$default(billManagerCreateState, value, null, null, null, null, false, BillManagerCreateErrors.copy$default(billManagerCreateState.getErrors(), null, null, null, null, 14, null), null, false, 446, null)));
        int i4 = h + 35;
        f2732d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onPaybillNumberChanged(String value) {
        MutableStateFlow<BillManagerCreateState> mutableStateFlow;
        BillManagerCreateState value2;
        BillManagerCreateState billManagerCreateState;
        int i = 2 % 2;
        int i2 = h + 69;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
            int i3 = 1 / 0;
        } else {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
        }
        MutableStateFlow<BillManagerCreateState> mutableStateFlow2 = mutableStateFlow;
        do {
            value2 = mutableStateFlow2.getValue();
            billManagerCreateState = value2;
        } while (!mutableStateFlow2.compareAndSet(value2, BillManagerCreateState.copy$default(billManagerCreateState, null, value, null, null, null, false, BillManagerCreateErrors.copy$default(billManagerCreateState.getErrors(), null, null, null, null, 13, null), null, false, 397, null)));
        int i4 = f2732d + 35;
        h = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onAccountNumberChanged(String value) {
        BillManagerCreateState value2;
        BillManagerCreateState billManagerCreateState;
        int i = 2 % 2;
        int i2 = h + 83;
        f2732d = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(value, "");
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = this.copydefault;
        do {
            value2 = mutableStateFlow.getValue();
            billManagerCreateState = value2;
        } while (!mutableStateFlow.compareAndSet(value2, BillManagerCreateState.copy$default(billManagerCreateState, null, null, value, null, null, false, BillManagerCreateErrors.copy$default(billManagerCreateState.getErrors(), null, null, null, null, 11, null), null, false, WebSocket.DEFAULT_WSS_PORT, null)));
        int i4 = h + 89;
        f2732d = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onAmountChanged(String value) {
        MutableStateFlow<BillManagerCreateState> mutableStateFlow;
        BillManagerCreateState value2;
        BillManagerCreateState billManagerCreateState;
        int i = 2 % 2;
        int i2 = h + 115;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
            int i3 = 84 / 0;
        } else {
            Intrinsics.checkNotNullParameter(value, "");
            mutableStateFlow = this.copydefault;
        }
        MutableStateFlow<BillManagerCreateState> mutableStateFlow2 = mutableStateFlow;
        do {
            value2 = mutableStateFlow2.getValue();
            billManagerCreateState = value2;
        } while (!mutableStateFlow2.compareAndSet(value2, BillManagerCreateState.copy$default(billManagerCreateState, null, null, null, value, null, false, BillManagerCreateErrors.copy$default(billManagerCreateState.getErrors(), null, null, null, null, 7, null), null, false, 439, null)));
        int i4 = h + 3;
        f2732d = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void setPaybillError(String message) {
        MutableStateFlow<BillManagerCreateState> mutableStateFlow;
        BillManagerCreateState value;
        int i = 2 % 2;
        int i2 = h + 109;
        f2732d = i2 % 128;
        if (i2 % 2 != 0) {
            mutableStateFlow = this.copydefault;
            int i3 = 98 / 0;
        } else {
            mutableStateFlow = this.copydefault;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BillManagerCreateState.copy$default(value, null, null, null, null, message, true, null, null, false, 463, null)));
    }

    public final void setPaybillSuccess(VerifyNumberResp verifyResp) {
        BillManagerCreateState value;
        BillManagerCreateState billManagerCreateState;
        String strCapitalizeNames;
        boolean z;
        String publicName;
        int i = 2 % 2;
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            billManagerCreateState = value;
            String shortCode = null;
            if (verifyResp == null || (publicName = verifyResp.getPublicName()) == null) {
                int i2 = h + 23;
                f2732d = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 3 % 2;
                }
                strCapitalizeNames = null;
            } else {
                strCapitalizeNames = ExtensionMethodsKt.capitalizeNames(publicName);
            }
            if (verifyResp != null) {
                int i4 = f2732d + 95;
                h = i4 % 128;
                if (i4 % 2 == 0) {
                    shortCode = verifyResp.getShortCode();
                    int i5 = 87 / 0;
                } else {
                    shortCode = verifyResp.getShortCode();
                }
            }
            String str = shortCode;
            if (str == null || str.length() == 0) {
                int i6 = f2732d + 119;
                h = i6 % 128;
                int i7 = i6 % 2;
                z = true;
            } else {
                z = false;
            }
        } while (!mutableStateFlow.compareAndSet(value, BillManagerCreateState.copy$default(billManagerCreateState, null, null, null, null, strCapitalizeNames, z, null, null, false, 463, null)));
    }

    public final void clearCreateBillApiError() {
        BillManagerCreateState value;
        int i = 2 % 2;
        int i2 = h + 45;
        int i3 = i2 % 128;
        f2732d = i3;
        int i4 = i2 % 2;
        MutableStateFlow<BillManagerCreateState> mutableStateFlow = this.copydefault;
        int i5 = i3 + 99;
        h = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BillManagerCreateState.copy$default(value, null, null, null, null, null, false, null, null, false, 383, null)));
    }

    static {
        int i = 61 % 2;
    }
}
