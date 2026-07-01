package com.huawei.digitalpayment.home.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.home.data.ITipsModel;
import com.huawei.digitalpayment.home.data.source.locaL.LocalHomeTips;
import com.huawei.digitalpayment.home.ui.uistate.HomeTipsUiState;
import com.huawei.http.BaseRequestParams;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u0012*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/huawei/digitalpayment/home/viewmodel/BaseTipsViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/home/data/ITipsModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/home/data/ITipsModel;)V", "getModel", "()Lcom/huawei/digitalpayment/home/data/ITipsModel;", "Lcom/huawei/digitalpayment/home/data/ITipsModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/home/ui/uistate/HomeTipsUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "getTips", "", "params", "Lcom/huawei/http/BaseRequestParams;", "Companion", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseTipsViewModel<Model extends ITipsModel> extends ViewModel {
    private static int ShareDataUIState = 1;
    private static int component2 = 0;
    private static int component4 = 0;
    private static int getRequestBeneficiariesState = 1;
    private final Model component1;
    private final MutableStateFlow<HomeTipsUiState> copydefault;

    public static final Companion INSTANCE = new Companion(null);
    private static List<LocalHomeTips> component3 = CollectionsKt.emptyList();

    public static final List access$getTips$cp() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 13;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        List<LocalHomeTips> list = component3;
        int i5 = i2 + 119;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final MutableStateFlow access$getUiState$p(BaseTipsViewModel baseTipsViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 11;
        component4 = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<HomeTipsUiState> mutableStateFlow = baseTipsViewModel.copydefault;
        int i5 = i2 + 109;
        component4 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        throw null;
    }

    public static final void access$setTips$cp(List list) {
        int i = 2 % 2;
        int i2 = component4 + 1;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        component3 = list;
        int i5 = i3 + 117;
        component4 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    protected final Model getModel() {
        int i = 2 % 2;
        int i2 = component4;
        int i3 = i2 + 101;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        Model model = this.component1;
        int i5 = i2 + 109;
        getRequestBeneficiariesState = i5 % 128;
        int i6 = i5 % 2;
        return model;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseTipsViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component1 = model;
        this.copydefault = StateFlowKt.MutableStateFlow(new HomeTipsUiState(component3, null, 2, 0 == true ? 1 : 0));
    }

    public final StateFlow<HomeTipsUiState> uiState() {
        int i = 2 % 2;
        int i2 = component4 + 63;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(this.copydefault, "");
            throw null;
        }
        MutableStateFlow<HomeTipsUiState> mutableStateFlow = this.copydefault;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        return mutableStateFlow;
    }

    @Deprecated(message = "")
    public final void getTips() {
        int i = 2 % 2;
        getTips(new BaseRequestParams());
        int i2 = component4 + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    public void getTips(BaseRequestParams params) {
        MutableStateFlow<HomeTipsUiState> mutableStateFlow;
        HomeTipsUiState value;
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.copydefault;
            int i3 = 79 / 0;
        } else {
            Intrinsics.checkNotNullParameter(params, "");
            mutableStateFlow = this.copydefault;
        }
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HomeTipsUiState.copy$default(value, null, false, 1, null)));
        this.component1.getTips(params, (ApiCallback) new ApiCallback<List<? extends LocalHomeTips>>(this) {
            private static int ShareDataUIState = 1;
            private static int component3;
            final BaseTipsViewModel<Model> copydefault;

            {
                this.copydefault = this;
            }

            @Override
            public void onSuccess(List<? extends LocalHomeTips> list) {
                int i4 = 2 % 2;
                int i5 = component3 + 95;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                onSuccess2((List<LocalHomeTips>) list);
                int i7 = component3 + 61;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }

            public void onSuccess2(List<LocalHomeTips> value2) {
                Object value3;
                int i4 = 2 % 2;
                int i5 = component3 + 103;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                Intrinsics.checkNotNullParameter(value2, "");
                super.onSuccess(value2);
                BaseTipsViewModel.INSTANCE.setTips(value2);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseTipsViewModel.access$getUiState$p(this.copydefault);
                int i7 = ShareDataUIState + 59;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                do {
                    value3 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value3, ((HomeTipsUiState) value3).copy(value2, true)));
            }

            @Override
            public void onError(BaseException e) {
                Object value2;
                int i4 = 2 % 2;
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseTipsViewModel.access$getUiState$p(this.copydefault);
                int i5 = component3 + 29;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, HomeTipsUiState.copy$default((HomeTipsUiState) value2, null, true, 1, null)));
                int i7 = component3 + 95;
                ShareDataUIState = i7 % 128;
                int i8 = i7 % 2;
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huawei/digitalpayment/home/viewmodel/BaseTipsViewModel$Companion;", "", "<init>", "()V", "tips", "", "Lcom/huawei/digitalpayment/home/data/source/locaL/LocalHomeTips;", "getTips", "()Ljava/util/List;", "setTips", "(Ljava/util/List;)V", "ConsumerHomeModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private static int component3 = 1;
        private static int copydefault;

        private Companion() {
        }

        public final List<LocalHomeTips> getTips() {
            int i = 2 % 2;
            int i2 = copydefault + 39;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            List<LocalHomeTips> listAccess$getTips$cp = BaseTipsViewModel.access$getTips$cp();
            int i4 = component3 + 61;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return listAccess$getTips$cp;
        }

        public final void setTips(List<LocalHomeTips> list) {
            int i = 2 % 2;
            int i2 = copydefault + 7;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            BaseTipsViewModel.access$setTips$cp(list);
            int i4 = copydefault + 45;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int i = ShareDataUIState + 57;
        component2 = i % 128;
        int i2 = i % 2;
    }
}
