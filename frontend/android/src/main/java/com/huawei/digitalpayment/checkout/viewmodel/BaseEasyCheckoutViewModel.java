package com.huawei.digitalpayment.checkout.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.checkout.model.IEasyCheckoutModel;
import com.huawei.digitalpayment.checkout.model.response.CheckoutResp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/checkout/viewmodel/BaseEasyCheckoutViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;)V", "getModel", "()Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;", "Lcom/huawei/digitalpayment/checkout/model/IEasyCheckoutModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/checkout/viewmodel/EasyCheckoutUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "createPreOrder", "", "params", "", "", "", "CustomerCheckOutModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseEasyCheckoutViewModel<Model extends IEasyCheckoutModel> extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int component2;
    private final Model component3;
    private final MutableStateFlow<EasyCheckoutUiState> copydefault;

    public static final MutableStateFlow access$getUiState$p(BaseEasyCheckoutViewModel baseEasyCheckoutViewModel) {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 13;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = baseEasyCheckoutViewModel.copydefault;
        int i5 = i2 + 31;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = ShareDataUIState;
        int i3 = i2 + 85;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.component3;
        int i5 = i2 + 25;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 25 / 0;
        }
        return model;
    }

    public BaseEasyCheckoutViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component3 = model;
        this.copydefault = StateFlowKt.MutableStateFlow(new EasyCheckoutUiState(false, null, null, 7, null));
    }

    public final StateFlow<EasyCheckoutUiState> uiState() {
        int i = 2 % 2;
        int i2 = component2 + 99;
        ShareDataUIState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(this.copydefault, "");
            throw null;
        }
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = this.copydefault;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow2 = mutableStateFlow;
        int i3 = ShareDataUIState + 59;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 75 / 0;
        }
        return mutableStateFlow2;
    }

    public void createPreOrder(Map<String, ? extends Object> params) {
        EasyCheckoutUiState value;
        int i = 2 % 2;
        int i2 = component2 + 13;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<EasyCheckoutUiState> mutableStateFlow = this.copydefault;
        int i4 = component2 + 95;
        ShareDataUIState = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, EasyCheckoutUiState.copy$default(value, true, null, null, 6, null)));
        this.component3.createPreOrder(params, new ApiCallback<CheckoutResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            final BaseEasyCheckoutViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(CheckoutResp checkoutResp) {
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 37;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                onSuccess2(checkoutResp);
                if (i8 == 0) {
                    int i9 = 4 / 0;
                }
            }

            public void onSuccess2(CheckoutResp value2) {
                Object value3;
                int i6 = 2 % 2;
                int i7 = component2 + 11;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(value2, "");
                    super.onSuccess(value2);
                    BaseEasyCheckoutViewModel.access$getUiState$p(this.copydefault);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseEasyCheckoutViewModel.access$getUiState$p(this.copydefault);
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, EasyCheckoutUiState.copy$default((EasyCheckoutUiState) value3, false, null, value2, 2, null)));
                int i8 = component2 + 57;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 11;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseEasyCheckoutViewModel.access$getUiState$p(this.copydefault);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, EasyCheckoutUiState.copy$default((EasyCheckoutUiState) value2, false, e, null, 4, null)));
                int i9 = component2 + 45;
                ShareDataUIState = i9 % 128;
                int i10 = i9 % 2;
            }
        });
    }
}
