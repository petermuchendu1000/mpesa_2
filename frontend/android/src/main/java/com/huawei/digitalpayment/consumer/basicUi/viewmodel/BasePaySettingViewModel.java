package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basicUi.model.IPaySettingModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0012\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/BasePaySettingViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;", "Lcom/huawei/digitalpayment/consumer/basicUi/model/IPaySettingModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PaySettingUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "cleanException", "", "cleanSuccessState", "callback", "com/huawei/digitalpayment/consumer/basicUi/viewmodel/BasePaySettingViewModel$callback$1", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/BasePaySettingViewModel$callback$1;", TraceDebugManager.IdeCommand.REFRESH, "dispatcherOperator", "pin", "", "closeBiometricPay", "openFaceIdPay", "openFingerprintPay", "setOperator", "payOperator", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/PayOperator;", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BasePaySettingViewModel<Model extends IPaySettingModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int component3 = 1;
    private final MutableStateFlow<PaySettingUiState> component1;
    private final Model component2;
    private final BasePaySettingViewModel$callback$1 copydefault;

    public static final MutableStateFlow access$getUiState$p(BasePaySettingViewModel basePaySettingViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 111;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<PaySettingUiState> mutableStateFlow = basePaySettingViewModel.component1;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 111;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public final Model getModel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 19;
        int i3 = i2 % 128;
        component3 = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Model model = this.component2;
        int i4 = i3 + 51;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return model;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [com.huawei.digitalpayment.consumer.basicUi.viewmodel.BasePaySettingViewModel$callback$1] */
    public BasePaySettingViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component2 = model;
        this.component1 = StateFlowKt.MutableStateFlow(new PaySettingUiState(false, null, false, false, false, false, false, null, 255, null));
        this.copydefault = new ApiCallback<BaseResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component1;
            final BasePaySettingViewModel<Model> component3;

            {
                this.component3 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i = 2 % 2;
                int i2 = component1 + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                onSuccess2(baseResp);
                int i4 = component1 + 29;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }

            public void onSuccess2(BaseResp value) {
                Object value2;
                int i = 2 % 2;
                int i2 = component1 + 45;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    super.onSuccess(value);
                    this.component3.refresh();
                    MutableStateFlow mutableStateFlowAccess$getUiState$p = BasePaySettingViewModel.access$getUiState$p(this.component3);
                    do {
                        value2 = mutableStateFlowAccess$getUiState$p.getValue();
                    } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, PaySettingUiState.copy$default((PaySettingUiState) value2, false, null, false, false, false, false, true, null, 191, null)));
                    return;
                }
                super.onSuccess(value);
                this.component3.refresh();
                BasePaySettingViewModel.access$getUiState$p(this.component3);
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                Object value;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 69;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BasePaySettingViewModel.access$getUiState$p(this.component3);
                int i4 = component1 + 47;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                do {
                    value = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value, PaySettingUiState.copy$default((PaySettingUiState) value, false, e, false, false, false, false, false, null, 253, null)));
            }
        };
    }

    public final StateFlow<PaySettingUiState> uiState() {
        int i = 2 % 2;
        int i2 = component3 + 69;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<PaySettingUiState> mutableStateFlow = this.component1;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<PaySettingUiState> mutableStateFlow2 = mutableStateFlow;
        int i4 = component3 + 29;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        return mutableStateFlow2;
    }

    public void dispatcherOperator(String pin) {
        int i = 2 % 2;
        int i2 = component3 + 45;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(pin, "");
        PayOperator operator = this.component1.getValue().getOperator();
        if (operator != null) {
            if (operator == PayOperator.NONE) {
                int i4 = component3 + 85;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    copydefault();
                    return;
                } else {
                    copydefault();
                    int i5 = 75 / 0;
                    return;
                }
            }
            if (operator == PayOperator.FACE_ID) {
                int i6 = ShareDataUIState + 49;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                ShareDataUIState(pin);
                return;
            }
            if (operator == PayOperator.FINGERPRINT) {
                int i8 = component3 + 83;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                copydefault(pin);
            }
        }
    }

    private final void copydefault() {
        int i = 2 % 2;
        int i2 = component3 + 113;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        this.component2.closeBiometricPay(this.copydefault);
        int i4 = ShareDataUIState + 121;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void ShareDataUIState(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 77;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Model model = this.component2;
        if (i3 != 0) {
            model.openFaceIdPay(str, this.copydefault);
        } else {
            model.openFaceIdPay(str, this.copydefault);
            throw null;
        }
    }

    private final void copydefault(String str) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        this.component2.openFingerprintPay(str, this.copydefault);
        int i4 = component3 + 47;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
    }

    public void cleanException() {
        PaySettingUiState value;
        int i = 2 % 2;
        int i2 = component3;
        int i3 = i2 + 17;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<PaySettingUiState> mutableStateFlow = this.component1;
        int i5 = i2 + 75;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PaySettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 253, null)));
    }

    public void cleanSuccessState() {
        PaySettingUiState value;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 3;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<PaySettingUiState> mutableStateFlow = this.component1;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, PaySettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 191, null)));
            int i3 = component3 + 85;
            ShareDataUIState = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void refresh() {
        PaySettingUiState value;
        boolean zIsShowFaceIdPay;
        int i = 2 % 2;
        int i2 = component3 + 43;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        MutableStateFlow<PaySettingUiState> mutableStateFlow = this.component1;
        do {
            value = mutableStateFlow.getValue();
            zIsShowFaceIdPay = this.component2.isShowFaceIdPay();
        } while (!mutableStateFlow.compareAndSet(value, PaySettingUiState.copy$default(value, false, null, this.component2.isShowFingerprintPay(), zIsShowFaceIdPay, this.component2.isOpenFingerprintPay(), this.component2.isOpenFaceIdPay(), false, null, 195, null)));
        int i3 = ShareDataUIState + 3;
        component3 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
    }

    public void setOperator(PayOperator payOperator) {
        MutableStateFlow<PaySettingUiState> mutableStateFlow;
        PaySettingUiState value;
        int i = 2 % 2;
        int i2 = component3 + 37;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(payOperator, "");
            mutableStateFlow = this.component1;
            int i3 = 24 / 0;
        } else {
            Intrinsics.checkNotNullParameter(payOperator, "");
            mutableStateFlow = this.component1;
        }
        int i4 = component3 + 87;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, PaySettingUiState.copy$default(value, false, null, false, false, false, false, false, payOperator, 127, null)));
    }
}
