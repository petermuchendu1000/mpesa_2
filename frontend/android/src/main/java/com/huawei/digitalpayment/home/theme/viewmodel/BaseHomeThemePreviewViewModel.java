package com.huawei.digitalpayment.home.theme.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.home.request.HomeThemePreviewParams;
import com.huawei.digitalpayment.home.theme.data.local.LocalHomeThemeData;
import com.huawei.digitalpayment.home.theme.model.IThemePreviewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/home/theme/viewmodel/BaseHomeThemePreviewViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/home/theme/model/IThemePreviewModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/home/theme/model/IThemePreviewModel;)V", "getModel", "()Lcom/huawei/digitalpayment/home/theme/model/IThemePreviewModel;", "Lcom/huawei/digitalpayment/home/theme/model/IThemePreviewModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/home/theme/viewmodel/UiState;", "Lkotlinx/coroutines/flow/StateFlow;", "previewTheme", "", "params", "Lcom/huawei/digitalpayment/home/request/HomeThemePreviewParams;", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseHomeThemePreviewViewModel<Model extends IThemePreviewModel> extends ViewModel {
    private static int ShareDataUIState = 0;
    private static int component2 = 1;
    private final MutableStateFlow<UiState> component1;
    private final Model copydefault;

    public static final MutableStateFlow access$getUiState$p(BaseHomeThemePreviewViewModel baseHomeThemePreviewViewModel) {
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 59;
        ShareDataUIState = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<UiState> mutableStateFlow = baseHomeThemePreviewViewModel.component1;
        int i5 = i2 + 13;
        ShareDataUIState = i5 % 128;
        int i6 = i5 % 2;
        return mutableStateFlow;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = component2 + 13;
        int i3 = i2 % 128;
        ShareDataUIState = i3;
        int i4 = i2 % 2;
        Model model = this.copydefault;
        int i5 = i3 + 45;
        component2 = i5 % 128;
        if (i5 % 2 != 0) {
            return model;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public BaseHomeThemePreviewViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.copydefault = model;
        this.component1 = StateFlowKt.MutableStateFlow(new UiState(false, null, null, 7, null));
    }

    public final StateFlow<UiState> uiState() {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 99;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<UiState> mutableStateFlow = this.component1;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<UiState> mutableStateFlow2 = mutableStateFlow;
        int i4 = ShareDataUIState + 17;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return mutableStateFlow2;
    }

    public void previewTheme(HomeThemePreviewParams params) {
        MutableStateFlow<UiState> mutableStateFlow;
        UiState value;
        int i = 2 % 2;
        int i2 = ShareDataUIState + 61;
        component2 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.component1;
            int i3 = 54 / 0;
        } else {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.component1;
        }
        int i4 = ShareDataUIState + 121;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, UiState.copy$default(value, true, null, null, 6, null)));
        this.copydefault.previewTheme(params, new ApiCallback<LocalHomeThemeData>(this) {
            private static int component1 = 1;
            private static int component3;
            final BaseHomeThemePreviewViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(LocalHomeThemeData localHomeThemeData) {
                int i6 = 2 % 2;
                int i7 = component1 + 51;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                onSuccess2(localHomeThemeData);
                if (i8 != 0) {
                    int i9 = 28 / 0;
                }
                int i10 = component1 + 101;
                component3 = i10 % 128;
                int i11 = i10 % 2;
            }

            public void onSuccess2(LocalHomeThemeData value2) {
                Object value3;
                int i6 = 2 % 2;
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseHomeThemePreviewViewModel.access$getUiState$p(this.copydefault);
                int i7 = component3 + 49;
                component1 = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, UiState.copy$default((UiState) value3, false, value2.getHomeTheme(), null, 4, null)));
                int i9 = component1 + 43;
                component3 = i9 % 128;
                int i10 = i9 % 2;
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i6 = 2 % 2;
                int i7 = component1 + 109;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    BaseHomeThemePreviewViewModel.access$getUiState$p(this.copydefault);
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseHomeThemePreviewViewModel.access$getUiState$p(this.copydefault);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, UiState.copy$default((UiState) value2, false, null, e, 2, null)));
                int i8 = component3 + 89;
                component1 = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 91 / 0;
                }
            }
        });
    }
}
