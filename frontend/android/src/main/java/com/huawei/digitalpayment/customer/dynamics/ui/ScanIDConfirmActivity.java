package com.huawei.digitalpayment.customer.dynamics.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.common.utils.RequestAPIConfigUtils;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ColorUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.util.FastClickUtils;
import com.huawei.common.util.ViewUtils;
import com.huawei.common.util.image.PicBase64Utils;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.PhotoHelper;
import com.huawei.digitalpayment.customer.dynamics.R;
import com.huawei.digitalpayment.customer.dynamics.config.IDynamicsConfig;
import com.huawei.digitalpayment.customer.dynamics.databinding.ActivityScanIdConfirmBinding;
import com.huawei.digitalpayment.customer.dynamics.req.UploadImageParams;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState;
import com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadViewModel;
import com.huawei.payment.mvvm.Resource;
import com.huawei.payment.mvvm.Utils;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0012\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\u0012\u0010\u0017\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0014R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/ui/ScanIDConfirmActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentBaseActivity;", "Lcom/huawei/digitalpayment/customer/dynamics/databinding/ActivityScanIdConfirmBinding;", "Lcom/huawei/digitalpayment/customer/dynamics/vm/PhotoUploadViewModel;", "<init>", "()V", "uploadPhoto", "", "getUploadPhoto", "()Z", "uploadPhoto$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeData", "setResultAndFinish", "docId", "", "initData", "initView", RequestAPIConfigUtils.PARAM_TYPE_SUPPORT_UPLOAD, "initToolbar", "title", "getLayoutId", "", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
public final class ScanIDConfirmActivity extends Hilt_ScanIDConfirmActivity<ActivityScanIdConfirmBinding, PhotoUploadViewModel> {

