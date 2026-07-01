package com.huawei.digitalpayment.common.theme.viewmodel.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.model.ILogoutModel;
import com.huawei.http.BaseRequestParams;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseLogoutViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/ILogoutModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/ILogoutModel;)V", "getModel", "()Lcom/huawei/digitalpayment/common/theme/model/ILogoutModel;", "Lcom/huawei/digitalpayment/common/theme/model/ILogoutModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/LogoutUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "logout", "", "params", "Lcom/huawei/http/BaseRequestParams;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseLogoutViewModel<Model extends ILogoutModel> extends ViewModel {
    private static int component3 = 0;
    private static int copydefault = 1;
    private final MutableStateFlow<LogoutUiState> ShareDataUIState;
    private final Model component2;

    public static final MutableStateFlow access$getUiState$p(BaseLogoutViewModel baseLogoutViewModel) {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 55;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<LogoutUiState> mutableStateFlow = baseLogoutViewModel.ShareDataUIState;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 61;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.component2;
        int i5 = i2 + 13;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    public BaseLogoutViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component2 = model;
        boolean z = false;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new LogoutUiState(z, z, 3, null));
    }

    public final StateFlow<LogoutUiState> uiState() {
        int i = 2 % 2;
        int i2 = copydefault + 37;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNull(this.ShareDataUIState, "");
            throw null;
        }
        MutableStateFlow<LogoutUiState> mutableStateFlow = this.ShareDataUIState;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<LogoutUiState> mutableStateFlow2 = mutableStateFlow;
        int i3 = component3 + 41;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        return mutableStateFlow2;
    }

    public void logout(BaseRequestParams params) {
        LogoutUiState value;
        int i = 2 % 2;
        int i2 = copydefault + 43;
        component3 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<LogoutUiState> mutableStateFlow = this.ShareDataUIState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, LogoutUiState.copy$default(value, true, false, 2, null)));
        this.component2.logout(params, new ApiCallback<BaseResp>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;
            final BaseLogoutViewModel<Model> ShareDataUIState;

            {
                this.ShareDataUIState = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i3 = 2 % 2;
                int i4 = copydefault + 15;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                onSuccess2(baseResp);
                int i6 = copydefault + 23;
                component1 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 34 / 0;
                }
            }

            public void onSuccess2(BaseResp value2) {
                Object value3;
                int i3 = 2 % 2;
                int i4 = component1 + 55;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseLogoutViewModel.access$getUiState$p(this.ShareDataUIState);
                int i6 = copydefault + 41;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, ((LogoutUiState) value3).copy(false, true)));
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i3 = 2 % 2;
                int i4 = copydefault + 17;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseLogoutViewModel.access$getUiState$p(this.ShareDataUIState);
                int i6 = copydefault + 15;
                component1 = i6 % 128;
                int i7 = i6 % 2;
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, ((LogoutUiState) value2).copy(false, true)));
            }
        });
        int i3 = copydefault + 31;
        component3 = i3 % 128;
        int i4 = i3 % 2;
    }
}
