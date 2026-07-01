package com.huawei.digitalpayment.customer.dynamics.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.framework.utils.Format;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.listener.ApiCallback;
import com.huawei.common.util.L;
import com.huawei.common.util.image.PicBase64Utils;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.customer.dynamics.R;
import com.huawei.digitalpayment.customer.dynamics.constants.Keys;
import com.huawei.digitalpayment.customer.dynamics.databinding.ActivitySignatureBinding;
import com.huawei.digitalpayment.customer.dynamics.req.UploadImageParams;
import com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp;
import com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState;
import com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadViewModel;
import com.huawei.digitalpayment.customer.dynamics.widget.signature.SignatureView;
import com.huawei.image.glide.Base64Mode;
import com.huawei.image.glide.ImageRequest;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\b\u0010\n\u001a\u00020\u0007H\u0014J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0002J\b\u0010\u0012\u001a\u00020\u0007H\u0002J\b\u0010\u0013\u001a\u00020\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u001d\u001a\u00020\u001eH\u0014¨\u0006 "}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/ui/SignatureActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentBaseActivity;", "Lcom/huawei/digitalpayment/customer/dynamics/databinding/ActivitySignatureBinding;", "Lcom/huawei/digitalpayment/customer/dynamics/vm/PhotoUploadViewModel;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "initView", "onRootWindowInsetsChanged", "root", "Landroid/view/View;", "windowInsets", "Landroidx/core/view/WindowInsetsCompat;", "initData", "observeData", "saveSignature", "signatureBitmap", "Landroid/graphics/Bitmap;", "uploadImage", "content", "", "onUploadDone", "result", "initToolbar", "title", "getLayoutId", "", "Companion", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
public final class SignatureActivity extends Hilt_SignatureActivity<ActivitySignatureBinding, PhotoUploadViewModel> {

    public static final Companion INSTANCE;
    private static final int DEFAULT_PAINT_POINT_SIZE = 50;
    private static final int MAX_PHOTO_SIZE = 1000;
    private static final int MIN_PAINT_POINT_SIZE = 30;
    private static final float SIGNATURE_LAYOUT_ROTATION = 90.0f;
    private static int ShareDataUIState;
    private static int[] component1;
    private static int component2;
    private static int component3;
    private static short[] component4;
    private static int copy;
    private static byte[] copydefault;
    private static final byte[] $$l = {62, TarHeader.LF_FIFO, 60, 44};
    private static final int $$o = 67;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {35, -11, -97, -73, 9, -62, 71, -10, -1, 5, 20, -8, Ascii.DLE, -14, Ascii.SYN, -71, 62, 8, 9, -12, Ascii.DLE, -1, -10, Ascii.SO, -59, 68, 4, -8, Ascii.DLE, -14, Ascii.SYN, -2, 6, 4, -66, 59, 9, 6, Ascii.VT, -19, 4, 13, -4, -52, Ascii.ESC, 41, 6, Ascii.VT, -19, 4, 13, -4, -14, Ascii.DLE, 13, -3, -11, 20, 4, 6, -4, -62, 66, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -63, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, 7, 8, -5, 0, 8, 13, -71, 56, Ascii.SI, 6, 0, 9, 2, -8, 8, -6, 17, -66, 57, 4, 0, Ascii.SYN, -11, -54, 62, 8, 9, -12, Ascii.DLE, -1, -10, Ascii.SO, -59, Ascii.EM, 36, 0, Ascii.SYN, -11, -33, 47, 6, 0, 9, 2, -8, 8, -6, -25, 40, -5, Ascii.FF, -35, 39, 6, -1, -69, TarHeader.LF_SYMLINK, Ascii.CAN, -4, 20, -10, -30, 32, Ascii.SYN, -16, -9, -9, 13, 36, -16, Ascii.SYN, -12};
    private static final int $$n = 125;
    private static final byte[] $$d = {4, -66, -36, 8, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 142;
    private static int getAsAtTimestamp = 0;
    private static int equals = 0;
    private static int getRequestBeneficiariesState = 1;

    private static String $$r(byte b2, byte b3, byte b4) {
        int i = 116 - b2;
        int i2 = b4 * 3;
        byte[] bArr = $$l;
        int i3 = 3 - (b3 * 4);
        byte[] bArr2 = new byte[1 - i2];
        int i4 = 0 - i2;
        int i5 = -1;
        if (bArr == null) {
            i = (-i) + i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3 + 1;
            i = (-bArr[i7]) + i;
            i3 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.$$d
            int r7 = r7 * 2
            int r7 = 103 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.h(int, int, int, java.lang.Object[]):void");
    }

    private static void i(short s, int i, int i2, Object[] objArr) {
        int i3 = 107 - (i2 * 2);
        int i4 = i * 3;
        int i5 = (s * 3) + 4;
        byte[] bArr = $$m;
        byte[] bArr2 = new byte[73 - i4];
        int i6 = 72 - i4;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 = (i3 + i6) - 3;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5++;
                i3 = (i3 + bArr[i5]) - 3;
            }
        }
    }

