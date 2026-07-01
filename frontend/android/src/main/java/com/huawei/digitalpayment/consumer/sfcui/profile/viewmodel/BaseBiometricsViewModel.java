package com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.sfcui.profile.model.IBiometricsSettingModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u000f\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BaseBiometricsViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/model/IBiometricsSettingModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsSettingUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "callback", "com/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BaseBiometricsViewModel$callback$1", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BaseBiometricsViewModel$callback$1;", "cleanException", "", "cleanSuccessState", TraceDebugManager.IdeCommand.REFRESH, "dispatcherOperator", "pin", "", "closeBiometricsPay", "openBiometricsPay", "closeBiometricsLogin", "openBiometricsLogin", "setOperator", "biometricsOperator", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsOperator;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseBiometricsViewModel<Model extends IBiometricsSettingModel> extends ViewModel {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int copydefault = 121 % 128;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final MutableStateFlow<BiometricsSettingUiState> ShareDataUIState;
    private final BaseBiometricsViewModel$callback$1 component1;
    private final Model component3;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;

        static {
            int[] iArr = new int[BiometricsOperator.values().length];
            try {
                iArr[BiometricsOperator.OPEN_FINGERPRINT_LOGIN.ordinal()] = 1;
                int i = copydefault + 11;
                ShareDataUIState = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BiometricsOperator.CLOSE_FINGERPRINT_LOGIN.ordinal()] = 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BiometricsOperator.OPEN_FINGERPRINT_PAY.ordinal()] = 3;
                int i5 = copydefault + 43;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 % 2;
                }
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BiometricsOperator.CLOSE_FINGERPRINT_PAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BaseBiometricsViewModel$callback$1] */
    public BaseBiometricsViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component3 = model;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new BiometricsSettingUiState(false, null, false, false, false, false, false, null, 255, null));
        this.component1 = new ApiCallback<BaseResp>(this) {
            private static int component2 = 0;
            private static int copydefault = 1;
            final BaseBiometricsViewModel<Model> component1;

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i = 2 % 2;
                int i2 = component2 + 83;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                onSuccess2(baseResp);
                int i4 = component2 + 59;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onSuccess2(BaseResp value) {
                Object value2;
                int i = 2 % 2;
                int i2 = component2 + 45;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                super.onSuccess(value);
                this.component1.refresh();
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseBiometricsViewModel.access$getUiState$p(this.component1);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, BiometricsSettingUiState.copy$default((BiometricsSettingUiState) value2, false, null, false, false, false, false, true, null, 191, null)));
                int i4 = component2 + 59;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException e) {
                Object value;
                int i = 2 % 2;
                int i2 = copydefault + 57;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseBiometricsViewModel.access$getUiState$p(this.component1);
                do {
                    value = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value, BiometricsSettingUiState.copy$default((BiometricsSettingUiState) value, false, e, false, false, false, false, false, null, 253, null)));
                int i4 = copydefault + 119;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }
        };
    }

    public static final MutableStateFlow access$getUiState$p(BaseBiometricsViewModel baseBiometricsViewModel) {
        int i = 2 % 2;
        int i2 = equals + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = baseBiometricsViewModel.ShareDataUIState;
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return mutableStateFlow;
    }

    public final Model getModel() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.component3;
        int i5 = i2 + 55;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return model;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final StateFlow<BiometricsSettingUiState> uiState() {
        int i = 2 % 2;
        int i2 = equals + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = this.ShareDataUIState;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow2 = mutableStateFlow;
        int i4 = getRequestBeneficiariesState + 81;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 75 / 0;
        }
        return mutableStateFlow2;
    }

    public void dispatcherOperator(String pin) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 65;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        BiometricsOperator operator = this.ShareDataUIState.getValue().getOperator();
        if (operator != null) {
            int i4 = WhenMappings.$EnumSwitchMapping$0[operator.ordinal()];
            if (i4 == 1) {
                ShareDataUIState(pin);
                return;
            }
            int i5 = getRequestBeneficiariesState;
            int i6 = i5 + 113;
            equals = i6 % 128;
            if (i6 % 2 != 0 ? i4 == 2 : i4 == 5) {
                component3();
                return;
            }
            int i7 = i5 + 111;
            int i8 = i7 % 128;
            equals = i8;
            if (i7 % 2 != 0 ? i4 == 3 : i4 == 5) {
                component2(pin);
                return;
            }
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i9 = i8 + 117;
            getRequestBeneficiariesState = i9 % 128;
            if (i9 % 2 == 0) {
                component2();
            } else {
                component2();
                int i10 = 17 / 0;
            }
        }
    }

    private final void component2() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Model model = this.component3;
        if (i3 != 0) {
            model.closeFingerprintPay(this.component1);
            return;
        }
        model.closeFingerprintPay(this.component1);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void component2(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            this.component3.openFingerprintPay(str, this.component1);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.component3.openFingerprintPay(str, this.component1);
        int i3 = getRequestBeneficiariesState + 59;
        equals = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 23;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component3.closeFingerprintLogin(this.component1);
        int i4 = equals + 101;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ShareDataUIState(String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        this.component3.openFingerprintLogin(str, this.component1);
        int i4 = getRequestBeneficiariesState + 45;
        equals = i4 % 128;
        int i5 = i4 % 2;
    }

    public void cleanException() {
        BiometricsSettingUiState value;
        int i = 2 % 2;
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = this.ShareDataUIState;
        int i2 = equals + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BiometricsSettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 253, null)));
        int i4 = getRequestBeneficiariesState + 69;
        equals = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    public void cleanSuccessState() {
        BiometricsSettingUiState value;
        int i = 2 % 2;
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = this.ShareDataUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BiometricsSettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 191, null)));
        int i3 = equals + 37;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    public void refresh() {
        BiometricsSettingUiState value;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 59;
        equals = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = this.ShareDataUIState;
        int i5 = i2 + 121;
        equals = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BiometricsSettingUiState.copy$default(value, false, null, this.component3.isShowFingerprintLogin(), this.component3.isShowFingerprintPay(), this.component3.isOpenFingerprintLogin(), this.component3.isOpenFingerprintPay(), false, null, 195, null)));
        int i7 = equals + 123;
        getRequestBeneficiariesState = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
    }

    public void setOperator(BiometricsOperator biometricsOperator) {
        BiometricsSettingUiState value;
        int i = 2 % 2;
        int i2 = equals + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(biometricsOperator, "");
        MutableStateFlow<BiometricsSettingUiState> mutableStateFlow = this.ShareDataUIState;
        int i4 = equals + 5;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BiometricsSettingUiState.copy$default(value, false, null, false, false, false, false, false, biometricsOperator, 127, null)));
    }

    static {
        if (121 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
