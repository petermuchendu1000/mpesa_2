package com.huawei.digitalpayment.common.theme.viewmodel.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.common.theme.data.TipsResp;
import com.huawei.digitalpayment.common.theme.model.ITipsThemeModel;
import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u0012*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseTipsThemeViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;)V", "getModel", "()Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;", "Lcom/huawei/digitalpayment/common/theme/model/ITipsThemeModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/common/theme/viewmodel/base/TipsUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "getTips", "", "params", "Lcom/huawei/http/BaseRequestParams;", "Companion", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseTipsThemeViewModel<Model extends ITipsThemeModel> extends ViewModel {

    public static final Companion INSTANCE = new Companion(null);
    private static List<? extends TipsResp> ShareDataUIState = CollectionsKt.emptyList();
    private static int component1 = 1;
    private static int component2 = 0;
    private static int component4 = 1;
    private static int getRequestBeneficiariesState;
    private final MutableStateFlow<TipsUiState> component3;
    private final Model copydefault;

    public static final List access$getTips$cp() {
        List<? extends TipsResp> list;
        int i = 2 % 2;
        int i2 = component4 + 47;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        if (i2 % 2 != 0) {
            list = ShareDataUIState;
            int i4 = 96 / 0;
        } else {
            list = ShareDataUIState;
        }
        int i5 = i3 + 53;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final MutableStateFlow access$getUiState$p(BaseTipsThemeViewModel baseTipsThemeViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        int i3 = i2 % 128;
        component4 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<TipsUiState> mutableStateFlow = baseTipsThemeViewModel.component3;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i3 + 105;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final void access$setTips$cp(List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 77;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = list;
        int i5 = i2 + 125;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 75;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.copydefault;
        int i5 = i2 + 51;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTipsThemeViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.copydefault = model;
        this.component3 = StateFlowKt.MutableStateFlow(new TipsUiState(ShareDataUIState, null, 2, 0 == true ? 1 : 0));
    }

    public final StateFlow<TipsUiState> uiState() {
        int i = 2 % 2;
        int i2 = component4 + 73;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            MutableStateFlow<TipsUiState> mutableStateFlow = this.component3;
            Intrinsics.checkNotNull(mutableStateFlow, "");
            return mutableStateFlow;
        }
        Intrinsics.checkNotNull(this.component3, "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void getTips(BaseRequestParams params) {
        TipsUiState value;
        Object obj;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(params, "");
        MutableStateFlow<TipsUiState> mutableStateFlow = this.component3;
        int i2 = component4 + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = mutableStateFlow.getValue();
            obj = null;
        } while (!mutableStateFlow.compareAndSet(value, TipsUiState.copy$default(value, null, false, 1, null)));
        this.copydefault.getTips(params, (ApiCallback) new ApiCallback<List<? extends TipsResp>>(this) {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;
            final BaseTipsThemeViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(List<? extends TipsResp> list) {
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 101;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2(list);
                int i7 = ShareDataUIState + 95;
                component3 = i7 % 128;
                if (i7 % 2 != 0) {
                    return;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            public void onSuccess2(List<? extends TipsResp> value2) {
                Object value3;
                int i4 = 2 % 2;
                int i5 = ShareDataUIState + 119;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                BaseTipsThemeViewModel.INSTANCE.setTips(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseTipsThemeViewModel.access$getUiState$p(this.copydefault);
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, ((TipsUiState) value3).copy(value2, true)));
                int i7 = ShareDataUIState + 123;
                component3 = i7 % 128;
                if (i7 % 2 == 0) {
                    throw null;
                }
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i4 = 2 % 2;
                int i5 = component3 + 119;
                ShareDataUIState = i5 % 128;
                Object obj2 = null;
                if (i5 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    BaseTipsThemeViewModel.access$getUiState$p(this.copydefault);
                    obj2.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseTipsThemeViewModel.access$getUiState$p(this.copydefault);
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, TipsUiState.copy$default((TipsUiState) value2, null, true, 1, null)));
                int i6 = ShareDataUIState + 57;
                component3 = i6 % 128;
                int i7 = i6 % 2;
            }
        });
        int i4 = getRequestBeneficiariesState + 119;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/common/theme/viewmodel/base/BaseTipsThemeViewModel$Companion;", "", "<init>", "()V", "tips", "", "Lcom/huawei/digitalpayment/common/theme/data/TipsResp;", "getTips", "()Ljava/util/List;", "setTips", "(Ljava/util/List;)V", "CommonHomeThemeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 0;
        private static int component3 = 1;

        public static void component2() {
        }

        private Companion() {
        }

        public final List<TipsResp> getTips() {
            int i = 2 % 2;
            int i2 = component3 + 37;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                BaseTipsThemeViewModel.access$getTips$cp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            List<TipsResp> listAccess$getTips$cp = BaseTipsThemeViewModel.access$getTips$cp();
            int i3 = component2 + 111;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return listAccess$getTips$cp;
        }

        public final void setTips(List<? extends TipsResp> list) {
            int i = 2 % 2;
            int i2 = component2 + 19;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(list, "");
                BaseTipsThemeViewModel.access$setTips$cp(list);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Intrinsics.checkNotNullParameter(list, "");
            BaseTipsThemeViewModel.access$setTips$cp(list);
            int i3 = component3 + 123;
            component2 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 80 / 0;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = component1 + 115;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
