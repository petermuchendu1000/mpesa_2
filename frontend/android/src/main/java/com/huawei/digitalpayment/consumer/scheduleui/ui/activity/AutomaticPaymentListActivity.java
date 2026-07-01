package com.huawei.digitalpayment.consumer.scheduleui.ui.activity;

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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModel;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alibaba.griver.base.common.utils.ToastUtils;
import com.blankj.utilcode.util.ColorUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.common.exception.BaseException;
import com.huawei.common.widget.dialog.DialogBox;
import com.huawei.common.widget.dialog.DialogManager;
import com.huawei.digitalpayment.consumer.baselib.constants.KeysConstants;
import com.huawei.digitalpayment.consumer.baselib.util.IdentityPinUtils;
import com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState;
import com.huawei.digitalpayment.consumer.schedule.model.local.LocalScheduleModel;
import com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel;
import com.huawei.digitalpayment.consumer.scheduleui.R;
import com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityAutomaticPaymentListBinding;
import com.huawei.digitalpayment.consumer.scheduleui.ui.adapter.AutomaticPaymentAdapter;
import com.huawei.payment.mvvm.DataBindingAdapter;
import dagger.hilt.android.AndroidEntryPoint;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityService_Parcel;
import kotlin.Metadata;
import kotlin.PipHintTrackerKttrackPipAnimationHintViewflow11;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.onSubMenuSelected;
import kotlin.onViewAttachedToWindow;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.lang3.CharUtils;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\tH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scheduleui/ui/activity/AutomaticPaymentListActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcPaymentBaseActivity;", "Lcom/huawei/digitalpayment/consumer/scheduleui/databinding/ScheduleActivityAutomaticPaymentListBinding;", "Lcom/huawei/digitalpayment/consumer/schedule/viewmodel/AutomaticPaymentListViewModel;", "<init>", "()V", "automaticPaymentAdapter", "Lcom/huawei/digitalpayment/consumer/scheduleui/ui/adapter/AutomaticPaymentAdapter;", "deleteItem", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;", "identifyPinLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getLayoutId", "", "initToolbar", "", "title", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "addObserve", "showDeleteDialog", "item", "Companion", "ConsumerSchedulePaymentUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class AutomaticPaymentListActivity extends Hilt_AutomaticPaymentListActivity<ScheduleActivityAutomaticPaymentListBinding, AutomaticPaymentListViewModel> {

    public static final Companion INSTANCE;
    private static char ShareDataUIState;
    private static char[] component1;
    private static char[] component2;
    private static int getAsAtTimestamp;
    private static boolean update;
    private AutomaticPaymentAdapter automaticPaymentAdapter;
    private LocalScheduleModel deleteItem;
    private ActivityResultLauncher<Intent> identifyPinLauncher;
    private static final byte[] $$c = {8, -40, 43, -43};
    private static final int $$f = 31;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {106, 40, -98, -117, -14, 0, Base64.padSymbol, -59, -10, -2, 6, -7, 5, TarHeader.LF_DIR, -58, -5, -11, Ascii.VT, 1, -1, -20, Ascii.FF, TarHeader.LF_DIR, -71, Ascii.FF, -16, -2, 8, -8, -1, -7, 67, -56, 1, -8, -2, 0, -15, 66, -61, -7, -8, 13, -15, 2, Ascii.VT, -13, 60, -36, -36, Ascii.VT, 0, -14, -1, 8, -7, -13, 9, -8, -1, -7, -23, 5, -19, Ascii.VT, Ascii.US, -31, -21, 17, 10, 10, -12, -35, 17, -21, 13, -14, 0, -5, -1, -1, 7, -11, -8, 63, -6, -7, 6, 1, -7, -12, 72, -55, -14, -5, 1, -8, -1, 9, -7, 7, -16, 67, -55, -7, 5, -15, -2, 7, -9, -9, 67, -36, -36, 1, 9, -19, Ascii.DLE, -4, -15, Ascii.GS, -18, -14, -3, 9, 63, -34, -35, -3, 3, -22, 7, -10, 41, -38, -5, 2, -9, -14, 0, -5, -1, -1, 7, -11, -8, SignedBytes.MAX_POWER_OF_TWO};
    private static final int $$h = 175;
    private static final byte[] $$a = {121, -58, 81, 67, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, Ascii.FF, -12, 19, Ascii.SI, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$b = 237;
    private static int component4 = 1;
    private static int copydefault = 0;
    private static int component3 = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$i(int r6, short r7, int r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            int r8 = r8 * 4
            int r8 = 4 - r8
            int r7 = 119 - r7
            byte[] r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L17
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.$$i(int, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r8 = 99 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r8 = r8 + r6
            int r6 = r8 + (-8)
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.d(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void e(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.$$g
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 58 - r8
            int r6 = r6 * 8
            int r6 = r6 + 83
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.e(short, short, byte, java.lang.Object[]):void");
    }

    public static final AutomaticPaymentAdapter access$getAutomaticPaymentAdapter$p(AutomaticPaymentListActivity automaticPaymentListActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 101;
        int i3 = i2 % 128;
        component3 = i3;
        int i4 = i2 % 2;
        AutomaticPaymentAdapter automaticPaymentAdapter = automaticPaymentListActivity.automaticPaymentAdapter;
        if (i4 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = i3 + 33;
        copydefault = i5 % 128;
        int i6 = i5 % 2;
        return automaticPaymentAdapter;
    }

    public static final ViewDataBinding access$getBinding$p(AutomaticPaymentListActivity automaticPaymentListActivity) {
        int i = 2 % 2;
        int i2 = copydefault + 121;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Binding binding = automaticPaymentListActivity.binding;
        if (i3 != 0) {
            return binding;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final boolean access$getUpdate$cp() {
        int i = 2 % 2;
        int i2 = copydefault + 123;
        int i3 = i2 % 128;
        component3 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        boolean z = update;
        int i4 = i3 + 123;
        copydefault = i4 % 128;
        if (i4 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final ViewModel access$getViewModel$p(AutomaticPaymentListActivity automaticPaymentListActivity) {
        int i = 2 % 2;
        int i2 = component3 + 63;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        VM vm = automaticPaymentListActivity.viewModel;
        int i4 = component3 + 71;
        copydefault = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    public static final void access$setUpdate$cp(boolean z) {
        int i = 2 % 2;
        int i2 = component3 + 53;
        int i3 = i2 % 128;
        copydefault = i3;
        int i4 = i2 % 2;
        update = z;
        int i5 = i3 + 103;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    public AutomaticPaymentListActivity() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onActivityResult(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 41;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                AutomaticPaymentListActivity automaticPaymentListActivity = this.f$0;
                ActivityResult activityResult = (ActivityResult) obj;
                if (i3 == 0) {
                    AutomaticPaymentListActivity.$r8$lambda$5zpqrYBz4Ith_1qd3g6mKfo08s4(automaticPaymentListActivity, activityResult);
                } else {
                    AutomaticPaymentListActivity.$r8$lambda$5zpqrYBz4Ith_1qd3g6mKfo08s4(automaticPaymentListActivity, activityResult);
                    throw null;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.identifyPinLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private static final void identifyPinLauncher$lambda$0(AutomaticPaymentListActivity automaticPaymentListActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copydefault + 93;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(automaticPaymentListActivity, "");
        if (activityResult == null || activityResult.getResultCode() != -1 || activityResult.getData() == null) {
            return;
        }
        int i4 = copydefault;
        int i5 = i4 + 115;
        component3 = i5 % 128;
        if (i5 % 2 == 0) {
            LocalScheduleModel localScheduleModel = automaticPaymentListActivity.deleteItem;
            throw null;
        }
        if (automaticPaymentListActivity.deleteItem != null) {
            int i6 = i4 + 43;
            component3 = i6 % 128;
            if (i6 % 2 != 0) {
                AutomaticPaymentListViewModel automaticPaymentListViewModel = (AutomaticPaymentListViewModel) automaticPaymentListActivity.viewModel;
                Intent data = activityResult.getData();
                Intrinsics.checkNotNull(data);
                String stringExtra = data.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN);
                Intrinsics.checkNotNull(stringExtra);
                LocalScheduleModel localScheduleModel2 = automaticPaymentListActivity.deleteItem;
                Intrinsics.checkNotNull(localScheduleModel2);
                automaticPaymentListViewModel.cancelSchedule(stringExtra, localScheduleModel2);
                return;
            }
            AutomaticPaymentListViewModel automaticPaymentListViewModel2 = (AutomaticPaymentListViewModel) automaticPaymentListActivity.viewModel;
            Intent data2 = activityResult.getData();
            Intrinsics.checkNotNull(data2);
            String stringExtra2 = data2.getStringExtra(KeysConstants.KEY_ENCRYPT_PIN);
            Intrinsics.checkNotNull(stringExtra2);
            LocalScheduleModel localScheduleModel3 = automaticPaymentListActivity.deleteItem;
            Intrinsics.checkNotNull(localScheduleModel3);
            automaticPaymentListViewModel2.cancelSchedule(stringExtra2, localScheduleModel3);
            int i7 = 47 / 0;
        }
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = copydefault + 63;
        component3 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            int i3 = R.layout.schedule_activity_automatic_payment_list;
            obj.hashCode();
            throw null;
        }
        int i4 = R.layout.schedule_activity_automatic_payment_list;
        int i5 = copydefault + 55;
        component3 = i5 % 128;
        if (i5 % 2 != 0) {
            return i4;
        }
        obj.hashCode();
        throw null;
    }

    @Override
    public void initToolbar(String title) {
        int i = 2 % 2;
        int i2 = component3 + 73;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        super.initToolbar(getString(R.string.schedule_payment_list_title1));
        int i4 = copydefault + 55;
        component3 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1", f = "AutomaticPaymentListActivity.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    static final class component1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component3 = 1;
        int copydefault;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1", f = "AutomaticPaymentListActivity.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 0;
            private static int component1 = 1;
            int component2;
            final AutomaticPaymentListActivity component3;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "loading", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                private static int component2 = 1;
                private static int copydefault;
                int ShareDataUIState;
                final AutomaticPaymentListActivity component1;
                boolean component3;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i;
                    int i2 = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.component3) {
                        int i3 = copydefault + 77;
                        component2 = i3 % 128;
                        if (i3 % 2 == 0) {
                            DialogManager.showLoading(this.component1);
                            throw null;
                        }
                        DialogManager.showLoading(this.component1);
                        i = copydefault + 71;
                        component2 = i % 128;
                    } else {
                        DialogManager.hideLoading(this.component1);
                        i = component2 + 31;
                        copydefault = i % 128;
                    }
                    int i4 = i % 2;
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component1 = automaticPaymentListActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component1, continuation);
                    anonymousClass2.component3 = ((Boolean) obj).booleanValue();
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component2 + 51;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass22;
                }

                @Override
                public Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 41;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objComponent1 = component1(bool.booleanValue(), continuation);
                    int i4 = copydefault + 113;
                    component2 = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 52 / 0;
                    }
                    return objComponent1;
                }

                public final Object component1(boolean z, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 99;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = copydefault + 23;
                    component2 = i4 % 128;
                    if (i4 % 2 != 0) {
                        return objInvokeSuspend;
                    }
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 87;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 != 0) {
                    int i5 = component1 + 97;
                    int i6 = i5 % 128;
                    ShareDataUIState = i6;
                    int i7 = i5 % 2;
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i8 = i6 + 119;
                    component1 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        throw null;
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AutomaticPaymentListUiState> stateFlowUiState = ((AutomaticPaymentListViewModel) AutomaticPaymentListActivity.access$getViewModel$p(this.component3)).uiState();
                    this.component2 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<Boolean>() {
                        private static int ShareDataUIState = 0;
                        private static int copydefault = 1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component1 = 1;
                            private static int component3;
                            final FlowCollector component2;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 1;
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
                                    int i2 = ShareDataUIState + 115;
                                    component3 = i2 % 128;
                                    int i3 = i2 % 2;
                                    Object obj2 = null;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 != 0) {
                                        anonymousClass2.emit(null, this);
                                        throw null;
                                    }
                                    Object objEmit = anonymousClass2.emit(null, this);
                                    int i4 = component3 + 121;
                                    ShareDataUIState = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        return objEmit;
                                    }
                                    obj2.hashCode();
                                    throw null;
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
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L20
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L20
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 69
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                    int r7 = r7 % r0
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L25
                                L20:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L25:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L47
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r6 = r6 + 9
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                    int r6 = r6 % r0
                                    if (r3 != r4) goto L3f
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L76
                                L3f:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L47:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState) r6
                                    boolean r6 = r6.getLoading()
                                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L76
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r6 + 81
                                    int r1 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r1
                                    int r7 = r7 % r0
                                    int r6 = r6 + 95
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r7
                                    int r6 = r6 % r0
                                    if (r6 != 0) goto L74
                                    return r2
                                L74:
                                    r6 = 0
                                    throw r6
                                L76:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$1$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component2 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                            int i9 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                Unit unit = Unit.INSTANCE;
                                int i10 = copydefault + 37;
                                ShareDataUIState = i10 % 128;
                                if (i10 % 2 != 0) {
                                    int i11 = 49 / 0;
                                }
                                return unit;
                            }
                            int i12 = copydefault;
                            int i13 = i12 + 55;
                            ShareDataUIState = i13 % 128;
                            int i14 = i13 % 2;
                            int i15 = i12 + 3;
                            ShareDataUIState = i15 % 128;
                            int i16 = i15 % 2;
                            return objCollect;
                        }
                    }), new AnonymousClass2(this.component3, null)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component3 = automaticPaymentListActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component3, continuation);
                int i2 = component1 + 95;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    return anonymousClass4;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 23;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
                if (i3 == 0) {
                    int i4 = 82 / 0;
                }
                return objShareDataUIState;
            }

            public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = component1 + 51;
                ShareDataUIState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 30 / 0;
                }
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component3 + 101;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.copydefault;
            if (i4 != 0) {
                int i5 = ShareDataUIState + 91;
                component3 = i5 % 128;
                if (i5 % 2 != 0 ? i4 != 1 : i4 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                this.copydefault = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(AutomaticPaymentListActivity.this, Lifecycle.State.STARTED, new AnonymousClass4(AutomaticPaymentListActivity.this, null), this) == coroutine_suspended) {
                    int i6 = component3 + 121;
                    ShareDataUIState = i6 % 128;
                    int i7 = i6 % 2;
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
            component1 component1Var = AutomaticPaymentListActivity.this.new component1(continuation);
            int i2 = ShareDataUIState + 53;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component1Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 101;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            if (i3 == 0) {
                int i4 = 72 / 0;
            }
            int i5 = component3 + 79;
            ShareDataUIState = i5 % 128;
            if (i5 % 2 == 0) {
                return objShareDataUIState;
            }
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 35;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 75;
            component3 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class component2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 0;
        private static int component1 = 1;
        int component3;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1", f = "AutomaticPaymentListActivity.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int component2 = 1;
            private static int component3;
            final AutomaticPaymentListActivity component1;
            int copydefault;

            @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "schedulePayments", "", "Lcom/huawei/digitalpayment/consumer/schedule/model/local/LocalScheduleModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends SuspendLambda implements Function2<List<? extends LocalScheduleModel>, Continuation<? super Unit>, Object> {
                private static int component1 = 1;
                private static int component2;
                int ShareDataUIState;
                final AutomaticPaymentListActivity component3;
                Object copydefault;

                @Override
                public final Object invokeSuspend(Object obj) {
                    int i = 2 % 2;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.ShareDataUIState != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = component1 + 79;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    ResultKt.throwOnFailure(obj);
                    List list = (List) this.copydefault;
                    AutomaticPaymentAdapter automaticPaymentAdapterAccess$getAutomaticPaymentAdapter$p = AutomaticPaymentListActivity.access$getAutomaticPaymentAdapter$p(this.component3);
                    if (automaticPaymentAdapterAccess$getAutomaticPaymentAdapter$p == null) {
                        int i4 = component2 + 71;
                        component1 = i4 % 128;
                        if (i4 % 2 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            throw null;
                        }
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        automaticPaymentAdapterAccess$getAutomaticPaymentAdapter$p = null;
                    }
                    automaticPaymentAdapterAccess$getAutomaticPaymentAdapter$p.submitList(list);
                    if (((AutomaticPaymentListViewModel) AutomaticPaymentListActivity.access$getViewModel$p(this.component3)).uiState().getValue().getLoading()) {
                        int i5 = component1 + 45;
                        component2 = i5 % 128;
                        if (i5 % 2 == 0) {
                            return Unit.INSTANCE;
                        }
                        int i6 = 8 / 0;
                        return Unit.INSTANCE;
                    }
                    List list2 = list;
                    if (list2 == null || list2.isEmpty()) {
                        ((ScheduleActivityAutomaticPaymentListBinding) AutomaticPaymentListActivity.access$getBinding$p(this.component3)).recyclerview.setVisibility(8);
                        ((ScheduleActivityAutomaticPaymentListBinding) AutomaticPaymentListActivity.access$getBinding$p(this.component3)).noResult.setVisibility(0);
                    } else {
                        ((ScheduleActivityAutomaticPaymentListBinding) AutomaticPaymentListActivity.access$getBinding$p(this.component3)).recyclerview.setVisibility(0);
                        ((ScheduleActivityAutomaticPaymentListBinding) AutomaticPaymentListActivity.access$getBinding$p(this.component3)).noResult.setVisibility(8);
                        int i7 = component1 + 91;
                        component2 = i7 % 128;
                        int i8 = i7 % 2;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.component3 = automaticPaymentListActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.component3, continuation);
                    anonymousClass2.copydefault = obj;
                    AnonymousClass2 anonymousClass22 = anonymousClass2;
                    int i2 = component1 + 117;
                    component2 = i2 % 128;
                    int i3 = i2 % 2;
                    return anonymousClass22;
                }

                @Override
                public Object invoke(List<? extends LocalScheduleModel> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component1 + 107;
                    component2 = i2 % 128;
                    List<? extends LocalScheduleModel> list2 = list;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 == 0) {
                        return copydefault(list2, continuation2);
                    }
                    copydefault(list2, continuation2);
                    throw null;
                }

                public final Object copydefault(List<LocalScheduleModel> list, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = component2 + 17;
                    component1 = i2 % 128;
                    int i3 = i2 % 2;
                    AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(list, continuation);
                    if (i3 != 0) {
                        return anonymousClass2.invokeSuspend(Unit.INSTANCE);
                    }
                    anonymousClass2.invokeSuspend(Unit.INSTANCE);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.copydefault;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AutomaticPaymentListUiState> stateFlowUiState = ((AutomaticPaymentListViewModel) AutomaticPaymentListActivity.access$getViewModel$p(this.component1)).uiState();
                    this.copydefault = 1;
                    if (FlowKt.collect(FlowKt.onEach(new Flow<List<? extends LocalScheduleModel>>() {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int component3 = 1;
                            private static int copydefault;
                            final FlowCollector component1;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int ShareDataUIState = 1;
                                private static int component1;
                                Object L$0;
                                int label;
                                Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override
                                public final Object invokeSuspend(Object obj) {
                                    int i = 2 % 2;
                                    int i2 = ShareDataUIState + 59;
                                    component1 = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    if (i3 == 0) {
                                        return anonymousClass2.emit(null, this);
                                    }
                                    int i4 = 69 / 0;
                                    return anonymousClass2.emit(null, this);
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
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
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L28
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L28
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault
                                    int r7 = r7 + 65
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3 = r2
                                    int r7 = r7 % r0
                                    if (r7 != 0) goto L22
                                    int r7 = r1.label
                                    int r7 = r7 % r3
                                    r1.label = r7
                                    goto L2d
                                L22:
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L2d
                                L28:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                L2d:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L54
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 85
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r1
                                    int r6 = r6 % r0
                                    if (r6 == 0) goto L46
                                    if (r3 != r4) goto L4c
                                    goto L48
                                L46:
                                    if (r3 != r4) goto L4c
                                L48:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L7b
                                L4c:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L54:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component1
                                    r3 = r1
                                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                                    com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState) r6
                                    java.util.List r6 = r6.getSchedulePayments()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L7b
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component3
                                    int r6 = r6 + 55
                                    int r7 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.copydefault = r7
                                    int r6 = r6 % r0
                                    if (r6 != 0) goto L76
                                    return r2
                                L76:
                                    r6 = 0
                                    r6.hashCode()
                                    throw r6
                                L7b:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$2$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component1 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super List<? extends LocalScheduleModel>> flowCollector, Continuation continuation) {
                            int i3 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                return Unit.INSTANCE;
                            }
                            int i4 = ShareDataUIState;
                            int i5 = i4 + 47;
                            component3 = i5 % 128;
                            int i6 = i5 % 2;
                            int i7 = i4 + 105;
                            component3 = i7 % 128;
                            if (i7 % 2 == 0) {
                                int i8 = 63 / 0;
                            }
                            return objCollect;
                        }
                    }, new AnonymousClass2(this.component1, null)), this) == coroutine_suspended) {
                        int i3 = component3 + 125;
                        component2 = i3 % 128;
                        int i4 = i3 % 2;
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = component2 + 101;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    ResultKt.throwOnFailure(obj);
                }
                Unit unit = Unit.INSTANCE;
                int i7 = component2 + 119;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                return unit;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.component1 = automaticPaymentListActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.component1, continuation);
                int i2 = component3 + 29;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                return anonymousClass3;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component2 + 123;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Object objCopydefault = copydefault(coroutineScope, continuation);
                if (i3 != 0) {
                    int i4 = 74 / 0;
                }
                return objCopydefault;
            }

            public final Object copydefault(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component3 + 33;
                component2 = i2 % 128;
                int i3 = i2 % 2;
                AnonymousClass3 anonymousClass3 = (AnonymousClass3) create(coroutineScope, continuation);
                Unit unit = Unit.INSTANCE;
                if (i3 == 0) {
                    anonymousClass3.invokeSuspend(unit);
                    throw null;
                }
                Object objInvokeSuspend = anonymousClass3.invokeSuspend(unit);
                int i4 = component3 + 107;
                component2 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }

            public static void ShareDataUIState() {
                PipHintTrackerKttrackPipAnimationHintViewflow11.component2[0] = onViewAttachedToWindow.copydefault[0];
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = component1 + 115;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component3;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component3 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(AutomaticPaymentListActivity.this, Lifecycle.State.CREATED, new AnonymousClass3(AutomaticPaymentListActivity.this, null), this) == coroutine_suspended) {
                    int i5 = ShareDataUIState + 1;
                    component1 = i5 % 128;
                    if (i5 % 2 != 0) {
                        return coroutine_suspended;
                    }
                    obj2.hashCode();
                    throw null;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i6 = component1 + 9;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    obj2.hashCode();
                    throw null;
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        component2(Continuation<? super component2> continuation) {
            super(2, continuation);
        }

        @Override
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            int i = 2 % 2;
            component2 component2Var = AutomaticPaymentListActivity.this.new component2(continuation);
            int i2 = ShareDataUIState + 61;
            component1 = i2 % 128;
            if (i2 % 2 != 0) {
                return component2Var;
            }
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component1 + 89;
            ShareDataUIState = i2 % 128;
            int i3 = i2 % 2;
            Object objShareDataUIState = ShareDataUIState(coroutineScope, continuation);
            int i4 = component1 + 83;
            ShareDataUIState = i4 % 128;
            if (i4 % 2 == 0) {
                return objShareDataUIState;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 71;
            component1 = i2 % 128;
            int i3 = i2 % 2;
            Object objInvokeSuspend = ((component2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            int i4 = ShareDataUIState + 45;
            component1 = i4 % 128;
            int i5 = i4 % 2;
            return objInvokeSuspend;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3", f = "AutomaticPaymentListActivity.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    static final class component3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private static int ShareDataUIState = 1;
        private static int component3;
        int component2;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1", f = "AutomaticPaymentListActivity.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private static int ShareDataUIState = 1;
            private static int component1;
            int component2;
            final AutomaticPaymentListActivity component3;

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", ToastUtils.TYPE.TYPE_EXCEPTION, "Lcom/huawei/common/exception/BaseException;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass5 extends SuspendLambda implements Function2<BaseException, Continuation<? super Unit>, Object> {
                private static int ShareDataUIState = 1;
                private static int copydefault;
                Object component1;
                final AutomaticPaymentListActivity component2;
                int component3;

                /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
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
                        int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.ShareDataUIState
                        int r1 = r1 + 119
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.copydefault = r2
                        int r1 = r1 % r0
                        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r3.component3
                        if (r1 != 0) goto L6a
                        int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.ShareDataUIState
                        int r1 = r1 + 75
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.copydefault = r2
                        int r1 = r1 % r0
                        r2 = 0
                        kotlin.ResultKt.throwOnFailure(r4)
                        java.lang.Object r4 = r3.component1
                        com.huawei.common.exception.BaseException r4 = (com.huawei.common.exception.BaseException) r4
                        if (r1 == 0) goto L2c
                        r1 = 49
                        int r1 = r1 / r2
                        if (r4 == 0) goto L5e
                        goto L2e
                    L2c:
                        if (r4 == 0) goto L5e
                    L2e:
                        java.lang.String r4 = r4.getMessage()
                        java.lang.Object[] r1 = new java.lang.Object[r2]
                        com.huawei.common.util.ToastUtils.showLong(r4, r1)
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity r4 = r3.component2
                        androidx.lifecycle.ViewModel r4 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.access$getViewModel$p(r4)
                        com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel r4 = (com.huawei.digitalpayment.consumer.schedule.viewmodel.AutomaticPaymentListViewModel) r4
                        r4.cleanException()
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity r4 = r3.component2
                        androidx.databinding.ViewDataBinding r4 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.access$getBinding$p(r4)
                        com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityAutomaticPaymentListBinding r4 = (com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityAutomaticPaymentListBinding) r4
                        com.huawei.common.widget.recyclerview.HFRecyclerView r4 = r4.recyclerview
                        r1 = 8
                        r4.setVisibility(r1)
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity r4 = r3.component2
                        androidx.databinding.ViewDataBinding r4 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.access$getBinding$p(r4)
                        com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityAutomaticPaymentListBinding r4 = (com.huawei.digitalpayment.consumer.scheduleui.databinding.ScheduleActivityAutomaticPaymentListBinding) r4
                        android.widget.LinearLayout r4 = r4.noResult
                        r4.setVisibility(r2)
                    L5e:
                        kotlin.Unit r4 = kotlin.Unit.INSTANCE
                        int r1 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.copydefault
                        int r1 = r1 + 111
                        int r2 = r1 % 128
                        com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.ShareDataUIState = r2
                        int r1 = r1 % r0
                        return r4
                    L6a:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.component3.AnonymousClass4.AnonymousClass5.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass5(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass5> continuation) {
                    super(2, continuation);
                    this.component2 = automaticPaymentListActivity;
                }

                @Override
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    int i = 2 % 2;
                    AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.component2, continuation);
                    anonymousClass5.component1 = obj;
                    AnonymousClass5 anonymousClass52 = anonymousClass5;
                    int i2 = copydefault + 17;
                    ShareDataUIState = i2 % 128;
                    if (i2 % 2 != 0) {
                        return anonymousClass52;
                    }
                    Object obj2 = null;
                    obj2.hashCode();
                    throw null;
                }

                public final Object component3(BaseException baseException, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = ShareDataUIState + 29;
                    copydefault = i2 % 128;
                    int i3 = i2 % 2;
                    Object objInvokeSuspend = ((AnonymousClass5) create(baseException, continuation)).invokeSuspend(Unit.INSTANCE);
                    int i4 = ShareDataUIState + 7;
                    copydefault = i4 % 128;
                    int i5 = i4 % 2;
                    return objInvokeSuspend;
                }

                @Override
                public Object invoke(BaseException baseException, Continuation<? super Unit> continuation) {
                    int i = 2 % 2;
                    int i2 = copydefault + 93;
                    ShareDataUIState = i2 % 128;
                    BaseException baseException2 = baseException;
                    Continuation<? super Unit> continuation2 = continuation;
                    if (i2 % 2 != 0) {
                        return component3(baseException2, continuation2);
                    }
                    component3(baseException2, continuation2);
                    throw null;
                }
            }

            @Override
            public final Object invokeSuspend(Object obj) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 9;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i4 = this.component2;
                if (i4 != 0) {
                    int i5 = ShareDataUIState + 35;
                    component1 = i5 % 128;
                    if (i5 % 2 == 0 ? i4 != 1 : i4 != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    int i6 = ShareDataUIState + 117;
                    component1 = i6 % 128;
                    int i7 = i6 % 2;
                } else {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<AutomaticPaymentListUiState> stateFlowUiState = ((AutomaticPaymentListViewModel) AutomaticPaymentListActivity.access$getViewModel$p(this.component3)).uiState();
                    this.component2 = 1;
                    if (FlowKt.collect(FlowKt.onEach(FlowKt.distinctUntilChanged(new Flow<BaseException>() {
                        private static int component2 = 1;
                        private static int component3;

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            private static int ShareDataUIState = 0;
                            private static int component1 = 1;
                            final FlowCollector component2;

                            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                            @DebugMetadata(c = "com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2", f = "AutomaticPaymentListActivity.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                private static int component2 = 1;
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
                                    int i2 = component2 + 103;
                                    copydefault = i2 % 128;
                                    int i3 = i2 % 2;
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    Object obj2 = null;
                                    Object objEmit = AnonymousClass2.this.emit(null, this);
                                    int i4 = copydefault + 69;
                                    component2 = i4 % 128;
                                    if (i4 % 2 != 0) {
                                        return objEmit;
                                    }
                                    obj2.hashCode();
                                    throw null;
                                }
                            }

                            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
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
                                    boolean r1 = r7 instanceof com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                                    if (r1 == 0) goto L28
                                    r1 = r7
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = (com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r1
                                    int r2 = r1.label
                                    r3 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r2 = r2 & r3
                                    if (r2 == 0) goto L28
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r7 = r7 + 11
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r2
                                    int r7 = r7 % r0
                                    if (r7 == 0) goto L22
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L36
                                L22:
                                    int r7 = r1.label
                                    int r7 = r7 + r3
                                    r1.label = r7
                                    goto L36
                                L28:
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1 r1 = new com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1$2$1
                                    r1.<init>(r7)
                                    int r7 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState
                                    int r7 = r7 + 75
                                    int r2 = r7 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1 = r2
                                    int r7 = r7 % r0
                                L36:
                                    java.lang.Object r7 = r1.result
                                    java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                    int r3 = r1.label
                                    r4 = 1
                                    if (r3 == 0) goto L58
                                    int r6 = com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.component1
                                    int r6 = r6 + 81
                                    int r1 = r6 % 128
                                    com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.ShareDataUIState = r1
                                    int r6 = r6 % r0
                                    if (r3 != r4) goto L50
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    goto L6f
                                L50:
                                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                                    r6.<init>(r7)
                                    throw r6
                                L58:
                                    kotlin.ResultKt.throwOnFailure(r7)
                                    kotlinx.coroutines.flow.FlowCollector r7 = r5.component2
                                    r0 = r1
                                    kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                                    com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState r6 = (com.huawei.digitalpayment.consumer.schedule.model.local.AutomaticPaymentListUiState) r6
                                    com.huawei.common.exception.BaseException r6 = r6.getException()
                                    r1.label = r4
                                    java.lang.Object r6 = r7.emit(r6, r1)
                                    if (r6 != r2) goto L6f
                                    return r2
                                L6f:
                                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                                    return r6
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity$addObserve$3$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.component2 = flowCollector;
                            }
                        }

                        @Override
                        public Object collect(FlowCollector<? super BaseException> flowCollector, Continuation continuation) {
                            int i8 = 2 % 2;
                            Object objCollect = stateFlowUiState.collect(new AnonymousClass2(flowCollector), continuation);
                            if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                int i9 = component3 + 69;
                                component2 = i9 % 128;
                                int i10 = i9 % 2;
                                return objCollect;
                            }
                            Unit unit = Unit.INSTANCE;
                            int i11 = component2 + 67;
                            component3 = i11 % 128;
                            if (i11 % 2 != 0) {
                                int i12 = 47 / 0;
                            }
                            return unit;
                        }
                    }), new AnonymousClass5(this.component3, null)), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(AutomaticPaymentListActivity automaticPaymentListActivity, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.component3 = automaticPaymentListActivity;
            }

            @Override
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                int i = 2 % 2;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.component3, continuation);
                int i2 = component1 + 103;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 35 / 0;
                }
                return anonymousClass4;
            }

            @Override
            public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = component1 + 115;
                ShareDataUIState = i2 % 128;
                CoroutineScope coroutineScope2 = coroutineScope;
                Continuation<? super Unit> continuation2 = continuation;
                if (i2 % 2 == 0) {
                    component3(coroutineScope2, continuation2);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object objComponent3 = component3(coroutineScope2, continuation2);
                int i3 = ShareDataUIState + 79;
                component1 = i3 % 128;
                int i4 = i3 % 2;
                return objComponent3;
            }

            public final Object component3(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 125;
                component1 = i2 % 128;
                int i3 = i2 % 2;
                Object objInvokeSuspend = ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                int i4 = ShareDataUIState + 9;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return objInvokeSuspend;
            }
        }

        @Override
        public final Object invokeSuspend(Object obj) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 83;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i4 = this.component2;
            Object obj2 = null;
            if (i4 == 0) {
                ResultKt.throwOnFailure(obj);
                this.component2 = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(AutomaticPaymentListActivity.this, Lifecycle.State.CREATED, new AnonymousClass4(AutomaticPaymentListActivity.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = ShareDataUIState + 1;
                component3 = i5 % 128;
                if (i5 % 2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    obj2.hashCode();
                    throw null;
                }
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
            component3 component3Var = AutomaticPaymentListActivity.this.new component3(continuation);
            int i2 = ShareDataUIState + 81;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            return component3Var;
        }

        @Override
        public Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = component3 + 75;
            ShareDataUIState = i2 % 128;
            Object obj = null;
            CoroutineScope coroutineScope2 = coroutineScope;
            Continuation<? super Unit> continuation2 = continuation;
            if (i2 % 2 == 0) {
                ShareDataUIState(coroutineScope2, continuation2);
                obj.hashCode();
                throw null;
            }
            Object objShareDataUIState = ShareDataUIState(coroutineScope2, continuation2);
            int i3 = ShareDataUIState + 23;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                return objShareDataUIState;
            }
            throw null;
        }

        public final Object ShareDataUIState(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            int i = 2 % 2;
            int i2 = ShareDataUIState + 67;
            component3 = i2 % 128;
            int i3 = i2 % 2;
            component3 component3Var = (component3) create(coroutineScope, continuation);
            Unit unit = Unit.INSTANCE;
            if (i3 == 0) {
                return component3Var.invokeSuspend(unit);
            }
            component3Var.invokeSuspend(unit);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/huawei/digitalpayment/consumer/scheduleui/ui/activity/AutomaticPaymentListActivity$Companion;", "", "<init>", "()V", "update", "", "getUpdate", "()Z", "setUpdate", "(Z)V", "ConsumerSchedulePaymentUi_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private static int component2 = 1;
        private static int copydefault;

        private Companion() {
        }

        public final boolean getUpdate() {
            int i = 2 % 2;
            int i2 = component2 + 27;
            copydefault = i2 % 128;
            if (i2 % 2 != 0) {
                AutomaticPaymentListActivity.access$getUpdate$cp();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            boolean zAccess$getUpdate$cp = AutomaticPaymentListActivity.access$getUpdate$cp();
            int i3 = component2 + 93;
            copydefault = i3 % 128;
            int i4 = i3 % 2;
            return zAccess$getUpdate$cp;
        }

        public final void setUpdate(boolean z) {
            int i = 2 % 2;
            int i2 = copydefault + 87;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            AutomaticPaymentListActivity.access$setUpdate$cp(z);
            int i4 = copydefault + 17;
            component2 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void b(boolean z, int[] iArr, byte[] bArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        char c2;
        int i2 = 2 % 2;
        ITrustedWebActivityService_Parcel iTrustedWebActivityService_Parcel = new ITrustedWebActivityService_Parcel();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = component2;
        float f = 0.0f;
        Throwable th = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1323871607);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 658, 14 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 65118), 1951305196, false, "l", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 71;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    f = 0.0f;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 97;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 1;
                c2 = 1;
            } else {
                cArr = new char[i4];
                iTrustedWebActivityService_Parcel.copydefault = 0;
                c2 = 0;
            }
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                if (bArr[iTrustedWebActivityService_Parcel.copydefault] == 1) {
                    int i11 = $10 + 29;
                    $11 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = iTrustedWebActivityService_Parcel.copydefault;
                        Object[] objArr3 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                        Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                        if (objCopydefault2 == null) {
                            byte b2 = (byte) 0;
                            objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.getCapsMode("", 0, 0) + 4502, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 35, (char) (27897 - KeyEvent.getDeadChar(0, 0)), -1464227204, false, $$i(b2, (byte) (b2 | 9), b2), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i12] = ((Character) ((Method) objCopydefault2).invoke(th, objArr3)).charValue();
                        throw th;
                    }
                    int i13 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr4 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(1843426585);
                    if (objCopydefault3 == null) {
                        byte b3 = (byte) 0;
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(4501 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 35 - Process.getGidForName(""), (char) (((Process.getThreadPriority(0) + 20) >> 6) + 27897), -1464227204, false, $$i(b3, (byte) (b3 | 9), b3), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objCopydefault3).invoke(th, objArr4)).charValue();
                } else {
                    int i14 = iTrustedWebActivityService_Parcel.copydefault;
                    Object[] objArr5 = {Integer.valueOf(cArr4[iTrustedWebActivityService_Parcel.copydefault]), Integer.valueOf(c2)};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-2096958553);
                    if (objCopydefault4 == null) {
                        int threadPriority = 3580 - ((Process.getThreadPriority(0) + 20) >> 6);
                        int i15 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                        char cResolveSize = (char) View.resolveSize(0, 0);
                        byte length2 = (byte) $$c.length;
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(threadPriority, i15, cResolveSize, 1180380354, false, $$i((byte) 0, length2, (byte) (length2 - 4)), new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                }
                c2 = cArr[iTrustedWebActivityService_Parcel.copydefault];
                Object[] objArr6 = {iTrustedWebActivityService_Parcel, iTrustedWebActivityService_Parcel};
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1047491542);
                if (objCopydefault5 == null) {
                    byte b4 = (byte) 0;
                    byte b5 = (byte) (b4 + 5);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(1859 - Color.alpha(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 35, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 80302927, false, $$i(b4, b5, (byte) (b5 - 5)), new Class[]{Object.class, Object.class});
                }
                ((Method) objCopydefault5).invoke(null, objArr6);
                th = null;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i16, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                cArr6[iTrustedWebActivityService_Parcel.copydefault] = cArr4[(i4 - iTrustedWebActivityService_Parcel.copydefault) - 1];
                iTrustedWebActivityService_Parcel.copydefault++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            iTrustedWebActivityService_Parcel.copydefault = 0;
            while (iTrustedWebActivityService_Parcel.copydefault < i4) {
                int i17 = $11 + 59;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] >> iArr[4]);
                    i = iTrustedWebActivityService_Parcel.copydefault;
                } else {
                    cArr4[iTrustedWebActivityService_Parcel.copydefault] = (char) (cArr4[iTrustedWebActivityService_Parcel.copydefault] - iArr[2]);
                    i = iTrustedWebActivityService_Parcel.copydefault + 1;
                }
                iTrustedWebActivityService_Parcel.copydefault = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(char[] r34, byte r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.c(char[], byte, int, java.lang.Object[]):void");
    }

    private static final void onCreate$lambda$1(AutomaticPaymentListActivity automaticPaymentListActivity, DataBindingAdapter dataBindingAdapter, View view, int i, LocalScheduleModel localScheduleModel) {
        int i2 = 2 % 2;
        int i3 = copydefault + 111;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        Intrinsics.checkNotNullParameter(automaticPaymentListActivity, "");
        if (view.getId() == R.id.ivDelete) {
            AutomaticPaymentAdapter automaticPaymentAdapter = automaticPaymentListActivity.automaticPaymentAdapter;
            if (automaticPaymentAdapter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                automaticPaymentAdapter = null;
            }
            LocalScheduleModel item = automaticPaymentAdapter.getItem(i);
            Intrinsics.checkNotNullExpressionValue(item, "");
            automaticPaymentListActivity.showDeleteDialog(item);
            int i5 = copydefault + 109;
            component3 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0104  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.onResume():void");
    }

    private final void addObserve() {
        int i = 2 % 2;
        AutomaticPaymentListActivity automaticPaymentListActivity = this;
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(automaticPaymentListActivity), null, null, new component1(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(automaticPaymentListActivity), null, null, new component2(null), 3, null);
        onSubMenuSelected.ShareDataUIState(LifecycleOwnerKt.getLifecycleScope(automaticPaymentListActivity), null, null, new component3(null), 3, null);
        int i2 = copydefault + 25;
        component3 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void showDeleteDialog$lambda$2(AutomaticPaymentListActivity automaticPaymentListActivity, LocalScheduleModel localScheduleModel, View view, String str) {
        int i = 2 % 2;
        int i2 = component3 + 99;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(automaticPaymentListActivity, "");
        Intrinsics.checkNotNullParameter(localScheduleModel, "");
        automaticPaymentListActivity.deleteItem = localScheduleModel;
        Intent identityPinIntent = IdentityPinUtils.getIdentityPinIntent();
        identityPinIntent.putExtra(KeysConstants.IS_SUPPORT_BIOMETRIC, true);
        automaticPaymentListActivity.identifyPinLauncher.launch(identityPinIntent);
        int i4 = copydefault + 45;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void showDeleteDialog(final LocalScheduleModel item) {
        int i = 2 % 2;
        DialogBox.builder().setContent(getString(R.string.schedule_payment_list_tips1)).setLeftButtonText(getString(R.string.schedule_payment_list_button2)).setRightButtonText(getString(R.string.schedule_payment_list_button3)).setRightButtonTextColor(ColorUtils.getColor(R.color.colorPrimary)).setRightButtonListener(new DialogBox.DialogBoxListener() {
            private static int component1 = 1;
            private static int component2;

            @Override
            public final void onButtonClick(View view, String str) {
                int i2 = 2 % 2;
                int i3 = component1 + 41;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                AutomaticPaymentListActivity.$r8$lambda$8e9vNPpwQw5Hw5mTFj73DwR_xSM(this.f$0, item, view, str);
                int i5 = component2 + 59;
                component1 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 63 / 0;
                }
            }
        }).build().show(getSupportFragmentManager(), "");
        int i2 = copydefault + 5;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 64 / 0;
        }
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = copydefault + 83;
        component3 = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(true, new int[]{23, 26, 114, 0}, new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            c(new char[]{25, 28, 13877, 13877, 20, 3, 7, '\t', 13879, 13879, CharUtils.CR, 20, 30, 24, 7, 18, 4, 3}, (byte) (((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(21) - 28), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = copydefault + 51;
            component3 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = copydefault + 23;
                component3 = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i7 = component3 + 53;
            copydefault = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16777258, (char) Drawable.resolveOpacity(0, 0), 428292935, false, "ShareDataUIState", new Class[0]);
                }
                Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6562 - Color.blue(0), 55 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) ((-1) - TextUtils.lastIndexOf("", '0')), -960739708, false, "component3", new Class[]{Context.class});
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
    /* JADX WARN: Removed duplicated region for block: B:100:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x093c A[Catch: all -> 0x027c, TryCatch #40 {all -> 0x027c, blocks: (B:167:0x0936, B:169:0x093c, B:170:0x0966, B:459:0x1a42, B:461:0x1a48, B:462:0x1a6f, B:674:0x2d38, B:676:0x2d3e, B:677:0x2d66, B:708:0x306b, B:710:0x3071, B:711:0x3096, B:745:0x33b9, B:747:0x33bf, B:748:0x33e2, B:725:0x31ed, B:727:0x3210, B:728:0x3268, B:554:0x264a, B:556:0x2650, B:557:0x2678, B:559:0x26b2, B:560:0x26fc, B:528:0x2360, B:530:0x2375, B:531:0x23a5, B:510:0x204f, B:512:0x2055, B:513:0x2083, B:515:0x20bd, B:516:0x2106, B:480:0x1cc0, B:482:0x1cd5, B:483:0x1d06, B:485:0x1d3a, B:486:0x1db3, B:368:0x1500, B:370:0x1506, B:371:0x1534, B:323:0x12e3, B:325:0x12e9, B:326:0x1311, B:255:0x0e67, B:257:0x0e6d, B:258:0x0e9c, B:23:0x0118, B:25:0x011e, B:26:0x014a, B:28:0x01ea, B:30:0x021c, B:31:0x0276, B:331:0x1395, B:333:0x1399, B:354:0x1483, B:356:0x1489, B:357:0x148a, B:359:0x148c, B:361:0x1493, B:362:0x1494, B:337:0x13a5, B:347:0x13fe, B:349:0x140b, B:350:0x1479, B:343:0x13b0, B:345:0x13c5, B:346:0x13f8, B:174:0x09ea, B:176:0x09f0, B:177:0x0a31, B:181:0x0a4b, B:183:0x0a51, B:184:0x0a94, B:207:0x0cc1, B:208:0x0cc5, B:210:0x0ccb, B:213:0x0ce2, B:216:0x0cef, B:218:0x0cf2, B:230:0x0dd7, B:232:0x0ddd, B:233:0x0dde, B:235:0x0de0, B:237:0x0de7, B:238:0x0de8, B:185:0x0a9f, B:197:0x0ba6, B:199:0x0bac, B:200:0x0bf0, B:202:0x0c1a, B:203:0x0c60, B:205:0x0c76, B:206:0x0cbb, B:240:0x0dea, B:242:0x0df1, B:243:0x0df2, B:245:0x0df4, B:247:0x0dfb, B:248:0x0dfc, B:262:0x0f1e, B:264:0x0f24, B:265:0x0f71, B:267:0x0f7e, B:269:0x0f87, B:270:0x0fc6, B:289:0x1176, B:297:0x11de, B:303:0x1262, B:305:0x1268, B:306:0x1269, B:308:0x126b, B:310:0x1272, B:311:0x1273, B:272:0x0fd2, B:279:0x105c, B:281:0x1062, B:282:0x10a3, B:284:0x10cd, B:285:0x1110, B:287:0x1126, B:288:0x116e, B:313:0x1275, B:315:0x127c, B:316:0x127d), top: B:847:0x0118, inners: #3, #42, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0f24 A[Catch: all -> 0x127e, TryCatch #43 {all -> 0x127e, blocks: (B:262:0x0f1e, B:264:0x0f24, B:265:0x0f71, B:267:0x0f7e, B:269:0x0f87, B:270:0x0fc6, B:289:0x1176, B:297:0x11de, B:303:0x1262, B:305:0x1268, B:306:0x1269, B:308:0x126b, B:310:0x1272, B:311:0x1273, B:272:0x0fd2, B:279:0x105c, B:281:0x1062, B:282:0x10a3, B:284:0x10cd, B:285:0x1110, B:287:0x1126, B:288:0x116e, B:313:0x1275, B:315:0x127c, B:316:0x127d, B:299:0x11e4, B:293:0x11a6, B:295:0x11ac, B:296:0x11d7, B:274:0x0ff2, B:276:0x1004, B:277:0x1050), top: B:851:0x0f1e, outer: #40, inners: #32, #35, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0f7e A[Catch: all -> 0x127e, TryCatch #43 {all -> 0x127e, blocks: (B:262:0x0f1e, B:264:0x0f24, B:265:0x0f71, B:267:0x0f7e, B:269:0x0f87, B:270:0x0fc6, B:289:0x1176, B:297:0x11de, B:303:0x1262, B:305:0x1268, B:306:0x1269, B:308:0x126b, B:310:0x1272, B:311:0x1273, B:272:0x0fd2, B:279:0x105c, B:281:0x1062, B:282:0x10a3, B:284:0x10cd, B:285:0x1110, B:287:0x1126, B:288:0x116e, B:313:0x1275, B:315:0x127c, B:316:0x127d, B:299:0x11e4, B:293:0x11a6, B:295:0x11ac, B:296:0x11d7, B:274:0x0ff2, B:276:0x1004, B:277:0x1050), top: B:851:0x0f1e, outer: #40, inners: #32, #35, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0fd2 A[Catch: all -> 0x127e, TRY_LEAVE, TryCatch #43 {all -> 0x127e, blocks: (B:262:0x0f1e, B:264:0x0f24, B:265:0x0f71, B:267:0x0f7e, B:269:0x0f87, B:270:0x0fc6, B:289:0x1176, B:297:0x11de, B:303:0x1262, B:305:0x1268, B:306:0x1269, B:308:0x126b, B:310:0x1272, B:311:0x1273, B:272:0x0fd2, B:279:0x105c, B:281:0x1062, B:282:0x10a3, B:284:0x10cd, B:285:0x1110, B:287:0x1126, B:288:0x116e, B:313:0x1275, B:315:0x127c, B:316:0x127d, B:299:0x11e4, B:293:0x11a6, B:295:0x11ac, B:296:0x11d7, B:274:0x0ff2, B:276:0x1004, B:277:0x1050), top: B:851:0x0f1e, outer: #40, inners: #32, #35, #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x1188  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x13ae  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x13c5 A[Catch: all -> 0x148b, TryCatch #48 {all -> 0x148b, blocks: (B:343:0x13b0, B:345:0x13c5, B:346:0x13f8), top: B:860:0x13b0, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x140b A[Catch: all -> 0x1481, TryCatch #44 {all -> 0x1481, blocks: (B:347:0x13fe, B:349:0x140b, B:350:0x1479), top: B:852:0x13fe, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x15bc A[Catch: all -> 0x19da, TryCatch #28 {all -> 0x19da, blocks: (B:375:0x15b6, B:377:0x15bc, B:378:0x1605, B:380:0x1612, B:382:0x161b, B:383:0x1663, B:407:0x188b, B:408:0x188f, B:410:0x1895, B:413:0x18b1, B:416:0x18be, B:418:0x18c1, B:384:0x166e, B:396:0x1766, B:398:0x176c, B:399:0x17ac, B:401:0x17d6, B:403:0x1822, B:405:0x1839, B:406:0x1883), top: B:823:0x15b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x1612 A[Catch: all -> 0x19da, TryCatch #28 {all -> 0x19da, blocks: (B:375:0x15b6, B:377:0x15bc, B:378:0x1605, B:380:0x1612, B:382:0x161b, B:383:0x1663, B:407:0x188b, B:408:0x188f, B:410:0x1895, B:413:0x18b1, B:416:0x18be, B:418:0x18c1, B:384:0x166e, B:396:0x1766, B:398:0x176c, B:399:0x17ac, B:401:0x17d6, B:403:0x1822, B:405:0x1839, B:406:0x1883), top: B:823:0x15b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x166e A[Catch: all -> 0x19da, TRY_LEAVE, TryCatch #28 {all -> 0x19da, blocks: (B:375:0x15b6, B:377:0x15bc, B:378:0x1605, B:380:0x1612, B:382:0x161b, B:383:0x1663, B:407:0x188b, B:408:0x188f, B:410:0x1895, B:413:0x18b1, B:416:0x18be, B:418:0x18c1, B:384:0x166e, B:396:0x1766, B:398:0x176c, B:399:0x17ac, B:401:0x17d6, B:403:0x1822, B:405:0x1839, B:406:0x1883), top: B:823:0x15b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x1895 A[Catch: all -> 0x19da, TryCatch #28 {all -> 0x19da, blocks: (B:375:0x15b6, B:377:0x15bc, B:378:0x1605, B:380:0x1612, B:382:0x161b, B:383:0x1663, B:407:0x188b, B:408:0x188f, B:410:0x1895, B:413:0x18b1, B:416:0x18be, B:418:0x18c1, B:384:0x166e, B:396:0x1766, B:398:0x176c, B:399:0x17ac, B:401:0x17d6, B:403:0x1822, B:405:0x1839, B:406:0x1883), top: B:823:0x15b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0304 A[Catch: all -> 0x02d6, TRY_ENTER, TRY_LEAVE, TryCatch #24 {all -> 0x02d6, blocks: (B:38:0x028b, B:44:0x0304, B:49:0x0362, B:51:0x0368, B:52:0x03ab, B:55:0x03c0, B:57:0x03c4, B:61:0x03d0), top: B:819:0x028b }] */
    /* JADX WARN: Removed duplicated region for block: B:467:0x1afa  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x1b5f  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x1ba3  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x1bbb  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x1ca0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x1eed  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x2010  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x220d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x225a  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x2341  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x24e7  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x2609  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x2801  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x2871 A[Catch: all -> 0x2844, TRY_ENTER, TRY_LEAVE, TryCatch #16 {all -> 0x2844, blocks: (B:566:0x2803, B:572:0x2871, B:577:0x28d3, B:579:0x28d9, B:580:0x2919, B:586:0x2937, B:588:0x293b, B:592:0x2947, B:593:0x294c, B:594:0x2952), top: B:804:0x2803 }] */
    /* JADX WARN: Removed duplicated region for block: B:576:0x28d0  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x2926  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x2b8c A[Catch: all -> 0x2cb6, TryCatch #10 {all -> 0x2cb6, blocks: (B:620:0x2b78, B:622:0x2b86, B:624:0x2b8c, B:627:0x2ba4, B:630:0x2bb1, B:632:0x2bb4, B:644:0x2ca4, B:646:0x2caa, B:647:0x2cab, B:649:0x2cad, B:651:0x2cb4, B:652:0x2cb5, B:598:0x2963, B:610:0x2a63, B:612:0x2a69, B:613:0x2aaa, B:615:0x2ad4, B:616:0x2b1b, B:618:0x2b31, B:619:0x2b72, B:656:0x2cb9, B:658:0x2cc0, B:659:0x2cc1, B:661:0x2cc3, B:663:0x2cca, B:664:0x2ccb, B:640:0x2c28, B:635:0x2be0, B:637:0x2be6, B:638:0x2c16, B:605:0x29c5, B:607:0x29e4, B:608:0x2a57, B:600:0x2977, B:602:0x298c, B:603:0x29be), top: B:793:0x2963, inners: #0, #4, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2d3e A[Catch: all -> 0x027c, TryCatch #40 {all -> 0x027c, blocks: (B:167:0x0936, B:169:0x093c, B:170:0x0966, B:459:0x1a42, B:461:0x1a48, B:462:0x1a6f, B:674:0x2d38, B:676:0x2d3e, B:677:0x2d66, B:708:0x306b, B:710:0x3071, B:711:0x3096, B:745:0x33b9, B:747:0x33bf, B:748:0x33e2, B:725:0x31ed, B:727:0x3210, B:728:0x3268, B:554:0x264a, B:556:0x2650, B:557:0x2678, B:559:0x26b2, B:560:0x26fc, B:528:0x2360, B:530:0x2375, B:531:0x23a5, B:510:0x204f, B:512:0x2055, B:513:0x2083, B:515:0x20bd, B:516:0x2106, B:480:0x1cc0, B:482:0x1cd5, B:483:0x1d06, B:485:0x1d3a, B:486:0x1db3, B:368:0x1500, B:370:0x1506, B:371:0x1534, B:323:0x12e3, B:325:0x12e9, B:326:0x1311, B:255:0x0e67, B:257:0x0e6d, B:258:0x0e9c, B:23:0x0118, B:25:0x011e, B:26:0x014a, B:28:0x01ea, B:30:0x021c, B:31:0x0276, B:331:0x1395, B:333:0x1399, B:354:0x1483, B:356:0x1489, B:357:0x148a, B:359:0x148c, B:361:0x1493, B:362:0x1494, B:337:0x13a5, B:347:0x13fe, B:349:0x140b, B:350:0x1479, B:343:0x13b0, B:345:0x13c5, B:346:0x13f8, B:174:0x09ea, B:176:0x09f0, B:177:0x0a31, B:181:0x0a4b, B:183:0x0a51, B:184:0x0a94, B:207:0x0cc1, B:208:0x0cc5, B:210:0x0ccb, B:213:0x0ce2, B:216:0x0cef, B:218:0x0cf2, B:230:0x0dd7, B:232:0x0ddd, B:233:0x0dde, B:235:0x0de0, B:237:0x0de7, B:238:0x0de8, B:185:0x0a9f, B:197:0x0ba6, B:199:0x0bac, B:200:0x0bf0, B:202:0x0c1a, B:203:0x0c60, B:205:0x0c76, B:206:0x0cbb, B:240:0x0dea, B:242:0x0df1, B:243:0x0df2, B:245:0x0df4, B:247:0x0dfb, B:248:0x0dfc, B:262:0x0f1e, B:264:0x0f24, B:265:0x0f71, B:267:0x0f7e, B:269:0x0f87, B:270:0x0fc6, B:289:0x1176, B:297:0x11de, B:303:0x1262, B:305:0x1268, B:306:0x1269, B:308:0x126b, B:310:0x1272, B:311:0x1273, B:272:0x0fd2, B:279:0x105c, B:281:0x1062, B:282:0x10a3, B:284:0x10cd, B:285:0x1110, B:287:0x1126, B:288:0x116e, B:313:0x1275, B:315:0x127c, B:316:0x127d), top: B:847:0x0118, inners: #3, #42, #43 }] */
    /* JADX WARN: Removed duplicated region for block: B:682:0x2deb  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x2e3c  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x2e94  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x3048  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x3125  */
    /* JADX WARN: Removed duplicated region for block: B:719:0x317a  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x31cf  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x3399  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x1395 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:887:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r10v74 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r10v92 */
    /* JADX WARN: Type inference failed for: r10v93 */
    /* JADX WARN: Type inference failed for: r10v94 */
    /* JADX WARN: Type inference failed for: r10v95 */
    /* JADX WARN: Type inference failed for: r10v96 */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v147 */
    /* JADX WARN: Type inference failed for: r12v148 */
    /* JADX WARN: Type inference failed for: r12v149 */
    /* JADX WARN: Type inference failed for: r12v152 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v160 */
    /* JADX WARN: Type inference failed for: r12v161 */
    /* JADX WARN: Type inference failed for: r12v166, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v169 */
    /* JADX WARN: Type inference failed for: r12v173 */
    /* JADX WARN: Type inference failed for: r12v174 */
    /* JADX WARN: Type inference failed for: r12v175 */
    /* JADX WARN: Type inference failed for: r12v176 */
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
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v200 */
    /* JADX WARN: Type inference failed for: r12v201 */
    /* JADX WARN: Type inference failed for: r12v202 */
    /* JADX WARN: Type inference failed for: r12v203 */
    /* JADX WARN: Type inference failed for: r12v204 */
    /* JADX WARN: Type inference failed for: r12v205 */
    /* JADX WARN: Type inference failed for: r12v206 */
    /* JADX WARN: Type inference failed for: r12v207 */
    /* JADX WARN: Type inference failed for: r12v208 */
    /* JADX WARN: Type inference failed for: r12v209 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v210 */
    /* JADX WARN: Type inference failed for: r12v211 */
    /* JADX WARN: Type inference failed for: r12v212 */
    /* JADX WARN: Type inference failed for: r12v213 */
    /* JADX WARN: Type inference failed for: r12v214 */
    /* JADX WARN: Type inference failed for: r12v215 */
    /* JADX WARN: Type inference failed for: r12v216 */
    /* JADX WARN: Type inference failed for: r12v217 */
    /* JADX WARN: Type inference failed for: r12v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v50 */
    /* JADX WARN: Type inference failed for: r12v51 */
    /* JADX WARN: Type inference failed for: r12v52 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v59 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v84 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r12v88 */
    /* JADX WARN: Type inference failed for: r12v96 */
    /* JADX WARN: Type inference failed for: r12v97 */
    /* JADX WARN: Type inference failed for: r12v98 */
    /* JADX WARN: Type inference failed for: r12v99, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v10 */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r32v8 */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r4v118 */
    /* JADX WARN: Type inference failed for: r4v119 */
    /* JADX WARN: Type inference failed for: r4v120, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v160 */
    /* JADX WARN: Type inference failed for: r4v162 */
    /* JADX WARN: Type inference failed for: r4v165, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v169 */
    /* JADX WARN: Type inference failed for: r4v170 */
    /* JADX WARN: Type inference failed for: r4v171 */
    /* JADX WARN: Type inference failed for: r4v179 */
    /* JADX WARN: Type inference failed for: r4v323 */
    /* JADX WARN: Type inference failed for: r4v338 */
    /* JADX WARN: Type inference failed for: r4v339 */
    /* JADX WARN: Type inference failed for: r4v340 */
    /* JADX WARN: Type inference failed for: r4v341 */
    /* JADX WARN: Type inference failed for: r4v342 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r6v544, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v603 */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 13915
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.scheduleui.ui.activity.AutomaticPaymentListActivity.attachBaseContext(android.content.Context):void");
    }

    public static void $r8$lambda$5zpqrYBz4Ith_1qd3g6mKfo08s4(AutomaticPaymentListActivity automaticPaymentListActivity, ActivityResult activityResult) {
        int i = 2 % 2;
        int i2 = copydefault + 15;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        identifyPinLauncher$lambda$0(automaticPaymentListActivity, activityResult);
        int i4 = component3 + 1;
        copydefault = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
    }

    public static void $r8$lambda$8e9vNPpwQw5Hw5mTFj73DwR_xSM(AutomaticPaymentListActivity automaticPaymentListActivity, LocalScheduleModel localScheduleModel, View view, String str) {
        int i = 2 % 2;
        int i2 = component3 + 25;
        copydefault = i2 % 128;
        int i3 = i2 % 2;
        showDeleteDialog$lambda$2(automaticPaymentListActivity, localScheduleModel, view, str);
        int i4 = copydefault + 105;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void m10975$r8$lambda$h8b28iFYUB_ou5xsD2ON6fUePI(AutomaticPaymentListActivity automaticPaymentListActivity, DataBindingAdapter dataBindingAdapter, View view, int i, LocalScheduleModel localScheduleModel) {
        int i2 = 2 % 2;
        int i3 = copydefault + 101;
        component3 = i3 % 128;
        int i4 = i3 % 2;
        onCreate$lambda$1(automaticPaymentListActivity, dataBindingAdapter, view, i, localScheduleModel);
        int i5 = component3 + 107;
        copydefault = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    static {
        getAsAtTimestamp = 0;
        copydefault();
        INSTANCE = new Companion(null);
        int i = component4 + 119;
        getAsAtTimestamp = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override
    public void onStart() {
        int i = 2 % 2;
        int i2 = copydefault + 89;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = copydefault + 25;
        component3 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void copydefault() {
        component2 = new char[]{33512, 33455, 33460, 33462, 33464, 33461, 33452, 33459, 33467, 33462, 33455, 33470, 33504, 33423, 33454, 33425, 33430, 33465, 33513, 33452, 33464, 33408, 33465, 33460, 33291, 33290, 33282, 33280, 33295, 33287, 33335, 33343, 33342, 33342, 33343, 33282, 33307, 33398, 33310, 33341, 33285, 33382, 33380, 33287, 33281, 33341, 33282, 33284, 33286, 33408, 33396, 33356, 33398, 33395, 33355, 33396, 33309, 33399, 33400, 33397, 33354, 33352, 33355, 33397, 33396, 33397, 33400, 33358, 33356, 33398, 33399, 33357, 33396, 33397, 33355, 33394, 33396, 33398, 33376, 33310, 33307, 33308, 33310, 33401, 33361, 33360, 33356, 33395, 33311, 33398, 33356, 33359, 33359, 33357, 33356, 33356, 33398, 33437, 33346, 33346, 33371, 33373, 33371, 33346, 33386, 33347, 33345, 33346, 33371, 33367, 33366, 33345, 33386, 33346, 33372, 33369, 33344, 33348, 33346, 33346, 33372, 33368, 33344, 33386, 33346, 33369, 33366, 33366, 33345, 33348, 33369, 33344, 33387, 33386, 33385, 33347, 33347, 33386, 33344, 33365, 33368, 33346, 33344, 33368, 33370, 33347, 33346, 33348, 33388, 33345, 33366, 33406, 33406, 33366, 33369, 33367, 33365, 33368, 33367, 33366, 33366, 33302, 33745, 33746, 33312, 33758, 33751, 33756, 33302, 33756, 33749, 33316, 33302, 33752, 33750, 33314, 33303, 33312, 33747, 33316, 33744, 33748, 33746, 33313, 33747, 33316, 33744, 33758, 33303, 33745, 33746, 33316, 33314, 33745, 33316, 33312, 33747, 33757, 33745, 33303, 33315, 33314, 33294, 33297, 33299, 33299, 33295, 33300, 33296, 33297, 33759, 33298, 33294, 33293, 33296, 33295, 33302, 33302, 33291, 33746, 33749, 33745, 33745, 33757, 33746, 33745, 33751, 33312, 33743, 33312, 33302, 33299, 33743, 33480, 33516, 33513, 33519, 33518, 33517, 33532, 33430, 33428, 33471, 33470, 33426, 33427, 33427, 33467, 33469, 33469, 33468, 33432, 33410, 33408, 33431, 33471, 33410, 33432, 33428, 33428, 33429, 33433, 33435, 33429, 33429, 33433, 33435, 33432, 33469, 33471, 33430, 33428, 33470, 33408, 33471, 33517, 33467, 33462, 33414, 33418, 33458, 33461, 33419, 33471, 33449, 33457, 33457, 33454, 33462, 33467, 33465, 33523, 33461, 33359, 33407, 33346, 33353, 33356, 33373, 33374, 33352, 33356, 33358, 33359, 33358, 33356, 33354, 33349, 33353, 33359, 33452, 33447, 33348, 33517, 33462, 33460, 33457, 33455, 33465, 33468, 33412, 33412, 33467, 33459, 33454, 33463, 33465, 33463, 33462, 33292, 33291, 33288, 33290, 33290, 33289, 33289, 33287, 33286, 33477, 33513, 33515, 33514, 33512, 33512, 33511, 33511, 33515, 33515, 33515, 33477, 33516, 33514, 33513, 33513, 33512, 33513, 33515, 33514, 33512, 33516, 33475, 33514, 33516, 33514, 33512, 33514, 33515, 33513, 33512, 33513};
        component1 = new char[]{2038, 2023, 2030, 2031, 2026, 2041, 2036, 1975, 1985, 2032, 1977, 2018, 1969, 1973, 2028, 2029, 1970, 2024, 2017, 2025, 2039, 2021, 1966, 1971, 2019, 1976, 2035, 2037, 1972, 2022, 2020, 2003, 2027, 2034, 1974, 1968};
        ShareDataUIState = (char) 12828;
    }
}