    private final Lazy uploadPhoto = LazyKt.lazy(new Function0() {
        private static int component1 = 1;
        private static int copydefault;

        @Override
        public final Object invoke() {
            int i = 2 % 2;
            int i2 = component1 + 49;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                Boolean.valueOf(ScanIDConfirmActivity.$r8$lambda$0iZni9fXKSGFBe773cmruyX1TPI(this.f$0));
                throw null;
            }
            Boolean boolValueOf = Boolean.valueOf(ScanIDConfirmActivity.$r8$lambda$0iZni9fXKSGFBe773cmruyX1TPI(this.f$0));
            int i3 = component1 + 89;
            copydefault = i3 % 128;
            if (i3 % 2 == 0) {
                return boolValueOf;
            }
            throw null;
        }
    });
    private static final byte[] $$l = {46, -95, Ascii.VT, -87};
    private static final int $$o = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {66, 42, 112, 97, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -54, -20, 6, -16, Ascii.SO, -16, 65, -54, -18, -3, 63, -22, -50, -3, Ascii.US, -36, 8, -4, 62, -17, Ascii.VT, -16};
    private static final int $$n = 107;
    private static final byte[] $$d = {TarHeader.LF_BLK, -107, 59, -11, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 108;
    private static int copy = 0;
    private static int component4 = 1;
    private static int ShareDataUIState = -890926534;
    private static char component2 = 30861;
    private static char component3 = 22496;
    private static char component1 = 27854;
    private static char copydefault = 41709;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(byte r7, int r8, int r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.$$l
            int r9 = r9 * 3
            int r9 = r9 + 1
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 46
            int r7 = r7 + 65
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r8
            int r7 = r7 + 1
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L29:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.$$r(byte, int, int):java.lang.String");
    }

    private static void i(int i, int i2, short s, Object[] objArr) {
        int i3 = (i * 2) + 83;
        int i4 = 99 - i2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[28 - s];
        int i5 = 27 - s;
        int i6 = -1;
        if (bArr == null) {
            int i7 = (i4 + (-i5)) - 8;
            i4 = i4;
            i3 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i8 = i4 + 1;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i8;
            i3 = (i3 + (-bArr[i8])) - 8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 3
            int r0 = r5 + 10
            int r6 = r6 * 4
            int r6 = 99 - r6
            byte[] r1 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.$$m
            byte[] r0 = new byte[r0]
            int r5 = r5 + 9
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r5
            r3 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.j(byte, short, int, java.lang.Object[]):void");
    }

    public static final ViewModel m12206access$getViewModel$p$s1777195433(ScanIDConfirmActivity scanIDConfirmActivity) {
        int i = 2 % 2;
        int i2 = copy + 29;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        VM vm = scanIDConfirmActivity.viewModel;
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
        return vm;
    }

    public static final void access$setResultAndFinish(ScanIDConfirmActivity scanIDConfirmActivity, String str) {
        int i = 2 % 2;
        int i2 = copy + 101;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        scanIDConfirmActivity.setResultAndFinish(str);
        int i4 = component4 + 55;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean getUploadPhoto() {
        int i = 2 % 2;
        int i2 = component4 + 47;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Boolean bool = (Boolean) this.uploadPhoto.getValue();
        if (i3 == 0) {
            return bool.booleanValue();
        }
        bool.booleanValue();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final boolean uploadPhoto_delegate$lambda$0(ScanIDConfirmActivity scanIDConfirmActivity) {
        int i = 2 % 2;
        int i2 = copy + 15;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = scanIDConfirmActivity.getIntent();
        boolean booleanExtra = true;
        if (intent != null) {
            int i4 = copy + 91;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            booleanExtra = intent.getBooleanExtra(KeysConstants.KEY_UPLOAD_PHOTO, true);
        }
        int i6 = copy + 105;
        component4 = i6 % 128;
        int i7 = i6 % 2;
        return booleanExtra;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1", f = "ScanIDConfirmActivity.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component1;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 != 0) {
                int i3 = component3;
                int i4 = i3 + 117;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = i3 + 79;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PhotoUploadUiState> stateFlowUiState = ((PhotoUploadViewModel) ScanIDConfirmActivity.m12206access$getViewModel$p$s1777195433(ScanIDConfirmActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<UploadImageResp>>() {
                    private static int component1 = 1;
                    private static int component3;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 1;
                        private static int component2;
                        final FlowCollector component1;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1$2", f = "ScanIDConfirmActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int component1 = 0;
                            private static int component3 = 1;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                Object objEmit;
                                int i = 2 % 2;
                                int i2 = component3 + 73;
                                component1 = i2 % 128;
                                int i3 = i2 % 2;
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                if (i3 != 0) {
                                    objEmit = anonymousClass2.emit(null, this);
                                    int i4 = 69 / 0;
                                } else {
                                    objEmit = anonymousClass2.emit(null, this);
                                }
                                int i5 = component3 + 69;
                                component1 = i5 % 128;
                                int i6 = i5 % 2;
                                return objEmit;
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
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
                                int r1 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r1 = r1 + 55
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r1 = r1 % r0
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L29
                                r1 = r7
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L29
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                int r7 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r7 = r7 + 93
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r7 = r7 % r0
                                goto L2e
                            L29:
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L2e:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L55
                                int r6 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r6 = r6 + 7
                                int r1 = r6 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                int r6 = r6 % r0
                                if (r6 != 0) goto L47
                                if (r3 != r4) goto L4d
                                goto L49
                            L47:
                                if (r3 != r4) goto L4d
                            L49:
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L82
                            L4d:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L55:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                r3 = r1
                                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState r6 = (com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getUpload()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L82
                                int r6 = com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                int r7 = r6 + 113
                                int r1 = r7 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                int r7 = r7 % r0
                                if (r7 != 0) goto L7a
                                r7 = 11
                                int r7 = r7 / 0
                            L7a:
                                int r6 = r6 + 119
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                int r6 = r6 % r0
                                return r2
                            L82:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.component1 = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<UploadImageResp>> flowCollector, Continuation continuation) {
                        int i8 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i9 = component3 + 3;
                            component1 = i9 % 128;
                            int i10 = i9 % 2;
                            return objCollect;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i11 = component1 + 15;
                        component3 = i11 % 128;
                        int i12 = i11 % 2;
                        return unit;
                    }
                });
                final ScanIDConfirmActivity scanIDConfirmActivity = ScanIDConfirmActivity.this;
                this.component1 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int ShareDataUIState = 1;
                    private static int component2;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i8 = 2 % 2;
                        int i9 = ShareDataUIState + 79;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        Object objComponent2 = component2((Resource) obj2, continuation);
                        int i11 = component2 + 73;
                        ShareDataUIState = i11 % 128;
                        int i12 = i11 % 2;
                        return objComponent2;
                    }

                    public final Object component2(Resource<UploadImageResp> resource, Continuation<? super Unit> continuation) {
                        int i8;
                        int i9 = 2 % 2;
                        Utils.showOrHideLoading(scanIDConfirmActivity, resource);
                        String docId = null;
                        if (resource.error()) {
                            CommonToast.showText(resource.getMessage());
                            Unit unit = Unit.INSTANCE;
                            int i10 = component2 + 63;
                            ShareDataUIState = i10 % 128;
                            if (i10 % 2 != 0) {
                                return unit;
                            }
                            throw null;
                        }
                        if (resource.success()) {
                            ScanIDConfirmActivity scanIDConfirmActivity2 = scanIDConfirmActivity;
                            UploadImageResp data = resource.getData();
                            if (data != null) {
                                docId = data.getDocId();
                                i8 = component2 + 117;
                            } else {
                                i8 = component2 + 85;
                            }
                            ShareDataUIState = i8 % 128;
                            int i11 = i8 % 2;
                            ScanIDConfirmActivity.access$setResultAndFinish(scanIDConfirmActivity2, docId);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    int i8 = component3 + 113;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    return coroutine_suspended;
                }
            }
            Unit unit = Unit.INSTANCE;
            int i10 = copydefault + 123;
            component3 = i10 % 128;
            int i11 = i10 % 2;
            return unit;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = ScanIDConfirmActivity.this.new component2(continuation);
            int i2 = copydefault + 29;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 47;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = component3 + 77;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 109;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 == 0) {
                int i4 = 9 / 0;
            }
            return objInvokeSuspend;
        }
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                int i8 = $10 + 3;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i10 = (c3 + i6) ^ ((c3 << 4) + ((char) (((long) component1) ^ 4374495167426960553L)));
                int i11 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copydefault);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int i12 = 845 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int iRed = 32 - Color.red(i5);
                        char trimmedLength = (char) (23251 - TextUtils.getTrimmedLength(""));
                        byte b2 = (byte) ($$o & 3);
                        byte b3 = (byte) (b2 - 1);
                        String str$$r = $$r(b2, b3, b3);
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i12, iRed, trimmedLength, 592652048, false, str$$r, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) component2) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int iArgb = Color.argb(0, 0, 0, 0) + 844;
                        int offsetAfter = 32 - TextUtils.getOffsetAfter("", 0);
                        char doubleTapTimeout = (char) (23251 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        byte b4 = (byte) ($$o & 3);
                        byte b5 = (byte) (b4 - 1);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(iArgb, offsetAfter, doubleTapTimeout, 592652048, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i13 = $11 + 45;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[iNotificationSideChannelDefault.component3] = cArr5[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr5[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getSize(0) + 465, 49 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void g(char[] cArr, int i, boolean z, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i2];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
            int i5 = $10 + 45;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i3 + iTrustedWebActivityServiceStub.component3);
            int i7 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(ShareDataUIState)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3784, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37, (char) (TextUtils.lastIndexOf("", '0') + 26861), 2015799920, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.indexOf((CharSequence) "", '0'), 16 - Color.red(0), (char) Drawable.resolveOpacity(0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iTrustedWebActivityServiceStub.component1 = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i2 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i2) {
                cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i2 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                try {
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.lastIndexOf("", '0', 0), 16 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018e  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2737
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.onCreate(android.os.Bundle):void");
    }

    private final void observeData() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component2(null), 3, null);
        int i2 = copy + 71;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private final void setResultAndFinish(String docId) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra(KeysConstants.KEY_DOC_ID, docId);
        Unit unit = Unit.INSTANCE;
        setResult(-1, intent);
        finish();
        int i2 = copy + 95;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void initData() {
        int i = 2 % 2;
        int i2 = component4 + 107;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String idPhoto = PhotoHelper.INSTANCE.getIdPhoto();
        if (idPhoto != null) {
            int i4 = copy + 47;
            component4 = i4 % 128;
            if (i4 % 2 != 0) {
                ((ActivityScanIdConfirmBinding) this.binding).imageView.setImageBitmap(PicBase64Utils.decodeToBitmap(idPhoto));
            } else {
                ((ActivityScanIdConfirmBinding) this.binding).imageView.setImageBitmap(PicBase64Utils.decodeToBitmap(idPhoto));
                throw null;
            }
        }
    }

    private static final void initView$lambda$3(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 59;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        scanIDConfirmActivity.onBackClick();
        int i4 = component4 + 57;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void initView$lambda$4(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        scanIDConfirmActivity.onBackClick();
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 79;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void initView$lambda$5(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 83;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            scanIDConfirmActivity.getUploadPhoto();
            obj.hashCode();
            throw null;
        }
        if (scanIDConfirmActivity.getUploadPhoto()) {
            scanIDConfirmActivity.upload();
            return;
        }
        scanIDConfirmActivity.setResultAndFinish(null);
        int i3 = copy + 19;
        component4 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 24 / 0;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = ((ActivityScanIdConfirmBinding) this.binding).ivBack.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "");
        ((ConstraintLayout.LayoutParams) layoutParams).topMargin = ViewUtils.getStatusBarHeight(this);
        FastClickUtils.setOnClickListener(((ActivityScanIdConfirmBinding) this.binding).ivBack, new View.OnClickListener() {
            private static int component1 = 1;
            private static int component3;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component1 + 107;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ScanIDConfirmActivity.$r8$lambda$fxsN6KQ9TAPJnIoohgEbOH72k9U(this.f$0, view);
                int i5 = component3 + 33;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }
        });
        FastClickUtils.setOnClickListener(((ActivityScanIdConfirmBinding) this.binding).ivRefresh, new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 17;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                ScanIDConfirmActivity.m12205$r8$lambda$5P6fibDpcsjpoySev8dzcXu2bU(this.f$0, view);
                int i5 = ShareDataUIState + 45;
                component2 = i5 % 128;
                if (i5 % 2 != 0) {
                    int i6 = 2 / 0;
                }
            }
        });
        FastClickUtils.setOnClickListener(((ActivityScanIdConfirmBinding) this.binding).ivConfirm, new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = copydefault + 81;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    ScanIDConfirmActivity.$r8$lambda$tWMaNTQbEibvPDTlB0Y79sIQbzg(this.f$0, view);
                    throw null;
                }
                ScanIDConfirmActivity.$r8$lambda$tWMaNTQbEibvPDTlB0Y79sIQbzg(this.f$0, view);
                int i4 = copydefault + 123;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
            }
        });
        ((ActivityScanIdConfirmBinding) this.binding).llTips.setBackgroundColor(ColorUtils.setAlphaComponent(getColor(R.color.colorSuccessDisable), 0.2f));
        ((ActivityScanIdConfirmBinding) this.binding).imageView.getBaseFilletView().setRoundCorner(((IDynamicsConfig) RouteUtils.getService(IDynamicsConfig.class)).scanIDAreaRoundCorner());
        ViewGroup.LayoutParams layoutParams2 = ((ActivityScanIdConfirmBinding) this.binding).imageView.getLayoutParams();
        Size sizeScanIDAreaSize = ((IDynamicsConfig) RouteUtils.getService(IDynamicsConfig.class)).scanIDAreaSize();
        layoutParams2.width = sizeScanIDAreaSize.getWidth();
        layoutParams2.height = sizeScanIDAreaSize.getHeight();
        int i2 = component4 + 41;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void upload() {
        int i = 2 % 2;
        int i2 = copy + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        String idPhoto = PhotoHelper.INSTANCE.getIdPhoto();
        if (idPhoto == null) {
            int i4 = component4 + 81;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } else {
            ((PhotoUploadViewModel) this.viewModel).upload(new UploadImageParams(System.currentTimeMillis() + "_id.jpg", idPhoto));
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_scan_id_confirm;
        int i5 = component4 + 59;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0099  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = component4 + 15;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = copy + 75;
            component4 = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 79, new char[]{40744, 54825, 63371, 41638, 36822, 48327, 22521, 41918, 27256, 51266, 58256, 4663, 50615, 22662, 37406, 63832, 23221, 3080, 13272, 16057, 42019, 35850, 31324, 3875, 59215, 12506}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952767_res_0x7f13047f).substring(12, 13).codePointAt(0) - 14, new char[]{55387, 1360, 19872, 22278, 9423, 14683, 33092, 50912, 35763, 964, 15945, 39545, 16960, 58754, 37406, 63832, 55836, 10250}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = component4 + 7;
            copy = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = component4 + 5;
                copy = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            int i9 = component4 + 93;
            copy = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((KeyEvent.getMaxKeyCode() >> 16) + 6618, 42 - KeyEvent.getDeadChar(0, 0), (char) KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0'), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, (char) ExpandableListView.getPackedPositionType(0L), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i11 = component4 + 75;
                copy = i11 % 128;
                int i12 = i11 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1052:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x08aa A[Catch: all -> 0x04b9, TryCatch #18 {all -> 0x04b9, blocks: (B:219:0x0e2d, B:221:0x0e33, B:222:0x0e62, B:341:0x1405, B:343:0x140b, B:344:0x1435, B:500:0x1afb, B:502:0x1b01, B:503:0x1b2b, B:763:0x2e3f, B:765:0x2e45, B:766:0x2e6a, B:797:0x315c, B:799:0x3162, B:800:0x3188, B:840:0x34d3, B:842:0x34d9, B:843:0x34fc, B:820:0x3327, B:822:0x334a, B:823:0x3392, B:627:0x26d6, B:629:0x26dc, B:630:0x270c, B:632:0x2746, B:633:0x2790, B:597:0x23f4, B:599:0x2409, B:600:0x243c, B:865:0x35e9, B:867:0x35ef, B:868:0x3614, B:870:0x364e, B:871:0x3690, B:565:0x1fab, B:567:0x1fc0, B:568:0x1fee, B:570:0x2022, B:571:0x2096, B:545:0x1d39, B:547:0x1d3f, B:548:0x1d67, B:110:0x08a4, B:112:0x08aa, B:113:0x08d5, B:19:0x029b, B:21:0x02a1, B:22:0x02cc, B:24:0x042c, B:26:0x045e, B:27:0x04b3, B:508:0x1bb8, B:510:0x1bbc, B:531:0x1caa, B:533:0x1cb0, B:534:0x1cb1, B:536:0x1cb3, B:538:0x1cba, B:539:0x1cbb, B:514:0x1bc8), top: B:917:0x029b, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e33 A[Catch: all -> 0x04b9, TryCatch #18 {all -> 0x04b9, blocks: (B:219:0x0e2d, B:221:0x0e33, B:222:0x0e62, B:341:0x1405, B:343:0x140b, B:344:0x1435, B:500:0x1afb, B:502:0x1b01, B:503:0x1b2b, B:763:0x2e3f, B:765:0x2e45, B:766:0x2e6a, B:797:0x315c, B:799:0x3162, B:800:0x3188, B:840:0x34d3, B:842:0x34d9, B:843:0x34fc, B:820:0x3327, B:822:0x334a, B:823:0x3392, B:627:0x26d6, B:629:0x26dc, B:630:0x270c, B:632:0x2746, B:633:0x2790, B:597:0x23f4, B:599:0x2409, B:600:0x243c, B:865:0x35e9, B:867:0x35ef, B:868:0x3614, B:870:0x364e, B:871:0x3690, B:565:0x1fab, B:567:0x1fc0, B:568:0x1fee, B:570:0x2022, B:571:0x2096, B:545:0x1d39, B:547:0x1d3f, B:548:0x1d67, B:110:0x08a4, B:112:0x08aa, B:113:0x08d5, B:19:0x029b, B:21:0x02a1, B:22:0x02cc, B:24:0x042c, B:26:0x045e, B:27:0x04b3, B:508:0x1bb8, B:510:0x1bbc, B:531:0x1caa, B:533:0x1cb0, B:534:0x1cb1, B:536:0x1cb3, B:538:0x1cba, B:539:0x1cbb, B:514:0x1bc8), top: B:917:0x029b, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0ef3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0f41 A[Catch: all -> 0x1345, PHI: r1 r11 r40
  0x0f41: PHI (r1v671 java.lang.Object) = (r1v670 java.lang.Object), (r1v733 java.lang.Object) binds: [B:227:0x0ef1, B:229:0x0ef4] A[DONT_GENERATE, DONT_INLINE]
  0x0f41: PHI (r11v116 ??) = (r11v265 ??), (r11v266 ??) binds: [B:227:0x0ef1, B:229:0x0ef4] A[DONT_GENERATE, DONT_INLINE]
  0x0f41: PHI (r40v56 ??) = (r40v147 ??), (r40v77 ??) binds: [B:227:0x0ef1, B:229:0x0ef4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x1345, blocks: (B:226:0x0eed, B:233:0x0f41, B:242:0x0faa, B:260:0x10b1, B:264:0x10ff), top: B:933:0x0eed }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0faa A[Catch: all -> 0x1345, TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x1345, blocks: (B:226:0x0eed, B:233:0x0f41, B:242:0x0faa, B:260:0x10b1, B:264:0x10ff), top: B:933:0x0eed }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x11ef A[Catch: all -> 0x131d, TryCatch #73 {all -> 0x131d, blocks: (B:280:0x11e5, B:281:0x11e9, B:283:0x11ef, B:286:0x120b, B:276:0x1182, B:279:0x11dd), top: B:1020:0x1182 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x140b A[Catch: all -> 0x04b9, TryCatch #18 {all -> 0x04b9, blocks: (B:219:0x0e2d, B:221:0x0e33, B:222:0x0e62, B:341:0x1405, B:343:0x140b, B:344:0x1435, B:500:0x1afb, B:502:0x1b01, B:503:0x1b2b, B:763:0x2e3f, B:765:0x2e45, B:766:0x2e6a, B:797:0x315c, B:799:0x3162, B:800:0x3188, B:840:0x34d3, B:842:0x34d9, B:843:0x34fc, B:820:0x3327, B:822:0x334a, B:823:0x3392, B:627:0x26d6, B:629:0x26dc, B:630:0x270c, B:632:0x2746, B:633:0x2790, B:597:0x23f4, B:599:0x2409, B:600:0x243c, B:865:0x35e9, B:867:0x35ef, B:868:0x3614, B:870:0x364e, B:871:0x3690, B:565:0x1fab, B:567:0x1fc0, B:568:0x1fee, B:570:0x2022, B:571:0x2096, B:545:0x1d39, B:547:0x1d3f, B:548:0x1d67, B:110:0x08a4, B:112:0x08aa, B:113:0x08d5, B:19:0x029b, B:21:0x02a1, B:22:0x02cc, B:24:0x042c, B:26:0x045e, B:27:0x04b3, B:508:0x1bb8, B:510:0x1bbc, B:531:0x1caa, B:533:0x1cb0, B:534:0x1cb1, B:536:0x1cb3, B:538:0x1cba, B:539:0x1cbb, B:514:0x1bc8), top: B:917:0x029b, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x150b A[Catch: all -> 0x1a78, PHI: r1 r4 r33
  0x150b: PHI (r1v607 java.lang.Object) = (r1v602 java.lang.Object), (r1v605 java.lang.Object) binds: [B:349:0x14bc, B:350:0x14be] A[DONT_GENERATE, DONT_INLINE]
  0x150b: PHI (r4v63 ??) = (r4v314 ??), (r4v315 ??) binds: [B:349:0x14bc, B:350:0x14be] A[DONT_GENERATE, DONT_INLINE]
  0x150b: PHI (r33v89 ??) = (r33v201 ??), (r33v202 ??) binds: [B:349:0x14bc, B:350:0x14be] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x1a78, blocks: (B:348:0x14b8, B:354:0x150b), top: B:964:0x14b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1582  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1598  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x1604  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x1908 A[Catch: all -> 0x1a3b, TryCatch #21 {all -> 0x1a3b, blocks: (B:428:0x18fe, B:429:0x1902, B:431:0x1908, B:434:0x1923, B:423:0x189d, B:427:0x18f8), top: B:922:0x189d }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1b01 A[Catch: all -> 0x04b9, TryCatch #18 {all -> 0x04b9, blocks: (B:219:0x0e2d, B:221:0x0e33, B:222:0x0e62, B:341:0x1405, B:343:0x140b, B:344:0x1435, B:500:0x1afb, B:502:0x1b01, B:503:0x1b2b, B:763:0x2e3f, B:765:0x2e45, B:766:0x2e6a, B:797:0x315c, B:799:0x3162, B:800:0x3188, B:840:0x34d3, B:842:0x34d9, B:843:0x34fc, B:820:0x3327, B:822:0x334a, B:823:0x3392, B:627:0x26d6, B:629:0x26dc, B:630:0x270c, B:632:0x2746, B:633:0x2790, B:597:0x23f4, B:599:0x2409, B:600:0x243c, B:865:0x35e9, B:867:0x35ef, B:868:0x3614, B:870:0x364e, B:871:0x3690, B:565:0x1fab, B:567:0x1fc0, B:568:0x1fee, B:570:0x2022, B:571:0x2096, B:545:0x1d39, B:547:0x1d3f, B:548:0x1d67, B:110:0x08a4, B:112:0x08aa, B:113:0x08d5, B:19:0x029b, B:21:0x02a1, B:22:0x02cc, B:24:0x042c, B:26:0x045e, B:27:0x04b3, B:508:0x1bb8, B:510:0x1bbc, B:531:0x1caa, B:533:0x1cb0, B:534:0x1cb1, B:536:0x1cb3, B:538:0x1cba, B:539:0x1cbb, B:514:0x1bc8), top: B:917:0x029b, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1bd1  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x1be8 A[Catch: all -> 0x1cb2, TryCatch #13 {all -> 0x1cb2, blocks: (B:520:0x1bd3, B:522:0x1be8, B:523:0x1c1e), top: B:910:0x1bd3, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:526:0x1c31 A[Catch: all -> 0x1ca8, TryCatch #6 {all -> 0x1ca8, blocks: (B:524:0x1c24, B:526:0x1c31, B:527:0x1ca0), top: B:897:0x1c24, outer: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x1df2  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x1e5c  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x1eae  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x1f8b  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x21cc  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x2935 A[Catch: all -> 0x2907, TRY_ENTER, TRY_LEAVE, TryCatch #56 {all -> 0x2907, blocks: (B:640:0x28c3, B:647:0x2935, B:652:0x2998, B:654:0x299e, B:655:0x29e4, B:658:0x29f5, B:660:0x29f9, B:664:0x2a05), top: B:989:0x28c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x298b  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x29f1  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x2c54 A[Catch: all -> 0x2dba, TryCatch #19 {all -> 0x2dba, blocks: (B:700:0x2c4a, B:701:0x2c4e, B:703:0x2c54, B:706:0x2c72, B:668:0x2a19, B:686:0x2b2d, B:689:0x2b78, B:695:0x2be5, B:699:0x2c42), top: B:918:0x2a19 }] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x2e45 A[Catch: all -> 0x04b9, TryCatch #18 {all -> 0x04b9, blocks: (B:219:0x0e2d, B:221:0x0e33, B:222:0x0e62, B:341:0x1405, B:343:0x140b, B:344:0x1435, B:500:0x1afb, B:502:0x1b01, B:503:0x1b2b, B:763:0x2e3f, B:765:0x2e45, B:766:0x2e6a, B:797:0x315c, B:799:0x3162, B:800:0x3188, B:840:0x34d3, B:842:0x34d9, B:843:0x34fc, B:820:0x3327, B:822:0x334a, B:823:0x3392, B:627:0x26d6, B:629:0x26dc, B:630:0x270c, B:632:0x2746, B:633:0x2790, B:597:0x23f4, B:599:0x2409, B:600:0x243c, B:865:0x35e9, B:867:0x35ef, B:868:0x3614, B:870:0x364e, B:871:0x3690, B:565:0x1fab, B:567:0x1fc0, B:568:0x1fee, B:570:0x2022, B:571:0x2096, B:545:0x1d39, B:547:0x1d3f, B:548:0x1d67, B:110:0x08a4, B:112:0x08aa, B:113:0x08d5, B:19:0x029b, B:21:0x02a1, B:22:0x02cc, B:24:0x042c, B:26:0x045e, B:27:0x04b3, B:508:0x1bb8, B:510:0x1bbc, B:531:0x1caa, B:533:0x1cb0, B:534:0x1cb1, B:536:0x1cb3, B:538:0x1cba, B:539:0x1cbb, B:514:0x1bc8), top: B:917:0x029b, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:771:0x2ef7  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x2f3f  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x2f91  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x313c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x3214  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x325d  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x3309  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x34b3  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x359e  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x1bb8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:975:0x1532 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:981:0x14be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v105 */
    /* JADX WARN: Type inference failed for: r11v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v110 */
    /* JADX WARN: Type inference failed for: r11v111 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v114 */
    /* JADX WARN: Type inference failed for: r11v115 */
    /* JADX WARN: Type inference failed for: r11v116 */
    /* JADX WARN: Type inference failed for: r11v117 */
    /* JADX WARN: Type inference failed for: r11v118 */
    /* JADX WARN: Type inference failed for: r11v119 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v128, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v130 */
    /* JADX WARN: Type inference failed for: r11v131 */
    /* JADX WARN: Type inference failed for: r11v132 */
    /* JADX WARN: Type inference failed for: r11v133 */
    /* JADX WARN: Type inference failed for: r11v134 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v161 */
    /* JADX WARN: Type inference failed for: r11v162 */
    /* JADX WARN: Type inference failed for: r11v163 */
    /* JADX WARN: Type inference failed for: r11v164 */
    /* JADX WARN: Type inference failed for: r11v165 */
    /* JADX WARN: Type inference failed for: r11v166 */
    /* JADX WARN: Type inference failed for: r11v167 */
    /* JADX WARN: Type inference failed for: r11v169 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v175 */
    /* JADX WARN: Type inference failed for: r11v177 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v182 */
    /* JADX WARN: Type inference failed for: r11v183 */
    /* JADX WARN: Type inference failed for: r11v188, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v191 */
    /* JADX WARN: Type inference failed for: r11v192 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v236 */
    /* JADX WARN: Type inference failed for: r11v237 */
    /* JADX WARN: Type inference failed for: r11v238 */
    /* JADX WARN: Type inference failed for: r11v239 */
    /* JADX WARN: Type inference failed for: r11v240 */
    /* JADX WARN: Type inference failed for: r11v241 */
    /* JADX WARN: Type inference failed for: r11v242 */
    /* JADX WARN: Type inference failed for: r11v243 */
    /* JADX WARN: Type inference failed for: r11v244 */
    /* JADX WARN: Type inference failed for: r11v245 */
    /* JADX WARN: Type inference failed for: r11v246 */
    /* JADX WARN: Type inference failed for: r11v247 */
    /* JADX WARN: Type inference failed for: r11v248 */
    /* JADX WARN: Type inference failed for: r11v249 */
    /* JADX WARN: Type inference failed for: r11v250 */
    /* JADX WARN: Type inference failed for: r11v251 */
    /* JADX WARN: Type inference failed for: r11v252 */
    /* JADX WARN: Type inference failed for: r11v253 */
    /* JADX WARN: Type inference failed for: r11v254 */
    /* JADX WARN: Type inference failed for: r11v255 */
    /* JADX WARN: Type inference failed for: r11v256 */
    /* JADX WARN: Type inference failed for: r11v257 */
    /* JADX WARN: Type inference failed for: r11v258 */
    /* JADX WARN: Type inference failed for: r11v259 */
    /* JADX WARN: Type inference failed for: r11v260 */
    /* JADX WARN: Type inference failed for: r11v261 */
    /* JADX WARN: Type inference failed for: r11v262 */
    /* JADX WARN: Type inference failed for: r11v263 */
    /* JADX WARN: Type inference failed for: r11v264 */
    /* JADX WARN: Type inference failed for: r11v265 */
    /* JADX WARN: Type inference failed for: r11v266 */
    /* JADX WARN: Type inference failed for: r11v267 */
    /* JADX WARN: Type inference failed for: r11v268 */
    /* JADX WARN: Type inference failed for: r11v269 */
    /* JADX WARN: Type inference failed for: r11v270 */
    /* JADX WARN: Type inference failed for: r11v271 */
    /* JADX WARN: Type inference failed for: r11v272 */
    /* JADX WARN: Type inference failed for: r11v273 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r11v75 */
    /* JADX WARN: Type inference failed for: r11v78 */
    /* JADX WARN: Type inference failed for: r11v79 */
    /* JADX WARN: Type inference failed for: r11v80, types: [long] */
    /* JADX WARN: Type inference failed for: r11v81 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v91 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r13v108 */
    /* JADX WARN: Type inference failed for: r13v111 */
    /* JADX WARN: Type inference failed for: r13v112 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v162 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v175 */
    /* JADX WARN: Type inference failed for: r13v176 */
    /* JADX WARN: Type inference failed for: r13v178 */
    /* JADX WARN: Type inference failed for: r13v179 */
    /* JADX WARN: Type inference failed for: r13v182 */
    /* JADX WARN: Type inference failed for: r13v183 */
    /* JADX WARN: Type inference failed for: r13v194 */
    /* JADX WARN: Type inference failed for: r13v195 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v201 */
    /* JADX WARN: Type inference failed for: r13v202 */
    /* JADX WARN: Type inference failed for: r13v203 */
    /* JADX WARN: Type inference failed for: r13v204 */
    /* JADX WARN: Type inference failed for: r13v205 */
    /* JADX WARN: Type inference failed for: r13v206 */
    /* JADX WARN: Type inference failed for: r13v207 */
    /* JADX WARN: Type inference failed for: r13v208 */
    /* JADX WARN: Type inference failed for: r13v209 */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v211 */
    /* JADX WARN: Type inference failed for: r13v212 */
    /* JADX WARN: Type inference failed for: r13v213 */
    /* JADX WARN: Type inference failed for: r13v214 */
    /* JADX WARN: Type inference failed for: r13v215 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v89, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v91 */
    /* JADX WARN: Type inference failed for: r13v92 */
    /* JADX WARN: Type inference failed for: r13v93 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r28v23 */
    /* JADX WARN: Type inference failed for: r28v24 */
    /* JADX WARN: Type inference failed for: r28v25 */
    /* JADX WARN: Type inference failed for: r28v26 */
    /* JADX WARN: Type inference failed for: r28v34 */
    /* JADX WARN: Type inference failed for: r28v48 */
    /* JADX WARN: Type inference failed for: r28v49 */
    /* JADX WARN: Type inference failed for: r28v50 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v556 */
    /* JADX WARN: Type inference failed for: r2v557 */
    /* JADX WARN: Type inference failed for: r2v558 */
    /* JADX WARN: Type inference failed for: r2v559 */
    /* JADX WARN: Type inference failed for: r2v577 */
    /* JADX WARN: Type inference failed for: r2v578 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v103 */
    /* JADX WARN: Type inference failed for: r33v104 */
    /* JADX WARN: Type inference failed for: r33v107 */
    /* JADX WARN: Type inference failed for: r33v109 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v110 */
    /* JADX WARN: Type inference failed for: r33v117 */
    /* JADX WARN: Type inference failed for: r33v118 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v121 */
    /* JADX WARN: Type inference failed for: r33v122 */
    /* JADX WARN: Type inference failed for: r33v125 */
    /* JADX WARN: Type inference failed for: r33v127 */
    /* JADX WARN: Type inference failed for: r33v128 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v130 */
    /* JADX WARN: Type inference failed for: r33v131 */
    /* JADX WARN: Type inference failed for: r33v132 */
    /* JADX WARN: Type inference failed for: r33v133 */
    /* JADX WARN: Type inference failed for: r33v134 */
    /* JADX WARN: Type inference failed for: r33v136 */
    /* JADX WARN: Type inference failed for: r33v140 */
    /* JADX WARN: Type inference failed for: r33v142 */
    /* JADX WARN: Type inference failed for: r33v145 */
    /* JADX WARN: Type inference failed for: r33v146 */
    /* JADX WARN: Type inference failed for: r33v147 */
    /* JADX WARN: Type inference failed for: r33v149 */
    /* JADX WARN: Type inference failed for: r33v150 */
    /* JADX WARN: Type inference failed for: r33v153 */
    /* JADX WARN: Type inference failed for: r33v186 */
    /* JADX WARN: Type inference failed for: r33v187 */
    /* JADX WARN: Type inference failed for: r33v19 */
    /* JADX WARN: Type inference failed for: r33v190 */
    /* JADX WARN: Type inference failed for: r33v191 */
    /* JADX WARN: Type inference failed for: r33v192 */
    /* JADX WARN: Type inference failed for: r33v193 */
    /* JADX WARN: Type inference failed for: r33v194 */
    /* JADX WARN: Type inference failed for: r33v195 */
    /* JADX WARN: Type inference failed for: r33v196 */
    /* JADX WARN: Type inference failed for: r33v199 */
    /* JADX WARN: Type inference failed for: r33v20 */
    /* JADX WARN: Type inference failed for: r33v200 */
    /* JADX WARN: Type inference failed for: r33v201 */
    /* JADX WARN: Type inference failed for: r33v202 */
    /* JADX WARN: Type inference failed for: r33v203 */
    /* JADX WARN: Type inference failed for: r33v204 */
    /* JADX WARN: Type inference failed for: r33v205 */
    /* JADX WARN: Type inference failed for: r33v206 */
    /* JADX WARN: Type inference failed for: r33v207 */
    /* JADX WARN: Type inference failed for: r33v208 */
    /* JADX WARN: Type inference failed for: r33v209 */
    /* JADX WARN: Type inference failed for: r33v21 */
    /* JADX WARN: Type inference failed for: r33v210 */
    /* JADX WARN: Type inference failed for: r33v213 */
    /* JADX WARN: Type inference failed for: r33v214 */
    /* JADX WARN: Type inference failed for: r33v215 */
    /* JADX WARN: Type inference failed for: r33v216 */
    /* JADX WARN: Type inference failed for: r33v217 */
    /* JADX WARN: Type inference failed for: r33v218 */
    /* JADX WARN: Type inference failed for: r33v219 */
    /* JADX WARN: Type inference failed for: r33v22 */
    /* JADX WARN: Type inference failed for: r33v220 */
    /* JADX WARN: Type inference failed for: r33v221 */
    /* JADX WARN: Type inference failed for: r33v222 */
    /* JADX WARN: Type inference failed for: r33v223 */
    /* JADX WARN: Type inference failed for: r33v224 */
    /* JADX WARN: Type inference failed for: r33v225 */
    /* JADX WARN: Type inference failed for: r33v226 */
    /* JADX WARN: Type inference failed for: r33v227 */
    /* JADX WARN: Type inference failed for: r33v228 */
    /* JADX WARN: Type inference failed for: r33v229 */
    /* JADX WARN: Type inference failed for: r33v23 */
    /* JADX WARN: Type inference failed for: r33v230 */
    /* JADX WARN: Type inference failed for: r33v231 */
    /* JADX WARN: Type inference failed for: r33v232 */
    /* JADX WARN: Type inference failed for: r33v233 */
    /* JADX WARN: Type inference failed for: r33v234 */
    /* JADX WARN: Type inference failed for: r33v235 */
    /* JADX WARN: Type inference failed for: r33v236 */
    /* JADX WARN: Type inference failed for: r33v237 */
    /* JADX WARN: Type inference failed for: r33v238 */
    /* JADX WARN: Type inference failed for: r33v239 */
    /* JADX WARN: Type inference failed for: r33v24 */
    /* JADX WARN: Type inference failed for: r33v240 */
    /* JADX WARN: Type inference failed for: r33v241 */
    /* JADX WARN: Type inference failed for: r33v242 */
    /* JADX WARN: Type inference failed for: r33v243 */
    /* JADX WARN: Type inference failed for: r33v244 */
    /* JADX WARN: Type inference failed for: r33v25 */
    /* JADX WARN: Type inference failed for: r33v255 */
    /* JADX WARN: Type inference failed for: r33v256 */
    /* JADX WARN: Type inference failed for: r33v257 */
    /* JADX WARN: Type inference failed for: r33v258 */
    /* JADX WARN: Type inference failed for: r33v259 */
    /* JADX WARN: Type inference failed for: r33v26 */
    /* JADX WARN: Type inference failed for: r33v260 */
    /* JADX WARN: Type inference failed for: r33v261 */
    /* JADX WARN: Type inference failed for: r33v262 */
    /* JADX WARN: Type inference failed for: r33v263 */
    /* JADX WARN: Type inference failed for: r33v264 */
    /* JADX WARN: Type inference failed for: r33v267 */
    /* JADX WARN: Type inference failed for: r33v268 */
    /* JADX WARN: Type inference failed for: r33v269 */
    /* JADX WARN: Type inference failed for: r33v270 */
    /* JADX WARN: Type inference failed for: r33v271 */
    /* JADX WARN: Type inference failed for: r33v272 */
    /* JADX WARN: Type inference failed for: r33v273 */
    /* JADX WARN: Type inference failed for: r33v274 */
    /* JADX WARN: Type inference failed for: r33v275 */
    /* JADX WARN: Type inference failed for: r33v276 */
    /* JADX WARN: Type inference failed for: r33v277 */
    /* JADX WARN: Type inference failed for: r33v278 */
    /* JADX WARN: Type inference failed for: r33v279 */
    /* JADX WARN: Type inference failed for: r33v280 */
    /* JADX WARN: Type inference failed for: r33v281 */
    /* JADX WARN: Type inference failed for: r33v282 */
    /* JADX WARN: Type inference failed for: r33v283 */
    /* JADX WARN: Type inference failed for: r33v284 */
    /* JADX WARN: Type inference failed for: r33v285 */
    /* JADX WARN: Type inference failed for: r33v286 */
    /* JADX WARN: Type inference failed for: r33v287 */
    /* JADX WARN: Type inference failed for: r33v288 */
    /* JADX WARN: Type inference failed for: r33v289 */
    /* JADX WARN: Type inference failed for: r33v290 */
    /* JADX WARN: Type inference failed for: r33v291 */
    /* JADX WARN: Type inference failed for: r33v292 */
    /* JADX WARN: Type inference failed for: r33v32 */
    /* JADX WARN: Type inference failed for: r33v33 */
    /* JADX WARN: Type inference failed for: r33v41 */
    /* JADX WARN: Type inference failed for: r33v48 */
    /* JADX WARN: Type inference failed for: r33v49 */
    /* JADX WARN: Type inference failed for: r33v50 */
    /* JADX WARN: Type inference failed for: r33v51 */
    /* JADX WARN: Type inference failed for: r33v52 */
    /* JADX WARN: Type inference failed for: r33v54 */
    /* JADX WARN: Type inference failed for: r33v55 */
    /* JADX WARN: Type inference failed for: r33v56 */
    /* JADX WARN: Type inference failed for: r33v57 */
    /* JADX WARN: Type inference failed for: r33v58 */
    /* JADX WARN: Type inference failed for: r33v59 */
    /* JADX WARN: Type inference failed for: r33v61 */
    /* JADX WARN: Type inference failed for: r33v62 */
    /* JADX WARN: Type inference failed for: r33v67 */
    /* JADX WARN: Type inference failed for: r33v68 */
    /* JADX WARN: Type inference failed for: r33v69 */
    /* JADX WARN: Type inference failed for: r33v70 */
    /* JADX WARN: Type inference failed for: r33v73 */
    /* JADX WARN: Type inference failed for: r33v76 */
    /* JADX WARN: Type inference failed for: r33v8 */
    /* JADX WARN: Type inference failed for: r33v80 */
    /* JADX WARN: Type inference failed for: r33v81 */
    /* JADX WARN: Type inference failed for: r33v89 */
    /* JADX WARN: Type inference failed for: r33v9 */
    /* JADX WARN: Type inference failed for: r33v91 */
    /* JADX WARN: Type inference failed for: r33v93 */
    /* JADX WARN: Type inference failed for: r33v95 */
    /* JADX WARN: Type inference failed for: r33v97 */
    /* JADX WARN: Type inference failed for: r33v98 */
    /* JADX WARN: Type inference failed for: r33v99 */
    /* JADX WARN: Type inference failed for: r3v229, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v230 */
    /* JADX WARN: Type inference failed for: r3v231 */
    /* JADX WARN: Type inference failed for: r3v232 */
    /* JADX WARN: Type inference failed for: r3v233 */
    /* JADX WARN: Type inference failed for: r3v246 */
    /* JADX WARN: Type inference failed for: r3v247 */
    /* JADX WARN: Type inference failed for: r3v259 */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v432 */
    /* JADX WARN: Type inference failed for: r3v433 */
    /* JADX WARN: Type inference failed for: r3v434 */
    /* JADX WARN: Type inference failed for: r40v1, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r40v10 */
    /* JADX WARN: Type inference failed for: r40v100 */
    /* JADX WARN: Type inference failed for: r40v101 */
    /* JADX WARN: Type inference failed for: r40v102 */
    /* JADX WARN: Type inference failed for: r40v103 */
    /* JADX WARN: Type inference failed for: r40v104 */
    /* JADX WARN: Type inference failed for: r40v105 */
    /* JADX WARN: Type inference failed for: r40v106 */
    /* JADX WARN: Type inference failed for: r40v107 */
    /* JADX WARN: Type inference failed for: r40v108 */
    /* JADX WARN: Type inference failed for: r40v109 */
    /* JADX WARN: Type inference failed for: r40v11 */
    /* JADX WARN: Type inference failed for: r40v110 */
    /* JADX WARN: Type inference failed for: r40v111 */
    /* JADX WARN: Type inference failed for: r40v112 */
    /* JADX WARN: Type inference failed for: r40v113 */
    /* JADX WARN: Type inference failed for: r40v114 */
    /* JADX WARN: Type inference failed for: r40v115 */
    /* JADX WARN: Type inference failed for: r40v116 */
    /* JADX WARN: Type inference failed for: r40v117 */
    /* JADX WARN: Type inference failed for: r40v118 */
    /* JADX WARN: Type inference failed for: r40v119 */
    /* JADX WARN: Type inference failed for: r40v12 */
    /* JADX WARN: Type inference failed for: r40v120 */
    /* JADX WARN: Type inference failed for: r40v121 */
    /* JADX WARN: Type inference failed for: r40v122 */
    /* JADX WARN: Type inference failed for: r40v123 */
    /* JADX WARN: Type inference failed for: r40v124 */
    /* JADX WARN: Type inference failed for: r40v125 */
    /* JADX WARN: Type inference failed for: r40v126 */
    /* JADX WARN: Type inference failed for: r40v127 */
    /* JADX WARN: Type inference failed for: r40v128 */
    /* JADX WARN: Type inference failed for: r40v129 */
    /* JADX WARN: Type inference failed for: r40v13 */
    /* JADX WARN: Type inference failed for: r40v130 */
    /* JADX WARN: Type inference failed for: r40v131 */
    /* JADX WARN: Type inference failed for: r40v132 */
    /* JADX WARN: Type inference failed for: r40v133 */
    /* JADX WARN: Type inference failed for: r40v134 */
    /* JADX WARN: Type inference failed for: r40v135 */
    /* JADX WARN: Type inference failed for: r40v136 */
    /* JADX WARN: Type inference failed for: r40v137 */
    /* JADX WARN: Type inference failed for: r40v138 */
    /* JADX WARN: Type inference failed for: r40v139 */
    /* JADX WARN: Type inference failed for: r40v14 */
    /* JADX WARN: Type inference failed for: r40v140 */
    /* JADX WARN: Type inference failed for: r40v141 */
    /* JADX WARN: Type inference failed for: r40v142 */
    /* JADX WARN: Type inference failed for: r40v143 */
    /* JADX WARN: Type inference failed for: r40v144 */
    /* JADX WARN: Type inference failed for: r40v145 */
    /* JADX WARN: Type inference failed for: r40v146 */
    /* JADX WARN: Type inference failed for: r40v147 */
    /* JADX WARN: Type inference failed for: r40v148 */
    /* JADX WARN: Type inference failed for: r40v149 */
    /* JADX WARN: Type inference failed for: r40v15 */
    /* JADX WARN: Type inference failed for: r40v150 */
    /* JADX WARN: Type inference failed for: r40v151 */
    /* JADX WARN: Type inference failed for: r40v152 */
    /* JADX WARN: Type inference failed for: r40v153 */
    /* JADX WARN: Type inference failed for: r40v154 */
    /* JADX WARN: Type inference failed for: r40v155 */
    /* JADX WARN: Type inference failed for: r40v156 */
    /* JADX WARN: Type inference failed for: r40v157 */
    /* JADX WARN: Type inference failed for: r40v158 */
    /* JADX WARN: Type inference failed for: r40v16 */
    /* JADX WARN: Type inference failed for: r40v17 */
    /* JADX WARN: Type inference failed for: r40v18 */
    /* JADX WARN: Type inference failed for: r40v19 */
    /* JADX WARN: Type inference failed for: r40v20 */
    /* JADX WARN: Type inference failed for: r40v21 */
    /* JADX WARN: Type inference failed for: r40v22 */
    /* JADX WARN: Type inference failed for: r40v23 */
    /* JADX WARN: Type inference failed for: r40v28 */
    /* JADX WARN: Type inference failed for: r40v29 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r40v30 */
    /* JADX WARN: Type inference failed for: r40v31 */
    /* JADX WARN: Type inference failed for: r40v32 */
    /* JADX WARN: Type inference failed for: r40v33 */
    /* JADX WARN: Type inference failed for: r40v34 */
    /* JADX WARN: Type inference failed for: r40v35 */
    /* JADX WARN: Type inference failed for: r40v36 */
    /* JADX WARN: Type inference failed for: r40v37 */
    /* JADX WARN: Type inference failed for: r40v38 */
    /* JADX WARN: Type inference failed for: r40v39 */
    /* JADX WARN: Type inference failed for: r40v4 */
    /* JADX WARN: Type inference failed for: r40v40 */
    /* JADX WARN: Type inference failed for: r40v45 */
    /* JADX WARN: Type inference failed for: r40v46 */
    /* JADX WARN: Type inference failed for: r40v47 */
    /* JADX WARN: Type inference failed for: r40v48 */
    /* JADX WARN: Type inference failed for: r40v49 */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v50 */
    /* JADX WARN: Type inference failed for: r40v51 */
    /* JADX WARN: Type inference failed for: r40v52 */
    /* JADX WARN: Type inference failed for: r40v53 */
    /* JADX WARN: Type inference failed for: r40v54 */
    /* JADX WARN: Type inference failed for: r40v55 */
    /* JADX WARN: Type inference failed for: r40v56 */
    /* JADX WARN: Type inference failed for: r40v57 */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v64 */
    /* JADX WARN: Type inference failed for: r40v65 */
    /* JADX WARN: Type inference failed for: r40v66 */
    /* JADX WARN: Type inference failed for: r40v67 */
    /* JADX WARN: Type inference failed for: r40v68 */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r40v70 */
    /* JADX WARN: Type inference failed for: r40v71 */
    /* JADX WARN: Type inference failed for: r40v72 */
    /* JADX WARN: Type inference failed for: r40v73 */
    /* JADX WARN: Type inference failed for: r40v74 */
    /* JADX WARN: Type inference failed for: r40v76 */
    /* JADX WARN: Type inference failed for: r40v77 */
    /* JADX WARN: Type inference failed for: r40v78 */
    /* JADX WARN: Type inference failed for: r40v79 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r40v81 */
    /* JADX WARN: Type inference failed for: r40v82 */
    /* JADX WARN: Type inference failed for: r40v86 */
    /* JADX WARN: Type inference failed for: r40v87 */
    /* JADX WARN: Type inference failed for: r40v88 */
    /* JADX WARN: Type inference failed for: r40v9 */
    /* JADX WARN: Type inference failed for: r40v90 */
    /* JADX WARN: Type inference failed for: r40v91 */
    /* JADX WARN: Type inference failed for: r40v92 */
    /* JADX WARN: Type inference failed for: r40v93 */
    /* JADX WARN: Type inference failed for: r40v95 */
    /* JADX WARN: Type inference failed for: r40v96 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v10 */
    /* JADX WARN: Type inference failed for: r41v11 */
    /* JADX WARN: Type inference failed for: r41v12 */
    /* JADX WARN: Type inference failed for: r41v13 */
    /* JADX WARN: Type inference failed for: r41v14 */
    /* JADX WARN: Type inference failed for: r41v15 */
    /* JADX WARN: Type inference failed for: r41v16 */
    /* JADX WARN: Type inference failed for: r41v17 */
    /* JADX WARN: Type inference failed for: r41v18 */
    /* JADX WARN: Type inference failed for: r41v19 */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r41v20 */
    /* JADX WARN: Type inference failed for: r41v21 */
    /* JADX WARN: Type inference failed for: r41v22 */
    /* JADX WARN: Type inference failed for: r41v23 */
    /* JADX WARN: Type inference failed for: r41v24 */
    /* JADX WARN: Type inference failed for: r41v25 */
    /* JADX WARN: Type inference failed for: r41v26 */
    /* JADX WARN: Type inference failed for: r41v27 */
    /* JADX WARN: Type inference failed for: r41v28 */
    /* JADX WARN: Type inference failed for: r41v29 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r41v6 */
    /* JADX WARN: Type inference failed for: r41v8 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX WARN: Type inference failed for: r4v275, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v314 */
    /* JADX WARN: Type inference failed for: r4v315 */
    /* JADX WARN: Type inference failed for: r4v316 */
    /* JADX WARN: Type inference failed for: r4v317 */
    /* JADX WARN: Type inference failed for: r4v318 */
    /* JADX WARN: Type inference failed for: r4v319 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v70, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v83 */
    /* JADX WARN: Type inference failed for: r4v84 */
    /* JADX WARN: Type inference failed for: r4v85 */
    /* JADX WARN: Type inference failed for: r4v89 */
    /* JADX WARN: Type inference failed for: r4v90 */
    /* JADX WARN: Type inference failed for: r4v91, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v95 */
    /* JADX WARN: Type inference failed for: r4v96 */
    /* JADX WARN: Type inference failed for: r5v174, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v175, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v207 */
    /* JADX WARN: Type inference failed for: r5v677 */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v267 */
    /* JADX WARN: Type inference failed for: r6v268 */
    /* JADX WARN: Type inference failed for: r6v269 */
    /* JADX WARN: Type inference failed for: r6v270 */
    /* JADX WARN: Type inference failed for: r6v290 */
    /* JADX WARN: Type inference failed for: r6v291 */
    /* JADX WARN: Type inference failed for: r8v173, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v175, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v184 */
    /* JADX WARN: Type inference failed for: r8v510 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.ScanIDConfirmActivity.attachBaseContext(android.content.Context):void");
    }

    public static boolean $r8$lambda$0iZni9fXKSGFBe773cmruyX1TPI(ScanIDConfirmActivity scanIDConfirmActivity) {
        int i = 2 % 2;
        int i2 = component4 + 43;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            uploadPhoto_delegate$lambda$0(scanIDConfirmActivity);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        boolean zUploadPhoto_delegate$lambda$0 = uploadPhoto_delegate$lambda$0(scanIDConfirmActivity);
        int i3 = component4 + 55;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return zUploadPhoto_delegate$lambda$0;
    }

    public static void m12205$r8$lambda$5P6fibDpcsjpoySev8dzcXu2bU(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 125;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m12208instrumented$1$initView$V(scanIDConfirmActivity, view);
        if (i3 == 0) {
            int i4 = 9 / 0;
        }
        int i5 = copy + 35;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$fxsN6KQ9TAPJnIoohgEbOH72k9U(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m12207instrumented$0$initView$V(scanIDConfirmActivity, view);
        if (i3 != 0) {
            int i4 = 59 / 0;
        }
        int i5 = copy + 87;
        component4 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void $r8$lambda$tWMaNTQbEibvPDTlB0Y79sIQbzg(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 109;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        m12209instrumented$2$initView$V(scanIDConfirmActivity, view);
        int i4 = component4 + 125;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void m12207instrumented$0$initView$V(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 89;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$3(scanIDConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = copy + 121;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m12208instrumented$1$initView$V(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 73;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                initView$lambda$4(scanIDConfirmActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            initView$lambda$4(scanIDConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = component4 + 117;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12209instrumented$2$initView$V(ScanIDConfirmActivity scanIDConfirmActivity, View view) {
        int i = 2 % 2;
        int i2 = component4 + 39;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$5(scanIDConfirmActivity, view);
            Callback.onClick_exit();
            int i4 = copy + 97;
            component4 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component4 + 3;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 10 / 0;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 119;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
    }
}
