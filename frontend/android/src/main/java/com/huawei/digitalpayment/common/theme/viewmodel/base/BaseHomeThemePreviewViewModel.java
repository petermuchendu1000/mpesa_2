package com.huawei.digitalpayment.common.theme.viewmodel.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.HomeThemeResp;
import com.huawei.digitalpayment.common.theme.model.IThemePreviewModel;
import com.huawei.digitalpayment.common.theme.request.params.ThemePreviewParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseHomeThemePreviewViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;)V", "getModel", "()Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;", "Lcom/huawei/digitalpayment/common/theme/model/IThemePreviewModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/ThemePreViewUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "previewTheme", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/ThemePreviewParams;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseHomeThemePreviewViewModel<Model extends IThemePreviewModel> extends ViewModel {
    private static int component3 = 1;
    private static int copydefault;
    private final Model ShareDataUIState;
    private final MutableStateFlow<ThemePreViewUiState> component1;

    public static final MutableStateFlow access$getUiState$p(BaseHomeThemePreviewViewModel baseHomeThemePreviewViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 15;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        MutableStateFlow<ThemePreViewUiState> mutableStateFlow = baseHomeThemePreviewViewModel.component1;
        int i5 = i3 + 91;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = component3 + 87;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        Model model = this.ShareDataUIState;
        int i5 = i3 + 43;
        component3 = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    public BaseHomeThemePreviewViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.ShareDataUIState = model;
        this.component1 = StateFlowKt.MutableStateFlow(new ThemePreViewUiState(false, null, null, null, 15, null));
    }

    public final StateFlow<ThemePreViewUiState> uiState() {
        int i = 2 % 2;
        int i2 = copydefault + 13;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(this.component1, "");
            throw null;
        }
        MutableStateFlow<ThemePreViewUiState> mutableStateFlow = this.component1;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        return mutableStateFlow;
    }

    public void previewTheme(ThemePreviewParams params) {
        MutableStateFlow<ThemePreViewUiState> mutableStateFlow;
        ThemePreViewUiState value;
        int i = 2 % 2;
        int i2 = component3 + 75;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.component1;
            int i3 = 75 / 0;
        } else {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.component1;
        }
        int i4 = component3 + 19;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ThemePreViewUiState.copy$default(value, true, null, null, null, 14, null)));
        this.ShareDataUIState.previewTheme(params, new ApiCallback<HomeThemeResp>(this) {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final BaseHomeThemePreviewViewModel<Model> component2;

            {
                this.component2 = this;
            }

            @Override
            public void onSuccess(HomeThemeResp homeThemeResp) {
                int i6 = 2 % 2;
                int i7 = copydefault + 51;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
                onSuccess2(homeThemeResp);
                if (i8 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(HomeThemeResp value2) {
                Object value3;
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 117;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseHomeThemePreviewViewModel.access$getUiState$p(this.component2);
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, ThemePreViewUiState.copy$default((ThemePreViewUiState) value3, false, value2.getComponent(), value2, null, 8, null)));
                int i9 = ShareDataUIState + 85;
                copydefault = i9 % 128;
                if (i9 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i6 = 2 % 2;
                int i7 = ShareDataUIState + 25;
                copydefault = i7 % 128;
                int i8 = i7 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseHomeThemePreviewViewModel.access$getUiState$p(this.component2);
                int i9 = ShareDataUIState + 49;
                copydefault = i9 % 128;
                int i10 = i9 % 2;
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, ThemePreViewUiState.copy$default((ThemePreViewUiState) value2, false, null, null, e, 6, null)));
            }
        });
    }
}
