package com.huawei.digitalpayment.consumer.fixeddata.viewmodel;

import com.huawei.digitalpayment.consumer.base.resp.HaProxyResponse;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Status;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final class ManageAccountViewModel$onChangeNameConfirmed$1$1<T> implements FlowCollector {
    private static int component1 = 1;
    private static int component3;
    final String ShareDataUIState;
    final ManageAccountViewModel component2;
    final String copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
                int i = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
                int i2 = ShareDataUIState + 51;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                int i4 = 2 % 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int i5 = ShareDataUIState + 117;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override
    public Object emit(Object obj, Continuation continuation) {
        int i = 2 % 2;
        int i2 = component3 + 65;
        component1 = i2 % 128;
        Resource<HaProxyResponse<Object>> resource = (Resource) obj;
        if (i2 % 2 == 0) {
            component3(resource, continuation);
            throw null;
        }
        Object objComponent3 = component3(resource, continuation);
        int i3 = component3 + 41;
        component1 = i3 % 128;
        int i4 = i3 % 2;
        return objComponent3;
    }

    private static final Unit component3(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 111;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        manageAccountViewModel.onChangeNameConfirmed(str, str2);
        Unit unit = Unit.INSTANCE;
        int i4 = component1 + 3;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    public final Object component3(Resource<HaProxyResponse<Object>> resource, Continuation<? super Unit> continuation) {
        int i;
        int i2 = 2 % 2;
        Status status = resource.getStatus();
        if (status == null) {
            int i3 = component3 + 13;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        }
        Object obj = null;
        if (i != 1) {
            int i5 = component1 + 33;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            if (i == 2) {
                ManageAccountViewModel.access$get_toastState$p(this.component2).setValue(new ToastState.Success("Your Wi-Fi Name has been changed successfully.", null, 2, null));
                ManageAccountViewModel.access$setRetryAction$p(this.component2, null);
                ManageAccountViewModel.access$updateLocalWifiName(this.component2, this.ShareDataUIState, this.copydefault);
                int i7 = component3 + 85;
                component1 = i7 % 128;
                int i8 = i7 % 2;
            } else if (i == 3) {
                MutableStateFlow mutableStateFlowAccess$get_toastState$p = ManageAccountViewModel.access$get_toastState$p(this.component2);
                String message = resource.getMessage();
                if (message == null) {
                    message = "Sorry, that didn’t work. Let’s give it another shot.";
                }
                mutableStateFlowAccess$get_toastState$p.setValue(new ToastState.Error(message, null, 2, null));
                final ManageAccountViewModel manageAccountViewModel = this.component2;
                final String str = this.ShareDataUIState;
                final String str2 = this.copydefault;
                ManageAccountViewModel.access$setRetryAction$p(manageAccountViewModel, new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component3 + 89;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitCopydefault = ManageAccountViewModel$onChangeNameConfirmed$1$1.copydefault(manageAccountViewModel, str, str2);
                        int i12 = component3 + 121;
                        ShareDataUIState = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 67 / 0;
                        }
                        return unitCopydefault;
                    }
                });
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ManageAccountViewModel.access$get_toastState$p(this.component2).setValue(new ToastState.Loading("Updating..."));
            }
        }
        Unit unit = Unit.INSTANCE;
        int i9 = component1 + 47;
        component3 = i9 % 128;
        if (i9 % 2 == 0) {
            return unit;
        }
        obj.hashCode();
        throw null;
    }

    public static Unit copydefault(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 57;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent3 = component3(manageAccountViewModel, str, str2);
        int i4 = component1 + 19;
        component3 = i4 % 128;
        int i5 = i4 % 2;
        return unitComponent3;
    }

    ManageAccountViewModel$onChangeNameConfirmed$1$1(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        this.component2 = manageAccountViewModel;
        this.ShareDataUIState = str;
        this.copydefault = str2;
    }
}
