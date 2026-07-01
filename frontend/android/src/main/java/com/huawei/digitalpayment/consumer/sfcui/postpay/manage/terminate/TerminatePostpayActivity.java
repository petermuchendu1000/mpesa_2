package com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.constant.CacheConstants;
import com.google.common.base.Ascii;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityBaseComposeBinding;
import com.huawei.digitalpayment.consumer.sfcui.buybundles.catalog.GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1;
import com.huawei.digitalpayment.consumer.sfcui.constants.PostpayConstants;
import com.huawei.digitalpayment.consumer.sfcui.postpay.PostpayViewModel;
import com.huawei.payment.mvvm.Resource;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.getActiveNotifications;
import kotlin.getSmallIconId;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u00020*H\u0014J\u0012\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020,H\u0002J\b\u00100\u001a\u00020,H\u0002J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020,H\u0002J\u0012\u00103\u001a\u00020,2\b\u00104\u001a\u0004\u0018\u00010\u000fH\u0014R+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010%\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010\u0012\"\u0004\b'\u0010\u0014¨\u00066"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/terminate/TerminatePostpayActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityBaseComposeBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/PostpayViewModel;", "<init>", "()V", "<set-?>", "Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/terminate/TerminatePostpayActivity$TerminatePostpayStep;", "currentStep", "getCurrentStep", "()Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/terminate/TerminatePostpayActivity$TerminatePostpayStep;", "setCurrentStep", "(Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/terminate/TerminatePostpayActivity$TerminatePostpayStep;)V", "currentStep$delegate", "Landroidx/compose/runtime/MutableState;", "", "postpayPlan", "getPostpayPlan", "()Ljava/lang/String;", "setPostpayPlan", "(Ljava/lang/String;)V", "postpayPlan$delegate", "", "outstandingBill", "getOutstandingBill", "()F", "setOutstandingBill", "(F)V", "outstandingBill$delegate", "Landroidx/compose/runtime/MutableFloatState;", "", "transactionSuccess", "getTransactionSuccess", "()Z", "setTransactionSuccess", "(Z)V", "transactionSuccess$delegate", "transactionMessage", "getTransactionMessage", "setTransactionMessage", "transactionMessage$delegate", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObservers", "setupCompose", "navigateBack", "executeTerminatePostpay", "initToolbar", "title", "TerminatePostpayStep", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class TerminatePostpayActivity extends Hilt_TerminatePostpayActivity<ActivityBaseComposeBinding, PostpayViewModel> {
    public static final int $stable = 0;
    private static int ShareDataUIState;
    private static int[] component1;
    private static int component2;
    private static int component3;
    private static byte[] copydefault;
    private static short[] getAsAtTimestamp;
    private static int getRequestBeneficiariesState;
    private static final byte[] $$l = {Ascii.ETB, -38, -83, 70};
    private static final int $$o = 181;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {84, 79, Ascii.SYN, 41, 5, 6, -7, -2, 6, Ascii.VT, -73, TarHeader.LF_FIFO, 13, 4, -2, 7, 0, -10, 6, -8, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, TarHeader.LF_CONTIG, 2, -2, 20, -13, -56, 60, 6, 7, -14, Ascii.SO, -3, -12, Ascii.FF, -61, Ascii.ETB, 34, -2, 20, -13, -35, 45, 4, -2, 7, 0, -10, 6, -8, -27, 38, -7, 10, -37, 37, 4, -3, -71, TarHeader.LF_NORMAL, Ascii.SYN, -6, Ascii.DC2, -12, -32, Ascii.RS, 20, -18, -11, -11, Ascii.VT, 34, -18, 20, -14, 13, -1, 4, 0, 0, -8, 10, 7, -65, 13, -1, 4, 0, 0, -8, 10, 7, -64, 13, -1, -62, 71, -17, 20, -5, 0, 2, -1, 3, -64, 73, -12, -3, 19, -6, -14, 7, -1, Ascii.SO, -13, Ascii.FF, 6, 0, -9, 6, -9, 6, -5, -1, 20, -4, 4, -67, 37, -45, 73, -10, Ascii.EM, -9, 7, 0, 13, 2, 10, -20, 2, 2, -4, Ascii.NAK, -8, 9};
    private static final int $$k = 147;
    private static final byte[] $$d = {TarHeader.LF_SYMLINK, -82, -81, 124, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 28;
    private static int equals = 0;
    private static int copy = 0;
    private static int component4 = 1;

    private final MutableState currentStep = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(TerminatePostpayStep.INITIAL_WARNING, null, 2, null);

    private final MutableState postpayPlan = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    private final MutableFloatState outstandingBill = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    private final MutableState transactionSuccess = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);

    private final MutableState transactionMessage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        private static int ShareDataUIState = 1;
        private static int copydefault;

        static {
            int[] iArr = new int[TerminatePostpayStep.values().length];
            try {
                iArr[TerminatePostpayStep.BILL_WARNING.ordinal()] = 1;
                int i = ShareDataUIState + 43;
                copydefault = i % 128;
                int i2 = i % 2;
                int i3 = 2 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TerminatePostpayStep.CONFIRMATION.ordinal()] = 2;
                int i4 = copydefault + 111;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                int i6 = 2 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.$$l
            int r8 = r8 * 3
            int r8 = r8 + 1
            int r9 = r9 + 104
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.$$r(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 83
            int r0 = 28 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.$$d
            int r7 = 99 - r7
            byte[] r0 = new byte[r0]
            int r6 = 27 - r6
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2c:
            int r7 = r7 + r4
            int r7 = r7 + (-8)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.h(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = 137 - r5
            int r7 = r7 * 8
            int r7 = 107 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.$$j
            int r1 = r6 + 10
            byte[] r1 = new byte[r1]
            int r6 = r6 + 9
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r7 = r6
            r3 = r2
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
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.i(int, byte, byte, java.lang.Object[]):void");
    }

    public static final void access$executeTerminatePostpay(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = copy + 71;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        terminatePostpayActivity.executeTerminatePostpay();
        int i4 = copy + 19;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final TerminatePostpayStep access$getCurrentStep(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = copy + 21;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        TerminatePostpayStep currentStep = terminatePostpayActivity.getCurrentStep();
        if (i3 == 0) {
            int i4 = 19 / 0;
        }
        return currentStep;
    }

    public static final float access$getOutstandingBill(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = component4 + 93;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            return terminatePostpayActivity.getOutstandingBill();
        }
        terminatePostpayActivity.getOutstandingBill();
        throw null;
    }

    public static final String access$getPostpayPlan(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = copy + 9;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            terminatePostpayActivity.getPostpayPlan();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String postpayPlan = terminatePostpayActivity.getPostpayPlan();
        int i3 = component4 + 125;
        copy = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 71 / 0;
        }
        return postpayPlan;
    }

    public static final String access$getTransactionMessage(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = component4 + 9;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String transactionMessage = terminatePostpayActivity.getTransactionMessage();
        int i4 = component4 + 91;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return transactionMessage;
        }
        throw null;
    }

    public static final boolean access$getTransactionSuccess(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = component4 + 87;
        copy = i2 % 128;
        int i3 = i2 % 2;
        boolean transactionSuccess = terminatePostpayActivity.getTransactionSuccess();
        if (i3 != 0) {
            int i4 = 70 / 0;
        }
        int i5 = copy + 51;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return transactionSuccess;
    }

    public static final void access$navigateBack(TerminatePostpayActivity terminatePostpayActivity) {
        int i = 2 % 2;
        int i2 = copy + 39;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        terminatePostpayActivity.navigateBack();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = component4 + 93;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$setCurrentStep(TerminatePostpayActivity terminatePostpayActivity, TerminatePostpayStep terminatePostpayStep) {
        int i = 2 % 2;
        int i2 = copy + 121;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        terminatePostpayActivity.setCurrentStep(terminatePostpayStep);
        int i4 = component4 + 49;
        copy = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/postpay/manage/terminate/TerminatePostpayActivity$TerminatePostpayStep;", "", "<init>", "(Ljava/lang/String;I)V", "INITIAL_WARNING", "BILL_WARNING", "CONFIRMATION", "TRANSACTION_COMPLETE", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TerminatePostpayStep {
        private static final EnumEntries $ENTRIES;
        private static final TerminatePostpayStep[] $VALUES;
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        private static int component2 = 1;
        private static int copydefault;
        public static final TerminatePostpayStep INITIAL_WARNING = new TerminatePostpayStep("INITIAL_WARNING", 0);
        public static final TerminatePostpayStep BILL_WARNING = new TerminatePostpayStep("BILL_WARNING", 1);
        public static final TerminatePostpayStep CONFIRMATION = new TerminatePostpayStep("CONFIRMATION", 2);
        public static final TerminatePostpayStep TRANSACTION_COMPLETE = new TerminatePostpayStep("TRANSACTION_COMPLETE", 3);

        private TerminatePostpayStep(String str, int i) {
        }

        static {
            TerminatePostpayStep[] terminatePostpayStepArr$values = $values();
            $VALUES = terminatePostpayStepArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(terminatePostpayStepArr$values);
            int i = component2 + 7;
            ShareDataUIState = i % 128;
            int i2 = i % 2;
        }

        public static TerminatePostpayStep valueOf(String str) {
            int i = 2 % 2;
            int i2 = copydefault + 45;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return (TerminatePostpayStep) Enum.valueOf(TerminatePostpayStep.class, str);
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public static TerminatePostpayStep[] values() {
            int i = 2 % 2;
            int i2 = copydefault + 25;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return (TerminatePostpayStep[]) $VALUES.clone();
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final TerminatePostpayStep[] $values() {
            int i = 2 % 2;
            int i2 = copydefault + 79;
            int i3 = i2 % 128;
            component1 = i3;
            int i4 = i2 % 2;
            TerminatePostpayStep[] terminatePostpayStepArr = {INITIAL_WARNING, BILL_WARNING, CONFIRMATION, TRANSACTION_COMPLETE};
            int i5 = i3 + 59;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return terminatePostpayStepArr;
            }
            throw null;
        }

        public static EnumEntries<TerminatePostpayStep> getEntries() {
            int i = 2 % 2;
            int i2 = copydefault;
            int i3 = i2 + 37;
            component1 = i3 % 128;
            int i4 = i3 % 2;
            EnumEntries<TerminatePostpayStep> enumEntries = $ENTRIES;
            int i5 = i2 + 113;
            component1 = i5 % 128;
            int i6 = i5 % 2;
            return enumEntries;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_base_compose;
        if (i3 != 0) {
            return i4;
        }
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;
            final TerminatePostpayActivity component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                copydefault = i2 % 128;
                Composer composer2 = composer;
                Integer num2 = num;
                if (i2 % 2 != 0) {
                    ShareDataUIState(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }
                ShareDataUIState(composer2, num2.intValue());
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit copydefault(TerminatePostpayActivity terminatePostpayActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                terminatePostpayActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 119;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 95;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Unit unit2 = Unit.INSTANCE;
                int i3 = copydefault + 39;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                return unit2;
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C0284copydefault implements Function2<Composer, Integer, Unit> {
                private static int component3 = 0;
                private static int copydefault = 1;
                final TerminatePostpayActivity component2;

                public static Object component2(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
                    int i7 = ~i3;
                    int i8 = ~(i4 | i7);
                    int i9 = i2 | i8;
                    int i10 = ~i2;
                    int i11 = i8 | (~(i7 | i10));
                    int i12 = (~(i7 | i2)) | (~(i10 | i3));
                    int i13 = i3 + i2 + i + (513088896 * i6) + ((-1342203445) * i5);
                    int i14 = i13 * i13;
                    int i15 = (665020156 * i3) + 661520384 + (1303681286 * i2) + ((-638661130) * i9) + (638661130 * i11) + (319330565 * i12) + (984350720 * i) + ((-771751936) * i6) + (1382285312 * i5) + ((-350355456) * i14);
                    int i16 = ((i3 * (-363642324)) - 614971735) + (i2 * (-363641282)) + (i9 * (-1042)) + (i11 * 1042) + (i12 * 521) + (i * (-363641803)) + (i6 * (-2127225984)) + (i5 * (-1080704249)) + (i14 * (-1523187712));
                    return i15 + ((i16 * i16) * (-227409920)) != 1 ? component3(objArr) : ShareDataUIState(objArr);
                }

                @Override
                public Unit invoke(Composer composer, Integer num) {
                    int i = 2 % 2;
                    int i2 = copydefault + 89;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState(composer, num.intValue());
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        return unit;
                    }
                    throw null;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0152  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void ShareDataUIState(androidx.compose.runtime.Composer r17, int r18) {
                    /*
                        Method dump skipped, instruction units count: 371
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                private static final kotlin.Unit getAsAtTimestamp(com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity r3) {
                    /*
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.component3
                        int r1 = r1 + 77
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.copydefault = r2
                        int r1 = r1 % r0
                        java.lang.String r2 = ""
                        if (r1 != 0) goto L1e
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                        float r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.access$getOutstandingBill(r3)
                        r2 = 1073741824(0x40000000, float:2.0)
                        int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                        if (r1 <= 0) goto L36
                        goto L2a
                    L1e:
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r2)
                        float r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.access$getOutstandingBill(r3)
                        r2 = 0
                        int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                        if (r1 <= 0) goto L36
                    L2a:
                        int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.component3
                        int r1 = r1 + 21
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.copydefault = r2
                        int r1 = r1 % r0
                        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.BILL_WARNING
                        goto L38
                    L36:
                        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.CONFIRMATION
                    L38:
                        com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.access$setCurrentStep(r3, r0)
                        kotlin.Unit r3 = kotlin.Unit.INSTANCE
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.C0284copydefault.getAsAtTimestamp(com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity):kotlin.Unit");
                }

                private static final Unit getRequestBeneficiariesState(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 95;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                    TerminatePostpayActivity.access$setCurrentStep(terminatePostpayActivity, TerminatePostpayStep.CONFIRMATION);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component3 + 63;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return unit;
                }

                private static final Unit copy(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = component3 + 65;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                    TerminatePostpayActivity.access$executeTerminatePostpay(terminatePostpayActivity);
                    Unit unit = Unit.INSTANCE;
                    int i4 = copydefault + 117;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unit;
                    }
                    throw null;
                }

                private static final Unit getSponsorBeneficiariesState(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = component3 + 33;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                        TerminatePostpayActivity.access$setCurrentStep(terminatePostpayActivity, TerminatePostpayStep.INITIAL_WARNING);
                        return Unit.INSTANCE;
                    }
                    Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                    TerminatePostpayActivity.access$setCurrentStep(terminatePostpayActivity, TerminatePostpayStep.INITIAL_WARNING);
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }

                private static Object component3(Object[] objArr) {
                    TerminatePostpayActivity terminatePostpayActivity = (TerminatePostpayActivity) objArr[0];
                    int i = 2 % 2;
                    int i2 = component3 + 111;
                    copydefault = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                        terminatePostpayActivity.finish();
                        return Unit.INSTANCE;
                    }
                    Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                    terminatePostpayActivity.finish();
                    Unit unit = Unit.INSTANCE;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static final Unit component4(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 11;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                        TerminatePostpayActivity.access$navigateBack(terminatePostpayActivity);
                        Unit unit = Unit.INSTANCE;
                        throw null;
                    }
                    Intrinsics.checkNotNullParameter(terminatePostpayActivity, "");
                    TerminatePostpayActivity.access$navigateBack(terminatePostpayActivity);
                    Unit unit2 = Unit.INSTANCE;
                    int i3 = component3 + 33;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return unit2;
                }

                public static Unit copydefault(TerminatePostpayActivity terminatePostpayActivity) {
                    int iCopydefault = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault2 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault3 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    return (Unit) component2(iCopydefault2, -1607190856, 1607190857, iCopydefault, GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault(), iCopydefault3, new Object[]{terminatePostpayActivity});
                }

                public static Unit component1(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 117;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Unit requestBeneficiariesState = getRequestBeneficiariesState(terminatePostpayActivity);
                    if (i3 != 0) {
                        int i4 = 37 / 0;
                    }
                    int i5 = component3 + 97;
                    copydefault = i5 % 128;
                    int i6 = i5 % 2;
                    return requestBeneficiariesState;
                }

                public static Unit component3(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 69;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        getSponsorBeneficiariesState(terminatePostpayActivity);
                        throw null;
                    }
                    Unit sponsorBeneficiariesState = getSponsorBeneficiariesState(terminatePostpayActivity);
                    int i3 = component3 + 55;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return sponsorBeneficiariesState;
                }

                public static Unit component2(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 109;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Unit unitComponent4 = component4(terminatePostpayActivity);
                    int i4 = copydefault + 7;
                    component3 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return unitComponent4;
                    }
                    throw null;
                }

                public static Unit ShareDataUIState(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = component3 + 117;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    int iCopydefault = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault2 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault3 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    Unit unit = (Unit) component2(iCopydefault2, 770376170, -770376170, iCopydefault, GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault(), iCopydefault3, new Object[]{terminatePostpayActivity});
                    int i4 = component3 + 5;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 32 / 0;
                    }
                    return unit;
                }

                public static Unit equals(TerminatePostpayActivity terminatePostpayActivity) {
                    int i = 2 % 2;
                    int i2 = component3 + 3;
                    copydefault = i2 % 128;
                    if (i2 % 2 == 0) {
                        copy(terminatePostpayActivity);
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Unit unitCopy = copy(terminatePostpayActivity);
                    int i3 = component3 + 109;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    return unitCopy;
                }

                C0284copydefault(TerminatePostpayActivity terminatePostpayActivity) {
                    this.component2 = terminatePostpayActivity;
                }

                private static final Unit hashCode(TerminatePostpayActivity terminatePostpayActivity) {
                    int iCopydefault = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault2 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    int iCopydefault3 = GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault();
                    return (Unit) component2(iCopydefault2, 770376170, -770376170, iCopydefault, GroupedBundlesCatalogKt$GroupedBundlesCatalogPreview$1$$ExternalSyntheticLambda1.copydefault(), iCopydefault3, new Object[]{terminatePostpayActivity});
                }

                private static Object ShareDataUIState(Object[] objArr) {
                    TerminatePostpayActivity terminatePostpayActivity = (TerminatePostpayActivity) objArr[0];
                    int i = 2 % 2;
                    int i2 = copydefault + 91;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Unit asAtTimestamp = getAsAtTimestamp(terminatePostpayActivity);
                    int i4 = component3 + 89;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return asAtTimestamp;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ShareDataUIState(androidx.compose.runtime.Composer r25, int r26) {
                /*
                    Method dump skipped, instruction units count: 487
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copydefault.AnonymousClass2.ShareDataUIState(androidx.compose.runtime.Composer, int):void");
            }

            public static Unit component3() {
                int i = 2 % 2;
                int i2 = copydefault + 109;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault();
                int i4 = ShareDataUIState + 7;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitCopydefault;
            }

            public static Unit component3(TerminatePostpayActivity terminatePostpayActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 105;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return copydefault(terminatePostpayActivity);
                }
                copydefault(terminatePostpayActivity);
                throw null;
            }

            AnonymousClass2(TerminatePostpayActivity terminatePostpayActivity) {
                this.component3 = terminatePostpayActivity;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 11;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                throw null;
            }
            int i4 = copydefault + 125;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 16 / 0;
            }
            return unit;
        }

        public final void component2(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = ShareDataUIState;
            int i4 = i3 + 79;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            if ((i & 11) == 2) {
                int i6 = i3 + 109;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i8 = ShareDataUIState + 71;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1221730654, true, new AnonymousClass2(TerminatePostpayActivity.this), composer, 54), composer, 1572864, 63);
        }

        copydefault() {
        }
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int length2;
        int[] iArr3;
        int i3 = 2;
        int i4 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr4 = component1;
        char c2 = '0';
        int i5 = 684241640;
        int i6 = 1;
        int i7 = 0;
        if (iArr4 != null) {
            int i8 = $11 + 69;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            } else {
                length2 = iArr4.length;
                iArr3 = new int[length2];
            }
            int i9 = 0;
            while (i9 < length2) {
                int i10 = $11 + 57;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr4[i9])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i5);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4439 - AndroidCharacter.getMirror(c2), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 37, (char) Gravity.getAbsoluteGravity(0, 0), -309236339, false, $$r(b2, b3, (byte) (b3 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                    i9++;
                    int i12 = $10 + 1;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = 2;
                    c2 = '0';
                    i5 = 684241640;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr4 = iArr3;
        }
        int length3 = iArr4.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = component1;
        if (iArr6 != null) {
            int i14 = $11 + 93;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr6[i2]);
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) i7;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - ExpandableListView.getPackedPositionGroup(0L), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37, (char) (ViewConfiguration.getLongPressTimeout() >> 16), -309236339, false, $$r(b4, b5, (byte) (b5 + 2)), new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i2++;
                    i6 = 1;
                    i7 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        int i15 = i7;
        System.arraycopy(iArr6, i15, iArr5, i15, length3);
        getactivenotifications.component1 = i15;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i15] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr5);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                int i18 = $10 + 65;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                getactivenotifications.ShareDataUIState ^= iArr5[i16];
                Object[] objArr4 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                if (objCopydefault3 == null) {
                    byte b6 = (byte) 0;
                    byte b7 = b6;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2968 - KeyEvent.normalizeMetaState(0), 16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (49870 - TextUtils.lastIndexOf("", '0', 0, 0)), 462826032, false, $$r(b6, b7, b7), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                getactivenotifications.component2 = iIntValue;
                i16++;
            }
            int i20 = getactivenotifications.ShareDataUIState;
            getactivenotifications.ShareDataUIState = getactivenotifications.component2;
            getactivenotifications.component2 = i20;
            getactivenotifications.component2 ^= iArr5[16];
            getactivenotifications.ShareDataUIState ^= iArr5[17];
            int i21 = getactivenotifications.ShareDataUIState;
            int i22 = getactivenotifications.component2;
            cArr[0] = (char) (getactivenotifications.ShareDataUIState >>> 16);
            cArr[1] = (char) getactivenotifications.ShareDataUIState;
            cArr[2] = (char) (getactivenotifications.component2 >>> 16);
            cArr[3] = (char) getactivenotifications.component2;
            getActiveNotifications.component2(iArr5);
            cArr2[getactivenotifications.component1 * 2] = cArr[0];
            cArr2[(getactivenotifications.component1 * 2) + 1] = cArr[1];
            cArr2[(getactivenotifications.component1 * 2) + 2] = cArr[2];
            cArr2[(getactivenotifications.component1 * 2) + 3] = cArr[3];
            Object[] objArr5 = {getactivenotifications, getactivenotifications};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault4 == null) {
                byte b8 = (byte) 0;
                byte b9 = b8;
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 2944, (Process.myTid() >> 22) + 24, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 27638), -1616366948, false, $$r(b8, b9, (byte) (b9 + 3)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
            i15 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TerminatePostpayStep getCurrentStep() {
        int i = 2 % 2;
        int i2 = component4 + 19;
        copy = i2 % 128;
        int i3 = i2 % 2;
        TerminatePostpayStep terminatePostpayStep = (TerminatePostpayStep) this.currentStep.getValue();
        int i4 = component4 + 1;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 86 / 0;
        }
        return terminatePostpayStep;
    }

    private final void setCurrentStep(TerminatePostpayStep terminatePostpayStep) {
        int i = 2 % 2;
        int i2 = component4 + 115;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.currentStep.setValue(terminatePostpayStep);
            int i3 = copy + 47;
            component4 = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        this.currentStep.setValue(terminatePostpayStep);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getPostpayPlan() {
        int i = 2 % 2;
        int i2 = component4 + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        String str = (String) this.postpayPlan.getValue();
        int i4 = copy + 123;
        component4 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    private final void setPostpayPlan(String str) {
        int i = 2 % 2;
        int i2 = component4 + 63;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            this.postpayPlan.setValue(str);
        } else {
            this.postpayPlan.setValue(str);
            throw null;
        }
    }

    private final float getOutstandingBill() {
        int i = 2 % 2;
        int i2 = copy + 75;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.outstandingBill.getFloatValue();
        }
        this.outstandingBill.getFloatValue();
        throw null;
    }

    private final void setOutstandingBill(float f) {
        int i = 2 % 2;
        int i2 = copy + 5;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            this.outstandingBill.setFloatValue(f);
        } else {
            this.outstandingBill.setFloatValue(f);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getTransactionSuccess() {
        int i = 2 % 2;
        int i2 = component4 + 31;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            boolean zBooleanValue = ((Boolean) this.transactionSuccess.getValue()).booleanValue();
            int i3 = component4 + 53;
            copy = i3 % 128;
            int i4 = i3 % 2;
            return zBooleanValue;
        }
        ((Boolean) this.transactionSuccess.getValue()).booleanValue();
        throw null;
    }

    private final void setTransactionSuccess(boolean z) {
        int i = 2 % 2;
        int i2 = copy + 109;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            this.transactionSuccess.setValue(Boolean.valueOf(z));
            int i3 = component4 + 23;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        this.transactionSuccess.setValue(Boolean.valueOf(z));
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getTransactionMessage() {
        int i = 2 % 2;
        int i2 = copy + 69;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 75 / 0;
            return (String) this.transactionMessage.getValue();
        }
        return (String) this.transactionMessage.getValue();
    }

    private final void setTransactionMessage(String str) {
        int i = 2 % 2;
        int i2 = copy + 111;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            this.transactionMessage.setValue(str);
        } else {
            this.transactionMessage.setValue(str);
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static short[] copy;
        private final Function1 copydefault;
        private static final byte[] $$c = {69, -38, -90, 81};
        private static final int $$d = 29;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {69, 81, 99, -123, 38, 10, 34, 4, -16, 46, 36, -2, 5, 5, Ascii.ESC, TarHeader.LF_SYMLINK, -2, 36, 2, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -50, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -49, Ascii.GS, Ascii.SI, 20, Ascii.DLE, Ascii.DLE, 8, Ascii.SUB, Ascii.ETB, -48};
        private static final int $$b = 99;
        private static int getRequestBeneficiariesState = 0;
        private static int component4 = 1;
        private static int ShareDataUIState = 1790485101;
        private static int component3 = -238323879;
        private static int component1 = -1693006175;
        private static byte[] component2 = {-113, -3, -23, -26, -36, -117, -3, -108, -28, -17, -37, -40, -82, -7, 36, -65, -18, -17, -32, -13, -21, -16, -74, -1, -53, -6, -49, -64, -13, -40, -27, -12, -7, -56, -60, -6, -52};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.String $$e(byte r5, byte r6, int r7) {
            /*
                int r6 = r6 * 2
                int r0 = r6 + 1
                int r5 = r5 + 4
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.$$c
                int r7 = r7 + 112
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L12
                r4 = r6
                r3 = r2
                goto L24
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r7
                r0[r3] = r4
                int r5 = r5 + 1
                if (r3 != r6) goto L20
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L20:
                int r3 = r3 + 1
                r4 = r1[r5]
            L24:
                int r4 = -r4
                int r7 = r7 + r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.$$e(byte, byte, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static void a(byte r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r5 = r5 * 6
                int r0 = 16 - r5
                int r6 = r6 * 3
                int r6 = 36 - r6
                int r7 = r7 * 16
                int r7 = 99 - r7
                byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.$$a
                byte[] r0 = new byte[r0]
                int r5 = 15 - r5
                r2 = 0
                if (r1 != 0) goto L19
                r3 = r7
                r4 = r2
                r7 = r5
                goto L2d
            L19:
                r3 = r2
            L1a:
                byte r4 = (byte) r7
                int r6 = r6 + 1
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r5) goto L2b
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                r8[r2] = r5
                return
            L2b:
                r3 = r1[r6]
            L2d:
                int r7 = r7 + r3
                int r7 = r7 + (-17)
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.a(byte, short, short, java.lang.Object[]):void");
        }

        public final int hashCode() throws Throwable {
            Object[] objArr;
            int i = 2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
            if (objCopydefault == null) {
                int i2 = 999 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int gidForName = 30 - Process.getGidForName("");
                char c2 = (char) (61686 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                byte b2 = (byte) 0;
                byte b3 = (byte) (b2 | Ascii.VT);
                Object[] objArr2 = new Object[1];
                a(b2, b3, (byte) (b3 & 5), objArr2);
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(i2, gidForName, c2, -1638177773, false, (String) objArr2[0], null);
            }
            long j = ((Field) objCopydefault).getLong(null);
            Object[] objArr3 = new Object[1];
            b((short) (53 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1686907580, (-113) - View.MeasureSpec.getSize(0), TextUtils.lastIndexOf("", '0') - 1792913702, objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((short) (TextUtils.indexOf("", "", 0, 0) + 34), (byte) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1686907602, (-114) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (-1792913698) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr4);
            long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
            if (objCopydefault2 == null) {
                int i3 = 1000 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                int i4 = 32 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 61685);
                byte b4 = (byte) ($$b & 5);
                Object[] objArr5 = new Object[1];
                a(b4, (byte) (b4 + 5), (byte) 0, objArr5);
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i3, i4, keyRepeatTimeout, 1267259187, false, (String) objArr5[0], null);
            }
            if (j == ((jLongValue - ((((Field) objCopydefault2).getLong(null) << 52) >>> 52)) >> 12)) {
                int i5 = component4 + 99;
                getRequestBeneficiariesState = i5 % 128;
                int i6 = i5 % 2;
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                if (objCopydefault3 == null) {
                    int offsetAfter = 999 - TextUtils.getOffsetAfter("", 0);
                    int i7 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 30;
                    char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 61685);
                    byte b5 = (byte) ($$b & 5);
                    byte b6 = (byte) (b5 + 2);
                    Object[] objArr6 = new Object[1];
                    a(b5, b6, (byte) (b6 - 3), objArr6);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, i7, deadChar, 1267122354, false, (String) objArr6[0], null);
                }
                Object[] objArr7 = (Object[]) ((Field) objCopydefault3).get(null);
                objArr = new Object[]{new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i8 = ((int[]) objArr7[2])[0];
                int i9 = ((int[]) objArr7[1])[0];
                int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                int i10 = ~iElapsedRealtime;
                int i11 = (-1118245437) + (((~((-714166772) | i10)) | (~((-35306623) | iElapsedRealtime))) * (-370)) + (((~(iElapsedRealtime | (-714166772))) | (~(i10 | (-35306623))) | (-714866176)) * (-370)) + 1131942643;
                int i12 = (i11 << 13) ^ i11;
                int i13 = i12 ^ (i12 >>> 17);
                ((int[]) objArr[3])[0] = i13 ^ (i13 << 5);
            } else {
                try {
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1123955845);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2217, 45 - ExpandableListView.getPackedPositionType(0L), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), -2019038240, false, null, new Class[0]);
                    }
                    Object[] objArr8 = {null, ((Constructor) objCopydefault4).newInstance(null), -655544589, 1};
                    Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-44327625);
                    if (objCopydefault5 == null) {
                        int iAxisFromString = MotionEvent.axisFromString("") + 1000;
                        int iRgb = Color.rgb(0, 0, 0) + 16777247;
                        char c3 = (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 61685);
                        byte b7 = (byte) ($$b & 5);
                        byte b8 = (byte) (b7 - 1);
                        Object[] objArr9 = new Object[1];
                        a(b7, b8, b8, objArr9);
                        objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(iAxisFromString, iRgb, c3, 939672146, false, (String) objArr9[0], new Class[]{(Class) ITrustedWebActivityCallbackDefault.copydefault(1031 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, (char) (ViewConfiguration.getTouchSlop() >> 8)), (Class) ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1073, MotionEvent.axisFromString("") + 44, (char) (33532 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))), Integer.TYPE, Integer.TYPE});
                    }
                    Object[] objArr10 = (Object[]) ((Method) objCopydefault5).invoke(null, objArr8);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1897979945);
                    if (objCopydefault6 == null) {
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 999;
                        int i14 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31;
                        char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 61685);
                        byte b9 = (byte) ($$b & 5);
                        byte b10 = (byte) (b9 + 2);
                        Object[] objArr11 = new Object[1];
                        a(b9, b10, (byte) (b10 - 3), objArr11);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(maximumFlingVelocity, i14, maxKeyCode, 1267122354, false, (String) objArr11[0], null);
                    }
                    ((Field) objCopydefault6).set(null, objArr10);
                    try {
                        Object[] objArr12 = new Object[1];
                        b((short) (52 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((-1) - MotionEvent.axisFromString("")), 1686907580 + (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 114, (-1792913703) - View.MeasureSpec.getMode(0), objArr12);
                        Class<?> cls2 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        b((short) (34 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) View.MeasureSpec.makeMeasureSpec(0, 0), 1686907602 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 114, (-1792913699) - TextUtils.indexOf("", "", 0, 0), objArr13);
                        long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr13[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(-1898903466);
                        if (objCopydefault7 == null) {
                            int iRed = 999 - Color.red(0);
                            int iRed2 = Color.red(0) + 31;
                            char c4 = (char) (61685 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                            byte b11 = (byte) ($$b & 5);
                            Object[] objArr14 = new Object[1];
                            a(b11, (byte) (b11 + 5), (byte) 0, objArr14);
                            objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iRed, iRed2, c4, 1267259187, false, (String) objArr14[0], null);
                        }
                        ((Field) objCopydefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1526905718);
                        if (objCopydefault8 == null) {
                            int i15 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 999;
                            int iRgb2 = (-16777185) - Color.rgb(0, 0, 0);
                            char c5 = (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 61684);
                            byte b12 = (byte) 0;
                            byte b13 = (byte) (b12 | Ascii.VT);
                            Object[] objArr15 = new Object[1];
                            a(b12, b13, (byte) (b13 & 5), objArr15);
                            objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(i15, iRgb2, c5, -1638177773, false, (String) objArr15[0], null);
                        }
                        ((Field) objCopydefault8).set(null, lValueOf2);
                        objArr = objArr10;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            int i16 = ((int[]) objArr[1])[0];
            int i17 = ((int[]) objArr[2])[0];
            if (i17 == i16) {
                Object[] objArr16 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                int i20 = ((int[]) objArr[1])[0];
                int i21 = (~System.identityHashCode(this)) | 837458961;
                int i22 = i18 + (-380821408) + (i21 * 495) + (((~i21) | 817893376) * 495);
                int i23 = (i22 << 13) ^ i22;
                int i24 = i23 ^ (i23 >>> 17);
                ((int[]) objArr16[3])[0] = i24 ^ (i24 << 5);
                Object[] objArr17 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i25 = ((int[]) objArr16[3])[0];
                int i26 = ((int[]) objArr16[2])[0];
                int i27 = ((int[]) objArr16[1])[0];
                int iNextInt = new Random().nextInt();
                int i28 = ~iNextInt;
                int i29 = (~(211695130 | i28)) | (-1037989535) | (~(961168524 | i28));
                int i30 = i25 + 249651599 + (((~(iNextInt | (-134874121))) | i29) * 590) + (i29 * (-1180)) + (((~((-961168525) | i28)) | (~(i28 | (-211695131)))) * 590);
                int i31 = (i30 << 13) ^ i30;
                int i32 = i31 ^ (i31 >>> 17);
                ((int[]) objArr17[3])[0] = i32 ^ (i32 << 5);
            } else {
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) objArr[0];
                if (strArr != null) {
                    int i33 = 0;
                    while (i33 < strArr.length) {
                        int i34 = component4 + 39;
                        getRequestBeneficiariesState = i34 % 128;
                        if (i34 % 2 != 0) {
                            arrayList.add(strArr[i33]);
                            i33 += 123;
                        } else {
                            arrayList.add(strArr[i33]);
                            i33++;
                        }
                    }
                }
                long j2 = -1;
                long j3 = ((long) (i16 ^ i17)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                long j4 = 0;
                long j5 = j3 | (((long) 11) << 32) | (j4 - ((j4 >> 63) << 32));
                Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault9 == null) {
                    objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getPressedStateDuration() >> 16) + 6618, 42 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) TextUtils.getCapsMode("", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault9).invoke(null, null);
                Object[] objArr18 = {144103337, Long.valueOf(j5), arrayList, null, false, false};
                Object objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                if (objCopydefault10 == null) {
                    objCopydefault10 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6562, 57 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getPressedStateDuration() >> 16), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objCopydefault10).invoke(objInvoke, objArr18);
                Object[] objArr19 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i35 = ((int[]) objArr[3])[0];
                int i36 = ((int[]) objArr[2])[0];
                int i37 = ((int[]) objArr[1])[0];
                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                int i38 = i35 + (-1777111756) + (((-67264513) | startUptimeMillis) * (-627)) + (((~((-408787826) | startUptimeMillis)) | 340685568) * (-627)) + (((~(startUptimeMillis | 340685568)) | (~((~startUptimeMillis) | 408787825))) * 627);
                int i39 = (i38 << 13) ^ i38;
                int i40 = i39 ^ (i39 >>> 17);
                ((int[]) objArr19[3])[0] = i40 ^ (i40 << 5);
                Toast.makeText((Context) null, i17 / (((i17 - 1) * i17) % 2), 0).show();
                Object[] objArr20 = {new String[0], new int[]{i}, new int[]{i}, new int[1]};
                int i41 = ((int[]) objArr19[3])[0];
                int i42 = ((int[]) objArr19[2])[0];
                int i43 = ((int[]) objArr19[1])[0];
                int iIdentityHashCode = System.identityHashCode(this);
                int i44 = ~iIdentityHashCode;
                int i45 = i41 + (-568336747) + (((-134228993) | iIdentityHashCode) * (-676)) + (((~(592957801 | i44)) | 134228992) * 676) + (((~(iIdentityHashCode | 727186793)) | (~(i44 | (-156515593))) | 22286600) * 676);
                int i46 = (i45 << 13) ^ i45;
                int i47 = i46 ^ (i46 >>> 17);
                ((int[]) objArr20[3])[0] = i47 ^ (i47 << 5);
            }
            return iHashCode;
        }

        private static void b(short s, byte b2, int i, int i2, int i3, Object[] objArr) throws Throwable {
            long j;
            boolean z;
            int i4;
            int i5 = 2 % 2;
            getSmallIconId getsmalliconid = new getSmallIconId();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                int i6 = -1;
                if (objCopydefault == null) {
                    byte b3 = (byte) (-1);
                    byte b4 = (byte) (b3 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1000 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), View.MeasureSpec.getSize(0) + 31, (char) (61685 - (ViewConfiguration.getPressedStateDuration() >> 16)), 1874745193, false, $$e(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                int i7 = iIntValue == -1 ? 1 : 0;
                if (i7 == 0) {
                    j = 7083766810336261929L;
                } else {
                    byte[] bArr = component2;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i8 = 0;
                        while (i8 < length) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    byte b5 = (byte) i6;
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2984 - (ViewConfiguration.getTouchSlop() >> 8), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, (char) (54463 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), -1178636483, false, $$e(b5, (byte) (b5 + 1), (byte) $$c.length), new Class[]{Integer.TYPE});
                                }
                                bArr2[i8] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                                i8++;
                                i6 = -1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = component2;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                        if (objCopydefault3 == null) {
                            byte b6 = (byte) (-1);
                            byte b7 = (byte) (b6 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 999, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 31, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 61685), 1874745193, false, $$e(b6, b7, (byte) (b7 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                        j = 7083766810336261929L;
                    } else {
                        j = 7083766810336261929L;
                        iIntValue = (short) (((short) (((long) copy[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                    }
                }
                if (iIntValue > 0) {
                    getsmalliconid.copydefault = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ j)) + i7;
                    Object[] objArr5 = {getsmalliconid, Integer.valueOf(i3), Integer.valueOf(component1), sb};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                    if (objCopydefault4 == null) {
                        byte b8 = (byte) (-1);
                        byte b9 = (byte) (b8 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Color.blue(0) + 1697, TextUtils.indexOf("", "", 0) + 37, (char) View.getDefaultSize(0, 0), -1454191902, false, $$e(b8, b9, b9), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objCopydefault4).invoke(null, objArr5)).append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    byte[] bArr4 = component2;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i9 = 0; i9 < length2; i9++) {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 7083766810336261929L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i10 = $10;
                        int i11 = i10 + 9;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = i10 + 73;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    getsmalliconid.component2 = 1;
                    while (getsmalliconid.component2 < iIntValue) {
                        if (!z) {
                            short[] sArr = copy;
                            getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                            getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r8]) ^ 7083766810336261929L)) + s)) ^ b2));
                        } else {
                            int i15 = $11 + 71;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                byte[] bArr6 = component2;
                                getsmalliconid.copydefault = getsmalliconid.copydefault % 1;
                                i4 = getsmalliconid.component3 - (((byte) (((byte) (((long) bArr6[r8]) | 7083766810336261929L)) << s)) ^ b2);
                            } else {
                                byte[] bArr7 = component2;
                                getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                                i4 = getsmalliconid.component3 + (((byte) (((byte) (((long) bArr7[r8]) ^ 7083766810336261929L)) + s)) ^ b2);
                            }
                            getsmalliconid.component1 = (char) i4;
                        }
                        sb.append(getsmalliconid.component1);
                        getsmalliconid.component3 = getsmalliconid.component1;
                        getsmalliconid.component2++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r4 instanceof androidx.lifecycle.Observer
                if (r1 == 0) goto L26
                int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.component4
                int r1 = r1 + 71
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.getRequestBeneficiariesState = r2
                int r1 = r1 % r0
                boolean r1 = r4 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r1 == 0) goto L26
                r1 = r3
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r4 = (kotlin.jvm.internal.FunctionAdapter) r4
                kotlin.Function r4 = r4.getFunctionDelegate()
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                goto L27
            L26:
                r4 = 0
            L27:
                int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.getRequestBeneficiariesState
                int r1 = r1 + 29
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.component4 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L33
                return r4
            L33:
                r4 = 0
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component4 + 113;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.copydefault;
            if (i3 == 0) {
                return function1;
            }
            throw null;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component4 + 7;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            this.copydefault.invoke(obj);
            int i4 = component4 + 25;
            getRequestBeneficiariesState = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        }
    }

    private static void g(int i, byte b2, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        getSmallIconId getsmalliconid = new getSmallIconId();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(component3)};
            Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
            long j = 0;
            if (objCopydefault == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 998, (Process.myPid() >> 22) + 31, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61684), 1874745193, false, $$r(b3, b4, (byte) (b4 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            int i7 = 3;
            if (!(!z2)) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = copydefault;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $10 + i7;
                        $11 = i10 % 128;
                        if (i10 % i5 == 0) {
                            try {
                                Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                                if (objCopydefault2 == null) {
                                    byte b5 = (byte) 0;
                                    byte b6 = b5;
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(2985 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), 47 - Process.getGidForName(""), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 54462), -1178636483, false, $$r(b5, b6, (byte) (b6 | Ascii.FF)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i9] = ((Byte) ((Method) objCopydefault2).invoke(null, objArr3)).byteValue();
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr[i9])};
                            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2095493208);
                            if (objCopydefault3 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2985 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 48 - View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54462), -1178636483, false, $$r(b7, b8, (byte) (b8 | Ascii.FF)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objCopydefault3).invoke(null, objArr4)).byteValue();
                            i9++;
                        }
                        i5 = 2;
                        j = 0;
                        i7 = 3;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = copydefault;
                    Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(ShareDataUIState)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1427666932);
                    if (objCopydefault4 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "", 0) + 999, 31 - ExpandableListView.getPackedPositionType(0L), (char) (View.getDefaultSize(0, 0) + 61685), 1874745193, false, $$r(b9, b10, (byte) (b10 | 9)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue()]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                } else {
                    iIntValue = (short) (((short) (((long) getAsAtTimestamp[i + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L))]) ^ 7083766810336261929L)) + ((int) (((long) component3) ^ 7083766810336261929L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i + iIntValue) - 2) + ((int) (((long) ShareDataUIState) ^ 7083766810336261929L));
                if (z2) {
                    int i12 = $11 + 65;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                getsmalliconid.copydefault = i11 + i4;
                Object[] objArr6 = {getsmalliconid, Integer.valueOf(i2), Integer.valueOf(component2), sb};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1812665735);
                if (objCopydefault5 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1697 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 38 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), -1454191902, false, $$r(b11, b12, (byte) (b12 | 8)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objCopydefault5).invoke(null, objArr6)).append(getsmalliconid.component1);
                getsmalliconid.component3 = getsmalliconid.component1;
                byte[] bArr4 = copydefault;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7083766810336261929L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 71;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i16 = 5 / 5;
                    }
                    z = true;
                } else {
                    z = false;
                }
                getsmalliconid.component2 = 1;
                while (getsmalliconid.component2 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = copydefault;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((byte) (((byte) (((long) bArr6[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    } else {
                        short[] sArr = getAsAtTimestamp;
                        getsmalliconid.copydefault = getsmalliconid.copydefault - 1;
                        getsmalliconid.component1 = (char) (getsmalliconid.component3 + (((short) (((short) (((long) sArr[r7]) ^ 7083766810336261929L)) + s)) ^ b2));
                    }
                    sb.append(getsmalliconid.component1);
                    getsmalliconid.component3 = getsmalliconid.component1;
                    getsmalliconid.component2++;
                    int i17 = $10 + 11;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        String str = "";
        Object[] objArr2 = new Object[1];
        f(17 - MotionEvent.axisFromString(""), new int[]{-1587589909, 632320587, 389764412, 1355349379, -676656706, 400882428, -702083509, 191514263, -55413767, -1184768393}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(KeyEvent.keyCodeFromString("") + 5, new int[]{2122389168, -770990932, 661102185, 2108487084}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).codePointAt(1) - 89, new int[]{-1587589909, 632320587, 389764412, 1355349379, 578740238, 1522150728, -518409239, 622551792, -699362992, -1909878356, -1221311769, -1961486330, 1488599487, 2055659020}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33344502, (byte) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952781_res_0x7f13048d).substring(14, 15).length() - 961094136, (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954659_res_0x7f130be3).substring(6, 9).codePointAt(0) - 110), (-98) - (Process.myPid() >> 22), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i2 = component4 + 5;
                copy = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) ExpandableListView.getPackedPositionGroup(0L), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(23) - 53, new int[]{549275431, -577481538, 133720355, 214187824, -1302130973, 886791358, -1470875618, -1673761391, 1996712961, 1208450022, -1156308204, 1609402587, 2068556575, -625777836, -910126618, -2103506121, 575061938, 1777571490, 554731261, 2048231404, 625420129, -1500425254, 2019601890, 1386689456}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() + 63, new int[]{21252705, 926476271, -404688434, 1119193470, -1141253106, 1753453097, 1749362655, 524570929, -408120251, -1992375995, 232418229, -1298359998, -1406215561, -652609778, 857963992, 1470996470, -233283909, -1049220678, 820112621, 1254348517, 1588666064, -71862464, -1429974670, -592111114, -1045550709, -1444209389, -423991424, 581614225, 796901884, 1874451219, -2122053991, 1696002932}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((ViewConfiguration.getWindowTouchSlop() >> 8) + 64, new int[]{-1795477842, -574388783, 689403107, 590798172, 1636607296, -1137282828, -270166841, 1203986906, -23940520, 216358545, 1500970512, 1617555738, -336908036, -888758477, -1849246339, 492300721, 1607859468, -2011138211, -1095054392, 2113448333, -1618601097, 352457474, -1844906849, 1681110315, -1705750280, 1764435041, -988216659, 1760371066, -961586673, 626057166, 360208339, 418766937}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(73 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), new int[]{915547266, 682883498, -2000158357, 917305137, -494174952, 819445039, -537798609, 224552584, -729033466, -15375022, -1433007951, -433471853, -669108262, 446531917, -412095066, 1332871626, -12889503, -1903441645, 45040361, 750016546, 1667972340, 267068476, 2083497366, 378579875, 1706810874, -1518409661, 552863943, 2089879936, -291228249, 182386062, 105188510, -872933092, 1166934136, -2071923374, 1405251822, 797011033}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33344520, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 961094177, (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 99, objArr10);
                    String str6 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 69, new int[]{-1334336774, 1170248502, -2131611141, 723795196, -1584753501, -1381976433, 1965488408, 2005424106, -636507764, 656082323, -2072013750, 1994399089, 1252066241, -1742844163, 566053473, -2034904862, -1812486324, 928703423}, objArr11);
                    Object[] objArr12 = {baseContext, str2, str3, str4, str5, true, str6, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 57, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
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
            int i4 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2404;
            int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
            char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
            byte[] bArr = $$d;
            byte b2 = (byte) (-bArr[38]);
            Object[] objArr13 = new Object[1];
            h(b2, (byte) (b2 << 2), (byte) (-bArr[22]), objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4, i5, offsetBefore, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            int i6 = copy + 5;
            component4 = i6 % 128;
            if (i6 % 2 == 0) {
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault4 == null) {
                    Object[] objArr14 = new Object[1];
                    h(r0[95], (byte) ($$e | 65), (byte) (-$$d[22]), objArr14);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2405 - TextUtils.getOffsetAfter("", 0), 26 - Color.red(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 24929979, false, (String) objArr14[0], null);
                }
                objArr = (Object[]) ((Field) objCopydefault4).get(null);
                int i7 = 1 / 0;
            } else {
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int tapTimeout = 2405 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i8 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25;
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1);
                    Object[] objArr15 = new Object[1];
                    h(r0[95], (byte) ($$e | 65), (byte) (-$$d[22]), objArr15);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(tapTimeout, i8, modifierMetaStateMask, 24929979, false, (String) objArr15[0], null);
                }
                objArr = (Object[]) ((Field) objCopydefault5).get(null);
            }
        } else {
            Object[] objArr16 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952720_res_0x7f130450).substring(6, 7).codePointAt(0) - 16, new int[]{-807609499, 1531963942, 669907694, 1600754800, -1900226883, 550171762, -1674885594, -1128220289}, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            f(16 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), new int[]{196542286, -1521073588, 66018902, -1291165712, 1899399722, 1010644061, 670474239, 1434027405}, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, 582750253};
                byte[] bArr2 = $$j;
                Object[] objArr19 = new Object[1];
                i((short) 133, (byte) 63, bArr2[16], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                i((short) (-bArr2[36]), bArr2[16], (byte) (-bArr2[77]), objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault6 == null) {
                    int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2405;
                    int scrollDefaultDelay = 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                    Object[] objArr21 = new Object[1];
                    h(r8[95], (byte) ($$e | 65), (byte) (-$$d[22]), objArr21);
                    objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(keyRepeatTimeout, scrollDefaultDelay, longPressTimeout, 24929979, false, (String) objArr21[0], null);
                }
                ((Field) objCopydefault6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33344526, (byte) View.MeasureSpec.getMode(0), (-961094137) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), (-98) - TextUtils.getOffsetBefore("", 0), objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    g(33344576 - TextUtils.lastIndexOf("", '0'), (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 29), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() - 961094134, (short) TextUtils.getTrimmedLength(""), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952832_res_0x7f1304c0).substring(0, 1).codePointAt(0) - 135, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault7 == null) {
                        int i9 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2405;
                        int mode = View.MeasureSpec.getMode(0) + 26;
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        byte[] bArr3 = $$d;
                        byte b3 = bArr3[33];
                        Object[] objArr24 = new Object[1];
                        h(b3, (byte) (b3 | 84), (byte) (bArr3[9] - 1), objArr24);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(i9, mode, packedPositionType, -1843538389, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault8 == null) {
                        int trimmedLength = 2405 - TextUtils.getTrimmedLength("");
                        int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                        char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                        byte[] bArr4 = $$d;
                        byte b4 = (byte) (-bArr4[38]);
                        Object[] objArr25 = new Object[1];
                        h(b4, (byte) (b4 << 2), (byte) (-bArr4[22]), objArr25);
                        objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(trimmedLength, i10, cResolveSizeAndState, -2047739879, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = copy + 19;
            component4 = i13 % 128;
            int i14 = i13 % 2;
        } else {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault9 == null) {
                objCopydefault9 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getPressedStateDuration() >> 16), 42 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            int i15 = component4 + 69;
            copy = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr26 = {-1976071039, Long.valueOf(j4), arrayList, null, true};
                Class cls6 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - TextUtils.indexOf("", "", 0), 56 - Color.argb(0, 0, 0, 0), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))));
                Object[] objArr27 = new Object[1];
                i((short) 52, r7[16], (byte) (-$$j[77]), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(savedInstanceState);
        getWindow().setGravity(80);
        getWindow().setLayout(-1, -2);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        String stringExtra = getIntent().getStringExtra(PostpayConstants.KEY_POSTPAY_PLAN);
        if (stringExtra == null) {
            int i17 = copy + 77;
            component4 = i17 % 128;
            if (i17 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        } else {
            str = stringExtra;
        }
        setPostpayPlan(str);
        setOutstandingBill(getIntent().getFloatExtra(PostpayConstants.KEY_OUTSTANDING_BILL, 0));
        initObservers();
        setupCompose();
    }

    private final void initObservers() {
        int i = 2 % 2;
        ((PostpayViewModel) this.viewModel).getTerminatePostpay().observe(this, new component2(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 85;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$219ApUjFFlmOB3JWtnxyk0aY6ys = TerminatePostpayActivity.$r8$lambda$219ApUjFFlmOB3JWtnxyk0aY6ys(this.f$0, (Resource) obj);
                int i5 = ShareDataUIState + 45;
                component1 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$219ApUjFFlmOB3JWtnxyk0aY6ys;
            }
        }));
        int i2 = copy + 93;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit initObservers$lambda$0(com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity r3, com.huawei.payment.mvvm.Resource r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            boolean r1 = r4.loading()
            if (r1 == 0) goto L14
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.showLoading(r3)
            goto L74
        L14:
            boolean r1 = r4.success()
            if (r1 == 0) goto L3c
            int r4 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component4
            int r4 = r4 + 97
            int r1 = r4 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copy = r1
            int r4 = r4 % r0
            r4 = r3
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r4)
            r4 = 1
            r3.setTransactionSuccess(r4)
            int r4 = com.huawei.digitalpayment.consumer.sfc.R.string.successful_postpay_termination_transaction_message
            java.lang.String r4 = r3.getString(r4)
            r3.setTransactionMessage(r4)
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r4 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.TRANSACTION_COMPLETE
            r3.setCurrentStep(r4)
            goto L74
        L3c:
            boolean r1 = r4.error()
            if (r1 == 0) goto L74
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component4
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copy = r2
            int r1 = r1 % r0
            r1 = r3
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            com.huawei.digitalpayment.consumer.baselib.util.DialogUtils.hideLoading(r1)
            r1 = 0
            r3.setTransactionSuccess(r1)
            com.huawei.common.exception.BaseException r4 = r4.getException()
            if (r4 == 0) goto L6a
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component4
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copy = r2
            int r1 = r1 % r0
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L6c
        L6a:
            java.lang.String r4 = "Failed to terminate Postpay."
        L6c:
            r3.setTransactionMessage(r4)
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r4 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.TRANSACTION_COMPLETE
            r3.setCurrentStep(r4)
        L74:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.initObservers$lambda$0(com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void setupCompose() {
        int i = 2 % 2;
        ((ActivityBaseComposeBinding) this.binding).composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1131131329, true, new copydefault()));
        int i2 = copy + 27;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c A[PHI: r1
  0x002c: PHI (r1v7 int) = (r1v6 int), (r1v14 int) binds: [B:8:0x002a, B:5:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void navigateBack() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copy
            int r1 = r1 + 45
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component4 = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L1e
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r1 = r4.getCurrentStep()
            int[] r3 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L51
            goto L2c
        L1e:
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r1 = r4.getCurrentStep()
            int[] r3 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r3[r1]
            if (r1 == r2) goto L51
        L2c:
            if (r1 == r0) goto L42
            int r1 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.copy
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.component4 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L3d
            r4.finish()
            return
        L3d:
            r4.finish()
            r0 = 0
            throw r0
        L42:
            float r0 = r4.getOutstandingBill()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4e
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.BILL_WARNING
            goto L53
        L4e:
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.INITIAL_WARNING
            goto L53
        L51:
            com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity$TerminatePostpayStep r0 = com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.TerminatePostpayStep.INITIAL_WARNING
        L53:
            r4.setCurrentStep(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.navigateBack():void");
    }

    private final void executeTerminatePostpay() {
        int i = 2 % 2;
        int i2 = copy + 77;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        ((PostpayViewModel) this.viewModel).terminatePostpay();
        int i4 = copy + 15;
        component4 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = copy + 111;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new int[]{-1587589909, 632320587, 389764412, 1355349379, 578740238, 1522150728, -518409239, 622551792, -699362992, -1909878356, -1221311769, -1961486330, 1488599487, 2055659020}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33344502, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952848_res_0x7f1304d0).substring(39, 40).length() - 961094136, (short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + ComposerKt.defaultsKey, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 57;
            component4 = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6618, 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.indexOf("", "", 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ExpandableListView.getPackedPositionGroup(0L) + 6562, 56 - TextUtils.indexOf("", "", 0, 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), -699576857, false, "component2", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(65:0|2|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(9:18|812|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|778|32|(11:34|791|35|39|40|777|(2:42|(5:44|45|(1:47)|48|49)(4:50|(1:52)|53|54))(22:55|56|768|57|(2:833|59)|63|64|850|65|(2:846|67)|71|72|73|(2:75|76)|77|78|844|79|(2:840|81)(1:83)|84|(1:86)|87)|88|(4:91|(2:93|883)(11:94|(3:96|(3:99|100|97)|884)|103|827|104|(1:106)|107|108|815|109|882)|110|89)|881|122)(8:39|40|777|(0)(0)|88|(1:89)|881|122)|(3:765|155|(1:161)(1:160))(1:165)|166|825|167|(1:169)|170|813|171|(1:173)|174|175|198|821|199|(3:201|775|202)|206|(4:208|209|819|210)(1:211)|212|(3:214|(1:216)|217)(37:(2:219|(1:225)(1:224))(1:226)|(18:228|808|229|(1:231)|232|233|800|234|(1:236)|237|238|239|(1:241)|242|(1:244)|245|(1:247)|248)|308|837|309|(1:311)|312|313|(4:315|316|(1:318)|319)(14:321|322|829|323|(1:325)|326|327|328|(1:330)|331|(1:333)|334|(1:336)|337)|320|338|(9:341|817|342|(1:344)|345|346|347|806|348)|349|378|820|379|(1:381)|382|(3:384|(1:386)|387)(19:388|389|810|390|(1:392)|393|394|802|395|(1:397)|398|399|400|(1:402)|403|(1:405)(1:406)|407|(1:409)|410)|411|(4:414|(2:416|858)(14:417|(3:419|(3:422|423|420)|859)|424|796|425|(2:780|427)|431|432|789|433|434|785|435|857)|436|412)|856|474|(1:476)|477|(1:479)|480|(3:482|(1:484)|485)(16:487|488|(1:490)|491|(1:493)|494|495|(1:497)|498|842|499|500|(1:502)|503|(1:505)|506)|486|507|(1:509)(9:510|(3:512|(2:515|513)|873)|516|517|(1:519)|520|(1:522)|523|524)|525|(1:527)|528|(3:530|(1:532)|533)(14:534|535|(1:537)|538|539|(1:541)|542|854|543|544|(1:546)|547|(1:549)|550)|551|(25:553|770|554|(1:556)|557|(1:559)|560|(3:562|(1:564)|565)(17:566|(2:568|(1:574)(1:573))|(19:576|577|766|578|(1:580)|581|582|848|583|(1:585)|586|587|588|(1:590)|591|(1:593)|594|(1:596)|597)|655|(1:657)|658|(3:660|(1:662)|663)(13:665|792|666|667|(1:669)|670|823|671|672|(1:674)|675|(1:677)|678)|664|679|(6:682|683|(1:685)|686|687|688)|689|(1:691)|692|(3:694|(1:696)|697)(14:699|700|(1:702)|703|704|(1:706)|707|835|708|709|(1:711)|712|(1:714)|715)|698|716|(1:885)(7:719|720|(1:722)|723|724|725|726))|598|(4:601|(3:862|603|865)(12:861|604|(3:606|(4:609|(3:868|611|871)(4:867|612|613|870)|869|607)|866)|614|838|615|(1:617)|618|619|831|620|864)|863|599)|860|655|(0)|658|(0)(0)|664|679|(0)|689|(0)|692|(0)(0)|698|716|(0)(0))(10:736|(3:738|(2:741|739)|872)|742|743|(1:745)|746|(1:748)|749|750|751))|249|(5:252|253|(3:876|255|879)(12:875|256|(3:258|(3:261|262|259)|880)|263|794|264|(1:266)|267|268|787|269|878)|877|250)|874|308|837|309|(0)|312|313|(0)(0)|320|338|(0)|349|378|820|379|(0)|382|(0)(0)|411|(1:412)|856|474|(0)|477|(0)|480|(0)(0)|486|507|(0)(0)|525|(0)|528|(0)(0)|551|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x178e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x178f, code lost:
    
        r7 = r26;
        r9 = new java.lang.Object[1];
        g(((android.content.Context) java.lang.Class.forName(r33).getMethod(r7, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 33344585, (byte) (((android.content.Context) java.lang.Class.forName(r33).getMethod(r7, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() - 1), ((android.content.Context) java.lang.Class.forName(r33).getMethod(r7, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() - 961094188, (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), ((android.content.Context) java.lang.Class.forName(r33).getMethod(r7, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + androidx.compose.runtime.ComposerKt.defaultsKey, r9);
        r5 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x1849, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r3);
        r0.printStackTrace(r6);
        r6.close();
        r2 = r3.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1860, code lost:
    
        r2 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1864, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r2);
        r3.add(r5);
        r14 = -1;
        r5 = ((long) 1) & ((((long) 0) << 32) | (r14 - ((r14 >> 63) << 32)));
        r14 = 0;
        r5 = r5 | ((((long) 19) << 32) | (r14 - ((r14 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x1893, code lost:
    
        r9 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1897, code lost:
    
        if (r9 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x1899, code lost:
    
        r9 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.lastIndexOf("", '0', 0, 0) + 6619, 42 - android.text.TextUtils.getOffsetAfter("", 0), (char) android.widget.ExpandableListView.getPackedPositionGroup(0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x18c1, code lost:
    
        r9 = ((java.lang.reflect.Method) r9).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x18c9, code lost:
    
        r12 = new java.lang.Object[]{-388228768, java.lang.Long.valueOf(r5), r3, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6562, 56 - android.view.View.getDefaultSize(0, 0), (char) ((-1) - android.text.TextUtils.lastIndexOf("", '0')));
        r13 = new java.lang.Object[1];
        i((short) 52, r3[16], (byte) (-com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.$$j[77]), r13);
        r2.getMethod((java.lang.String) r13[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r9, r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a58 A[Catch: all -> 0x0477, TryCatch #26 {all -> 0x0477, blocks: (B:147:0x0a52, B:149:0x0a58, B:150:0x0a83, B:302:0x1362, B:304:0x1368, B:305:0x138c, B:683:0x31d0, B:685:0x31d6, B:686:0x3200, B:720:0x3509, B:722:0x350f, B:723:0x3537, B:700:0x334f, B:702:0x3372, B:703:0x33c3, B:649:0x2e83, B:651:0x2e89, B:652:0x2eb6, B:743:0x361b, B:745:0x3621, B:746:0x3644, B:748:0x367e, B:749:0x36c3, B:535:0x2690, B:537:0x26a5, B:538:0x26d7, B:517:0x23a9, B:519:0x23af, B:520:0x23d3, B:522:0x240d, B:523:0x2454, B:488:0x2057, B:490:0x206c, B:491:0x209c, B:493:0x20d0, B:494:0x2148, B:468:0x1de3, B:470:0x1de9, B:471:0x1e19, B:372:0x1893, B:374:0x1899, B:375:0x18c1, B:192:0x0d23, B:194:0x0d29, B:195:0x0d50, B:19:0x023c, B:21:0x0242, B:22:0x026f, B:24:0x03e5, B:26:0x0417, B:27:0x0471), top: B:812:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0b24  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0b3b A[Catch: all -> 0x0c02, TryCatch #34 {all -> 0x0c02, blocks: (B:167:0x0b26, B:169:0x0b3b, B:170:0x0b6b), top: B:825:0x0b26, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b7e A[Catch: all -> 0x0bf8, TryCatch #27 {all -> 0x0bf8, blocks: (B:171:0x0b71, B:173:0x0b7e, B:174:0x0bee), top: B:813:0x0b71, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0e60 A[Catch: all -> 0x12fd, TRY_LEAVE, TryCatch #32 {all -> 0x12fd, blocks: (B:199:0x0de0, B:206:0x0e39, B:208:0x0e60), top: B:821:0x0de0 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ebe A[Catch: all -> 0x12fb, TryCatch #30 {all -> 0x12fb, blocks: (B:210:0x0e91, B:212:0x0eaa, B:214:0x0ebe, B:216:0x0ec7, B:217:0x0f17, B:249:0x11b9, B:250:0x11bd, B:253:0x11cd, B:256:0x11e5, B:259:0x11f1, B:261:0x11f4, B:273:0x12d5, B:275:0x12db, B:276:0x12dc, B:278:0x12de, B:280:0x12e5, B:281:0x12e6, B:219:0x0f24, B:221:0x0f28, B:228:0x0f3c, B:239:0x1097, B:241:0x109d, B:242:0x10e5, B:244:0x110f, B:245:0x1155, B:247:0x116b, B:248:0x11b3, B:283:0x12e8, B:285:0x12ef, B:286:0x12f0, B:288:0x12f2, B:290:0x12f9, B:291:0x12fa, B:225:0x0f34, B:269:0x125a, B:264:0x1220, B:266:0x1226, B:267:0x1252, B:234:0x0fe4, B:236:0x1008, B:237:0x108b, B:229:0x0f9a, B:231:0x0fae, B:232:0x0fdd), top: B:819:0x0e91, inners: #13, #17, #20, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x11c3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x1368 A[Catch: all -> 0x0477, TryCatch #26 {all -> 0x0477, blocks: (B:147:0x0a52, B:149:0x0a58, B:150:0x0a83, B:302:0x1362, B:304:0x1368, B:305:0x138c, B:683:0x31d0, B:685:0x31d6, B:686:0x3200, B:720:0x3509, B:722:0x350f, B:723:0x3537, B:700:0x334f, B:702:0x3372, B:703:0x33c3, B:649:0x2e83, B:651:0x2e89, B:652:0x2eb6, B:743:0x361b, B:745:0x3621, B:746:0x3644, B:748:0x367e, B:749:0x36c3, B:535:0x2690, B:537:0x26a5, B:538:0x26d7, B:517:0x23a9, B:519:0x23af, B:520:0x23d3, B:522:0x240d, B:523:0x2454, B:488:0x2057, B:490:0x206c, B:491:0x209c, B:493:0x20d0, B:494:0x2148, B:468:0x1de3, B:470:0x1de9, B:471:0x1e19, B:372:0x1893, B:374:0x1899, B:375:0x18c1, B:192:0x0d23, B:194:0x0d29, B:195:0x0d50, B:19:0x023c, B:21:0x0242, B:22:0x026f, B:24:0x03e5, B:26:0x0417, B:27:0x0471), top: B:812:0x023c }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x141a A[Catch: all -> 0x178e, TryCatch #40 {all -> 0x178e, blocks: (B:309:0x1414, B:311:0x141a, B:312:0x145f, B:316:0x1479, B:318:0x147f, B:319:0x14c3, B:338:0x1680, B:346:0x16ea, B:352:0x1772, B:354:0x1778, B:355:0x1779, B:357:0x177b, B:359:0x1782, B:360:0x1783, B:321:0x14cf, B:328:0x1559, B:330:0x155f, B:331:0x15a7, B:333:0x15d1, B:334:0x161c, B:336:0x1632, B:337:0x1678, B:362:0x1785, B:364:0x178c, B:365:0x178d, B:348:0x16f0, B:342:0x16b0, B:344:0x16b6, B:345:0x16e3, B:323:0x14ef, B:325:0x1501, B:326:0x154d), top: B:837:0x1414, outer: #10, inners: #23, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x146c  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x14cf A[Catch: all -> 0x178e, TRY_LEAVE, TryCatch #40 {all -> 0x178e, blocks: (B:309:0x1414, B:311:0x141a, B:312:0x145f, B:316:0x1479, B:318:0x147f, B:319:0x14c3, B:338:0x1680, B:346:0x16ea, B:352:0x1772, B:354:0x1778, B:355:0x1779, B:357:0x177b, B:359:0x1782, B:360:0x1783, B:321:0x14cf, B:328:0x1559, B:330:0x155f, B:331:0x15a7, B:333:0x15d1, B:334:0x161c, B:336:0x1632, B:337:0x1678, B:362:0x1785, B:364:0x178c, B:365:0x178d, B:348:0x16f0, B:342:0x16b0, B:344:0x16b6, B:345:0x16e3, B:323:0x14ef, B:325:0x1501, B:326:0x154d), top: B:837:0x1414, outer: #10, inners: #23, #29, #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x1692  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x194f A[Catch: all -> 0x1d7d, TryCatch #31 {all -> 0x1d7d, blocks: (B:379:0x1949, B:381:0x194f, B:382:0x1995, B:384:0x19a2, B:386:0x19ab, B:387:0x19ee, B:411:0x1c28, B:412:0x1c2c, B:414:0x1c32, B:417:0x1c4b, B:420:0x1c58, B:422:0x1c5b, B:442:0x1d56, B:444:0x1d5c, B:445:0x1d5d, B:448:0x1d61, B:450:0x1d67, B:451:0x1d68, B:388:0x19f9, B:400:0x1b02, B:402:0x1b08, B:403:0x1b4e, B:405:0x1b78, B:407:0x1bc5, B:409:0x1bdc, B:410:0x1c20, B:453:0x1d6a, B:455:0x1d71, B:456:0x1d72, B:458:0x1d74, B:460:0x1d7b, B:461:0x1d7c, B:395:0x1a6a, B:397:0x1a86, B:398:0x1af6, B:390:0x1a19, B:392:0x1a2e, B:393:0x1a63), top: B:820:0x1949, outer: #10, inners: #21, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x19a2 A[Catch: all -> 0x1d7d, TryCatch #31 {all -> 0x1d7d, blocks: (B:379:0x1949, B:381:0x194f, B:382:0x1995, B:384:0x19a2, B:386:0x19ab, B:387:0x19ee, B:411:0x1c28, B:412:0x1c2c, B:414:0x1c32, B:417:0x1c4b, B:420:0x1c58, B:422:0x1c5b, B:442:0x1d56, B:444:0x1d5c, B:445:0x1d5d, B:448:0x1d61, B:450:0x1d67, B:451:0x1d68, B:388:0x19f9, B:400:0x1b02, B:402:0x1b08, B:403:0x1b4e, B:405:0x1b78, B:407:0x1bc5, B:409:0x1bdc, B:410:0x1c20, B:453:0x1d6a, B:455:0x1d71, B:456:0x1d72, B:458:0x1d74, B:460:0x1d7b, B:461:0x1d7c, B:395:0x1a6a, B:397:0x1a86, B:398:0x1af6, B:390:0x1a19, B:392:0x1a2e, B:393:0x1a63), top: B:820:0x1949, outer: #10, inners: #21, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x19f9 A[Catch: all -> 0x1d7d, TRY_LEAVE, TryCatch #31 {all -> 0x1d7d, blocks: (B:379:0x1949, B:381:0x194f, B:382:0x1995, B:384:0x19a2, B:386:0x19ab, B:387:0x19ee, B:411:0x1c28, B:412:0x1c2c, B:414:0x1c32, B:417:0x1c4b, B:420:0x1c58, B:422:0x1c5b, B:442:0x1d56, B:444:0x1d5c, B:445:0x1d5d, B:448:0x1d61, B:450:0x1d67, B:451:0x1d68, B:388:0x19f9, B:400:0x1b02, B:402:0x1b08, B:403:0x1b4e, B:405:0x1b78, B:407:0x1bc5, B:409:0x1bdc, B:410:0x1c20, B:453:0x1d6a, B:455:0x1d71, B:456:0x1d72, B:458:0x1d74, B:460:0x1d7b, B:461:0x1d7c, B:395:0x1a6a, B:397:0x1a86, B:398:0x1af6, B:390:0x1a19, B:392:0x1a2e, B:393:0x1a63), top: B:820:0x1949, outer: #10, inners: #21, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x1c32 A[Catch: all -> 0x1d7d, TryCatch #31 {all -> 0x1d7d, blocks: (B:379:0x1949, B:381:0x194f, B:382:0x1995, B:384:0x19a2, B:386:0x19ab, B:387:0x19ee, B:411:0x1c28, B:412:0x1c2c, B:414:0x1c32, B:417:0x1c4b, B:420:0x1c58, B:422:0x1c5b, B:442:0x1d56, B:444:0x1d5c, B:445:0x1d5d, B:448:0x1d61, B:450:0x1d67, B:451:0x1d68, B:388:0x19f9, B:400:0x1b02, B:402:0x1b08, B:403:0x1b4e, B:405:0x1b78, B:407:0x1bc5, B:409:0x1bdc, B:410:0x1c20, B:453:0x1d6a, B:455:0x1d71, B:456:0x1d72, B:458:0x1d74, B:460:0x1d7b, B:461:0x1d7c, B:395:0x1a6a, B:397:0x1a86, B:398:0x1af6, B:390:0x1a19, B:392:0x1a2e, B:393:0x1a63), top: B:820:0x1949, outer: #10, inners: #21, #25 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1eaa  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1f0f  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x1f69  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x2039  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x2286  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x2369  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x2568  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x25b7  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x2671  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x280f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x05ab A[Catch: all -> 0x093c, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x093c, blocks: (B:32:0x0486, B:39:0x04dc, B:55:0x05ab, B:73:0x06ae, B:77:0x06f9), top: B:778:0x0486 }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x2f49  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2f98  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x2ff3  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x31b0  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x3290  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x32de  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x3331  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x34e9  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x35e3  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0b0b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:885:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07de A[Catch: all -> 0x0917, TryCatch #44 {all -> 0x0917, blocks: (B:88:0x07d4, B:89:0x07d8, B:91:0x07de, B:94:0x07fa, B:79:0x0708, B:84:0x076c, B:87:0x07cc), top: B:844:0x0708 }] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v307 */
    /* JADX WARN: Type inference failed for: r10v308 */
    /* JADX WARN: Type inference failed for: r10v309 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v111, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v114 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v128 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v54 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v98 */
    /* JADX WARN: Type inference failed for: r13v99 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r32v19 */
    /* JADX WARN: Type inference failed for: r32v20 */
    /* JADX WARN: Type inference failed for: r32v21 */
    /* JADX WARN: Type inference failed for: r32v24 */
    /* JADX WARN: Type inference failed for: r32v25 */
    /* JADX WARN: Type inference failed for: r32v26 */
    /* JADX WARN: Type inference failed for: r32v29 */
    /* JADX WARN: Type inference failed for: r32v31 */
    /* JADX WARN: Type inference failed for: r32v32 */
    /* JADX WARN: Type inference failed for: r32v33 */
    /* JADX WARN: Type inference failed for: r32v34 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r32v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11 */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v13 */
    /* JADX WARN: Type inference failed for: r33v14 */
    /* JADX WARN: Type inference failed for: r33v15 */
    /* JADX WARN: Type inference failed for: r33v30 */
    /* JADX WARN: Type inference failed for: r33v31 */
    /* JADX WARN: Type inference failed for: r33v6 */
    /* JADX WARN: Type inference failed for: r33v7 */
    /* JADX WARN: Type inference failed for: r33v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v521 */
    /* JADX WARN: Type inference failed for: r3v522 */
    /* JADX WARN: Type inference failed for: r3v523 */
    /* JADX WARN: Type inference failed for: r3v540 */
    /* JADX WARN: Type inference failed for: r3v541 */
    /* JADX WARN: Type inference failed for: r8v223 */
    /* JADX WARN: Type inference failed for: r8v231 */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.postpay.manage.terminate.TerminatePostpayActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$219ApUjFFlmOB3JWtnxyk0aY6ys(TerminatePostpayActivity terminatePostpayActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 59;
        component4 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            initObservers$lambda$0(terminatePostpayActivity, resource);
            obj.hashCode();
            throw null;
        }
        Unit unitInitObservers$lambda$0 = initObservers$lambda$0(terminatePostpayActivity, resource);
        int i3 = component4 + 27;
        copy = i3 % 128;
        if (i3 % 2 == 0) {
            return unitInitObservers$lambda$0;
        }
        throw null;
    }

    static {
        getRequestBeneficiariesState = 1;
        component3();
        int i = equals + 81;
        getRequestBeneficiariesState = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = copy + 85;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 17;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }

    static void component3() {
        component1 = new int[]{1459255863, 1749607345, 1107439187, 453293962, -64387946, -735246994, 1716556790, 807217933, -1141420467, -1461395403, 234998725, 402463291, 1725524622, 1444633703, 1095048306, 1995781314, 1320270438, 1108467886};
        ShareDataUIState = 264783044;
        component3 = -238323896;
        component2 = -930982541;
        copydefault = new byte[]{-104, -42, 47, -36, 58, -41, -45, -44, -43, 41, 6, -28, 47, 32, -38, 41, -44, 59, -116, 44, -45, 42, 42, -36, -100, 33, -35, 42, 0, -1, 33, -40, 40, -45, Ascii.SI, Ascii.FF, -110, 45, 104, -29, -46, -45, -44, 39, -33, 36, -121, -47, 45, -36, 33, 34, -43, 58, -57, -42, -37, 42, 38, -36, 46, -125, -45, -44, 46, -46, 40, -44, 44, -46, 46, -41, -125, 43, -43, -41, 40, 45, -42, 45, -45, 44, -48, -125, -43, 46, -47, 42, -41, -42, 43, 47, -45, 47, -128, -44, 46, -46, 40, -44, 44, -46, 46, -41};
    }
}
