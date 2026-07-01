package com.huawei.digitalpayment.consumer.sfcui.simcard;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.blankj.utilcode.util.Utils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.biometric.constants.BiometricConstants;
import com.huawei.biometric.util.BiometricHelper2;
import com.huawei.common.module.UserLifecycleManager;
import com.huawei.common.util.SPUtils;
import com.huawei.digitalpayment.consumer.base.constants.SPConstant;
import com.huawei.digitalpayment.consumer.base.sim.SIM_DEFAULTS;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalManager;
import com.huawei.digitalpayment.consumer.base.sim.SimCardRemovalState;
import com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker;
import com.huawei.digitalpayment.consumer.base.util.GsmHelper;
import com.huawei.digitalpayment.consumer.baselib.constants.RoutePathConstants;
import com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity;
import com.safaricom.mpesa.lifestyle.R;
import com.safaricom.mpesa.logging.L;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/simcard/SfcSimCardRemovedActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "TAG", "", "simCardRemovalManager", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "getSimCardRemovalManager", "()Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;", "setSimCardRemovalManager", "(Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalManager;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "logout", "getExtraKey", "navigateToOnboardingScreen", "navigateToLoginScreen", "ConsumerSfcUI_release", "simState", "Lcom/huawei/digitalpayment/consumer/base/sim/SimCardRemovalState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcSimCardRemovedActivity extends Hilt_SfcSimCardRemovedActivity {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static char component3;
    private static char[] copydefault;
    private final String TAG;

    @Inject
    public SimCardRemovalManager simCardRemovalManager;
    private static final byte[] $$l = {77, -64, 102, -128};
    private static final int $$m = 49;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {Ascii.SI, 58, -59, 10, -61, 72, -9, 0, 6, Ascii.NAK, -7, 17, -13, Ascii.ETB, -70, 63, 9, 10, -11, 17, 0, -9, Ascii.SI, -58, 69, 5, -7, 17, -13, Ascii.ETB, -1, 7, 5, -65, 69, -9, Ascii.NAK, -10, 17, 8, -17, 5, Ascii.SO, -3, -51, 37, Ascii.ETB, Ascii.NAK, -10, 17, 8, -17, 5, Ascii.SO, -3, -10, Ascii.SYN, 9, -6, Ascii.SI, Ascii.FF, -49, TarHeader.LF_LINK, 10, -3, -6, 1, Ascii.NAK, Ascii.VT, -81, 67, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, Ascii.DLE, 5, 13, -17, 5, 5, -1, Ascii.CAN, -5, Ascii.FF, Ascii.DLE, 2, -59, Base64.padSymbol, Ascii.FF, 4, -4, 9, -3, -51, TarHeader.LF_CONTIG, 17, -6, Ascii.DC2, 1, -2, -1, -50, Base64.padSymbol, 10, 10, -65, 57, Ascii.DLE, 2, 4, 6, 3, -60, 63, 9, 10, -11, 17, 0, -9, Ascii.SI, -58, 80, 4, -11, Ascii.EM, -3, Ascii.NAK, -9, -29, 33, Ascii.ETB, -15, -8, -8, Ascii.SO, 37, -15, Ascii.ETB, -11, Ascii.DLE, 2, 7, 3, 3, -5, 13, 10, -61, Ascii.DLE, 2, -59, SignedBytes.MAX_POWER_OF_TWO, 9, 10, 1, 0, -5, Ascii.CAN, -20, 19, 4, 7, -65, 56, 3, Ascii.NAK, -11, Ascii.DLE, -7, 5, Ascii.DC2, -12, 2, 17, 4, -5, 17, -64, 41, Ascii.SUB, Ascii.NAK, -17, Ascii.DLE, 2, -59, TarHeader.LF_CONTIG, Ascii.SI, 1, -3, 3, 5, 3, -47, TarHeader.LF_CONTIG, Ascii.NAK, -5, 17, -13, 17, -64, TarHeader.LF_CONTIG, 19, 4, -62, Ascii.ETB, TarHeader.LF_CHR, 4, -30, 37, -7, 5, -61, Ascii.DC2, -10, 17};
    private static final int $$k = 175;
    private static final byte[] $$d = {4, 8, -22, -73, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 183;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$n(short r5, short r6, byte r7) {
        /*
            int r5 = r5 * 2
            int r5 = 4 - r5
            int r7 = 122 - r7
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r3 = r1[r5]
        L24:
            int r7 = r7 + r3
            int r5 = r5 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.$$n(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void h(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.$$d
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-8)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.h(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 105 - r6
            int r0 = r8 + 10
            int r7 = 189 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.$$j
            byte[] r0 = new byte[r0]
            int r8 = r8 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
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
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r7
            int r7 = r3 + 1
            int r6 = r6 + (-4)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.i(byte, int, int, java.lang.Object[]):void");
    }

    public static final String access$getTAG$p(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 15;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        String str = sfcSimCardRemovedActivity.TAG;
        int i5 = i3 + 29;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final void access$logout(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcSimCardRemovedActivity.logout();
        int i4 = getAsAtTimestamp + 55;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$navigateToLoginScreen(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 79;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sfcSimCardRemovedActivity.navigateToLoginScreen();
        if (i3 != 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 49;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static final void access$navigateToOnboardingScreen(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcSimCardRemovedActivity.navigateToOnboardingScreen();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public SfcSimCardRemovedActivity() {
        String simpleName = Reflection.getOrCreateKotlinClass(SfcSimCardRemovedActivity.class).getSimpleName();
        if (simpleName == null) {
            int i = getAsAtTimestamp + 31;
            getRequestBeneficiariesState = i % 128;
            int i2 = i % 2;
            int i3 = 2 % 2;
            simpleName = "";
        }
        this.TAG = simpleName;
        int i4 = getAsAtTimestamp + 33;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final SimCardRemovalManager getSimCardRemovalManager() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        SimCardRemovalManager simCardRemovalManager = this.simCardRemovalManager;
        if (simCardRemovalManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 5;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return simCardRemovalManager;
    }

    public final void setSimCardRemovalManager(SimCardRemovalManager simCardRemovalManager) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 11;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(simCardRemovalManager, "");
        this.simCardRemovalManager = simCardRemovalManager;
        int i4 = getRequestBeneficiariesState + 81;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int component1 = 1;
        private static int component2;
        final SimSubscriptionIdChecker ShareDataUIState;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final SfcSimCardRemovedActivity component2;
            final SimSubscriptionIdChecker component3;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 37;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 23;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component2(SimSubscriptionIdChecker simSubscriptionIdChecker, SfcSimCardRemovedActivity sfcSimCardRemovedActivity, State state) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(simSubscriptionIdChecker, "");
                Intrinsics.checkNotNullParameter(sfcSimCardRemovedActivity, "");
                Intrinsics.checkNotNullParameter(state, "");
                if (!component3((State<SimCardRemovalState>) state).isSimRemoved()) {
                    if (!simSubscriptionIdChecker.checkIfUserHasEnabledThisFeature()) {
                        int i2 = ShareDataUIState + 61;
                        copydefault = i2 % 128;
                        if (i2 % 2 != 0) {
                            L.INSTANCE.d(SfcSimCardRemovedActivity.access$getTAG$p(sfcSimCardRemovedActivity), "SIM Subscription not enabled, LOGOUT ANYWAY", new Object[0]);
                        } else {
                            L.INSTANCE.d(SfcSimCardRemovedActivity.access$getTAG$p(sfcSimCardRemovedActivity), "SIM Subscription not enabled, LOGOUT ANYWAY", new Object[0]);
                        }
                        SfcSimCardRemovedActivity.access$navigateToOnboardingScreen(sfcSimCardRemovedActivity);
                    }
                    if (simSubscriptionIdChecker.checkIfSavedSimCardWasRemoved()) {
                        int i3 = copydefault + 113;
                        ShareDataUIState = i3 % 128;
                        if (i3 % 2 == 0) {
                            L.INSTANCE.d(SfcSimCardRemovedActivity.access$getTAG$p(sfcSimCardRemovedActivity), "SIM Subscription Checker, SIM WAS REMOVED", new Object[0]);
                        } else {
                            L.INSTANCE.d(SfcSimCardRemovedActivity.access$getTAG$p(sfcSimCardRemovedActivity), "SIM Subscription Checker, SIM WAS REMOVED", new Object[0]);
                        }
                        SfcSimCardRemovedActivity.access$navigateToOnboardingScreen(sfcSimCardRemovedActivity);
                    } else {
                        SfcSimCardRemovedActivity.access$navigateToLoginScreen(sfcSimCardRemovedActivity);
                    }
                    sfcSimCardRemovedActivity.finishAffinity();
                }
                return Unit.INSTANCE;
            }

            private static final Unit component3(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 27;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcSimCardRemovedActivity, "");
                SfcSimCardRemovedActivity.access$logout(sfcSimCardRemovedActivity);
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 99;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                Object obj = null;
                if ((i & 11) == 2) {
                    int i3 = ShareDataUIState + 83;
                    copydefault = i3 % 128;
                    if (i3 % 2 != 0) {
                        composer.getSkipping();
                        obj.hashCode();
                        throw null;
                    }
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i4 = ShareDataUIState + 125;
                        copydefault = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 5 / 3;
                            return;
                        }
                        return;
                    }
                }
                final State stateCollectAsState = SnapshotStateKt.collectAsState(this.component2.getSimCardRemovalManager().getSimCardRemovalState(), null, composer, 8, 1);
                SimCardRemovalState simCardRemovalStateComponent3 = component3((State<SimCardRemovalState>) stateCollectAsState);
                final SimSubscriptionIdChecker simSubscriptionIdChecker = this.component3;
                final SfcSimCardRemovedActivity sfcSimCardRemovedActivity = this.component2;
                Function0 function0 = new Function0() {
                    private static int component1 = 1;
                    private static int copydefault;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component1 + 93;
                        copydefault = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitComponent3 = SfcSimCardRemovedActivity.copydefault.AnonymousClass1.component3(simSubscriptionIdChecker, sfcSimCardRemovedActivity, stateCollectAsState);
                        int i9 = component1 + 71;
                        copydefault = i9 % 128;
                        int i10 = i9 % 2;
                        return unitComponent3;
                    }
                };
                final SfcSimCardRemovedActivity sfcSimCardRemovedActivity2 = this.component2;
                SimCardDetectionScreenKt.SimCardDetectionScreen(simCardRemovalStateComponent3, function0, new Function0() {
                    private static int component1 = 1;
                    private static int component2;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = component1 + 31;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitCopydefault = SfcSimCardRemovedActivity.copydefault.AnonymousClass1.copydefault(sfcSimCardRemovedActivity2);
                        int i9 = component1 + 29;
                        component2 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitCopydefault;
                    }
                }, null, composer, 8, 8);
                boolean zIsSimRemoved = component3((State<SimCardRemovalState>) stateCollectAsState).isSimRemoved();
                final SfcSimCardRemovedActivity sfcSimCardRemovedActivity3 = this.component2;
                BackHandlerKt.BackHandler(zIsSimRemoved, new Function0() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i6 = 2 % 2;
                        int i7 = copydefault + 51;
                        component3 = i7 % 128;
                        int i8 = i7 % 2;
                        Unit unitShareDataUIState = SfcSimCardRemovedActivity.copydefault.AnonymousClass1.ShareDataUIState(sfcSimCardRemovedActivity3);
                        int i9 = copydefault + 13;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        return unitShareDataUIState;
                    }
                }, composer, 0, 0);
            }

            private static final Unit component1(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = ShareDataUIState + 43;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcSimCardRemovedActivity, "");
                    sfcSimCardRemovedActivity.finishAffinity();
                    unit = Unit.INSTANCE;
                    int i3 = 44 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(sfcSimCardRemovedActivity, "");
                    sfcSimCardRemovedActivity.finishAffinity();
                    unit = Unit.INSTANCE;
                }
                int i4 = copydefault + 35;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final SimCardRemovalState component3(State<SimCardRemovalState> state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 85;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                SimCardRemovalState value = state.getValue();
                int i4 = ShareDataUIState + 19;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 21 / 0;
                }
                return value;
            }

            public static Unit component3(SimSubscriptionIdChecker simSubscriptionIdChecker, SfcSimCardRemovedActivity sfcSimCardRemovedActivity, State state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 81;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(simSubscriptionIdChecker, sfcSimCardRemovedActivity, state);
                if (i3 != 0) {
                    int i4 = 89 / 0;
                }
                int i5 = copydefault + 125;
                ShareDataUIState = i5 % 128;
                int i6 = i5 % 2;
                return unitComponent2;
            }

            public static Unit copydefault(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 39;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    component3(sfcSimCardRemovedActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent3 = component3(sfcSimCardRemovedActivity);
                int i3 = copydefault + 7;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 22 / 0;
                }
                return unitComponent3;
            }

            public static Unit ShareDataUIState(SfcSimCardRemovedActivity sfcSimCardRemovedActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 57;
                copydefault = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    component1(sfcSimCardRemovedActivity);
                    throw null;
                }
                Unit unitComponent1 = component1(sfcSimCardRemovedActivity);
                int i3 = copydefault + 37;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitComponent1;
                }
                obj.hashCode();
                throw null;
            }

            AnonymousClass1(SfcSimCardRemovedActivity sfcSimCardRemovedActivity, SimSubscriptionIdChecker simSubscriptionIdChecker) {
                this.component2 = sfcSimCardRemovedActivity;
                this.component3 = simSubscriptionIdChecker;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 101;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component1 + 81;
            component2 = i4 % 128;
            if (i4 % 2 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        
            if (r11.getSkipping() == false) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        
            r11.skipToGroupEnd();
            r11 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component2 + 25;
            com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component1 = r11 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        
            if ((r11 % 2) != 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            r11 = 3 / 4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
        
            if (r11.getSkipping() == false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void copydefault(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                r12 = r12 & 11
                if (r12 != r0) goto L36
                int r12 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component2
                int r12 = r12 + 79
                int r1 = r12 % 128
                com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component1 = r1
                int r12 = r12 % r0
                if (r12 != 0) goto L1d
                boolean r12 = r11.getSkipping()
                r1 = 94
                int r1 = r1 / 0
                if (r12 != 0) goto L24
                goto L36
            L1d:
                boolean r12 = r11.getSkipping()
                if (r12 != 0) goto L24
                goto L36
            L24:
                r11.skipToGroupEnd()
                int r11 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component2
                int r11 = r11 + 25
                int r12 = r11 % 128
                com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.component1 = r12
                int r11 = r11 % r0
                if (r11 != 0) goto L5a
                r11 = 3
                int r11 = r11 / 4
                goto L5a
            L36:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity$copydefault$1 r12 = new com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity$copydefault$1
                com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity r6 = com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.this
                com.huawei.digitalpayment.consumer.base.sim.SimSubscriptionIdChecker r7 = r10.ShareDataUIState
                r12.<init>(r6, r7)
                r6 = 54
                r7 = 1115737310(0x4280ccde, float:64.40013)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L5a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.copydefault.copydefault(androidx.compose.runtime.Composer, int):void");
        }

        copydefault(SimSubscriptionIdChecker simSubscriptionIdChecker) {
            this.ShareDataUIState = simSubscriptionIdChecker;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void g(char r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.g(char, int, int, java.lang.Object[]):void");
    }

    private static void f(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7422, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (64292 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
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
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7422 - TextUtils.getOffsetBefore("", 0), 15 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (64291 - View.MeasureSpec.getSize(0)), 682917265, false, "v", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b2);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i6 = $10 + 11;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i8 = $10 + 99;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    obj = obj2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = cancelall;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = cancelall;
                    objArr4[9] = cancelall;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = cancelall;
                    objArr4[6] = cancelall;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = cancelall;
                    objArr4[3] = cancelall;
                    objArr4[i3] = Integer.valueOf(cCharValue);
                    objArr4[1] = cancelall;
                    objArr4[0] = cancelall;
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                    if (objCopydefault3 == null) {
                        int doubleTapTimeout = 7117 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        int mode = View.MeasureSpec.getMode(0) + 14;
                        char cMyTid = (char) ((Process.myTid() >> 22) + 44463);
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[i3] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[8] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(doubleTapTimeout, mode, cMyTid, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                        int i10 = $10 + 39;
                        $11 = i10 % 128;
                        int i11 = i10 % i3;
                        Object[] objArr5 = new Object[11];
                        objArr5[10] = cancelall;
                        objArr5[9] = Integer.valueOf(cCharValue);
                        objArr5[8] = cancelall;
                        objArr5[7] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = cancelall;
                        objArr5[4] = cancelall;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[i3] = Integer.valueOf(cCharValue);
                        objArr5[1] = cancelall;
                        objArr5[0] = cancelall;
                        Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                        if (objCopydefault4 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2944, Color.alpha(0) + 24, (char) (TextUtils.getOffsetBefore("", 0) + 27637), 794909189, false, $$n(b3, b4, (byte) (b4 + 3)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                        int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                        cArr4[cancelall.component2] = cArr2[iIntValue];
                        cArr4[cancelall.component2 + 1] = cArr2[i12];
                    } else {
                        obj = null;
                        if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        } else {
                            int i15 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i16 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i15];
                            cArr4[cancelall.component2 + 1] = cArr2[i16];
                        }
                    }
                }
                cancelall.component2 += 2;
                obj2 = obj;
                i3 = 2;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = $11 + 59;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                cArr4[i17] = (char) (cArr4[i17] ^ 28367);
                i17 += 36;
            } else {
                cArr4[i17] = (char) (cArr4[i17] ^ 13722);
                i17++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01ea  */
    /* JADX WARN: Type inference failed for: r2v156, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.onCreate(android.os.Bundle):void");
    }

    private final void logout() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        BiometricHelper2.getInstance().closeFingerprintLogin();
        if (GsmHelper.INSTANCE.isGsmLogin()) {
            int i4 = getAsAtTimestamp + 63;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            GsmHelper.INSTANCE.setGsmLogin(false);
            int i6 = getRequestBeneficiariesState + 83;
            getAsAtTimestamp = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 2 / 4;
            }
        }
        SPUtils.getInstance().put("recent_login_phone_number", "");
        SPUtils.getInstance().put(SIM_DEFAULTS.PREF_SUBSCRIPTION_ID, -1);
        SPUtils.getInstance().put(SPConstant.SIM_REMOVAL_CACHE_KEY, false);
        SPUtils.getInstance(BiometricConstants.BIOMETRIC_SP_NAME).put(getExtraKey() + "_showBiometricDialog", false);
        UserLifecycleManager.get().logout(Utils.getApp());
        navigateToOnboardingScreen();
    }

    private final String getExtraKey() {
        int i = 2 % 2;
        String str = "_" + SPUtils.getInstance().getString(BiometricConstants.CURRENT_ACCOUNT);
        int i2 = getAsAtTimestamp + 51;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    private final void navigateToOnboardingScreen() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            RouteUtils.routeWithExecute(this, RoutePathConstants.LOGIN, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            int i3 = 85 / 0;
        } else {
            RouteUtils.routeWithExecute(this, RoutePathConstants.LOGIN, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        int i4 = getAsAtTimestamp + 121;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 82 / 0;
        }
    }

    private final void navigateToLoginScreen() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        RouteUtils.routeWithExecute(this, RoutePathConstants.PIN_LOGIN, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        int i4 = getRequestBeneficiariesState + 23;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g((char) KeyEvent.normalizeMetaState(0), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97, 26 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 83, new char[]{'-', 17, 13879, 13879, 17, 0, 7, '$', 13881, 13881, 19, 18, '\'', ')', '\n', 15, 3, '\n'}, (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 79), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = getRequestBeneficiariesState + 21;
            getAsAtTimestamp = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(View.MeasureSpec.getMode(0) + 6618, 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTapTimeout() >> 16) + 6562, 55 - Process.getGidForName(""), (char) ((-1) - ImageFormat.getBitsPerPixel(0)), -699576857, false, "component2", new Class[]{Context.class});
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
        int i2 = getRequestBeneficiariesState + 115;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            g((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) - 32), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131953647_res_0x7f1307ef).substring(0, 4).length() - 4, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string._2131952847_res_0x7f1304cf).substring(21, 22).codePointAt(0) - 6, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(TextUtils.indexOf((CharSequence) "", '0') + 19, new char[]{'-', 17, 13879, 13879, 17, 0, 7, '$', 13881, 13881, 19, 18, '\'', ')', '\n', 15, 3, '\n'}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(18) - 18), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6618, (ViewConfiguration.getLongPressTimeout() >> 16) + 42, (char) (KeyEvent.getMaxKeyCode() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getLongPressTimeout() >> 16) + 6562, (ViewConfiguration.getFadingEdgeLength() >> 16) + 56, (char) KeyEvent.getDeadChar(0, 0), -960739708, false, "component3", new Class[]{Context.class});
                }
                ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                int i4 = getAsAtTimestamp + 21;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:100:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0bd9 A[Catch: all -> 0x0cfa, TryCatch #15 {all -> 0x0cfa, blocks: (B:135:0x0bcf, B:136:0x0bd3, B:138:0x0bd9, B:141:0x0bf3, B:144:0x0bff, B:146:0x0c02, B:158:0x0ce8, B:160:0x0cee, B:161:0x0cef, B:163:0x0cf1, B:165:0x0cf8, B:166:0x0cf9, B:113:0x08d0, B:124:0x0aa1, B:126:0x0aa7, B:127:0x0aed, B:129:0x0b17, B:131:0x0b62, B:133:0x0b79, B:134:0x0bc7, B:170:0x0cfd, B:172:0x0d04, B:173:0x0d05, B:175:0x0d07, B:177:0x0d0e, B:178:0x0d0f, B:154:0x0c68, B:149:0x0c30, B:151:0x0c36, B:152:0x0c60, B:119:0x09ef, B:121:0x0a13, B:122:0x0a95, B:114:0x09a0, B:116:0x09b4, B:117:0x09e8), top: B:770:0x08d0, inners: #4, #9, #17, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0dc4 A[Catch: all -> 0x0512, TryCatch #31 {all -> 0x0512, blocks: (B:191:0x0dbe, B:193:0x0dc4, B:194:0x0deb, B:663:0x31c0, B:665:0x31c6, B:666:0x31ed, B:700:0x3502, B:702:0x3508, B:703:0x352b, B:680:0x3338, B:682:0x335b, B:683:0x33b6, B:629:0x2e87, B:631:0x2e8d, B:632:0x2eb5, B:723:0x35f8, B:725:0x35fe, B:726:0x362b, B:728:0x3665, B:729:0x36ab, B:512:0x26be, B:514:0x26d3, B:515:0x2704, B:494:0x23a2, B:496:0x23a8, B:497:0x23cf, B:499:0x2409, B:500:0x2456, B:465:0x2035, B:467:0x204a, B:468:0x207b, B:470:0x20af, B:471:0x2123, B:445:0x1db6, B:447:0x1dbc, B:448:0x1de5, B:359:0x1872, B:361:0x1878, B:362:0x18a1, B:259:0x1270, B:261:0x1276, B:262:0x12a3, B:70:0x06ae, B:72:0x06b4, B:73:0x06e2, B:19:0x01e0, B:21:0x01e6, B:22:0x020c, B:24:0x0480, B:26:0x04b2, B:27:0x050c), top: B:800:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2f43  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2f95  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2feb  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x31a1  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x3278  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x32ca  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x331a  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x34e4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:853:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x084d  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.simcard.SfcSimCardRemovedActivity.attachBaseContext(android.content.Context):void");
    }

    static {
        ShareDataUIState = 0;
        component3();
        int i = equals + 115;
        ShareDataUIState = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 29;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component3() {
        component1 = new char[]{2026, 2024, 1049, 2030, 1975, 2002, 2041, 1992, 2036, 1968, 2037, 2018, 2027, 1966, 2021, 1054, 1977, 2025, 2028, 2003, 1987, 1052, 2005, 2016, 2020, 1969, 1974, 2000, 2038, 1972, 2029, 2022, 1965, 2035, 1970, 1985, 2032, 1048, 2019, 1973, 2017, 2023, 2034, 1976, 1051, 2031, 1971, 1050, 1055};
        component3 = (char) 12829;
        copydefault = new char[]{3095, 30463, 63964, 31921, 59269, 27292, 60792, 20489, 56111, 24089, 49408, 19381, 52963, 12718, 46240, 16278, 41584, 9544, 43068, 4906, 38446, 6381, 33758, 1746, 35263, 3229, 39194, 58277, 27780, 59816, 29393, 65487, 30834, 50511, 20083, 51975, 21579, 57007, 23446, 42227, 8636, 43716, 14185, 45085, 15728, 34411, 790, 36283, 5783, 37855, 7399, 39372, 57963, 28434, 59485, 30001, 65039, 30948, 50686, 20189, 52197, 21727, 53557, 23073, 42834, 8235, 44373, 14256, 45229, 15747, 34555, 983, 36045, 2416, 21882, 12235, 41141, 9676, 48868, 13311, 46145, 2426, 33346, 1841, 39039, 4753, 38821, 26821, 60809, 26274, 64267, 31791, 61774, 18959, 53108, 16861, 55970, 24506, 53464, 21924, 11866, 41766, 9274, 47451, 12908, 46291, 2456, 33463, 1925, 39103, 7505, 38479, 27443, 60442, 24883, 64399, 31895, 61876, 19098, 53222, 16639, 50448, 24188, 54093, 21559, 10543, 41875, 9379, 47508, 13009, 47094, 2068, 36135, 1613, 39775, 7290, 38540, 27560, 3102, 30437, 63948, 31923, 59289, 27343, 60723, 20488, 56184, 24156, 49480, 19372, 52881, 12715, 46304, 16330, 41527, 9495, 43130, 4961, 38478, 6322, 33743, 1749, 35312, 3213, 30568, 64089, 32087, 57404, 27408, 60908, 20727, 56258, 24236, 49613, 17517, 53088, 12893, 46389, 14346, 41722, 9697, 43214, 5027, 38559, 6545, 39985, 1861, 35374, 3333, 28764, 64251, 32213, 57509, 27640, 61079, 20855, 54343, 24366, 49697, 17673, 53163, 13017, 46468, 14590, 41885, 9845, 43343, 11355, 38696, 6676, 3151, 30399, 63881, 31991, 59332, 27334, 3088, 30376, 63964, 31987, 59273, 27287, 60797, 20496, 56109, 24157, 49429, 19449, 52887, 12798, 46309, 16283, 41520, 9492, 43054, 4965, 38427, 6374, 33736, 1667, 35308, 3279, 30519, 64079, 32080, 57454, 27394, 60861, 20655, 56277, 24289, 49623, 17458, 53027, 12809, 46463, 14347, 41658, 9633, 43229, 5025, 38620, 6549, 39979, 1856, 35448, 3342, 28689, 64169, 32192, 57512, 27630, 61085, 20861, 54297, 24444, 49762, 17740, 53223, 13004, 9633, 24392, 53299, 21836, 52791, 17274, 50372, 31148, 62147, 30646, 59558, 25154, 59258, 6214, 40286, 5749, 35805, 3324, 33182, 14984, 49058, 12635, 43638, 12088, 40969, 9510, 24204, 54261, 21741, 51670, 17080, 50259, 31041, 62060, 30478, 59444, 28115, 59087, 7146, 40089, 4531, 35670, 3096, 33121, 14872, 48950, 12334, 46482, 12031, 41934, 9443, 22949, 54083, 21546, 51521, 16904, 51062, 30865, 65020, 30352, 60298, 27889, 58894, 7031, 3143, 30374, 63881, 31988, 59347, 27341, 60714, 20510, 56191, 24145, 49476, 3138, 30371, 63873, 31991, 59347, 27331, 60715, 20501, 56183, 24159, 49472};
        component2 = -5742681035855399279L;
    }
}
