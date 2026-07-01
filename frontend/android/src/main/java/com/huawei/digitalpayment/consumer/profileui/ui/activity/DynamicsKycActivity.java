package com.huawei.digitalpayment.consumer.profileui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Observer;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.fastjson.parser.JSONLexer;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.huawei.common.util.SPUtils;
import com.huawei.common.util.ToastUtils;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils;
import com.huawei.digitalpayment.consumer.profile.model.local.LocalKycGroup;
import com.huawei.digitalpayment.consumer.profile.model.request.UpdateKycParams;
import com.huawei.digitalpayment.consumer.profile.viewmodel.UpdateDynamicsKycViewModel;
import com.huawei.digitalpayment.consumer.profileui.R;
import com.huawei.digitalpayment.consumer.profileui.databinding.ProfileActivityDynamicsKycBinding;
import com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView;
import com.huawei.payment.mvvm.Resource;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.cancelAll;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0014H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profileui/ui/activity/DynamicsKycActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/profileui/databinding/ProfileActivityDynamicsKycBinding;", "Lcom/huawei/digitalpayment/consumer/profile/viewmodel/UpdateDynamicsKycViewModel;", "<init>", "()V", "localKycGroup", "Lcom/huawei/digitalpayment/consumer/profile/model/local/LocalKycGroup;", "dynamicsViews", "", "Lcom/huawei/digitalpayment/customer/dynamics/base/BaseDynamicsView;", "extProperties", "Ljava/util/HashMap;", "", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "identifyPin", "", "getLayoutId", "", "initToolbar", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "submit", "Companion", "ConsumerProfileUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class DynamicsKycActivity extends Hilt_DynamicsKycActivity<ProfileActivityDynamicsKycBinding, UpdateDynamicsKycViewModel> {

    public static final Companion INSTANCE;
    public static final String KEY_GUIGROUP = "GuiGroup";
    private static boolean ShareDataUIState;
    private static char[] component1;
    private static boolean component2;
    private static int component3;
    private static char[] copydefault;
    private static int equals;
    private static char getRequestBeneficiariesState;
    private final List<BaseDynamicsView> dynamicsViews = new ArrayList();
    private final HashMap<String, Object> extProperties = new HashMap<>();
    private ActivityResultLauncher<Intent> launcher;
    private LocalKycGroup localKycGroup;
    private static final byte[] $$c = {125, 44, 8, -98};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {34, -56, Ascii.SUB, -92, 20, 6, -55, 77, -10, 13, 3, Ascii.EM, -1, 2, 20, 6, -55, 77, -3, 1, Ascii.EM, -5, 7, Ascii.EM, -4, -51, Base64.padSymbol, 20, 6, Ascii.VT, 7, Ascii.FF, -6, -47, Base64.padSymbol, 20, 7, 0, Ascii.VT, 17, 3, -4, Ascii.ESC, -3, Ascii.SO, 7, -56, Ascii.GS, TarHeader.LF_BLK, 7, 0, Ascii.VT, 17, 3, -28, 45, 0, 17, -30, TarHeader.LF_CHR, -7, Ascii.DLE, -65, 37, 42, Ascii.EM, -3, Ascii.SO, 7, -35, 45, 9, Ascii.SI, PSSSigner.TRAILER_IMPLICIT, 39, TarHeader.LF_CONTIG, -5, 4, Ascii.ESC, 3, Ascii.VT, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 6, -55, 65, Ascii.DLE, 8, 0, 13, 1, -47, 59, Ascii.NAK, -2, Ascii.SYN, 5, 2, 3, -46, 71, -4, Ascii.ESC, -7, Ascii.NAK, -1, 0, 19, -54, 67, 13, Ascii.SO, -7, Ascii.NAK, 4, -5, 19, -54, 42, Ascii.EM, Ascii.EM, -7, 10, Ascii.SI, -3, 9, Ascii.DC2, 1, -10, 37, -7, Ascii.EM, 9, -6, -20, 45, Ascii.SO, -43, 57, 8, -9, 32, -77, Ascii.NAK, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59};
    private static final int $$h = 131;
    private static final byte[] $$a = {90, 10, -103, 87, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 59, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 37;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getAsAtTimestamp = 1;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component2 implements Observer, FunctionAdapter {
        private static int component1 = 0;
        private static int component2 = 1;
        private final Function1 ShareDataUIState;

        component2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.ShareDataUIState = function1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean equals(java.lang.Object r6) {
            /*
                r5 = this;
                r0 = 2
                int r1 = r0 % r0
                boolean r1 = r6 instanceof androidx.lifecycle.Observer
                r2 = 0
                if (r1 == 0) goto L37
                int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.component1
                int r3 = r1 + 27
                int r4 = r3 % 128
                com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.component2 = r4
                int r3 = r3 % r0
                if (r3 != 0) goto L1b
                boolean r3 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                r4 = 77
                int r4 = r4 / r2
                if (r3 == 0) goto L37
                goto L1f
            L1b:
                boolean r3 = r6 instanceof kotlin.jvm.internal.FunctionAdapter
                if (r3 == 0) goto L37
            L1f:
                int r1 = r1 + 47
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.component2 = r2
                int r1 = r1 % r0
                r1 = r5
                kotlin.jvm.internal.FunctionAdapter r1 = (kotlin.jvm.internal.FunctionAdapter) r1
                kotlin.Function r1 = r1.getFunctionDelegate()
                kotlin.jvm.internal.FunctionAdapter r6 = (kotlin.jvm.internal.FunctionAdapter) r6
                kotlin.Function r6 = r6.getFunctionDelegate()
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r6)
            L37:
                int r6 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.component1
                int r6 = r6 + 57
                int r1 = r6 % 128
                com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.component2 = r1
                int r6 = r6 % r0
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.component2.equals(java.lang.Object):boolean");
        }

        @Override
        public final Function<?> getFunctionDelegate() {
            int i = 2 % 2;
            int i2 = component1 + 41;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Function1 function1 = this.ShareDataUIState;
            if (i3 != 0) {
                return function1;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = component1 + 27;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            int iHashCode = getFunctionDelegate().hashCode();
            int i4 = component2 + 99;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return iHashCode;
        }

        @Override
        public final void onChanged(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 107;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            this.ShareDataUIState.invoke(obj);
            int i4 = component2 + 73;
            component1 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 14 / 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r6 = r6 + 68
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.$$c
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r8 = -r8
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.$$i(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r0 = r7 + 4
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.$$a
            int r6 = 99 - r6
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L15
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.d(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 16
            int r8 = r8 + 83
            int r0 = r7 + 10
            byte[] r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.$$g
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 9
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.e(short, int, short, java.lang.Object[]):void");
    }

    public DynamicsKycActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;

            @Override
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 47;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    DynamicsKycActivity.m10866$r8$lambda$mI0ZVWKgehapXJX4xAAKk4mCXk(this.f$0, (ActivityResult) obj);
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }
                DynamicsKycActivity.m10866$r8$lambda$mI0ZVWKgehapXJX4xAAKk4mCXk(this.f$0, (ActivityResult) obj);
                int i3 = component1 + 35;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.launcher = activityResultLauncherRegisterForActivityResult;
    }

    private static final void launcher$lambda$0(DynamicsKycActivity dynamicsKycActivity, ActivityResult activityResult) {
        String stringExtra;
        int i = 2 % 2;
        int i2 = copy + 53;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(dynamicsKycActivity, "");
            Intrinsics.checkNotNullParameter(activityResult, "");
            int i3 = 19 / 0;
            if (activityResult.getResultCode() != -1) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(dynamicsKycActivity, "");
            Intrinsics.checkNotNullParameter(activityResult, "");
            if (activityResult.getResultCode() != -1) {
                return;
            }
        }
        if (activityResult.getData() != null) {
            Intent data = activityResult.getData();
            if ((data != null ? data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN) : null) != null) {
                int i4 = getAsAtTimestamp + 99;
                copy = i4 % 128;
                int i5 = i4 % 2;
                Intent data2 = activityResult.getData();
                if (data2 == null || (stringExtra = data2.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN)) == null) {
                    stringExtra = "";
                }
                UpdateDynamicsKycViewModel updateDynamicsKycViewModel = (UpdateDynamicsKycViewModel) dynamicsKycActivity.viewModel;
                String string = SPUtils.getInstance().getString("recent_login_phone_number");
                HashMap<String, Object> map = dynamicsKycActivity.extProperties;
                String pinKeyVersion = AppConfigManager.getAppConfig().getPinKeyVersion();
                Intrinsics.checkNotNullExpressionValue(pinKeyVersion, "");
                updateDynamicsKycViewModel.updateKycInfo(new UpdateKycParams(string, map, stringExtra, pinKeyVersion));
            }
        }
    }

    private final void identifyPin() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 51;
        copy = i2 % 128;
        int i3 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = this.launcher;
        if (i3 == 0) {
            activityResultLauncher.launch(IdentityPinUtils.getIdentityPinIntent());
        } else {
            activityResultLauncher.launch(IdentityPinUtils.getIdentityPinIntent());
            throw null;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 7;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = R.layout.profile_activity_dynamics_kyc;
            throw null;
        }
        int i4 = R.layout.profile_activity_dynamics_kyc;
        int i5 = copy + 55;
        getAsAtTimestamp = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String title) {
        String groupName;
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 57;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
        LocalKycGroup localKycGroup = this.localKycGroup;
        if (localKycGroup != null) {
            int i5 = i2 + 15;
            getAsAtTimestamp = i5 % 128;
            int i6 = i5 % 2;
            groupName = localKycGroup.getGroupName();
            if (i6 == 0) {
                int i7 = 79 / 0;
            }
        } else {
            groupName = null;
        }
        super.initToolbar(groupName);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/huawei/digitalpayment/consumer/profileui/ui/activity/DynamicsKycActivity$Companion;", "", "<init>", "()V", "KEY_GUIGROUP", "", "ConsumerProfileUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 3759, View.MeasureSpec.makeMeasureSpec(0, 0) + 24, (char) KeyEvent.getDeadChar(0, 0), -1670574543, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 7140, 13 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i4 = 689978476;
        int i5 = 5;
        if (component2) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i6 = $11 + 79;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i5;
                    byte b5 = (byte) (b4 - 5);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - TextUtils.indexOf("", ""), 20 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (7644 - TextUtils.indexOf("", "", 0)), -327556343, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i8 = $11 + 71;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 689978476;
                i5 = 5;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!ShareDataUIState) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                cancelVar.component3++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i10 = $10 + 59;
        $11 = i10 % 128;
        int i11 = i10 % 2;
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
            Object[] objArr5 = {cancelVar, cancelVar};
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
            if (objCopydefault4 == null) {
                byte b6 = (byte) 5;
                byte b7 = (byte) (b6 - 5);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2748 - View.MeasureSpec.getMode(0), 19 - Gravity.getAbsoluteGravity(0, 0), (char) (7643 - TextUtils.indexOf((CharSequence) "", '0')), -327556343, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault4).invoke(null, objArr5);
        }
        String str = new String(cArr6);
        int i12 = $10 + 77;
        $11 = i12 % 128;
        int i13 = i12 % 2;
        objArr[0] = str;
    }

    private static void c(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2;
        int i4 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = copydefault;
        long j = 0;
        Object obj2 = null;
        if (cArr2 != null) {
            int i5 = $11 + 69;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7422 - KeyEvent.keyCodeFromString(""), 15 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 64290), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(getRequestBeneficiariesState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 7423, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 64291), 682917265, false, "v", new Class[]{Integer.TYPE});
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
            cancelall.component2 = 0;
            while (cancelall.component2 < i2) {
                int i8 = $11 + 85;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                    cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    int i10 = $10 + 51;
                    $11 = i10 % 128;
                    int i11 = i10 % i3;
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
                        int iAlpha = 7117 - Color.alpha(0);
                        int iRed = 14 - Color.red(0);
                        char longPressTimeout = (char) (44463 - (ViewConfiguration.getLongPressTimeout() >> 16));
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
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iAlpha, iRed, longPressTimeout, 1150140696, false, "x", clsArr);
                    }
                    if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
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
                            objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2945 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 23 - MotionEvent.axisFromString(""), (char) (27637 - (ViewConfiguration.getPressedStateDuration() >> 16)), 794909189, false, $$i((byte) 51, b3, (byte) (b3 - 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
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
        int i17 = $10 + 107;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 0;
        while (i19 < i) {
            int i20 = $11 + 123;
            $10 = i20 % 128;
            if (i20 % 2 != 0) {
                cArr4[i19] = (char) (cArr4[i19] ^ 24634);
                i19 += 56;
            } else {
                cArr4[i19] = (char) (cArr4[i19] ^ 13722);
                i19++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final void onCreate$lambda$1(DynamicsKycActivity dynamicsKycActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 59;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(dynamicsKycActivity, "");
        dynamicsKycActivity.submit();
        int i4 = getAsAtTimestamp + 77;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x085b  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.hideLoading(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if ((!r5.error()) == true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        com.huawei.common.util.ToastUtils.showLong(r5.getMessage(), new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r5.success() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r5 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.getAsAtTimestamp + 93;
        com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.copy = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if ((r5 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        r4.finish();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        r4.finish();
        r4 = null;
        r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r5.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r5.loading() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
    
        com.huawei.common.widget.dialog.DialogManager.showLoading(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.Unit onCreate$lambda$2(com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity r4, com.huawei.payment.mvvm.Resource r5) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.copy
            int r1 = r1 + 55
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.getAsAtTimestamp = r2
            int r1 = r1 % r0
            r2 = 0
            java.lang.String r3 = ""
            if (r1 != 0) goto L21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            boolean r1 = r5.loading()
            r3 = 86
            int r3 = r3 / r2
            if (r1 == 0) goto L35
            goto L2d
        L21:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            boolean r1 = r5.loading()
            if (r1 == 0) goto L35
        L2d:
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            com.huawei.common.widget.dialog.DialogManager.showLoading(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L35:
            r1 = r4
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            com.huawei.common.widget.dialog.DialogManager.hideLoading(r1)
            boolean r1 = r5.error()
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L4f
            java.lang.String r4 = r5.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.huawei.common.util.ToastUtils.showLong(r4, r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L4f:
            boolean r5 = r5.success()
            if (r5 == 0) goto L6c
            int r5 = com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.getAsAtTimestamp
            int r5 = r5 + 93
            int r1 = r5 % 128
            com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.copy = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L64
            r4.finish()
            goto L6c
        L64:
            r4.finish()
            r4 = 0
            r4.hashCode()
            throw r4
        L6c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.onCreate$lambda$2(com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity, com.huawei.payment.mvvm.Resource):kotlin.Unit");
    }

    private final void submit() {
        String errorMessage;
        String str;
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 91;
        copy = i2 % 128;
        int i3 = i2 % 2;
        this.extProperties.clear();
        Iterator<BaseDynamicsView> it = this.dynamicsViews.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (this.extProperties.isEmpty()) {
                    ToastUtils.showLong(getString(R.string.profile_information_not_modify_tips), new Object[0]);
                    return;
                }
                identifyPin();
                int i4 = getAsAtTimestamp + 63;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                str.hashCode();
                throw null;
            }
            BaseDynamicsView next = it.next();
            if (!next.isLegal()) {
                int i5 = copy + 25;
                getAsAtTimestamp = i5 % 128;
                if (i5 % 2 == 0) {
                    errorMessage = next.getErrorMessage();
                    str = errorMessage;
                    int i6 = 38 / 0;
                    if (str == null) {
                        return;
                    }
                } else {
                    errorMessage = next.getErrorMessage();
                    str = errorMessage;
                    if (str == null) {
                        return;
                    }
                }
                if (str.length() == 0) {
                    return;
                }
                next.showError(errorMessage);
                return;
            }
            Object commitValue = next.getCommitValue();
            if (!Intrinsics.areEqual(next.getDynamicsElement().getValue(), commitValue != null ? commitValue.toString() : null)) {
                this.extProperties.put(next.getCommitKey(), next.getCommitValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ec  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 63;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            c(25 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{'%', 6, 22, '\f', '\n', JSONLexer.EOI, '!', JSONLexer.EOI, '$', 20, 16, 20, 31, '0', 3, 22, '\n', 27, 2, 5, 28, 17, 11, '$', '(', 27}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).codePointAt(0) + 32), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(18 - TextUtils.getTrimmedLength(""), new char[]{'*', '\n', 13815, 13815, '%', 4, 6, 29, 13817, 13817, 31, JSONLexer.EOI, '0', Typography.amp, 3, 22, '\t', 5}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131955137_res_0x7f130dc1).substring(0, 3).length() + 12), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 47;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = getAsAtTimestamp + 9;
                copy = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6618, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 42, (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 56 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x08d4 A[Catch: all -> 0x09fb, TryCatch #33 {all -> 0x09fb, blocks: (B:106:0x08ca, B:107:0x08ce, B:109:0x08d4, B:112:0x08ee, B:75:0x0635, B:93:0x0799, B:96:0x07e6, B:101:0x0860, B:105:0x08c2), top: B:828:0x0635 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01d8 A[PHI: r14
  0x01d8: PHI (r14v4 ??) = (r14v85 ??), (r14v79 ?? I:??[int, float, short, byte, char]) binds: [B:3:0x01c0, B:7:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0ab5 A[Catch: all -> 0x0483, TryCatch #36 {all -> 0x0483, blocks: (B:172:0x0aaf, B:174:0x0ab5, B:175:0x0ae3, B:672:0x2eb6, B:674:0x2ebc, B:675:0x2ee7, B:708:0x321b, B:710:0x3221, B:711:0x3249, B:688:0x3045, B:690:0x3068, B:691:0x30c0, B:638:0x2b7b, B:640:0x2b81, B:641:0x2bab, B:732:0x3334, B:734:0x333a, B:735:0x3364, B:737:0x339e, B:738:0x33e5, B:516:0x2386, B:518:0x239b, B:519:0x23cb, B:750:0x3496, B:752:0x349c, B:753:0x34c6, B:755:0x3500, B:756:0x3543, B:485:0x1efe, B:487:0x1f13, B:488:0x1f47, B:490:0x1f7b, B:491:0x1ff4, B:464:0x1c8a, B:466:0x1c90, B:467:0x1cbe, B:419:0x1a51, B:421:0x1a57, B:422:0x1a85, B:331:0x14ea, B:333:0x14f0, B:334:0x1520, B:241:0x0f59, B:243:0x0f5f, B:244:0x0f88, B:22:0x01ff, B:24:0x0205, B:25:0x022f, B:27:0x03ee, B:29:0x041f, B:30:0x047d), top: B:834:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0b6f A[Catch: all -> 0x0ed9, TryCatch #25 {all -> 0x0ed9, blocks: (B:179:0x0b69, B:181:0x0b6f, B:182:0x0bb9, B:184:0x0bc6, B:186:0x0bcf, B:187:0x0c15, B:207:0x0dce, B:215:0x0e3a, B:221:0x0ebd, B:223:0x0ec3, B:224:0x0ec4, B:226:0x0ec6, B:228:0x0ecd, B:229:0x0ece, B:189:0x0c21, B:196:0x0cac, B:198:0x0cb2, B:199:0x0cf2, B:201:0x0d1c, B:203:0x0d69, B:205:0x0d80, B:206:0x0dc4, B:231:0x0ed0, B:233:0x0ed7, B:234:0x0ed8, B:217:0x0e40, B:211:0x0dff, B:213:0x0e05, B:214:0x0e33, B:191:0x0c41, B:193:0x0c53, B:194:0x0ca0), top: B:815:0x0b69, outer: #29, inners: #14, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0bc6 A[Catch: all -> 0x0ed9, TryCatch #25 {all -> 0x0ed9, blocks: (B:179:0x0b69, B:181:0x0b6f, B:182:0x0bb9, B:184:0x0bc6, B:186:0x0bcf, B:187:0x0c15, B:207:0x0dce, B:215:0x0e3a, B:221:0x0ebd, B:223:0x0ec3, B:224:0x0ec4, B:226:0x0ec6, B:228:0x0ecd, B:229:0x0ece, B:189:0x0c21, B:196:0x0cac, B:198:0x0cb2, B:199:0x0cf2, B:201:0x0d1c, B:203:0x0d69, B:205:0x0d80, B:206:0x0dc4, B:231:0x0ed0, B:233:0x0ed7, B:234:0x0ed8, B:217:0x0e40, B:211:0x0dff, B:213:0x0e05, B:214:0x0e33, B:191:0x0c41, B:193:0x0c53, B:194:0x0ca0), top: B:815:0x0b69, outer: #29, inners: #14, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c21 A[Catch: all -> 0x0ed9, TRY_LEAVE, TryCatch #25 {all -> 0x0ed9, blocks: (B:179:0x0b69, B:181:0x0b6f, B:182:0x0bb9, B:184:0x0bc6, B:186:0x0bcf, B:187:0x0c15, B:207:0x0dce, B:215:0x0e3a, B:221:0x0ebd, B:223:0x0ec3, B:224:0x0ec4, B:226:0x0ec6, B:228:0x0ecd, B:229:0x0ece, B:189:0x0c21, B:196:0x0cac, B:198:0x0cb2, B:199:0x0cf2, B:201:0x0d1c, B:203:0x0d69, B:205:0x0d80, B:206:0x0dc4, B:231:0x0ed0, B:233:0x0ed7, B:234:0x0ed8, B:217:0x0e40, B:211:0x0dff, B:213:0x0e05, B:214:0x0e33, B:191:0x0c41, B:193:0x0c53, B:194:0x0ca0), top: B:815:0x0b69, outer: #29, inners: #14, #18, #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0de0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1016 A[Catch: all -> 0x1431, TryCatch #9 {all -> 0x1431, blocks: (B:248:0x1010, B:250:0x1016, B:251:0x1060, B:253:0x106d, B:255:0x1076, B:256:0x10b8, B:280:0x12e4, B:281:0x12e8, B:283:0x12ee, B:286:0x1306, B:292:0x1320, B:294:0x1323, B:306:0x140b, B:308:0x1411, B:309:0x1412, B:311:0x1414, B:313:0x141b, B:314:0x141c, B:257:0x10c3, B:269:0x11bd, B:271:0x11c3, B:272:0x1208, B:274:0x1232, B:276:0x127f, B:278:0x1296, B:279:0x12dc, B:316:0x141e, B:318:0x1425, B:319:0x1426, B:321:0x1428, B:323:0x142f, B:324:0x1430, B:259:0x10e3, B:261:0x10f8, B:262:0x1127, B:302:0x138a, B:297:0x134f, B:299:0x1355, B:300:0x1382, B:264:0x112e, B:266:0x1143, B:267:0x11b1), top: B:787:0x1010, outer: #29, inners: #4, #42, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x106d A[Catch: all -> 0x1431, TryCatch #9 {all -> 0x1431, blocks: (B:248:0x1010, B:250:0x1016, B:251:0x1060, B:253:0x106d, B:255:0x1076, B:256:0x10b8, B:280:0x12e4, B:281:0x12e8, B:283:0x12ee, B:286:0x1306, B:292:0x1320, B:294:0x1323, B:306:0x140b, B:308:0x1411, B:309:0x1412, B:311:0x1414, B:313:0x141b, B:314:0x141c, B:257:0x10c3, B:269:0x11bd, B:271:0x11c3, B:272:0x1208, B:274:0x1232, B:276:0x127f, B:278:0x1296, B:279:0x12dc, B:316:0x141e, B:318:0x1425, B:319:0x1426, B:321:0x1428, B:323:0x142f, B:324:0x1430, B:259:0x10e3, B:261:0x10f8, B:262:0x1127, B:302:0x138a, B:297:0x134f, B:299:0x1355, B:300:0x1382, B:264:0x112e, B:266:0x1143, B:267:0x11b1), top: B:787:0x1010, outer: #29, inners: #4, #42, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x10c3 A[Catch: all -> 0x1431, TRY_LEAVE, TryCatch #9 {all -> 0x1431, blocks: (B:248:0x1010, B:250:0x1016, B:251:0x1060, B:253:0x106d, B:255:0x1076, B:256:0x10b8, B:280:0x12e4, B:281:0x12e8, B:283:0x12ee, B:286:0x1306, B:292:0x1320, B:294:0x1323, B:306:0x140b, B:308:0x1411, B:309:0x1412, B:311:0x1414, B:313:0x141b, B:314:0x141c, B:257:0x10c3, B:269:0x11bd, B:271:0x11c3, B:272:0x1208, B:274:0x1232, B:276:0x127f, B:278:0x1296, B:279:0x12dc, B:316:0x141e, B:318:0x1425, B:319:0x1426, B:321:0x1428, B:323:0x142f, B:324:0x1430, B:259:0x10e3, B:261:0x10f8, B:262:0x1127, B:302:0x138a, B:297:0x134f, B:299:0x1355, B:300:0x1382, B:264:0x112e, B:266:0x1143, B:267:0x11b1), top: B:787:0x1010, outer: #29, inners: #4, #42, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x12ee A[Catch: all -> 0x1431, TryCatch #9 {all -> 0x1431, blocks: (B:248:0x1010, B:250:0x1016, B:251:0x1060, B:253:0x106d, B:255:0x1076, B:256:0x10b8, B:280:0x12e4, B:281:0x12e8, B:283:0x12ee, B:286:0x1306, B:292:0x1320, B:294:0x1323, B:306:0x140b, B:308:0x1411, B:309:0x1412, B:311:0x1414, B:313:0x141b, B:314:0x141c, B:257:0x10c3, B:269:0x11bd, B:271:0x11c3, B:272:0x1208, B:274:0x1232, B:276:0x127f, B:278:0x1296, B:279:0x12dc, B:316:0x141e, B:318:0x1425, B:319:0x1426, B:321:0x1428, B:323:0x142f, B:324:0x1430, B:259:0x10e3, B:261:0x10f8, B:262:0x1127, B:302:0x138a, B:297:0x134f, B:299:0x1355, B:300:0x1382, B:264:0x112e, B:266:0x1143, B:267:0x11b1), top: B:787:0x1010, outer: #29, inners: #4, #42, #43, #47 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x15b0 A[Catch: all -> 0x19c5, TryCatch #17 {all -> 0x19c5, blocks: (B:338:0x15aa, B:340:0x15b0, B:341:0x15f9, B:343:0x1606, B:345:0x160f, B:346:0x164f, B:370:0x1887, B:371:0x188b, B:373:0x1891, B:376:0x18a8, B:379:0x18b5, B:381:0x18b8, B:393:0x199b, B:395:0x19a1, B:396:0x19a2, B:398:0x19a4, B:400:0x19ab, B:401:0x19ac, B:347:0x165a, B:359:0x1761, B:361:0x1767, B:362:0x17ab, B:364:0x17d5, B:366:0x181f, B:368:0x1836, B:369:0x187f, B:404:0x19b2, B:406:0x19b9, B:407:0x19ba, B:409:0x19bc, B:411:0x19c3, B:412:0x19c4, B:384:0x18e3, B:386:0x18e9, B:387:0x1917, B:354:0x16ca, B:356:0x16e6, B:357:0x1755, B:349:0x167a, B:351:0x168f, B:352:0x16c3, B:389:0x191f), top: B:801:0x15aa, outer: #29, inners: #2, #6, #12, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x1606 A[Catch: all -> 0x19c5, TryCatch #17 {all -> 0x19c5, blocks: (B:338:0x15aa, B:340:0x15b0, B:341:0x15f9, B:343:0x1606, B:345:0x160f, B:346:0x164f, B:370:0x1887, B:371:0x188b, B:373:0x1891, B:376:0x18a8, B:379:0x18b5, B:381:0x18b8, B:393:0x199b, B:395:0x19a1, B:396:0x19a2, B:398:0x19a4, B:400:0x19ab, B:401:0x19ac, B:347:0x165a, B:359:0x1761, B:361:0x1767, B:362:0x17ab, B:364:0x17d5, B:366:0x181f, B:368:0x1836, B:369:0x187f, B:404:0x19b2, B:406:0x19b9, B:407:0x19ba, B:409:0x19bc, B:411:0x19c3, B:412:0x19c4, B:384:0x18e3, B:386:0x18e9, B:387:0x1917, B:354:0x16ca, B:356:0x16e6, B:357:0x1755, B:349:0x167a, B:351:0x168f, B:352:0x16c3, B:389:0x191f), top: B:801:0x15aa, outer: #29, inners: #2, #6, #12, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x165a A[Catch: all -> 0x19c5, TRY_LEAVE, TryCatch #17 {all -> 0x19c5, blocks: (B:338:0x15aa, B:340:0x15b0, B:341:0x15f9, B:343:0x1606, B:345:0x160f, B:346:0x164f, B:370:0x1887, B:371:0x188b, B:373:0x1891, B:376:0x18a8, B:379:0x18b5, B:381:0x18b8, B:393:0x199b, B:395:0x19a1, B:396:0x19a2, B:398:0x19a4, B:400:0x19ab, B:401:0x19ac, B:347:0x165a, B:359:0x1761, B:361:0x1767, B:362:0x17ab, B:364:0x17d5, B:366:0x181f, B:368:0x1836, B:369:0x187f, B:404:0x19b2, B:406:0x19b9, B:407:0x19ba, B:409:0x19bc, B:411:0x19c3, B:412:0x19c4, B:384:0x18e3, B:386:0x18e9, B:387:0x1917, B:354:0x16ca, B:356:0x16e6, B:357:0x1755, B:349:0x167a, B:351:0x168f, B:352:0x16c3, B:389:0x191f), top: B:801:0x15aa, outer: #29, inners: #2, #6, #12, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0487 A[PHI: r14
  0x0487: PHI (r14v76 ??) = (r14v4 ??), (r14v78 ??) binds: [B:20:0x01fa, B:7:0x01d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x1891 A[Catch: all -> 0x19c5, TryCatch #17 {all -> 0x19c5, blocks: (B:338:0x15aa, B:340:0x15b0, B:341:0x15f9, B:343:0x1606, B:345:0x160f, B:346:0x164f, B:370:0x1887, B:371:0x188b, B:373:0x1891, B:376:0x18a8, B:379:0x18b5, B:381:0x18b8, B:393:0x199b, B:395:0x19a1, B:396:0x19a2, B:398:0x19a4, B:400:0x19ab, B:401:0x19ac, B:347:0x165a, B:359:0x1761, B:361:0x1767, B:362:0x17ab, B:364:0x17d5, B:366:0x181f, B:368:0x1836, B:369:0x187f, B:404:0x19b2, B:406:0x19b9, B:407:0x19ba, B:409:0x19bc, B:411:0x19c3, B:412:0x19c4, B:384:0x18e3, B:386:0x18e9, B:387:0x1917, B:354:0x16ca, B:356:0x16e6, B:357:0x1755, B:349:0x167a, B:351:0x168f, B:352:0x16c3, B:389:0x191f), top: B:801:0x15aa, outer: #29, inners: #2, #6, #12, #46 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x1b24  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x1b3b A[Catch: all -> 0x1c05, TryCatch #38 {all -> 0x1c05, blocks: (B:439:0x1b26, B:441:0x1b3b, B:442:0x1b6e), top: B:837:0x1b26, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1b81 A[Catch: all -> 0x1bfb, TryCatch #32 {all -> 0x1bfb, blocks: (B:443:0x1b74, B:445:0x1b81, B:446:0x1bf3), top: B:826:0x1b74, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x1d4c  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x1dbc  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x1e01  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1e1a  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x1ee0  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x213a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x2b81 A[Catch: all -> 0x0483, TryCatch #36 {all -> 0x0483, blocks: (B:172:0x0aaf, B:174:0x0ab5, B:175:0x0ae3, B:672:0x2eb6, B:674:0x2ebc, B:675:0x2ee7, B:708:0x321b, B:710:0x3221, B:711:0x3249, B:688:0x3045, B:690:0x3068, B:691:0x30c0, B:638:0x2b7b, B:640:0x2b81, B:641:0x2bab, B:732:0x3334, B:734:0x333a, B:735:0x3364, B:737:0x339e, B:738:0x33e5, B:516:0x2386, B:518:0x239b, B:519:0x23cb, B:750:0x3496, B:752:0x349c, B:753:0x34c6, B:755:0x3500, B:756:0x3543, B:485:0x1efe, B:487:0x1f13, B:488:0x1f47, B:490:0x1f7b, B:491:0x1ff4, B:464:0x1c8a, B:466:0x1c90, B:467:0x1cbe, B:419:0x1a51, B:421:0x1a57, B:422:0x1a85, B:331:0x14ea, B:333:0x14f0, B:334:0x1520, B:241:0x0f59, B:243:0x0f5f, B:244:0x0f88, B:22:0x01ff, B:24:0x0205, B:25:0x022f, B:27:0x03ee, B:29:0x041f, B:30:0x047d), top: B:834:0x01ff }] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x2c35  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x2c86  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x2cda  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x2e96  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x2f7f  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x2fd4  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x3027  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x31fb  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x345c  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x1b0b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0513 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v290, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v291 */
    /* JADX WARN: Type inference failed for: r11v292 */
    /* JADX WARN: Type inference failed for: r11v293 */
    /* JADX WARN: Type inference failed for: r11v294 */
    /* JADX WARN: Type inference failed for: r11v298 */
    /* JADX WARN: Type inference failed for: r11v299 */
    /* JADX WARN: Type inference failed for: r11v300 */
    /* JADX WARN: Type inference failed for: r11v301 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v51 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v69 */
    /* JADX WARN: Type inference failed for: r14v70 */
    /* JADX WARN: Type inference failed for: r14v71 */
    /* JADX WARN: Type inference failed for: r14v72 */
    /* JADX WARN: Type inference failed for: r14v73 */
    /* JADX WARN: Type inference failed for: r14v74 */
    /* JADX WARN: Type inference failed for: r14v75 */
    /* JADX WARN: Type inference failed for: r14v76 */
    /* JADX WARN: Type inference failed for: r14v78 */
    /* JADX WARN: Type inference failed for: r14v79 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v83 */
    /* JADX WARN: Type inference failed for: r14v84 */
    /* JADX WARN: Type inference failed for: r14v85 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v34 */
    /* JADX WARN: Type inference failed for: r21v35 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v336, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v376 */
    /* JADX WARN: Type inference failed for: r3v400 */
    /* JADX WARN: Type inference failed for: r4v131 */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v139 */
    /* JADX WARN: Type inference failed for: r4v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v144 */
    /* JADX WARN: Type inference failed for: r4v145 */
    /* JADX WARN: Type inference failed for: r4v146 */
    /* JADX WARN: Type inference failed for: r4v147 */
    /* JADX WARN: Type inference failed for: r4v152 */
    /* JADX WARN: Type inference failed for: r4v153 */
    /* JADX WARN: Type inference failed for: r4v154 */
    /* JADX WARN: Type inference failed for: r4v155 */
    /* JADX WARN: Type inference failed for: r4v156 */
    /* JADX WARN: Type inference failed for: r4v157 */
    /* JADX WARN: Type inference failed for: r4v158 */
    /* JADX WARN: Type inference failed for: r4v159 */
    /* JADX WARN: Type inference failed for: r4v160 */
    /* JADX WARN: Type inference failed for: r4v161 */
    /* JADX WARN: Type inference failed for: r4v162 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v151, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v164, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v189, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.profileui.ui.activity.DynamicsKycActivity.attachBaseContext(android.content.Context):void");
    }

    public static Unit $r8$lambda$IwREEHcgtaItXlG80HqbSbiEwEA(DynamicsKycActivity dynamicsKycActivity, Resource resource) {
        int i = 2 % 2;
        int i2 = copy + 89;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnCreate$lambda$2 = onCreate$lambda$2(dynamicsKycActivity, resource);
        if (i3 == 0) {
            int i4 = 65 / 0;
        }
        int i5 = copy + 19;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
        return unitOnCreate$lambda$2;
    }

    public static void m10865$r8$lambda$_QACVf8jTNOJIme25V1e6NWx_Y(DynamicsKycActivity dynamicsKycActivity, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 75;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10867instrumented$0$onCreate$LandroidosBundleV(dynamicsKycActivity, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static void m10866$r8$lambda$mI0ZVWKgehapXJX4xAAKk4mCXk(DynamicsKycActivity dynamicsKycActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 109;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        launcher$lambda$0(dynamicsKycActivity, activityResult);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 13;
        copy = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        equals = 0;
        copydefault();
        INSTANCE = new Companion(null);
        int i = component4 + 7;
        equals = i % 128;
        int i2 = i % 2;
    }

    private static void m10867instrumented$0$onCreate$LandroidosBundleV(DynamicsKycActivity dynamicsKycActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 121;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 != 0) {
                onCreate$lambda$1(dynamicsKycActivity, view);
                Callback.onClick_exit();
            } else {
                onCreate$lambda$1(dynamicsKycActivity, view);
                Callback.onClick_exit();
                throw null;
            }
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 65;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 75;
        getAsAtTimestamp = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void copydefault() {
        component1 = new char[]{30250, 30233, 30247, 30229, 30232, 30242, 30425, 30228, 30267, 30244, 30246, 30427, 30241, 30419, 30426, 30417, 30421, 30422, 30416, 30245, 30423, 30420, 30418, 30231, 30226, 30403, 30243, 30404, 30239, 30235, 30261, 30238};
        component3 = 321287819;
        ShareDataUIState = true;
        component2 = true;
        copydefault = new char[]{2018, 2036, 2030, 1970, 2041, 1969, 1968, 2037, 2034, 2026, 2035, 1974, 2031, 2038, 2024, 2032, 1048, 1054, 2033, 1966, 1973, 1987, 1049, 2003, 2025, 1051, 2020, 1967, 1971, 1965, 2005, 2004, 1050, 2028, 1985, 2029, 1055, 1976, 2027, 2021, 1975, 2017, 1972, 2016, 2023, 2019, 1977, 1978, 2022};
        getRequestBeneficiariesState = (char) 12829;
    }
}
