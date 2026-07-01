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
final class ManageAccountViewModel$onChangePasswordConfirmed$1$1<T> implements FlowCollector {
    private static int ShareDataUIState = 1;
    private static int component1;
    final String component2;
    final ManageAccountViewModel component3;
    final String copydefault;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 1;
        private static int component3;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.NONE.ordinal()] = 1;
                int i = ShareDataUIState + 123;
                component3 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 4;
                int i4 = component3 + 37;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override
    public Object emit(Object obj, Continuation continuation) {
        int i = 2 % 2;
        int i2 = component1 + 119;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Object objComponent3 = component3((Resource) obj, continuation);
        int i4 = ShareDataUIState + 43;
        component1 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 68 / 0;
        }
        return objComponent3;
    }

    private static final Unit component2(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        int i = 2 % 2;
        int i2 = ShareDataUIState + 89;
        component1 = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            manageAccountViewModel.onChangePasswordConfirmed(str, str2);
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        manageAccountViewModel.onChangePasswordConfirmed(str, str2);
        int i3 = 26 / 0;
        return Unit.INSTANCE;
    }

    public final Object component3(Resource<HaProxyResponse<Object>> resource, Continuation<? super Unit> continuation) {
        int i;
        int i2 = 2 % 2;
        Status status = resource.getStatus();
        if (status == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            int i3 = ShareDataUIState + 35;
            component1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 4;
            }
        }
        if (i != 1) {
            int i5 = ShareDataUIState;
            int i6 = i5 + 21;
            component1 = i6 % 128;
            if (i6 % 2 == 0 ? i == 2 : i == 4) {
                ManageAccountViewModel.access$get_toastState$p(this.component3).setValue(new ToastState.Success("Your password has been changed successfully.", null, 2, null));
                ManageAccountViewModel.access$setRetryAction$p(this.component3, null);
            } else if (i != 3) {
                int i7 = i5 + 55;
                component1 = i7 % 128;
                if (i7 % 2 == 0 ? i != 4 : i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                ManageAccountViewModel.access$get_toastState$p(this.component3).setValue(new ToastState.Loading("Updating..."));
                int i8 = ShareDataUIState + 77;
                component1 = i8 % 128;
                int i9 = i8 % 2;
            } else {
                MutableStateFlow mutableStateFlowAccess$get_toastState$p = ManageAccountViewModel.access$get_toastState$p(this.component3);
                String message = resource.getMessage();
                if (message == null) {
                    int i10 = ShareDataUIState + 79;
                    component1 = i10 % 128;
                    int i11 = i10 % 2;
                    message = "Sorry, that didn’t work. Let’s give it another shot.";
                }
                mutableStateFlowAccess$get_toastState$p.setValue(new ToastState.Error(message, null, 2, null));
                final ManageAccountViewModel manageAccountViewModel = this.component3;
                final String str = this.copydefault;
                final String str2 = this.component2;
                ManageAccountViewModel.access$setRetryAction$p(manageAccountViewModel, new Function0() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i12 = 2 % 2;
                        int i13 = copydefault + 81;
                        component1 = i13 % 128;
                        int i14 = i13 % 2;
                        Unit unitComponent3 = ManageAccountViewModel$onChangePasswordConfirmed$1$1.component3(manageAccountViewModel, str, str2);
                        int i15 = copydefault + 57;
                        component1 = i15 % 128;
                        if (i15 % 2 != 0) {
                            return unitComponent3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static Unit component3(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        int i = 2 % 2;
        int i2 = component1 + 79;
        ShareDataUIState = i2 % 128;
        int i3 = i2 % 2;
        Unit unitComponent2 = component2(manageAccountViewModel, str, str2);
        int i4 = ShareDataUIState + 71;
        component1 = i4 % 128;
        if (i4 % 2 == 0) {
            return unitComponent2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    ManageAccountViewModel$onChangePasswordConfirmed$1$1(ManageAccountViewModel manageAccountViewModel, String str, String str2) {
        this.component3 = manageAccountViewModel;
        this.copydefault = str;
        this.component2 = str2;
    }
}
