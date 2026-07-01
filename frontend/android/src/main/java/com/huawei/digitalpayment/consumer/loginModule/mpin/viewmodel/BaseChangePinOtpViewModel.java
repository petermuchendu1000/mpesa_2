package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyChangePinSmsResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.IChangePinOtpModel;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.SendOtpParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.request.VerifyChangePinSmsParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseChangePinOtpViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IChangePinOtpModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/ChangePinOtpUiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "sendSms", "", "params", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/SendOtpParams;", "verifySms", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/request/VerifyChangePinSmsParams;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseChangePinOtpViewModel<Model extends IChangePinOtpModel> extends ViewModel {
    private static int component1 = 1;
    private static int component3;
    private final MutableStateFlow<ChangePinOtpUiState> ShareDataUIState;
    private final Model copydefault;

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 35;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.copydefault;
        int i5 = i2 + 49;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseChangePinOtpViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.copydefault = model;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new ChangePinOtpUiState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    protected MutableStateFlow<ChangePinOtpUiState> getUiState() {
        int i = 2 % 2;
        int i2 = component1 + 89;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<ChangePinOtpUiState> mutableStateFlow = this.ShareDataUIState;
        int i5 = i3 + 11;
        component1 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public StateFlow<ChangePinOtpUiState> uiState() {
        int i = 2 % 2;
        int i2 = component3 + 97;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(getUiState(), "");
            throw null;
        }
        MutableStateFlow<ChangePinOtpUiState> uiState = getUiState();
        Intrinsics.checkNotNull(uiState, "");
        return uiState;
    }

    public void sendSms(SendOtpParams params) {
        ChangePinOtpUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component3 + 31;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(params, "");
            getUiState();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<ChangePinOtpUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, ChangePinOtpUiState.copy$default(value, resourceLoading, null, 2, null)));
        getModel().sendSms(params, new ApiCallback<BaseResp>(this) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final BaseChangePinOtpViewModel<Model> component1;

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i3 = 2 % 2;
                int i4 = component3 + 67;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(baseResp);
                if (i5 != 0) {
                    int i6 = 4 / 0;
                }
            }

            public void onSuccess2(BaseResp value2) {
                ChangePinOtpUiState value3;
                Resource resourceSuccess;
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 107;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    MutableStateFlow<ChangePinOtpUiState> uiState2 = this.component1.getUiState();
                    int i5 = component3 + 27;
                    ShareDataUIState = i5 % 128;
                    int i6 = i5 % 2;
                    do {
                        value3 = uiState2.getValue();
                        resourceSuccess = Resource.success(value2);
                        Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    } while (!uiState2.compareAndSet(value3, ChangePinOtpUiState.copy$default(value3, resourceSuccess, null, 2, null)));
                    return;
                }
                this.component1.getUiState();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                ChangePinOtpUiState value2;
                Resource resourceError;
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 83;
                component3 = i4 % 128;
                Object obj = null;
                if (i4 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    this.component1.getUiState();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<ChangePinOtpUiState> uiState2 = this.component1.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, ChangePinOtpUiState.copy$default(value2, resourceError, null, 2, null)));
                int i5 = ShareDataUIState + 11;
                component3 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 16 / 0;
                }
            }
        });
    }

    public void verifySms(VerifyChangePinSmsParams params) {
        ChangePinOtpUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 73;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<ChangePinOtpUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, ChangePinOtpUiState.copy$default(value, null, resourceLoading, 1, null)));
        getModel().verifySms(params, new ApiCallback<VerifyChangePinSmsResp>(this) {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final BaseChangePinOtpViewModel<Model> component3;

            {
                this.component3 = this;
            }

            @Override
            public void onSuccess(VerifyChangePinSmsResp verifyChangePinSmsResp) {
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 79;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(verifyChangePinSmsResp);
                int i7 = copydefault + 61;
                ShareDataUIState = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(VerifyChangePinSmsResp value2) {
                ChangePinOtpUiState value3;
                Resource resourceSuccess;
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 107;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                MutableStateFlow<ChangePinOtpUiState> uiState2 = this.component3.getUiState();
                int i7 = ShareDataUIState + 1;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, ChangePinOtpUiState.copy$default(value3, null, resourceSuccess, 1, null)));
            }

            @Override
            public void onError(BaseException e) {
                ChangePinOtpUiState value2;
                Resource resourceError;
                int i4 = 2 % 2;
                int i5 = copydefault + 79;
                ShareDataUIState = i5 % 128;
                Object obj = null;
                if (i5 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    this.component3.getUiState();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<ChangePinOtpUiState> uiState2 = this.component3.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, ChangePinOtpUiState.copy$default(value2, null, resourceError, 1, null)));
                int i6 = copydefault + 123;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i4 = component3 + 45;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 86 / 0;
        }
    }
}
