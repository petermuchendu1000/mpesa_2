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
final class ManageAccountViewModel$performRestartRouter$2$1<T> implements FlowCollector {
    private static int component1 = 1;
    private static int component3;
    final ManageAccountViewModel ShareDataUIState;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int component1 = 0;
        private static int copydefault = 1;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
                int i = copydefault + 29;
                component1 = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Status.LOADING.ordinal()] = 4;
                int i4 = component1 + 101;
                copydefault = i4 % 128;
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
        int i2 = component1 + 125;
        component3 = i2 % 128;
        Resource<HaProxyResponse<Object>> resource = (Resource) obj;
        if (i2 % 2 == 0) {
            return component1(resource, continuation);
        }
        component1(resource, continuation);
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static final Unit copydefault(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = component3 + 105;
        component1 = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            manageAccountViewModel.performRestartRouter();
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        manageAccountViewModel.performRestartRouter();
        Unit unit = Unit.INSTANCE;
        throw null;
    }

    public final Object component1(Resource<HaProxyResponse<Object>> resource, Continuation<? super Unit> continuation) {
        int i = 2 % 2;
        Status status = resource.getStatus();
        int i2 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                ManageAccountViewModel.access$get_toastState$p(this.ShareDataUIState).setValue(new ToastState.Success("Your router has been restarted successfully.", null, 2, null));
                ManageAccountViewModel.access$setRetryAction$p(this.ShareDataUIState, null);
                int i3 = component3 + 31;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            } else if (i2 != 3) {
                int i5 = component3 + 53;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                ManageAccountViewModel.access$get_toastState$p(this.ShareDataUIState).setValue(new ToastState.Loading("Hang on tight while we restart your router. This will only take a few minutes"));
            } else {
                MutableStateFlow mutableStateFlowAccess$get_toastState$p = ManageAccountViewModel.access$get_toastState$p(this.ShareDataUIState);
                String message = resource.getMessage();
                if (message == null) {
                    int i7 = component3 + 61;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    message = "Sorry, that didn’t work. Let’s give it another shot.";
                }
                mutableStateFlowAccess$get_toastState$p.setValue(new ToastState.Error(message, null, 2, null));
                final ManageAccountViewModel manageAccountViewModel = this.ShareDataUIState;
                ManageAccountViewModel.access$setRetryAction$p(manageAccountViewModel, new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component3 + 71;
                        ShareDataUIState = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitComponent1 = ManageAccountViewModel$performRestartRouter$2$1.component1(manageAccountViewModel);
                        if (i11 == 0) {
                            int i12 = 79 / 0;
                        }
                        return unitComponent1;
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    public static Unit component1(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = component1 + 29;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Unit unitCopydefault = copydefault(manageAccountViewModel);
        int i4 = component1 + 95;
        component3 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return unitCopydefault;
    }

    ManageAccountViewModel$performRestartRouter$2$1(ManageAccountViewModel manageAccountViewModel) {
        this.ShareDataUIState = manageAccountViewModel;
    }
}
