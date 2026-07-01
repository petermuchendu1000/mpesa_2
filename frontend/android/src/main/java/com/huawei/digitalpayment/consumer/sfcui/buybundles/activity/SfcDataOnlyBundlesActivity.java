package com.huawei.digitalpayment.consumer.sfcui.buybundles.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivityKt;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.viewmodel.BuyBundleViewModel;
import com.huawei.digitalpayment.consumer.sfcui.constants.Keys;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.mpesa.lifestyle.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Random;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelNotification;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.notify;
import kotlin.onLaunch;
import kotlin.onLaunchlambda0;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.i18n.LocalizedMessage;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012²\u0006\u0018\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/activity/SfcDataOnlyBundlesActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "getViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/viewmodel/BuyBundleViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "onBundleSelected", "bundle", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/WithExpiryResp;", "ConsumerSfcUI_release", "otherBundlesResource", "Lcom/huawei/payment/mvvm/Resource;", "", "Lcom/huawei/digitalpayment/consumer/sfcui/buybundles/resp/Plans;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcDataOnlyBundlesActivity extends Hilt_SfcDataOnlyBundlesActivity {
    public static final int $stable = 8;
    private static char[] ShareDataUIState;
    private static boolean component1;
    private static long component2;
    private static int component3;
    private static boolean copydefault;
    private static int getAsAtTimestamp;
    private static int getRequestBeneficiariesState;

    private final Lazy viewModel;
    private static final byte[] $$l = {8, -40, 43, -43};
    private static final int $$m = 170;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {1, -53, Ascii.US, 101, Ascii.DC2, 4, -57, SignedBytes.MAX_POWER_OF_TWO, 19, -14, Ascii.FS, -12, 10, -53, 60, Ascii.VT, 4, 8, 17, -13, 17, 10, -9, Ascii.RS, -6, -2, Ascii.SI, Ascii.FF, -64, 59, Ascii.DC2, 5, Ascii.VT, 8, -2, -2, 19, -62, 79, -12, 3, Ascii.SUB, -7, 2, Ascii.CAN, -67, 65, Ascii.VT, Ascii.FF, -9, 19, -11, 8, Ascii.ETB, -5, Ascii.FF, 5, -58, 62, Ascii.NAK, -1, -5, Ascii.ETB, -5, Ascii.FF, 5, -58, 43, 39, -13, Ascii.ETB, 8, -30, Ascii.ETB, Ascii.RS, -79, Ascii.ETB, Ascii.DC2, 7, Ascii.SI, -15, 7, 7, 1, Ascii.SUB, -3, Ascii.SO, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, -57, 57, 17, 3, -1, 5, 7, 5, -45, 63, 17, -3, 19, -11, 19, -62, 58, 5, Ascii.CAN, -8, -49, 77, -6, -53, 79, -8, 1, 9, 4, Ascii.NAK, -64, Ascii.US, TarHeader.LF_LINK, -3, 19, -11, 19, -41, 43, 3, 4, Ascii.SO, -35, TarHeader.LF_CHR, Ascii.SI, Ascii.FF, -59, 74, -7, 2, 8, Ascii.ETB, -5, 19, -11, Ascii.EM, PSSSigner.TRAILER_IMPLICIT, 65, Ascii.VT, Ascii.FF, -9, 19, 2, -7, 17, -56, 71, 7, -5, 19, -11, Ascii.EM, 1, 9, 7, -63, 71, -7, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -49, 39, Ascii.EM, Ascii.ETB, -8, 19, 10, -15, 7, Ascii.DLE, -1, -8, Ascii.CAN, Ascii.VT, -4, 17, Ascii.SO, -47, TarHeader.LF_CHR, Ascii.FF, -1, -4, 3, Ascii.ETB, 13, -79, 69, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -59, Ascii.DC2, 4, 9, 5, 5, -3, Ascii.SI, Ascii.FF, -60};
    private static final int $$k = 160;
    private static final byte[] $$d = {86, 117, -27, 75, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 171;
    private static int component4 = 1;
    private static int copy = 0;
    private static int equals = 1;

    private static String $$n(int i, byte b2, int i2) {
        int i3 = i2 + 65;
        int i4 = b2 * 3;
        byte[] bArr = $$l;
        int i5 = 4 - (i * 4);
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5++;
            i3 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            byte b3 = bArr[i5];
            i5++;
            i3 += b3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 100 - r5
            int r7 = r7 * 2
            int r7 = r7 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.$$d
            int r1 = 28 - r6
            byte[] r1 = new byte[r1]
            int r6 = 27 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            int r5 = r5 + 1
            int r7 = r7 + (-8)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.g(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.$$j
            int r1 = r8 + 10
            int r7 = r7 * 6
            int r7 = r7 + 99
            int r6 = 220 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-6)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.h(int, short, byte, java.lang.Object[]):void");
    }

    public static final BuyBundleViewModel access$getViewModel(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
        int i = 2 % 2;
        int i2 = copy + 69;
        equals = i2 % 128;
        if (i2 % 2 != 0) {
            return sfcDataOnlyBundlesActivity.getViewModel();
        }
        sfcDataOnlyBundlesActivity.getViewModel();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$onBundleSelected(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity, WithExpiryResp withExpiryResp) {
        int i = 2 % 2;
        int i2 = copy + 75;
        equals = i2 % 128;
        int i3 = i2 % 2;
        sfcDataOnlyBundlesActivity.onBundleSelected(withExpiryResp);
        int i4 = equals + 107;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public SfcDataOnlyBundlesActivity() {
        final SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BuyBundleViewModel.class), new Function0<ViewModelStore>() {
            private static char[] ShareDataUIState;
            private static long component3;
            private static final byte[] $$c = {87, -2, Ascii.VT, -41};
            private static final int $$d = 110;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {119, -27, 13, -93, 6, -5, 3};
            private static final int $$b = 8;
            private static int copydefault = 0;
            private static int component1 = 1;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String $$e(short r6, int r7, byte r8) {
                /*
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$special$$inlined$viewModels$default$2.$$c
                    int r7 = r7 * 4
                    int r7 = 4 - r7
                    int r8 = r8 * 2
                    int r1 = 1 - r8
                    int r6 = 122 - r6
                    byte[] r1 = new byte[r1]
                    r2 = 0
                    int r8 = 0 - r8
                    r3 = -1
                    if (r0 != 0) goto L17
                    r6 = r7
                    r4 = r8
                    goto L29
                L17:
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1a:
                    int r3 = r3 + 1
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    return r6
                L27:
                    r4 = r0[r6]
                L29:
                    int r4 = -r4
                    int r7 = r7 + r4
                    int r6 = r6 + 1
                    goto L1a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$special$$inlined$viewModels$default$2.$$e(short, int, byte):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static void b(short r7, int r8, int r9, java.lang.Object[] r10) {
                /*
                    int r7 = 100 - r7
                    int r9 = r9 * 3
                    int r9 = 4 - r9
                    byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$special$$inlined$viewModels$default$2.$$a
                    int r8 = r8 * 3
                    int r8 = 3 - r8
                    byte[] r1 = new byte[r9]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r8
                    r4 = r2
                    goto L2b
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r9) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L24:
                    int r8 = r8 + 1
                    r3 = r0[r8]
                    r6 = r3
                    r3 = r8
                    r8 = r6
                L2b:
                    int r7 = r7 + r8
                    int r7 = r7 + 6
                    r8 = r3
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$special$$inlined$viewModels$default$2.b(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 117;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = sfcDataOnlyBundlesActivity.getViewModelStore();
                int i4 = component1 + 83;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 55;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            private static void a(int i, int i2, char c2, Object[] objArr) throws Throwable {
                int i3 = 2 % 2;
                cancelNotification cancelnotification = new cancelNotification();
                long[] jArr = new long[i];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i) {
                    int i4 = cancelnotification.copydefault;
                    try {
                        Object[] objArr2 = {Integer.valueOf(ShareDataUIState[i2 + i4])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 1759, 34 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1159210934, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component3), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                        if (objCopydefault2 == null) {
                            byte b4 = (byte) 5;
                            byte b5 = (byte) (b4 - 5);
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 3608, (ViewConfiguration.getTapTimeout() >> 16) + 29, (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 7171), 1951385784, false, $$e(b4, b5, b5), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {cancelnotification, cancelnotification};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 24, (char) (27761 - TextUtils.indexOf("", "")), -1529629956, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                char[] cArr = new char[i];
                cancelnotification.copydefault = 0;
                while (cancelnotification.copydefault < i) {
                    int i5 = $10 + 59;
                    $11 = i5 % 128;
                    int i6 = i5 % 2;
                    cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                    Object[] objArr5 = {cancelnotification, cancelnotification};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) 0;
                        byte b9 = b8;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4012, 24 - ((Process.getThreadPriority(0) + 20) >> 6), (char) (27761 - (KeyEvent.getMaxKeyCode() >> 16)), -1529629956, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                    int i7 = $10 + 49;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                }
                String str = new String(cArr);
                int i9 = $11 + 17;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                objArr[0] = str;
            }

            {
                super(0);
            }

            /* JADX WARN: Code restructure failed: missing block: B:399:0x37c4, code lost:
            
                r4 = r1 ^ r2;
                r6 = -r4;
                r4 = ((r4 & r6) | (r4 ^ r6)) >> 31;
                r2 = (r2 & r4) | (r3 & (~r4));
             */
            /* JADX WARN: Code restructure failed: missing block: B:400:0x37d2, code lost:
            
                r4 = -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1));
                r3 = -android.text.TextUtils.getOffsetBefore(r7, 0);
                r9 = new java.lang.Object[1];
                a((r4 & 12) + (r4 | 12), (r3 & 2088) + (r3 | 2088), (char) (20391 - android.widget.ExpandableListView.getPackedPositionType(0)), r9);
                r4 = (java.lang.String) r9[0];
                r3 = (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1));
                r6 = ((r3 | 8) << 1) - (r3 ^ 8);
                r3 = 2149 - android.text.AndroidCharacter.getMirror('0');
                r8 = -(-android.view.View.combineMeasuredStates(0, 0));
                r9 = new java.lang.Object[1];
                a(r6, r3, (char) ((r8 ^ 4643) + ((r8 & 4643) << 1)), r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:401:0x382e, code lost:
            
                r4 = new java.lang.Object[]{r4, (java.lang.String) r9[0]};
                r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-186658968);
             */
            /* JADX WARN: Code restructure failed: missing block: B:402:0x3839, code lost:
            
                if (r6 != null) goto L404;
             */
            /* JADX WARN: Code restructure failed: missing block: B:403:0x383b, code lost:
            
                r8 = android.text.TextUtils.indexOf(r7, r7, 0, 0) + 3999;
                r9 = 15 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1));
                r10 = (char) android.view.View.resolveSize(0, 0);
                r6 = (byte) 1;
                r13 = (byte) (r6 - 1);
                r15 = new java.lang.Object[1];
                b(r6, r13, r13, r15);
                r6 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(r8, r9, r10, 830869517, false, (java.lang.String) r15[0], new java.lang.Class[]{java.lang.String.class, java.lang.String.class});
             */
            /* JADX WARN: Code restructure failed: missing block: B:404:0x3875, code lost:
            
                r3 = ((java.lang.Long) ((java.lang.reflect.Method) r6).invoke(null, r4)).longValue();
             */
            /* JADX WARN: Code restructure failed: missing block: B:405:0x3882, code lost:
            
                r8 = -703442559;
                r10 = (((long) 465) * r8) + (((long) (-463)) * r3);
                r12 = 464;
                r3 = r3 ^ r45;
                r19 = (r3 | r8) ^ r45;
                r10 = (((r10 + (((((r3 | r37) ^ r45) | r19) | ((r37 | r8) ^ r45)) * r12)) + (((long) (-464)) * ((r43 | (r8 ^ r45)) | r3))) + (r12 * (r19 | ((r8 | r43) ^ r45)))) + ((long) 1106778191);
                r3 = (int) (r10 >> 32);
             */
            /* JADX WARN: Code restructure failed: missing block: B:406:0x38c1, code lost:
            
                r4 = new java.util.Random().nextInt();
                r6 = ~r4;
                r3 = r3 & ((((-1453938172) + (((~(2127467687 | r6)) | (-730273198)) * 519)) + (((~(r6 | (-16843017))) | (~((-713430182) | r4))) * (-519))) + (((~(r4 | (-730273198))) | (-2127467688)) * 519));
                r4 = ((int) r10) & ((((-930845177) + (((~((-807840359) | r1)) | (~(2049900527 | r5))) * (-318))) + (((~(975616999 | r1)) | 1074283528) * (-318))) + (((~((-975617000) | r1)) | (-1882123887)) * androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.TYPE_PIVOT_TARGET));
             */
            /* JADX WARN: Code restructure failed: missing block: B:407:0x3923, code lost:
            
                if (((r3 & r4) | (r3 ^ r4)) == 0) goto L409;
             */
            /* JADX WARN: Code restructure failed: missing block: B:408:0x3925, code lost:
            
                r3 = r1 ^ 150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:409:0x3928, code lost:
            
                r3 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:410:0x392a, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:411:0x392b, code lost:
            
                r4 = r0.getCause();
             */
            /* JADX WARN: Code restructure failed: missing block: B:412:0x3930, code lost:
            
                if (r4 != null) goto L413;
             */
            /* JADX WARN: Code restructure failed: missing block: B:413:0x3932, code lost:
            
                throw r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:414:0x3933, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:415:0x3934, code lost:
            
                r3 = (r1 & (-152)) | (r5 & 151);
             */
            /* JADX WARN: Removed duplicated region for block: B:108:0x0e5c A[Catch: all -> 0x02ee, TryCatch #10 {all -> 0x02ee, blocks: (B:8:0x0175, B:10:0x0182, B:11:0x01be, B:14:0x01cc, B:16:0x01d9, B:17:0x0218, B:29:0x03ca, B:31:0x03d7, B:32:0x0417, B:39:0x053f, B:41:0x054c, B:42:0x0593, B:71:0x086c, B:73:0x0872, B:74:0x08ab, B:76:0x09f7, B:78:0x0a04, B:79:0x0a48, B:84:0x0bcd, B:86:0x0bda, B:88:0x0c20, B:95:0x0d64, B:97:0x0d71, B:98:0x0daf, B:106:0x0e4f, B:108:0x0e5c, B:109:0x0e9e, B:115:0x0f8c, B:117:0x0f99, B:119:0x0fe8, B:132:0x11e9, B:134:0x11f6, B:136:0x123e, B:145:0x12cf, B:147:0x12dc, B:148:0x131f, B:183:0x15a9, B:185:0x15b6, B:187:0x15fe, B:218:0x183e, B:220:0x184b, B:222:0x1895, B:229:0x196f, B:231:0x1975, B:232:0x19a6, B:235:0x1a5a, B:237:0x1a6c, B:238:0x1aac, B:244:0x1b96, B:246:0x1ba3, B:248:0x1be7, B:250:0x1bf0, B:252:0x1c06, B:253:0x1c4b, B:300:0x2c66, B:302:0x2c73, B:303:0x2cb8, B:320:0x31c6, B:322:0x31d3, B:323:0x3213, B:330:0x32fd, B:332:0x330a, B:333:0x334c, B:417:0x3976, B:419:0x3983, B:420:0x39c0, B:306:0x2cc6, B:308:0x2cdc, B:309:0x2d1e, B:265:0x2a87, B:267:0x2a94, B:269:0x2ae9, B:190:0x1616, B:192:0x1623, B:193:0x1664, B:51:0x0745, B:53:0x0752, B:55:0x07a2, B:61:0x07e9, B:63:0x07f6, B:64:0x083b), top: B:453:0x01cc }] */
            /* JADX WARN: Removed duplicated region for block: B:112:0x0f4e  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x0f55  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0f99 A[Catch: all -> 0x02ee, TryCatch #10 {all -> 0x02ee, blocks: (B:8:0x0175, B:10:0x0182, B:11:0x01be, B:14:0x01cc, B:16:0x01d9, B:17:0x0218, B:29:0x03ca, B:31:0x03d7, B:32:0x0417, B:39:0x053f, B:41:0x054c, B:42:0x0593, B:71:0x086c, B:73:0x0872, B:74:0x08ab, B:76:0x09f7, B:78:0x0a04, B:79:0x0a48, B:84:0x0bcd, B:86:0x0bda, B:88:0x0c20, B:95:0x0d64, B:97:0x0d71, B:98:0x0daf, B:106:0x0e4f, B:108:0x0e5c, B:109:0x0e9e, B:115:0x0f8c, B:117:0x0f99, B:119:0x0fe8, B:132:0x11e9, B:134:0x11f6, B:136:0x123e, B:145:0x12cf, B:147:0x12dc, B:148:0x131f, B:183:0x15a9, B:185:0x15b6, B:187:0x15fe, B:218:0x183e, B:220:0x184b, B:222:0x1895, B:229:0x196f, B:231:0x1975, B:232:0x19a6, B:235:0x1a5a, B:237:0x1a6c, B:238:0x1aac, B:244:0x1b96, B:246:0x1ba3, B:248:0x1be7, B:250:0x1bf0, B:252:0x1c06, B:253:0x1c4b, B:300:0x2c66, B:302:0x2c73, B:303:0x2cb8, B:320:0x31c6, B:322:0x31d3, B:323:0x3213, B:330:0x32fd, B:332:0x330a, B:333:0x334c, B:417:0x3976, B:419:0x3983, B:420:0x39c0, B:306:0x2cc6, B:308:0x2cdc, B:309:0x2d1e, B:265:0x2a87, B:267:0x2a94, B:269:0x2ae9, B:190:0x1616, B:192:0x1623, B:193:0x1664, B:51:0x0745, B:53:0x0752, B:55:0x07a2, B:61:0x07e9, B:63:0x07f6, B:64:0x083b), top: B:453:0x01cc }] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x0fe6  */
            /* JADX WARN: Removed duplicated region for block: B:122:0x1029  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x102c  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x1049  */
            /* JADX WARN: Removed duplicated region for block: B:127:0x1078  */
            /* JADX WARN: Removed duplicated region for block: B:131:0x11e7  */
            /* JADX WARN: Removed duplicated region for block: B:147:0x12dc A[Catch: all -> 0x02ee, TryCatch #10 {all -> 0x02ee, blocks: (B:8:0x0175, B:10:0x0182, B:11:0x01be, B:14:0x01cc, B:16:0x01d9, B:17:0x0218, B:29:0x03ca, B:31:0x03d7, B:32:0x0417, B:39:0x053f, B:41:0x054c, B:42:0x0593, B:71:0x086c, B:73:0x0872, B:74:0x08ab, B:76:0x09f7, B:78:0x0a04, B:79:0x0a48, B:84:0x0bcd, B:86:0x0bda, B:88:0x0c20, B:95:0x0d64, B:97:0x0d71, B:98:0x0daf, B:106:0x0e4f, B:108:0x0e5c, B:109:0x0e9e, B:115:0x0f8c, B:117:0x0f99, B:119:0x0fe8, B:132:0x11e9, B:134:0x11f6, B:136:0x123e, B:145:0x12cf, B:147:0x12dc, B:148:0x131f, B:183:0x15a9, B:185:0x15b6, B:187:0x15fe, B:218:0x183e, B:220:0x184b, B:222:0x1895, B:229:0x196f, B:231:0x1975, B:232:0x19a6, B:235:0x1a5a, B:237:0x1a6c, B:238:0x1aac, B:244:0x1b96, B:246:0x1ba3, B:248:0x1be7, B:250:0x1bf0, B:252:0x1c06, B:253:0x1c4b, B:300:0x2c66, B:302:0x2c73, B:303:0x2cb8, B:320:0x31c6, B:322:0x31d3, B:323:0x3213, B:330:0x32fd, B:332:0x330a, B:333:0x334c, B:417:0x3976, B:419:0x3983, B:420:0x39c0, B:306:0x2cc6, B:308:0x2cdc, B:309:0x2d1e, B:265:0x2a87, B:267:0x2a94, B:269:0x2ae9, B:190:0x1616, B:192:0x1623, B:193:0x1664, B:51:0x0745, B:53:0x0752, B:55:0x07a2, B:61:0x07e9, B:63:0x07f6, B:64:0x083b), top: B:453:0x01cc }] */
            /* JADX WARN: Removed duplicated region for block: B:151:0x13bd  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x13df  */
            /* JADX WARN: Removed duplicated region for block: B:171:0x14c3  */
            /* JADX WARN: Removed duplicated region for block: B:174:0x14ca  */
            /* JADX WARN: Removed duplicated region for block: B:175:0x14cc  */
            /* JADX WARN: Removed duplicated region for block: B:178:0x14e6  */
            /* JADX WARN: Removed duplicated region for block: B:209:0x17b6  */
            /* JADX WARN: Removed duplicated region for block: B:212:0x17fa  */
            /* JADX WARN: Removed duplicated region for block: B:213:0x1808  */
            /* JADX WARN: Removed duplicated region for block: B:217:0x183c  */
            /* JADX WARN: Removed duplicated region for block: B:231:0x1975 A[Catch: all -> 0x02ee, TryCatch #10 {all -> 0x02ee, blocks: (B:8:0x0175, B:10:0x0182, B:11:0x01be, B:14:0x01cc, B:16:0x01d9, B:17:0x0218, B:29:0x03ca, B:31:0x03d7, B:32:0x0417, B:39:0x053f, B:41:0x054c, B:42:0x0593, B:71:0x086c, B:73:0x0872, B:74:0x08ab, B:76:0x09f7, B:78:0x0a04, B:79:0x0a48, B:84:0x0bcd, B:86:0x0bda, B:88:0x0c20, B:95:0x0d64, B:97:0x0d71, B:98:0x0daf, B:106:0x0e4f, B:108:0x0e5c, B:109:0x0e9e, B:115:0x0f8c, B:117:0x0f99, B:119:0x0fe8, B:132:0x11e9, B:134:0x11f6, B:136:0x123e, B:145:0x12cf, B:147:0x12dc, B:148:0x131f, B:183:0x15a9, B:185:0x15b6, B:187:0x15fe, B:218:0x183e, B:220:0x184b, B:222:0x1895, B:229:0x196f, B:231:0x1975, B:232:0x19a6, B:235:0x1a5a, B:237:0x1a6c, B:238:0x1aac, B:244:0x1b96, B:246:0x1ba3, B:248:0x1be7, B:250:0x1bf0, B:252:0x1c06, B:253:0x1c4b, B:300:0x2c66, B:302:0x2c73, B:303:0x2cb8, B:320:0x31c6, B:322:0x31d3, B:323:0x3213, B:330:0x32fd, B:332:0x330a, B:333:0x334c, B:417:0x3976, B:419:0x3983, B:420:0x39c0, B:306:0x2cc6, B:308:0x2cdc, B:309:0x2d1e, B:265:0x2a87, B:267:0x2a94, B:269:0x2ae9, B:190:0x1616, B:192:0x1623, B:193:0x1664, B:51:0x0745, B:53:0x0752, B:55:0x07a2, B:61:0x07e9, B:63:0x07f6, B:64:0x083b), top: B:453:0x01cc }] */
            /* JADX WARN: Removed duplicated region for block: B:235:0x1a5a A[Catch: all -> 0x02ee, TRY_ENTER, TryCatch #10 {all -> 0x02ee, blocks: (B:8:0x0175, B:10:0x0182, B:11:0x01be, B:14:0x01cc, B:16:0x01d9, B:17:0x0218, B:29:0x03ca, B:31:0x03d7, B:32:0x0417, B:39:0x053f, B:41:0x054c, B:42:0x0593, B:71:0x086c, B:73:0x0872, B:74:0x08ab, B:76:0x09f7, B:78:0x0a04, B:79:0x0a48, B:84:0x0bcd, B:86:0x0bda, B:88:0x0c20, B:95:0x0d64, B:97:0x0d71, B:98:0x0daf, B:106:0x0e4f, B:108:0x0e5c, B:109:0x0e9e, B:115:0x0f8c, B:117:0x0f99, B:119:0x0fe8, B:132:0x11e9, B:134:0x11f6, B:136:0x123e, B:145:0x12cf, B:147:0x12dc, B:148:0x131f, B:183:0x15a9, B:185:0x15b6, B:187:0x15fe, B:218:0x183e, B:220:0x184b, B:222:0x1895, B:229:0x196f, B:231:0x1975, B:232:0x19a6, B:235:0x1a5a, B:237:0x1a6c, B:238:0x1aac, B:244:0x1b96, B:246:0x1ba3, B:248:0x1be7, B:250:0x1bf0, B:252:0x1c06, B:253:0x1c4b, B:300:0x2c66, B:302:0x2c73, B:303:0x2cb8, B:320:0x31c6, B:322:0x31d3, B:323:0x3213, B:330:0x32fd, B:332:0x330a, B:333:0x334c, B:417:0x3976, B:419:0x3983, B:420:0x39c0, B:306:0x2cc6, B:308:0x2cdc, B:309:0x2d1e, B:265:0x2a87, B:267:0x2a94, B:269:0x2ae9, B:190:0x1616, B:192:0x1623, B:193:0x1664, B:51:0x0745, B:53:0x0752, B:55:0x07a2, B:61:0x07e9, B:63:0x07f6, B:64:0x083b), top: B:453:0x01cc }] */
            /* JADX WARN: Removed duplicated region for block: B:261:0x1d4d  */
            /* JADX WARN: Removed duplicated region for block: B:396:0x379d A[LOOP:8: B:345:0x3640->B:396:0x379d, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:422:0x3a63  */
            /* JADX WARN: Removed duplicated region for block: B:461:0x1267 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:468:0x195b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:474:0x3780 A[SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public static java.lang.Object[] component2(android.content.Context r73, int r74, int r75, int r76) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 15084
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$special$$inlined$viewModels$default$2.component2(android.content.Context, int, int, int):java.lang.Object[]");
            }

            static {
                char[] cArr = new char[2156];
                ByteBuffer.wrap("4\u0018\u0087ïS*/uúè¶ü\u00020Þ\u007f©³eÍ1\u0006\u008dPX\u008f\u0014äà\u001e¼W\u000f\u0093Û9\u0097jb°>ô\u008a\u0004Fl\u0011£íö¹\buJVìå\u001b1ÞM\u0081\u0098\u001cÔ\b`Ä¼\u008bËG\u00079Sòï¤:{v\u0010\u0082ûÞ®ms¹Úõ¤\u0000S\\\u0003èÝ$\u0088sS\u008f\u0007\fY¿®kk\u00174Â©\u008e½:qæ>\u0091ò]\u008c\tGµ\u0011`Î,¥ØM\u0084\u000b7Øãi·ò\u0004\u0012ÐÜ¬\u009ay\u00025\u001c\u0081Ú]\u009d*Hæ-²à\u000eæÛj\u0097>cù?½\u008c{XÈ\u0014\u0096áA½2\tÓÅ\u0094\u0092Mn\t:äö·Cpïã\\\u0015\u0088Àô\u009b!\u0013m\u0004ÙÃ\u0005Ær\\¾\"êûV¨3=\u0080ËT\u001e(EýÍ±Í\u0005\u0013Ù[®Übþ68\u008ai_²ð)CÉ\u0097\u001aëQ>\u0097rØÆ\n\u001a\rm´¡Üõ\u0013I}\u009c Ðï$\nxcË²\u001f\u001b\u0018t«\u0083\u007fB\u0003\u001bÖÊ\u009aØ.\u001dò\u001c\u0085ËI²\u001dj¡!tí8¸Å\u0089v(¢\u00adÞ\u00ad\u000bdG8óç/ñXi\u0094\u0002ÀÇ|\u009d©Då\u001e\u0011×M þU*âf·\u0093PÏ/{ù· à.\u008d\">\u0083ê\u0006\u0096\u0006CÏ\u000f\u0093»LgZ\u0010ÂÜ©\u0088l46áï\u00adµY|\u0005\u000b¶þbI.\u001cÛû\u0087\u00843Rÿ\u000b¨\u0086\fY¿¹kw\u00171Âò\u008e¿:sæ}\u0091ú]\u0083\tLµM`Ê,\u0093Ø\\\u0084\u001c7Ôã$¯=ZíKíøZ,\u0090PÕ\u0085\u0010É[O'üÇ(\tTO\u0081\u008cÍÁy\r¥\u0003Ò\u008a\u001eýJ>ö3#¶oá\u009b-Çyt\u009e 9ì\u001d\u0019\u0092EÝñ\t=UjÁ\u0096ËÂ;\u000e~»¨çê\u0013+_l¢\u0089\u0011iÅ§¹ál\" o\u0094£H\u00ad?$óS§\u0090\u001b\u009dÎ\u0018\u0082Ov\u0083*×\u00990M\u0097\u0001³ô\"¨d\u001c¥Ðþ\fY¿¹kw\u00171Âò\u008e¿:sæ}\u0091ú]\u0083\tLµM`Ê,\u0093Ø\\\u0084\u001c7Óãg¯;ZÔ\u0006\u008b²j~,)ýÕ¦\u0081\u0004M\u001døÍ\fY¿®kk\u00174Â©\u008e´:{æ?\u0091ã]\u008d\t[µ\u0007`Õ,\u008eãûPZ\u0084ßøß-\faLÕ\u008d\tÉ~G²}æ¾Zî\u008f-\f\u0018¿¯ko\u00171Âã\u008eô:pæ7\u0091â'c\u0094\u0080@F<\u0017éß¥Ï\u0011BÍ\u0001ºÀvµ\"g\u009e!Kï\u0007´óa¯%\u001cÿ\f\u0018¿¯kc\u00177Âõ\u008e¼®\u009c\u001d=É¸µª`l,-\u0098âD¿3mÿ\u0006«\u0098\u0017\u0097Â_\u008e\fzÓ&\u008c\u0095OAñ\r¢øo¤,\u0010çÜ´cØÐf\u0004©xò\f\u0006¿¯k|\u00171Âï\u008e©:jæ|\u0091å]\u0093\t]µL`Ä,\u009eØ\u0010\u0084\u00167Óãh¯;Zå\u0006è²}~.)çÕø\u0081LM\u000føÉ¤\u0083Pe\u001c\u0019ÏÂ{\u0083'\u0015Òü\u009e§Jhö>¡ûm \u0019sÅ\u0018\u0089Ã:jî¹\u0092ôG*\u000bl¿¯c¹\u0014 ØV\u008c\u00980\u0089å\u0001©[]Õ\u0001Ó²\u0016f\u00ad*þß \u0083-7¸ûë¬\"P=\u0004\u0089ÈÊ}\f!FÕ \u0099ÜJ\u0007þF¢ÐW=\u001bbÏ\u00adsû$4èe\f\u0006¿¯k|\u00171Âï\u008e©:jæ|\u0091å]\u0093\t]µL`Ä,\u009eØ\u0010\u0084\u00167Óãh¯;Zå\u0006è²h~1)¼Õµ\u0081[M\u0007\f\u0006¿¯k|\u00171Âï\u008e©:jæ|\u0091å]\u0093\t]µL`Ä,\u009eØ\u0010\u0084\u00167Óãh¯;Zå\u0006è²h~1)¼Õº\u0081KM\r\f\u0006¿¯k|\u00171Âï\u008e©:jæ|\u0091å]\u0093\t]µL`Ä,\u009eØ\u0010\u0084\u00167Óãh¯;Zå\u0006è²h~1)¼Õ»\u0081IM\r\f\u0006¿¯k|\u00171Âï\u008e©:jæ|\u0091å]\u0093\t]µL`Ä,\u009eØ\u0010\u0084\u00167Óãh¯;Zå\u0006è²h~1)¼Õ»\u0081DM\rÆ\u00adu\u0005¡ÌÝ\u0097\bXD\u0011\fY¿ºk|\u0017-Âå\u008eõ:sæ=\u0091ò]\u009f\tBµ\u0007`Õ\f\u0000¿¨ka\u0017:Âá\u008e¯:{æ!\u0091âV\u008bå*\fY¿¹kw\u00171Âò\u008e¿:sæ}\u0091ð]\u0098\tOµ\u000f`Ã,\u008dØQ\u0084\u00007Ýã%¯9Zë\u0006¨²~~1)åÕ¥\u0081\u0007M\u001døÛ¤\u0095PN\u001c\u001bÏß{©'9Òë\u009e°Jpö?¡ìmü\u0019|Å\u000bpÜ\fY¿¼kk\u0017,Ââ\u008eµ:læ}\u0091ú]\u0083\tLµT`\u0092,ÕØV\u0084\u00057\u0099ãk¯;Zæ\u0006¯²u~p)âÕ¤\u0081CM\u0003øÃ¤\u0094PC\u001cPÏÅ{\u009f'$Òê\u009e\u00adJqö)¡°m¡\u0019y\fY¿¼kk\u0017,Ââ\u008eµ:læ}\u0091ú]\u0083\tLµT`\u0092,ÕØV\u0084\u00057\u0099ãb¯9Zá\u0006©²w~.)ýÕ¥\u0081OM\u001cø\u008c¤\u0091PS\u001c\u0010ÏÖ{\u0099'=Òý\u009eìJuö5¼²\u000fRÛ\u009c§Úr\u0019>T\u008a\u0098V\u0096!\u0011íh¹§\u0005¿Ðy\u009c>h¶4õ\u00872S\u0094\u001fÁê6¶L\u0002\u0098ÎÑ\u0099\u0015eb1¨ýëH=\u0014hà£¬ó\u007f8Ë~\u0097ÄbH.Jú\u009dFÁ\u0011[ÝJ©\u0092\fY¿¯kz\u0017!Â©\u008e³:pæ;\u0091â]Å\tGµ\f`Ï,\u008eØ\u0010\u0084\u00117Úãe¯;Zæ\u0006µ²\u007f~,)äÕ¿\u0081IM\u000bø\u008c¤\u0094PYêçYy\u008d¶ñí$=hcÜ¼\u0000íw/»R\f\u0003¿¤ke\u0017,Âé\u008e\u00ad:p\f\u0015¿¢k|\u0017-Âë\u008e³:kæ?\f\u0004¿¥k \u00172Âô\u008eµ:zæ'\u0091õ]\u009e\t\u0000µ\u0006`Ã,\u008cØW\u0084\u00117Ó\f\u0000¿¨ka\u0017:Â¾\u008eì:nåêVT\u0082\u009bþÜ+\u000fgHÓ\u0086RoáÑ5\u001eIY\u009c\u008aÐÍd\u0003¸sÏ\u0090\u0003¬Wf\u0088B;üï3\u0093tF§\nà¾.b^\u0015½Ù\u0081\u008dK1näÃ¨\u009dq(Â\u0089\u0016\fj\u001e¿Øó\u0099GV\u009b\u000bìÙ ²t,È#\u001dåQ²¥wù2î\u0087],\u0089çä´W\u0000\u0083Üÿ\u0089*@f\tÒÖ\u000e\u0087\u0011Ã¢Nv\u008a\n\u0096ß \u0093['\u0084ûÒ\u008c\u000b@s\u0014¿¨¶}41aÅ¸\u0099¦*\u0001þ\u0096²ÈG\u0019\u001b_¯\u008bÜùoj»¤Çþ\u0012'^}ê´6¼A\u000b\u008d`Ù«e\u008c°\nüA\b\u0099TÐç\f3ä\u007fæ\u008a#Özbô®èùd\u0005.\u0007T´Ç`\t\u001cSÉ\u008a\u0085Ð1\u0019í\u0011\u009a¦VÍ\u0002\u0006¾!k§'ìÓ4\u008f}<¡èI¤KQ\u008e\r×¹YuE\"ÉÞ\u0083\u008a\u0016F;óõ>B\u008dãYf%lð¡¼î\b<Ôc£±oÞ;\r7I\u0084ýP:,~ù¸µë\u00015Ýb\f\u0000¿¨ka\u0017:Â¾\u008eì¦\u007f\u0015ÐÁ\u001b½Zh\u0095$Ô\u008a\u008a9+í®\u0091¼Dz\b;¼ô`©\u0017{Û\u0010\u008f\u008e3\u008eæZª\u0015^Þ\u0002\u0098À\u0096s7§²Û»\u000eqB:öâ*¥]h\u0091VÅÍy\u0095¬Yà\u001d\fG\f\u0004¿¥k \u00171Âã\u008e¹:kæ \u0091ó\fFîÁ]`\u0089åõå 6lvØ·\u0004ós}¿_ë\u0099WÈ\u0082\u0007ÎJ:\u0098fÃ\f\u0010¿¿kb\u0017.ÂÙ\u008e¢:&æd\f\u0004¿¥k \u0017 Âó\u008e³:ræ6\u0091¸]\u008c\tGµ\f`Á,\u009fØL\u0084\u00027Äãc¯ ZöÒ\u0095a+µäÉ£\u001cpP7äù8ùOa\u0083\n×ÁkÉ¾Eò\u001b\u0006ÔZ\u0093é@=çq©ÜÂo|»³Çô\u0012'^`ê®6ÞA=\u008d\u0001ÙËe\u009e°\u0006üM\b\u0086Tþç\u001d3á\u007f«\u008a~Örb¬®ãù$\u0005wQ\u0090\u009dÞ(.tM\u0080ÑÌ\u009b\u0000(³\u0096gY\u001b\u001eÎÍ\u0082\u008a6DêD\u009dÈQ¼\u0005x¹<ló ¦ÔX\u00888;ëïX£XVÜ\n\u009a¾Mr\u0002%ÙÙ\u0086\u008dp\f\u0011¿¯k`\u0017'Âô\u008e³:}æ}\u0091à]\u0088\tAµ\u001a`\u009e,ÌØN\u0084]7Àãh¯!Zú\u0006þ²,~.y5Ê\u0081\u001eEb\u0001·Îû\u009bO\u0015\u0093\u0005äÖ(¥|UÀ!\u0015òY¶\u00aduñ8B÷\u0096qÚ\u0012/\u009esÔÇ\u0011\u000b\u001d\\Ó \u009côk88\u008dïÑ¡%Ai\"º®\u000eä_\u0015ì´81D1\u0091øÝ¤i{µ/Âè\u000e\u009aZ[æ\u00163Å¨ò\u001bSÏÖ³Öf\u001f*C\u009e\u009cBÍ5\rù}\u00ad¿\u0011ñÄ~\u0088n|½ í\u0093,G\u0098\u000b\u0096þ\u0012¢Y\u0016\u0082ÚÏ\u008d\u0001qR%¬éê\\=\u0000~ô¸3¡\u00802Tü(¦ý\u007f±%\u0005ìÙé®xbD6\u008eÎÂ}c©æÕæ\u00005Luø´$ðS~\u009fHË\u0081w×¢\u0010îP\u001a\u0099FÍõ^!¥mì\f\u0002¿¯k}\u00176Â«TRçé3*O{\u009aåÖäb%¾|Éõ\u0005ÖQ\u0006íB8\u009et\u009a\u0080\u0003ÜMo\u0094»7÷p\f\u0007¿¯kc\u00177Â¨\u008e²:iæ|\u0091û]\u008b\tGµ\f`Í,\u009fØG\u0084\u0001\f\u0007¿¯kc\u00177Â¨\u008e©:xæ|\u0091ð]\u008b\tEµ\u0007`ù,\u0099Ø_\u0084\u001f7Óãx¯/\f\u0007¿¯kc\u00177Â¨\u008e©:xæ|\u0091ú]\u0089\tJµ=`Â,\u009fØP\u0084\u00017ßã~¯7×çdF°ÃÌÊ\u0019\u0000UKá\u0093=ÔJ\u0019\u0086'Ò¬nï»!÷k\u0003²_øì18ÇtÜ\u0081\u0004ÝHi\u008c¥Ù0(\u0083\u0089W\f+\fþÅ²\u0099\u0006FÚP\u00adËa£5o\u0089;\\¤\u0010·äd¸:\u000bÅßH\u0093\u0003fÃ:\u008f\f\u0004¿¥k \u0017-Ââ\u008e·:0æ0\u0091ã]\u0083\tBµ\u0006`\u0088,\u009cØW\u0084\u001c7Ñão¯<Zò\u0006´²s~0)æ\u0086Û5záÿ\u009díH+\u0004j°¥lø\u001b*×A\u0083ß?ßê\f¦LR\u008d\u000eÉ½Gi³%øÐ3\u008c~8 ôó£=_{\u000b\u009cÇßr\t\u0096K%êño\u008d~X°\u0014æ %|x\u000b´Ç\u008b\u0093\u0003/Xú\u0080¶ÙB\u0015\u001e\u0013\u00ad\u009fy,5oÀª\u009cì('äa³¯Oð\u001b\u000b×U^òíS9ÖEÇ\u0090\tÜ_h\u009c´ÁÃ\r\u000fC[½çì2$~\"\u008aªÖñe)±\u0090ýÜ\bZTVà\u0085,Æ{\u0003\u0087EÓ®\u001fèª&öy\u0002¢Nü\u007fÏÌn\u0018ëdÿ±(ý\u007fI±\u0095öâ/.\u000fz\u0087ÆÜ\u0013\u0004_]«\u0091÷\u0097D\u001b\u0090¨Üë).uhÁ£\råZ+¦tò\u008f>ÑÕ6f\u0097²\u0012Î\u0006\u001bÑW\u0086ãH?\u000fHÖ\u0084\u0087Ðxl<¹ÿõ¥\u0001\"]\"îñ:Qv\u0010\u0083ÔßÚkN§\u0005ðÎ\f\u0083X}\u0094.!à}¦\u0089aÅ\"\u0016ô\f^\fZ¿êéè|JÍ°~Gª\u0082ÖÝ\u0003@OBû\u0092'ÖP\n\u009c\\È·tâ¡?ív\fY¿®kk\u00174Â©\u008e©:qæ1\u0091ý]\u008f\tZµM`Ä,\u009bØM\u0084\u00177Ôãk¯ Zæ\u0006\u0099²}~;)üÕ¯\u0081N\fY¿®kk\u00174Â©\u008e©:qæ1\u0091ý]\u008f\tZµM`Á,\u009fØP\u0084\u000b7Ò\fY¿®kk\u00174Â©\u008e©:qæ1\u0091ý]\u008f\tZµM`×,\u009fØS\u0084\u00077ÒËóx\u0013¬ÝÐ\u009b\u0005\u0003I\u0001ýÑ!\u0095VI\u009a\u001fÎðrº§më3\u001fñ{óÈ\u0013\u001cÝ`\u009bµXù\u0015MÙ\u0091×æP*)~æÂç\u0017`[9¯öó»@C\u0094ÍØ\u0085-Dq\u0000Åß\t\u0097^g¢\u0018öå:¦\u008f}Ó+'Ïk¥¸}\f1P\u0095¥\né\u001b=Ã8§\u008bP_\u0095#ÊöWºF\u000e\u0093ÒØ¥7is= \u0081ï9D\u008a³^v\")÷´»¥\u000fpÓ;¤Ôh\u0083<Z\u0080\u0012UÞ:\r\u0089ú]?!`ôý¸ý\f%Ðe§©kÛ?\u000e\u0083\u0019V\u0090\u001aÝî\u001e²@\u0001\u008dÕ2\u0099~l³0à\u0084*þaM\u0081\u0099Oå\t0Ê|\u0087ÈK\u0014EcÂ¯»ûtGu\u0092òÞ«*dv(Åý\u0011F]\u0010¨Õô\u0092@F\u008c\u0003ÛØ'±sx¿8\nóVð¢qî)\fY¿®kk\u00174Â©\u008e¸:mæ&\u0091÷]\u0089\tMµ\u0007\fY¿®kk\u00174Â©\u008e¸:mæ&\u0091ñ]\u0093\t\\µ\raþÒ\t\u0006Ìz\u0093¯\u000eã\u001fWÊ\u008b\u0081ü\\0(dîØ«²Ô\u0001#Õæ©¹|$05\u0084àX«/tã\u0015·Ê\u000b\u008a\fY¿®kk\u00174Â©\u008e¸:mæ&\u0091à]\u0087\t]µ\u0005\fY¿®kk\u00174Â©\u008e¸:mæ&\u0091æ]\u008d\tOµ\u000b`Ö,\u0099\u008d¥>Rê\u0097\u0096ÈCU\u000fD»\u0091gÚ\u00105Ü\u007f\u0088¿4ûC\u000bðü$=Xd\u008dµÁ§u(©oÞ³\u0012ÖF\u0010ú_/\u0095cÌ\u0097\u001fË\u000fxÊ¬ à~\u0015ÿIöý;1xf«\fY¿§k`\u00176Â©\u008e\u00ad:wæ<\u0091ò]\u0085\tYµ\u0011`\u0089,¸ØM\u0084\u00067åãb¯/Zð\u0006£²~~\u0018)ýÕº\u0081NM\u000bøÐy\u0015Êö\u001e0ba·©û¹O;\u0093qäª(É|\u0010ÀZ\u0015\u0099Áär\u000e¦ÊÚÀ\u000f\u001e[Üè?<ù@¨\u0095`Ùpmè±²Æ\u007f\n\t^\u0084â\u008a7B{\u000f\u008fÈ\u0095\u0088&!òö\u008e·[s\u0017,£ä\u007få\bhÄ\u001c\u0090Û,\u009fùYµ\nAÔ\u001d\u0083®\u0001zà6¸«¶\u0018\u000fÌÀ°©ef)3\u009dáA¡6Xú5®ö\u0012àÇy\u008b9\fY¿¯kz\u0017!Â©\u008e·:{æ6\u0091ÿ]\u008b\tqµ\u0001`É,\u009eØ[\u0084\u00117Åã$¯6Zï\u0006ªÉÉz{®¦Òú\u0007(Ksÿ¢#ìT \u0098D\u001bp¨\u0086|S\u0000\bÕ\u0080\u0099\u009e-Xñ\u000e\u0086ÑJ·\u001et\fY¿®ko\u00176Âç\u008eõ:zæ=\u0091á]\u0084\tBµ\r`Ç,\u009eØM\u0084]7\u0098ãn¯>Z\u00ad\u0006§²j~.)áÕø\u0081RM\u0003øÎCþð\u001d$ÛX\u008a\u008dBÁRuÚ©\u0085ÞD\u0012$Fçú£/n\u001e\u0012\u00ad\u0086yA\u0005\u0005ÐÃ\u009c\u0090(Nô\u0019\fY¿®ko\u00176Âç\u008eõ:sæ;\u0091å]\u0089\t\u0001µ\u0012`Ô,\u0095ØX\u0084\u001b7Úão¯=Z\u00ad\u0006¥²o~,)½Õæ\u0081\u0005M\røÍ¤\u008bP\u0014\u001c\u0013ÏÛ{\u0095'8Òá\u009e´Joö(¡êmü\u0019{Å\u000fpÃ<\u0097èO\u0094\u0017GÛ".getBytes(LocalizedMessage.DEFAULT_ENCODING)).asCharBuffer().get(cArr, 0, 2156);
                ShareDataUIState = cArr;
                component3 = 6076060590543388618L;
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component1 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 99;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                if (i3 != 0) {
                    int i4 = 64 / 0;
                }
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                int i = 2 % 2;
                int i2 = copydefault + 111;
                component1 = i2 % 128;
                if (i2 % 2 != 0) {
                    defaultViewModelProviderFactory = sfcDataOnlyBundlesActivity.getDefaultViewModelProviderFactory();
                    int i3 = 56 / 0;
                } else {
                    defaultViewModelProviderFactory = sfcDataOnlyBundlesActivity.getDefaultViewModelProviderFactory();
                }
                int i4 = copydefault + 81;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras defaultViewModelCreationExtras;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 103;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Function0 function02 = function0;
                if (function02 == null || (defaultViewModelCreationExtras = (CreationExtras) function02.invoke()) == null) {
                    defaultViewModelCreationExtras = sfcDataOnlyBundlesActivity.getDefaultViewModelCreationExtras();
                }
                int i3 = component2 + 65;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 117;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 45;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final BuyBundleViewModel getViewModel() {
        int i = 2 % 2;
        int i2 = equals + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.viewModel.getValue();
        if (i3 == 0) {
            return (BuyBundleViewModel) value;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        public static final Resource copydefault(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> resourceShareDataUIState = ShareDataUIState(state);
            int i4 = copydefault + 113;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return resourceShareDataUIState;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = copydefault + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                return unit;
            }
            throw null;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int copydefault;
            final SfcDataOnlyBundlesActivity ShareDataUIState;
            final State<Resource<List<Plans>>> component1;
            final List<WithExpiryResp> component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 55;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 78 / 0;
                }
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r11, int r12) {
                /*
                    r10 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.component2
                    int r1 = r1 + 107
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.copydefault = r2
                    int r1 = r1 % r0
                    if (r1 == 0) goto L13
                    r1 = 4
                    r12 = r12 & r1
                    if (r12 != r1) goto L2f
                    goto L17
                L13:
                    r12 = r12 & 11
                    if (r12 != r0) goto L2f
                L17:
                    boolean r12 = r11.getSkipping()
                    if (r12 != 0) goto L2b
                    int r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.component2
                    int r12 = r12 + 13
                    int r1 = r12 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.copydefault = r1
                    int r12 = r12 % r0
                    if (r12 == 0) goto L2f
                    r12 = 3
                    int r12 = r12 / r12
                    goto L2f
                L2b:
                    r11.skipToGroupEnd()
                    goto L8f
                L2f:
                    java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.WithExpiryResp> r1 = r10.component3
                    androidx.compose.runtime.State<com.huawei.payment.mvvm.Resource<java.util.List<com.huawei.digitalpayment.consumer.sfcui.buybundles.resp.Plans>>> r12 = r10.component1
                    com.huawei.payment.mvvm.Resource r12 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.copydefault(r12)
                    r2 = 0
                    r3 = 1
                    if (r12 == 0) goto L4c
                    int r4 = com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.component2
                    int r4 = r4 + 111
                    int r5 = r4 % 128
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.copydefault = r5
                    int r4 = r4 % r0
                    boolean r12 = r12.loading()
                    if (r12 != r3) goto L4c
                    r12 = r3
                    goto L4d
                L4c:
                    r12 = r2
                L4d:
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0 r0 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity r4 = r10.ShareDataUIState
                    r0.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1 r4 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda1
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity r5 = r10.ShareDataUIState
                    r4.<init>()
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2 r5 = new com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity$onCreate$1$1$$ExternalSyntheticLambda2
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity r6 = r10.ShareDataUIState
                    r5.<init>()
                    androidx.compose.ui.Modifier$Companion r6 = androidx.compose.ui.Modifier.INSTANCE
                    androidx.compose.ui.Modifier r6 = (androidx.compose.ui.Modifier) r6
                    r7 = 0
                    r8 = 0
                    androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(r6, r7, r3, r8)
                    androidx.compose.foundation.layout.WindowInsets$Companion r6 = androidx.compose.foundation.layout.WindowInsets.INSTANCE
                    r7 = 8
                    androidx.compose.foundation.layout.WindowInsets r6 = androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(r6, r11, r7)
                    androidx.compose.foundation.layout.WindowInsetsSides$Companion r7 = androidx.compose.foundation.layout.WindowInsetsSides.INSTANCE
                    int r7 = r7.m1267getTopJoeWqyM()
                    androidx.compose.foundation.layout.WindowInsets r6 = androidx.compose.foundation.layout.WindowInsetsKt.m1239onlybOOhFvg(r6, r7)
                    androidx.compose.foundation.layout.PaddingValues r2 = androidx.compose.foundation.layout.WindowInsetsKt.asPaddingValues(r6, r11, r2)
                    androidx.compose.ui.Modifier r6 = androidx.compose.foundation.layout.PaddingKt.padding(r3, r2)
                    r8 = 8
                    r9 = 0
                    r2 = r12
                    r3 = r0
                    r7 = r11
                    com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivityKt.DataOnlyBundlesScreen(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                L8f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.AnonymousClass1.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component2(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = copydefault + 5;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                    Intrinsics.checkNotNullParameter(withExpiryResp, "");
                    SfcDataOnlyBundlesActivity.access$onBundleSelected(sfcDataOnlyBundlesActivity, withExpiryResp);
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                Intrinsics.checkNotNullParameter(withExpiryResp, "");
                SfcDataOnlyBundlesActivity.access$onBundleSelected(sfcDataOnlyBundlesActivity, withExpiryResp);
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 77;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            private static final Unit component1(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 107;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                    SfcDataOnlyBundlesActivity.access$getViewModel(sfcDataOnlyBundlesActivity).getExpiryBundlesCatalog();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                SfcDataOnlyBundlesActivity.access$getViewModel(sfcDataOnlyBundlesActivity).getExpiryBundlesCatalog();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit ShareDataUIState(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                    sfcDataOnlyBundlesActivity.finish();
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcDataOnlyBundlesActivity, "");
                sfcDataOnlyBundlesActivity.finish();
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity, WithExpiryResp withExpiryResp) {
                int i = 2 % 2;
                int i2 = copydefault + 67;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return component2(sfcDataOnlyBundlesActivity, withExpiryResp);
                }
                component2(sfcDataOnlyBundlesActivity, withExpiryResp);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
                int i = 2 % 2;
                int i2 = component2 + 7;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return component1(sfcDataOnlyBundlesActivity);
                }
                component1(sfcDataOnlyBundlesActivity);
                throw null;
            }

            public static Unit component2(SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 51;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitShareDataUIState = ShareDataUIState(sfcDataOnlyBundlesActivity);
                int i4 = copydefault + 53;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unitShareDataUIState;
            }

            AnonymousClass1(List<WithExpiryResp> list, State<Resource<List<Plans>>> state, SfcDataOnlyBundlesActivity sfcDataOnlyBundlesActivity) {
                this.component3 = list;
                this.component1 = state;
                this.ShareDataUIState = sfcDataOnlyBundlesActivity;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r33, int r34) {
            /*
                Method dump skipped, instruction units count: 507
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.component2.component1(androidx.compose.runtime.Composer, int):void");
        }

        private static final Resource<List<Plans>> ShareDataUIState(State<Resource<List<Plans>>> state) {
            int i = 2 % 2;
            int i2 = copydefault + 97;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Resource<List<Plans>> value = state.getValue();
            int i4 = ShareDataUIState + 87;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        component2() {
        }
    }

    private static void i(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notify notifyVar = new notify();
        notifyVar.component3 = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i3 = notifyVar.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifyVar.copydefault]), notifyVar, notifyVar};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(191356224);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3265 - TextUtils.lastIndexOf("", '0', 0, 0), 33 - KeyEvent.keyCodeFromString(""), (char) (Gravity.getAbsoluteGravity(0, 0) + 60268), -834797019, false, $$n(b2, b3, (byte) (b3 | 37)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue() ^ (component2 ^ 5431355972723572778L);
                try {
                    Object[] objArr3 = {notifyVar, notifyVar};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 688, (ViewConfiguration.getJumpTapTimeout() >> 16) + 34, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 60374), -1969106284, false, $$n(b4, b4, (byte) (-$$l[1])), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        char[] cArr2 = new char[length];
        notifyVar.copydefault = 0;
        while (notifyVar.copydefault < cArr.length) {
            int i4 = $11 + 5;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr2[notifyVar.copydefault] = (char) jArr[notifyVar.copydefault];
            try {
                Object[] objArr4 = {notifyVar, notifyVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1341656561);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 687, ExpandableListView.getPackedPositionType(0L) + 34, (char) (Color.red(0) + 60373), -1969106284, false, $$n(b5, b5, (byte) (-$$l[1])), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        String str = new String(cArr2);
        int i6 = $11 + 13;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void f(char[] r21, int r22, boolean r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.f(char[], int, boolean, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = ShareDataUIState;
        char c2 = '0';
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        int iCombineMeasuredStates = View.combineMeasuredStates(i3, i3) + 3760;
                        int iCombineMeasuredStates2 = 24 - View.combineMeasuredStates(i3, i3);
                        char cIndexOf = (char) ((-1) - TextUtils.indexOf("", c2, i3));
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iCombineMeasuredStates, iCombineMeasuredStates2, cIndexOf, -1670574543, false, $$n(b2, b3, (byte) (b3 + 3)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
                    c2 = '0';
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(component3)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        long j = 0;
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.normalizeMetaState(0) + 7140, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (component1) {
            int i6 = $10 + 123;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 2749, 19 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 7645), -327556343, false, $$n(b4, b4, $$l[0]), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i5 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (copydefault) {
            cancelVar.component1 = cArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.MeasureSpec.getSize(0), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)), (char) (7643 - TextUtils.lastIndexOf("", '0')), -327556343, false, $$n(b5, b5, $$l[0]), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = 0;
        cancelVar.component1 = iArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        while (true) {
            cancelVar.component3 = i8;
            if (cancelVar.component3 >= cancelVar.component1) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i9 = $10 + 63;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) << cancelVar.component3] >> i] % iIntValue);
                i8 = cancelVar.component3;
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i8 = cancelVar.component3 + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01fb  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObservers() {
        int i = 2 % 2;
        getViewModel().getOtherBundlesData().observe(this, new SfcDataOnlyBundlesActivityKt.ShareDataUIState(new Function1() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = copydefault + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$FqhlZL5Mlj4m8fuDXUCDivZk4sU = SfcDataOnlyBundlesActivity.$r8$lambda$FqhlZL5Mlj4m8fuDXUCDivZk4sU((Resource) obj);
                if (i4 == 0) {
                    int i5 = 73 / 0;
                }
                return unit$r8$lambda$FqhlZL5Mlj4m8fuDXUCDivZk4sU;
            }
        }));
        int i2 = equals + 15;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final Unit initObservers$lambda$0(Resource resource) {
        int i = 2 % 2;
        if (resource.error()) {
            int i2 = equals + 39;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                ToastUtils.showLong(resource.getException().getMessage(), new Object[1]);
            } else {
                ToastUtils.showLong(resource.getException().getMessage(), new Object[0]);
            }
        }
        Unit unit = Unit.INSTANCE;
        int i3 = equals + 15;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    private final void onBundleSelected(WithExpiryResp bundle) {
        int i = 2 % 2;
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("withExpiryResp", bundle);
        bundle2.putString(Keys.KEY_BUNDLE_TYPE, Keys.BUNDLE_TYPE_DATA_ONLY);
        bundle2.putString(Keys.KEY_RETURN_DESTINATION, RoutePathConstant.SFC_DATA_ONLY_BUNDLE);
        RouteUtils.routeWithExecute(this, RoutePathConstant.SFC_BUNDLE_PURCHASE, bundle2);
        int i2 = equals + 57;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = ((Field) onLaunchlambda0.component2[0]).getInt(null);
        int length = ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952812_res_0x7f1304ac).substring(55, 56).length() - 2051444915;
        if (i2 != 1406149138 + (((~length) | 1569812913) * 1444) + (((~(length | (-1183105944))) | (~(454406694 | length)) | 1149256081) * (-1444)) + 466442236) {
            throw null;
        }
        if (((Field) onLaunch.component3[0]).getInt(null) != ((((~((-784633424) | r2)) | 578849357) * (-241)) - 1780987111) + (((~((~new Random().nextInt(1818724589)) | (-205784067))) | 3805184) * 241)) {
            int i3 = copy + 125;
            equals = i3 % 128;
            int i4 = i3 % 2;
            throw null;
        }
        super.onStart();
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ReplaceNewArray
        java.lang.IllegalArgumentException: Illegal Capacity: -1233032963
        	at java.base/java.util.ArrayList.<init>(Unknown Source)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.FilledNewArrayNode.<init>(FilledNewArrayNode.java:13)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:144)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    @Override
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009a  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1032:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0a09 A[Catch: all -> 0x0b44, TryCatch #29 {all -> 0x0b44, blocks: (B:110:0x09ff, B:111:0x0a03, B:113:0x0a09, B:116:0x0a26, B:105:0x0998, B:109:0x09f7), top: B:922:0x0998 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0c17 A[Catch: all -> 0x0558, TryCatch #38 {all -> 0x0558, blocks: (B:175:0x0c11, B:177:0x0c17, B:178:0x0c41, B:281:0x1139, B:283:0x113f, B:284:0x116a, B:555:0x1e57, B:557:0x1e5d, B:558:0x1e83, B:779:0x3255, B:781:0x325b, B:782:0x3285, B:822:0x35f5, B:824:0x35fb, B:825:0x361b, B:802:0x3431, B:804:0x3454, B:805:0x34a4, B:745:0x2f20, B:747:0x2f26, B:748:0x2f4d, B:638:0x283b, B:640:0x2841, B:641:0x286e, B:643:0x28a8, B:644:0x28f5, B:605:0x24bb, B:607:0x24d0, B:608:0x2501, B:610:0x2535, B:611:0x25b0, B:850:0x3709, B:852:0x370f, B:853:0x373c, B:855:0x3776, B:856:0x37c5, B:571:0x203c, B:573:0x2051, B:574:0x2082, B:437:0x18b8, B:439:0x18be, B:440:0x18e9, B:391:0x1677, B:393:0x167d, B:394:0x16ab, B:19:0x0223, B:21:0x0229, B:22:0x0251, B:24:0x04c5, B:26:0x04f7, B:27:0x0552, B:400:0x1733, B:402:0x1737, B:423:0x1823, B:425:0x1829, B:426:0x182a, B:428:0x182c, B:430:0x1833, B:431:0x1834, B:406:0x1743, B:416:0x1797, B:418:0x17a4, B:419:0x1814, B:412:0x174e, B:414:0x1763, B:415:0x1791), top: B:938:0x0223, inners: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0cd7  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0df2 A[Catch: all -> 0x10ca, TRY_ENTER, TRY_LEAVE, TryCatch #34 {all -> 0x10ca, blocks: (B:182:0x0cd1, B:189:0x0d2c, B:205:0x0df2), top: B:931:0x0cd1 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0fc5  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x113f A[Catch: all -> 0x0558, TryCatch #38 {all -> 0x0558, blocks: (B:175:0x0c11, B:177:0x0c17, B:178:0x0c41, B:281:0x1139, B:283:0x113f, B:284:0x116a, B:555:0x1e57, B:557:0x1e5d, B:558:0x1e83, B:779:0x3255, B:781:0x325b, B:782:0x3285, B:822:0x35f5, B:824:0x35fb, B:825:0x361b, B:802:0x3431, B:804:0x3454, B:805:0x34a4, B:745:0x2f20, B:747:0x2f26, B:748:0x2f4d, B:638:0x283b, B:640:0x2841, B:641:0x286e, B:643:0x28a8, B:644:0x28f5, B:605:0x24bb, B:607:0x24d0, B:608:0x2501, B:610:0x2535, B:611:0x25b0, B:850:0x3709, B:852:0x370f, B:853:0x373c, B:855:0x3776, B:856:0x37c5, B:571:0x203c, B:573:0x2051, B:574:0x2082, B:437:0x18b8, B:439:0x18be, B:440:0x18e9, B:391:0x1677, B:393:0x167d, B:394:0x16ab, B:19:0x0223, B:21:0x0229, B:22:0x0251, B:24:0x04c5, B:26:0x04f7, B:27:0x0552, B:400:0x1733, B:402:0x1737, B:423:0x1823, B:425:0x1829, B:426:0x182a, B:428:0x182c, B:430:0x1833, B:431:0x1834, B:406:0x1743, B:416:0x1797, B:418:0x17a4, B:419:0x1814, B:412:0x174e, B:414:0x1763, B:415:0x1791), top: B:938:0x0223, inners: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x124b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x129e A[Catch: all -> 0x160c, TRY_ENTER, TRY_LEAVE, TryCatch #59 {all -> 0x160c, blocks: (B:288:0x11e9, B:294:0x123e, B:336:0x14bb, B:337:0x14bf, B:340:0x14cd, B:343:0x14e9, B:303:0x129e, B:321:0x13a2, B:325:0x13e8, B:331:0x145a, B:335:0x14b3), top: B:978:0x11e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x14cd A[Catch: all -> 0x160c, TryCatch #59 {all -> 0x160c, blocks: (B:288:0x11e9, B:294:0x123e, B:336:0x14bb, B:337:0x14bf, B:340:0x14cd, B:343:0x14e9, B:303:0x129e, B:321:0x13a2, B:325:0x13e8, B:331:0x145a, B:335:0x14b3), top: B:978:0x11e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x167d A[Catch: all -> 0x0558, TryCatch #38 {all -> 0x0558, blocks: (B:175:0x0c11, B:177:0x0c17, B:178:0x0c41, B:281:0x1139, B:283:0x113f, B:284:0x116a, B:555:0x1e57, B:557:0x1e5d, B:558:0x1e83, B:779:0x3255, B:781:0x325b, B:782:0x3285, B:822:0x35f5, B:824:0x35fb, B:825:0x361b, B:802:0x3431, B:804:0x3454, B:805:0x34a4, B:745:0x2f20, B:747:0x2f26, B:748:0x2f4d, B:638:0x283b, B:640:0x2841, B:641:0x286e, B:643:0x28a8, B:644:0x28f5, B:605:0x24bb, B:607:0x24d0, B:608:0x2501, B:610:0x2535, B:611:0x25b0, B:850:0x3709, B:852:0x370f, B:853:0x373c, B:855:0x3776, B:856:0x37c5, B:571:0x203c, B:573:0x2051, B:574:0x2082, B:437:0x18b8, B:439:0x18be, B:440:0x18e9, B:391:0x1677, B:393:0x167d, B:394:0x16ab, B:19:0x0223, B:21:0x0229, B:22:0x0251, B:24:0x04c5, B:26:0x04f7, B:27:0x0552, B:400:0x1733, B:402:0x1737, B:423:0x1823, B:425:0x1829, B:426:0x182a, B:428:0x182c, B:430:0x1833, B:431:0x1834, B:406:0x1743, B:416:0x1797, B:418:0x17a4, B:419:0x1814, B:412:0x174e, B:414:0x1763, B:415:0x1791), top: B:938:0x0223, inners: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1729  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x174c  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1763 A[Catch: all -> 0x182b, TryCatch #12 {all -> 0x182b, blocks: (B:412:0x174e, B:414:0x1763, B:415:0x1791), top: B:893:0x174e, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x17a4 A[Catch: all -> 0x1821, TryCatch #1 {all -> 0x1821, blocks: (B:416:0x1797, B:418:0x17a4, B:419:0x1814), top: B:872:0x1797, outer: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x19b8 A[Catch: all -> 0x1dd0, PHI: r3 r10
  0x19b8: PHI (r3v361 java.lang.Object) = (r3v356 java.lang.Object), (r3v360 java.lang.Object) binds: [B:445:0x196a, B:446:0x196c] A[DONT_GENERATE, DONT_INLINE]
  0x19b8: PHI (r10v97 ??) = (r10v216 ??), (r10v96 ??) binds: [B:445:0x196a, B:446:0x196c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x1dd0, blocks: (B:444:0x1966, B:450:0x19b8, B:459:0x1a2a, B:477:0x1b3e, B:481:0x1b89), top: B:934:0x1966 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x19c5  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x1a2a A[Catch: all -> 0x1dd0, TRY_ENTER, TRY_LEAVE, TryCatch #36 {all -> 0x1dd0, blocks: (B:444:0x1966, B:450:0x19b8, B:459:0x1a2a, B:477:0x1b3e, B:481:0x1b89), top: B:934:0x1966 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0635 A[Catch: all -> 0x0b75, PHI: r2 r10 r13
  0x0635: PHI (r2v512 java.lang.Object) = (r2v507 java.lang.Object), (r2v511 java.lang.Object) binds: [B:42:0x05dc, B:43:0x05de] A[DONT_GENERATE, DONT_INLINE]
  0x0635: PHI (r10v164 ??) = (r10v228 ??), (r10v163 ??) binds: [B:42:0x05dc, B:43:0x05de] A[DONT_GENERATE, DONT_INLINE]
  0x0635: PHI (r13v167 ??) = (r13v237 ??), (r13v238 ??) binds: [B:42:0x05dc, B:43:0x05de] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #49 {all -> 0x0b75, blocks: (B:41:0x05c5, B:48:0x0635, B:70:0x06d6), top: B:959:0x05c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x1c6d A[Catch: all -> 0x1db1, TryCatch #15 {all -> 0x1db1, blocks: (B:493:0x1c63, B:494:0x1c67, B:496:0x1c6d, B:499:0x1c88, B:483:0x1b98, B:488:0x1bff, B:492:0x1c5b), top: B:898:0x1b98 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x1e5d A[Catch: all -> 0x0558, TryCatch #38 {all -> 0x0558, blocks: (B:175:0x0c11, B:177:0x0c17, B:178:0x0c41, B:281:0x1139, B:283:0x113f, B:284:0x116a, B:555:0x1e57, B:557:0x1e5d, B:558:0x1e83, B:779:0x3255, B:781:0x325b, B:782:0x3285, B:822:0x35f5, B:824:0x35fb, B:825:0x361b, B:802:0x3431, B:804:0x3454, B:805:0x34a4, B:745:0x2f20, B:747:0x2f26, B:748:0x2f4d, B:638:0x283b, B:640:0x2841, B:641:0x286e, B:643:0x28a8, B:644:0x28f5, B:605:0x24bb, B:607:0x24d0, B:608:0x2501, B:610:0x2535, B:611:0x25b0, B:850:0x3709, B:852:0x370f, B:853:0x373c, B:855:0x3776, B:856:0x37c5, B:571:0x203c, B:573:0x2051, B:574:0x2082, B:437:0x18b8, B:439:0x18be, B:440:0x18e9, B:391:0x1677, B:393:0x167d, B:394:0x16ab, B:19:0x0223, B:21:0x0229, B:22:0x0251, B:24:0x04c5, B:26:0x04f7, B:27:0x0552, B:400:0x1733, B:402:0x1737, B:423:0x1823, B:425:0x1829, B:426:0x182a, B:428:0x182c, B:430:0x1833, B:431:0x1834, B:406:0x1743, B:416:0x1797, B:418:0x17a4, B:419:0x1814, B:412:0x174e, B:414:0x1763, B:415:0x1791), top: B:938:0x0223, inners: #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1f04  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x1f56  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x201c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x21c0  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x2fd3  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x3028  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x307e  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x3237  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x3313  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x335b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01fd A[PHI: r12
  0x01fd: PHI (r12v170 char) = (r12v17 char), (r12v171 char) binds: [B:17:0x021e, B:5:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:801:0x3413  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x35d5  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x36ba  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x05de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0206 A[PHI: r12
  0x0206: PHI (r12v17 char) = (r12v16 char), (r12v176 char) binds: [B:3:0x01f5, B:5:0x01fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:900:0x196c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:915:0x11ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v103 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v109, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v113 */
    /* JADX WARN: Type inference failed for: r10v114 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v119 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v133 */
    /* JADX WARN: Type inference failed for: r10v137 */
    /* JADX WARN: Type inference failed for: r10v138 */
    /* JADX WARN: Type inference failed for: r10v139 */
    /* JADX WARN: Type inference failed for: r10v140 */
    /* JADX WARN: Type inference failed for: r10v141 */
    /* JADX WARN: Type inference failed for: r10v142 */
    /* JADX WARN: Type inference failed for: r10v144, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v146 */
    /* JADX WARN: Type inference failed for: r10v147 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v163 */
    /* JADX WARN: Type inference failed for: r10v164 */
    /* JADX WARN: Type inference failed for: r10v182 */
    /* JADX WARN: Type inference failed for: r10v189 */
    /* JADX WARN: Type inference failed for: r10v190 */
    /* JADX WARN: Type inference failed for: r10v191 */
    /* JADX WARN: Type inference failed for: r10v193, types: [int[]] */
    /* JADX WARN: Type inference failed for: r10v195, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v196 */
    /* JADX WARN: Type inference failed for: r10v197 */
    /* JADX WARN: Type inference failed for: r10v200 */
    /* JADX WARN: Type inference failed for: r10v201 */
    /* JADX WARN: Type inference failed for: r10v202 */
    /* JADX WARN: Type inference failed for: r10v203 */
    /* JADX WARN: Type inference failed for: r10v204 */
    /* JADX WARN: Type inference failed for: r10v205 */
    /* JADX WARN: Type inference failed for: r10v206 */
    /* JADX WARN: Type inference failed for: r10v207 */
    /* JADX WARN: Type inference failed for: r10v208 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v211 */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v213 */
    /* JADX WARN: Type inference failed for: r10v214 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v217 */
    /* JADX WARN: Type inference failed for: r10v218 */
    /* JADX WARN: Type inference failed for: r10v219 */
    /* JADX WARN: Type inference failed for: r10v220 */
    /* JADX WARN: Type inference failed for: r10v221 */
    /* JADX WARN: Type inference failed for: r10v222 */
    /* JADX WARN: Type inference failed for: r10v223 */
    /* JADX WARN: Type inference failed for: r10v224 */
    /* JADX WARN: Type inference failed for: r10v225 */
    /* JADX WARN: Type inference failed for: r10v226 */
    /* JADX WARN: Type inference failed for: r10v227 */
    /* JADX WARN: Type inference failed for: r10v228 */
    /* JADX WARN: Type inference failed for: r10v229 */
    /* JADX WARN: Type inference failed for: r10v230 */
    /* JADX WARN: Type inference failed for: r10v231 */
    /* JADX WARN: Type inference failed for: r10v232 */
    /* JADX WARN: Type inference failed for: r10v233 */
    /* JADX WARN: Type inference failed for: r10v234 */
    /* JADX WARN: Type inference failed for: r10v235 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v72, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v78, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v89 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r10v97 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v104, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v105 */
    /* JADX WARN: Type inference failed for: r12v110 */
    /* JADX WARN: Type inference failed for: r12v111 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v163 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v172 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v175 */
    /* JADX WARN: Type inference failed for: r12v177 */
    /* JADX WARN: Type inference failed for: r12v178 */
    /* JADX WARN: Type inference failed for: r12v179 */
    /* JADX WARN: Type inference failed for: r12v180 */
    /* JADX WARN: Type inference failed for: r12v181 */
    /* JADX WARN: Type inference failed for: r12v182 */
    /* JADX WARN: Type inference failed for: r12v183 */
    /* JADX WARN: Type inference failed for: r12v184 */
    /* JADX WARN: Type inference failed for: r12v185 */
    /* JADX WARN: Type inference failed for: r12v186 */
    /* JADX WARN: Type inference failed for: r12v187 */
    /* JADX WARN: Type inference failed for: r12v188 */
    /* JADX WARN: Type inference failed for: r12v189 */
    /* JADX WARN: Type inference failed for: r12v190 */
    /* JADX WARN: Type inference failed for: r12v191 */
    /* JADX WARN: Type inference failed for: r12v192 */
    /* JADX WARN: Type inference failed for: r12v193 */
    /* JADX WARN: Type inference failed for: r12v194 */
    /* JADX WARN: Type inference failed for: r12v195 */
    /* JADX WARN: Type inference failed for: r12v196 */
    /* JADX WARN: Type inference failed for: r12v197 */
    /* JADX WARN: Type inference failed for: r12v198 */
    /* JADX WARN: Type inference failed for: r12v199 */
    /* JADX WARN: Type inference failed for: r12v200 */
    /* JADX WARN: Type inference failed for: r12v201 */
    /* JADX WARN: Type inference failed for: r12v202 */
    /* JADX WARN: Type inference failed for: r12v203 */
    /* JADX WARN: Type inference failed for: r12v204 */
    /* JADX WARN: Type inference failed for: r12v205 */
    /* JADX WARN: Type inference failed for: r12v206 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r12v208 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v155 */
    /* JADX WARN: Type inference failed for: r13v156 */
    /* JADX WARN: Type inference failed for: r13v157, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r13v158 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v167 */
    /* JADX WARN: Type inference failed for: r13v168 */
    /* JADX WARN: Type inference failed for: r13v169 */
    /* JADX WARN: Type inference failed for: r13v186 */
    /* JADX WARN: Type inference failed for: r13v187 */
    /* JADX WARN: Type inference failed for: r13v188 */
    /* JADX WARN: Type inference failed for: r13v192, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v193 */
    /* JADX WARN: Type inference failed for: r13v194 */
    /* JADX WARN: Type inference failed for: r13v195, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v196 */
    /* JADX WARN: Type inference failed for: r13v197 */
    /* JADX WARN: Type inference failed for: r13v198 */
    /* JADX WARN: Type inference failed for: r13v199 */
    /* JADX WARN: Type inference failed for: r13v200 */
    /* JADX WARN: Type inference failed for: r13v202 */
    /* JADX WARN: Type inference failed for: r13v203 */
    /* JADX WARN: Type inference failed for: r13v204 */
    /* JADX WARN: Type inference failed for: r13v208, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v209 */
    /* JADX WARN: Type inference failed for: r13v210 */
    /* JADX WARN: Type inference failed for: r13v211 */
    /* JADX WARN: Type inference failed for: r13v212 */
    /* JADX WARN: Type inference failed for: r13v213 */
    /* JADX WARN: Type inference failed for: r13v214 */
    /* JADX WARN: Type inference failed for: r13v215 */
    /* JADX WARN: Type inference failed for: r13v216 */
    /* JADX WARN: Type inference failed for: r13v217 */
    /* JADX WARN: Type inference failed for: r13v218 */
    /* JADX WARN: Type inference failed for: r13v219 */
    /* JADX WARN: Type inference failed for: r13v220 */
    /* JADX WARN: Type inference failed for: r13v221 */
    /* JADX WARN: Type inference failed for: r13v222 */
    /* JADX WARN: Type inference failed for: r13v223 */
    /* JADX WARN: Type inference failed for: r13v224 */
    /* JADX WARN: Type inference failed for: r13v225 */
    /* JADX WARN: Type inference failed for: r13v226 */
    /* JADX WARN: Type inference failed for: r13v227 */
    /* JADX WARN: Type inference failed for: r13v228 */
    /* JADX WARN: Type inference failed for: r13v229 */
    /* JADX WARN: Type inference failed for: r13v230 */
    /* JADX WARN: Type inference failed for: r13v231 */
    /* JADX WARN: Type inference failed for: r13v232 */
    /* JADX WARN: Type inference failed for: r13v233 */
    /* JADX WARN: Type inference failed for: r13v234 */
    /* JADX WARN: Type inference failed for: r13v235 */
    /* JADX WARN: Type inference failed for: r13v236 */
    /* JADX WARN: Type inference failed for: r13v237 */
    /* JADX WARN: Type inference failed for: r13v238 */
    /* JADX WARN: Type inference failed for: r13v239 */
    /* JADX WARN: Type inference failed for: r13v240 */
    /* JADX WARN: Type inference failed for: r13v241 */
    /* JADX WARN: Type inference failed for: r13v242 */
    /* JADX WARN: Type inference failed for: r13v243 */
    /* JADX WARN: Type inference failed for: r13v244 */
    /* JADX WARN: Type inference failed for: r13v245 */
    /* JADX WARN: Type inference failed for: r13v246 */
    /* JADX WARN: Type inference failed for: r13v249 */
    /* JADX WARN: Type inference failed for: r13v250 */
    /* JADX WARN: Type inference failed for: r13v251 */
    /* JADX WARN: Type inference failed for: r13v252 */
    /* JADX WARN: Type inference failed for: r13v253 */
    /* JADX WARN: Type inference failed for: r13v254 */
    /* JADX WARN: Type inference failed for: r13v255 */
    /* JADX WARN: Type inference failed for: r13v256 */
    /* JADX WARN: Type inference failed for: r13v257 */
    /* JADX WARN: Type inference failed for: r13v258 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r1v672 */
    /* JADX WARN: Type inference failed for: r1v677 */
    /* JADX WARN: Type inference failed for: r1v678 */
    /* JADX WARN: Type inference failed for: r1v800 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v11 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v24 */
    /* JADX WARN: Type inference failed for: r25v31 */
    /* JADX WARN: Type inference failed for: r25v32 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r25v35 */
    /* JADX WARN: Type inference failed for: r25v36 */
    /* JADX WARN: Type inference failed for: r25v37 */
    /* JADX WARN: Type inference failed for: r25v41 */
    /* JADX WARN: Type inference failed for: r25v42 */
    /* JADX WARN: Type inference failed for: r25v43 */
    /* JADX WARN: Type inference failed for: r25v44 */
    /* JADX WARN: Type inference failed for: r25v45 */
    /* JADX WARN: Type inference failed for: r25v46 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v50 */
    /* JADX WARN: Type inference failed for: r25v51 */
    /* JADX WARN: Type inference failed for: r25v52 */
    /* JADX WARN: Type inference failed for: r25v53 */
    /* JADX WARN: Type inference failed for: r25v54 */
    /* JADX WARN: Type inference failed for: r25v55 */
    /* JADX WARN: Type inference failed for: r25v56 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v61 */
    /* JADX WARN: Type inference failed for: r25v63 */
    /* JADX WARN: Type inference failed for: r25v64 */
    /* JADX WARN: Type inference failed for: r25v65 */
    /* JADX WARN: Type inference failed for: r25v66 */
    /* JADX WARN: Type inference failed for: r25v67 */
    /* JADX WARN: Type inference failed for: r25v68 */
    /* JADX WARN: Type inference failed for: r25v69 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v70 */
    /* JADX WARN: Type inference failed for: r25v71 */
    /* JADX WARN: Type inference failed for: r25v73 */
    /* JADX WARN: Type inference failed for: r25v74 */
    /* JADX WARN: Type inference failed for: r25v75 */
    /* JADX WARN: Type inference failed for: r25v76 */
    /* JADX WARN: Type inference failed for: r25v77 */
    /* JADX WARN: Type inference failed for: r25v78 */
    /* JADX WARN: Type inference failed for: r25v79 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v80 */
    /* JADX WARN: Type inference failed for: r25v81 */
    /* JADX WARN: Type inference failed for: r25v82 */
    /* JADX WARN: Type inference failed for: r25v83 */
    /* JADX WARN: Type inference failed for: r25v84 */
    /* JADX WARN: Type inference failed for: r25v85 */
    /* JADX WARN: Type inference failed for: r25v86 */
    /* JADX WARN: Type inference failed for: r25v87 */
    /* JADX WARN: Type inference failed for: r25v88 */
    /* JADX WARN: Type inference failed for: r25v89 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r25v90 */
    /* JADX WARN: Type inference failed for: r25v91 */
    /* JADX WARN: Type inference failed for: r25v92 */
    /* JADX WARN: Type inference failed for: r25v93 */
    /* JADX WARN: Type inference failed for: r25v94 */
    /* JADX WARN: Type inference failed for: r25v95 */
    /* JADX WARN: Type inference failed for: r25v96 */
    /* JADX WARN: Type inference failed for: r25v97 */
    /* JADX WARN: Type inference failed for: r27v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v21 */
    /* JADX WARN: Type inference failed for: r27v22 */
    /* JADX WARN: Type inference failed for: r27v23 */
    /* JADX WARN: Type inference failed for: r27v24 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v41 */
    /* JADX WARN: Type inference failed for: r27v49 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v50 */
    /* JADX WARN: Type inference failed for: r27v51 */
    /* JADX WARN: Type inference failed for: r27v52 */
    /* JADX WARN: Type inference failed for: r27v53 */
    /* JADX WARN: Type inference failed for: r27v54 */
    /* JADX WARN: Type inference failed for: r27v55 */
    /* JADX WARN: Type inference failed for: r27v56 */
    /* JADX WARN: Type inference failed for: r27v57 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r2v433 */
    /* JADX WARN: Type inference failed for: r2v434 */
    /* JADX WARN: Type inference failed for: r2v435 */
    /* JADX WARN: Type inference failed for: r2v447 */
    /* JADX WARN: Type inference failed for: r2v448 */
    /* JADX WARN: Type inference failed for: r2v449 */
    /* JADX WARN: Type inference failed for: r2v450 */
    /* JADX WARN: Type inference failed for: r2v453, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v454 */
    /* JADX WARN: Type inference failed for: r2v458 */
    /* JADX WARN: Type inference failed for: r2v472 */
    /* JADX WARN: Type inference failed for: r2v502, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v579 */
    /* JADX WARN: Type inference failed for: r2v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v580 */
    /* JADX WARN: Type inference failed for: r2v581 */
    /* JADX WARN: Type inference failed for: r2v582 */
    /* JADX WARN: Type inference failed for: r2v583 */
    /* JADX WARN: Type inference failed for: r2v584 */
    /* JADX WARN: Type inference failed for: r2v585 */
    /* JADX WARN: Type inference failed for: r2v586 */
    /* JADX WARN: Type inference failed for: r2v587 */
    /* JADX WARN: Type inference failed for: r2v588 */
    /* JADX WARN: Type inference failed for: r2v589 */
    /* JADX WARN: Type inference failed for: r2v590 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v474 */
    /* JADX WARN: Type inference failed for: r4v475 */
    /* JADX WARN: Type inference failed for: r4v486 */
    /* JADX WARN: Type inference failed for: r4v487 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v196 */
    /* JADX WARN: Type inference failed for: r5v318 */
    /* JADX WARN: Type inference failed for: r5v426 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v460 */
    /* JADX WARN: Type inference failed for: r7v461 */
    /* JADX WARN: Type inference failed for: r7v462 */
    /* JADX WARN: Type inference failed for: r7v463 */
    /* JADX WARN: Type inference failed for: r7v481 */
    /* JADX WARN: Type inference failed for: r7v482 */
    /* JADX WARN: Type inference failed for: r9v249 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.buybundles.activity.SfcDataOnlyBundlesActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$FqhlZL5Mlj4m8fuDXUCDivZk4sU(Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 93;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            initObservers$lambda$0(resource);
            throw null;
        }
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(resource);
        int i3 = equals + 29;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return unitInitObservers$lambda$0;
    }

    static {
        getRequestBeneficiariesState = 0;
        component2();
        component3();
        int i = component4 + 63;
        getRequestBeneficiariesState = i % 128;
        int i2 = i % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = equals + 9;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        component2 = 6590485209054678121L;
        if (i4 != 0) {
            int i5 = 20 / 0;
        }
        int i6 = i3 + 125;
        equals = i6 % 128;
        int i7 = i6 % 2;
    }

    static void component2() {
        ShareDataUIState = new char[]{30516, 30507, 30513, 30503, 30506, 30508, 30699, 30502, 30661, 30518, 30512, 30501, 30676, 30497, 30499, 30492, 30657, 30509, 30496, 30505, 30687, 30698, 30691, 30688, 30685, 30690, 30694, 30515, 30689, 30692, 30695, 30519, 30514, 30500, 30504, 30662, 30678, 30510, 30663, 30684, 30693};
        component3 = 321288085;
        copydefault = true;
        component1 = true;
        getAsAtTimestamp = -890926565;
    }
}
