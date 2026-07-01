package com.huawei.digitalpayment.consumer.basicUi.viewmodel;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.DeviceInfoFieldGroup;
import com.alibaba.ariver.tracedebug.core.TraceDebugManager;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.basicUi.model.ILoginSettingModel;
import com.huawei.http.BaseResp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0012\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0014\u001a\u00020\u000fH\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0013\u0010\u0004\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/BaseLoginSettingViewModel;", ExifInterface.TAG_MODEL, "Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;", "Landroidx/lifecycle/ViewModel;", DeviceInfoFieldGroup.FIELD_MODEL, "<init>", "(Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;)V", "getModel", "()Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;", "Lcom/huawei/digitalpayment/consumer/basicUi/model/ILoginSettingModel;", "uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginSettingUiState;", "Lkotlinx/coroutines/flow/StateFlow;", "cleanException", "", "cleanSuccessState", "callback", "com/huawei/digitalpayment/consumer/basicUi/viewmodel/BaseLoginSettingViewModel$callback$1", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/BaseLoginSettingViewModel$callback$1;", TraceDebugManager.IdeCommand.REFRESH, "closeFaceIdLogin", "closeFingerprintLogin", "dispatcherOperator", "pin", "", "openFaceIdLogin", "openFingerprintLogin", "setOperator", "loginOperator", "Lcom/huawei/digitalpayment/consumer/basicUi/viewmodel/LoginOperator;", "ConsumerBasicUiModule_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class BaseLoginSettingViewModel<Model extends ILoginSettingModel> extends ViewModel {
    private static int component1 = 1;
    private static int component2;
    private final BaseLoginSettingViewModel$callback$1 ShareDataUIState;
    private final Model component3;
    private final MutableStateFlow<LoginSettingUiState> copydefault;

    public static final MutableStateFlow access$getUiState$p(BaseLoginSettingViewModel baseLoginSettingViewModel) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        int i3 = i2 % 128;
        component1 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = baseLoginSettingViewModel.copydefault;
        int i5 = i3 + 7;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return mutableStateFlow;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Model getModel() {
        int i = 2 % 2;
        int i2 = component2 + 75;
        int i3 = i2 % 128;
        component1 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        Model model = this.component3;
        int i4 = i3 + 43;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return model;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel$callback$1] */
    public BaseLoginSettingViewModel(Model model) {
        Intrinsics.checkNotNullParameter(model, "");
        this.component3 = model;
        this.copydefault = StateFlowKt.MutableStateFlow(new LoginSettingUiState(false, null, false, false, false, false, false, null, 255, null));
        this.ShareDataUIState = new ApiCallback<BaseResp>(this) {
            private static int component1 = 0;
            private static int copydefault = 1;
            final BaseLoginSettingViewModel<Model> component2;

            {
                this.component2 = this;
            }

            @Override
            public void onSuccess(BaseResp baseResp) {
                int i = 2 % 2;
                int i2 = component1 + 35;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                onSuccess2(baseResp);
                int i4 = component1 + 55;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 7 / 0;
                }
            }

            public void onSuccess2(BaseResp value) {
                Object value2;
                int i = 2 % 2;
                super.onSuccess(value);
                this.component2.refresh();
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseLoginSettingViewModel.access$getUiState$p(this.component2);
                int i2 = copydefault + 17;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                do {
                    value2 = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value2, LoginSettingUiState.copy$default((LoginSettingUiState) value2, false, null, false, false, false, false, true, null, 191, null)));
                int i4 = copydefault + 71;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onError(BaseException e) {
                Object value;
                int i = 2 % 2;
                int i2 = copydefault + 45;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(e, "");
                    super.onError(e);
                    BaseLoginSettingViewModel.access$getUiState$p(this.component2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(e, "");
                super.onError(e);
                MutableStateFlow mutableStateFlowAccess$getUiState$p = BaseLoginSettingViewModel.access$getUiState$p(this.component2);
                do {
                    value = mutableStateFlowAccess$getUiState$p.getValue();
                } while (!mutableStateFlowAccess$getUiState$p.compareAndSet(value, LoginSettingUiState.copy$default((LoginSettingUiState) value, false, e, false, false, false, false, false, null, 253, null)));
                int i3 = component1 + 17;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
            }
        };
    }

    public final StateFlow<LoginSettingUiState> uiState() {
        int i = 2 % 2;
        int i2 = component2 + 83;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNull(this.copydefault, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = this.copydefault;
        Intrinsics.checkNotNull(mutableStateFlow, "");
        MutableStateFlow<LoginSettingUiState> mutableStateFlow2 = mutableStateFlow;
        int i3 = component1 + 111;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return mutableStateFlow2;
    }

    private final void component3() {
        int i = 2 % 2;
        int i2 = component1 + 17;
        component2 = i2 % 128;
        if (i2 % 2 != 0) {
            this.component3.closeFaceIdLogin(this.ShareDataUIState);
            throw null;
        }
        this.component3.closeFaceIdLogin(this.ShareDataUIState);
        int i3 = component2 + 39;
        component1 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private final void component1() {
        int i = 2 % 2;
        int i2 = component1 + 53;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Model model = this.component3;
        if (i3 == 0) {
            model.closeFingerprintLogin(this.ShareDataUIState);
        } else {
            model.closeFingerprintLogin(this.ShareDataUIState);
            int i4 = 89 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r1 == com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FACE_ID_LOGIN) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        component3();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 != com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FACE_ID_LOGIN) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        component3(r5);
        r5 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component1 + 43;
        com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component2 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        if (r1 != com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FINGERPRINT_LOGIN) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        component1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r1 != com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FINGERPRINT_LOGIN) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        copydefault(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0030, code lost:
    
        if (r1 == com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FACE_ID_LOGIN) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatcherOperator(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component2
            int r1 = r1 + 85
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component1 = r2
            int r1 = r1 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            kotlinx.coroutines.flow.MutableStateFlow<com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingUiState> r1 = r4.copydefault
            java.lang.Object r1 = r1.getValue()
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingUiState r1 = (com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginSettingUiState) r1
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r1 = r1.getOperator()
            if (r1 == 0) goto L5b
            int r2 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component1
            int r2 = r2 + 57
            int r3 = r2 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component2 = r3
            int r2 = r2 % r0
            if (r2 == 0) goto L33
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r2 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FACE_ID_LOGIN
            r3 = 24
            int r3 = r3 / 0
            if (r1 != r2) goto L3b
            goto L37
        L33:
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r2 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FACE_ID_LOGIN
            if (r1 != r2) goto L3b
        L37:
            r4.component3()
            goto L5b
        L3b:
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r2 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FACE_ID_LOGIN
            if (r1 != r2) goto L4c
            r4.component3(r5)
            int r5 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component1
            int r5 = r5 + 43
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.component2 = r1
            int r5 = r5 % r0
            goto L5b
        L4c:
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.CLOSE_FINGERPRINT_LOGIN
            if (r1 != r0) goto L54
            r4.component1()
            goto L5b
        L54:
            com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator r0 = com.huawei.digitalpayment.consumer.basicUi.viewmodel.LoginOperator.OPEN_FINGERPRINT_LOGIN
            if (r1 != r0) goto L5b
            r4.copydefault(r5)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.basicUi.viewmodel.BaseLoginSettingViewModel.dispatcherOperator(java.lang.String):void");
    }

    private final void component3(String str) {
        int i = 2 % 2;
        int i2 = component1 + 117;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.component3.openFaceIdLogin(str, this.ShareDataUIState);
        int i4 = component1 + 93;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void copydefault(String str) {
        int i = 2 % 2;
        int i2 = component1 + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        this.component3.openFingerprintLogin(str, this.ShareDataUIState);
        int i4 = component2 + 93;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void cleanException() {
        LoginSettingUiState value;
        int i = 2 % 2;
        int i2 = component1 + 3;
        int i3 = i2 % 128;
        component2 = i3;
        int i4 = i2 % 2;
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = this.copydefault;
        int i5 = i3 + 123;
        component1 = i5 % 128;
        int i6 = i5 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, LoginSettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 253, null)));
    }

    public final void cleanSuccessState() {
        LoginSettingUiState value;
        int i = 2 % 2;
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = this.copydefault;
        int i2 = component2 + 95;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, LoginSettingUiState.copy$default(value, false, null, false, false, false, false, false, null, 191, null)));
        int i4 = component2 + 7;
        component1 = i4 % 128;
        int i5 = i4 % 2;
    }

    public void refresh() {
        LoginSettingUiState value;
        boolean zIsShowFaceIdLogin;
        int i = 2 % 2;
        int i2 = component2;
        int i3 = i2 + 21;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = this.copydefault;
        int i5 = i2 + 43;
        component1 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 5 % 4;
        }
        do {
            value = mutableStateFlow.getValue();
            zIsShowFaceIdLogin = this.component3.isShowFaceIdLogin();
        } while (!mutableStateFlow.compareAndSet(value, LoginSettingUiState.copy$default(value, false, null, this.component3.isShowFingerprintLogin(), zIsShowFaceIdLogin, this.component3.isOpenFingerprintLogin(), this.component3.isOpenFaceIdLogin(), false, null, 195, null)));
    }

    public void setOperator(LoginOperator loginOperator) {
        LoginSettingUiState value;
        int i = 2 % 2;
        int i2 = component2 + 53;
        component1 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(loginOperator, "");
        MutableStateFlow<LoginSettingUiState> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, LoginSettingUiState.copy$default(value, false, null, false, false, false, false, false, loginOperator, 127, null)));
        int i4 = component1 + 45;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }
}
