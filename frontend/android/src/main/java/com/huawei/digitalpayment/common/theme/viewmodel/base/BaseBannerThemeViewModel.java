package com.huawei.digitalpayment.common.theme.viewmodel.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.BannerResp;
import com.huawei.digitalpayment.common.theme.model.IBannerThemeModel;
import com.huawei.digitalpayment.common.theme.request.params.QueryBannerParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseBannerThemeViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;)V", "getModel", "()Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/IBannerThemeModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BannerUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "refreshBanner", "", "params", "Lcom/huawei/digitalpayment/common/theme/request/params/QueryBannerParams;", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseBannerThemeViewModel<Model extends IBannerThemeModel> extends ViewModel {
    private static int component2 = 0;
    private static int copydefault = 1;
    private final MutableStateFlow<BannerUiState> ShareDataUIState;
    private final Model component1;

    public static final MutableStateFlow access$getUiState$p(BaseBannerThemeViewModel baseBannerThemeViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        MutableStateFlow<BannerUiState> mutableStateFlow = baseBannerThemeViewModel.ShareDataUIState;
        if (i3 != 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = copydefault + 57;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        Model model = this.component1;
        int i5 = i3 + 43;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBannerThemeViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component1 = model;
        this.ShareDataUIState = StateFlowKt.MutableStateFlow(new BannerUiState(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0));
    }

    public final StateFlow<BannerUiState> uiState() {
        int i = 2 % 2;
        int i2 = component2 + 81;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(this.ShareDataUIState, "");
            obj.hashCode();
            throw null;
        }
        MutableStateFlow<BannerUiState> mutableStateFlow = this.ShareDataUIState;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<BannerUiState> mutableStateFlow2 = mutableStateFlow;
        int i3 = copydefault + 39;
        component2 = i3 % 128;
        if (i3 % 2 == 0) {
            return mutableStateFlow2;
        }
        obj.hashCode();
        throw null;
    }

    public void refreshBanner(QueryBannerParams params) {
        BannerUiState value;
        int i = 2 % 2;
        int i2 = component2 + 29;
        copydefault = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(params, "");
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<BannerUiState> mutableStateFlow = this.ShareDataUIState;
        int i3 = component2 + 29;
        copydefault = i3 % 128;
        int i4 = i3 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, BannerUiState.copy$default(value, null, false, 1, null)));
        this.component1.refreshBanner(params, (ApiCallback) new ApiCallback<List<? extends BannerResp>>(this) {
            private static int ShareDataUIState = 1;
            private static int component2;
            final BaseBannerThemeViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(List<? extends BannerResp> list) {
                int i5 = 2 % 2;
                int i6 = ShareDataUIState + 65;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                onSuccess2(list);
                if (i7 != 0) {
                    int i8 = 84 / 0;
                }
            }

            public void onSuccess2(List<? extends BannerResp> value2) {
                Object value3;
                int i5 = 2 % 2;
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseBannerThemeViewModel.access$getUiState$p(this.copydefault);
                int i6 = ShareDataUIState + 51;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, ((BannerUiState) value3).copy(value2, true)));
                int i8 = ShareDataUIState + 53;
                component2 = i8 % 128;
                int i9 = i8 % 2;
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                Object obj2;
                int i5 = 2 % 2;
                int i6 = component2 + 71;
                ShareDataUIState = i6 % 128;
                int i7 = i6 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseBannerThemeViewModel.access$getUiState$p(this.copydefault);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                    obj2 = null;
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, BannerUiState.copy$default((BannerUiState) value2, null, true, 1, null)));
                int i8 = ShareDataUIState + 45;
                component2 = i8 % 128;
                if (i8 % 2 == 0) {
                    return;
                }
                obj2.hashCode();
                throw null;
            }
        });
    }
}
