package com.huawei.digitalpayment.consumer.sfcui.profile;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.biometric.BiometricManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.compose.FlowExtKt;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.baselibs2.utils.encrypt.EncryptManager;
import com.huawei.biometric.BiometricUtil;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivitySfcBiometricsSettingBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsOperator;
import com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState;
import com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsViewModel;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0014J\b\u0010 \u001a\u00020\u0016H\u0002J\u0012\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R+\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$²\u0006\n\u0010%\u001a\u00020\u001cX\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/SfcBiometricsSettingActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivitySfcBiometricsSettingBinding;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsViewModel;", "<init>", "()V", "biometricManager", "Landroidx/biometric/BiometricManager;", "<set-?>", "", "isBiometricAvailable", "()Z", "setBiometricAvailable", "(Z)V", "isBiometricAvailable$delegate", "Landroidx/compose/runtime/MutableState;", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "updateUi", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsSettingUiState;", "identifyPin", "initView", "onResume", "setupBiometrics", "initToolbar", "title", "", "ConsumerSfcUI_release", "uiState"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcBiometricsSettingActivity extends Hilt_SfcBiometricsSettingActivity<ActivitySfcBiometricsSettingBinding, BiometricsViewModel> {
    public static final int $stable = 8;
    private static int ShareDataUIState;
    private static char component1;
    private static char[] component2;
    private static char[] component3;
    private static boolean copydefault;
    private static long equals;
    private static boolean getAsAtTimestamp;
    private static int getSponsorBeneficiariesState;
    private BiometricManager biometricManager;

    private final MutableState isBiometricAvailable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
    private ActivityResultLauncher<Intent> launcher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component3 = 1;
        private static int copydefault;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 87;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            SfcBiometricsSettingActivity sfcBiometricsSettingActivity = this.f$0;
            ActivityResult activityResult = (ActivityResult) obj;
            if (i3 != 0) {
                SfcBiometricsSettingActivity.$r8$lambda$zA4Exa9yWOdWaywxbV_j28ES3i8(sfcBiometricsSettingActivity, activityResult);
                return;
            }
            SfcBiometricsSettingActivity.$r8$lambda$zA4Exa9yWOdWaywxbV_j28ES3i8(sfcBiometricsSettingActivity, activityResult);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });
    private static final byte[] $$l = {69, -50, 81, 75};
    private static final int $$o = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {Ascii.SI, -12, 105, 108, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63};
    private static final int $$t = 197;
    private static final byte[] $$d = {113, 46, 90, -12, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$e = 223;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int component4 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(int r6, byte r7, short r8) {
        /*
            int r7 = 119 - r7
            int r8 = r8 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.$$l
            int r6 = r6 * 3
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L28:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.$$r(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.$$d
            int r6 = r6 + 4
            int r7 = r7 * 2
            int r7 = r7 + 83
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r6 = r6 + 1
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.i(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 54 - r9
            int r7 = r7 * 2
            int r7 = r7 + 99
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.$$s
            int r8 = r8 * 33
            int r8 = r8 + 10
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r8
            r3 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2e:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-3)
            r9 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.k(byte, short, int, java.lang.Object[]):void");
    }

    public static final ViewModel access$getViewModel$p(SfcBiometricsSettingActivity sfcBiometricsSettingActivity) {
        int i = 2 % 2;
        int i2 = component4 + 63;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        VM vm = sfcBiometricsSettingActivity.viewModel;
        if (i3 == 0) {
            return vm;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$identifyPin(SfcBiometricsSettingActivity sfcBiometricsSettingActivity) {
        int i = 2 % 2;
        int i2 = component4 + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sfcBiometricsSettingActivity.identifyPin();
        if (i3 != 0) {
            int i4 = 43 / 0;
        }
        int i5 = component4 + 33;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final boolean access$isBiometricAvailable(SfcBiometricsSettingActivity sfcBiometricsSettingActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean zIsBiometricAvailable = sfcBiometricsSettingActivity.isBiometricAvailable();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = getRequestBeneficiariesState + 67;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return zIsBiometricAvailable;
    }

    public static final void access$updateUi(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, BiometricsSettingUiState biometricsSettingUiState) {
        int i = 2 % 2;
        int i2 = component4 + 45;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        sfcBiometricsSettingActivity.updateUi(biometricsSettingUiState);
        int i4 = component4 + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void launcher$lambda$0(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        String str = "";
        Intrinsics.checkNotNullParameter(sfcBiometricsSettingActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() != -1 || activityResult.getData() == null) {
            return;
        }
        int i2 = component4 + 71;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intent data = activityResult.getData();
        if ((data != null ? data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN2) : null) != null) {
            Intent data2 = activityResult.getData();
            if (data2 != null) {
                int i4 = getRequestBeneficiariesState + 53;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                String stringExtra = data2.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN2);
                if (stringExtra != null) {
                    str = stringExtra;
                }
            }
            ((BiometricsViewModel) sfcBiometricsSettingActivity.viewModel).dispatcherOperator(EncryptManager.INSTANCE.decrypt(str));
        }
    }

    @Override
    public int getLayoutId() {
        int i;
        int i2 = 2 % 2;
        int i3 = component4 + 43;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            i = R.layout.activity_sfc_biometrics_setting;
            int i4 = 20 / 0;
        } else {
            i = R.layout.activity_sfc_biometrics_setting;
        }
        int i5 = getRequestBeneficiariesState + 1;
        component4 = i5 % 128;
        int i6 = i5 % 2;
        return i;
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(equals ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 65;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(equals)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 33, (char) (63441 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) 0;
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 17 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 51269), -1883291598, false, $$r(b2, (byte) (b2 | Ascii.DLE), (byte) (-1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 75;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$initObserver$1", f = "SfcBiometricsSettingActivity.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$initObserver$1$1", f = "SfcBiometricsSettingActivity.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 0;
            private static int copydefault = 1;
            final SfcBiometricsSettingActivity ShareDataUIState;
            int component1;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "data", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/viewmodel/BiometricsSettingUiState;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$initObserver$1$1$1", f = "SfcBiometricsSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<BiometricsSettingUiState, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int component2;
                int component1;
                Object component3;
                final SfcBiometricsSettingActivity copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component1 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component2 + 117;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    SfcBiometricsSettingActivity.access$updateUi(this.copydefault, (BiometricsSettingUiState) this.component3);
                    Unit unit = Unit.INSTANCE;
                    int i4 = component2 + 95;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        return unit;
                    }
                    throw null;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.copydefault = sfcBiometricsSettingActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.copydefault, continuation);
                    anonymousClass5.component3 = obj;
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = ShareDataUIState + 115;
                    component2 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 50 / 0;
                    }
                    return anonymousClass52;
                }

                public final Object component2(BiometricsSettingUiState biometricsSettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 83;
                    ShareDataUIState = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(biometricsSettingUiState, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = ShareDataUIState + 33;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(BiometricsSettingUiState biometricsSettingUiState, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 99;
                    ShareDataUIState = i2 % 128;
                    BiometricsSettingUiState biometricsSettingUiState2 = biometricsSettingUiState;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component2(biometricsSettingUiState2, continuation2);
                    }
                    Object objComponent2 = component2(biometricsSettingUiState2, continuation2);
                    int i3 = 35 / 0;
                    return objComponent2;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component1;
                Object obj2 = null;
                if (i2 != 0) {
                    int i3 = copydefault + 115;
                    component2 = i3 % 128;
                    if (i3 % 2 == 0 ? i2 != 1 : i2 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i4 = copydefault + 81;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.component1 = 1;
                    if (FlowKt.collect(FlowKt.onEach(((BiometricsViewModel) SfcBiometricsSettingActivity.access$getViewModel$p(this.ShareDataUIState)).uiState(), new AnonymousClass5(this.ShareDataUIState, null)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i6 = component2 + 67;
                copydefault = i6 % 128;
                if (i6 % 2 != 0) {
                    return unit;
                }
                obj2.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.ShareDataUIState = sfcBiometricsSettingActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState, continuation);
                int i2 = component2 + 69;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 35 / 0;
                }
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 31;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent2 = component2(coroutineScope, continuation);
                int i4 = component2 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return objComponent2;
            }

            public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 37;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    return anonymousClass3.invokeSuspend(unit);
                }
                anonymousClass3.invokeSuspend(unit);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component3;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(SfcBiometricsSettingActivity.this, Lifecycle.State.STARTED, new AnonymousClass3(SfcBiometricsSettingActivity.this, null), this) == coroutine_suspended) {
                    int i3 = component1;
                    int i4 = i3 + 23;
                    ShareDataUIState = i4 % 128;
                    int i5 = i4 % 2;
                    int i6 = i3 + 125;
                    ShareDataUIState = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 69 / 0;
                    }
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = component1 + 115;
                ShareDataUIState = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = SfcBiometricsSettingActivity.this.new ShareDataUIState(continuation);
            int i2 = ShareDataUIState + 7;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 91;
            ShareDataUIState = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return copydefault(coroutineScope2, continuation2);
            }
            copydefault(coroutineScope2, continuation2);
            throw null;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 37;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class copydefault implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;

        public static final BiometricsSettingUiState copydefault(State state) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 123;
            component1 = i2 % 128;
            if (i2 % 2 == 0) {
                component2(state);
                throw null;
            }
            BiometricsSettingUiState biometricsSettingUiStateComponent2 = component2(state);
            int i3 = component1 + 77;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return biometricsSettingUiStateComponent2;
            }
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 79;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = ShareDataUIState + 125;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component3;
            final State<BiometricsSettingUiState> component2;
            final SfcBiometricsSettingActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component3 + 15;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component3(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 103;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component3(androidx.compose.runtime.Composer r8, int r9) {
                /*
                    r7 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    r9 = r9 & 11
                    if (r9 != r0) goto L24
                    int r9 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.component3
                    int r9 = r9 + 67
                    int r1 = r9 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.ShareDataUIState = r1
                    int r9 = r9 % r0
                    boolean r9 = r8.getSkipping()
                    if (r9 != 0) goto L20
                    int r9 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.ShareDataUIState
                    int r9 = r9 + 29
                    int r1 = r9 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.component3 = r1
                    int r9 = r9 % r0
                    goto L24
                L20:
                    r8.skipToGroupEnd()
                    goto L62
                L24:
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState> r9 = r7.component2
                    com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.copydefault(r9)
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity r9 = r7.copydefault
                    boolean r9 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.access$isBiometricAvailable(r9)
                    if (r9 == 0) goto L40
                    androidx.compose.runtime.State<com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState> r9 = r7.component2
                    com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState r9 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.copydefault(r9)
                    boolean r9 = r9.getShowFingerprintLogin()
                    if (r9 == 0) goto L40
                    r9 = 1
                    goto L4a
                L40:
                    int r9 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.component3
                    int r9 = r9 + 89
                    int r2 = r9 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.ShareDataUIState = r2
                    int r9 = r9 % r0
                    r9 = 0
                L4a:
                    r2 = r9
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$copydefault$2$2 r9 = new com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$copydefault$2$2
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity r3 = r7.copydefault
                    r9.<init>(r3)
                    r3 = r9
                    kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$initView$1$1$$ExternalSyntheticLambda0 r4 = new com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity$initView$1$1$$ExternalSyntheticLambda0
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity r9 = r7.copydefault
                    r4.<init>()
                    r6 = 8
                    r5 = r8
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingScreenKt.SfcBiometricsSettingScreen(r1, r2, r3, r4, r5, r6)
                L62:
                    int r8 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.ShareDataUIState
                    int r8 = r8 + 57
                    int r9 = r8 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.component3 = r9
                    int r8 = r8 % r0
                    if (r8 != 0) goto L6e
                    return
                L6e:
                    r8 = 0
                    r8.hashCode()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.copydefault.AnonymousClass2.component3(androidx.compose.runtime.Composer, int):void");
            }

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            final class C02862 extends FunctionReferenceImpl implements Function0<Unit> {
                private static int ShareDataUIState = 0;
                private static int component1 = 1;

                public final void ShareDataUIState() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 19;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ((SfcBiometricsSettingActivity) this.receiver).finish();
                    if (i3 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                @Override
                public Unit invoke() {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 83;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ShareDataUIState();
                    Unit unit = Unit.INSTANCE;
                    int i4 = ShareDataUIState + 37;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 48 / 0;
                    }
                    return unit;
                }

                C02862(Object obj) {
                    super(0, obj, SfcBiometricsSettingActivity.class, "finish", "finish()V", 0);
                }
            }

            private static final Unit component3(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, boolean z) {
                BiometricsOperator biometricsOperator;
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcBiometricsSettingActivity, "");
                if (BiometricUtil.isEnrolledBiometric()) {
                    BiometricsViewModel biometricsViewModel = (BiometricsViewModel) SfcBiometricsSettingActivity.access$getViewModel$p(sfcBiometricsSettingActivity);
                    if (z) {
                        int i2 = component3 + 29;
                        ShareDataUIState = i2 % 128;
                        int i3 = i2 % 2;
                        biometricsOperator = BiometricsOperator.OPEN_FINGERPRINT_LOGIN;
                    } else {
                        biometricsOperator = BiometricsOperator.CLOSE_FINGERPRINT_LOGIN;
                    }
                    biometricsViewModel.setOperator(biometricsOperator);
                    SfcBiometricsSettingActivity.access$identifyPin(sfcBiometricsSettingActivity);
                } else {
                    int i4 = ShareDataUIState + 111;
                    component3 = i4 % 128;
                    BiometricUtil.jumpSystemBiometricSetting(i4 % 2 == 0);
                }
                return Unit.INSTANCE;
            }

            public static Unit component2(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, boolean z) {
                int i = 2 % 2;
                int i2 = component3 + 55;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return component3(sfcBiometricsSettingActivity, z);
                }
                component3(sfcBiometricsSettingActivity, z);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            AnonymousClass2(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, State<BiometricsSettingUiState> state) {
                this.copydefault = sfcBiometricsSettingActivity;
                this.component2 = state;
            }
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component1 + 67;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0 && (i & 11) == 2) {
                if (!composer.getSkipping()) {
                    int i4 = component1 + 15;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 3 / 3;
                    }
                    OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1359115637, true, new AnonymousClass2(SfcBiometricsSettingActivity.this, FlowExtKt.collectAsStateWithLifecycle(((BiometricsViewModel) SfcBiometricsSettingActivity.access$getViewModel$p(SfcBiometricsSettingActivity.this)).uiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
                } else {
                    composer.skipToGroupEnd();
                }
            } else {
                OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1359115637, true, new AnonymousClass2(SfcBiometricsSettingActivity.this, FlowExtKt.collectAsStateWithLifecycle(((BiometricsViewModel) SfcBiometricsSettingActivity.access$getViewModel$p(SfcBiometricsSettingActivity.this)).uiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7)), composer, 54), composer, 1572864, 63);
            }
            int i6 = ShareDataUIState + 99;
            component1 = i6 % 128;
            if (i6 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static final BiometricsSettingUiState component2(State<BiometricsSettingUiState> state) {
            int i = 2 % 2;
            int i2 = component1 + 35;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            BiometricsSettingUiState value = state.getValue();
            int i4 = component1 + 97;
            ShareDataUIState = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        copydefault() {
        }
    }

    private static void g(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr3 = component3;
        int i5 = 1;
        int i6 = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i7 = $11 + 69;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 103;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                try {
                    Object[] objArr2 = new Object[i5];
                    objArr2[i6] = Integer.valueOf(cArr3[i9]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i6;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(3760 - TextUtils.getTrimmedLength(""), TextUtils.indexOf((CharSequence) "", '0', i6) + 25, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1670574543, false, $$r(b2, (byte) (b2 | TarHeader.LF_CHR), (byte) (-1)), new Class[]{Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i9++;
                    i3 = 2;
                    i5 = 1;
                    i6 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 7139, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i12 = 689978476;
            if (getAsAtTimestamp) {
                cancelVar.component1 = bArr.length;
                char[] cArr5 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr5[cancelVar.component3] = (char) (cArr3[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i12);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (char) (7644 - Drawable.resolveOpacity(0, 0)), -327556343, false, $$r(b3, (byte) (b3 | 46), (byte) (-1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i12 = 689978476;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!(!copydefault)) {
                int i13 = $11 + 77;
                $10 = i13 % 128;
                if (i13 % 2 != 0) {
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 1;
                } else {
                    cancelVar.component1 = cArr.length;
                    cArr2 = new char[cancelVar.component1];
                    i2 = 0;
                }
                cancelVar.component3 = i2;
                while (cancelVar.component3 < cancelVar.component1) {
                    cArr2[cancelVar.component3] = (char) (cArr3[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    Object[] objArr5 = {cancelVar, cancelVar};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                    if (objCopydefault4 == null) {
                        byte b4 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 2748, (Process.myTid() >> 22) + 19, (char) (7644 - TextUtils.getTrimmedLength("")), -327556343, false, $$r(b4, (byte) (b4 | 46), (byte) (-1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr2);
                return;
            }
            int i14 = 0;
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            while (true) {
                cancelVar.component3 = i14;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i15 = $10 + 31;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 >> 1) - cancelVar.component3] + i] >>> iIntValue);
                        cancelVar.component3 = cancelVar.component3;
                    }
                }
                objArr[0] = new String(cArr6);
                return;
                cArr6[cancelVar.component3] = (char) (cArr3[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                i14 = cancelVar.component3 + 1;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isBiometricAvailable() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        boolean zBooleanValue = ((Boolean) this.isBiometricAvailable.getValue()).booleanValue();
        int i4 = getRequestBeneficiariesState + 33;
        component4 = i4 % 128;
        if (i4 % 2 != 0) {
            return zBooleanValue;
        }
        throw null;
    }

    private final void setBiometricAvailable(boolean z) {
        int i = 2 % 2;
        int i2 = component4 + 91;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            this.isBiometricAvailable.setValue(Boolean.valueOf(z));
            int i3 = 71 / 0;
        } else {
            this.isBiometricAvailable.setValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void j(byte r31, int r32, char[] r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.j(byte, int, char[], java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.onCreate(android.os.Bundle):void");
    }

    private final void initObserver() {
        int i = 2 % 2;
        Object obj = null;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(this), null, null, new ShareDataUIState(null), 3, null);
        int i2 = getRequestBeneficiariesState + 25;
        component4 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateUi(com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState r7) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.updateUi(com.huawei.digitalpayment.consumer.sfcui.profile.viewmodel.BiometricsSettingUiState):void");
    }

    private final void identifyPin() {
        int i = 2 % 2;
        Bundle bundle = new Bundle(2);
        bundle.putString("titleText", getString(R.string.biometrics));
        bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.icon_biometrics_finger);
        bundle.putBoolean("showBiometric", false);
        RouteUtils.routeWithExecute(this, "/sfcModule/identityPin", bundle, this.launcher);
        int i2 = getRequestBeneficiariesState + 7;
        component4 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 12 / 0;
        }
    }

    private final void initView() {
        int i = 2 % 2;
        ((ActivitySfcBiometricsSettingBinding) this.binding).composeScreen.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        ((ActivitySfcBiometricsSettingBinding) this.binding).composeScreen.setContent(ComposableLambdaKt.composableLambdaInstance(-1280447816, true, new copydefault()));
        int i2 = getRequestBeneficiariesState + 45;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupBiometrics() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.getRequestBeneficiariesState
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.component4 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1e
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            androidx.biometric.BiometricManager r1 = androidx.biometric.BiometricManager.from(r1)
            r5.biometricManager = r1
            r3 = 20
            int r3 = r3 / r2
            if (r1 != 0) goto L40
            goto L29
        L1e:
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            androidx.biometric.BiometricManager r1 = androidx.biometric.BiometricManager.from(r1)
            r5.biometricManager = r1
            if (r1 != 0) goto L40
        L29:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.getRequestBeneficiariesState
            int r1 = r1 + 87
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.component4 = r3
            int r1 = r1 % r0
            r3 = 0
            java.lang.String r4 = ""
            if (r1 == 0) goto L3c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r3
            goto L40
        L3c:
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            throw r3
        L40:
            r3 = 255(0xff, float:3.57E-43)
            int r1 = r1.canAuthenticate(r3)
            if (r1 != 0) goto L4a
            r2 = 1
            goto L53
        L4a:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.component4
            int r1 = r1 + 27
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
        L53:
            r5.setBiometricAvailable(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.setupBiometrics():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = getRequestBeneficiariesState + 81;
            component4 = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            g(null, 127 - (KeyEvent.getMaxKeyCode() >> 16), new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            g(null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952785_res_0x7f130491).substring(2, 3).codePointAt(0) + 95, new byte[]{-126, -123, -122, -114, -127, -118, -122, -108, -116, -116, -115, -114, -126, -117, -124, -124, -109, -118}, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = getRequestBeneficiariesState + 123;
                component4 = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 6618, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 41, (char) Color.blue(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 6563, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 56, (char) KeyEvent.keyCodeFromString(""), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(52:0|2|(2:(2:9|(1:15)(1:14))(1:16)|(9:18|902|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|840|32|(2:871|34)|38|39|812|(5:41|42|(1:44)|45|46)(21:47|48|824|49|(2:832|51)|55|56|813|57|(2:849|59)|63|64|65|(1:67)|68|69|70|(1:72)|73|(1:75)|76)|77|(4:81|(3:915|83|918)(12:913|84|(3:86|(3:89|90|87)|919)|91|903|92|(1:94)|95|96|894|97|917)|916|78)|914|80|138|817|139|(1:141)|142|143|(4:145|146|(1:148)|149)(19:150|151|909|152|(1:154)|155|156|898|157|(1:159)|160|161|162|(1:164)|165|(1:167)|168|(1:170)|171)|172|(4:175|(3:922|177|925)(12:920|178|(3:180|(4:183|(3:928|185|931)(4:927|186|187|930)|929|181)|926)|188|887|189|(1:191)|192|193|881|194|924)|923|173)|921|229|826|230|(2:834|232)|237|(1:239)|240|241|(16:(1:891)|(5:243|244|(1:246)|247|248)(31:249|(3:843|251|(1:257)(1:256))(1:261)|(28:822|263|264|815|265|266|267|268|269|270|271|905|272|(2:866|274)|278|279|892|280|(2:889|282)|286|287|288|(2:290|291)|292|(2:294|295)(1:297)|298|(2:300|301)|302)|353|369|856|370|(3:372|900|373)|378|379|842|(5:381|382|(1:384)|385|386)(19:388|389|852|390|391|845|392|(2:879|394)|398|399|400|(3:402|860|403)|407|408|409|(1:411)(1:412)|413|(1:415)|416)|387|417|(9:420|830|421|(1:423)|424|425|426|820|427)|(3:878|466|(1:472)(1:471))(1:476)|477|864|478|(1:480)|481|858|482|(1:484)|485|509|(1:511)|512|(3:514|(1:516)|517)(14:518|519|(1:521)|522|523|(1:525)|526|911|527|528|(1:530)(1:531)|532|(1:534)|535)|536|(9:538|(1:540)|541|(1:543)|544|(3:546|(1:548)|549)(16:551|552|(1:554)|555|(1:557)|558|559|(1:561)|562|828|563|564|(1:566)|567|(1:569)|570)|550|571|(25:573|868|574|(1:576)|577|(1:579)|580|(3:582|(1:584)|585)(17:586|(2:588|(1:594)(1:593))|(19:596|597|862|598|(1:600)|601|602|854|603|(1:605)|606|607|608|(1:610)|611|(1:613)|614|(1:616)|617)|677|(1:679)|680|(2:682|(4:684|(1:686)|687|688)(3:689|(1:691)|692))(13:694|876|695|696|(1:698)|699|810|700|701|(1:703)|704|(1:706)|707)|693|708|(6:711|712|(1:714)|715|716|717)|718|(1:720)|721|(3:723|(1:725)|726)(14:728|729|(1:731)|732|733|(1:735)|736|818|737|738|(1:740)|741|(1:743)|744)|727|745|(1:950)(7:748|749|(1:751)|752|753|754|755))|618|(4:621|(3:942|623|(3:939|625|946)(12:936|629|(3:631|(3:634|635|632)|947)|636|847|637|(1:639)|640|641|836|642|945))(3:938|626|(3:940|628|944)(12:941|629|(0)|636|847|637|(0)|640|641|836|642|945))|943|619)|937|677|(0)|680|(0)(0)|693|708|(0)|718|(0)|721|(0)(0)|727|745|(0)(0))(10:765|(3:767|(2:770|768)|948)|771|772|(1:774)|775|(1:777)|778|779|780))(10:783|(3:785|(2:788|786)|949)|789|790|(1:792)|793|(1:795)|796|797|798))|864|478|(0)|481|858|482|(0)|485|509|(0)|512|(0)(0)|536|(0)(0))|303|(4:306|(2:308|934)(11:309|(3:311|(3:314|315|312)|935)|316|883|317|(1:319)|320|321|872|322|933)|323|304)|932|353|369|856|370|(0)|378|379|842|(0)(0)|387|417|(0)|(0)(0)|477|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x183c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x183d, code lost:
    
        r8 = r8;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x184c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x184d, code lost:
    
        r11 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x18bc, code lost:
    
        r3 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6618 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 42 - android.widget.ExpandableListView.getPackedPositionGroup(0), (char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0852 A[Catch: all -> 0x0394, TryCatch #50 {all -> 0x0394, blocks: (B:363:0x1416, B:365:0x141c, B:366:0x1446, B:459:0x18b6, B:461:0x18bc, B:462:0x18e6, B:712:0x2cf6, B:714:0x2cfc, B:715:0x2d26, B:749:0x303b, B:751:0x3041, B:752:0x3068, B:729:0x2e72, B:731:0x2e95, B:732:0x2ee5, B:671:0x296d, B:673:0x2973, B:674:0x299a, B:772:0x3137, B:774:0x313d, B:775:0x3167, B:777:0x31a1, B:778:0x31e1, B:552:0x2100, B:554:0x2115, B:555:0x2144, B:557:0x2178, B:558:0x21f4, B:790:0x32a8, B:792:0x32ae, B:793:0x32d7, B:795:0x3311, B:796:0x3350, B:519:0x1cd0, B:521:0x1ce5, B:522:0x1d16, B:503:0x1ac2, B:505:0x1ac8, B:506:0x1af0, B:223:0x0da8, B:225:0x0dae, B:226:0x0dda, B:132:0x084c, B:134:0x0852, B:135:0x087e, B:19:0x0198, B:21:0x019e, B:22:0x01ca, B:24:0x0307, B:26:0x0338, B:27:0x038e), top: B:902:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x141c A[Catch: all -> 0x0394, TryCatch #50 {all -> 0x0394, blocks: (B:363:0x1416, B:365:0x141c, B:366:0x1446, B:459:0x18b6, B:461:0x18bc, B:462:0x18e6, B:712:0x2cf6, B:714:0x2cfc, B:715:0x2d26, B:749:0x303b, B:751:0x3041, B:752:0x3068, B:729:0x2e72, B:731:0x2e95, B:732:0x2ee5, B:671:0x296d, B:673:0x2973, B:674:0x299a, B:772:0x3137, B:774:0x313d, B:775:0x3167, B:777:0x31a1, B:778:0x31e1, B:552:0x2100, B:554:0x2115, B:555:0x2144, B:557:0x2178, B:558:0x21f4, B:790:0x32a8, B:792:0x32ae, B:793:0x32d7, B:795:0x3311, B:796:0x3350, B:519:0x1cd0, B:521:0x1ce5, B:522:0x1d16, B:503:0x1ac2, B:505:0x1ac8, B:506:0x1af0, B:223:0x0da8, B:225:0x0dae, B:226:0x0dda, B:132:0x084c, B:134:0x0852, B:135:0x087e, B:19:0x0198, B:21:0x019e, B:22:0x01ca, B:24:0x0307, B:26:0x0338, B:27:0x038e), top: B:902:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x14ce  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x1527  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x157f A[Catch: all -> 0x184c, TRY_ENTER, TRY_LEAVE, TryCatch #25 {all -> 0x184c, blocks: (B:370:0x14c8, B:378:0x151a, B:388:0x157f), top: B:856:0x14c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:420:0x1749  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x18bc A[Catch: all -> 0x0394, TryCatch #50 {all -> 0x0394, blocks: (B:363:0x1416, B:365:0x141c, B:366:0x1446, B:459:0x18b6, B:461:0x18bc, B:462:0x18e6, B:712:0x2cf6, B:714:0x2cfc, B:715:0x2d26, B:749:0x303b, B:751:0x3041, B:752:0x3068, B:729:0x2e72, B:731:0x2e95, B:732:0x2ee5, B:671:0x296d, B:673:0x2973, B:674:0x299a, B:772:0x3137, B:774:0x313d, B:775:0x3167, B:777:0x31a1, B:778:0x31e1, B:552:0x2100, B:554:0x2115, B:555:0x2144, B:557:0x2178, B:558:0x21f4, B:790:0x32a8, B:792:0x32ae, B:793:0x32d7, B:795:0x3311, B:796:0x3350, B:519:0x1cd0, B:521:0x1ce5, B:522:0x1d16, B:503:0x1ac2, B:505:0x1ac8, B:506:0x1af0, B:223:0x0da8, B:225:0x0dae, B:226:0x0dda, B:132:0x084c, B:134:0x0852, B:135:0x087e, B:19:0x0198, B:21:0x019e, B:22:0x01ca, B:24:0x0307, B:26:0x0338, B:27:0x038e), top: B:902:0x0198 }] */
    /* JADX WARN: Removed duplicated region for block: B:476:0x197c  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x1993 A[Catch: all -> 0x1a59, TryCatch #29 {all -> 0x1a59, blocks: (B:478:0x197e, B:480:0x1993, B:481:0x19c6), top: B:864:0x197e, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x19d9 A[Catch: all -> 0x1a4f, TryCatch #26 {all -> 0x1a4f, blocks: (B:482:0x19cc, B:484:0x19d9, B:485:0x1a47), top: B:858:0x19cc, outer: #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x1b76  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1bc4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x1cb0  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x1e4f  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x27d2  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2808 A[Catch: all -> 0x28c2, TryCatch #20 {all -> 0x28c2, blocks: (B:637:0x2802, B:639:0x2808, B:640:0x2837), top: B:847:0x2802, outer: #31 }] */
    /* JADX WARN: Removed duplicated region for block: B:679:0x2a22  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2a72  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x2b29  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x2cd7  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x2db0  */
    /* JADX WARN: Removed duplicated region for block: B:723:0x2e03  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x2e54  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x301c  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x3266  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x016b A[PHI: r10
  0x016b: PHI (r10v303 ??) = (r10v12 ??), (r10v10 ??) binds: [B:17:0x0193, B:5:0x0168] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:878:0x1962 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:950:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [int] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v262 */
    /* JADX WARN: Type inference failed for: r10v263 */
    /* JADX WARN: Type inference failed for: r10v264 */
    /* JADX WARN: Type inference failed for: r10v265 */
    /* JADX WARN: Type inference failed for: r10v266 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v284 */
    /* JADX WARN: Type inference failed for: r10v285 */
    /* JADX WARN: Type inference failed for: r10v286 */
    /* JADX WARN: Type inference failed for: r10v287 */
    /* JADX WARN: Type inference failed for: r10v288 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v300 */
    /* JADX WARN: Type inference failed for: r10v301 */
    /* JADX WARN: Type inference failed for: r10v303 */
    /* JADX WARN: Type inference failed for: r10v304 */
    /* JADX WARN: Type inference failed for: r10v305 */
    /* JADX WARN: Type inference failed for: r10v306 */
    /* JADX WARN: Type inference failed for: r10v307 */
    /* JADX WARN: Type inference failed for: r10v308 */
    /* JADX WARN: Type inference failed for: r10v309 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v310 */
    /* JADX WARN: Type inference failed for: r10v311 */
    /* JADX WARN: Type inference failed for: r10v312 */
    /* JADX WARN: Type inference failed for: r10v313 */
    /* JADX WARN: Type inference failed for: r10v314 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r11v58 */
    /* JADX WARN: Type inference failed for: r11v62 */
    /* JADX WARN: Type inference failed for: r11v63 */
    /* JADX WARN: Type inference failed for: r11v64 */
    /* JADX WARN: Type inference failed for: r11v65 */
    /* JADX WARN: Type inference failed for: r11v66 */
    /* JADX WARN: Type inference failed for: r11v67 */
    /* JADX WARN: Type inference failed for: r11v68 */
    /* JADX WARN: Type inference failed for: r11v69 */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Type inference failed for: r11v71 */
    /* JADX WARN: Type inference failed for: r11v72 */
    /* JADX WARN: Type inference failed for: r11v73 */
    /* JADX WARN: Type inference failed for: r11v74 */
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
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v82 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v89 */
    /* JADX WARN: Type inference failed for: r15v90 */
    /* JADX WARN: Type inference failed for: r15v91 */
    /* JADX WARN: Type inference failed for: r15v92 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r15v97 */
    /* JADX WARN: Type inference failed for: r15v98 */
    /* JADX WARN: Type inference failed for: r15v99 */
    /* JADX WARN: Type inference failed for: r1v402 */
    /* JADX WARN: Type inference failed for: r1v408 */
    /* JADX WARN: Type inference failed for: r1v409 */
    /* JADX WARN: Type inference failed for: r1v422, types: [int] */
    /* JADX WARN: Type inference failed for: r1v423 */
    /* JADX WARN: Type inference failed for: r1v424 */
    /* JADX WARN: Type inference failed for: r1v425 */
    /* JADX WARN: Type inference failed for: r1v426 */
    /* JADX WARN: Type inference failed for: r1v427 */
    /* JADX WARN: Type inference failed for: r1v428 */
    /* JADX WARN: Type inference failed for: r1v435 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v527 */
    /* JADX WARN: Type inference failed for: r1v528 */
    /* JADX WARN: Type inference failed for: r1v529 */
    /* JADX WARN: Type inference failed for: r1v530 */
    /* JADX WARN: Type inference failed for: r1v531 */
    /* JADX WARN: Type inference failed for: r1v532 */
    /* JADX WARN: Type inference failed for: r1v533 */
    /* JADX WARN: Type inference failed for: r1v534 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v174 */
    /* JADX WARN: Type inference failed for: r25v175 */
    /* JADX WARN: Type inference failed for: r25v176 */
    /* JADX WARN: Type inference failed for: r25v177 */
    /* JADX WARN: Type inference failed for: r25v178 */
    /* JADX WARN: Type inference failed for: r25v76 */
    /* JADX WARN: Type inference failed for: r25v78 */
    /* JADX WARN: Type inference failed for: r25v80 */
    /* JADX WARN: Type inference failed for: r25v81 */
    /* JADX WARN: Type inference failed for: r25v82 */
    /* JADX WARN: Type inference failed for: r25v83 */
    /* JADX WARN: Type inference failed for: r25v84 */
    /* JADX WARN: Type inference failed for: r25v86 */
    /* JADX WARN: Type inference failed for: r25v87 */
    /* JADX WARN: Type inference failed for: r25v92 */
    /* JADX WARN: Type inference failed for: r25v93 */
    /* JADX WARN: Type inference failed for: r25v94 */
    /* JADX WARN: Type inference failed for: r25v95 */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v530, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v534 */
    /* JADX WARN: Type inference failed for: r3v648 */
    /* JADX WARN: Type inference failed for: r3v649 */
    /* JADX WARN: Type inference failed for: r3v662, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r3v671 */
    /* JADX WARN: Type inference failed for: r3v739, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v816 */
    /* JADX WARN: Type inference failed for: r3v817 */
    /* JADX WARN: Type inference failed for: r4v625, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r7v398 */
    /* JADX WARN: Type inference failed for: r8v100 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v107 */
    /* JADX WARN: Type inference failed for: r8v119 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v131, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v134 */
    /* JADX WARN: Type inference failed for: r8v145 */
    /* JADX WARN: Type inference failed for: r8v146 */
    /* JADX WARN: Type inference failed for: r8v147 */
    /* JADX WARN: Type inference failed for: r8v149, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v159 */
    /* JADX WARN: Type inference failed for: r8v160 */
    /* JADX WARN: Type inference failed for: r8v161 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v173 */
    /* JADX WARN: Type inference failed for: r8v174 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v185 */
    /* JADX WARN: Type inference failed for: r8v187 */
    /* JADX WARN: Type inference failed for: r8v195 */
    /* JADX WARN: Type inference failed for: r8v196 */
    /* JADX WARN: Type inference failed for: r8v197 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r8v204, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v214 */
    /* JADX WARN: Type inference failed for: r8v222 */
    /* JADX WARN: Type inference failed for: r8v223 */
    /* JADX WARN: Type inference failed for: r8v224 */
    /* JADX WARN: Type inference failed for: r8v230, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v238 */
    /* JADX WARN: Type inference failed for: r8v239 */
    /* JADX WARN: Type inference failed for: r8v240 */
    /* JADX WARN: Type inference failed for: r8v241 */
    /* JADX WARN: Type inference failed for: r8v242 */
    /* JADX WARN: Type inference failed for: r8v243 */
    /* JADX WARN: Type inference failed for: r8v244 */
    /* JADX WARN: Type inference failed for: r8v245 */
    /* JADX WARN: Type inference failed for: r8v246 */
    /* JADX WARN: Type inference failed for: r8v247 */
    /* JADX WARN: Type inference failed for: r8v248 */
    /* JADX WARN: Type inference failed for: r8v249 */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v250 */
    /* JADX WARN: Type inference failed for: r8v251 */
    /* JADX WARN: Type inference failed for: r8v252 */
    /* JADX WARN: Type inference failed for: r8v253 */
    /* JADX WARN: Type inference failed for: r8v254 */
    /* JADX WARN: Type inference failed for: r8v255 */
    /* JADX WARN: Type inference failed for: r8v256 */
    /* JADX WARN: Type inference failed for: r8v257 */
    /* JADX WARN: Type inference failed for: r8v258 */
    /* JADX WARN: Type inference failed for: r8v259 */
    /* JADX WARN: Type inference failed for: r8v260 */
    /* JADX WARN: Type inference failed for: r8v261 */
    /* JADX WARN: Type inference failed for: r8v262 */
    /* JADX WARN: Type inference failed for: r8v263 */
    /* JADX WARN: Type inference failed for: r8v264 */
    /* JADX WARN: Type inference failed for: r8v265 */
    /* JADX WARN: Type inference failed for: r8v266 */
    /* JADX WARN: Type inference failed for: r8v267 */
    /* JADX WARN: Type inference failed for: r8v268 */
    /* JADX WARN: Type inference failed for: r8v269 */
    /* JADX WARN: Type inference failed for: r8v270 */
    /* JADX WARN: Type inference failed for: r8v271 */
    /* JADX WARN: Type inference failed for: r8v272 */
    /* JADX WARN: Type inference failed for: r8v273 */
    /* JADX WARN: Type inference failed for: r8v274 */
    /* JADX WARN: Type inference failed for: r8v275 */
    /* JADX WARN: Type inference failed for: r8v276 */
    /* JADX WARN: Type inference failed for: r8v277 */
    /* JADX WARN: Type inference failed for: r8v278 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v32, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v90 */
    /* JADX WARN: Type inference failed for: r8v91 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v98, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.SfcBiometricsSettingActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$zA4Exa9yWOdWaywxbV_j28ES3i8(SfcBiometricsSettingActivity sfcBiometricsSettingActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 41;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$0(sfcBiometricsSettingActivity, activityResult);
        if (i3 == 0) {
            throw null;
        }
        int i4 = component4 + 43;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
    }

    static {
        getSponsorBeneficiariesState = 1;
        component2();
        component3();
        int i = copy + 53;
        getSponsorBeneficiariesState = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        component4 = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 123;
        component4 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 55;
        component4 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = component4 + 3;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            component2 = new char[]{2034, 2038, 2022, 1966, 2036, 2033, 2021, 1956, 2000, 1989, 2017, 2030, 1970, 2041, 1996, 2019, 2037, 1990, 2018, 2023, 2020, 2003, 2025, 1995, 2031, 2028, 1986, 2032, 2035, 2029, 1987, 2040, 2039, 2024, 1969, 2026};
            component1 = (char) 12828;
        } else {
            component2 = new char[]{2034, 2038, 2022, 1966, 2036, 2033, 2021, 1956, 2000, 1989, 2017, 2030, 1970, 2041, 1996, 2019, 2037, 1990, 2018, 2023, 2020, 2003, 2025, 1995, 2031, 2028, 1986, 2032, 2035, 2029, 1987, 2040, 2039, 2024, 1969, 2026};
            component1 = (char) 12828;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    static void component2() {
        component3 = new char[]{30248, 30239, 30245, 30235, 30238, 30240, 30431, 30234, 30265, 30250, 30244, 30233, 30408, 30229, 30231, 30224, 30261, 30241, 30228, 30237, 30416, 30424, 30247, 30423, 30422, 30425, 30426, 30251, 30420, 30421, 30417, 30427, 30243, 30246, 30266, 30236, 30401, 30410};
        ShareDataUIState = 321287817;
        copydefault = true;
        getAsAtTimestamp = true;
        equals = -1438065412994930267L;
    }
}
