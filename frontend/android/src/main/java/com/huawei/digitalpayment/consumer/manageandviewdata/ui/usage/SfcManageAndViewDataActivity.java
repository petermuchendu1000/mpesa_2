package com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage;

import android.app.AppOpsManager;
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
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.resource.parser.tar.TarHeader;
import com.alipay.plus.security.lite.SecLiteException;
import com.blankj.utilcode.constant.CacheConstants;
import com.dynatrace.android.callback.Callback;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.huawei.arouter.RouteUtils;
import com.huawei.digitalpayment.consumer.manageandviewdata.R;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.IntervalTypes;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.models.TimeInterval;
import com.huawei.digitalpayment.consumer.manageandviewdata.dataManager.utils.Intervals;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.AccountUsage;
import com.huawei.digitalpayment.consumer.manageandviewdata.resp.IndividualUsageBundleParam;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.screens.SfcManageAndViewDataScreenKt;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state.AirtimeUsageState;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.state.DeviceUsageDataState;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.AirtimeUsageViewModel;
import com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.viewmodels.DeviceDataUsageViewModel;
import com.huawei.digitalpayment.consumer.manageandviewdata.utils.RoutePathConstants;
import com.huawei.digitalpayment.consumer.sfc.databinding.ActivityBaseComposeBinding;
import com.huawei.digitalpayment.consumer.sfcui.statement.dialog.SfcDatePickerDialog;
import com.safaricom.designsystem.theme.OneAppThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import io.ktor.http.cio.HttpParserKt;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.INotificationSideChannel;
import kotlin.INotificationSideChannelDefault;
import kotlin.ITrustedWebActivityCallbackDefault;
import kotlin.ITrustedWebActivityServiceDefault;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u001c\u0010\u001a\u001a\u00020\u000f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\u001cH\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u001e²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002²\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002"}, d2 = {"Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/SfcManageAndViewDataActivity;", "Lcom/huawei/digitalpayment/consumer/base/ui/base/SfcBaseActivity;", "Lcom/huawei/digitalpayment/consumer/sfc/databinding/ActivityBaseComposeBinding;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/viewmodels/AirtimeUsageViewModel;", "<init>", "()V", "dataUsageViewModel", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/viewmodels/DeviceDataUsageViewModel;", "getDataUsageViewModel", "()Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/viewmodels/DeviceDataUsageViewModel;", "dataUsageViewModel$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "checkAndRequestDataUsage", "handleDataUsageIntervalSelection", "label", "", "checkForPermission", "", "context", "Landroid/content/Context;", "showChainedDatePicker", "onIntervalSelected", "Lkotlin/Function1;", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/dataManager/models/TimeInterval;", "ConsumerSfcManageAndViewData_release", "airtimeState", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/AirtimeUsageState;", "dataUsageState", "Lcom/huawei/digitalpayment/consumer/manageandviewdata/ui/usage/state/DeviceUsageDataState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
@AndroidEntryPoint
public final class SfcManageAndViewDataActivity extends Hilt_SfcManageAndViewDataActivity<ActivityBaseComposeBinding, AirtimeUsageViewModel> {
    public static final int $stable = 8;
    private static char ShareDataUIState;
    private static long component1;
    private static int component2;
    private static long component3;
    private static char component4;
    private static char copy;
    private static char copydefault;
    private static char equals;
    private static int getShareableDataState;

