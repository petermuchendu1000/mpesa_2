package com.huawei.digitalpayment.consumer.scheduleui.ui.activity;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.schedule.constants.ScheduleConstants;
import com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentTypeUiState;
import com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType;
import com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentTypeViewModel;
import com.huawei.digitalpayment.consumer.scheduleui.R;
import com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivitySelectTypeBinding;
import com.huawei.digitalpayment.consumer.scheduleui.ui.adapter.AutomaticPaymentHeaderAdapter;
import com.huawei.payment.mvvm.DataBindingAdapter;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.FullyDrawnReporterExternalSyntheticLambda0;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function2;
import kotlin.removeOnReportDrawnListener;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scheduleui/ui/activity/SelectAutomaticTypeActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/scheduleui/databinding/ScheduleActivitySelectTypeBinding;", "Lcom/huawei/digitalpayment/consumer/schedule/viewmodel/AutomaticPaymentTypeViewModel;", "<init>", "()V", "automaticPaymentHeaderAdapter", "Lcom/huawei/digitalpayment/consumer/scheduleui/ui/adapter/AutomaticPaymentHeaderAdapter;", "initToolbar", "", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "ConsumerSchedulePaymentUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SelectAutomaticTypeActivity extends Hilt_SelectAutomaticTypeActivity<ScheduleActivitySelectTypeBinding, AutomaticPaymentTypeViewModel> {
    private static char ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static int[] component3;
    private static int component4;
    private static int copydefault;
    private final AutomaticPaymentHeaderAdapter automaticPaymentHeaderAdapter = new AutomaticPaymentHeaderAdapter();
    private static final byte[] $$l = {110, -114, 93, -109};
    private static final int $$o = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {126, 1, Ascii.SUB, -71, -9, 5, 66, -54, -5, 3, Ascii.VT, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -56, -2, -3, Ascii.DC2, -10, 7, Ascii.DLE, -8, 65, -73, 3, Ascii.DC2, -18, 10, -14, Ascii.DLE, 36, -26, -16, Ascii.SYN, Ascii.SI, Ascii.SI, -7, -30, Ascii.SYN, -16, Ascii.DC2, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 68, -9, 5, 0, 4, 4, Ascii.FF, -6, -3, 69};
    private static final int $$k = 28;
    private static final byte[] $$d = {104, -2, Ascii.CAN, -74, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 91;
    private static int copy = 1;
    private static int getAsAtTimestamp = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, byte r6, int r7) {
        /*
            int r5 = r5 * 3
            int r5 = 4 - r5
            int r7 = r7 * 3
            int r7 = r7 + 1
            int r6 = 115 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.$$l
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r7
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.$$r(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.$$d
            int r8 = 28 - r8
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2b:
            int r3 = -r3
            int r9 = r9 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.h(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 16
            int r9 = 99 - r9
            int r8 = r8 * 2
            int r8 = 42 - r8
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.$$j
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.i(int, byte, byte, java.lang.Object[]):void");
    }

    public static final AutomaticPaymentHeaderAdapter access$getAutomaticPaymentHeaderAdapter$p(SelectAutomaticTypeActivity selectAutomaticTypeActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 97;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        AutomaticPaymentHeaderAdapter automaticPaymentHeaderAdapter = selectAutomaticTypeActivity.automaticPaymentHeaderAdapter;
        int i5 = i3 + 89;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return automaticPaymentHeaderAdapter;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ViewModel access$getViewModel$p(SelectAutomaticTypeActivity selectAutomaticTypeActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 55;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = selectAutomaticTypeActivity.viewModel;
        if (i3 != 0) {
            return vm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 107;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            super.initToolbar(getString(R.string.schedule_payment_type_title1));
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        super.initToolbar(getString(R.string.schedule_payment_type_title1));
        int i3 = getAsAtTimestamp + 75;
        equals = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 21 / 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2", f = "SelectAutomaticTypeActivity.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1", f = "SelectAutomaticTypeActivity.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final SelectAutomaticTypeActivity component1;
            int component3;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "schedulePaymentTypes", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$2", f = "SelectAutomaticTypeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends SchedulePaymentType>, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;
                Object component1;
                final SelectAutomaticTypeActivity component2;
                int component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 125;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component3 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = ShareDataUIState + 1;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    SelectAutomaticTypeActivity.access$getAutomaticPaymentHeaderAdapter$p(this.component2).submitList((List) this.component1);
                    Unit unit = Unit.INSTANCE;
                    int i6 = copydefault + 117;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(SelectAutomaticTypeActivity selectAutomaticTypeActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component2 = selectAutomaticTypeActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, continuation);
                    anonymousClass2.component1 = obj;
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = ShareDataUIState + 91;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 47 / 0;
                    }
                    return anonymousClass22;
                }

                @Override
                public Object invoke(List<? extends SchedulePaymentType> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 25;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(list, continuation);
                    int i4 = copydefault + 113;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objCopydefault;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object copydefault(List<SchedulePaymentType> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 59;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 101;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component2 + 23;
                copydefault = i2 % 128;
                Object obj2 = null;
                if (i2 % 2 == 0) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    obj2.hashCode();
                    throw null;
                }
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.component3;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AutomaticPaymentTypeUiState> stateFlowUiState = ((AutomaticPaymentTypeViewModel) SelectAutomaticTypeActivity.access$getViewModel$p(this.component1)).uiState();
                    this.component3 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<List<? extends SchedulePaymentType>>() {
                        private static int component1 = 1;
                        private static int component3;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component1 = 1;
                            private static int copydefault;
                            final FlowCollector ShareDataUIState;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2", f = "SelectAutomaticTypeActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = copydefault + 97;
                                    ShareDataUIState = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i3 == 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
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
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L34
                                    int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r1 = r1 + 63
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    if (r1 != 0) goto L2b
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L34
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 57
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r7 = r7 % r0
                                    goto L39
                                L2b:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1 r7 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r7
                                    int r6 = r7.label
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                L34:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L39:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L52
                                    if (r3 != r4) goto L4a
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L69
                                L4a:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L52:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.ShareDataUIState
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentTypeUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentTypeUiState) r6
                                    java.util.List r6 = r6.getSchedulePaymentTypes()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L69
                                    return r2
                                L69:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + 23
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r1
                                    int r7 = r7 % r0
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity$onCreate$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.ShareDataUIState = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<? extends SchedulePaymentType>> flowCollector, Continuation continuation) {
                            int i4 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return Unit.INSTANCE;
                            }
                            int i5 = component1;
                            int i6 = i5 + 103;
                            component3 = i6 % 128;
                            if (i6 % 2 != 0) {
                                throw null;
                            }
                            int i7 = i5 + 73;
                            component3 = i7 % 128;
                            if (i7 % 2 != 0) {
                                int i8 = 53 / 0;
                            }
                            return objCollect;
                        }
                    }), new AnonymousClass2(this.component1, null)), this) == coroutine_suspended) {
                        int i4 = component2;
                        int i5 = i4 + 59;
                        copydefault = i5 % 128;
                        int i6 = i5 % 2;
                        int i7 = i4 + 99;
                        copydefault = i7 % 128;
                        if (i7 % 2 != 0) {
                            return coroutine_suspended;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass5(SelectAutomaticTypeActivity selectAutomaticTypeActivity, Continuation<? super AnonymousClass5> continuation) {
                super(2, continuation);
                this.component1 = selectAutomaticTypeActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component1, continuation);
                int i2 = component2 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass5;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                int i4 = copydefault + 73;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objCopydefault;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 119;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 81;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objInvokeSuspend;
                }
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 107;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i5 = component1 + 109;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SelectAutomaticTypeActivity.this, Lifecycle.State.CREATED, new AnonymousClass5(SelectAutomaticTypeActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = SelectAutomaticTypeActivity.this.new component2(continuation);
            int i2 = component1 + 61;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 69;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 93 / 0;
            }
            return objInvokeSuspend;
        }

        public static void component3() {
            FullyDrawnReporterExternalSyntheticLambda0.ShareDataUIState[0] = removeOnReportDrawnListener.ShareDataUIState[0];
        }
    }

    private static void g(int i, char[] cArr, char[] cArr2, char[] cArr3, char c2, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4036 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 31, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19180), 1912513118, false, $$r(b2, (byte) (b2 | Ascii.DLE), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7568 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 11, (char) KeyEvent.normalizeMetaState(0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 2459, 27 - TextUtils.indexOf((CharSequence) "", '0', 0), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 931716605, false, $$r(b3, (byte) (b3 | 17), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (Process.myTid() >> 22), 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component2 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) copydefault) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) ShareDataUIState) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i3 = $11 + 101;
                $10 = i3 % 128;
                int i4 = i3 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 1;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2;
        int i5 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = component3;
        int i6 = 684241640;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int i9 = $11 + 101;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i10 = $10 + 117;
                $11 = i10 % 128;
                if (i10 % i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i3])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i6);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionChild(0L) + 4392, 37 - (Process.myPid() >> 22), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -309236339, false, $$r(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE});
                        }
                        iArr2[i3] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr3[i3])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 4391, 37 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) View.resolveSize(0, 0), -309236339, false, $$r(b3, (byte) (b3 | 9), b3), new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                }
                i3++;
                i4 = 2;
                i6 = 684241640;
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        int i11 = 3;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                int i13 = $11 + i11;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    try {
                        Object[] objArr4 = new Object[i7];
                        objArr4[i8] = Integer.valueOf(iArr5[i12]);
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) i8;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(i8) + 4391, 37 - View.resolveSizeAndState(i8, i8, i8), (char) (ViewConfiguration.getLongPressTimeout() >> 16), -309236339, false, $$r(b4, (byte) (b4 | 9), b4), new Class[]{Integer.TYPE});
                        }
                        iArr6[i12] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    Object[] objArr5 = {Integer.valueOf(iArr5[i12])};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 4391, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 36, (char) KeyEvent.normalizeMetaState(0), -309236339, false, $$r(b5, (byte) (b5 | 9), b5), new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    i12++;
                }
                i11 = 3;
                i7 = 1;
                i8 = 0;
            }
            int i14 = $11 + 3;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        getactivenotifications.component1 = i2;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i2] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i16 = $10 + 7;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < 16; i18++) {
                getactivenotifications.ShareDataUIState ^= iArr4[i18];
                Object[] objArr6 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault5 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2967 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - KeyEvent.keyCodeFromString(""), (char) (49870 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 462826032, false, $$r(b6, (byte) (b6 | Ascii.VT), b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault5).invoke(null, objArr6)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i19 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i19;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i20 = getactivenotifications.ShareDataUIState;
            int i21 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr7 = {getactivenotifications, getactivenotifications};
            Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault6 == null) {
                byte b7 = (byte) 0;
                objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (Process.myPid() >> 22), Color.alpha(0) + 24, (char) (27638 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), -1616366948, false, $$r(b7, (byte) (b7 | 8), b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault6).invoke(null, objArr7);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        byte b2 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = component1;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 87;
                $11 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(656 - Process.getGidForName(""), (Process.myTid() >> 22) + 14, (char) (65118 - View.combineMeasuredStates(0, 0)), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 5;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i12 = $10 + 117;
                $11 = i12 % 128;
                if (i12 % 2 != 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != b2 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    char c3 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr3 = new Object[2];
                    objArr3[b2] = Integer.valueOf(c2);
                    objArr3[0] = Integer.valueOf(c3);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        int i14 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 3580;
                        int i15 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 28;
                        char threadPriority = (char) ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        String str$$r = $$r(b3, b4, b4);
                        Class[] clsArr = new Class[2];
                        clsArr[0] = Integer.TYPE;
                        clsArr[b2] = Integer.TYPE;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i14, i15, threadPriority, 1180380354, false, str$$r, clsArr);
                    }
                    cArr4[i13] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i16 = iTrustedWebActivityService_Parcel.copydefault;
                    char c4 = cArr3[iTrustedWebActivityService_Parcel.copydefault];
                    Object[] objArr4 = new Object[2];
                    objArr4[b2] = Integer.valueOf(c2);
                    objArr4[0] = Integer.valueOf(c4);
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        int i17 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4501;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37;
                        char c5 = (char) (27897 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)));
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 5);
                        String str$$r2 = $$r(b5, b6, (byte) (b6 - 5));
                        Class[] clsArr2 = new Class[2];
                        clsArr2[0] = Integer.TYPE;
                        clsArr2[b2] = Integer.TYPE;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i17, iIndexOf, c5, -1464227204, false, str$$r2, clsArr2);
                    }
                    cArr4[i16] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 + 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1860 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 34 - TextUtils.indexOf("", "", 0, 0), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 80302927, false, $$r(b7, b8, (byte) (b8 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                b2 = 1;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i18 = $11 + 83;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i20 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i20, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i20);
        }
        if (z) {
            int i21 = $10 + 1;
            $11 = i21 % 128;
            int i22 = i21 % 2;
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr3[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr3[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr3[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static final void onCreate$lambda$0(DataBindingAdapter dataBindingAdapter, View view, int i, SchedulePaymentType schedulePaymentType) {
        int i2 = 2 % 2;
        Bundle bundle = new Bundle();
        bundle.putSerializable(ScheduleConstants.SCHEDULE_PAYMENT_TYPE, schedulePaymentType);
        RouteUtils.routeWithExecute(RoutePathConstants.CREATE_AUTOMATIC_PAYMENT, bundle);
        int i3 = equals + 109;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0094  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 39;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.schedule_activity_select_type;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d5  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01da A[PHI: r12 r15
  0x01da: PHI (r12v23 char) = (r12v22 char), (r12v134 char) binds: [B:3:0x01c1, B:7:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x01da: PHI (r15v9 int) = (r15v8 int), (r15v114 int) binds: [B:3:0x01c1, B:7:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x099a A[Catch: all -> 0x0475, TryCatch #44 {all -> 0x0475, blocks: (B:151:0x0994, B:153:0x099a, B:154:0x09c8, B:267:0x0f54, B:269:0x0f5a, B:270:0x0f82, B:446:0x1890, B:448:0x1896, B:449:0x18c5, B:748:0x315e, B:750:0x3164, B:751:0x318f, B:785:0x34ba, B:787:0x34c0, B:788:0x34e3, B:765:0x32ea, B:767:0x330d, B:768:0x3364, B:714:0x2e13, B:716:0x2e19, B:717:0x2e44, B:611:0x2721, B:613:0x2727, B:614:0x274d, B:616:0x2787, B:617:0x27d0, B:584:0x245b, B:586:0x2470, B:587:0x249e, B:810:0x35c5, B:812:0x35cb, B:813:0x35f5, B:815:0x362f, B:816:0x366c, B:553:0x1ff5, B:555:0x200a, B:556:0x2037, B:558:0x206b, B:559:0x20e1, B:532:0x1d91, B:534:0x1d97, B:535:0x1dc5, B:312:0x1179, B:314:0x117f, B:315:0x11a5, B:22:0x0201, B:24:0x0207, B:25:0x0235, B:27:0x03e3, B:29:0x0415, B:30:0x046f), top: B:911:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0b0f A[Catch: all -> 0x0ebe, TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x0ebe, blocks: (B:158:0x0a51, B:165:0x0aa4, B:174:0x0b0f), top: B:868:0x0a51 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0d5b A[Catch: all -> 0x0eb9, TryCatch #17 {all -> 0x0eb9, blocks: (B:208:0x0d51, B:209:0x0d55, B:211:0x0d5b, B:214:0x0d76, B:176:0x0b1d, B:194:0x0c2e, B:198:0x0c7d, B:204:0x0cee, B:207:0x0d49), top: B:861:0x0b1d }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0f5a A[Catch: all -> 0x0475, TryCatch #44 {all -> 0x0475, blocks: (B:151:0x0994, B:153:0x099a, B:154:0x09c8, B:267:0x0f54, B:269:0x0f5a, B:270:0x0f82, B:446:0x1890, B:448:0x1896, B:449:0x18c5, B:748:0x315e, B:750:0x3164, B:751:0x318f, B:785:0x34ba, B:787:0x34c0, B:788:0x34e3, B:765:0x32ea, B:767:0x330d, B:768:0x3364, B:714:0x2e13, B:716:0x2e19, B:717:0x2e44, B:611:0x2721, B:613:0x2727, B:614:0x274d, B:616:0x2787, B:617:0x27d0, B:584:0x245b, B:586:0x2470, B:587:0x249e, B:810:0x35c5, B:812:0x35cb, B:813:0x35f5, B:815:0x362f, B:816:0x366c, B:553:0x1ff5, B:555:0x200a, B:556:0x2037, B:558:0x206b, B:559:0x20e1, B:532:0x1d91, B:534:0x1d97, B:535:0x1dc5, B:312:0x1179, B:314:0x117f, B:315:0x11a5, B:22:0x0201, B:24:0x0207, B:25:0x0235, B:27:0x03e3, B:29:0x0415, B:30:0x046f), top: B:911:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x102b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1042 A[Catch: all -> 0x1108, TryCatch #51 {all -> 0x1108, blocks: (B:287:0x102d, B:289:0x1042, B:290:0x1074), top: B:923:0x102d, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x1087 A[Catch: all -> 0x10fe, TryCatch #47 {all -> 0x10fe, blocks: (B:291:0x107a, B:293:0x1087, B:294:0x10f2), top: B:915:0x107a, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1230  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x1280 A[Catch: all -> 0x17ff, PHI: r2
  0x1280: PHI (r2v528 java.lang.Object) = (r2v527 java.lang.Object), (r2v600 java.lang.Object) binds: [B:320:0x122e, B:322:0x1231] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #48 {all -> 0x17ff, blocks: (B:319:0x122a, B:326:0x1280, B:330:0x12f0, B:349:0x1381), top: B:917:0x122a }] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x12a7  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x1304  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x1367  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0479 A[PHI: r12 r15
  0x0479: PHI (r12v129 char) = (r12v24 char), (r12v132 char) binds: [B:20:0x01fc, B:7:0x01d2] A[DONT_GENERATE, DONT_INLINE]
  0x0479: PHI (r15v89 int) = (r15v9 int), (r15v92 int) binds: [B:20:0x01fc, B:7:0x01d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x16a6 A[Catch: all -> 0x17d5, TryCatch #28 {all -> 0x17d5, blocks: (B:384:0x169c, B:385:0x16a0, B:387:0x16a6, B:390:0x16c1, B:353:0x13ae, B:370:0x156b, B:374:0x15bb, B:379:0x1634, B:383:0x1694), top: B:881:0x13ae }] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x1896 A[Catch: all -> 0x0475, TryCatch #44 {all -> 0x0475, blocks: (B:151:0x0994, B:153:0x099a, B:154:0x09c8, B:267:0x0f54, B:269:0x0f5a, B:270:0x0f82, B:446:0x1890, B:448:0x1896, B:449:0x18c5, B:748:0x315e, B:750:0x3164, B:751:0x318f, B:785:0x34ba, B:787:0x34c0, B:788:0x34e3, B:765:0x32ea, B:767:0x330d, B:768:0x3364, B:714:0x2e13, B:716:0x2e19, B:717:0x2e44, B:611:0x2721, B:613:0x2727, B:614:0x274d, B:616:0x2787, B:617:0x27d0, B:584:0x245b, B:586:0x2470, B:587:0x249e, B:810:0x35c5, B:812:0x35cb, B:813:0x35f5, B:815:0x362f, B:816:0x366c, B:553:0x1ff5, B:555:0x200a, B:556:0x2037, B:558:0x206b, B:559:0x20e1, B:532:0x1d91, B:534:0x1d97, B:535:0x1dc5, B:312:0x1179, B:314:0x117f, B:315:0x11a5, B:22:0x0201, B:24:0x0207, B:25:0x0235, B:27:0x03e3, B:29:0x0415, B:30:0x046f), top: B:911:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x19ae  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x1a06 A[Catch: all -> 0x1cc7, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x1cc7, blocks: (B:453:0x194d, B:459:0x19a1, B:469:0x1a06, B:480:0x1a97, B:483:0x1ae0), top: B:876:0x194d }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x1bcd  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1d97 A[Catch: all -> 0x0475, TryCatch #44 {all -> 0x0475, blocks: (B:151:0x0994, B:153:0x099a, B:154:0x09c8, B:267:0x0f54, B:269:0x0f5a, B:270:0x0f82, B:446:0x1890, B:448:0x1896, B:449:0x18c5, B:748:0x315e, B:750:0x3164, B:751:0x318f, B:785:0x34ba, B:787:0x34c0, B:788:0x34e3, B:765:0x32ea, B:767:0x330d, B:768:0x3364, B:714:0x2e13, B:716:0x2e19, B:717:0x2e44, B:611:0x2721, B:613:0x2727, B:614:0x274d, B:616:0x2787, B:617:0x27d0, B:584:0x245b, B:586:0x2470, B:587:0x249e, B:810:0x35c5, B:812:0x35cb, B:813:0x35f5, B:815:0x362f, B:816:0x366c, B:553:0x1ff5, B:555:0x200a, B:556:0x2037, B:558:0x206b, B:559:0x20e1, B:532:0x1d91, B:534:0x1d97, B:535:0x1dc5, B:312:0x1179, B:314:0x117f, B:315:0x11a5, B:22:0x0201, B:24:0x0207, B:25:0x0235, B:27:0x03e3, B:29:0x0415, B:30:0x046f), top: B:911:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:540:0x1e50  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x1ebb  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x1f03  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1f1b  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x1fd7  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x2219  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x2ecc  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x2f1c  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x2f7f  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x313f  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x3226  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x327b  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x32cc  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x349a  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x3583  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x1012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:939:0x1953 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:969:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v106 */
    /* JADX WARN: Type inference failed for: r10v107 */
    /* JADX WARN: Type inference failed for: r10v108 */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v110 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v120 */
    /* JADX WARN: Type inference failed for: r10v121 */
    /* JADX WARN: Type inference failed for: r10v122 */
    /* JADX WARN: Type inference failed for: r10v123 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v57 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v59 */
    /* JADX WARN: Type inference failed for: r10v60 */
    /* JADX WARN: Type inference failed for: r10v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v73, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v75 */
    /* JADX WARN: Type inference failed for: r10v76 */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v188 */
    /* JADX WARN: Type inference failed for: r11v189 */
    /* JADX WARN: Type inference failed for: r11v190 */
    /* JADX WARN: Type inference failed for: r11v192 */
    /* JADX WARN: Type inference failed for: r11v193 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v104 */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v106 */
    /* JADX WARN: Type inference failed for: r12v107 */
    /* JADX WARN: Type inference failed for: r12v108 */
    /* JADX WARN: Type inference failed for: r12v109 */
    /* JADX WARN: Type inference failed for: r12v113 */
    /* JADX WARN: Type inference failed for: r12v114 */
    /* JADX WARN: Type inference failed for: r12v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v123 */
    /* JADX WARN: Type inference failed for: r12v124 */
    /* JADX WARN: Type inference failed for: r12v125 */
    /* JADX WARN: Type inference failed for: r12v126 */
    /* JADX WARN: Type inference failed for: r12v135 */
    /* JADX WARN: Type inference failed for: r12v136 */
    /* JADX WARN: Type inference failed for: r12v137 */
    /* JADX WARN: Type inference failed for: r12v138 */
    /* JADX WARN: Type inference failed for: r12v139 */
    /* JADX WARN: Type inference failed for: r12v140 */
    /* JADX WARN: Type inference failed for: r12v141 */
    /* JADX WARN: Type inference failed for: r12v142 */
    /* JADX WARN: Type inference failed for: r12v143 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99 */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v110 */
    /* JADX WARN: Type inference failed for: r15v111 */
    /* JADX WARN: Type inference failed for: r15v112 */
    /* JADX WARN: Type inference failed for: r15v113 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r2v759, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r30v10 */
    /* JADX WARN: Type inference failed for: r30v13 */
    /* JADX WARN: Type inference failed for: r30v14 */
    /* JADX WARN: Type inference failed for: r30v20 */
    /* JADX WARN: Type inference failed for: r30v32 */
    /* JADX WARN: Type inference failed for: r30v33 */
    /* JADX WARN: Type inference failed for: r30v36 */
    /* JADX WARN: Type inference failed for: r30v37 */
    /* JADX WARN: Type inference failed for: r30v38 */
    /* JADX WARN: Type inference failed for: r30v39 */
    /* JADX WARN: Type inference failed for: r30v40 */
    /* JADX WARN: Type inference failed for: r30v45 */
    /* JADX WARN: Type inference failed for: r30v46 */
    /* JADX WARN: Type inference failed for: r30v47 */
    /* JADX WARN: Type inference failed for: r30v48 */
    /* JADX WARN: Type inference failed for: r30v49 */
    /* JADX WARN: Type inference failed for: r30v50 */
    /* JADX WARN: Type inference failed for: r30v55 */
    /* JADX WARN: Type inference failed for: r30v56 */
    /* JADX WARN: Type inference failed for: r30v58, types: [long] */
    /* JADX WARN: Type inference failed for: r30v59 */
    /* JADX WARN: Type inference failed for: r30v6 */
    /* JADX WARN: Type inference failed for: r30v60 */
    /* JADX WARN: Type inference failed for: r30v61 */
    /* JADX WARN: Type inference failed for: r30v62 */
    /* JADX WARN: Type inference failed for: r30v63 */
    /* JADX WARN: Type inference failed for: r30v64 */
    /* JADX WARN: Type inference failed for: r30v65 */
    /* JADX WARN: Type inference failed for: r30v66 */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r31v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v16 */
    /* JADX WARN: Type inference failed for: r33v17 */
    /* JADX WARN: Type inference failed for: r33v18 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v22 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v3 */
    /* JADX WARN: Type inference failed for: r33v4 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r35v10 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v501, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v534 */
    /* JADX WARN: Type inference failed for: r3v612 */
    /* JADX WARN: Type inference failed for: r4v110 */
    /* JADX WARN: Type inference failed for: r4v111, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v292, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v631 */
    /* JADX WARN: Type inference failed for: r5v498 */
    /* JADX WARN: Type inference failed for: r6v315, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v322 */
    /* JADX WARN: Type inference failed for: r6v323 */
    /* JADX WARN: Type inference failed for: r6v324 */
    /* JADX WARN: Type inference failed for: r6v326 */
    /* JADX WARN: Type inference failed for: r6v328, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v329 */
    /* JADX WARN: Type inference failed for: r6v330 */
    /* JADX WARN: Type inference failed for: r6v331 */
    /* JADX WARN: Type inference failed for: r6v332 */
    /* JADX WARN: Type inference failed for: r6v340 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v508 */
    /* JADX WARN: Type inference failed for: r6v509 */
    /* JADX WARN: Type inference failed for: r6v510 */
    /* JADX WARN: Type inference failed for: r6v511 */
    /* JADX WARN: Type inference failed for: r6v512 */
    /* JADX WARN: Type inference failed for: r6v513 */
    /* JADX WARN: Type inference failed for: r6v514 */
    /* JADX WARN: Type inference failed for: r7v138 */
    /* JADX WARN: Type inference failed for: r7v139 */
    /* JADX WARN: Type inference failed for: r7v140 */
    /* JADX WARN: Type inference failed for: r7v141 */
    /* JADX WARN: Type inference failed for: r7v142 */
    /* JADX WARN: Type inference failed for: r7v150 */
    /* JADX WARN: Type inference failed for: r7v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v159 */
    /* JADX WARN: Type inference failed for: r7v160 */
    /* JADX WARN: Type inference failed for: r7v161 */
    /* JADX WARN: Type inference failed for: r7v162 */
    /* JADX WARN: Type inference failed for: r7v190 */
    /* JADX WARN: Type inference failed for: r7v191 */
    /* JADX WARN: Type inference failed for: r7v192 */
    /* JADX WARN: Type inference failed for: r7v193 */
    /* JADX WARN: Type inference failed for: r7v196 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v202 */
    /* JADX WARN: Type inference failed for: r7v203 */
    /* JADX WARN: Type inference failed for: r7v204 */
    /* JADX WARN: Type inference failed for: r7v205 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v143 */
    /* JADX WARN: Type inference failed for: r8v144 */
    /* JADX WARN: Type inference failed for: r8v146, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v157 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v189 */
    /* JADX WARN: Type inference failed for: r8v196 */
    /* JADX WARN: Type inference failed for: r8v197 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r8v199 */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v209 */
    /* JADX WARN: Type inference failed for: r8v210 */
    /* JADX WARN: Type inference failed for: r8v211 */
    /* JADX WARN: Type inference failed for: r8v212 */
    /* JADX WARN: Type inference failed for: r8v213 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r9v332 */
    /* JADX WARN: Type inference failed for: r9v344, types: [java.lang.Object[]] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.SelectAutomaticTypeActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$6FnNOVeWR70gWu7mq4i5oyj60Ig(DataBindingAdapter dataBindingAdapter, View view, int i, SchedulePaymentType schedulePaymentType) {
        int i2 = 2 % 2;
        int i3 = getAsAtTimestamp + 3;
        equals = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$0(dataBindingAdapter, view, i, schedulePaymentType);
        if (i4 == 0) {
            int i5 = 26 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 37;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        component4 = 0;
        component2();
        component1 = new char[]{33466, 33403, 33401, 33349, 33398, 33347, 33396, 33400, 33351, 33348, 33447, 33396, 33402, 33347, 33403, 33391, 33351, 33368, 33349, 33407, 33396, 33351, 33403, 33401, 33396, 33395, 33447, 33466, 33398, 33347, 33396, 33400, 33351, 33348, 33351, 33466, 33407, 33395, 33466, 33407, 33395, 33347, 33404, 33395, 33348, 33347, 33344, 33349, 33397, 33466, 33398, 33347, 33403, 33395, 33397, 33402, 33401, 33349, 33466, 33396, 33402, 33347, 33403, 33391, 33351, 33400, 33404, 33351, 33396, 33407, 33345, 33407, 33348, 33466, 33407, 33347, 33393, 33351, 33395, 33344};
        int i = copy + 51;
        component4 = i % 128;
        int i2 = i % 2;
    }

    static void component2() {
        component3 = new int[]{876397272, 1560175825, -239838370, -328167693, -1262243299, 292838032, 230833425, 50397681, 1447779218, -906313111, -649943132, 908628051, -1906512269, -1050789490, -1376086933, -1269374852, -136800729, 1543085383};
        component2 = -3563890122655516475L;
        copydefault = 1386857713;
        ShareDataUIState = (char) 50417;
    }
}
