package com.huawei.digitalpayment.consumer.scheduleui.ui.activity;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.Editable;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huawei.common.exception.BaseException;
import com.huawei.common.util.TimeUtils;
import com.huawei.common.widget.MPTextWatcher;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.common.widget.toast.CommonToast;
import com.huawei.digitalpayment.consumer.baselib.config.AppConfigManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils;
import com.huawei.digitalpayment.consumer.baselib.util.PhoneUtils;
import com.huawei.digitalpayment.consumer.schedule.constants.ScheduleConstants;
import com.huawei.digitalpayment.consumer.schedule.dynamicsView.DynamicsElementBillerView;
import com.huawei.digitalpayment.consumer.schedule.model.local.BillerTypeInfo;
import com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState;
import com.huawei.digitalpayment.consumer.schedule.model.local.SchedulePaymentType;
import com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel;
import com.huawei.digitalpayment.consumer.scheduleui.R;
import com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityCreateAutomaticPaymentBinding;
import com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity;
import com.huawei.digitalpayment.customer.dynamics.DynamicsElementDateView;
import com.huawei.digitalpayment.customer.dynamics.DynamicsElementViewManager;
import com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElement;
import com.huawei.digitalpayment.customer.dynamics.model.DynamicsElementTypeConstants;
import com.huawei.digitalpayment.form.validator.ValidatorManager;
import com.huawei.http.BaseRequestParams;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.cancel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.crypto.signers.PSSSigner;