    private final Lazy dataUsageViewModel;
    private static final byte[] $$l = {120, Ascii.VT, 65, 93};
    private static final int $$o = 145;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {113, 46, 90, -12, -15, -1, -6, -2, -2, 6, -12, -9, SignedBytes.MAX_POWER_OF_TWO, -15, -1, -6, -2, -2, 6, -12, -9, 62, -15, -1, 60, -54, -14, 0, 4, -2, -4, -2, TarHeader.LF_NORMAL, -60, -14, 6, -16, Ascii.SO, -16, 65, -65, -6, -8, -3, 8, 1, TarHeader.LF_BLK, -33, -38, -8, -3, 8, 1, Ascii.RS, -49, Ascii.SO, -25, 19, -4, -13, 4, 62, -16, -4, -15, -1, -6, -2, -2, 6, -12, -9, 63};
    private static final int $$t = 47;
    private static final byte[] $$d = {77, -64, 102, -128, 20, 9, 17, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -56, 6, Ascii.ETB, -26, Ascii.ESC, 20, Ascii.FF, -8, Ascii.SYN, 9, -42, 43, 17, -1, 9, Ascii.VT, 2, Ascii.SO, 0, Ascii.EM, -1, 4, Ascii.SYN, -24, 41, -11, Ascii.ESC, -7, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -58, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -57, 20, 9, 17, -13, 9, 9, 3, Ascii.FS, -1, Ascii.DLE, 20, 6, Ascii.VT, 7, 7, -1, 17, Ascii.SO, -59, 20, Ascii.FF, -12, 19, Ascii.SI, Ascii.GS, 1, Ascii.EM, -5, -25, 37, Ascii.ESC, -11, -4, -4, Ascii.DC2, 41, -11, Ascii.ESC, -7, 6, Ascii.ETB, -43, 58, -42, 59, -24, Ascii.GS, Ascii.FF, 0, Ascii.SYN, 9, -11, 20, Ascii.VT};
    private static final int $$e = 129;
    private static int hashCode = 1;
    private static int getRequestBeneficiariesState = 0;
    private static int getAsAtTimestamp = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$r(short r5, int r6, byte r7) {
        /*
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.$$l
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r6 = 111 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r7]
        L24:
            int r7 = r7 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.$$r(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void i(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 2
            int r9 = 103 - r9
            int r8 = r8 + 4
            int r7 = r7 + 4
            byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            int r7 = r7 + 1
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r7
            int r7 = r3 + (-8)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.i(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void k(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 99
            int r9 = r9 * 33
            int r9 = r9 + 10
            byte[] r0 = com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.$$s
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r4 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-3)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.k(short, int, byte, java.lang.Object[]):void");
    }

    public static final void access$checkAndRequestDataUsage(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 33;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcManageAndViewDataActivity.checkAndRequestDataUsage();
        if (i3 == 0) {
            throw null;
        }
        int i4 = getRequestBeneficiariesState + 93;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final DeviceDataUsageViewModel access$getDataUsageViewModel(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 19;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        DeviceDataUsageViewModel dataUsageViewModel = sfcManageAndViewDataActivity.getDataUsageViewModel();
        int i4 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
        return dataUsageViewModel;
    }

    public static final ViewModel access$getViewModel$p(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 45;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        VM vm = sfcManageAndViewDataActivity.viewModel;
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 35;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return vm;
    }

    public static final void access$handleDataUsageIntervalSelection(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, String str) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 1;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcManageAndViewDataActivity.handleDataUsageIntervalSelection(str);
        int i4 = getRequestBeneficiariesState + 109;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    public static final void access$showChainedDatePicker(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, Function1 function1) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 17;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        sfcManageAndViewDataActivity.showChainedDatePicker(function1);
        if (i3 == 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 29;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public SfcManageAndViewDataActivity() {
        final SfcManageAndViewDataActivity sfcManageAndViewDataActivity = this;
        final Function0 function0 = null;
        this.dataUsageViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(DeviceDataUsageViewModel.class), new Function0<ViewModelStore>() {
            private static int component3 = 0;
            private static int copydefault = 1;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 1;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcManageAndViewDataActivity;
                if (i3 == 0) {
                    return componentActivity.getViewModelStore();
                }
                componentActivity.getViewModelStore();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            @Override
            public ViewModelStore invoke() {
                int i = 2 % 2;
                int i2 = copydefault + 49;
                component3 = i2 % 128;
                if (i2 % 2 != 0) {
                    invoke();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                ViewModelStore viewModelStoreInvoke = invoke();
                int i3 = component3 + 73;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                return viewModelStoreInvoke;
            }

            {
                super(0);
            }
        }, new Function0<ViewModelProvider.Factory>() {
            private static int ShareDataUIState = 1;
            private static int component3;

            @Override
            public ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory factoryInvoke;
                int i = 2 % 2;
                int i2 = component3 + 19;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 == 0) {
                    factoryInvoke = invoke();
                    int i3 = 9 / 0;
                } else {
                    factoryInvoke = invoke();
                }
                int i4 = component3 + 101;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return factoryInvoke;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final ViewModelProvider.Factory invoke() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 31;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                ComponentActivity componentActivity = sfcManageAndViewDataActivity;
                if (i3 == 0) {
                    return componentActivity.getDefaultViewModelProviderFactory();
                }
                componentActivity.getDefaultViewModelProviderFactory();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            {
                super(0);
            }
        }, new Function0<CreationExtras>() {
            private static int component1 = 1;
            private static int component3;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                int i = 2 % 2;
                int i2 = component1 + 111;
                component3 = i2 % 128;
                int i3 = i2 % 2;
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = sfcManageAndViewDataActivity.getDefaultViewModelCreationExtras();
                int i4 = component3 + 105;
                component1 = i4 % 128;
                int i5 = i4 % 2;
                return defaultViewModelCreationExtras;
            }

            @Override
            public CreationExtras invoke() {
                int i = 2 % 2;
                int i2 = component1 + 75;
                component3 = i2 % 128;
                if (i2 % 2 == 0) {
                    return invoke();
                }
                invoke();
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    private final DeviceDataUsageViewModel getDataUsageViewModel() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 55;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        DeviceDataUsageViewModel deviceDataUsageViewModel = (DeviceDataUsageViewModel) this.dataUsageViewModel.getValue();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
        return deviceDataUsageViewModel;
    }

    @Override
    public int getLayoutId() {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 57;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        int i4 = R.layout.activity_base_compose;
        if (i3 == 0) {
            return i4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class ShareDataUIState implements Function2<Composer, Integer, Unit> {
        private static int component2 = 1;
        private static int component3;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
            private static int ShareDataUIState = 1;
            private static int copydefault;
            final SfcManageAndViewDataActivity component3;

            public static Object component3(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
                int i7 = ~((~i6) | i | i5);
                int i8 = ~((~i) | i6);
                int i9 = ~i5;
                int i10 = i8 | (~(i9 | i6));
                int i11 = ~(i9 | i);
                int i12 = i6 + i + i4 + ((-1568348280) * i2) + (1617068012 * i3);
                int i13 = i12 * i12;
                int i14 = (((-430874860) * i6) - 739508224) + (1544986862 * i) + (i7 * 987930861) + ((-987930861) * i10) + (987930861 * i11) + (557056000 * i4) + ((-1885339648) * i2) + (1743781888 * i3) + (858456064 * i13);
                int i15 = (i6 * (-973781596)) + 539565670 + (i * (-973779706)) + (i7 * 945) + (i10 * (-945)) + (i11 * 945) + (i4 * (-973780651)) + (i2 * 424585256) + (i3 * 537576796) + (i13 * 1078394880);
                int i16 = i14 + (i15 * i15 * 192741376);
                if (i16 == 1) {
                    SfcManageAndViewDataActivity sfcManageAndViewDataActivity = (SfcManageAndViewDataActivity) objArr[0];
                    int i17 = 2 % 2;
                    int i18 = copydefault + 119;
                    ShareDataUIState = i18 % 128;
                    int i19 = i18 % 2;
                    Unit unitComponent2 = component2(sfcManageAndViewDataActivity);
                    int i20 = copydefault + 15;
                    ShareDataUIState = i20 % 128;
                    int i21 = i20 % 2;
                    return unitComponent2;
                }
                if (i16 == 2) {
                    return component2(objArr);
                }
                if (i16 == 3) {
                    State state = (State) objArr[0];
                    int i22 = 2 % 2;
                    int i23 = copydefault + 19;
                    ShareDataUIState = i23 % 128;
                    int i24 = i23 % 2;
                    AirtimeUsageState airtimeUsageState = (AirtimeUsageState) state.getValue();
                    int i25 = copydefault + 103;
                    ShareDataUIState = i25 % 128;
                    int i26 = i25 % 2;
                    return airtimeUsageState;
                }
                SfcManageAndViewDataActivity sfcManageAndViewDataActivity2 = (SfcManageAndViewDataActivity) objArr[0];
                TimeInterval timeInterval = (TimeInterval) objArr[1];
                int i27 = 2 % 2;
                int i28 = ShareDataUIState + 97;
                copydefault = i28 % 128;
                int i29 = i28 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity2, "");
                Intrinsics.checkNotNullParameter(timeInterval, "");
                ((AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity2)).updateIntervalAndCall(timeInterval);
                Unit unit = Unit.INSTANCE;
                int i30 = ShareDataUIState + 23;
                copydefault = i30 % 128;
                int i31 = i30 % 2;
                return unit;
            }

            @Override
            public Unit invoke(Composer composer, Integer num) {
                int i = 2 % 2;
                int i2 = copydefault + 55;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                component1(composer, num.intValue());
                Unit unit = Unit.INSTANCE;
                int i4 = copydefault + 25;
                ShareDataUIState = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            public final void component1(Composer composer, int i) {
                int i2 = 2 % 2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    final State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(((AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(this.component3)).getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                    State stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(SfcManageAndViewDataActivity.access$getDataUsageViewModel(this.component3).getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 8, 7);
                    Unit unit = Unit.INSTANCE;
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity = this.component3;
                    LifecycleEffectKt.LifecycleResumeEffect(unit, (LifecycleOwner) null, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) new Function1() {
                        private static int ShareDataUIState = 1;
                        private static int copydefault;

                        @Override
                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 15;
                            copydefault = i4 % 128;
                            int i5 = i4 % 2;
                            LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResultComponent3 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(sfcManageAndViewDataActivity, (LifecycleResumePauseEffectScope) obj);
                            int i6 = ShareDataUIState + 65;
                            copydefault = i6 % 128;
                            if (i6 % 2 == 0) {
                                return lifecyclePauseOrDisposeEffectResultComponent3;
                            }
                            throw null;
                        }
                    }, composer, 6, 2);
                    int iComponent2 = HttpParserKt.component2.component2();
                    int iComponent22 = HttpParserKt.component2.component2();
                    AirtimeUsageState airtimeUsageState = (AirtimeUsageState) component3(-1501648552, HttpParserKt.component2.component2(), new Object[]{stateCollectAsStateWithLifecycle}, HttpParserKt.component2.component2(), iComponent22, iComponent2, 1501648555);
                    DeviceUsageDataState deviceUsageDataStateShareDataUIState = ShareDataUIState((State<DeviceUsageDataState>) stateCollectAsStateWithLifecycle2);
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity2 = this.component3;
                    Function1 function1 = new Function1() {
                        private static int ShareDataUIState = 0;
                        private static int component3 = 1;

                        @Override
                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 19;
                            component3 = i4 % 128;
                            int i5 = i4 % 2;
                            SfcManageAndViewDataActivity sfcManageAndViewDataActivity3 = sfcManageAndViewDataActivity2;
                            TimeInterval timeInterval = (TimeInterval) obj;
                            if (i5 != 0) {
                                return SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.ShareDataUIState(sfcManageAndViewDataActivity3, timeInterval);
                            }
                            Unit unitShareDataUIState = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.ShareDataUIState(sfcManageAndViewDataActivity3, timeInterval);
                            int i6 = 99 / 0;
                            return unitShareDataUIState;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity3 = this.component3;
                    Function0 function0 = new Function0() {
                        private static int ShareDataUIState = 0;
                        private static int copydefault = 1;

                        @Override
                        public final Object invoke() {
                            Unit unit2;
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 71;
                            copydefault = i4 % 128;
                            if (i4 % 2 == 0) {
                                Object[] objArr = {sfcManageAndViewDataActivity3};
                                int iComponent23 = HttpParserKt.component2.component2();
                                unit2 = (Unit) SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(-1358851742, HttpParserKt.component2.component2(), objArr, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent23, 1358851743);
                                int i5 = 32 / 0;
                            } else {
                                Object[] objArr2 = {sfcManageAndViewDataActivity3};
                                int iComponent24 = HttpParserKt.component2.component2();
                                unit2 = (Unit) SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(-1358851742, HttpParserKt.component2.component2(), objArr2, HttpParserKt.component2.component2(), HttpParserKt.component2.component2(), iComponent24, 1358851743);
                            }
                            int i6 = ShareDataUIState + 47;
                            copydefault = i6 % 128;
                            int i7 = i6 % 2;
                            return unit2;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity4 = this.component3;
                    Function0 function02 = new Function0() {
                        private static int component2 = 1;
                        private static int component3;

                        @Override
                        public final Object invoke() {
                            Unit unitComponent3;
                            int i3 = 2 % 2;
                            int i4 = component2 + 51;
                            component3 = i4 % 128;
                            if (i4 % 2 != 0) {
                                unitComponent3 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(sfcManageAndViewDataActivity4, stateCollectAsStateWithLifecycle);
                                int i5 = 51 / 0;
                            } else {
                                unitComponent3 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(sfcManageAndViewDataActivity4, stateCollectAsStateWithLifecycle);
                            }
                            int i6 = component3 + 17;
                            component2 = i6 % 128;
                            int i7 = i6 % 2;
                            return unitComponent3;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity5 = this.component3;
                    Function0 function03 = new Function0() {
                        private static int ShareDataUIState = 0;
                        private static int component2 = 1;

                        @Override
                        public final Object invoke() {
                            int i3 = 2 % 2;
                            int i4 = component2 + 13;
                            ShareDataUIState = i4 % 128;
                            int i5 = i4 % 2;
                            SfcManageAndViewDataActivity sfcManageAndViewDataActivity6 = sfcManageAndViewDataActivity5;
                            if (i5 == 0) {
                                return SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(sfcManageAndViewDataActivity6);
                            }
                            SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component3(sfcManageAndViewDataActivity6);
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity6 = this.component3;
                    Function1 function12 = new Function1() {
                        private static int component2 = 0;
                        private static int copydefault = 1;

                        @Override
                        public final Object invoke(Object obj) {
                            int i3 = 2 % 2;
                            int i4 = copydefault + 87;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            Unit unitComponent2 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component2(sfcManageAndViewDataActivity6, (AccountUsage) obj);
                            int i6 = component2 + 123;
                            copydefault = i6 % 128;
                            if (i6 % 2 != 0) {
                                return unitComponent2;
                            }
                            Object obj2 = null;
                            obj2.hashCode();
                            throw null;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity7 = this.component3;
                    Function0 function04 = new Function0() {
                        private static int component2 = 1;
                        private static int copydefault;

                        @Override
                        public final Object invoke() {
                            int i3 = 2 % 2;
                            int i4 = copydefault + 115;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            Unit unitComponent1 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component1(sfcManageAndViewDataActivity7);
                            int i6 = component2 + 75;
                            copydefault = i6 % 128;
                            if (i6 % 2 != 0) {
                                int i7 = 45 / 0;
                            }
                            return unitComponent1;
                        }
                    };
                    final SfcManageAndViewDataActivity sfcManageAndViewDataActivity8 = this.component3;
                    SfcManageAndViewDataScreenKt.SfcManageAndViewDataScreen(airtimeUsageState, deviceUsageDataStateShareDataUIState, function1, function0, function02, function03, function12, function04, new Function2() {
                        private static int component1 = 0;
                        private static int component2 = 1;

                        @Override
                        public final Object invoke(Object obj, Object obj2) {
                            int i3 = 2 % 2;
                            int i4 = component1 + 63;
                            component2 = i4 % 128;
                            int i5 = i4 % 2;
                            SfcManageAndViewDataActivity sfcManageAndViewDataActivity9 = sfcManageAndViewDataActivity8;
                            Integer num = (Integer) obj;
                            if (i5 != 0) {
                                return SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.copydefault(sfcManageAndViewDataActivity9, num.intValue(), (String) obj2);
                            }
                            Unit unitCopydefault = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.copydefault(sfcManageAndViewDataActivity9, num.intValue(), (String) obj2);
                            int i6 = 93 / 0;
                            return unitCopydefault;
                        }
                    }, new Function0() {
                        private static int ShareDataUIState = 1;
                        private static int component1;

                        @Override
                        public final Object invoke() {
                            int i3 = 2 % 2;
                            int i4 = ShareDataUIState + 61;
                            component1 = i4 % 128;
                            int i5 = i4 % 2;
                            Unit unitComponent1 = SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.component1();
                            int i6 = component1 + 39;
                            ShareDataUIState = i6 % 128;
                            if (i6 % 2 != 0) {
                                return unitComponent1;
                            }
                            Object obj = null;
                            obj.hashCode();
                            throw null;
                        }
                    }, composer, 805306440);
                } else {
                    composer.skipToGroupEnd();
                    int i3 = copydefault + 19;
                    ShareDataUIState = i3 % 128;
                    int i4 = i3 % 2;
                }
                int i5 = ShareDataUIState + 17;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
            }

            private static final Unit component2(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 63;
                copydefault = i2 % 128;
                if (i2 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                    Intrinsics.checkNotNullParameter(timeInterval, "");
                    ((AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity)).updateIntervalAndCall(timeInterval);
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                Intrinsics.checkNotNullParameter(timeInterval, "");
                ((AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity)).updateIntervalAndCall(timeInterval);
                Unit unit = Unit.INSTANCE;
                throw null;
            }

            private static final Unit component2(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 87;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                sfcManageAndViewDataActivity.finish();
                Unit unit = Unit.INSTANCE;
                int i4 = ShareDataUIState + 63;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unit;
            }

            private static final Unit component1(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, State state) {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                    Intrinsics.checkNotNullParameter(state, "");
                    AirtimeUsageViewModel airtimeUsageViewModel = (AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity);
                    int iComponent2 = HttpParserKt.component2.component2();
                    int iComponent22 = HttpParserKt.component2.component2();
                    airtimeUsageViewModel.updateIntervalAndCall(((AirtimeUsageState) component3(-1501648552, HttpParserKt.component2.component2(), new Object[]{state}, HttpParserKt.component2.component2(), iComponent22, iComponent2, 1501648555)).getSelectedInterval());
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                Intrinsics.checkNotNullParameter(state, "");
                AirtimeUsageViewModel airtimeUsageViewModel2 = (AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity);
                int iComponent23 = HttpParserKt.component2.component2();
                int iComponent24 = HttpParserKt.component2.component2();
                airtimeUsageViewModel2.updateIntervalAndCall(((AirtimeUsageState) component3(-1501648552, HttpParserKt.component2.component2(), new Object[]{state}, HttpParserKt.component2.component2(), iComponent24, iComponent23, 1501648555)).getSelectedInterval());
                Unit unit = Unit.INSTANCE;
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final Unit component4(final SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                SfcManageAndViewDataActivity.access$showChainedDatePicker(sfcManageAndViewDataActivity, new Function1() {
                    private static int component1 = 0;
                    private static int component2 = 1;

                    @Override
                    public final Object invoke(Object obj) {
                        int i2 = 2 % 2;
                        int i3 = component2 + 17;
                        component1 = i3 % 128;
                        int i4 = i3 % 2;
                        SfcManageAndViewDataActivity sfcManageAndViewDataActivity2 = sfcManageAndViewDataActivity;
                        TimeInterval timeInterval = (TimeInterval) obj;
                        if (i4 == 0) {
                            return SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.copydefault(sfcManageAndViewDataActivity2, timeInterval);
                        }
                        SfcManageAndViewDataActivity.ShareDataUIState.AnonymousClass5.copydefault(sfcManageAndViewDataActivity2, timeInterval);
                        throw null;
                    }
                });
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 3;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return unit;
                }
                throw null;
            }

            private static final Unit ShareDataUIState(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, AccountUsage accountUsage) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                Intrinsics.checkNotNullParameter(accountUsage, "");
                RouteUtils.routeWithExecute(RoutePathConstants.INDIVIDUAL_USAGE, BundleKt.bundleOf(TuplesKt.to(SfcIndividualUsageActivity.BUNDLE_PARAM, new IndividualUsageBundleParam(accountUsage, ((AirtimeUsageViewModel) SfcManageAndViewDataActivity.access$getViewModel$p(sfcManageAndViewDataActivity)).getSelectedInterval().getValue()))));
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 107;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static final Unit copydefault(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                sfcManageAndViewDataActivity.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                Unit unit = Unit.INSTANCE;
                int i2 = copydefault + 83;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                return unit;
            }

            private static final Unit ShareDataUIState(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, int i, String str) {
                int i2 = 2 % 2;
                int i3 = copydefault + 99;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                Intrinsics.checkNotNullParameter(str, "");
                SfcManageAndViewDataActivity.access$getDataUsageViewModel(sfcManageAndViewDataActivity).updateSelection(i);
                SfcManageAndViewDataActivity.access$handleDataUsageIntervalSelection(sfcManageAndViewDataActivity, str);
                Unit unit = Unit.INSTANCE;
                int i5 = copydefault + 121;
                ShareDataUIState = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 93 / 0;
                }
                return unit;
            }

            private static Object component2(Object[] objArr) {
                int i = 2 % 2;
                int i2 = copydefault + 47;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unit = Unit.INSTANCE;
                if (i3 != 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            private static final DeviceUsageDataState ShareDataUIState(State<DeviceUsageDataState> state) {
                int i = 2 % 2;
                int i2 = copydefault + 93;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                DeviceUsageDataState value = state.getValue();
                if (i3 == 0) {
                    int i4 = 33 / 0;
                }
                return value;
            }

            private static final LifecyclePauseOrDisposeEffectResult component1(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope) {
                int i = 2 % 2;
                Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
                Intrinsics.checkNotNullParameter(lifecycleResumePauseEffectScope, "");
                SfcManageAndViewDataActivity.access$checkAndRequestDataUsage(sfcManageAndViewDataActivity);
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResult = new LifecyclePauseOrDisposeEffectResult() {
                    private static int component3 = 0;
                    private static int copydefault = 1;

                    @Override
                    public void runPauseOrOnDisposeEffect() {
                        int i2 = 2 % 2;
                        int i3 = copydefault + 79;
                        int i4 = i3 % 128;
                        component3 = i4;
                        int i5 = i3 % 2;
                        LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope2 = lifecycleResumePauseEffectScope;
                        int i6 = i4 + 51;
                        copydefault = i6 % 128;
                        if (i6 % 2 != 0) {
                            return;
                        }
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                };
                int i2 = ShareDataUIState + 93;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                return lifecyclePauseOrDisposeEffectResult;
            }

            public static Unit component3(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, State state) {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 65;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent1 = component1(sfcManageAndViewDataActivity, state);
                int i4 = ShareDataUIState + 91;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unitComponent1;
                }
                throw null;
            }

            public static Unit copydefault(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, int i, String str) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 53;
                copydefault = i3 % 128;
                int i4 = i3 % 2;
                Unit unitShareDataUIState = ShareDataUIState(sfcManageAndViewDataActivity, i, str);
                int i5 = ShareDataUIState + 113;
                copydefault = i5 % 128;
                int i6 = i5 % 2;
                return unitShareDataUIState;
            }

            public static LifecyclePauseOrDisposeEffectResult component3(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope) {
                int i = 2 % 2;
                int i2 = copydefault + 73;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                LifecyclePauseOrDisposeEffectResult lifecyclePauseOrDisposeEffectResultComponent1 = component1(sfcManageAndViewDataActivity, lifecycleResumePauseEffectScope);
                int i4 = ShareDataUIState + 31;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return lifecyclePauseOrDisposeEffectResultComponent1;
                }
                throw null;
            }

            public static Unit component2(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, AccountUsage accountUsage) {
                int i = 2 % 2;
                int i2 = copydefault + 123;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return ShareDataUIState(sfcManageAndViewDataActivity, accountUsage);
                }
                ShareDataUIState(sfcManageAndViewDataActivity, accountUsage);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit ShareDataUIState(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
                int i = 2 % 2;
                int i2 = copydefault + 33;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return component2(sfcManageAndViewDataActivity, timeInterval);
                }
                component2(sfcManageAndViewDataActivity, timeInterval);
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component3(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 39;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                Unit unitComponent4 = component4(sfcManageAndViewDataActivity);
                int i4 = ShareDataUIState + 57;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                return unitComponent4;
            }

            public static Unit ShareDataUIState(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                return (Unit) component3(-1358851742, HttpParserKt.component2.component2(), new Object[]{sfcManageAndViewDataActivity}, HttpParserKt.component2.component2(), iComponent22, iComponent2, 1358851743);
            }

            public static Unit copydefault(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
                int i = 2 % 2;
                int i2 = copydefault + 25;
                ShareDataUIState = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                Unit unit = (Unit) component3(1132045292, HttpParserKt.component2.component2(), new Object[]{sfcManageAndViewDataActivity, timeInterval}, HttpParserKt.component2.component2(), iComponent22, iComponent2, -1132045292);
                int i4 = ShareDataUIState + 3;
                copydefault = i4 % 128;
                if (i4 % 2 == 0) {
                    return unit;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            public static Unit component1() {
                int i = 2 % 2;
                int i2 = ShareDataUIState + 17;
                copydefault = i2 % 128;
                int i3 = i2 % 2;
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                Unit unit = (Unit) component3(1422911349, HttpParserKt.component2.component2(), new Object[0], HttpParserKt.component2.component2(), iComponent22, iComponent2, -1422911347);
                int i4 = ShareDataUIState + 41;
                copydefault = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 48 / 0;
                }
                return unit;
            }

            public static Unit component1(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                int i = 2 % 2;
                int i2 = copydefault + 63;
                ShareDataUIState = i2 % 128;
                if (i2 % 2 != 0) {
                    return copydefault(sfcManageAndViewDataActivity);
                }
                copydefault(sfcManageAndViewDataActivity);
                throw null;
            }

            AnonymousClass5(SfcManageAndViewDataActivity sfcManageAndViewDataActivity) {
                this.component3 = sfcManageAndViewDataActivity;
            }

            private static final AirtimeUsageState component1(State<AirtimeUsageState> state) {
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                return (AirtimeUsageState) component3(-1501648552, HttpParserKt.component2.component2(), new Object[]{state}, HttpParserKt.component2.component2(), iComponent22, iComponent2, 1501648555);
            }

            private static final Unit component3() {
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                return (Unit) component3(1422911349, HttpParserKt.component2.component2(), new Object[0], HttpParserKt.component2.component2(), iComponent22, iComponent2, -1422911347);
            }

            private static final Unit component3(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
                int iComponent2 = HttpParserKt.component2.component2();
                int iComponent22 = HttpParserKt.component2.component2();
                return (Unit) component3(1132045292, HttpParserKt.component2.component2(), new Object[]{sfcManageAndViewDataActivity, timeInterval}, HttpParserKt.component2.component2(), iComponent22, iComponent2, -1132045292);
            }
        }

        @Override
        public Unit invoke(Composer composer, Integer num) {
            int i = 2 % 2;
            int i2 = component3 + 45;
            component2 = i2 % 128;
            int i3 = i2 % 2;
            component1(composer, num.intValue());
            Unit unit = Unit.INSTANCE;
            int i4 = component3 + 119;
            component2 = i4 % 128;
            int i5 = i4 % 2;
            return unit;
        }

        public final void component1(Composer composer, int i) {
            int i2 = 2 % 2;
            int i3 = component3 + 81;
            component2 = i3 % 128;
            if (i3 % 2 != 0 ? (i & 11) == 2 : (i & 7) == 4) {
                if (composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                } else {
                    int i4 = component3 + 67;
                    component2 = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            OneAppThemeKt.OneAppTheme(false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(863055238, true, new AnonymousClass5(SfcManageAndViewDataActivity.this), composer, 54), composer, 1572864, 63);
        }

        ShareDataUIState() {
        }
    }

    private static void g(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        ITrustedWebActivityServiceDefault iTrustedWebActivityServiceDefault = new ITrustedWebActivityServiceDefault();
        char[] cArrComponent2 = ITrustedWebActivityServiceDefault.component2(component3 ^ 6728534956745174161L, cArr, i);
        iTrustedWebActivityServiceDefault.copydefault = 4;
        int i3 = $10 + 103;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (iTrustedWebActivityServiceDefault.copydefault < cArrComponent2.length) {
            int i5 = $10 + 87;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            iTrustedWebActivityServiceDefault.ShareDataUIState = iTrustedWebActivityServiceDefault.copydefault - 4;
            int i7 = iTrustedWebActivityServiceDefault.copydefault;
            try {
                Object[] objArr2 = {Long.valueOf(cArrComponent2[iTrustedWebActivityServiceDefault.copydefault] ^ cArrComponent2[iTrustedWebActivityServiceDefault.copydefault % 4]), Long.valueOf(iTrustedWebActivityServiceDefault.ShareDataUIState), Long.valueOf(component3)};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-2082170109);
                if (objCopydefault == null) {
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(7032 - KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionChild(0L) + 35, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 63439), 1186808934, false, "a", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrComponent2[i7] = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {iTrustedWebActivityServiceDefault, iTrustedWebActivityServiceDefault};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1256628055);
                    if (objCopydefault2 == null) {
                        byte b2 = (byte) 0;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(TextUtils.lastIndexOf("", '0', 0) + 1391, 18 - TextUtils.getTrimmedLength(""), (char) (51269 - TextUtils.getTrimmedLength("")), -1883291598, false, $$r(b2, (byte) (b2 | 8), b2), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrComponent2, 4, cArrComponent2.length - 4);
    }

    private static void h(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannelDefault iNotificationSideChannelDefault = new INotificationSideChannelDefault();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        iNotificationSideChannelDefault.component3 = 0;
        char[] cArr3 = new char[2];
        while (iNotificationSideChannelDefault.component3 < cArr.length) {
            int i6 = $10 + 89;
            $11 = i6 % 128;
            int i7 = i6 % i3;
            cArr3[i5] = cArr[iNotificationSideChannelDefault.component3];
            cArr3[1] = cArr[iNotificationSideChannelDefault.component3 + 1];
            int i8 = 58224;
            int i9 = i5;
            while (i9 < 16) {
                int i10 = $11 + 3;
                $10 = i10 % 128;
                int i11 = i10 % i3;
                char c2 = cArr3[1];
                char c3 = cArr3[i5];
                int i12 = (c3 + i8) ^ ((c3 << 4) + ((char) (((long) equals) ^ 4374495167426960553L)));
                int i13 = c3 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(copy);
                    objArr2[i3] = Integer.valueOf(i13);
                    objArr2[1] = Integer.valueOf(i12);
                    objArr2[0] = Integer.valueOf(c2);
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(844 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarSize() >> 8) + 32, (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 23251), 592652048, false, $$r(b2, b3, b3), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objCopydefault).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) ShareDataUIState) ^ 4374495167426960553L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(component4)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-435488651);
                    if (objCopydefault2 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getWindowTouchSlop() >> 8) + 844, TextUtils.lastIndexOf("", '0', 0, 0) + 33, (char) ((KeyEvent.getMaxKeyCode() >> 16) + 23251), 592652048, false, $$r(b4, b5, b5), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objCopydefault2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                    i9++;
                    int i14 = $10 + 89;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    i3 = 2;
                    i5 = 0;
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
                i2 = 2;
                objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 465, 49 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) KeyEvent.keyCodeFromString(""), 1194533216, false, "m", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objCopydefault3).invoke(null, objArr4);
            i3 = i2;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(char c2, char[] cArr, int i, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        INotificationSideChannel iNotificationSideChannel = new INotificationSideChannel();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c2);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        iNotificationSideChannel.copydefault = 0;
        while (iNotificationSideChannel.copydefault < length3) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            try {
                Object[] objArr2 = {iNotificationSideChannel};
                Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-1264091845);
                if (objCopydefault == null) {
                    byte b2 = (byte) 0;
                    objCopydefault = ITrustedWebActivityCallbackDefault.copydefault((Process.myPid() >> 22) + 4037, (ViewConfiguration.getTouchSlop() >> 8) + 31, (char) (19181 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), 1912513118, false, $$r(b2, (byte) (b2 | Ascii.FF), b2), new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objCopydefault).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {iNotificationSideChannel};
                Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(-1295069673);
                if (objCopydefault2 == null) {
                    objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault((ViewConfiguration.getDoubleTapTimeout() >> 16) + 7567, 10 - ImageFormat.getBitsPerPixel(0), (char) TextUtils.getOffsetAfter("", 0), 2006389106, false, "e", new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objCopydefault2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {iNotificationSideChannel, Integer.valueOf(cArr4[iNotificationSideChannel.copydefault % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-221183336);
                if (objCopydefault3 == null) {
                    byte b3 = (byte) 0;
                    objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(2459 - (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 931716605, false, $$r(b3, (byte) (b3 | 13), b3), new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objCopydefault3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-653660026);
                if (objCopydefault4 == null) {
                    i2 = 2;
                    objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(7567 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 12, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 475017187, false, "d", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objCopydefault4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = iNotificationSideChannel.component3;
                cArr6[iNotificationSideChannel.copydefault] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[iNotificationSideChannel.copydefault])) ^ (component1 ^ (-3780477796495014671L))) ^ ((long) ((int) (((long) component2) ^ (-3780477796495014671L))))) ^ ((long) ((char) (((long) copydefault) ^ (-3780477796495014671L)))));
                iNotificationSideChannel.copydefault++;
                int i7 = $11 + 107;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        g(1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), new char[]{60705, 60736, 6798, 14438, 4018, 8105, 19162, 30793, 26454, 38033, 49394, 60973, 63870, 3747, 22176, 25659, 29467, 63687, 60549, 6678, 50482, 29427}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) - 96, new char[]{50355, 5027, 63629, 3755, 59254, 5768}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952716_res_0x7f13044c).substring(6, 7).codePointAt(0) - 6, new char[]{41123, 49982, 21494, 29940, 13366, 27112, 18723, 38475, 49010, 13622, 19337, 63144, 13433, 20840, 13528, 7732, 34137, 49983, 1872, 29110, 965, 28977, 25919, 64882, 11016, 16853}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 11, new char[]{9020, 7885, 36466, 47227, 49489, 31202, 35715, 8782, 55879, 16826, 25575, 54681, 1363, 45380, 13528, 7732, 56933, 27281}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = getAsAtTimestamp + 27;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = getRequestBeneficiariesState + 45;
                getAsAtTimestamp = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.keyCodeFromString(""), View.combineMeasuredStates(0, 0) + 42, (char) View.MeasureSpec.getSize(0), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 19, new char[]{45790, 55557, 35443, 5481, 6159, 56061, 17560, 56402, 37324, 59219, 21602, 42932, 60942, 39969, 31877, 35402, 16961, 20239, 11889, 47808, 51074, 23983, 2419, 62756, 49040, 5366, 61641, 51560, 37980, 19714, 39612, 12664, 15564, 3133, 54097, 165, 29946, 38600, 1363, 45380, 40863, 9109, 37667, 60820, 28643, 16805, 13289, 39563}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 33, new char[]{44593, 21086, 21229, 7699, 32614, 35468, 590, 16207, 47667, 42549, 20920, 40735, 24858, 36409, 590, 16207, 15710, 26460, 62279, 1855, 64898, 34753, 55514, 41709, 5843, 27000, 10754, 41763, 39575, 40910, 23038, 31326, 22384, 14088, 1455, 52295, 54189, 26276, 16803, 7375, 17344, 59030, 48403, 59564, 32696, 16332, 58205, 17426, 40861, 53639, 21904, 7906, 59390, 26814, 27313, 56834, 19071, 52304, 2050, 53357, 48402, 24272, 21602, 42932}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    h((ViewConfiguration.getLongPressTimeout() >> 16) + 64, new char[]{64898, 34753, 64520, 65433, 11875, 26691, 35242, 13714, 54535, 3868, 29879, 5799, 27699, 28425, 35539, 49286, 48696, 29094, 11889, 47808, 1875, 50703, 9737, 12433, 14467, 19545, 19071, 52304, 10754, 41763, 3327, 40631, 553, 39722, 30853, 41178, 48226, 2448, 35882, 21716, 56341, 12126, 32410, 25225, 16832, 29864, 40506, 36541, 63189, 27018, 22512, 15039, 31226, 65249, 35120, 19412, 21285, 4851, 15246, 20942, 40863, 9109, 60420, 62763}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    h((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, new char[]{65481, 34648, 54675, 5600, 58142, 41461, 64240, 61179, 39364, 30987, 59491, 40702, 3327, 40631, 11107, 12271, 11875, 26691, 50067, 4108, 28643, 16805, 1455, 52295, 20743, 46225, 18123, 20830, 15564, 3133, 36871, 52248, 43322, 44263, 62467, 45160, 7407, 27649, 58480, 42065, 6866, 36528, 10295, 42160, 58480, 42065, 62641, 19402, 11811, 48438, 30292, 59550, 49010, 13622, 11543, 25379, 33176, 14962, 45962, 26517, 58967, 26575, 21706, 57051, 21548, 28097, 54446, 54652, 49489, 31202, 42092, 19339}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 23, new char[]{9331, 1226, 20920, 40735, 45875, 41623}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    h(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37, new char[]{22615, 32750, 5728, 32688, 40751, 29254, 31531, 25797, 1761, 1967, 22384, 14088, 14427, 33387, 11107, 12271, 22055, 7796, 4028, 42110, 16599, 61264, 27709, 52267, 2419, 62756, 64996, 42171, 17945, 19503, 24858, 36409, 55545, 65529, 27699, 28425}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], Integer.valueOf(CacheConstants.DAY)};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(1322030854);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(6561 - ((byte) KeyEvent.getModifierMetaStateMask()), 55 - MotionEvent.axisFromString(""), (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1953150877, false, "copydefault", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr12);
                    int i6 = getAsAtTimestamp + 91;
                    getRequestBeneficiariesState = i6 % 128;
                    int i7 = i6 % 2;
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
            int iRed = 2405 - Color.red(0);
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
            char cResolveSize = (char) View.resolveSize(0, 0);
            byte[] bArr = $$d;
            Object[] objArr13 = new Object[1];
            i(bArr[12], bArr[33], bArr[31], objArr13);
            objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(iRed, touchSlop, cResolveSize, -2047739879, false, (String) objArr13[0], null);
        }
        if (((Field) objCopydefault3).getLong(null) != -1) {
            Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
            if (objCopydefault4 == null) {
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 2405;
                int i8 = 26 + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                char size = (char) View.MeasureSpec.getSize(0);
                byte b2 = $$d[31];
                Object[] objArr14 = new Object[1];
                i(b2, r0[8], b2, objArr14);
                objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(offsetAfter, i8, size, 24929979, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objCopydefault4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(16) + SecLiteException.ERROR_API_KEY_OR_SIGN, new char[]{47825, 47803, 10529, 3014, 14397, 10102, 32071, 16517, 12519, 42804, 63352, 54962, 44678, 15710, 24914, 23757, 9450, 52092, 56076, 8897}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            g(Gravity.getAbsoluteGravity(0, 0), new char[]{18907, 18866, 34304, 42210, 10115, 51718, 25322, 44538, 50103, 2069, 59603, 15317, 23971, 37429, 32460, 45484, 55248, 25667, 50355, 53177}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 250251364};
                Object[] objArr18 = new Object[1];
                h(26 - View.resolveSizeAndState(0, 0, 0), new char[]{41123, 49982, 21494, 29940, 13366, 27112, 18723, 38475, 49010, 13622, 19337, 63144, 13433, 20840, 13528, 7732, 34137, 49983, 1872, 29110, 965, 28977, 25919, 64882, 11016, 16853}, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                h(ExpandableListView.getPackedPositionType(0L) + 18, new char[]{9020, 7885, 36466, 47227, 49489, 31202, 35715, 8782, 55879, 16826, 25575, 54681, 1363, 45380, 13528, 7732, 56933, 27281}, new Object[1]);
                Object[] objArr19 = new Object[1];
                j((char) (54641 - (ViewConfiguration.getTapTimeout() >> 16)), new char[]{423, 17184, 55401, 31683}, ((Context) cls4.getMethod((String) r12[0], new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131954889_res_0x7f130cc9).substring(0, 1).codePointAt(0) - 8226, new char[]{17355, 21023, 25727, 50844, 33548, 63412, 10979, 26664, 49081, 26710, 64755, 49503, 51232, 23056, 63401, 29491, 40601, 15997, 63160, 11201, 58946, 63139, 32425, 45945, 48174, 20945, 61342, 709, 53736, 18833, 4298, 47551, 35298, 6164, 63705, 47081, 57581, 3851, 20024, 28495, 32749, 64971, 8742, 17867, 29073, 51874, 55212, 56657, 19324, 20085, 16492, 63508, 33513, 61558, 55374, 47215, 51259, 13068, 4670, 25535, 35677, 4455, 36550, 16333, 30952, 4350, 33427, 22512, 51234, 22187}, new char[]{2980, 6684, 29176, 49365}, objArr19);
                Class<?> cls5 = Class.forName(((String) objArr19[0]).intern());
                byte b3 = $$s[27];
                Object[] objArr20 = new Object[1];
                k(b3, r6[5], b3, objArr20);
                objArr = (Object[]) cls5.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(-1004160546);
                if (objCopydefault5 == null) {
                    int i9 = 2405 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                    char fadingEdgeLength = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                    byte b4 = $$d[31];
                    Object[] objArr21 = new Object[1];
                    i(b4, r9[8], b4, objArr21);
                    objCopydefault5 = ITrustedWebActivityCallbackDefault.copydefault(i9, offsetBefore, fadingEdgeLength, 24929979, false, (String) objArr21[0], null);
                }
                ((Field) objCopydefault5).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952719_res_0x7f13044f).substring(6, 7).codePointAt(0) - 10, new char[]{41123, 49982, 21494, 29940, 13366, 27112, 18723, 38475, 8862, 64384, 20674, 37584, 48387, 39144, 51473, 33588, 5711, 54717, 40829, 44383, 22314, 56433}, objArr22);
                    Class<?> cls6 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    g(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952793_res_0x7f130499).substring(6, 7).length() - 1, new char[]{35000, 35037, 50729, 58563, 43642, 18632, 61207, 12074, 723, 18488, 25914, 47408, 40173, 53780, 62250, 13182, 5785, 9312, 18763}, objArr23);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(1464076622);
                    if (objCopydefault6 == null) {
                        int iIndexOf = 2404 - TextUtils.indexOf((CharSequence) "", '0');
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                        Object[] objArr24 = new Object[1];
                        i(r10[9], (byte) (-$$d[38]), r10[33], objArr24);
                        objCopydefault6 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf, iResolveSizeAndState, modifierMetaStateMask, -1843538389, false, (String) objArr24[0], null);
                    }
                    ((Field) objCopydefault6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(1084761980);
                    if (objCopydefault7 == null) {
                        int iIndexOf2 = TextUtils.indexOf("", "", 0) + 2405;
                        int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                        char cRed = (char) Color.red(0);
                        byte[] bArr2 = $$d;
                        byte b5 = bArr2[12];
                        byte b6 = bArr2[33];
                        byte b7 = bArr2[31];
                        Object[] objArr25 = new Object[1];
                        i(b5, b6, b7, objArr25);
                        objCopydefault7 = ITrustedWebActivityCallbackDefault.copydefault(iIndexOf2, i10, cRed, -2047739879, false, (String) objArr25[0], null);
                    }
                    ((Field) objCopydefault7).set(null, lValueOf2);
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
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
            if (objCopydefault8 == null) {
                objCopydefault8 = ITrustedWebActivityCallbackDefault.copydefault(View.getDefaultSize(0, 0) + 6618, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) KeyEvent.normalizeMetaState(0), 428292935, false, "ShareDataUIState", new Class[0]);
            }
            Object objInvoke2 = ((Method) objCopydefault8).invoke(null, null);
            try {
                Object[] objArr26 = {-512186178, Long.valueOf(j4), new ArrayList(), null, true};
                Class cls7 = (Class) ITrustedWebActivityCallbackDefault.copydefault(6562 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 57, (char) TextUtils.getCapsMode("", 0, 0));
                byte b8 = $$s[27];
                Object[] objArr27 = new Object[1];
                k(b8, r5[44], b8, objArr27);
                cls7.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        EdgeToEdge.enable$default(this, null, null, 3, null);
        super.onCreate(savedInstanceState);
        ((AirtimeUsageViewModel) this.viewModel).updateIntervalAndCall(Intervals.INSTANCE.getCurrentPeriod());
        ((ActivityBaseComposeBinding) this.binding).composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1497019235, true, new ShareDataUIState()));
    }

    private final void checkAndRequestDataUsage() {
        int i = 2 % 2;
        boolean zCheckForPermission = checkForPermission(this);
        getDataUsageViewModel().updatePermissionStatus(zCheckForPermission);
        if (!(!zCheckForPermission)) {
            int i2 = getRequestBeneficiariesState + 79;
            getAsAtTimestamp = i2 % 128;
            if (i2 % 2 == 0) {
                DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getCurrentPeriod(), null, 4, null);
            } else {
                DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getCurrentPeriod(), null, 2, null);
            }
        }
        int i3 = getRequestBeneficiariesState + 99;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void handleDataUsageIntervalSelection(String label) {
        DeviceDataUsageViewModel dataUsageViewModel;
        TimeInterval currentPeriod;
        int i;
        int i2 = 2 % 2;
        if (Intrinsics.areEqual(label, IntervalTypes.TODAY.getType())) {
            int i3 = getAsAtTimestamp + 103;
            getRequestBeneficiariesState = i3 % 128;
            int i4 = i3 % 2;
            DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getToday(), null, 2, null);
            return;
        }
        if (Intrinsics.areEqual(label, IntervalTypes.YESTERDAY.getType())) {
            int i5 = getRequestBeneficiariesState + 97;
            getAsAtTimestamp = i5 % 128;
            if (i5 % 2 != 0) {
                DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getYesterday(), null, 2, null);
                return;
            } else {
                dataUsageViewModel = getDataUsageViewModel();
                currentPeriod = Intervals.INSTANCE.getYesterday();
                i = 4;
            }
        } else {
            if (Intrinsics.areEqual(label, IntervalTypes.LAST_SEVEN_DAYS.getType())) {
                int i6 = getRequestBeneficiariesState + 109;
                getAsAtTimestamp = i6 % 128;
                int i7 = i6 % 2;
                DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getLast7days(), null, 2, null);
                return;
            }
            if (!Intrinsics.areEqual(label, IntervalTypes.MONTHLY.getType())) {
                if (!Intrinsics.areEqual(label, IntervalTypes.LAST_THIRTY_DAYS.getType())) {
                    if (Intrinsics.areEqual(label, IntervalTypes.CUSTOM_PERIOD.getType())) {
                        showChainedDatePicker(new Function1() {
                            private static int ShareDataUIState = 1;
                            private static int copydefault;

                            @Override
                            public final Object invoke(Object obj) {
                                int i8 = 2 % 2;
                                int i9 = ShareDataUIState + 17;
                                copydefault = i9 % 128;
                                int i10 = i9 % 2;
                                Unit unitM10714$r8$lambda$MwTLmPrLoBqhi_G2_MwyMPHA = SfcManageAndViewDataActivity.m10714$r8$lambda$MwTLmPrLoBqhi_G2_MwyMPHA(this.f$0, (TimeInterval) obj);
                                int i11 = copydefault + 75;
                                ShareDataUIState = i11 % 128;
                                int i12 = i11 % 2;
                                return unitM10714$r8$lambda$MwTLmPrLoBqhi_G2_MwyMPHA;
                            }
                        });
                        return;
                    }
                    return;
                } else {
                    int i8 = getRequestBeneficiariesState + 51;
                    getAsAtTimestamp = i8 % 128;
                    int i9 = i8 % 2;
                    DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getLast30days(), null, 2, null);
                    return;
                }
            }
            int i10 = getAsAtTimestamp + 45;
            getRequestBeneficiariesState = i10 % 128;
            if (i10 % 2 == 0) {
                DeviceDataUsageViewModel.getUsage$default(getDataUsageViewModel(), Intervals.INSTANCE.getCurrentPeriod(), null, 2, null);
                return;
            } else {
                dataUsageViewModel = getDataUsageViewModel();
                currentPeriod = Intervals.INSTANCE.getCurrentPeriod();
                i = 5;
            }
        }
        DeviceDataUsageViewModel.getUsage$default(dataUsageViewModel, currentPeriod, null, i, null);
    }

    private static final Unit handleDataUsageIntervalSelection$lambda$0(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 21;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
        Intrinsics.checkNotNullParameter(timeInterval, "");
        DeviceDataUsageViewModel.getUsage$default(sfcManageAndViewDataActivity.getDataUsageViewModel(), timeInterval, null, 2, null);
        Unit unit = Unit.INSTANCE;
        int i4 = getAsAtTimestamp + 41;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    private final boolean checkForPermission(Context context) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 91;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        try {
            Object systemService = context.getSystemService("appops");
            Intrinsics.checkNotNull(systemService, "");
            if (((AppOpsManager) systemService).checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) == 0) {
                int i4 = getAsAtTimestamp + 67;
                getRequestBeneficiariesState = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 3 / 2;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static final void showChainedDatePicker$lambda$4(SfcDatePickerDialog sfcDatePickerDialog, final SfcManageAndViewDataActivity sfcManageAndViewDataActivity, final Calendar calendar, final Function1 function1, View view) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(sfcDatePickerDialog, "");
        Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        final Calendar selectedCalendar = sfcDatePickerDialog.getSelectedCalendar();
        sfcDatePickerDialog.dismiss();
        ((ActivityBaseComposeBinding) sfcManageAndViewDataActivity.binding).getRoot().post(new Runnable() {
            private static int ShareDataUIState = 0;
            private static int copydefault = 1;

            @Override
            public final void run() {
                int i2 = 2 % 2;
                int i3 = copydefault + 9;
                ShareDataUIState = i3 % 128;
                int i4 = i3 % 2;
                SfcManageAndViewDataActivity sfcManageAndViewDataActivity2 = this.f$0;
                if (i4 == 0) {
                    SfcManageAndViewDataActivity.$r8$lambda$JTnUxaybTtlH_6B_2neI0pZviuI(sfcManageAndViewDataActivity2, selectedCalendar, calendar, function1);
                } else {
                    SfcManageAndViewDataActivity.$r8$lambda$JTnUxaybTtlH_6B_2neI0pZviuI(sfcManageAndViewDataActivity2, selectedCalendar, calendar, function1);
                    int i5 = 63 / 0;
                }
            }
        });
        int i2 = getRequestBeneficiariesState + 25;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void showChainedDatePicker$lambda$4$lambda$3$lambda$2(SfcDatePickerDialog sfcDatePickerDialog, Function1 function1, Calendar calendar, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 13;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(sfcDatePickerDialog, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Calendar selectedCalendar = sfcDatePickerDialog.getSelectedCalendar();
        sfcDatePickerDialog.dismiss();
        function1.invoke(Intervals.INSTANCE.getIntervalFromStartEnd(calendar.getTimeInMillis(), selectedCalendar.getTimeInMillis()));
        int i4 = getRequestBeneficiariesState + 47;
        getAsAtTimestamp = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void showChainedDatePicker$lambda$4$lambda$3(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, final Calendar calendar, Calendar calendar2, final Function1 function1) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
            Intrinsics.checkNotNullParameter(function1, "");
            sfcManageAndViewDataActivity.isFinishing();
            throw null;
        }
        Intrinsics.checkNotNullParameter(sfcManageAndViewDataActivity, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (sfcManageAndViewDataActivity.isFinishing()) {
            return;
        }
        final SfcDatePickerDialog sfcDatePickerDialog = new SfcDatePickerDialog("Set End Date", calendar, calendar2, calendar2);
        sfcDatePickerDialog.setOnConfirmClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int copydefault;

            @Override
            public final void onClick(View view) {
                int i3 = 2 % 2;
                int i4 = ShareDataUIState + 49;
                copydefault = i4 % 128;
                int i5 = i4 % 2;
                SfcManageAndViewDataActivity.$r8$lambda$CEmkIh00Vc3we5dLLzA8QhgVlNs(sfcDatePickerDialog, function1, calendar, view);
                int i6 = copydefault + 85;
                ShareDataUIState = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
            }
        });
        sfcDatePickerDialog.show(sfcManageAndViewDataActivity.getSupportFragmentManager(), "endDate");
        int i3 = getRequestBeneficiariesState + 101;
        getAsAtTimestamp = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void showChainedDatePicker(final Function1<? super TimeInterval, Unit> onIntervalSelected) {
        int i = 2 % 2;
        final Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(1, -2);
        final SfcDatePickerDialog sfcDatePickerDialog = new SfcDatePickerDialog("Set Start Date", calendar2, calendar, calendar);
        sfcDatePickerDialog.setOnConfirmClickListener(new View.OnClickListener() {
            private static int ShareDataUIState = 1;
            private static int component2;

            @Override
            public final void onClick(View view) {
                int i2 = 2 % 2;
                int i3 = ShareDataUIState + 111;
                component2 = i3 % 128;
                int i4 = i3 % 2;
                SfcDatePickerDialog sfcDatePickerDialog2 = sfcDatePickerDialog;
                if (i4 == 0) {
                    SfcManageAndViewDataActivity.m10713$r8$lambda$BsWIIx54DYzmdvaIMONlLbbmo(sfcDatePickerDialog2, this, calendar, onIntervalSelected, view);
                    return;
                }
                SfcManageAndViewDataActivity.m10713$r8$lambda$BsWIIx54DYzmdvaIMONlLbbmo(sfcDatePickerDialog2, this, calendar, onIntervalSelected, view);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        if (!(!isFinishing())) {
            return;
        }
        int i2 = getRequestBeneficiariesState + 63;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        sfcDatePickerDialog.show(getSupportFragmentManager(), "startDate");
        int i4 = getAsAtTimestamp + 109;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 % 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.onResume():void");
    }

    @Override
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 3, new char[]{41123, 49982, 21494, 29940, 13366, 27112, 18723, 38475, 49010, 13622, 19337, 63144, 13433, 20840, 13528, 7732, 34137, 49983, 1872, 29110, 965, 28977, 25919, 64882, 11016, 16853}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            h(((Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.safaricom.mpesa.lifestyle.R.string._2131952847_res_0x7f1304cf).substring(21, 22).length() + 17, new char[]{9020, 7885, 36466, 47227, 49489, 31202, 35715, 8782, 55879, 16826, 25575, 54681, 1363, 45380, 13528, 7732, 56933, 27281}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i2 = getAsAtTimestamp + 93;
                getRequestBeneficiariesState = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        if (baseContext != null) {
            int i4 = getRequestBeneficiariesState + 117;
            getAsAtTimestamp = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault == null) {
                        objCopydefault = ITrustedWebActivityCallbackDefault.copydefault(6618 - KeyEvent.normalizeMetaState(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 43, (char) (ViewConfiguration.getScrollBarSize() >> 8), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke = ((Method) objCopydefault).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault2 == null) {
                        objCopydefault2 = ITrustedWebActivityCallbackDefault.copydefault(Color.alpha(0) + 6562, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 56, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault2).invoke(objInvoke, objArr3);
                    int i5 = 53 / 0;
                } else {
                    Object objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(-589372382);
                    if (objCopydefault3 == null) {
                        objCopydefault3 = ITrustedWebActivityCallbackDefault.copydefault(((byte) KeyEvent.getModifierMetaStateMask()) + 6619, 42 - (ViewConfiguration.getTouchSlop() >> 8), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 428292935, false, "ShareDataUIState", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objCopydefault3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(65378785);
                    if (objCopydefault4 == null) {
                        objCopydefault4 = ITrustedWebActivityCallbackDefault.copydefault(Drawable.resolveOpacity(0, 0) + 6562, 55 - TextUtils.lastIndexOf("", '0', 0), (char) TextUtils.getTrimmedLength(""), -960739708, false, "component3", new Class[]{Context.class});
                    }
                    ((Method) objCopydefault4).invoke(objInvoke2, objArr4);
                }
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

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|2|(2:(2:9|(2:11|(1:15)(1:14))(0))(1:16)|(9:18|895|19|(1:21)|22|23|24|(1:26)|27)(1:7))(0)|31|(11:909|32|(2:838|34)|38|39|890|(5:41|42|(1:44)|45|46)(19:48|49|900|50|51|891|52|(2:824|54)|58|59|60|(2:915|62)|66|67|68|(1:70)(1:71)|72|(1:74)|75)|47|76|(9:79|876|80|(1:82)|83|84|85|857|86)|87)|123|872|124|(2:914|126)|130|131|835|(3:133|(4:135|136|(1:138)|139)(3:140|(1:142)|143)|144)(19:145|146|848|147|(3:149|844|150)|154|155|836|156|(2:865|158)|162|163|164|(1:166)|167|(3:169|170|171)(1:172)|173|(1:175)|176)|177|(4:181|(3:937|183|940)(12:936|184|(3:186|(3:189|190|187)|941)|191|826|192|(1:194)|195|196|929|197|939)|938|178)|935|180|238|(9:913|239|(1:241)|242|(3:244|(1:246)|247)(19:248|249|907|250|(1:252)|253|254|897|255|(1:257)|258|259|260|(1:262)|263|(1:265)(1:266)|267|(1:269)|270)|271|(4:274|(3:944|276|947)(12:943|277|(3:279|(3:282|283|280)|948)|284|882|285|(1:287)|288|289|861|290|946)|945|272)|942|303)|(47:899|328|(2:330|(2:332|(2:334|338)(1:335))(2:336|337))(1:338)|375|874|376|(15:378|888|379|384|(9:386|884|387|388|880|389|390|869|391)(1:399)|867|400|401|828|(5:403|404|(1:406)|407|408)(12:(3:412|413|(1:419)(1:418))(1:421)|(21:423|424|831|425|842|426|(2:923|428)|432|433|833|434|(2:855|436)|440|441|442|(2:840|444)|445|(1:447)(1:449)|450|(2:452|453)|454)(2:506|507)|513|514|933|515|518|519|(1:521)|522|523|524)|455|(4:458|(2:460|965)(11:461|(3:463|(3:466|467|464)|966)|470|931|471|(1:473)|474|475|925|476|964)|477|456)|963|491|507)(12:384|(0)(0)|867|400|401|828|(0)(0)|455|(1:456)|963|491|507)|525|(1:527)|528|(1:530)(1:531)|532|(3:534|(1:536)|537)(16:539|540|(1:542)|543|(1:545)|546|547|(1:549)|550|902|551|552|(1:554)|555|(1:557)|558)|538|559|(1:561)(9:562|(3:564|(4:567|(3:959|569|962)(3:958|570|961)|960|565)|957)|571|572|(1:574)|575|(1:577)|578|579)|580|(1:582)|583|(3:585|(1:587)|588)(14:589|590|(1:592)|593|594|(1:596)|597|911|598|599|(1:601)(1:602)|603|(1:605)|606)|607|(1:609)(9:610|(3:612|(2:615|613)|956)|616|617|(1:619)|620|(1:622)|623|624)|625|905|626|(1:628)|629|(4:631|632|904|633)(1:634)|635|(3:637|(1:639)|640)(17:641|(2:643|(1:649)(1:648))|(19:651|652|893|653|(1:655)|656|657|886|658|(1:660)|661|662|663|(1:665)|666|(1:668)|669|(1:671)|672)|730|(1:732)|733|(3:735|(1:737)|738)(13:740|829|741|742|(1:744)|745|921|746|747|(1:749)|750|(1:752)|753)|739|754|(6:757|758|(1:760)|761|762|763)|764|(1:766)|767|(3:769|(1:771)|772)(14:774|775|(1:777)|778|779|(1:781)|782|917|783|784|(1:786)|787|(1:789)|790)|773|791|(1:967)(7:794|795|(1:797)|798|799|800|801))|673|(4:676|(3:951|678|954)(12:950|679|(3:681|(3:684|685|682)|955)|686|870|687|(1:689)|690|691|851|692|953)|952|674)|949|730|(0)|733|(0)(0)|739|754|(0)|764|(0)|767|(0)(0)|773|791|(0)(0))(1:342)|343|859|344|(1:346)|347|846|348|(1:350)|351|352|375|874|376|(0)(0)|525|(0)|528|(0)(0)|532|(0)(0)|538|559|(0)(0)|580|(0)|583|(0)(0)|607|(0)(0)|625|905|626|(0)|629|(0)(0)|635|(0)(0)|673|(1:674)|949|730|(0)|733|(0)(0)|739|754|(0)|764|(0)|767|(0)(0)|773|791|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x1ac9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x1aca, code lost:
    
        r34 = r5;
        r35 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x2d67, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x2d68, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0781 A[Catch: all -> 0x035d, TryCatch #38 {all -> 0x035d, blocks: (B:519:0x1b53, B:521:0x1b59, B:522:0x1b88, B:758:0x3120, B:760:0x3126, B:761:0x3150, B:795:0x345e, B:797:0x3464, B:798:0x3486, B:775:0x329b, B:777:0x32be, B:778:0x3316, B:724:0x2df4, B:726:0x2dfa, B:727:0x2e25, B:617:0x2703, B:619:0x2709, B:620:0x2732, B:622:0x276c, B:623:0x27b9, B:590:0x2432, B:592:0x2447, B:593:0x247c, B:572:0x213c, B:574:0x2142, B:575:0x216c, B:577:0x21a6, B:578:0x21eb, B:540:0x1dc6, B:542:0x1ddb, B:543:0x1e0f, B:545:0x1e43, B:546:0x1ebd, B:369:0x14d0, B:371:0x14d6, B:372:0x1503, B:320:0x1283, B:322:0x1289, B:323:0x12af, B:232:0x0d30, B:234:0x0d36, B:235:0x0d5e, B:117:0x077b, B:119:0x0781, B:120:0x07ab, B:19:0x0144, B:21:0x014a, B:22:0x0172, B:24:0x02cb, B:26:0x02fc, B:27:0x0357), top: B:895:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0950 A[Catch: all -> 0x0cc7, TRY_ENTER, TRY_LEAVE, TryCatch #26 {all -> 0x0cc7, blocks: (B:124:0x082a, B:130:0x087a, B:145:0x0950, B:164:0x0a58, B:167:0x0aa8, B:169:0x0ad2), top: B:872:0x082a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0b90 A[Catch: all -> 0x0cad, TryCatch #6 {all -> 0x0cad, blocks: (B:177:0x0b83, B:178:0x0b87, B:181:0x0b90, B:184:0x0ba8, B:187:0x0bb5, B:189:0x0bb8, B:201:0x0c9b, B:203:0x0ca1, B:204:0x0ca2, B:206:0x0ca4, B:208:0x0cab, B:209:0x0cac, B:220:0x0cbf, B:222:0x0cc5, B:223:0x0cc6, B:171:0x0b08, B:173:0x0b23, B:175:0x0b3a, B:176:0x0b7b, B:214:0x0cb3, B:216:0x0cb9, B:217:0x0cba, B:192:0x0be6, B:194:0x0bec, B:195:0x0c18, B:197:0x0c20), top: B:835:0x0885, inners: #1, #57 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0d36 A[Catch: all -> 0x035d, TryCatch #38 {all -> 0x035d, blocks: (B:519:0x1b53, B:521:0x1b59, B:522:0x1b88, B:758:0x3120, B:760:0x3126, B:761:0x3150, B:795:0x345e, B:797:0x3464, B:798:0x3486, B:775:0x329b, B:777:0x32be, B:778:0x3316, B:724:0x2df4, B:726:0x2dfa, B:727:0x2e25, B:617:0x2703, B:619:0x2709, B:620:0x2732, B:622:0x276c, B:623:0x27b9, B:590:0x2432, B:592:0x2447, B:593:0x247c, B:572:0x213c, B:574:0x2142, B:575:0x216c, B:577:0x21a6, B:578:0x21eb, B:540:0x1dc6, B:542:0x1ddb, B:543:0x1e0f, B:545:0x1e43, B:546:0x1ebd, B:369:0x14d0, B:371:0x14d6, B:372:0x1503, B:320:0x1283, B:322:0x1289, B:323:0x12af, B:232:0x0d30, B:234:0x0d36, B:235:0x0d5e, B:117:0x077b, B:119:0x0781, B:120:0x07ab, B:19:0x0144, B:21:0x014a, B:22:0x0172, B:24:0x02cb, B:26:0x02fc, B:27:0x0357), top: B:895:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0de5 A[Catch: all -> 0x11f2, TryCatch #48 {all -> 0x11f2, blocks: (B:239:0x0ddf, B:241:0x0de5, B:242:0x0e28, B:244:0x0e35, B:246:0x0e3e, B:247:0x0e82, B:271:0x10b0, B:272:0x10b4, B:274:0x10ba, B:277:0x10d1, B:280:0x10de, B:282:0x10e1, B:294:0x11c5, B:296:0x11cb, B:297:0x11cc, B:299:0x11ce, B:301:0x11d5, B:302:0x11d6, B:248:0x0e8d, B:260:0x0f97, B:262:0x0f9d, B:263:0x0fdf, B:265:0x1009, B:267:0x1051, B:269:0x1067, B:270:0x10a8, B:305:0x11df, B:307:0x11e6, B:308:0x11e7, B:310:0x11e9, B:312:0x11f0, B:313:0x11f1, B:290:0x114b, B:285:0x110e, B:287:0x1114, B:288:0x1143, B:255:0x0efc, B:257:0x0f18, B:258:0x0f8b, B:250:0x0ead, B:252:0x0ec2, B:253:0x0ef5), top: B:913:0x0ddf, outer: #14, inners: #20, #31, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0e35 A[Catch: all -> 0x11f2, TryCatch #48 {all -> 0x11f2, blocks: (B:239:0x0ddf, B:241:0x0de5, B:242:0x0e28, B:244:0x0e35, B:246:0x0e3e, B:247:0x0e82, B:271:0x10b0, B:272:0x10b4, B:274:0x10ba, B:277:0x10d1, B:280:0x10de, B:282:0x10e1, B:294:0x11c5, B:296:0x11cb, B:297:0x11cc, B:299:0x11ce, B:301:0x11d5, B:302:0x11d6, B:248:0x0e8d, B:260:0x0f97, B:262:0x0f9d, B:263:0x0fdf, B:265:0x1009, B:267:0x1051, B:269:0x1067, B:270:0x10a8, B:305:0x11df, B:307:0x11e6, B:308:0x11e7, B:310:0x11e9, B:312:0x11f0, B:313:0x11f1, B:290:0x114b, B:285:0x110e, B:287:0x1114, B:288:0x1143, B:255:0x0efc, B:257:0x0f18, B:258:0x0f8b, B:250:0x0ead, B:252:0x0ec2, B:253:0x0ef5), top: B:913:0x0ddf, outer: #14, inners: #20, #31, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0e8d A[Catch: all -> 0x11f2, TRY_LEAVE, TryCatch #48 {all -> 0x11f2, blocks: (B:239:0x0ddf, B:241:0x0de5, B:242:0x0e28, B:244:0x0e35, B:246:0x0e3e, B:247:0x0e82, B:271:0x10b0, B:272:0x10b4, B:274:0x10ba, B:277:0x10d1, B:280:0x10de, B:282:0x10e1, B:294:0x11c5, B:296:0x11cb, B:297:0x11cc, B:299:0x11ce, B:301:0x11d5, B:302:0x11d6, B:248:0x0e8d, B:260:0x0f97, B:262:0x0f9d, B:263:0x0fdf, B:265:0x1009, B:267:0x1051, B:269:0x1067, B:270:0x10a8, B:305:0x11df, B:307:0x11e6, B:308:0x11e7, B:310:0x11e9, B:312:0x11f0, B:313:0x11f1, B:290:0x114b, B:285:0x110e, B:287:0x1114, B:288:0x1143, B:255:0x0efc, B:257:0x0f18, B:258:0x0f8b, B:250:0x0ead, B:252:0x0ec2, B:253:0x0ef5), top: B:913:0x0ddf, outer: #14, inners: #20, #31, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x10ba A[Catch: all -> 0x11f2, TryCatch #48 {all -> 0x11f2, blocks: (B:239:0x0ddf, B:241:0x0de5, B:242:0x0e28, B:244:0x0e35, B:246:0x0e3e, B:247:0x0e82, B:271:0x10b0, B:272:0x10b4, B:274:0x10ba, B:277:0x10d1, B:280:0x10de, B:282:0x10e1, B:294:0x11c5, B:296:0x11cb, B:297:0x11cc, B:299:0x11ce, B:301:0x11d5, B:302:0x11d6, B:248:0x0e8d, B:260:0x0f97, B:262:0x0f9d, B:263:0x0fdf, B:265:0x1009, B:267:0x1051, B:269:0x1067, B:270:0x10a8, B:305:0x11df, B:307:0x11e6, B:308:0x11e7, B:310:0x11e9, B:312:0x11f0, B:313:0x11f1, B:290:0x114b, B:285:0x110e, B:287:0x1114, B:288:0x1143, B:255:0x0efc, B:257:0x0f18, B:258:0x0f8b, B:250:0x0ead, B:252:0x0ec2, B:253:0x0ef5), top: B:913:0x0ddf, outer: #14, inners: #20, #31, #39, #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1366  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x137d A[Catch: all -> 0x1443, TryCatch #19 {all -> 0x1443, blocks: (B:344:0x1368, B:346:0x137d, B:347:0x13b0), top: B:859:0x1368, outer: #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x13c3 A[Catch: all -> 0x1439, TryCatch #12 {all -> 0x1439, blocks: (B:348:0x13b6, B:350:0x13c3, B:351:0x142e), top: B:846:0x13b6, outer: #40 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x158c  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x15dd A[Catch: all -> 0x1ac9, PHI: r2 r10
  0x15dd: PHI (r2v599 java.lang.Object) = (r2v598 java.lang.Object), (r2v661 java.lang.Object) binds: [B:377:0x158a, B:379:0x158d] A[DONT_GENERATE, DONT_INLINE]
  0x15dd: PHI (r10v69 java.lang.Object) = (r10v213 java.lang.Object), (r10v214 java.lang.Object) binds: [B:377:0x158a, B:379:0x158d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #27 {all -> 0x1ac9, blocks: (B:376:0x1586, B:384:0x15dd), top: B:874:0x1586 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x1604  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x1656  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x1670  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x16c9  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x1983 A[Catch: all -> 0x1aa8, TryCatch #4 {all -> 0x1aa8, blocks: (B:455:0x1979, B:456:0x197d, B:458:0x1983, B:461:0x199d, B:425:0x16fb, B:442:0x1853, B:445:0x189e, B:450:0x190f, B:454:0x1971), top: B:831:0x16fb }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x1b59 A[Catch: all -> 0x035d, TryCatch #38 {all -> 0x035d, blocks: (B:519:0x1b53, B:521:0x1b59, B:522:0x1b88, B:758:0x3120, B:760:0x3126, B:761:0x3150, B:795:0x345e, B:797:0x3464, B:798:0x3486, B:775:0x329b, B:777:0x32be, B:778:0x3316, B:724:0x2df4, B:726:0x2dfa, B:727:0x2e25, B:617:0x2703, B:619:0x2709, B:620:0x2732, B:622:0x276c, B:623:0x27b9, B:590:0x2432, B:592:0x2447, B:593:0x247c, B:572:0x213c, B:574:0x2142, B:575:0x216c, B:577:0x21a6, B:578:0x21eb, B:540:0x1dc6, B:542:0x1ddb, B:543:0x1e0f, B:545:0x1e43, B:546:0x1ebd, B:369:0x14d0, B:371:0x14d6, B:372:0x1503, B:320:0x1283, B:322:0x1289, B:323:0x12af, B:232:0x0d30, B:234:0x0d36, B:235:0x0d5e, B:117:0x077b, B:119:0x0781, B:120:0x07ab, B:19:0x0144, B:21:0x014a, B:22:0x0172, B:24:0x02cb, B:26:0x02fc, B:27:0x0357), top: B:895:0x0144 }] */
    /* JADX WARN: Removed duplicated region for block: B:527:0x1c0d  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x1c7a  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x1cc6  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x1cdb  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x1da8  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x1ff7  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x20e7  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x2306  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x235b  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x2411  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x25bb  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x26b9  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x28cf A[Catch: all -> 0x2d67, TryCatch #44 {all -> 0x2d67, blocks: (B:626:0x28c9, B:628:0x28cf, B:629:0x2913, B:631:0x293a), top: B:905:0x28c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x293a A[Catch: all -> 0x2d67, TRY_LEAVE, TryCatch #44 {all -> 0x2d67, blocks: (B:626:0x28c9, B:628:0x28cf, B:629:0x2913, B:631:0x293a), top: B:905:0x28c9 }] */
    /* JADX WARN: Removed duplicated region for block: B:634:0x297c  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x2991 A[Catch: all -> 0x2d65, TryCatch #43 {all -> 0x2d65, blocks: (B:633:0x2965, B:635:0x297e, B:637:0x2991, B:639:0x299a, B:640:0x29e4, B:673:0x2c2f, B:674:0x2c33, B:676:0x2c39, B:679:0x2c51, B:682:0x2c5e, B:684:0x2c61, B:696:0x2d3f, B:698:0x2d45, B:699:0x2d46, B:701:0x2d48, B:703:0x2d4f, B:704:0x2d50, B:643:0x29f3, B:645:0x29f7, B:649:0x2a03, B:651:0x2a09, B:663:0x2b18, B:665:0x2b1e, B:666:0x2b61, B:668:0x2b8b, B:669:0x2bce, B:671:0x2be4, B:672:0x2c29, B:706:0x2d52, B:708:0x2d59, B:709:0x2d5a, B:711:0x2d5c, B:713:0x2d63, B:714:0x2d64, B:692:0x2cc3, B:687:0x2c8c, B:689:0x2c92, B:690:0x2cbb, B:658:0x2a76, B:660:0x2a95, B:661:0x2b0c, B:653:0x2a29, B:655:0x2a3e, B:656:0x2a6f), top: B:904:0x2965, inners: #15, #25, #33, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x29ef  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x2c39 A[Catch: all -> 0x2d65, TryCatch #43 {all -> 0x2d65, blocks: (B:633:0x2965, B:635:0x297e, B:637:0x2991, B:639:0x299a, B:640:0x29e4, B:673:0x2c2f, B:674:0x2c33, B:676:0x2c39, B:679:0x2c51, B:682:0x2c5e, B:684:0x2c61, B:696:0x2d3f, B:698:0x2d45, B:699:0x2d46, B:701:0x2d48, B:703:0x2d4f, B:704:0x2d50, B:643:0x29f3, B:645:0x29f7, B:649:0x2a03, B:651:0x2a09, B:663:0x2b18, B:665:0x2b1e, B:666:0x2b61, B:668:0x2b8b, B:669:0x2bce, B:671:0x2be4, B:672:0x2c29, B:706:0x2d52, B:708:0x2d59, B:709:0x2d5a, B:711:0x2d5c, B:713:0x2d63, B:714:0x2d64, B:692:0x2cc3, B:687:0x2c8c, B:689:0x2c92, B:690:0x2cbb, B:658:0x2a76, B:660:0x2a95, B:661:0x2b0c, B:653:0x2a29, B:655:0x2a3e, B:656:0x2a6f), top: B:904:0x2965, inners: #15, #25, #33, #37 }] */
    /* JADX WARN: Removed duplicated region for block: B:732:0x2ead  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x2efb  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x2f4d  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x3101  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x31df  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x322b  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x327d  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x343f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:899:0x1339 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:914:0x0830 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:967:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v101 */
    /* JADX WARN: Type inference failed for: r10v104 */
    /* JADX WARN: Type inference failed for: r10v105 */
    /* JADX WARN: Type inference failed for: r10v112 */
    /* JADX WARN: Type inference failed for: r10v209 */
    /* JADX WARN: Type inference failed for: r10v210 */
    /* JADX WARN: Type inference failed for: r10v211 */
    /* JADX WARN: Type inference failed for: r10v212 */
    /* JADX WARN: Type inference failed for: r10v215 */
    /* JADX WARN: Type inference failed for: r10v216 */
    /* JADX WARN: Type inference failed for: r10v217 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v70 */
    /* JADX WARN: Type inference failed for: r10v71 */
    /* JADX WARN: Type inference failed for: r10v72 */
    /* JADX WARN: Type inference failed for: r10v97 */
    /* JADX WARN: Type inference failed for: r10v98 */
    /* JADX WARN: Type inference failed for: r10v99 */
    /* JADX WARN: Type inference failed for: r11v184 */
    /* JADX WARN: Type inference failed for: r11v185 */
    /* JADX WARN: Type inference failed for: r11v186 */
    /* JADX WARN: Type inference failed for: r11v187 */
    /* JADX WARN: Type inference failed for: r11v192 */
    /* JADX WARN: Type inference failed for: r11v196 */
    /* JADX WARN: Type inference failed for: r11v197 */
    /* JADX WARN: Type inference failed for: r11v200 */
    /* JADX WARN: Type inference failed for: r11v201 */
    /* JADX WARN: Type inference failed for: r11v202 */
    /* JADX WARN: Type inference failed for: r11v203 */
    /* JADX WARN: Type inference failed for: r11v204 */
    /* JADX WARN: Type inference failed for: r11v205 */
    /* JADX WARN: Type inference failed for: r11v206 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r1v117, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v118, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v286, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v453 */
    /* JADX WARN: Type inference failed for: r1v456 */
    /* JADX WARN: Type inference failed for: r1v457 */
    /* JADX WARN: Type inference failed for: r1v482 */
    /* JADX WARN: Type inference failed for: r1v483 */
    /* JADX WARN: Type inference failed for: r1v484 */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v18 */
    /* JADX WARN: Type inference failed for: r25v25 */
    /* JADX WARN: Type inference failed for: r25v26 */
    /* JADX WARN: Type inference failed for: r25v29 */
    /* JADX WARN: Type inference failed for: r25v30 */
    /* JADX WARN: Type inference failed for: r25v31 */
    /* JADX WARN: Type inference failed for: r25v32 */
    /* JADX WARN: Type inference failed for: r25v33 */
    /* JADX WARN: Type inference failed for: r25v34 */
    /* JADX WARN: Type inference failed for: r25v54 */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12 */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v15 */
    /* JADX WARN: Type inference failed for: r34v16 */
    /* JADX WARN: Type inference failed for: r34v17 */
    /* JADX WARN: Type inference failed for: r34v18 */
    /* JADX WARN: Type inference failed for: r34v34 */
    /* JADX WARN: Type inference failed for: r34v35 */
    /* JADX WARN: Type inference failed for: r34v36 */
    /* JADX WARN: Type inference failed for: r34v37 */
    /* JADX WARN: Type inference failed for: r34v38 */
    /* JADX WARN: Type inference failed for: r34v39 */
    /* JADX WARN: Type inference failed for: r34v40 */
    /* JADX WARN: Type inference failed for: r34v41 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r3v616 */
    /* JADX WARN: Type inference failed for: r4v424, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v436, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v437 */
    /* JADX WARN: Type inference failed for: r4v438 */
    /* JADX WARN: Type inference failed for: r4v439 */
    /* JADX WARN: Type inference failed for: r4v440 */
    /* JADX WARN: Type inference failed for: r4v441 */
    /* JADX WARN: Type inference failed for: r4v454 */
    /* JADX WARN: Type inference failed for: r4v455 */
    /* JADX WARN: Type inference failed for: r4v610 */
    /* JADX WARN: Type inference failed for: r4v611 */
    /* JADX WARN: Type inference failed for: r4v612 */
    /* JADX WARN: Type inference failed for: r4v97 */
    /* JADX WARN: Type inference failed for: r5v153 */
    /* JADX WARN: Type inference failed for: r5v311 */
    /* JADX WARN: Type inference failed for: r5v420 */
    /* JADX WARN: Type inference failed for: r5v421 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v98, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v99, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v199, types: [java.lang.String] */
    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 14334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.digitalpayment.consumer.manageandviewdata.ui.usage.SfcManageAndViewDataActivity.attachBaseContext(android.content.Context):void");
    }

