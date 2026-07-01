package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.digitalpayment.consumer.fixeddata.domain.model.WifiUiModel;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.FixedDataUiState;
import com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity;
import com.huawei.digitalpayment.consumer.fixeddata.ui.screen.manageaccount.ChangeWifiPasswordScreenKt;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.ManageAccountViewModel;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.cancelAll;
import kotlin.cancelNotification;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataManageAccountChangeWifiPasswordActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "manageAccountViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/ManageAccountViewModel;", "getManageAccountViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/ManageAccountViewModel;", "setManageAccountViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/ManageAccountViewModel;)V", "confirmationLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/presentation/state/FixedDataUiState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataManageAccountChangeWifiPasswordActivity extends Hilt_FixedDataManageAccountChangeWifiPasswordActivity {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static char[] component1;
    private static long component2;
    private static char[] component3;
    private static long copydefault;
    private static int equals;
    private final ActivityResultLauncher<Intent> confirmationLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 1;
        private static int component3;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 9;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FixedDataManageAccountChangeWifiPasswordActivity.$r8$lambda$Hu4I7AuA9lNht4JQJye1DOSu2h0(this.f$0, (ActivityResult) obj);
            int i4 = ShareDataUIState + 101;
            component3 = i4 % 128;
            int i5 = i4 % 2;
        }
    });

    @Inject
    public FixedDataViewModel fixedDataViewModel;

    @Inject
    public ManageAccountViewModel manageAccountViewModel;
    private static final byte[] $$c = {57, 126, 65, 8};
    private static final int $$f = 254;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {9, 8, 112, 107, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarHeader.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarHeader.LF_SYMLINK, -61, -10, -10, 65, -57, -16, -2, -4, -6, -3, 60, -63, -9, -10, Ascii.VT, -17, 0, 9, -15, 58, -80, -4, Ascii.VT, -25, 3, -21, 9, Ascii.GS, -33, -23, Ascii.SI, 8, 8, -14, -37, Ascii.SI, -23, Ascii.VT, -16, -2, -7, -3, -3, 5, -13, -10, Base64.padSymbol, -16, -5, -13, 17, -5, -5, 1, -24, 5, -12, -16, -2, 59, -56, -23, 4, -7, -8, Ascii.VT, -2, -9, TarHeader.LF_FIFO, -61, -9, -1, 1, -5, TarHeader.LF_CHR, -63, -9, -10, Ascii.VT, -6, -15, 13, -23, 7, -10, -3, 60, -57, -16, -2, -7, -3, -8, 10, TarHeader.LF_CHR, -38, -38, 9, -11, -7, 10, -7, Ascii.NAK, -45, -16, -2, 59, -62, -17, Ascii.DLE, -26, Ascii.SO, -8, TarHeader.LF_CONTIG, -58, -9, -2, -6, -15, Ascii.SI, -15, -8, Ascii.VT, -28, 8, 4, -13, -10, 66, -57, -16, -3, -9, -6, 4, 4, -17, SignedBytes.MAX_POWER_OF_TWO, -77, Ascii.SO, -1, -24, 9, 0, -22, 69, -63, -9, -10, Ascii.VT, -17, 13, -6, -21, 7, -10, -3, 60, -60, -19, 3, 7, -21, 7, -10, -3, 60, -41, -37, Ascii.SI, -21, -6, 32, -21, -28, 81, -21};
    private static final int $$h = 232;
    private static final byte[] $$a = {80, -19, -87, -22, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 175;
    private static int getRequestBeneficiariesState = 1;
    private static int getAsAtTimestamp = 0;
    private static int copy = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, int r7, short r8) {
        /*
            int r6 = 122 - r6
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.$$c
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L21:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.$$i(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r0 = 28 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.$$a
            int r5 = 100 - r5
            byte[] r0 = new byte[r0]
            int r7 = 27 - r7
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r1[r5]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-8)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.c(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 74 - r6
            int r5 = r5 + 4
            int r7 = r7 * 16
            int r7 = 99 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.$$g
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-4)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.d(byte, byte, int, java.lang.Object[]):void");
    }

    public static final ActivityResultLauncher access$getConfirmationLauncher$p(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 49;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataManageAccountChangeWifiPasswordActivity.confirmationLauncher;
        int i5 = i3 + 119;
        getAsAtTimestamp = i5 % 128;
        if (i5 % 2 == 0) {
            return activityResultLauncher;
        }
        throw null;
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        Object obj = null;
        if (fixedDataViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i2 = copy + 111;
            getAsAtTimestamp = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = getAsAtTimestamp + 75;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            return fixedDataViewModel;
        }
        obj.hashCode();
        throw null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 5;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            throw null;
        }
        Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
        this.fixedDataViewModel = fixedDataViewModel;
        int i3 = copy + 5;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    public final ManageAccountViewModel getManageAccountViewModel() {
        int i = 2 % 2;
        int i2 = copy + 121;
        getAsAtTimestamp = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        ManageAccountViewModel manageAccountViewModel = this.manageAccountViewModel;
        if (manageAccountViewModel != null) {
            return manageAccountViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        int i3 = getAsAtTimestamp + 99;
        copy = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    public final void setManageAccountViewModel(ManageAccountViewModel manageAccountViewModel) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 39;
        copy = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
            this.manageAccountViewModel = manageAccountViewModel;
            throw null;
        }
        Intrinsics.checkNotNullParameter(manageAccountViewModel, "");
        this.manageAccountViewModel = manageAccountViewModel;
        int i3 = getAsAtTimestamp + 23;
        copy = i3 % 128;
        int i4 = i3 % 2;
    }

    private static final void confirmationLauncher$lambda$0(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity, ActivityResult activityResult) {
        String stringExtra;
        String stringExtra2;
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataManageAccountChangeWifiPasswordActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            int i2 = getAsAtTimestamp + 27;
            copy = i2 % 128;
            int i3 = i2 % 2;
            Intent data = activityResult.getData();
            Object obj = null;
            if (data != null) {
                int i4 = getAsAtTimestamp + 9;
                copy = i4 % 128;
                if (i4 % 2 == 0) {
                    stringExtra = data.getStringExtra(FixedDataNavKeys.EXTRA_PROFILE_PATH);
                    int i5 = 62 / 0;
                } else {
                    stringExtra = data.getStringExtra(FixedDataNavKeys.EXTRA_PROFILE_PATH);
                }
            } else {
                stringExtra = null;
            }
            Intent data2 = activityResult.getData();
            if (data2 != null) {
                int i6 = copy + 23;
                getAsAtTimestamp = i6 % 128;
                if (i6 % 2 != 0) {
                    stringExtra2 = data2.getStringExtra(FixedDataNavKeys.EXTRA_NEW_PASSWORD);
                    int i7 = 68 / 0;
                } else {
                    stringExtra2 = data2.getStringExtra(FixedDataNavKeys.EXTRA_NEW_PASSWORD);
                }
            } else {
                stringExtra2 = null;
            }
            if (stringExtra == null || stringExtra2 == null) {
                return;
            }
            int i8 = copy + 79;
            getAsAtTimestamp = i8 % 128;
            if (i8 % 2 == 0) {
                fixedDataManageAccountChangeWifiPasswordActivity.setResult(-1, activityResult.getData());
                fixedDataManageAccountChangeWifiPasswordActivity.finish();
            } else {
                fixedDataManageAccountChangeWifiPasswordActivity.setResult(-1, activityResult.getData());
                fixedDataManageAccountChangeWifiPasswordActivity.finish();
                obj.hashCode();
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class component1 implements Function2<Composer, Integer, Unit> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        final List<WifiUiModel> component2;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int component3;
            final List<WifiUiModel> component2;
            final FixedDataManageAccountChangeWifiPasswordActivity copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                copydefault(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 37;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public final void copydefault(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState;
                int i4 = i3 + 115;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                Object obj = null;
                if ((i & 11) == 2) {
                    int i6 = i3 + 123;
                    component3 = i6 % 128;
                    if (i6 % 2 == 0) {
                        if (composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                    } else {
                        composer.getSkipping();
                        obj.hashCode();
                        throw null;
                    }
                }
                String selectedAccountId = component2((State<FixedDataUiState>) SnapshotStateKt.collectAsState(this.copydefault.getFixedDataViewModel().getUiState(), null, composer, 8, 1)).getCurrentTabState().getSelectedAccountId();
                if (selectedAccountId == null) {
                    int i7 = component3 + 27;
                    ShareDataUIState = i7 % 128;
                    if (i7 % 2 == 0) {
                        throw null;
                    }
                    selectedAccountId = "";
                }
                String str = selectedAccountId;
                List<WifiUiModel> list = this.component2;
                final FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity = this.copydefault;
                Function0 function0 = new Function0() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public final Object invoke() {
                        int i8 = 2 % 2;
                        int i9 = copydefault + 121;
                        component3 = i9 % 128;
                        if (i9 % 2 != 0) {
                            FixedDataManageAccountChangeWifiPasswordActivity.component1.AnonymousClass5.copydefault(fixedDataManageAccountChangeWifiPasswordActivity);
                            throw null;
                        }
                        Unit unitCopydefault = FixedDataManageAccountChangeWifiPasswordActivity.component1.AnonymousClass5.copydefault(fixedDataManageAccountChangeWifiPasswordActivity);
                        int i10 = component3 + 71;
                        copydefault = i10 % 128;
                        int i11 = i10 % 2;
                        return unitCopydefault;
                    }
                };
                final FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity2 = this.copydefault;
                ChangeWifiPasswordScreenKt.ChangeWifiPasswordScreen(str, list, function0, new Function2() {
                    private static int component1 = 0;
                    private static int component3 = 1;

                    @Override
                    public final Object invoke(Object obj2, Object obj3) {
                        int i8 = 2 % 2;
                        int i9 = component1 + 23;
                        component3 = i9 % 128;
                        int i10 = i9 % 2;
                        Unit unitShareDataUIState = FixedDataManageAccountChangeWifiPasswordActivity.component1.AnonymousClass5.ShareDataUIState(fixedDataManageAccountChangeWifiPasswordActivity2, (WifiUiModel) obj2, (String) obj3);
                        int i11 = component3 + 23;
                        component1 = i11 % 128;
                        int i12 = i11 % 2;
                        return unitShareDataUIState;
                    }
                }, composer, 64);
            }

            private static final Unit component2(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 37;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataManageAccountChangeWifiPasswordActivity, "");
                fixedDataManageAccountChangeWifiPasswordActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = component3 + 77;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 13 / 0;
                }
                return unit;
            }

            private static final Unit copydefault(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity, WifiUiModel wifiUiModel, String str) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(fixedDataManageAccountChangeWifiPasswordActivity, "");
                Intrinsics.checkNotNullParameter(wifiUiModel, "");
                Intrinsics.checkNotNullParameter(str, "");
                Intent intent = new Intent(fixedDataManageAccountChangeWifiPasswordActivity, (Class<?>) FixedDataManageAccountConfirmationActivity.class);
                intent.putExtra("extra_title", fixedDataManageAccountChangeWifiPasswordActivity.getString(R.string.gsm_fixed_data_confirm));
                intent.putExtra(FixedDataNavKeys.EXTRA_DESCRIPTION, fixedDataManageAccountChangeWifiPasswordActivity.getString(R.string.gsm_fixed_data_change_wifi_password_description, new Object[]{wifiUiModel.getSsidName()}));
                intent.putExtra(FixedDataNavKeys.EXTRA_ACTION_TYPE, "CHANGE_PASSWORD");
                intent.putExtra(FixedDataNavKeys.EXTRA_PAYLOAD_PROFILE, wifiUiModel.getProfilePath());
                intent.putExtra(FixedDataNavKeys.EXTRA_PAYLOAD_NEW_PASSWORD, str);
                FixedDataManageAccountChangeWifiPasswordActivity.access$getConfirmationLauncher$p(fixedDataManageAccountChangeWifiPasswordActivity).launch(intent);
                Unit unit = Unit.INSTANCE;
                int i2 = component3 + 71;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static final FixedDataUiState component2(State<FixedDataUiState> state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 1;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                FixedDataUiState value = state.getValue();
                if (i3 == 0) {
                    return value;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity, WifiUiModel wifiUiModel, String str) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 15;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    copydefault(fixedDataManageAccountChangeWifiPasswordActivity, wifiUiModel, str);
                    throw null;
                }
                Unit unitCopydefault = copydefault(fixedDataManageAccountChangeWifiPasswordActivity, wifiUiModel, str);
                int i3 = component3 + 111;
                ShareDataUIState = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 6 / 0;
                }
                return unitCopydefault;
            }

            public static Unit copydefault(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity) {
                int i = 2 % 2;
                int i2 = component3 + 53;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    component2(fixedDataManageAccountChangeWifiPasswordActivity);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Unit unitComponent2 = component2(fixedDataManageAccountChangeWifiPasswordActivity);
                int i3 = ShareDataUIState + 47;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent2;
            }

            AnonymousClass5(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity, List<WifiUiModel> list) {
                this.copydefault = fixedDataManageAccountChangeWifiPasswordActivity;
                this.component2 = list;
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copydefault + 59;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component3(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 != 0) {
                throw null;
            }
            int i4 = ShareDataUIState + 57;
            copydefault = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 93 / 0;
            }
            return unit;
        }

        public final void component3(Composer composer, int i) {
            int i2 = 2 % 2;
            if ((i & 11) == 2) {
                int i3 = copydefault + 113;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2108883075, true, new AnonymousClass5(FixedDataManageAccountChangeWifiPasswordActivity.this, this.component2), composer, 54), composer, 1572864, 63);
            int i5 = ShareDataUIState + 107;
            copydefault = i5 % 128;
            int i6 = i5 % 2;
        }

        component1(List<WifiUiModel> list) {
            this.component2 = list;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(copydefault ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 43;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(copydefault)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0') + 7033, (ViewConfiguration.getPressedStateDuration() >> 16) + 34, (char) (TextUtils.getOffsetAfter("", 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                if (objCopydefault2 == null) {
                    byte b2 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 18 - Color.blue(0), (char) (Drawable.resolveOpacity(0, 0) + 51269), -1883291598, false, $$i((byte) 19, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 47;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 82 / 0;
            objArr[0] = str;
        }
    }

    private static void e(int i, int i2, char c2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        cancelNotification cancelnotification = new cancelNotification();
        long[] jArr = new long[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i4 = cancelnotification.copydefault;
            try {
                Object[] objArr2 = {Integer.valueOf(component1[i + i4])};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2143160109);
                if (objCopydefault == null) {
                    byte b2 = (byte) 1;
                    byte b3 = (byte) (-b2);
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1758, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 34, (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 1159210934, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objCopydefault).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(component2), Integer.valueOf(c2)};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1323952163);
                if (objCopydefault2 == null) {
                    byte b4 = (byte) (-1);
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3609, 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (7171 - View.MeasureSpec.makeMeasureSpec(0, 0)), 1951385784, false, $$i((byte) 5, b4, (byte) (b4 + 1)), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objCopydefault2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {cancelnotification, cancelnotification};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4013 - View.MeasureSpec.getMode(0), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (27761 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), -1529629956, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                int i5 = $11 + 7;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        cancelnotification.copydefault = 0;
        while (cancelnotification.copydefault < i2) {
            int i7 = $11 + 109;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr5 = {cancelnotification, cancelnotification};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(4013 - TextUtils.indexOf("", "", 0), 24 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27762), -1529629956, false, $$i(b7, b8, (byte) (b8 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
                int i8 = 95 / 0;
            } else {
                cArr[cancelnotification.copydefault] = (char) jArr[cancelnotification.copydefault];
                Object[] objArr6 = {cancelnotification, cancelnotification};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1636461977);
                if (objCopydefault5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 - 1);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(4013 - (ViewConfiguration.getPressedStateDuration() >> 16), (Process.myPid() >> 22) + 24, (char) (ExpandableListView.getPackedPositionGroup(0L) + 27761), -1529629956, false, $$i(b9, b10, (byte) (b10 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, char[] cArr, byte b2, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancelAll cancelall = new cancelAll();
        char[] cArr2 = component3;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.indexOf("", "") + 7422, 15 - ExpandableListView.getPackedPositionType(j), (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 64290), 682917265, false, "v", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i4++;
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
        Object[] objArr3 = {Integer.valueOf(ShareDataUIState)};
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-303193356);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0, 0) + 7423, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, (char) (64291 - (Process.myTid() >> 22)), 682917265, false, "v", new Class[]{Integer.TYPE});
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
                cancelall.component1 = cArr[cancelall.component2];
                cancelall.component3 = cArr[cancelall.component2 + 1];
                if (cancelall.component1 == cancelall.component3) {
                    int i5 = $10 + 35;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 / b2);
                        cArr4[cancelall.component2] = (char) (cancelall.component3 * b2);
                    } else {
                        cArr4[cancelall.component2] = (char) (cancelall.component1 - b2);
                        cArr4[cancelall.component2 + 1] = (char) (cancelall.component3 - b2);
                    }
                } else {
                    try {
                        Object[] objArr4 = {cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), cancelall};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-2116804995);
                        if (objCopydefault3 == null) {
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 7116, 14 - TextUtils.getCapsMode("", 0, 0), (char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 44463), 1150140696, false, "x", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objCopydefault3).invoke(null, objArr4)).intValue() == cancelall.getAsAtTimestamp) {
                            int i6 = $11 + 73;
                            $10 = i6 % 128;
                            int i7 = i6 % 2;
                            Object[] objArr5 = {cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, cancelall, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), cancelall, Integer.valueOf(cCharValue), cancelall};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-365394592);
                            if (objCopydefault4 == null) {
                                byte b3 = (byte) 3;
                                byte b4 = (byte) (b3 - 4);
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(2944 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 24 - ExpandableListView.getPackedPositionType(0L), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27636), 794909189, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objCopydefault4).invoke(null, objArr5)).intValue();
                            int i8 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[iIntValue];
                            cArr4[cancelall.component2 + 1] = cArr2[i8];
                        } else if (cancelall.copydefault == cancelall.ShareDataUIState) {
                            int i9 = $11 + 41;
                            $10 = i9 % 128;
                            int i10 = i9 % 2;
                            cancelall.copy = ((cancelall.copy + cCharValue) - 1) % cCharValue;
                            cancelall.getAsAtTimestamp = ((cancelall.getAsAtTimestamp + cCharValue) - 1) % cCharValue;
                            int i11 = (cancelall.copydefault * cCharValue) + cancelall.copy;
                            int i12 = (cancelall.ShareDataUIState * cCharValue) + cancelall.getAsAtTimestamp;
                            cArr4[cancelall.component2] = cArr2[i11];
                            cArr4[cancelall.component2 + 1] = cArr2[i12];
                        } else {
                            int i13 = (cancelall.copydefault * cCharValue) + cancelall.getAsAtTimestamp;
                            int i14 = (cancelall.ShareDataUIState * cCharValue) + cancelall.copy;
                            cArr4[cancelall.component2] = cArr2[i13];
                            cArr4[cancelall.component2 + 1] = cArr2[i14];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                cancelall.component2 += 2;
            }
        }
        for (int i15 = 0; i15 < i; i15++) {
            cArr4[i15] = (char) (cArr4[i15] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x224c  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x224d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f8  */
    /* JADX WARN: Type inference failed for: r2v158, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00be  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1011:0x1047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1049:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0989 A[Catch: all -> 0x03f2, TryCatch #54 {all -> 0x03f2, blocks: (B:157:0x0983, B:159:0x0989, B:160:0x09b4, B:279:0x0f85, B:281:0x0f8b, B:282:0x0fb9, B:583:0x1e1e, B:585:0x1e24, B:586:0x1e52, B:800:0x318e, B:802:0x3194, B:803:0x31bf, B:837:0x34ea, B:839:0x34f0, B:840:0x351a, B:817:0x3311, B:819:0x3334, B:820:0x338b, B:766:0x2e3c, B:768:0x2e42, B:769:0x2e6b, B:860:0x35f8, B:862:0x35fe, B:863:0x3626, B:865:0x3660, B:866:0x36a2, B:651:0x262c, B:653:0x2641, B:654:0x2670, B:656:0x26a4, B:657:0x2721, B:629:0x22e6, B:631:0x22ec, B:632:0x2316, B:634:0x2350, B:635:0x2396, B:599:0x200c, B:601:0x2021, B:602:0x2054, B:421:0x16d9, B:423:0x16df, B:424:0x170a, B:376:0x1488, B:378:0x148e, B:379:0x14bd, B:23:0x01cf, B:25:0x01d5, B:26:0x0203, B:28:0x0360, B:30:0x0391, B:31:0x03ec), top: B:981:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0a8f A[Catch: all -> 0x0ed2, PHI: r1 r12 r39
  0x0a8f: PHI (r1v582 java.lang.Object) = (r1v581 java.lang.Object), (r1v634 java.lang.Object) binds: [B:165:0x0a41, B:167:0x0a44] A[DONT_GENERATE, DONT_INLINE]
  0x0a8f: PHI (r12v40 java.lang.Object) = (r12v104 java.lang.Object), (r12v105 java.lang.Object) binds: [B:165:0x0a41, B:167:0x0a44] A[DONT_GENERATE, DONT_INLINE]
  0x0a8f: PHI (r39v54 ??) = (r39v111 ??), (r39v112 ??) binds: [B:165:0x0a41, B:167:0x0a44] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x0ed2, blocks: (B:164:0x0a3d, B:171:0x0a8f, B:180:0x0afa, B:198:0x0c17, B:201:0x0c63), top: B:936:0x0a3d }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0afa A[Catch: all -> 0x0ed2, TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x0ed2, blocks: (B:164:0x0a3d, B:171:0x0a8f, B:180:0x0afa, B:198:0x0c17, B:201:0x0c63), top: B:936:0x0a3d }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0d51 A[Catch: all -> 0x0ea2, TRY_LEAVE, TryCatch #4 {all -> 0x0ea2, blocks: (B:217:0x0d47, B:218:0x0d4b, B:220:0x0d51, B:223:0x0d77, B:213:0x0ce4, B:216:0x0d3f), top: B:889:0x0ce4 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0f8b A[Catch: all -> 0x03f2, TryCatch #54 {all -> 0x03f2, blocks: (B:157:0x0983, B:159:0x0989, B:160:0x09b4, B:279:0x0f85, B:281:0x0f8b, B:282:0x0fb9, B:583:0x1e1e, B:585:0x1e24, B:586:0x1e52, B:800:0x318e, B:802:0x3194, B:803:0x31bf, B:837:0x34ea, B:839:0x34f0, B:840:0x351a, B:817:0x3311, B:819:0x3334, B:820:0x338b, B:766:0x2e3c, B:768:0x2e42, B:769:0x2e6b, B:860:0x35f8, B:862:0x35fe, B:863:0x3626, B:865:0x3660, B:866:0x36a2, B:651:0x262c, B:653:0x2641, B:654:0x2670, B:656:0x26a4, B:657:0x2721, B:629:0x22e6, B:631:0x22ec, B:632:0x2316, B:634:0x2350, B:635:0x2396, B:599:0x200c, B:601:0x2021, B:602:0x2054, B:421:0x16d9, B:423:0x16df, B:424:0x170a, B:376:0x1488, B:378:0x148e, B:379:0x14bd, B:23:0x01cf, B:25:0x01d5, B:26:0x0203, B:28:0x0360, B:30:0x0391, B:31:0x03ec), top: B:981:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x10a4  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x1107 A[Catch: all -> 0x13f6, TRY_ENTER, TRY_LEAVE, TryCatch #56 {all -> 0x13f6, blocks: (B:286:0x1041, B:292:0x1097, B:301:0x1107), top: B:984:0x1041 }] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x12e2  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x148e A[Catch: all -> 0x03f2, TryCatch #54 {all -> 0x03f2, blocks: (B:157:0x0983, B:159:0x0989, B:160:0x09b4, B:279:0x0f85, B:281:0x0f8b, B:282:0x0fb9, B:583:0x1e1e, B:585:0x1e24, B:586:0x1e52, B:800:0x318e, B:802:0x3194, B:803:0x31bf, B:837:0x34ea, B:839:0x34f0, B:840:0x351a, B:817:0x3311, B:819:0x3334, B:820:0x338b, B:766:0x2e3c, B:768:0x2e42, B:769:0x2e6b, B:860:0x35f8, B:862:0x35fe, B:863:0x3626, B:865:0x3660, B:866:0x36a2, B:651:0x262c, B:653:0x2641, B:654:0x2670, B:656:0x26a4, B:657:0x2721, B:629:0x22e6, B:631:0x22ec, B:632:0x2316, B:634:0x2350, B:635:0x2396, B:599:0x200c, B:601:0x2021, B:602:0x2054, B:421:0x16d9, B:423:0x16df, B:424:0x170a, B:376:0x1488, B:378:0x148e, B:379:0x14bd, B:23:0x01cf, B:25:0x01d5, B:26:0x0203, B:28:0x0360, B:30:0x0391, B:31:0x03ec), top: B:981:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x1564  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x157b A[Catch: all -> 0x1644, TryCatch #19 {all -> 0x1644, blocks: (B:396:0x1566, B:398:0x157b, B:399:0x15ab), top: B:918:0x1566, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x15be A[Catch: all -> 0x163a, TryCatch #11 {all -> 0x163a, blocks: (B:400:0x15b1, B:402:0x15be, B:403:0x162f), top: B:903:0x15b1, outer: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x17f2 A[Catch: all -> 0x1da9, PHI: r2
  0x17f2: PHI (r2v463 java.lang.Object) = (r2v458 java.lang.Object), (r2v462 java.lang.Object) binds: [B:429:0x179a, B:430:0x179c] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x1da9, blocks: (B:428:0x1796, B:434:0x17f2), top: B:893:0x1796 }] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x1819  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1872  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x188a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x18ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1c3a A[Catch: all -> 0x1d68, TryCatch #45 {all -> 0x1d68, blocks: (B:513:0x1c30, B:514:0x1c34, B:516:0x1c3a, B:519:0x1c56, B:509:0x1bca, B:512:0x1c28), top: B:964:0x1bca }] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x1e24 A[Catch: all -> 0x03f2, TryCatch #54 {all -> 0x03f2, blocks: (B:157:0x0983, B:159:0x0989, B:160:0x09b4, B:279:0x0f85, B:281:0x0f8b, B:282:0x0fb9, B:583:0x1e1e, B:585:0x1e24, B:586:0x1e52, B:800:0x318e, B:802:0x3194, B:803:0x31bf, B:837:0x34ea, B:839:0x34f0, B:840:0x351a, B:817:0x3311, B:819:0x3334, B:820:0x338b, B:766:0x2e3c, B:768:0x2e42, B:769:0x2e6b, B:860:0x35f8, B:862:0x35fe, B:863:0x3626, B:865:0x3660, B:866:0x36a2, B:651:0x262c, B:653:0x2641, B:654:0x2670, B:656:0x26a4, B:657:0x2721, B:629:0x22e6, B:631:0x22ec, B:632:0x2316, B:634:0x2350, B:635:0x2396, B:599:0x200c, B:601:0x2021, B:602:0x2054, B:421:0x16d9, B:423:0x16df, B:424:0x170a, B:376:0x1488, B:378:0x148e, B:379:0x14bd, B:23:0x01cf, B:25:0x01d5, B:26:0x0203, B:28:0x0360, B:30:0x0391, B:31:0x03ec), top: B:981:0x01cf }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0518 A[Catch: all -> 0x08c4, TRY_ENTER, TRY_LEAVE, TryCatch #20 {all -> 0x08c4, blocks: (B:36:0x03fc, B:42:0x0455, B:58:0x0518), top: B:920:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x1edd  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x1f2c  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x1fed  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x2196  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x2293  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x2491  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x24fd  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x2556  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x260e  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x2859  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x2f04  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x2f53  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x2fb4  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x316d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0199 A[PHI: r15
  0x0199: PHI (r15v112 char) = (r15v13 char), (r15v113 char) binds: [B:21:0x01ca, B:5:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:808:0x3250  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x32a2  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x32f3  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x34ca  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x35b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01a3 A[PHI: r15
  0x01a3: PHI (r15v12 char) = (r15v11 char), (r15v115 char) binds: [B:3:0x0191, B:5:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x1549 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:962:0x179c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0757 A[Catch: all -> 0x089a, TryCatch #74 {all -> 0x089a, blocks: (B:96:0x074d, B:97:0x0751, B:99:0x0757, B:102:0x0774, B:87:0x0680, B:92:0x06e5, B:95:0x0745), top: B:1019:0x0680 }] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v136 */
    /* JADX WARN: Type inference failed for: r10v137 */
    /* JADX WARN: Type inference failed for: r10v138 */
    /* JADX WARN: Type inference failed for: r10v139 */
    /* JADX WARN: Type inference failed for: r10v140 */
    /* JADX WARN: Type inference failed for: r10v143 */
    /* JADX WARN: Type inference failed for: r10v144 */
    /* JADX WARN: Type inference failed for: r10v151 */
    /* JADX WARN: Type inference failed for: r11v103 */
    /* JADX WARN: Type inference failed for: r11v104 */
    /* JADX WARN: Type inference failed for: r11v112 */
    /* JADX WARN: Type inference failed for: r11v113 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v96 */
    /* JADX WARN: Type inference failed for: r11v97 */
    /* JADX WARN: Type inference failed for: r12v102 */
    /* JADX WARN: Type inference failed for: r12v103 */
    /* JADX WARN: Type inference failed for: r12v37, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v39, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r14v101 */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v103 */
    /* JADX WARN: Type inference failed for: r14v104 */
    /* JADX WARN: Type inference failed for: r14v105 */
    /* JADX WARN: Type inference failed for: r14v106 */
    /* JADX WARN: Type inference failed for: r14v107 */
    /* JADX WARN: Type inference failed for: r14v112 */
    /* JADX WARN: Type inference failed for: r14v113 */
    /* JADX WARN: Type inference failed for: r14v114 */
    /* JADX WARN: Type inference failed for: r14v115 */
    /* JADX WARN: Type inference failed for: r14v116 */
    /* JADX WARN: Type inference failed for: r14v117 */
    /* JADX WARN: Type inference failed for: r14v118 */
    /* JADX WARN: Type inference failed for: r14v121 */
    /* JADX WARN: Type inference failed for: r14v122 */
    /* JADX WARN: Type inference failed for: r14v123 */
    /* JADX WARN: Type inference failed for: r14v127 */
    /* JADX WARN: Type inference failed for: r14v128 */
    /* JADX WARN: Type inference failed for: r14v129 */
    /* JADX WARN: Type inference failed for: r14v131 */
    /* JADX WARN: Type inference failed for: r14v132 */
    /* JADX WARN: Type inference failed for: r14v139 */
    /* JADX WARN: Type inference failed for: r14v140 */
    /* JADX WARN: Type inference failed for: r14v141 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v146 */
    /* JADX WARN: Type inference failed for: r14v148 */
    /* JADX WARN: Type inference failed for: r14v149 */
    /* JADX WARN: Type inference failed for: r14v150 */
    /* JADX WARN: Type inference failed for: r14v151 */
    /* JADX WARN: Type inference failed for: r14v152 */
    /* JADX WARN: Type inference failed for: r14v153 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v155 */
    /* JADX WARN: Type inference failed for: r14v156 */
    /* JADX WARN: Type inference failed for: r14v157 */
    /* JADX WARN: Type inference failed for: r14v158 */
    /* JADX WARN: Type inference failed for: r14v159 */
    /* JADX WARN: Type inference failed for: r14v160 */
    /* JADX WARN: Type inference failed for: r14v161 */
    /* JADX WARN: Type inference failed for: r14v162 */
    /* JADX WARN: Type inference failed for: r14v163 */
    /* JADX WARN: Type inference failed for: r14v164 */
    /* JADX WARN: Type inference failed for: r14v165 */
    /* JADX WARN: Type inference failed for: r14v166 */
    /* JADX WARN: Type inference failed for: r14v167 */
    /* JADX WARN: Type inference failed for: r14v168 */
    /* JADX WARN: Type inference failed for: r14v169 */
    /* JADX WARN: Type inference failed for: r14v170 */
    /* JADX WARN: Type inference failed for: r14v171 */
    /* JADX WARN: Type inference failed for: r14v172 */
    /* JADX WARN: Type inference failed for: r14v173 */
    /* JADX WARN: Type inference failed for: r14v174 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v36 */
    /* JADX WARN: Type inference failed for: r14v37 */
    /* JADX WARN: Type inference failed for: r14v38 */
    /* JADX WARN: Type inference failed for: r14v39 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r15v104 */
    /* JADX WARN: Type inference failed for: r15v105 */
    /* JADX WARN: Type inference failed for: r15v106 */
    /* JADX WARN: Type inference failed for: r15v107 */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v109 */
    /* JADX WARN: Type inference failed for: r15v117 */
    /* JADX WARN: Type inference failed for: r15v118 */
    /* JADX WARN: Type inference failed for: r15v119 */
    /* JADX WARN: Type inference failed for: r15v120 */
    /* JADX WARN: Type inference failed for: r15v121 */
    /* JADX WARN: Type inference failed for: r15v122 */
    /* JADX WARN: Type inference failed for: r15v123 */
    /* JADX WARN: Type inference failed for: r15v124 */
    /* JADX WARN: Type inference failed for: r15v125 */
    /* JADX WARN: Type inference failed for: r15v126 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v58 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v66 */
    /* JADX WARN: Type inference failed for: r15v71 */
    /* JADX WARN: Type inference failed for: r15v72 */
    /* JADX WARN: Type inference failed for: r15v73 */
    /* JADX WARN: Type inference failed for: r15v74 */
    /* JADX WARN: Type inference failed for: r15v75 */
    /* JADX WARN: Type inference failed for: r15v76 */
    /* JADX WARN: Type inference failed for: r15v77 */
    /* JADX WARN: Type inference failed for: r15v78 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v82, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v93 */
    /* JADX WARN: Type inference failed for: r1v422, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v549, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r31v100 */
    /* JADX WARN: Type inference failed for: r31v103 */
    /* JADX WARN: Type inference failed for: r31v104 */
    /* JADX WARN: Type inference failed for: r31v105 */
    /* JADX WARN: Type inference failed for: r31v106 */
    /* JADX WARN: Type inference failed for: r31v107 */
    /* JADX WARN: Type inference failed for: r31v108 */
    /* JADX WARN: Type inference failed for: r31v110 */
    /* JADX WARN: Type inference failed for: r31v111 */
    /* JADX WARN: Type inference failed for: r31v112 */
    /* JADX WARN: Type inference failed for: r31v117 */
    /* JADX WARN: Type inference failed for: r31v123 */
    /* JADX WARN: Type inference failed for: r31v124 */
    /* JADX WARN: Type inference failed for: r31v125 */
    /* JADX WARN: Type inference failed for: r31v128 */
    /* JADX WARN: Type inference failed for: r31v129 */
    /* JADX WARN: Type inference failed for: r31v130 */
    /* JADX WARN: Type inference failed for: r31v133 */
    /* JADX WARN: Type inference failed for: r31v134 */
    /* JADX WARN: Type inference failed for: r31v135 */
    /* JADX WARN: Type inference failed for: r31v136 */
    /* JADX WARN: Type inference failed for: r31v137 */
    /* JADX WARN: Type inference failed for: r31v138 */
    /* JADX WARN: Type inference failed for: r31v139 */
    /* JADX WARN: Type inference failed for: r31v140 */
    /* JADX WARN: Type inference failed for: r31v141 */
    /* JADX WARN: Type inference failed for: r31v16 */
    /* JADX WARN: Type inference failed for: r31v17 */
    /* JADX WARN: Type inference failed for: r31v18 */
    /* JADX WARN: Type inference failed for: r31v19 */
    /* JADX WARN: Type inference failed for: r31v20 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r31v5 */
    /* JADX WARN: Type inference failed for: r31v59 */
    /* JADX WARN: Type inference failed for: r31v6 */
    /* JADX WARN: Type inference failed for: r31v60 */
    /* JADX WARN: Type inference failed for: r31v61 */
    /* JADX WARN: Type inference failed for: r31v62 */
    /* JADX WARN: Type inference failed for: r31v63 */
    /* JADX WARN: Type inference failed for: r31v64 */
    /* JADX WARN: Type inference failed for: r31v65 */
    /* JADX WARN: Type inference failed for: r31v66 */
    /* JADX WARN: Type inference failed for: r31v67 */
    /* JADX WARN: Type inference failed for: r31v68 */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v71 */
    /* JADX WARN: Type inference failed for: r31v72 */
    /* JADX WARN: Type inference failed for: r31v73 */
    /* JADX WARN: Type inference failed for: r31v74 */
    /* JADX WARN: Type inference failed for: r31v75 */
    /* JADX WARN: Type inference failed for: r31v76 */
    /* JADX WARN: Type inference failed for: r31v77 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r31v89 */
    /* JADX WARN: Type inference failed for: r31v90 */
    /* JADX WARN: Type inference failed for: r31v91 */
    /* JADX WARN: Type inference failed for: r31v92 */
    /* JADX WARN: Type inference failed for: r31v93 */
    /* JADX WARN: Type inference failed for: r31v94 */
    /* JADX WARN: Type inference failed for: r31v95 */
    /* JADX WARN: Type inference failed for: r31v98 */
    /* JADX WARN: Type inference failed for: r31v99 */
    /* JADX WARN: Type inference failed for: r32v39 */
    /* JADX WARN: Type inference failed for: r32v40 */
    /* JADX WARN: Type inference failed for: r32v41 */
    /* JADX WARN: Type inference failed for: r32v48 */
    /* JADX WARN: Type inference failed for: r32v49 */
    /* JADX WARN: Type inference failed for: r32v51 */
    /* JADX WARN: Type inference failed for: r32v79 */
    /* JADX WARN: Type inference failed for: r32v80 */
    /* JADX WARN: Type inference failed for: r32v81 */
    /* JADX WARN: Type inference failed for: r39v10 */
    /* JADX WARN: Type inference failed for: r39v100 */
    /* JADX WARN: Type inference failed for: r39v101 */
    /* JADX WARN: Type inference failed for: r39v102 */
    /* JADX WARN: Type inference failed for: r39v103 */
    /* JADX WARN: Type inference failed for: r39v104 */
    /* JADX WARN: Type inference failed for: r39v105 */
    /* JADX WARN: Type inference failed for: r39v106 */
    /* JADX WARN: Type inference failed for: r39v107 */
    /* JADX WARN: Type inference failed for: r39v108 */
    /* JADX WARN: Type inference failed for: r39v109 */
    /* JADX WARN: Type inference failed for: r39v11 */
    /* JADX WARN: Type inference failed for: r39v110 */
    /* JADX WARN: Type inference failed for: r39v111 */
    /* JADX WARN: Type inference failed for: r39v112 */
    /* JADX WARN: Type inference failed for: r39v113 */
    /* JADX WARN: Type inference failed for: r39v114 */
    /* JADX WARN: Type inference failed for: r39v14 */
    /* JADX WARN: Type inference failed for: r39v15 */
    /* JADX WARN: Type inference failed for: r39v16 */
    /* JADX WARN: Type inference failed for: r39v17 */
    /* JADX WARN: Type inference failed for: r39v18 */
    /* JADX WARN: Type inference failed for: r39v19 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v20 */
    /* JADX WARN: Type inference failed for: r39v21 */
    /* JADX WARN: Type inference failed for: r39v28 */
    /* JADX WARN: Type inference failed for: r39v29 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v30 */
    /* JADX WARN: Type inference failed for: r39v31 */
    /* JADX WARN: Type inference failed for: r39v32 */
    /* JADX WARN: Type inference failed for: r39v33 */
    /* JADX WARN: Type inference failed for: r39v35 */
    /* JADX WARN: Type inference failed for: r39v36 */
    /* JADX WARN: Type inference failed for: r39v37 */
    /* JADX WARN: Type inference failed for: r39v38 */
    /* JADX WARN: Type inference failed for: r39v39 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r39v40 */
    /* JADX WARN: Type inference failed for: r39v41 */
    /* JADX WARN: Type inference failed for: r39v42 */
    /* JADX WARN: Type inference failed for: r39v43 */
    /* JADX WARN: Type inference failed for: r39v44 */
    /* JADX WARN: Type inference failed for: r39v47 */
    /* JADX WARN: Type inference failed for: r39v48 */
    /* JADX WARN: Type inference failed for: r39v49 */
    /* JADX WARN: Type inference failed for: r39v5 */
    /* JADX WARN: Type inference failed for: r39v50 */
    /* JADX WARN: Type inference failed for: r39v51 */
    /* JADX WARN: Type inference failed for: r39v52 */
    /* JADX WARN: Type inference failed for: r39v53 */
    /* JADX WARN: Type inference failed for: r39v54 */
    /* JADX WARN: Type inference failed for: r39v55 */
    /* JADX WARN: Type inference failed for: r39v56 */
    /* JADX WARN: Type inference failed for: r39v57 */
    /* JADX WARN: Type inference failed for: r39v59 */
    /* JADX WARN: Type inference failed for: r39v6 */
    /* JADX WARN: Type inference failed for: r39v60 */
    /* JADX WARN: Type inference failed for: r39v62 */
    /* JADX WARN: Type inference failed for: r39v63 */
    /* JADX WARN: Type inference failed for: r39v64 */
    /* JADX WARN: Type inference failed for: r39v65 */
    /* JADX WARN: Type inference failed for: r39v66 */
    /* JADX WARN: Type inference failed for: r39v68 */
    /* JADX WARN: Type inference failed for: r39v69 */
    /* JADX WARN: Type inference failed for: r39v7 */
    /* JADX WARN: Type inference failed for: r39v70 */
    /* JADX WARN: Type inference failed for: r39v71 */
    /* JADX WARN: Type inference failed for: r39v72 */
    /* JADX WARN: Type inference failed for: r39v74 */
    /* JADX WARN: Type inference failed for: r39v8 */
    /* JADX WARN: Type inference failed for: r39v9 */
    /* JADX WARN: Type inference failed for: r39v92 */
    /* JADX WARN: Type inference failed for: r39v93 */
    /* JADX WARN: Type inference failed for: r39v94 */
    /* JADX WARN: Type inference failed for: r39v95 */
    /* JADX WARN: Type inference failed for: r39v96 */
    /* JADX WARN: Type inference failed for: r39v97 */
    /* JADX WARN: Type inference failed for: r39v98 */
    /* JADX WARN: Type inference failed for: r39v99 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v431, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v432 */
    /* JADX WARN: Type inference failed for: r3v433 */
    /* JADX WARN: Type inference failed for: r3v434 */
    /* JADX WARN: Type inference failed for: r3v435 */
    /* JADX WARN: Type inference failed for: r3v448 */
    /* JADX WARN: Type inference failed for: r3v451 */
    /* JADX WARN: Type inference failed for: r3v452 */
    /* JADX WARN: Type inference failed for: r3v453 */
    /* JADX WARN: Type inference failed for: r3v454 */
    /* JADX WARN: Type inference failed for: r3v467 */
    /* JADX WARN: Type inference failed for: r3v468 */
    /* JADX WARN: Type inference failed for: r3v469 */
    /* JADX WARN: Type inference failed for: r3v470 */
    /* JADX WARN: Type inference failed for: r3v471 */
    /* JADX WARN: Type inference failed for: r3v472 */
    /* JADX WARN: Type inference failed for: r4v124 */
    /* JADX WARN: Type inference failed for: r4v125 */
    /* JADX WARN: Type inference failed for: r4v133, types: [long] */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v135 */
    /* JADX WARN: Type inference failed for: r4v136 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v139 */
    /* JADX WARN: Type inference failed for: r4v142, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v143 */
    /* JADX WARN: Type inference failed for: r4v144 */
    /* JADX WARN: Type inference failed for: r4v145 */
    /* JADX WARN: Type inference failed for: r4v146 */
    /* JADX WARN: Type inference failed for: r4v147 */
    /* JADX WARN: Type inference failed for: r4v148 */
    /* JADX WARN: Type inference failed for: r4v155 */
    /* JADX WARN: Type inference failed for: r4v378 */
    /* JADX WARN: Type inference failed for: r4v379 */
    /* JADX WARN: Type inference failed for: r4v380 */
    /* JADX WARN: Type inference failed for: r4v381 */
    /* JADX WARN: Type inference failed for: r4v382 */
    /* JADX WARN: Type inference failed for: r4v383 */
    /* JADX WARN: Type inference failed for: r4v384 */
    /* JADX WARN: Type inference failed for: r4v385 */
    /* JADX WARN: Type inference failed for: r4v386 */
    /* JADX WARN: Type inference failed for: r4v387 */
    /* JADX WARN: Type inference failed for: r4v388 */
    /* JADX WARN: Type inference failed for: r4v389 */
    /* JADX WARN: Type inference failed for: r4v390 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v58, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v309, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v127 */
    /* JADX WARN: Type inference failed for: r8v128 */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v130 */
    /* JADX WARN: Type inference failed for: r8v131 */
    /* JADX WARN: Type inference failed for: r8v132 */
    /* JADX WARN: Type inference failed for: r8v133 */
    /* JADX WARN: Type inference failed for: r8v137, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v138 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v141 */
    /* JADX WARN: Type inference failed for: r8v142 */
    /* JADX WARN: Type inference failed for: r8v149 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v150 */
    /* JADX WARN: Type inference failed for: r8v151 */
    /* JADX WARN: Type inference failed for: r8v152 */
    /* JADX WARN: Type inference failed for: r8v158 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v186 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v195 */
    /* JADX WARN: Type inference failed for: r8v196 */
    /* JADX WARN: Type inference failed for: r8v197 */
    /* JADX WARN: Type inference failed for: r8v198 */
    /* JADX WARN: Type inference failed for: r8v199 */
    /* JADX WARN: Type inference failed for: r8v200 */
    /* JADX WARN: Type inference failed for: r8v201 */
    /* JADX WARN: Type inference failed for: r8v202 */
    /* JADX WARN: Type inference failed for: r8v203 */
    /* JADX WARN: Type inference failed for: r8v204 */
    /* JADX WARN: Type inference failed for: r8v205 */
    /* JADX WARN: Type inference failed for: r8v206 */
    /* JADX WARN: Type inference failed for: r8v207 */
    /* JADX WARN: Type inference failed for: r8v208 */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r9v255, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v258 */
    /* JADX WARN: Type inference failed for: r9v259 */
    /* JADX WARN: Type inference failed for: r9v260 */
    /* JADX WARN: Type inference failed for: r9v261 */
    /* JADX WARN: Type inference failed for: r9v262 */
    /* JADX WARN: Type inference failed for: r9v263 */
    /* JADX WARN: Type inference failed for: r9v272 */
    /* JADX WARN: Type inference failed for: r9v273 */
    /* JADX WARN: Type inference failed for: r9v320 */
    /* JADX WARN: Type inference failed for: r9v321 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataManageAccountChangeWifiPasswordActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$Hu4I7AuA9lNht4JQJye1DOSu2h0(FixedDataManageAccountChangeWifiPasswordActivity fixedDataManageAccountChangeWifiPasswordActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 65;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        confirmationLauncher$lambda$0(fixedDataManageAccountChangeWifiPasswordActivity, activityResult);
        if (i3 != 0) {
            throw null;
        }
    }

    static {
        equals = 0;
        ShareDataUIState();
        component1();
        int i = getRequestBeneficiariesState + 3;
        equals = i % 128;
        int i2 = i % 2;
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 81;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 77;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component1() {
        int i = 2 % 2;
        int i2 = copy + 3;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            component1 = new char[]{23368, 15584, 37902, 28137, 50643, 23914, 13970, 36384, 26222, 65414, 22381, 12099, 33010, 6168, 61882, 18883, 8458, 47779, 4819, 60006, 17282, 56114, 45910, 5369, 60479, 17409, 56800, 46344, 3765, 59084, 32358, 55194, 45006, 1917, 39117, 28724, 51293, 41468, 14598, 37566, 27301, 49677, 23478, 13278, 35705, 27786, 50237, 23635, 13703, 36138, 25936, 65193, 22024, 12207, 34780, 8035, 61602, 18633, 8314, 47561, 4392, 59727, 17148, 55811, 45634, 3049, 58138, 17541, 56526, 46193, 3479, 58683, 32110, 54940, 44544, 1608, 40949, 30489, 51386, 41157, 14342, 37345, 27120, 49527, 23188, 12843, 35418, 25585, 64306, 21357, 13558, 35849, 26047, 64979, 21878, 11908, 34536, 7776, 63373, 20257, 10066, 47341, 4126, 59777, 16866, 55562, 45748, 2794, 57972, 31643, 54070, 43867, 3279, 58412, 31820, 54761, 44317, 1718, 40641, 30330, 53129, 42970, 16237, 36995, 26679, 49242, 22979, 12546, 35161, 25324, 64011, 21414, 11208, 33658, 25815, 64613};
            component2 = 7438958457059896274L;
        } else {
            component1 = new char[]{23368, 15584, 37902, 28137, 50643, 23914, 13970, 36384, 26222, 65414, 22381, 12099, 33010, 6168, 61882, 18883, 8458, 47779, 4819, 60006, 17282, 56114, 45910, 5369, 60479, 17409, 56800, 46344, 3765, 59084, 32358, 55194, 45006, 1917, 39117, 28724, 51293, 41468, 14598, 37566, 27301, 49677, 23478, 13278, 35705, 27786, 50237, 23635, 13703, 36138, 25936, 65193, 22024, 12207, 34780, 8035, 61602, 18633, 8314, 47561, 4392, 59727, 17148, 55811, 45634, 3049, 58138, 17541, 56526, 46193, 3479, 58683, 32110, 54940, 44544, 1608, 40949, 30489, 51386, 41157, 14342, 37345, 27120, 49527, 23188, 12843, 35418, 25585, 64306, 21357, 13558, 35849, 26047, 64979, 21878, 11908, 34536, 7776, 63373, 20257, 10066, 47341, 4126, 59777, 16866, 55562, 45748, 2794, 57972, 31643, 54070, 43867, 3279, 58412, 31820, 54761, 44317, 1718, 40641, 30330, 53129, 42970, 16237, 36995, 26679, 49242, 22979, 12546, 35161, 25324, 64011, 21414, 11208, 33658, 25815, 64613};
            component2 = 7438958457059896274L;
            int i3 = 38 / 0;
        }
    }

    static void ShareDataUIState() {
        copydefault = 7518190688682620127L;
        component3 = new char[]{12825, 2003, 12818, 12828, 12827, 2041, 2029, 12831, 1976, 2025, 1973, 12829, 2004, 2035, 2031, 2023, 1966, 1974, 2034, 1970, 12816, 2033, 2005, 2037, 12830, 2036, 2028, 2018, 2019, 2020, 12819, 2032, 2024, 2038, 2026, 1975, 2017, 2030, 2021, 1972, 1971, 1977, 1978, 1985, 12824, 1969, 1968, 2022, 1967};
        ShareDataUIState = (char) 12829;
    }
}
