package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.ariver.kernel.RVEvents;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifySecurityQuestionResp;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.ISecurityQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.auto;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onViewDetachedFromWindow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u001aH\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseVerifySecurityQuestionViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/ISecurityQuestionModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifySecretUiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "queryQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "selectQuestion", "item", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifySecurityQuestionParams;", "resetPin", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ReSetPinParams;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseVerifySecurityQuestionViewModel<Model extends ISecurityQuestionModel> extends ViewModel {
    private static int component1 = 0;
    private static int component3 = 1;
    private final Model ShareDataUIState;
    private final MutableStateFlow<VerifySecretUiState> component2;

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = component3 + 45;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        Model model = this.ShareDataUIState;
        int i5 = i3 + 119;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    public BaseVerifySecurityQuestionViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.ShareDataUIState = model;
        this.component2 = StateFlowKt.MutableStateFlow(new VerifySecretUiState(null, null, null, null, 15, null));
    }

    protected MutableStateFlow<VerifySecretUiState> getUiState() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<VerifySecretUiState> mutableStateFlow = this.component2;
        int i5 = i2 + 107;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public StateFlow<VerifySecretUiState> uiState() {
        int i = 2 % 2;
        int i2 = component1 + 15;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<VerifySecretUiState> uiState = getUiState();
            Intrinsics.checkNotNull(uiState, "");
            return uiState;
        }
        MutableStateFlow<VerifySecretUiState> uiState2 = getUiState();
        Intrinsics.checkNotNull(uiState2, "");
        int i3 = 84 / 0;
        return uiState2;
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0018\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseVerifySecurityQuestionViewModel$queryQuestions$2", "Lcom/huawei/common/listener/ApiCallback;", "", "Lcom/huawei/digitalpayment/consumer/loginModule/register/data/LocalQuestionItem;", "onSuccess", "", "value", RVEvents.EMBED_WEBVIEW_LOAD_ERROR_EVENT, "e", "Lcom/huawei/common/exception/BaseException;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass2 implements ApiCallback<List<? extends LocalQuestionItem>> {
        private static int ShareDataUIState = 1;
        private static int component1;
        final BaseVerifySecurityQuestionViewModel<Model> component3;

        AnonymousClass2(BaseVerifySecurityQuestionViewModel<Model> baseVerifySecurityQuestionViewModel) {
            this.component3 = baseVerifySecurityQuestionViewModel;
        }

        @Override
        public void onSuccess(List<? extends LocalQuestionItem> list) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            onSuccess2((List<LocalQuestionItem>) list);
            int i4 = component1 + 89;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public void onSuccess2(List<LocalQuestionItem> value) {
            VerifySecretUiState value2;
            Resource resourceSuccess;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 91;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            MutableStateFlow<VerifySecretUiState> uiState = this.component3.getUiState();
            int i4 = ShareDataUIState + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            do {
                value2 = uiState.getValue();
                resourceSuccess = Resource.success(value);
                Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
            } while (!uiState.compareAndSet(value2, VerifySecretUiState.copy$default(value2, resourceSuccess, null, null, null, 14, null)));
        }

        @Override
        public void onError(BaseException e) {
            VerifySecretUiState value;
            Resource resourceError;
            int i = 2 % 2;
            int i2 = ShareDataUIState + 103;
            component1 = i2 % 128;
            Object obj = null;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(e, "");
                this.component3.getUiState();
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(e, "");
            MutableStateFlow<VerifySecretUiState> uiState = this.component3.getUiState();
            do {
                value = uiState.getValue();
                resourceError = Resource.error(e, null);
                Intrinsics.checkNotNullExpressionValue(resourceError, "");
            } while (!uiState.compareAndSet(value, VerifySecretUiState.copy$default(value, resourceError, null, null, null, 14, null)));
            int i3 = ShareDataUIState + 99;
            component1 = i3 % 128;
            int i4 = i3 % 2;
        }

        public static void ShareDataUIState() {
            auto.ShareDataUIState[0] = onViewDetachedFromWindow.ShareDataUIState[0];
        }
    }

    public void queryQuestions(BaseRequestParams params) {
        VerifySecretUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<VerifySecretUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifySecretUiState.copy$default(value, resourceLoading, null, null, null, 14, null)));
        getModel().getQuestions(params, new AnonymousClass2(this));
        int i4 = component3 + 95;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
    }

    public void verifyQuestion(VerifySecurityQuestionParams params) {
        VerifySecretUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 99;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(params, "");
            getUiState();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<VerifySecretUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifySecretUiState.copy$default(value, null, null, resourceLoading, null, 11, null)));
        getModel().verifyQuestion(params, new ApiCallback<VerifySecurityQuestionResp>(this) {
            private static int component1 = 1;
            private static int copydefault;
            final BaseVerifySecurityQuestionViewModel<Model> component2;

            {
                this.component2 = this;
            }

            @Override
            public void onSuccess(VerifySecurityQuestionResp verifySecurityQuestionResp) {
                int i3 = 2 % 2;
                int i4 = copydefault + 89;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(verifySecurityQuestionResp);
                int i6 = component1 + 107;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 60 / 0;
                }
            }

            public void onSuccess2(VerifySecurityQuestionResp value2) {
                VerifySecretUiState value3;
                Resource resourceSuccess;
                int i3 = 2 % 2;
                int i4 = copydefault + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                MutableStateFlow<VerifySecretUiState> uiState2 = this.component2.getUiState();
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, VerifySecretUiState.copy$default(value3, null, null, resourceSuccess, null, 11, null)));
                int i6 = component1 + 77;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }

            @Override
            public void onError(BaseException e) {
                MutableStateFlow<VerifySecretUiState> uiState2;
                VerifySecretUiState value2;
                Resource resourceError;
                int i3 = 2 % 2;
                int i4 = component1 + 121;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    uiState2 = this.component2.getUiState();
                    int i5 = 84 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(e, "");
                    uiState2 = this.component2.getUiState();
                }
                int i6 = component1 + 51;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, VerifySecretUiState.copy$default(value2, null, null, resourceError, null, 11, null)));
            }
        });
    }

    public void resetPin(ReSetPinParams params) {
        MutableStateFlow<VerifySecretUiState> uiState;
        VerifySecretUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            uiState = getUiState();
            int i3 = 9 / 0;
        } else {
            Intrinsics.checkNotNullParameter(params, "");
            uiState = getUiState();
        }
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifySecretUiState.copy$default(value, null, null, null, resourceLoading, 7, null)));
        getModel().resetPin(params, new ApiCallback<BaseResp>(this) {
            private static int component1 = 0;
            private static int component2 = 1;
            final BaseVerifySecurityQuestionViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i4 = 2 % 2;
                int i5 = component2 + 37;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(baseResp);
                if (i6 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(BaseResp value2) {
                VerifySecretUiState value3;
                Resource resourceSuccess;
                int i4 = 2 % 2;
                int i5 = component2 + 99;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                MutableStateFlow<VerifySecretUiState> uiState2 = this.copydefault.getUiState();
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, VerifySecretUiState.copy$default(value3, null, null, null, resourceSuccess, 7, null)));
                int i7 = component2 + 109;
                component1 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                VerifySecretUiState value2;
                Resource resourceError;
                int i4 = 2 % 2;
                int i5 = component1 + 19;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<VerifySecretUiState> uiState2 = this.copydefault.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, VerifySecretUiState.copy$default(value2, null, null, null, resourceError, 7, null)));
                int i7 = component2 + 103;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            }
        });
        int i4 = component1 + 11;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 88 / 0;
        }
    }

    public void selectQuestion(LocalQuestionItem item) {
        VerifySecretUiState value;
        int i = 2 % 2;
        int i2 = component1 + 35;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(item, "");
        MutableStateFlow<VerifySecretUiState> uiState = getUiState();
        int i4 = component3 + 67;
        component1 = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = uiState.getValue();
        } while (!uiState.compareAndSet(value, VerifySecretUiState.copy$default(value, null, item, null, null, 13, null)));
    }
}
