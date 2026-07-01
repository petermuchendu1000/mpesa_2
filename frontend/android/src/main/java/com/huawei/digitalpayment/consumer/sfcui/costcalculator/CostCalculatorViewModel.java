package com.huawei.digitalpayment.consumer.sfcui.costcalculator;

import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.material.navigation.NavigationBarView;
import com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand;
import com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorEvent;
import com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel;
import com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.CostCalculatorRepository;
import com.huawei.digitalpayment.consumer.sfcui.costcalculator.repository.LipaTransactionCost;
import com.huawei.digitalpayment.consumer.sfcui.pesa.ui.billmanager.dashboard.popular.PopularScreenKt$$ExternalSyntheticLambda0;
import com.safaricom.consumer.commons.resource.Resource;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J!\u0010\u0017\u001a\u00020\u00102\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\u0002\b\u001aH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/CostCalculatorRepository;", "<init>", "(Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/repository/CostCalculatorRepository;)V", "initialState", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorViewModelState;", "viewModelState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "onEvent", "", "event", "Lcom/huawei/digitalpayment/consumer/sfcui/costcalculator/CostCalculatorEvent;", "loadCharges", "forceRefresh", "", "checkLipaCost", "updateViewModelState", "transform", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CostCalculatorViewModel extends ViewModel {
    public static final int $stable = 8;
    private static int component2 = 0;
    private static int component4 = 81 % 128;
    private static int equals = 1;
    private static int getRequestBeneficiariesState;
    private final CostCalculatorRepository ShareDataUIState;
    private final CostCalculatorViewModelState component1;
    private final StateFlow<CostCalculatorUiState> component3;
    private final MutableStateFlow<CostCalculatorViewModelState> copydefault;

    public static Object copydefault(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = i | i9;
        int i11 = (~(i7 | i)) | i9 | (~(i8 | i));
        int i12 = ~((~i) | i2 | i3);
        int i13 = i2 + i3 + i5 + ((-2027816600) * i4) + ((-1234684791) * i6);
        int i14 = i13 * i13;
        int i15 = (i2 * (-132237830)) + 1711013888 + ((-132237830) * i3) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i5) + (811597824 * i4) + (1100742656 * i6) + (1751056384 * i14);
        int i16 = ((i2 * 572746074) - 905264446) + (i3 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i5 * 572745585) + (i4 * 982511336) + (i6 * (-774025351)) + (i14 * 1257177088);
        return i15 + ((i16 * i16) * 1874919424) != 1 ? copydefault(objArr) : component1(objArr);
    }

    public static final CostCalculatorRepository access$getRepository$p(CostCalculatorViewModel costCalculatorViewModel) {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 27;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        CostCalculatorRepository costCalculatorRepository = costCalculatorViewModel.ShareDataUIState;
        int i5 = i2 + 107;
        component2 = i5 % 128;
        int i6 = i5 % 2;
        return costCalculatorRepository;
    }

    public static final void access$updateViewModelState(CostCalculatorViewModel costCalculatorViewModel, Function1 function1) {
        int i = 2 % 2;
        int i2 = equals + 83;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        costCalculatorViewModel.copydefault((Function1<? super CostCalculatorViewModelState, CostCalculatorViewModelState>) function1);
        if (i3 != 0) {
            int i4 = 15 / 0;
        }
    }

    @Inject
    public CostCalculatorViewModel(CostCalculatorRepository costCalculatorRepository) {
        Intrinsics.checkNotNullParameter(costCalculatorRepository, "");
        this.ShareDataUIState = costCalculatorRepository;
        CostCalculatorViewModelState costCalculatorViewModelState = new CostCalculatorViewModelState(null, null, null, null, null, null, false, false, null, null, 1023, null);
        this.component1 = costCalculatorViewModelState;
        MutableStateFlow<CostCalculatorViewModelState> MutableStateFlow = StateFlowKt.MutableStateFlow(costCalculatorViewModelState);
        this.copydefault = MutableStateFlow;
        final MutableStateFlow<CostCalculatorViewModelState> mutableStateFlow = MutableStateFlow;
        this.component3 = FlowKt.stateIn(new Flow<CostCalculatorUiState>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {
                private static int component3 = 1;
                private static int copydefault;
                final FlowCollector component2;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1$2", f = "CostCalculatorViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    private static int component1 = 1;
                    private static int component3;
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        int i2 = component1 + 107;
                        component3 = i2 % 128;
                        int i3 = i2 % 2;
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        Object objEmit = AnonymousClass2.this.emit(null, this);
                        int i4 = component3 + 51;
                        component1 = i4 % 128;
                        if (i4 % 2 == 0) {
                            int i5 = 9 / 0;
                        }
                        return objEmit;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r1 == 0) goto L17
                        r1 = r7
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                        int r2 = r1.label
                        r3 = -2147483648(0xffffffff80000000, float:-0.0)
                        r2 = r2 & r3
                        if (r2 == 0) goto L17
                        int r7 = r1.label
                        int r7 = r7 + r3
                        r1.label = r7
                        goto L1c
                    L17:
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1$2$1
                        r1.<init>(r7)
                    L1c:
                        java.lang.Object r7 = r1.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r3 = r1.label
                        r4 = 1
                        if (r3 == 0) goto L43
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.copydefault
                        int r6 = r6 + 25
                        int r1 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.component3 = r1
                        int r6 = r6 % r0
                        if (r6 != 0) goto L35
                        if (r3 != r4) goto L3b
                        goto L37
                    L35:
                        if (r3 != r4) goto L3b
                    L37:
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L70
                    L3b:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L43:
                        kotlin.ResultKt.throwOnFailure(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                        r3 = r1
                        kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModelState r6 = (com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModelState) r6
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorUiState r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModelKt.access$toUiState(r6)
                        r1.label = r4
                        java.lang.Object r6 = r7.emit(r6, r1)
                        if (r6 != r2) goto L70
                        int r6 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.component3
                        int r7 = r6 + 81
                        int r1 = r7 % 128
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.copydefault = r1
                        int r7 = r7 % r0
                        int r6 = r6 + 61
                        int r7 = r6 % 128
                        com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.copydefault = r7
                        int r6 = r6 % r0
                        if (r6 == 0) goto L6f
                        r6 = 85
                        int r6 = r6 / 0
                    L6f:
                        return r2
                    L70:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.component2 = flowCollector;
                }
            }

            @Override
            public Object collect(FlowCollector<? super CostCalculatorUiState> flowCollector, Continuation continuation) {
                int i = 2 % 2;
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    int i2 = component3 + 81;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    return objCollect;
                }
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 3;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), CostCalculatorViewModelKt.access$toUiState(costCalculatorViewModelState));
        ShareDataUIState(this, false, 1, null);
    }

    public final StateFlow<CostCalculatorUiState> getUiState() {
        int i = 2 % 2;
        int i2 = equals + 27;
        int i3 = i2 % 128;
        component2 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        StateFlow<CostCalculatorUiState> stateFlow = this.component3;
        int i4 = i3 + 93;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return stateFlow;
    }

    public final void onEvent(final CostCalculatorEvent event) {
        int i;
        int i2 = 2 % 2;
        Intrinsics.checkNotNullParameter(event, "");
        if (Intrinsics.areEqual(event, CostCalculatorEvent.CheckLipaCost.INSTANCE)) {
            ShareDataUIState();
            return;
        }
        if (Intrinsics.areEqual(event, CostCalculatorEvent.ClearError.INSTANCE)) {
            copydefault(new CostCalculatorViewModel$$ExternalSyntheticLambda0());
            i = equals + 105;
            component2 = i % 128;
        } else {
            if (Intrinsics.areEqual(event, CostCalculatorEvent.DismissLipaResult.INSTANCE)) {
                copydefault(new Function1() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = component2 + 3;
                        copydefault = i4 % 128;
                        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) obj;
                        if (i4 % 2 != 0) {
                            CostCalculatorViewModel.$r8$lambda$TbT5kCyBTE_hiFQBdJY6otp8sic(costCalculatorViewModelState);
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                        CostCalculatorViewModelState costCalculatorViewModelState$r8$lambda$TbT5kCyBTE_hiFQBdJY6otp8sic = CostCalculatorViewModel.$r8$lambda$TbT5kCyBTE_hiFQBdJY6otp8sic(costCalculatorViewModelState);
                        int i5 = copydefault + 91;
                        component2 = i5 % 128;
                        int i6 = i5 % 2;
                        return costCalculatorViewModelState$r8$lambda$TbT5kCyBTE_hiFQBdJY6otp8sic;
                    }
                });
                return;
            }
            if (event instanceof CostCalculatorEvent.SelectTab) {
                copydefault(new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = ShareDataUIState + 125;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        CostCalculatorViewModelState costCalculatorViewModelState$r8$lambda$fypgOgV4qehZUDSNNZgIvUWXw6Y = CostCalculatorViewModel.$r8$lambda$fypgOgV4qehZUDSNNZgIvUWXw6Y(event, (CostCalculatorViewModelState) obj);
                        int i6 = component1 + 89;
                        ShareDataUIState = i6 % 128;
                        int i7 = i6 % 2;
                        return costCalculatorViewModelState$r8$lambda$fypgOgV4qehZUDSNNZgIvUWXw6Y;
                    }
                });
                return;
            }
            if (event instanceof CostCalculatorEvent.UpdateLipaAmount) {
                copydefault(new Function1() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = component3 + 53;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        CostCalculatorViewModelState costCalculatorViewModelStateM11507$r8$lambda$a49cRXCDXFTR9B08zWSMthqR08 = CostCalculatorViewModel.m11507$r8$lambda$a49cRXCDXFTR9B08zWSMthqR08(event, (CostCalculatorViewModelState) obj);
                        int i6 = component1 + 23;
                        component3 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return costCalculatorViewModelStateM11507$r8$lambda$a49cRXCDXFTR9B08zWSMthqR08;
                        }
                        throw null;
                    }
                });
                return;
            }
            if (event instanceof CostCalculatorEvent.UpdateLipaShortCode) {
                copydefault(new Function1() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i3 = 2 % 2;
                        int i4 = ShareDataUIState + 99;
                        component3 = i4 % 128;
                        int i5 = i4 % 2;
                        CostCalculatorEvent costCalculatorEvent = event;
                        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) obj;
                        if (i5 != 0) {
                            return CostCalculatorViewModel.$r8$lambda$hAPD2YmLbSfMGuW8QCm3OWaXHWk(costCalculatorEvent, costCalculatorViewModelState);
                        }
                        CostCalculatorViewModelState costCalculatorViewModelState$r8$lambda$hAPD2YmLbSfMGuW8QCm3OWaXHWk = CostCalculatorViewModel.$r8$lambda$hAPD2YmLbSfMGuW8QCm3OWaXHWk(costCalculatorEvent, costCalculatorViewModelState);
                        int i6 = 81 / 0;
                        return costCalculatorViewModelState$r8$lambda$hAPD2YmLbSfMGuW8QCm3OWaXHWk;
                    }
                });
                return;
            } else {
                if (!(event instanceof CostCalculatorEvent.UpdateSendWithdrawAmount)) {
                    throw new NoWhenBranchMatchedException();
                }
                copydefault(new Function1() {
                    private static int component2 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke(Object obj) throws IOException {
                        int i3 = 2 % 2;
                        int i4 = component2 + 67;
                        copydefault = i4 % 128;
                        int i5 = i4 % 2;
                        CostCalculatorViewModelState costCalculatorViewModelStateM11506$r8$lambda$2z7B_rcg8u1VNKFs0iyf5Hp0E0 = CostCalculatorViewModel.m11506$r8$lambda$2z7B_rcg8u1VNKFs0iyf5Hp0E0(event, (CostCalculatorViewModelState) obj);
                        int i6 = copydefault + 93;
                        component2 = i6 % 128;
                        int i7 = i6 % 2;
                        return costCalculatorViewModelStateM11506$r8$lambda$2z7B_rcg8u1VNKFs0iyf5Hp0E0;
                    }
                });
                i = component2 + 83;
                equals = i % 128;
            }
        }
        int i3 = i % 2;
    }

    private static final CostCalculatorViewModelState ShareDataUIState(CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
        CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, false, false, null, null, 511, null);
        int i4 = equals + 113;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateCopy$default;
    }

    private static Object copydefault(Object[] objArr) {
        List list;
        CostCalculatorTab costCalculatorTab;
        String str;
        String str2;
        String str3;
        LipaCostResult lipaCostResult;
        boolean z;
        boolean z2;
        String str4;
        String str5;
        int i;
        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) objArr[0];
        int i2 = 2 % 2;
        int i3 = component2 + 15;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = false;
            str4 = null;
            str5 = null;
            i = 21982;
        } else {
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = false;
            str4 = null;
            str5 = null;
            i = 991;
        }
        CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, costCalculatorTab, str, str2, str3, lipaCostResult, z, z2, str4, str5, i, null);
        int i4 = component2 + 123;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return costCalculatorViewModelStateCopy$default;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static Object component1(Object[] objArr) {
        List list;
        CostCalculatorTab tab;
        String str;
        String str2;
        String str3;
        LipaCostResult lipaCostResult;
        boolean z;
        boolean z2;
        String str4;
        String str5;
        int i;
        CostCalculatorEvent costCalculatorEvent = (CostCalculatorEvent) objArr[0];
        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) objArr[1];
        int i2 = 2 % 2;
        int i3 = equals + 59;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            tab = ((CostCalculatorEvent.SelectTab) costCalculatorEvent).getTab();
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = true;
            str4 = null;
            str5 = null;
            i = 3464;
        } else {
            Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            tab = ((CostCalculatorEvent.SelectTab) costCalculatorEvent).getTab();
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = false;
            str4 = null;
            str5 = null;
            i = PointerIconCompat.TYPE_GRABBING;
        }
        return CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, tab, str, str2, str3, lipaCostResult, z, z2, str4, str5, i, null);
    }

    private static final CostCalculatorViewModelState component2(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = equals + 123;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
        Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
        CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, CostCalculatorViewModelKt.access$sanitizeDigits(((CostCalculatorEvent.UpdateLipaAmount) costCalculatorEvent).getValue()), null, false, false, null, null, 1007, null);
        int i4 = component2 + 95;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateCopy$default;
    }

    private static final CostCalculatorViewModelState ShareDataUIState(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 111;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
        Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
        CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, ((CostCalculatorEvent.UpdateLipaShortCode) costCalculatorEvent).getValue(), null, null, false, false, null, null, 1015, null);
        int i4 = equals + 31;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateCopy$default;
    }

    private static final CostCalculatorViewModelState component1(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) throws IOException {
        List list;
        CostCalculatorTab costCalculatorTab;
        String strAccess$sanitizeDigits;
        String str;
        String str2;
        LipaCostResult lipaCostResult;
        boolean z;
        boolean z2;
        String str3;
        String str4;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 35;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            strAccess$sanitizeDigits = CostCalculatorViewModelKt.access$sanitizeDigits(((CostCalculatorEvent.UpdateSendWithdrawAmount) costCalculatorEvent).getValue());
            str = null;
            str2 = null;
            lipaCostResult = null;
            z = true;
            z2 = true;
            str3 = null;
            str4 = null;
            i = 17618;
        } else {
            Intrinsics.checkNotNullParameter(costCalculatorEvent, "");
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            strAccess$sanitizeDigits = CostCalculatorViewModelKt.access$sanitizeDigits(((CostCalculatorEvent.UpdateSendWithdrawAmount) costCalculatorEvent).getValue());
            str = null;
            str2 = null;
            lipaCostResult = null;
            z = false;
            z2 = false;
            str3 = null;
            str4 = null;
            i = PointerIconCompat.TYPE_ZOOM_OUT;
        }
        return CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, costCalculatorTab, strAccess$sanitizeDigits, str, str2, lipaCostResult, z, z2, str3, str4, i, null);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1", f = "CostCalculatorViewModel.kt", i = {}, l = {66, 66}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component2;
        int component1;
        final boolean copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1<T> implements FlowCollector {
            private static int component3 = 1;
            private static int copydefault;
            final CostCalculatorViewModel component2;

            @Override
            public Object emit(Object obj, Continuation continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                component3 = i2 % 128;
                Resource<? extends List<CostCalculatorChargeBand>> resource = (Resource) obj;
                if (i2 % 2 != 0) {
                    return copydefault(resource, (Continuation<? super Unit>) continuation);
                }
                copydefault(resource, (Continuation<? super Unit>) continuation);
                throw null;
            }

            private static final CostCalculatorViewModelState copydefault(List list, CostCalculatorViewModelState costCalculatorViewModelState) {
                String str;
                int i = 2 % 2;
                int i2 = copydefault + 83;
                component3 = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(list, "");
                    Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
                    list.isEmpty();
                    list.isEmpty();
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
                boolean zIsEmpty = list.isEmpty();
                if (!(!list.isEmpty())) {
                    int i3 = copydefault + 77;
                    component3 = i3 % 128;
                    int i4 = i3 % 2;
                    str = "Fetching charges...";
                } else {
                    int i5 = copydefault + 51;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    str = null;
                }
                return CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, null, null, null, null, null, zIsEmpty, false, str, null, 702, null);
            }

            private static final CostCalculatorViewModelState ShareDataUIState(List list, CostCalculatorViewModelState costCalculatorViewModelState) {
                int i = 2 % 2;
                int i2 = copydefault + 97;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
                CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, null, null, null, null, null, false, false, null, null, 702, null);
                int i4 = component3 + 1;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return costCalculatorViewModelStateCopy$default;
            }

            private static final CostCalculatorViewModelState component3(CostCalculatorViewModelState costCalculatorViewModelState) {
                int i = 2 % 2;
                int i2 = component3 + 99;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
                    return CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, true, true, null, "Unable to fetch charges right now.", 6942, null);
                }
                Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
                return CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, false, false, null, "Unable to fetch charges right now.", 191, null);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object copydefault(com.safaricom.consumer.commons.resource.Resource<? extends java.util.List<com.huawei.digitalpayment.consumer.sfcui.api.model.CostCalculatorChargeBand>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                /*
                    r2 = this;
                    r4 = 2
                    int r0 = r4 % r4
                    int r0 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.component3
                    int r0 = r0 + 37
                    int r1 = r0 % 128
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.copydefault = r1
                    int r0 = r0 % r4
                    if (r0 == 0) goto L1a
                    boolean r0 = r3.isLoading()
                    r1 = 13
                    int r1 = r1 / 0
                    r1 = 1
                    if (r0 == r1) goto L20
                    goto L4b
                L1a:
                    boolean r0 = r3.isLoading()
                    if (r0 == 0) goto L4b
                L20:
                    java.lang.Object r3 = r3.getData()
                    java.util.List r3 = (java.util.List) r3
                    if (r3 != 0) goto L40
                    int r3 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.copydefault
                    int r3 = r3 + 125
                    int r0 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.component3 = r0
                    int r3 = r3 % r4
                    if (r3 != 0) goto L3c
                    java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                    r4 = 75
                    int r4 = r4 / 0
                    goto L40
                L3c:
                    java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                L40:
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel r4 = r2.component2
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda0
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.access$updateViewModelState(r4, r0)
                    goto L81
                L4b:
                    boolean r0 = r3.isSuccess()
                    if (r0 == 0) goto L71
                    java.lang.Object r3 = r3.getData()
                    java.util.List r3 = (java.util.List) r3
                    if (r3 != 0) goto L66
                    int r3 = com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.copydefault
                    int r3 = r3 + 71
                    int r0 = r3 % 128
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.component3 = r0
                    int r3 = r3 % r4
                    java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
                L66:
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel r4 = r2.component2
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda1 r0 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda1
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.access$updateViewModelState(r4, r0)
                    goto L81
                L71:
                    boolean r3 = r3.isError()
                    if (r3 == 0) goto L81
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel r3 = r2.component2
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda2 r4 = new com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$loadCharges$1$1$$ExternalSyntheticLambda2
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.access$updateViewModelState(r3, r4)
                L81:
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel.component2.AnonymousClass1.copydefault(com.safaricom.consumer.commons.resource.Resource, kotlin.coroutines.Continuation):java.lang.Object");
            }

            public static CostCalculatorViewModelState component3(List list, CostCalculatorViewModelState costCalculatorViewModelState) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CostCalculatorViewModelState costCalculatorViewModelStateShareDataUIState = ShareDataUIState(list, costCalculatorViewModelState);
                if (i3 == 0) {
                    int i4 = 4 / 0;
                }
                int i5 = copydefault + 61;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                return costCalculatorViewModelStateShareDataUIState;
            }

            public static CostCalculatorViewModelState ShareDataUIState(CostCalculatorViewModelState costCalculatorViewModelState) {
                int i = 2 % 2;
                int i2 = copydefault + 33;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CostCalculatorViewModelState costCalculatorViewModelStateComponent3 = component3(costCalculatorViewModelState);
                int i4 = component3 + 9;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return costCalculatorViewModelStateComponent3;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static CostCalculatorViewModelState component1(List list, CostCalculatorViewModelState costCalculatorViewModelState) {
                int i = 2 % 2;
                int i2 = copydefault + 99;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                CostCalculatorViewModelState costCalculatorViewModelStateCopydefault = copydefault(list, costCalculatorViewModelState);
                if (i3 == 0) {
                    int i4 = 76 / 0;
                }
                return costCalculatorViewModelStateCopydefault;
            }

            AnonymousClass1(CostCalculatorViewModel costCalculatorViewModel) {
                this.component2 = costCalculatorViewModel;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 17;
                component2 = i3 % 128;
                if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                obj = CostCalculatorViewModel.access$getRepository$p(CostCalculatorViewModel.this).getAllCharges(this.copydefault, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.component1 = 2;
            if (((Flow) obj).collect(new AnonymousClass1(CostCalculatorViewModel.this), this) == coroutine_suspended) {
                int i4 = component2 + 51;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return coroutine_suspended;
                }
                throw null;
            }
            return Unit.INSTANCE;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            int i = 2 % 2;
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
            if (objCopydefault == null) {
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionGroup(0L) + 33, (char) (19696 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 518907119, false, "component3", null);
            }
            int i2 = ((Field) objCopydefault).getInt(null);
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(37 - View.getDefaultSize(0, 0), TextUtils.lastIndexOf("", '0', 0) + 31, (char) ('0' - AndroidCharacter.getMirror('0')), 55511118, false, "component2", null);
            }
            int i3 = ((Field) objCopydefault2).getInt(null);
            long j = i3;
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getTapTimeout() >> 16), 30 - TextUtils.getCapsMode("", 0, 0), (char) ((-16777216) - Color.rgb(0, 0, 0)), 58536393, false, "component3", null);
            }
            int i4 = ((Field) objCopydefault3).getInt(null);
            long j2 = j;
            long j3 = -1;
            long j4 = 601225647051785980L ^ j3;
            long j5 = (((long) (-716)) * 601225647051785980L) + (((long) 1435) * 191477806592418444L) + (((long) (-1434)) * (j4 | 191477806592418444L));
            long j6 = 717;
            long jIdentityHashCode = System.identityHashCode(this);
            long j7 = jIdentityHashCode ^ j3;
            long j8 = 792633048925464316L ^ j3;
            long j9 = j4 | (j3 ^ 191477806592418444L);
            long j10 = j5 + ((((j7 | 191477806592418444L) ^ j3) | j8 | ((j9 | jIdentityHashCode) ^ j3)) * j6) + (j6 * (((jIdentityHashCode | 191477806592418444L) ^ j3) | ((j9 | j7) ^ j3) | j8));
            int i5 = component2 + 9;
            ShareDataUIState = i5 % 128;
            int i6 = i5 % 2;
            int i7 = 0;
            while (true) {
                for (int i8 = 0; i8 != 8; i8++) {
                    i4 = (((((int) (j2 >> i8)) & 255) + (i4 << 6)) + (i4 << 16)) - i4;
                }
                if (i7 != 0) {
                    break;
                }
                int i9 = ShareDataUIState + 125;
                component2 = i9 % 128;
                i7 = i9 % 2 != 0 ? i7 + 30 : i7 + 1;
                j2 = j10;
            }
            if (i4 == i2) {
                return ShareDataUIState(coroutineScope, continuation);
            }
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
            if (objCopydefault4 == null) {
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 67, TextUtils.indexOf((CharSequence) "", '0', 0) + 34, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 19696), 1457147715, false, "copydefault", null);
            }
            Object obj = ((Field) objCopydefault4).get(null);
            long j11 = -1;
            long j12 = ((long) (i2 ^ i3)) & ((((long) 0) << 32) | (j11 - ((j11 >> 63) << 32)));
            long j13 = 0;
            long j14 = j12 | (((long) 1) << 32) | (j13 - ((j13 >> 63) << 32));
            try {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault5 == null) {
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, Gravity.getAbsoluteGravity(0, 0) + 42, (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                Object[] objArr = {660976862, Long.valueOf(j14), obj, null, false, false};
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault6 == null) {
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(AndroidCharacter.getMirror('0') + 6514, (Process.myTid() >> 22) + 56, (char) (ViewConfiguration.getDoubleTapTimeout() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault6).invoke(objInvoke, objArr);
                throw new RuntimeException(String.valueOf(i3));
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component2(boolean z, Continuation<? super component2> continuation) {
            super(2, continuation);
            this.copydefault = z;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = CostCalculatorViewModel.this.new component2(this.copydefault, continuation);
            int i2 = ShareDataUIState + 117;
            component2 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 78 / 0;
            }
            return component2Var;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 67;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 98 / 0;
            }
            int i5 = ShareDataUIState + 27;
            component2 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 68 / 0;
            }
            return objInvokeSuspend;
        }
    }

    static void ShareDataUIState(CostCalculatorViewModel costCalculatorViewModel, boolean z, int i, Object obj) {
        int i2 = 2 % 2;
        if ((i & 1) != 0) {
            int i3 = equals + 23;
            component2 = i3 % 128;
            z = i3 % 2 != 0;
        }
        costCalculatorViewModel.ShareDataUIState(z);
        int i4 = equals + 7;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void ShareDataUIState(boolean z) {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component2(z, null), 3, null);
        int i2 = component2 + 105;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = equals + 5;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState value = this.copydefault.getValue();
        String lipaShortCode = value.getLipaShortCode();
        Long longOrNull = StringsKt.toLongOrNull(value.getLipaAmount());
        if (!StringsKt.isBlank(lipaShortCode) && longOrNull != null) {
            int i4 = component2 + 33;
            equals = i4 % 128;
            int i5 = i4 % 2;
            if (longOrNull.longValue() > 0) {
                if (longOrNull.longValue() > 250000) {
                    return;
                }
                onSubMenuSelected.ShareDataUIState(ViewModelKt.getViewModelScope(this), null, null, new component3(lipaShortCode, longOrNull, null), 3, null);
                return;
            } else {
                int i6 = component2 + 119;
                equals = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 4;
                }
            }
        }
        copydefault(new Function1() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final Object invoke(Object obj) {
                int i8 = 2 % 2;
                int i9 = component3 + 61;
                ShareDataUIState = i9 % 128;
                Object obj2 = null;
                CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) obj;
                if (i9 % 2 != 0) {
                    CostCalculatorViewModel.$r8$lambda$otKBlnKSIPxMfU4LIeEhYZXbIUY(costCalculatorViewModelState);
                    obj2.hashCode();
                    throw null;
                }
                CostCalculatorViewModelState costCalculatorViewModelState$r8$lambda$otKBlnKSIPxMfU4LIeEhYZXbIUY = CostCalculatorViewModel.$r8$lambda$otKBlnKSIPxMfU4LIeEhYZXbIUY(costCalculatorViewModelState);
                int i10 = ShareDataUIState + 47;
                component3 = i10 % 128;
                if (i10 % 2 != 0) {
                    return costCalculatorViewModelState$r8$lambda$otKBlnKSIPxMfU4LIeEhYZXbIUY;
                }
                throw null;
            }
        });
    }

    private static final CostCalculatorViewModelState component3(CostCalculatorViewModelState costCalculatorViewModelState) {
        List list;
        CostCalculatorTab costCalculatorTab;
        String str;
        String str2;
        String str3;
        LipaCostResult lipaCostResult;
        boolean z;
        boolean z2;
        String str4;
        String str5;
        int i;
        int i2 = 2 % 2;
        int i3 = component2 + 55;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = true;
            str4 = null;
            str5 = "Enter a valid paybill or till number and amount.";
            i = 4657;
        } else {
            Intrinsics.checkNotNullParameter(costCalculatorViewModelState, "");
            list = null;
            costCalculatorTab = null;
            str = null;
            str2 = null;
            str3 = null;
            lipaCostResult = null;
            z = false;
            z2 = false;
            str4 = null;
            str5 = "Enter a valid paybill or till number and amount.";
            i = 511;
        }
        CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, list, costCalculatorTab, str, str2, str3, lipaCostResult, z, z2, str4, str5, i, null);
        int i4 = component2 + 95;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            return costCalculatorViewModelStateCopy$default;
        }
        throw null;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.costcalculator.CostCalculatorViewModel$checkLipaCost$2", f = "CostCalculatorViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int getRequestBeneficiariesState = 1;
        final String ShareDataUIState;
        int component1;
        final Long copydefault;

        public static Object component1(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
            int i7 = ~(i2 | i3);
            int i8 = (~i5) | (~i3);
            int i9 = (~i8) | i2;
            int i10 = (~(i3 | i5)) | (~((~i2) | i5)) | (~(i8 | i2));
            int i11 = i5 + i2 + i + ((-101282902) * i6) + ((-829309908) * i4);
            int i12 = i11 * i11;
            int i13 = ((i5 * 42798203) - 224002048) + (42798203 * i2) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i) + (1710751744 * i6) + ((-1643118592) * i4) + ((-1134166016) * i12);
            int i14 = (i5 * 1745018779) + 1790267665 + (i2 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i * 1745018721) + (i6 * (-1587019414)) + (i4 * (-1871011668)) + (i12 * 1017511936);
            return i13 + ((i14 * i14) * (-1139146752)) != 1 ? copydefault(objArr) : ShareDataUIState(objArr);
        }

        private static final CostCalculatorViewModelState copydefault(CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 111;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, false, true, "Checking transaction cost...", null, 639, null);
            int i4 = getRequestBeneficiariesState + 103;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return costCalculatorViewModelStateCopy$default;
        }

        private static final CostCalculatorViewModelState component2(CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            int i2 = component3 + 7;
            getRequestBeneficiariesState = i2 % 128;
            CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = i2 % 2 == 0 ? CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, true, false, null, "Unable to calculate this transaction cost.", 66, null) : CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, false, false, null, "Unable to calculate this transaction cost.", 127, null);
            int i3 = getRequestBeneficiariesState + 5;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return costCalculatorViewModelStateCopy$default;
            }
            throw null;
        }

        private static final CostCalculatorViewModelState component3(String str, LipaTransactionCost lipaTransactionCost, Long l, CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, new LipaCostResult(str, lipaTransactionCost.getShortCode(), (int) l.longValue(), lipaTransactionCost.getFee()), false, false, null, null, TypedValues.MotionType.TYPE_PATHMOTION_ARC, null);
            int i2 = component3 + 99;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            return costCalculatorViewModelStateCopy$default;
        }

        private static final CostCalculatorViewModelState component1(Resource resource, CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            String strAccess$toDisplayMessage = CostCalculatorViewModelKt.access$toDisplayMessage(resource.getErrorType());
            if (strAccess$toDisplayMessage == null) {
                int i2 = getRequestBeneficiariesState + 117;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                strAccess$toDisplayMessage = "Unable to verify that paybill or till number.";
            }
            CostCalculatorViewModelState costCalculatorViewModelStateCopy$default = CostCalculatorViewModelState.copy$default(costCalculatorViewModelState, null, null, null, null, null, null, false, false, null, strAccess$toDisplayMessage, 127, null);
            int i4 = getRequestBeneficiariesState + 89;
            component3 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 10 / 0;
            }
            return costCalculatorViewModelStateCopy$default;
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = getRequestBeneficiariesState + 11;
                int i4 = i3 % 128;
                component3 = i4;
                int i5 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i4 + 7;
                getRequestBeneficiariesState = i6 % 128;
                if (i6 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    str.hashCode();
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                CostCalculatorViewModel.access$updateViewModelState(CostCalculatorViewModel.this, new Function1() {
                    private static int component2 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i7 = 2 % 2;
                        int i8 = component3 + 13;
                        component2 = i8 % 128;
                        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) obj2;
                        if (i8 % 2 != 0) {
                            int iCopydefault = NavigationBarView.AnonymousClass1.copydefault();
                            return (CostCalculatorViewModelState) CostCalculatorViewModel.component3.component1(NavigationBarView.AnonymousClass1.copydefault(), new Object[]{costCalculatorViewModelState}, -45578977, iCopydefault, NavigationBarView.AnonymousClass1.copydefault(), 45578977, NavigationBarView.AnonymousClass1.copydefault());
                        }
                        int iCopydefault2 = NavigationBarView.AnonymousClass1.copydefault();
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }
                });
                this.component1 = 1;
                obj = CostCalculatorViewModel.access$getRepository$p(CostCalculatorViewModel.this).checkLipaTransactionCost(this.ShareDataUIState, (int) this.copydefault.longValue(), this);
                if (obj == coroutine_suspended) {
                    int i7 = getRequestBeneficiariesState + 73;
                    component3 = i7 % 128;
                    int i8 = i7 % 2;
                    return coroutine_suspended;
                }
            }
            final Resource resource = (Resource) obj;
            if (resource.isSuccess()) {
                int i9 = getRequestBeneficiariesState + 27;
                component3 = i9 % 128;
                int i10 = i9 % 2;
                final LipaTransactionCost lipaTransactionCost = (LipaTransactionCost) resource.getData();
                if (lipaTransactionCost == null) {
                    CostCalculatorViewModel.access$updateViewModelState(CostCalculatorViewModel.this, new Function1() {
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;

                        @Override
                        public final Object invoke(Object obj2) {
                            int i11 = 2 % 2;
                            int i12 = component1 + 47;
                            ShareDataUIState = i12 % 128;
                            int i13 = i12 % 2;
                            CostCalculatorViewModelState costCalculatorViewModelStateShareDataUIState = CostCalculatorViewModel.component3.ShareDataUIState((CostCalculatorViewModelState) obj2);
                            if (i13 != 0) {
                                int i14 = 17 / 0;
                            }
                            int i15 = component1 + 99;
                            ShareDataUIState = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = 97 / 0;
                            }
                            return costCalculatorViewModelStateShareDataUIState;
                        }
                    });
                    return Unit.INSTANCE;
                }
                String merchantName = lipaTransactionCost.getMerchantName();
                str = StringsKt.isBlank(merchantName) ? null : merchantName;
                if (str == null) {
                    str = this.ShareDataUIState;
                }
                CostCalculatorViewModel costCalculatorViewModel = CostCalculatorViewModel.this;
                final Long l = this.copydefault;
                CostCalculatorViewModel.access$updateViewModelState(costCalculatorViewModel, new Function1() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = component1 + 69;
                        copydefault = i12 % 128;
                        int i13 = i12 % 2;
                        Object[] objArr = {str, lipaTransactionCost, l, (CostCalculatorViewModelState) obj2};
                        int iCopydefault = NavigationBarView.AnonymousClass1.copydefault();
                        CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) CostCalculatorViewModel.component3.component1(NavigationBarView.AnonymousClass1.copydefault(), objArr, 634441530, iCopydefault, NavigationBarView.AnonymousClass1.copydefault(), -634441529, NavigationBarView.AnonymousClass1.copydefault());
                        int i14 = copydefault + 73;
                        component1 = i14 % 128;
                        int i15 = i14 % 2;
                        return costCalculatorViewModelState;
                    }
                });
            } else if (resource.isError()) {
                CostCalculatorViewModel.access$updateViewModelState(CostCalculatorViewModel.this, new Function1() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public final Object invoke(Object obj2) {
                        int i11 = 2 % 2;
                        int i12 = ShareDataUIState + 7;
                        component2 = i12 % 128;
                        int i13 = i12 % 2;
                        CostCalculatorViewModelState costCalculatorViewModelStateShareDataUIState = CostCalculatorViewModel.component3.ShareDataUIState(resource, (CostCalculatorViewModelState) obj2);
                        int i14 = ShareDataUIState + 113;
                        component2 = i14 % 128;
                        int i15 = i14 % 2;
                        return costCalculatorViewModelStateShareDataUIState;
                    }
                });
                int i11 = component3 + 73;
                getRequestBeneficiariesState = i11 % 128;
                int i12 = i11 % 2;
            }
            return Unit.INSTANCE;
        }

        public static CostCalculatorViewModelState ShareDataUIState(String str, LipaTransactionCost lipaTransactionCost, Long l, CostCalculatorViewModelState costCalculatorViewModelState) {
            int iCopydefault = NavigationBarView.AnonymousClass1.copydefault();
            return (CostCalculatorViewModelState) component1(NavigationBarView.AnonymousClass1.copydefault(), new Object[]{str, lipaTransactionCost, l, costCalculatorViewModelState}, 634441530, iCopydefault, NavigationBarView.AnonymousClass1.copydefault(), -634441529, NavigationBarView.AnonymousClass1.copydefault());
        }

        public static CostCalculatorViewModelState component3(CostCalculatorViewModelState costCalculatorViewModelState) {
            int iCopydefault = NavigationBarView.AnonymousClass1.copydefault();
            return (CostCalculatorViewModelState) component1(NavigationBarView.AnonymousClass1.copydefault(), new Object[]{costCalculatorViewModelState}, -45578977, iCopydefault, NavigationBarView.AnonymousClass1.copydefault(), 45578977, NavigationBarView.AnonymousClass1.copydefault());
        }

        public static CostCalculatorViewModelState ShareDataUIState(Resource resource, CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            int i2 = component3 + 117;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorViewModelState costCalculatorViewModelStateComponent1 = component1(resource, costCalculatorViewModelState);
            int i4 = getRequestBeneficiariesState + 39;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return costCalculatorViewModelStateComponent1;
        }

        public static CostCalculatorViewModelState ShareDataUIState(CostCalculatorViewModelState costCalculatorViewModelState) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 71;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorViewModelState costCalculatorViewModelStateComponent2 = component2(costCalculatorViewModelState);
            int i4 = component3 + 39;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return costCalculatorViewModelStateComponent2;
            }
            throw null;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        component3(String str, Long l, Continuation<? super component3> continuation) {
            super(2, continuation);
            this.ShareDataUIState = str;
            this.copydefault = l;
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = CostCalculatorViewModel.this.new component3(this.ShareDataUIState, this.copydefault, continuation);
            int i2 = getRequestBeneficiariesState + 51;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                return component3Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component3 + 41;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 52 / 0;
            }
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = getRequestBeneficiariesState + 125;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            return objInvokeSuspend;
        }

        private static Object copydefault(Object[] objArr) {
            CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) objArr[0];
            int i = 2 % 2;
            int i2 = component3 + 67;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefault(costCalculatorViewModelState);
            }
            copydefault(costCalculatorViewModelState);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static Object ShareDataUIState(Object[] objArr) {
            String str = (String) objArr[0];
            LipaTransactionCost lipaTransactionCost = (LipaTransactionCost) objArr[1];
            Long l = (Long) objArr[2];
            CostCalculatorViewModelState costCalculatorViewModelState = (CostCalculatorViewModelState) objArr[3];
            int i = 2 % 2;
            int i2 = component3 + 49;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            CostCalculatorViewModelState costCalculatorViewModelStateComponent3 = component3(str, lipaTransactionCost, l, costCalculatorViewModelState);
            int i4 = getRequestBeneficiariesState + 103;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return costCalculatorViewModelStateComponent3;
            }
            throw null;
        }
    }

    private final void copydefault(Function1<? super CostCalculatorViewModelState, CostCalculatorViewModelState> function1) {
        CostCalculatorViewModelState value;
        int i = 2 % 2;
        int i2 = component2 + 45;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            MutableStateFlow<CostCalculatorViewModelState> mutableStateFlow = this.copydefault;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, function1.invoke(value)));
            return;
        }
        throw null;
    }

    public static CostCalculatorViewModelState m11506$r8$lambda$2z7B_rcg8u1VNKFs0iyf5Hp0E0(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) throws IOException {
        int i = 2 % 2;
        int i2 = component2 + 5;
        equals = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelStateComponent1 = component1(costCalculatorEvent, costCalculatorViewModelState);
        int i4 = equals + 19;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateComponent1;
    }

    public static CostCalculatorViewModelState $r8$lambda$TbT5kCyBTE_hiFQBdJY6otp8sic(CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = equals + 79;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iComponent1 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        int iComponent12 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        CostCalculatorViewModelState costCalculatorViewModelState2 = (CostCalculatorViewModelState) copydefault(iComponent1, 1329344638, -1329344638, PopularScreenKt$$ExternalSyntheticLambda0.component1(), iComponent12, new Object[]{costCalculatorViewModelState}, PopularScreenKt$$ExternalSyntheticLambda0.component1());
        int i4 = equals + 37;
        component2 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 91 / 0;
        }
        return costCalculatorViewModelState2;
    }

    public static CostCalculatorViewModelState $r8$lambda$TtNkrshkCPM5hh1ZrBA8dMWViC0(CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 3;
        equals = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelStateShareDataUIState = ShareDataUIState(costCalculatorViewModelState);
        int i4 = equals + 83;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateShareDataUIState;
    }

    public static CostCalculatorViewModelState m11507$r8$lambda$a49cRXCDXFTR9B08zWSMthqR08(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        equals = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelStateComponent2 = component2(costCalculatorEvent, costCalculatorViewModelState);
        if (i3 == 0) {
            int i4 = 62 / 0;
        }
        return costCalculatorViewModelStateComponent2;
    }

    public static CostCalculatorViewModelState $r8$lambda$fypgOgV4qehZUDSNNZgIvUWXw6Y(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = equals + 95;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        int iComponent1 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        int iComponent12 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        CostCalculatorViewModelState costCalculatorViewModelState2 = (CostCalculatorViewModelState) copydefault(iComponent1, -1531393901, 1531393902, PopularScreenKt$$ExternalSyntheticLambda0.component1(), iComponent12, new Object[]{costCalculatorEvent, costCalculatorViewModelState}, PopularScreenKt$$ExternalSyntheticLambda0.component1());
        int i4 = component2 + 5;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelState2;
    }

    public static CostCalculatorViewModelState $r8$lambda$hAPD2YmLbSfMGuW8QCm3OWaXHWk(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 29;
        equals = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelStateShareDataUIState = ShareDataUIState(costCalculatorEvent, costCalculatorViewModelState);
        int i4 = component2 + 115;
        equals = i4 % 128;
        int i5 = i4 % 2;
        return costCalculatorViewModelStateShareDataUIState;
    }

    public static CostCalculatorViewModelState $r8$lambda$otKBlnKSIPxMfU4LIeEhYZXbIUY(CostCalculatorViewModelState costCalculatorViewModelState) {
        int i = 2 % 2;
        int i2 = component2 + 117;
        equals = i2 % 128;
        int i3 = i2 % 2;
        CostCalculatorViewModelState costCalculatorViewModelStateComponent3 = component3(costCalculatorViewModelState);
        int i4 = equals + 49;
        component2 = i4 % 128;
        if (i4 % 2 == 0) {
            return costCalculatorViewModelStateComponent3;
        }
        throw null;
    }

    static {
        int i = 81 % 2;
    }

    private static final CostCalculatorViewModelState copydefault(CostCalculatorViewModelState costCalculatorViewModelState) {
        int iComponent1 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        int iComponent12 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        return (CostCalculatorViewModelState) copydefault(iComponent1, 1329344638, -1329344638, PopularScreenKt$$ExternalSyntheticLambda0.component1(), iComponent12, new Object[]{costCalculatorViewModelState}, PopularScreenKt$$ExternalSyntheticLambda0.component1());
    }

    private static final CostCalculatorViewModelState component3(CostCalculatorEvent costCalculatorEvent, CostCalculatorViewModelState costCalculatorViewModelState) {
        int iComponent1 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        int iComponent12 = PopularScreenKt$$ExternalSyntheticLambda0.component1();
        return (CostCalculatorViewModelState) copydefault(iComponent1, -1531393901, 1531393902, PopularScreenKt$$ExternalSyntheticLambda0.component1(), iComponent12, new Object[]{costCalculatorEvent, costCalculatorViewModelState}, PopularScreenKt$$ExternalSyntheticLambda0.component1());
    }
}
