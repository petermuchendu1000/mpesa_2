package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent;
import com.huawei.digitalpayment.consumer.fixeddata.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.getActiveNotifications;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataEntryPointActivity;", "Lcom/huawei/digitalpayment/consumer/baselib/PaymentTranslucentActivity;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeState", "observeEvents", "Companion", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataEntryPointActivity extends Hilt_FixedDataEntryPointActivity<ViewModel> {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String EXTRA_CLICKED_TYPE = "extra_clicked_type";
    private static int[] ShareDataUIState;
    private static char[] component1;
    private static int[] component3;
    private static int equals;

    @Inject
    public FixedDataViewModel fixedDataViewModel;
    private static final byte[] $$c = {86, 117, -27, 75};
    private static final int $$f = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {86, 117, -27, 75, -39, -25, -30, -26, -26, -18, -36, -33, 40, -39, -25, -30, -26, -26, -18, -36, -33, 38, -39, -25, -30, -26, -26, -18, -36, -33, 39};
    private static final int $$n = 176;
    private static final byte[] $$a = {125, 44, 8, -98, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 84;
    private static int getAsAtTimestamp = 1;
    private static int component2 = 0;
    private static int copydefault = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.$$c
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            r3 = -1
            if (r1 != 0) goto L17
            r4 = r3
            r3 = r6
            goto L2f
        L17:
            r5 = r7
            r7 = r6
            r6 = r5
        L1a:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L29:
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.$$i(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 4
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r7 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.$$a
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            int r7 = r7 + (-8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.d(short, short, int, java.lang.Object[]):void");
    }

    private static void f(int i, int i2, byte b2, Object[] objArr) {
        int i3 = 99 - (i2 * 4);
        byte[] bArr = $$m;
        int i4 = i * 3;
        int i5 = (b2 * 9) + 4;
        byte[] bArr2 = new byte[i4 + 10];
        int i6 = i4 + 9;
        int i7 = -1;
        if (bArr == null) {
            i5++;
            i3 = (i3 + (-i6)) - 27;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5++;
                i3 = (i3 + (-bArr[i5])) - 27;
            }
        }
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 87;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i4 = i2 + 59;
        component2 = i4 % 128;
        int i5 = i4 % 2;
        return fixedDataViewModel;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = copydefault + 77;
        component2 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
        this.fixedDataViewModel = fixedDataViewModel;
        int i3 = copydefault + 67;
        component2 = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity$observeState$2", f = "FixedDataEntryPointActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<FixedDataUiState, Continuation<? super Unit>, Object> {
        private static int component2 = 1;
        private static int component3;
        int component1;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 39;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component1 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = component3 + 99;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            ExtensionsKt.showProgress(FixedDataEntryPointActivity.this, ((FixedDataUiState) this.copydefault).isLoading());
            Unit unit = Unit.INSTANCE;
            int i6 = component2 + 107;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = FixedDataEntryPointActivity.this.new component3(continuation);
            component3Var.copydefault = obj;
            component3 component3Var2 = component3Var;
            int i2 = component2 + 91;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var2;
        }

        public final Object copydefault(FixedDataUiState fixedDataUiState, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 3;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(fixedDataUiState, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 97;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(FixedDataUiState fixedDataUiState, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 75;
            component3 = i2 % 128;
            FixedDataUiState fixedDataUiState2 = fixedDataUiState;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(fixedDataUiState2, continuation2);
            }
            copydefault(fixedDataUiState2, continuation2);
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/UiEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity$observeEvents$1", f = "FixedDataEntryPointActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<UiEvent, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int component2;
        Object copydefault;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 99;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.component2 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = component3 + 11;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            ResultKt.throwOnFailure(obj);
            UiEvent uiEvent = (UiEvent) this.copydefault;
            if (uiEvent instanceof UiEvent.NavigateToHomeFibre) {
                RouteUtils.routeWithExecute(FixedDataEntryPointActivity.this, RoutePathConstant.SFC_FIXED_DATA_DASHBOARD, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                FixedDataEntryPointActivity.this.finish();
            } else if (uiEvent instanceof UiEvent.NavigateToDiscovery) {
                FixedDataEntryPointActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((UiEvent.NavigateToDiscovery) uiEvent).getUrl())));
                FixedDataEntryPointActivity.this.finish();
            } else if (uiEvent instanceof UiEvent.ShowError) {
                Toast.makeText(FixedDataEntryPointActivity.this, ((UiEvent.ShowError) uiEvent).getError().getResponseDesc(), 1).show();
                FixedDataEntryPointActivity.this.finish();
            }
            Unit unit = Unit.INSTANCE;
            int i6 = ShareDataUIState + 105;
            component3 = i6 % 128;
            int i7 = i6 % 2;
            return unit;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FixedDataEntryPointActivity.this.new copydefault(continuation);
            copydefaultVar.copydefault = obj;
            copydefault copydefaultVar2 = copydefaultVar;
            int i2 = component3 + 27;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            return copydefaultVar2;
        }

        public final Object component3(UiEvent uiEvent, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 87;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(uiEvent, continuation)).invokeSuspend(Unit.INSTANCE);
            if (i3 != 0) {
                int i4 = 20 / 0;
            }
            int i5 = ShareDataUIState + 17;
            component3 = i5 % 128;
            int i6 = i5 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(UiEvent uiEvent, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 5;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent3 = component3(uiEvent, continuation);
            if (i3 == 0) {
                int i4 = 97 / 0;
            }
            return objComponent3;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataEntryPointActivity$Companion;", "", "<init>", "()V", "EXTRA_CLICKED_TYPE", "", "ConsumerSfcFixedData_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = component3;
        char c2 = '0';
        int i3 = 684241640;
        int i4 = 1;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i3);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4391 - View.combineMeasuredStates(0, 0), TextUtils.indexOf("", c2) + 38, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), -309236339, false, $$i(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i6++;
                    int i7 = $11 + 77;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    c2 = '0';
                    i3 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = component3;
        if (iArr5 != null) {
            int i9 = $11 + 111;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                try {
                    Object[] objArr3 = new Object[i4];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) i5;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(i5) + 4392, 37 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), -309236339, false, $$i(b3, (byte) (b3 | 9), b3), new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i11++;
                    i4 = 1;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i12 = i5;
        System.arraycopy(iArr5, i12, iArr4, i12, length2);
        getactivenotifications.component1 = i12;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i12] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i13 = $11 + 115;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < 16; i15++) {
                getactivenotifications.ShareDataUIState ^= iArr4[i15];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2968, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (49871 - (ViewConfiguration.getTouchSlop() >> 8)), 462826032, false, $$i(b4, (byte) (b4 | Ascii.VT), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionGroup(0L) + 27637), -1616366948, false, $$i(b5, (byte) (b5 | 8), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            int i19 = $11 + 37;
            $10 = i19 % 128;
            int i20 = i19 % 2;
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ShareDataUIState;
        int i4 = 684241640;
        int i5 = 16;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 55;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i4);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((-16772825) - Color.rgb(0, 0, 0), 37 - (ViewConfiguration.getFadingEdgeLength() >> i5), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -309236339, false, $$i(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i10++;
                    i4 = 684241640;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ShareDataUIState;
        char c2 = '0';
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = $11 + 41;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr5[i13]);
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                if (objCopydefault2 == null) {
                    byte b3 = (byte) i7;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4390 - TextUtils.indexOf("", c2), (-16777179) - Color.rgb(i7, i7, i7), (char) Color.red(i7), -309236339, false, $$i(b3, (byte) (b3 | 9), b3), new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                i13++;
                c2 = '0';
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
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
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i14];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - TextUtils.getTrimmedLength(""), 16 - (ViewConfiguration.getTouchSlop() >> 8), (char) (TextUtils.lastIndexOf("", '0') + 49872), 462826032, false, $$i(b4, (byte) (b4 | Ascii.VT), b4), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i14++;
            }
            int i16 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i16;
            getactivenotifications.component2 ^= iArr4[16];
            getactivenotifications.ShareDataUIState ^= iArr4[17];
            int i17 = getactivenotifications.ShareDataUIState;
            int i18 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr4);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b5 = (byte) 0;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((-16774272) - Color.rgb(0, 0, 0), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 27638), -1616366948, false, $$i(b5, (byte) (b5 | 8), b5), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr3 = component1;
        double d2 = 0.0d;
        Object obj = null;
        if (cArr3 != null) {
            int i7 = $11 + 51;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 656, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d2 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d2 ? 0 : -1)) + 14, (char) (View.resolveSize(0, 0) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr2[i] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i++;
                    d2 = 0.0d;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr3, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c2 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i8 = $11 + 91;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = iTrustedWebActivityService_Parcel.copydefault;
                        try {
                            Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                            if (objCopydefault2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = (byte) (b2 + 5);
                                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 4502, 36 - View.combineMeasuredStates(0, 0), (char) (27897 - TextUtils.getTrimmedLength("")), -1464227204, false, $$i(b2, b3, (byte) (b3 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[i9] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 5);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4502, KeyEvent.keyCodeFromString("") + 36, (char) ((-16749319) - Color.rgb(0, 0, 0)), -1464227204, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                        if (objCopydefault4 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.keyCodeFromString("") + 3580, 28 - Color.alpha(0), (char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 1180380354, false, $$i(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr5[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = (byte) (b8 + 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - (ViewConfiguration.getFadingEdgeLength() >> 16), 34 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 80302927, false, $$i(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i12 = $10 + 27;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 81;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
            }
            int i16 = $10 + 113;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                iTrustedWebActivityService_Parcel.copydefault++;
            }
        }
        String str = new String(cArr4);
        int i18 = $11 + 99;
        $10 = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Method method;
        Object[] objArr;
        char c2;
        int i = 2 % 2;
        int i2 = component2 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131954889_res_0x7f130cc9).substring(0, 1).length() + 17, new int[]{-521047218, 795284433, 2077403943, 1111104101, 734338494, 263964931, -581859455, 852155730, -232329228, 2130497086}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(View.resolveSize(0, 0) + 5, new int[]{666383068, 2037365218, -624196634, -1530356907}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = component2 + 7;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    c(new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, new int[]{0, 26, 0, 17}, false, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    c(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{26, 18, 14, 0}, false, objArr5);
                    method = cls2.getMethod((String) objArr5[0], new Class[0]);
                } else {
                    Object[] objArr6 = new Object[1];
                    c(new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, new int[]{0, 26, 0, 17}, false, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    c(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{26, 18, 14, 0}, true, objArr7);
                    method = cls3.getMethod((String) objArr7[0], new Class[0]);
                }
                baseContext = (Context) method.invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getPressedStateDuration() >> 16) + 42, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(20) - 60, new int[]{1434256074, 394200424, -961654041, 2028438918, 1547403346, -1371166105, 1628459994, 370208687, 124256121, -445505173, -495119795, -360976811, -1344800476, 1212875587, -1502335051, 784552279, 1543693724, 1543134064, 1364014094, 703788957, 1020963726, 827104870, -1314841259, 1660787303}, objArr8);
                    String str = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35, new int[]{-1750596670, -1055061897, 1780720960, -39103719, -1811911193, -1750896651, -1122139067, -2116231367, -621914263, 82222258, -1251429908, 1257979657, -1370938221, 858188900, -171700728, 338057014, -510097489, 1804015624, 1650576011, -686516847, 1747092886, -53963611, 1563203296, -1212353750, -718365657, 1463434986, -22445567, 1539310692, -1330494192, 1339557806, 1481513818, -2035322372}, objArr9);
                    String str2 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) + 32, new int[]{753346460, -1559714244, -1225866178, 761020719, -930152426, 497648248, -1718957604, 1628275351, -565630322, -253882342, -842870129, -1208879121, -1900007636, -2118219808, -87992823, 1970341731, 237050761, -1981823394, 904858092, 463738192, 1357900096, 86536251, 1370262433, -524801733, -806254225, -1285704014, -1369923120, -2004614133, -1054483676, -1274677752, -860693454, -741008181}, objArr10);
                    String str3 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    c(new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{44, 72, 0, 0}, false, objArr11);
                    String str4 = (String) objArr11[0];
                    Object[] objArr12 = new Object[1];
                    c(new byte[]{1, 1, 1, 1, 0, 1}, new int[]{116, 6, 0, 0}, false, objArr12);
                    String str5 = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    b(36 - View.MeasureSpec.getMode(0), new int[]{1355610305, 1531131848, -1548317955, -1443984486, -610093280, 50795464, -1814219473, -1112035254, 542106222, 2001142382, -315741348, -1033329387, 1640379961, 1026834467, 1093825838, -83599666, -297629750, 1834617592}, objArr13);
                    Object[] objArr14 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr13[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - View.resolveSize(0, 0), 56 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) View.MeasureSpec.getMode(0), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr14);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
        if (objCopydefault3 == null) {
            byte[] bArr = $$a;
            byte b2 = bArr[2];
            byte b3 = bArr[33];
            Object[] objArr15 = new Object[1];
            d(b2, b3, b3, objArr15);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 2405, TextUtils.lastIndexOf("", '0') + 27, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), -2047739879, false, (String) objArr15[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i5 = copydefault + 49;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 2405;
                int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte[] bArr2 = $$a;
                Object[] objArr16 = new Object[1];
                d(bArr2[2], (byte) (-bArr2[63]), (byte) (-bArr2[8]), objArr16);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(windowTouchSlop, deadChar, scrollBarFadeDuration, 24929979, false, (String) objArr16[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
            c2 = 2;
        } else {
            Object[] objArr17 = new Object[1];
            b((ViewConfiguration.getFadingEdgeLength() >> 16) + 16, new int[]{1616782407, -1430962533, -1844737032, 608685030, 1438426384, 635213060, -1482920514, 994635800}, objArr17);
            Class<?> cls4 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            c(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{122, 16, 166, 0}, false, objArr18);
            try {
                Object[] objArr19 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, 1051280266};
                Object[] objArr20 = new Object[1];
                e((ViewConfiguration.getTouchSlop() >> 8) + 70, new int[]{1666257112, -1622700253, 425341030, -1564790617, -1825112671, -785208406, -909135896, -617380032, 1551331614, -43822651, -765078850, 789624155, -1476621588, 155920109, -741752899, -1850534706, 152548740, -783787984, -233201868, 1975994551, 1800081881, -1598652318, -422816808, 1412305985, -778571958, -367926054, -737353779, 1949828372, -1330731906, 1177806326, 1760648088, -85188087, -2100848410, 1096704847, -1489514645, -293533362}, objArr20);
                Class<?> cls5 = Class.forName(((String) objArr20[0]).intern());
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr21 = new Object[1];
                f(b4, b5, b5, objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr19);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2406;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                    char cAlpha = (char) Color.alpha(0);
                    byte[] bArr3 = $$a;
                    Object[] objArr22 = new Object[1];
                    d(bArr3[2], (byte) (-bArr3[63]), (byte) (-bArr3[8]), objArr22);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iLastIndexOf, iKeyCodeFromString, cAlpha, 24929979, false, (String) objArr22[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    b(22 - TextUtils.indexOf("", "", 0, 0), new int[]{-521047218, 795284433, 2077403943, 1111104101, -2523238, 1712746639, 334565001, -827804466, 925886177, 1293356682, -1679037824, -561750412}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    b(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952754_res_0x7f130472).substring(2, 3).length() + 14, new int[]{-1253585216, -1940265965, 34731184, -2146112677, 1576465976, -1637662339, 1122705005, -132767251}, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iKeyCodeFromString2 = 2405 - KeyEvent.keyCodeFromString("");
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                        char deadChar2 = (char) KeyEvent.getDeadChar(0, 0);
                        Object[] objArr25 = new Object[1];
                        d((byte) ($$a[40] - 1), r11[54], r11[38], objArr25);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iKeyCodeFromString2, iMakeMeasureSpec, deadChar2, -1843538389, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iCombineMeasuredStates = 2405 - View.combineMeasuredStates(0, 0);
                        int gidForName = Process.getGidForName("") + 27;
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[2];
                        byte b7 = bArr4[33];
                        Object[] objArr26 = new Object[1];
                        d(b6, b7, b7, objArr26);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, gidForName, cIndexOf, -2047739879, false, (String) objArr26[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
                    int i7 = copydefault + 123;
                    component2 = i7 % 128;
                    c2 = 2;
                    int i8 = i7 % 2;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i9 = ((int[]) objArr[0])[0];
        int i10 = ((int[]) objArr[c2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(6617 - ImageFormat.getBitsPerPixel(0), 42 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (Process.myPid() >> 22), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i11 = copydefault + 105;
            component2 = i11 % 128;
            int i12 = i11 % 2;
            try {
                Object[] objArr27 = {-597663960, Long.valueOf(j4), arrayList, null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (ViewConfiguration.getTapTimeout() >> 16) + 56, (char) (TextUtils.lastIndexOf("", '0') + 1));
                byte b8 = (byte) 0;
                byte b9 = b8;
                Object[] objArr28 = new Object[1];
                f(b8, b9, (byte) (b9 + 1), objArr28);
                cls7.getMethod((String) objArr28[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr27);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        if (isFinishing()) {
            return;
        }
        observeState();
        observeEvents();
        String stringExtra = getIntent().getStringExtra(EXTRA_CLICKED_TYPE);
        FixedDataType fixedDataTypeFromCode = FixedDataType.INSTANCE.fromCode(stringExtra != null ? stringExtra : "");
        if (fixedDataTypeFromCode == null) {
            fixedDataTypeFromCode = FixedDataType.HOME_FIBRE;
        }
        getFixedDataViewModel().fetchUserDetails(fixedDataTypeFromCode, true);
    }

    private final void observeState() {
        int i = 2 % 2;
        Object obj = null;
        ExtensionsKt.collectLatest(this, FlowKt.distinctUntilChangedBy(getFixedDataViewModel().getUiState(), new Function1() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj2) {
                int i2 = 2 % 2;
                int i3 = copydefault + 39;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Boolean boolValueOf = Boolean.valueOf(FixedDataEntryPointActivity.$r8$lambda$9VymLyxWX5D5fU6cYyFj4IyZ_7c((FixedDataUiState) obj2));
                int i5 = component2 + 27;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return boolValueOf;
            }
        }), new component3(null));
        int i2 = component2 + 63;
        copydefault = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static final boolean observeState$lambda$0(FixedDataUiState fixedDataUiState) {
        int i = 2 % 2;
        int i2 = component2 + 107;
        copydefault = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fixedDataUiState, "");
            fixedDataUiState.isLoading();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataUiState, "");
        boolean zIsLoading = fixedDataUiState.isLoading();
        int i3 = copydefault + 65;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        return zIsLoading;
    }

    private final void observeEvents() {
        int i = 2 % 2;
        ExtensionsKt.collectLatest(this, getFixedDataViewModel().getEvents(), new copydefault(null));
        int i2 = component2 + 69;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onResume() throws Throwable {
        Method method;
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = component2 + 55;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                Object[] objArr = new Object[1];
                c(new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, new int[]{0, 26, 0, 17}, false, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                c(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{26, 18, 14, 0}, false, objArr2);
                method = cls.getMethod((String) objArr2[0], new Class[1]);
            } else {
                Object[] objArr3 = new Object[1];
                c(new byte[]{0, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1}, new int[]{0, 26, 0, 17}, false, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{26, 18, 14, 0}, true, objArr4);
                method = cls2.getMethod((String) objArr4[0], new Class[0]);
            }
            baseContext = (Context) method.invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i3 = copydefault + 53;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i5 = component2 + 51;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, TextUtils.indexOf("", "") + 42, (char) ((-1) - ImageFormat.getBitsPerPixel(0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr5 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0, 0) + 6562, 56 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) Color.argb(0, 0, 0, 0), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr5);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(8:857|18|(1:20)|21|22|23|(1:25)|26)(1:7))(0)|30|881|31|(2:828|33)|37|38|860|(5:40|41|(1:43)|44|45)(21:46|47|865|48|(2:877|50)|54|55|861|56|(2:802|58)|62|63|64|(1:66)|67|68|69|(1:71)|72|(1:74)|75)|76|(4:79|(3:891|81|(3:889|83|896)(12:887|87|(3:89|(3:92|93|90)|897)|94|853|95|(1:97)|98|99|841|100|895))(3:886|84|(3:890|86|894)(12:892|87|(0)|94|853|95|(0)|98|99|841|100|895))|893|77)|888|141|(27:(9:815|142|(1:144)|145|146|(4:148|149|(1:151)|152)(19:153|154|810|155|(1:157)|158|159|804|160|(1:162)|163|164|165|(1:167)|168|(1:170)|171|(1:173)|174)|175|(4:178|(3:900|180|903)(12:899|181|(3:183|(3:186|187|184)|904)|188|792|189|(1:191)|192|193|879|194|902)|901|176)|898)|808|311|(1:313)|314|800|315|(1:317)|318|342|(2:824|343)|(12:797|345|349|(5:788|351|352|885|353)(1:358)|820|359|360|794|(4:362|363|(1:365)|366)(12:(2:370|(2:372|(2:374|(2:376|380)(1:377))(2:378|379))(1:380))(1:382)|(20:384|806|385|(2:867|387)|391|392|795|393|(2:816|395)|399|400|401|(1:403)|404|405|406|(1:408)|409|(1:411)|412)(1:459)|464|465|858|466|469|470|(1:472)|473|474|475)|413|(4:416|(2:418|907)(11:419|(3:421|(3:424|425|422)|908)|426|883|427|(1:429)|430|431|869|432|906)|433|414)|905)(10:349|(0)(0)|820|359|360|794|(0)(0)|413|(1:414)|905)|476|(1:478)|479|(3:481|(1:483)|484)(14:485|486|(1:488)|489|490|(1:492)|493|873|494|495|(1:497)|498|(1:500)|501)|502|(1:504)(9:505|(3:507|(2:510|508)|919)|511|512|(1:514)|515|(1:517)|518|519)|520|(1:522)|523|(1:525)|526|(3:528|(1:530)|531)(16:533|534|(1:536)|537|(1:539)|540|541|(1:543)|544|836|545|546|(1:548)|549|(1:551)|552)|532|553|(28:555|839|556|(2:851|558)|562|(1:564)|565|566|838|(4:568|569|(1:571)|572)(18:573|(2:575|(1:581)(1:580))|(19:583|584|832|585|(2:830|587)|591|592|826|593|(2:855|595)|599|600|601|(2:603|604)|605|(1:607)|608|(1:610)|611)|658|673|(1:675)|676|(3:678|(1:680)|681)(13:683|790|684|685|(1:687)|688|843|689|690|(1:692)|693|(1:695)|696)|682|697|(6:700|701|(1:703)|704|705|706)|707|(1:709)|710|(3:712|(1:714)|715)(14:717|718|(1:720)|721|722|(1:724)|725|822|726|727|(1:729)|730|(1:732)|733)|716|734|(1:920)(7:737|738|(1:740)|741|742|743|744))|612|(4:615|(2:617|911)(11:618|(3:620|(3:623|624|621)|912)|625|818|626|(1:628)|629|630|812|631|910)|632|613)|909|658|673|(0)|676|(0)(0)|682|697|(0)|707|(0)|710|(0)(0)|716|734|(0)(0))(10:754|(3:756|(4:759|(3:915|761|918)(3:914|762|917)|916|757)|913)|763|764|(1:766)|767|(1:769)|770|771|772))|229|799|230|(1:232)|233|(3:235|(1:237)|238)(15:239|240|786|241|(1:243)|244|245|246|(1:248)|249|(1:251)|252|(1:254)|255|256)|257|(9:260|871|261|(1:263)|264|265|266|863|267)|268|(3:829|299|(1:305)(1:304))(1:309)|310|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x10ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x10ac, code lost:
    
        r5 = new java.lang.Object[1];
        c(new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{149, 11, 0, 2}, true, r5);
        r2 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x10c8, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x10df, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x10e3, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
        r13 = -1;
        r4 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r1 = ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32))) | r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x1113, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x1117, code lost:
    
        if (r5 == null) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x1119, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.getTrimmedLength("") + 42, (char) (android.view.ViewConfiguration.getScrollBarSize() >> 8), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x1146, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x114e, code lost:
    
        r7 = new java.lang.Object[]{967645907, java.lang.Long.valueOf(r1), r3, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6562, 56 - android.view.View.MeasureSpec.getMode(0), (char) android.text.TextUtils.indexOf("", "", 0));
        r3 = (byte) 0;
        r4 = r3;
        r11 = new java.lang.Object[1];
        f(r3, r4, (byte) (r4 + 1), r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x07af A[Catch: all -> 0x02fc, TryCatch #39 {all -> 0x02fc, blocks: (B:667:0x2a4e, B:669:0x2a54, B:670:0x2a80, B:701:0x2dd3, B:703:0x2dd9, B:704:0x2e04, B:738:0x30e5, B:740:0x30eb, B:741:0x3114, B:718:0x2f43, B:720:0x2f66, B:721:0x2fb0, B:764:0x31f8, B:766:0x31fe, B:767:0x3221, B:769:0x325b, B:770:0x329d, B:534:0x2215, B:536:0x222a, B:537:0x2259, B:539:0x228d, B:540:0x230c, B:512:0x1e73, B:514:0x1e79, B:515:0x1ea6, B:517:0x1ee0, B:518:0x1f29, B:486:0x1b9e, B:488:0x1bb3, B:489:0x1be7, B:470:0x19b5, B:472:0x19bb, B:473:0x19e4, B:336:0x1327, B:338:0x132d, B:339:0x135e, B:291:0x1113, B:293:0x1119, B:294:0x1146, B:223:0x0cab, B:225:0x0cb1, B:226:0x0cda, B:135:0x07a9, B:137:0x07af, B:138:0x07da, B:18:0x0190, B:20:0x0196, B:21:0x01ba, B:23:0x026c, B:25:0x029d, B:26:0x02f6), top: B:857:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0854 A[Catch: all -> 0x0c44, TryCatch #16 {all -> 0x0c44, blocks: (B:142:0x084e, B:144:0x0854, B:145:0x0893, B:149:0x08ad, B:151:0x08b3, B:152:0x08f9, B:175:0x0b10, B:176:0x0b14, B:178:0x0b1a, B:181:0x0b32, B:184:0x0b3f, B:186:0x0b42, B:198:0x0c1e, B:200:0x0c24, B:201:0x0c25, B:203:0x0c27, B:205:0x0c2e, B:206:0x0c2f, B:153:0x0904, B:165:0x09f8, B:167:0x09fe, B:168:0x0a48, B:170:0x0a72, B:171:0x0ab3, B:173:0x0ac9, B:174:0x0b0a, B:208:0x0c31, B:210:0x0c38, B:211:0x0c39, B:213:0x0c3b, B:215:0x0c42, B:216:0x0c43, B:189:0x0b6e, B:191:0x0b74, B:192:0x0ba2, B:160:0x096d, B:162:0x0982, B:163:0x09ec, B:155:0x0924, B:157:0x0939, B:158:0x0966, B:194:0x0baa), top: B:815:0x084e, outer: #15, inners: #3, #10, #13, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0904 A[Catch: all -> 0x0c44, TRY_LEAVE, TryCatch #16 {all -> 0x0c44, blocks: (B:142:0x084e, B:144:0x0854, B:145:0x0893, B:149:0x08ad, B:151:0x08b3, B:152:0x08f9, B:175:0x0b10, B:176:0x0b14, B:178:0x0b1a, B:181:0x0b32, B:184:0x0b3f, B:186:0x0b42, B:198:0x0c1e, B:200:0x0c24, B:201:0x0c25, B:203:0x0c27, B:205:0x0c2e, B:206:0x0c2f, B:153:0x0904, B:165:0x09f8, B:167:0x09fe, B:168:0x0a48, B:170:0x0a72, B:171:0x0ab3, B:173:0x0ac9, B:174:0x0b0a, B:208:0x0c31, B:210:0x0c38, B:211:0x0c39, B:213:0x0c3b, B:215:0x0c42, B:216:0x0c43, B:189:0x0b6e, B:191:0x0b74, B:192:0x0ba2, B:160:0x096d, B:162:0x0982, B:163:0x09ec, B:155:0x0924, B:157:0x0939, B:158:0x0966, B:194:0x0baa), top: B:815:0x084e, outer: #15, inners: #3, #10, #13, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0b1a A[Catch: all -> 0x0c44, TryCatch #16 {all -> 0x0c44, blocks: (B:142:0x084e, B:144:0x0854, B:145:0x0893, B:149:0x08ad, B:151:0x08b3, B:152:0x08f9, B:175:0x0b10, B:176:0x0b14, B:178:0x0b1a, B:181:0x0b32, B:184:0x0b3f, B:186:0x0b42, B:198:0x0c1e, B:200:0x0c24, B:201:0x0c25, B:203:0x0c27, B:205:0x0c2e, B:206:0x0c2f, B:153:0x0904, B:165:0x09f8, B:167:0x09fe, B:168:0x0a48, B:170:0x0a72, B:171:0x0ab3, B:173:0x0ac9, B:174:0x0b0a, B:208:0x0c31, B:210:0x0c38, B:211:0x0c39, B:213:0x0c3b, B:215:0x0c42, B:216:0x0c43, B:189:0x0b6e, B:191:0x0b74, B:192:0x0ba2, B:160:0x096d, B:162:0x0982, B:163:0x09ec, B:155:0x0924, B:157:0x0939, B:158:0x0966, B:194:0x0baa), top: B:815:0x084e, outer: #15, inners: #3, #10, #13, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0d5a A[Catch: all -> 0x10ab, TryCatch #7 {all -> 0x10ab, blocks: (B:230:0x0d54, B:232:0x0d5a, B:233:0x0d9e, B:235:0x0dab, B:237:0x0db4, B:238:0x0df3, B:257:0x0fa3, B:265:0x1012, B:271:0x108f, B:273:0x1095, B:274:0x1096, B:276:0x1098, B:278:0x109f, B:279:0x10a0, B:239:0x0dff, B:246:0x0e84, B:248:0x0e8a, B:249:0x0eca, B:251:0x0ef4, B:252:0x0f3b, B:254:0x0f51, B:255:0x0f93, B:281:0x10a2, B:283:0x10a9, B:284:0x10aa, B:241:0x0e1f, B:243:0x0e31, B:244:0x0e78, B:267:0x1018, B:261:0x0fd6, B:263:0x0fdc, B:264:0x100b), top: B:799:0x0d54, outer: #15, inners: #0, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0dab A[Catch: all -> 0x10ab, TryCatch #7 {all -> 0x10ab, blocks: (B:230:0x0d54, B:232:0x0d5a, B:233:0x0d9e, B:235:0x0dab, B:237:0x0db4, B:238:0x0df3, B:257:0x0fa3, B:265:0x1012, B:271:0x108f, B:273:0x1095, B:274:0x1096, B:276:0x1098, B:278:0x109f, B:279:0x10a0, B:239:0x0dff, B:246:0x0e84, B:248:0x0e8a, B:249:0x0eca, B:251:0x0ef4, B:252:0x0f3b, B:254:0x0f51, B:255:0x0f93, B:281:0x10a2, B:283:0x10a9, B:284:0x10aa, B:241:0x0e1f, B:243:0x0e31, B:244:0x0e78, B:267:0x1018, B:261:0x0fd6, B:263:0x0fdc, B:264:0x100b), top: B:799:0x0d54, outer: #15, inners: #0, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0dff A[Catch: all -> 0x10ab, TRY_LEAVE, TryCatch #7 {all -> 0x10ab, blocks: (B:230:0x0d54, B:232:0x0d5a, B:233:0x0d9e, B:235:0x0dab, B:237:0x0db4, B:238:0x0df3, B:257:0x0fa3, B:265:0x1012, B:271:0x108f, B:273:0x1095, B:274:0x1096, B:276:0x1098, B:278:0x109f, B:279:0x10a0, B:239:0x0dff, B:246:0x0e84, B:248:0x0e8a, B:249:0x0eca, B:251:0x0ef4, B:252:0x0f3b, B:254:0x0f51, B:255:0x0f93, B:281:0x10a2, B:283:0x10a9, B:284:0x10aa, B:241:0x0e1f, B:243:0x0e31, B:244:0x0e78, B:267:0x1018, B:261:0x0fd6, B:263:0x0fdc, B:264:0x100b), top: B:799:0x0d54, outer: #15, inners: #0, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x11d8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x11ef A[Catch: all -> 0x12b6, TryCatch #12 {all -> 0x12b6, blocks: (B:311:0x11da, B:313:0x11ef, B:314:0x1220), top: B:808:0x11da, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1233 A[Catch: all -> 0x12ac, TryCatch #8 {all -> 0x12ac, blocks: (B:315:0x1226, B:317:0x1233, B:318:0x12a4), top: B:800:0x1226, outer: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x142f A[Catch: all -> 0x194a, PHI: r2
  0x142f: PHI (r2v496 java.lang.Object) = (r2v491 java.lang.Object), (r2v495 java.lang.Object) binds: [B:344:0x13e2, B:345:0x13e4] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #21 {all -> 0x194a, blocks: (B:343:0x13de, B:349:0x142f), top: B:824:0x13de }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x14a9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x14c1  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x1520  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x1809 A[Catch: all -> 0x1928, TryCatch #4 {all -> 0x1928, blocks: (B:413:0x17ff, B:414:0x1803, B:416:0x1809, B:419:0x1823, B:422:0x1839, B:424:0x183c, B:436:0x1916, B:438:0x191c, B:439:0x191d, B:441:0x191f, B:443:0x1926, B:444:0x1927, B:406:0x1737, B:408:0x1754, B:409:0x179c, B:411:0x17b2, B:412:0x17f9, B:449:0x192e, B:451:0x1934, B:452:0x1935, B:455:0x193a, B:457:0x1940, B:458:0x1941, B:432:0x18a3, B:427:0x186a, B:429:0x1870, B:430:0x189b), top: B:794:0x14bf, inners: #46, #53 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x19bb A[Catch: all -> 0x02fc, TryCatch #39 {all -> 0x02fc, blocks: (B:667:0x2a4e, B:669:0x2a54, B:670:0x2a80, B:701:0x2dd3, B:703:0x2dd9, B:704:0x2e04, B:738:0x30e5, B:740:0x30eb, B:741:0x3114, B:718:0x2f43, B:720:0x2f66, B:721:0x2fb0, B:764:0x31f8, B:766:0x31fe, B:767:0x3221, B:769:0x325b, B:770:0x329d, B:534:0x2215, B:536:0x222a, B:537:0x2259, B:539:0x228d, B:540:0x230c, B:512:0x1e73, B:514:0x1e79, B:515:0x1ea6, B:517:0x1ee0, B:518:0x1f29, B:486:0x1b9e, B:488:0x1bb3, B:489:0x1be7, B:470:0x19b5, B:472:0x19bb, B:473:0x19e4, B:336:0x1327, B:338:0x132d, B:339:0x135e, B:291:0x1113, B:293:0x1119, B:294:0x1146, B:223:0x0cab, B:225:0x0cb1, B:226:0x0cda, B:135:0x07a9, B:137:0x07af, B:138:0x07da, B:18:0x0190, B:20:0x0196, B:21:0x01ba, B:23:0x026c, B:25:0x029d, B:26:0x02f6), top: B:857:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x1a63  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1ab1  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x1b7e  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1d20  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x1e33  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x2079  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x20e2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x2136  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x21f7  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x243b  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x2a54 A[Catch: all -> 0x02fc, TryCatch #39 {all -> 0x02fc, blocks: (B:667:0x2a4e, B:669:0x2a54, B:670:0x2a80, B:701:0x2dd3, B:703:0x2dd9, B:704:0x2e04, B:738:0x30e5, B:740:0x30eb, B:741:0x3114, B:718:0x2f43, B:720:0x2f66, B:721:0x2fb0, B:764:0x31f8, B:766:0x31fe, B:767:0x3221, B:769:0x325b, B:770:0x329d, B:534:0x2215, B:536:0x222a, B:537:0x2259, B:539:0x228d, B:540:0x230c, B:512:0x1e73, B:514:0x1e79, B:515:0x1ea6, B:517:0x1ee0, B:518:0x1f29, B:486:0x1b9e, B:488:0x1bb3, B:489:0x1be7, B:470:0x19b5, B:472:0x19bb, B:473:0x19e4, B:336:0x1327, B:338:0x132d, B:339:0x135e, B:291:0x1113, B:293:0x1119, B:294:0x1146, B:223:0x0cab, B:225:0x0cb1, B:226:0x0cda, B:135:0x07a9, B:137:0x07af, B:138:0x07da, B:18:0x0190, B:20:0x0196, B:21:0x01ba, B:23:0x026c, B:25:0x029d, B:26:0x02f6), top: B:857:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:675:0x2b02  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x2b51  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2bac  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x2db5  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x2e85  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x2ed4  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x2f25  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x30c7  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x31ad  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x1456 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:797:0x13e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x11bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:920:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x064e A[Catch: all -> 0x06f8, TryCatch #37 {all -> 0x06f8, blocks: (B:95:0x0648, B:97:0x064e, B:98:0x0678), top: B:853:0x0648, outer: #41 }] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v105 */
    /* JADX WARN: Type inference failed for: r7v106 */
    /* JADX WARN: Type inference failed for: r7v107 */
    /* JADX WARN: Type inference failed for: r7v108 */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v119 */
    /* JADX WARN: Type inference failed for: r7v121 */
    /* JADX WARN: Type inference failed for: r7v122, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v128 */
    /* JADX WARN: Type inference failed for: r7v210 */
    /* JADX WARN: Type inference failed for: r7v211 */
    /* JADX WARN: Type inference failed for: r7v212 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v96 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v115 */
    /* JADX WARN: Type inference failed for: r9v116 */
    /* JADX WARN: Type inference failed for: r9v117 */
    /* JADX WARN: Type inference failed for: r9v118 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v171 */
    /* JADX WARN: Type inference failed for: r9v176 */
    /* JADX WARN: Type inference failed for: r9v177 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v192 */
    /* JADX WARN: Type inference failed for: r9v193 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v200 */
    /* JADX WARN: Type inference failed for: r9v201 */
    /* JADX WARN: Type inference failed for: r9v202 */
    /* JADX WARN: Type inference failed for: r9v203 */
    /* JADX WARN: Type inference failed for: r9v204 */
    /* JADX WARN: Type inference failed for: r9v205 */
    /* JADX WARN: Type inference failed for: r9v206 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    /* JADX WARN: Type inference failed for: r9v85, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataEntryPointActivity.attachBaseContext(android.content.Context):void");
    }

    public static boolean $r8$lambda$9VymLyxWX5D5fU6cYyFj4IyZ_7c(FixedDataUiState fixedDataUiState) {
        int i = 2 % 2;
        int i2 = copydefault + 39;
        component2 = i2 % 128;
        int i3 = i2 % 2;
        boolean zObserveState$lambda$0 = observeState$lambda$0(fixedDataUiState);
        if (i3 != 0) {
            int i4 = 53 / 0;
        }
        return zObserveState$lambda$0;
    }

    static {
        equals = 0;
        component1();
        component3();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getAsAtTimestamp + 61;
        equals = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = component2 + 47;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copydefault + 125;
        component2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = copydefault;
        int i3 = i2 + 95;
        component2 = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = new int[]{1717886902, 1250086227, 1453828361, -943493362, -817505081, 75890268, 1020740306, 659356085, 1840096381, -566301510, 2066707287, -1633386323, 1370178831, 1068727872, -857886241, 475001998, 1065555489, 2054323744};
        int i5 = i2 + 117;
        component2 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component3 = new int[]{205054327, 1176496045, -721021059, 106554642, 1682796289, 56514307, -63197543, -64571760, 359061823, -682110833, -1756061418, -710502785, -150550207, -1419839184, -16582058, 351444722, -310598328, 2045675321};
        component1 = new char[]{33511, 33455, 33424, 33512, 33421, 33460, 33457, 33456, 33456, 33457, 33449, 33465, 33409, 33458, 33460, 33468, 33469, 33469, 33464, 33462, 33460, 33455, 33459, 33465, 33430, 33432, 33505, 33443, 33445, 33443, 33447, 33455, 33451, 33447, 33443, 33441, 33465, 33463, 33440, 33448, 33446, 33375, 33374, 33445, 33515, 33457, 33451, 33453, 33454, 33417, 33515, 33520, 33517, 33514, 33513, 33512, 33514, 33427, 33426, 33515, 33516, 33516, 33515, 33517, 33516, 33514, 33426, 33469, 33431, 33422, 33457, 33458, 33460, 33468, 33461, 33460, 33469, 33461, 33452, 33422, 33429, 33457, 33460, 33462, 33460, 33460, 33453, 33452, 33460, 33462, 33460, 33430, 33431, 33462, 33457, 33425, 33431, 33463, 33459, 33427, 33427, 33460, 33461, 33465, 33459, 33452, 33422, 33421, 33419, 33519, 33429, 33458, 33458, 33462, 33454, 33452, 33475, 33516, 33520, 33517, 33518, 33519, 33368, 33747, 33749, 33744, 33736, 33739, 33739, 33731, 33753, 33317, 33743, 33740, 33316, 33312, 33744, 33749, 33476, 33513, 33512, 33513, 33513, 33514, 33516, 33517, 33516, 33512, 33514, 33476, 33515, 33517, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33425, 33347, 33350, 33351, 33348, 33350, 33351, 33351, 33352, 33351, 33349, 33534, 33437, 33437, 33436, 33433, 33432, 33435, 33435, 33435, 33436, 33433};
    }
}