    public static final ViewDataBinding m12211access$getBinding$p$s1308624953(SignatureActivity signatureActivity) {
        int i = 2 % 2;
        int i2 = equals + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = signatureActivity.binding;
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        int i5 = getRequestBeneficiariesState + 75;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return binding;
    }

    public static final ViewModel m12212access$getViewModel$p$s1308624953(SignatureActivity signatureActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 53;
        equals = i2 % 128;
        int i3 = i2 % 2;
        VM vm = signatureActivity.viewModel;
        int i4 = equals + 79;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    public static final void access$onUploadDone(SignatureActivity signatureActivity, String str) {
        int i = 2 % 2;
        int i2 = equals + 1;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        signatureActivity.onUploadDone(str);
        int i4 = getRequestBeneficiariesState + 107;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1", f = "SignatureActivity.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = ShareDataUIState + 27;
                component3 = i3 % 128;
                if (i3 % 2 != 0 ? i2 != 1 : i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                final StateFlow<PhotoUploadUiState> stateFlowUiState = ((PhotoUploadViewModel) SignatureActivity.m12212access$getViewModel$p$s1308624953(SignatureActivity.this)).uiState();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<Resource<UploadImageResp>>() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;
                        final FlowCollector copydefault;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1$2", f = "SignatureActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            private static int ShareDataUIState = 1;
                            private static int copydefault;
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override
                            public final Object invokeSuspend(Object obj) {
                                int i = 2 % 2;
                                int i2 = ShareDataUIState + 101;
                                copydefault = i2 % 128;
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
                                boolean r1 = r7 instanceof com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                if (r1 == 0) goto L29
                                r1 = r7
                                com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                int r2 = r1.label
                                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                r2 = r2 & r3
                                if (r2 == 0) goto L29
                                int r7 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r7 = r7 + 107
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                int r7 = r7 % r0
                                int r7 = r1.label
                                int r7 = r7 + r3
                                r1.label = r7
                                int r7 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                int r7 = r7 + 61
                                int r2 = r7 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                int r7 = r7 % r0
                                goto L2e
                            L29:
                                com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1$2$1
                                r1.<init>(r7)
                            L2e:
                                java.lang.Object r7 = r1.result
                                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r3 = r1.label
                                r4 = 1
                                if (r3 == 0) goto L47
                                if (r3 != r4) goto L3f
                                kotlin.ResultKt.throwOnFailure(r7)
                                goto L6d
                            L3f:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                r6.<init>(r7)
                                throw r6
                            L47:
                                kotlin.ResultKt.throwOnFailure(r7)
                                kotlinx.coroutines.flow.FlowCollector r7 = r5.copydefault
                                r3 = r1
                                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState r6 = (com.huawei.digitalpayment.customer.dynamics.vm.PhotoUploadUiState) r6
                                com.huawei.payment.mvvm.Resource r6 = r6.getUpload()
                                r1.label = r4
                                java.lang.Object r6 = r7.emit(r6, r1)
                                if (r6 != r2) goto L6d
                                int r6 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                int r6 = r6 + 59
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r7
                                int r6 = r6 % r0
                                if (r6 == 0) goto L6c
                                r6 = 81
                                int r6 = r6 / 0
                            L6c:
                                return r2
                            L6d:
                                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                return r6
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity$observeData$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.copydefault = flowCollector;
                        }
                    }

                    @Override
                    public Object collect(FlowCollector<? super Resource<UploadImageResp>> flowCollector, Continuation continuation) {
                        int i4 = 2 % 2;
                        Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                        Object obj2 = null;
                        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            int i5 = component1 + 105;
                            copydefault = i5 % 128;
                            if (i5 % 2 != 0) {
                                return objCollect;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                        Unit unit = Unit.INSTANCE;
                        int i6 = copydefault + 35;
                        component1 = i6 % 128;
                        if (i6 % 2 == 0) {
                            return unit;
                        }
                        obj2.hashCode();
                        throw null;
                    }
                });
                final SignatureActivity signatureActivity = SignatureActivity.this;
                this.component2 = 1;
                if (flowDistinctUntilChanged.collect(new FlowCollector() {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i4 = 2 % 2;
                        int i5 = component1 + 47;
                        component2 = i5 % 128;
                        Resource<UploadImageResp> resource = (Resource) obj2;
                        if (i5 % 2 != 0) {
                            return component3(resource, continuation);
                        }
                        component3(resource, continuation);
                        Object obj3 = null;
                        obj3.hashCode();
                        throw null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object component3(com.huawei.payment.mvvm.Resource<com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp> r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                        /*
                            r3 = this;
                            r5 = 2
                            int r0 = r5 % r5
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity r0 = r1
                            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
                            com.huawei.payment.mvvm.Utils.showOrHideLoading(r0, r4)
                            boolean r0 = r4.error()
                            r1 = 0
                            if (r0 == 0) goto L33
                            int r0 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component1
                            int r0 = r0 + 23
                            int r2 = r0 % 128
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component2 = r2
                            int r0 = r0 % r5
                            if (r0 == 0) goto L26
                            java.lang.String r4 = r4.getMessage()
                            com.huawei.common.widget.toast.CommonToast.showText(r4)
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        L26:
                            java.lang.String r4 = r4.getMessage()
                            com.huawei.common.widget.toast.CommonToast.showText(r4)
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            r1.hashCode()
                            throw r1
                        L33:
                            boolean r0 = r4.success()
                            if (r0 == 0) goto L6f
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity r0 = r1
                            java.lang.Object r4 = r4.getData()
                            com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp r4 = (com.huawei.digitalpayment.customer.dynamics.resp.UploadImageResp) r4
                            if (r4 == 0) goto L55
                            java.lang.String r1 = r4.getDocId()
                            int r4 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component2
                            int r4 = r4 + 67
                            int r2 = r4 % 128
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component1 = r2
                            int r4 = r4 % r5
                            if (r4 == 0) goto L5e
                            r4 = 3
                        L53:
                            int r4 = r4 % r5
                            goto L5e
                        L55:
                            int r4 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component2
                            int r4 = r4 + 21
                            int r2 = r4 % 128
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component1 = r2
                            goto L53
                        L5e:
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.access$onUploadDone(r0, r1)
                            int r4 = com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component2
                            int r4 = r4 + 125
                            int r0 = r4 % 128
                            com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component1 = r0
                            int r4 = r4 % r5
                            if (r4 == 0) goto L6f
                            r4 = 4
                            int r4 = r4 / 5
                        L6f:
                            kotlin.Unit r4 = kotlin.Unit.INSTANCE
                            return r4
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.component3.AnonymousClass5.component3(com.huawei.payment.mvvm.Resource, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) == coroutine_suspended) {
                    int i4 = ShareDataUIState + 3;
                    int i5 = i4 % 128;
                    component3 = i5;
                    int i6 = i4 % 2;
                    int i7 = i5 + 35;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 != 0) {
                        int i8 = 23 / 0;
                    }
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = SignatureActivity.this.new component3(continuation);
            int i2 = component3 + 1;
            ShareDataUIState = i2 % 128;
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
            int i2 = ShareDataUIState + 9;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objCopydefault = copydefault(coroutineScope, continuation);
            int i4 = ShareDataUIState + 41;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 9 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 33;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component3Var.invokeSuspend(unit);
            }
            component3Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component1;
        int i4 = 10;
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 97;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                        if (objCopydefault == null) {
                            byte b2 = (byte) i4;
                            byte b3 = (byte) 0;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 4391, 37 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) View.resolveSize(0, 0), -309236339, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 4392, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37, (char) Gravity.getAbsoluteGravity(0, 0), -309236339, false, $$r((byte) 10, b4, b4), new Class[]{Integer.TYPE});
                        }
                        iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                        i8++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i2 = 2;
                i4 = 10;
                i5 = 684241640;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component1;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 43;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr4 = new Object[i6];
                objArr4[i7] = Integer.valueOf(iArr5[i10]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) i7;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 4391, 36 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (ViewConfiguration.getTapTimeout() >> 16), -309236339, false, $$r((byte) 10, b5, b5), new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i10++;
                i6 = 1;
                i7 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i7;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        getactivenotifications.component1 = i13;
        int i14 = $10 + 125;
        $11 = i14 % 128;
        int i15 = i14 % 2;
        while (getactivenotifications.component1 < iArr.length) {
            int i16 = $11 + 21;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr[0] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i18];
                Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault4 == null) {
                    byte b6 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2968 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, (char) (View.resolveSizeAndState(0, 0, 0) + 49871), 462826032, false, $$r((byte) 12, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i18++;
            }
            int i20 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i20;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i21 = getactivenotifications.ShareDataUIState;
            int i22 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b7 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 27637), -1616366948, false, $$r((byte) 9, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/customer/dynamics/ui/SignatureActivity$Companion;", "", "<init>", "()V", "MIN_PAINT_POINT_SIZE", "", "MAX_PHOTO_SIZE", "DEFAULT_PAINT_POINT_SIZE", "SIGNATURE_LAYOUT_ROTATION", "", "DynamicsView_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r24, byte r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.g(int, byte, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0093  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = equals + 97;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            ((ActivitySignatureBinding) this.binding).signature.clear();
            int i3 = 42 / 0;
        } else {
            super.onDestroy();
            ((ActivitySignatureBinding) this.binding).signature.clear();
        }
    }

    private static final void initView$lambda$0(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        ((ActivitySignatureBinding) signatureActivity.binding).signature.clear();
        if (i3 != 0) {
            throw null;
        }
    }

    private static final void initView$lambda$1(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        equals = i2 % 128;
        int i3 = i2 % 2;
        signatureActivity.saveSignature();
        if (i3 != 0) {
            int i4 = 20 / 0;
        }
        int i5 = getRequestBeneficiariesState + 49;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void initView() {
        int i = 2 % 2;
        ViewGroup.LayoutParams layoutParams = ((ActivitySignatureBinding) this.binding).root.getLayoutParams();
        layoutParams.width = ScreenUtils.getAppScreenHeight() - BarUtils.getActionBarHeight();
        layoutParams.height = ScreenUtils.getAppScreenWidth();
        ((ActivitySignatureBinding) this.binding).root.setLayoutParams(layoutParams);
        ((ActivitySignatureBinding) this.binding).root.setRotation(90.0f);
        ((ActivitySignatureBinding) this.binding).btnRewrite.setOnClickListener(new View.OnClickListener() {
            private static int component3 = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = component3 + 53;
                copydefault = i3 % 128;
                if (i3 % 2 != 0) {
                    SignatureActivity.$r8$lambda$2upjeUoCTnm_Y9Y_EWxKESrqFns(this.f$0, view);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                SignatureActivity.$r8$lambda$2upjeUoCTnm_Y9Y_EWxKESrqFns(this.f$0, view);
                int i4 = copydefault + 37;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 8 / 0;
                }
            }
        });
        ((ActivitySignatureBinding) this.binding).signature.setPenColor(ColorUtils.getColor(R.color.colorMainText));
        ((ActivitySignatureBinding) this.binding).signature.setOnSignedListener(new SignatureView.OnSignedListener() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public void onSigned() {
                int i2 = 2 % 2;
                int i3 = component1 + 5;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                ((ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).btnRewrite.setEnabled(true);
                int i5 = copydefault + 13;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onClear() {
                int i2 = 2 % 2;
                int i3 = component1 + 51;
                copydefault = i3 % 128;
                (i3 % 2 == 0 ? (ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this) : (ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).btnRewrite.setEnabled(false);
                int i4 = copydefault + 119;
                component1 = i4 % 128;
                int i5 = i4 % 2;
            }

            @Override
            public void onStartSigning() {
                int i2 = 2 % 2;
                int i3 = copydefault + 73;
                component1 = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        ((ActivitySignatureBinding) this.binding).btnConfirm.setOnClickListener(new SignatureActivity$$ExternalSyntheticLambda1(this));
        ((ActivitySignatureBinding) this.binding).tvToast.setBackgroundColor(ColorUtils.setAlphaComponent(getColor(R.color.colorMainText), 0.8f));
        int i2 = equals + 35;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 58 / 0;
        }
    }

    private final void initData() {
        int i;
        int i2 = 2 % 2;
        String stringExtra = getIntent().getStringExtra(KeysConstants.KEY_DOC_ID);
        String str = stringExtra;
        if (str != null) {
            int i3 = getRequestBeneficiariesState + 35;
            equals = i3 % 128;
            int i4 = i3 % 2;
            if (str.length() == 0) {
                i = equals + 35;
            } else {
                ImageRequest.INSTANCE.get().load(new Base64Mode(stringExtra, Keys.KEY_CUSTOMER_CERT)).listener(new ApiCallback<Drawable>() {
                    private static int ShareDataUIState = 0;
                    private static int component3 = 1;

                    @Override
                    public void onSuccess(Drawable drawable) {
                        int i5 = 2 % 2;
                        int i6 = ShareDataUIState + 117;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                        onSuccess2(drawable);
                        if (i7 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }

                    public void onSuccess2(Drawable value) {
                        SignatureView signatureView;
                        int i5;
                        int i6 = 2 % 2;
                        int i7 = ShareDataUIState + 45;
                        component3 = i7 % 128;
                        if (i7 % 2 == 0) {
                            Intrinsics.checkNotNullParameter(value, "");
                            ((ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).signature.setSignatureBitmap(PicBase64Utils.drawableToBitmap(value));
                            signatureView = ((ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).signature;
                            i5 = 60;
                        } else {
                            Intrinsics.checkNotNullParameter(value, "");
                            ((ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).signature.setSignatureBitmap(PicBase64Utils.drawableToBitmap(value));
                            signatureView = ((ActivitySignatureBinding) SignatureActivity.m12211access$getBinding$p$s1308624953(SignatureActivity.this)).signature;
                            i5 = 50;
                        }
                        signatureView.setPaintPointSize(i5);
                    }
                }).request();
                i = equals + 103;
            }
            getRequestBeneficiariesState = i % 128;
            int i5 = i % 2;
        }
    }

    private final void observeData() {
        int i = 2 % 2;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new component3(null), 3, null);
        int i2 = getRequestBeneficiariesState + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void saveSignature$lambda$3(SignatureActivity signatureActivity) {
        int i = 2 % 2;
        int i2 = equals + 57;
        getRequestBeneficiariesState = i2 % 128;
        ((ActivitySignatureBinding) signatureActivity.binding).tvToast.setVisibility(i2 % 2 == 0 ? 110 : 8);
    }

    private final void saveSignature() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        equals = i2 % 128;
        int i3 = i2 % 2;
        if (((ActivitySignatureBinding) this.binding).signature.getPaintPointSize() < 30) {
            ((ActivitySignatureBinding) this.binding).tvToast.setVisibility(0);
            ((ActivitySignatureBinding) this.binding).tvToast.postDelayed(new Runnable() {
                private static int component1 = 1;
                private static int copydefault;

                @Override
                public final void run() {
                    int i4 = 2 % 2;
                    int i5 = copydefault + 57;
                    component1 = i5 % 128;
                    int i6 = i5 % 2;
                    SignatureActivity.m12210$r8$lambda$s0hCm4LcqjKSHF9s6yOSel43A(this.f$0);
                    if (i6 == 0) {
                        int i7 = 4 / 0;
                    }
                }
            }, 3000L);
            int i4 = equals + 65;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        saveSignature(((ActivitySignatureBinding) this.binding).signature.getSignatureBitmap());
    }

    private final void saveSignature(Bitmap signatureBitmap) {
        int i = 2 % 2;
        int i2 = equals + 27;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        String strCompressImageToBase64 = PicBase64Utils.compressImageToBase64(signatureBitmap, 1000);
        Intrinsics.checkNotNullExpressionValue(strCompressImageToBase64, "");
        uploadImage(strCompressImageToBase64);
        int i4 = getRequestBeneficiariesState + 71;
        equals = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void uploadImage(String content) {
        int i = 2 % 2;
        ((PhotoUploadViewModel) this.viewModel).upload(new UploadImageParams("sign_" + System.currentTimeMillis() + Format.SUFFIX_JPG, content));
        int i2 = equals + 99;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void onUploadDone(String result) {
        int i = 2 % 2;
        L.d(this.TAG, "onUploadDone result: " + result);
        Intent intent = new Intent();
        intent.putExtra(KeysConstants.KEY_DOC_ID, result);
        setResult(-1, intent);
        finish();
        int i2 = equals + 91;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 31 / 0;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 5;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            super.initToolbar(getString(R.string.dynamics_digital_signature));
            int i3 = 82 / 0;
        } else {
            super.initToolbar(getString(R.string.dynamics_digital_signature));
        }
        int i4 = equals + 89;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 94 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = equals + 47;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_signature;
        if (i3 != 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onRootWindowInsetsChanged(View root, WindowInsetsCompat windowInsets) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 61;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(root, "");
        Intrinsics.checkNotNullParameter(windowInsets, "");
        Insets insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        ConstraintLayout constraintLayout = ((ActivitySignatureBinding) this.binding).root;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        ConstraintLayout constraintLayout2 = constraintLayout;
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        int i4 = getRequestBeneficiariesState + 23;
        equals = i4 % 128;
        int i5 = i4 % 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        marginLayoutParams2.width = ((ScreenUtils.getScreenHeight() - BarUtils.getActionBarHeight()) - insets.top) - insets.bottom;
        marginLayoutParams2.height = ScreenUtils.getScreenWidth();
        constraintLayout2.setLayoutParams(marginLayoutParams);
        int i6 = getRequestBeneficiariesState + 109;
        equals = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 119;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = equals + 67;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) + 2094280908, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 57), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1440839170, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 32, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 2094281013, (byte) (6 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() - 1440839141, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952812_res_0x7f1304ac).substring(55, 56).codePointAt(0) - 35, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = equals + 1;
            getRequestBeneficiariesState = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = getRequestBeneficiariesState + 61;
            equals = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 6618, 42 - Color.blue(0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 56, (char) Drawable.resolveOpacity(0, 0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = equals + 49;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).codePointAt(1) + 2094280970, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 156), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 1440839141, (short) TextUtils.getTrimmedLength(""), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() - 4, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 2094281013, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(28) - 96), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1440839168, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 108, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = equals + 65;
            getRequestBeneficiariesState = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6617 - ((byte) KeyEvent.getModifierMetaStateMask()), 41 - ExpandableListView.getPackedPositionChild(0L), (char) Color.blue(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6562, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 55, (char) (Process.myPid() >> 22), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 6617, TextUtils.indexOf("", "", 0) + 42, (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getTrimmedLength("") + 6562, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                int i5 = getRequestBeneficiariesState + 51;
                equals = i5 % 128;
                int i6 = i5 % 2;
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

    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override
    public void attachBaseContext(android.content.Context r46) {
        /*
            Method dump skipped, instruction units count: 15554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.customer.dynamics.ui.SignatureActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$2upjeUoCTnm_Y9Y_EWxKESrqFns(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 101;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m12213instrumented$0$initView$V(signatureActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$OVd1Cf9F0v2V2n5tyEKtWSGwtZU(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        equals = i2 % 128;
        int i3 = i2 % 2;
        m12214instrumented$1$initView$V(signatureActivity, view);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        int i5 = getRequestBeneficiariesState + 77;
        equals = i5 % 128;
        int i6 = i5 % 2;
    }

    public static void m12210$r8$lambda$s0hCm4LcqjKSHF9s6yOSel43A(SignatureActivity signatureActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 37;
        equals = i2 % 128;
        int i3 = i2 % 2;
        saveSignature$lambda$3(signatureActivity);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = equals + 125;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        copy = 1;
        ShareDataUIState();
        INSTANCE = new Companion(null);
        int i = getAsAtTimestamp + 9;
        copy = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Finally extract failed */
    private static void m12213instrumented$0$initView$V(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                initView$lambda$0(signatureActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            initView$lambda$0(signatureActivity, view);
            Callback.onClick_exit();
            int i4 = equals + 1;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m12214instrumented$1$initView$V(SignatureActivity signatureActivity, View view) {
        int i = 2 % 2;
        int i2 = equals + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            initView$lambda$1(signatureActivity, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 121;
            equals = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 121;
        equals = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void ShareDataUIState() {
        component1 = new int[]{-685173744, 721080202, 241157618, 1980974459, -829801602, 773922564, 289491949, -231304118, 1185859805, -723872794, 1205363733, 553482393, 1044492100, -1369193135, -725557544, -1070265478, 831664997, -1426214396};
        ShareDataUIState = 1927330273;
        component3 = -238323925;
        component2 = -1540750993;
        copydefault = new byte[]{TarHeader.LF_LINK, -19, Ascii.DC2, Ascii.GS, -28, -6, TarHeader.LF_DIR, -21, -27, Ascii.GS, -29, Ascii.ESC, -1, -52, -3, 80, -18, -31, -35, 36, Ascii.NAK, 20, 19, -32, Ascii.CAN, -29, 57, -45, 42, -39, 63, -46, -42, -47, -48, 44, 3, -31, 42, 37, -33, 44, -47, 62, 7, 112, -93, 93, -95, 91, -94, -96, -117, -96, 116, 89, 95, 95, -111, -94, -95, 94, 91, -95, 112, -112, 112, 90, -111, 113, 93, -116, 114, 94, 90, -111, 114, -113, 108, -92, 94, 93, -115, 109, -107, 92, 114, 95, -114, 107, -90, -122, Ascii.ETB, -109, 109, -106, 107, 111, -106, 109, 110, 66, -66, -111, 69, -111, -65, 94, -93, 108, -112, 95, -91, 104, -111, 69, -112, -94, 93, 111, -109, 111, -69, -104, 94, PSSSigner.TRAILER_IMPLICIT, 110, -110, -109, 95, -111, -69, -107, -109, 90, -90, 94, -70, -104, 109, SignedBytes.MAX_POWER_OF_TWO, -112, -67, 109, -107, -109, 91, -92, 95, -112, -65, -108, 111, 110, 95, -94, 111, 124, -123, -118, 108, -110, -75, 126, 63, -60, 56, -126, -115, 125, 122, -122, -71, 69, 122, -116, -79, 65, 125, -113, -74, 74, 112, -110, 111, -121, 125, -116, 113, -110, 111, -115, -70, 57, -126, -111, 125, 108, -112, 127, 112, -119, 119, -59, 79, 124, -81, -128, -127, -125, 127, -122, 127, -126, 77, -80, 127, 124, -128, 124, -124, -125, 118, 68, -128, 127, -125, -113, 45, 103, -104, 97, 97, -105, Ascii.VT, 38, -36, Ascii.FF, -12, 34, -38, 35, Ascii.FF, -18, Ascii.DLE, -16, -42, 20, -19, 35, Ascii.FF, -21, 40, -34, -33, -34, -40, 34, 39, -41, -33, -36, 40, Ascii.VT, -16, 32, 33, 10, -17, Ascii.DC2, 39, -58, 63, -49, TarHeader.LF_BLK, -24, -21, 9, TarHeader.LF_CONTIG, -61, 59, -16, 3, 37, -37, 57, 39, -9, 3, -38, 45, 3, -28, -17, 57, -13, -3, 3, -16, -1, -9, 13, 32, -8, 3, -4, 7, -6, -5, 6, 2, -2, 2, Ascii.ETB, -61, -15, -62, 58, Base64.padSymbol, Ascii.SYN, -62, -23, Ascii.SYN, 60, -15, Ascii.DC2, 63, -18, Ascii.DLE, -15, Ascii.DLE, -13, 13, 62, -10, Base64.padSymbol, 13, -18, -64, 60, Base64.padSymbol, -57, 56, Ascii.SYN, -24, -60, Ascii.SI, -16, Ascii.DC2, Base64.padSymbol, -18, -62, -57, Base64.padSymbol, 19, -62, -63, -24, 19, -14, 60, 17, -16, Base64.padSymbol, Base64.padSymbol, Ascii.DLE, 62, -14, Ascii.DC2, -17, Ascii.NAK, 60, 60, -16, Ascii.SI, -24, Ascii.DLE, Ascii.ETB, 115, -93, -115, -96, -94, 109, -95, -108, 111, -93, -117, 94, 114, -91, -117, 117, -114, 94, -96, -95, 111, -108, 95, -94, 89, -91, 92, 95, -96, -92, 91, -90, -95, 108, -107, -96, 111, -112, 89, 121, -116, -91, 91, -96, 92, -92, 95, 112, -95, 94, -114, 94, 94, -90, 111, 95, -114, 116, -113, 115, 93, -113, 95, 32, -105, -106, 110, -112, 105, 107, -111, -105, 106, -108, 33, -32, Ascii.GS, Ascii.CAN, Ascii.CAN, -29, Ascii.EM, Ascii.CAN, Ascii.SUB, -28};
    }
}