@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0019\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001b\u001a\u00020\u001cH\u0014J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010 \u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020\u001eH\u0002J\b\u0010$\u001a\u00020\u001eH\u0002J\b\u0010%\u001a\u00020\u001eH\u0002J\b\u0010&\u001a\u00020\u001eH\u0002J\u0016\u0010'\u001a\u00020\u001e2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001a¨\u0006+"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scheduleui/ui/activity/CreateAutomaticPaymentActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/scheduleui/databinding/ScheduleActivityCreateAutomaticPaymentBinding;", "Lcom/huawei/digitalpayment/consumer/schedule/viewmodel/CreateAutomaticPaymentViewModel;", "<init>", "()V", "dynamicsViews", "", "Lcom/huawei/digitalpayment/customer/dynamics/base/BaseDynamicsView;", "schedulePaymentType", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/SchedulePaymentType;", "postParams", "Ljava/util/HashMap;", "", "", "startTime", "showBillerDialog", "", "dynamicsElementBillerView", "Lcom/huawei/digitalpayment/consumer/schedule/dynamicsView/DynamicsElementBillerView;", "identifyPinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "textWatcher", "com/huawei/digitalpayment/consumer/scheduleui/ui/activity/CreateAutomaticPaymentActivity$textWatcher$1", "Lcom/huawei/digitalpayment/consumer/scheduleui/ui/activity/CreateAutomaticPaymentActivity$textWatcher$1;", "getLayoutId", "", "initToolbar", "", "title", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateDynamicsViews", "createSchedule", "updateButton", "addObserve", "updateElements", "elements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;", "ConsumerSchedulePaymentUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class CreateAutomaticPaymentActivity extends Hilt_CreateAutomaticPaymentActivity<ScheduleActivityCreateAutomaticPaymentBinding, CreateAutomaticPaymentViewModel> {
    private DynamicsElementBillerView dynamicsElementBillerView;
    private ActivityResultLauncher<Intent> identifyPinLauncher;
    private SchedulePaymentType schedulePaymentType;
    private boolean showBillerDialog;
    private String startTime;
    private final CreateAutomaticPaymentActivity$textWatcher$1 textWatcher;
    private static final byte[] $$c = {Base64.padSymbol, -49, -70, 93};
    private static final int $$f = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {35, -11, -97, -73, -7, -8, 5, 0, -8, -13, 71, -56, -15, -6, 0, -9, -2, 8, -8, 6, -17, 66, -56, -8, 4, -16, -3, 6, -10, -10, 66, -37, -37, 0, 8, -20, Ascii.SI, -5, -16, Ascii.FS, -19, -15, -4, 8, 62, -35, -36, -4, 2, -23, 6, -11, 40, -39, -6, 1, -10, -15, -1, -6, -2, -2, 6, -12, -9, 63, -15, -1, -6, -2, -2, 6, -12, -9, 62, -9, 62, -71, 10, 1, -5, -20, 8, -16, Ascii.SO, -22, 71, -62, -8, -9, Ascii.FF, -16, 1, 10, -14, 59, PSSSigner.TRAILER_IMPLICIT, -4, 8, -16, Ascii.SO, -22, 2, -6, -4, 66, -59, -9, -6, -11, 19, -4, -13, 4, TarHeader.LF_BLK, -27, -41, -6, -11, 19, -4, -13, 4, Ascii.SO, -16, -13, 3, Ascii.VT, -20, -4, -6, 4, 62, -66, -15, -4, -12, Ascii.DC2, -4, -4, 2, -23, 6, -11};
    private static final int $$h = 209;
    private static final byte[] $$a = {34, -56, Ascii.SUB, -92, -20, -9, -17, -20, -6, -11, -7, -7, 1, -17, -14, 56, -6, -23, Ascii.SUB, -27, -20, -12, 8, -22, -9, 42, -43, -17, 1, -9, -11, -2, -14, 0, -25, 1, -4, -22, Ascii.CAN, -41, Ascii.VT, -27, 7, -20, -6, -11, -7, -7, 1, -17, -14, 59, -20, -12, Ascii.FF, -19, -15, -20, -9, -17, 13, -9, -9, -3, -28, 1, -16, -20, -6, -11, -7, -7, 1, -17, -14, 58, -20, -6, -11, -7, -7, 1, -17, -14, 57, -29, -1, -25, 5, Ascii.EM, -37, -27, Ascii.VT, 4, 4, -18, -41, Ascii.VT, -27, 7, -6, -23, 43, -58, 42, -59, Ascii.CAN, -29, -12, 0, -22, -9, Ascii.VT, -20, -11};
    private static final int $$b = 25;
    private static int copy = 0;
    private static int getRequestBeneficiariesState = 1;
    private static long component3 = -3780477796495014671L;
    private static int component2 = 1386857713;
    private static char copydefault = 2923;
    private static char[] component1 = {30686, 30674, 30678, 30675, 30600, 30615, 30604, 30605, 30606, 30607, 30611, 30684, 30610, 30609, 30608, 30691, 30688, 30612, 30672, 30685, 30689, 30687, 30669, 30690, 30673, 30679, 30677, 30681, 30676, 30668, 30613, 30614, 30601, 30665, 30718, 30595, 30707, 30682, 30683, 30704};
    private static int ShareDataUIState = 321287750;
    private static boolean component4 = true;
    private static boolean equals = true;
    private final List<BaseDynamicsView> dynamicsViews = new ArrayList();
    private final HashMap<String, Object> postParams = new HashMap<>();

    private static String $$i(short s, byte b2, byte b3) {
        int i = 4 - (b3 * 2);
        byte[] bArr = $$c;
        int i2 = s * 4;
        int i3 = 99 - b2;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i3 = i2 + i;
            i++;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i3;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i;
            i3 += bArr[i];
            i = i6 + 1;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 100 - r7
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.$$a
            int r1 = r8 + 4
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-8)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.d(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 74 - r7
            int r8 = r8 * 2
            int r8 = r8 + 99
            int r9 = r9 * 4
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.$$g
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-3)
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.e(short, byte, short, java.lang.Object[]):void");
    }

    public static final DynamicsElementBillerView access$getDynamicsElementBillerView$p(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = copy;
        int i3 = i2 + 65;
        getRequestBeneficiariesState = i3 % 128;
        int i4 = i3 % 2;
        DynamicsElementBillerView dynamicsElementBillerView = createAutomaticPaymentActivity.dynamicsElementBillerView;
        int i5 = i2 + 19;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return dynamicsElementBillerView;
        }
        throw null;
    }

    public static final List access$getDynamicsViews$p(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 105;
        int i3 = i2 % 128;
        copy = i3;
        int i4 = i2 % 2;
        List<BaseDynamicsView> list = createAutomaticPaymentActivity.dynamicsViews;
        int i5 = i3 + 27;
        getRequestBeneficiariesState = i5 % 128;
        if (i5 % 2 != 0) {
            return list;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean access$getShowBillerDialog$p(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState;
        int i3 = i2 + 105;
        copy = i3 % 128;
        int i4 = i3 % 2;
        boolean z = createAutomaticPaymentActivity.showBillerDialog;
        int i5 = i2 + 121;
        copy = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final ViewModel access$getViewModel$p(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 69;
        copy = i2 % 128;
        int i3 = i2 % 2;
        VM vm = createAutomaticPaymentActivity.viewModel;
        int i4 = copy + 85;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    public static final void access$updateButton(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 99;
        copy = i2 % 128;
        int i3 = i2 % 2;
        createAutomaticPaymentActivity.updateButton();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final void access$updateDynamicsViews(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
        int i = 2 % 2;
        int i2 = copy + 9;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        createAutomaticPaymentActivity.updateDynamicsViews();
        if (i3 == 0) {
            int i4 = 55 / 0;
        }
    }

    public static final void access$updateElements(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, List list) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 67;
        copy = i2 % 128;
        int i3 = i2 % 2;
        createAutomaticPaymentActivity.updateElements(list);
        int i4 = copy + 29;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$textWatcher$1] */
    public CreateAutomaticPaymentActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
            private static int ShareDataUIState = 0;
            private static int component3 = 1;

            @Override
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = component3 + 95;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                CreateAutomaticPaymentActivity.m10976$r8$lambda$JccGLB51Ps83i4QoIJAxD5zyL4(this.f$0, (ActivityResult) obj);
                if (i3 != 0) {
                    int i4 = 6 / 0;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.identifyPinLauncher = activityResultLauncherRegisterForActivityResult;
        this.textWatcher = new MPTextWatcher() {
            private static int component2 = 1;
            private static int copydefault;

            @Override
            public void afterTextChanged(Editable s) {
                int i = 2 % 2;
                int i2 = component2 + 81;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    super.afterTextChanged(s);
                    CreateAutomaticPaymentActivity.access$updateButton(this.component1);
                    int i3 = 34 / 0;
                } else {
                    super.afterTextChanged(s);
                    CreateAutomaticPaymentActivity.access$updateButton(this.component1);
                }
                int i4 = component2 + 19;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
            }
        };
    }

    private static final void identifyPinLauncher$lambda$0(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createAutomaticPaymentActivity, "");
        if (activityResult != null) {
            int i2 = getRequestBeneficiariesState + 117;
            copy = i2 % 128;
            int i3 = i2 % 2;
            if (activityResult.getResultCode() != -1 || activityResult.getData() == null) {
                return;
            }
            int i4 = copy + 69;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
            HashMap<String, Object> map = createAutomaticPaymentActivity.postParams;
            Intent data = activityResult.getData();
            Intrinsics.checkNotNull(data);
            map.put("initiatorPin", data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN));
            ((CreateAutomaticPaymentViewModel) createAutomaticPaymentActivity.viewModel).createSchedule(createAutomaticPaymentActivity.postParams);
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copy + 121;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.schedule_activity_create_automatic_payment;
        int i5 = getRequestBeneficiariesState + 37;
        copy = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = copy + 111;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.schedule_payment_create_title1));
        int i4 = getRequestBeneficiariesState + 99;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void b(char c2, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i3 = $11 + 63;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    byte b3 = b2;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(4037 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, (char) (AndroidCharacter.getMirror('0') + 19133), 1912513118, false, $$i(b2, b3, b3), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {iNotificationSideChannel};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 7567, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 2006389106, false, "e", new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                        if (objCopydefault3 == null) {
                            byte b4 = (byte) 0;
                            byte b5 = (byte) (b4 + 1);
                            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getJumpTapTimeout() >> 16), 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) Color.alpha(0), 931716605, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objCopydefault3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                            if (objCopydefault4 == null) {
                                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7566 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 11 - Color.argb(0, 0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = iNotificationSideChannel.component3;
                            cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr[iNotificationSideChannel.copydefault] ^ cArr4[iIntValue2])) ^ (component3 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                            iNotificationSideChannel.copydefault++;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 5;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        objArr[0] = str;
    }

    private static void c(byte[] bArr, char[] cArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        cancel cancelVar = new cancel();
        char[] cArr2 = component1;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(1496633684);
                    if (objCopydefault == null) {
                        char c2 = (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1);
                        byte b2 = (byte) 0;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 3760, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), c2, -1670574543, false, $$i(b2, (byte) (b2 | Ascii.US), b2), new Class[]{Integer.TYPE});
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
        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1645108956);
        if (objCopydefault2 == null) {
            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(7139 - ImageFormat.getBitsPerPixel(0), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 12, (char) Color.green(0), 1487437377, false, "C", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
        int i5 = 689978476;
        if (equals) {
            cancelVar.component1 = bArr.length;
            char[] cArr4 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                cArr4[cancelVar.component3] = (char) (cArr2[bArr[(cancelVar.component1 - 1) - cancelVar.component3] + i] - iIntValue);
                Object[] objArr4 = {cancelVar, cancelVar};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(i5);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2747, Color.red(0) + 19, (char) (7645 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), -327556343, false, $$i(b3, (byte) (b3 | Ascii.SUB), b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                i5 = 689978476;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!component4) {
            cancelVar.component1 = iArr.length;
            char[] cArr5 = new char[cancelVar.component1];
            cancelVar.component3 = 0;
            while (cancelVar.component3 < cancelVar.component1) {
                int i6 = $11 + 29;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] / i] / iIntValue);
                    i2 = cancelVar.component3 >>> 1;
                } else {
                    cArr5[cancelVar.component3] = (char) (cArr2[iArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                    i2 = cancelVar.component3 + 1;
                }
                cancelVar.component3 = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        cancelVar.component1 = cArr.length;
        char[] cArr6 = new char[cancelVar.component1];
        cancelVar.component3 = 0;
        while (cancelVar.component3 < cancelVar.component1) {
            int i7 = $11 + 13;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 / 0) / cancelVar.component3] >>> i] / iIntValue);
                Object[] objArr5 = {cancelVar, cancelVar};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault4 == null) {
                    byte b4 = (byte) 0;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getEdgeSlop() >> 16) + 2748, (ViewConfiguration.getJumpTapTimeout() >> 16) + 19, (char) (7644 - Color.blue(0)), -327556343, false, $$i(b4, (byte) (b4 | Ascii.SUB), b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault4).invoke(null, objArr5);
            } else {
                cArr6[cancelVar.component3] = (char) (cArr2[cArr[(cancelVar.component1 - 1) - cancelVar.component3] - i] - iIntValue);
                Object[] objArr6 = {cancelVar, cancelVar};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(689978476);
                if (objCopydefault5 == null) {
                    byte b5 = (byte) 0;
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Gravity.getAbsoluteGravity(0, 0) + 2748, TextUtils.getCapsMode("", 0, 0) + 19, (char) (7644 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), -327556343, false, $$i(b5, (byte) (b5 | Ascii.SUB), b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {209}, m = "invokeSuspend", n = {}, s = {})
    static final class copydefault extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 1;
        private static int copydefault;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 0;
            private static int copydefault = 1;
            final CreateAutomaticPaymentActivity component2;
            int component3;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "loading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component3 = 1;
                int ShareDataUIState;
                boolean component2;
                final CreateAutomaticPaymentActivity copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component3 + 77;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    if (this.component2) {
                        int i4 = component3 + 101;
                        component1 = i4 % 128;
                        int i5 = i4 % 2;
                        DialogManager.showLoading(this.copydefault);
                    } else {
                        DialogManager.hideLoading(this.copydefault);
                        int i6 = component1 + 33;
                        component3 = i6 % 128;
                        int i7 = i6 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.copydefault = createAutomaticPaymentActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.copydefault, continuation);
                    anonymousClass5.component2 = ((Boolean) obj).booleanValue();
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = component1 + 45;
                    component3 = i2 % 128;
                    if (i2 % 2 == 0) {
                        int i3 = 37 / 0;
                    }
                    return anonymousClass52;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 17;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    boolean zBooleanValue = bool.booleanValue();
                    if (i3 == 0) {
                        return component1(zBooleanValue, continuation);
                    }
                    component1(zBooleanValue, continuation);
                    throw null;
                }

                public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 33;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 35;
                    component1 = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 69;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component3;
                if (i4 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CreateAutomaticPaymentUiState> stateFlowUiState = ((CreateAutomaticPaymentViewModel) CreateAutomaticPaymentActivity.access$getViewModel$p(this.component2)).uiState();
                    this.component3 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int ShareDataUIState = 1;
                        private static int component3;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component3 = 1;
                            private static int copydefault;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component1 = 1;
                                private static int component3;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component3 + 1;
                                    component1 = i2 % 128;
                                    int i3 = i2 % 2;
                                    Object obj2 = null;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    AnonymousClass1 anonymousClass1 = this;
                                    if (i3 != 0) {
                                        return anonymousClass2.emit(null, anonymousClass1);
                                    }
                                    anonymousClass2.emit(null, anonymousClass1);
                                    obj2.hashCode();
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    r2 = 1
                                    r1 = r1 ^ r2
                                    if (r1 == 0) goto La
                                    goto L1a
                                La:
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r3 & r4
                                    if (r3 == 0) goto L1a
                                    int r7 = r1.label
                                    int r7 = r7 + r4
                                    r1.label = r7
                                    goto L1f
                                L1a:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L1f:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r4 = r1.label
                                    if (r4 == 0) goto L47
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 63
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                    int r6 = r6 % r0
                                    if (r4 != r2) goto L3f
                                    int r1 = r1 + 57
                                    int r6 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r6
                                    int r1 = r1 % r0
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L6b
                                L3f:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L47:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r4 = r1
                                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                                    com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState) r6
                                    boolean r6 = r6.getLoading()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r1.label = r2
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r3) goto L6b
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 55
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r7
                                    int r6 = r6 % r0
                                    return r3
                                L6b:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r7 = r7 + 55
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L79
                                    return r6
                                L79:
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i5 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            Object obj2 = null;
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i6 = component3 + 45;
                                ShareDataUIState = i6 % 128;
                                if (i6 % 2 != 0) {
                                    return objCollect;
                                }
                                obj2.hashCode();
                                throw null;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i7 = ShareDataUIState + 71;
                            component3 = i7 % 128;
                            if (i7 % 2 == 0) {
                                return unit;
                            }
                            obj2.hashCode();
                            throw null;
                        }
                    }), new AnonymousClass5(this.component2, null)), this) == coroutine_suspended) {
                        int i5 = copydefault + 117;
                        component1 = i5 % 128;
                        int i6 = i5 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i7 = copydefault + 87;
                    component1 = i7 % 128;
                    int i8 = i7 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.component2 = createAutomaticPaymentActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component2, continuation);
                int i2 = component1 + 95;
                copydefault = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass2;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 87;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = component1 + 65;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    return objComponent1;
                }
                throw null;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = copydefault + 111;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 71;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 95;
            copydefault = i2 % 128;
            Object obj2 = null;
            if (i2 % 2 != 0) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                throw null;
            }
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.component1;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CreateAutomaticPaymentActivity.this, Lifecycle.State.STARTED, new AnonymousClass2(CreateAutomaticPaymentActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i4 = copydefault + 5;
                component3 = i4 % 128;
                if (i4 % 2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        copydefault(Continuation<? super copydefault> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            copydefault copydefaultVar = CreateAutomaticPaymentActivity.this.new copydefault(continuation);
            int i2 = copydefault + 107;
            component3 = i2 % 128;
            if (i2 % 2 != 0) {
                return copydefaultVar;
            }
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 31;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component1(coroutineScope2, continuation2);
                throw null;
            }
            Object objComponent1 = component1(coroutineScope2, continuation2);
            int i3 = copydefault + 35;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent1;
        }

        public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 15;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((copydefault) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 113;
            copydefault = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int copydefault = 1;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {236}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component3 = 0;
            private static int copydefault = 1;
            int ShareDataUIState;
            final CreateAutomaticPaymentActivity component1;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "createScheduleSuccess", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int component3 = 0;
                private static int copydefault = 1;
                int ShareDataUIState;
                boolean component1;
                final CreateAutomaticPaymentActivity component2;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = copydefault + 125;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = copydefault + 101;
                    component3 = i4 % 128;
                    int i5 = i4 % 2;
                    ResultKt.throwOnFailure(obj);
                    if (i5 != 0) {
                        throw null;
                    }
                    if (this.component1) {
                        AutomaticPaymentListActivity.INSTANCE.setUpdate(true);
                        CommonToast.show(this.component2.getString(R.string.schedule_payment_create_tips), R.mipmap.base_icon_complete);
                        final CreateAutomaticPaymentActivity createAutomaticPaymentActivity = this.component2;
                        ThreadUtils.runOnUiThreadDelayed(new Runnable() {
                            private static int component1 = 0;
                            private static int component2 = 1;

                            @Override
                            public final void run() throws Throwable {
                                int i6 = 2 % 2;
                                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-608945270);
                                if (objCopydefault == null) {
                                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 67, TextUtils.indexOf("", "", 0) + 33, (char) (TextUtils.indexOf("", "", 0, 0) + 19696), 518907119, false, "component3", null);
                                }
                                int i7 = ((Field) objCopydefault).getInt(null);
                                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-971581653);
                                if (objCopydefault2 == null) {
                                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(36 - TextUtils.lastIndexOf("", '0', 0), 30 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 55511118, false, "component2", null);
                                }
                                int i8 = ((Field) objCopydefault2).getInt(null);
                                long j = i8;
                                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-970658132);
                                if (objCopydefault3 == null) {
                                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(37 - (ViewConfiguration.getJumpTapTimeout() >> 16), 30 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionGroup(0L), 58536393, false, "component3", null);
                                }
                                int i9 = ((Field) objCopydefault3).getInt(null);
                                long j2 = -1;
                                long j3 = j2 ^ 4443179807333259938L;
                                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                long j4 = elapsedCpuTime ^ j2;
                                long j5 = 54;
                                long j6 = ((j2 ^ (-3650476353689055514L)) | 4443179807333259938L) ^ j2;
                                long j7 = (((long) 55) * 4443179807333259938L) + (((long) (-107)) * (-3650476353689055514L)) + (((long) (-108)) * (((j3 | (-3650476353689055514L)) ^ j2) | ((j4 | (-3650476353689055514L)) ^ j2))) + ((((j3 | elapsedCpuTime) ^ j2) | j6 | (j2 ^ (j4 | 4443179807333259938L))) * j5) + (j5 * (elapsedCpuTime | j6));
                                int i10 = 0;
                                long j8 = j;
                                while (true) {
                                    int i11 = 0;
                                    while (i11 != 8) {
                                        int i12 = component1 + 95;
                                        component2 = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            i9 *= ((((int) (j8 << i11)) & 11261) % (i9 - 14)) + (i9 >>> 29);
                                            i11 += 13;
                                        } else {
                                            i9 = (((((int) (j8 >> i11)) & 255) + (i9 << 6)) + (i9 << 16)) - i9;
                                            i11++;
                                        }
                                    }
                                    if (i10 != 0) {
                                        break;
                                    }
                                    i10++;
                                    j8 = j7;
                                }
                                if (i9 != i7) {
                                    int i13 = component2 + 71;
                                    component1 = i13 % 128;
                                    int i14 = i13 % 2;
                                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1820094426);
                                    if (objCopydefault4 == null) {
                                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(67 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 33, (char) (19696 - Color.red(0)), 1457147715, false, "copydefault", null);
                                    }
                                    Object obj2 = ((Field) objCopydefault4).get(null);
                                    long j9 = -1;
                                    long j10 = 0;
                                    long j11 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                                    try {
                                        Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                                        if (objCopydefault5 == null) {
                                            objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(Color.red(0) + 6618, TextUtils.getTrimmedLength("") + 42, (char) ((Process.getThreadPriority(0) + 20) >> 6), 428292935, false, "ShareDataUIState", new Class[0]);
                                        }
                                        Object objInvoke = ((Method) objCopydefault5).invoke(null, null);
                                        Object[] objArr = {374963023, Long.valueOf(j11), obj2, null, false, false};
                                        Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(2019427577);
                                        if (objCopydefault6 == null) {
                                            objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 56, (char) TextUtils.getOffsetBefore("", 0), -1123558500, false, "component1", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                                        }
                                        ((Method) objCopydefault6).invoke(objInvoke, objArr);
                                        int[] iArr = new int[i8];
                                        int i15 = i8 - 1;
                                        iArr[i15] = 1;
                                        Toast.makeText((Context) null, iArr[((i15 * i8) % 2) - 1], 1).show();
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                }
                                CreateAutomaticPaymentActivity.component3.AnonymousClass4.AnonymousClass5.component1(createAutomaticPaymentActivity);
                            }
                        }, 2000L);
                    }
                    return Unit.INSTANCE;
                }

                private static final void copydefault(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
                    int i = 2 % 2;
                    int i2 = copydefault + 69;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    CommonToast.cancel();
                    createAutomaticPaymentActivity.finish();
                    int i4 = component3 + 37;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 86 / 0;
                    }
                }

                public static void component1(CreateAutomaticPaymentActivity createAutomaticPaymentActivity) {
                    int i = 2 % 2;
                    int i2 = component3 + 41;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    copydefault(createAutomaticPaymentActivity);
                    int i4 = copydefault + 73;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component2 = createAutomaticPaymentActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                    anonymousClass5.component1 = ((Boolean) obj).booleanValue();
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = copydefault + 19;
                    component3 = i2 % 128;
                    if (i2 % 2 != 0) {
                        int i3 = 20 / 0;
                    }
                    return anonymousClass52;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 103;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent1 = component1(bool.booleanValue(), continuation);
                    int i4 = component3 + 19;
                    copydefault = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 71 / 0;
                    }
                    return objComponent1;
                }

                public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 1;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    Continuation<Unit> continuationCreate = create(Boolean.valueOf(z), continuation);
                    if (i3 != 0) {
                        ((AnonymousClass5) continuationCreate).invokeSuspend(Unit.INSTANCE);
                        throw null;
                    }
                    Object objInvokeSuspend = ((AnonymousClass5) continuationCreate).invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 29;
                    copydefault = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.ShareDataUIState;
                if (i2 != 0) {
                    int i3 = component3 + 79;
                    copydefault = i3 % 128;
                    int i4 = i3 % 2;
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CreateAutomaticPaymentUiState> stateFlowUiState = ((CreateAutomaticPaymentViewModel) CreateAutomaticPaymentActivity.access$getViewModel$p(this.component1)).uiState();
                    this.ShareDataUIState = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int component2 = 1;
                        private static int copydefault;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component2 = 0;
                            private static int copydefault = 1;
                            final FlowCollector component3;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component3 = 1;
                                private static int copydefault;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    Object objEmit;
                                    int i = 2 % 2;
                                    int i2 = component3 + 55;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 != 0) {
                                        objEmit = anonymousClass2.emit(null, this);
                                        int i4 = 46 / 0;
                                    } else {
                                        objEmit = anonymousClass2.emit(null, this);
                                    }
                                    int i5 = component3 + 81;
                                    copydefault = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        int i6 = 47 / 0;
                                    }
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[PHI: r2
  0x0030: PHI (r2v8 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1) = 
  (r2v7 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1)
  (r2v10 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1)
 binds: [B:10:0x002e, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r1 = r1 + 5
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L47
                                    int r2 = r2 + 35
                                    int r1 = r2 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r1
                                    int r2 = r2 % r0
                                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                                    if (r2 == 0) goto L28
                                    r2 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1 r2 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                                    int r3 = r2.label
                                    r3 = r3 & r1
                                    r4 = 16
                                    int r4 = r4 / 0
                                    if (r3 == 0) goto L47
                                    goto L30
                                L28:
                                    r2 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1 r2 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r2
                                    int r3 = r2.label
                                    r3 = r3 & r1
                                    if (r3 == 0) goto L47
                                L30:
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + 65
                                    int r3 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2 = r3
                                    int r7 = r7 % r0
                                    if (r7 == 0) goto L41
                                    int r7 = r2.label
                                    int r7 = r7 * r1
                                    r2.label = r7
                                    goto L4c
                                L41:
                                    int r7 = r2.label
                                    int r7 = r7 + r1
                                    r2.label = r7
                                    goto L4c
                                L47:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1 r2 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r2.<init>(r7)
                                L4c:
                                    java.lang.Object r7 = r2.result
                                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r2.label
                                    r4 = 1
                                    if (r3 == 0) goto L75
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r1 = r6 + 123
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    if (r3 != r4) goto L6d
                                    int r6 = r6 + 89
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                    int r6 = r6 % r0
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L99
                                L6d:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L75:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                                    r3 = r2
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState) r6
                                    boolean r6 = r6.getCreateScheduleSuccess()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r2.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r2)
                                    if (r6 != r1) goto L99
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component2
                                    int r6 = r6 + 29
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r7
                                    int r6 = r6 % r0
                                    return r1
                                L99:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component3 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i5 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i6 = component2 + 75;
                                copydefault = i6 % 128;
                                int i7 = i6 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i8 = component2 + 65;
                            copydefault = i8 % 128;
                            if (i8 % 2 == 0) {
                                return unit;
                            }
                            throw null;
                        }
                    }), new AnonymousClass5(this.component1, null)), this) == coroutine_suspended) {
                        int i5 = component3 + 119;
                        copydefault = i5 % 128;
                        if (i5 % 2 == 0) {
                            int i6 = 48 / 0;
                        }
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i7 = copydefault + 55;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component1 = createAutomaticPaymentActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component1, continuation);
                int i2 = component3 + 95;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 29;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent1 = component1(coroutineScope, continuation);
                int i4 = copydefault + 75;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 53 / 0;
                }
                return objComponent1;
            }

            public final Object component1(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 39;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 83;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 41 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = copydefault + 1;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CreateAutomaticPaymentActivity.this, Lifecycle.State.STARTED, new AnonymousClass4(CreateAutomaticPaymentActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = ShareDataUIState + 25;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component3(Continuation<? super component3> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component3 component3Var = CreateAutomaticPaymentActivity.this.new component3(continuation);
            int i2 = ShareDataUIState + 11;
            copydefault = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 61 / 0;
            }
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 125;
            copydefault = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                copydefault(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objCopydefault = copydefault(coroutineScope2, continuation2);
            int i3 = copydefault + 49;
            ShareDataUIState = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 8 / 0;
            }
            return objCopydefault;
        }

        public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 19;
            copydefault = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 115;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {242}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component1 = 0;
        private static int component3 = 1;
        int ShareDataUIState;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component1 = 1;
            private static int component3;
            final CreateAutomaticPaymentActivity ShareDataUIState;
            int component2;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 0;
                private static int copydefault = 1;
                final CreateAutomaticPaymentActivity component1;
                int component2;
                Object component3;

                /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        r0 = 2
                        int r1 = r0 % r0
                        int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.copydefault
                        int r1 = r1 + 109
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.ShareDataUIState = r2
                        int r1 = r1 % r0
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r5.component2
                        if (r1 != 0) goto L68
                        int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.ShareDataUIState
                        int r1 = r1 + 93
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.copydefault = r2
                        int r1 = r1 % r0
                        r2 = 0
                        kotlin.ResultKt.throwOnFailure(r6)
                        java.lang.Object r6 = r5.component3
                        com.huawei.common.exception.BaseException r6 = (com.huawei.common.exception.BaseException) r6
                        if (r1 != 0) goto L2b
                        r1 = 7
                        int r1 = r1 / r2
                        if (r6 == 0) goto L65
                        goto L2d
                    L2b:
                        if (r6 == 0) goto L65
                    L2d:
                        java.lang.String r1 = r6.getMessage()
                        java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                        if (r1 == 0) goto L65
                        int r3 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.copydefault
                        int r3 = r3 + 21
                        int r4 = r3 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.ShareDataUIState = r4
                        int r3 = r3 % r0
                        if (r3 == 0) goto L4a
                        int r0 = r1.length()
                        r1 = 89
                        int r1 = r1 / r2
                        if (r0 != 0) goto L51
                        goto L65
                    L4a:
                        int r0 = r1.length()
                        if (r0 != 0) goto L51
                        goto L65
                    L51:
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity r0 = r5.component1
                        androidx.lifecycle.ViewModel r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.access$getViewModel$p(r0)
                        com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel r0 = (com.huawei.digitalpayment.consumer.schedule.viewmodel.CreateAutomaticPaymentViewModel) r0
                        r0.showError()
                        java.lang.String r6 = r6.getMessage()
                        java.lang.Object[] r0 = new java.lang.Object[r2]
                        com.huawei.common.util.ToastUtils.showLong(r6, r0)
                    L65:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    L68:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.component1.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.component1 = createAutomaticPaymentActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                    anonymousClass3.component3 = obj;
                    AnonymousClass3 anonymousClass32 = anonymousClass3;
                    int i2 = ShareDataUIState + 43;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass32;
                }

                public final Object component2(BaseException baseException, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 71;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object obj = null;
                    AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(baseException, continuation);
                    Unit unit = Unit.INSTANCE;
                    if (i3 == 0) {
                        anonymousClass3.invokeSuspend(unit);
                        obj.hashCode();
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass3.invokeSuspend(unit);
                    int i4 = copydefault + 59;
                    ShareDataUIState = i4 % 128;
                    if (i4 % 2 == 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }

                @Override
                public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 81;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent2 = component2(baseException, continuation);
                    if (i3 == 0) {
                        int i4 = 66 / 0;
                    }
                    return objComponent2;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component2;
                Object obj2 = null;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CreateAutomaticPaymentUiState> stateFlowUiState = ((CreateAutomaticPaymentViewModel) CreateAutomaticPaymentActivity.access$getViewModel$p(this.ShareDataUIState)).uiState();
                    this.component2 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<BaseException>() {
                        private static int component1 = 1;
                        private static int component3;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int ShareDataUIState = 0;
                            private static int component1 = 1;
                            final FlowCollector component3;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component3 = 0;
                                private static int copydefault = 1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component3 + 1;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 != 0) {
                                        return anonymousClass2.emit(null, this);
                                    }
                                    int i4 = 95 / 0;
                                    return anonymousClass2.emit(null, this);
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    r2 = 1
                                    if (r1 == r2) goto L9
                                    goto L33
                                L9:
                                    int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r1 = r1 + 43
                                    int r3 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r3
                                    int r1 = r1 % r0
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r3 = r3 & r4
                                    if (r3 == 0) goto L33
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r7 = r7 + 5
                                    int r3 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r3
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L2d
                                    int r7 = r1.label
                                    int r7 = r7 * r4
                                    r1.label = r7
                                    goto L38
                                L2d:
                                    int r7 = r1.label
                                    int r7 = r7 + r4
                                    r1.label = r7
                                    goto L38
                                L33:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L38:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    if (r3 == 0) goto L50
                                    if (r3 != r2) goto L48
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L67
                                L48:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L50:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component3
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState) r6
                                    com.huawei.common.exception.BaseException r6 = r6.getException()
                                    r1.label = r2
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r0) goto L67
                                    return r0
                                L67:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component3 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super BaseException> flowCollector, Continuation continuation) {
                            int i3 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Unit unit = Unit.INSTANCE;
                                int i4 = component1 + 9;
                                component3 = i4 % 128;
                                int i5 = i4 % 2;
                                return unit;
                            }
                            int i6 = component3 + 97;
                            component1 = i6 % 128;
                            if (i6 % 2 != 0) {
                                return objCollect;
                            }
                            Object obj3 = null;
                            obj3.hashCode();
                            throw null;
                        }
                    }), new AnonymousClass3(this.ShareDataUIState, null)), this) == coroutine_suspended) {
                        int i3 = component3 + 103;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = component3 + 69;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        obj2.hashCode();
                        throw null;
                    }
                    ResultKt.throwOnFailure(obj);
                    int i6 = component3 + 19;
                    component1 = i6 % 128;
                    if (i6 % 2 == 0) {
                        int i7 = 2 / 2;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.ShareDataUIState = createAutomaticPaymentActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.ShareDataUIState, continuation);
                int i2 = component1 + 109;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass1;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 71;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objComponent3 = component3(coroutineScope, continuation);
                int i4 = component3 + 103;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 117;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component1 + 35;
                component3 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 69;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.ShareDataUIState;
            if (i4 != 0) {
                int i5 = component1 + 21;
                int i6 = i5 % 128;
                component3 = i6;
                int i7 = i5 % 2;
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = i6 + 73;
                component1 = i8 % 128;
                int i9 = i8 % 2;
                ResultKt.throwOnFailure(obj);
                int i10 = component1 + 45;
                component3 = i10 % 128;
                int i11 = i10 % 2;
            } else {
                ResultKt.throwOnFailure(obj);
                this.ShareDataUIState = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CreateAutomaticPaymentActivity.this, Lifecycle.State.STARTED, new AnonymousClass1(CreateAutomaticPaymentActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        component1(Continuation<? super component1> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component1 component1Var = CreateAutomaticPaymentActivity.this.new component1(continuation);
            int i2 = component1 + 83;
            component3 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 1 / 0;
            }
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 53;
            component1 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 != 0) {
                component2(coroutineScope2, continuation2);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object objComponent2 = component2(coroutineScope2, continuation2);
            int i3 = component1 + 113;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 115;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = component3 + 43;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
    static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component2 = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component2 = 1;
            int component1;
            final CreateAutomaticPaymentActivity copydefault;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "elements", "", "Lcom/huawei/digitalpayment/customer/dynamics/model/DynamicsElement;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class C02363 extends SuspendLambda implements Function2<List<? extends DynamicsElement>, Continuation<? super Unit>, Object> {
                private static int component1 = 0;
                private static int component2 = 1;
                int ShareDataUIState;
                Object component3;
                final CreateAutomaticPaymentActivity copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component1 + 99;
                    component2 = i2 % 128;
                    if (i2 % 2 == 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateAutomaticPaymentActivity.access$updateElements(this.copydefault, (List) this.component3);
                    Unit unit = Unit.INSTANCE;
                    int i3 = component2 + 35;
                    component1 = i3 % 128;
                    int i4 = i3 % 2;
                    return unit;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C02363(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super C02363> continuation) {
                    super(2, continuation);
                    this.copydefault = createAutomaticPaymentActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    C02363 c02363 = new C02363(this.copydefault, continuation);
                    c02363.component3 = obj;
                    C02363 c023632 = c02363;
                    int i2 = component2 + 87;
                    component1 = i2 % 128;
                    if (i2 % 2 == 0) {
                        return c023632;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                @Override
                public Object invoke(List<? extends DynamicsElement> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 13;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objCopydefault = copydefault(list, continuation);
                    int i4 = component1 + 73;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return objCopydefault;
                }

                public final Object copydefault(List<DynamicsElement> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 107;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((C02363) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = component1 + 115;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.component1;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CreateAutomaticPaymentUiState> stateFlowUiState = ((CreateAutomaticPaymentViewModel) CreateAutomaticPaymentActivity.access$getViewModel$p(this.copydefault)).uiState();
                    this.component1 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<List<? extends DynamicsElement>>() {
                        private static int component2 = 0;
                        private static int component3 = 1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component1 = 1;
                            private static int component3;
                            final FlowCollector component2;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component3 = 1;
                                private static int copydefault;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component3 + 17;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = component3 + 49;
                                    copydefault = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        int i5 = 68 / 0;
                                    }
                                    return objEmit;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L20
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L20
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r7 = r7 + 33
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r2
                                    int r7 = r7 % r0
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L25
                                L20:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L25:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L4c
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r6 = r6 + 25
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L3e
                                    if (r3 != r4) goto L44
                                    goto L40
                                L3e:
                                    if (r3 != r4) goto L44
                                L40:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L63
                                L44:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L4c:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                                    r0 = r1
                                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                    com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState) r6
                                    java.util.List r6 = r6.getElements()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L63
                                    return r2
                                L63:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$4$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component2 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<? extends DynamicsElement>> flowCollector, Continuation continuation) {
                            int i3 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i4 = component3 + 87;
                                component2 = i4 % 128;
                                int i5 = i4 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i6 = component3 + 89;
                            component2 = i6 % 128;
                            if (i6 % 2 == 0) {
                                return unit;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    }), new C02363(this.copydefault, null)), this) == coroutine_suspended) {
                        int i3 = ShareDataUIState + 37;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = ShareDataUIState + 75;
                    component2 = i5 % 128;
                    if (i5 % 2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        throw null;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i6 = ShareDataUIState + 113;
                component2 = i6 % 128;
                int i7 = i6 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.copydefault = createAutomaticPaymentActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.copydefault, continuation);
                int i2 = ShareDataUIState + 15;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass3;
                }
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 53;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 != 0) {
                    copydefault(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault = copydefault(coroutineScope2, continuation2);
                int i3 = ShareDataUIState + 65;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 111;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component2 + 25;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CreateAutomaticPaymentActivity.this, Lifecycle.State.CREATED, new AnonymousClass3(CreateAutomaticPaymentActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = component2 + 11;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = ShareDataUIState + 117;
            component2 = i5 % 128;
            int i6 = i5 % 2;
            return unit;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = CreateAutomaticPaymentActivity.this.new component2(continuation);
            int i2 = ShareDataUIState + 31;
            component2 = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 55 / 0;
            }
            return component2Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 29;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            Object objComponent2 = component2(coroutineScope, continuation);
            int i4 = ShareDataUIState + 49;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return objComponent2;
        }

        public final Object component2(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component2 + 73;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            component2 component2Var = (component2) create(coroutineScope, continuation);
            if (i3 != 0) {
                component2Var.invokeSuspend(Unit.INSTANCE);
                throw null;
            }
            Object objInvokeSuspend = component2Var.invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 75;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return objInvokeSuspend;
            }
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
    static final class ShareDataUIState extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int component3 = 0;
        private static int copydefault = 1;
        int component1;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {271}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int copydefault;
            final CreateAutomaticPaymentActivity component1;
            int component3;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "billerTypeInfos", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/BillerTypeInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass3 extends SuspendLambda implements Function2<List<? extends BillerTypeInfo>, Continuation<? super Unit>, Object> {
                private static int component2 = 1;
                private static int component3;
                final CreateAutomaticPaymentActivity ShareDataUIState;
                int component1;
                Object copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    int i2 = component3 + 5;
                    component2 = i2 % 128;
                    Object obj2 = null;
                    if (i2 % 2 == 0) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        obj2.hashCode();
                        throw null;
                    }
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.component1 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    List<BillerTypeInfo> list = (List) this.copydefault;
                    DynamicsElementBillerView dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p = CreateAutomaticPaymentActivity.access$getDynamicsElementBillerView$p(this.ShareDataUIState);
                    if (dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p != null) {
                        dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p.setonClickListener(null);
                    }
                    if (CreateAutomaticPaymentActivity.access$getShowBillerDialog$p(this.ShareDataUIState)) {
                        int i3 = component3 + 73;
                        component2 = i3 % 128;
                        if (i3 % 2 == 0) {
                            CreateAutomaticPaymentActivity.access$getDynamicsElementBillerView$p(this.ShareDataUIState);
                            throw null;
                        }
                        DynamicsElementBillerView dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p2 = CreateAutomaticPaymentActivity.access$getDynamicsElementBillerView$p(this.ShareDataUIState);
                        if (dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p2 != null) {
                            dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p2.showBillerTypeInfos(list);
                        }
                    } else {
                        DynamicsElementBillerView dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p3 = CreateAutomaticPaymentActivity.access$getDynamicsElementBillerView$p(this.ShareDataUIState);
                        if (dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p3 != null) {
                            dynamicsElementBillerViewAccess$getDynamicsElementBillerView$p3.setBillerTypeInfos(list);
                        }
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.ShareDataUIState = createAutomaticPaymentActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.ShareDataUIState, continuation);
                    anonymousClass3.copydefault = obj;
                    AnonymousClass3 anonymousClass32 = anonymousClass3;
                    int i2 = component2 + 15;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass32;
                }

                @Override
                public Object invoke(List<? extends BillerTypeInfo> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component3 + 55;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent3 = component3(list, continuation);
                    int i4 = component2 + 27;
                    component3 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 64 / 0;
                    }
                    return objComponent3;
                }

                public final Object component3(List<BillerTypeInfo> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 119;
                    component3 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(list, continuation);
                    if (i3 != 0) {
                        anonymousClass3.invokeSuspend(Unit.INSTANCE);
                        throw null;
                    }
                    Object objInvokeSuspend = anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    int i4 = component3 + 75;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component3;
                if (i4 != 0) {
                    int i5 = component2;
                    int i6 = i5 + 83;
                    copydefault = i6 % 128;
                    int i7 = i6 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i5 + 99;
                    copydefault = i8 % 128;
                    int i9 = i8 % 2;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CreateAutomaticPaymentUiState> stateFlowUiState = ((CreateAutomaticPaymentViewModel) CreateAutomaticPaymentActivity.access$getViewModel$p(this.component1)).uiState();
                    this.component3 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<List<? extends BillerTypeInfo>>() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component3 = 0;
                            private static int copydefault = 1;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2", f = "CreateAutomaticPaymentActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component2 = 1;
                                private static int component3;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = component3 + 87;
                                    component2 = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object obj2 = null;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = component2 + 19;
                                    component3 = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        return objEmit;
                                    }
                                    obj2.hashCode();
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[PHI: r1
  0x0029: PHI (r1v9 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1) = 
  (r1v8 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1)
  (r1v11 com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1)
 binds: [B:10:0x0027, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
                            @Override
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                                /*
                                    r5 = this;
                                    r0 = 2
                                    int r1 = r0 % r0
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L2f
                                    int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r1 = r1 + 119
                                    int r2 = r1 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r2
                                    int r1 = r1 % r0
                                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                    if (r1 != 0) goto L21
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r3 = r3 & r2
                                    r4 = 9
                                    int r4 = r4 / 0
                                    if (r3 == 0) goto L2f
                                    goto L29
                                L21:
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r3 = r1.label
                                    r3 = r3 & r2
                                    if (r3 == 0) goto L2f
                                L29:
                                    int r7 = r1.label
                                    int r7 = r7 + r2
                                    r1.label = r7
                                    goto L34
                                L2f:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L34:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L4d
                                    if (r3 != r4) goto L45
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L71
                                L45:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L4d:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.CreateAutomaticPaymentUiState) r6
                                    java.util.List r6 = r6.getBillerTypeInfos()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L71
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 107
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r7
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L6f
                                    return r2
                                L6f:
                                    r6 = 0
                                    throw r6
                                L71:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$addObserve$5$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<? extends BillerTypeInfo>> flowCollector, Continuation continuation) {
                            int i10 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i11 = ShareDataUIState + 73;
                                component1 = i11 % 128;
                                int i12 = i11 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i13 = ShareDataUIState + 107;
                            component1 = i13 % 128;
                            int i14 = i13 % 2;
                            return unit;
                        }
                    }), new AnonymousClass3(this.component1, null)), this) == coroutine_suspended) {
                        int i10 = copydefault + 47;
                        component2 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 15 / 0;
                        }
                        return coroutine_suspended;
                    }
                }
                Unit unit = Unit.INSTANCE;
                int i12 = component2 + 11;
                copydefault = i12 % 128;
                if (i12 % 2 == 0) {
                    return unit;
                }
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component1 = createAutomaticPaymentActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component1, continuation);
                int i2 = copydefault + 121;
                component2 = i2 % 128;
                if (i2 % 2 != 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 43;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                if (i3 != 0) {
                    int i4 = 81 / 0;
                }
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 19;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = copydefault + 103;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.component1;
            Object obj2 = null;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component1 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(CreateAutomaticPaymentActivity.this, Lifecycle.State.CREATED, new AnonymousClass4(CreateAutomaticPaymentActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = copydefault + 21;
                component3 = i3 % 128;
                int i4 = i3 % 2;
                ResultKt.throwOnFailure(obj);
            }
            Unit unit = Unit.INSTANCE;
            int i5 = component3 + 47;
            copydefault = i5 % 128;
            if (i5 % 2 != 0) {
                return unit;
            }
            obj2.hashCode();
            throw null;
        }

        ShareDataUIState(Continuation<? super ShareDataUIState> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            ShareDataUIState shareDataUIState = CreateAutomaticPaymentActivity.this.new ShareDataUIState(continuation);
            int i2 = copydefault + 3;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return shareDataUIState;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 121;
            component3 = i2 % 128;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                return component3(coroutineScope2, continuation2);
            }
            component3(coroutineScope2, continuation2);
            throw null;
        }

        public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = copydefault + 19;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((ShareDataUIState) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = copydefault + 5;
            component3 = i4 % 128;
            if (i4 % 2 == 0) {
                return objInvokeSuspend;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static final void onCreate$lambda$1(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) throws Throwable {
        int i = 2 % 2;
        int i2 = copy + 33;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(createAutomaticPaymentActivity, "");
            createAutomaticPaymentActivity.createSchedule();
        } else {
            Intrinsics.checkNotNullParameter(createAutomaticPaymentActivity, "");
            createAutomaticPaymentActivity.createSchedule();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01e9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.onCreate(android.os.Bundle):void");
    }

    private final void updateDynamicsViews() {
        int i = 2 % 2;
        int i2 = copy + 39;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        for (BaseDynamicsView baseDynamicsView : this.dynamicsViews) {
            ValidatorManager validatorManager = ValidatorManager.INSTANCE;
            String commitKey = baseDynamicsView.getCommitKey();
            SchedulePaymentType schedulePaymentType = this.schedulePaymentType;
            if (schedulePaymentType == null) {
                int i4 = copy + 61;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                Intrinsics.throwUninitializedPropertyAccessException("");
                schedulePaymentType = null;
            }
            baseDynamicsView.setValidatorItem(validatorManager.getValidatorItem(commitKey, schedulePaymentType.getTransactionType()));
        }
    }

    private final void createSchedule() throws Throwable {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        copy = i2 % 128;
        SchedulePaymentType schedulePaymentType = null;
        if (i2 % 2 != 0) {
            ((CreateAutomaticPaymentViewModel) this.viewModel).uiState().getValue().getCreateScheduleSuccess();
            throw null;
        }
        if (((CreateAutomaticPaymentViewModel) this.viewModel).uiState().getValue().getCreateScheduleSuccess()) {
            int i3 = getRequestBeneficiariesState + 21;
            copy = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            schedulePaymentType.hashCode();
            throw null;
        }
        this.startTime = null;
        this.postParams.clear();
        this.postParams.put("pinVersion", AppConfigManager.getAppConfig().getPinKeyVersion());
        this.postParams.put("initiatorMsisdn", PhoneUtils.getRecentLoginPhone());
        HashMap<String, Object> map = this.postParams;
        SchedulePaymentType schedulePaymentType2 = this.schedulePaymentType;
        if (schedulePaymentType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            schedulePaymentType2 = null;
        }
        map.put("transactionType", schedulePaymentType2.getTransactionType());
        for (BaseDynamicsView baseDynamicsView : this.dynamicsViews) {
            if (!baseDynamicsView.isLegal()) {
                String errorMessage = baseDynamicsView.getErrorMessage();
                String str = errorMessage;
                if (str == null || str.length() == 0) {
                    return;
                }
                baseDynamicsView.showError(errorMessage);
                return;
            }
            if (Intrinsics.areEqual(baseDynamicsView.getCommitKey(), "firstPaymentReminderDate")) {
                this.startTime = String.valueOf(baseDynamicsView.getCommitValue());
                String time = TimeUtils.formatTime(new Date(), DynamicsElementDateView.INSTANCE.getCOMMIT_DATE_FORMAT());
                String strValueOf = String.valueOf(baseDynamicsView.getCommitValue());
                Intrinsics.checkNotNull(time);
                if (strValueOf.compareTo(time) <= 0) {
                    return;
                }
            }
            if (Intrinsics.areEqual(baseDynamicsView.getCommitKey(), "issuePaymentReminderUntil")) {
                String time2 = TimeUtils.formatTime(new Date(), DynamicsElementDateView.INSTANCE.getCOMMIT_DATE_FORMAT());
                String strValueOf2 = String.valueOf(baseDynamicsView.getCommitValue());
                Intrinsics.checkNotNull(time2);
                if (strValueOf2.compareTo(time2) <= 0) {
                    return;
                }
                if (this.startTime != null) {
                    String strValueOf3 = String.valueOf(baseDynamicsView.getCommitValue());
                    String str2 = this.startTime;
                    Intrinsics.checkNotNull(str2);
                    if (strValueOf3.compareTo(str2) < 0) {
                        int i4 = copy + 95;
                        getRequestBeneficiariesState = i4 % 128;
                        int i5 = i4 % 2;
                        baseDynamicsView.showError(getString(R.string.schedule_payment_create_tips12));
                        return;
                    }
                } else {
                    continue;
                }
            }
            this.postParams.put(baseDynamicsView.getCommitKey(), baseDynamicsView.getCommitValue());
        }
        SchedulePaymentType schedulePaymentType3 = this.schedulePaymentType;
        if (schedulePaymentType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i6 = getRequestBeneficiariesState + 13;
            copy = i6 % 128;
            int i7 = i6 % 2;
            schedulePaymentType3 = null;
        }
        if (Intrinsics.areEqual(schedulePaymentType3.getTransactionType(), ScheduleConstants.SCHEDULE_PAYMENT_TYPE_AIR_TIME)) {
            Object objRemove = this.postParams.remove("receiverMsisdn");
            if (objRemove == null) {
                objRemove = "";
            }
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("key", "RechargedMSISDN");
            jsonObject.addProperty("value", objRemove.toString());
            jsonArray.add(jsonObject);
            this.postParams.put("extraParameter", jsonArray);
        }
        SchedulePaymentType schedulePaymentType4 = this.schedulePaymentType;
        if (schedulePaymentType4 == null) {
            int i8 = copy + 13;
            getRequestBeneficiariesState = i8 % 128;
            if (i8 % 2 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                int i9 = 37 / 0;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        } else {
            schedulePaymentType = schedulePaymentType4;
        }
        if (Intrinsics.areEqual(schedulePaymentType.getTransactionType(), ScheduleConstants.SCHEDULE_PAYMENT_PAY_BILL)) {
            int i10 = copy + 43;
            getRequestBeneficiariesState = i10 % 128;
            int i11 = i10 % 2;
            Object objRemove2 = this.postParams.remove("BillReferenceNumber");
            Object obj = objRemove2 != null ? objRemove2 : "";
            JsonArray jsonArray2 = new JsonArray();
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("key", "BillReferenceNumber");
            jsonObject2.addProperty("value", obj.toString());
            jsonArray2.add(jsonObject2);
            this.postParams.put("extraParameter", jsonArray2);
            this.postParams.put("amount", "1");
        }
        Intent identityPinIntent = IdentityPinUtils.getIdentityPinIntent();
        identityPinIntent.putExtra(KeysConstants.IS_SUPPORT_BIOMETRIC, true);
        this.identifyPinLauncher.launch(identityPinIntent);
    }

    private final void updateButton() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 71;
        copy = i2 % 128;
        int i3 = i2 % 2;
        Iterator<BaseDynamicsView> it = this.dynamicsViews.iterator();
        while (it.hasNext()) {
            int i4 = getRequestBeneficiariesState + 57;
            copy = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 69 / 0;
                if (!it.next().isLegal()) {
                    ((ScheduleActivityCreateAutomaticPaymentBinding) this.binding).btnSubmit.setEnabled(true);
                    return;
                }
            } else if (!it.next().isLegal()) {
                ((ScheduleActivityCreateAutomaticPaymentBinding) this.binding).btnSubmit.setEnabled(true);
                return;
            }
        }
        ((ScheduleActivityCreateAutomaticPaymentBinding) this.binding).btnSubmit.setEnabled(true);
        int i6 = copy + 3;
        getRequestBeneficiariesState = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    private final void addObserve() {
        int i = 2 % 2;
        CreateAutomaticPaymentActivity createAutomaticPaymentActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(createAutomaticPaymentActivity), null, null, new copydefault(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(createAutomaticPaymentActivity), null, null, new component3(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(createAutomaticPaymentActivity), null, null, new component1(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(createAutomaticPaymentActivity), null, null, new component2(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(createAutomaticPaymentActivity), null, null, new ShareDataUIState(null), 3, null);
        int i2 = copy + 89;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void updateElements$lambda$3$lambda$2(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(createAutomaticPaymentActivity, "");
        createAutomaticPaymentActivity.showBillerDialog = true;
        ((CreateAutomaticPaymentViewModel) createAutomaticPaymentActivity.viewModel).queryBillerConfig(new BaseRequestParams());
        int i2 = copy + 101;
        getRequestBeneficiariesState = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void updateElements(List<DynamicsElement> elements) {
        int i = 2 % 2;
        ((ScheduleActivityCreateAutomaticPaymentBinding) this.binding).llContainer.removeAllViews();
        for (DynamicsElement dynamicsElement : elements) {
            int i2 = copy + 75;
            getRequestBeneficiariesState = i2 % 128;
            int i3 = i2 % 2;
            CreateAutomaticPaymentActivity createAutomaticPaymentActivity = this;
            BaseDynamicsView dynamicsElementView = DynamicsElementViewManager.INSTANCE.getDynamicsElementView(Intrinsics.areEqual(dynamicsElement.getElementType(), DynamicsElementTypeConstants.AMOUNT) ? R.layout.schedule_payment_dynamics_element_amount_layout : R.layout.schedule_payment_dynamics_element_layout, createAutomaticPaymentActivity, dynamicsElement);
            if (dynamicsElementView == null) {
                int i4 = copy + 59;
                getRequestBeneficiariesState = i4 % 128;
                int i5 = i4 % 2;
                if (Intrinsics.areEqual(dynamicsElement.getElementType(), "SELECT_BILLER")) {
                    DynamicsElementBillerView dynamicsElementBillerView = new DynamicsElementBillerView(createAutomaticPaymentActivity, dynamicsElement);
                    this.dynamicsElementBillerView = dynamicsElementBillerView;
                    dynamicsElementBillerView.setOnBillerSelectListener(new DynamicsElementBillerView.OnBillerSelectListener() {
                        private static int ShareDataUIState = 0;
                        private static int component1 = 1;

                        /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[PHI: r4
  0x0066: PHI (r4v7 com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView) = 
  (r4v6 com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView)
  (r4v12 com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView)
 binds: [B:15:0x0064, B:12:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public void onBillerSelect() {
                            /*
                                r8 = this;
                                r0 = 2
                                int r1 = r0 % r0
                                int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.ShareDataUIState
                                int r1 = r1 + 63
                                int r2 = r1 % 128
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.component1 = r2
                                int r1 = r1 % r0
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity r1 = r8.copydefault
                                com.huawei.digitalpayment.consumer.schedule.dynamicsView.DynamicsElementBillerView r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.access$getDynamicsElementBillerView$p(r1)
                                r2 = 0
                                if (r1 == 0) goto L23
                                int r3 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.component1
                                int r3 = r3 + 75
                                int r4 = r3 % 128
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.ShareDataUIState = r4
                                int r3 = r3 % r0
                                com.huawei.digitalpayment.consumer.schedule.model.local.BillerTypeInfo r1 = r1.getBillerTypeInfo()
                                goto L24
                            L23:
                                r1 = r2
                            L24:
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity r3 = r8.copydefault
                                java.util.List r3 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.access$getDynamicsViews$p(r3)
                                java.util.Iterator r3 = r3.iterator()
                            L2e:
                                boolean r4 = r3.hasNext()
                                r5 = 1
                                r4 = r4 ^ r5
                                if (r4 == r5) goto La2
                                int r4 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.ShareDataUIState
                                int r4 = r4 + 17
                                int r5 = r4 % 128
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.component1 = r5
                                int r4 = r4 % r0
                                r5 = 0
                                if (r4 != 0) goto L56
                                java.lang.Object r4 = r3.next()
                                com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView r4 = (com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView) r4
                                android.view.View r6 = r4.getRooView()
                                int r6 = r6.getVisibility()
                                r7 = 8
                                int r7 = r7 / r5
                                if (r6 == 0) goto L76
                                goto L66
                            L56:
                                java.lang.Object r4 = r3.next()
                                com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView r4 = (com.huawei.digitalpayment.customer.dynamics.base.BaseDynamicsView) r4
                                android.view.View r6 = r4.getRooView()
                                int r6 = r6.getVisibility()
                                if (r6 == 0) goto L76
                            L66:
                                int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.ShareDataUIState
                                int r6 = r6 + 47
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.component1 = r7
                                int r6 = r6 % r0
                                android.view.View r6 = r4.getRooView()
                                r6.setVisibility(r5)
                            L76:
                                java.lang.String r5 = r4.getCommitKey()
                                java.lang.String r6 = "BillReferenceNumber"
                                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
                                if (r5 == 0) goto L2e
                                android.view.View r4 = r4.getRooView()
                                java.lang.String r5 = ""
                                kotlin.jvm.internal.Intrinsics.checkNotNull(r4, r5)
                                com.huawei.common.widget.input.CommonInputView r4 = (com.huawei.common.widget.input.CommonInputView) r4
                                if (r1 == 0) goto L9d
                                java.lang.String r5 = r1.getReferenceName()
                                int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.ShareDataUIState
                                int r6 = r6 + 125
                                int r7 = r6 % 128
                                com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.component1 = r7
                                int r6 = r6 % r0
                                goto L9e
                            L9d:
                                r5 = r2
                            L9e:
                                r4.setTitle(r5)
                                goto L2e
                            La2:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity$updateElements$1$1.onBillerSelect():void");
                        }
                    });
                    DynamicsElementBillerView dynamicsElementBillerView2 = this.dynamicsElementBillerView;
                    DynamicsElementBillerView dynamicsElementBillerView3 = dynamicsElementBillerView2;
                    if (dynamicsElementBillerView2 != null) {
                        dynamicsElementBillerView2.setonClickListener(new View.OnClickListener() {
                            private static int component1 = 0;
                            private static int copydefault = 1;

                            @Override
                            public final void onClick(View view) {
                                int i6 = 2 % 2;
                                int i7 = copydefault + 7;
                                component1 = i7 % 128;
                                int i8 = i7 % 2;
                                CreateAutomaticPaymentActivity.$r8$lambda$c6Sg382twHAZTu2HDpMHNruNNuQ(this.f$0, view);
                                if (i8 == 0) {
                                    return;
                                }
                                Object obj = null;
                                obj.hashCode();
                                throw null;
                            }
                        });
                    }
                    dynamicsElementView = dynamicsElementBillerView3;
                }
            }
            if (dynamicsElementView != null) {
                SchedulePaymentType schedulePaymentType = this.schedulePaymentType;
                if (schedulePaymentType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    schedulePaymentType = null;
                }
                if (!(!Intrinsics.areEqual(schedulePaymentType.getTransactionType(), ScheduleConstants.SCHEDULE_PAYMENT_PAY_BILL)) && !Intrinsics.areEqual(dynamicsElement.getElementType(), "SELECT_BILLER") && (!Intrinsics.areEqual(dynamicsElement.getKey(), "scheduleName"))) {
                    dynamicsElementView.getRooView().setVisibility(8);
                }
                this.dynamicsViews.add(dynamicsElementView);
                ((ScheduleActivityCreateAutomaticPaymentBinding) this.binding).llContainer.addView(dynamicsElementView.getRooView());
                dynamicsElementView.addTextWatcher(this.textWatcher);
            }
        }
        updateDynamicsViews();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f1  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(12) + 32821), ((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952826_res_0x7f1304ba).substring(7, 8).length() - 1, new char[]{11904, 45005, 11309, 13849, 63990, 11498, 37950, 20394, 56508, 37551, 25744, 15419, 30935, 11934, 22996, 16213, 44014, 33020, 10158, 15210, 24928, 34451, 37155, 25299, 1598, 19740}, new char[]{7014, 9947, 41590, 51072}, new char[]{0, 0, 0, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((char) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(15) + 9921), KeyEvent.getMaxKeyCode() >> 16, new char[]{44032, 37074, 26241, 35839, 57707, 8206, 19170, 40247, 29970, 37567, 41194, 54439, 21149, 11939, 10810, 1904, 46337, 4636}, new char[]{33086, 12723, 12792, 63271}, new char[]{0, 0, 0, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i2 = getRequestBeneficiariesState + 7;
            copy = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - ExpandableListView.getPackedPositionType(0L), (-16777174) - Color.rgb(0, 0, 0), (char) (ViewConfiguration.getTouchSlop() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 6562, ((Process.getThreadPriority(0) + 20) >> 6) + 56, (char) View.MeasureSpec.getSize(0), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault3 == null) {
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(6618 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 42, (char) View.resolveSizeAndState(0, 0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault4 == null) {
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 56 - Color.blue(0), (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -960739708, false, "component3", new Class[]{Context.class});
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
        super.onPause();
        int i3 = copy + 21;
        getRequestBeneficiariesState = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x09ee A[Catch: all -> 0x04f6, TryCatch #43 {all -> 0x04f6, blocks: (B:147:0x09e8, B:149:0x09ee, B:150:0x0a19, B:287:0x1120, B:289:0x1126, B:290:0x1150, B:411:0x16a5, B:413:0x16ab, B:414:0x16d6, B:539:0x1dc0, B:541:0x1dc6, B:542:0x1df5, B:745:0x300b, B:747:0x3011, B:748:0x303c, B:782:0x335c, B:784:0x3362, B:785:0x3386, B:762:0x3191, B:764:0x31b4, B:765:0x320b, B:711:0x2cce, B:713:0x2cd4, B:714:0x2d00, B:805:0x346a, B:807:0x3470, B:808:0x3494, B:810:0x34ce, B:811:0x350f, B:592:0x24ce, B:594:0x24e3, B:595:0x2511, B:823:0x35d2, B:825:0x35d8, B:826:0x35ff, B:828:0x3639, B:829:0x367d, B:560:0x202b, B:562:0x2040, B:563:0x206d, B:565:0x20a1, B:566:0x211c, B:457:0x1908, B:459:0x190e, B:460:0x193c, B:19:0x021b, B:21:0x0221, B:22:0x024a, B:24:0x0465, B:26:0x0497, B:27:0x04f0), top: B:924:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0aac  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0b00 A[Catch: all -> 0x1092, PHI: r1 r4
  0x0b00: PHI (r1v439 java.lang.Object) = (r1v438 java.lang.Object), (r1v486 java.lang.Object) binds: [B:155:0x0aaa, B:157:0x0aad] A[DONT_GENERATE, DONT_INLINE]
  0x0b00: PHI (r4v475 ??) = (r4v544 ??), (r4v545 ??) binds: [B:155:0x0aaa, B:157:0x0aad] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #60 {all -> 0x1092, blocks: (B:154:0x0aa6, B:162:0x0b00, B:165:0x0b70, B:185:0x0c02), top: B:954:0x0aa6 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b27 A[Catch: all -> 0x0af7, TRY_ENTER, TRY_LEAVE, TryCatch #44 {all -> 0x0af7, blocks: (B:157:0x0aad, B:164:0x0b27, B:169:0x0b89, B:171:0x0b8f, B:172:0x0bd8, B:175:0x0bea, B:177:0x0bee, B:181:0x0bfa), top: B:925:0x0aad }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b86  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0f38 A[Catch: all -> 0x106f, TryCatch #38 {all -> 0x106f, blocks: (B:220:0x0f2e, B:221:0x0f32, B:223:0x0f38, B:226:0x0f53, B:189:0x0c2e, B:207:0x0dff, B:210:0x0e52, B:215:0x0ec6, B:219:0x0f26), top: B:914:0x0c2e }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x1126 A[Catch: all -> 0x04f6, TryCatch #43 {all -> 0x04f6, blocks: (B:147:0x09e8, B:149:0x09ee, B:150:0x0a19, B:287:0x1120, B:289:0x1126, B:290:0x1150, B:411:0x16a5, B:413:0x16ab, B:414:0x16d6, B:539:0x1dc0, B:541:0x1dc6, B:542:0x1df5, B:745:0x300b, B:747:0x3011, B:748:0x303c, B:782:0x335c, B:784:0x3362, B:785:0x3386, B:762:0x3191, B:764:0x31b4, B:765:0x320b, B:711:0x2cce, B:713:0x2cd4, B:714:0x2d00, B:805:0x346a, B:807:0x3470, B:808:0x3494, B:810:0x34ce, B:811:0x350f, B:592:0x24ce, B:594:0x24e3, B:595:0x2511, B:823:0x35d2, B:825:0x35d8, B:826:0x35ff, B:828:0x3639, B:829:0x367d, B:560:0x202b, B:562:0x2040, B:563:0x206d, B:565:0x20a1, B:566:0x211c, B:457:0x1908, B:459:0x190e, B:460:0x193c, B:19:0x021b, B:21:0x0221, B:22:0x024a, B:24:0x0465, B:26:0x0497, B:27:0x04f0), top: B:924:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x11d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x1236  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x1294 A[Catch: all -> 0x1639, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x1639, blocks: (B:294:0x11d3, B:301:0x1229, B:310:0x1294), top: B:866:0x11d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x14d0 A[Catch: all -> 0x1611, TryCatch #59 {all -> 0x1611, blocks: (B:348:0x14c6, B:349:0x14ca, B:351:0x14d0, B:354:0x14ec, B:335:0x13a1, B:339:0x13e9, B:344:0x145f, B:347:0x14be), top: B:952:0x13a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1635 A[Catch: all -> 0x1637, TryCatch #11 {all -> 0x1637, blocks: (B:373:0x15f8, B:375:0x15fe, B:376:0x15ff, B:378:0x1601, B:380:0x1608, B:381:0x1609, B:388:0x161b, B:390:0x1621, B:391:0x1622, B:397:0x162f, B:399:0x1635, B:400:0x1636, B:369:0x1577, B:364:0x1534, B:366:0x153a, B:367:0x1565), top: B:865:0x1234, inners: #41, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x1636 A[Catch: all -> 0x1637, TRY_LEAVE, TryCatch #11 {all -> 0x1637, blocks: (B:373:0x15f8, B:375:0x15fe, B:376:0x15ff, B:378:0x1601, B:380:0x1608, B:381:0x1609, B:388:0x161b, B:390:0x1621, B:391:0x1622, B:397:0x162f, B:399:0x1635, B:400:0x1636, B:369:0x1577, B:364:0x1534, B:366:0x153a, B:367:0x1565), top: B:865:0x1234, inners: #41, #49 }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x16ab A[Catch: all -> 0x04f6, TryCatch #43 {all -> 0x04f6, blocks: (B:147:0x09e8, B:149:0x09ee, B:150:0x0a19, B:287:0x1120, B:289:0x1126, B:290:0x1150, B:411:0x16a5, B:413:0x16ab, B:414:0x16d6, B:539:0x1dc0, B:541:0x1dc6, B:542:0x1df5, B:745:0x300b, B:747:0x3011, B:748:0x303c, B:782:0x335c, B:784:0x3362, B:785:0x3386, B:762:0x3191, B:764:0x31b4, B:765:0x320b, B:711:0x2cce, B:713:0x2cd4, B:714:0x2d00, B:805:0x346a, B:807:0x3470, B:808:0x3494, B:810:0x34ce, B:811:0x350f, B:592:0x24ce, B:594:0x24e3, B:595:0x2511, B:823:0x35d2, B:825:0x35d8, B:826:0x35ff, B:828:0x3639, B:829:0x367d, B:560:0x202b, B:562:0x2040, B:563:0x206d, B:565:0x20a1, B:566:0x211c, B:457:0x1908, B:459:0x190e, B:460:0x193c, B:19:0x021b, B:21:0x0221, B:22:0x024a, B:24:0x0465, B:26:0x0497, B:27:0x04f0), top: B:924:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x1763  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x1786  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x179d A[Catch: all -> 0x186d, TryCatch #36 {all -> 0x186d, blocks: (B:432:0x1788, B:434:0x179d, B:435:0x17cb), top: B:910:0x1788, outer: #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x17de A[Catch: all -> 0x1863, TryCatch #31 {all -> 0x1863, blocks: (B:436:0x17d1, B:438:0x17de, B:439:0x1856), top: B:902:0x17d1, outer: #51 }] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x19bf  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1a20  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x1a77 A[Catch: all -> 0x1d3e, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x1d3e, blocks: (B:464:0x19b9, B:471:0x1a13, B:481:0x1a77), top: B:871:0x19b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x1c48  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x1dc6 A[Catch: all -> 0x04f6, TryCatch #43 {all -> 0x04f6, blocks: (B:147:0x09e8, B:149:0x09ee, B:150:0x0a19, B:287:0x1120, B:289:0x1126, B:290:0x1150, B:411:0x16a5, B:413:0x16ab, B:414:0x16d6, B:539:0x1dc0, B:541:0x1dc6, B:542:0x1df5, B:745:0x300b, B:747:0x3011, B:748:0x303c, B:782:0x335c, B:784:0x3362, B:785:0x3386, B:762:0x3191, B:764:0x31b4, B:765:0x320b, B:711:0x2cce, B:713:0x2cd4, B:714:0x2d00, B:805:0x346a, B:807:0x3470, B:808:0x3494, B:810:0x34ce, B:811:0x350f, B:592:0x24ce, B:594:0x24e3, B:595:0x2511, B:823:0x35d2, B:825:0x35d8, B:826:0x35ff, B:828:0x3639, B:829:0x367d, B:560:0x202b, B:562:0x2040, B:563:0x206d, B:565:0x20a1, B:566:0x211c, B:457:0x1908, B:459:0x190e, B:460:0x193c, B:19:0x021b, B:21:0x0221, B:22:0x024a, B:24:0x0465, B:26:0x0497, B:27:0x04f0), top: B:924:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1e7f  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x1eeb  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1f32  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x1f47  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x200d  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x225d  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x2d85  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x2dd6  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x2e30  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x2fed  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x30cc  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x3120  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x3173  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x333c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01f2 A[PHI: r15
  0x01f2: PHI (r15v90 char) = (r15v6 char), (r15v91 char) binds: [B:17:0x0216, B:5:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:816:0x3599  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01fe A[PHI: r15
  0x01fe: PHI (r15v6 char) = (r15v5 char), (r15v92 char) binds: [B:3:0x01ea, B:5:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:992:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v160 */
    /* JADX WARN: Type inference failed for: r10v290, types: [int[]] */
    /* JADX WARN: Type inference failed for: r10v357 */
    /* JADX WARN: Type inference failed for: r10v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v153, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v156 */
    /* JADX WARN: Type inference failed for: r12v157 */
    /* JADX WARN: Type inference failed for: r12v158 */
    /* JADX WARN: Type inference failed for: r12v159 */
    /* JADX WARN: Type inference failed for: r12v162 */
    /* JADX WARN: Type inference failed for: r12v163 */
    /* JADX WARN: Type inference failed for: r12v164 */
    /* JADX WARN: Type inference failed for: r12v165 */
    /* JADX WARN: Type inference failed for: r13v115 */
    /* JADX WARN: Type inference failed for: r13v116 */
    /* JADX WARN: Type inference failed for: r13v117 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v121 */
    /* JADX WARN: Type inference failed for: r13v122 */
    /* JADX WARN: Type inference failed for: r13v123 */
    /* JADX WARN: Type inference failed for: r13v124 */
    /* JADX WARN: Type inference failed for: r13v125 */
    /* JADX WARN: Type inference failed for: r13v126 */
    /* JADX WARN: Type inference failed for: r13v127 */
    /* JADX WARN: Type inference failed for: r13v129 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v130 */
    /* JADX WARN: Type inference failed for: r13v131 */
    /* JADX WARN: Type inference failed for: r13v132 */
    /* JADX WARN: Type inference failed for: r13v133 */
    /* JADX WARN: Type inference failed for: r13v134 */
    /* JADX WARN: Type inference failed for: r13v135 */
    /* JADX WARN: Type inference failed for: r13v136 */
    /* JADX WARN: Type inference failed for: r13v137 */
    /* JADX WARN: Type inference failed for: r13v138 */
    /* JADX WARN: Type inference failed for: r13v139 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v140 */
    /* JADX WARN: Type inference failed for: r13v141 */
    /* JADX WARN: Type inference failed for: r13v142 */
    /* JADX WARN: Type inference failed for: r13v143 */
    /* JADX WARN: Type inference failed for: r13v144 */
    /* JADX WARN: Type inference failed for: r13v145 */
    /* JADX WARN: Type inference failed for: r13v146 */
    /* JADX WARN: Type inference failed for: r13v147 */
    /* JADX WARN: Type inference failed for: r13v148 */
    /* JADX WARN: Type inference failed for: r13v149 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v150 */
    /* JADX WARN: Type inference failed for: r13v151 */
    /* JADX WARN: Type inference failed for: r13v152 */
    /* JADX WARN: Type inference failed for: r13v153 */
    /* JADX WARN: Type inference failed for: r13v154 */
    /* JADX WARN: Type inference failed for: r13v157 */
    /* JADX WARN: Type inference failed for: r13v158 */
    /* JADX WARN: Type inference failed for: r13v159 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v160 */
    /* JADX WARN: Type inference failed for: r13v161 */
    /* JADX WARN: Type inference failed for: r13v163 */
    /* JADX WARN: Type inference failed for: r13v164 */
    /* JADX WARN: Type inference failed for: r13v165 */
    /* JADX WARN: Type inference failed for: r13v166 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v55 */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v75 */
    /* JADX WARN: Type inference failed for: r13v76 */
    /* JADX WARN: Type inference failed for: r13v81 */
    /* JADX WARN: Type inference failed for: r13v82 */
    /* JADX WARN: Type inference failed for: r13v83 */
    /* JADX WARN: Type inference failed for: r13v87, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r13v88 */
    /* JADX WARN: Type inference failed for: r13v90 */
    /* JADX WARN: Type inference failed for: r13v94 */
    /* JADX WARN: Type inference failed for: r13v95 */
    /* JADX WARN: Type inference failed for: r13v96 */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v57 */
    /* JADX WARN: Type inference failed for: r15v59 */
    /* JADX WARN: Type inference failed for: r15v60 */
    /* JADX WARN: Type inference failed for: r15v61 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v81 */
    /* JADX WARN: Type inference failed for: r15v83 */
    /* JADX WARN: Type inference failed for: r15v84 */
    /* JADX WARN: Type inference failed for: r15v85 */
    /* JADX WARN: Type inference failed for: r15v86 */
    /* JADX WARN: Type inference failed for: r15v87 */
    /* JADX WARN: Type inference failed for: r15v88 */
    /* JADX WARN: Type inference failed for: r15v94 */
    /* JADX WARN: Type inference failed for: r15v95 */
    /* JADX WARN: Type inference failed for: r15v96 */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v11 */
    /* JADX WARN: Type inference failed for: r26v12 */
    /* JADX WARN: Type inference failed for: r26v13 */
    /* JADX WARN: Type inference failed for: r26v14 */
    /* JADX WARN: Type inference failed for: r26v15 */
    /* JADX WARN: Type inference failed for: r26v16 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v22 */
    /* JADX WARN: Type inference failed for: r26v23 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v35 */
    /* JADX WARN: Type inference failed for: r26v36 */
    /* JADX WARN: Type inference failed for: r26v37 */
    /* JADX WARN: Type inference failed for: r26v38 */
    /* JADX WARN: Type inference failed for: r26v39 */
    /* JADX WARN: Type inference failed for: r26v40 */
    /* JADX WARN: Type inference failed for: r26v44 */
    /* JADX WARN: Type inference failed for: r26v45 */
    /* JADX WARN: Type inference failed for: r26v46 */
    /* JADX WARN: Type inference failed for: r26v47 */
    /* JADX WARN: Type inference failed for: r26v50 */
    /* JADX WARN: Type inference failed for: r26v51 */
    /* JADX WARN: Type inference failed for: r26v52 */
    /* JADX WARN: Type inference failed for: r26v53 */
    /* JADX WARN: Type inference failed for: r26v63 */
    /* JADX WARN: Type inference failed for: r26v72 */
    /* JADX WARN: Type inference failed for: r26v73 */
    /* JADX WARN: Type inference failed for: r26v74 */
    /* JADX WARN: Type inference failed for: r26v75 */
    /* JADX WARN: Type inference failed for: r26v9 */
    /* JADX WARN: Type inference failed for: r2v700, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v112, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v113 */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v116 */
    /* JADX WARN: Type inference failed for: r3v119 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v341, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v342 */
    /* JADX WARN: Type inference failed for: r3v343 */
    /* JADX WARN: Type inference failed for: r3v344 */
    /* JADX WARN: Type inference failed for: r3v345 */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v358 */
    /* JADX WARN: Type inference failed for: r3v360 */
    /* JADX WARN: Type inference failed for: r3v364 */
    /* JADX WARN: Type inference failed for: r3v365 */
    /* JADX WARN: Type inference failed for: r3v366 */
    /* JADX WARN: Type inference failed for: r3v367 */
    /* JADX WARN: Type inference failed for: r3v368 */
    /* JADX WARN: Type inference failed for: r3v369 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v474 */
    /* JADX WARN: Type inference failed for: r4v475 */
    /* JADX WARN: Type inference failed for: r4v476 */
    /* JADX WARN: Type inference failed for: r4v477 */
    /* JADX WARN: Type inference failed for: r4v480, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v481 */
    /* JADX WARN: Type inference failed for: r4v482 */
    /* JADX WARN: Type inference failed for: r4v483 */
    /* JADX WARN: Type inference failed for: r4v484 */
    /* JADX WARN: Type inference failed for: r4v485 */
    /* JADX WARN: Type inference failed for: r4v490 */
    /* JADX WARN: Type inference failed for: r4v491 */
    /* JADX WARN: Type inference failed for: r4v539 */
    /* JADX WARN: Type inference failed for: r4v540 */
    /* JADX WARN: Type inference failed for: r4v541 */
    /* JADX WARN: Type inference failed for: r4v542 */
    /* JADX WARN: Type inference failed for: r4v543 */
    /* JADX WARN: Type inference failed for: r4v544 */
    /* JADX WARN: Type inference failed for: r4v545 */
    /* JADX WARN: Type inference failed for: r4v546 */
    /* JADX WARN: Type inference failed for: r4v547 */
    /* JADX WARN: Type inference failed for: r4v548 */
    /* JADX WARN: Type inference failed for: r4v549 */
    /* JADX WARN: Type inference failed for: r4v550 */
    /* JADX WARN: Type inference failed for: r6v164, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v116 */
    /* JADX WARN: Type inference failed for: r7v117 */
    /* JADX WARN: Type inference failed for: r7v118 */
    /* JADX WARN: Type inference failed for: r7v120 */
    /* JADX WARN: Type inference failed for: r7v131 */
    /* JADX WARN: Type inference failed for: r7v132, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v135 */
    /* JADX WARN: Type inference failed for: r7v185 */
    /* JADX WARN: Type inference failed for: r7v186 */
    /* JADX WARN: Type inference failed for: r7v187 */
    /* JADX WARN: Type inference failed for: r7v188 */
    /* JADX WARN: Type inference failed for: r7v189 */
    /* JADX WARN: Type inference failed for: r7v190 */
    /* JADX WARN: Type inference failed for: r7v191 */
    /* JADX WARN: Type inference failed for: r7v192 */
    /* JADX WARN: Type inference failed for: r7v193 */
    /* JADX WARN: Type inference failed for: r7v194 */
    /* JADX WARN: Type inference failed for: r7v195 */
    /* JADX WARN: Type inference failed for: r7v196 */
    /* JADX WARN: Type inference failed for: r7v197 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v50, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v57, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v58, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v388 */
    /* JADX WARN: Type inference failed for: r8v389 */
    /* JADX WARN: Type inference failed for: r8v390 */
    /* JADX WARN: Type inference failed for: r8v416 */
    /* JADX WARN: Type inference failed for: r8v417, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v418 */
    /* JADX WARN: Type inference failed for: r8v419 */
    /* JADX WARN: Type inference failed for: r8v420 */
    /* JADX WARN: Type inference failed for: r8v422, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v423 */
    /* JADX WARN: Type inference failed for: r8v424 */
    /* JADX WARN: Type inference failed for: r8v425 */
    /* JADX WARN: Type inference failed for: r8v426 */
    /* JADX WARN: Type inference failed for: r8v427 */
    /* JADX WARN: Type inference failed for: r8v438 */
    /* JADX WARN: Type inference failed for: r8v439 */
    /* JADX WARN: Type inference failed for: r8v463 */
    /* JADX WARN: Type inference failed for: r8v464 */
    /* JADX WARN: Type inference failed for: r8v465 */
    /* JADX WARN: Type inference failed for: r8v466 */
    /* JADX WARN: Type inference failed for: r8v467 */
    /* JADX WARN: Type inference failed for: r8v468 */
    /* JADX WARN: Type inference failed for: r8v469 */
    /* JADX WARN: Type inference failed for: r8v470 */
    /* JADX WARN: Type inference failed for: r8v471 */
    /* JADX WARN: Type inference failed for: r8v472 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v224 */
    /* JADX WARN: Type inference failed for: r9v225 */
    /* JADX WARN: Type inference failed for: r9v226 */
    /* JADX WARN: Type inference failed for: r9v240 */
    /* JADX WARN: Type inference failed for: r9v241 */
    /* JADX WARN: Type inference failed for: r9v242 */
    /* JADX WARN: Type inference failed for: r9v243 */
    /* JADX WARN: Type inference failed for: r9v244 */
    /* JADX WARN: Type inference failed for: r9v264 */
    /* JADX WARN: Type inference failed for: r9v269 */
    /* JADX WARN: Type inference failed for: r9v270 */
    /* JADX WARN: Type inference failed for: r9v271 */
    /* JADX WARN: Type inference failed for: r9v272 */
    /* JADX WARN: Type inference failed for: r9v278 */
    /* JADX WARN: Type inference failed for: r9v279 */
    /* JADX WARN: Type inference failed for: r9v280 */
    /* JADX WARN: Type inference failed for: r9v281 */
    /* JADX WARN: Type inference failed for: r9v282 */
    /* JADX WARN: Type inference failed for: r9v283 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.CreateAutomaticPaymentActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10976$r8$lambda$JccGLB51Ps83i4QoIJAxD5zyL4(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copy + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        identifyPinLauncher$lambda$0(createAutomaticPaymentActivity, activityResult);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 83;
        copy = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
    }

    public static void $r8$lambda$c6Sg382twHAZTu2HDpMHNruNNuQ(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 119;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        m10978instrumented$0$updateElements$LjavautilListV(createAutomaticPaymentActivity, view);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$qiaWmSmQsfW8gVv7ZmQHlFSwkWM(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 89;
        copy = i2 % 128;
        int i3 = i2 % 2;
        m10977instrumented$0$onCreate$LandroidosBundleV(createAutomaticPaymentActivity, view);
        if (i3 != 0) {
            int i4 = 16 / 0;
        }
        int i5 = getRequestBeneficiariesState + 121;
        copy = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 33 / 0;
        }
    }

    private static void m10977instrumented$0$onCreate$LandroidosBundleV(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            onCreate$lambda$1(createAutomaticPaymentActivity, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 67;
            copy = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    private static void m10978instrumented$0$updateElements$LjavautilListV(CreateAutomaticPaymentActivity createAutomaticPaymentActivity, View view) {
        int i = 2 % 2;
        int i2 = copy + 125;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            if (i3 == 0) {
                updateElements$lambda$3$lambda$2(createAutomaticPaymentActivity, view);
                Callback.onClick_exit();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            updateElements$lambda$3$lambda$2(createAutomaticPaymentActivity, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 125;
            copy = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 111;
        copy = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 93 / 0;
        }
    }
}
