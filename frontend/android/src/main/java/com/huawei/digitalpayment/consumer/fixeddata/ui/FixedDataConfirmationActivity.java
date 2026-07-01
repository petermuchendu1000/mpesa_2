package com.huawei.digitalpayment.consumer.fixeddata.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.api.common.monitor.GriverMonitorConstants;
import com.google.common.base.Ascii;
import com.huawei.arouter.RouteUtils;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.FixedDataNavKeys;
import com.huawei.digitalpayment.consumer.fixeddata.presentation.state.UiEvent;
import com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardUiState;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareDashboardViewModel;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FamilyShareEvent;
import com.huawei.digitalpayment.consumer.fixeddata.viewmodel.FixedDataViewModel;
import com.huawei.digitalpayment.consumer.sfcfixeddata.R;
import com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenData;
import com.huawei.digitalpayment.consumer.sfcui.commons.GsmConfirmationScreenKt;
import com.huawei.digitalpayment.consumer.sfcui.constants.RoutePathConstant;
import com.huawei.digitalpayment.consumer.sfcui.servicepin.activity.SfcServicePinActivity;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020#X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/fixeddata/ui/FixedDataConfirmationActivity;", "Landroidx/fragment/app/FragmentActivity;", "<init>", "()V", "fixedDataViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "getFixedDataViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;", "setFixedDataViewModel", "(Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FixedDataViewModel;)V", "familyShareViewModel", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardViewModel;", "getFamilyShareViewModel", "()Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardViewModel;", "familyShareViewModel$delegate", "Lkotlin/Lazy;", "actionType", "", "pendingMsisdn", "pendingDataLimit", "pendingMinsLimit", "pendingIsUnlimited", "", "pendingUnlimitedOption", "pinType", "accountId", "pinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ConsumerSfcFixedData_release", "uiState", "Lcom/huawei/digitalpayment/consumer/fixeddata/viewmodel/FamilyShareDashboardUiState;", GriverMonitorConstants.KEY_IS_LOADING}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class FixedDataConfirmationActivity extends Hilt_FixedDataConfirmationActivity {
    public static final int $stable = 8;
    private static boolean ShareDataUIState;
    private static int component1;
    private static long component2;
    private static char[] component3;
    private static boolean copydefault;
    private static int equals;

    private final Lazy familyShareViewModel;

    @Inject
    public FixedDataViewModel fixedDataViewModel;
    private boolean pendingIsUnlimited;
    private static final byte[] $$c = {TarHeader.LF_NORMAL, -42, 66, -37};
    private static final int $$f = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {Ascii.SI, -74, 84, -51, 2, -12, -58, TarHeader.LF_CHR, Ascii.FF, 5, -8, -12, Ascii.NAK, -23, -3, 17, 0, -9, -8, -56, 65, 0, -15, -54, 59, -8, -3, 8, -8, 1, -56, 65, 1, -4, 6, -14, -6, 0, Ascii.FF, -69, 73, -12, 5, -1, -70, 41, -12, 5, -1, -7, 6, -10, Ascii.EM, 19, -42, Ascii.DLE, 7, 8, -44, Ascii.GS, 8, -10, Ascii.FF, -18, Ascii.DC2, -6, 2, -32, Ascii.FS, -8, Ascii.VT, 0, 8, -22, 0, 0, -6, 19, -10, 7, Ascii.VT, -3, -64, 56, 7, -1, -9, 4, -8, -56, 75, -3, -16, 4, -8, -58, 65, -13, 1, -51, -4, 5, -10, TarHeader.LF_DIR, 0, -3, Ascii.VT, -12, 0, Ascii.FF, -69, 19, Ascii.RS, Ascii.DLE, -16, Ascii.VT, -12, 0, -25, Ascii.ETB, Ascii.SO, -20, 2, -4, Ascii.DC2, -20, 20, -8, Ascii.DLE, -14, -34, Ascii.FS, Ascii.DC2, -20, -13, -13, 9, 32, -20, Ascii.DC2, -16, Ascii.VT, -3, 2, -2, -2, -10, 8, 5, -66, 3, 4, -9, -4, 4, 9, -75, TarHeader.LF_BLK, Ascii.VT, -4, -1, -8, -3, Ascii.DLE, -12, 5, -2, 4, -70, 58, 3, -1, 7, -2, -20, 0, 9, -8, -56, 58, 3, 2, -5, -8, 7, -9, 8, 5, -20, Ascii.DC2, -12, 5, -2, 4, -70, 58, 3, -1, 7, -2, -20, 0, 9, -8, -26, Ascii.FS, 9, 0, -71, 32, Ascii.DC2, 7, -6, -3, Ascii.DLE, -35, Ascii.DC2, 0, Ascii.VT, -3, -64, 69, -19, Ascii.DC2, -7, -2, 0, -3, 1, -66, 71, -14, -5, 17, -8, -16, 5, -3, Ascii.FF, -15, 10, 4, -2, -11, 4, -11, 4, -7, -3, Ascii.DC2, -6, 2, -69, 35, -47, 71, -12, Ascii.ETB, -11, 5, -2};
    private static final int $$h = 110;
    private static final byte[] $$a = {7, 80, 121, 38, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -6, -11, -7, -7, 1, -17, -14, 57, -20, -12, Ascii.FF, -19, -15, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 202;
    private static int component4 = 1;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private String actionType = "";
    private String pendingMsisdn = "";
    private String pendingDataLimit = "";
    private String pendingMinsLimit = "";
    private String pendingUnlimitedOption = "";
    private String pinType = "";
    private String accountId = "";
    private final ActivityResultLauncher<Intent> pinLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;

        @Override
        public final void onActivityResult(Object obj) {
            int i = 2 % 2;
            int i2 = component2 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            FixedDataConfirmationActivity.$r8$lambda$C_ZO77SLrUpwhB3CoKRzFrXlgvk(this.f$0, (ActivityResult) obj);
            int i4 = component2 + 71;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r7 = r7 * 5
            int r7 = r7 + 68
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$c
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = r6 * 2
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$i(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 83
            int r8 = r8 + 4
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$a
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
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r3 = r0[r8]
        L24:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-8)
            int r8 = r8 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.c(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$g
            int r6 = r6 * 4
            int r6 = 111 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r7 = r7 + r4
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.d(int, int, short, java.lang.Object[]):void");
    }

    public static final String access$getActionType$p(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 45;
        copy = i3 % 128;
        int i4 = i3 % 2;
        String str = fixedDataConfirmationActivity.actionType;
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 91;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 51 / 0;
        }
        return str;
    }

    public static final FamilyShareDashboardViewModel access$getFamilyShareViewModel(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
        int i = 2 % 2;
        int i2 = copy + 65;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        FamilyShareDashboardViewModel familyShareViewModel = fixedDataConfirmationActivity.getFamilyShareViewModel();
        int i4 = copy + 105;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            return familyShareViewModel;
        }
        throw null;
    }

    public static final String access$getPendingMsisdn$p(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        Object obj = null;
        String str = fixedDataConfirmationActivity.pendingMsisdn;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 99;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public static final ActivityResultLauncher access$getPinLauncher$p(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
        int i = 2 % 2;
        int i2 = copy + 57;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        Object obj = null;
        ActivityResultLauncher<Intent> activityResultLauncher = fixedDataConfirmationActivity.pinLauncher;
        if (i4 == 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 103;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return activityResultLauncher;
        }
        obj.hashCode();
        throw null;
    }

    public static final String access$getPinType$p(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 41;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        String str = fixedDataConfirmationActivity.pinType;
        int i5 = i2 + 75;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 37 / 0;
        }
        return str;
    }

    public FixedDataConfirmationActivity() {
        final FixedDataConfirmationActivity fixedDataConfirmationActivity = this;
        final Function0 function0 = null;
        this.familyShareViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FamilyShareDashboardViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 1;
            private static int copydefault;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = component3 + 57;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = fixedDataConfirmationActivity;
                if (i3 == 0) {
                    return componentActivity.getViewModelStore();
                }
                componentActivity.getViewModelStore();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                ViewModelStore viewModelStoreInvoke;
                int i = 2 % 2;
                int i2 = component3 + 77;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    viewModelStoreInvoke = invoke();
                    int i3 = 53 / 0;
                } else {
                    viewModelStoreInvoke = invoke();
                }
                int i4 = copydefault + 105;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    return viewModelStoreInvoke;
                }
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int component2 = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 39;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory factoryInvoke = invoke();
                int i4 = component3 + 77;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = component2 + 99;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ViewModelProvider.Factory defaultViewModelProviderFactory = fixedDataConfirmationActivity.getDefaultViewModelProviderFactory();
                int i4 = component2 + 105;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return defaultViewModelProviderFactory;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int component2;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1;
                int i3 = i2 + 115;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                Function0 function02 = function0;
                if (function02 != null) {
                    int i5 = i2 + 113;
                    component2 = i5 % 128;
                    int i6 = i5 % 2;
                    CreationExtras creationExtras = (CreationExtras) function02.invoke();
                    if (creationExtras != null) {
                        return creationExtras;
                    }
                }
                CreationExtras defaultViewModelCreationExtras = fixedDataConfirmationActivity.getDefaultViewModelCreationExtras();
                int i7 = component1 + 19;
                component2 = i7 % 128;
                int i8 = i7 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component2 + 19;
                component1 = i2 % 128;
                if (i2 % 2 == 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                CreationExtras creationExtrasInvoke = invoke();
                int i3 = component2 + 7;
                component1 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 17 / 0;
                }
                return creationExtrasInvoke;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    public final FixedDataViewModel getFixedDataViewModel() {
        int i = 2 % 2;
        int i2 = copy + 39;
        int i3 = i2 % 128;
        getRequestBeneficiariesState = i3;
        int i4 = i2 % 2;
        FixedDataViewModel fixedDataViewModel = this.fixedDataViewModel;
        if (fixedDataViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }
        int i5 = i3 + 111;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return fixedDataViewModel;
        }
        throw null;
    }

    public final void setFixedDataViewModel(FixedDataViewModel fixedDataViewModel) {
        int i = 2 % 2;
        int i2 = copy + 103;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
        } else {
            Intrinsics.checkNotNullParameter(fixedDataViewModel, "");
            this.fixedDataViewModel = fixedDataViewModel;
            throw null;
        }
    }

    private final FamilyShareDashboardViewModel getFamilyShareViewModel() {
        int i = 2 % 2;
        int i2 = copy + 31;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        FamilyShareDashboardViewModel familyShareDashboardViewModel = (FamilyShareDashboardViewModel) this.familyShareViewModel.getValue();
        int i4 = getRequestBeneficiariesState + 113;
        copy = i4 % 128;
        int i5 = i4 % 2;
        return familyShareDashboardViewModel;
    }

    private static final void pinLauncher$lambda$0(FixedDataConfirmationActivity fixedDataConfirmationActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(fixedDataConfirmationActivity, "");
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() == -1) {
            String str = fixedDataConfirmationActivity.actionType;
            if (Intrinsics.areEqual(str, "ADD_BENEFICIARY")) {
                int i2 = getRequestBeneficiariesState + 39;
                copy = i2 % 128;
                if (i2 % 2 != 0) {
                    fixedDataConfirmationActivity.getFamilyShareViewModel().addBeneficiary(fixedDataConfirmationActivity.pendingMsisdn, fixedDataConfirmationActivity.pendingDataLimit, fixedDataConfirmationActivity.pendingMinsLimit, fixedDataConfirmationActivity.pendingIsUnlimited, fixedDataConfirmationActivity.pendingUnlimitedOption);
                    int i3 = 22 / 0;
                } else {
                    fixedDataConfirmationActivity.getFamilyShareViewModel().addBeneficiary(fixedDataConfirmationActivity.pendingMsisdn, fixedDataConfirmationActivity.pendingDataLimit, fixedDataConfirmationActivity.pendingMinsLimit, fixedDataConfirmationActivity.pendingIsUnlimited, fixedDataConfirmationActivity.pendingUnlimitedOption);
                }
            } else if (Intrinsics.areEqual(str, "OPT_OUT")) {
                int i4 = copy + 27;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                fixedDataConfirmationActivity.getFixedDataViewModel().deleteFamilyShareProduct(fixedDataConfirmationActivity.accountId);
            }
        }
        int i6 = getRequestBeneficiariesState + 117;
        copy = i6 % 128;
        int i7 = i6 % 2;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component2 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i5 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component2)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7031 - MotionEvent.axisFromString(""), 34 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (View.getDefaultSize(0, 0) + 63440), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i5] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1390 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 51269), -1883291598, false, $$i(b2, (byte) (b2 | 7), b2), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrComponent2, 4, cArrComponent2.length - 4);
        int i6 = $11 + 105;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity$onCreate$2", f = "FixedDataConfirmationActivity.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component3;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 57;
            ShareDataUIState = i2 % 128;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component3;
            if (i3 != 0) {
                int i4 = ShareDataUIState + 23;
                component1 = i4 % 128;
                if (i4 % 2 != 0 ? i3 != 1 : i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SharedFlow<FamilyShareEvent> events = FixedDataConfirmationActivity.access$getFamilyShareViewModel(FixedDataConfirmationActivity.this).getEvents();
                final FixedDataConfirmationActivity fixedDataConfirmationActivity = FixedDataConfirmationActivity.this;
                this.component3 = 1;
                if (events.collect(new FlowCollector() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public Object emit(Object obj3, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = component3 + 37;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        Object objCopydefault = copydefault((FamilyShareEvent) obj3, continuation);
                        int i8 = component3 + 27;
                        component1 = i8 % 128;
                        if (i8 % 2 != 0) {
                            return objCopydefault;
                        }
                        Object obj4 = null;
                        obj4.hashCode();
                        throw null;
                    }

                    public final Object copydefault(FamilyShareEvent familyShareEvent, Continuation<? super Unit> continuation) {
                        int i5 = 2 % 2;
                        if (familyShareEvent instanceof FamilyShareEvent.AddSuccess) {
                            Bundle bundle = new Bundle();
                            FixedDataConfirmationActivity fixedDataConfirmationActivity2 = fixedDataConfirmationActivity;
                            bundle.putBoolean("extra_is_success", true);
                            String message = ((FamilyShareEvent.AddSuccess) familyShareEvent).getMessage();
                            if (StringsKt.isBlank(message)) {
                                int i6 = component3 + 93;
                                component1 = i6 % 128;
                                if (i6 % 2 == 0) {
                                    message = fixedDataConfirmationActivity2.getString(R.string.fixed_data_beneficiary_added_successfully);
                                    Intrinsics.checkNotNullExpressionValue(message, "");
                                    int i7 = 7 / 0;
                                } else {
                                    message = fixedDataConfirmationActivity2.getString(R.string.fixed_data_beneficiary_added_successfully);
                                    Intrinsics.checkNotNullExpressionValue(message, "");
                                }
                            }
                            bundle.putString("extra_message", message);
                            bundle.putString(FixedDataNavKeys.EXTRA_KEYWORD1, fixedDataConfirmationActivity2.getString(R.string.fixed_data_add_beneficiary));
                            bundle.putString(FixedDataNavKeys.EXTRA_CLOSE_ROUTE, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE_DASHBOARD);
                            RouteUtils.routeWithExecute(fixedDataConfirmationActivity, RoutePathConstant.SFC_FIXED_DATA_GENERIC_COMPLETION, bundle);
                            fixedDataConfirmationActivity.setResult(-1);
                            fixedDataConfirmationActivity.finish();
                        } else if (familyShareEvent instanceof FamilyShareEvent.AddError) {
                            Bundle bundle2 = new Bundle();
                            FixedDataConfirmationActivity fixedDataConfirmationActivity3 = fixedDataConfirmationActivity;
                            bundle2.putBoolean("extra_is_success", false);
                            String message2 = ((FamilyShareEvent.AddError) familyShareEvent).getMessage();
                            if (StringsKt.isBlank(message2)) {
                                int i8 = component3 + 37;
                                component1 = i8 % 128;
                                int i9 = i8 % 2;
                                message2 = fixedDataConfirmationActivity3.getString(R.string.fixed_data_failed_to_add_beneficiary);
                                Intrinsics.checkNotNullExpressionValue(message2, "");
                            }
                            bundle2.putString("extra_message", message2);
                            bundle2.putString(FixedDataNavKeys.EXTRA_KEYWORD1, fixedDataConfirmationActivity3.getString(R.string.fixed_data_add_beneficiary));
                            bundle2.putString(FixedDataNavKeys.EXTRA_CLOSE_ROUTE, RoutePathConstant.SFC_FIXED_DATA_FAMILY_SHARE_DASHBOARD);
                            RouteUtils.routeWithExecute(fixedDataConfirmationActivity, RoutePathConstant.SFC_FIXED_DATA_GENERIC_COMPLETION, bundle2);
                            fixedDataConfirmationActivity.setResult(-1);
                            fixedDataConfirmationActivity.finish();
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = FixedDataConfirmationActivity.this.new component2(continuation);
            int i2 = ShareDataUIState + 55;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 73;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = ShareDataUIState + 91;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objShareDataUIState;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 41;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component1 + 113;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 96 / 0;
            }
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity$onCreate$3", f = "FixedDataConfirmationActivity.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int component2;

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component2;
            if (i2 != 0) {
                int i3 = component1 + 99;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                SharedFlow<UiEvent> events = FixedDataConfirmationActivity.this.getFixedDataViewModel().getEvents();
                final FixedDataConfirmationActivity fixedDataConfirmationActivity = FixedDataConfirmationActivity.this;
                this.component2 = 1;
                if (events.collect(new FlowCollector() {
                    private static int component1 = 0;
                    private static int copydefault = 1;

                    @Override
                    public Object emit(Object obj2, Continuation continuation) {
                        int i5 = 2 % 2;
                        int i6 = copydefault + 83;
                        component1 = i6 % 128;
                        int i7 = i6 % 2;
                        Object objShareDataUIState = ShareDataUIState((UiEvent) obj2, continuation);
                        int i8 = copydefault + 49;
                        component1 = i8 % 128;
                        int i9 = i8 % 2;
                        return objShareDataUIState;
                    }

                    public final Object ShareDataUIState(UiEvent uiEvent, Continuation<? super Unit> continuation) {
                        int i5 = 2 % 2;
                        if (!(uiEvent instanceof UiEvent.DeleteProductCompleted)) {
                            if (uiEvent instanceof UiEvent.ShowError) {
                                FixedDataConfirmationActivity fixedDataConfirmationActivity2 = fixedDataConfirmationActivity;
                                String message = ((UiEvent.ShowError) uiEvent).getError().getMessage();
                                if (message == null) {
                                    message = fixedDataConfirmationActivity.getString(R.string.gsm_fixed_data_an_error_occurred);
                                    Intrinsics.checkNotNullExpressionValue(message, "");
                                }
                                Toast.makeText(fixedDataConfirmationActivity2, message, 1).show();
                            }
                        } else {
                            int i6 = component1 + 39;
                            copydefault = i6 % 128;
                            if (i6 % 2 == 0) {
                                FixedDataConfirmationActivity fixedDataConfirmationActivity3 = fixedDataConfirmationActivity;
                                ((UiEvent.DeleteProductCompleted) uiEvent).getResponseMessage();
                                Object obj2 = null;
                                obj2.hashCode();
                                throw null;
                            }
                            FixedDataConfirmationActivity fixedDataConfirmationActivity4 = fixedDataConfirmationActivity;
                            String responseMessage = ((UiEvent.DeleteProductCompleted) uiEvent).getResponseMessage();
                            if (responseMessage == null) {
                                responseMessage = fixedDataConfirmationActivity.getString(R.string.gsm_fixed_data_opt_out_success);
                                Intrinsics.checkNotNullExpressionValue(responseMessage, "");
                            }
                            Toast.makeText(fixedDataConfirmationActivity4, responseMessage, 1).show();
                            Intent intent = new Intent(fixedDataConfirmationActivity, (Class<?>) FixedDataDashboardActivity.class);
                            intent.setFlags(603979776);
                            fixedDataConfirmationActivity.startActivity(intent);
                            fixedDataConfirmationActivity.finish();
                            int i7 = component1 + 121;
                            copydefault = i7 % 128;
                            int i8 = i7 % 2;
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    int i5 = component1 + 5;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    return coroutine_suspended;
                }
            }
            throw new KotlinNothingValueException();
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = FixedDataConfirmationActivity.this.new component3(continuation);
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent1 = component1(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 6 / 0;
            }
            int i5 = component3 + 55;
            component1 = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 50 / 0;
            }
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 79;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            if (i3 != 0) {
                return component3Var.invokeSuspend(Unit.INSTANCE);
            }
            component3Var.invokeSuspend(Unit.INSTANCE);
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int copy = 1;
        private static int copydefault;
        final int ShareDataUIState;
        final String component1;
        final LinkedHashMap<String, String> component3;

        public static final void ShareDataUIState(MutableState mutableState, boolean z) {
            int i = 2 % 2;
            int i2 = copydefault + 117;
            copy = i2 % 128;
            int i3 = i2 % 2;
            component1(mutableState, z);
            int i4 = copydefault + 99;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }

        public static final boolean component3(MutableState mutableState) {
            int i = 2 % 2;
            int i2 = copy + 13;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                return ShareDataUIState(mutableState);
            }
            ShareDataUIState(mutableState);
            throw null;
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = copy + 33;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            copydefault(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return unit;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity$onCreate$4$1", f = "FixedDataConfirmationActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component3;
            final MutableState<Boolean> component1;
            int component2;
            final FixedDataConfirmationActivity copydefault;

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.component2 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = component3 + 79;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                ResultKt.throwOnFailure(obj);
                if (i5 == 0) {
                    ShareDataUIState.component3((MutableState) this.component1);
                    throw null;
                }
                if (ShareDataUIState.component3((MutableState) this.component1)) {
                    DialogManager.showLoading(this.copydefault);
                } else {
                    DialogManager.hideLoading(this.copydefault);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(FixedDataConfirmationActivity fixedDataConfirmationActivity, MutableState<Boolean> mutableState, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.copydefault = fixedDataConfirmationActivity;
                this.component1 = mutableState;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.copydefault, this.component1, continuation);
                int i2 = ShareDataUIState + 35;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 9;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                int i4 = ShareDataUIState + 17;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    return objCopydefault;
                }
                throw null;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass4 anonymousClass4 = (AnonymousClass4) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass4.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass4.invokeSuspend(unit);
                int i4 = component3 + 91;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
            private static int copy = 1;
            private static int getRequestBeneficiariesState;
            final String ShareDataUIState;
            final int component1;
            final MutableState<Boolean> component2;
            final FixedDataConfirmationActivity component3;
            final LinkedHashMap<String, String> copydefault;

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copy + 69;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                ShareDataUIState(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copy + 67;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void ShareDataUIState(Composer composer, int i) {
                int i2 = 2 % 2;
                int i3 = copy + 57;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                if ((i & 11) == 2) {
                    if (composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        int i5 = copy + 111;
                        getRequestBeneficiariesState = i5 % 128;
                        int i6 = i5 % 2;
                        return;
                    }
                    int i7 = getRequestBeneficiariesState + 111;
                    copy = i7 % 128;
                    int i8 = i7 % 2;
                }
                String string = this.component3.getString(R.string.gsm_title_confirm);
                Intrinsics.checkNotNullExpressionValue(string, "");
                GsmConfirmationScreenData gsmConfirmationScreenData = new GsmConfirmationScreenData(this.ShareDataUIState, this.component1, this.copydefault);
                final FixedDataConfirmationActivity fixedDataConfirmationActivity = this.component3;
                final LinkedHashMap<String, String> linkedHashMap = this.copydefault;
                final MutableState<Boolean> mutableState = this.component2;
                Function0 function0 = new Function0() {
                    private static int component1 = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = component3 + 43;
                        component1 = i10 % 128;
                        if (i10 % 2 == 0) {
                            FixedDataConfirmationActivity.ShareDataUIState.AnonymousClass2.component2(fixedDataConfirmationActivity, linkedHashMap, mutableState);
                            throw null;
                        }
                        Unit unitComponent2 = FixedDataConfirmationActivity.ShareDataUIState.AnonymousClass2.component2(fixedDataConfirmationActivity, linkedHashMap, mutableState);
                        int i11 = component3 + 31;
                        component1 = i11 % 128;
                        int i12 = i11 % 2;
                        return unitComponent2;
                    }
                };
                final FixedDataConfirmationActivity fixedDataConfirmationActivity2 = this.component3;
                GsmConfirmationScreenKt.m11403GsmConfirmationScreencEmTA8(string, gsmConfirmationScreenData, null, false, null, null, function0, new Function0() {
                    private static int ShareDataUIState = 1;
                    private static int component3;

                    @Override
                    public final Object invoke() {
                        int i9 = 2 % 2;
                        int i10 = ShareDataUIState + 31;
                        component3 = i10 % 128;
                        int i11 = i10 % 2;
                        Unit unitShareDataUIState = FixedDataConfirmationActivity.ShareDataUIState.AnonymousClass2.ShareDataUIState(fixedDataConfirmationActivity2);
                        int i12 = component3 + 121;
                        ShareDataUIState = i12 % 128;
                        int i13 = i12 % 2;
                        return unitShareDataUIState;
                    }
                }, composer, (GsmConfirmationScreenData.$stable << 3) | 3072, 52);
            }

            private static final Unit component1(FixedDataConfirmationActivity fixedDataConfirmationActivity, LinkedHashMap linkedHashMap, MutableState mutableState) {
                String str;
                int i = 2 % 2;
                int i2 = getRequestBeneficiariesState + 125;
                copy = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(fixedDataConfirmationActivity, "");
                    Intrinsics.checkNotNullParameter(linkedHashMap, "");
                    Intrinsics.checkNotNullParameter(mutableState, "");
                    Intrinsics.areEqual(FixedDataConfirmationActivity.access$getActionType$p(fixedDataConfirmationActivity), "ADD_BENEFICIARY");
                    obj.hashCode();
                    throw null;
                }
                Intrinsics.checkNotNullParameter(fixedDataConfirmationActivity, "");
                Intrinsics.checkNotNullParameter(linkedHashMap, "");
                Intrinsics.checkNotNullParameter(mutableState, "");
                str = "/sfcModule/identityPin";
                if (Intrinsics.areEqual(FixedDataConfirmationActivity.access$getActionType$p(fixedDataConfirmationActivity), "ADD_BENEFICIARY")) {
                    String strAccess$getPendingMsisdn$p = (String) linkedHashMap.get("Name");
                    if (strAccess$getPendingMsisdn$p == null) {
                        int i3 = getRequestBeneficiariesState + 63;
                        copy = i3 % 128;
                        if (i3 % 2 == 0) {
                            FixedDataConfirmationActivity.access$getPendingMsisdn$p(fixedDataConfirmationActivity);
                            obj.hashCode();
                            throw null;
                        }
                        strAccess$getPendingMsisdn$p = FixedDataConfirmationActivity.access$getPendingMsisdn$p(fixedDataConfirmationActivity);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("titleText", fixedDataConfirmationActivity.getString(R.string.fixed_data_add_beneficiary));
                    bundle.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_family_share);
                    bundle.putString("phoneNumber", fixedDataConfirmationActivity.getString(R.string.gsm_fixed_data_confirm_add_beneficiary_msg, new Object[]{strAccess$getPendingMsisdn$p}));
                    RouteUtils.routeWithExecute(fixedDataConfirmationActivity, Intrinsics.areEqual(FixedDataConfirmationActivity.access$getPinType$p(fixedDataConfirmationActivity), "SERVICE_PIN") ? RoutePathConstant.SFC_SERVICE_PIN : "/sfcModule/identityPin", bundle, FixedDataConfirmationActivity.access$getPinLauncher$p(fixedDataConfirmationActivity));
                } else if (Intrinsics.areEqual(FixedDataConfirmationActivity.access$getActionType$p(fixedDataConfirmationActivity), "OPT_OUT")) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("titleText", fixedDataConfirmationActivity.getString(R.string.gsm_fixed_data_opt_out_title));
                    bundle2.putInt(SfcServicePinActivity.EXTRA_IMAGE_RES, R.drawable.ic_family_share);
                    bundle2.putString("phoneNumber", fixedDataConfirmationActivity.getString(R.string.gsm_fixed_data_confirm_opt_out_msg));
                    if (Intrinsics.areEqual(FixedDataConfirmationActivity.access$getPinType$p(fixedDataConfirmationActivity), "SERVICE_PIN")) {
                        str = RoutePathConstant.SFC_SERVICE_PIN;
                    } else {
                        int i4 = getRequestBeneficiariesState + 99;
                        copy = i4 % 128;
                        int i5 = i4 % 2;
                    }
                    RouteUtils.routeWithExecute(fixedDataConfirmationActivity, str, bundle2, FixedDataConfirmationActivity.access$getPinLauncher$p(fixedDataConfirmationActivity));
                } else {
                    ShareDataUIState.ShareDataUIState(mutableState, true);
                    fixedDataConfirmationActivity.setResult(-1);
                    fixedDataConfirmationActivity.finish();
                }
                return Unit.INSTANCE;
            }

            private static final Unit component2(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
                int i = 2 % 2;
                int i2 = copy + 71;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(fixedDataConfirmationActivity, "");
                    fixedDataConfirmationActivity.finish();
                    Unit unit = Unit.INSTANCE;
                    throw null;
                }
                Intrinsics.checkNotNullParameter(fixedDataConfirmationActivity, "");
                fixedDataConfirmationActivity.finish();
                Unit unit2 = Unit.INSTANCE;
                int i3 = copy + 9;
                getRequestBeneficiariesState = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 94 / 0;
                }
                return unit2;
            }

            public static Unit ShareDataUIState(FixedDataConfirmationActivity fixedDataConfirmationActivity) {
                int i = 2 % 2;
                int i2 = copy + 23;
                getRequestBeneficiariesState = i2 % 128;
                if (i2 % 2 != 0) {
                    component2(fixedDataConfirmationActivity);
                    throw null;
                }
                Unit unitComponent2 = component2(fixedDataConfirmationActivity);
                int i3 = copy + 101;
                getRequestBeneficiariesState = i3 % 128;
                int i4 = i3 % 2;
                return unitComponent2;
            }

            public static Unit component2(FixedDataConfirmationActivity fixedDataConfirmationActivity, LinkedHashMap linkedHashMap, MutableState mutableState) {
                int i = 2 % 2;
                int i2 = copy + 25;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(fixedDataConfirmationActivity, linkedHashMap, mutableState);
                int i4 = copy + 75;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent1;
            }

            AnonymousClass2(FixedDataConfirmationActivity fixedDataConfirmationActivity, String str, int i, LinkedHashMap<String, String> linkedHashMap, MutableState<Boolean> mutableState) {
                this.component3 = fixedDataConfirmationActivity;
                this.ShareDataUIState = str;
                this.component1 = i;
                this.copydefault = linkedHashMap;
                this.component2 = mutableState;
            }
        }

        public final void copydefault(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = copy + 71;
            copydefault = i3 % 128;
            if (i3 % 2 == 0 ? (i & 11) == 2 : (i & 4) == 2) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    int i4 = copy + 95;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return;
                }
                int i6 = copy + 105;
                copydefault = i6 % 128;
                int i7 = i6 % 2;
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(FixedDataConfirmationActivity.access$getFamilyShareViewModel(FixedDataConfirmationActivity.this).getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
            boolean zIsLoading = component3((State<FamilyShareDashboardUiState>) stateCollectAsStateWithLifecycle).isLoading();
            composer.startReplaceGroup(1192649055);
            boolean zChanged = composer.changed(zIsLoading);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(component3((State<FamilyShareDashboardUiState>) stateCollectAsStateWithLifecycle).isLoading()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(Boolean.valueOf(ShareDataUIState(mutableState)), new AnonymousClass4(FixedDataConfirmationActivity.this, mutableState, null), composer, 64);
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(224886533, true, new AnonymousClass2(FixedDataConfirmationActivity.this, this.component1, this.ShareDataUIState, this.component3, mutableState), composer, 54), composer, 1572864, 63);
        }

        private static final FamilyShareDashboardUiState component3(State<FamilyShareDashboardUiState> state) {
            int i = 2 % 2;
            int i2 = copy + 123;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            FamilyShareDashboardUiState value = state.getValue();
            int i4 = copy + 101;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return value;
        }

        private static final boolean ShareDataUIState(MutableState<Boolean> mutableState) {
            int i = 2 % 2;
            int i2 = copydefault + 77;
            copy = i2 % 128;
            if (i2 % 2 != 0) {
                return mutableState.getValue().booleanValue();
            }
            mutableState.getValue().booleanValue();
            throw null;
        }

        private static final void component1(MutableState<Boolean> mutableState, boolean z) {
            int i = 2 % 2;
            int i2 = copy + 45;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            mutableState.setValue(Boolean.valueOf(z));
            int i4 = copy + 11;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
        }

        ShareDataUIState(String str, int i, LinkedHashMap<String, String> linkedHashMap) {
            this.component1 = str;
            this.ShareDataUIState = i;
            this.component3 = linkedHashMap;
        }
    }

    private static void b(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component3;
        float f = 0.0f;
        int i3 = 0;
        if (cArr2 != null) {
            int i4 = $11 + 27;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i6]);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        byte b2 = (byte) i3;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", i3, i3) + 3760, (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 23, (char) TextUtils.getOffsetAfter("", i3), -1670574543, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i6++;
                    f = 0.0f;
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
        try {
            Object[] objArr3 = {Integer.valueOf(component1)};
            Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
            if (objCopydefault2 == null) {
                objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 7140, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 14, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 1487437377, false, "C", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
            int i7 = 689978476;
            if (ShareDataUIState) {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cancelVar.component1 = bArr.length;
                char[] cArr4 = new char[cancelVar.component1];
                cancelVar.component3 = 0;
                while (cancelVar.component3 < cancelVar.component1) {
                    int i10 = $11 + 119;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                    Object[] objArr4 = {cancelVar, cancelVar};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i7);
                    if (objCopydefault3 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = (byte) (b4 + 1);
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2748 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 19 - TextUtils.getOffsetBefore("", 0), (char) (7644 - (ViewConfiguration.getPressedStateDuration() >> 16)), -327556343, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault3).invoke(null, objArr4);
                    i7 = 689978476;
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
                        byte b6 = (byte) 0;
                        byte b7 = (byte) (b6 + 1);
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getOffsetBefore("", 0) + 2748, (ViewConfiguration.getWindowTouchSlop() >> 8) + 19, (char) (7644 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), -327556343, false, $$i(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objCopydefault4).invoke(null, objArr5);
                }
                objArr[0] = new String(cArr5);
                return;
            }
            cancelVar.component1 = iArr.length;
            char[] cArr6 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i12 = $10 + 7;
                $11 = i12 % 128;
                if (i12 % 2 == 0) {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 << 1) % cancelVar.component3] >> i] - iIntValue);
                } else {
                    cArr6[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                }
                cancelVar.component3++;
                int i13 = $11 + 85;
                $10 = i13 % 128;
                int i14 = i13 % 2;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x1183 A[PHI: r11
  0x1183: PHI (r11v176 java.lang.Object) = (r11v173 java.lang.Object), (r11v177 java.lang.Object) binds: [B:182:0x1181, B:179:0x117a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x11fc  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1244  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x018b  */
    /* JADX WARN: Type inference failed for: r1v376, types: [boolean, int] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 9186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.onCreate(android.os.Bundle):void");
    }

    @Override
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 119;
        copy = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(27) + 19, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 32, new char[]{44095, 54144, 26911, 24858, 44124, 18261, 16429, 56456, 65242, 13518, 4779, 28987, 2383, 59984, 42803, 915, 23516, 24513, 18859, 54291, 58960, 3406}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = copy + 113;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            int i5 = getRequestBeneficiariesState + 49;
            copy = i5 % 128;
            int i6 = i5 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = getRequestBeneficiariesState + 31;
            copy = i7 % 128;
            try {
                if (i7 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(KeyEvent.getDeadChar(0, 0) + 6618, 41 - Process.getGidForName(""), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 6562, 56 - ExpandableListView.getPackedPositionGroup(0L), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (Process.myTid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 42, (char) (AndroidCharacter.getMirror('0') - '0'), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(320115330);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6563 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 57, (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), -699576857, false, "component2", new Class[]{Context.class});
                }
                ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i8 = getRequestBeneficiariesState + 79;
        copy = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 123;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).length() + 126, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952747_res_0x7f13046b).substring(22, 23).codePointAt(0) - 32, new char[]{44095, 54144, 26911, 24858, 44124, 18261, 16429, 56456, 65242, 13518, 4779, 28987, 2383, 59984, 42803, 915, 23516, 24513, 18859, 54291, 58960, 3406}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = copy + 111;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 42, (char) ((-1) - MotionEvent.axisFromString("")), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0') + 6563, 55 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Process.myPid() >> 22), -960739708, false, "component3", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(60:(53:824|32|(3:34|35|(2:37|39)(1:38))(1:39)|76|804|77|(2:766|79)|83|84|756|(5:86|87|(1:89)|90|91)(24:92|93|794|94|95|776|96|(2:792|98)|102|103|759|104|(2:825|106)|110|111|112|(2:780|114)|118|119|120|(1:122)(1:123)|124|(1:126)|127)|128|(4:131|(13:133|(3:135|138|836)|139|(3:141|(3:144|145|142)|837)|146|830|147|(1:149)|150|151|820|152|835)(2:136|(2:138|836)(11:139|(0)|146|830|147|(0)|150|151|820|152|835))|153|129)|834|195|816|196|(1:198)|199|(3:201|(1:203)|204)(14:206|207|802|208|(1:210)|211|212|213|(1:215)|216|(1:218)|219|(1:221)|222)|205|223|(9:226|782|227|(1:229)|230|231|232|770|233)|263|765|264|(1:266)|267|(1:269)|270|271|(4:273|274|(1:276)|277)(7:278|(21:280|281|(2:283|(2:285|(2:287|291)(1:288))(2:289|290))(1:291)|374|819|375|(1:377)|378|(3:380|(1:382)|383)(19:384|385|810|386|(1:388)|389|390|790|391|(1:393)|394|395|396|(1:398)|399|(1:401)|402|(1:404)|405)|406|(4:409|(3:849|411|852)(12:848|412|(3:414|(3:417|418|415)|853)|419|778|420|(1:422)|423|424|763|425|851)|850|407)|847|460|(1:462)|463|(1:465)|466|(3:468|(1:470)|471)(16:473|474|(1:476)|477|(1:479)|480|481|(1:483)|484|814|485|486|(1:488)|489|(1:491)|492)|472|493|(6:495|(1:497)|498|(3:500|(1:502)|503)(14:504|505|(1:507)|508|509|(1:511)|512|757|513|514|(1:516)|517|(1:519)|520)|521|(25:523|827|524|(1:526)|527|(1:529)|530|(3:532|(1:534)|535)(17:536|(2:538|(1:544)(1:543))|(19:546|547|817|548|(1:550)|551|552|808|553|(1:555)|556|557|558|(1:560)|561|(1:563)|564|(1:566)|567)|623|(1:625)|626|(3:628|(1:630)|631)(13:633|774|634|635|(1:637)|638|753|639|640|(1:642)|643|(1:645)|646)|632|647|(6:650|651|(1:653)|654|655|656)|657|(1:659)|660|(3:662|(1:664)|665)(14:667|668|(1:670)|671|672|(1:674)|675|784|676|677|(1:679)|680|(1:682)|683)|666|684|(1:863)(7:687|688|(1:690)|691|692|693|694))|568|(5:571|572|(3:856|574|859)(12:855|575|(3:577|(3:580|581|578)|860)|582|786|583|(1:585)|586|587|772|588|858)|857|569)|854|623|(0)|626|(0)(0)|632|647|(0)|657|(0)|660|(0)(0)|666|684|(0)(0))(10:704|(3:706|(2:709|707)|861)|710|711|(1:713)|714|(1:716)|717|718|719))(10:722|(3:724|(2:727|725)|862)|728|729|(1:731)|732|(1:734)|735|736|737))(1:292)|(18:294|832|295|(1:297)|298|299|822|300|(1:302)|303|304|305|(1:307)|308|(1:310)(1:311)|312|(1:314)|315)(18:374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0))|27|28|745|(1:747)(1:748))|316|(5:319|320|(2:322|840)(11:323|(3:325|(4:328|(3:843|330|846)(4:842|331|332|845)|844|326)|841)|333|812|334|(1:336)|337|338|796|339|839)|340|317)|838|374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0))(1:43)|768|45|(1:47)|48|749|49|(1:51)|52|53|76|804|77|(0)|83|84|756|(0)(0)|128|(1:129)|834|195|816|196|(0)|199|(0)(0)|205|223|(0)|263|765|264|(0)|267|(0)|270|271|(0)(0)|316|(1:317)|838|374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(66:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|755|17|(1:19)|20|21|22|(1:24)|25)(1:29))(0)|30|(53:824|32|(3:34|35|(2:37|39)(1:38))(1:39)|76|804|77|(2:766|79)|83|84|756|(5:86|87|(1:89)|90|91)(24:92|93|794|94|95|776|96|(2:792|98)|102|103|759|104|(2:825|106)|110|111|112|(2:780|114)|118|119|120|(1:122)(1:123)|124|(1:126)|127)|128|(4:131|(13:133|(3:135|138|836)|139|(3:141|(3:144|145|142)|837)|146|830|147|(1:149)|150|151|820|152|835)(2:136|(2:138|836)(11:139|(0)|146|830|147|(0)|150|151|820|152|835))|153|129)|834|195|816|196|(1:198)|199|(3:201|(1:203)|204)(14:206|207|802|208|(1:210)|211|212|213|(1:215)|216|(1:218)|219|(1:221)|222)|205|223|(9:226|782|227|(1:229)|230|231|232|770|233)|263|765|264|(1:266)|267|(1:269)|270|271|(4:273|274|(1:276)|277)(7:278|(21:280|281|(2:283|(2:285|(2:287|291)(1:288))(2:289|290))(1:291)|374|819|375|(1:377)|378|(3:380|(1:382)|383)(19:384|385|810|386|(1:388)|389|390|790|391|(1:393)|394|395|396|(1:398)|399|(1:401)|402|(1:404)|405)|406|(4:409|(3:849|411|852)(12:848|412|(3:414|(3:417|418|415)|853)|419|778|420|(1:422)|423|424|763|425|851)|850|407)|847|460|(1:462)|463|(1:465)|466|(3:468|(1:470)|471)(16:473|474|(1:476)|477|(1:479)|480|481|(1:483)|484|814|485|486|(1:488)|489|(1:491)|492)|472|493|(6:495|(1:497)|498|(3:500|(1:502)|503)(14:504|505|(1:507)|508|509|(1:511)|512|757|513|514|(1:516)|517|(1:519)|520)|521|(25:523|827|524|(1:526)|527|(1:529)|530|(3:532|(1:534)|535)(17:536|(2:538|(1:544)(1:543))|(19:546|547|817|548|(1:550)|551|552|808|553|(1:555)|556|557|558|(1:560)|561|(1:563)|564|(1:566)|567)|623|(1:625)|626|(3:628|(1:630)|631)(13:633|774|634|635|(1:637)|638|753|639|640|(1:642)|643|(1:645)|646)|632|647|(6:650|651|(1:653)|654|655|656)|657|(1:659)|660|(3:662|(1:664)|665)(14:667|668|(1:670)|671|672|(1:674)|675|784|676|677|(1:679)|680|(1:682)|683)|666|684|(1:863)(7:687|688|(1:690)|691|692|693|694))|568|(5:571|572|(3:856|574|859)(12:855|575|(3:577|(3:580|581|578)|860)|582|786|583|(1:585)|586|587|772|588|858)|857|569)|854|623|(0)|626|(0)(0)|632|647|(0)|657|(0)|660|(0)(0)|666|684|(0)(0))(10:704|(3:706|(2:709|707)|861)|710|711|(1:713)|714|(1:716)|717|718|719))(10:722|(3:724|(2:727|725)|862)|728|729|(1:731)|732|(1:734)|735|736|737))(1:292)|(18:294|832|295|(1:297)|298|299|822|300|(1:302)|303|304|305|(1:307)|308|(1:310)(1:311)|312|(1:314)|315)(18:374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0))|27|28|745|(1:747)(1:748))|316|(5:319|320|(2:322|840)(11:323|(3:325|(4:328|(3:843|330|846)(4:842|331|332|845)|844|326)|841)|333|812|334|(1:336)|337|338|796|339|839)|340|317)|838|374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0))(1:43)|44|768|45|(1:47)|48|749|49|(1:51)|52|53|76|804|77|(0)|83|84|756|(0)(0)|128|(1:129)|834|195|816|196|(0)|199|(0)(0)|205|223|(0)|263|765|264|(0)|267|(0)|270|271|(0)(0)|316|(1:317)|838|374|819|375|(0)|378|(0)(0)|406|(1:407)|847|460|(0)|463|(0)|466|(0)(0)|472|493|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x09a5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x09a6, code lost:
    
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x09c3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x09c4, code lost:
    
        r10 = r21;
        r9 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0e4c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0e4d, code lost:
    
        r5 = new java.lang.Object[1];
        b(new byte[]{-98, -97, -106, -107, -104, -97, -107, -103, -106, -103, -106}, null, 128 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0e6b, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0e82, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0e86, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0eb5, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0eb9, code lost:
    
        if (r1 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0ebb, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 6617, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 41, (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1))), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0eeb, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0ef3, code lost:
    
        r7 = new java.lang.Object[]{-425501950, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.graphics.Color.alpha(0) + 6562, android.graphics.ImageFormat.getBitsPerPixel(0) + 57, (char) android.view.KeyEvent.getDeadChar(0, 0));
        r3 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$g;
        r8 = new java.lang.Object[1];
        d(r3[150(0x96, float:2.1E-43)], (short) 136, r3[16], r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x14a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x14aa, code lost:
    
        r5 = new java.lang.Object[1];
        a((((android.content.Context) java.lang.Class.forName(com.alibaba.ariver.kernel.common.utils.ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.safaricom.mpesa.lifestyle.R.integer._2131427364_res_0x7f0b0024) & (-3)) - 1, new char[]{32699, 59100, 44073, 45043, 32648, 29256, 34138, 4646, 11522, 459, 55258, 49067, 55944, 57162, 25169}, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x14e6, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x14fd, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x1501, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x1530, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x1534, code lost:
    
        if (r5 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1536, code lost:
    
        r5 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.text.TextUtils.getOffsetBefore("", 0) + 6618, (-16777174) - android.graphics.Color.rgb(0, 0, 0), (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x1560, code lost:
    
        r5 = ((java.lang.reflect.Method) r5).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x1568, code lost:
    
        r7 = new java.lang.Object[]{-425501950, java.lang.Long.valueOf(r3), r2, null, false};
        r1 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault(android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 6562, 55 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0), (char) android.view.KeyEvent.keyCodeFromString(""));
        r2 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$g;
        r8 = new java.lang.Object[1];
        d(r2[150(0x96, float:2.1E-43)], (short) 136, r2[16], r8);
        r1.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r5, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x19d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x19d2, code lost:
    
        r5 = new java.lang.Object[1];
        b(new byte[]{-102, -104, -107, -96, -103, -104, -107, -98, -107, -96, -98}, null, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, r5);
        r3 = (java.lang.String) r5[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x19ee, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r2);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r2.toString("UTF-8");
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x1a05, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x1a09, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r3);
        r13 = -1;
        r3 = ((long) 1) & ((((long) 0) << 32) | (r13 - ((r13 >> 63) << 32)));
        r13 = 0;
        r3 = r3 | ((((long) 19) << 32) | (r13 - ((r13 >> 63) << 32)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x1a38, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(-589372382);
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x1a3c, code lost:
    
        if (r1 == null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x1a3e, code lost:
    
        r1 = kotlin.ITrustedWebActivityCallbackDefault.copydefault(6619 - (android.os.SystemClock.uptimeMillis() > 0 ? 1 : (android.os.SystemClock.uptimeMillis() == 0 ? 0 : -1)), (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 42, (char) android.text.TextUtils.getOffsetAfter("", 0), 428292935, false, "ShareDataUIState", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x1a69, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x1a71, code lost:
    
        r7 = new java.lang.Object[]{-425501950, java.lang.Long.valueOf(r3), r2, null, false};
        r2 = (java.lang.Class) kotlin.ITrustedWebActivityCallbackDefault.copydefault((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6562, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 57, (char) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) - 1));
        r3 = com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.$$g;
        r8 = new java.lang.Object[1];
        d(r3[150(0x96, float:2.1E-43)], (short) 136, r3[16], r8);
        r2.getMethod((java.lang.String) r8[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08d7 A[Catch: all -> 0x099b, TryCatch #44 {all -> 0x099b, blocks: (B:147:0x08d1, B:149:0x08d7, B:150:0x0900), top: B:830:0x08d1, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a5c A[Catch: all -> 0x0325, TryCatch #3 {all -> 0x0325, blocks: (B:651:0x2b8c, B:653:0x2b92, B:654:0x2bbf, B:688:0x2eb8, B:690:0x2ebe, B:691:0x2ee3, B:668:0x2d00, B:670:0x2d23, B:671:0x2d75, B:617:0x285b, B:619:0x2861, B:620:0x288a, B:711:0x2fb4, B:713:0x2fba, B:714:0x2fe5, B:716:0x301f, B:717:0x3061, B:505:0x20d1, B:507:0x20e6, B:508:0x2117, B:729:0x3128, B:731:0x312e, B:732:0x315e, B:734:0x3198, B:735:0x31db, B:474:0x1c81, B:476:0x1c96, B:477:0x1cca, B:479:0x1cfe, B:480:0x1d72, B:454:0x1a38, B:456:0x1a3e, B:457:0x1a69, B:368:0x1530, B:370:0x1536, B:371:0x1560, B:257:0x0eb5, B:259:0x0ebb, B:260:0x0eeb, B:189:0x0a56, B:191:0x0a5c, B:192:0x0a80, B:70:0x04b1, B:72:0x04b7, B:73:0x04e1, B:17:0x0164, B:19:0x016a, B:20:0x0190, B:22:0x0293, B:24:0x02c4, B:25:0x031f, B:264:0x0f68, B:266:0x0f6e, B:267:0x0fae, B:269:0x0fd5, B:270:0x101a, B:274:0x103d, B:276:0x1043, B:277:0x1083, B:316:0x1354, B:317:0x1358, B:320:0x1368, B:323:0x1382, B:326:0x138e, B:330:0x139d, B:331:0x13a5, B:343:0x1483, B:345:0x1489, B:346:0x148a, B:348:0x148c, B:350:0x1493, B:351:0x1494, B:280:0x1096, B:285:0x10a8, B:294:0x10c4, B:305:0x1234, B:307:0x123a, B:308:0x1281, B:310:0x12ab, B:312:0x12f5, B:314:0x130c, B:315:0x134e, B:353:0x1496, B:355:0x149d, B:356:0x149e, B:358:0x14a0, B:360:0x14a7, B:361:0x14a8, B:289:0x10b4, B:290:0x10bb, B:291:0x10bc, B:196:0x0b03, B:198:0x0b09, B:199:0x0b4b, B:201:0x0b58, B:203:0x0b61, B:204:0x0ba4, B:223:0x0d45, B:231:0x0dad, B:237:0x0e30, B:239:0x0e36, B:240:0x0e37, B:242:0x0e39, B:244:0x0e40, B:245:0x0e41, B:206:0x0bb0, B:213:0x0c36, B:215:0x0c3c, B:216:0x0c77, B:218:0x0ca1, B:219:0x0ce3, B:221:0x0cf9, B:222:0x0d3d, B:247:0x0e43, B:249:0x0e4a, B:250:0x0e4b, B:375:0x15df, B:377:0x15e5, B:378:0x1620, B:380:0x162d, B:382:0x1636, B:383:0x167c, B:406:0x1896, B:407:0x189a, B:409:0x18a0, B:412:0x18b8, B:415:0x18c5, B:417:0x18c8, B:429:0x19ab, B:431:0x19b1, B:432:0x19b2, B:434:0x19b4, B:436:0x19bb, B:437:0x19bc, B:384:0x1687, B:396:0x177c, B:398:0x1782, B:399:0x17c7, B:401:0x17f1, B:402:0x1833, B:404:0x1849, B:405:0x1890, B:439:0x19be, B:441:0x19c5, B:442:0x19c6, B:444:0x19c8, B:446:0x19cf, B:447:0x19d0, B:32:0x0338, B:35:0x0346, B:56:0x0423, B:58:0x0429, B:59:0x042a, B:61:0x042c, B:63:0x0433, B:64:0x0434, B:39:0x0352, B:524:0x232d, B:526:0x2333, B:527:0x236e, B:529:0x2395, B:530:0x23da, B:532:0x23f0, B:534:0x23f9, B:535:0x243d, B:568:0x2688, B:569:0x268c, B:572:0x269c, B:575:0x26b3, B:578:0x26ca, B:580:0x26cd, B:592:0x27b3, B:594:0x27b9, B:595:0x27ba, B:597:0x27bc, B:599:0x27c3, B:600:0x27c4, B:538:0x244c, B:540:0x2450, B:544:0x245c, B:546:0x2462, B:558:0x2572, B:560:0x2578, B:561:0x25b9, B:563:0x25e3, B:564:0x2629, B:566:0x263f, B:567:0x2682, B:602:0x27c6, B:604:0x27cd, B:605:0x27ce, B:607:0x27d0, B:609:0x27d7, B:610:0x27d8), top: B:755:0x0164, inners: #9, #35, #37, #40, #42 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0b09 A[Catch: all -> 0x0e4c, TryCatch #35 {all -> 0x0e4c, blocks: (B:196:0x0b03, B:198:0x0b09, B:199:0x0b4b, B:201:0x0b58, B:203:0x0b61, B:204:0x0ba4, B:223:0x0d45, B:231:0x0dad, B:237:0x0e30, B:239:0x0e36, B:240:0x0e37, B:242:0x0e39, B:244:0x0e40, B:245:0x0e41, B:206:0x0bb0, B:213:0x0c36, B:215:0x0c3c, B:216:0x0c77, B:218:0x0ca1, B:219:0x0ce3, B:221:0x0cf9, B:222:0x0d3d, B:247:0x0e43, B:249:0x0e4a, B:250:0x0e4b, B:233:0x0db3, B:227:0x0d79, B:229:0x0d7f, B:230:0x0da6, B:208:0x0bd0, B:210:0x0be2, B:211:0x0c2a), top: B:816:0x0b03, outer: #3, inners: #12, #18, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b58 A[Catch: all -> 0x0e4c, TryCatch #35 {all -> 0x0e4c, blocks: (B:196:0x0b03, B:198:0x0b09, B:199:0x0b4b, B:201:0x0b58, B:203:0x0b61, B:204:0x0ba4, B:223:0x0d45, B:231:0x0dad, B:237:0x0e30, B:239:0x0e36, B:240:0x0e37, B:242:0x0e39, B:244:0x0e40, B:245:0x0e41, B:206:0x0bb0, B:213:0x0c36, B:215:0x0c3c, B:216:0x0c77, B:218:0x0ca1, B:219:0x0ce3, B:221:0x0cf9, B:222:0x0d3d, B:247:0x0e43, B:249:0x0e4a, B:250:0x0e4b, B:233:0x0db3, B:227:0x0d79, B:229:0x0d7f, B:230:0x0da6, B:208:0x0bd0, B:210:0x0be2, B:211:0x0c2a), top: B:816:0x0b03, outer: #3, inners: #12, #18, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0bb0 A[Catch: all -> 0x0e4c, TRY_LEAVE, TryCatch #35 {all -> 0x0e4c, blocks: (B:196:0x0b03, B:198:0x0b09, B:199:0x0b4b, B:201:0x0b58, B:203:0x0b61, B:204:0x0ba4, B:223:0x0d45, B:231:0x0dad, B:237:0x0e30, B:239:0x0e36, B:240:0x0e37, B:242:0x0e39, B:244:0x0e40, B:245:0x0e41, B:206:0x0bb0, B:213:0x0c36, B:215:0x0c3c, B:216:0x0c77, B:218:0x0ca1, B:219:0x0ce3, B:221:0x0cf9, B:222:0x0d3d, B:247:0x0e43, B:249:0x0e4a, B:250:0x0e4b, B:233:0x0db3, B:227:0x0d79, B:229:0x0d7f, B:230:0x0da6, B:208:0x0bd0, B:210:0x0be2, B:211:0x0c2a), top: B:816:0x0b03, outer: #3, inners: #12, #18, #28 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0f6e A[Catch: all -> 0x14a9, TryCatch #9 {all -> 0x14a9, blocks: (B:264:0x0f68, B:266:0x0f6e, B:267:0x0fae, B:269:0x0fd5, B:270:0x101a, B:274:0x103d, B:276:0x1043, B:277:0x1083, B:316:0x1354, B:317:0x1358, B:320:0x1368, B:323:0x1382, B:326:0x138e, B:330:0x139d, B:331:0x13a5, B:343:0x1483, B:345:0x1489, B:346:0x148a, B:348:0x148c, B:350:0x1493, B:351:0x1494, B:280:0x1096, B:285:0x10a8, B:294:0x10c4, B:305:0x1234, B:307:0x123a, B:308:0x1281, B:310:0x12ab, B:312:0x12f5, B:314:0x130c, B:315:0x134e, B:353:0x1496, B:355:0x149d, B:356:0x149e, B:358:0x14a0, B:360:0x14a7, B:361:0x14a8, B:289:0x10b4, B:290:0x10bb, B:291:0x10bc, B:339:0x1408, B:334:0x13d2, B:336:0x13d8, B:337:0x1400, B:300:0x1185, B:302:0x11a9, B:303:0x1228, B:295:0x113c, B:297:0x1150, B:298:0x117e), top: B:765:0x0f68, outer: #3, inners: #25, #33, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0fd5 A[Catch: all -> 0x14a9, TryCatch #9 {all -> 0x14a9, blocks: (B:264:0x0f68, B:266:0x0f6e, B:267:0x0fae, B:269:0x0fd5, B:270:0x101a, B:274:0x103d, B:276:0x1043, B:277:0x1083, B:316:0x1354, B:317:0x1358, B:320:0x1368, B:323:0x1382, B:326:0x138e, B:330:0x139d, B:331:0x13a5, B:343:0x1483, B:345:0x1489, B:346:0x148a, B:348:0x148c, B:350:0x1493, B:351:0x1494, B:280:0x1096, B:285:0x10a8, B:294:0x10c4, B:305:0x1234, B:307:0x123a, B:308:0x1281, B:310:0x12ab, B:312:0x12f5, B:314:0x130c, B:315:0x134e, B:353:0x1496, B:355:0x149d, B:356:0x149e, B:358:0x14a0, B:360:0x14a7, B:361:0x14a8, B:289:0x10b4, B:290:0x10bb, B:291:0x10bc, B:339:0x1408, B:334:0x13d2, B:336:0x13d8, B:337:0x1400, B:300:0x1185, B:302:0x11a9, B:303:0x1228, B:295:0x113c, B:297:0x1150, B:298:0x117e), top: B:765:0x0f68, outer: #3, inners: #25, #33, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1030  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x135e  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x15e5 A[Catch: all -> 0x19d1, TryCatch #37 {all -> 0x19d1, blocks: (B:375:0x15df, B:377:0x15e5, B:378:0x1620, B:380:0x162d, B:382:0x1636, B:383:0x167c, B:406:0x1896, B:407:0x189a, B:409:0x18a0, B:412:0x18b8, B:415:0x18c5, B:417:0x18c8, B:429:0x19ab, B:431:0x19b1, B:432:0x19b2, B:434:0x19b4, B:436:0x19bb, B:437:0x19bc, B:384:0x1687, B:396:0x177c, B:398:0x1782, B:399:0x17c7, B:401:0x17f1, B:402:0x1833, B:404:0x1849, B:405:0x1890, B:439:0x19be, B:441:0x19c5, B:442:0x19c6, B:444:0x19c8, B:446:0x19cf, B:447:0x19d0, B:425:0x192e, B:420:0x18f4, B:422:0x18fa, B:423:0x1926, B:391:0x16f2, B:393:0x1707, B:394:0x1770, B:386:0x16a7, B:388:0x16bc, B:389:0x16eb), top: B:819:0x15df, outer: #3, inners: #8, #16, #22, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x162d A[Catch: all -> 0x19d1, TryCatch #37 {all -> 0x19d1, blocks: (B:375:0x15df, B:377:0x15e5, B:378:0x1620, B:380:0x162d, B:382:0x1636, B:383:0x167c, B:406:0x1896, B:407:0x189a, B:409:0x18a0, B:412:0x18b8, B:415:0x18c5, B:417:0x18c8, B:429:0x19ab, B:431:0x19b1, B:432:0x19b2, B:434:0x19b4, B:436:0x19bb, B:437:0x19bc, B:384:0x1687, B:396:0x177c, B:398:0x1782, B:399:0x17c7, B:401:0x17f1, B:402:0x1833, B:404:0x1849, B:405:0x1890, B:439:0x19be, B:441:0x19c5, B:442:0x19c6, B:444:0x19c8, B:446:0x19cf, B:447:0x19d0, B:425:0x192e, B:420:0x18f4, B:422:0x18fa, B:423:0x1926, B:391:0x16f2, B:393:0x1707, B:394:0x1770, B:386:0x16a7, B:388:0x16bc, B:389:0x16eb), top: B:819:0x15df, outer: #3, inners: #8, #16, #22, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x1687 A[Catch: all -> 0x19d1, TRY_LEAVE, TryCatch #37 {all -> 0x19d1, blocks: (B:375:0x15df, B:377:0x15e5, B:378:0x1620, B:380:0x162d, B:382:0x1636, B:383:0x167c, B:406:0x1896, B:407:0x189a, B:409:0x18a0, B:412:0x18b8, B:415:0x18c5, B:417:0x18c8, B:429:0x19ab, B:431:0x19b1, B:432:0x19b2, B:434:0x19b4, B:436:0x19bb, B:437:0x19bc, B:384:0x1687, B:396:0x177c, B:398:0x1782, B:399:0x17c7, B:401:0x17f1, B:402:0x1833, B:404:0x1849, B:405:0x1890, B:439:0x19be, B:441:0x19c5, B:442:0x19c6, B:444:0x19c8, B:446:0x19cf, B:447:0x19d0, B:425:0x192e, B:420:0x18f4, B:422:0x18fa, B:423:0x1926, B:391:0x16f2, B:393:0x1707, B:394:0x1770, B:386:0x16a7, B:388:0x16bc, B:389:0x16eb), top: B:819:0x15df, outer: #3, inners: #8, #16, #22, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x18a0 A[Catch: all -> 0x19d1, TryCatch #37 {all -> 0x19d1, blocks: (B:375:0x15df, B:377:0x15e5, B:378:0x1620, B:380:0x162d, B:382:0x1636, B:383:0x167c, B:406:0x1896, B:407:0x189a, B:409:0x18a0, B:412:0x18b8, B:415:0x18c5, B:417:0x18c8, B:429:0x19ab, B:431:0x19b1, B:432:0x19b2, B:434:0x19b4, B:436:0x19bb, B:437:0x19bc, B:384:0x1687, B:396:0x177c, B:398:0x1782, B:399:0x17c7, B:401:0x17f1, B:402:0x1833, B:404:0x1849, B:405:0x1890, B:439:0x19be, B:441:0x19c5, B:442:0x19c6, B:444:0x19c8, B:446:0x19cf, B:447:0x19d0, B:425:0x192e, B:420:0x18f4, B:422:0x18fa, B:423:0x1926, B:391:0x16f2, B:393:0x1707, B:394:0x1770, B:386:0x16a7, B:388:0x16bc, B:389:0x16eb), top: B:819:0x15df, outer: #3, inners: #8, #16, #22, #32 }] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x1af6  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x1b5e  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x1bb3  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x1c63  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1ea0  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x2911  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x295e  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x29b4  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x2b6b  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x2c4a  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x2c91  */
    /* JADX WARN: Removed duplicated region for block: B:667:0x2ce2  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x2e98  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x30f0  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x326a  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x326b  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0567 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:863:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x061b A[Catch: all -> 0x09c3, TRY_ENTER, TRY_LEAVE, TryCatch #29 {all -> 0x09c3, blocks: (B:77:0x0561, B:83:0x05b1, B:92:0x061b), top: B:804:0x0561 }] */
    /* JADX WARN: Type inference failed for: r10v109 */
    /* JADX WARN: Type inference failed for: r10v110 */
    /* JADX WARN: Type inference failed for: r10v111 */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v77 */
    /* JADX WARN: Type inference failed for: r10v78 */
    /* JADX WARN: Type inference failed for: r10v79 */
    /* JADX WARN: Type inference failed for: r10v80 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v67 */
    /* JADX WARN: Type inference failed for: r9v68 */
    /* JADX WARN: Type inference failed for: r9v93 */
    /* JADX WARN: Type inference failed for: r9v94 */
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
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.fixeddata.ui.FixedDataConfirmationActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$C_ZO77SLrUpwhB3CoKRzFrXlgvk(FixedDataConfirmationActivity fixedDataConfirmationActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 3;
        copy = i2 % 128;
        int i3 = i2 % 2;
        pinLauncher$lambda$0(fixedDataConfirmationActivity, activityResult);
        if (i3 != 0) {
            int i4 = 78 / 0;
        }
    }

    static {
        equals = 0;
        component1();
        int i = component4 + 79;
        equals = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copy + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copy + 27;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void component1() {
        component3 = new char[]{30241, 30228, 30242, 30224, 30231, 30233, 30420, 30227, 30262, 30243, 30237, 30229, 30217, 30253, 30230, 30401, 30226, 30220, 30258, 30238, 30409, 30417, 30236, 30412, 30415, 30422, 30419, 30240, 30413, 30418, 30414, 30416, 30408, 30423, 30239, 30221, 30225, 30421};
        component1 = 321287814;
        copydefault = true;
        ShareDataUIState = true;
        component2 = 330291538817890353L;
    }
}
