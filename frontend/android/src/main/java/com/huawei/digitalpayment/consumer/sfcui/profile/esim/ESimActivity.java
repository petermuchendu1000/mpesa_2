package com.huawei.digitalpayment.consumer.sfcui.profile.esim;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.commonability.device.jsapi.system.field.group.WindowInfoFieldGroup;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.blankj.utilcode.util.ToastUtils;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.exception.BaseException;
import com.huawei.common.listener.ApiCallback;
import com.huawei.digitalpayment.consumer.base.sms.SmsAutoFill;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.sfc.R;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityESimBinding;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.aboutactivation.AboutActivationFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.completion.CompletionFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.confirmation.ConfirmationFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.dashboard.ESimDashboardFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.emailaddress.EmailAddressFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.esimerror.ESimErrorFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.getphonenumber.GetPhoneNumberFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.onboarding.OnboardingFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.otpvalidation.OtpValidationFragment;
import com.huawei.digitalpayment.consumer.sfcui.profile.esim.util.ESimScreen;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.safaricom.sharedui.compose.navigation.ScreenDirection;
import com.safaricom.sharedui.compose.navigation.ScreenInformation;
import com.safaricom.sharedui.compose.utils.FragmentExtensionsKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceStub;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.addOnMultiWindowModeChangedListener;
import kotlin.collections.CollectionsKt;
import kotlin.getFullyDrawnReporter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0016\u0010\u001f\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "binding", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityESimBinding;", "eSimViewModel", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimViewModel;", "getESimViewModel", "()Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimViewModel;", "eSimViewModel$delegate", "Lkotlin/Lazy;", "requestPhoneStatePermission", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "pinLauncher", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "observeScreenTransition", "observeEsimSupport", "checkTelephonyPermissionAndUpdateEsimSupport", "registerSmsAutoFill", "checkEsimHardwareSupportedInternal", "", "setWindowInsets", "showIdentifyPinActivity", "reserveEsimRequest", "changeScreen", "screenInformation", "Lcom/safaricom/sharedui/compose/navigation/ScreenInformation;", "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "Companion", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class ESimActivity extends Hilt_ESimActivity {
    public static final int $stable;

    public static final Companion INSTANCE;
    public static final String ESIM_IDENTITY_IMAGE_KEY = "imageLink";
    public static final String ESIM_IDENTITY_TITLE_KEY = "titleText";
    private static char ShareDataUIState;
    private static int component1;
    private static char component2;
    private static char component3;
    private static char[] component4;
    private static char copydefault;
    private static long equals;
    private static int hashCode;
    private ActivityESimBinding binding;

    private final Lazy eSimViewModel;
    private static final byte[] $$c = {5, -4, -80, 1};
    private static final int $$f = 156;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {32, 13, -54, -47, Ascii.SI, 1, -60, 72, -15, 8, -2, 20, -6, -3, Ascii.SI, 1, -60, 72, -8, -4, 20, -10, 2, 20, -9, -56, 56, Ascii.SI, 1, 6, 2, 7, -11, -52, 56, Ascii.SI, 2, -5, 6, Ascii.FF, -2, -9, Ascii.SYN, -8, 9, 2, -61, Ascii.CAN, 47, 2, -5, 6, Ascii.FF, -2, -33, 40, -5, Ascii.FF, -35, 46, -12, Ascii.VT, -70, 32, 37, 20, -8, 9, 2, -40, 40, 4, 10, -73, 34, TarHeader.LF_SYMLINK, -10, -1, Ascii.SYN, -2, 6, Ascii.CAN, -4, 20, -10, -30, 32, Ascii.SYN, -16, -9, -9, 13, 36, -16, Ascii.SYN, -12, Ascii.SI, 1, 6, 2, 2, -6, Ascii.FF, 9, -62, Ascii.SI, 1, -60, TarHeader.LF_FIFO, Ascii.SO, 0, -4, 2, 4, 2, -48, TarHeader.LF_FIFO, 20, -6, Ascii.DLE, -14, Ascii.DLE, -65, 71, -10, 17, -1, 9, 0, -12, 5, -52, 71, 6, -4, 9, -8, 7, -5, -52, 39, 38, -4, 9, -8, 7, -5, -12, Ascii.DC2, Ascii.DLE, 4, -7, 9, 2, -40, 40, 0, 1, Ascii.VT, -3, Ascii.DLE, Ascii.SI, 4, Ascii.FF, -18, 4, 4, -2, Ascii.ETB, -6, Ascii.VT};
    private static final int $$h = 41;
    private static final byte[] $$a = {111, -17, Ascii.VT, -125, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 210;
    private static int getAsAtTimestamp = 0;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private final ActivityResultLauncher<String[]> requestPhoneStatePermission = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() {
        private static int ShareDataUIState = 1;
        private static int copydefault;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 85;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            ESimActivity.$r8$lambda$xazZCtAD03D74sjh3tv2VoebyBU(this.f$0, (Map) obj);
            int i4 = ShareDataUIState + 83;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }
    });
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 37;
            ShareDataUIState = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                ESimActivity.m11666$r8$lambda$Z_F0T1LO0vnwK5GlQOidIeOtU(this.f$0, (ActivityResult) obj);
                throw null;
            }
            ESimActivity.m11666$r8$lambda$Z_F0T1LO0vnwK5GlQOidIeOtU(this.f$0, (ActivityResult) obj);
            int i3 = component3 + 69;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj2.hashCode();
            throw null;
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component3 implements Observer, FunctionAdapter {
        private static int component2 = 1;
        private static int copydefault;
        private final Function1 component3;

        component3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.component3 = function1;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            if (!(obj instanceof Observer)) {
                return false;
            }
            int i2 = copydefault + 13;
            int i3 = i2 % 128;
            component2 = i3;
            if (i2 % 2 == 0) {
                int i4 = 26 / 0;
                if (!(obj instanceof FunctionAdapter)) {
                    return false;
                }
            } else if (!(obj instanceof FunctionAdapter)) {
                return false;
            }
            int i5 = i3 + 17;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = copydefault + 81;
            int i3 = i2 % 128;
            component2 = i3;
            int i4 = i2 % 2;
            Function1 function1 = this.component3;
            int i5 = i3 + 7;
            copydefault = i5 % 128;
            if (i5 % 2 == 0) {
                return function1;
            }
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component2 + 39;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                getFunctionDelegate().hashCode();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int iHashCode = getFunctionDelegate().hashCode();
            int i3 = copydefault + 9;
            component2 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 49 / 0;
            }
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 61;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                this.component3.invoke(obj);
                throw null;
            }
            this.component3.invoke(obj);
            int i3 = component2 + 93;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, int r7, int r8) {
        /*
            int r8 = r8 + 65
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.$$c
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r5 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r3 = r0[r7]
        L24:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.$$i(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 100 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.$$a
            int r1 = 28 - r8
            int r7 = r7 * 2
            int r7 = 103 - r7
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            int r7 = r7 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 10
            int r8 = r8 * 16
            int r8 = 99 - r8
            int r7 = 160 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.$$g
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r6
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-3)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.d(short, short, int, java.lang.Object[]):void");
    }

    public static final ESimViewModel access$getESimViewModel(ESimActivity eSimActivity) {
        int i = 2 % 2;
        int i2 = copy + 71;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return eSimActivity.getESimViewModel();
        }
        eSimActivity.getESimViewModel();
        throw null;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/ESimActivity$Companion;", "", "<init>", "()V", "ESIM_IDENTITY_TITLE_KEY", "", "ESIM_IDENTITY_IMAGE_KEY", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", WindowInfoFieldGroup.FIELD_SCREEN, "Lcom/huawei/digitalpayment/consumer/sfcui/profile/esim/util/ESimScreen;", "ConsumerSfcUI_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component1 = 0;
        private static int component2 = 1;

        private Companion() {
        }

        public static Intent createIntent$default(Companion companion, Context context, ESimScreen eSimScreen, int i, Object obj) {
            int i2 = 2 % 2;
            if ((i & 2) != 0) {
                int i3 = component2 + 15;
                component1 = i3 % 128;
                if (i3 % 2 != 0) {
                    eSimScreen = ESimScreen.Dashboard.INSTANCE;
                    int i4 = 9 / 0;
                } else {
                    eSimScreen = ESimScreen.Dashboard.INSTANCE;
                }
                int i5 = component1 + 43;
                component2 = i5 % 128;
                int i6 = i5 % 2;
            }
            return companion.createIntent(context, eSimScreen);
        }

        public final Intent createIntent(Context context, ESimScreen screen) {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(screen, "");
            Intent intent = new Intent(context, (Class<?>) ESimActivity.class);
            intent.putExtra("screen_key", screen);
            int i2 = component1 + 33;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 51 / 0;
            }
            return intent;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ESimActivity() {
        final ESimActivity eSimActivity = this;
        final Function0 function0 = null;
        this.eSimViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ESimViewModel.class), new Function0<ViewModelStore>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 97;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStore = eSimActivity.getViewModelStore();
                int i4 = component1 + 19;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStore;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component1 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                ViewModelStore viewModelStoreInvoke = invoke();
                int i4 = component1 + 119;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 117;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = copydefault + 7;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return factoryInvoke;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component3 + 97;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    eSimActivity.getDefaultViewModelProviderFactory();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory = eSimActivity.getDefaultViewModelProviderFactory();
                int i3 = copydefault + 5;
                component3 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 89 / 0;
                }
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[PHI: r1
  0x001b: PHI (r1v5 kotlin.jvm.functions.Function0) = (r1v4 kotlin.jvm.functions.Function0), (r1v10 kotlin.jvm.functions.Function0) binds: [B:8:0x0019, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
            @Override
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
                /*
                    r4 = this;
                    r0 = 2
                    int r1 = r0 % r0
                    int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity$special$$inlined$viewModels$default$3.ShareDataUIState
                    int r1 = r1 + 11
                    int r2 = r1 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity$special$$inlined$viewModels$default$3.component2 = r2
                    int r1 = r1 % r0
                    if (r1 != 0) goto L17
                    kotlin.jvm.functions.Function0 r1 = r1
                    r2 = 58
                    int r2 = r2 / 0
                    if (r1 == 0) goto L23
                    goto L1b
                L17:
                    kotlin.jvm.functions.Function0 r1 = r1
                    if (r1 == 0) goto L23
                L1b:
                    java.lang.Object r1 = r1.invoke()
                    androidx.lifecycle.viewmodel.CreationExtras r1 = (androidx.lifecycle.viewmodel.CreationExtras) r1
                    if (r1 != 0) goto L32
                L23:
                    androidx.activity.ComponentActivity r1 = r2
                    androidx.lifecycle.viewmodel.CreationExtras r1 = r1.getDefaultViewModelCreationExtras()
                    int r2 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity$special$$inlined$viewModels$default$3.ShareDataUIState
                    int r2 = r2 + 57
                    int r3 = r2 % 128
                    com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity$special$$inlined$viewModels$default$3.component2 = r3
                    int r2 = r2 % r0
                L32:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity$special$$inlined$viewModels$default$3.invoke():androidx.lifecycle.viewmodel.CreationExtras");
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 71;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                CreationExtras creationExtrasInvoke = invoke();
                int i4 = ShareDataUIState + 89;
                component2 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 68 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final ESimViewModel getESimViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 79;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ESimViewModel eSimViewModel = (ESimViewModel) this.eSimViewModel.getValue();
        int i4 = copy + 93;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return eSimViewModel;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[PHI: r6
  0x0060: PHI (r6v9 java.util.Collection) = (r6v2 java.util.Collection), (r6v3 java.util.Collection), (r6v3 java.util.Collection), (r6v14 java.util.Collection) binds: [B:8:0x0033, B:15:0x0054, B:12:0x004a, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r6
  0x0035: PHI (r6v3 java.util.Collection) = (r6v2 java.util.Collection), (r6v14 java.util.Collection) binds: [B:8:0x0033, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void requestPhoneStatePermission$lambda$1(com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity r5, java.util.Map r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            r4 = 94
            int r4 = r4 / r2
            if (r1 == 0) goto L60
            goto L35
        L25:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L60
        L35:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy
            int r1 = r1 + 99
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState = r4
            int r1 = r1 % r0
            if (r1 != 0) goto L4d
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r4 = 70
            int r4 = r4 / r2
            if (r1 == 0) goto L60
            goto L56
        L4d:
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L60
        L56:
            int r6 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState
            int r6 = r6 + 95
            int r1 = r6 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy = r1
            int r6 = r6 % r0
            goto La7
        L60:
            java.util.Iterator r6 = r6.iterator()
        L64:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La7
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState
            int r1 = r1 + 99
            int r4 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy = r4
            int r1 = r1 % r0
            r4 = 0
            if (r1 != 0) goto L9a
            java.lang.Object r1 = r6.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L64
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r6 = r5.getESimViewModel()
            r6.setEsimSupported(r2)
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r6 = r5.getESimViewModel()
            int r1 = com.huawei.digitalpayment.consumer.sfc.R.string.gsm_esim_permission_denied_message
            java.lang.String r5 = r5.getString(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel.showError$default(r6, r5, r4, r0, r4)
            goto Lbf
        L9a:
            java.lang.Object r5 = r6.next()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            r4.hashCode()
            throw r4
        La7:
            boolean r6 = r5.checkEsimHardwareSupportedInternal()
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimViewModel r5 = r5.getESimViewModel()
            r5.setEsimSupported(r6)
            int r5 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState
            int r5 = r5 + 29
            int r6 = r5 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy = r6
            int r5 = r5 % r0
            if (r5 == 0) goto Lbf
            r5 = 3
            int r5 = r5 % r5
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.requestPhoneStatePermission$lambda$1(com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity, java.util.Map):void");
    }

    private static final void pinLauncher$lambda$2(ESimActivity eSimActivity, ActivityResult activityResult) {
        String str = "";
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eSimActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i2 = copy + 57;
            getRequestBeneficiariesState = i2 % 128;
            if (i2 % 2 == 0) {
                activityResult.getData();
                throw null;
            }
            if (activityResult.getData() != null) {
                int i3 = copy + 27;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                Intent data = activityResult.getData();
                if (data != null) {
                    int i5 = getRequestBeneficiariesState + 47;
                    copy = i5 % 128;
                    int i6 = i5 % 2;
                    String stringExtra = data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN2);
                    if (stringExtra != null) {
                        str = stringExtra;
                    }
                }
                if (str.length() <= 0) {
                    ToastUtils.showShort("PIN entry failed or cancelled.", new Object[0]);
                    return;
                }
                int i7 = getRequestBeneficiariesState + 57;
                copy = i7 % 128;
                int i8 = i7 % 2;
                eSimActivity.reserveEsimRequest();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(char r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.b(char, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            cArr3[0] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i3 = $10 + 9;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 2 / 5;
            }
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 99;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c2 = cArr3[1];
                char c3 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c2), Integer.valueOf((c3 + i5) ^ ((c3 << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(c3 >>> 5), Integer.valueOf(copydefault)};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        int iMyPid = 844 - (Process.myPid() >> 22);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 33;
                        char c4 = (char) (23250 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                        byte b2 = $$c[3];
                        byte b3 = (byte) (b2 - 1);
                        byte b4 = (byte) (-b2);
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(iMyPid, packedPositionChild, c4, 592652048, false, $$i(b3, b4, (byte) (b4 & 46)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) component3) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component2)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        int i9 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 843;
                        int scrollBarFadeDuration = 32 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        char deadChar = (char) (23251 - KeyEvent.getDeadChar(0, 0));
                        byte b5 = $$c[3];
                        byte b6 = (byte) (b5 - 1);
                        byte b7 = (byte) (-b5);
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(i9, scrollBarFadeDuration, deadChar, 592652048, false, $$i(b6, b7, (byte) (b7 & 46)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[iNotificationSideChannelDefault.component3] = cArr3[0];
            cArr2[iNotificationSideChannelDefault.component3 + 1] = cArr3[1];
            Object[] objArr4 = {iNotificationSideChannelDefault, iNotificationSideChannelDefault};
            Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2106917371);
            if (objCopydefault3 == null) {
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 465, (ViewConfiguration.getPressedStateDuration() >> 16) + 49, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            int i10 = $11 + 103;
            $10 = i10 % 128;
            int i11 = i10 % 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        ITrustedWebActivityServiceStub iTrustedWebActivityServiceStub = new ITrustedWebActivityServiceStub();
        char[] cArr2 = new char[i3];
        iTrustedWebActivityServiceStub.ShareDataUIState = 0;
        while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
            iTrustedWebActivityServiceStub.component3 = cArr[iTrustedWebActivityServiceStub.ShareDataUIState];
            cArr2[iTrustedWebActivityServiceStub.ShareDataUIState] = (char) (i + iTrustedWebActivityServiceStub.component3);
            int i5 = iTrustedWebActivityServiceStub.ShareDataUIState;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(component1)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1115720427);
                if (objCopydefault == null) {
                    int offsetBefore = 3784 - TextUtils.getOffsetBefore("", 0);
                    int iBlue = Color.blue(0) + 38;
                    char cIndexOf = (char) (26860 - TextUtils.indexOf("", "", 0));
                    byte b2 = $$c[3];
                    byte b3 = (byte) (b2 - 1);
                    byte b4 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(offsetBefore, iBlue, cIndexOf, 2015799920, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7406 - TextUtils.indexOf("", "", 0), 15 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault2).invoke(null, objArr3);
                int i6 = $10 + 37;
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
        if (i2 > 0) {
            iTrustedWebActivityServiceStub.component1 = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - iTrustedWebActivityServiceStub.component1, iTrustedWebActivityServiceStub.component1);
            System.arraycopy(cArr3, iTrustedWebActivityServiceStub.component1, cArr2, 0, i3 - iTrustedWebActivityServiceStub.component1);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            iTrustedWebActivityServiceStub.ShareDataUIState = 0;
            int i8 = $10 + 55;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (iTrustedWebActivityServiceStub.ShareDataUIState < i3) {
                int i10 = $10 + 115;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[i3 / iTrustedWebActivityServiceStub.ShareDataUIState];
                    Object[] objArr4 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetAfter("", 0) + 7406, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                } else {
                    cArr4[iTrustedWebActivityServiceStub.ShareDataUIState] = cArr2[(i3 - iTrustedWebActivityServiceStub.ShareDataUIState) - 1];
                    Object[] objArr5 = {iTrustedWebActivityServiceStub, iTrustedWebActivityServiceStub};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-476425232);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7405 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 16 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0, 0), 650349717, false, DiskFormatter.B, new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x02b8  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 10044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.onCreate(android.os.Bundle):void");
    }

    private final void observeScreenTransition() {
        int i = 2 % 2;
        getESimViewModel().getScreenTransition().observe(this, new component3(new Function1() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 121;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    ESimActivity.$r8$lambda$8KpNPhEOvVzjtGXsjCG9QUAPds4(this.f$0, (ScreenInformation) obj);
                    throw null;
                }
                Unit unit$r8$lambda$8KpNPhEOvVzjtGXsjCG9QUAPds4 = ESimActivity.$r8$lambda$8KpNPhEOvVzjtGXsjCG9QUAPds4(this.f$0, (ScreenInformation) obj);
                int i4 = ShareDataUIState + 17;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit$r8$lambda$8KpNPhEOvVzjtGXsjCG9QUAPds4;
            }
        }));
        int i2 = copy + 17;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final Unit observeScreenTransition$lambda$3(ESimActivity eSimActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 43;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(eSimActivity, "");
        Intrinsics.checkNotNull(screenInformation);
        eSimActivity.changeScreen(screenInformation);
        Unit unit = Unit.INSTANCE;
        int i4 = copy + 91;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return unit;
        }
        throw null;
    }

    private final void observeEsimSupport() {
        int i = 2 % 2;
        getESimViewModel().isEsimSupported().observe(this, new component3(new Function1() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = component3 + 77;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Unit unit$r8$lambda$Dglng7GJ_xL1RMSdsdRkofIHR00 = ESimActivity.$r8$lambda$Dglng7GJ_xL1RMSdsdRkofIHR00(this.f$0, (Boolean) obj);
                int i5 = component3 + 89;
                component2 = i5 % 128;
                int i6 = i5 % 2;
                return unit$r8$lambda$Dglng7GJ_xL1RMSdsdRkofIHR00;
            }
        }));
        int i2 = copy + 35;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private static final Unit observeEsimSupport$lambda$4(ESimActivity eSimActivity, Boolean bool) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(eSimActivity, "");
        if (!bool.booleanValue()) {
            ESimViewModel.showError$default(eSimActivity.getESimViewModel(), "Your phone is NOT eSIM Compatible\nClick here to learn why.", null, 2, null);
        } else {
            int i2 = getRequestBeneficiariesState + 41;
            copy = i2 % 128;
            int i3 = i2 % 2;
            eSimActivity.getESimViewModel().onESimSupported();
            int i4 = copy + 41;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        }
        return Unit.INSTANCE;
    }

    private final void checkTelephonyPermissionAndUpdateEsimSupport() {
        int i = 2 % 2;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        listCreateListBuilder.add("android.permission.READ_PHONE_STATE");
        int i2 = 0;
        String[] strArr = (String[]) CollectionsKt.build(listCreateListBuilder).toArray(new String[0]);
        int length = strArr.length;
        while (true) {
            if (i2 >= length) {
                getESimViewModel().setEsimSupported(checkEsimHardwareSupportedInternal());
                break;
            }
            int i3 = getRequestBeneficiariesState + 47;
            copy = i3 % 128;
            int i4 = i3 % 2;
            if (ContextCompat.checkSelfPermission(this, strArr[i2]) != 0) {
                this.requestPhoneStatePermission.launch(strArr);
                break;
            } else {
                int i5 = getRequestBeneficiariesState + 11;
                copy = i5 % 128;
                i2 = i5 % 2 != 0 ? i2 + 52 : i2 + 1;
            }
        }
        int i6 = copy + 33;
        getRequestBeneficiariesState = i6 % 128;
        int i7 = i6 % 2;
    }

    private final void registerSmsAutoFill() {
        int i = 2 % 2;
        getLifecycle().addObserver(new SmsAutoFill(new ApiCallback<String>() {
            private static int ShareDataUIState = 1;
            private static int component1;

            @Override
            public void onSuccess(String str) {
                int i2 = 2 % 2;
                int i3 = component1 + 75;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                onSuccess2(str);
                int i5 = ShareDataUIState + 21;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public void onSuccess2(String value) {
                int i2 = 2 % 2;
                if (value != null) {
                    int i3 = component1 + 81;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                    ESimActivity eSimActivity = ESimActivity.this;
                    ESimActivity.access$getESimViewModel(eSimActivity).updateOtpCode(value);
                    ESimActivity.access$getESimViewModel(eSimActivity).validateEsimOtp(value);
                }
                int i5 = ShareDataUIState + 21;
                component1 = i5 % 128;
                int i6 = i5 % 2;
            }

            @Override
            public void onError(BaseException exception) {
                int i2 = 2 % 2;
                int i3 = component1 + 83;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(exception, "");
                if (i4 == 0) {
                    throw null;
                }
            }
        }));
        int i2 = copy + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean checkEsimHardwareSupportedInternal() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState
            int r1 = r1 + 75
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1e
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<android.telephony.TelephonyManager> r4 = android.telephony.TelephonyManager.class
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r1, r4)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L33
            goto L2b
        L1e:
            r1 = r5
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<android.telephony.TelephonyManager> r4 = android.telephony.TelephonyManager.class
            java.lang.Object r1 = androidx.core.content.ContextCompat.getSystemService(r1, r4)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 == 0) goto L33
        L2b:
            int r1 = r1.getPhoneType()
            if (r1 != 0) goto L33
            r1 = r3
            goto L34
        L33:
            r1 = r2
        L34:
            r1 = r1 ^ r3
            if (r1 == r3) goto L41
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy
            int r1 = r1 + 23
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
            return r2
        L41:
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r1 >= r4) goto L58
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy
            int r1 = r1 + 5
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L53
            return r2
        L53:
            r0 = 0
            r0.hashCode()
            throw r0
        L58:
            java.lang.Class r1 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m9775m()
            java.lang.Object r1 = r5.getSystemService(r1)
            android.telephony.euicc.EuiccManager r1 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m9772m(r1)
            if (r1 == 0) goto L6e
            boolean r1 = com.google.android.gms.common.util.zzc$$ExternalSyntheticApiModelOutline0.m(r1)
            if (r1 != r3) goto L6e
            r2 = r3
            goto L7b
        L6e:
            int r1 = com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.copy
            int r1 = r1 + 21
            int r3 = r1 % 128
            com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.getRequestBeneficiariesState = r3
            int r1 = r1 % r0
            if (r1 != 0) goto L7b
            r0 = 3
            int r0 = r0 / r0
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.checkEsimHardwareSupportedInternal():boolean");
    }

    private final void setWindowInsets() {
        int i = 2 % 2;
        ActivityESimBinding activityESimBinding = this.binding;
        if (activityESimBinding == null) {
            int i2 = getRequestBeneficiariesState + 97;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.throwUninitializedPropertyAccessException("");
            if (i3 != 0) {
                throw null;
            }
            activityESimBinding = null;
        }
        ViewCompat.setOnApplyWindowInsetsListener(activityESimBinding.getRoot(), new OnApplyWindowInsetsListener() {
            private static int component1 = 0;
            private static int component3 = 1;

            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                int i4 = 2 % 2;
                int i5 = component1 + 35;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                WindowInsetsCompat windowInsetsCompat$r8$lambda$VMKmSJGG2GafPmsi1G8DHhj5nb8 = ESimActivity.$r8$lambda$VMKmSJGG2GafPmsi1G8DHhj5nb8(view, windowInsetsCompat);
                int i7 = component1 + 75;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                return windowInsetsCompat$r8$lambda$VMKmSJGG2GafPmsi1G8DHhj5nb8;
            }
        });
        int i4 = getRequestBeneficiariesState + 29;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final WindowInsetsCompat setWindowInsets$lambda$7(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = copy + 103;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        int i4 = copy + 5;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return windowInsetsCompat;
        }
        throw null;
    }

    private final void showIdentifyPinActivity() {
        int i = 2 % 2;
        ESimUiState value = getESimViewModel().getUiState().getValue();
        Bundle bundle = new Bundle();
        bundle.putString("titleText", getString(R.string.gsm_esim_title));
        bundle.putString("phoneNumber", "Phone Number: " + value.getPhoneNumber());
        bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_gsm_esim);
        RouteUtils.routeWithExecute(this, "/sfcModule/identityPin", bundle, this.pinLauncher);
        int i2 = getRequestBeneficiariesState + 49;
        copy = i2 % 128;
        int i3 = i2 % 2;
    }

    private final void reserveEsimRequest() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        copy = i2 % 128;
        if (i2 % 2 != 0) {
            getESimViewModel().reserveEsim();
            int i3 = 96 / 0;
        } else {
            getESimViewModel().reserveEsim();
        }
        int i4 = getRequestBeneficiariesState + 51;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void changeScreen(ScreenInformation<ESimScreen> screenInformation) {
        CompletionFragment completionFragment;
        int i = 2 % 2;
        int i2 = copy + 61;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        ESimScreen screen = screenInformation.getScreen();
        if (!Intrinsics.areEqual(screen, ESimScreen.PinValidation.INSTANCE)) {
            if (Intrinsics.areEqual(screen, ESimScreen.Completion.INSTANCE) || Intrinsics.areEqual(screen, ESimScreen.Close.INSTANCE)) {
                finish();
                return;
            }
            if (Intrinsics.areEqual(screen, ESimScreen.Error.INSTANCE)) {
                ESimErrorFragment eSimErrorFragment = new ESimErrorFragment();
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                ScreenDirection direction = screenInformation.getDirection();
                String simpleName = eSimErrorFragment.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                FragmentExtensionsKt.showFragment$default(supportFragmentManager, direction, simpleName, eSimErrorFragment, true, R.id.container, null, 32, null);
                return;
            }
            ESimScreen screen2 = screenInformation.getScreen();
            if (Intrinsics.areEqual(screen2, ESimScreen.Dashboard.INSTANCE)) {
                completionFragment = new ESimDashboardFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.Onboarding.INSTANCE)) {
                completionFragment = new OnboardingFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.AboutActivation.INSTANCE)) {
                completionFragment = new AboutActivationFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.GetPhoneNumber.INSTANCE)) {
                completionFragment = new GetPhoneNumberFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.EmailAddress.INSTANCE)) {
                completionFragment = new EmailAddressFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.Confirmation.INSTANCE)) {
                completionFragment = new ConfirmationFragment();
            } else if (Intrinsics.areEqual(screen2, ESimScreen.OtpValidation.INSTANCE)) {
                completionFragment = new OtpValidationFragment();
            } else if (!Intrinsics.areEqual(screen2, ESimScreen.Completion.INSTANCE)) {
                return;
            } else {
                completionFragment = new CompletionFragment();
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
            ScreenDirection direction2 = screenInformation.getDirection();
            String simpleName2 = completionFragment.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName2, "");
            FragmentExtensionsKt.showFragment$default(supportFragmentManager2, direction2, simpleName2, completionFragment, false, R.id.container, null, 32, null);
            return;
        }
        int i4 = copy + 67;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            showIdentifyPinActivity();
        } else {
            showIdentifyPinActivity();
            int i5 = 53 / 0;
        }
    }

    @Override
    public void onStart() throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = copy + 23;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = ((Field) addOnMultiWindowModeChangedListener.component3[0]).getInt(null);
        int iIdentityHashCode = System.identityHashCode(this);
        if (i4 != 897188773 + (((~(1639148110 | iIdentityHashCode)) | (-55770949)) * (-964)) + (((~((~iIdentityHashCode) | 1639148110)) | (-1676934991)) * (-964))) {
            int i5 = copy + 9;
            getRequestBeneficiariesState = i5 % 128;
            int i6 = i5 % 2;
            Toast.makeText((Context) null, (-1585329319) / 0, 0).show();
            int i7 = copy + 73;
            getRequestBeneficiariesState = i7 % 128;
            int i8 = i7 % 2;
        }
        int i9 = ((Field) getFullyDrawnReporter.component3[0]).getInt(null);
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i10 = ~(411015526 | iIdentityHashCode2);
        if (i9 != 19538970 + ((1660953241 | i10) * (-814)) + ((i10 | (~((~iIdentityHashCode2) | (-1798056668))) | 273912100) * 407) + (((~(iIdentityHashCode2 | 1798056667)) | (~((-411015527) | iIdentityHashCode2)) | 273912100) * 407)) {
            int i11 = copy + 103;
            getRequestBeneficiariesState = i11 % 128;
            (i11 % 2 == 0 ? Toast.makeText((Context) null, 963489844 / ((963489844 >>> (963489844 % 0)) % 3), 0) : Toast.makeText((Context) null, 963489844 / 0, 0)).show();
        }
        super.onStart();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = copy + 117;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) + 56303), TextUtils.lastIndexOf("", '0', 0) + 1, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952303_res_0x7f1302af).substring(0, 2).length() + 24, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131953647_res_0x7f1307ef).substring(0, 4).codePointAt(3) + 157, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 13, new char[]{65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5}, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = copy + 111;
            getRequestBeneficiariesState = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i8 = copy + 55;
            getRequestBeneficiariesState = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 6617, TextUtils.indexOf((CharSequence) "", '0') + 43, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (Process.myTid() >> 22), TextUtils.indexOf("", "") + 56, (char) Color.argb(0, 0, 0, 0), -960739708, false, "component3", new Class[]{Context.class});
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
        int i10 = copy + 21;
        getRequestBeneficiariesState = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1007:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x09f0 A[Catch: all -> 0x05a8, TryCatch #6 {all -> 0x05a8, blocks: (B:264:0x118b, B:266:0x1191, B:267:0x11bd, B:383:0x175b, B:385:0x1761, B:386:0x178c, B:498:0x1d21, B:500:0x1d27, B:501:0x1d56, B:787:0x36ac, B:789:0x36b2, B:790:0x36de, B:824:0x3a13, B:826:0x3a19, B:827:0x3a47, B:804:0x3832, B:806:0x3855, B:807:0x38ae, B:747:0x3239, B:749:0x323f, B:750:0x3268, B:638:0x2b28, B:640:0x2b2e, B:641:0x2b59, B:643:0x2b93, B:644:0x2bdd, B:611:0x285c, B:613:0x2871, B:614:0x289f, B:593:0x257c, B:595:0x2582, B:596:0x25aa, B:598:0x25e4, B:599:0x262c, B:563:0x21f1, B:565:0x2206, B:566:0x222f, B:568:0x2263, B:569:0x22db, B:543:0x1f8b, B:545:0x1f91, B:546:0x1fba, B:117:0x09ea, B:119:0x09f0, B:120:0x0a1a, B:19:0x02c4, B:21:0x02ca, B:22:0x02f0, B:24:0x051e, B:26:0x054f, B:27:0x05a2, B:506:0x1de4, B:508:0x1de8, B:529:0x1ed4, B:531:0x1eda, B:532:0x1edb, B:534:0x1edd, B:536:0x1ee4, B:537:0x1ee5, B:512:0x1df4, B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185), top: B:864:0x02c4, inners: #50, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0af1 A[Catch: all -> 0x10cf, PHI: r1 r9 r28
  0x0af1: PHI (r1v723 java.lang.Object) = (r1v722 java.lang.Object), (r1v766 java.lang.Object) binds: [B:125:0x0aa0, B:127:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0af1: PHI (r9v113 ??) = (r9v226 ??), (r9v227 ??) binds: [B:125:0x0aa0, B:127:0x0aa3] A[DONT_GENERATE, DONT_INLINE]
  0x0af1: PHI (r28v97 ??) = (r28v146 ??), (r28v147 ??) binds: [B:125:0x0aa0, B:127:0x0aa3] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x10cf, blocks: (B:124:0x0a9c, B:131:0x0af1), top: B:901:0x0a9c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b7f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0f5a A[Catch: all -> 0x10aa, TryCatch #7 {all -> 0x10aa, blocks: (B:197:0x0f50, B:198:0x0f54, B:200:0x0f5a, B:203:0x0f77, B:187:0x0e75, B:192:0x0ee3, B:196:0x0f48), top: B:865:0x0e75 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1191 A[Catch: all -> 0x05a8, TryCatch #6 {all -> 0x05a8, blocks: (B:264:0x118b, B:266:0x1191, B:267:0x11bd, B:383:0x175b, B:385:0x1761, B:386:0x178c, B:498:0x1d21, B:500:0x1d27, B:501:0x1d56, B:787:0x36ac, B:789:0x36b2, B:790:0x36de, B:824:0x3a13, B:826:0x3a19, B:827:0x3a47, B:804:0x3832, B:806:0x3855, B:807:0x38ae, B:747:0x3239, B:749:0x323f, B:750:0x3268, B:638:0x2b28, B:640:0x2b2e, B:641:0x2b59, B:643:0x2b93, B:644:0x2bdd, B:611:0x285c, B:613:0x2871, B:614:0x289f, B:593:0x257c, B:595:0x2582, B:596:0x25aa, B:598:0x25e4, B:599:0x262c, B:563:0x21f1, B:565:0x2206, B:566:0x222f, B:568:0x2263, B:569:0x22db, B:543:0x1f8b, B:545:0x1f91, B:546:0x1fba, B:117:0x09ea, B:119:0x09f0, B:120:0x0a1a, B:19:0x02c4, B:21:0x02ca, B:22:0x02f0, B:24:0x051e, B:26:0x054f, B:27:0x05a2, B:506:0x1de4, B:508:0x1de8, B:529:0x1ed4, B:531:0x1eda, B:532:0x1edb, B:534:0x1edd, B:536:0x1ee4, B:537:0x1ee5, B:512:0x1df4, B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185), top: B:864:0x02c4, inners: #50, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x124f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x129b A[Catch: all -> 0x16b3, PHI: r1 r28
  0x129b: PHI (r1v644 java.lang.Object) = (r1v643 java.lang.Object), (r1v694 java.lang.Object) binds: [B:272:0x124d, B:274:0x1250] A[DONT_GENERATE, DONT_INLINE]
  0x129b: PHI (r28v68 ??) = (r28v144 ??), (r28v145 ??) binds: [B:272:0x124d, B:274:0x1250] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x16b3, blocks: (B:271:0x1249, B:278:0x129b, B:287:0x1302, B:305:0x141f, B:309:0x1468), top: B:877:0x1249 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x12a8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x1302 A[Catch: all -> 0x16b3, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x16b3, blocks: (B:271:0x1249, B:278:0x129b, B:287:0x1302, B:305:0x141f, B:309:0x1468), top: B:877:0x1249 }] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x154d A[Catch: all -> 0x1691, TryCatch #60 {all -> 0x1691, blocks: (B:321:0x1543, B:322:0x1547, B:324:0x154d, B:327:0x1567, B:311:0x1477, B:316:0x14e1, B:320:0x153b), top: B:965:0x1477 }] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x1761 A[Catch: all -> 0x05a8, TryCatch #6 {all -> 0x05a8, blocks: (B:264:0x118b, B:266:0x1191, B:267:0x11bd, B:383:0x175b, B:385:0x1761, B:386:0x178c, B:498:0x1d21, B:500:0x1d27, B:501:0x1d56, B:787:0x36ac, B:789:0x36b2, B:790:0x36de, B:824:0x3a13, B:826:0x3a19, B:827:0x3a47, B:804:0x3832, B:806:0x3855, B:807:0x38ae, B:747:0x3239, B:749:0x323f, B:750:0x3268, B:638:0x2b28, B:640:0x2b2e, B:641:0x2b59, B:643:0x2b93, B:644:0x2bdd, B:611:0x285c, B:613:0x2871, B:614:0x289f, B:593:0x257c, B:595:0x2582, B:596:0x25aa, B:598:0x25e4, B:599:0x262c, B:563:0x21f1, B:565:0x2206, B:566:0x222f, B:568:0x2263, B:569:0x22db, B:543:0x1f8b, B:545:0x1f91, B:546:0x1fba, B:117:0x09ea, B:119:0x09f0, B:120:0x0a1a, B:19:0x02c4, B:21:0x02ca, B:22:0x02f0, B:24:0x051e, B:26:0x054f, B:27:0x05a2, B:506:0x1de4, B:508:0x1de8, B:529:0x1ed4, B:531:0x1eda, B:532:0x1edb, B:534:0x1edd, B:536:0x1ee4, B:537:0x1ee5, B:512:0x1df4, B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185), top: B:864:0x02c4, inners: #50, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x187d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x18d4 A[Catch: all -> 0x1c6a, TRY_ENTER, TRY_LEAVE, TryCatch #43 {all -> 0x1c6a, blocks: (B:390:0x1820, B:396:0x1870, B:405:0x18d4), top: B:933:0x1820 }] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1b0a A[Catch: all -> 0x1c64, TryCatch #39 {all -> 0x1c64, blocks: (B:438:0x1b00, B:439:0x1b04, B:441:0x1b0a, B:444:0x1b27, B:407:0x18e2, B:425:0x19db, B:428:0x1a22, B:434:0x1a96, B:437:0x1af8), top: B:925:0x18e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x1d27 A[Catch: all -> 0x05a8, TryCatch #6 {all -> 0x05a8, blocks: (B:264:0x118b, B:266:0x1191, B:267:0x11bd, B:383:0x175b, B:385:0x1761, B:386:0x178c, B:498:0x1d21, B:500:0x1d27, B:501:0x1d56, B:787:0x36ac, B:789:0x36b2, B:790:0x36de, B:824:0x3a13, B:826:0x3a19, B:827:0x3a47, B:804:0x3832, B:806:0x3855, B:807:0x38ae, B:747:0x3239, B:749:0x323f, B:750:0x3268, B:638:0x2b28, B:640:0x2b2e, B:641:0x2b59, B:643:0x2b93, B:644:0x2bdd, B:611:0x285c, B:613:0x2871, B:614:0x289f, B:593:0x257c, B:595:0x2582, B:596:0x25aa, B:598:0x25e4, B:599:0x262c, B:563:0x21f1, B:565:0x2206, B:566:0x222f, B:568:0x2263, B:569:0x22db, B:543:0x1f8b, B:545:0x1f91, B:546:0x1fba, B:117:0x09ea, B:119:0x09f0, B:120:0x0a1a, B:19:0x02c4, B:21:0x02ca, B:22:0x02f0, B:24:0x051e, B:26:0x054f, B:27:0x05a2, B:506:0x1de4, B:508:0x1de8, B:529:0x1ed4, B:531:0x1eda, B:532:0x1edb, B:534:0x1edd, B:536:0x1ee4, B:537:0x1ee5, B:512:0x1df4, B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185), top: B:864:0x02c4, inners: #50, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1dfd  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x1e14 A[Catch: all -> 0x1edc, TryCatch #33 {all -> 0x1edc, blocks: (B:518:0x1dff, B:520:0x1e14, B:521:0x1e43), top: B:915:0x1dff, outer: #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x1e56 A[Catch: all -> 0x1ed2, TryCatch #28 {all -> 0x1ed2, blocks: (B:522:0x1e49, B:524:0x1e56, B:525:0x1eca), top: B:905:0x1e49, outer: #50 }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x2044  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x20ad  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x2105  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x21d1  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x241b  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x253b  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x272f  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x2779  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x283b  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x29e2  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x2ae7  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2cbc A[Catch: all -> 0x318b, TryCatch #57 {all -> 0x318b, blocks: (B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185, B:717:0x30e0, B:712:0x30a6, B:714:0x30ac, B:715:0x30d8, B:682:0x2e7c, B:684:0x2e9b, B:685:0x2f1b, B:677:0x2e29, B:679:0x2e3e, B:680:0x2e75), top: B:960:0x2cb6, outer: #6, inners: #34, #40, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:652:0x2d29 A[Catch: all -> 0x318b, TryCatch #57 {all -> 0x318b, blocks: (B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185, B:717:0x30e0, B:712:0x30a6, B:714:0x30ac, B:715:0x30d8, B:682:0x2e7c, B:684:0x2e9b, B:685:0x2f1b, B:677:0x2e29, B:679:0x2e3e, B:680:0x2e75), top: B:960:0x2cb6, outer: #6, inners: #34, #40, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x2d83 A[Catch: all -> 0x318b, TryCatch #57 {all -> 0x318b, blocks: (B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185, B:717:0x30e0, B:712:0x30a6, B:714:0x30ac, B:715:0x30d8, B:682:0x2e7c, B:684:0x2e9b, B:685:0x2f1b, B:677:0x2e29, B:679:0x2e3e, B:680:0x2e75), top: B:960:0x2cb6, outer: #6, inners: #34, #40, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:660:0x2dd8  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x2df7 A[Catch: all -> 0x318b, TryCatch #57 {all -> 0x318b, blocks: (B:647:0x2cb6, B:649:0x2cbc, B:650:0x2d02, B:652:0x2d29, B:653:0x2d6d, B:655:0x2d83, B:657:0x2d8c, B:658:0x2dcd, B:697:0x303f, B:698:0x3043, B:701:0x3053, B:704:0x306a, B:707:0x3077, B:709:0x307a, B:721:0x3160, B:723:0x3166, B:724:0x3167, B:726:0x3169, B:728:0x3170, B:729:0x3171, B:664:0x2de8, B:673:0x2e03, B:669:0x2df7, B:667:0x2df3, B:675:0x2e09, B:687:0x2f27, B:689:0x2f2d, B:690:0x2f70, B:692:0x2f9a, B:693:0x2fde, B:695:0x2ff4, B:696:0x3039, B:731:0x3173, B:733:0x317a, B:734:0x317b, B:736:0x317d, B:738:0x3184, B:739:0x3185, B:717:0x30e0, B:712:0x30a6, B:714:0x30ac, B:715:0x30d8, B:682:0x2e7c, B:684:0x2e9b, B:685:0x2f1b, B:677:0x2e29, B:679:0x2e3e, B:680:0x2e75), top: B:960:0x2cb6, outer: #6, inners: #34, #40, #47, #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:700:0x3049  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x32fe  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x3349  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x3408  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x368c  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x376d  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x37bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x029b A[PHI: r15
  0x029b: PHI (r15v83 char) = (r15v5 char), (r15v84 char) binds: [B:17:0x02bf, B:5:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:803:0x3814  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x39f3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x02a7 A[PHI: r15
  0x02a7: PHI (r15v5 char) = (r15v4 char), (r15v85 char) binds: [B:3:0x0293, B:5:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:931:0x1826 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:947:0x1de4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r10v128 */
    /* JADX WARN: Type inference failed for: r10v129 */
    /* JADX WARN: Type inference failed for: r10v130 */
    /* JADX WARN: Type inference failed for: r10v131 */
    /* JADX WARN: Type inference failed for: r10v132 */
    /* JADX WARN: Type inference failed for: r10v135 */
    /* JADX WARN: Type inference failed for: r10v140 */
    /* JADX WARN: Type inference failed for: r10v141 */
    /* JADX WARN: Type inference failed for: r10v142 */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v145 */
    /* JADX WARN: Type inference failed for: r10v149 */
    /* JADX WARN: Type inference failed for: r10v150 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r10v152 */
    /* JADX WARN: Type inference failed for: r10v153 */
    /* JADX WARN: Type inference failed for: r10v154 */
    /* JADX WARN: Type inference failed for: r10v155 */
    /* JADX WARN: Type inference failed for: r10v156 */
    /* JADX WARN: Type inference failed for: r10v157 */
    /* JADX WARN: Type inference failed for: r10v158 */
    /* JADX WARN: Type inference failed for: r10v159 */
    /* JADX WARN: Type inference failed for: r10v160 */
    /* JADX WARN: Type inference failed for: r10v161 */
    /* JADX WARN: Type inference failed for: r10v162 */
    /* JADX WARN: Type inference failed for: r10v163 */
    /* JADX WARN: Type inference failed for: r10v164 */
    /* JADX WARN: Type inference failed for: r10v165 */
    /* JADX WARN: Type inference failed for: r10v166 */
    /* JADX WARN: Type inference failed for: r10v167 */
    /* JADX WARN: Type inference failed for: r10v168 */
    /* JADX WARN: Type inference failed for: r10v169 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v92, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r11v121 */
    /* JADX WARN: Type inference failed for: r11v122 */
    /* JADX WARN: Type inference failed for: r11v123 */
    /* JADX WARN: Type inference failed for: r11v124 */
    /* JADX WARN: Type inference failed for: r11v126 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v137 */
    /* JADX WARN: Type inference failed for: r11v141 */
    /* JADX WARN: Type inference failed for: r11v142 */
    /* JADX WARN: Type inference failed for: r11v143 */
    /* JADX WARN: Type inference failed for: r11v144 */
    /* JADX WARN: Type inference failed for: r11v145 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v49 */
    /* JADX WARN: Type inference failed for: r12v142 */
    /* JADX WARN: Type inference failed for: r12v143 */
    /* JADX WARN: Type inference failed for: r12v144 */
    /* JADX WARN: Type inference failed for: r12v146 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v150 */
    /* JADX WARN: Type inference failed for: r12v151 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v163 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v177 */
    /* JADX WARN: Type inference failed for: r12v178 */
    /* JADX WARN: Type inference failed for: r12v181 */
    /* JADX WARN: Type inference failed for: r12v182 */
    /* JADX WARN: Type inference failed for: r12v186 */
    /* JADX WARN: Type inference failed for: r12v188 */
    /* JADX WARN: Type inference failed for: r12v189 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r12v208 */
    /* JADX WARN: Type inference failed for: r12v210 */
    /* JADX WARN: Type inference failed for: r12v211 */
    /* JADX WARN: Type inference failed for: r12v212 */
    /* JADX WARN: Type inference failed for: r12v213 */
    /* JADX WARN: Type inference failed for: r12v214 */
    /* JADX WARN: Type inference failed for: r12v215 */
    /* JADX WARN: Type inference failed for: r12v216 */
    /* JADX WARN: Type inference failed for: r12v217 */
    /* JADX WARN: Type inference failed for: r12v218 */
    /* JADX WARN: Type inference failed for: r12v219 */
    /* JADX WARN: Type inference failed for: r12v220 */
    /* JADX WARN: Type inference failed for: r12v221 */
    /* JADX WARN: Type inference failed for: r12v222 */
    /* JADX WARN: Type inference failed for: r12v223 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v91 */
    /* JADX WARN: Type inference failed for: r12v92 */
    /* JADX WARN: Type inference failed for: r12v93 */
    /* JADX WARN: Type inference failed for: r12v94, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v100 */
    /* JADX WARN: Type inference failed for: r15v101 */
    /* JADX WARN: Type inference failed for: r15v102 */
    /* JADX WARN: Type inference failed for: r15v103 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v67 */
    /* JADX WARN: Type inference failed for: r15v68 */
    /* JADX WARN: Type inference failed for: r15v69 */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82 */
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
    /* JADX WARN: Type inference failed for: r28v11 */
    /* JADX WARN: Type inference failed for: r28v110 */
    /* JADX WARN: Type inference failed for: r28v111 */
    /* JADX WARN: Type inference failed for: r28v112 */
    /* JADX WARN: Type inference failed for: r28v117 */
    /* JADX WARN: Type inference failed for: r28v119 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v120 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v134 */
    /* JADX WARN: Type inference failed for: r28v137 */
    /* JADX WARN: Type inference failed for: r28v138 */
    /* JADX WARN: Type inference failed for: r28v139 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v140 */
    /* JADX WARN: Type inference failed for: r28v141 */
    /* JADX WARN: Type inference failed for: r28v142 */
    /* JADX WARN: Type inference failed for: r28v143 */
    /* JADX WARN: Type inference failed for: r28v144 */
    /* JADX WARN: Type inference failed for: r28v145 */
    /* JADX WARN: Type inference failed for: r28v146 */
    /* JADX WARN: Type inference failed for: r28v147 */
    /* JADX WARN: Type inference failed for: r28v148 */
    /* JADX WARN: Type inference failed for: r28v149 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v150 */
    /* JADX WARN: Type inference failed for: r28v151 */
    /* JADX WARN: Type inference failed for: r28v152 */
    /* JADX WARN: Type inference failed for: r28v153 */
    /* JADX WARN: Type inference failed for: r28v154 */
    /* JADX WARN: Type inference failed for: r28v155 */
    /* JADX WARN: Type inference failed for: r28v156 */
    /* JADX WARN: Type inference failed for: r28v157 */
    /* JADX WARN: Type inference failed for: r28v158 */
    /* JADX WARN: Type inference failed for: r28v159 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v48 */
    /* JADX WARN: Type inference failed for: r28v49 */
    /* JADX WARN: Type inference failed for: r28v59 */
    /* JADX WARN: Type inference failed for: r28v60 */
    /* JADX WARN: Type inference failed for: r28v61 */
    /* JADX WARN: Type inference failed for: r28v64 */
    /* JADX WARN: Type inference failed for: r28v65 */
    /* JADX WARN: Type inference failed for: r28v66 */
    /* JADX WARN: Type inference failed for: r28v67 */
    /* JADX WARN: Type inference failed for: r28v68 */
    /* JADX WARN: Type inference failed for: r28v69 */
    /* JADX WARN: Type inference failed for: r28v70 */
    /* JADX WARN: Type inference failed for: r28v71 */
    /* JADX WARN: Type inference failed for: r28v73 */
    /* JADX WARN: Type inference failed for: r28v74 */
    /* JADX WARN: Type inference failed for: r28v79 */
    /* JADX WARN: Type inference failed for: r28v80 */
    /* JADX WARN: Type inference failed for: r28v81 */
    /* JADX WARN: Type inference failed for: r28v84 */
    /* JADX WARN: Type inference failed for: r28v85 */
    /* JADX WARN: Type inference failed for: r28v86 */
    /* JADX WARN: Type inference failed for: r28v88 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r28v97 */
    /* JADX WARN: Type inference failed for: r28v98 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v43 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v16 */
    /* JADX WARN: Type inference failed for: r35v17 */
    /* JADX WARN: Type inference failed for: r35v18 */
    /* JADX WARN: Type inference failed for: r35v19 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v20 */
    /* JADX WARN: Type inference failed for: r35v21 */
    /* JADX WARN: Type inference failed for: r35v22 */
    /* JADX WARN: Type inference failed for: r35v26 */
    /* JADX WARN: Type inference failed for: r35v27 */
    /* JADX WARN: Type inference failed for: r35v28 */
    /* JADX WARN: Type inference failed for: r35v29 */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v30 */
    /* JADX WARN: Type inference failed for: r35v31 */
    /* JADX WARN: Type inference failed for: r35v33 */
    /* JADX WARN: Type inference failed for: r35v34 */
    /* JADX WARN: Type inference failed for: r35v36 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v40 */
    /* JADX WARN: Type inference failed for: r35v41 */
    /* JADX WARN: Type inference failed for: r35v42 */
    /* JADX WARN: Type inference failed for: r35v43 */
    /* JADX WARN: Type inference failed for: r35v44 */
    /* JADX WARN: Type inference failed for: r35v46 */
    /* JADX WARN: Type inference failed for: r35v47 */
    /* JADX WARN: Type inference failed for: r35v48 */
    /* JADX WARN: Type inference failed for: r35v49 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v50 */
    /* JADX WARN: Type inference failed for: r35v51 */
    /* JADX WARN: Type inference failed for: r35v52 */
    /* JADX WARN: Type inference failed for: r35v56 */
    /* JADX WARN: Type inference failed for: r35v57 */
    /* JADX WARN: Type inference failed for: r35v58 */
    /* JADX WARN: Type inference failed for: r35v59 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v60 */
    /* JADX WARN: Type inference failed for: r35v61 */
    /* JADX WARN: Type inference failed for: r35v62 */
    /* JADX WARN: Type inference failed for: r35v63 */
    /* JADX WARN: Type inference failed for: r35v64 */
    /* JADX WARN: Type inference failed for: r35v65 */
    /* JADX WARN: Type inference failed for: r35v66 */
    /* JADX WARN: Type inference failed for: r35v67 */
    /* JADX WARN: Type inference failed for: r35v68 */
    /* JADX WARN: Type inference failed for: r35v69 */
    /* JADX WARN: Type inference failed for: r35v7 */
    /* JADX WARN: Type inference failed for: r35v70 */
    /* JADX WARN: Type inference failed for: r35v71 */
    /* JADX WARN: Type inference failed for: r35v72 */
    /* JADX WARN: Type inference failed for: r35v73 */
    /* JADX WARN: Type inference failed for: r35v74 */
    /* JADX WARN: Type inference failed for: r35v75 */
    /* JADX WARN: Type inference failed for: r35v76 */
    /* JADX WARN: Type inference failed for: r35v77 */
    /* JADX WARN: Type inference failed for: r35v78 */
    /* JADX WARN: Type inference failed for: r35v79 */
    /* JADX WARN: Type inference failed for: r35v8 */
    /* JADX WARN: Type inference failed for: r35v80 */
    /* JADX WARN: Type inference failed for: r35v81 */
    /* JADX WARN: Type inference failed for: r35v82 */
    /* JADX WARN: Type inference failed for: r35v83 */
    /* JADX WARN: Type inference failed for: r35v84 */
    /* JADX WARN: Type inference failed for: r35v85 */
    /* JADX WARN: Type inference failed for: r35v86 */
    /* JADX WARN: Type inference failed for: r35v87 */
    /* JADX WARN: Type inference failed for: r35v88 */
    /* JADX WARN: Type inference failed for: r35v89 */
    /* JADX WARN: Type inference failed for: r35v90 */
    /* JADX WARN: Type inference failed for: r35v91 */
    /* JADX WARN: Type inference failed for: r35v92 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v539 */
    /* JADX WARN: Type inference failed for: r3v540 */
    /* JADX WARN: Type inference failed for: r3v541 */
    /* JADX WARN: Type inference failed for: r3v555 */
    /* JADX WARN: Type inference failed for: r3v556 */
    /* JADX WARN: Type inference failed for: r8v104 */
    /* JADX WARN: Type inference failed for: r8v105, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v147 */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v103, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v113 */
    /* JADX WARN: Type inference failed for: r9v114 */
    /* JADX WARN: Type inference failed for: r9v150, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v154 */
    /* JADX WARN: Type inference failed for: r9v155 */
    /* JADX WARN: Type inference failed for: r9v156 */
    /* JADX WARN: Type inference failed for: r9v157 */
    /* JADX WARN: Type inference failed for: r9v158 */
    /* JADX WARN: Type inference failed for: r9v166 */
    /* JADX WARN: Type inference failed for: r9v167 */
    /* JADX WARN: Type inference failed for: r9v175 */
    /* JADX WARN: Type inference failed for: r9v191 */
    /* JADX WARN: Type inference failed for: r9v194 */
    /* JADX WARN: Type inference failed for: r9v197 */
    /* JADX WARN: Type inference failed for: r9v198 */
    /* JADX WARN: Type inference failed for: r9v199 */
    /* JADX WARN: Type inference failed for: r9v203 */
    /* JADX WARN: Type inference failed for: r9v210 */
    /* JADX WARN: Type inference failed for: r9v211 */
    /* JADX WARN: Type inference failed for: r9v212 */
    /* JADX WARN: Type inference failed for: r9v213 */
    /* JADX WARN: Type inference failed for: r9v214 */
    /* JADX WARN: Type inference failed for: r9v215 */
    /* JADX WARN: Type inference failed for: r9v216 */
    /* JADX WARN: Type inference failed for: r9v217 */
    /* JADX WARN: Type inference failed for: r9v218 */
    /* JADX WARN: Type inference failed for: r9v219 */
    /* JADX WARN: Type inference failed for: r9v220 */
    /* JADX WARN: Type inference failed for: r9v221 */
    /* JADX WARN: Type inference failed for: r9v222 */
    /* JADX WARN: Type inference failed for: r9v223 */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v227 */
    /* JADX WARN: Type inference failed for: r9v228 */
    /* JADX WARN: Type inference failed for: r9v229 */
    /* JADX WARN: Type inference failed for: r9v230 */
    /* JADX WARN: Type inference failed for: r9v231 */
    /* JADX WARN: Type inference failed for: r9v232 */
    /* JADX WARN: Type inference failed for: r9v233 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v89 */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v91 */
    /* JADX WARN: Type inference failed for: r9v95 */
    /* JADX WARN: Type inference failed for: r9v96 */
    /* JADX WARN: Type inference failed for: r9v97 */
    /* JADX WARN: Type inference failed for: r9v98 */
    /* JADX WARN: Type inference failed for: r9v99 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 15474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.sfcui.profile.esim.ESimActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$8KpNPhEOvVzjtGXsjCG9QUAPds4(ESimActivity eSimActivity, ScreenInformation screenInformation) {
        int i = 2 % 2;
        int i2 = copy + 123;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 == 0) {
            observeScreenTransition$lambda$3(eSimActivity, screenInformation);
            throw null;
        }
        Unit unitObserveScreenTransition$lambda$3 = observeScreenTransition$lambda$3(eSimActivity, screenInformation);
        int i3 = copy + 97;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 != 0) {
            return unitObserveScreenTransition$lambda$3;
        }
        throw null;
    }

    public static Unit $r8$lambda$Dglng7GJ_xL1RMSdsdRkofIHR00(ESimActivity eSimActivity, Boolean bool) {
        int i = 2 % 2;
        int i2 = copy + 95;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return observeEsimSupport$lambda$4(eSimActivity, bool);
        }
        observeEsimSupport$lambda$4(eSimActivity, bool);
        throw null;
    }

    public static WindowInsetsCompat $r8$lambda$VMKmSJGG2GafPmsi1G8DHhj5nb8(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 109;
        copy = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsets$lambda$7 = setWindowInsets$lambda$7(view, windowInsetsCompat);
        int i4 = copy + 59;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return windowInsets$lambda$7;
    }

    public static void m11666$r8$lambda$Z_F0T1LO0vnwK5GlQOidIeOtU(ESimActivity eSimActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        copy = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$2(eSimActivity, activityResult);
        int i4 = getRequestBeneficiariesState + 23;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static void $r8$lambda$xazZCtAD03D74sjh3tv2VoebyBU(ESimActivity eSimActivity, Map map) {
        int i = 2 % 2;
        int i2 = copy + 55;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        requestPhoneStatePermission$lambda$1(eSimActivity, map);
        int i4 = copy + 9;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        hashCode = 1;
        component1();
        ShareDataUIState();
        INSTANCE = new Companion(null);
        $stable = 8;
        int i = getAsAtTimestamp + 71;
        hashCode = i % 128;
        int i2 = i % 2;
    }

    static void ShareDataUIState() {
        int i = 2 % 2;
        int i2 = copy + 81;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        component3 = (char) 43966;
        component2 = (char) 8726;
        ShareDataUIState = (char) 55845;
        copydefault = (char) 17122;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component1() {
        component1 = -890926342;
        component4 = new char[]{61446, 47377, 25139, 11101, 54376, 40310, 18067, 4065, 47302, 25039, 10983, 54337, 40198, 17980, 3907, 47206, 24977, 10902, 54179, 40150, 17875, 3831, 47109, 24874, 10822, 54107, 14869, 29531, 43044, 57694, 7799, 22379, 36052, 50668, 29397, 43929, 57574, 7707, 22334, 35881, 50452, 29228, 43924, 57487, 6575, 22157, 36855, 50361, 29191, 43836, 57439, 6428, 22067, 36764, 50353, 32167, 43713, 58285, 6423, 22023, 36724, 50189, 32034, 43579, 58246, 6380, 20868, 36551, 51182, 32030, 43617, 58154, 6210, 20862, 36547, 51085, 31990, 46477, 58096, 7143, 20817, 36407, 51025, 31820, 46446, 58007, 7092, 20646, 35265, 50934, 3142, 17672, 40574, 55130, 10279, 24888, 47828, 62443, 17536, 40397, 55013, 10264, 24929, 47742, 62227, 17532, 40339, 54925, 12275, 24715, 47524, 62137, 17502, 40296, 54786, 12106, 24624, 47565, 62130, 19453, 40085, 54776, 12102, 24664, 47397, 61966, 19239, 40042, 54750, 11963, 26497, 47256, 61887, 19273, 40038, 54647, 11796, 26493, 47303, 61913, 19109, 33671, 54439, 11710, 26454, 47164, 61783, 19019, 33598, 54476, 11744, 26362, 49043, 61693, 36738, 50822, 7598, 21714, 44025, 58024, 14677, 28781, 50972, 7687, 21794, 43989, 58105, 14772, 28814, 51127, 7771, 21828, 44136, 58128, 14910, 28965, 51097, 7840, 21892, 44230, 58354, 14864, 28975, 51251, 8014, 22113, 44171, 58241, 15022, 29068, 51437, 8167, 22043, 44336, 58446, 15169, 29291, 51351, 8107, 22176, 44511, 58540, 15113, 29213, 51511, CharUtils.CR, 22379, 44642, 58515, 15341, 29379, 51676, 253, 22279, 44601, 58662, 15381, 29556, 51672, 221, 22463, 44756, 58863, 15612, 29454, 51761, 3090, 17759, 40487, 55048, 10274, 24893, 47748, 62440, 17563, 40350, 54966, 10310, 24934, 47715, 62226, 17451, 40387, 55000, 12267, 24799, 47522, 62142, 17412, 40307, 54784, 12107, 24626, 47515, 62190, 19450, 40095, 54696, 12055, 24666, 47473, 61966, 3100, 17679, 40496, 55135, 10296, 24930, 47751, 62384, 17617, 40320, 54997, 10247, 24869, 47674, 62275, 17523, 25129, 11071, 61509, 47417, 17987, 3849, 54454, 40413, 10931, 62457, 47320, 17967, 3846, 54349, 40228, 10780, 62373, 47291, 16792, 3821, 55238, 40152, 10804, 62297, 47209, 16761, 3586, 55208, 40065, 9677, 62194, 48074, 16681, 3643, 55064, 40033, 9543, 62044, 48056, 16520, 2531, 55033, 40838, 9516, 61956, 47901, 16500, 2331, 54951, 40937, 9413, 60896, 47815, 17289, 2403, 54793, 40758, 9262, 60754, 47789, 17286, 2250, 53668, 40654, 9189, 27376, 45525, 63660, 1924, 20118, 38265, 56384, 27428, 45623, 25514, 10932, 61847, 47330, 18375, 3792, 54585, 39940, 11111, 62064};
        equals = -2157664378492992146L;
    }
}
