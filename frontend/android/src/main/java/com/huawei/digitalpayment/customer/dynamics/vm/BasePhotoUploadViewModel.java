package com.huawei.digitalpayment.customer.dynamics.vm;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.customer.dynamics.model.IPhotoModel;
import com.huawei.digitalpayment.customer.dynamics.req.UploadImageParams;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import com.huawei.payment.mvvm.Resource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0094\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/vm/BasePhotoUploadViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;)V", "getModel", "()Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;", "Lcom/huawei/digitalpayment/customer/dynamics/model/IPhotoModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/customer/dynamics/vm/PhotoUploadUiState;", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "", "params", "Lcom/huawei/digitalpayment/customer/dynamics/req/UploadImageParams;", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BasePhotoUploadViewModel<Model extends IPhotoModel> extends ViewModel {
    private static int component1 = 0;
    private static int copydefault = 1;
    private final Model ShareDataUIState;
    private final MutableStateFlow<PhotoUploadUiState> component3;

    /* JADX WARN: Multi-variable type inference failed */
    public BasePhotoUploadViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.ShareDataUIState = model;
        this.component3 = StateFlowKt.MutableStateFlow(new PhotoUploadUiState(null, 1, 0 == true ? 1 : 0));
    }

    protected Model getModel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 81;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.ShareDataUIState;
        int i5 = i2 + 5;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    protected MutableStateFlow<PhotoUploadUiState> getUiState() {
        int i = 2 % 2;
        int i2 = copydefault + 59;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        MutableStateFlow<PhotoUploadUiState> mutableStateFlow = this.component3;
        int i4 = i3 + 75;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            return mutableStateFlow;
        }
        obj.hashCode();
        throw null;
    }

    public StateFlow<PhotoUploadUiState> uiState() {
        MutableStateFlow<PhotoUploadUiState> mutableStateFlow;
        int i = 2 % 2;
        int i2 = component1 + 123;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            MutableStateFlow<PhotoUploadUiState> uiState = getUiState();
            Intrinsics.checkNotNull(uiState, "");
            mutableStateFlow = uiState;
            int i3 = 54 / 0;
        } else {
            MutableStateFlow<PhotoUploadUiState> uiState2 = getUiState();
            Intrinsics.checkNotNull(uiState2, "");
            mutableStateFlow = uiState2;
        }
        int i4 = component1 + 11;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return mutableStateFlow;
    }

    public void upload(UploadImageParams params) {
        PhotoUploadUiState value;
        Resource<UploadImageResp> resourceLoading;
        int i = 2 % 2;
        int i2 = component1 + 117;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(params, "");
            getUiState();
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<PhotoUploadUiState> uiState = getUiState();
        do {
            value = uiState.getValue();
            resourceLoading = Resource.loading(null);
            Intrinsics.checkNotNullExpressionValue(resourceLoading, "");
        } while (!uiState.compareAndSet(value, value.copy(resourceLoading)));
        getModel().upload(params, new ApiCallback<UploadImageResp>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;
            final BasePhotoUploadViewModel<Model> component1;

            {
                this.component1 = this;
            }

            @Override
            public void onSuccess(UploadImageResp uploadImageResp) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 63;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(uploadImageResp);
                if (i5 != 0) {
                    int i6 = 56 / 0;
                }
            }

            @Override
            public void onError(BaseException e) {
                PhotoUploadUiState value2;
                Resource<UploadImageResp> resourceError;
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 125;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                MutableStateFlow<PhotoUploadUiState> uiState2 = this.component1.getUiState();
                do {
                    value2 = uiState2.getValue();
                    resourceError = Resource.error(e, null);
                    Intrinsics.checkNotNullExpressionValue(resourceError, "");
                } while (!uiState2.compareAndSet(value2, value2.copy(resourceError)));
                int i6 = ShareDataUIState + 31;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }

            public void onSuccess2(UploadImageResp value2) {
                PhotoUploadUiState value3;
                Resource<UploadImageResp> resourceSuccess;
                int i3 = 2 % 2;
                int i4 = component3 + 57;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                MutableStateFlow<PhotoUploadUiState> uiState2 = this.component1.getUiState();
                do {
                    value3 = uiState2.getValue();
                    resourceSuccess = Resource.success(value2);
                    Intrinsics.checkNotNullExpressionValue(resourceSuccess, "");
                } while (!uiState2.compareAndSet(value3, value3.copy(resourceSuccess)));
                int i6 = component3 + 103;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
    }
}
