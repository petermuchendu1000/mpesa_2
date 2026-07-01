package com.huawei.digitalpayment.consumer.loginModule.mpin.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.loginModule.mpin.data.VerifyBaseQuestionParams;
import com.huawei.digitalpayment.consumer.loginModule.mpin.model.IBaseQuestionModel;
import com.huawei.digitalpayment.consumer.loginModule.register.data.LocalQuestionItem;
import com.huawei.digitalpayment.consumer.loginModule.register.request.ReSetPinParams;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import com.huawei.payment.mvvm.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0017H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/BaseVerifyBaseQuestionViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/model/IBaseQuestionModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/viewmodel/VerifyBaseUiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "queryQuestions", "", "params", "Lcom/huawei/http/BaseRequestParams;", "verifyQuestion", "Lcom/huawei/digitalpayment/consumer/loginModule/mpin/data/VerifyBaseQuestionParams;", "resetPin", "Lcom/huawei/digitalpayment/consumer/loginModule/register/request/ReSetPinParams;", "ConsumerLoginModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseVerifyBaseQuestionViewModel<Model extends IBaseQuestionModel> extends ViewModel {
    private static int component1 = 1;
    private static int component2;
    private final MutableStateFlow<VerifyBaseUiState> ShareDataUIState;
    private final Model copydefault;

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = component1;
        int i3 = i2 + 45;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.copydefault;
        int i5 = i2 + 125;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
        return model;
    }

    public BaseVerifyBaseQuestionViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.copydefault = model;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new VerifyBaseUiState(null, null, null, 7, null));
    }

    protected MutableStateFlow<VerifyBaseUiState> getUiState() {
        int i = 2 % 2;
        int i2 = component1 + 43;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<VerifyBaseUiState> mutableStateFlow = this.ShareDataUIState;
        int i5 = i3 + 65;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    public StateFlow<VerifyBaseUiState> uiState() {
        int i = 2 % 2;
        int i2 = component2 + 5;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<VerifyBaseUiState> uiState = getUiState();
        Intrinsics.checkNotNull(uiState, "");
        MutableStateFlow<VerifyBaseUiState> mutableStateFlow = uiState;
        int i4 = component1 + 37;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void queryQuestions(BaseRequestParams params) {
        VerifyBaseUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 79;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            getUiState();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<VerifyBaseUiState> uiState = getUiState();
        int i3 = component1 + 107;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifyBaseUiState.copy$default(value, resourceLoading, null, null, 6, null)));
        getModel().getQuestions(params, (ApiCallback) new ApiCallback<List<? extends LocalQuestionItem>>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;
            final BaseVerifyBaseQuestionViewModel<Model> component1;

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(List<? extends LocalQuestionItem> list) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 49;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                onSuccess2((List<LocalQuestionItem>) list);
                if (i7 != 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                int i8 = component3 + 17;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 23 / 0;
                }
            }

            public void onSuccess2(List<LocalQuestionItem> value2) {
                VerifyBaseUiState value3;
                Resource resourceSuccess;
                int i5 = 2 % 2;
                MutableStateFlow<VerifyBaseUiState> uiState2 = this.component1.getUiState();
                int i6 = ShareDataUIState + 21;
                component3 = i6 % 128;
                int i7 = i6 % 2;
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, VerifyBaseUiState.copy$default(value3, resourceSuccess, null, null, 6, null)));
                int i8 = component3 + 73;
                ShareDataUIState = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 97 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                VerifyBaseUiState value2;
                Resource resourceError;
                int i5 = 2 % 2;
                int i6 = component3 + 31;
                ShareDataUIState = i6 % 128;
                Object obj = null;
                if (i6 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    this.component1.getUiState();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<VerifyBaseUiState> uiState2 = this.component1.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, VerifyBaseUiState.copy$default(value2, resourceError, null, null, 6, null)));
                int i7 = component3 + 63;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
        });
    }

    public void verifyQuestion(VerifyBaseQuestionParams params) {
        VerifyBaseUiState value;
        Object obj;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 9;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<VerifyBaseUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            obj = null;
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifyBaseUiState.copy$default(value, null, resourceLoading, null, 5, null)));
        getModel().verifyQuestion(params, new ApiCallback<BaseResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final BaseVerifyBaseQuestionViewModel<Model> component2;

            {
                this.component2 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i4 = 2 % 2;
                int i5 = copydefault + 83;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(baseResp);
                if (i6 != 0) {
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                int i7 = copydefault + 49;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }

            public void onSuccess2(BaseResp value2) {
                VerifyBaseUiState value3;
                Resource resourceSuccess;
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 1;
                copydefault = i5 % 128;
                Object obj2 = null;
                if (i5 % 2 != 0) {
                    MutableStateFlow<VerifyBaseUiState> uiState2 = this.component2.getUiState();
                    int i6 = copydefault + 107;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    do {
                        value3 = uiState2.getValue();
                        resourceSuccess = Resource.success(value2);
                        Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    } while (!uiState2.compareAndSet(value3, VerifyBaseUiState.copy$default(value3, null, resourceSuccess, null, 5, null)));
                    int i8 = copydefault + 27;
                    ShareDataUIState = i8 % 128;
                    if (i8 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                this.component2.getUiState();
                obj2.hashCode();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                VerifyBaseUiState value2;
                Resource resourceError;
                int i4 = 2 % 2;
                int i5 = copydefault + 39;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<VerifyBaseUiState> uiState2 = this.component2.getUiState();
                int i7 = ShareDataUIState + 97;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, VerifyBaseUiState.copy$default(value2, null, resourceError, null, 5, null)));
            }
        });
        int i4 = component2 + 1;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void resetPin(ReSetPinParams params) {
        VerifyBaseUiState value;
        Resource resourceLoading;
        int i = 2 % 2;
        int i2 = component2 + 75;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<VerifyBaseUiState> uiState = getUiState();
        int i4 = component1 + 29;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, VerifyBaseUiState.copy$default(value, null, null, resourceLoading, 3, null)));
        getModel().resetPin(params, new ApiCallback<BaseResp>(this) {
            private static int component2 = 1;
            private static int copydefault;
            final BaseVerifyBaseQuestionViewModel<Model> component1;

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i6 = 2 % 2;
                int i7 = copydefault + 87;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                onSuccess2(baseResp);
                int i9 = copydefault + 21;
                component2 = i9 % 128;
                int i10 = i9 % 2;
            }

            public void onSuccess2(BaseResp value2) {
                VerifyBaseUiState value3;
                Resource resourceSuccess;
                int i6 = 2 % 2;
                int i7 = component2 + 61;
                copydefault = i7 % 128;
                Object obj = null;
                if (i7 % 2 == 0) {
                    MutableStateFlow<VerifyBaseUiState> uiState2 = this.component1.getUiState();
                    do {
                        value3 = uiState2.getValue();
                        resourceSuccess = Resource.success(value2);
                        Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                    } while (!uiState2.compareAndSet(value3, VerifyBaseUiState.copy$default(value3, null, null, resourceSuccess, 3, null)));
                    int i8 = copydefault + 63;
                    component2 = i8 % 128;
                    if (i8 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
                this.component1.getUiState();
                throw null;
            }

            @Override
            public void onError(BaseException e) {
                VerifyBaseUiState value2;
                Resource resourceError;
                int i6 = 2 % 2;
                int i7 = component2 + 19;
                copydefault = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    this.component1.getUiState();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<VerifyBaseUiState> uiState2 = this.component1.getUiState();
                int i8 = component2 + 21;
                copydefault = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 2 % 5;
                }
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, VerifyBaseUiState.copy$default(value2, null, null, resourceError, 3, null)));
            }
        });
    }
}
