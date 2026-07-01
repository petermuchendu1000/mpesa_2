package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.collect.Multisets;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.ActionItem;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.ToastState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataTabState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent;
import com.huawei.digitalpayment.consumer.fixeddata.util.ExtensionsKt;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.HomeWirelessViewModel;
import com.huawei.digitalpayment.consumer.remoteconfig.RemoteConfig;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import javax.inject.Inject;
import kotlin.INotificationSideChannel;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0018H\u0014J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020'X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020*X\u008a\u0084\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010-X\u008a\u008e\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataDashboardActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "homeWirelessViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/HomeWirelessViewModel;", "getHomeWirelessViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/HomeWirelessViewModel;", "setHomeWirelessViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/HomeWirelessViewModel;)V", "remoteConfig", "Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "getRemoteConfig", "()Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;", "setRemoteConfig", "(Lcom/huawei/digitalpayment/consumer/remoteconfig/RemoteConfig;)V", "confirmationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", IpcMessageConstants.EXTRA_INTENT, "initObservers", "primeWirelessDetails", "type", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/FixedDataType;", "accountId", "", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;", "wirelessUiState", "accountState", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/AccountState;", "wirelessAccountState", "toastState", "Lcom/huawei/digitalpayment/consumer/fixeddata/domain/model/ToastState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataDashboardActivity extends Hilt_FixedDataDashboardActivity {
    public static final int $stable = 8;
    private static int[] ShareDataUIState;
    private static char component1;
    private static int component2;
    private static long component3;
    private static int component4;
    private static char[] copydefault;
    private final ActivityResultLauncher<Intent> confirmationLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int component1 = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 31;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            FixedDataDashboardActivity.$r8$lambda$ncFdqQwJ3YtpByEqrdCdr54hrDc(this.f$0, (ActivityResult) obj);
            int i4 = component1 + 89;
            component2 = i4 % 128;
            int i5 = i4 % 2;
        }
    });

    @Inject
    public FixedDataViewModel fixedDataViewModel;

    @Inject
    public HomeWirelessViewModel homeWirelessViewModel;

    @Inject
    public RemoteConfig remoteConfig;
    private static final byte[] $$c = {120, -46, -95, -23};
    private static final int $$f = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarHeader.LF_NORMAL, 86, 58, 71, 9, -5, -66, TarHeader.LF_FIFO, 5, -3, -11, 2, -10, -58, TarHeader.LF_NORMAL, 10, -13, Ascii.VT, -6, -9, -8, -57, TarHeader.LF_FIFO, 3, 3, -72, TarHeader.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 56, 2, 3, -18, 10, -7, -16, 8, -65, 73, -3, -18, Ascii.DC2, -10, Ascii.SO, -16, -36, Ascii.SUB, Ascii.DLE, -22, -15, -15, 7, Ascii.RS, -22, Ascii.DLE, -18, 9, -5, 0, -4, -4, -12, 6, 3, PSSSigner.TRAILER_IMPLICIT, 9, -5, 0, -4, -4, -12, 6, 3, -70, 9, -2, 6, -24, -2, -2, -8, 17, -12, 5};
    private static final int $$h = 243;
    private static final byte[] $$a = {120, 65, 99, 57, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 2;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 0;
    private static int equals = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(byte r7, byte r8, short r9) {
        /*
            int r9 = r9 * 3
            int r9 = 1 - r9
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 + 98
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L28
        L15:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.$$i(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 28 - r7
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.$$a
            int r8 = 99 - r8
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r6 = r6 + r8
            int r6 = r6 + (-8)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 10
            int r8 = r8 * 16
            int r8 = r8 + 83
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.$$g
            int r6 = 78 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r6]
        L24:
            int r8 = r8 + r3
            int r8 = r8 + 3
            int r6 = r6 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.d(byte, byte, int, java.lang.Object[]):void");
    }

    public static final ActivityResultLauncher access$getConfirmationLauncher$p(FixedDataDashboardActivity fixedDataDashboardActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 77;
        equals = i3 % 128;
        int i4 = i3 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataDashboardActivity.confirmationLauncher;
        int i5 = i2 + 19;
        equals = i5 % 128;
        if (i5 % 2 != 0) {
            return activityResultLauncher;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$primeWirelessDetails(FixedDataDashboardActivity fixedDataDashboardActivity, FixedDataType fixedDataType, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 31;
        equals = i2 % 128;
        int i3 = i2 % 2;
        fixedDataDashboardActivity.primeWirelessDetails(fixedDataType, str);
        if (i3 == 0) {
            throw null;
        }
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel != null) {
            int i2 = getRequestBeneficiariesState + 15;
            equals = i2 % 128;
            int i3 = i2 % 2;
            return fixedDataViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i4 = equals + 29;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = equals + 117;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
        this.fixedDataViewModel = fixedDataViewModel;
        int i4 = equals + 55;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public final HomeWirelessViewModel getHomeWirelessViewModel() {
        int i = 2 % 2;
        int i2 = equals + 33;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        HomeWirelessViewModel homeWirelessViewModel = this.homeWirelessViewModel;
        if (homeWirelessViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 69;
        equals = i5 % 128;
        int i6 = i5 % 2;
        return homeWirelessViewModel;
    }

    public final void setHomeWirelessViewModel(HomeWirelessViewModel homeWirelessViewModel) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        equals = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(homeWirelessViewModel, "");
            this.homeWirelessViewModel = homeWirelessViewModel;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(homeWirelessViewModel, "");
        this.homeWirelessViewModel = homeWirelessViewModel;
        int i3 = equals + 35;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    public final RemoteConfig getRemoteConfig() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 27;
        int i3 = i2 % 128;
        equals = i3;
        int i4 = i2 % 2;
        RemoteConfig remoteConfig = this.remoteConfig;
        if (remoteConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 51;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 21 / 0;
        }
        return remoteConfig;
    }

    public final void setRemoteConfig(RemoteConfig remoteConfig) {
        int i = 2 % 2;
        int i2 = equals + 115;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
            int i3 = 15 / 0;
        } else {
            Intrinsics.checkNotNullParameter(remoteConfig, "");
            this.remoteConfig = remoteConfig;
        }
        int i4 = equals + 93;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 62 / 0;
        }
    }

    private static final void confirmationLauncher$lambda$0(FixedDataDashboardActivity fixedDataDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = equals + 59;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
            Intrinsics.checkNotNullParameter(activityResult, "");
            activityResult.getResultCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() != -1) {
            fixedDataDashboardActivity.getHomeWirelessViewModel().cancelAutoRenewOptOutToast();
            return;
        }
        fixedDataDashboardActivity.getHomeWirelessViewModel().autoRenewOptOut();
        int i3 = equals + 5;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 1;
        private static int component1;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
            private static int component2 = 1;
            private static int copydefault;
            final FixedDataDashboardActivity ShareDataUIState;

            public static Object component1(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
                int i7 = ~i;
                int i8 = ~i2;
                int i9 = i7 | i8;
                int i10 = ~(i9 | i4);
                int i11 = ~i4;
                int i12 = (~(i7 | i2)) | (~(i8 | i11)) | (~(i8 | i));
                int i13 = ~(i11 | i9);
                int i14 = i + i2 + i6 + (1938118820 * i3) + ((-1869228383) * i5);
                int i15 = i14 * i14;
                int i16 = (i * (-1046486968)) + 2037645312 + ((-1046486968) * i2) + (1604861810 * i10) + (i12 * (-1345052743)) + ((-1345052743) * i13) + (1903427584 * i6) + ((-1907359744) * i3) + (1374945280 * i5) + (1516044288 * i15);
                int i17 = ((i * 647972376) - 1941852458) + (i2 * 647972376) + (i10 * 1702) + (i12 * 851) + (i13 * 851) + (i6 * 647973227) + (i3 * (-1260466036)) + (i5 * 1557372491) + (i15 * 1239351296);
                int i18 = i16 + (i17 * i17 * 490405888);
                return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? ShareDataUIState(objArr) : getAsAtTimestamp(objArr) : component2(objArr) : component3(objArr) : copydefault(objArr) : component1(objArr);
            }

            public static final FixedDataUiState component2(State state) {
                int i = 2 % 2;
                int i2 = component2 + 121;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                FixedDataUiState fixedDataUiState = (FixedDataUiState) component1(-1896831129, 1896831131, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{state});
                int i4 = copydefault + 99;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return fixedDataUiState;
            }

            public static final void component2(MutableState mutableState, ToastState toastState) {
                int i = 2 % 2;
                int i2 = copydefault + 45;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                component3((MutableState<ToastState>) mutableState, toastState);
                if (i3 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static final ToastState component3(MutableState mutableState) {
                int i = 2 % 2;
                int i2 = copydefault + 89;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                    int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                    return (ToastState) component1(320429704, -320429701, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{mutableState});
                }
                int iComponent33 = Multisets.UnmodifiableMultiset.component3();
                int iComponent34 = Multisets.UnmodifiableMultiset.component3();
                int i3 = 22 / 0;
                return (ToastState) component1(320429704, -320429701, Multisets.UnmodifiableMultiset.component3(), iComponent33, Multisets.UnmodifiableMultiset.component3(), iComponent34, new Object[]{mutableState});
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = component2 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 61;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$onCreate$1$1$1", f = "FixedDataDashboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int equals = 1;
                final State<FixedDataUiState> ShareDataUIState;
                final FixedDataDashboardActivity component2;
                final boolean component3;
                int copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component1 + 103;
                    equals = i2 % 128;
                    if (i2 % 2 == 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.copydefault != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    String selectedAccountId = AnonymousClass4.component2(this.ShareDataUIState).getCurrentTabState().getSelectedAccountId();
                    if (!this.component3 || selectedAccountId == null) {
                        this.component2.getHomeWirelessViewModel().cancelAccountDetailsFetch();
                    } else {
                        int i3 = component1 + 13;
                        equals = i3 % 128;
                        int i4 = i3 % 2;
                        this.component2.getHomeWirelessViewModel().fetchAccountDetails(selectedAccountId, AnonymousClass4.component2(this.ShareDataUIState).getSelectedFixedDataType());
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(boolean z, FixedDataDashboardActivity fixedDataDashboardActivity, State<FixedDataUiState> state, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component3 = z;
                    this.component2 = fixedDataDashboardActivity;
                    this.ShareDataUIState = state;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component3, this.component2, this.ShareDataUIState, continuation);
                    int i2 = component1 + 57;
                    equals = i2 % 128;
                    if (i2 % 2 != 0) {
                        return anonymousClass5;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 21;
                    equals = i2 % 128;
                    int i3 = i2 % 2;
                    Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                    int i4 = equals + 87;
                    component1 = i4 % 128;
                    int i5 = i4 % 2;
                    return objShareDataUIState;
                }

                public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 79;
                    equals = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = equals + 81;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$onCreate$1$1$2", f = "FixedDataDashboardActivity.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int equals = 1;
                final Context ShareDataUIState;
                final MutableState<ToastState> component1;
                final FixedDataDashboardActivity component2;
                int copydefault;

                @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/UiEvent;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$onCreate$1$1$2$1", f = "FixedDataDashboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class AnonymousClass3 extends SuspendLambda implements Function2<UiEvent, Continuation<? super Unit>, Object> {
                    private static int component2 = 0;
                    private static int getRequestBeneficiariesState = 1;
                    Object ShareDataUIState;
                    int component1;
                    final Context component3;
                    final MutableState<ToastState> copydefault;

                    @Override
                    public final Object invokeSuspend(Object obj) {
                        int i = 2 % 2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.component1 != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        UiEvent uiEvent = (UiEvent) this.ShareDataUIState;
                        if (uiEvent instanceof UiEvent.ShowError) {
                            if (AnonymousClass4.component3((MutableState) this.copydefault) instanceof ToastState.Loading) {
                                MutableState<ToastState> mutableState = this.copydefault;
                                String string = this.component3.getString(R.string.gsm_fixed_data_toast_stop_autorenew_error);
                                Intrinsics.checkNotNullExpressionValue(string, "");
                                AnonymousClass4.component2(mutableState, new ToastState.Error(string, null, 2, null));
                            } else {
                                Toast.makeText(this.component3, ((UiEvent.ShowError) uiEvent).getError().getResponseDesc(), 1).show();
                            }
                        } else if (uiEvent instanceof UiEvent.AutoRenewOptOutStarted) {
                            MutableState<ToastState> mutableState2 = this.copydefault;
                            String string2 = this.component3.getString(R.string.gsm_fixed_data_toast_stop_autorenew_loading);
                            Intrinsics.checkNotNullExpressionValue(string2, "");
                            AnonymousClass4.component2(mutableState2, new ToastState.Loading(string2));
                            int i2 = getRequestBeneficiariesState + 81;
                            component2 = i2 % 128;
                            int i3 = i2 % 2;
                        } else if (uiEvent instanceof UiEvent.AutoRenewOptOutCompleted) {
                            MutableState<ToastState> mutableState3 = this.copydefault;
                            String string3 = this.component3.getString(R.string.gsm_fixed_data_toast_stop_autorenew_success);
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            AnonymousClass4.component2(mutableState3, new ToastState.Success(string3, null, 2, null));
                        } else if (uiEvent instanceof UiEvent.AutoRenewOptOutCanceled) {
                            AnonymousClass4.component2(this.copydefault, (ToastState) null);
                        }
                        Unit unit = Unit.INSTANCE;
                        int i4 = component2 + 67;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                        return unit;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass3(Context context, MutableState<ToastState> mutableState, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.component3 = context;
                        this.copydefault = mutableState;
                    }

                    @Override
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        int i = 2 % 2;
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component3, this.copydefault, continuation);
                        anonymousClass3.ShareDataUIState = obj;
                        AnonymousClass3 anonymousClass32 = anonymousClass3;
                        int i2 = component2 + 99;
                        getRequestBeneficiariesState = i2 % 128;
                        int i3 = i2 % 2;
                        return anonymousClass32;
                    }

                    public final Object component3(UiEvent uiEvent, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = getRequestBeneficiariesState + 47;
                        component2 = i2 % 128;
                        int i3 = i2 % 2;
                        Object objInvokeSuspend = ((AnonymousClass3) create(uiEvent, continuation)).invokeSuspend(Unit.INSTANCE);
                        int i4 = component2 + 121;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                        return objInvokeSuspend;
                    }

                    @Override
                    public Object invoke(UiEvent uiEvent, Continuation<? super Unit> continuation) {
                        int i = 2 % 2;
                        int i2 = component2 + 25;
                        getRequestBeneficiariesState = i2 % 128;
                        int i3 = i2 % 2;
                        Object objComponent3 = component3(uiEvent, continuation);
                        int i4 = getRequestBeneficiariesState + 113;
                        component2 = i4 % 128;
                        if (i4 % 2 == 0) {
                            return objComponent3;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = equals + 21;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i4 = this.copydefault;
                    if (i4 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.copydefault = 1;
                        if (FlowKt.collectLatest(this.component2.getHomeWirelessViewModel().getEvents(), new AnonymousClass3(this.ShareDataUIState, this.component1, null), this) == coroutine_suspended) {
                            int i5 = equals + 123;
                            component3 = i5 % 128;
                            if (i5 % 2 != 0) {
                                int i6 = 79 / 0;
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        if (i4 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i7 = equals + 105;
                        component3 = i7 % 128;
                        if (i7 % 2 != 0) {
                            ResultKt.throwOnFailure(obj);
                            throw null;
                        }
                        ResultKt.throwOnFailure(obj);
                        int i8 = component3 + 15;
                        equals = i8 % 128;
                        int i9 = i8 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(FixedDataDashboardActivity fixedDataDashboardActivity, Context context, MutableState<ToastState> mutableState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component2 = fixedDataDashboardActivity;
                    this.ShareDataUIState = context;
                    this.component1 = mutableState;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, this.ShareDataUIState, this.component1, continuation);
                    int i2 = equals + 117;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 49 / 0;
                    }
                    return anonymousClass2;
                }

                @Override
                public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = equals + 85;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(coroutineScope, continuation);
                    int i4 = component3 + 105;
                    equals = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objCopydefault;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = equals + 47;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    if (i3 != 0) {
                        int i4 = 33 / 0;
                    }
                    int i5 = component3 + 89;
                    equals = i5 % 128;
                    if (i5 % 2 == 0) {
                        int i6 = 94 / 0;
                    }
                    return objInvokeSuspend;
                }
            }

            private static final Unit component3(FixedDataDashboardActivity fixedDataDashboardActivity, String str) {
                int i = 2 % 2;
                int i2 = component2 + 55;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                fixedDataDashboardActivity.getFixedDataViewModel().selectAccount(str);
                FixedDataDashboardActivity.access$primeWirelessDetails(fixedDataDashboardActivity, fixedDataDashboardActivity.getFixedDataViewModel().getUiState().getValue().getSelectedFixedDataType(), str);
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 39;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0113  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit copydefault(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity r6, com.huawei.digitalpayment.consumer.fixeddata.domain.model.ActionItem r7) {
                /*
                    Method dump skipped, instruction units count: 325
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.AnonymousClass4.copydefault(com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity, com.huawei.digitalpayment.consumer.fixeddata.domain.model.ActionItem):kotlin.Unit");
            }

            private static Object getAsAtTimestamp(Object[] objArr) {
                FixedDataDashboardActivity fixedDataDashboardActivity = (FixedDataDashboardActivity) objArr[0];
                FixedDataType fixedDataType = (FixedDataType) objArr[1];
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                Intrinsics.checkNotNullParameter(fixedDataType, "");
                fixedDataDashboardActivity.getFixedDataViewModel().switchFixedDataType(fixedDataType);
                FixedDataTabState fixedDataTabState = fixedDataDashboardActivity.getFixedDataViewModel().getUiState().getValue().getTabStates().get(fixedDataType);
                String selectedAccountId = null;
                if (fixedDataTabState != null) {
                    int i2 = copydefault + 63;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        fixedDataTabState.getSelectedAccountId();
                        selectedAccountId.hashCode();
                        throw null;
                    }
                    selectedAccountId = fixedDataTabState.getSelectedAccountId();
                }
                FixedDataDashboardActivity.access$primeWirelessDetails(fixedDataDashboardActivity, fixedDataType, selectedAccountId);
                Unit unit = Unit.INSTANCE;
                int i3 = copydefault + 1;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return unit;
            }

            private static final Unit component2(FixedDataDashboardActivity fixedDataDashboardActivity) {
                Unit unit;
                int i = 2 % 2;
                int i2 = component2 + 117;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                    fixedDataDashboardActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                    int i3 = 74 / 0;
                } else {
                    Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                    fixedDataDashboardActivity.getOnBackPressedDispatcher().onBackPressed();
                    unit = Unit.INSTANCE;
                }
                int i4 = component2 + 95;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x00ae  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static final kotlin.Unit component3(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState r21, android.content.Context r22, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity r23, androidx.compose.runtime.State r24, androidx.compose.runtime.State r25) {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.AnonymousClass4.component3(com.huawei.digitalpayment.consumer.fixeddata.domain.model.AccountState, android.content.Context, com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity, androidx.compose.runtime.State, androidx.compose.runtime.State):kotlin.Unit");
            }

            private static final Unit copy(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                RouteUtils.routeWithExecute(fixedDataDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_TOP_UP, new Bundle());
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 81;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 98 / 0;
                }
                return unit;
            }

            private static final Unit getAsAtTimestamp(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                RouteUtils.routeWithExecute(fixedDataDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_CHOOSE_PLAN, new Bundle());
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 125;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static Object component1(Object[] objArr) {
                FixedDataDashboardActivity fixedDataDashboardActivity = (FixedDataDashboardActivity) objArr[0];
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                RouteUtils.routeWithExecute(fixedDataDashboardActivity, RoutePathConstant.SFC_FIXED_DATA_CHOOSE_PLAN, new Bundle());
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 23;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x00d4  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x020d  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void component1(androidx.compose.runtime.Composer r39, int r40) {
                /*
                    Method dump skipped, instruction units count: 774
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.AnonymousClass4.component1(androidx.compose.runtime.Composer, int):void");
            }

            private static final Unit component2(MutableState mutableState) {
                int i = 2 % 2;
                int i2 = component2 + 79;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(mutableState, "");
                component3((MutableState<ToastState>) mutableState, (ToastState) null);
                Unit unit = Unit.INSTANCE;
                int i4 = component2 + 25;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit copydefault(Context context, FixedDataDashboardActivity fixedDataDashboardActivity, MutableState mutableState) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(context, "");
                Intrinsics.checkNotNullParameter(fixedDataDashboardActivity, "");
                Intrinsics.checkNotNullParameter(mutableState, "");
                String string = context.getString(R.string.gsm_fixed_data_toast_stop_autorenew_loading);
                Intrinsics.checkNotNullExpressionValue(string, "");
                component3((MutableState<ToastState>) mutableState, new ToastState.Loading(string));
                fixedDataDashboardActivity.getHomeWirelessViewModel().autoRenewOptOut();
                Unit unit = Unit.INSTANCE;
                int i2 = component2 + 105;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static Object copydefault(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = copydefault + 3;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState fixedDataUiState = (FixedDataUiState) state.getValue();
                int i4 = component2 + 125;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return fixedDataUiState;
            }

            private static final FixedDataUiState ShareDataUIState(State<FixedDataUiState> state) {
                int i = 2 % 2;
                int i2 = component2 + 95;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState value = state.getValue();
                if (i3 == 0) {
                    return value;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final AccountState copydefault(State<? extends AccountState> state) {
                int i = 2 % 2;
                int i2 = component2 + 73;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AccountState value = state.getValue();
                int i4 = copydefault + 77;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return value;
            }

            private static Object ShareDataUIState(Object[] objArr) {
                State state = (State) objArr[0];
                int i = 2 % 2;
                int i2 = component2 + 101;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AccountState accountState = (AccountState) state.getValue();
                int i4 = component2 + 77;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return accountState;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static Object component3(Object[] objArr) {
                ToastState toastState;
                MutableState mutableState = (MutableState) objArr[0];
                int i = 2 % 2;
                int i2 = copydefault + 61;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    toastState = (ToastState) mutableState.getValue();
                    int i3 = 92 / 0;
                } else {
                    toastState = (ToastState) mutableState.getValue();
                }
                int i4 = copydefault + 117;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return toastState;
            }

            private static final void component3(MutableState<ToastState> mutableState, ToastState toastState) {
                int i = 2 % 2;
                int i2 = component2 + 21;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                mutableState.setValue(toastState);
                int i4 = copydefault + 39;
                component2 = i4 % 128;
                int i5 = i4 % 2;
            }

            public static Unit component1(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 45;
                component2 = i2 % 128;
                if (i2 % 2 == 0) {
                    copy(fixedDataDashboardActivity);
                    throw null;
                }
                Unit unitCopy = copy(fixedDataDashboardActivity);
                int i3 = copydefault + 97;
                component2 = i3 % 128;
                if (i3 % 2 != 0) {
                    return unitCopy;
                }
                throw null;
            }

            public static Unit ShareDataUIState(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                int i2 = component2 + 67;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                Unit unit = (Unit) component1(178087375, -178087374, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{fixedDataDashboardActivity});
                int i4 = copydefault + 33;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public static Unit component3(Context context, FixedDataDashboardActivity fixedDataDashboardActivity, MutableState mutableState) {
                int i = 2 % 2;
                int i2 = component2 + 49;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(context, fixedDataDashboardActivity, mutableState);
                if (i3 != 0) {
                    int i4 = 4 / 0;
                }
                return unitCopydefault;
            }

            public static Unit component1(MutableState mutableState) {
                int i = 2 % 2;
                int i2 = component2 + 33;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    return component2(mutableState);
                }
                component2(mutableState);
                throw null;
            }

            public static Unit copydefault(FixedDataDashboardActivity fixedDataDashboardActivity, FixedDataType fixedDataType) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (Unit) component1(251203053, -251203049, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{fixedDataDashboardActivity, fixedDataType});
            }

            public static Unit copydefault(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 33;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit asAtTimestamp = getAsAtTimestamp(fixedDataDashboardActivity);
                int i4 = component2 + 55;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return asAtTimestamp;
            }

            public static Unit component3(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int i = 2 % 2;
                int i2 = component2 + 93;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent2 = component2(fixedDataDashboardActivity);
                int i4 = component2 + 121;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent2;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit copydefault(AccountState accountState, Context context, FixedDataDashboardActivity fixedDataDashboardActivity, State state, State state2) {
                int i = 2 % 2;
                int i2 = copydefault + 81;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(accountState, context, fixedDataDashboardActivity, state, state2);
                int i4 = copydefault + 111;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            public static Unit component2(FixedDataDashboardActivity fixedDataDashboardActivity, ActionItem actionItem) {
                int i = 2 % 2;
                int i2 = copydefault + 21;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitCopydefault = copydefault(fixedDataDashboardActivity, actionItem);
                if (i3 == 0) {
                    int i4 = 26 / 0;
                }
                int i5 = component2 + 93;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unitCopydefault;
            }

            public static Unit ShareDataUIState(FixedDataDashboardActivity fixedDataDashboardActivity, String str) {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent3 = component3(fixedDataDashboardActivity, str);
                int i4 = component2 + 89;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent3;
            }

            AnonymousClass4(FixedDataDashboardActivity fixedDataDashboardActivity) {
                this.ShareDataUIState = fixedDataDashboardActivity;
            }

            private static final FixedDataUiState component3(State<FixedDataUiState> state) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (FixedDataUiState) component1(-1896831129, 1896831131, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{state});
            }

            private static final Unit component4(FixedDataDashboardActivity fixedDataDashboardActivity) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (Unit) component1(178087375, -178087374, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{fixedDataDashboardActivity});
            }

            private static final AccountState component1(State<? extends AccountState> state) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (AccountState) component1(1471259082, -1471259082, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{state});
            }

            private static final ToastState ShareDataUIState(MutableState<ToastState> mutableState) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (ToastState) component1(320429704, -320429701, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{mutableState});
            }

            private static final Unit component1(FixedDataDashboardActivity fixedDataDashboardActivity, FixedDataType fixedDataType) {
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                return (Unit) component1(-337177111, 337177116, Multisets.UnmodifiableMultiset.component3(), iComponent3, Multisets.UnmodifiableMultiset.component3(), iComponent32, new Object[]{fixedDataDashboardActivity, fixedDataType});
            }

            private static Object component2(Object[] objArr) {
                FixedDataDashboardActivity fixedDataDashboardActivity = (FixedDataDashboardActivity) objArr[0];
                FixedDataType fixedDataType = (FixedDataType) objArr[1];
                int i = 2 % 2;
                int i2 = copydefault + 31;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object obj = null;
                Object[] objArr2 = {fixedDataDashboardActivity, fixedDataType};
                int iComponent3 = Multisets.UnmodifiableMultiset.component3();
                int iComponent32 = Multisets.UnmodifiableMultiset.component3();
                int iComponent33 = Multisets.UnmodifiableMultiset.component3();
                int iComponent34 = Multisets.UnmodifiableMultiset.component3();
                if (i3 == 0) {
                    obj.hashCode();
                    throw null;
                }
                Unit unit = (Unit) component1(-337177111, 337177116, iComponent33, iComponent3, iComponent34, iComponent32, objArr2);
                int i4 = copydefault + 19;
                component2 = i4 % 128;
                if (i4 % 2 != 0) {
                    return unit;
                }
                throw null;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component1 + 75;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        
            if (r12 == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
        
            if (r12 == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r11.skipToGroupEnd();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void component1(androidx.compose.runtime.Composer r11, int r12) {
            /*
                r10 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.component1
                int r1 = r1 + 39
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.ShareDataUIState = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L14
                r12 = r12 & 21
                r1 = 4
                if (r12 != r1) goto L33
                goto L18
            L14:
                r12 = r12 & 11
                if (r12 != r0) goto L33
            L18:
                int r2 = r2 + 107
                int r12 = r2 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.component1 = r12
                int r2 = r2 % r0
                boolean r12 = r11.getSkipping()
                if (r2 == 0) goto L2c
                r0 = 9
                int r0 = r0 / 0
                if (r12 != 0) goto L2f
                goto L33
            L2c:
                if (r12 != 0) goto L2f
                goto L33
            L2f:
                r11.skipToGroupEnd()
                goto L55
            L33:
                r0 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$component1$4 r12 = new com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$component1$4
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity r6 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.this
                r12.<init>(r6)
                r6 = 54
                r7 = -367058645(0xffffffffea1f212b, float:-4.809396E25)
                r8 = 1
                androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(r7, r8, r12, r11, r6)
                r6 = r12
                kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                r8 = 1572864(0x180000, float:2.204052E-39)
                r9 = 63
                r7 = r11
                com.safaricom.designsystem.theme.OneAppThemeKt.OneAppTheme(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            L55:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.component1.component1(androidx.compose.runtime.Composer, int):void");
        }

        component1() {
        }
    }

    private static void a(char[] cArr, int i, char[] cArr2, char c2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        int i3 = $10 + 57;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iNotificationSideChannel.copydefault < length3) {
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = (byte) (b2 + 1);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - View.MeasureSpec.getMode(0), View.resolveSizeAndState(0, 0, 0) + 31, (char) (19181 - KeyEvent.getDeadChar(0, 0)), 1912513118, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.getOffsetAfter("", 0) + 11, (char) View.resolveSize(0, 0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2458, 28 - Color.green(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 931716605, false, $$i(b4, b5, b5), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Color.green(0) + 11, (char) View.MeasureSpec.getSize(0), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[iNotificationSideChannel.copydefault])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) component1) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 81;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        getActiveNotifications getactivenotifications = new getActiveNotifications();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = ShareDataUIState;
        int i4 = 684241640;
        long j = 0;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 59;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                if (i9 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                        Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                        if (objCopydefault == null) {
                            byte b2 = (byte) 0;
                            objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getTouchSlop() >> 8) + 4391, ExpandableListView.getPackedPositionGroup(j) + 37, (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), -309236339, false, $$i(b2, (byte) (b2 | 8), b2), new Class[]{Integer.TYPE});
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
                    Object[] objArr3 = {Integer.valueOf(iArr2[i8])};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(684241640);
                    if (objCopydefault2 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(4391 - View.MeasureSpec.getSize(0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 37, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), -309236339, false, $$i(b3, (byte) (b3 | 8), b3), new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    i8++;
                }
                i2 = 2;
                j = 0;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ShareDataUIState;
        int i10 = 16;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 105;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr4 = new Object[1];
                objArr4[i5] = Integer.valueOf(iArr5[i11]);
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i4);
                if (objCopydefault3 == null) {
                    byte b4 = (byte) i5;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> i10) + 4391, (Process.myTid() >> 22) + 37, (char) View.getDefaultSize(i5, i5), -309236339, false, $$i(b4, (byte) (b4 | 8), b4), new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue();
                i11++;
                i4 = 684241640;
                i10 = 16;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i5;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        getactivenotifications.component1 = i14;
        while (getactivenotifications.component1 < iArr.length) {
            cArr[i14] = (char) (iArr[getactivenotifications.component1] >> 16);
            cArr[1] = (char) iArr[getactivenotifications.component1];
            cArr[2] = (char) (iArr[getactivenotifications.component1 + 1] >> 16);
            cArr[3] = (char) iArr[getactivenotifications.component1 + 1];
            getactivenotifications.ShareDataUIState = (cArr[0] << 16) + cArr[1];
            getactivenotifications.component2 = (cArr[2] << 16) + cArr[3];
            getActiveNotifications.component2(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                getactivenotifications.ShareDataUIState ^= iArr4[i15];
                try {
                    Object[] objArr5 = {getactivenotifications, Integer.valueOf(getActiveNotifications.component1(getactivenotifications.ShareDataUIState)), getactivenotifications, getactivenotifications};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-556796587);
                    if (objCopydefault4 == null) {
                        byte b5 = (byte) 0;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2969 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15, (char) (49871 - (Process.myPid() >> 22)), 462826032, false, $$i(b5, (byte) (b5 | 6), b5), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                    getactivenotifications.ShareDataUIState = getactivenotifications.component2;
                    getactivenotifications.component2 = iIntValue;
                    i15++;
                    int i17 = $11 + 5;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
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
            Object[] objArr6 = {getactivenotifications, getactivenotifications};
            Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1525804537);
            if (objCopydefault5 == null) {
                byte b6 = (byte) 0;
                objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 24, (char) (27637 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), -1616366948, false, $$i(b6, (byte) (b6 | 9), b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objCopydefault5).invoke(null, objArr6);
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = copydefault;
        char c2 = '0';
        float f = 0.0f;
        if (cArr2 != null) {
            int i7 = $10 + 61;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(658 - (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, (char) (TextUtils.indexOf("", c2) + 65119), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr[i8] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i8++;
                    c2 = '0';
                    f = 0.0f;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            char c3 = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i9 = $11 + 65;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[iTrustedWebActivityService_Parcel.copydefault] != 1 : bArr[iTrustedWebActivityService_Parcel.copydefault] != 0) {
                    int i10 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr3 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3580, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 28, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 1180380354, false, $$i(b2, (byte) (b2 | 17), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr3[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c3)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4502 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 36, (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 27897), -1464227204, false, $$i(b3, (byte) (b3 | Ascii.FF), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objCopydefault3).invoke(null, objArr4)).charValue();
                }
                c3 = cArr4[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr5 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(ImageFormat.getBitsPerPixel(0) + 1860, 34 - KeyEvent.keyCodeFromString(""), (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 80302927, false, $$i(b4, (byte) (b4 | Ascii.DLE), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            }
            int i12 = $10 + 25;
            $11 = i12 % 128;
            i = 2;
            int i13 = i12 % 2;
            cArr3 = cArr4;
        } else {
            i = 2;
        }
        if (i6 > 0) {
            int i14 = $10 + 113;
            $11 = i14 % 128;
            int i15 = i14 % i;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
        }
        if (z) {
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

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/UiEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity$initObservers$1", f = "FixedDataDashboardActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<UiEvent, Continuation<? super Unit>, Object> {
        private static int component1 = 1;
        private static int component2;
        int ShareDataUIState;
        Object component3;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
        
            if ((r4 instanceof com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError) == false) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        
            r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component2 + 109;
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component1 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        
            if ((r1 % 2) != 0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            r1 = r3.copydefault;
            r4 = ((com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError) r4).getError().getResponseDesc();
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            r1 = r3.copydefault;
            r4 = ((com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError) r4).getError().getResponseDesc();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
        
            android.widget.Toast.makeText(r1, r4, 1).show();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
        
            r4 = kotlin.Unit.INSTANCE;
            r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component1 + 77;
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component2 = r1 % 128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
        
            if ((r1 % 2) == 0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
        
            r0 = 9 / 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
        
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        
            if (r3.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r3.ShareDataUIState == 0) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            kotlin.ResultKt.throwOnFailure(r4);
            r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent) r3.component3;
         */
        @Override
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component2
                int r1 = r1 + 19
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component1 = r2
                int r1 = r1 % r0
                if (r1 != 0) goto L1a
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.ShareDataUIState
                r2 = 55
                int r2 = r2 / 0
                if (r1 != 0) goto L70
                goto L21
            L1a:
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r3.ShareDataUIState
                if (r1 != 0) goto L70
            L21:
                kotlin.ResultKt.throwOnFailure(r4)
                java.lang.Object r4 = r3.component3
                com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent) r4
                boolean r1 = r4 instanceof com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError
                if (r1 == 0) goto L5e
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component2
                int r1 = r1 + 109
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component1 = r2
                int r1 = r1 % r0
                r2 = 1
                if (r1 != 0) goto L47
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.this
                android.content.Context r1 = (android.content.Context) r1
                com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent$ShowError r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError) r4
                com.huawei.common.exception.BaseException r4 = r4.getError()
                java.lang.String r4 = r4.getResponseDesc()
                goto L55
            L47:
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.this
                android.content.Context r1 = (android.content.Context) r1
                com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent$ShowError r4 = (com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent.ShowError) r4
                com.huawei.common.exception.BaseException r4 = r4.getError()
                java.lang.String r4 = r4.getResponseDesc()
            L55:
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                android.widget.Toast r4 = android.widget.Toast.makeText(r1, r4, r2)
                r4.show()
            L5e:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component1
                int r1 = r1 + 77
                int r2 = r1 % 128
                com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.component2 = r2
                int r1 = r1 % r0
                if (r1 == 0) goto L6f
                r0 = 9
                int r0 = r0 / 0
            L6f:
                return r4
            L70:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.copydefault.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = FixedDataDashboardActivity.this.new copydefault(continuation);
            copydefaultVar.component3 = obj;
            copydefault copydefaultVar2 = copydefaultVar;
            int i2 = component2 + 49;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar2;
            }
            throw null;
        }

        public final Object ShareDataUIState(UiEvent uiEvent, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            copydefault copydefaultVar = (copydefault) create(uiEvent, continuation);
            if (i3 == 0) {
                copydefaultVar.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = copydefaultVar.invokeSuspend(Unit.INSTANCE);
            int i4 = component2 + 73;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }

        @Override
        public Object invoke(UiEvent uiEvent, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 39;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(uiEvent, continuation);
            int i4 = component1 + 59;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x1234  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x12a0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x12eb  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x1306  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x01f3  */
    /* JADX WARN: Type inference failed for: r1v341, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v187, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v191, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r50) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onNewIntent(Intent intent) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 85;
        equals = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(intent, "");
        super.onNewIntent(intent);
        setIntent(intent);
        FixedDataViewModel.fetchUserDetails$default(getFixedDataViewModel(), null, false, 3, null);
        int i4 = equals + 21;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void initObservers() {
        int i = 2 % 2;
        ExtensionsKt.collectLatest(this, getFixedDataViewModel().getEvents(), new copydefault(null));
        int i2 = equals + 21;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void primeWirelessDetails(com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType.FOUR_G_WIRELESS
            if (r4 == r1) goto L1f
            int r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.equals
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.getRequestBeneficiariesState = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L1b
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType.FIVE_G_WIRELESS
            r2 = 61
            int r2 = r2 / 0
            if (r4 != r1) goto L32
            goto L1f
        L1b:
            com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType r1 = com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType.FIVE_G_WIRELESS
            if (r4 != r1) goto L32
        L1f:
            if (r5 == 0) goto L32
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.HomeWirelessViewModel r1 = r3.getHomeWirelessViewModel()
            r1.primeAccountDetailsFetch(r5, r4)
            int r4 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.equals
            int r4 = r4 + 5
            int r5 = r4 % 128
            com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.getRequestBeneficiariesState = r5
            int r4 = r4 % r0
            goto L39
        L32:
            com.huawei.digitalpayment.consumer.fixeddata.viewmodel.HomeWirelessViewModel r4 = r3.getHomeWirelessViewModel()
            r4.cancelAccountDetailsFetch()
        L39:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.primeWirelessDetails(com.huawei.digitalpayment.consumer.fixeddata.domain.model.FixedDataType, java.lang.String):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 39;
        equals = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = getRequestBeneficiariesState + 97;
            equals = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            b(new int[]{23, 26, 44, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new int[]{49, 18, 0, 6}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = getRequestBeneficiariesState + 101;
            equals = i5 % 128;
            int i6 = i5 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6617, Color.alpha(0) + 42, (char) Color.alpha(0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(View.resolveSize(0, 0) + 6562, 56 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) Color.red(0), -699576857, false, "component2", new Class[]{Context.class});
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
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new int[]{23, 26, 44, 0}, false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new int[]{49, 18, 0, 6}, true, new byte[]{0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = equals + 47;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 21;
            equals = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6618, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - TextUtils.lastIndexOf("", '0', 0, 0), 56 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), -960739708, false, "component3", new Class[]{Context.class});
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
            Method dump skipped, instruction units count: 13802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataDashboardActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$ncFdqQwJ3YtpByEqrdCdr54hrDc(FixedDataDashboardActivity fixedDataDashboardActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 7;
        equals = i2 % 128;
        int i3 = i2 % 2;
        confirmationLauncher$lambda$0(fixedDataDashboardActivity, activityResult);
        if (i3 == 0) {
            throw null;
        }
    }

    static {
        component4 = 1;
        copydefault();
        component2();
        int i = copy + 97;
        component4 = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = equals + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = equals + 89;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void component2() {
        int i = 2 % 2;
        int i2 = equals;
        int i3 = i2 + 111;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        ShareDataUIState = new int[]{1803420822, 842257028, 1505021275, -987074620, -1789164960, 1389339148, -1425097180, -955629722, -1966469117, 1030974638, -246835276, 1408379155, 852818082, 1373575980, 276014741, -1873311350, 691217709, -261329845};
        int i5 = i2 + 1;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static void copydefault() {
        copydefault = new char[]{33441, 33314, 33754, 33747, 33756, 33759, 33757, 33755, 33750, 33754, 33312, 33341, 33336, 33749, 33334, 33287, 33317, 33750, 33442, 33315, 33322, 33314, 33750, 33433, 33356, 33354, 33352, 33347, 33351, 33357, 33450, 33452, 33355, 33347, 33444, 33468, 33441, 33352, 33349, 33348, 33348, 33349, 33405, 33357, 33365, 33350, 33352, 33360, 33361, 33512, 33462, 33460, 33453, 33452, 33459, 33463, 33457, 33459, 33457, 33461, 33469, 33465, 33461, 33457, 33455, 33415, 33413, 33429, 33374, 33462, 33440, 33373, 33461, 33374, 33351, 33441, 33442, 33375, 33460, 33458, 33461, 33375, 33374, 33375, 33442, 33464, 33462, 33440, 33441, 33463, 33374, 33375, 33461, 33372, 33374, 33440, 33354, 33352, 33349, 33350, 33352, 33443, 33467, 33466, 33462, 33373, 33353, 33440, 33462, 33465, 33465, 33463, 33462, 33462, 33440, 33424, 33367, 33455, 33458, 33456, 33454, 33457, 33456, 33455, 33455, 33457, 33371, 33371, 33460, 33462, 33460, 33371, 33347, 33372, 33370, 33371, 33460, 33456, 33455, 33370, 33347, 33371, 33461, 33458, 33369, 33373, 33371, 33371, 33461, 33457, 33369, 33347, 33371, 33458, 33455, 33455, 33370, 33373, 33458, 33369, 33348, 33347, 33346, 33372, 33372, 33347, 33369, 33454, 33457, 33371, 33369, 33457, 33459, 33372, 33371, 33373, 33349, 33370, 33455, 33416, 33393, 33395, 33403, 33399, 33399, 33370, 33460, 33360, 33362, 33363, 33393, 33400, 33406, 33402, 33401, 33368, 33368, 33400, 33404, 33372, 33366, 33398, 33403, 33372, 33371, 33401, 33403, 33401, 33393, 33394, 33401, 33401, 33403, 33401, 33398, 33370, 33363, 33393, 33402, 33346, 33401, 33402, 33345, 33401, 33399, 33398, 33363, 33372, 33346, 33367, 33455, 33457, 33458, 33456, 33457, 33457, 33456, 33367, 33368, 33455, 33453, 33454, 33455, 33458, 33461, 33456, 33358, 33395, 33394, 33392, 33398, 33475, 33516, 33520, 33517, 33518, 33519, 33416, 33397, 33391, 33391, 33363, 33357, 33396, 33395, 33392, 33360, 33370, 33396, 33380, 33383, 33390, 33393, 33516, 33424, 33425, 33429, 33430, 33469, 33470, 33427, 33426, 33428, 33427, 33468, 33428, 33515, 33517, 33429, 33426, 33514, 33426, 33425, 33428, 33469, 33468, 33427, 33516, 33515, 33513, 33426, 33468, 33429, 33427, 33427, 33514, 33425, 33425, 33513, 33513, 33512, 33514, 33513, 33425, 33427, 33517, 33428, 33467, 33429, 33430, 33429, 33426, 33424, 33424, 33467, 33429, 33427, 33467, 33425, 33425, 33468, 33425, 33511, 33516, 33519, 33429, 33468, 33478, 33516, 33516, 33515, 33512, 33511, 33514, 33514, 33514, 33515, 33512, 33466, 33303, 33301, 33301, 33301, 33297, 33297, 33298, 33298, 33300, 33301, 33475, 33513, 33513, 33511, 33510, 33513, 33516, 33515, 33512, 33514, 33476, 33515, 33514, 33512, 33516, 33517, 33516, 33514, 33513, 33513, 33512};
        component3 = -3780477796495014671L;
        component2 = 1217269456;
        component1 = (char) 50417;
    }
}
