package com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.log.ConnectionLog;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.util.SfcPhoneNumberUtil;
import com.huawei.digitalpayment.consumer.baselib.util.DialogUtils;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectSubscribePayload;
import com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenData;
import com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.commons.SfcTransactionCompletionActivity;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.sendmany.SendManyConstant;
import com.huawei.digitalpayment.consumer.sfcui.utils.PinValidationType;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u0011H\u0016J\"\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u0018\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001fH\u0002J\b\u0010+\u001a\u00020\u0011H\u0002J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectConfirmFragment;", "Lcom/safaricom/sharedui/compose/fragment/SfcComposeFragment;", "<init>", "()V", "familyConnectViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "getFamilyConnectViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectViewModel;", "familyConnectViewModel$delegate", "Lkotlin/Lazy;", "confirmationData", "Lcom/huawei/digitalpayment/consumer/sfcui/commons/GsmConfirmationScreenData;", "bundleData", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBundleData;", "flowType", "", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "observeViewModel", "handlePurchaseSuccess", ConnectionLog.CONN_LOG_STATE_RESPONSE, "", "handlePurchaseError", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;", "navigateToTransactionCompletion", Keys.KEY_IS_SUCCESS, "", "message", "handleBackAction", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "renderContent", "title", GriverMonitorConstants.KEY_IS_LOADING, "handleConfirmation", "purchaseFamilyConnectBundle", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FamilyConnectConfirmFragment extends Hilt_FamilyConnectConfirmFragment {
    public static final String EXTRA_BUNDLE_DATA = "extra_bundle_data";
    public static final String EXTRA_CONFIRMATION_DATA = "extra_confirmation_data";
    public static final String EXTRA_FLOW_TYPE = "extra_flow_type";
    public static final String EXTRA_SCREEN_TITLE = "extra_screen_title";
    public static final String FLOW_TYPE_FAMILY_CONNECT = "family_connect";
    private static final int component3 = 100;
    private static int component4 = 1;
    private static int copy = 1;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private final Lazy ShareDataUIState;
    private String component1;
    private FamilyConnectBundleData component2;
    private GsmConfirmationScreenData copydefault;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component2 = 0;
        private static int component3 = 1;
        private final Function1 component1;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component1 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 125;
            component3 = i2 % 128;
            boolean z = true;
            if (i2 % 2 == 0) {
                if (!(obj instanceof Observer)) {
                    return true;
                }
            } else {
                if (!(obj instanceof Observer)) {
                    return false;
                }
                z = false;
            }
            if (!(obj instanceof FunctionAdapter)) {
                return z;
            }
            boolean zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            int i3 = component2 + 13;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return zAreEqual;
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component3;
            int i3 = i2 + 71;
            component2 = i3 % 128;
            int i4 = i3 % 2;
            Function1 function1 = this.component1;
            int i5 = i2 + 103;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return function1;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component3 + 55;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component3 + 81;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                this.component1.invoke(obj);
                int i3 = 43 / 0;
            } else {
                this.component1.invoke(obj);
            }
            int i4 = component3 + 1;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    public static final FamilyConnectViewModel access$getFamilyConnectViewModel(FamilyConnectConfirmFragment familyConnectConfirmFragment) {
        int i = 2 % 2;
        int i2 = copy + 19;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        FamilyConnectViewModel familyConnectViewModelComponent1 = familyConnectConfirmFragment.component1();
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        return familyConnectViewModelComponent1;
    }

    public static final void access$handleConfirmation(FamilyConnectConfirmFragment familyConnectConfirmFragment) {
        int i = 2 % 2;
        int i2 = copy + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        familyConnectConfirmFragment.copydefault();
        int i4 = copy + 13;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 92 / 0;
        }
    }

    public FamilyConnectConfirmFragment() {
        final FamilyConnectConfirmFragment familyConnectConfirmFragment = this;
        final Function0 function0 = null;
        this.ShareDataUIState = FragmentViewModelLazyKt.createViewModelLazy(familyConnectConfirmFragment, Reflection.getOrCreateKotlinClass(FamilyConnectViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 53;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component2 + 57;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 17 / 0;
                }
                return viewModelStoreInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component2 + 9;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = familyConnectConfirmFragment.requireActivity().getViewModelStore();
                if (i3 == 0) {
                    int i4 = 89 / 0;
                }
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 47;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return invoke();
                }
                invoke();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.component2
                    int r2 = r1 + 63
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.ShareDataUIState = r3
                    int r2 = r2 % r0
                    kotlin.jvm.functions.Function0 r2 = r1
                    if (r2 == 0) goto L1f
                    int r1 = r1 + 93
                    int r3 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.ShareDataUIState = r3
                    int r1 = r1 % r0
                    java.lang.Object r1 = r2.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L29
                L1f:
                    androidx.fragment.app.Fragment r1 = r2
                    androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                L29:
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.component2
                    int r2 = r2 + 23
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.ShareDataUIState = r3
                    int r2 = r2 % r0
                    if (r2 != 0) goto L35
                    return r1
                L35:
                    r0 = 0
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment$special$$inlined$activityViewModels$default$2.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 59;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i3 = ShareDataUIState + 87;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 103;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = familyConnectConfirmFragment.requireActivity().getDefaultViewModelProviderFactory();
                int i4 = ShareDataUIState + 57;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectConfirmFragment$Companion;", "", "<init>", "()V", "EXTRA_CONFIRMATION_DATA", "", "EXTRA_SCREEN_TITLE", "EXTRA_BUNDLE_DATA", "EXTRA_FLOW_TYPE", "FLOW_TYPE_FAMILY_CONNECT", "REQUEST_CODE_TRANSACTION_COMPLETION", "", "newInstance", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/FamilyConnectConfirmFragment;", "confirmationData", "Lcom/huawei/digitalpayment/consumer/sfcui/commons/GsmConfirmationScreenData;", "title", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/familyconnect/model/FamilyConnectBundleData;", "flowType", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int ShareDataUIState = 1;
        private static int component3;

        private Companion() {
        }

        public final FamilyConnectConfirmFragment newInstance(GsmConfirmationScreenData confirmationData, String title, FamilyConnectBundleData data, String flowType) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(confirmationData, "");
            Intrinsics.checkNotNullParameter(title, "");
            Intrinsics.checkNotNullParameter(data, "");
            Intrinsics.checkNotNullParameter(flowType, "");
            FamilyConnectConfirmFragment familyConnectConfirmFragment = new FamilyConnectConfirmFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(FamilyConnectConfirmFragment.EXTRA_CONFIRMATION_DATA, confirmationData);
            bundle.putParcelable(FamilyConnectConfirmFragment.EXTRA_BUNDLE_DATA, data);
            bundle.putString(FamilyConnectConfirmFragment.EXTRA_SCREEN_TITLE, title);
            bundle.putString(FamilyConnectConfirmFragment.EXTRA_FLOW_TYPE, flowType);
            familyConnectConfirmFragment.setArguments(bundle);
            int i2 = ShareDataUIState + 23;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return familyConnectConfirmFragment;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final FamilyConnectViewModel component1() {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        FamilyConnectViewModel familyConnectViewModel = (FamilyConnectViewModel) this.ShareDataUIState.getValue();
        int i3 = getRequestBeneficiariesState + 33;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            return familyConnectViewModel;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            super.onViewCreated(r5, r6)
            android.os.Bundle r5 = r4.getArguments()
            r6 = 0
            if (r5 == 0) goto L1b
            java.lang.String r1 = "extra_confirmation_data"
            android.os.Parcelable r5 = r5.getParcelable(r1)
            com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenData r5 = (com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenData) r5
            goto L2a
        L1b:
            int r5 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState
            int r5 = r5 + 47
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L29
            r5 = 2
            int r5 = r5 % 3
        L29:
            r5 = r6
        L2a:
            r4.copydefault = r5
            android.os.Bundle r5 = r4.getArguments()
            r1 = 0
            if (r5 == 0) goto L50
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState
            int r2 = r2 + 41
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy = r3
            int r2 = r2 % r0
            java.lang.String r3 = "extra_bundle_data"
            if (r2 != 0) goto L49
            android.os.Parcelable r5 = r5.getParcelable(r3)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData) r5
            r2 = 3
            int r2 = r2 / r1
            goto L51
        L49:
            android.os.Parcelable r5 = r5.getParcelable(r3)
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData r5 = (com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.model.FamilyConnectBundleData) r5
            goto L51
        L50:
            r5 = r6
        L51:
            r4.component2 = r5
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L6f
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy = r3
            int r2 = r2 % r0
            java.lang.String r3 = "extra_flow_type"
            if (r2 == 0) goto L6b
            java.lang.String r5 = r5.getString(r3)
            goto L70
        L6b:
            r5.getString(r3)
            throw r6
        L6f:
            r5 = r6
        L70:
            r4.component1 = r5
            android.os.Bundle r5 = r4.getArguments()
            if (r5 == 0) goto L93
            int r2 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy
            int r2 = r2 + 39
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState = r3
            int r2 = r2 % r0
            java.lang.String r0 = "extra_screen_title"
            if (r2 != 0) goto L8c
            java.lang.String r5 = r5.getString(r0)
            if (r5 != 0) goto L95
            goto L93
        L8c:
            r5.getString(r0)
            r6.hashCode()
            throw r6
        L93:
            java.lang.String r5 = "Confirm"
        L95:
            r4.ShareDataUIState()
            r4.component2(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        component1().getPurchaseData().observe(getViewLifecycleOwner(), new component2(new Function1() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component1 + 123;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                FamilyConnectConfirmFragment familyConnectConfirmFragment = this.f$0;
                Resource resource = (Resource) obj;
                if (i4 == 0) {
                    return FamilyConnectConfirmFragment.m11289$r8$lambda$dHhmNFA_aXO3SbHopPmLhFs3k8(familyConnectConfirmFragment, resource);
                }
                FamilyConnectConfirmFragment.m11289$r8$lambda$dHhmNFA_aXO3SbHopPmLhFs3k8(familyConnectConfirmFragment, resource);
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        }));
        int i2 = copy + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit copydefault(com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment r3, com.huawei.payment.mvvm.Resource r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L1e
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            boolean r1 = r4.success()
            r2 = 44
            int r2 = r2 / 0
            if (r1 == 0) goto L36
            goto L27
        L1e:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
            boolean r1 = r4.success()
            if (r1 == 0) goto L36
        L27:
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r0)
            java.lang.Object r4 = r4.getData()
            r3.component1(r4)
            goto L61
        L36:
            boolean r1 = r4.error()
            if (r1 == 0) goto L54
            int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copy
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r0)
            com.huawei.common.exception.BaseException r4 = r4.getException()
            r3.component3(r4)
            goto L61
        L54:
            boolean r4 = r4.loading()
            if (r4 == 0) goto L61
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r3)
        L61:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment.copydefault(com.huawei.digitalpayment.consumer.sfcui.buybundles.familyconnect.FamilyConnectConfirmFragment, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void component1(Object obj) {
        Integer numValueOf;
        boolean z;
        int i = 2 % 2;
        try {
            Gson gson = new Gson();
            Object objFromJson = gson.fromJson(gson.toJson(obj), new TypeToken<Map<String, ? extends Object>>() {
            }.getType());
            Intrinsics.checkNotNullExpressionValue(objFromJson, "");
            Object obj2 = ((Map) objFromJson).get("header");
            String str = null;
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            Object obj3 = map != null ? map.get("responseCode") : null;
            Number number = obj3 instanceof Number ? (Number) obj3 : null;
            if (number != null) {
                int i2 = copy + 33;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    Integer.valueOf(number.intValue());
                    throw null;
                }
                numValueOf = Integer.valueOf(number.intValue());
            } else {
                numValueOf = null;
            }
            Object obj4 = map != null ? map.get(Keys.KEY_CUSTOMER_MESSAGE) : null;
            if (obj4 instanceof String) {
                str = (String) obj4;
                int i3 = copy + 3;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
            }
            if (str == null) {
                DialogUtils.hideLoading(requireActivity());
                int i5 = getRequestBeneficiariesState + 99;
                copy = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            if (numValueOf != null && numValueOf.intValue() == 200) {
                int i7 = copy + 89;
                getRequestBeneficiariesState = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            copydefault(z, str);
        } catch (Exception unused) {
            DialogUtils.hideLoading(requireActivity());
        }
    }

    private final void component3(BaseException baseException) {
        String message;
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (baseException == null || (message = baseException.getMessage()) == null) {
            DialogUtils.hideLoading(requireActivity());
            return;
        }
        int i3 = getRequestBeneficiariesState + 63;
        copy = i3 % 128;
        int i4 = i3 % 2;
        copydefault(false, message);
    }

    private final void copydefault(boolean z, String str) {
        String str2;
        int i = 2 % 2;
        Intent intent = new Intent(requireActivity(), (Class<?>) SfcTransactionCompletionActivity.class);
        intent.putExtra("extra_is_success", z);
        intent.putExtra("extra_message", str);
        if (!z) {
            str2 = SendManyConstant.SEND_STATUS_FAILED;
            int i2 = copy + 109;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = getRequestBeneficiariesState + 103;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            str2 = "Success";
        }
        intent.putExtra("extra_title", str2);
        intent.putExtra(SfcTransactionCompletionActivity.EXTRA_RETRY_ENABLED, !z);
        startActivityForResult(intent, 100);
    }

    @Override
    public void handleBackAction() {
        int i = 2 % 2;
        int i2 = copy + 113;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component1().previousScreen();
        int i4 = getRequestBeneficiariesState + 17;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode != 93) {
                return;
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
            if (requestCode != 100) {
                return;
            }
        }
        if (resultCode == -1) {
            FamilyConnectViewModel.showDashboard$default(component1(), null, 1, null);
            return;
        }
        int i3 = copy + 57;
        int i4 = i3 % 128;
        getRequestBeneficiariesState = i4;
        int i5 = i3 % 2;
        if (resultCode != 0) {
            int i6 = i4 + 125;
            copy = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        component2("Confirm", false);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Function2<Composer, Integer, Unit> {
        private static int component3 = 0;
        private static int getRequestBeneficiariesState = 1;
        final GsmConfirmationScreenData ShareDataUIState;
        final boolean component1;
        final String copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 0;
            private static int copy = 1;
            final FamilyConnectConfirmFragment ShareDataUIState;
            final String component1;
            final GsmConfirmationScreenData component3;
            final boolean copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 95;
                copy = i2 % 128;
                int i3 = i2 % 2;
                component2(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copy + 95;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component2(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = copy;
                int i4 = i3 + 23;
                component2 = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0 && (i & 11) == 2) {
                    int i5 = i3 + 65;
                    component2 = i5 % 128;
                    if (i5 % 2 != 0) {
                        composer.getSkipping();
                        obj.hashCode();
                        throw null;
                    }
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                }
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState);
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), WindowInsetsKt.asPaddingValues(WindowInsetsKt.m1239onlybOOhFvg(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m1267getTopJoeWqyM()), composer, 0));
                String str = this.component1;
                GsmConfirmationScreenData gsmConfirmationScreenData = this.component3;
                boolean z = this.copydefault;
                final FamilyConnectConfirmFragment familyConnectConfirmFragment = this.ShareDataUIState;
                GsmConfirmationScreenKt.m11403GsmConfirmationScreencEmTA8(str, gsmConfirmationScreenData, modifierPadding, z, "Confirm", null, new Function0() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component1 + 29;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitComponent2 = FamilyConnectConfirmFragment.component3.AnonymousClass4.component2(familyConnectConfirmFragment);
                        int i9 = copydefault + 51;
                        component1 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent2;
                    }
                }, anonymousClass3, composer, 24640, 32);
                int i6 = component2 + 79;
                copy = i6 % 128;
                int i7 = i6 % 2;
            }

            private static final void ShareDataUIState(FamilyConnectConfirmFragment familyConnectConfirmFragment) {
                int i = 2 % 2;
                int i2 = component2 + 103;
                copy = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectConfirmFragment, "");
                FamilyConnectConfirmFragment.access$handleConfirmation(familyConnectConfirmFragment);
                int i4 = component2 + 9;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int component2 = 0;
                private static int copydefault = 1;

                public final void copydefault() {
                    int i = 2 % 2;
                    int i2 = component2 + 45;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    FamilyConnectConfirmFragment familyConnectConfirmFragment = (FamilyConnectConfirmFragment) this.receiver;
                    if (i3 != 0) {
                        familyConnectConfirmFragment.handleBackAction();
                        return;
                    }
                    familyConnectConfirmFragment.handleBackAction();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = component2 + 35;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault();
                    if (i3 == 0) {
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    int i4 = component2 + 49;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit2;
                    }
                    throw null;
                }

                AnonymousClass3(Object obj) {
                    super(0, obj, FamilyConnectConfirmFragment.class, "handleBackAction", "handleBackAction()V", 0);
                }
            }

            private static final Unit component3(final FamilyConnectConfirmFragment familyConnectConfirmFragment) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(familyConnectConfirmFragment, "");
                FamilyConnectConfirmFragment.access$getFamilyConnectViewModel(familyConnectConfirmFragment).showPinScreen(PinValidationType.MPESA_PIN, new Runnable() {
                    private static int ShareDataUIState = 0;
                    private static int component1 = 1;

                    @Override
                    public final void run() {
                        int i2 = 2 % 2;
                        int i3 = ShareDataUIState + 89;
                        component1 = i3 % 128;
                        Object obj = null;
                        if (i3 % 2 == 0) {
                            FamilyConnectConfirmFragment.component3.AnonymousClass4.component1(familyConnectConfirmFragment);
                            throw null;
                        }
                        FamilyConnectConfirmFragment.component3.AnonymousClass4.component1(familyConnectConfirmFragment);
                        int i4 = component1 + 7;
                        ShareDataUIState = i4 % 128;
                        if (i4 % 2 == 0) {
                            return;
                        }
                        obj.hashCode();
                        throw null;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 71;
                copy = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            public static Unit component2(FamilyConnectConfirmFragment familyConnectConfirmFragment) {
                int i = 2 % 2;
                int i2 = component2 + 61;
                copy = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    component3(familyConnectConfirmFragment);
                    throw null;
                }
                Unit unitComponent3 = component3(familyConnectConfirmFragment);
                int i3 = copy + 111;
                component2 = i3 % 128;
                if (i3 % 2 == 0) {
                    return unitComponent3;
                }
                obj.hashCode();
                throw null;
            }

            public static void component1(FamilyConnectConfirmFragment familyConnectConfirmFragment) {
                int i = 2 % 2;
                int i2 = copy + 115;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(familyConnectConfirmFragment);
                int i4 = copy + 99;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }

            AnonymousClass4(FamilyConnectConfirmFragment familyConnectConfirmFragment, String str, GsmConfirmationScreenData gsmConfirmationScreenData, boolean z) {
                this.ShareDataUIState = familyConnectConfirmFragment;
                this.component1 = str;
                this.component3 = gsmConfirmationScreenData;
                this.copydefault = z;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 121;
            component3 = i2 % 128;
            Composer composer2 = composer;
            Integer num2 = num;
            if (i2 % 2 == 0) {
                component1(composer2, num2.intValue());
                return Unit.INSTANCE;
            }
            component1(composer2, num2.intValue());
            int i3 = 58 / 0;
            return Unit.INSTANCE;
        }

        public final void component1(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = component3 + 9;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-713260381, true, new AnonymousClass4(FamilyConnectConfirmFragment.this, this.copydefault, this.ShareDataUIState, this.component1), composer, 54), composer, 1572864, 63);
            int i5 = getRequestBeneficiariesState + 95;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }

        component3(String str, GsmConfirmationScreenData gsmConfirmationScreenData, boolean z) {
            this.copydefault = str;
            this.ShareDataUIState = gsmConfirmationScreenData;
            this.component1 = z;
        }
    }

    private final void component2(String str, boolean z) {
        int i = 2 % 2;
        int i2 = copy + 109;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            GsmConfirmationScreenData gsmConfirmationScreenData = this.copydefault;
            if (gsmConfirmationScreenData != null) {
                getBinding().getRoot().setContent(ComposableLambdaKt.composableLambdaInstance(-929577114, true, new component3(str, gsmConfirmationScreenData, z)));
                int i3 = getRequestBeneficiariesState + 87;
                copy = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        throw null;
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 82 / 0;
            if (!Intrinsics.areEqual(this.component1, FLOW_TYPE_FAMILY_CONNECT)) {
                return;
            }
        } else if (!Intrinsics.areEqual(this.component1, FLOW_TYPE_FAMILY_CONNECT)) {
            return;
        }
        int i4 = copy + 57;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        FamilyConnectBundleData familyConnectBundleData = this.component2;
        if (familyConnectBundleData != null) {
            component1(familyConnectBundleData);
        }
    }

    private final void component1(FamilyConnectBundleData familyConnectBundleData) {
        int i = 2 % 2;
        String string = SPUtils.getInstance().getString("recent_login_phone_number");
        Intrinsics.checkNotNullExpressionValue(string, "");
        String strReplaceFirst$default = StringsKt.replaceFirst$default(string, SfcPhoneNumberUtil.INSTANCE.getCountryCode(), "", false, 4, (Object) null);
        component1().familyConnectSubscribe(new FamilyConnectSubscribePayload(String.valueOf((int) familyConnectBundleData.getAmount()), familyConnectBundleData.getId(), "airtime", strReplaceFirst$default));
        int i2 = getRequestBeneficiariesState + 5;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Unit m11289$r8$lambda$dHhmNFA_aXO3SbHopPmLhFs3k8(FamilyConnectConfirmFragment familyConnectConfirmFragment, Resource resource) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 117;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(familyConnectConfirmFragment, resource);
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        int i5 = getRequestBeneficiariesState + 17;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            return unitCopydefault;
        }
        throw null;
    }

    static {
        int i = getAsAtTimestamp + 43;
        component4 = i % 128;
        int i2 = i % 2;
    }
}