    public static void m10713$r8$lambda$BsWIIx54DYzmdvaIMONlLbbmo(SfcDatePickerDialog sfcDatePickerDialog, SfcManageAndViewDataActivity sfcManageAndViewDataActivity, Calendar calendar, Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 77;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        m10715x4a3c7011(sfcDatePickerDialog, sfcManageAndViewDataActivity, calendar, function1, view);
        int i4 = getAsAtTimestamp + 103;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 23 / 0;
        }
    }

    public static void $r8$lambda$CEmkIh00Vc3we5dLLzA8QhgVlNs(SfcDatePickerDialog sfcDatePickerDialog, Function1 function1, Calendar calendar, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 99;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m10716x48b43e90(sfcDatePickerDialog, function1, calendar, view);
        if (i3 != 0) {
            throw null;
        }
        int i4 = getAsAtTimestamp + 91;
        getRequestBeneficiariesState = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public static void $r8$lambda$JTnUxaybTtlH_6B_2neI0pZviuI(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, Calendar calendar, Calendar calendar2, Function1 function1) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 13;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        showChainedDatePicker$lambda$4$lambda$3(sfcManageAndViewDataActivity, calendar, calendar2, function1);
        int i4 = getAsAtTimestamp + 25;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    public static Unit m10714$r8$lambda$MwTLmPrLoBqhi_G2_MwyMPHA(SfcManageAndViewDataActivity sfcManageAndViewDataActivity, TimeInterval timeInterval) {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 35;
        getAsAtTimestamp = i2 % 128;
        if (i2 % 2 != 0) {
            return handleDataUsageIntervalSelection$lambda$0(sfcManageAndViewDataActivity, timeInterval);
        }
        handleDataUsageIntervalSelection$lambda$0(sfcManageAndViewDataActivity, timeInterval);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        getShareableDataState = 0;
        component1();
        component3();
        int i = hashCode + 43;
        getShareableDataState = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void m10715x4a3c7011(SfcDatePickerDialog sfcDatePickerDialog, SfcManageAndViewDataActivity sfcManageAndViewDataActivity, Calendar calendar, Function1 function1, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 115;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            showChainedDatePicker$lambda$4(sfcDatePickerDialog, sfcManageAndViewDataActivity, calendar, function1, view);
            Callback.onClick_exit();
            int i4 = getAsAtTimestamp + 15;
            getRequestBeneficiariesState = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            Callback.onClick_exit();
            throw th;
        }
    }

    private static void m10716x48b43e90(SfcDatePickerDialog sfcDatePickerDialog, Function1 function1, Calendar calendar, View view) {
        int i = 2 % 2;
        int i2 = getAsAtTimestamp + 41;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        Callback.onClick_enter(view);
        try {
            showChainedDatePicker$lambda$4$lambda$3$lambda$2(sfcDatePickerDialog, function1, calendar, view);
            Callback.onClick_exit();
            int i4 = getRequestBeneficiariesState + 95;
            getAsAtTimestamp = i4 % 128;
            if (i4 % 2 == 0) {
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
        int i2 = getAsAtTimestamp + 5;
        getRequestBeneficiariesState = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = getAsAtTimestamp + 35;
        getRequestBeneficiariesState = i4 % 128;
        int i5 = i4 % 2;
    }

    static void component3() {
        int i = 2 % 2;
        int i2 = getRequestBeneficiariesState + 49;
        getAsAtTimestamp = i2 % 128;
        int i3 = i2 % 2;
        component1 = -5743546308790467242L;
        component2 = 1386857713;
        copydefault = (char) 50417;
        if (i3 == 0) {
            int i4 = 73 / 0;
        }
    }

    static void component1() {
        component3 = 1425796219669909015L;
        ShareDataUIState = (char) 4692;
        component4 = (char) 11373;
        equals = (char) 34637;
        copy = (char) 15918;
    }
}
